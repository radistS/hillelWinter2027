package com.hillel.cw_06.gc;

import com.sun.management.GarbageCollectionNotificationInfo;
import com.sun.management.GcInfo;

import javax.management.NotificationEmitter;
import javax.management.openmbean.CompositeData;
import java.lang.management.GarbageCollectorMXBean;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryUsage;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        // 1. Listen to every GC event
        for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
            ((NotificationEmitter) gc).addNotificationListener((notification, handback) -> {
                if (!GarbageCollectionNotificationInfo.GARBAGE_COLLECTION_NOTIFICATION
                    .equals(notification.getType())) {
                    return;
                }
                GarbageCollectionNotificationInfo info = GarbageCollectionNotificationInfo
                    .from((CompositeData) notification.getUserData());
                GcInfo gcInfo = info.getGcInfo();

                long before = gcInfo.getMemoryUsageBeforeGc().values().stream()
                    .mapToLong(MemoryUsage::getUsed).sum();
                long after = gcInfo.getMemoryUsageAfterGc().values().stream()
                    .mapToLong(MemoryUsage::getUsed).sum();

                System.out.printf("GC #%d [%s] cause=%s duration=%d ms heap %d MB -> %d MB%n",
                    gcInfo.getId(), info.getGcName(), info.getGcCause(),
                    gcInfo.getDuration(), before >> 20, after >> 20);
            }, null, null);
        }

        // 2. Produce some garbage so GC has work to do
        List<byte[]> keep = new ArrayList<>();
        for (int i = 0; i < 2_000; i++) {
            byte[] chunk = new byte[1024 * 1024];   // 1 MB
            if (i % 10 == 0) {
                keep.add(chunk);                    // keep every 10th alive
            }
            Thread.sleep(5);
        }

        // 3. Final totals
        for (GarbageCollectorMXBean gc : ManagementFactory.getGarbageCollectorMXBeans()) {
            System.out.printf("%s: collections=%d, time=%d ms%n",
                gc.getName(), gc.getCollectionCount(), gc.getCollectionTime());
        }
    }
}

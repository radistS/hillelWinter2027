package com.hillel.cw_11.io.FileStream;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.nio.charset.StandardCharsets;
import java.rmi.RemoteException;

public class FileStream {
    public static void main(String[] args) throws IOException {
//        InputStream inputStream =
//                new FileInputStream("/Users/oleksandrstepurko/IdeaProjects/hillelWinter2027/cw/src/com/hillel/cw_11/io/FileStream/input.txt");
//
//        int size = inputStream.available();
//        System.out.println("file size : " + size);
//
//        for (int i = 0; i < size; i++){
//            System.out.print((char) inputStream.read());
//        }
//        inputStream.close();

        // Output stream


        String str = "Олександр Степурко \n";

        boolean nextLogMessage = true;
        while(nextLogMessage){
            OutputStream outputStream =
                new FileOutputStream("/Users/oleksandrstepurko/IdeaProjects/hillelWinter2027/cw/src/com/hillel/cw_11/files/log_alex_202611091932.log",
                    true);
            outputStream.write(str.getBytes(StandardCharsets.UTF_8));
            outputStream.close();

            File f = new File("/Users/oleksandrstepurko/IdeaProjects/hillelWinter2027/cw/src/com/hillel/cw_11/files/log_alex_202611091932.log");
            BigDecimal fileSize = getFileSizeMegaBytes(f);
            if (fileSize.compareTo(BigDecimal.ONE) > 0) throw new RemoteException("max file size achived...");

        }



    }

    private static BigDecimal getFileSizeMegaBytes(File file) {
        return BigDecimal.valueOf((double) file.length() / (1024 * 1024))
            .setScale(8, RoundingMode.HALF_DOWN);
    }
}

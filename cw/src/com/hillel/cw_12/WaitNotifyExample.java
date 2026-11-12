package com.hillel.cw_12;

public class WaitNotifyExample {

    private static class Order {
        private boolean ready;

        public synchronized void awaitReady() throws InterruptedException {
            // Після кожного пробудження знову перевіряємо, чи готове замовлення.
            while (!ready) {
                // wait() звільняє монітор об'єкта order, щоб кухня могла
                // увійти в markReady(). Перед поверненням wait() захоплює його знову.
                wait();
            }
        }

        public synchronized void markReady() {
            // Спочатку змінюємо стан замовлення, потім будимо один потік.
            ready = true;
            notify();

            // Потік клієнта зможе захопити монітор після виходу з цього методу.
        }
    }

    public static void main(String[] args) throws InterruptedException {
        // Обидва потоки працюють з одним об'єктом замовлення.
        Order order = new Order();

        Thread customer = new Thread(() -> {
            try {
                System.out.println("Клієнт перевіряє, чи готове замовлення.");
                // Якщо кухня вже приготувала замовлення, очікування не потрібне.
                order.awaitReady();
                System.out.println("Клієнт забрав замовлення.");
            } catch (InterruptedException e) {
                // Відновлюємо прапорець переривання потоку.
                Thread.currentThread().interrupt();
            }
        });

        Thread kitchen = new Thread(() -> {
            System.out.println("Кухня приготувала замовлення.");
            order.markReady();
        });

        // Запускаємо обидва потоки. Порядок їх виконання може відрізнятися.
        customer.start();
        kitchen.start();

        // Головний потік чекає на завершення обох потоків.
        customer.join();
        kitchen.join();
    }
}

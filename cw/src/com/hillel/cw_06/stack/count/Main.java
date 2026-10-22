package com.hillel.cw_06.stack.count;


    public class Main {
        public static void main(String[] args) throws InterruptedException {
            for (int i = 0; i < 10000; i++) {
                System.out.println("Thread " + i + " created");
                Thread thread = new Thread(() -> {
                    try {
                        Thread.sleep(60_000);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                });

                thread.start();
            }

            Thread.sleep(60_000);
        }
    }


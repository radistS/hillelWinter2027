package com.hillel.cw_11.io;

import java.io.File;

public class DirList {
    public static void main(String[] args) {
        File path = new File("/Users/oleksandrstepurko/IdeaProjects/hillelWinter2027/cw/src/com/hillel/cw_11/io");
//        File path = new File("/Users/oleksandrstepurko/IdeaProjects/hillelWinter2027/cw/src/com/hillel/cw_11/OssDetector.java");
        File [] list = path.listFiles();

        for (File file : list){
            System.out.println(file.getName() + " -> isFile : " + file.isFile());
        }
    }
}

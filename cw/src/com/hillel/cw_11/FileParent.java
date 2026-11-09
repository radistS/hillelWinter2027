package com.hillel.cw_11;

import java.io.File;

public class FileParent {

    public static void main(String[] args) {
        File dir = new File("/Users/oleksandrstepurko/IdeaProjects/hillelWinter2027/cw/src/com/hillel/cw_11/files");
        while (dir != null) {
            System.out.println(dir.getParent());
            dir = dir.getParentFile();
        }
    }

}

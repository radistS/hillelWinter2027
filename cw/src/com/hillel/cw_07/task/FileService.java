package com.hillel.cw_07.task;
/*
### 3. Виділити ім'я файлу та розширення
FileInfo parseFilePath(String path);
Приклад: "/home/user/docs/report.pdf" → name: "report", ext: "pdf"

 */

public class FileService {

    public static void main(String[] args) {
        System.out.println(parseFilePath("/home/user/docs/report.pdf"));
    }

    private static FileInfo parseFilePath(String path){
        return null;
    };

}

class FileInfo {
}

package hust.soict.dsai.garbage;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class NoGarbage {
    public static void main(String[] args) {
        String filePath = "large_text_file.txt"; // Đường dẫn đến tệp văn bản lớn
        StringBuffer content = new StringBuffer();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                // Nối chuỗi bằng StringBuffer
                content.append(line).append("\n");
            }
            System.out.println("Content length: " + content.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

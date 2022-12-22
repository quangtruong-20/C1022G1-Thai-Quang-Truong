package Day_15_IO_TextFile.bai_tap.copyfile;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class Copyfile {
    public static void copyFile(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhập file nguồn: ");
        String sourcePath = scanner.nextLine();
        System.out.println("Nhập file bạn muốn copy qua: ");
        String destPath = scanner.nextLine();

        File sourceFile = new File(sourcePath);
        if (!sourceFile.exists()) {
            System.out.println("Error: file nguồn không tồn tại.");
            return;
        }

        File destFile = new File(destPath);
        if (destFile.exists()) {
            System.out.println("Error: tệp tin đích đã tồn tại.");
            return;
        }
        copyFile(sourceFile, destFile);

        try {
            FileReader fileReader = new FileReader(destFile);
            BufferedReader buff = new BufferedReader(fileReader);

            String line;
            int charCount = 0;
            String[] temp;
            while ((line = buff.readLine()) != null) {

                temp = line.split("");

                charCount += line.length();

            }
            System.out.println(charCount);

            fileReader.close();
            buff.close();
        } catch (Exception e) {
            System.out.println("Không thể đếm được");
        }
    }
}









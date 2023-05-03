package fileio;

import java.io.FileOutputStream;

public class WriteDemo {
    public static void main(String[] args) {
        try {
            FileOutputStream f1 = new FileOutputStream("C:\\Users\\USER\\IdeaProjects\\FileIO\\src\\fileio\\read\\demoWrite.txt");
            String s = "Akash created one file";
            byte b1[] = s.getBytes();
            f1.write(b1);
            f1.close();
            System.out.println("File Written");


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

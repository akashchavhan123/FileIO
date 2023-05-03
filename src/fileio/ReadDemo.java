package fileio;

import java.io.FileInputStream;

public class ReadDemo {
    public static void main(String[] args) {
        try{
            FileInputStream f1 = new FileInputStream("C:\\Users\\USER\\IdeaProjects\\FileIO\\src\\fileio\\read\\demo.txt");
            int i=0;
            while ((i = f1.read()) != -1){
                System.out.print((char)i);
            }

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

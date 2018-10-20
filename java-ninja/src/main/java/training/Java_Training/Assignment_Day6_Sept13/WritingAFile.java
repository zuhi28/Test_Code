package training.Java_Training.Assignment_Day6_Sept13;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WritingAFile {
    public static void main(String[] args) throws Exception{
        File newFile = new File("/home/zuhi/Desktop/newFile.txt");
        if (newFile.exists())
            System.out.println("File already exists");
        else
        {
            try {
                newFile.createNewFile();
            }
            catch (Exception e){
                e.printStackTrace();
            }
            try {
                FileWriter fileW = new FileWriter(newFile);
                BufferedWriter buffW = new BufferedWriter(fileW);
                buffW.write("I am giant");
                buffW.close();
                System.out.println("File written");
            }
            catch (Exception e){
                e.printStackTrace();
            }

        }


    }
}

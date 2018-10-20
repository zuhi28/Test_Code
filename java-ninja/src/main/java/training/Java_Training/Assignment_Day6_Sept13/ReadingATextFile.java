package training.Java_Training.Assignment_Day6_Sept13;
import java.io.BufferedReader;
import java.io.FileReader;
public class ReadingATextFile {
    public static void main(String[] args) throws Exception{
        FileReader file = new FileReader("/home/zuhi/Desktop/newFile.txt");
        BufferedReader reader = new BufferedReader(file);
        String text = "";
        String line = reader.readLine();
        while (line !=null){
            text +=line;
            line = reader.readLine();
        }
        System.out.println(text);

    }
}

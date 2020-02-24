package ReadingTextFile;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BacaFile {
	
	public static void main(String[] args) {
    String fileName = "/home/titik/Documents/project/JavaQA/file.txt" ; 
        
        try {
            // membaca file
            File myFile = new File(fileName);
            Scanner bacaFile = new Scanner(myFile);
            
            // cetak isi file
            while(bacaFile.hasNextLine()){
                String data = bacaFile.nextLine();
                System.out.println(data);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println("Terjadi Kesalahan: " + e.getMessage());
            e.printStackTrace();
        }
	}
}

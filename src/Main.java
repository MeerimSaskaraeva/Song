import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (FileReader fileReader=new FileReader("Song.txt")){
            Scanner scanner=new Scanner(fileReader);
            while (scanner.hasNextLine()){
                Song song=new Song(scanner.nextLine(), scanner.nextLine(), scanner.nextLine());
                //System.out.println(scanner.nextLine());
                System.out.print(song.toString());
            }

        }catch (IOException e){
            e.printStackTrace();
        }






       //fileWriteSong();

    }

    private static void  fileWriteSong() {
        try (FileWriter fileWriter=new FileWriter("Song.txt")){
            fileWriter.write("Nothing else matters");
            fileWriter.write("\nMetallica");
            fileWriter.write("\nSo close, no matter how far" +
                    " Couldn't be much more from the heart" +
                    " Forever trusting who we are" +
                    " And nothing else matters" +
                    " Never opened myself this way" +
                    " Life is ours, we live it our way " +
                    " All these words, I don't just say" +
                    " And nothing else matters");

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
import java.io.*;

public class StreamTest {
    public static void main(String[] args) {

        //Stream öffnen
        try {
            String filename = "testFile.txt";
            OutputStream os = new FileOutputStream(filename);
        } catch (FileNotFoundException ex) {
            System.err.println("Couldn`t open file");
        }

        //Daten schreiben
        String someText = "Hallo Git";
        byte[] textAsByte = someText.getBytes();

        try {
            os.write(textAsByte);
        } catch (IOException ex) {
            System.err.println("Couldn’t write data");
        }

        //Lesen aus File
        InputStream is = null;

        try {
            is = new FileInputStream(filename);
        } catch (FileNotFoundException ex) {
            System.err.println("couldn’t open file - fatal");
        }

        //Lesen aus Stream
        byte[] readBuffer = new byte[100];

        try {
            is.read(readBuffer);
        } catch (IOException ex) {
            System.err.println("couldn’t read data");
            }

        //Bytes in String umwandeln
        String readString = new String(readBuffer);
        System.out.println("read something: " + readString);
    }
}

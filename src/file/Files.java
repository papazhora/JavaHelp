package file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileOutputStream;

/**
 *
 */

public class Files {

    public static void main(String[] args) throws IOException {
        File dir = new File(".");
        String [] names = dir.list();
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        File file = new File("JavaHelp.iml");
        System.out.print(file.length());

        FileInputStream input = new FileInputStream(file);
        int length = input.available();
        System.out.print(length);

        byte [] data = new byte[length];
        input.read(data);

        String text = new String(data);
        System.out.print(text);

//        for (int i = 0; i < data.length; i++) {
//            System.out.println(data[i]);
//        }

//        FileOutputStream output = new FileOutputStream(file, true);
//        String newText = "<!-- Hello Egor! -->";
//        byte [] newTextBytes = newText.getBytes();
//        output.write(newTextBytes);
//        output.close();
    }
}

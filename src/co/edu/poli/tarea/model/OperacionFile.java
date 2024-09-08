package co.edu.poli.tarea.model;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class OperacionFile {

    public void serializar(FacturaGeneral[] facturas, String path, String name) {

        try {
            FileOutputStream fos = new FileOutputStream(path + name);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(facturas);
            oos.close();
            fos.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }
    }

    public FacturaGeneral[] deserializar(String path, String name) {
    	FacturaGeneral[] a = new FacturaGeneral[10];

        try {
            FileInputStream fis = new FileInputStream(path + name);
            ObjectInputStream ois = new ObjectInputStream(fis);

            a = (FacturaGeneral[]) ois.readObject();

            ois.close();
            fis.close();
        } catch (IOException ioe) {
            ioe.printStackTrace();

        } catch (ClassNotFoundException c) {
            System.out.println("Class not found");
            c.printStackTrace();

        }
        return a;
    }

    public String createFile(String path, String name) {
        try {
            File Obj = new File(path + name);
            if (Obj.createNewFile()) {
                return "File created: " + Obj.getName();
            } else {
                return "File already exists.";
            }
        } catch (IOException e) {
            e.printStackTrace();
            return "An error has occurred.";
        }
    }

    public String readFile(String path, String name) {
        try {
            File Obj = new File(path + name);
            Scanner Reader = new Scanner(Obj);
            String data = "";
            while (Reader.hasNextLine())
                data = Reader.nextLine();
            Reader.close();
            return data;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return "An error has occurred.";
        }
    }

    public String writeFile(String path, String name, String txt) {

        try {
            FileWriter Writer = new FileWriter(path + name);
            Writer.write(txt);
            Writer.close();
            return "Successfully written.";
        } catch (IOException e) {
            e.printStackTrace();
            return "An error has occurred.";
        }

    }

    public String deleteFile(String path, String name) {
        File Obj = new File(path + name);
        if (Obj.delete()) {
            return "The deleted file is : " + Obj.getName();
        } else {
            return "Failed in deleting the file.";
        }
    }
}

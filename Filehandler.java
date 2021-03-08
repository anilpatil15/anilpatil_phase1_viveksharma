package FileHandling;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class Filehandler {

    public String[] getFiles (String filePath) {

        File file = new File(filePath);
        String[] files = file.list();
        return files;
    }

    public void retrieveFiles (String filePath) {

        String[] files = getFiles(filePath);
        ArrayList<String> filesList = new ArrayList<>();
        Collections.addAll(filesList, files);     //Collections convert array to arrayList and sort in ascending
        for(int i = 0; i < filesList.size(); i++) {
            System.out.println(filesList.get(i));
        }
    }

    public boolean searchFile(String filePath, String fileName){

        String[] files = getFiles(filePath);
        boolean fileExists = false;

        for(int i = 0; i < files.length; i++) {
            if(files[i].contentEquals(fileName)) {
                fileExists = true;
                break;
            } else {
                fileExists = false;
            }
        }
        return fileExists;

    }

    public void addFile (String filePath, String fileName) throws IOException {

        boolean fileExists = searchFile(filePath, fileName);
        if(!fileExists) {
            FileOutputStream fout = new FileOutputStream((filePath + "\\" + fileName), true);
            System.out.println(fileName + " file added");
            fout.close();
        } else {
            System.out.println(fileName + " file already exists");
        }
    }

    public void deleteFile (String filePath, String fileName) {

        boolean fileExists = searchFile(filePath, fileName);

        if(fileExists) {
            File file = new File((filePath + "\\" + fileName));
            file.delete();
            System.out.println(fileName + " file deleted");
        } else {
            System.out.println(fileName + " file not found");
        }

    }

}

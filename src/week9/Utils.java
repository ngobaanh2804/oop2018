package week9;

import java.io.*;
public class Utils {
    public static String readContentFromFile(String path) throws IOException {
        File file = new File(path);
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String string = bufferedReader.readLine();
        bufferedReader.close();
        return string;
    }

    public static void writeContentToFile(String path) throws IOException {
        File file = new File(path);
        FileWriter fileWriter = new FileWriter(file);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        //bufferedWriter.newLine();
        bufferedWriter.write("baanh");
        bufferedWriter.close();
    }

    public static File findFileByName(String folderPath, String fileName) {
        File file = new File(folderPath);
        if (file.isDirectory()) {
            String[] list = file.list();
            for (String string : list) {
                if (string.equals(fileName)) {
                    return new File(folderPath + "\\" + fileName);
                }
            }
        }
        return null;
    }
}

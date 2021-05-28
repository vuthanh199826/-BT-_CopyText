import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Manage {


    public List<String> readFile(String path) throws IOException {
            List<String> list = new ArrayList<>();
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line=bufferedReader.readLine())!=null){
                list.add(line);
            }
            bufferedReader.close();
            fileReader.close();
            return list;
        }
        public void writeFile(String path, List<String> list) throws IOException {
        FileWriter fileWriter = new FileWriter(path,true);
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        for (String element:list){
            bufferedWriter.write(element + "\n");
        }
        bufferedWriter.close();
        fileWriter.close();
        }
}

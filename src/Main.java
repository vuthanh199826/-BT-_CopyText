import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        Manage manage = new Manage();
        System.out.println("Nhap tep nguon");
        String path1 = sc.nextLine();
        File file1 = new File(path1);
        if (!file1.exists()){
            System.out.println("tep tin khon ton tai");
        }else {
            System.out.println("Nhap tep dich");
            String path2 = sc.nextLine();
            File file2 = new File(path2);
            if(!file2.exists()){
                System.out.println("tep khong ton tai");
            }else {
                manage.writeFile(path2,manage.readFile(path1));
            }
        }

    }
}

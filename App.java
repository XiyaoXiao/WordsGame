import java.util.HashSet;
import java.util.Scanner;

public class App {

    private HashSet<String> dic = new HashSet<String>();
    private Scanner sc = new Scanner("./words");

    public void readwords(){
        while (sc.hasNext()){
            dic.add(sc.next());
        }
    }

    public String construct(String choice, int limit, String current){
        if (limit == 1){
            return current + choice;
        }
        String nc = choice
        return "";
    }

    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
    }
}

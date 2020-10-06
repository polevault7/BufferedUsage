import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите строку:");
        String line = reader.readLine();
        System.out.println(line);
        System.out.println("Введите следующую строку:");
        String line1 = reader.readLine();
        System.out.println(line1);
        reader.close();
    }
}

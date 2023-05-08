import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)  {
        try(FileWriter fileWriter = new FileWriter("ABC.txt")){
            fileWriter.write("A, B, C, D, F, G, H, J, K, L, M, N, P, Q, R, S, T, V, X, Z, ");
            fileWriter.write("1 ,2 ,3 ,4 ,5 ,6 ,7 ,8 ,9 ");
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
        try(FileReader fileReader = new FileReader("ABC.txt")){
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
package projetos.com.areacirculo;

import java.io.IOException;
import java.util.Scanner; 
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        
        double raio = Double.parseDouble(input.next());
        DecimalFormat df = new DecimalFormat("0.0000");
        
        System.out.println("A="+df.format(3.14159 * (raio*raio)));
    }
 
}

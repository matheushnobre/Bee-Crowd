package projetos.com.gastocombustivel;

import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
 
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);
        int horas = Integer.parseInt(leitor.next()), velocidadeMedia = Integer.parseInt(leitor.next()); //declara e atribui valor as variaveis do tempo gasto e a velocidade media
        
        DecimalFormat df = new DecimalFormat("0.000"); //o formato double sera com 3 casas decimais
        System.out.println(df.format((double)(velocidadeMedia * horas)/12)); //calcula, formata e exibe o resultado na tela. para obter a distancia percorrida utilizou-se a formula do sorvete e depois dividiu-se o resultado por 12(autonomia de 1l de combustivel em quilometros) para saber a quantidade de combustivel necessaria
    }
}
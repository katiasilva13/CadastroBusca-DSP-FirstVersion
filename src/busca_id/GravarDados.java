/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busca_id;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class GravarDados {

    public static void gravar() throws IOException {
        int ident, num, cep;
        FileWriter dados = new FileWriter("src\\CadastroTeste.txt", true);
        PrintWriter gravarDados = new PrintWriter(dados);
        BufferedWriter printDados = new BufferedWriter(dados);

        try {
            Scanner nu = new Scanner(System.in);
            System.out.printf("Numero:");
            num = nu.nextInt();
            gravarDados.printf("%d,", num);
        } catch (InputMismatchException ex) {
            System.out.println("Erro: So numeros são aceitos ");
        } 
        //isso não resolve o problema
        //tentar switch case, while, if/else sei lá
        //melhor fazer um método pra tratar cada variável
        finally {
            Scanner nu = new Scanner(System.in);
            System.out.printf("Numero:");
            num = nu.nextInt();
            gravarDados.printf("%d,", num);

        }
    }
}

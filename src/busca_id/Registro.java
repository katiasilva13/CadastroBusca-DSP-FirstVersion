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
import java.util.Scanner;

/**
 *
 * @author Dani
 */
public class Registro {

    /**
     *
     * @throws java.io.IOException
     */
    public static void cadastrar() throws IOException {
        int ident, num, cep;

        try (FileWriter dados = new FileWriter("src\\Cadastro.txt", true);
                PrintWriter gravarDados = new PrintWriter(dados);
                BufferedWriter printDados = new BufferedWriter(dados)) {

            Scanner id = new Scanner(System.in);
            System.out.printf("imforme ID:");
            ident = id.nextInt();
            gravarDados.printf("\n%d,", ident);

            Scanner n = new Scanner(System.in);
            System.out.printf("Nome:");
            String nome = n.nextLine();
            gravarDados.printf(" %s,", nome);

            Scanner dat = new Scanner(System.in);
            System.out.printf("Data De Nascimento:");
            String data = dat.nextLine();
            gravarDados.printf(" %s,", data);

            Scanner t = new Scanner(System.in);
            System.out.printf("Telefone:");
            String tel = t.nextLine();
            gravarDados.printf("%s,", tel);

            Scanner end = new Scanner(System.in);
            System.out.printf("Endereço:");
            String ender = end.nextLine();
            gravarDados.printf("%s,", ender);

            Scanner nu = new Scanner(System.in);
            System.out.printf("Numero:");
            num = nu.nextInt();
            gravarDados.printf("%d,", num);

            Scanner c = new Scanner(System.in);
            System.out.printf("Cep:");
            cep = c.nextInt();
            gravarDados.printf("%d,", cep);

            Scanner cidade = new Scanner(System.in);
            System.out.printf("Cidade:");
            String cid = cidade.nextLine();
            gravarDados.printf("%s,", cid);

            Scanner estado = new Scanner(System.in);
            System.out.printf("UF:");
            String est = estado.nextLine();
            gravarDados.printf("%s;", est);

        }
        System.out.println("Dados Armazenados");
    }

}

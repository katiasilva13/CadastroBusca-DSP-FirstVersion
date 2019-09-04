package busca_id;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class pesquisa_id {

    public void Pesquisa() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        //Porque retornar uma String? e vazia?    
        //   public String Pesquisa () throws FileNotFoundException, UnsupportedEncodingException, IOException{
        InputStream is = new FileInputStream("src\\busca_id\\pesquisa.txt");
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);

        /*     StringBuffer stringBuffer = new StringBuffer("");
         String line = null;

         while ((line = br.readLine()) != null) {
         stringBuffer.append(line);
         }
         */
        String s = br.readLine();
     //     Stream<String> s = br.lines();

        //TODO Procurar biblioteca/método que consiga ler todas as linhas do arquivo
        //   String s = br.readAllLines();
        System.out.print("Digite o id a ser pesquisado: ");
        String id = new Scanner(System.in).next();
        Matcher m = Pattern.compile(id).matcher(s);

      //    Matcher m = Pattern.compile(id).matcher(line);
        if (m.find()) {
            System.out.println("Encontrado");
        } else {
            System.out.println("Não encotrado");
        }

//   String numeroDeOcorrencias = "";
      /*     
         while (m.find()){
         if (!id.equals(s)){ 
         System.out.println("Encontrado");
         }else if (id.equals(s)){
         System.out.println("Não encontrado");
         }
         }
         */
        //   return numeroDeOcorrencias;
    }

    /*public static void main (String[] args) throws FileNotFoundException, UnsupportedEncodingException, IOException   {
     InputStream is = new FileInputStream("src\\busca_id\\pesquisa.txt");
     InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        
     BufferedReader br = new BufferedReader (isr);
        
     String s = br.readLine();
        
     System.out.print("Digite o id a ser pesquisado: ");
     String id = new Scanner(System.in).next();

     Matcher m = Pattern.compile(id).matcher(s);
     int numeroDeOcorrencias = 0;
     while (m.find()){
     numeroDeOcorrencias++;
     }
     System.out.println("Total de palavras encontradas: " + numeroDeOcorrencias);
		
     br.close();
       
               
     }*/
}

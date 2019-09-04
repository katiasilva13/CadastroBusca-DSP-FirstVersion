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

public class Pesquisa_id {

    public void pesquisa() throws FileNotFoundException, UnsupportedEncodingException, IOException {
        InputStream is = new FileInputStream("src\\busca_id\\pesquisa.txt");
        InputStreamReader isr = new InputStreamReader(is, "UTF-8");
        BufferedReader br = new BufferedReader(isr);
        
        StringBuffer stringBuffer = new StringBuffer("");
        String line = null;
        
        System.out.print("Digite o id a ser pesquisado: ");
        String id = new Scanner(System.in).next();
        boolean tem = false;
        Matcher m;
        
        while ((tem == false) && (line = br.readLine()) != null) {
            stringBuffer.append(line);
            m = Pattern.compile(id).matcher(line);
            tem = m.find();
        }
        
        if (tem) {
            System.out.println("Encontrado");
        } else {
            System.out.println("Não encotrado");
        }

        br.close();

    }

}

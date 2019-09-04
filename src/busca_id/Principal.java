package busca_id;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class Principal {
    public static void main (String [] args) throws UnsupportedEncodingException, IOException{
        Pesquisa_id pesquisaId = new Pesquisa_id();
        pesquisaId.pesquisa();
        
        Pesquisa_idTESTE test = new Pesquisa_idTESTE();
//        test.pesquisa();
        
        
    }
}

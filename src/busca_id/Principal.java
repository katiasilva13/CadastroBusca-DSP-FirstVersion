package busca_id;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
 // import static busca_id.Registro.cadastrar;

public class Principal {
    public static void main (String [] args) throws UnsupportedEncodingException, IOException{
        Pesquisa_id pesquisaId = new Pesquisa_id();
    //    pesquisaId.pesquisa();
        
        Pesquisa_idTESTE test = new Pesquisa_idTESTE();
    //     test.pesquisa();
        
        Registro reg = new Registro();
      // reg.cadastrar();
        
        GravarDados g = new GravarDados();
     //  g.gravar();
        
        //TODO modificar pesquisa, pesquisar somente por ID
        //pesquisar sobre split etc
    }
}

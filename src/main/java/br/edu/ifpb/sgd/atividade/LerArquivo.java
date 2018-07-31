package br.edu.ifpb.sgd.atividade;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Edilva
 */
public class LerArquivo {
    
    public static void main(String[] args) {
        Path caminho = Paths.get("seguranca.txt");
        try {
            byte[] texto = Files.readAllBytes(caminho);
            String leitura = new String(texto);

            String quebraLinha = System.getProperty("line.separator");
            
            leitura = leitura.replaceAll(quebraLinha, "");
            
            List<String> lista = Arrays.asList(leitura.split("[ /©|*,:;.!?()\\[\\]=+&%$#@...\"']"));

            Set<String> lista2 = new HashSet<>();
            lista.forEach((string) -> {
                lista2.add(string);
            });
            
            lista2.forEach((string) -> {
                System.out.println(string);
            });

        } catch (IOException ex) {
            Logger.getLogger(LerArquivo.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}


package primitivewriteutf;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author plago-bergonpazos
 */
public class PrimitiveWriteUTF {


    public static void main(String[] args) throws FileNotFoundException, IOException {
        //Variables que no son completamente innecesarias
        String x = "Esta e unha cadea\n";
        //Creación de archivo
        File texto = new File("C:\\Users\\Pablo\\Documents\\NetBeansProjects\\primitiveWriteUTF\\src\\texto3.txt");
        texto.createNewFile();
        //Lectura del mismo
        DataInputStream read2 = new DataInputStream(new FileInputStream(texto));
        //Implementación del mismo
        DataOutputStream write2 = new DataOutputStream(new FileOutputStream(texto, true));
        //Let's do this¡¡
        write2.writeUTF(x);
        System.out.println("writeUTF escribiu: "+x);
        int tamanho=write2.size();
        System.out.println("writeUTF escribiu: "+write2.size()+" bytes\n");
        write2.writeUTF(x);
        System.out.println("writeUTF escribiu: "+x);
        System.out.println("writeUTF escribiu: "+(write2.size()-tamanho)+" bytes\n");
        write2.close();  
        System.out.println("Bytes total escritos: "+write2.size()+" bytes\n");
        System.out.println("Lemos a primeira cadea en UTF: "+read2.readUTF()+"\n");
        System.out.println("Número de bytes lidos: "+tamanho+" bytes\n");
        System.out.println("Número de bytes restantes por ler "+(write2.size()-tamanho)+" bytes\n");
        System.out.println("Lemos a segunda cadea: "+read2.readUTF());
               
     
     
        
       
       
}
}

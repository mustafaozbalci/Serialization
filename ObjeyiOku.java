import java.util.*;
import java.io.*;


public class ObjeyiOku {
    public static void main(String[] args) throws IOException {
        
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream("dosya.ser"))){
            Ogrenci ogrenci1 = (Ogrenci)in.readObject();
            Ogrenci ogrenci2 = (Ogrenci)in.readObject();

            
            
            System.out.println("*********************************");
            System.out.println(ogrenci1);
            System.out.println("*********************************");
            System.out.println(ogrenci2);
            
            
            
        } catch (Exception ex) {
        	System.out.println("Hata oluþtu.");
        }
        
    }
    
}

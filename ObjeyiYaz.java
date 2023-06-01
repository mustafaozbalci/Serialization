import java.io.*;
import java.util.*;
public class ObjeyiYaz {
	public static void main(String[] args) {
		try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("dosya.ser",true))){
			Ogrenci ogrenci1 = new Ogrenci("Mustaf",1234,"bilgisayar");
			Ogrenci ogrenci2 = new Ogrenci("Ahmet", 14141, "ekonomi");
			out.writeObject(ogrenci1);
			out.writeObject(ogrenci2);
		}
		catch (Exception ex) {
			System.out.println("error");
		}
	}

}

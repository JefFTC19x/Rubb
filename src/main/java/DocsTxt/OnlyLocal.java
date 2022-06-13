package DocsTxt;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/*
  @author JefFTC19x
 */
public class OnlyLocal 
{
    	public String ReadOn() 
        {
		// crea el flujo para leer desde el archivo
		File file = new File("C:\\Program Files\\RbSecurity\\Link\\LinkConectRbrsDb.txt");
		String cadena = null;
		Scanner scanner;
		try 
                {
                    scanner = new Scanner(file);
                    while (scanner.hasNextLine()) 
                    {
                    String linea = scanner.nextLine();
                    cadena = linea;
                    }			
		scanner.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		return cadena;
	}
}

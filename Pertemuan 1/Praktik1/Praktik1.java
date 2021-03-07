import java.io.*;

/* Nama	: Brylian Fandhi safsalta
	NIM	: A11.2019.12169
	Kelompok : A11.4418 */


public class Praktik1 {
   public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;
      try {
         /* Looping atau perulangan.
         Jika tidak menginputkan u, maka program akan berjalan terus
         Karena ada looping while(c != 'u')*/
         cin = new InputStreamReader(System.in); // Input
         System.out.println("Enter characters, 'u' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c); //Output hasil inputan
         } while(c != 'u'); //Looping
      }finally {
         if (cin != null) {
            cin.close(); // Close jika kondisi looping berhenti
         }
      }
   }
}
import java.io.*;

public class Praktik1 {
   public static void main(String args[]) throws IOException {
      InputStreamReader cin = null;
      try {
         cin = new InputStreamReader(System.in);
         System.out.println("Enter characters, 'u' to quit.");
         char c;
         do {
            c = (char) cin.read();
            System.out.print(c);
         } while(c != 'u');
      }finally {
         if (cin != null) {
            cin.close();
         }
      }
   }
}

import java.util.Scanner;

public class ByteConversion {
    public static void main(String[] args) {
        
        //Variable declaration
        Scanner sc = new Scanner(System.in);
        long bytes;

        //Declaration of results
        long kibibytes;
        long mebibytes;
        long gibibytes;

        //Variable entry
        System.out.println("Enter a number of bytes");
        bytes = sc.nextLong();

        //Data processing
        kibibytes = (bytes / 1024) % 1024;
        mebibytes = ((bytes /1024) / 1024) % 1024;
        gibibytes = (((bytes / 1024) / 1024) / 1024) % 1024;
        bytes = bytes % 1024;

        //Display of result
        System.out.print("This gives ");
        if(gibibytes > 0){
            System.out.print(gibibytes + " Gibibytes, ");
        }
        if(mebibytes > 0){
            System.out.print(mebibytes + " Mebibytes, ");
        }
        if(kibibytes > 0){
            System.out.print(kibibytes + " Kibibytes, ");
        }
        if(bytes > 0){
            System.out.println(bytes + " Bytes");
        }
        //Closing the scanner
        sc.close();
    }
}
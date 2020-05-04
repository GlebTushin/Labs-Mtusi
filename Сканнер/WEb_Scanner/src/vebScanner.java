import java.io.*;
import java.util.LinkedList;
import java.util.Scanner;
public class vebScanner {
    private LinkedList<URLDephPair> Scanned=new LinkedList<URLDephPair>();
    private LinkedList<URLDephPair> NotScanned=new LinkedList<URLDephPair>();
    public static void main (String args[])
    {Scanner Str=new Scanner(System.in);
    URLreader scan=new URLreader();
    URLDephPair site=new URLDephPair(Str.nextLine(),Str.nextInt());
vebScanner Al =new vebScanner();
Al.addNotScanned(site);
while (Al.getNotScanned().isEmpty()!=true)
{
    scan.Reading(Al.NotScanned.getFirst(),Al);
}
try{
BufferedWriter writefile=new BufferedWriter(new FileWriter("Links.txt"));
String line;
    for (URLDephPair lines:Al.getScanned()
         ) {
        line=lines.getURL()+" "+String.valueOf(lines.getURL())+"\n";
        writefile.write(line);

    }

}catch (IOException ex2){
    ex2.printStackTrace();
}
    }

    public LinkedList<URLDephPair> getNotScanned() {
        return NotScanned;
    }

    public LinkedList<URLDephPair> getScanned() {
        return Scanned;
    }
    public void addScanned(URLDephPair site){
        Scanned.add(site);
    }
    public void addNotScanned(URLDephPair site){
        NotScanned.add(site);
    }
}

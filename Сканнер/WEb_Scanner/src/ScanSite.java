import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.*;
import java.util.ArrayList;


public class ScanSite {
  public  ArrayList<String> Line=new ArrayList<String>() {};
  public ScanSite(){
  }
    public void Scanning (InputStream pack)
    {
        ArrayList<String> Line1=new ArrayList<String>() {};
        InputStreamReader in=new InputStreamReader(pack);
        BufferedReader Scan= new BufferedReader(in);
        try{
        while (Scan.readLine()!=null){
            Line1.add(Scan.readLine());
        }
        }
        catch(IOException ex)
        {this.Line=Line1;
        }
       this.Line=Line1;
    }


    public ArrayList<String> getLine() {
        return Line;
    }
}

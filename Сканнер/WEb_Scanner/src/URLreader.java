import java.io.IOException;
import java.io.InputStream;
import java.net.*;
import java.util.LinkedList;

public class URLreader {

    private final String prot="http://";
    int len=prot.length();
    public boolean check(String URL,int depth){String s="";
        { if ((depth > 0) && (depth < 80)) {
                if (URL.substring(0, len).equals(prot)){
                    s=URL.substring(len+1);
                    if (s.length()>0)

                        return true;
                }
            }
        }
        return false;
    }
    protected void Reading(URLDephPair site,vebScanner veb)
    {try{
        if (check(site.getURL(),site.getDepth()))
        { Socket sitechek=new Socket((site.getURL()),80);
        sitechek.setSoTimeout(10);
        ScanSite Scun=new ScanSite();
        Scun.Scanning(sitechek.getInputStream());
        for (String siteLine: Scun.getLine()){
            if (check(siteLine,site.getDepth()-1)){
                if (!(veb.getScanned().contains(siteLine))){
                    if (!(veb.getNotScanned().contains(siteLine))){
                        URLDephPair site2=new URLDephPair(siteLine,site.getDepth()-1);
                        veb.addNotScanned(site2);}
                }


            }

        }
        veb.addScanned(site);
        sitechek.close();
        }

        }
    catch (SocketException ex){
    }
    catch (IOException ex1){}
    }
}

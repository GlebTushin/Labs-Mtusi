import java.security.MessageDigest;

public class t8 {public static StringBuffer Bytes(byte[] bytes){
    StringBuffer sha = new StringBuffer();
    for(byte t:bytes){
        sha.append(Integer.toString((t & 0xff)+0x100,16).substring(1));}
return sha;
}
public static StringBuffer Sha256(String line){
    try {
        MessageDigest md =MessageDigest.getInstance("SHA-256");
        md.update(line.getBytes());
        return Bytes(md.digest());
    }
    catch (Exception exep){
        throw new RuntimeException(exep);
    }
}
}

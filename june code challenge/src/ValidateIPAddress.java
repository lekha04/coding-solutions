import java.util.*;
import java.util.regex.Pattern;

public class ValidateIPAddress {

    public static String validIPAddress(String IP){
        String ipv4chunk = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";
        Pattern ipv4Pattern = Pattern.compile("^(" + ipv4chunk + "\\.){3}" + ipv4chunk + "$");

        String ipv6chunk =  "([0-9a-fA-F]{1,4})";
        Pattern ipv6Pattern = Pattern.compile("^(" + ipv6chunk + "\\:){7}" + ipv6chunk + "$");

        if(ipv4Pattern.matcher(IP).matches()){
            return "IPv4";
        }
        else if(ipv6Pattern.matcher(IP).matches()){
            return "IPv6";
        }
        else{
            return "Neither";
        }
    }

    public static void main(String[] args){
        String IP = "256.256.256.256";
        String out = validIPAddress(IP);
        System.out.println(out);
    }
}

/*21. An IP address is a numerical label assigned to each device (e.g., computer, printer) participating in a computer network that uses the Internet Protocol for communication. There are two versions of the Internet protocol, and thus two versions of addresses. One of them is the IPv4 address.

Given a string, find out if it satisfies the IPv4 address naming rules.*/

import java.util.*;
import java.util.regex.Pattern;

public class IsIPv4Address {

    boolean isIPv4Address(String inputString) {
        String IPv4Chunk = "([0-9]|[1-9][0-9]|1[0-9][0-9]|2[0-4][0-9]|25[0-5])";

        Pattern IPv4Pattern = Pattern.compile("^("+IPv4Chunk+"\\.){3}" + IPv4Chunk + "$");

        if(IPv4Pattern.matcher(inputString).matches()){
            return true;
        }

        return false;
    }

}

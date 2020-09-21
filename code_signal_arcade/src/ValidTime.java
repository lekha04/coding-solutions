/*53. Check if the given string is a correct time representation of the 24-hour clock.

Example

For time = "13:58", the output should be
validTime(time) = true;
For time = "25:51", the output should be
validTime(time) = false;
For time = "02:76", the output should be
validTime(time) = false.*/

public class ValidTime {

    boolean validTime(String time) {
        String[] arr = time.split(":");

        int h = Integer.parseInt(arr[0]);
        int m = Integer.parseInt(arr[1]);

        if((h>=0 && h<=23) && (m>=0 && m<=59)){
            return true;
        }

        return false;
    }
}

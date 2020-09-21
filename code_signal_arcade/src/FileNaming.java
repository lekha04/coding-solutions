/*57. You are given an array of desired filenames in the order of their creation. Since two files cannot have equal names, the one which comes later will have an addition to its name in a form of (k), where k is the smallest positive integer such that the obtained name is not used yet.

 Return an array of names that will be given to the files.

 Example

 For names = ["doc", "doc", "image", "doc(1)", "doc"], the output should be
 fileNaming(names) = ["doc", "doc(1)", "image", "doc(1)(1)", "doc(2)"].*/

import java.util.*;

public class FileNaming {

    String[] fileNaming(String[] names) {
        if(names.length<=1){
            return names;
        }

        Set<String> set = new HashSet<>();

        set.add(names[0]);

        for(int i=1; i<names.length; i++){
            int k = 1;
            while(set.contains(names[i])){
                names[i] = build(names[i],k);
                k++;
            }
            set.add(names[i]);
        }

        return names;
    }

    String build(String str, int k){
        StringBuilder builder = new StringBuilder();

        if(k<=1){
            builder.append(str);
        }
        else{
            for(int i=str.length()-1; i>=0; i--){
                if(str.charAt(i)=='('){
                    builder.append(str.substring(0,i));
                    break;
                }
            }
        }

        builder.append('(');
        builder.append(k);
        builder.append(')');

        return builder.toString();

    }

}

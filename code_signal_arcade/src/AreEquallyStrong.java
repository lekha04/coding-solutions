/*19. Call two arms equally strong if the heaviest weights they each are able to lift are equal.

Call two people equally strong if their strongest arms are equally strong (the strongest arm can be both the right and the left), and so are their weakest arms.

Given your and your friend's arms' lifting capabilities find out if you two are equally strong.*/

public class AreEquallyStrong {

    boolean areEquallyStrong(int yourLeft, int yourRight, int friendsLeft, int friendsRight) {

        int myMax = Math.max(yourLeft, yourRight);
        int myMin = Math.min(yourLeft, yourRight);

        int hisMax = Math.max(friendsLeft, friendsRight);
        int hisMin = Math.min(friendsLeft, friendsRight);

        if(myMax==hisMax && myMin==hisMin){
            return true;
        }

        return false;
    }

}

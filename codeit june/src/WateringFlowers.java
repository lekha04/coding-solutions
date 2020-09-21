public class WateringFlowers {
    public static int wateringFlowers(int[] plants, int capacity1, int capacity2){
        int n = plants.length;
        int count = 2;
        int c1 = capacity1;
        int c2 = capacity2;
        int i = 0;
        int j = n-1;

        while(i<j){
            if(c1<plants[i]){
                c1 = capacity1;
                count++;
            }
            if(c2<plants[j]){
                c2 = capacity2;
                count++;
            }
            c1 = c1 - plants[i];
            c2 = c2 - plants[j];

            i++;
            j--;
        }

        if(i==j){
            if(c1+c2>=plants[i]){
                return count;
            }
            else{
                if(capacity1+c2 >= plants[i] || c1+capacity2>=plants[i]){
                    count++;
                }
                else{
                    count = count + 2;
                }
            }
        }

        return count;
    }
    public static void main(String[] args){
        int[] plants = new int[]{ 2,4,5,1,2};
        int capacity1 = 5;
        int capacity2 = 7;
        int out = wateringFlowers(plants, capacity1, capacity2);
        System.out.println(out);
    }
}

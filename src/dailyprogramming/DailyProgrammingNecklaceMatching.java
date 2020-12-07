package dailyprogramming;

public class DailyProgrammingNecklaceMatching {
    public static void main(String[] args) {
        System.out.println(isSameNecklace("",""));
    }
    public static boolean isSameNecklace(String i, String j)
    {
        for(int loop = 0; loop < i.length(); loop++)
        {
           if(i.equalsIgnoreCase(j))
           {
               return true;
           }
           i = i.charAt(i.length()) + i.substring(1,i.length());
            System.out.println(i);
        }
        return false;
    }
}

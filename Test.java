import java.util.concurrent.ThreadLocalRandom;
public class Test
{
    public static void main(String[] argv) {
        int length = 5;
        System.out.println(random(length));
    }//w  w  w  .  j a va 2 s .  com

       public static String random(int length) {
        StringBuilder builder = new StringBuilder(length);
        for (int i = 0; i < length; i++) {
            builder.append((char) (ThreadLocalRandom.current().nextInt(65,
                    69)));
        }
		 return builder.toString();
    }
}

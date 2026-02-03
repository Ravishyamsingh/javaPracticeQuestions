
import org.jetbrains.annotations.NotNull;
import java.util.*;
public class Ceaser_Cipher {
    public String applyCaesar(@NotNull String text, int shift)
    {
        char[] chars = text.toCharArray();
        for (int i=0; i < text.length(); i++)
        {
            char c = chars[i];

         
            if (c >= 32 && c <= 127)
                
            {
                // Change base to make life easier, and use an
                // int explicitly to avoid worrying... cast later
                
                int x = c - 32;
                x = (x + shift) % 96;
                
                if (x < 0)
                    x += 96; //java modulo can lead to negative values!
                chars[i] = (char) (x + 32);
            }
        }
        return new String(chars);
    }
}




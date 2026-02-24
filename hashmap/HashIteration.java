
import java.util.*;

public class HashIteration 
{
    public static void main(String[] args)
    {
        HashMap<String, Integer> map = new HashMap<>();

        map.put("apple", 1);
        map.put("banana", 2);
        map.put("mango", 3);

        for(String key : map.keySet())
        {
            System.out.println(key+"->"+map.get(key));
        }

    }

    
}

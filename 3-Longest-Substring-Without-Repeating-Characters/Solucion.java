import java.util.HashMap;
import java.util.Map;

public class Solucion {
    public int lengthOfLongestSubstring(String s) {
    Map<Character, Integer> mapa = new HashMap<>();
    int inicio = 0;
    int maxLen = 0;
    for (int i = 0; i < s.length(); i++) {
        char c = s.charAt(i);
        if (mapa.containsKey(c) && mapa.get(c) >= inicio) {
            inicio = mapa.get(c) + 1;
        }
        mapa.put(c, i);
        maxLen = Math.max(maxLen, i - inicio + 1);
    }
    return maxLen;
    }
}
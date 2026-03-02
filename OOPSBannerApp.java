import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    public static void main(String[] args) {

        String message = "OOPS";

        Map<Character, String[]> patternMap = initializePatterns();

        for (int row = 0; row < 7; row++) {

            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = patternMap.get(ch);
                line.append(pattern[row]).append(" ");
            }

            System.out.println(line);
        }
    }

    private static Map<Character, String[]> initializePatterns() {

        Map<Character, String[]> map = new HashMap<>();

        map.put('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        map.put('P', new String[]{
                "  ****** ",
                " *      * ",
                " *      * ",
                "  ****** ",
                " *       ",
                " *       ",
                " *       "
        });

        map.put('S', new String[]{
                "   ****** ",
                " *       ",
                " *       ",
                "   *****  ",
                "        * ",
                "        * ",
                "  ****** "
        });

        return map;
    }
}
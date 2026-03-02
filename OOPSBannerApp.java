public class OOPSBannerApp {

    public static void main(String[] args) {

        CharacterPattern O = new CharacterPattern('O', new String[]{
                "  *****  ",
                " *     * ",
                "*       *",
                "*       *",
                "*       *",
                " *     * ",
                "  *****  "
        });

        CharacterPattern P = new CharacterPattern('P', new String[]{
                " ****** ",
                " *     * ",
                " *     * ",
                " ****** ",
                " *       ",
                " *       ",
                " *       "
        });

        CharacterPattern S = new CharacterPattern('S', new String[]{
                "   ***** ",
                " *       ",
                " *       ",
                "   *****  ",
                "       * ",
                "       * ",
                "  ***** "
        });

        String[] banner = new String[7];

        for (int i = 0; i < 7; i++) {
            banner[i] = String.join(" ",
                    O.getPattern()[i],
                    O.getPattern()[i],
                    P.getPattern()[i],
                    S.getPattern()[i]
            );
        }

        for (String line : banner) {
            System.out.println(line);
        }
    }
}
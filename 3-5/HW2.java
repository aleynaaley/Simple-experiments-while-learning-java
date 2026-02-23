
public class HW2 {

    // dizide her karakteri n kadar alfabede kaydırılıyor
    public static String replaceLetters(String text, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isLetter(c)) {
                char nbr;
                if (Character.isLowerCase(c))
                    nbr = 'a';
                else
                    nbr = 'A';
                c = (char) ((c - nbr + n) % 26 + nbr);
            }
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }


    // stringin başındaki ve sonundaki boşlukları siler ve stringi döndürür
    public static String stripFromBothEnd(String text) {
        int start = 0, end = text.length() - 1;
        while (start <= end && Character.isWhitespace(text.charAt(start))) {
            start++;
        }
        while (end >= start && Character.isWhitespace(text.charAt(end))) {
            end--;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = start; i <= end; i++) {
            sb.append(text.charAt(i));
        }
        return sb.toString();
    }


    // stringden tekrar eden karakterleri siler stringi döndürür
    public static String removeRepeatingChars(String text) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            int j = 0;
            while (j < sb.length() && c != sb.charAt(j)) {
                j++;
            }
            if (j == sb.length()) {
                sb.append(c);
            }
        }
        return sb.toString();
    }
}

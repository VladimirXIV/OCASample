package question29;

public class CCMask {
    public static String maskCC(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";
        // line 1

        /*StringBuilder sb = new StringBuilder(creditCard);
        sb.substring(15, 19);
        return x + sb;*/

        return x + creditCard.substring(15, 19);

        /*StringBuilder sb = new StringBuilder(x);
        sb.append(creditCard, 15, 19);
        return sb.toString();*/

        /*StringBuilder sb = new StringBuilder(creditCard);
        StringBuilder s = sb.insert(0, x);
        return s.toString();*/
    }

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));
    }
}
public class Dim {

    public static void main(String[] args) {


        String name = "Ananya";
        String reverse = "";

        for (int i = name.length() - 1; i >= 0; i--) {

            reverse = reverse + name.charAt(i);
        }


        System.out.println("reverse String:" + reverse);
        String Str;
        if (name.equals(reverse)){


            System.out.println("palindrome");

        } else {


            System.out.println("not palindrome");

        }
    }
}


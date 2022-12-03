public class Palindrom {
    public static void main(String[] args) {
        String strNumbers = "123321 1234321 556677665 123456 234567 123456321 6666666 434343434";
        String[] strNumberArray = strNumbers.split(" ");

        for (String number : strNumberArray) {
            char[] numIdx = number.toCharArray();
            boolean isPal = true;

            for (int i = 0; i < numIdx.length; i++) {
                if (numIdx[i] != numIdx[numIdx.length - i - 1]) {
                    isPal = false;
                    break;
                }
            }

            if (isPal) {
                System.out.println(number + " is Palindrom");
            } else {
                System.out.println(number + " is not Palindrom");
            }
        }
    }
}

//            123321 is Palindrom
//            1234321 is Palindrom
//            556677665 is not Palindrom
//            123456 is not Palindrom
//            234567 is not Palindrom
//            123456321 is not Palindrom
//            6666666 is Palindrom
//            434343434 is Palindrom
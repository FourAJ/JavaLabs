public class Polindrom {
    public static void main(String[] args) {
        String strNumbers = "123321 1234321 556677665 123456 234567 123456321 6666666 434343434";
        String[] strNumberArray = strNumbers.split(" ");

        for (String number : strNumberArray) {
            char[] numIdx = number.toCharArray();
            boolean isPol = true;

            for (int i = 0; i < numIdx.length; i++) {
                if (numIdx[i] != numIdx[numIdx.length - i - 1]) {
                    isPol = false;
                    break;
                }
            }

            if (isPol) {
                System.out.println(number + " is Polindrom");
            } else {
                System.out.println(number + " is not Polindrom");
            }
        }
    }
}

//                    123321 is Polindrom
//                    1234321 is Polindrom
//                    556677665 is not Polindrom
//                    123456 is not Polindrom
//                    234567 is not Polindrom
//                    123456321 is not Polindrom
//                    6666666 is Polindrom
//                    434343434 is Polindrom
public class CountCharacter {
    public static void main(String[] args) {
        String str = "Le Tan Phuc";
        int dodai = str.length();
        demKyTu(str);

    }

    public static void demKyTu(String str) {
        int counter[] = new int[256];
        int dodai = str.length();
        for (int i = 0; i < dodai; i++) {
            counter[str.charAt(i)]++;
        }
        char array[] = new char[str.length()];
        for (int i = 0; i < dodai; i++) {
            array[i] = str.charAt(i);
            int count = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == array[j]) {
                    count++;
                }
            }
            if (count == 1) {
                System.out.println("So lan xuat hien " + str.charAt(i) + " trong chuoi: " + counter[str.charAt(i)]);
            }
        }
    }
}

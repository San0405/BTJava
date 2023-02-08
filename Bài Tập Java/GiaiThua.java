public class GiaiThua {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c = 10;
 
        System.out.println("Giai thừa của " + a + " là: "
                + GiaiThua.tinhGiaithua(a));
        System.out.println("Giai thừa của " + b + " là: "
                + GiaiThua.tinhGiaithua(b));
        System.out.println("Giai thừa của " + c + " là: "
                + GiaiThua.tinhGiaithua(c));
    }
    public static long tinhGiaithua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 2; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }
}

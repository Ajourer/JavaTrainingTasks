public class DistributionDN {
    public static void main(String[] args) {
        System.out.printf("\u001B[32m%-15s\u001B[0m" +
                "\u001B[34m%-35s%-35s%-35s%n\u001B[0m", "Количество DN", "VM1", "VM2", "VM3");
        for (int i = 1; i <= 20; i++) {
            for (int j = 0; j < 119; j++) {
                System.out.print("\u001B[36m-\u001B[0m");
            }
            System.out.print("\n");
            distribution(i);
        }
    }

    public static void distribution(int dnNumber) {
        String vm1 = "", vm2 = "", vm3 = "";
        int dn = 1;
        while (dn <= (dnNumber + 1) / 3 - 1) {
            vm1 += (",DN" + dn++);
        }
        int remainder = dnNumber - ((dnNumber + 1) / 3 - 1);
        remainder = remainder % 2 == 0 ? remainder / 2 : remainder / 2 + 1;
        for (int i = dn + remainder; dn < i; dn++) {
            vm2 += ("DN" + dn);
            vm2 += dn < i - 1 ? "," : "";
        }
        while (dn <= dnNumber) {
            vm3 += ("DN" + dn++);
            vm3 += dn <= dnNumber ? "," : "";
        }
        System.out.printf("%-15d%-35s%-35s%-35s%n", dnNumber, "NN" + vm1, vm2, vm3);
    }
}
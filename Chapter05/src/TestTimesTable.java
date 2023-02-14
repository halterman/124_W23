
public class TestTimesTable {

    public static void main(String[] args) {
        var scan = new java.util.Scanner(System.in);
        System.out.print("Enter size of table: ");
        int tableSize = scan.nextInt();
        scan.close();
        MyMath.showTimesTable(tableSize);

    }

}

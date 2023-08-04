package parciticeSums;

public class TrapeziumPattern {
    public static void main(String[] args) {
        int num = 4;
        int first = 1;
        int second = (num * num) + 1;
        int spaces = 0;

        for (int lines = num; lines >= 1; lines--) {
            for (int i = 1; i <=spaces; i++) {
                System.out.print(" ");
            }
            for (int firstcount = 1; firstcount <= lines; firstcount++) {
                if (firstcount == lines)
                    System.out.print(first++);
                else
                    System.out.print(first++ + "*");
            }
            
            for (int secondcount = 1; secondcount<=lines; secondcount++) {
                System.out.print("*" + second++);
            }
            System.out.println();
            spaces += 2;
            second = (second-1)-((lines-1)*2);
        }
    }
}


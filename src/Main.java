public class Main {
    public static void main(String[] args) {
        int a1 = 1;
        int b1 = 4;
        int a2 = 0;
        int b2 = 5;
        if (a1 <=a2 && b1 <=b2) {
            if (a2 < b1) {
                System.out.println("Координаты отрезка пересечения [" + a2 + ";" + b1 + "]");
            }
            if (a2 == b1) {
                System.out.println("Точка пересечения отрезков " + a2);
            }
            if (b1 < a2) {
                System.out.println("Отрезки не пересекаются");
            }
        } else {
            if (a1 < a2 && b2 < b1) {
                System.out.println("Координаты отрезка пересечения [" + a2 + ";" + b2 + "]");
            }
        }
        if (a2 <= a1 && b2 <= b1) {
            if (a1 < b2) {
                System.out.println("Координаты отрезка пересечения [" + a1 + ";" + b2 + "]");
            }
            if (a1 == b2) {
                System.out.println("Точка пересечения отрезков " + a1);
            }
            if (b2 < a1) {
                System.out.println("Отрезки не пересекаются");
            }
        } else {
            if (a2 < a1 && b1 < b2) {
                System.out.println("Координаты отрезка пересечения [" + a1 + ";" + b1 + "]");
            }
        }
    }
}

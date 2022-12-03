public class Main {
    public static void main(String[] args) {
        int a1 = 5;
        int b1 = 7;
        int a2 = 5;
        int b2 = 12;
        if (a1 < a2 ) {
            if (a2 < b1 && b1 <= b2) {
                System.out.println("Координаты отрезка пересечения [" + a2 + ";" + b1 + "]");
            }
            if (a2 == b1 && b1 < b2) {
                System.out.println("Точка пересечения отрезков " + a2);
            }
            if (a2 < b1 && b2 < b1) {
                System.out.println("Координаты отрезка пересечения [" + a2 + ";" + b2 + "]");
            } else {
            System.out.println("Отрезки не пересекаются");
            }
        } else {
            if (a1 < b2 && b2 <= b1){
                System.out.println("Координаты отрезка пересечения ["+ a1 +";"+ b2 +"]");
            }
            if (a1 == b2 && b2<b1){
                System.out.println("Точка пересечения отрезков "+ a1);
            }
            if (a1 < b2 && b1 < b2) {
                System.out.println("Координаты отрезка пересечения ["+a1+";"+b1+"]");
            }else {
                System.out.println("Отрезки не пересекаются");
            }
        }
    }
}
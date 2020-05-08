import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		double x;
		double y;
		double z;

		System.out.println("Введите первую точку:");
		System.out.print("x: ");
		x = scanner.nextDouble();
		System.out.print("y: ");
		y = scanner.nextDouble();
		System.out.print("z: ");
		z = scanner.nextDouble();

		Point3d point1 = new Point3d(x, y, z);

		System.out.println("Введите вторую точку:");
		System.out.print("x: ");
		x = scanner.nextDouble();
		System.out.print("y: ");
		y = scanner.nextDouble();
		System.out.print("z: ");
		z = scanner.nextDouble();

		Point3d point2 = new Point3d(x, y, z);

		System.out.println("Введите третью точку:");
		System.out.print("x: ");
		x = scanner.nextDouble();
		System.out.print("y: ");
		y = scanner.nextDouble();
		System.out.print("z: ");
		z = scanner.nextDouble();

		Point3d point3 = new Point3d(x, y, z);

		if (point1.equals(point2) || point1.equals(point3) || point2.equals(point3)) {
			System.out.println("Точки совпадают");
		} else {
			System.out.println("Площадь треугольника: " + computeArea(point1, point2, point3));
		}
	}

	public static double computeArea(Point3d point1, Point3d point2, Point3d point3) {
		double a = point1.distanceTo(point2);
		double b = point2.distanceTo(point3);
		double c = point3.distanceTo(point1);
		double p = (a + b + c) / 2;
		System.out.println(p);

		return Math.sqrt(Math.abs(p * (p - a) * (p - b) * (p - c)));
	}
}

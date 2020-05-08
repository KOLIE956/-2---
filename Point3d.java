public class Point3d {
	private double xCoord;
	private double yCoord;
	private double zCoord;

	public Point3d(double x, double y, double z) {
		xCoord = x;
		yCoord = y;
		zCoord = z;
	}

	public Point3d() {
		this(0, 0 ,0);
	}

	public double getX() {
		return xCoord;
	}

	public void setX(double x) {
		xCoord = x;
	}

	public double getY() {
		return yCoord;
	}

	public void setY(double y) {
		yCoord = y;
	}

	public double getZ() {
		return zCoord;
	}

	public void setZ(double z) {
		zCoord = z;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Point3d) {
			Point3d point = (Point3d) obj;
			return Double.compare(xCoord, point.xCoord) == 0 && Double.compare(yCoord, point.yCoord) == 0 &&
							Double.compare(zCoord, point.zCoord) == 0;
		}

		return false;
	}

	public double distanceTo(Point3d point) {
		System.out.println(Math.round(Math.sqrt(Math.pow(point.xCoord - xCoord, 2) + Math.pow(point.yCoord - yCoord, 2) +
						Math.pow(point.zCoord - zCoord, 2)) * 100) / 100.0);
		return Math.round(Math.sqrt(Math.pow(point.xCoord - xCoord, 2) + Math.pow(point.yCoord - yCoord, 2) +
						Math.pow(point.zCoord - zCoord, 2)) * 100) / 100.0;
	}
}

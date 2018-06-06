package by.htp.flowers.emtty;

public class ParkingPaper extends Accessory {

	private int size;

	public void setSize(int size) {
		this.size = size;
	}

	public int getSize() {
		return size;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Название аксессуара=" + this.getName() + ", стоимость аксессуара="
				+ String.format("%.3f", this.getPrice()) + " бел.руб.," + " цвет аксессуара=" + this.getColor()
				+ ", длина стороны=" + this.getSize();

	}
}

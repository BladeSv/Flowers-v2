package by.htp.flowers.emtty;

public class Tape extends Accessory {

	private int length;

	public void setLength(int length) {
		this.length = length;
	}

	public int getLength() {
		return length;
	}

	public String toString() {
		return "Название аксессуара=" + this.getName() + ", стоимость аксессуара="
				+ String.format("%.3f", this.getPrice()) + " бел.руб.," + " цвет аксессуара=" + this.getColor()
				+ ", длина ленты=" + this.getLength();

	}

}

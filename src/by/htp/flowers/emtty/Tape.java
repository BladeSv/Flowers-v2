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
		return "�������� ����������=" + this.getName() + ", ��������� ����������="
				+ String.format("%.3f", this.getPrice()) + " ���.���.," + " ���� ����������=" + this.getColor()
				+ ", ����� �����=" + this.getLength();

	}

}

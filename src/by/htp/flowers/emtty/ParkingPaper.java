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
		return "�������� ����������=" + this.getName() + ", ��������� ����������="
				+ String.format("%.3f", this.getPrice()) + " ���.���.," + " ���� ����������=" + this.getColor()
				+ ", ����� �������=" + this.getSize();

	}
}

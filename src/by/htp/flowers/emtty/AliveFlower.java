package by.htp.flowers.emtty;

public class AliveFlower extends Flower {
	private int cutDay;

	public int getCutDay() {
		return cutDay;
	}

	public void setCutDay(int cutDay) {
		this.cutDay = cutDay;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�������� ������=" + this.getName() + ", ���������=" + String.format("%.3f", this.getPrice())
				+ " ���.���.," + " ���� ������=" + this.getColor() + " ����� ������=" + this.getLength()
				+ ", ���� ��� �������=" + this.getCutDay();
	}
}

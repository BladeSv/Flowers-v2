package by.htp.flowers.emtty;

public class NonLivingFlower extends Flower {
	private int prodactionDay;
	private String material;

	public int getProdactionDay() {
		return prodactionDay;
	}

	public void setProdactionDay(int prodactionDay) {
		this.prodactionDay = prodactionDay;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "�������� ������=" + this.getName() + ", ���������=" + String.format("%.3f", this.getPrice())
				+ " ���.���.," + " ���� ������=" + this.getColor() + " ����� ������=" + this.getLength()
				+ ", ���� ��� �������=" + this.getProdactionDay() + ", ��������=" + this.getMaterial();

	}
}

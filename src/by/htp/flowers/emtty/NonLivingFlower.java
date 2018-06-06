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
		return "Название цветка=" + this.getName() + ", стоимость=" + String.format("%.3f", this.getPrice())
				+ " бел.руб.," + " цвет бутона=" + this.getColor() + " длина цветка=" + this.getLength()
				+ ", дней как создали=" + this.getProdactionDay() + ", материал=" + this.getMaterial();

	}
}

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
		return "Название цветка=" + this.getName() + ", стоимость=" + String.format("%.3f", this.getPrice())
				+ " бел.руб.," + " цвет бутона=" + this.getColor() + " длина цветка=" + this.getLength()
				+ ", дней как срезали=" + this.getCutDay();
	}
}

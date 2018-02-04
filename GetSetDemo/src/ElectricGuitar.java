
public class ElectricGuitar{

/*Getter与Setter:
 * 1>Getter与Setter可以让你执行get与set
 * 2>Getter的目的是返回实例变量的值，Setter的目的是取用一个参数来设定实例变量的值
 * 3>私有化实例变量，公有化get,set方法
 */
	String Brand;
	int Price;
	
	/*
	 * 没有、private、public的区别
	 */
	
	/*private*/ String getBrand() {
		return Brand;
	}

	 /*private*/void setBrand(String brand) {
		Brand = brand;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	
}

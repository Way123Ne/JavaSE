
public class ElectricGuitar{

/*Getter��Setter:
 * 1>Getter��Setter��������ִ��get��set
 * 2>Getter��Ŀ���Ƿ���ʵ��������ֵ��Setter��Ŀ����ȡ��һ���������趨ʵ��������ֵ
 * 3>˽�л�ʵ�����������л�get,set����
 */
	String Brand;
	int Price;
	
	/*
	 * û�С�private��public������
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

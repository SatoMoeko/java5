
public class Hiyoco7 {

	public static void main(String[]args) {
		System.out.print("身長を入力してください(cm)>");
		double height = new java.util.Scanner(System.in).nextDouble();
		System.out.print("体重を入力してください(kg)>");
		double weight = new java.util.Scanner(System.in).nextDouble();		
		System.out.println("あなたのBMIは"+getBMI(height,weight)+"です");
	}
	public static double getBMI(double heightCm, double weightKg) {
		double getBMI = weightKg/ ((heightCm/ 100)*(heightCm/ 100));
		return getBMI;
	}

}

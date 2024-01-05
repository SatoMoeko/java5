
public class Ex1 {

	public static void main(String[] args) {
		add(100, 200);
		add(200, 50);
	}
	//複数の値を受け取るaddメソッド
	public static void add(int x, int y) {
		int ans = x+y;
		System.out.println(x+"+"+y+"="+ans);
		System.out.printf("%d + %d = %d", x, y, ans);
		/*printf(%d,,)プラスを使わずに変数と文字列をくっつけて表示できる
		 * 改行がないので注意(「\n」もしくは「/n」で改行 )
		 */
	}
}

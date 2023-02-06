
public class NestedLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		outerloop: // label for loop
		for (int i = 0; i < 5; i++) {
			innerloop: for (int j = 0; j <= i; j++) {
				if (i == 3)
					break outerloop;// labelled break
				System.out.print(i);

			}
			System.out.print("\n");
		}

	}

}

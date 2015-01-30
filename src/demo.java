
public class demo {

	public static void main(String[] args) {
		System.out.println("Demo");
		JTableArray demoTable = new JTableArray(6); // 6 column TableArray
		
		demoTable.pushRow(1, 2, 3, 4, 5, 6);
		demoTable.pushRow(7, 8, 9, 10, 11, 12);
		demoTable.pushRow(6, 5, 4, 2, 2, 1);
		demoTable.pushRow(1); // Will do nothing, not enough columns
		demoTable.print();
		
		System.out.println("Sorted:");
		demoTable.sort(5);
		demoTable.print();
		
		System.out.println(""+demoTable.getItem(0, 2));
		demoTable.setItem(0, 2, 100);
		System.out.println(""+demoTable.getItem(0, 2));
		
		demoTable.print();
		
		System.out.println("done");
	}

}

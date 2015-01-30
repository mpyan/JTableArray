import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * This class is used to store a 2D table of values
 * @author mpyan
 *
 */
public class JTableArray {
	public ArrayList<ArrayList<Double>> data = new ArrayList<ArrayList<Double>>();
	private int numCols;
	
	/**
	 * Create a new TableArray
	 */
	public JTableArray(int cols){
		this.numCols = cols;
	}
	
	/**
	 * Get the number of rows in this table
	 * @return the number of rows
	 */
	public int getNumRows(){
		return data.size();
	}
	
	public int getNumCols(){
		return numCols;
	}
	
	public void pushRow(double...numbers){
		if (numbers.length  == numCols) {
			ArrayList<Double> newRow = new ArrayList<Double>();
			for (double num : numbers){
				newRow.add(num);
			}
			data.add(newRow);
		}
	}
	
	/**
	 * Print the table
	 */
	public void print(){
		for (int r = 0; r < this.getNumRows(); r++){
			for (int c = 0; c < numCols; c++){
				System.out.print(""+this.getItem(r, c)+"\t");
			}
			System.out.println();
		}
	}
	
	/**
	 * Get an item
	 * @param col the row
	 * @param row the column
	 * @return the value stored at (col,row)
	 */
	public double getItem(int col, int row){
		return data.get(col).get(row);
	}
	
	/**
	 * Set an item value
	 * @param col column
	 * @param row row
	 * @param value the value to be stored
	 */
	public void setItem(int col, int row, double value){
		data.get(col).set(row, value);
	}
	
	/**
	 * Sort the table
	 * @param col the column to sort on
	 */
	public void sort(int col){
		final int COLUMN = col;
	    Comparator<ArrayList<Double>> myComparator = new Comparator<ArrayList<Double>>() {
	        @Override
	        public int compare(ArrayList<Double> o1, ArrayList<Double> o2) {
	            return o1.get(COLUMN).compareTo(o2.get(COLUMN));
	        }
	    };
	    Collections.sort(data, myComparator);
	}
}

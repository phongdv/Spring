package model;

public class Main {
	public static void main(String[] args) {
		FixPrinterTask t = new FixPrinterTask();
		ITEmployee iter = new ITEmployee(t);
		iter.resolveTask();
	}
}

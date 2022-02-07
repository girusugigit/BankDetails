package org.bank;
import org.bank.AxisBank;
public class BankInfo extends AxisBank{
private void saving() {
System.out.println("Savings account bank is SBI");



}
private void fixed() {
	System.out.println("Fixed Account bank is ICICI");

}
public static void main(String[] args) {
	BankInfo bi=new BankInfo();
	bi.saving();
	bi.fixed();
	bi.deposit();
}
}

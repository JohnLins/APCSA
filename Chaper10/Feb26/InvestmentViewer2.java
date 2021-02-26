import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JButton;

 import javax.swing.JFrame;

 import javax.swing.JLabel;

import javax.swing.JPanel;



public class InvestmentViewer2

{

private static final int FRAME_WIDTH = 400;

private static final int FRAME_HEIGHT = 100;


private static final double INTEREST_RATE = 10;

private static final double INITIAL_BALANCE = 1000;



public static void main(String[] args)

{

JFrame frame = new JFrame();


JButton button = new JButton("Add Interest");


final BankAccount account = new BankAccount(INITIAL_BALANCE);

final JLabel label = new JLabel("balance: " + account.getBalance());

JPanel panel = new JPanel();
panel.add(button);
panel.add(label);

frame.add(panel);



class AddInterestListener implements ActionListener

 {

public void actionPerformed(ActionEvent event)
{

double interest = account.getBalance() * INTEREST_RATE / 100;

account.deposit(interest);

label.setText("balance: " + account.getBalance());

}

}


ActionListener listener = new AddInterestListener();

button.addActionListener(listener);



frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);

frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

frame.setVisible(true);

 }

 }
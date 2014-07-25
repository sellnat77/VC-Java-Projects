import javax.swing   .*;
import java.awt      .*;
import java.awt.event.*;

public class JSlots extends JFrame
{
	private static final long serialVersionUID = 1L;
	public JSlots()
	{
		int Row,Col;

		Toolkit   MyKit = Toolkit.getDefaultToolkit();
		Dimension XY    = MyKit.getScreenSize      ();

		Row       = XY.width ;
		Col       = XY.height;
		Mover     = 0        ;
		Bet       = 1        ;
		Gain      = 0        ;
		Spins     = 0        ;
		CashSpent = 0        ;
		Credits   = 200      ;

		setSize    (Row,Col       );
		setLocation(0,0           );
		setTitle   ("Slot Machine");


		GridLayout   SideLayout    = new GridLayout  (3,1                   );
		GridLayout   StatsLayout   = new GridLayout  (1,4                   );
		FlowLayout   Default       = new FlowLayout  (                      );
		GridLayout   CentralLayout = new GridLayout  (2,1                   );
		GridLayout   TopCentral    = new GridLayout  (1,5                   );
		GridLayout   BotCentral    = new GridLayout  (2,4                   );
		Font         Big           = new Font        ("Serif",Font.BOLD,50  );
		Font         Small         = new Font        ("Serif",Font.ITALIC,25);
		Font         Medium        = new Font        ("Serif",Font.BOLD,35  );

		PTop.setLayout     (Default      );
		PLeft.setLayout    (SideLayout   );
		PRight.setLayout   (SideLayout   );
		PBottom.setLayout  (Default      );
		PCenter.setLayout  (CentralLayout);
		PNumbers.setLayout (TopCentral   );
		PStats.setLayout   (StatsLayout  );
	    PStatsOne.setLayout(BotCentral   );
	    PStatsTwo.setLayout(BotCentral   );

		PTop.setBackground     (new Color(48,128,20));
		PLeft.setBackground    (new Color(48,128,20));
		PRight.setBackground   (new Color(48,128,20));
		PBottom.setBackground  (new Color(48,128,20));
		PCenter.setBackground  (new Color(48,128,20));
		PNumbers.setBackground (new Color(48,128,20));
		PStats.setBackground   (new Color(48,128,20));
	    PStatsOne.setBackground(new Color(48,128,20));
	    PStatsTwo.setBackground(new Color(48,128,20));

	    LCashSpent.setForeground(Color.red);
	    LNetGain.setForeground(Color.blue);
	    LGamesPlayed.setForeground(Color.red);
	    LCredit.setForeground(Color.blue);
	    LTitle.setForeground(Color.yellow);

	    BBet.setBackground(Color.cyan);
	    BDecBet.setBackground(Color.cyan);
	    BSpin.setBackground(Color.cyan);
	    BCashOut.setBackground(Color.cyan);
	    BSkip.setBackground(Color.cyan);
	    BBet.setForeground(Color.red );
	    BDecBet.setForeground(Color.red );
	    BSpin.setForeground(Color.red );
	    BSkip.setForeground(Color.red);
	    BCashOut.setForeground(Color.red );




	    LCashSpent.setFont  (Small);
	    LNetGain.setFont    (Small);
	    LCredit.setFont     (Small);
	    LGamesPlayed.setFont(Small);



	    BBet.setFont    (Medium);
	    BDecBet.setFont (Medium);
	    BCashOut.setFont(Medium);
	    BSpin.setFont   (Medium);
	    BSkip.setFont(Medium);

	    LTitle.setFont     (Big);
	    TSpinOne.setFont   (Big);
	    TSpinTwo.setFont   (Big);
	    TSpinThree.setFont (Big);
	    TStatsOne.setFont  (Big);
	    TStatsTwo.setFont  (Big);
	    TStatsThree.setFont(Big);
	    TStatsFour.setFont (Big);
	    TCurrentBet.setFont(Big);

	    TSpinOne.setEditable   (false);
	    TSpinTwo.setEditable   (false);
	    TSpinThree.setEditable (false);
	    TStatsOne.setEditable  (false);
	    TStatsTwo.setEditable  (false);
	    TStatsThree.setEditable(false);
	    TStatsFour.setEditable (false);
	    TCurrentBet.setEditable(false);

	    TSpinOne.setHorizontalAlignment   (JTextField.CENTER);
	    TSpinTwo.setHorizontalAlignment   (JTextField.CENTER);
	    TSpinThree.setHorizontalAlignment (JTextField.CENTER);
	    TStatsOne.setHorizontalAlignment  (JTextField.CENTER);
	    TStatsTwo.setHorizontalAlignment  (JTextField.CENTER);
	    TStatsThree.setHorizontalAlignment(JTextField.CENTER);
	    TStatsFour.setHorizontalAlignment (JTextField.CENTER);
	    TCurrentBet.setHorizontalAlignment(JTextField.CENTER);

	    TStatsFour.setText(""+Credits);

	    PNumbers.add(LSpinnerLeft );
	    PNumbers.add(TSpinOne     );
	    PNumbers.add(TSpinTwo     );
	    PNumbers.add(TSpinThree   );
	    PNumbers.add(LSpinnerRight);

	    PStatsOne.add(TStatsOne   );
	    PStatsOne.add(LCashSpent  );
	    PStatsOne.add(LNetGain    );
	    PStatsOne.add(TStatsTwo   );
	    PStatsOne.add(TStatsThree );
	    PStatsOne.add(LGamesPlayed);
	    PStatsOne.add(LCredit     );
	    PStatsOne.add(TStatsFour  );

	    PTop.add(LTopLeft );
	    PTop.add(LTopLeftOne );
	    PTop.add(LTopLeftTwo );

	    PTop.add(LTitle   );
	    PTop.add(LTopRight);
	    PTop.add(LTopRightOne);
	    PTop.add(LTopRightTwo);


	    PBottom.add(LBotLeft   );
	    PBottom.add(TCurrentBet);
	    PBottom.add(BBet       );
	    PBottom.add(BDecBet    );
	    PBottom.add(BSpin      );
	    PBottom.add(BCashOut   );
	    PBottom.add(LBotRight  );

	    PLeft.add (LSides );
	    PLeft.add (LSides2);
	    PLeft.add (LSides3);
	    PRight.add(RSides );
	    PRight.add(RSides2);
	    PRight.add(RSides3);

	    PCenter.add(PNumbers );
	    PCenter.add(PStatsOne);

	    add(PRight,BorderLayout.EAST   );
	    add(PLeft,BorderLayout.WEST    );
	    add(PTop,BorderLayout.NORTH    );
	    add(PBottom,BorderLayout.SOUTH );
	    add(PCenter,BorderLayout.CENTER);

	    JOptionPane.showMessageDialog(null,"Welcome to the Pot 'O Gold! A match of 2 numbers will double your bet and a match of all three will quadruple your bet! Spend your credits wisely and see how much you can walk away with!");

	    AESpin Go = new AESpin        (      );
	    BSpin.addActionListener       (Go    );
	    AEBet Bet = new AEBet         (      );
	    BBet.addActionListener        (Bet   );
	    AECashOut Quit = new AECashOut(      );
	    BCashOut.addActionListener    (Quit  );
	    AEDecBet DecBet = new AEDecBet(      );
	    BDecBet.addActionListener     (DecBet);
	    AESkip Skip = new AESkip();
	    BSkip.addActionListener(Skip);

	}
	private class AESkip implements ActionListener
	{
		public void actionPerformed(ActionEvent POW)
		{
			TSpinOne.setText(1+"");

		}
	}

	private class AECashOut implements ActionListener
	{
		public void actionPerformed(ActionEvent POW)
		{
			BBet.setEnabled    (true);
			BDecBet.setEnabled (true);
    		BSpin.setEnabled   (true);
	        BCashOut.setEnabled(true);

			JOptionPane.showMessageDialog(null,"You walked away with: $" + Credits + "!");

			Gain      = 0  ;
			Bet       = 0  ;
			Spins     = 0  ;
			CashSpent = 0  ;
			Credits   = 200;

			TStatsOne.setText  (""+CashSpent);
			TStatsTwo.setText  (""+Gain     );
			TStatsThree.setText(""+Spins    );
			TStatsFour.setText (""+Credits  );
			TCurrentBet.setText(""+Bet      );

		}
	}
	private class AEBet implements ActionListener
	{
		public void actionPerformed(ActionEvent POW)
		{
			if(Credits-Bet < 1)
			{
				JOptionPane.showMessageDialog(null,"You don't have that kind of money! Decrease your bet or cashout!");

				BBet.setEnabled (false);
				BSpin.setEnabled(false);
			}
			if(Bet > 0) BDecBet.setEnabled(true);

			Bet++;

			TCurrentBet.setText(""+Bet);
		}
	}
	private class AEDecBet implements ActionListener
	{
		public void actionPerformed(ActionEvent POW)
		{
			if(Bet > Credits)
			{
				BBet.setEnabled (false);
				BSpin.setEnabled(false);
			}
			else
			{
				BBet.setEnabled (true);
				BSpin.setEnabled(true);
			}

			if(Bet < 2)BDecBet.setEnabled(false);
			else BDecBet.setEnabled      (true);

			Bet--;

			TCurrentBet.setText(""+Bet);
		}
	}
	private class AESpin implements ActionListener
	{
		public void actionPerformed(ActionEvent POW)
		{
			CashSpent += Bet;
			Credits   -= Bet;
			Gain      -= Bet;
			Spins     ++    ;

			TStatsTwo.setText  (""+Gain     );
			TStatsOne.setText  (""+CashSpent);
			TStatsThree.setText(""+Spins    );
			TStatsFour.setText (""+Credits  );

			BBet.setEnabled    (false);
			BDecBet.setEnabled (false);
			BSpin.setEnabled   (false);
		    BCashOut.setEnabled(false);

			LSpinnerLeft.setIcon (GSpinner);
			LSpinnerRight.setIcon(GSpinner);

		    ActionListener WakeUp = new TimeStamp();
			T = new Timer(100, WakeUp);

		    T.start();
		}
		private class TimeStamp implements ActionListener
		{
			public void actionPerformed(ActionEvent Kick)
			{
				TSpinOne.setBackground  (new Color(0,0,ColorChanger));
				TSpinTwo.setBackground  (new Color(ColorChanger,0,0));
				TSpinThree.setBackground(new Color(0,0,ColorChanger));
				TSpinOne.setForeground  (new Color(ColorChanger,0,ColorChanger));
				TSpinTwo.setForeground  (new Color(ColorChanger,0,ColorChanger));
				TSpinThree.setForeground(new Color(ColorChanger,0,ColorChanger));

	            TStatsOne.setBackground(new Color(ColorChanger,0,ColorChanger));
	            TStatsTwo.setBackground(new Color(ColorChanger,0,ColorChanger));
	            TStatsThree.setBackground(new Color(0,ColorChanger,ColorChanger));
	            TStatsFour.setBackground(new Color(0,ColorChanger,ColorChanger));
	            TCurrentBet.setBackground(Color.yellow);
	            TStatsOne.setForeground(new Color(ColorChanger,ColorChanger,0));
	            TStatsTwo.setForeground(new Color(ColorChanger,ColorChanger,0));
	            TStatsThree.setForeground(new Color(ColorChanger,ColorChanger,0));
	            TStatsFour.setForeground(new Color(ColorChanger,ColorChanger,0));
	            TCurrentBet.setForeground(Color.green);



				Mover        += 2 ;
				ColorChanger += 50;

				if( ColorChanger > 255) ColorChanger =100;

				if(Mover < 25)
				{
					Action = (int)(4*Math.random()+1);
				    TSpinOne.setText  ("" + Action     );
				    Action = (int)(4*Math.random()+1);
				    TSpinTwo.setText  ("" + Action     );
				    Action = (int)(4*Math.random()+1);
				    TSpinThree.setText("" + Action     );
				}
				if (Mover > 25 && Mover < 50)
				{
                       Action = (int)(4*Math.random()+1);
				    TSpinTwo.setText  ("" + Action     );
				    Action = (int)(4*Math.random()+1);
				    TSpinThree.setText("" + Action     );
				}
				if(Mover > 50 && Mover < 75)
				{
					Action = (int)(4*Math.random()+1);
				    TSpinThree.setText("" + Action     );
				}
				if(Mover == 76)
				{
				    Mover = 0;
				    T.stop() ;
    				if(Integer.parseInt(TSpinOne.getText()) == Integer.parseInt(TSpinTwo.getText()) && Integer.parseInt(TSpinTwo.getText()) == Integer.parseInt(TSpinThree.getText()))
    				{
						JOptionPane.showMessageDialog(null,"SUPER JACKPOT!!!!!!!!!!!!!!!");

    					Gain    += 4*Bet;
    					Credits += 4*Bet;

    					TStatsTwo.setText (""+Gain   );
    					TStatsFour.setText(""+Credits);

    					LSpinnerLeft.setIcon (GJackPot);
    					LSpinnerRight.setIcon(GJackPot);

    					TSpinOne.setBackground  (new Color(0,0,155));
						TSpinTwo.setBackground  (new Color(0,0,155));
				        TSpinThree.setBackground(new Color(0,0,155));
    				}
    				else if(Integer.parseInt(TSpinOne.getText()) == Integer.parseInt(TSpinTwo.getText()))
    				{
    					Gain    += 2*Bet;
    					Credits += 2*Bet;

    					TStatsTwo.setText (""+Gain   );
    					TStatsFour.setText(""+Credits);

	    		        TSpinOne.setBackground  (new Color(0,0,155));
	    				TSpinTwo.setBackground  (new Color(0,0,155));
	    				TSpinThree.setBackground(new Color(155,0,0));
    				}
    				else if(Integer.parseInt(TSpinTwo.getText()) == Integer.parseInt(TSpinThree.getText()))
    				{
    					Gain    += 2*Bet;
    					Credits += 2*Bet;

    					TStatsTwo.setText (""+Gain   );
    					TStatsFour.setText(""+Credits);

					    TSpinOne.setBackground  (new Color(155,0,0));
					    TSpinTwo.setBackground  (new Color(0,0,155));
	    				TSpinThree.setBackground(new Color(0,0,155));
					}
					else if(Integer.parseInt(TSpinOne.getText())== Integer.parseInt(TSpinThree.getText()))
					{
    					Gain    += 2*Bet;
    					Credits += 2*Bet;

    					TStatsTwo.setText (""+Gain   );
    					TStatsFour.setText(""+Credits);

					    TSpinOne.setBackground  (new Color(0,0,155));
					    TSpinTwo.setBackground  (new Color(155,0,0));
	    				TSpinThree.setBackground(new Color(0,0,155));

					}
			        else if(Integer.parseInt(TSpinOne.getText()) != Integer.parseInt(TSpinTwo.getText())&&Integer.parseInt(TSpinOne.getText()) != Integer.parseInt(TSpinThree.getText())&&Integer.parseInt(TSpinTwo.getText()) != Integer.parseInt(TSpinThree.getText()))
			        {
						TSpinOne.setBackground  (new Color(155,0,0));
						TSpinTwo.setBackground  (new Color(155,0,0));
						TSpinThree.setBackground(new Color(155,0,0));
					}

    				BBet.setEnabled    (true);
    				BDecBet.setEnabled (true);
					BSpin.setEnabled   (true);
			        BCashOut.setEnabled(true);
			        if(Credits-Bet < 0)
					{
						JOptionPane.showMessageDialog(null,"You don't have that kind of money! Decrease your bet or cashout!");

						BBet.setEnabled (false);
						BSpin.setEnabled(false);

			        }
			        if(Credits == 0)
					{
						JOptionPane.showMessageDialog(null, "You don't have enough money, please cash out.");

						BDecBet.setEnabled(false);
						BBet.setEnabled   (false);
						BSpin.setEnabled  (false);
					}
         			if(Bet > Credits)
        			{
        				BBet.setEnabled (false);
        				BSpin.setEnabled(false);
        			}
        			else
        			{
        				BBet.setEnabled (true);
        				BSpin.setEnabled(true);
        			}
			    }
		    }
		}
	}
	int Mover,Action,Gain,Bet,ColorChanger,Spins,Credits,CashSpent;

	Timer T;

	JPanel PTop      = new JPanel();
	JPanel PStats    = new JPanel();
	JPanel PLeft     = new JPanel();
	JPanel PRight    = new JPanel();
	JPanel PBottom   = new JPanel();
	JPanel PCenter   = new JPanel();
	JPanel PNumbers  = new JPanel();
	JPanel PStatsOne = new JPanel();
	JPanel PStatsTwo = new JPanel();

	ImageIcon GSides     = new ImageIcon("Sides.gif"  );
	ImageIcon GTopBottom = new ImageIcon("Top.gif"    );
	ImageIcon GSpinner   = new ImageIcon("Spinner.gif");
	ImageIcon GJackPot   = new ImageIcon("JackPot.gif");

	JLabel LSides        = new JLabel(GSides    );
	JLabel LSides2       = new JLabel(GSides    );
	JLabel LSides3       = new JLabel(GSides    );
	JLabel RSides        = new JLabel(GSides    );
	JLabel RSides2       = new JLabel(GSides    );
	JLabel RSides3       = new JLabel(GSides    );
	JLabel LTopLeft      = new JLabel(GTopBottom);
	JLabel LTopRight     = new JLabel(GTopBottom);
	JLabel LBotLeft      = new JLabel(GTopBottom);
	JLabel LBotRight     = new JLabel(GTopBottom);
	JLabel LTopLeftOne   = new JLabel(GTopBottom);
	JLabel LTopRightOne  = new JLabel(GTopBottom);
	JLabel LTopLeftTwo   = new JLabel(GTopBottom);
	JLabel LTopRightTwo  = new JLabel(GTopBottom);
	JLabel LTopLeftThree = new JLabel(GTopBottom);
	JLabel LTopRightThree= new JLabel(GTopBottom);
    JLabel LSpinnerLeft  = new JLabel(GSpinner  );
    JLabel LSpinnerRight = new JLabel(GSpinner  );


	JLabel LCashSpent   = new JLabel("Cash Spent"     );
	JLabel LNetGain     = new JLabel("Net Gain"       );
	JLabel LGamesPlayed = new JLabel("Games Played"   );
	JLabel LCredit      = new JLabel("Credits"        );
	JLabel LTitle       = new JLabel("The Pot 'O Gold");

	JButton BBet     = new JButton("Increase Bet");
	JButton BDecBet  = new JButton("Decrease Bet");
	JButton BSpin    = new JButton("Spin"        );
	JButton BSkip    = new JButton("Skip"        );
	JButton BCashOut = new JButton("Cash Out"    );

	JTextField TSpinOne    = new JTextField( );
	JTextField TSpinTwo    = new JTextField( );
	JTextField TSpinThree  = new JTextField( );
	JTextField TStatsOne   = new JTextField( );
	JTextField TStatsTwo   = new JTextField( );
	JTextField TStatsThree = new JTextField( );
	JTextField TStatsFour  = new JTextField( );
	JTextField TCurrentBet = new JTextField(2);
}
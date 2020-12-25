import java.awt.*;
import java.awt.event.*;
public class Tic extends Frame{
	TextField t1,t2,t3;
	Label l1,l2,l3;
	Button b[]=new Button[9];
	Panel p1,p2;
	GridLayout g;
	boolean flag;
	int a1=0;
	int a2=0;
	int a3=0;int a4=0;int a5=0;
	int a6=0;int j=0;
	int a7=0;int a8=0;int a9=0;
    public Tic() {
    	t1=new TextField();
    	t2=new TextField();
    	t3=new TextField();
    	l1=new Label("Player 1");
    	
    	l2=new Label("Player 2");
    	l3=new Label();
    	p1=new Panel();
    	p2=new Panel();
    	
    //	Button btn[]=new Button[9];
    	flag=true;
    	for(int i=0;i<9;i++)
    	{
    		b[i]=new Button();
    		b[i].setForeground(Color.BLACK);
    		//b[i].setBounds(50,100,95,30);  
    		p1.add(b[i]);
    	}
    	p1.setLayout(new GridLayout(3,3,5,5));
    	p2.setLayout(new GridLayout(2,2,2,2));
    	p2.add(l1);
    	p2.add(t1);
    	p2.add(l2);
    	p2.add(t2);
    	add(p1,BorderLayout.CENTER);
    	add(p2,BorderLayout.NORTH);
    	add(l3,BorderLayout.SOUTH);
    	setBounds(100,100,250,300);
    	setVisible(true);
    	b[0].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			if(flag==true && a1==0){
    				b[0].setLabel("x");
    				flag=false;
    				a1=1;
    				j=j+1;}
    			else
    				if(a1==0 && flag==false){
    				
    				b[0].setLabel("0");
    				flag=true;
    				a1=1;j=j+1;
    			}
    			if((b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")||(b[5].getLabel()=="x" && b[3].getLabel()=="x" && b[4].getLabel()=="x") ||(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")||(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")||(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")||(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x"))
    			{
    				l3.setText(t1.getText()+"won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			else if((b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")||(b[5].getLabel()=="0" && b[3].getLabel()=="0" && b[4].getLabel()=="0") ||(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")||(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")||(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")||(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
    			{
    				l3.setText(t2.getText()+"won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			if(j==9)
    			{
    				l3.setText("Match Draw!!");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}		
    		}});
    			b[1].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			if(flag==true && a2==0){
    				b[1].setLabel("x");
    				flag=false;
    				a2=1;
    				j=j+1;}
    			else
    				if(flag==false && a2==0){
    				b[1].setLabel("0");
    				flag=true;
    				a2=1;j=j+1;
    			}
    			if((b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")||(b[5].getLabel()=="x" && b[3].getLabel()=="x" && b[4].getLabel()=="x") ||(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")||(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")||(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")||(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x"))
    			{
    				l3.setText(t1.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			else if((b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")||(b[5].getLabel()=="0" && b[3].getLabel()=="0" && b[4].getLabel()=="0") ||(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")||(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")||(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")||(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
    			{
    				l3.setText(t2.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			if(j==9)
    			{
    				l3.setText("Match Draw!!");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    					
    		}});
    			b[2].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			if(flag==true && a3==0){
    				b[2].setLabel("x");
    				flag=false;
    				a3=1;
    				j=j+1;}
    			else
    				if(flag==false && a3==0)
    				{
    				b[2].setLabel("0");
    				flag=true;a3=1;
    				j=j+1;
    			}
    			if((b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")||(b[5].getLabel()=="x" && b[3].getLabel()=="x" && b[4].getLabel()=="x") ||(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")||(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")||(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")||(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x"))
    			{
    				l3.setText(t1.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			else if((b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")||(b[5].getLabel()=="0" && b[3].getLabel()=="0" && b[4].getLabel()=="0") ||(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")||(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")||(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")||(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
    			{
    				l3.setText(t2.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			if(j==9)
    			{
    				l3.setText("Match Draw!!");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}		
    		}});
    			b[3].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			if(flag==true && a4==0){
    				b[3].setLabel("x");
    				flag=false;
    				a4=1;
    				j=j+1;}
    			else if(flag==false && a4==0)
    				{
    				b[3].setLabel("0");
    				flag=true;
    				a4=1;j=j+1;
    			}
    			if((b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")||(b[5].getLabel()=="x" && b[3].getLabel()=="x" && b[4].getLabel()=="x") ||(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")||(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")||(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")||(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x"))
    			{
    				l3.setText(t1.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			else if((b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")||(b[5].getLabel()=="0" && b[3].getLabel()=="0" && b[4].getLabel()=="0") ||(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")||(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")||(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")||(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
    			{
    				l3.setText(t2.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			if(j==9)
    			{
    				l3.setText("Match Draw!!");
    			}		
    					
    		}
    	});
    			b[4].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			if(flag==true && a5==0){
    				b[4].setLabel("x");
    				flag=false;
    				a5=1;
    				j=j+1;}
    			else if(flag==false && a5==0){
    			
    				b[4].setLabel("0");
    				flag=true;a5=1;j=j+1;
    			}
    			if((b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")||(b[5].getLabel()=="x" && b[3].getLabel()=="x" && b[4].getLabel()=="x") ||(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")||(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")||(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")||(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x"))
    			{
    				l3.setText(t1.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			else if((b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")||(b[5].getLabel()=="0" && b[3].getLabel()=="0" && b[4].getLabel()=="0") ||(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")||(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")||(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")||(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
    			{
    				l3.setText(t2.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			if(j==9)
    			{
    				l3.setText("Match Draw!!");
    			}		
    		}
    	});
    		b[5].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			if(flag==true && a6==0){
    				b[5].setLabel("x");
    				flag=false;
    				a6=1;j=j+1;}
    			else if(flag==false && a6==0)
    			{b[5].setLabel("0");
    				flag=true;a6=1;j=j+1;
    			}
    		if((b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")||(b[5].getLabel()=="x" && b[3].getLabel()=="x" && b[4].getLabel()=="x") ||(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")||(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")||(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")||(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x"))
    			{
    				l3.setText(t1.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			else if((b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")||(b[5].getLabel()=="0" && b[3].getLabel()=="0" && b[4].getLabel()=="0") ||(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")||(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")||(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")||(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
    			{
    				l3.setText(t2.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}		
    		}
    		if(j==9)
    			{
    				l3.setText("Match Draw!!");
    			}
    		}	});
    		b[6].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			if(flag==true && a7==0){
    				b[6].setLabel("x");
    				flag=false;
    				a7=1;j=j+1;}
    			else if(flag==false && a7==0){
    				b[6].setLabel("0");
    				flag=true;a7=1;j=j+1;
    			}
    		if((b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")||(b[5].getLabel()=="x" && b[3].getLabel()=="x" && b[4].getLabel()=="x") ||(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")||(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")||(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")||(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x"))
    			{
    				l3.setText(t1.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			else if((b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")||(b[5].getLabel()=="0" && b[3].getLabel()=="0" && b[4].getLabel()=="0") ||(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")||(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")||(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")||(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
    			{
    				l3.setText(t2.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			if(j==9)
    			{
    				l3.setText("Match Draw!!");
    			}			
    		}
    	});
    		b[7].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			if(flag==true && a8==0){
    				b[7].setLabel("x");
    				flag=false;
    				a8=1;j=j+1;}
    			else if(flag==false && a8==0){
    				b[7].setLabel("0");
    				flag=true;
    				a8=1;j=j+1;
    			}
    		if((b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")||(b[5].getLabel()=="x" && b[3].getLabel()=="x" && b[4].getLabel()=="x") ||(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")||(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")||(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")||(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x"))
    			{
    				l3.setText(t1.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			else if((b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")||(b[5].getLabel()=="0" && b[3].getLabel()=="0" && b[4].getLabel()=="0") ||(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")||(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")||(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")||(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
    			{
    				l3.setText(t2.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			if(j==9)
    			{
    				l3.setText("Match Draw!!");
    			}				
    		}
    	});
    		b[8].addActionListener(new ActionListener()
    	{
    		public void actionPerformed(ActionEvent ae)
    		{
    			if(flag==true && a9==0){
    				b[8].setLabel("x");
    				flag=false;
    				a9=1;
    				j=j+1;}
    			else if(flag==false && a9==0){
    				b[8].setLabel("0");
    				flag=true;a9=1;j=j+1;
    			}
    		if((b[0].getLabel()=="x" && b[1].getLabel()=="x" && b[2].getLabel()=="x")||(b[5].getLabel()=="x" && b[3].getLabel()=="x" && b[4].getLabel()=="x") ||(b[6].getLabel()=="x" && b[7].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[3].getLabel()=="x" && b[6].getLabel()=="x")||(b[1].getLabel()=="x" && b[4].getLabel()=="x" && b[7].getLabel()=="x")||(b[2].getLabel()=="x" && b[5].getLabel()=="x" && b[8].getLabel()=="x")||(b[0].getLabel()=="x" && b[4].getLabel()=="x" && b[8].getLabel()=="x")||(b[2].getLabel()=="x" && b[4].getLabel()=="x" && b[6].getLabel()=="x"))
    			{
    				l3.setText(t1.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			else if((b[0].getLabel()=="0" && b[1].getLabel()=="0" && b[2].getLabel()=="0")||(b[5].getLabel()=="0" && b[3].getLabel()=="0" && b[4].getLabel()=="0") ||(b[6].getLabel()=="0" && b[7].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[3].getLabel()=="0" && b[6].getLabel()=="0")||(b[1].getLabel()=="0" && b[4].getLabel()=="0" && b[7].getLabel()=="0")||(b[2].getLabel()=="0" && b[5].getLabel()=="0" && b[8].getLabel()=="0")||(b[0].getLabel()=="0" && b[4].getLabel()=="0" && b[8].getLabel()=="0")||(b[2].getLabel()=="0" && b[4].getLabel()=="0" && b[6].getLabel()=="0"))
    			{
    				l3.setText(t2.getText()+"   won the game");
    				for(int i=0;i<9;i++)
    				{
    					b[i].setEnabled(false);
    				}
    			}
    			if(j==9)
    			{
    				l3.setText("Match Draw!!");
    			}			
    		}
    	});
    	
    	addWindowListener(new WindowAdapter()
    	{
    		public void windowClosing(WindowEvent we)
    		{
    			dispose();
    		}
    	});
    		
    	
    		
    }
    
    
} 
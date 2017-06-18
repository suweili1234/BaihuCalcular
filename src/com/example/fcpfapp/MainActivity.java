package com.example.fcpfapp;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;



public class MainActivity extends Activity {

	private TextView adidas;
	private RadioGroup pgracoaka;
	private RadioButton babatjeaagj;
	private int OK=4;
	private EditText aeettxte[][]=new EditText[3][4];
	private int aaaweqwrtuo[]={0,0,0,0};
	private EditText agaagsta;
	private double money=0.5;
	private int outaaaa[]={0,0,0,0};
	private int aafaffsss[]={0,0,0,0};
	double aawertyy[]={0,0,0,0};
	private TextView aawertyy_view[]=new TextView[4];
	private Button acadaafa_btn,aaaerwet_btn,afryyu_btn;
	private myHouseculateOnClickListener myHouse=new myHouseculateOnClickListener();
	private MyOnFocusChangListener aaaawwewqeweq=new MyOnFocusChangListener();
	private MyaallknkOnClickListener wrrewrteyyety=new MyaallknkOnClickListener();

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		/*findObjeck();*/
		acadaafa_btn=(Button)findViewById(R.id.JiSuan);
		afryyu_btn=(Button)findViewById(R.id.buttonexit);
		aeettxte[0][0]=(EditText)findViewById(R.id.edthnJia);
		aeettxte[1][2]=(EditText)findViewById(R.id.edttnBin);
		aeettxte[1][3]=(EditText)findViewById(R.id.edttnDing);
		aeettxte[2][0]=(EditText)findViewById(R.id.edthxJia);
		aeettxte[2][1]=(EditText)findViewById(R.id.edthxYi);
		aeettxte[2][2]=(EditText)findViewById(R.id.edthxBin);
		aeettxte[0][1]=(EditText)findViewById(R.id.edthnYi);
		aeettxte[0][2]=(EditText)findViewById(R.id.edthnBin);
		aeettxte[0][3]=(EditText)findViewById(R.id.edthnDing);
		aeettxte[1][0]=(EditText)findViewById(R.id.edttnJia);
		aeettxte[1][1]=(EditText)findViewById(R.id.edttnYi);
		aeettxte[2][3]=(EditText)findViewById(R.id.edthxDing);
		aaaerwet_btn=(Button)findViewById(R.id.buttonclean);
		aawertyy_view[0]=(TextView)findViewById(R.id.TextViewJJ);
		aawertyy_view[1]=(TextView)findViewById(R.id.TextViewAB);
		aawertyy_view[2]=(TextView)findViewById(R.id.TextViewJGBin);
		aawertyy_view[3]=(TextView)findViewById(R.id.TextViewJGDing);
		pgracoaka=(RadioGroup)findViewById(R.id.radioGroup1);
		babatjeaagj=(RadioButton)findViewById(R.id.radio10);
		agaagsta=(EditText)findViewById(R.id.eiextprice);
		adidas=(TextView)findViewById(R.id.textViewDin);
		pgracoaka.setOnCheckedChangeListener(new MyOncheckChangListener());
		
		acadaafa_btn.setOnClickListener(myHouse);
		setEditFocusListener();
		
		afryyu_btn.setOnClickListener(new View.OnClickListener() {
		
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				System.exit(0);
			}
		});
		aaaerwet_btn.setOnClickListener(wrrewrteyyety);
	}

	

	/*private void findObjeck() {
		// TODO Auto-generated method stub
		
	}*/
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}
	private void init()
	{
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<4;j++)
			{
				if(aeettxte[i][j].getText().toString().equals(""))
					aeettxte[i][j].setText("0");
			}
		}
		if(agaagsta.getText().toString().equals(""))
			agaagsta.setText("0.5");
		try{for(int i=0;i<OK; i++){
			
				aaaweqwrtuo[i]=Integer.parseInt(aeettxte[0][i].getText().toString());
				outaaaa[i]=Integer.parseInt(aeettxte[1][i].getText().toString());
				aafaffsss[i]=Integer.parseInt(aeettxte[2][i].getText().toString());
			}
		
		money=Double.parseDouble(agaagsta.getText().toString());
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		}
	
	
	public void onClick(View v) {
				
            }
	private void calculate()
	{
		aawertyy[0]=aawertyy[1]=aawertyy[2]=aawertyy[3]=0;
		for(int i=0;i<OK;i++)
		{
			for(int j=0; j<OK;j++)
			{
				aawertyy[i]+=compare(aafaffsss[i],aafaffsss[j])*(outaaaa[i]+outaaaa[j]);
				aawertyy[i]+=(myInt(aafaffsss[i])-myInt(aafaffsss[j]))*(aaaweqwrtuo[i]+1)*(aaaweqwrtuo[j]+1)*money;
				
			}
		}
	}
	private void view()
	{
		for(int i=0;i<OK;i++){
			aawertyy_view[i].setText(String.valueOf(Math.round(aawertyy[i]*10/10.0)));
			
		}
	}
	class MyOncheckChangListener implements RadioGroup.OnCheckedChangeListener{
		
		@Override
		public void onCheckedChanged(RadioGroup group,int checkedId)
		{
			aallknk();
			boolean tag;
			if(babatjeaagj.getId()==checkedId){
			OK=3;
			tag=false;
		}else
			{
				OK=4;
				tag=true;
			}
			for (int i=0;i<3;i++)
			{
				aeettxte[i][3].setEnabled(tag);
			}
			aawertyy_view[3].setEnabled(tag);
			adidas.setEnabled(tag);
		}
	}
	 class MyaallknkOnClickListener implements View.OnClickListener{

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			aallknk();
		}

	}
	 private void aallknk()
	 {
		 for(int i =0;i<3;i++)
		 {
			 for(int j=0;j<4;j++){
				 aeettxte[i][j].setText("0");
			 }
		 }
		 for (int j=0;j<4;j++)
		 {
			 aawertyy_view[j].setText("0");
		 }
	 }
	 private void setEditFocusListener()
	 {
		 for(int i=0;i<3;i++)
		 {
			 for(int j=0;j<4;j++)
			 {
				 aeettxte[i][j].setOnFocusChangeListener(aaaawwewqeweq);
			 }
		 }
		 agaagsta.setOnFocusChangeListener(aaaawwewqeweq);
	 }
	 class myHouseculateOnClickListener implements View.OnClickListener {

		@Override
		public void onClick(View arg0) {
			// TODO Auto-generated method stub
			init();
			calculate();
			view();
		}
		 
	}
	 private int compare(int x ,int y){
		if(x==y)return 0;
		 return x>y?1:-1;
		}
	 private int myInt(int aafaffsss)
	 {
		 int tag=1,aafaffsss_abs;
		 aafaffsss_abs=Math.abs(aafaffsss);
		 if(aafaffsss<0)tag=-1;
		 if(aafaffsss_abs%10>=5)
			 aafaffsss_abs=(aafaffsss_abs/10+1)*10;
		 else
			 aafaffsss_abs=aafaffsss_abs/10*10;
		 return aafaffsss_abs*tag;
	 }
	  class MyOnFocusChangListener implements View.OnFocusChangeListener{

		@Override
		public void onFocusChange(View v, boolean hanFocus) {
			// TODO Auto-generated method stub
			EditText aeettxte=(EditText)v;
			if(hanFocus)
			{
				aeettxte.setText("");
			}
			else {
				if(aeettxte.getText().toString().equals(""))
				{
					if(aeettxte.getId()==R.id.eiextprice)
						aeettxte.setText("0.5");
					else
						aeettxte.setText("0");
					
				}
			}
			
		}
		  
	  }

}

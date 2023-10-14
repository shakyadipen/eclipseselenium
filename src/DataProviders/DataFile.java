package DataProviders;
import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
public class DataFile {
	@DataProvider(name="data")
	public static Object[][]testData(Method m){
		Object[][] obj=null;
		
		//return obj;
		if(m.getName().equals("registeruser")) {
			obj=new Object[3][4];//3 rows 4 coulmns
			obj[0][0]="Dipen";
			obj[0][1]="Shakya";
			obj[0][2]="9849594238";
			obj[0][3]="shakyadipen@gmaul.com";
			
			obj[1][0]="Sanam";
			obj[1][1]="Maharjan";
			obj[1][2]="9860105431";
			obj[1][3]="shakyadipen@gmaul.com";
			
			obj[2][0]="Dip";
			obj[2][1]="Shakya";
			obj[2][2]="989594238";
			obj[2][3]="sakyadipen@gmaul.com";
			//return obj;
			
		}
		if(m.getName().equals("loginuser")) {
			 obj=new Object[3][2];//2 rows 2 coulmns
			obj[0][0]="Dipen";
			obj[0][1]="Shakya";
////		//
			obj[1][0]="Sanam";
			obj[1][1]="Maharjan";
////			
			obj[2][0]="Dip";
			obj[2][1]="Shakya";
			
		}
		return obj;
	}
//	@DataProvider(name="logindata")
//	public static Object[][]loginTestData(){
//		Object[][] objregister=new Object[3][2];//3 rows 4 coulmns
//		objregister[0][0]="Dipen";
//		objregister[0][1]="Shakya";
//	//
//		objregister[1][0]="Sanam";
//		objregister[1][1]="Maharjan";
//		
//		objregister[2][0]="Dip";
//		objregister[2][1]="Shakya";
//		return objregister;
//	}

}

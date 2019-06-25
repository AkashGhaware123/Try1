package temp;
import java.io.BufferedReader;
import java.awt.Desktop;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
public class abc
{
	//public static final String loc1="D:\\Akash\\Try.xls";
	
	public static void main(String[] args) throws BiffException, IOException
	{
		
		/*
		String FilePath = "D:\\Temp\\Book1.xls";
	     
		FileInputStream fs = new FileInputStream(FilePath);
		Workbook wb = Workbook.getWorkbook(fs);
		Sheet sh = wb.getSheet("Sheet1");
		int totalNoOfRows = sh.getRows();
		int totalNoOfCols = sh.getColumns();
		System.out.println("No of Rows="+totalNoOfRows);
		System.out.println("No of Col="+totalNoOfCols);
		String inc;
		inc=sh.getCell(2,0).getContents();
		//nc=sh.getCell(col, row).getContents();
		
		for(int i=1;i<totalNoOfRows;i++)
		{
			for(int j=0;j<totalNoOfCols;j++)
			{
				inc=sh.getCell(j,i).getContents();
				System.out.print(inc +"     ");
				//System.out.println(i + " "+j);
			}
			System.out.println();
		}
		
		Workbook workbook = null;
		workbook = Workbook.getWorkbook(new File(loc1));
		Sheet sheet = workbook.getSheet(0);
		
		String name;
		String gender;
		int rows=sheet.getRows();
		int col=sheet.getColumns();
		System.out.println("No of Rows="+rows);
		System.out.println("No of Col="+col);
		for(int i=1;i<rows;i++)
		{
			for(int j=0;j<col;j++)
			{
				name=sheet.getCell(j, i).getContents();
				System.out.print(name+"");
			}
			System.out.println();
		}
		
		String path= "D:\\Incident History\\Incidents.txt";
		File file3=new File("D:\\Incident History\\Incidents.txt");
		String inc="Asc";
		String grp="Pqr";
		StringBuffer txt=new StringBuffer();
		txt.append(inc);
		txt.append(" ");
		txt.append(grp);
		String text=txt.toString();
		BufferedWriter writer = new BufferedWriter(new FileWriter(file3, true));
		//BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(System.out));

	    
	        writer.write(text);
	        writer.newLine();
	    
	    writer.close();
		
		//Desktop.getDesktop().open(new File("D:\\Akash"));
*/	
	
		String abc,pqr;
		for(int i=0;i<=2;i++)
		{
		
		abc="abc";
		pqr=abc + String.valueOf(i);
		System.out.println(pqr);
		}
	}
}
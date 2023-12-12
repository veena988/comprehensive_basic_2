package org.lUS.comprehensive_1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.hssf.usermodel.HSSFFormulaEvaluator;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.CellType;

public class Assinment_1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		
		try
        {
			ArrayList data =new ArrayList();
            FileInputStream file = new FileInputStream("src\\main\\java\\Assignment1.xlsx");
            XSSFWorkbook wb = new XSSFWorkbook(file);
            XSSFSheet ws = wb.getSheetAt(0);
            Iterator<Row> rowIterator = ws.iterator();
            while (rowIterator.hasNext()) 
            {
                Row row = rowIterator.next();
                Iterator<Cell> cellIterator = row.cellIterator();
                 
                while (cellIterator.hasNext()) 
                {
                    Cell cell = cellIterator.next();
                    switch (cell.getCellType()) 
                    {
                        case NUMERIC:
                            System.out.print(cell.getNumericCellValue()+"\t");
                            data.add(cell.getNumericCellValue());
                            break;
                        case STRING:
                            System.out.print(cell.getStringCellValue()+ "\t");
                            data.add(cell.getStringCellValue());
                            break;
                    }
                }
                System.out.println();
                
            }
            System.out.println("Reading File Completed.");
            System.out.print("data in List:\n" + data.get(0)+"\t"+ data.get(1)+"\t"+data.get(2)+"\n"+data.get(3)+"\t"+data.get(4)+"\t"+data.get(5)+"\n"+data.get(6)+"\t"+data.get(7)+"\t"+data.get(8)); 
            file.close();
        } 
        catch (Exception ex) 
        {
            ex.printStackTrace();
        }

	}
	    
}

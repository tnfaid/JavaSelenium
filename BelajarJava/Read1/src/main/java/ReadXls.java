import java.io.File;  
import java.io.FileInputStream;  
import java.io.IOException;  
import org.apache.poi.hssf.usermodel.HSSFSheet;  
import org.apache.poi.hssf.usermodel.HSSFWorkbook;  
import org.apache.poi.ss.usermodel.Cell;  
import org.apache.poi.ss.usermodel.FormulaEvaluator;  
import org.apache.poi.ss.usermodel.Row;  

public class ReadXls {
	public static void main(String args[]) throws IOException  
	{  
	
		FileInputStream fis=new FileInputStream(new File("/home/titik/Documents/project/FileXls.xls"));  
		HSSFWorkbook wb=new HSSFWorkbook(fis);   
		HSSFSheet sheet=wb.getSheetAt(0);   
		FormulaEvaluator formulaEvaluator=wb.getCreationHelper().createFormulaEvaluator();  
		for(Row row: sheet)     
		{  
			for(Cell cell: row)    
			{  
//				switch(formulaEvaluator.evaluateInCell(cell).getCellType())  
//				{  
////					case Cell.CELL_TYPE_NUMERIC:   //field yang represents numeric cell type  
//					System.out.print(cell.getNumericCellValue()+ "\t\t");   
//					break;  
//		
//					case Cell.CELL_TYPE_STRING:    //field yang represents string cell type   
//					System.out.print(cell.getStringCellValue()+ "\t\t");  
//					break;  
//				}  
				System.out.println();  
			}
		}
	}
}

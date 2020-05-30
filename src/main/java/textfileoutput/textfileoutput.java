package textfileoutput;

import javax.swing.JOptionPane;    // Needed for Dialog Box
import java.io.*; 
import java.io.IOException;
import java.io.PrintWriter;
/**
 *   This program demonstrates
 *   showInputDialog.
 */
public class textfileoutput
{
   public static void main(String[] args) throws IOException
   {
	   //Prepare Input File
	   File file = new File("INPUT.txt"); 
	   BufferedReader br = new BufferedReader(new FileReader(file)); 
	   
	   //Prepare Output File
	   PrintWriter out = new PrintWriter("OUTPUT.txt"); // Step 2
	   
	   String tableName;
	   tableName = JOptionPane.showInputDialog("Enter the Table name ");
	
	   // Write the Input
	   out.print("CREATE TABLE "+tableName+ " (" );  
	   out.println(""); 
	   String fieldValue; 
	   
	   /*String[] values = {"0", "3", "6", "12", "18", "24"};

	   Object selected = JOptionPane.showInputDialog(null, "What is the target Nicotine level?", "Selection", JOptionPane.DEFAULT_OPTION, null, values, "0");
	   if ( selected != null ){//null if the user cancels. 
	       String selectedString = selected.toString();
	       //do something
	   }else{
	       System.out.println("User cancelled");
	   }*/
	   
	   while ((fieldValue = br.readLine()) != null) {
	      //System.out.println(st); 
	      String columnType;
	      columnType = JOptionPane.showInputDialog(null,new Object[]
	    		  									{ "Select Coulumn Type for "+fieldValue+"\n\n",
	    		  											" Enter 1 for VARCHAR2(size [BYTE | CHAR]) ",
	    		  											" Enter 2 for NVARCHAR2(size) ",
	    		  											" Enter 3 for NUMBER[(precision [ ",
	    		  											" Enter 4 for LONG ",
	    		  											" Enter 5 for DATE ",
	    		  											" Enter 6 for BINARY_FLOAT ",
	    		  											" Enter 7 for BINARY_DOUBLE ",
	    		  											" Enter 8 for RAW(size) ",
	    		  											" Enter 9 for LONG RAW ",
	    		  											" Enter 10 for ROWID ",
	    		  											" Enter 11 for CHAR [(size [BYTE | CHAR])] ",
	    		  											" Enter 12 for NCHAR[(size)] ",
	    		  											" Enter 13 for CLOB ",
	    		  											" Enter 14 for NCLOB ",
	    		  											" Enter 15 for BLOB ",
	    		  											" Enter 16 for BFILE ",
	    		  											" Enter 17 for TIMESTAMP [(fractional_seconds)] ",
	    		  											" Enter 18 for TIMESTAMP [(fractional_seconds)] WITH TIME ZONE ",
	    		  											" Enter 19 for INTERVAL YEAR [(year_precision)] TO MONTH ",
	    		  											" Enter 20 for INTERVAL DAY [(day_precision)] TO SECOND[(fractional_seconds)] ",
	    		  											" Enter 21 for UROWID [(size)] ",
	    		  											" Enter 22 for TIMESTAMP [(fractional_seconds)] WITH LOCAL TIMEZONE "}
	      											 ,JOptionPane.INFORMATION_MESSAGE
	      											 );
	      
	      int i=Integer.parseInt(columnType);  

	      out.print(fieldValue +"  ");   // Step 3
	      
	      if (i == 1 ) {out.print("VARCHAR2");String VARCHAR2size;VARCHAR2size = JOptionPane.showInputDialog("Enter the Column Size ");if(VARCHAR2size.isBlank()) {out.println(",");}else{out.println("("+VARCHAR2size+"),");}}
	      else if (i == 2 ) {out.print("NVARCHAR2");String NVARCHAR2size;NVARCHAR2size = JOptionPane.showInputDialog("Enter the Column Size ");if(NVARCHAR2size.isBlank()) {out.println(",");}else{out.println("("+NVARCHAR2size+"),");}}
	      else if (i == 3 ) {out.print("NUMBER");String NUMBERsize;NUMBERsize = JOptionPane.showInputDialog("Enter the Column Size ");if(NUMBERsize.isBlank()) {out.println(",");}else{out.println("("+NUMBERsize+"),");}}
	      else if (i == 4 ) {out.print("LONG");String LONGsize;LONGsize = JOptionPane.showInputDialog("Enter the Column Size ");if(LONGsize.isBlank()) {out.println(",");}else{out.println("("+LONGsize+"),");}}
	      else if (i == 5 ) {out.print("DATE");String DATEsize;DATEsize = JOptionPane.showInputDialog("Enter the Column Size ");if(DATEsize.isBlank()) {out.println(",");}else{out.println("("+DATEsize+"),");}}
	      else if (i == 6 ) {out.print("BINARY_FLOAT");String BINARY_FLOATsize;BINARY_FLOATsize = JOptionPane.showInputDialog("Enter the Column Size ");if(BINARY_FLOATsize.isBlank()) {out.println(",");}else{out.println("("+BINARY_FLOATsize+"),");}}
	      else if (i == 7 ) {out.print("BINARY_DOUBLE");String BINARY_DOUBLEsize;BINARY_DOUBLEsize = JOptionPane.showInputDialog("Enter the Column Size ");if(BINARY_DOUBLEsize.isBlank()) {out.println(",");}else{out.println("("+BINARY_DOUBLEsize+"),");}}
	      else if (i == 8 ) {out.print("RAW");String RAWsize;RAWsize = JOptionPane.showInputDialog("Enter the Column Size ");if(RAWsize.isBlank()) {out.println(",");}else{out.println("("+RAWsize+"),");}}
	      else if (i == 9 ) {out.print("LONG RAW");String LONGRAWsize;LONGRAWsize = JOptionPane.showInputDialog("Enter the Column Size ");if(LONGRAWsize.isBlank()) {out.println(",");}else{out.println("("+LONGRAWsize+"),");}}
	      else if (i == 10 ) {out.print("ROWID");String ROWIDsize;ROWIDsize = JOptionPane.showInputDialog("Enter the Column Size ");if(ROWIDsize.isBlank()) {out.println(",");}else{out.println("("+ROWIDsize+"),");}}
	      else if (i == 11 ) {out.print("CHAR");String CHARsize;CHARsize = JOptionPane.showInputDialog("Enter the Column Size ");if(CHARsize.isBlank()) {out.println(",");}else{out.println("("+CHARsize+"),");}}
	      else if (i == 12 ) {out.print("NCHAR");String NCHARsize;NCHARsize = JOptionPane.showInputDialog("Enter the Column Size ");if(NCHARsize.isBlank()) {out.println(",");}else{out.println("("+NCHARsize+"),");}}
	      else if (i == 13 ) {out.print("CLOB");String CLOBsize;CLOBsize = JOptionPane.showInputDialog("Enter the Column Size ");if(CLOBsize.isBlank()) {out.println(",");}else{out.println("("+CLOBsize+"),");}}
	      else if (i == 14 ) {out.print("NCLOB");String NCLOBsize;NCLOBsize = JOptionPane.showInputDialog("Enter the Column Size ");if(NCLOBsize.isBlank()) {out.println(",");}else{out.println("("+NCLOBsize+"),");}}
	      else if (i == 15 ) {out.print("BLOB");String BLOBsize;BLOBsize = JOptionPane.showInputDialog("Enter the Column Size ");if(BLOBsize.isBlank()) {out.println(",");}else{out.println("("+BLOBsize+"),");}}
	      else if (i == 16 ) {out.print("BFILE");String BFILEsize;BFILEsize = JOptionPane.showInputDialog("Enter the Column Size ");if(BFILEsize.isBlank()) {out.println(",");}else{out.println("("+BFILEsize+"),");}}
	      else if (i == 17 ) {out.print("TIMESTAMP");String TIMESTAMPsize;TIMESTAMPsize = JOptionPane.showInputDialog("Enter the Column Size ");if(TIMESTAMPsize.isBlank()) {out.println(",");}else{out.println("("+TIMESTAMPsize+"),");}}
	      else if (i == 18 ) {out.print("TIMESTAMP WITH TIME ZONE");String TIMESTAMPWITHTIMEZONEsize;TIMESTAMPWITHTIMEZONEsize = JOptionPane.showInputDialog("Enter the Column Size ");if(TIMESTAMPWITHTIMEZONEsize.isBlank()) {out.println(",");}else{out.println("("+TIMESTAMPWITHTIMEZONEsize+"),");}}
	      else if (i == 19 ) {out.print("INTERVAL YEAR TO MONTH");String INTERVALYEARTOMONTHsize;INTERVALYEARTOMONTHsize = JOptionPane.showInputDialog("Enter the Column Size ");if(INTERVALYEARTOMONTHsize.isBlank()) {out.println(",");}else{out.println("("+INTERVALYEARTOMONTHsize+"),");}}
	      else if (i == 20 ) {out.print("INTERVAL DAY TO SECOND");String INTERVALDAYTOSECONDsize;INTERVALDAYTOSECONDsize = JOptionPane.showInputDialog("Enter the Column Size ");if(INTERVALDAYTOSECONDsize.isBlank()) {out.println(",");}else{out.println("("+INTERVALDAYTOSECONDsize+"),");}}
	      else if (i == 21 ) {out.print("UROWID ");String UROWIDsize;UROWIDsize = JOptionPane.showInputDialog("Enter the Column Size ");if(UROWIDsize.isBlank()) {out.println(",");}else{out.println("("+UROWIDsize+"),");}}
	      else if (i == 22 ) {out.print("TIMESTAMP WITH LOCAL TIMEZONE");String TIMESTAMPWITHLOCALTIMEZONEsize;TIMESTAMPWITHLOCALTIMEZONEsize = JOptionPane.showInputDialog("Enter the Column Size ");if(TIMESTAMPWITHLOCALTIMEZONEsize.isBlank()) {out.println(",");}else{out.println("("+TIMESTAMPWITHLOCALTIMEZONEsize+"),");}}


       }// END OF WHILE LOOP
	   out.print(")");   
	   //Close the file.
	   out.close();  // Step 4
		  
   }
   
}

//----------------------------------------


/*import java.io.PrintWriter; // Step 1
import java.io.FileNotFoundException;
import java.io.IOException;

import javax.swing.*;  
public class textfileoutput {  
JFrame f;  

textfileoutput() throws IOException {
    f=new JFrame();   
    String name=JOptionPane.showInputDialog(f,"Enter Name");     
    PrintWriter out = new PrintWriter("oceans.txt"); // Step 2
    out.println(name);
}  

public static void main(String[] args) throws IOException {  
    new textfileoutput();  
    
}  
}   
*/
/*public class FileWriteDemo
{
    public static void main(String[] args) throws IOException
    {
        // Open the file.
        PrintWriter out = new PrintWriter("oceans.txt"); // Step 2

        // Write the name of four oceans to the file
        out.println("Atlantic");   // Step 3
        out.println("Pacific");
        out.println("Indian");
        out.println("Arctic");

        // Close the file.
        out.close();  // Step 4
    }
}*/
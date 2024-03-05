
    import javax.swing.JOptionPane;

class Main {

    public static void main(String[] args) {
        //initialized variables
        int quotient = 0;
        int remainder = 0;
        int number1= 0;
        int number2= 0;
        //continues to loop if the user doesn't input the right number
        boolean bool = false;
        while(!bool)
        {
            try{
                String num = JOptionPane.showInputDialog("Please enter first integer");
                number1=Integer.parseInt(num);  
                bool = true;
            }
            //catches input exceptions
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null," Invalid input, please try again","Attention",JOptionPane.WARNING_MESSAGE); 
            }    
        }//end while
        //for input validation
        boolean valid= false;
        while(!valid)
        {
            try{
                String num = JOptionPane.showInputDialog("Please enter second integer");
                number2=Integer.parseInt(num);  
                //only takes positive denominator for second integer
                if (number2 > 0){
                    valid = true;
                    break; 
                }
                JOptionPane.showMessageDialog(null,"Invalid input", "Please enter a positive integer", JOptionPane.WARNING_MESSAGE);  
            }
            //catches input exceptions
            catch(NumberFormatException e){
                JOptionPane.showMessageDialog(null," Invalid input, please try again","Attention",JOptionPane.WARNING_MESSAGE); 
            }        
        }//end while

        //calculates quotient and remainder
        quotient=  number1/ number2;
        remainder =  number1 % number2;
        //puts remainder and quotient into string
        String toPrint="The quotient is: " + quotient+ "\nTHe remainder is: "+ remainder;
        //displays result
        JOptionPane.showMessageDialog( null,""+ toPrint,"Result", JOptionPane.INFORMATION_MESSAGE );

    }//end main

}//end Main
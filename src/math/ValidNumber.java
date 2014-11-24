package math;

public class ValidNumber {

	public boolean isDigit(char ch){
        return (ch >='0' && ch <='9')? true: false;
    }
    
    public boolean isNumber(String s) {
        // trim spaces and convert into array
        char[] ch = s.trim().toCharArray();
        
            
        for(int i=0; i<ch.length; i++){
            if(ch[i]=='-' && i!=0)
                return false;
            else if( (ch[i]=='e' || ch[i]=='.') && (i>0 && i<ch.length-1))
                if( !isDigit(ch[i-1]) || !isDigit(ch[i+1]) )
                    return false;
            else if(!isDigit(ch[i]))
                return false;
            
        }
        return true;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

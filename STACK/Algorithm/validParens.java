//Returns true if parentheses are valid, false otherwise.
     public boolean validParens( )
     {
         Stack<String>  s  =  new  Stack<String>( );   
      for (int i  = 0; i < expr.length( ); i++)
         {
              String  ch  =  expr.substring(i,  i +1);
              if (ch.equals(OPENER))
                  s.push(ch);
              else
                   if (ch.equals(ENDER))
                       if (s.empty( ))	//no matching opener
                           return false;
                       else
                            s.pop( );		//pop matching opener
         }
         return s.empty( );		//if false, too many openers
     }

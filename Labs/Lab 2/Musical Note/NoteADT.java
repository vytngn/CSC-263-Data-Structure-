/**VY NGUYEN 
 * CSC263-IN
 * LAB2 ADT - MUSICAL NOTE
 */


public interface NoteADT {

// setValue receives int value of a note as parameter,
// which sets the corresponding String value, key color & frequency
    public void setValue(int value);

// sets the string length of a note with the length parameter
    public void setStrLength(String length);

// sets the String of the note corresponding to the int value parameter
    public void setStrValue(int value);

// determines either black or white key from the int value parameter
    public void setKeyColor(int value);

// sets frequency of the note with the double val parameter
    public void setFrequency(double value);

}
/**VY NGUYEN 
 * CSC263-IN
 * LAB2 ADT - MUSICAL NOTE
 */
public class NoteDataStructureClass {
	
	private String length, keyColor, strValue;
	private int value;
	private double freq;
	private String [] note  = {"C","C#", "D", "D#", "E", "F",
			"F#", "G", "G#", "A", "A#", "B"	};
			

	//default constructor 
	// default value is set to middle C 
	//default length is quarter 
	public NoteDataStructureClass() {
		this.value = -9;
        this.length = "Quarter";
        this.keyColor = "white";
        setStrValue(-9);
        setValue(-9);
		
	}
	//overloaded constructor 
	public NoteDataStructureClass(String length, int value) {
		
		this.value = value;
        this.length = length;
        setStrValue(value);
        setValue(value);
	}
	

	
	//copy constructor 
	public NoteDataStructureClass(NoteDataStructureClass note) {
		this.strValue = note.strValue;
		this.length = note.length;
		this.value = note.value;
		this.keyColor = note.keyColor;
		this.freq = note.freq;
	}
	
	
	
	//set value - call setStrValue, setKeyColor, setFrequency
	public void setValue(int value) {
		setStrValue(value);
		setKeyColor(value);
		setFrequency(value);
		
	}
	
	public void setStrValue(int value) {
		switch(value) {
		case -9: this.strValue = note[0];break; //C
		case -8: this.strValue = note[1]; break; //C#
		case -7: this.strValue = note[2]; break;
		case -6: this.strValue = note[3];break;
		case -5: this.strValue = note[4]; break; 
		case -4: this.strValue = note[5]; break;
		case -3: this.strValue = note[6];break;
		case -2: this.strValue = note[7]; break; 
		case -1: this.strValue = note[8]; break;
		case 0: this.strValue = note[9];break;
		case 1: this.strValue= note[10]; break; 
		case 2: this.strValue = note[11]; break;//B
		default: System.out.println("Invalid value");
		}
	}
	//set length - call setStrLength 
	public void setLength(String length) {
		this.length = length;
	}
	
	//set key color
	public void setKeyColor(int value) {
		if (value == -9 || value == -7 || value == -5 || value == -4 ||
                value == -2 || value == 0 || value == 2)
        {
            this.keyColor = "white";
        }else
            this.keyColor = "black";
	}
	
	//set frequency
	public void setFrequency(double value) {
		this.freq = (440 / Math.pow(2, value/12));
	}

	//getter methods 
	//get string value - letter 
	public String getStrValue(int value) {
		return strValue;
	}
		
	//get value 
	public int getValue() {
		return value;
	}
	//get length 
	public String getStrLength() {
		return length;
	}
	
	//get key color 
	public String getKeyColor(){
		return keyColor;
	}
	
	//get frequency 
	// n = note number 
	public double getFrequency() {
		return freq;
	}
	//to string 
	@Override
    public String toString() {
        return String.format( strValue + "\n" + "Length: " + length + " note\n" + "Value: " +
                 value + "\n" + keyColor + "\n" + "%.1fHz", freq);
    }
}


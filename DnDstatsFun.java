import javax.swing.*;
import java.awt.*;
import java.awt.event.*; 

public class DnDstatsFun extends JFrame implements TextListener{
       
   private final int WINDOW_WIDTH = 300;  // Window width
   private final int WINDOW_HEIGHT = 800; // Window height
   private TextArea Name, Strength, Dexterity, Constitution, Intelligence, Wisdom, Charisma, result; 
   private String history = "";
   private String strength = "";
   private String dexterity = "";
   private String constitution = "";
   private String intelligence = "";
   private String wisdom = "";
   private String charisma = "";

public DnDstatsFun (){
   setTitle("Character Sheet");
   setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
   setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   setLayout(new GridLayout(8,2));
   
   Name = new TextArea("",1,200,TextArea.SCROLLBARS_NONE);
   Name.setPreferredSize(new Dimension(20,20));
   // make and add labels at the same time
   add(new JLabel("Character Name: "));
   // add the textbox
   add(Name);

    Strength = new TextArea("",1,10,TextArea.SCROLLBARS_NONE);
   // make and add labels at the same time
    add(new JLabel("Strength: "));
   // add the textbox
   add(Strength);
   
   Dexterity = new TextArea("",1,10,TextArea.SCROLLBARS_NONE);
   // make and add labels at the same time
   add(new JLabel("Dexterity: "));
   // add the textbox
   add(Dexterity);
   
   Constitution = new TextArea("",1,10,TextArea.SCROLLBARS_NONE);
   // make and add labels at the same time
   add(new JLabel("Consitution: "));
   // add the textbox
   add(Constitution);
   
   Intelligence = new TextArea("",1,10,TextArea.SCROLLBARS_NONE);
   // make and add labels at the same time
   add(new JLabel("Intelligence: "));
   // add the textbox
   add(Intelligence);
   
   Wisdom = new TextArea("",1,10,TextArea.SCROLLBARS_NONE);
   // make and add labels at the same time
   add(new JLabel("Wisdom: "));
   // add the textbox
   add(Wisdom);
   
  Charisma = new TextArea("",1,10,TextArea.SCROLLBARS_NONE);
   // make and add labels at the same time
   add(new JLabel("Charisma: "));
   // add the textbox
   add(Charisma);
   
      result = new TextArea("answer",1,300,TextArea.SCROLLBARS_NONE);
      result.setPreferredSize(new Dimension(200,500));
      result.setEditable(false); 
      add(result);
   
   Name.addTextListener(this);
  Strength.addTextListener(this);
   Dexterity.addTextListener(this);
   Constitution.addTextListener(this);
   Intelligence.addTextListener(this);
   Wisdom.addTextListener(this);
   Charisma.addTextListener(this);
   
   setVisible(true);
   

} //D&Dstats


   public void textValueChanged(TextEvent te){
      TextComponent source = (TextComponent)te.getSource(); 
      if(source == Name)
         history = source.getText();
         
      if (source == Strength)
         strength = source.getText();
         
      if (source == Dexterity)
         dexterity = source.getText();
         
     if (source == Constitution)
         constitution = source.getText();
         
      if (source == Intelligence)
         intelligence = source.getText();
         
      if (source == Wisdom)
         wisdom = source.getText();
         
      if (source == Charisma)
         charisma = source.getText();
         
      else{ // only other source is the catAge TextBox
         String output ="";
         if(!history.isEmpty())
            output = history + "'s stats are ";
            result.setText(output + "  Strength: "+strength+"  Dexterity: "+dexterity+"  Constitution: "+constitution+"  Intelligence: "+intelligence+"  Wisdom: "+wisdom+"  Charisma: "+charisma + ""); 
         }
         }

}//class

   class DnDdriverFun {		
   public static void main (String argv[]){
      DnDstats c1 = new DnDstats(); 
   } // main
   }//class


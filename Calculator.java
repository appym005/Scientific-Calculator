import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Calculator
{
    private static String s;
    private static JTextField tf1;
    private static JFrame f ;
    private static JButton b7;
    private static JButton b8;
    private static JButton b9;
    private static JButton b11;
    private static JButton b12;
    private static JButton b4;
    private static JButton b5;
    private static JButton b6;
    private static JButton b21;
    private static JButton b22;
    private static JButton b1;
    private static JButton b2;
    private static JButton b3;
    private static JButton b31;
    private static JButton b32;
    private static JButton b40;
    private static JButton b42;
    private static JButton b43;
  public static void main(String args[])
    {
        f= new JFrame("Calculator");
        f.setVisible(true);
        f.setSize(400,340);
        f.setLayout(null);
        tf1=new JTextField();
        f.add(tf1);
        tf1.setBounds(20,20,330,60);


        //First Row
        b7=new JButton("7");
        f.add(b7);
        b7.setBounds(20,90,50,30);
        b8=new JButton("8");
        f.add(b8);
        b8.setBounds(90,90,50,30);
        b9=new JButton("9");
        f.add(b9);
        b9.setBounds(160,90,50,30);
        b11=new JButton("/");
        f.add(b11);
        b11.setBounds(230,90,50,30);
        b12=new JButton("%");
        f.add(b12);
        b12.setBounds(300,90,50,30);

        //Second Row
        b4=new JButton("4");
        f.add(b4);
        b4.setBounds(20,140,50,30);
        b5=new JButton("5");
        f.add(b5);
        b5.setBounds(90,140,50,30);
        b6=new JButton("6");
        f.add(b6);
        b6.setBounds(160,140,50,30);
        b21=new JButton("*");
        f.add(b21);
        b21.setBounds(230,140,50,30);
        b22=new JButton("^");
        f.add(b22);
        b22.setBounds(300,140,50,30);

        //Third Row
        b1=new JButton("1");
        f.add(b1);
        b1.setBounds(20,190,50,30);
        b2=new JButton("2");
        f.add(b2);
        b2.setBounds(90,190,50,30);
        b3=new JButton("3");
        f.add(b3);
        b3.setBounds(160,190,50,30);
        b31=new JButton("-");
        f.add(b31);
        b31.setBounds(230,190,50,30);
        b32=new JButton("=");
        f.add(b32);
        b32.setBounds(300,190,50,80);

        //Fourth Row
        b40=new JButton("0");
        f.add(b40);
        b40.setBounds(20,240,120,30);
        b42=new JButton(".");
        f.add(b42);
        b42.setBounds(160,240,50,30);
        b43=new JButton("+");
        f.add(b43);
        b43.setBounds(230,240,50,30);

        tf1.addKeyListener(new CustomKeyListener());
        b7.addActionListener(new b7ActionListener());
        b8.addActionListener(new b8ActionListener());
        b9.addActionListener(new b9ActionListener());
        b11.addActionListener(new b11ActionListener());
        b12.addActionListener(new b12ActionListener());
        b4.addActionListener(new b4ActionListener());
        b5.addActionListener(new b5ActionListener());
        b6.addActionListener(new b6ActionListener());
        b21.addActionListener(new b21ActionListener());
        b22.addActionListener(new b22ActionListener());
        b3.addActionListener(new b3ActionListener());
        b2.addActionListener(new b2ActionListener());
        b1.addActionListener(new b1ActionListener());
        b31.addActionListener(new b31ActionListener());
        b32.addActionListener(new b32ActionListener());
        b40.addActionListener(new b40ActionListener());
        b42.addActionListener(new b42ActionListener());
        b43.addActionListener(new b43ActionListener());


     }
    static class CustomKeyListener implements KeyListener{
      public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
      if (!((c >= '0') && (c <= '9') ||
         (c == KeyEvent.VK_BACK_SPACE) ||
         (c == KeyEvent.VK_DELETE) )) {
      tf1.setText(s.substring(0, s.length() - 1));
       s= tf1.getText();
      }
     }

     public void keyPressed(KeyEvent e) {
        }


        public void keyReleased(KeyEvent e) {
           }
     }


     static class b7ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"7");
         s=tf1.getText();
       }
     }
     static class b8ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){

         tf1.setText(tf1.getText()+"8");
         s=tf1.getText();
       }
     }
     static class b9ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"9");
         s=tf1.getText();
       }
     }
     static class b11ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"/");
         s=tf1.getText();
       }
     }
     static class b12ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"%");
         s=tf1.getText();
       }
     }
     static class b4ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"4");
         s=tf1.getText();
       }
     }
     static class b5ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"5");
         s=tf1.getText();
       }
     }
     static class b6ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"6");
         s=tf1.getText();
       }
     }
     static class b21ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"*");
         s=tf1.getText();
       }
     }
     static class b22ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"^");
         s=tf1.getText();
       }
     }
     static class b1ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){

         tf1.setText(tf1.getText()+"1");
         s=tf1.getText();
       }
     }
     static class b2ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"2");
         s=tf1.getText();
       }
     }
     static class b3ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"3");
         s=tf1.getText();
       }
     }
     static class b31ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"-");
         s=tf1.getText();
       }
     }
     static class b32ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(solve(tf1.getText()));
         s=tf1.getText();
       }
     }
     static class b40ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"0");
         s=tf1.getText();
       }
     }
     static class b42ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+".");
         s=tf1.getText();
       }
     }
     static class b43ActionListener implements ActionListener{
       public void actionPerformed(ActionEvent e){
         tf1.setText(tf1.getText()+"+");
         s=tf1.getText();
       }
     }
     public static String solve(String input)
     {

         Stack<Integer> op  = new Stack<Integer>();
         Stack<Double> val = new Stack<Double>();
         Stack<Integer> optmp  = new Stack<Integer>();
         Stack<Double> valtmp = new Stack<Double>();
         input = "0" + input;
         input = input.replaceAll("-","+-");
         String temp = "";
         for (int i = 0;i < input.length();i++)
         {
             char ch = input.charAt(i);
             if (ch == '-')
                 temp = "-" + temp;
             else if (ch != '+' &&  ch != '*' && ch != '/' && ch != '^' && ch != '%')
                temp = temp + ch;
             else
             {
                 val.push(Double.parseDouble(temp));
                 op.push((int)ch);
                 temp = "";
             }
         }
         val.push(Double.parseDouble(temp));
         char operators[] = {'^','/','%','*','+'};
         for (int i = 0; i < 5; i++)
         {
             boolean it = false;
             while (!op.isEmpty())
             {
                 int optr = op.pop();
                 double v1 = val.pop();
                 double v2 = val.pop();
                 if (optr == operators[i])
                 {
                     if (i == 0)
                     {
                         valtmp.push(Math.pow(v2,v1));
                         it = true;
                         break;
                     }
                     else if (i == 1)
                     {
                         valtmp.push(v2/v1);
                         it = true;
                         break;
                     }
                     else if (i == 2)
                     {
                         valtmp.push(v2%v1);
                         it = true;
                         break;
                     }
                     else if (i == 3)
                     {
                         valtmp.push(v2 * v1);
                         it = true;
                         break;
                     }
                     else if (i == 4)
                     {
                         valtmp.push(v2 + v1);
                         it = true;
                         break;
                     }
                 }
                 else
                 {
                     valtmp.push(v1);
                     val.push(v2);
                     optmp.push(optr);
                 }
             }
             while (!valtmp.isEmpty())
                 val.push(valtmp.pop());
             while (!optmp.isEmpty())
                 op.push(optmp.pop());
             if (it)
                 i--;
         }
         return Double.toString(val.pop());
     }
}

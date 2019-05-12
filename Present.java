import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class Present extends JFrame
{
    

   public Present()
   {
       screen();
       button();
       setSize(1280,1024);
   }
   
   public void screen(){
       setSize(1280,1024);
       
       setDefaultCloseOperation(EXIT_ON_CLOSE);
       setVisible(true);
       setLayout(new BorderLayout());
       setContentPane(new JLabel(new ImageIcon("images/Ziegel4.jpg")));
       //setLayout(new FlowLayout());
       setLayout(null);
       
       setSize(1280,1024);
   }
   
   public void MenuOben(){
       
         JMenuBar menuBar;
        JMenu menu, submenu;
        JMenuItem menuItem;
        JRadioButtonMenuItem rbMenuItem;
        JCheckBoxMenuItem cbMenuItem;

        //Create the menu bar.
        menuBar = new JMenuBar();
        
        ImageIcon icon0 = createImageIcon("images/mute-16.gif");
        ImageIcon icon1 = createImageIcon("images/volume-up-2-16.gif");

        //Build the first menu.
        menu = new JMenu("A Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription(
                "The only menu in this program that has menu items");
        menuBar.add(menu);

        //a group of radio button menu items
        menu.addSeparator();
        ButtonGroup group = new ButtonGroup();

        rbMenuItem = new JRadioButtonMenuItem("Sound off", icon0);
        rbMenuItem.setSelected(true);
        rbMenuItem.setMnemonic(KeyEvent.VK_R);
        group.add(rbMenuItem);
        
        menu.add(rbMenuItem);

        rbMenuItem = new JRadioButtonMenuItem("Sound on", icon1);
        rbMenuItem.setMnemonic(KeyEvent.VK_O);
        group.add(rbMenuItem);
        
        menu.add(rbMenuItem);
        
        setJMenuBar(menuBar);
   }
   
    protected static ImageIcon createImageIcon(String path) {
        java.net.URL imgURL = Present.class.getResource(path);
        if (imgURL != null) {
            return new ImageIcon(imgURL);
        } else {
            System.err.println("Couldn't find file: " + path);
            return null;
        }
    
   }
    
   public void button(){
       JButton b1 = new JButton();
       b1.setEnabled(true);
       b1.setVisible(true);
            
            
       add(b1);
            
       b1.addActionListener(new ActionListener(){
           public void actionPerformed(ActionEvent e){
               dispose();
            }
       });
   }
   
   public static void main(String args[])
   {
        new Present();
   }
}

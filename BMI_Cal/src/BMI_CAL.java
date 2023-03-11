import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class BMI_CAL extends JFrame {
        private JLabel lbl1;
        private JComboBox cmbType;
        private JLabel lblweight;
        private JTextField txtweight;
        private JLabel lbl3;
        private JTextField txtheight;
        private JButton btnCal;
        private JButton btnClr;
        private JLabel lbl4;
        private JLabel lbl5;
        private JLabel lblfinalbmi;
        private JPanel pnlBMI;

        double bmival = 0;
    double bmikg = 0;
    double bmim = 0;
        public BMI_CAL(){
         add(pnlBMI);
         setVisible(true);
         setTitle("BMI Calculator");
         setDefaultCloseOperation(EXIT_ON_CLOSE);
         setSize(650,500);


            btnCal.addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    super.mouseClicked(e);
                    if(cmbType.getModel().getSelectedItem()=="KG/m"){
                        kgandm();
                    }else {

                            poundsandinch();
                    }
                }
            });
        }
      public void kgandm(){
          bmim = Double.parseDouble(txtheight.getText());
              bmikg = Double.parseDouble(txtweight.getText());
              bmival = bmikg / (bmim * bmim);
              System.out.println(bmival);
              String finalbmi = String.valueOf(bmival);
          lblfinalbmi.setText(finalbmi);
            }

        public void poundsandinch(){
                bmim = Double.parseDouble(txtheight.getText());
                bmikg = Double.parseDouble(txtweight.getText());
                bmival = bmikg*703 / (bmim * bmim);
                System.out.println(bmival);
                String finalbmi = String.valueOf(bmival);
                lblfinalbmi.setText(finalbmi);
            }



    public static void main(String[] args) {
        BMI_CAL bmical= new BMI_CAL();
    }

}

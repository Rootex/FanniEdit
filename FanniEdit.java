import java.util.Arrays;

/**
 *
 * @author PlaixHax0r
 */
public class FanniEdit extends javax.swing.JFrame {

    /**
     * Creates new form FanniEdit
     */
    public FanniEdit() {
        initComponents();
        this.setTitle("FanniEdit");
    }

    /**
     *Initialize form components
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ScrollPane = new javax.swing.JScrollPane();
        TextArea = new javax.swing.JTextArea();
        SortInts = new javax.swing.JButton();
        SortStrings = new javax.swing.JButton();
        Status = new javax.swing.JLabel();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TextArea.setColumns(20);
        TextArea.setRows(5);
        ScrollPane.setViewportView(TextArea);
        TextArea.setLineWrap(true);

        org.jdesktop.layout.GroupLayout jPanel1Layout = new org.jdesktop.layout.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(ScrollPane)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(ScrollPane, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 222, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(24, 24, 24))
        );

        SortInts.setText("Sort Numbers");
        SortInts.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortIntsActionPerformed(evt);
            }
        });

        SortStrings.setText("Sort Words");
        SortStrings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SortStringsActionPerformed(evt);
            }
        });

        Status.setText("Status:");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setJMenuBar(jMenuBar2);

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, jPanel1, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                                .add(SortStrings)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 145, Short.MAX_VALUE)
                                .add(SortInts))))
                    .add(layout.createSequentialGroup()
                        .add(12, 12, 12)
                        .add(Status, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(org.jdesktop.layout.GroupLayout.TRAILING, layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(SortInts)
                    .add(layout.createSequentialGroup()
                        .addContainerGap()
                        .add(SortStrings)))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(jPanel1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 231, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED, 7, Short.MAX_VALUE)
                .add(Status)
                .addContainerGap())
        );

        pack();
    }                  

    private void SortIntsActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try{
           
            String strr = TextArea.getText();
            strr=strr.replaceAll("(\\r|\\n)", " ");    
            String[] str = strr.trim().split(" ");
            
            int length = str.length;
            
        
            int[] array = new int[length];
        
            for(int i=0; i<length; i++){
            //if (str[i].trim().length() !=0 ) {
                  array[i] = Integer.parseInt(str[i]);
            //}
           
            }
            Arrays.sort(array);
        /*
        int temp;  	
	for(int i=0; i < length; i++){
		for(int j=0; j < length;j++){
			if(array[i] < array[j]){
				temp = array[i];
				array[i] = array[j];
				array[j] = temp;
			}	
		}
	}
        String string = "";
        for (int i = 0; i < array.length;i++){
            string+=" "+Integer.toString(array[i]);
        
        }
        
        */
        StringBuilder str2 = new StringBuilder();
        for(int i=0; i < length; i++) {
            str2.append(array[i]).append(" ");
        }
        
        TextArea.setText(str2.toString().trim());
        Status.setText("Status: "+length+" numbers Sorted");
        
        //Status.setText("Status: "+length+" Numbers Sorted");
        //TextArea.setText(string);
        
        }catch(NumberFormatException x){
            Status.setText("Only numbers: Eliminate double spaces or characters");
        }
    }                                        

    private void SortStringsActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // Handling code
        String str = TextArea.getText();
        str = str.replaceAll("(\\r|\\n)", " ");		
	String[] words = str.split(" ");
        Arrays.sort(words);
       
        int length = words.length;
	/*String temp; 
	for(int i=0; i<length; i++){
		for(int j=0; j < length;j++){
			if(words[i].compareToIgnoreCase(words[j]) == 0 ){}
			else if (words[i].compareToIgnoreCase(words[j]) < 0){	
                                temp = words[i].trim();
				words[i] = words[j].trim();
				words[j] = temp;
			}else{}	
		}
	}
        /*
	String str2="";
	for (int i=0; i < length-1; i++) {
            str2+=words[i]+" ";
        }
        */
              
        StringBuilder str2 = new StringBuilder();
        for(int i=0; i < length; i++) {
            str2.append(words[i]).append(" ");
        }
        
        TextArea.setText(str2.toString().trim());
        Status.setText("Status: "+length+" Words Sorted");
    }                                           

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FanniEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FanniEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FanniEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FanniEdit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FanniEdit().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify                     
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JButton SortInts;
    private javax.swing.JButton SortStrings;
    private javax.swing.JLabel Status;
    private javax.swing.JTextArea TextArea;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration                   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package longpipes;

/**
 *
 * @author Michael B
 */
import java.util.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.math.*;

/**
 *
 * @author up806925
 */
public class PipeInterface extends javax.swing.JFrame {

    ArrayList<Pipe> pipeBasket = new ArrayList<Pipe>();

    /**
     * Creates new form PipeInterface
     */
    public PipeInterface() {
        initComponents();
        // create basketArrayList 

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        basketArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        totalPriceBox = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        completeOrderButton = new javax.swing.JButton();
        clearBasketButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        lengthInputBox = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        widthInputBox = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        pipeColDropDown = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        plasticGradeDropDown = new javax.swing.JComboBox<>();
        jLabel14 = new javax.swing.JLabel();
        innerInsuCheckBox = new javax.swing.JCheckBox();
        jLabel15 = new javax.swing.JLabel();
        ReinforcementInputBox = new javax.swing.JCheckBox();
        jLabel16 = new javax.swing.JLabel();
        chemResInputBox = new javax.swing.JCheckBox();
        clearSectionButton = new javax.swing.JButton();
        calcButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        pipeCostArea = new javax.swing.JTextArea();
        jLabel17 = new javax.swing.JLabel();
        QuantityBox = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("LongPipes Ordering System");
        setResizable(false);

        basketArea.setEditable(false);
        basketArea.setColumns(20);
        basketArea.setFont(new java.awt.Font("Tahoma", 2, 14)); // NOI18N
        basketArea.setRows(5);
        basketArea.setText("Basket:");
        basketArea.setToolTipText("The basket area displays the pipes you have specified");
        jScrollPane1.setViewportView(basketArea);

        jScrollPane2.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane2.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        totalPriceBox.setEditable(false);
        totalPriceBox.setColumns(20);
        totalPriceBox.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        totalPriceBox.setRows(5);
        jScrollPane2.setViewportView(totalPriceBox);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("TOTAL:");

        completeOrderButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        completeOrderButton.setText("Complete Order");
        completeOrderButton.setToolTipText("Click to order your pipes");
        completeOrderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        completeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completeOrderButtonActionPerformed(evt);
            }
        });

        clearBasketButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        clearBasketButton.setText("Clear Basket");
        clearBasketButton.setToolTipText("Clears the basket");
        clearBasketButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearBasketButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBasketButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Pipe Configuration");

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel10.setText("Length (metres)");

        lengthInputBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lengthInputBox.setToolTipText("Enter length of pipe in metres");
        lengthInputBox.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                lengthInputBoxKeyReleased(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel11.setText("Width (inches)");

        widthInputBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        widthInputBox.setToolTipText("Enter the width of the pipe in inches (Outer Diameter)");

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel12.setText("Pipe Colours");

        pipeColDropDown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        pipeColDropDown.setMaximumRowCount(3);
        pipeColDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No Colour", "1", "2" }));
        pipeColDropDown.setToolTipText("Select pipe colours");

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("Plastic Grade");

        plasticGradeDropDown.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        plasticGradeDropDown.setMaximumRowCount(5);
        plasticGradeDropDown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));
        plasticGradeDropDown.setToolTipText("Select Plastic Grade");

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel14.setText("Inner Insulation");

        innerInsuCheckBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        innerInsuCheckBox.setToolTipText("Tick the box for insulation");

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel15.setText("Reinforcement");

        ReinforcementInputBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        ReinforcementInputBox.setToolTipText("Tick the box for outer reinforcement");

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel16.setText("Chemical Resistance");

        chemResInputBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        chemResInputBox.setToolTipText("Tick the box for chemical resistance");

        clearSectionButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        clearSectionButton.setText("Clear Selection");
        clearSectionButton.setToolTipText("Click to clear pipe data");
        clearSectionButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clearSectionButton.setMinimumSize(new java.awt.Dimension(73, 30));
        clearSectionButton.setPreferredSize(new java.awt.Dimension(73, 30));
        clearSectionButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearSectionButtonActionPerformed(evt);
            }
        });

        calcButton.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        calcButton.setText("Add to Basket");
        calcButton.setToolTipText("Click to calculate cost of individual pipe");
        calcButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        calcButton.setMinimumSize(new java.awt.Dimension(73, 30));
        calcButton.setPreferredSize(new java.awt.Dimension(73, 30));
        calcButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calcButtonActionPerformed(evt);
            }
        });

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        pipeCostArea.setEditable(false);
        pipeCostArea.setColumns(20);
        pipeCostArea.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        pipeCostArea.setRows(5);
        pipeCostArea.setText(" Cost Displayed Here");
        pipeCostArea.setToolTipText("Cost of pipe is displayed here");
        pipeCostArea.setName(""); // NOI18N
        jScrollPane3.setViewportView(pipeCostArea);
        pipeCostArea.getAccessibleContext().setAccessibleName("");

        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel17.setText("Quantity");

        QuantityBox.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        QuantityBox.setModel(new javax.swing.SpinnerNumberModel(1, 0, null, 1));
        QuantityBox.setToolTipText("Enter quantity of pipes to order");
        QuantityBox.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                QuantityBoxStateChanged(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 2, 12)); // NOI18N
        jLabel18.setText("<html>1 Color - 12% Extra | 2 Colours - 16% Extra | Inner Insulation - 13% Extra<br>Outer Reinforcement - 17% Extra | Chemical Resistance - 14% Extra</html>\n");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel10)
                                            .addGap(18, 18, 18)
                                            .addComponent(lengthInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel11)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(widthInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12)
                                            .addComponent(jLabel17))
                                        .addGap(42, 42, 42)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(plasticGradeDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(pipeColDropDown, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(QuantityBox, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(112, 112, 112)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel14)
                                            .addComponent(jLabel15)
                                            .addComponent(jLabel16))
                                        .addGap(55, 55, 55)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(innerInsuCheckBox)
                                            .addComponent(ReinforcementInputBox)
                                            .addComponent(chemResInputBox)))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(calcButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(clearSectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 515, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                    .addComponent(completeOrderButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(clearBasketButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jLabel9)))
                .addContainerGap(35, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel9)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(lengthInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(widthInputBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(37, 37, 37)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(plasticGradeDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(pipeColDropDown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel17)
                            .addComponent(QuantityBox))
                        .addGap(50, 50, 50))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(innerInsuCheckBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ReinforcementInputBox)
                            .addComponent(jLabel15))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel16)
                            .addComponent(chemResInputBox))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(calcButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(clearSectionButton, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(75, 75, 75)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addComponent(clearBasketButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(completeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void calcButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_calcButtonActionPerformed
        ArrayList<String> errorList = new ArrayList<>();
        try {
            
            // check the values in the boxes if cant be parsed catch exception
            float newPipeLen = Float.parseFloat(lengthInputBox.getText());
            float newPipeWidth = newPipeWidth = Float.parseFloat(widthInputBox.getText());
            int newPipePlastic = newPipePlastic = Integer.parseInt(plasticGradeDropDown.getSelectedItem().toString());

            Boolean pipeInsu = innerInsuCheckBox.isSelected();
            Boolean pipeRein = ReinforcementInputBox.isSelected();
            Boolean pipeRes = chemResInputBox.isSelected();

            boolean isValid = false;
            // if len or width invalid give error message
            if (newPipeLen <= 6 && newPipeLen > 0 && newPipeWidth > 0) {
                String s = plasticGradeDropDown.getSelectedItem().toString();
                int selItem = Integer.parseInt(s);
                if ((selItem < 4) && (selItem > 0)) {
                    if (pipeColDropDown.getSelectedItem() == "No Colour") {
                        
                        // validate that pipe does not have reinenforcment or insulation
                        if ((innerInsuCheckBox.isSelected() == false) && (ReinforcementInputBox.isSelected() == false)) {

                            PipeI newPipe = new PipeI(newPipePlastic, (double) newPipeLen, (double) newPipeWidth, pipeRes);
                            pipeCostArea.setText("£" + roundAndString(newPipe.calculateCost()));
                            //adds the correct quantity of pipes to the basket
                            for(int i=0; i<(Integer)QuantityBox.getValue(); i++) {
                                pipeBasket.add(newPipe);
                            }
                            isValid = true;
                            //displays pipe details on a new line in the basket
                            basketArea.setText(basketArea.getText() + "\nLength: " + roundAndString(newPipe.getLength())
                            + "m |  Width: " + roundAndString(newPipe.getOuterDiameter()) + "in |  Grade: " +
                            plasticGradeDropDown.getSelectedItem() + " |  Price: £" + roundAndString(newPipe.calculateCost()) +
                                    " |  Quantity: "+ QuantityBox.getValue());
                        }
                        
                        
                        // give reason for invalid pipe
                        if((innerInsuCheckBox.isSelected() == true)){
                            errorList.add("\nPipe cannot have inner insulation with this plastic grade and less then 2 colours");
                        }
                        if((ReinforcementInputBox.isSelected() == true)){
                            errorList.add("\nPipe cannot have outer reinforcement with this plastic grade and less then 2 colours");
                        }
                    }
                    else if(newPipePlastic == 1){
                       errorList.add("\nPipe cannot have colour with this plastic grade");
                    }
                    
                }
                // if grade is 2-4
                if ((selItem > 1) && (selItem < 5)) {
                    if (pipeColDropDown.getSelectedItem() == "1") {
                        if ((innerInsuCheckBox.isSelected() == false) && (ReinforcementInputBox.isSelected() == false)) {
                            PipeII newPipe = new PipeII(newPipePlastic, (double) newPipeLen, (double) newPipeWidth, pipeRes);
                            pipeCostArea.setText("£" + roundAndString(newPipe.calculateCost()));
                            //adds the correct quantity of pipes to the basket
                            for(int i=0; i<(Integer)QuantityBox.getValue(); i++) {
                                pipeBasket.add(newPipe);
                            }
                            isValid = true;
                            //displays pipe details on a new line in the basket
                            basketArea.setText(basketArea.getText() + "\nLength: " + roundAndString(newPipe.getLength())
                            + "m |  Width: " + roundAndString(newPipe.getOuterDiameter()) + "in |  Grade: " +
                            plasticGradeDropDown.getSelectedItem() + " |  Price: £" + roundAndString(newPipe.calculateCost()) +
                                    " |  Quantity: "+ QuantityBox.getValue());
                        }
                        if((ReinforcementInputBox.isSelected() == true)){
                            errorList.add("\nPipe with 1 colour cannot have outer reinforcement");
                        }
                        if((innerInsuCheckBox.isSelected() == true)){
                            errorList.add("\nPipe with 1 colour cannot have inner insulation");
                        }
                    }
                }
               
                if ((selItem > 1) && (selItem < 6) && pipeRein == false ) {
                    if (pipeColDropDown.getSelectedItem() == "2"){
                        if ((innerInsuCheckBox.isSelected() == false) && (ReinforcementInputBox.isSelected() == false)) {
                            //pipe type 3
                            PipeIII newPipe = new PipeIII(newPipePlastic, (double) newPipeLen, (double) newPipeWidth, pipeRes);
                            pipeCostArea.setText("£" + roundAndString(newPipe.calculateCost()));
                            //adds the correct quantity of pipes to the basket
                            for(int i=0; i<(Integer)QuantityBox.getValue(); i++) {
                                pipeBasket.add(newPipe);
                            }                            
                            isValid = true;
                            //displays pipe details on a new line in the basket
                            basketArea.setText(basketArea.getText() + "\nLength: " + roundAndString(newPipe.getLength())
                            + "m |  Width: " + roundAndString(newPipe.getOuterDiameter()) + "in |  Grade: " +
                            plasticGradeDropDown.getSelectedItem() + " |  Price: £" + roundAndString(newPipe.calculateCost()) +
                                    " |  Quantity: "+ QuantityBox.getValue());
                        } else if ((innerInsuCheckBox.isSelected() == true) && (ReinforcementInputBox.isSelected() == false)) {
                            //pipe type 4
                            PipeIV newPipe = new PipeIV(newPipePlastic, (double) newPipeLen, (double) newPipeWidth, pipeRes, pipeInsu);
                            pipeCostArea.setText("£" + roundAndString(newPipe.calculateCost()));
                            //adds the correct quantity of pipes to the basket
                            for(int i=0; i<(Integer)QuantityBox.getValue(); i++) {
                                pipeBasket.add(newPipe);
                            }
                            isValid = true;
                            //displays pipe details on a new line in the basket
                            basketArea.setText(basketArea.getText() + "\nLength: " + roundAndString(newPipe.getLength())
                            + "m |  Width: " + roundAndString(newPipe.getOuterDiameter()) + "in |  Grade: " +
                            plasticGradeDropDown.getSelectedItem() + " |  Price: £" + roundAndString(newPipe.calculateCost()) +
                                    " |  Quantity: "+ QuantityBox.getValue());
                        }
                    }
                }else if(ReinforcementInputBox.isSelected() == true){
                    errorList.add("\nPipe must have plastic grade of at least 3 and have inner insulation to have outer reinforcement. ");
                }
                if ((selItem > 2) && (selItem < 6)) {
                    if (pipeColDropDown.getSelectedItem() == "2") {
                        if ((innerInsuCheckBox.isSelected() == true) && (ReinforcementInputBox.isSelected() == true)) {
                            //pipe type 5

                            PipeV newPipe = new PipeV(newPipePlastic, (double) newPipeLen, (double) newPipeWidth, pipeRes, pipeInsu, pipeRein);
                            pipeCostArea.setText("£" + roundAndString(newPipe.calculateCost()));
                            //adds the correct quantity of pipes to the basket
                            for(int i=0; i<(Integer)QuantityBox.getValue(); i++) {
                                pipeBasket.add(newPipe);
                            }
                            isValid = true;
                            //displays pipe details on a new line in the basket
                            basketArea.setText(basketArea.getText() + "\nLength: " + roundAndString(newPipe.getLength())
                            + "m |  Width: " + roundAndString(newPipe.getOuterDiameter()) + "in |  Grade: " +
                            plasticGradeDropDown.getSelectedItem() + " |  Price: £" + roundAndString(newPipe.calculateCost()) +
                                    " |  Quantity: "+ QuantityBox.getValue());
                        }
                    }else if(pipeColDropDown.getSelectedItem() == "No Colour" && selItem == 4 ) {
                        errorList.add("\nPipe must have at least 1 colour with this plastic grade");
                    }else if(selItem == 5 ){
                        errorList.add("\nPipe must have 2 colours with this plastic grade");
                    }
                }

                if (isValid == false) {
                    String allErrors = "";
                    for(String error:errorList){
                        allErrors += error + ", ";
                    }
                    JOptionPane.showMessageDialog(new JFrame(), "Invalid Pipe: " + allErrors);
                }
                //enter calculate cost function

                // int newPipeCol = Integer.parseInt( pipeColDropDown.getSelectedItem().toString());
                int newPipeCol = 0;
                if (pipeColDropDown.getSelectedItem().toString() != "No Colour") {
                    newPipeCol = Integer.parseInt(pipeColDropDown.getSelectedItem().toString());
                }

            } else if(newPipeLen > 6) {
                JOptionPane.showMessageDialog(new JFrame(), "Invalid Pipe: Pipe cannot be longer than 6m ");
            }
            else if(newPipeWidth <= 0){
                JOptionPane.showMessageDialog(new JFrame(), "Invalid Pipe: Pipe cannot have width less than or equal to 0 ");
            }
            else{
                JOptionPane.showMessageDialog(new JFrame(), "Invalid Pipe: Pipe cannot be 0m or less than 0m");
            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(new JFrame(), "Invalid pipe: Please enter a number ");
        }
        double total = 0;
        for(Pipe pipe:pipeBasket){
            total += pipe.calculateCost() ;
        }
        totalPriceBox.setText("£" + roundAndString(total));

    }//GEN-LAST:event_calcButtonActionPerformed

    private void QuantityBoxStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_QuantityBoxStateChanged
        if ((Integer) QuantityBox.getValue() < 1) {
            QuantityBox.setValue(1);
        }
    }//GEN-LAST:event_QuantityBoxStateChanged

    private void lengthInputBoxKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_lengthInputBoxKeyReleased


    }//GEN-LAST:event_lengthInputBoxKeyReleased

    private void completeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completeOrderButtonActionPerformed
        // goes through basket and adds all 
        double total = 0;
        for (Pipe pipe : pipeBasket) {
            total += pipe.calculateCost();
        }
        totalPriceBox.setText("£" + roundAndString(total));
    }//GEN-LAST:event_completeOrderButtonActionPerformed

    private void clearBasketButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBasketButtonActionPerformed
        // empties the basket and set box to empty
        basketArea.setText("");
        pipeBasket.clear();
        totalPriceBox.setText("");
    }//GEN-LAST:event_clearBasketButtonActionPerformed

    private void clearSectionButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearSectionButtonActionPerformed
        pipeCostArea.setText("");
        lengthInputBox.setText("");
        widthInputBox.setText("");
        innerInsuCheckBox.setSelected(false);
        ReinforcementInputBox.setSelected(false);
        chemResInputBox.setSelected(false);
        pipeColDropDown.setSelectedItem("No Colour");
        plasticGradeDropDown.setSelectedItem("1");
        QuantityBox.setValue(1);
    }//GEN-LAST:event_clearSectionButtonActionPerformed

    private String roundAndString(double num) {
        // rounds a number to 2 DP and returns it as a string
        return String.valueOf(Math.round(num * 100.0) / 100.0);

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PipeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PipeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PipeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PipeInterface.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PipeInterface().setVisible(true);
            }
        });

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner QuantityBox;
    private javax.swing.JCheckBox ReinforcementInputBox;
    private javax.swing.JTextArea basketArea;
    private javax.swing.JButton calcButton;
    private javax.swing.JCheckBox chemResInputBox;
    private javax.swing.JButton clearBasketButton;
    private javax.swing.JButton clearSectionButton;
    private javax.swing.JButton completeOrderButton;
    private javax.swing.JCheckBox innerInsuCheckBox;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField lengthInputBox;
    private javax.swing.JComboBox<String> pipeColDropDown;
    private javax.swing.JTextArea pipeCostArea;
    private javax.swing.JComboBox<String> plasticGradeDropDown;
    private javax.swing.JTextArea totalPriceBox;
    private javax.swing.JTextField widthInputBox;
    // End of variables declaration//GEN-END:variables
}

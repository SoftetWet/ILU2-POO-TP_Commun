/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package presentation;

import com.github.lgooddatepicker.optionalusertools.DateChangeListener;
import com.github.lgooddatepicker.zinternaltools.DateChangeEvent;
import dialog.DialogReservation;
import java.time.LocalDate;


@SuppressWarnings("serial")
public class FrameReservation extends javax.swing.JFrame {

    private DialogReservation dialog;

    public FrameReservation() {
    }

    public void initFrame() {
        initComponents();
        messageValider.show(false);
        selectionPersonne.setSelectedIndex(-1);
    }

    public void setDialog(DialogReservation dialog) {
        this.dialog = dialog;
    }

    // /!\ /!\ /!\ ATTENTION /!\ /!\ /!\
    // ce code est auto généré et ne doit PAS être modifié
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        messageValider = new javax.swing.JOptionPane();
        dateTimePanel = new javax.swing.JPanel();
        selectionDate = new com.github.lgooddatepicker.components.DatePicker();
        selectionDate.addDateChangeListener(new DateChangeListener(){
            public void dateChanged(DateChangeEvent dateEvent) {
                datePickerDateChanged(dateEvent);
            }
        });
        texteDate = new javax.swing.JLabel();
        texteHeure = new javax.swing.JLabel();
        selectionHeure = new javax.swing.JComboBox<>();
        nbPersonsPanel = new javax.swing.JPanel();
        textePersonne = new javax.swing.JLabel();
        selectionPersonne = new javax.swing.JComboBox<>();
        pickTablePanel = new javax.swing.JPanel();
        tablesImage = new javax.swing.JLabel();
        texteTable = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        selectionTable = new javax.swing.JList<>();
        bouttonValider = new javax.swing.JButton();
        bouttonAnnuler = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        dateTimePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        texteDate.setText("1. Choisissez la date");
        texteDate.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        texteHeure.setText("2. Choisissez l'heure");
        texteHeure.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        selectionHeure.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "11H30", "12H00", "12H30", "13H00", "13H30" }));
        selectionHeure.setSelectedIndex(-1);
        selectionHeure.setEnabled(false);
        selectionHeure.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionHeureActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout dateTimePanelLayout = new javax.swing.GroupLayout(dateTimePanel);
        dateTimePanel.setLayout(dateTimePanelLayout);
        dateTimePanelLayout.setHorizontalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texteDate)
                    .addComponent(selectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(texteHeure, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(selectionHeure, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(99, 99, 99))
        );
        dateTimePanelLayout.setVerticalGroup(
            dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dateTimePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(texteDate)
                    .addComponent(texteHeure))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(dateTimePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(selectionDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectionHeure, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );

        selectionDate.getAccessibleContext().setAccessibleName("");
        selectionDate.getAccessibleContext().setAccessibleDescription("");

        nbPersonsPanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        textePersonne.setText("3. Indiquez le nombre de personnes");
        textePersonne.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        selectionPersonne.setModel(new javax.swing.DefaultComboBoxModel<>(new Integer[] { 2, 3, 4, 5, 6, 7, 8 }));
        selectionPersonne.setEnabled(false);
        selectionPersonne.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectionPersonneActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nbPersonsPanelLayout = new javax.swing.GroupLayout(nbPersonsPanel);
        nbPersonsPanel.setLayout(nbPersonsPanelLayout);
        nbPersonsPanelLayout.setHorizontalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectionPersonne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textePersonne))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        nbPersonsPanelLayout.setVerticalGroup(
            nbPersonsPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nbPersonsPanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(textePersonne)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(selectionPersonne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(108, Short.MAX_VALUE))
        );

        pickTablePanel.setBorder(javax.swing.BorderFactory.createLineBorder(null));

        tablesImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Plan_tables.jpg"))); // NOI18N

        texteTable.setText("4. Choisissez votre table");
        texteTable.setFont(new java.awt.Font("Dubai", 1, 14)); // NOI18N

        selectionTable.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        selectionTable.setEnabled(false);
        selectionTable.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                selectionTableValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(selectionTable);

        javax.swing.GroupLayout pickTablePanelLayout = new javax.swing.GroupLayout(pickTablePanel);
        pickTablePanel.setLayout(pickTablePanelLayout);
        pickTablePanelLayout.setHorizontalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(texteTable)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(tablesImage, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        pickTablePanelLayout.setVerticalGroup(
            pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pickTablePanelLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(texteTable)
                .addGap(14, 14, 14)
                .addGroup(pickTablePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tablesImage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pickTablePanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        bouttonValider.setText("Valider");
        bouttonValider.setEnabled(false);
        bouttonValider.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonValiderActionPerformed(evt);
            }
        });

        bouttonAnnuler.setText("Annuler");
        bouttonAnnuler.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bouttonAnnulerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dateTimePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nbPersonsPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pickTablePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(bouttonValider)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bouttonAnnuler)
                        .addGap(6, 6, 6)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(114, 114, 114)
                    .addComponent(messageValider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(115, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(dateTimePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nbPersonsPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pickTablePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bouttonValider)
                    .addComponent(bouttonAnnuler))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(322, 322, 322)
                    .addComponent(messageValider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(323, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectionPersonneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionPersonneActionPerformed
        if(selectionPersonne.getSelectedIndex() != -1){
            selectionTable.setEnabled(true);
            dialog.handleNumOfPersonsSelectedEvent(selectionPersonne.getItemAt(selectionPersonne.getSelectedIndex()));
            int nbPersonne = selectionPersonne.getItemAt(selectionPersonne.getSelectedIndex());
            selectionTable.setListData(dialog.trouvertabledisponible(nbPersonne));
        } else {
            selectionTable.setEnabled(false);
        }
    }//GEN-LAST:event_selectionPersonneActionPerformed

    private void selectionHeureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectionHeureActionPerformed
        if(selectionHeure.getSelectedIndex() != -1){
            selectionPersonne.setEnabled(true);
            dialog.handleTimeSelectedEvent(selectionHeure.getItemAt(selectionHeure.getSelectedIndex()));
        } else {
            selectionPersonne.setEnabled(false);
        }
    }//GEN-LAST:event_selectionHeureActionPerformed

    private void bouttonAnnulerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonAnnulerActionPerformed
        vider();
    }//GEN-LAST:event_bouttonAnnulerActionPerformed

    private void selectionTableValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_selectionTableValueChanged
        if(selectionTable.isSelectionEmpty()){
            bouttonValider.setEnabled(false);
        }else {
            bouttonValider.setEnabled(true);
        }
    }//GEN-LAST:event_selectionTableValueChanged

    private void bouttonValiderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bouttonValiderActionPerformed
        if (!selectionTable.isSelectionEmpty()) {
            dialog.handleTableSelectedEvent(Integer.parseInt(selectionTable.getSelectedValue().replace("Table ", "")));
            dialog.handleValidationEvent();
        }
    }//GEN-LAST:event_bouttonValiderActionPerformed

    public void datePickerDateChanged(DateChangeEvent dateEvent) {
        LocalDate maintenant = LocalDate.now();
        if(selectionDate.getDate()!= null){
            if(maintenant.toEpochDay() >= selectionDate.getDate().toEpochDay()){
                vider();
                dialog.handleErreurDate();
            }else{
                selectionHeure.setEnabled(true);
                dialog.handleDateSelectedEvent(selectionDate.getDate());
            }
        } else{
            vider();
        }
    }
    
    
    //Comme le nom l'indique sers a vider les componsant et mettre les informations a null
    private void vider(){
        selectionHeure.setEnabled(false);
        selectionPersonne.setEnabled(false);
        selectionTable.setEnabled(false);
        selectionPersonne.setSelectedIndex(-1);
        selectionHeure.setSelectedIndex(-1);
        selectionTable.clearSelection();
        selectionTable.setListData(new String[]{});
        selectionDate.clear();
        dialog.handleCancelEvent();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bouttonAnnuler;
    private javax.swing.JButton bouttonValider;
    private javax.swing.JPanel dateTimePanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JOptionPane messageValider;
    private javax.swing.JPanel nbPersonsPanel;
    private javax.swing.JPanel pickTablePanel;
    private com.github.lgooddatepicker.components.DatePicker selectionDate;
    private javax.swing.JComboBox<String> selectionHeure;
    private javax.swing.JComboBox<Integer> selectionPersonne;
    private javax.swing.JList<String> selectionTable;
    private javax.swing.JLabel tablesImage;
    private javax.swing.JLabel texteDate;
    private javax.swing.JLabel texteHeure;
    private javax.swing.JLabel textePersonne;
    private javax.swing.JLabel texteTable;
    // End of variables declaration//GEN-END:variables

}

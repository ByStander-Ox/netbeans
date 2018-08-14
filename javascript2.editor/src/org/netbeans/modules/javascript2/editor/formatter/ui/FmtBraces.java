/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.javascript2.editor.formatter.ui;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.netbeans.modules.javascript2.lexer.api.JsTokenId;
import org.netbeans.modules.options.editor.spi.PreferencesCustomizer;
import static org.netbeans.modules.javascript2.editor.formatter.FmtOptions.*;
import static org.netbeans.modules.javascript2.editor.formatter.FmtOptions.CategorySupport.OPTION_ID;
import org.netbeans.modules.javascript2.editor.formatter.Utils;



/**
 *
 * @author  phrebejk
 * @author  rsvitanic
 */
public class FmtBraces extends javax.swing.JPanel {

    private static final Logger LOGGER = Logger.getLogger(FmtBraces.class.getName());

    public FmtBraces() {
        initComponents();
        functionDeclCombo.putClientProperty(OPTION_ID, functionDeclBracePlacement);
        classDeclCombo.putClientProperty(OPTION_ID, classDeclBracePlacement);
        ifCombo.putClientProperty(OPTION_ID, ifBracePlacement);
        forCombo.putClientProperty(OPTION_ID, forBracePlacement);
        switchCombo.putClientProperty(OPTION_ID, switchBracePlacement);
        whileCombo.putClientProperty(OPTION_ID, whileBracePlacement);
        catchCombo.putClientProperty(OPTION_ID, catchBracePlacement);
        withCombo.putClientProperty(OPTION_ID, withBracePlacement);
        objectContinuationCheckbox.putClientProperty(OPTION_ID, objectLiteralContinuation);
    }

    public static PreferencesCustomizer.Factory getController() {
        String preview = "";
        try {
            preview = Utils.loadPreviewText(FmtBraces.class.getClassLoader().getResourceAsStream("org/netbeans/modules/javascript2/editor/formatter/ui/Braces.js"));
        } catch (IOException ex) {
            LOGGER.log(Level.WARNING, null, ex);
        }
        return new CategorySupport.Factory(JsTokenId.JAVASCRIPT_MIME_TYPE, "braces", FmtBraces.class, //NOI18N
                preview);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bracesPlacementLabel = new javax.swing.JLabel();
        functionDeclLabel = new javax.swing.JLabel();
        functionDeclCombo = new javax.swing.JComboBox();
        jSeparator1 = new javax.swing.JSeparator();
        ifCombo = new javax.swing.JComboBox();
        forCombo = new javax.swing.JComboBox();
        whileCombo = new javax.swing.JComboBox();
        switchCombo = new javax.swing.JComboBox();
        catchCombo = new javax.swing.JComboBox();
        ifLabel = new javax.swing.JLabel();
        forLabel = new javax.swing.JLabel();
        whileLabel = new javax.swing.JLabel();
        switchLabel = new javax.swing.JLabel();
        catchLabel = new javax.swing.JLabel();
        withLabel = new javax.swing.JLabel();
        withCombo = new javax.swing.JComboBox();
        jSeparator2 = new javax.swing.JSeparator();
        objectContinuationCheckbox = new javax.swing.JCheckBox();
        classDeclCombo = new javax.swing.JComboBox();
        classDeclLabel = new javax.swing.JLabel();

        setName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "LBL_Braces")); // NOI18N
        setOpaque(false);

        bracesPlacementLabel.setLabelFor(bracesPlacementLabel);
        org.openide.awt.Mnemonics.setLocalizedText(bracesPlacementLabel, org.openide.util.NbBundle.getMessage(FmtBraces.class, "LBL_bp_bracesPlacement")); // NOI18N

        functionDeclLabel.setLabelFor(functionDeclCombo);
        org.openide.awt.Mnemonics.setLocalizedText(functionDeclLabel, org.openide.util.NbBundle.getMessage(FmtBraces.class, "LBL_bp_ClassDecl")); // NOI18N

        functionDeclCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        functionDeclCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                functionDeclComboActionPerformed(evt);
            }
        });

        ifCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        forCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        whileCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        switchCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        catchCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        ifLabel.setLabelFor(ifCombo);
        org.openide.awt.Mnemonics.setLocalizedText(ifLabel, org.openide.util.NbBundle.getMessage(FmtBraces.class, "LBL_bp_If")); // NOI18N

        forLabel.setLabelFor(forCombo);
        org.openide.awt.Mnemonics.setLocalizedText(forLabel, org.openide.util.NbBundle.getMessage(FmtBraces.class, "LBL_bp_FOR")); // NOI18N

        whileLabel.setLabelFor(whileCombo);
        org.openide.awt.Mnemonics.setLocalizedText(whileLabel, org.openide.util.NbBundle.getMessage(FmtBraces.class, "LBL_bp_WHILE")); // NOI18N

        switchLabel.setLabelFor(switchCombo);
        org.openide.awt.Mnemonics.setLocalizedText(switchLabel, org.openide.util.NbBundle.getMessage(FmtBraces.class, "LBL_bp_SWITCH")); // NOI18N

        catchLabel.setLabelFor(catchCombo);
        org.openide.awt.Mnemonics.setLocalizedText(catchLabel, org.openide.util.NbBundle.getMessage(FmtBraces.class, "LBL_bp_catch")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(withLabel, org.openide.util.NbBundle.getMessage(FmtBraces.class, "LBL_bp_With")); // NOI18N

        withCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        org.openide.awt.Mnemonics.setLocalizedText(objectContinuationCheckbox, org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.objectContinuationCheckbox.text")); // NOI18N

        classDeclCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        classDeclLabel.setLabelFor(classDeclCombo);
        org.openide.awt.Mnemonics.setLocalizedText(classDeclLabel, org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.classDeclLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bracesPlacementLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(forLabel)
                                    .addComponent(ifLabel)
                                    .addComponent(whileLabel)
                                    .addComponent(switchLabel)
                                    .addComponent(catchLabel))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 79, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(catchCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(switchCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(whileCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(forCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ifCombo, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(withLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(withCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(functionDeclLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(functionDeclCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jSeparator2)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(classDeclLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(classDeclCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(objectContinuationCheckbox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bracesPlacementLabel)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(functionDeclLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(functionDeclCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(classDeclCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(classDeclLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ifCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ifLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(forCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(forLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(whileCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(whileLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(switchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(switchLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(catchCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(catchLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(withCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(withLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(objectContinuationCheckbox)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        bracesPlacementLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.bracesPlacementLabel.AccessibleContext.accessibleName")); // NOI18N
        bracesPlacementLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.bracesPlacementLabel.AccessibleContext.accessibleDescription")); // NOI18N
        functionDeclLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.functionDeclLabel.AccessibleContext.accessibleName")); // NOI18N
        functionDeclLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.functionDeclLabel.AccessibleContext.accessibleDescription")); // NOI18N
        functionDeclCombo.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.functionDeclCombo.AccessibleContext.accessibleName")); // NOI18N
        functionDeclCombo.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.functionDeclCombo.AccessibleContext.accessibleDescription")); // NOI18N
        jSeparator1.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.jSeparator1.AccessibleContext.accessibleName")); // NOI18N
        jSeparator1.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.jSeparator1.AccessibleContext.accessibleDescription")); // NOI18N
        ifCombo.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.ifCombo.AccessibleContext.accessibleName")); // NOI18N
        ifCombo.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.ifCombo.AccessibleContext.accessibleDescription")); // NOI18N
        forCombo.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.forCombo.AccessibleContext.accessibleName")); // NOI18N
        forCombo.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.forCombo.AccessibleContext.accessibleDescription")); // NOI18N
        whileCombo.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.whileCombo.AccessibleContext.accessibleName")); // NOI18N
        whileCombo.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.whileCombo.AccessibleContext.accessibleDescription")); // NOI18N
        switchCombo.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.switchCombo.AccessibleContext.accessibleName")); // NOI18N
        switchCombo.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.switchCombo.AccessibleContext.accessibleDescription")); // NOI18N
        catchCombo.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.catchCombo.AccessibleContext.accessibleName")); // NOI18N
        catchCombo.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.catchCombo.AccessibleContext.accessibleDescription")); // NOI18N
        ifLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.ifLabel.AccessibleContext.accessibleName")); // NOI18N
        ifLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.ifLabel.AccessibleContext.accessibleDescription")); // NOI18N
        forLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.forLabel.AccessibleContext.accessibleName")); // NOI18N
        forLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.forLabel.AccessibleContext.accessibleDescription")); // NOI18N
        whileLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.whileLabel.AccessibleContext.accessibleName")); // NOI18N
        whileLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.whileLabel.AccessibleContext.accessibleDescription")); // NOI18N
        switchLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.switchLabel.AccessibleContext.accessibleName")); // NOI18N
        switchLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.switchLabel.AccessibleContext.accessibleDescription")); // NOI18N
        catchLabel.getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.catchLabel.AccessibleContext.accessibleName")); // NOI18N
        catchLabel.getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.catchLabel.AccessibleContext.accessibleDescription")); // NOI18N

        getAccessibleContext().setAccessibleName(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.AccessibleContext.accessibleName")); // NOI18N
        getAccessibleContext().setAccessibleDescription(org.openide.util.NbBundle.getMessage(FmtBraces.class, "FmtBraces.AccessibleContext.accessibleDescription")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void functionDeclComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_functionDeclComboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_functionDeclComboActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bracesPlacementLabel;
    private javax.swing.JComboBox catchCombo;
    private javax.swing.JLabel catchLabel;
    private javax.swing.JComboBox classDeclCombo;
    private javax.swing.JLabel classDeclLabel;
    private javax.swing.JComboBox forCombo;
    private javax.swing.JLabel forLabel;
    private javax.swing.JComboBox functionDeclCombo;
    private javax.swing.JLabel functionDeclLabel;
    private javax.swing.JComboBox ifCombo;
    private javax.swing.JLabel ifLabel;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JCheckBox objectContinuationCheckbox;
    private javax.swing.JComboBox switchCombo;
    private javax.swing.JLabel switchLabel;
    private javax.swing.JComboBox whileCombo;
    private javax.swing.JLabel whileLabel;
    private javax.swing.JComboBox withCombo;
    private javax.swing.JLabel withLabel;
    // End of variables declaration//GEN-END:variables

}
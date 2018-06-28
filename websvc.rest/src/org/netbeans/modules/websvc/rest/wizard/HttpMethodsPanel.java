/*
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS HEADER.
 *
 * Copyright 1997-2010 Oracle and/or its affiliates. All rights reserved.
 *
 * Oracle and Java are registered trademarks of Oracle and/or its affiliates.
 * Other names may be trademarks of their respective owners.
 *
 * The contents of this file are subject to the terms of either the GNU
 * General Public License Version 2 only ("GPL") or the Common
 * Development and Distribution License("CDDL") (collectively, the
 * "License"). You may not use this file except in compliance with the
 * License. You can obtain a copy of the License at
 * http://www.netbeans.org/cddl-gplv2.html
 * or nbbuild/licenses/CDDL-GPL-2-CP. See the License for the
 * specific language governing permissions and limitations under the
 * License.  When distributing the software, include this License Header
 * Notice in each file and include the License file at
 * nbbuild/licenses/CDDL-GPL-2-CP.  Oracle designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the GPL Version 2 section of the License file that
 * accompanied this code. If applicable, add the following below the
 * License Header, with the fields enclosed by brackets [] replaced by
 * your own identifying information:
 * "Portions Copyrighted [year] [name of copyright owner]"
 *
 * Contributor(s):
 * The Original Software is NetBeans. The Initial Developer of the Original
 * Software is Sun Microsystems, Inc. Portions Copyright 1997-2006 Sun
 * Microsystems, Inc. All Rights Reserved.
 *
 * If you wish your version of this file to be governed by only the CDDL
 * or only the GPL Version 2, indicate your decision by adding
 * "[Contributor] elects to include this software in this distribution
 * under the [CDDL or GPL Version 2] license." If you do not indicate a
 * single choice of license, a recipient has the option to distribute
 * your version of this file under either the CDDL, the GPL Version 2 or
 * to extend the choice of license to its licensees as provided above.
 * However, if you add GPL Version 2 code and therefore, elected the GPL
 * Version 2 license, then the option applies only if the new code is
 * made subject to such option by the copyright holder.
 */
package org.netbeans.modules.websvc.rest.wizard;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.swing.JCheckBox;

/**
 *
 * @author ads
 */
public class HttpMethodsPanel extends javax.swing.JPanel {
    
    static enum HttpMethods {
        GET,
        HEAD, 
        POST,
        PUT,
        DELETE,
        OPTIONS
    }

    /**
     * Creates new form HttpMethodsPanel
     */
    public HttpMethodsPanel( Collection<HttpMethods> selectedMethods ) {
        initComponents();
        
        methods = new LinkedHashMap<HttpMethodsPanel.HttpMethods, JCheckBox>();
        methods.put( HttpMethods.GET , get );
        methods.put( HttpMethods.HEAD , head );
        methods.put( HttpMethods.POST , post );
        methods.put( HttpMethods.PUT , put );
        methods.put( HttpMethods.DELETE , delete );
        methods.put( HttpMethods.OPTIONS , options );
        for( HttpMethods method : selectedMethods ){
            methods.get(method).setSelected( true );
        }
    }
    
    List<HttpMethods> getSelectedMethods(){
        List<HttpMethods> result = new ArrayList<HttpMethods>(HttpMethods.values().length);
        for( Entry<HttpMethods,JCheckBox> entry : methods.entrySet()){
            HttpMethods method = entry.getKey();
            JCheckBox checkBox = entry.getValue();
            if ( checkBox.isSelected() ){
                result.add( method );
            }
        }
        return result;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        get = new javax.swing.JCheckBox();
        head = new javax.swing.JCheckBox();
        post = new javax.swing.JCheckBox();
        put = new javax.swing.JCheckBox();
        delete = new javax.swing.JCheckBox();
        options = new javax.swing.JCheckBox();

        setBorder(javax.swing.BorderFactory.createTitledBorder(org.openide.util.NbBundle.getMessage(HttpMethodsPanel.class, "TTL_HttpMethods"))); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(get, org.openide.util.NbBundle.getMessage(HttpMethodsPanel.class, "LBL_GetMethod")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(head, org.openide.util.NbBundle.getMessage(HttpMethodsPanel.class, "LBL_Head")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(post, org.openide.util.NbBundle.getMessage(HttpMethodsPanel.class, "LBL_Post")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(put, org.openide.util.NbBundle.getMessage(HttpMethodsPanel.class, "LBL_Put")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(delete, org.openide.util.NbBundle.getMessage(HttpMethodsPanel.class, "LBL_Delete")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(options, org.openide.util.NbBundle.getMessage(HttpMethodsPanel.class, "LBL_Options")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(get)
                    .addComponent(head)
                    .addComponent(post)
                    .addComponent(put)
                    .addComponent(delete)
                    .addComponent(options))
                .addContainerGap(55, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(get)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(head)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(post)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(put)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(delete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(options))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox delete;
    private javax.swing.JCheckBox get;
    private javax.swing.JCheckBox head;
    private javax.swing.JCheckBox options;
    private javax.swing.JCheckBox post;
    private javax.swing.JCheckBox put;
    // End of variables declaration//GEN-END:variables
    
    private Map<HttpMethods, JCheckBox> methods;
}
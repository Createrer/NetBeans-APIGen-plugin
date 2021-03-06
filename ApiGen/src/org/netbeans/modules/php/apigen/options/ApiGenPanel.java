/*
 * The MIT license
 *
 * Copyright (c) 2010 Ondřej Brejla <ondrej@brejla.cz>
 *
 * Permission is hereby granted, free of charge, to any person
 * obtaining a copy of this software and associated documentation
 * files (the "Software"), to deal in the Software without
 * restriction, including without limitation the rights to use,
 * copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the
 * Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be
 * included in all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND,
 * EXPRESS OR IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES
 * OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND
 * NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING
 * FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package org.netbeans.modules.php.apigen.options;

import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;

public final class ApiGenPanel extends javax.swing.JPanel implements DocumentListener {

	private static final String APIGEN_FILE_NAME = "apigen.php"; // NOI18N

	private ImageIcon errorIcon = ImageUtilities.loadImageIcon("org/netbeans/modules/php/apigen/resources/error_icon.png", true); // NOI18N

	private final ApiGenOptionsPanelController controller;

	ApiGenPanel(ApiGenOptionsPanelController controller) {
		this.controller = controller;
		initComponents();
		apiGenPathTextField.getDocument().addDocumentListener(this);
		errorLabel.setText("");
		fileChooser.setCurrentDirectory(new File(ApiGenOptions.getPath()));
		fileChooser.setFileFilter(new FileFilter() {

			@Override
			public boolean accept(File f) {
				if (f.isDirectory() || f.getName().equals(APIGEN_FILE_NAME)) {
					return true;
				} else {
					return false;
				}
			}

			@Override
			public String getDescription() {
				return NbBundle.getMessage(ApiGenPanel.class, "LBL_ApiGenFileFilterDesc", APIGEN_FILE_NAME);
			}

		});
	}

	/** This method is called from within the constructor to
	 * initialize the form.
	 * WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fileChooser = new javax.swing.JFileChooser();
        apiGenDirLabel = new javax.swing.JLabel();
        apiGenPathTextField = new javax.swing.JTextField();
        browseButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        errorLabel = new javax.swing.JLabel();

        fileChooser.setDialogTitle(org.openide.util.NbBundle.getMessage(ApiGenPanel.class, "ApiGenPanel.fileChooser.dialogTitle")); // NOI18N
        fileChooser.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);

        org.openide.awt.Mnemonics.setLocalizedText(apiGenDirLabel, org.openide.util.NbBundle.getMessage(ApiGenPanel.class, "ApiGenPanel.apiGenDirLabel.text")); // NOI18N

        apiGenPathTextField.setText(org.openide.util.NbBundle.getMessage(ApiGenPanel.class, "ApiGenPanel.apiGenPathTextField.text")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(browseButton, org.openide.util.NbBundle.getMessage(ApiGenPanel.class, "ApiGenPanel.browseButton.text")); // NOI18N
        browseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browseButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("nb.errorForeground"));
        org.openide.awt.Mnemonics.setLocalizedText(errorLabel, org.openide.util.NbBundle.getMessage(ApiGenPanel.class, "ApiGenPanel.errorLabel.text")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.DEFAULT_SIZE, 534, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(apiGenDirLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(apiGenPathTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 384, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browseButton))
                    .addComponent(errorLabel))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(apiGenDirLabel)
                    .addComponent(apiGenPathTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browseButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorLabel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

	private void browseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browseButtonActionPerformed
		int result = fileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            apiGenPathTextField.setText(fileChooser.getSelectedFile().toString());
        }
	}//GEN-LAST:event_browseButtonActionPerformed

	void load() {
		apiGenPathTextField.setText(ApiGenOptions.getPath());
	}

	void store() {
		ApiGenOptions.setPath(apiGenPathTextField.getText());
	}

	@Override
	public void insertUpdate(DocumentEvent e) {
		controller.changed();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		controller.changed();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		controller.changed();
	}

	boolean valid() {
		File f = new File(apiGenPathTextField.getText());
		if ((f.exists() && f.getName().equals(APIGEN_FILE_NAME)) || f.getName().equals("")) {
			errorLabel.setIcon(null);
			errorLabel.setText("");

			return true;
		} else {
			errorLabel.setIcon(errorIcon);
			errorLabel.setText(NbBundle.getMessage(ApiGenPanel.class, "LBL_InvalidApiGenFile"));

			return false;
		}
	}
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel apiGenDirLabel;
    private javax.swing.JTextField apiGenPathTextField;
    private javax.swing.JButton browseButton;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JFileChooser fileChooser;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables

}

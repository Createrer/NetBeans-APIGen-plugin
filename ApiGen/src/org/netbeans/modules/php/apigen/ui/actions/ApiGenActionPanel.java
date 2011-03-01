/*
 *  The MIT License
 * 
 *  Copyright 2010 Ondřej Brejla <ondrej@brejla.cz>.
 * 
 *  Permission is hereby granted, free of charge, to any person obtaining a copy
 *  of this software and associated documentation files (the "Software"), to deal
 *  in the Software without restriction, including without limitation the rights
 *  to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 *  copies of the Software, and to permit persons to whom the Software is
 *  furnished to do so, subject to the following conditions:
 * 
 *  The above copyright notice and this permission notice shall be included in
 *  all copies or substantial portions of the Software.
 * 
 *  THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 *  IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 *  FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 *  AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 *  LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 *  OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 *  THE SOFTWARE.
 */

package org.netbeans.modules.php.apigen.ui.actions;

import java.io.File;
import java.util.prefs.PreferenceChangeEvent;
import java.util.prefs.PreferenceChangeListener;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.filechooser.FileFilter;
import org.netbeans.api.options.OptionsDisplayer;
import org.netbeans.modules.php.apigen.options.ApiGenPanel;
import org.openide.DialogDescriptor;
import org.openide.util.ImageUtilities;
import org.openide.util.NbBundle;
import org.openide.util.NbPreferences;

/**
 *
 * @author Ondřej Brejla <ondrej@brejla.cz>
 */
public class ApiGenActionPanel extends javax.swing.JPanel implements DocumentListener, PreferenceChangeListener {

	private static final String OUTPUT_CFG_FILE_TYPE = ".neon";

	private DialogDescriptor dd;

	private ImageIcon errorIcon = ImageUtilities.loadImageIcon("org/netbeans/modules/php/apigen/resources/error_icon.png", true);

    /** Creates new form ApiGenActionPanel */
    public ApiGenActionPanel() {
        initComponents();
		errorLabel.setText("");

		NbPreferences.forModule(ApiGenPanel.class).addPreferenceChangeListener(this);

		outputCfgFileChooser.setFileFilter(new FileFilter() {

			@Override
			public boolean accept(File f) {
				if (f.isDirectory() || f.getName().endsWith(OUTPUT_CFG_FILE_TYPE)) {
					return true;
				}

				return false;
			}

			@Override
			public String getDescription() {
				return NbBundle.getMessage(ApiGenActionPanel.class, "LBL_FileFilterDesc");
			}

		});
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        outputCfgFileChooser = new javax.swing.JFileChooser();
        sourceDirectoryFileChooser = new javax.swing.JFileChooser();
        targetDirectoryFileChooser = new javax.swing.JFileChooser();
        sourceDirectoryLabel = new javax.swing.JLabel();
        targetDirectoryLabel = new javax.swing.JLabel();
        outputCfgFileLabel = new javax.swing.JLabel();
        documentationTitleLabel = new javax.swing.JLabel();
        sourceDirectoryTextField = new javax.swing.JTextField();
        targetDirectoryTextField = new javax.swing.JTextField();
        outputCfgFileTextField = new javax.swing.JTextField();
        documentationTitleTextField = new javax.swing.JTextField();
        sourceDirectoryButton = new javax.swing.JButton();
        targetDirectoryButton = new javax.swing.JButton();
        outputCfgFileButton = new javax.swing.JButton();
        errorLabel = new javax.swing.JLabel();
        optionsLabel = new javax.swing.JLabel();

        outputCfgFileChooser.setDialogTitle(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.outputCfgFileChooser.dialogTitle")); // NOI18N
        outputCfgFileChooser.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);

        sourceDirectoryFileChooser.setDialogTitle(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.sourceDirectoryFileChooser.dialogTitle")); // NOI18N
        sourceDirectoryFileChooser.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);

        targetDirectoryFileChooser.setDialogTitle(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.targetDirectoryFileChooser.dialogTitle")); // NOI18N
        targetDirectoryFileChooser.setFileSelectionMode(javax.swing.JFileChooser.FILES_AND_DIRECTORIES);

        sourceDirectoryLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 11));
        sourceDirectoryLabel.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.sourceDirectoryLabel.text")); // NOI18N

        targetDirectoryLabel.setFont(new java.awt.Font("DejaVu Sans", 1, 11));
        targetDirectoryLabel.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.targetDirectoryLabel.text")); // NOI18N

        outputCfgFileLabel.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.outputCfgFileLabel.text")); // NOI18N

        documentationTitleLabel.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.documentationTitleLabel.text")); // NOI18N

        sourceDirectoryTextField.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.sourceDirectoryTextField.text")); // NOI18N

        targetDirectoryTextField.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.targetDirectoryTextField.text")); // NOI18N

        outputCfgFileTextField.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.outputCfgFileTextField.text")); // NOI18N

        documentationTitleTextField.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.documentationTitleTextField.text")); // NOI18N

        sourceDirectoryButton.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.sourceDirectoryButton.text")); // NOI18N
        sourceDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourceDirectoryButtonActionPerformed(evt);
            }
        });

        targetDirectoryButton.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.targetDirectoryButton.text")); // NOI18N
        targetDirectoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                targetDirectoryButtonActionPerformed(evt);
            }
        });

        outputCfgFileButton.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.outputCfgFileButton.text")); // NOI18N
        outputCfgFileButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                outputCfgFileButtonActionPerformed(evt);
            }
        });

        errorLabel.setForeground(javax.swing.UIManager.getDefaults().getColor("nb.errorForeground"));
        errorLabel.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.errorLabel.text")); // NOI18N

        optionsLabel.setForeground(java.awt.Color.blue);
        optionsLabel.setText(org.openide.util.NbBundle.getMessage(ApiGenActionPanel.class, "ApiGenActionPanel.optionsLabel.text")); // NOI18N
        optionsLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        optionsLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                optionsLabelMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(documentationTitleLabel)
                            .addComponent(outputCfgFileLabel)
                            .addComponent(sourceDirectoryLabel)
                            .addComponent(targetDirectoryLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(outputCfgFileTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(targetDirectoryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                                    .addComponent(sourceDirectoryTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sourceDirectoryButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(targetDirectoryButton, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(outputCfgFileButton, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addComponent(documentationTitleTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)))
                    .addComponent(errorLabel)
                    .addComponent(optionsLabel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sourceDirectoryLabel)
                    .addComponent(sourceDirectoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sourceDirectoryButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(targetDirectoryLabel)
                    .addComponent(targetDirectoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(targetDirectoryButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(outputCfgFileLabel)
                    .addComponent(outputCfgFileTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(outputCfgFileButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(documentationTitleLabel)
                    .addComponent(documentationTitleTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(optionsLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(errorLabel)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

	private void sourceDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourceDirectoryButtonActionPerformed
		int result = sourceDirectoryFileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            setSourceDirectory(sourceDirectoryFileChooser.getSelectedFile().toString());
        }
	}//GEN-LAST:event_sourceDirectoryButtonActionPerformed

	private void targetDirectoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_targetDirectoryButtonActionPerformed
		int result = targetDirectoryFileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            setTargetDirectory(targetDirectoryFileChooser.getSelectedFile().toString());
        }
	}//GEN-LAST:event_targetDirectoryButtonActionPerformed

	private void outputCfgFileButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_outputCfgFileButtonActionPerformed
		int result = outputCfgFileChooser.showOpenDialog(this);

        if (result == JFileChooser.APPROVE_OPTION) {
            setOutputCfgFile(outputCfgFileChooser.getSelectedFile().toString());
        }
	}//GEN-LAST:event_outputCfgFileButtonActionPerformed

	private void optionsLabelMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_optionsLabelMouseReleased
		OptionsDisplayer.getDefault().open(NbBundle.getMessage(ApiGenPanel.class, "MSG_OptionsPath"));
	}//GEN-LAST:event_optionsLabelMouseReleased

	public void setDocumentationTitle(String title) {
		documentationTitleTextField.setText(title);
	}

	public String getDocumentationTitle() {
		return documentationTitleTextField.getText();
	}

	public void setOutputCfgFile(String path) {
		outputCfgFileTextField.setText(path);
		outputCfgFileChooser.setCurrentDirectory(new File(path));
	}

	public String getOutputCfgFile() {
		return outputCfgFileTextField.getText();
	}

	public void setSourceDirectory(String path) {
		sourceDirectoryTextField.setText(path);
		sourceDirectoryFileChooser.setCurrentDirectory(new File(path));
	}

	public String getSourceDirectory() {
		return sourceDirectoryTextField.getText();
	}

	public void setTargetDirectory(String path) {
		targetDirectoryTextField.setText(path);
		targetDirectoryFileChooser.setCurrentDirectory(new File(path));
	}

	public String getTargetDirectory() {
		return targetDirectoryTextField.getText();
	}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel documentationTitleLabel;
    private javax.swing.JTextField documentationTitleTextField;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel optionsLabel;
    private javax.swing.JButton outputCfgFileButton;
    private javax.swing.JFileChooser outputCfgFileChooser;
    private javax.swing.JLabel outputCfgFileLabel;
    private javax.swing.JTextField outputCfgFileTextField;
    private javax.swing.JButton sourceDirectoryButton;
    private javax.swing.JFileChooser sourceDirectoryFileChooser;
    private javax.swing.JLabel sourceDirectoryLabel;
    private javax.swing.JTextField sourceDirectoryTextField;
    private javax.swing.JButton targetDirectoryButton;
    private javax.swing.JFileChooser targetDirectoryFileChooser;
    private javax.swing.JLabel targetDirectoryLabel;
    private javax.swing.JTextField targetDirectoryTextField;
    // End of variables declaration//GEN-END:variables

	public void setDialogDescriptor(DialogDescriptor dd) {
	   this.dd = dd;

	   sourceDirectoryTextField.getDocument().addDocumentListener(this);
	   targetDirectoryTextField.getDocument().addDocumentListener(this);
	   outputCfgFileTextField.getDocument().addDocumentListener(this);

	   doEnablement();
    }

	@Override
	public void insertUpdate(DocumentEvent e) {
		doEnablement();
	}

	@Override
	public void removeUpdate(DocumentEvent e) {
		doEnablement();
	}

	@Override
	public void changedUpdate(DocumentEvent e) {
		doEnablement();
	}

	@Override
	public void preferenceChange(PreferenceChangeEvent evt) {
		doEnablement();
	}

	private void doEnablement() {
		if (sourceDirectoryTextField.getText().isEmpty() || !(new File(sourceDirectoryTextField.getText()).isDirectory())) {
			dd.setValid(false);

			errorLabel.setIcon(errorIcon);
			errorLabel.setText(NbBundle.getMessage(ApiGenActionPanel.class, "LBL_InvalidSourceDirectory"));
		} else if (targetDirectoryTextField.getText().isEmpty() || !(new File(targetDirectoryTextField.getText()).isDirectory())) {
			dd.setValid(false);

			errorLabel.setIcon(errorIcon);
			errorLabel.setText(NbBundle.getMessage(ApiGenActionPanel.class, "LBL_InvalidTargetDirectory"));
		} else if ((!(new File(outputCfgFileTextField.getText()).exists()) || !outputCfgFileTextField.getText().endsWith(OUTPUT_CFG_FILE_TYPE)) && !outputCfgFileTextField.getText().isEmpty()) {
			dd.setValid(false);

			errorLabel.setIcon(errorIcon);
			errorLabel.setText(NbBundle.getMessage(ApiGenActionPanel.class, "LBL_InvalidConfigFile"));
		} else if (NbPreferences.forModule(ApiGenActionPanel.class).get(ApiGenPanel.APIGEN_PATH_OPTION_KEY, "").trim().isEmpty()) {
			dd.setValid(false);

			errorLabel.setIcon(errorIcon);
			errorLabel.setText(NbBundle.getMessage(ApiGenActionPanel.class, "LBL_MissingApiGenPath"));
		} else {
			dd.setValid(true);

			errorLabel.setIcon(null);
			errorLabel.setText("");
		}
	}

}
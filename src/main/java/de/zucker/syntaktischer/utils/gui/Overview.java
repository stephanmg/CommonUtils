/// package's name
package de.zucker.syntaktischer.utils.gui;

/// imports
import de.zucker.syntaktischer.utils.MemoryUtil;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractListModel;
import javax.swing.JFrame;

/**
 * @brief small GUI class to show memory statistics
 * @author stephanmg <stephan@syntaktischer-zucker.de>
 */
public class Overview extends JFrame {

	private final MemoryUpdateListModel memoryUpdateListModel = new MemoryUpdateListModel();
	private static final long serialVersionUID = 1L;
	private final long SLEEP_INTERVAL_IN_MS = 5000;
	private transient int toggleMemoryRefresh = 0;

	/**
	 * @brief init components
	 */
	public Overview() {
		initComponents();
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerated by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jButton2 = new javax.swing.JButton();
                jTextField1 = new javax.swing.JTextField();
                jCheckBox1 = new javax.swing.JCheckBox();
                jSeparator1 = new javax.swing.JSeparator();
                jCheckBox2 = new javax.swing.JCheckBox();
                jLabel1 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jList1 = new javax.swing.JList();
                jToggleButton1 = new javax.swing.JToggleButton();
                jButton3 = new javax.swing.JButton();
                menuBar = new javax.swing.JMenuBar();
                fileMenu = new javax.swing.JMenu();
                openMenuItem = new javax.swing.JMenuItem();
                saveMenuItem = new javax.swing.JMenuItem();
                saveAsMenuItem = new javax.swing.JMenuItem();
                exitMenuItem = new javax.swing.JMenuItem();
                editMenu = new javax.swing.JMenu();
                cutMenuItem = new javax.swing.JMenuItem();
                copyMenuItem = new javax.swing.JMenuItem();
                pasteMenuItem = new javax.swing.JMenuItem();
                deleteMenuItem = new javax.swing.JMenuItem();
                helpMenu = new javax.swing.JMenu();
                contentsMenuItem = new javax.swing.JMenuItem();
                aboutMenuItem = new javax.swing.JMenuItem();

                jButton2.setText("Cancel");

                jTextField1.setText("jTextField1");

                jCheckBox1.setText("jCheckBox1");

                jCheckBox2.setText("autorefresh");
                jCheckBox2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jCheckBox2ActionPerformed(evt);
                        }
                });

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Heap Memory overview:");

                jList1.setModel(memoryUpdateListModel);
                jList1.setModel(new javax.swing.AbstractListModel() {
                        String[] strings = { "Used", "Free", "Max", "Total" };
                        public int getSize() { return strings.length; }
                        public Object getElementAt(int i) { return strings[i]; }
                });
                jScrollPane1.setViewportView(jList1);

                jToggleButton1.setText("Toggle Refresh");
                jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jToggleButton1ActionPerformed(evt);
                        }
                });

                jButton3.setText("Refresh");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                fileMenu.setMnemonic('f');
                fileMenu.setText("File");

                openMenuItem.setMnemonic('o');
                openMenuItem.setText("Open");
                fileMenu.add(openMenuItem);

                saveMenuItem.setMnemonic('s');
                saveMenuItem.setText("Save");
                fileMenu.add(saveMenuItem);

                saveAsMenuItem.setMnemonic('a');
                saveAsMenuItem.setText("Save As ...");
                saveAsMenuItem.setDisplayedMnemonicIndex(5);
                fileMenu.add(saveAsMenuItem);

                exitMenuItem.setMnemonic('x');
                exitMenuItem.setText("Exit");
                exitMenuItem.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                exitMenuItemActionPerformed(evt);
                        }
                });
                fileMenu.add(exitMenuItem);

                menuBar.add(fileMenu);

                editMenu.setMnemonic('e');
                editMenu.setText("Edit");

                cutMenuItem.setMnemonic('t');
                cutMenuItem.setText("Cut");
                editMenu.add(cutMenuItem);

                copyMenuItem.setMnemonic('y');
                copyMenuItem.setText("Copy");
                editMenu.add(copyMenuItem);

                pasteMenuItem.setMnemonic('p');
                pasteMenuItem.setText("Paste");
                editMenu.add(pasteMenuItem);

                deleteMenuItem.setMnemonic('d');
                deleteMenuItem.setText("Delete");
                editMenu.add(deleteMenuItem);

                menuBar.add(editMenu);

                helpMenu.setMnemonic('h');
                helpMenu.setText("Help");

                contentsMenuItem.setMnemonic('c');
                contentsMenuItem.setText("Contents");
                helpMenu.add(contentsMenuItem);

                aboutMenuItem.setMnemonic('a');
                aboutMenuItem.setText("About");
                helpMenu.add(aboutMenuItem);

                menuBar.add(helpMenu);

                setJMenuBar(menuBar);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(14, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton3)
                                                .addGap(0, 16, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jToggleButton1))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(jButton3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jToggleButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

    private void exitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitMenuItemActionPerformed
	    System.exit(0);
    }//GEN-LAST:event_exitMenuItemActionPerformed

        private void jCheckBox2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBox2ActionPerformed
                // TODO add your handling code here:


        }//GEN-LAST:event_jCheckBox2ActionPerformed

	@SuppressWarnings({"SleepWhileInLoop", "unchecked"})
        private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
		toggleMemoryRefresh++;
		final boolean quit = (toggleMemoryRefresh % 2) == 0;

		if (!quit) {
			new Thread(
				new Runnable() {
					@Override
					public void run() {
						while (true) {
							try {
								Thread.sleep(SLEEP_INTERVAL_IN_MS);
								jList1.setModel(memoryUpdateListModel);
							} catch (InterruptedException ex) {
								Logger.getLogger(Overview.class.getName()).log(Level.SEVERE, null, ex);
							}

							if (quit) {
								toggleMemoryRefresh = 0;
								return;
							}

						}
					}
				}
			).start();
		}
        }//GEN-LAST:event_jToggleButton1ActionPerformed

	@SuppressWarnings("unchecked")
        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
		jList1.setModel(memoryUpdateListModel);
        }//GEN-LAST:event_jButton3ActionPerformed

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
			Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			Logger.getLogger(Overview.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		java.awt.EventQueue.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Overview().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JMenuItem aboutMenuItem;
        private javax.swing.JMenuItem contentsMenuItem;
        private javax.swing.JMenuItem copyMenuItem;
        private javax.swing.JMenuItem cutMenuItem;
        private javax.swing.JMenuItem deleteMenuItem;
        private javax.swing.JMenu editMenu;
        private javax.swing.JMenuItem exitMenuItem;
        private javax.swing.JMenu fileMenu;
        private javax.swing.JMenu helpMenu;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JCheckBox jCheckBox1;
        private javax.swing.JCheckBox jCheckBox2;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JList jList1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSeparator jSeparator1;
        private javax.swing.JTextField jTextField1;
        private javax.swing.JToggleButton jToggleButton1;
        private javax.swing.JMenuBar menuBar;
        private javax.swing.JMenuItem openMenuItem;
        private javax.swing.JMenuItem pasteMenuItem;
        private javax.swing.JMenuItem saveAsMenuItem;
        private javax.swing.JMenuItem saveMenuItem;
        // End of variables declaration//GEN-END:variables

	/**
	 * @brief list model for memory updates
	 */
	private final class MemoryUpdateListModel extends AbstractListModel<String> {

		private static final long serialVersionUID = 1L;
		final String[] strings = {"Used: ", "Free: ", "Max: ", "Total: "};

		/**
		 * @brief get list size
		 * @return
		 */
		@Override
		public int getSize() {
			return strings.length;
		}

		/**
		 * @brief get element at index i
		 * @param i
		 * @return
		 */
		@Override
		public String getElementAt(int i) {
			return get_element_at(i);
		}

		/**
		 * @brief get gelement at index i
		 * @param i
		 * @return
		 */
		private String get_element_at(int i) {
			if (i == 0) {
				return strings[0] + MemoryUtil.getUsedMemory() + "MiB";
			} else if (i == 1) {
				return strings[1] + MemoryUtil.getFreeMemory() + "MiB";
			} else if (i == 2) {
				return strings[2] + MemoryUtil.getMaxMemory() + "MiB";
			} else if (i == 3) {
				return strings[3] + MemoryUtil.getTotalMemory() + "MiB";
			} else {
				return "";
			}
		}
	}
}

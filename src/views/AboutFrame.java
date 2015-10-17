package views;

import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.SWT;

public class AboutFrame {

	protected Shell shell;

	/**
	 * Launch the application.
	 * @param args
	 */
	/*public static void main(String[] args) {
		try {
			AboutFrame window = new AboutFrame();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}*/

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell(SWT.CLOSE | SWT.MIN);
		shell.setSize(347, 168);
		shell.setText("关于");
		
		Label label = new Label(shell, SWT.CENTER);
		label.setBounds(-47, 10, 414, 17);
		label.setText("学生(排名按拼音排序)：");
		
		Label label_1 = new Label(shell, SWT.CENTER);
		label_1.setText("李嘉颖201330320112");
		label_1.setBounds(-47, 32, 414, 17);
		
		Label label_2 = new Label(shell, SWT.CENTER);
		label_2.setText("江宁子201330520407");
		label_2.setBounds(-47, 55, 414, 17);
		
		Label lblv = new Label(shell, SWT.CENTER);
		lblv.setBounds(21, 84, 300, 17);
		lblv.setText("@copynotright        版本号：v1.00");

	}
}

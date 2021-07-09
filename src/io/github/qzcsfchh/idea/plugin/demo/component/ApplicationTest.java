package io.github.qzcsfchh.idea.plugin.demo.component;

import com.intellij.openapi.ui.DialogWrapper;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * @see <a href='https://plugins.jetbrains.com/docs/intellij/dialog-wrapper.html?from=jetbrains.org'>dialog-wrapper</a>
 */
public class ApplicationTest extends DialogWrapper {
    protected ApplicationTest() {
        super(true);
        init();
        setTitle("ApplicationTest");
    }

    @Override
    protected @Nullable JComponent createCenterPanel() {
        // override this method to provide content view of the dialog
        JPanel panel = new JPanel(new BorderLayout());

        JLabel label = new JLabel("This is content, say something to your user.");
        label.setPreferredSize(new Dimension(100,100));

        panel.add(label, BorderLayout.CENTER);

        return panel;
    }


    @Override
    protected JComponent createSouthPanel() {
        // override this method to provide operate buttons at bottom of the dialog

        JPanel panel = new JPanel(new FlowLayout());

        JButton button = new JButton("click me");
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        panel.add(button);
        return panel;
    }
}

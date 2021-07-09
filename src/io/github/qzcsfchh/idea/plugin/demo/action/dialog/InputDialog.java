package io.github.qzcsfchh.idea.plugin.demo.dialog;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.actionSystem.PlatformDataKeys;
import com.intellij.openapi.project.Project;
import com.intellij.openapi.ui.Messages;
import org.jetbrains.annotations.Nullable;

public class InputDialog extends AnAction {

    @Override
    public void actionPerformed(AnActionEvent ev) {
        Project project = ev.getData(PlatformDataKeys.PROJECT);
        Messages.showInputDialog(
                project,
                "What's your name?",
                "Input your name",
                Messages.getQuestionIcon()
        );
    }
}

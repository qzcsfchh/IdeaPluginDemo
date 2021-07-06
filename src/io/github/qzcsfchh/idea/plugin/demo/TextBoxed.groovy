package io.github.qzcsfchh.idea.plugin.demo

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.actionSystem.PlatformDataKeys
import com.intellij.openapi.project.Project
import com.intellij.openapi.ui.Messages
import org.jetbrains.annotations.NotNull

class TextBoxed extends AnAction{
    @Override
    void actionPerformed(@NotNull AnActionEvent ev) {
        def project = ev.getData(PlatformDataKeys.PROJECT)
        Messages.showInputDialog(
                project,
                "What's your name?",
                "Input your name",
                Messages.getQuestionIcon()
        )
    }
}

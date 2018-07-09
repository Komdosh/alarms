package io.github.komdosh.alarms.actions;

import com.intellij.openapi.actionSystem.AnAction;
import com.intellij.openapi.actionSystem.AnActionEvent;
import com.intellij.openapi.components.ServiceManager;
import com.intellij.openapi.project.Project;
import io.github.komdosh.alarms.services.AlarmService;

import java.util.concurrent.TimeUnit;

public class Alarm20Min extends AnAction {

    public Alarm20Min() {
        super("Alarm20Min");
    }

    public void actionPerformed(AnActionEvent event) {
        Project p = event.getProject();

        AlarmService alarmService = ServiceManager.getService(AlarmService.class);
        alarmService.setAlertInSeconds(p, TimeUnit.SECONDS.toSeconds(10), "Minutes");
    }
}
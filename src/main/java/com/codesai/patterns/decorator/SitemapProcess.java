package com.codesai.patterns.decorator;

import java.util.Date;

public class SitemapProcess {

    private final User user;
    private final ProcessMonitor monitor;

    public SitemapProcess(User user, ProcessMonitor monitor) {
        this.user = user;
        this.monitor = monitor;
    }

    public void execute() {
        if (user.isAdmin) {
            monitor.beginAt(new Date());
            System.out.println("execute process and create sitemap...");
            monitor.finishSuccessfullyAt(new Date());
        }
    }

}

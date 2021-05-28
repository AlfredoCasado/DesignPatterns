package com.codesai.patterns.decorator;

import org.junit.jupiter.api.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

class SitemapProcessTest {

    final User admin = new User(true);
    final ProcessMonitor monitor = mock(ProcessMonitor.class);

    @Test public void
    only_admin_users_can_execute_process() {
        SitemapProcess process = createProcess(admin, monitor);
        process.execute();

        verify(monitor).beginAt(any());
    }

    @Test public void
    process_is_monitored() {
        SitemapProcess process = createProcess(admin, monitor);
        process.execute();

        verify(monitor).beginAt(any());
        verify(monitor).finishSuccessfullyAt(any());
    }

    private SitemapProcess createProcess(User admin, ProcessMonitor monitor) {
        return new SitemapProcess(admin, monitor);
    }
}
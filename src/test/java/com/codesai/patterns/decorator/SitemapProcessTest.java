package com.codesai.patterns.decorator;

import org.junit.jupiter.api.Test;

import static org.mockito.Matchers.any;
import static org.mockito.Mockito.*;

class ProcessTest {

    final User admin = new User(true);
    final User notAdmin = new User(false);
    final ProcessMonitor monitor = mock(ProcessMonitor.class);

    @Test public void
    only_admin_users_can_execute_process() {
        Process process = createProcess(admin, monitor);
        process.execute();

        verify(monitor).beginAt(any());
    }

    @Test public void
    no_admin_users_cannot_execute_process() {
        Process process = createProcess(notAdmin, monitor);
        process.execute();

        verify(monitor, never()).beginAt(any());
    }

    @Test public void
    process_is_monitored() {
        Process process = createProcess(admin, monitor);
        process.execute();

        verify(monitor).beginAt(any());
        verify(monitor).finishSuccessfullyAt(any());
    }

    private Process createProcess(User admin, ProcessMonitor monitor) {
        return new SitemapProcess(admin, monitor);
    }
}
package com.codesai.patterns.decorator;

import java.util.Date;

public interface ProcessMonitor {

    void beginAt(Date date);
    void finishSuccessfullyAt(Date date);
    void finishWithErrorAt(Date date, Exception e);

}

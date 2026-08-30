package defpackage;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ai  reason: default package */
/* loaded from: classes.dex */
public final class ai extends Handler {
    public static final ai a = new Handler();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = zh.a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            i = 5;
        } else if (logRecord.getLevel().intValue() == level.intValue()) {
            i = 4;
        } else {
            i = 3;
        }
        String message = logRecord.getMessage();
        message.getClass();
        zh.a(loggerName, i, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}

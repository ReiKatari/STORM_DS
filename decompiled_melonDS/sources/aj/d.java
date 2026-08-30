package aj;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public static final d f857a = new Handler();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        int i2;
        logRecord.getClass();
        CopyOnWriteArraySet copyOnWriteArraySet = c.f855a;
        String loggerName = logRecord.getLoggerName();
        loggerName.getClass();
        int intValue = logRecord.getLevel().intValue();
        Level level = Level.INFO;
        if (intValue > level.intValue()) {
            i2 = 5;
        } else if (logRecord.getLevel().intValue() == level.intValue()) {
            i2 = 4;
        } else {
            i2 = 3;
        }
        String message = logRecord.getMessage();
        message.getClass();
        c.a(loggerName, i2, message, logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}

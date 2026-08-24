package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mi  reason: default package */
/* loaded from: classes.dex */
public final class mi extends java.util.logging.Handler {
    public static final defpackage.mi a = null;

    static {
            mi r0 = new mi
            r0.<init>()
            defpackage.mi.a = r0
            return
    }

    @Override // java.util.logging.Handler
    public final void close() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public final void flush() {
            r0 = this;
            return
    }

    @Override // java.util.logging.Handler
    public final void publish(java.util.logging.LogRecord r4) {
            r3 = this;
            r4.getClass()
            java.util.concurrent.CopyOnWriteArraySet r3 = defpackage.li.a
            java.lang.String r3 = r4.getLoggerName()
            r3.getClass()
            java.util.logging.Level r0 = r4.getLevel()
            int r0 = r0.intValue()
            java.util.logging.Level r1 = java.util.logging.Level.INFO
            int r2 = r1.intValue()
            if (r0 <= r2) goto L1e
            r0 = 5
            goto L2f
        L1e:
            java.util.logging.Level r0 = r4.getLevel()
            int r0 = r0.intValue()
            int r1 = r1.intValue()
            if (r0 != r1) goto L2e
            r0 = 4
            goto L2f
        L2e:
            r0 = 3
        L2f:
            java.lang.String r1 = r4.getMessage()
            r1.getClass()
            java.lang.Throwable r4 = r4.getThrown()
            defpackage.li.a(r3, r0, r1, r4)
            return
    }
}

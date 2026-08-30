package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o  reason: default package */
/* loaded from: classes.dex */
public final class o extends CancellationException {
    public final transient Object A;

    public o(Object obj) {
        super("Flow was aborted, no more elements needed");
        this.A = obj;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}

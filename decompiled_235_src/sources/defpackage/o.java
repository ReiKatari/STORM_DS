package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
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

package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qy4  reason: default package */
/* loaded from: classes.dex */
public final class qy4 extends CancellationException {
    public qy4(long j) {
        super(lb1.i(j, "Timed out waiting for ", " ms"));
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        setStackTrace(hf.p);
        return this;
    }
}

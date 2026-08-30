package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: po4  reason: default package */
/* loaded from: classes.dex */
public abstract class po4 extends CancellationException {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ po4(String str, int i) {
        super(str);
        this.A = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.A) {
            case 0:
                setStackTrace(dt3.e0);
                return this;
            case 1:
                setStackTrace(l07.i);
                return this;
            default:
                setStackTrace(f34.j);
                return this;
        }
    }
}

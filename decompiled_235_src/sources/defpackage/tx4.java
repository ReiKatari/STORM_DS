package defpackage;

import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tx4  reason: default package */
/* loaded from: classes.dex */
public abstract class tx4 extends CancellationException {
    public final /* synthetic */ int A;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ tx4(String str, int i) {
        super(str);
        this.A = i;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        switch (this.A) {
            case 0:
                setStackTrace(nw7.Z);
                return this;
            case 1:
                setStackTrace(hv.i);
                return this;
            default:
                setStackTrace(l.g);
                return this;
        }
    }
}

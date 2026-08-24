package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xm2  reason: default package */
/* loaded from: classes.dex */
public final class xm2 extends RuntimeException {
    public final ym2 A;
    public final Throwable B;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xm2(ym2 ym2Var, Throwable th) {
        super(th);
        ym2Var.getClass();
        this.A = ym2Var;
        this.B = th;
    }

    @Override // java.lang.Throwable
    public final Throwable getCause() {
        return this.B;
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lf6  reason: default package */
/* loaded from: classes.dex */
public final class lf6 implements il1 {
    public final of6 A;
    public final long B;
    public final Object L;
    public final rj0 R;

    public lf6(of6 of6Var, long j, Object obj, rj0 rj0Var) {
        this.A = of6Var;
        this.B = j;
        this.L = obj;
        this.R = rj0Var;
    }

    @Override // defpackage.il1
    public final void dispose() {
        of6 of6Var = this.A;
        synchronized (of6Var) {
            if (this.B < of6Var.q()) {
                return;
            }
            Object[] objArr = of6Var.d0;
            objArr.getClass();
            long j = this.B;
            if (objArr[((int) j) & (objArr.length - 1)] != this) {
                return;
            }
            pf6.c(objArr, j, pf6.a);
            of6Var.l();
        }
    }
}

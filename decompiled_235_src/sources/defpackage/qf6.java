package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qf6  reason: default package */
/* loaded from: classes.dex */
public final class qf6 extends u1 {
    public long a;
    public rj0 b;

    @Override // defpackage.u1
    public final boolean a(t1 t1Var) {
        of6 of6Var = (of6) t1Var;
        if (this.a >= 0) {
            return false;
        }
        long j = of6Var.e0;
        if (j < of6Var.f0) {
            of6Var.f0 = j;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.u1
    public final r41[] b(t1 t1Var) {
        long j = this.a;
        this.a = -1L;
        this.b = null;
        return ((of6) t1Var).w(j);
    }
}

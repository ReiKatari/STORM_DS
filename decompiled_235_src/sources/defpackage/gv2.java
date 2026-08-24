package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gv2  reason: default package */
/* loaded from: classes.dex */
public final class gv2 implements f05 {
    public final ic a;
    public final ok4 b;
    public long c = 0;

    public gv2(ic icVar, ok4 ok4Var) {
        this.a = icVar;
        this.b = ok4Var;
    }

    @Override // defpackage.f05
    public final long a(m93 m93Var, long j, kk3 kk3Var, long j2) {
        long a = this.b.a();
        if ((9223372034707292159L & a) == 9205357640488583168L) {
            a = this.c;
        }
        this.c = a;
        return i93.c(i93.c(m93Var.b(), kn2.a0(a)), this.a.a(j2, 0L, kk3Var));
    }
}

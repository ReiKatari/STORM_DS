package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: el1  reason: default package */
/* loaded from: classes.dex */
public final class el1 implements bj5 {
    public final qn2 A;
    public fl1 B;

    public el1(qn2 qn2Var) {
        this.A = qn2Var;
    }

    @Override // defpackage.bj5
    public final void b() {
        fl1 fl1Var = this.B;
        if (fl1Var != null) {
            fl1Var.dispose();
        }
        this.B = null;
    }

    @Override // defpackage.bj5
    public final void c() {
        this.B = (fl1) this.A.g(mb3.r);
    }

    @Override // defpackage.bj5
    public final void a() {
    }
}

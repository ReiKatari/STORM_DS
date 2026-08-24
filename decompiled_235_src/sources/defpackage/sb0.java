package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sb0  reason: default package */
/* loaded from: classes.dex */
public final class sb0 extends r1 {
    public final /* synthetic */ tb0 d0;

    public sb0(tb0 tb0Var) {
        this.d0 = tb0Var;
    }

    @Override // defpackage.r1
    public final String g() {
        qb0 qb0Var = (qb0) this.d0.A.get();
        if (qb0Var == null) {
            return "Completer object has been garbage collected, future will fail soon";
        }
        return "tag=[" + qb0Var.a + "]";
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: s97  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class s97 implements on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ga7 B;

    public /* synthetic */ s97(ga7 ga7Var, int i) {
        this.A = i;
        this.B = ga7Var;
    }

    @Override // defpackage.on2
    public final Object c() {
        boolean z;
        int i = this.A;
        ga7 ga7Var = this.B;
        switch (i) {
            case 0:
                if (nb3.k(ga7Var.d.getValue(), ga7Var.a.f()) && ga7Var.g.h() == Long.MIN_VALUE && !((Boolean) ga7Var.h.getValue()).booleanValue()) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                return Long.valueOf(ga7Var.b());
        }
    }
}

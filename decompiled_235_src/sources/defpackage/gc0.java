package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gc0  reason: default package */
/* loaded from: classes.dex */
public final class gc0 implements ne2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ kc0 B;

    public /* synthetic */ gc0(kc0 kc0Var, int i) {
        this.A = i;
        this.B = kc0Var;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        int i = this.A;
        jg7 jg7Var = jg7.a;
        kc0 kc0Var = this.B;
        switch (i) {
            case 0:
                ii0 ii0Var = (ii0) obj;
                kf0 kf0Var = kc0Var.d;
                if (ii0Var instanceof ei0) {
                    if (((ei0) ii0Var).a.equals(kf0Var.a)) {
                        kc0.a(kc0Var, ii0Var);
                        return jg7Var;
                    }
                    i.m("Check failed.");
                } else if (ii0Var instanceof gi0) {
                    if (nb3.k(((gi0) ii0Var).a, kf0Var.a)) {
                        kc0.a(kc0Var, ii0Var);
                        return jg7Var;
                    }
                    i.m("Check failed.");
                } else {
                    return jg7Var;
                }
                return null;
            default:
                jg7 jg7Var2 = (jg7) obj;
                kc0.a(kc0Var, fi0.a);
                return jg7Var;
        }
    }
}

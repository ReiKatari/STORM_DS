package defpackage;

import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cy0  reason: default package */
/* loaded from: classes.dex */
public final class cy0 implements bo4, j61 {
    public static final cs1 B = new cs1(28);
    public final xq2 A;

    public cy0(xq2 xq2Var) {
        this.A = xq2Var;
    }

    @Override // defpackage.l61
    public final /* bridge */ l61 D(k61 k61Var) {
        return jw2.w(this, k61Var);
    }

    @Override // defpackage.l61
    public final /* bridge */ l61 N(l61 l61Var) {
        return jw2.y(this, l61Var);
    }

    @Override // defpackage.l61
    public final /* bridge */ j61 Z(k61 k61Var) {
        return jw2.p(this, k61Var);
    }

    @Override // defpackage.j61
    public final k61 getKey() {
        return B;
    }

    @Override // defpackage.bo4
    public final List l(Integer num) {
        return this.A.I();
    }

    @Override // defpackage.bo4
    public final boolean m() {
        return this.A.C;
    }

    @Override // defpackage.l61
    public final Object x(eo2 eo2Var, Object obj) {
        return eo2Var.o(obj, this);
    }
}

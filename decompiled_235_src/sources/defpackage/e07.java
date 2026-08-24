package defpackage;

import android.graphics.Typeface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e07  reason: default package */
/* loaded from: classes.dex */
public final class e07 extends gi2 {
    public final /* synthetic */ gi2 e;
    public final /* synthetic */ g07 f;

    public e07(g07 g07Var, gi2 gi2Var) {
        this.f = g07Var;
        this.e = gi2Var;
    }

    @Override // defpackage.gi2
    public final void K(int i) {
        this.f.n = true;
        this.e.K(i);
    }

    @Override // defpackage.gi2
    public final void L(Typeface typeface) {
        g07 g07Var = this.f;
        Typeface create = Typeface.create(typeface, g07Var.d);
        g07Var.p = create;
        g07Var.n = true;
        this.e.M(create, false);
    }
}

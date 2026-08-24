package defpackage;

import android.graphics.Typeface;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pj0  reason: default package */
/* loaded from: classes.dex */
public final class pj0 extends gi2 {
    public final Typeface e;
    public final os0 f;
    public boolean g;

    public pj0(os0 os0Var, Typeface typeface) {
        this.e = typeface;
        this.f = os0Var;
    }

    @Override // defpackage.gi2
    public final void K(int i) {
        if (!this.g) {
            at0 at0Var = (at0) this.f.B;
            if (at0Var.l(this.e)) {
                at0Var.j(false);
            }
        }
    }

    @Override // defpackage.gi2
    public final void M(Typeface typeface, boolean z) {
        if (!this.g) {
            at0 at0Var = (at0) this.f.B;
            if (at0Var.l(typeface)) {
                at0Var.j(false);
            }
        }
    }
}

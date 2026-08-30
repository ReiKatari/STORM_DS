package defpackage;

import android.graphics.Typeface;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: gh0  reason: default package */
/* loaded from: classes.dex */
public final class gh0 extends yf2 {
    public final Typeface e;
    public final bq0 f;
    public boolean g;

    public gh0(bq0 bq0Var, Typeface typeface) {
        this.e = typeface;
        this.f = bq0Var;
    }

    @Override // defpackage.yf2
    public final void J(int i) {
        if (!this.g) {
            nq0 nq0Var = (nq0) this.f.B;
            if (nq0Var.l(this.e)) {
                nq0Var.j(false);
            }
        }
    }

    @Override // defpackage.yf2
    public final void K(Typeface typeface, boolean z) {
        if (!this.g) {
            nq0 nq0Var = (nq0) this.f.B;
            if (nq0Var.l(typeface)) {
                nq0Var.j(false);
            }
        }
    }
}

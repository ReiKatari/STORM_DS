package defpackage;

import android.view.ViewGroup;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fj0  reason: default package */
/* loaded from: classes.dex */
public final class fj0 extends ox6 {
    public boolean a = false;
    public final ViewGroup b;

    public fj0(ViewGroup viewGroup) {
        this.b = viewGroup;
    }

    @Override // defpackage.ox6, defpackage.hx6
    public final void a(ix6 ix6Var) {
        if (!this.a) {
            cg2.U(this.b, false);
        }
        ix6Var.D(this);
    }

    @Override // defpackage.ox6, defpackage.hx6
    public final void b() {
        cg2.U(this.b, false);
    }

    @Override // defpackage.ox6, defpackage.hx6
    public final void c() {
        cg2.U(this.b, true);
    }

    @Override // defpackage.ox6, defpackage.hx6
    public final void e(ix6 ix6Var) {
        cg2.U(this.b, false);
        this.a = true;
    }
}

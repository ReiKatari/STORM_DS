package b4;

import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n3 implements n2.u, androidx.lifecycle.v {
    public final x A;
    public final n2.y B;
    public boolean L;
    public androidx.lifecycle.r R;
    public mc.p X = p1.f1910a;

    public n3(x xVar, n2.y yVar) {
        this.A = xVar;
        this.B = yVar;
    }

    public final void a() {
        if (!this.L) {
            this.L = true;
            this.A.getView().setTag(R.id.wrapped_composition_tag, null);
            androidx.lifecycle.r rVar = this.R;
            if (rVar != null) {
                rVar.c(this);
            }
        }
        this.B.m();
    }

    public final void b(mc.p pVar) {
        this.A.setOnViewTreeOwnersAvailable(new a5.n(7, this, pVar));
    }

    @Override // androidx.lifecycle.v
    public final void d(androidx.lifecycle.x xVar, androidx.lifecycle.p pVar) {
        if (pVar == androidx.lifecycle.p.ON_DESTROY) {
            a();
        } else if (pVar == androidx.lifecycle.p.ON_CREATE && !this.L) {
            b(this.X);
        }
    }
}

package o3;

import a4.m0;
import a4.r0;
import n2.f1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class j0 extends n3.b {
    public final f1 X = n2.s.w(new h3.e(0));
    public final f1 Y = n2.s.w(Boolean.FALSE);
    public final e0 Z;

    /* renamed from: b0  reason: collision with root package name */
    public final f1 f10772b0;

    /* renamed from: c0  reason: collision with root package name */
    public float f10773c0;

    /* renamed from: d0  reason: collision with root package name */
    public i3.l f10774d0;

    public j0(c cVar) {
        e0 e0Var = new e0(cVar);
        e0Var.f10722f = new m0(11, this);
        this.Z = e0Var;
        this.f10772b0 = new f1(yb.y.f14813a, n2.e.R);
        this.f10773c0 = 1.0f;
    }

    @Override // n3.b
    public final void d(float f8) {
        this.f10773c0 = f8;
    }

    @Override // n3.b
    public final void e(i3.l lVar) {
        this.f10774d0 = lVar;
    }

    @Override // n3.b
    public final long h() {
        return ((h3.e) this.X.getValue()).f6064a;
    }

    @Override // n3.b
    public final void i(r0 r0Var) {
        k3.b bVar = r0Var.A;
        i3.l lVar = this.f10774d0;
        e0 e0Var = this.Z;
        if (lVar == null) {
            lVar = (i3.l) e0Var.f10723g.getValue();
        }
        if (((Boolean) this.Y.getValue()).booleanValue() && r0Var.getLayoutDirection() == x4.m.Rtl) {
            long S = bVar.S();
            a4.n nVar = bVar.B;
            long t5 = nVar.t();
            nVar.p().p();
            try {
                ((d2.t) nVar.B).E(-1.0f, 1.0f, S);
                e0Var.e(r0Var, this.f10773c0, lVar);
            } finally {
                w.d.y(nVar, t5);
            }
        } else {
            e0Var.e(r0Var, this.f10773c0, lVar);
        }
        this.f10772b0.getValue();
    }
}

package u1;

import h1.j2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g1 implements j2 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ j2 f13322a;

    /* renamed from: b  reason: collision with root package name */
    public final n2.e0 f13323b;

    /* renamed from: c  reason: collision with root package name */
    public final n2.e0 f13324c;

    public g1(j2 j2Var, final i1 i1Var) {
        this.f13322a = j2Var;
        this.f13323b = n2.s.q(new mc.a() { // from class: u1.f1
            @Override // mc.a
            public final Object b() {
                boolean z10;
                boolean z11;
                switch (r2) {
                    case 0:
                        i1 i1Var2 = i1Var;
                        if (i1Var2.f13332a.g() < i1Var2.f13333b.g()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    default:
                        if (i1Var.f13332a.g() > 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        });
        this.f13324c = n2.s.q(new mc.a() { // from class: u1.f1
            @Override // mc.a
            public final Object b() {
                boolean z10;
                boolean z11;
                switch (r2) {
                    case 0:
                        i1 i1Var2 = i1Var;
                        if (i1Var2.f13332a.g() < i1Var2.f13333b.g()) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        return Boolean.valueOf(z10);
                    default:
                        if (i1Var.f13332a.g() > 0.0f) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        return Boolean.valueOf(z11);
                }
            }
        });
    }

    @Override // h1.j2
    public final boolean a() {
        return ((Boolean) this.f13324c.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final boolean b() {
        return this.f13322a.b();
    }

    @Override // h1.j2
    public final Object c(f1.f1 f1Var, mc.p pVar, cc.c cVar) {
        return this.f13322a.c(f1Var, pVar, cVar);
    }

    @Override // h1.j2
    public final boolean d() {
        return ((Boolean) this.f13323b.getValue()).booleanValue();
    }

    @Override // h1.j2
    public final float e(float f8) {
        return this.f13322a.e(f8);
    }
}

package p1;

import a4.l2;
import h1.n1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class y0 extends b3.o implements l2 {

    /* renamed from: i0  reason: collision with root package name */
    public mc.a f11289i0;

    /* renamed from: j0  reason: collision with root package name */
    public u0 f11290j0;

    /* renamed from: k0  reason: collision with root package name */
    public n1 f11291k0;

    /* renamed from: l0  reason: collision with root package name */
    public boolean f11292l0;

    /* renamed from: m0  reason: collision with root package name */
    public i4.j f11293m0;

    /* renamed from: n0  reason: collision with root package name */
    public final w0 f11294n0 = new w0(this, 0);

    /* renamed from: o0  reason: collision with root package name */
    public w0 f11295o0;

    public y0(mc.a aVar, u0 u0Var, n1 n1Var, boolean z10) {
        this.f11289i0 = aVar;
        this.f11290j0 = u0Var;
        this.f11291k0 = n1Var;
        this.f11292l0 = z10;
        O0();
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    public final void O0() {
        w0 w0Var;
        this.f11293m0 = new i4.j(new x0(this, 0), new x0(this, 1));
        if (this.f11292l0) {
            w0Var = new w0(this, 1);
        } else {
            w0Var = null;
        }
        this.f11295o0 = w0Var;
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
        tc.c[] cVarArr = i4.v.f6808a;
        i4.w wVar = i4.t.m;
        tc.c[] cVarArr2 = i4.v.f6808a;
        tc.c cVar = cVarArr2[6];
        xVar.a(wVar, Boolean.TRUE);
        xVar.a(i4.t.M, this.f11294n0);
        n1 n1Var = this.f11291k0;
        n1 n1Var2 = n1.Vertical;
        i4.j jVar = this.f11293m0;
        if (n1Var == n1Var2) {
            if (jVar != null) {
                i4.w wVar2 = i4.t.f6801v;
                tc.c cVar2 = cVarArr2[13];
                xVar.a(wVar2, jVar);
            } else {
                nc.k.f("scrollAxisRange");
                throw null;
            }
        } else if (jVar != null) {
            i4.w wVar3 = i4.t.f6800u;
            tc.c cVar3 = cVarArr2[12];
            xVar.a(wVar3, jVar);
        } else {
            nc.k.f("scrollAxisRange");
            throw null;
        }
        w0 w0Var = this.f11295o0;
        if (w0Var != null) {
            xVar.a(i4.l.f6745f, new i4.a(null, w0Var));
        }
        xVar.a(i4.l.C, new i4.a(null, new a4.a(18, new x0(this, 2))));
        i4.c c4 = this.f11290j0.c();
        i4.w wVar4 = i4.t.f6786f;
        tc.c cVar4 = cVarArr2[23];
        xVar.a(wVar4, c4);
    }
}

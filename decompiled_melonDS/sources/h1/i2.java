package h1;

import android.os.Build;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.EdgeEffect;
import g2.l5;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i2 extends k0 implements t3.e, a4.l2 {
    public f1.i C0;
    public q0 D0;
    public final b9.e E0;
    public final v1 F0;
    public final l G0;
    public final p2 H0;
    public final a0.l I0;
    public final g3.g0 J0;
    public final j K0;
    public ai.s0 L0;
    public g2 M0;
    public d0.b1 N0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [h1.v1, a4.j, b3.o] */
    /* JADX WARN: Type inference failed for: r0v6, types: [a4.j, r1.h, b3.o] */
    /* JADX WARN: Type inference failed for: r10v0, types: [a4.k, h1.i2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [h1.q0] */
    public i2(f1.i iVar, d dVar, q0 q0Var, n1 n1Var, j2 j2Var, j1.i iVar2, boolean z10, boolean z11) {
        super(b2.f5860a, z10, iVar2, n1Var);
        l lVar;
        this.C0 = iVar;
        this.D0 = q0Var;
        b9.e eVar = new b9.e(23);
        this.E0 = eVar;
        ?? oVar = new b3.o();
        oVar.f6019i0 = z10;
        O0(oVar);
        this.F0 = oVar;
        l lVar2 = new l(new d1.t(new a0.b(b2.f5863d)));
        this.G0 = lVar2;
        f1.i iVar3 = this.C0;
        ?? r12 = this.D0;
        if (r12 == 0) {
            lVar = lVar2;
        } else {
            lVar = r12;
        }
        p2 p2Var = new p2(j2Var, iVar3, lVar, n1Var, z11, eVar, this, new d2(this, 0));
        this.H0 = p2Var;
        a0.l lVar3 = new a0.l(z10, p2Var);
        this.I0 = lVar3;
        g3.g0 g0Var = new g3.g0(2, null, 10);
        O0(g0Var);
        this.J0 = g0Var;
        j jVar = new j(n1Var, p2Var, z11, dVar, new d2(this, 1));
        O0(jVar);
        this.K0 = jVar;
        O0(new u3.h(lVar3, eVar));
        ?? oVar2 = new b3.o();
        oVar2.f12612i0 = jVar;
        O0(oVar2);
    }

    @Override // b3.o
    public final boolean D0() {
        return false;
    }

    @Override // b3.o
    public final void G0() {
        if (this.f1777h0) {
            x4.c cVar = a4.l.t(this).f295t0;
            l lVar = this.G0;
            lVar.getClass();
            lVar.f5955a = new d1.t(new a0.b(cVar));
        }
        d0.b1 b1Var = this.N0;
        if (b1Var != null) {
            b1Var.f3335e = a4.l.t(this).f295t0;
        }
    }

    @Override // t3.e
    public final boolean Q(KeyEvent keyEvent) {
        float f8;
        long floatToRawIntBits;
        float f10;
        boolean z10 = false;
        if (!this.f5933m0 || ((!t3.a.a(t3.c.b(keyEvent), t3.a.G) && !t3.a.a(t3.c.a(keyEvent.getKeyCode()), t3.a.F)) || t3.c.c(keyEvent) != 2 || keyEvent.isCtrlPressed())) {
            return false;
        }
        if (this.H0.f5992d == n1.Vertical) {
            z10 = true;
        }
        j jVar = this.K0;
        if (z10) {
            int i2 = (int) (jVar.p0 & 4294967295L);
            if (t3.a.a(t3.c.a(keyEvent.getKeyCode()), t3.a.F)) {
                f10 = i2;
            } else {
                f10 = -i2;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) << 32) | (4294967295L & Float.floatToRawIntBits(f10));
        } else {
            int i10 = (int) (jVar.p0 >> 32);
            if (t3.a.a(t3.c.a(keyEvent.getKeyCode()), t3.a.F)) {
                f8 = i10;
            } else {
                f8 = -i10;
            }
            floatToRawIntBits = (Float.floatToRawIntBits(0.0f) & 4294967295L) | (Float.floatToRawIntBits(f8) << 32);
        }
        zc.x.v(C0(), null, null, new g2(this, floatToRawIntBits, null, 0), 3);
        return true;
    }

    @Override // h1.k0
    public final Object V0(j0 j0Var, j0 j0Var2) {
        f1.f1 f1Var = f1.f1.UserInput;
        p2 p2Var = this.H0;
        Object f8 = p2Var.f(f1Var, new a2.o(j0Var, p2Var, (cc.c) null, 27), j0Var2);
        if (f8 == dc.a.COROUTINE_SUSPENDED) {
            return f8;
        }
        return yb.y.f14813a;
    }

    @Override // a4.j, a4.h2
    public final void a() {
        g0();
        if (this.f1777h0) {
            x4.c cVar = a4.l.t(this).f295t0;
            l lVar = this.G0;
            lVar.getClass();
            lVar.f5955a = new d1.t(new a0.b(cVar));
        }
        d0.b1 b1Var = this.N0;
        if (b1Var != null) {
            b1Var.f3335e = a4.l.t(this).f295t0;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [nc.l, mc.a] */
    @Override // h1.k0
    public final void b1(w wVar) {
        zc.u uVar = (zc.u) ((nc.l) this.E0.R).b();
        if (uVar != null) {
            zc.x.v(uVar, null, null, new di.b(wVar, this, null, 13), 3);
        } else {
            a0.j.p("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        }
    }

    @Override // a4.l2
    public final void f0(i4.x xVar) {
        if (this.f5933m0 && (this.L0 == null || this.M0 == null)) {
            this.L0 = new ai.s0(5, this);
            this.M0 = new g2(this, null);
        }
        ai.s0 s0Var = this.L0;
        if (s0Var != null) {
            tc.c[] cVarArr = i4.v.f6808a;
            xVar.a(i4.l.f6743d, new i4.a(null, s0Var));
        }
        g2 g2Var = this.M0;
        if (g2Var != null) {
            tc.c[] cVarArr2 = i4.v.f6808a;
            xVar.a(i4.l.f6744e, g2Var);
        }
    }

    @Override // h1.k0
    public final boolean g1() {
        float f8;
        float f10;
        float f11;
        float f12;
        p2 p2Var = this.H0;
        if (!p2Var.f5989a.b()) {
            f1.i iVar = p2Var.f5990b;
            if (iVar != null) {
                f1.i0 i0Var = iVar.f4570c;
                EdgeEffect edgeEffect = i0Var.f4580d;
                if (edgeEffect != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f12 = f1.l.b(edgeEffect);
                    } else {
                        f12 = 0.0f;
                    }
                    if (f12 != 0.0f) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect2 = i0Var.f4581e;
                if (edgeEffect2 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f11 = f1.l.b(edgeEffect2);
                    } else {
                        f11 = 0.0f;
                    }
                    if (f11 != 0.0f) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect3 = i0Var.f4582f;
                if (edgeEffect3 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f10 = f1.l.b(edgeEffect3);
                    } else {
                        f10 = 0.0f;
                    }
                    if (f10 != 0.0f) {
                        return true;
                    }
                }
                EdgeEffect edgeEffect4 = i0Var.f4583g;
                if (edgeEffect4 != null) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        f8 = f1.l.b(edgeEffect4);
                    } else {
                        f8 = 0.0f;
                    }
                    if (f8 == 0.0f) {
                        return false;
                    }
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    @Override // t3.e
    public final boolean h(KeyEvent keyEvent) {
        return false;
    }

    public final void j1(f1.i iVar, d dVar, q0 q0Var, n1 n1Var, j2 j2Var, j1.i iVar2, boolean z10, boolean z11) {
        boolean z12;
        q0 q0Var2;
        boolean z13 = true;
        boolean z14 = false;
        if (this.f5933m0 != z10) {
            this.I0.A = z10;
            this.F0.f6019i0 = z10;
            z12 = true;
        } else {
            z12 = false;
        }
        if (q0Var == null) {
            q0Var2 = this.G0;
        } else {
            q0Var2 = q0Var;
        }
        p2 p2Var = this.H0;
        if (!nc.k.a(p2Var.f5989a, j2Var)) {
            p2Var.f5989a = j2Var;
            z14 = true;
        }
        p2Var.f5990b = iVar;
        if (p2Var.f5992d != n1Var) {
            p2Var.f5992d = n1Var;
            z14 = true;
        }
        if (p2Var.f5993e != z11) {
            p2Var.f5993e = z11;
        } else {
            z13 = z14;
        }
        p2Var.f5991c = q0Var2;
        p2Var.f5994f = this.E0;
        j jVar = this.K0;
        jVar.f5914i0 = n1Var;
        jVar.f5916k0 = z11;
        jVar.f5917l0 = dVar;
        this.C0 = iVar;
        this.D0 = q0Var;
        l5 l5Var = b2.f5860a;
        n1 n1Var2 = p2Var.f5992d;
        n1 n1Var3 = n1.Vertical;
        if (n1Var2 != n1Var3) {
            n1Var3 = n1.Horizontal;
        }
        i1(l5Var, z10, iVar2, n1Var3, z13);
        if (z12) {
            this.L0 = null;
            this.M0 = null;
            a4.l.l(this);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.util.List, java.util.Collection, java.lang.Object] */
    @Override // h1.k0, a4.h2
    public final void s0(v3.k kVar, v3.l lVar, long j2) {
        ?? r02 = kVar.f13678a;
        ?? r10 = kVar.f13678a;
        int size = r02.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            } else if (((Boolean) this.f5932l0.k(new v3.y(((v3.t) r02.get(i2)).f13699i))).booleanValue()) {
                super.s0(kVar, lVar, j2);
                break;
            } else {
                i2++;
            }
        }
        if (this.f5933m0) {
            if (lVar == v3.l.Initial && kVar.f13683f == 6) {
                if (this.N0 == null) {
                    this.N0 = new d0.b1(this.H0, new d2.t(9, ViewConfiguration.get(a4.l.v(this).getContext())), new e2(2, this, i2.class, "onWheelScrollStopped", "onWheelScrollStopped-TH1AsA0(J)V", 4, 0), a4.l.t(this).f295t0);
                }
                d0.b1 b1Var = this.N0;
                if (b1Var != null) {
                    zc.u C0 = C0();
                    if (((zc.l1) b1Var.f3337g) == null) {
                        b1Var.f3337g = zc.x.v(C0, null, null, new di.b(11, (cc.c) null, b1Var), 3);
                    }
                }
            }
            d0.b1 b1Var2 = this.N0;
            if (b1Var2 != null && kVar.f13683f == 6) {
                int size2 = r10.size();
                for (int i10 = 0; i10 < size2; i10++) {
                    if (((v3.t) r10.get(i10)).b()) {
                        return;
                    }
                }
                if (lVar == v3.l.Initial && b1Var2.f3331a) {
                    b1Var2.e(kVar);
                    int size3 = r10.size();
                    for (int i11 = 0; i11 < size3; i11++) {
                        ((v3.t) r10.get(i11)).a();
                    }
                }
                if (lVar == v3.l.Main && !b1Var2.f3331a && b1Var2.e(kVar)) {
                    int size4 = r10.size();
                    for (int i12 = 0; i12 < size4; i12++) {
                        ((v3.t) r10.get(i12)).a();
                    }
                }
            }
        }
    }

    @Override // h1.k0
    public final void a1(long j2) {
    }
}

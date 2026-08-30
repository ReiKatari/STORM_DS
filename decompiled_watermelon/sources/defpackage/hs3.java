package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hs3  reason: default package */
/* loaded from: classes.dex */
public abstract class hs3 extends fs3 implements mv3 {
    public final m74 j0;
    public LinkedHashMap l0;
    public uv3 n0;
    public final s14 o0;
    public long k0 = 0;
    public final is3 m0 = new is3(this);

    public hs3(m74 m74Var) {
        this.j0 = m74Var;
        s14 s14Var = a94.a;
        this.o0 = new s14();
    }

    public static final void N0(hs3 hs3Var, uv3 uv3Var) {
        LinkedHashMap linkedHashMap;
        if (uv3Var != null) {
            hs3Var.p0((uv3Var.a() & 4294967295L) | (uv3Var.c() << 32));
        } else {
            hs3Var.p0(0L);
        }
        if (!b53.x(hs3Var.n0, uv3Var) && uv3Var != null && ((((linkedHashMap = hs3Var.l0) != null && !linkedHashMap.isEmpty()) || !uv3Var.e().isEmpty()) && !b53.x(uv3Var.e(), hs3Var.l0))) {
            ms3 ms3Var = hs3Var.j0.j0.B0.q;
            ms3Var.getClass();
            ms3Var.m0.f();
            LinkedHashMap linkedHashMap2 = hs3Var.l0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                hs3Var.l0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(uv3Var.e());
        }
        hs3Var.n0 = uv3Var;
    }

    @Override // defpackage.fs3
    public final rd3 B0() {
        return this.m0;
    }

    @Override // defpackage.fs3
    public final boolean C0() {
        if (this.n0 != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.fs3
    public final vf3 F0() {
        return this.j0.j0;
    }

    @Override // defpackage.fs3
    public final uv3 G0() {
        uv3 uv3Var = this.n0;
        if (uv3Var != null) {
            return uv3Var;
        }
        throw b31.e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.fs3
    public final fs3 H0() {
        m74 m74Var = this.j0.n0;
        if (m74Var != null) {
            return m74Var.W0();
        }
        return null;
    }

    @Override // defpackage.fs3
    public final long I0() {
        return this.k0;
    }

    @Override // defpackage.fs3
    public final void M0() {
        o0(this.k0, RecyclerView.A1, null);
    }

    public final long O0() {
        return (this.A << 32) | (this.B & 4294967295L);
    }

    public void P0() {
        G0().b();
    }

    public final void Q0(long j) {
        if (!a33.a(this.k0, j)) {
            this.k0 = j;
            m74 m74Var = this.j0;
            ms3 ms3Var = m74Var.j0.B0.q;
            if (ms3Var != null) {
                ms3Var.x0();
            }
            fs3.K0(m74Var);
        }
        if (!this.f0) {
            x0(G0());
        }
    }

    public final long R0(hs3 hs3Var, boolean z) {
        long j = 0;
        while (!this.equals(hs3Var)) {
            if (!this.d0 || !z) {
                j = a33.c(j, this.k0);
            }
            m74 m74Var = this.j0.n0;
            m74Var.getClass();
            this = m74Var.W0();
            this.getClass();
        }
        return j;
    }

    @Override // defpackage.od1
    public final float b() {
        return this.j0.b();
    }

    @Override // defpackage.s43
    public final sd3 getLayoutDirection() {
        return this.j0.j0.u0;
    }

    @Override // defpackage.yn4, defpackage.mv3
    public final Object l() {
        return this.j0.l();
    }

    @Override // defpackage.od1
    public final float o() {
        return this.j0.o();
    }

    @Override // defpackage.yn4
    public final void o0(long j, float f, mi2 mi2Var) {
        Q0(j);
        if (this.e0) {
            return;
        }
        P0();
    }

    @Override // defpackage.fs3, defpackage.s43
    public final boolean w() {
        return true;
    }

    @Override // defpackage.fs3
    public final fs3 z0() {
        m74 m74Var = this.j0.m0;
        if (m74Var != null) {
            return m74Var.W0();
        }
        return null;
    }
}

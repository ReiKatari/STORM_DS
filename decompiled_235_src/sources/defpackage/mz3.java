package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.util.LinkedHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mz3  reason: default package */
/* loaded from: classes.dex */
public abstract class mz3 extends kz3 implements x24 {
    public final eg4 k0;
    public LinkedHashMap m0;
    public f34 o0;
    public final y94 p0;
    public long l0 = 0;
    public final nz3 n0 = new nz3(this);

    public mz3(eg4 eg4Var) {
        this.k0 = eg4Var;
        y94 y94Var = th4.a;
        this.p0 = new y94();
    }

    public static final void N0(mz3 mz3Var, f34 f34Var) {
        LinkedHashMap linkedHashMap;
        if (f34Var != null) {
            mz3Var.l0((f34Var.getHeight() & 4294967295L) | (f34Var.getWidth() << 32));
        } else {
            mz3Var.l0(0L);
        }
        if (!nb3.k(mz3Var.o0, f34Var) && f34Var != null && ((((linkedHashMap = mz3Var.m0) != null && !linkedHashMap.isEmpty()) || !f34Var.b().isEmpty()) && !nb3.k(f34Var.b(), mz3Var.m0))) {
            rz3 rz3Var = mz3Var.k0.k0.C0.q;
            rz3Var.getClass();
            rz3Var.n0.f();
            LinkedHashMap linkedHashMap2 = mz3Var.m0;
            if (linkedHashMap2 == null) {
                linkedHashMap2 = new LinkedHashMap();
                mz3Var.m0 = linkedHashMap2;
            }
            linkedHashMap2.clear();
            linkedHashMap2.putAll(f34Var.b());
        }
        mz3Var.o0 = f34Var;
    }

    @Override // defpackage.kz3
    public final jk3 A0() {
        return this.n0;
    }

    @Override // defpackage.dx4, defpackage.x24
    public final Object B() {
        return this.k0.B();
    }

    @Override // defpackage.kz3
    public final boolean C0() {
        if (this.o0 != null) {
            return true;
        }
        return false;
    }

    @Override // defpackage.kz3
    public final sm3 F0() {
        return this.k0.k0;
    }

    @Override // defpackage.kz3
    public final f34 G0() {
        f34 f34Var = this.o0;
        if (f34Var != null) {
            return f34Var;
        }
        throw i61.e("LookaheadDelegate has not been measured yet when measureResult is requested.");
    }

    @Override // defpackage.kz3
    public final kz3 H0() {
        eg4 eg4Var = this.k0.o0;
        if (eg4Var != null) {
            return eg4Var.W0();
        }
        return null;
    }

    @Override // defpackage.kz3
    public final long I0() {
        return this.l0;
    }

    @Override // defpackage.kz3
    public final void M0() {
        h0(this.l0, RecyclerView.B1, null);
    }

    public final long O0() {
        return (this.A << 32) | (this.B & 4294967295L);
    }

    public void P0() {
        G0().a();
    }

    public final void Q0(long j) {
        if (!i93.a(this.l0, j)) {
            this.l0 = j;
            eg4 eg4Var = this.k0;
            rz3 rz3Var = eg4Var.k0.C0.q;
            if (rz3Var != null) {
                rz3Var.x0();
            }
            kz3.K0(eg4Var);
        }
        if (!this.g0) {
            x0(G0());
        }
    }

    public final long R0(mz3 mz3Var, boolean z) {
        long j = 0;
        while (!this.equals(mz3Var)) {
            if (!this.e0 || !z) {
                j = i93.c(j, this.l0);
            }
            eg4 eg4Var = this.k0.o0;
            eg4Var.getClass();
            this = eg4Var.W0();
            this.getClass();
        }
        return j;
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.k0.Y();
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.k0.a();
    }

    @Override // defpackage.kz3, defpackage.eb3
    public final boolean a0() {
        return true;
    }

    @Override // defpackage.eb3
    public final kk3 getLayoutDirection() {
        return this.k0.k0.v0;
    }

    @Override // defpackage.dx4
    public final void h0(long j, float f, qn2 qn2Var) {
        Q0(j);
        if (this.f0) {
            return;
        }
        P0();
    }

    @Override // defpackage.kz3
    public final kz3 z0() {
        eg4 eg4Var = this.k0.n0;
        if (eg4Var != null) {
            return eg4Var.W0();
        }
        return null;
    }
}

package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xm3  reason: default package */
/* loaded from: classes.dex */
public final class xm3 implements qt6, g34 {
    public final /* synthetic */ an3 A;
    public final /* synthetic */ gn3 B;

    public xm3(gn3 gn3Var) {
        this.B = gn3Var;
        this.A = gn3Var.d0;
    }

    @Override // defpackage.g34
    public final f34 K(int i, int i2, Map map, qn2 qn2Var) {
        return this.A.o0(i, i2, map, null, qn2Var);
    }

    @Override // defpackage.qh1
    public final long M(float f) {
        return this.A.M(f);
    }

    @Override // defpackage.qh1
    public final float Q(int i) {
        return this.A.Q(i);
    }

    @Override // defpackage.qh1
    public final float T(float f) {
        return f / this.A.a();
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.A.L;
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.A.B;
    }

    @Override // defpackage.eb3
    public final boolean a0() {
        return this.A.a0();
    }

    @Override // defpackage.qh1
    public final float e0(float f) {
        return this.A.a() * f;
    }

    @Override // defpackage.eb3
    public final kk3 getLayoutDirection() {
        return this.A.A;
    }

    @Override // defpackage.qh1
    public final int k0(long j) {
        return this.A.k0(j);
    }

    @Override // defpackage.g34
    public final f34 o0(int i, int i2, Map map, qn2 qn2Var, qn2 qn2Var2) {
        return this.A.o0(i, i2, map, qn2Var, qn2Var2);
    }

    @Override // defpackage.qh1
    public final long p(float f) {
        return this.A.p(f);
    }

    @Override // defpackage.qh1
    public final long q(long j) {
        return this.A.q(j);
    }

    @Override // defpackage.qh1
    public final int r0(float f) {
        return this.A.r0(f);
    }

    @Override // defpackage.qt6
    public final List v(eo2 eo2Var, Object obj) {
        ym3 ym3Var;
        gn3 gn3Var = this.B;
        sm3 sm3Var = gn3Var.A;
        ja4 ja4Var = gn3Var.Z;
        sm3 sm3Var2 = (sm3) ja4Var.g(obj);
        if (sm3Var2 != null && ((ua4) ((aa4) sm3Var.o()).B).i(sm3Var2) < gn3Var.R) {
            return sm3Var2.m();
        }
        ja4 ja4Var2 = gn3Var.h0;
        ja4 ja4Var3 = gn3Var.f0;
        ua4 ua4Var = gn3Var.i0;
        if (ua4Var.L < gn3Var.X) {
            p53.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        sm3 sm3Var3 = (sm3) ja4Var.g(obj);
        int i = ua4Var.L;
        int i2 = gn3Var.X;
        if (i == i2) {
            ua4Var.b(obj);
        } else {
            Object[] objArr = ua4Var.A;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        gn3Var.X++;
        boolean b = ja4Var3.b(obj);
        if (!b && sm3Var3 == null) {
            gn3Var.k(obj, eo2Var, false);
            ja4Var2.m(obj, gn3Var.f(obj));
        } else {
            if (!b && sm3Var3 != null) {
                gn3Var.j(((ua4) ((aa4) sm3Var.o()).B).i(sm3Var3), ((ua4) ((aa4) sm3Var.o()).B).L);
                gn3Var.k0++;
                ja4Var.k(obj);
                ja4Var3.m(obj, sm3Var3);
                ja4Var2.m(obj, gn3Var.f(obj));
                if (sm3Var.H()) {
                    gn3Var.h();
                }
            }
            sm3 sm3Var4 = (sm3) ja4Var3.g(obj);
            tu4 tu4Var = null;
            if (sm3Var4 != null) {
                ym3Var = (ym3) gn3Var.Y.g(sm3Var4);
            } else {
                ym3Var = null;
            }
            if (ym3Var != null && ym3Var.d) {
                gn3Var.m(sm3Var4, obj, false, eo2Var);
            }
            if (ym3Var != null) {
                tu4Var = ym3Var.f;
            }
            if (tu4Var != null) {
                gn3Var.d(ym3Var, true);
            }
        }
        sm3 sm3Var5 = (sm3) ja4Var3.g(obj);
        if (sm3Var5 != null) {
            List s0 = sm3Var5.C0.p.s0();
            aa4 aa4Var = (aa4) s0;
            int i3 = ((ua4) aa4Var.B).L;
            for (int i4 = 0; i4 < i3; i4++) {
                ((d34) aa4Var.get(i4)).Y.b = true;
            }
            return s0;
        }
        return yt1.A;
    }

    @Override // defpackage.qh1
    public final long v0(long j) {
        return this.A.v0(j);
    }

    @Override // defpackage.qh1
    public final float x(long j) {
        return this.A.x(j);
    }

    @Override // defpackage.qh1
    public final float y0(long j) {
        return this.A.y0(j);
    }
}

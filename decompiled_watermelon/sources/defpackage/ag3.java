package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ag3  reason: default package */
/* loaded from: classes.dex */
public final class ag3 implements zh6, vv3 {
    public final /* synthetic */ dg3 A;
    public final /* synthetic */ jg3 B;

    public ag3(jg3 jg3Var) {
        this.B = jg3Var;
        this.A = jg3Var.c0;
    }

    @Override // defpackage.od1
    public final float A0(int i) {
        return this.A.A0(i);
    }

    @Override // defpackage.od1
    public final long B(long j) {
        return this.A.B(j);
    }

    @Override // defpackage.od1
    public final float C(float f) {
        return this.A.b() * f;
    }

    @Override // defpackage.od1
    public final float D0(float f) {
        return f / this.A.b();
    }

    @Override // defpackage.zh6
    public final List N(aj2 aj2Var, Object obj) {
        bg3 bg3Var;
        jg3 jg3Var = this.B;
        vf3 vf3Var = jg3Var.A;
        d24 d24Var = jg3Var.Z;
        vf3 vf3Var2 = (vf3) d24Var.g(obj);
        if (vf3Var2 != null && ((o24) ((u14) vf3Var.o()).B).j(vf3Var2) < jg3Var.R) {
            return vf3Var2.m();
        }
        d24 d24Var2 = jg3Var.g0;
        d24 d24Var3 = jg3Var.e0;
        o24 o24Var = jg3Var.h0;
        if (o24Var.L < jg3Var.X) {
            mz2.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        vf3 vf3Var3 = (vf3) d24Var.g(obj);
        int i = o24Var.L;
        int i2 = jg3Var.X;
        if (i == i2) {
            o24Var.b(obj);
        } else {
            Object[] objArr = o24Var.A;
            Object obj2 = objArr[i2];
            objArr[i2] = obj;
        }
        jg3Var.X++;
        boolean b = d24Var3.b(obj);
        if (!b && vf3Var3 == null) {
            jg3Var.k(obj, aj2Var, false);
            d24Var2.m(obj, jg3Var.f(obj));
        } else {
            if (!b && vf3Var3 != null) {
                jg3Var.j(((o24) ((u14) vf3Var.o()).B).j(vf3Var3), ((o24) ((u14) vf3Var.o()).B).L);
                jg3Var.j0++;
                d24Var.k(obj);
                d24Var3.m(obj, vf3Var3);
                d24Var2.m(obj, jg3Var.f(obj));
                if (vf3Var.H()) {
                    jg3Var.h();
                }
            }
            vf3 vf3Var4 = (vf3) d24Var3.g(obj);
            ql4 ql4Var = null;
            if (vf3Var4 != null) {
                bg3Var = (bg3) jg3Var.Y.g(vf3Var4);
            } else {
                bg3Var = null;
            }
            if (bg3Var != null && bg3Var.d) {
                jg3Var.m(vf3Var4, obj, false, aj2Var);
            }
            if (bg3Var != null) {
                ql4Var = bg3Var.f;
            }
            if (ql4Var != null) {
                jg3Var.d(bg3Var, true);
            }
        }
        vf3 vf3Var5 = (vf3) d24Var3.g(obj);
        if (vf3Var5 != null) {
            List r0 = vf3Var5.B0.p.r0();
            u14 u14Var = (u14) r0;
            int i3 = ((o24) u14Var.B).L;
            for (int i4 = 0; i4 < i3; i4++) {
                ((sv3) u14Var.get(i4)).Y.b = true;
            }
            return r0;
        }
        return pp1.A;
    }

    @Override // defpackage.od1
    public final float P(long j) {
        return this.A.P(j);
    }

    @Override // defpackage.vv3
    public final uv3 V(int i, int i2, Map map, mi2 mi2Var, mi2 mi2Var2) {
        return this.A.V(i, i2, map, mi2Var, mi2Var2);
    }

    @Override // defpackage.od1
    public final int Y(float f) {
        return this.A.Y(f);
    }

    @Override // defpackage.od1
    public final float b() {
        return this.A.B;
    }

    @Override // defpackage.s43
    public final sd3 getLayoutDirection() {
        return this.A.A;
    }

    @Override // defpackage.od1
    public final long i0(long j) {
        return this.A.i0(j);
    }

    @Override // defpackage.od1
    public final float n0(long j) {
        return this.A.n0(j);
    }

    @Override // defpackage.od1
    public final float o() {
        return this.A.L;
    }

    @Override // defpackage.vv3
    public final uv3 s0(int i, int i2, Map map, mi2 mi2Var) {
        return this.A.V(i, i2, map, null, mi2Var);
    }

    @Override // defpackage.od1
    public final long v0(float f) {
        return this.A.v0(f);
    }

    @Override // defpackage.s43
    public final boolean w() {
        return this.A.w();
    }

    @Override // defpackage.od1
    public final long z(float f) {
        return this.A.z(f);
    }
}

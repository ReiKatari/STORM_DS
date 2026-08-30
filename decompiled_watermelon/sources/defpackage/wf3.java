package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wf3  reason: default package */
/* loaded from: classes.dex */
public final class wf3 {
    public final zb a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public zb h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public wf3(zb zbVar, int i) {
        this.j = i;
        this.a = zbVar;
    }

    public static final void a(wf3 wf3Var, ds2 ds2Var, int i, m74 m74Var) {
        float intBitsToFloat;
        float f;
        HashMap hashMap = wf3Var.i;
        float f2 = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f2) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f2) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (wf3Var.j) {
                    case 0:
                        vg4 vg4Var = m74Var.I0;
                        if (vg4Var != null) {
                            tn2 tn2Var = (tn2) vg4Var;
                            float[] b = tn2Var.b();
                            if (!tn2Var.n0) {
                                j = kv3.b(j, b);
                            }
                        }
                        j = mj2.M(j, m74Var.w0);
                        break;
                    default:
                        hs3 W0 = m74Var.W0();
                        W0.getClass();
                        long j2 = W0.k0;
                        j = mb4.e((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                m74Var = m74Var.n0;
                m74Var.getClass();
                if (m74Var.equals(wf3Var.a.r())) {
                    if (ds2Var instanceof ds2) {
                        intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    }
                    int round = Math.round(intBitsToFloat);
                    if (hashMap.containsKey(ds2Var)) {
                        int intValue = ((Number) zt3.i0(ds2Var, hashMap)).intValue();
                        ds2 ds2Var2 = xb.a;
                        round = ((Number) ds2Var.a.j(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(ds2Var, Integer.valueOf(round));
                    return;
                }
            } while (!wf3Var.b(m74Var).containsKey(ds2Var));
            long floatToRawIntBits3 = Float.floatToRawIntBits(wf3Var.c(m74Var, ds2Var));
            floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
            floatToRawIntBits2 = floatToRawIntBits3 & 4294967295L;
        }
    }

    public final Map b(m74 m74Var) {
        switch (this.j) {
            case 0:
                return m74Var.G0().e();
            default:
                hs3 W0 = m74Var.W0();
                W0.getClass();
                return W0.G0().e();
        }
    }

    public final int c(m74 m74Var, ds2 ds2Var) {
        switch (this.j) {
            case 0:
                return m74Var.j0(ds2Var);
            default:
                hs3 W0 = m74Var.W0();
                W0.getClass();
                return W0.j0(ds2Var);
        }
    }

    public final boolean d() {
        if (!this.c && !this.e && !this.f && !this.g) {
            return false;
        }
        return true;
    }

    public final boolean e() {
        h();
        if (this.h != null) {
            return true;
        }
        return false;
    }

    public final void f() {
        this.b = true;
        zb zbVar = this.a;
        zb t = zbVar.t();
        if (t == null) {
            return;
        }
        if (this.c) {
            t.b0();
        } else if (this.e || this.d) {
            t.requestLayout();
        }
        if (this.f) {
            zbVar.b0();
        }
        if (this.g) {
            zbVar.requestLayout();
        }
        t.e().f();
    }

    public final void g() {
        HashMap hashMap = this.i;
        hashMap.clear();
        yb ybVar = new yb(0, this);
        zb zbVar = this.a;
        zbVar.n(ybVar);
        hashMap.putAll(b(zbVar.r()));
        this.b = false;
    }

    public final void h() {
        wf3 e;
        wf3 e2;
        boolean d = d();
        zb zbVar = this.a;
        if (!d) {
            zb t = zbVar.t();
            if (t != null) {
                zbVar = t.e().h;
                if (zbVar == null || !zbVar.e().d()) {
                    zb zbVar2 = this.h;
                    if (zbVar2 != null && !zbVar2.e().d()) {
                        zb t2 = zbVar2.t();
                        if (t2 != null && (e2 = t2.e()) != null) {
                            e2.h();
                        }
                        zb t3 = zbVar2.t();
                        if (t3 != null && (e = t3.e()) != null) {
                            zbVar = e.h;
                        } else {
                            zbVar = null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.h = zbVar;
    }
}

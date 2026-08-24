package defpackage;

import java.util.HashMap;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tm3  reason: default package */
/* loaded from: classes.dex */
public final class tm3 {
    public final nc a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public nc h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public tm3(nc ncVar, int i) {
        this.j = i;
        this.a = ncVar;
    }

    public static final void a(tm3 tm3Var, ey2 ey2Var, int i, eg4 eg4Var) {
        float intBitsToFloat;
        float f;
        HashMap hashMap = tm3Var.i;
        float f2 = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f2) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f2) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (tm3Var.j) {
                    case 0:
                        yp4 yp4Var = eg4Var.J0;
                        if (yp4Var != null) {
                            xt2 xt2Var = (xt2) yp4Var;
                            float[] b = xt2Var.b();
                            if (!xt2Var.o0) {
                                j = v24.b(j, b);
                            }
                        }
                        j = kn2.U(j, eg4Var.x0);
                        break;
                    default:
                        mz3 W0 = eg4Var.W0();
                        W0.getClass();
                        long j2 = W0.l0;
                        j = jk4.f((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                eg4Var = eg4Var.o0;
                eg4Var.getClass();
                if (eg4Var.equals(tm3Var.a.f())) {
                    if (ey2Var instanceof ey2) {
                        intBitsToFloat = Float.intBitsToFloat((int) (j & 4294967295L));
                    } else {
                        intBitsToFloat = Float.intBitsToFloat((int) (j >> 32));
                    }
                    int round = Math.round(intBitsToFloat);
                    if (hashMap.containsKey(ey2Var)) {
                        int intValue = ((Number) c14.j0(hashMap, ey2Var)).intValue();
                        ey2 ey2Var2 = lc.a;
                        round = ((Number) ey2Var.a.o(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(ey2Var, Integer.valueOf(round));
                    return;
                }
            } while (!tm3Var.b(eg4Var).containsKey(ey2Var));
            long floatToRawIntBits3 = Float.floatToRawIntBits(tm3Var.c(eg4Var, ey2Var));
            floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
            floatToRawIntBits2 = floatToRawIntBits3 & 4294967295L;
        }
    }

    public final Map b(eg4 eg4Var) {
        switch (this.j) {
            case 0:
                return eg4Var.G0().b();
            default:
                mz3 W0 = eg4Var.W0();
                W0.getClass();
                return W0.G0().b();
        }
    }

    public final int c(eg4 eg4Var, ey2 ey2Var) {
        switch (this.j) {
            case 0:
                return eg4Var.X(ey2Var);
            default:
                mz3 W0 = eg4Var.W0();
                W0.getClass();
                return W0.X(ey2Var);
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
        nc ncVar = this.a;
        nc j = ncVar.j();
        if (j == null) {
            return;
        }
        if (this.c) {
            j.S();
        } else if (this.e || this.d) {
            j.requestLayout();
        }
        if (this.f) {
            ncVar.S();
        }
        if (this.g) {
            ncVar.requestLayout();
        }
        j.b().f();
    }

    public final void g() {
        HashMap hashMap = this.i;
        hashMap.clear();
        mc mcVar = new mc(this, 0);
        nc ncVar = this.a;
        ncVar.G(mcVar);
        hashMap.putAll(b(ncVar.f()));
        this.b = false;
    }

    public final void h() {
        tm3 b;
        tm3 b2;
        boolean d = d();
        nc ncVar = this.a;
        if (!d) {
            nc j = ncVar.j();
            if (j != null) {
                ncVar = j.b().h;
                if (ncVar == null || !ncVar.b().d()) {
                    nc ncVar2 = this.h;
                    if (ncVar2 != null && !ncVar2.b().d()) {
                        nc j2 = ncVar2.j();
                        if (j2 != null && (b2 = j2.b()) != null) {
                            b2.h();
                        }
                        nc j3 = ncVar2.j();
                        if (j3 != null && (b = j3.b()) != null) {
                            ncVar = b.h;
                        } else {
                            ncVar = null;
                        }
                    } else {
                        return;
                    }
                }
            } else {
                return;
            }
        }
        this.h = ncVar;
    }
}

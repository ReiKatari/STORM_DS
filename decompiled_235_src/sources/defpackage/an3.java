package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: an3  reason: default package */
/* loaded from: classes.dex */
public final class an3 implements qt6 {
    public kk3 A = kk3.Rtl;
    public float B;
    public float L;
    public final /* synthetic */ gn3 R;

    public an3(gn3 gn3Var) {
        this.R = gn3Var;
    }

    @Override // defpackage.qh1
    public final float Y() {
        return this.L;
    }

    @Override // defpackage.qh1
    public final float a() {
        return this.B;
    }

    @Override // defpackage.eb3
    public final boolean a0() {
        om3 om3Var = this.R.A.C0.d;
        if (om3Var != om3.LookaheadLayingOut && om3Var != om3.LookaheadMeasuring) {
            return false;
        }
        return true;
    }

    @Override // defpackage.eb3
    public final kk3 getLayoutDirection() {
        return this.A;
    }

    @Override // defpackage.g34
    public final f34 o0(int i, int i2, Map map, qn2 qn2Var, qn2 qn2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            p53.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new zm3(i, i2, map, qn2Var, this, this.R, qn2Var2);
    }

    @Override // defpackage.qt6
    public final List v(eo2 eo2Var, Object obj) {
        gn3 gn3Var = this.R;
        gn3Var.h();
        sm3 sm3Var = gn3Var.A;
        om3 om3Var = sm3Var.C0.d;
        om3 om3Var2 = om3.Measuring;
        if (om3Var != om3Var2 && om3Var != om3.LayingOut && om3Var != om3.LookaheadMeasuring && om3Var != om3.LookaheadLayingOut) {
            p53.c("subcompose can only be used inside the measure or layout blocks");
        }
        ja4 ja4Var = gn3Var.Z;
        Object g = ja4Var.g(obj);
        if (g == null) {
            g = (sm3) gn3Var.f0.k(obj);
            if (g != null) {
                ym3 ym3Var = (ym3) gn3Var.Y.g(g);
                if (gn3Var.k0 <= 0) {
                    p53.c("Check failed.");
                }
                gn3Var.k0--;
            } else {
                g = gn3Var.n(obj);
                if (g == null) {
                    int i = gn3Var.R;
                    sm3 sm3Var2 = new sm3(2);
                    sm3Var.m0 = true;
                    sm3Var.B(i, sm3Var2);
                    sm3Var.m0 = false;
                    g = sm3Var2;
                }
            }
            ja4Var.m(obj, g);
        }
        sm3 sm3Var3 = (sm3) g;
        if (gt0.K0(gn3Var.R, sm3Var.o()) != sm3Var3) {
            int i2 = ((ua4) ((aa4) sm3Var.o()).B).i(sm3Var3);
            if (i2 < gn3Var.R) {
                p53.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i3 = gn3Var.R;
            if (i3 != i2) {
                gn3Var.j(i2, i3);
            }
        }
        gn3Var.R++;
        gn3Var.m(sm3Var3, obj, false, eo2Var);
        if (om3Var != om3Var2 && om3Var != om3.LayingOut) {
            return sm3Var3.l();
        }
        return sm3Var3.m();
    }
}

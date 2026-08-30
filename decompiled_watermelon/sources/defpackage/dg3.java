package defpackage;

import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dg3  reason: default package */
/* loaded from: classes.dex */
public final class dg3 implements zh6 {
    public sd3 A = sd3.Rtl;
    public float B;
    public float L;
    public final /* synthetic */ jg3 R;

    public dg3(jg3 jg3Var) {
        this.R = jg3Var;
    }

    @Override // defpackage.zh6
    public final List N(aj2 aj2Var, Object obj) {
        jg3 jg3Var = this.R;
        jg3Var.h();
        vf3 vf3Var = jg3Var.A;
        rf3 rf3Var = vf3Var.B0.d;
        rf3 rf3Var2 = rf3.Measuring;
        if (rf3Var != rf3Var2 && rf3Var != rf3.LayingOut && rf3Var != rf3.LookaheadMeasuring && rf3Var != rf3.LookaheadLayingOut) {
            mz2.c("subcompose can only be used inside the measure or layout blocks");
        }
        d24 d24Var = jg3Var.Z;
        Object g = d24Var.g(obj);
        if (g == null) {
            g = (vf3) jg3Var.e0.k(obj);
            if (g != null) {
                bg3 bg3Var = (bg3) jg3Var.Y.g(g);
                if (jg3Var.j0 <= 0) {
                    mz2.c("Check failed.");
                }
                jg3Var.j0--;
            } else {
                g = jg3Var.n(obj);
                if (g == null) {
                    int i = jg3Var.R;
                    vf3 vf3Var2 = new vf3(2);
                    vf3Var.l0 = true;
                    vf3Var.A(i, vf3Var2);
                    vf3Var.l0 = false;
                    g = vf3Var2;
                }
            }
            d24Var.m(obj, g);
        }
        vf3 vf3Var3 = (vf3) g;
        if (tq0.N0(jg3Var.R, vf3Var.o()) != vf3Var3) {
            int j = ((o24) ((u14) vf3Var.o()).B).j(vf3Var3);
            if (j < jg3Var.R) {
                mz2.a("Key \"" + obj + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i2 = jg3Var.R;
            if (i2 != j) {
                jg3Var.j(j, i2);
            }
        }
        jg3Var.R++;
        jg3Var.m(vf3Var3, obj, false, aj2Var);
        if (rf3Var != rf3Var2 && rf3Var != rf3.LayingOut) {
            return vf3Var3.l();
        }
        return vf3Var3.m();
    }

    @Override // defpackage.vv3
    public final uv3 V(int i, int i2, Map map, mi2 mi2Var, mi2 mi2Var2) {
        if ((i & (-16777216)) != 0 || ((-16777216) & i2) != 0) {
            mz2.c("Size(" + i + " x " + i2 + ") is out of range. Each dimension must be between 0 and 16777215.");
        }
        return new cg3(i, i2, map, mi2Var, this, this.R, mi2Var2);
    }

    @Override // defpackage.od1
    public final float b() {
        return this.B;
    }

    @Override // defpackage.s43
    public final sd3 getLayoutDirection() {
        return this.A;
    }

    @Override // defpackage.od1
    public final float o() {
        return this.L;
    }

    @Override // defpackage.s43
    public final boolean w() {
        rf3 rf3Var = this.R.A.B0.d;
        if (rf3Var != rf3.LookaheadLayingOut && rf3Var != rf3.LookaheadMeasuring) {
            return false;
        }
        return true;
    }
}

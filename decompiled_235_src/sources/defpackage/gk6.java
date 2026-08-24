package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gk6  reason: default package */
/* loaded from: classes.dex */
public final class gk6 implements qn2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ bs0 B;
    public final /* synthetic */ int L;
    public final /* synthetic */ qa4 R;
    public final /* synthetic */ float X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ qa4 Z;

    public gk6(boolean z, bs0 bs0Var, int i, qa4 qa4Var, float f, boolean z2, qa4 qa4Var2) {
        this.A = z;
        this.B = bs0Var;
        this.L = i;
        this.R = qa4Var;
        this.X = f;
        this.Y = z2;
        this.Z = qa4Var2;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i;
        KeyEvent keyEvent = ((wg3) obj).a;
        bs0 bs0Var = this.B;
        float f = bs0Var.b;
        if (!this.A) {
            return Boolean.FALSE;
        }
        int u = xk2.u(keyEvent);
        boolean z = false;
        if (u == 2) {
            float f2 = bs0Var.a;
            float abs = Math.abs(f - f2);
            int i2 = this.L;
            if (i2 > 0) {
                i = i2 + 1;
            } else {
                i = 100;
            }
            float f3 = abs / i;
            long e = qo2.e(keyEvent.getKeyCode());
            boolean a = kg3.a(e, kg3.d);
            float f4 = this.X;
            qa4 qa4Var = this.R;
            if (a) {
                ((qn2) qa4Var.getValue()).g(gi2.t(Float.valueOf(f4 + f3), bs0Var));
            } else if (kg3.a(e, kg3.e)) {
                ((qn2) qa4Var.getValue()).g(gi2.t(Float.valueOf(f4 - f3), bs0Var));
            } else {
                boolean a2 = kg3.a(e, kg3.g);
                int i3 = -1;
                boolean z2 = this.Y;
                if (a2) {
                    if (!z2) {
                        i3 = 1;
                    }
                    ((qn2) qa4Var.getValue()).g(gi2.t(Float.valueOf((i3 * f3) + f4), bs0Var));
                } else if (kg3.a(e, kg3.f)) {
                    if (!z2) {
                        i3 = 1;
                    }
                    ((qn2) qa4Var.getValue()).g(gi2.t(Float.valueOf(f4 - (i3 * f3)), bs0Var));
                } else if (kg3.a(e, kg3.x)) {
                    ((qn2) qa4Var.getValue()).g(Float.valueOf(f2));
                } else if (kg3.a(e, kg3.y)) {
                    ((qn2) qa4Var.getValue()).g(Float.valueOf(f));
                } else if (kg3.a(e, kg3.F)) {
                    ((qn2) qa4Var.getValue()).g(gi2.t(Float.valueOf(f4 - (gi2.q(i / 10, 1, 10) * f3)), bs0Var));
                } else {
                    if (kg3.a(e, kg3.G)) {
                        ((qn2) qa4Var.getValue()).g(gi2.t(Float.valueOf((gi2.q(i / 10, 1, 10) * f3) + f4), bs0Var));
                    }
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
        if (u == 1) {
            long e2 = qo2.e(keyEvent.getKeyCode());
            if (kg3.a(e2, kg3.d) || kg3.a(e2, kg3.e) || kg3.a(e2, kg3.g) || kg3.a(e2, kg3.f) || kg3.a(e2, kg3.x) || kg3.a(e2, kg3.y) || kg3.a(e2, kg3.F) || kg3.a(e2, kg3.G)) {
                on2 on2Var = (on2) this.Z.getValue();
                if (on2Var != null) {
                    on2Var.c();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

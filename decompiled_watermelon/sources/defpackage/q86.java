package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q86  reason: default package */
/* loaded from: classes.dex */
public final class q86 implements mi2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ op0 B;
    public final /* synthetic */ k24 L;
    public final /* synthetic */ float R;
    public final /* synthetic */ boolean X;
    public final /* synthetic */ k24 Y;

    public q86(boolean z, op0 op0Var, k24 k24Var, float f, boolean z2, k24 k24Var2) {
        this.A = z;
        this.B = op0Var;
        this.L = k24Var;
        this.R = f;
        this.X = z2;
        this.Y = k24Var2;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        KeyEvent keyEvent = ((da3) obj).a;
        op0 op0Var = this.B;
        float f = op0Var.b;
        if (!this.A) {
            return Boolean.FALSE;
        }
        int C = hi2.C(keyEvent);
        boolean z = false;
        if (C == 2) {
            float f2 = op0Var.a;
            float abs = Math.abs(f - f2) / 100.0f;
            long f3 = jk2.f(keyEvent.getKeyCode());
            boolean a = r93.a(f3, r93.d);
            float f4 = this.R;
            k24 k24Var = this.L;
            if (a) {
                ((mi2) k24Var.getValue()).n(io2.p(Float.valueOf(f4 + abs), op0Var));
            } else if (r93.a(f3, r93.e)) {
                ((mi2) k24Var.getValue()).n(io2.p(Float.valueOf(f4 - abs), op0Var));
            } else {
                boolean a2 = r93.a(f3, r93.g);
                int i = -1;
                boolean z2 = this.X;
                if (a2) {
                    if (!z2) {
                        i = 1;
                    }
                    ((mi2) k24Var.getValue()).n(io2.p(Float.valueOf((i * abs) + f4), op0Var));
                } else if (r93.a(f3, r93.f)) {
                    if (!z2) {
                        i = 1;
                    }
                    ((mi2) k24Var.getValue()).n(io2.p(Float.valueOf(f4 - (i * abs)), op0Var));
                } else if (r93.a(f3, r93.x)) {
                    ((mi2) k24Var.getValue()).n(Float.valueOf(f2));
                } else if (r93.a(f3, r93.y)) {
                    ((mi2) k24Var.getValue()).n(Float.valueOf(f));
                } else if (r93.a(f3, r93.F)) {
                    ((mi2) k24Var.getValue()).n(io2.p(Float.valueOf(f4 - (io2.m(10, 1, 10) * abs)), op0Var));
                } else {
                    if (r93.a(f3, r93.G)) {
                        ((mi2) k24Var.getValue()).n(io2.p(Float.valueOf((io2.m(10, 1, 10) * abs) + f4), op0Var));
                    }
                    return Boolean.valueOf(z);
                }
            }
            z = true;
            return Boolean.valueOf(z);
        }
        if (C == 1) {
            long f5 = jk2.f(keyEvent.getKeyCode());
            if (r93.a(f5, r93.d) || r93.a(f5, r93.e) || r93.a(f5, r93.g) || r93.a(f5, r93.f) || r93.a(f5, r93.x) || r93.a(f5, r93.y) || r93.a(f5, r93.F) || r93.a(f5, r93.G)) {
                ki2 ki2Var = (ki2) this.Y.getValue();
                if (ki2Var != null) {
                    ki2Var.c();
                }
                z = true;
            }
        }
        return Boolean.valueOf(z);
    }
}

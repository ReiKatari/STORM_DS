package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sx5  reason: default package */
/* loaded from: classes.dex */
public final class sx5 implements mi2 {
    public final /* synthetic */ float A;
    public final /* synthetic */ op0 B;
    public final /* synthetic */ pj4 L;

    public sx5(float f, op0 op0Var, pj4 pj4Var) {
        this.A = f;
        this.B = op0Var;
        this.L = pj4Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        KeyEvent keyEvent = ((da3) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (hi2.C(keyEvent) == 2) {
            long f = jk2.f(keyEvent.getKeyCode());
            boolean a = r93.a(f, r93.j);
            op0 op0Var = this.B;
            float f2 = this.A;
            pj4 pj4Var = this.L;
            if (!a && !r93.a(f, r93.f)) {
                if (r93.a(f, r93.i) || r93.a(f, r93.g)) {
                    float h = pj4Var.h() + f2;
                    float f3 = op0Var.b;
                    if (h > f3) {
                        h = f3;
                    }
                    pj4Var.i(h);
                }
            } else {
                float h2 = pj4Var.h() - f2;
                float f4 = op0Var.a;
                if (h2 < f4) {
                    h2 = f4;
                }
                pj4Var.i(h2);
            }
            z = true;
        }
        return Boolean.valueOf(z);
    }
}

package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fl5  reason: default package */
/* loaded from: classes.dex */
public final class fl5 implements mi2 {
    public final /* synthetic */ ya1 A;
    public final /* synthetic */ mi2 B;
    public final /* synthetic */ mi2 L;
    public final /* synthetic */ rg5 R;

    public fl5(ya1 ya1Var, mi2 mi2Var, mi2 mi2Var2, rg5 rg5Var) {
        this.A = ya1Var;
        this.B = mi2Var;
        this.L = mi2Var2;
        this.R = rg5Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        KeyEvent keyEvent = ((da3) obj).a;
        keyEvent.getClass();
        if (keyEvent.getAction() == 0) {
            long f = jk2.f(keyEvent.getKeyCode());
            boolean a = r93.a(f, r93.I);
            mi2 mi2Var = this.B;
            ya1 ya1Var = this.A;
            if (a) {
                if (ya1Var.k() > 0) {
                    mi2Var.n(((f12) gl5.getEntries()).get(ya1Var.k() - 1));
                    return Boolean.TRUE;
                }
            } else if (r93.a(f, r93.J)) {
                if (ya1Var.k() < l07.P(gl5.getEntries())) {
                    mi2Var.n(((f12) gl5.getEntries()).get(ya1Var.k() + 1));
                    return Boolean.TRUE;
                }
            } else if (r93.a(f, r93.M)) {
                this.L.n(this.R);
            }
        }
        return Boolean.FALSE;
    }
}

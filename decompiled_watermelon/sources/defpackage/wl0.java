package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wl0  reason: default package */
/* loaded from: classes.dex */
public final class wl0 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ k24 B;

    public /* synthetic */ wl0(k24 k24Var, int i) {
        this.A = i;
        this.B = k24Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        boolean z = false;
        k24 k24Var = this.B;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((da3) obj).a;
                keyEvent.getClass();
                if (hi2.C(keyEvent) == 2 && r93.a(jk2.f(keyEvent.getKeyCode()), r93.E)) {
                    k24Var.setValue(Boolean.TRUE);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                KeyEvent keyEvent2 = ((da3) obj).a;
                keyEvent2.getClass();
                if (hi2.C(keyEvent2) == 2 && r93.a(jk2.f(keyEvent2.getKeyCode()), r93.E)) {
                    k24Var.setValue(Boolean.TRUE);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

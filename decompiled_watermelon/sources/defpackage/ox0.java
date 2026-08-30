package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ox0  reason: default package */
/* loaded from: classes.dex */
public final class ox0 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ ki2 B;

    public /* synthetic */ ox0(int i, ki2 ki2Var) {
        this.A = i;
        this.B = ki2Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i = this.A;
        boolean z = false;
        ki2 ki2Var = this.B;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((da3) obj).a;
                keyEvent.getClass();
                if (hi2.C(keyEvent) == 2 && (r93.a(jk2.f(keyEvent.getKeyCode()), r93.H) || r93.a(jk2.f(keyEvent.getKeyCode()), r93.a))) {
                    ki2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                KeyEvent keyEvent2 = ((da3) obj).a;
                keyEvent2.getClass();
                if (hi2.C(keyEvent2) == 2 && (r93.a(jk2.f(keyEvent2.getKeyCode()), r93.H) || r93.a(jk2.f(keyEvent2.getKeyCode()), r93.a))) {
                    ki2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                KeyEvent keyEvent3 = ((da3) obj).a;
                keyEvent3.getClass();
                if (hi2.C(keyEvent3) == 2 && (r93.a(jk2.f(keyEvent3.getKeyCode()), r93.H) || r93.a(jk2.f(keyEvent3.getKeyCode()), r93.a))) {
                    ki2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                KeyEvent keyEvent4 = ((da3) obj).a;
                keyEvent4.getClass();
                if (hi2.C(keyEvent4) == 2 && r93.a(jk2.f(keyEvent4.getKeyCode()), r93.H)) {
                    ki2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                KeyEvent keyEvent5 = ((da3) obj).a;
                keyEvent5.getClass();
                if (hi2.C(keyEvent5) == 2 && r93.a(jk2.f(keyEvent5.getKeyCode()), r93.H)) {
                    ki2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                KeyEvent keyEvent6 = ((da3) obj).a;
                keyEvent6.getClass();
                if (hi2.C(keyEvent6) == 2 && (r93.a(jk2.f(keyEvent6.getKeyCode()), r93.H) || r93.a(jk2.f(keyEvent6.getKeyCode()), r93.a))) {
                    ki2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

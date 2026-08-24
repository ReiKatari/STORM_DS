package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m01  reason: default package */
/* loaded from: classes.dex */
public final class m01 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ on2 B;

    public /* synthetic */ m01(int i, on2 on2Var) {
        this.A = i;
        this.B = on2Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        boolean z = false;
        on2 on2Var = this.B;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((wg3) obj).a;
                keyEvent.getClass();
                if (xk2.u(keyEvent) == 2 && (kg3.a(qo2.e(keyEvent.getKeyCode()), kg3.H) || kg3.a(qo2.e(keyEvent.getKeyCode()), kg3.a))) {
                    on2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 1:
                KeyEvent keyEvent2 = ((wg3) obj).a;
                keyEvent2.getClass();
                if (xk2.u(keyEvent2) == 2 && (kg3.a(qo2.e(keyEvent2.getKeyCode()), kg3.H) || kg3.a(qo2.e(keyEvent2.getKeyCode()), kg3.a))) {
                    on2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 2:
                KeyEvent keyEvent3 = ((wg3) obj).a;
                keyEvent3.getClass();
                if (xk2.u(keyEvent3) == 2 && (kg3.a(qo2.e(keyEvent3.getKeyCode()), kg3.H) || kg3.a(qo2.e(keyEvent3.getKeyCode()), kg3.a))) {
                    on2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                KeyEvent keyEvent4 = ((wg3) obj).a;
                keyEvent4.getClass();
                if (xk2.u(keyEvent4) == 2 && kg3.a(qo2.e(keyEvent4.getKeyCode()), kg3.H)) {
                    on2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
            case 4:
                KeyEvent keyEvent5 = ((wg3) obj).a;
                keyEvent5.getClass();
                if (xk2.u(keyEvent5) == 2 && kg3.a(qo2.e(keyEvent5.getKeyCode()), kg3.H)) {
                    on2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                KeyEvent keyEvent6 = ((wg3) obj).a;
                keyEvent6.getClass();
                if (xk2.u(keyEvent6) == 2 && (kg3.a(qo2.e(keyEvent6.getKeyCode()), kg3.H) || kg3.a(qo2.e(keyEvent6.getKeyCode()), kg3.a))) {
                    on2Var.c();
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

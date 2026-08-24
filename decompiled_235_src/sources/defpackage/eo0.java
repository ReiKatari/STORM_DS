package defpackage;

import android.view.KeyEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: eo0  reason: default package */
/* loaded from: classes.dex */
public final class eo0 implements qn2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ qa4 B;

    public /* synthetic */ eo0(qa4 qa4Var, int i) {
        this.A = i;
        this.B = qa4Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i = this.A;
        boolean z = false;
        qa4 qa4Var = this.B;
        switch (i) {
            case 0:
                KeyEvent keyEvent = ((wg3) obj).a;
                keyEvent.getClass();
                if (xk2.u(keyEvent) == 2 && kg3.a(qo2.e(keyEvent.getKeyCode()), kg3.E)) {
                    qa4Var.setValue(Boolean.TRUE);
                    z = true;
                }
                return Boolean.valueOf(z);
            default:
                KeyEvent keyEvent2 = ((wg3) obj).a;
                keyEvent2.getClass();
                if (xk2.u(keyEvent2) == 2 && kg3.a(qo2.e(keyEvent2.getKeyCode()), kg3.E)) {
                    np2.c(qa4Var, true);
                    z = true;
                }
                return Boolean.valueOf(z);
        }
    }
}

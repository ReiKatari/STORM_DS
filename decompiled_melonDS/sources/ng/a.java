package ng;

import android.view.KeyEvent;
import mc.l;
import n2.w0;
import t3.c;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements l {
    public final /* synthetic */ int A;
    public final /* synthetic */ w0 B;

    public /* synthetic */ a(w0 w0Var, int i2) {
        this.A = i2;
        this.B = w0Var;
    }

    @Override // mc.l
    public final Object k(Object obj) {
        boolean z10;
        boolean z11;
        switch (this.A) {
            case 0:
                KeyEvent keyEvent = ((t3.b) obj).f13107a;
                keyEvent.getClass();
                if (c.c(keyEvent) == 2 && t3.a.a(c.a(keyEvent.getKeyCode()), t3.a.E)) {
                    this.B.setValue(Boolean.TRUE);
                    z10 = true;
                } else {
                    z10 = false;
                }
                return Boolean.valueOf(z10);
            default:
                KeyEvent keyEvent2 = ((t3.b) obj).f13107a;
                keyEvent2.getClass();
                if (c.c(keyEvent2) == 2 && t3.a.a(c.a(keyEvent2.getKeyCode()), t3.a.E)) {
                    this.B.setValue(Boolean.TRUE);
                    z11 = true;
                } else {
                    z11 = false;
                }
                return Boolean.valueOf(z11);
        }
    }
}

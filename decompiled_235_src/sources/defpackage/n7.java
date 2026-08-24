package defpackage;

import android.view.KeyEvent;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n7  reason: default package */
/* loaded from: classes.dex */
public final class n7 implements qn2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ int B;
    public final /* synthetic */ qn2 L;
    public final /* synthetic */ qa4 R;
    public final /* synthetic */ kk3 X;

    public n7(List list, int i, qn2 qn2Var, qa4 qa4Var, kk3 kk3Var) {
        this.A = list;
        this.B = i;
        this.L = qn2Var;
        this.R = qa4Var;
        this.X = kk3Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i;
        KeyEvent keyEvent = ((wg3) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (xk2.u(keyEvent) == 2 && ((Boolean) this.R.getValue()).booleanValue()) {
            long e = qo2.e(keyEvent.getKeyCode());
            if (kg3.a(e, kg3.f)) {
                i = -1;
            } else if (kg3.a(e, kg3.g)) {
                i = 1;
            } else {
                i = 0;
            }
            if (this.X != kk3.Ltr) {
                i = -i;
            }
            if (i != 0) {
                List list = this.A;
                int size = list.size();
                int i2 = this.B + i;
                if (i2 >= 0 && i2 < size) {
                    this.L.g(Long.valueOf(((c6) list.get(i2)).a));
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}

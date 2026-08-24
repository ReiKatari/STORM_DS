package defpackage;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p5  reason: default package */
/* loaded from: classes.dex */
public final class p5 implements qn2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ kk3 B;
    public final /* synthetic */ ts4 L;

    public p5(List list, kk3 kk3Var, ts4 ts4Var) {
        this.A = list;
        this.B = kk3Var;
        this.L = ts4Var;
    }

    @Override // defpackage.qn2
    public final Object g(Object obj) {
        int i;
        ts4 ts4Var;
        KeyEvent keyEvent = ((wg3) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (xk2.u(keyEvent) == 2) {
            long e = qo2.e(keyEvent.getKeyCode());
            int i2 = -1;
            if (kg3.a(e, kg3.K)) {
                i = -1;
            } else if (kg3.a(e, kg3.L)) {
                i = 1;
            } else {
                i = 0;
            }
            if (this.B != kk3.Ltr) {
                i = -i;
            }
            List list = this.A;
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                ts4Var = this.L;
                if (!hasNext) {
                    break;
                } else if (((c6) it.next()).a == ts4Var.h()) {
                    i2 = i3;
                    break;
                } else {
                    i3++;
                }
            }
            if (i != 0) {
                int size = list.size();
                int i4 = i2 + i;
                if (i4 >= 0 && i4 < size) {
                    ts4Var.i(((c6) list.get(i4)).a);
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}

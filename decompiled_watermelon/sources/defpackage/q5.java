package defpackage;

import android.view.KeyEvent;
import java.util.Iterator;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: q5  reason: default package */
/* loaded from: classes.dex */
public final class q5 implements mi2 {
    public final /* synthetic */ List A;
    public final /* synthetic */ sd3 B;
    public final /* synthetic */ rj4 L;

    public q5(List list, sd3 sd3Var, rj4 rj4Var) {
        this.A = list;
        this.B = sd3Var;
        this.L = rj4Var;
    }

    @Override // defpackage.mi2
    public final Object n(Object obj) {
        int i;
        rj4 rj4Var;
        KeyEvent keyEvent = ((da3) obj).a;
        keyEvent.getClass();
        boolean z = false;
        if (hi2.C(keyEvent) == 2) {
            long f = jk2.f(keyEvent.getKeyCode());
            int i2 = -1;
            if (r93.a(f, r93.K)) {
                i = -1;
            } else if (r93.a(f, r93.L)) {
                i = 1;
            } else {
                i = 0;
            }
            if (this.B != sd3.Ltr) {
                i = -i;
            }
            List list = this.A;
            Iterator it = list.iterator();
            int i3 = 0;
            while (true) {
                boolean hasNext = it.hasNext();
                rj4Var = this.L;
                if (!hasNext) {
                    break;
                } else if (((c6) it.next()).a == rj4Var.h()) {
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
                    rj4Var.i(((c6) list.get(i4)).a);
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}

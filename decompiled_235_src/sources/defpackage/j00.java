package defpackage;

import android.view.View;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j00  reason: default package */
/* loaded from: classes.dex */
public final class j00 implements fl1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j00(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.fl1
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((e00) obj2).b((pw0) obj);
                return;
            case 1:
                ((ku3) ((sb4) obj2).d0.k).c((cj1) obj);
                return;
            case 2:
                ((g53) obj2).a.j((e53) obj);
                return;
            case 3:
                ((rr3) obj2).L.k(obj);
                return;
            case 4:
                for (sb4 sb4Var : (List) ((pp6) obj2).getValue()) {
                    ((uw0) obj).b().c(sb4Var);
                }
                return;
            case 5:
                ((e00) obj2).b((ax0) obj);
                return;
            case 6:
                qa4 qa4Var = (qa4) obj2;
                l25 l25Var = (l25) qa4Var.getValue();
                if (l25Var != null) {
                    k25 k25Var = new k25(l25Var);
                    r94 r94Var = (r94) obj;
                    if (r94Var != null) {
                        r94Var.b(k25Var);
                    }
                    qa4Var.setValue(null);
                    return;
                }
                return;
            case 7:
                ((f47) obj2).c.remove((qn2) obj);
                return;
            case 8:
                ((ga7) obj2).j.remove((ga7) obj);
                return;
            case 9:
                ga7 ga7Var = (ga7) obj2;
                ga7Var.getClass();
                v97 v97Var = (v97) ((w97) obj).b.getValue();
                if (v97Var != null) {
                    ga7Var.i.remove(v97Var.A);
                    return;
                }
                return;
            case 10:
                ((ga7) obj2).i.remove((ca7) obj);
                return;
            default:
                dv7 dv7Var = (dv7) obj2;
                View view = (View) obj;
                int i2 = dv7Var.u - 1;
                dv7Var.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = ao7.a;
                    sn7.c(view, null);
                    ao7.p(view, null);
                    view.removeOnAttachStateChangeListener(dv7Var.v);
                    return;
                }
                return;
        }
    }
}

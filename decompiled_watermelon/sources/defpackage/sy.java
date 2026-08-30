package defpackage;

import android.view.View;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sy  reason: default package */
/* loaded from: classes.dex */
public final class sy implements bh1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ sy(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // defpackage.bh1
    public final void dispose() {
        int i = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((ny) obj2).b((tt0) obj);
                return;
            case 1:
                ((in3) ((l34) obj2).c0.k).c((ye1) obj);
                return;
            case 2:
                ((dz2) obj2).a.k((az2) obj);
                return;
            case 3:
                ((rk3) obj2).L.k(obj);
                return;
            case 4:
                for (l34 l34Var : (List) ((ae6) obj2).getValue()) {
                    ((yt0) obj).b().c(l34Var);
                }
                return;
            case 5:
                ((ny) obj2).b((eu0) obj);
                return;
            case ig7.b /* 6 */:
                k24 k24Var = (k24) obj2;
                jt4 jt4Var = (jt4) k24Var.getValue();
                if (jt4Var != null) {
                    it4 it4Var = new it4(jt4Var);
                    l14 l14Var = (l14) obj;
                    if (l14Var != null) {
                        l14Var.b(it4Var);
                    }
                    k24Var.setValue(null);
                    return;
                }
                return;
            case 7:
                ((qr6) obj2).c.remove((mi2) obj);
                return;
            case 8:
                ((kx6) obj2).j.remove((kx6) obj);
                return;
            case 9:
                kx6 kx6Var = (kx6) obj2;
                kx6Var.getClass();
                zw6 zw6Var = (zw6) ((ax6) obj).b.getValue();
                if (zw6Var != null) {
                    kx6Var.i.remove(zw6Var.A);
                    return;
                }
                return;
            case 10:
                ((kx6) obj2).i.remove((gx6) obj);
                return;
            default:
                dg7 dg7Var = (dg7) obj2;
                View view = (View) obj;
                int i2 = dg7Var.u - 1;
                dg7Var.u = i2;
                if (i2 == 0) {
                    WeakHashMap weakHashMap = aa7.a;
                    s97.c(view, null);
                    aa7.p(view, null);
                    view.removeOnAttachStateChangeListener(dg7Var.v);
                    return;
                }
                return;
        }
    }
}

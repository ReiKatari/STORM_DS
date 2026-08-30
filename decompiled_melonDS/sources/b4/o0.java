package b4;

import android.content.Context;
import android.view.View;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 implements n2.g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f1906a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f1907b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f1908c;

    public /* synthetic */ o0(int i2, Object obj, Object obj2) {
        this.f1906a = i2;
        this.f1907b = obj;
        this.f1908c = obj2;
    }

    @Override // n2.g0
    public final void dispose() {
        int i2 = this.f1906a;
        Object obj = this.f1908c;
        Object obj2 = this.f1907b;
        switch (i2) {
            case 0:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((p0) obj);
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                ((Context) obj2).getApplicationContext().unregisterComponentCallbacks((q0) obj);
                return;
            case 2:
                ((androidx.lifecycle.z) ((a7.i) obj2).f576b0.f3262k).c((b7.l) obj);
                return;
            case 3:
                for (a7.i iVar : (List) ((n2.s2) obj2).getValue()) {
                    ((b7.i) obj).b().c(iVar);
                }
                return;
            case 4:
                ((d1.e0) obj2).f3556a.j((d1.c0) obj);
                return;
            case l1.c.f8511g /* 5 */:
                ((d1.q1) obj2).f3658j.remove((d1.q1) obj);
                return;
            case l1.c.f8509e /* 6 */:
                d1.q1 q1Var = (d1.q1) obj2;
                q1Var.getClass();
                d1.j1 j1Var = (d1.j1) ((d1.k1) obj).f3598b.getValue();
                if (j1Var != null) {
                    q1Var.f3657i.remove(j1Var.A);
                    return;
                }
                return;
            case 7:
                ((d1.q1) obj2).f3657i.remove((d1.n1) obj);
                return;
            case 8:
                ((f.b) obj2).b((e.g) obj);
                return;
            case l1.c.f8508d /* 9 */:
                ((f.b) obj2).b((e.h) obj);
                return;
            case l1.c.f8510f /* 10 */:
                l1.c2 c2Var = (l1.c2) obj2;
                View view = (View) obj;
                int i10 = c2Var.f8538u - 1;
                c2Var.f8538u = i10;
                if (i10 == 0) {
                    WeakHashMap weakHashMap = a6.x0.f533a;
                    a6.p0.k(view, null);
                    a6.x0.q(view, null);
                    view.removeOnAttachStateChangeListener(c2Var.f8539v);
                    return;
                }
                return;
            case 11:
                ((p1.z0) obj2).L.k(obj);
                return;
            case 12:
                n2.w0 w0Var = (n2.w0) obj2;
                j1.k kVar = (j1.k) w0Var.getValue();
                if (kVar != null) {
                    j1.j jVar = new j1.j(kVar);
                    j1.i iVar2 = (j1.i) obj;
                    if (iVar2 != null) {
                        iVar2.b(jVar);
                    }
                    w0Var.setValue(null);
                    return;
                }
                return;
            default:
                ((u1.o1) obj2).f13378c.remove((mc.l) obj);
                return;
        }
    }
}

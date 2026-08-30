package rh;

import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.e1;
import androidx.lifecycle.s0;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class k implements mc.a {
    public final /* synthetic */ int A;
    public final /* synthetic */ me.magnum.melonds.ui.layouteditor.b B;

    public /* synthetic */ k(me.magnum.melonds.ui.layouteditor.b bVar, int i2) {
        this.A = i2;
        this.B = bVar;
    }

    @Override // mc.a
    public final Object b() {
        a1 a1Var;
        w6.c cVar;
        switch (this.A) {
            case 0:
                e1 e6 = s0.e(this.B);
                if (e6 != null) {
                    d1 viewModelStore = e6.getViewModelStore();
                    boolean z10 = e6 instanceof androidx.lifecycle.k;
                    if (z10) {
                        a1Var = ((androidx.lifecycle.k) e6).getDefaultViewModelProviderFactory();
                    } else {
                        a1Var = y6.b.f14781a;
                    }
                    if (z10) {
                        cVar = ((androidx.lifecycle.k) e6).getDefaultViewModelCreationExtras();
                    } else {
                        cVar = w6.a.f14160b;
                    }
                    viewModelStore.getClass();
                    a1Var.getClass();
                    cVar.getClass();
                    b9.e eVar = new b9.e(viewModelStore, a1Var, cVar);
                    nc.e a10 = nc.u.a(e0.class);
                    String b10 = a10.b();
                    if (b10 != null) {
                        return (e0) eVar.B("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10);
                    }
                    a0.j.h("Local and anonymous classes can not be ViewModels");
                } else {
                    a0.j.p("No view-model store owner found");
                }
                return null;
            case DSiCameraSource.FrontCamera /* 1 */:
                me.magnum.melonds.ui.layouteditor.b.i(this.B);
                break;
            case 2:
                me.magnum.melonds.ui.layouteditor.b.e(this.B);
                break;
            case 3:
                me.magnum.melonds.ui.layouteditor.b.f(this.B);
                break;
            default:
                me.magnum.melonds.ui.layouteditor.b.c(this.B);
                break;
        }
        return yb.y.f14813a;
    }
}

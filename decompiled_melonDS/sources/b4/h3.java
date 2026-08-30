package b4;

import android.view.View;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h3 implements androidx.lifecycle.v {
    public final /* synthetic */ ah.h0 A;
    public final /* synthetic */ a1 B;
    public final /* synthetic */ n2.u1 L;
    public final /* synthetic */ nc.t R;
    public final /* synthetic */ View X;

    public h3(ah.h0 h0Var, a1 a1Var, n2.u1 u1Var, nc.t tVar, View view) {
        this.A = h0Var;
        this.B = a1Var;
        this.L = u1Var;
        this.R = tVar;
        this.X = view;
    }

    @Override // androidx.lifecycle.v
    public final void d(androidx.lifecycle.x xVar, androidx.lifecycle.p pVar) {
        boolean z10;
        zc.g gVar = null;
        switch (f3.f1846a[pVar.ordinal()]) {
            case DSiCameraSource.FrontCamera /* 1 */:
                zc.x.v(this.A, null, zc.w.UNDISPATCHED, new a9.e(this.R, this.L, xVar, this, this.X, null, 2), 1);
                return;
            case 2:
                a1 a1Var = this.B;
                if (a1Var != null) {
                    e9.a aVar = (e9.a) a1Var.L;
                    synchronized (aVar.f4415b) {
                        try {
                            synchronized (aVar.f4415b) {
                                z10 = aVar.f4414a;
                            }
                            if (!z10) {
                                ArrayList arrayList = (ArrayList) aVar.f4416c;
                                aVar.f4416c = (ArrayList) aVar.f4417d;
                                aVar.f4417d = arrayList;
                                aVar.f4414a = true;
                                int size = arrayList.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    ((cc.c) arrayList.get(i2)).h(yb.y.f14813a);
                                }
                                arrayList.clear();
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                }
                n2.u1 u1Var = this.L;
                synchronized (u1Var.f10041c) {
                    if (u1Var.f10057t) {
                        u1Var.f10057t = false;
                        gVar = u1Var.y();
                    }
                }
                if (gVar != null) {
                    ((zc.h) gVar).h(yb.y.f14813a);
                    return;
                }
                return;
            case 3:
                n2.u1 u1Var2 = this.L;
                synchronized (u1Var2.f10041c) {
                    u1Var2.f10057t = true;
                }
                return;
            case 4:
                this.L.x();
                return;
            case l1.c.f8511g /* 5 */:
            case l1.c.f8509e /* 6 */:
            case 7:
                return;
            default:
                m9.o.o();
                return;
        }
    }
}

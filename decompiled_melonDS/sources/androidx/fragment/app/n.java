package androidx.fragment.app;

import android.util.Log;
import android.view.ViewGroup;
import b4.u2;
import b4.v2;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o oVar, Object obj, ViewGroup viewGroup) {
        super(0);
        this.B = 1;
        this.L = oVar;
        this.R = obj;
        this.X = viewGroup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v5, types: [u5.a, java.lang.Object] */
    @Override // mc.a
    public final Object b() {
        switch (this.B) {
            case 0:
                ((o) this.L).f1368f.e((ViewGroup) this.X, this.R);
                return yb.y.f14813a;
            case DSiCameraSource.FrontCamera /* 1 */:
                o oVar = (o) this.L;
                ArrayList arrayList = oVar.f1365c;
                z1 z1Var = oVar.f1368f;
                if (!arrayList.isEmpty()) {
                    int size = arrayList.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = arrayList.get(i2);
                        i2++;
                        if (!((p) obj).f1343a.f1277g) {
                            if (g1.K(2)) {
                                Log.v("FragmentManager", "Completing animating immediately");
                            }
                            ?? obj2 = new Object();
                            z1Var.u(((p) arrayList.get(0)).f1343a.f1273c, this.R, obj2, new x(3, oVar));
                            obj2.a();
                            return yb.y.f14813a;
                        }
                    }
                }
                if (g1.K(2)) {
                    Log.v("FragmentManager", "Animating to start");
                }
                Object obj3 = oVar.f1378q;
                obj3.getClass();
                z1Var.d(obj3, new m(oVar, (ViewGroup) this.X));
                return yb.y.f14813a;
            default:
                b4.a aVar = (b4.a) this.L;
                aVar.removeOnAttachStateChangeListener((v2) this.X);
                ij.a.Y(aVar).f6289a.remove((u2) this.R);
                return yb.y.f14813a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i2) {
        super(0);
        this.B = i2;
        this.L = obj;
        this.X = obj2;
        this.R = obj3;
    }
}

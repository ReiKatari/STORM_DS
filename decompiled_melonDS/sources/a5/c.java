package a5;

import android.util.Log;
import android.view.ViewGroup;
import androidx.fragment.app.g1;
import androidx.fragment.app.z1;
import java.io.Serializable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c extends nc.l implements mc.a {
    public final /* synthetic */ int B;
    public final /* synthetic */ Object L;
    public final /* synthetic */ Object R;
    public final /* synthetic */ Object X;
    public final /* synthetic */ Serializable Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(Object obj, Object obj2, Object obj3, Serializable serializable, int i2) {
        super(0);
        this.B = i2;
        this.L = obj;
        this.R = obj2;
        this.X = obj3;
        this.Y = serializable;
    }

    @Override // mc.a
    public final Object b() {
        switch (this.B) {
            case 0:
                ((i0) this.L).g((mc.a) this.R, (f0) this.X, (x4.m) this.Y);
                return yb.y.f14813a;
            default:
                ViewGroup viewGroup = (ViewGroup) this.R;
                androidx.fragment.app.o oVar = (androidx.fragment.app.o) this.L;
                if (g1.K(2)) {
                    Log.v("FragmentManager", "Attempting to create TransitionSeekController");
                }
                z1 z1Var = oVar.f1368f;
                Object obj = this.X;
                Object i2 = z1Var.i(viewGroup, obj);
                oVar.f1378q = i2;
                if (i2 == null) {
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "TransitionSeekController was not created.");
                    }
                    oVar.f1379r = true;
                } else {
                    ((nc.t) this.Y).A = new androidx.fragment.app.n(oVar, obj, viewGroup);
                    if (g1.K(2)) {
                        Log.v("FragmentManager", "Started executing operations from " + oVar.f1366d + " to " + oVar.f1367e);
                    }
                }
                return yb.y.f14813a;
        }
    }
}

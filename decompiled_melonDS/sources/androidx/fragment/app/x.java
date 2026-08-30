package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class x implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ x(int i2, Object obj) {
        this.A = i2;
        this.B = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.A) {
            case 0:
                j0 j0Var = (j0) this.B;
                a2 a2Var = j0Var.mViewLifecycleOwner;
                a2Var.Y.b(j0Var.mSavedViewRegistryState);
                j0Var.mSavedViewRegistryState = null;
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                mc.a aVar = (mc.a) ((nc.t) this.B).A;
                if (aVar != null) {
                    aVar.b();
                    return;
                }
                return;
            case 2:
                s1.a(4, (ArrayList) this.B);
                return;
            case 3:
                o oVar = (o) this.B;
                if (g1.K(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                ArrayList arrayList = oVar.f1365c;
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    ((p) obj).f1343a.c(oVar);
                }
                return;
            default:
                ArrayList arrayList2 = ((g1) this.B).f1322n;
                int size2 = arrayList2.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj2 = arrayList2.get(i10);
                    i10++;
                    ((ci.m) obj2).getClass();
                }
                return;
        }
    }
}

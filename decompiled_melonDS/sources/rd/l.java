package rd;

import android.util.Log;
import java.lang.ref.WeakReference;
import k7.a0;
import l.x;
import yb.y;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l implements cd.i {
    public static final l A = new Object();

    @Override // cd.i
    public final Object a(Object obj, cc.c cVar) {
        int nightMode = ((gg.a) obj).getNightMode();
        a0 a0Var = l.m.A;
        if (nightMode != -1 && nightMode != 0 && nightMode != 1 && nightMode != 2 && nightMode != 3) {
            Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
        } else if (l.m.B != nightMode) {
            l.m.B = nightMode;
            synchronized (l.m.f8439b0) {
                try {
                    a1.f fVar = l.m.Z;
                    fVar.getClass();
                    a1.a aVar = new a1.a(fVar);
                    while (aVar.hasNext()) {
                        l.m mVar = (l.m) ((WeakReference) aVar.next()).get();
                        if (mVar != null) {
                            ((x) mVar).n(true, true);
                        }
                    }
                } finally {
                }
            }
        }
        return y.f14813a;
    }
}

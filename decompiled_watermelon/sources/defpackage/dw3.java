package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: dw3  reason: default package */
/* loaded from: classes.dex */
public final class dw3 implements w92 {
    public static final dw3 B = new dw3(0);
    public static final dw3 L = new dw3(1);
    public final /* synthetic */ int A;

    public /* synthetic */ dw3(int i) {
        this.A = i;
    }

    @Override // defpackage.w92
    public final Object b(Object obj, j11 j11Var) {
        switch (this.A) {
            case 0:
                int nightMode = ((ps6) obj).getNightMode();
                k06 k06Var = hq.A;
                if (nightMode != -1 && nightMode != 0 && nightMode != 1 && nightMode != 2 && nightMode != 3) {
                    Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
                } else if (hq.B != nightMode) {
                    hq.B = nightMode;
                    synchronized (hq.c0) {
                        try {
                            hu huVar = hq.Z;
                            huVar.getClass();
                            au auVar = new au(huVar);
                            while (auVar.hasNext()) {
                                hq hqVar = (hq) ((WeakReference) auVar.next()).get();
                                if (hqVar != null) {
                                    ((tq) hqVar).l(true, true);
                                }
                            }
                        } finally {
                        }
                    }
                }
                return o27.a;
            default:
                ky kyVar = (ky) obj;
                return o27.a;
        }
    }
}

package defpackage;

import android.util.Log;
import java.lang.ref.WeakReference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: p34  reason: default package */
/* loaded from: classes.dex */
public final class p34 implements ne2 {
    public static final p34 B = new p34(0);
    public static final p34 L = new p34(1);
    public final /* synthetic */ int A;

    public /* synthetic */ p34(int i) {
        this.A = i;
    }

    @Override // defpackage.ne2
    public final Object a(Object obj, r41 r41Var) {
        switch (this.A) {
            case 0:
                int nightMode = ((g57) obj).getNightMode();
                zb6 zb6Var = tq.A;
                if (nightMode != -1 && nightMode != 0 && nightMode != 1 && nightMode != 2 && nightMode != 3) {
                    Log.d("AppCompatDelegate", "setDefaultNightMode() called with an unknown mode");
                } else if (tq.B != nightMode) {
                    tq.B = nightMode;
                    synchronized (tq.d0) {
                        try {
                            zu zuVar = tq.Z;
                            zuVar.getClass();
                            su suVar = new su(zuVar);
                            while (suVar.hasNext()) {
                                tq tqVar = (tq) ((WeakReference) suVar.next()).get();
                                if (tqVar != null) {
                                    ((fr) tqVar).q(true, true);
                                }
                            }
                        } finally {
                        }
                    }
                }
                return jg7.a;
            default:
                b00 b00Var = (b00) obj;
                return jg7.a;
        }
    }
}

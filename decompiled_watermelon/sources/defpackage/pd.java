package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pd  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class pd implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ ee B;

    public /* synthetic */ pd(ee eeVar, int i) {
        this.A = i;
        this.B = eeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        ee eeVar = this.B;
        switch (i) {
            case 0:
                xt xtVar = eeVar.g0;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!xtVar.isEmpty()) {
                    try {
                        ((ki2) xtVar.removeLast()).c();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                eeVar.y1 = false;
                MotionEvent motionEvent = eeVar.q1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    eeVar.E(motionEvent);
                    return;
                } else {
                    i.n("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                ee.k(eeVar.getRoot());
                return;
            default:
                ee.k(eeVar.getRoot());
                return;
        }
    }
}

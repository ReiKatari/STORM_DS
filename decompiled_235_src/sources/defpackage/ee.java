package defpackage;

import android.os.Trace;
import android.view.MotionEvent;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ee  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class ee implements Runnable {
    public final /* synthetic */ int A;
    public final /* synthetic */ te B;

    public /* synthetic */ ee(te teVar, int i) {
        this.A = i;
        this.B = teVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.A;
        te teVar = this.B;
        switch (i) {
            case 0:
                pu puVar = teVar.h0;
                Trace.beginSection("AndroidOwner:outOfFrameExecutor");
                while (!puVar.isEmpty()) {
                    try {
                        ((on2) puVar.removeLast()).c();
                    } finally {
                        Trace.endSection();
                    }
                }
                return;
            case 1:
                teVar.z1 = false;
                MotionEvent motionEvent = teVar.r1;
                motionEvent.getClass();
                if (motionEvent.getActionMasked() == 10) {
                    teVar.E(motionEvent);
                    return;
                } else {
                    i.m("The ACTION_HOVER_EXIT event was not cleared.");
                    return;
                }
            case 2:
                te.k(teVar.getRoot());
                return;
            default:
                te.k(teVar.getRoot());
                return;
        }
    }
}

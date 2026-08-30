package defpackage;

import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import androidx.recyclerview.widget.RecyclerView;
import java.util.function.Consumer;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hu0  reason: default package */
/* loaded from: classes.dex */
public final class hu0 implements ScrollCaptureCallback {
    public final iz5 a;
    public final e33 b;
    public final dz4 c;
    public final ee d;
    public final g11 e;
    public final es2 f;

    public hu0(iz5 iz5Var, e33 e33Var, g11 g11Var, dz4 dz4Var, ee eeVar) {
        this.a = iz5Var;
        this.b = e33Var;
        this.c = dz4Var;
        this.d = eeVar;
        this.e = new g11(g11Var.B.C(wf1.B));
        this.f = new es2(e33Var.a(), new cc(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x008f, code lost:
        if (r9 == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00da  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(defpackage.hu0 r11, android.view.ScrollCaptureSession r12, defpackage.e33 r13, defpackage.k11 r14) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hu0.a(hu0, android.view.ScrollCaptureSession, e33, k11):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        tq5.w(this.e, s74.B, null, new y(this, runnable, null, 23), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        kd6 w = tq5.w(this.e, null, null, new m5(this, scrollCaptureSession, rect, consumer, null, 6), 3);
        w.R(new yb(10, cancellationSignal));
        cancellationSignal.setOnCancelListener(new iu0(0, w));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(ve2.T(this.b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f.b = RecyclerView.A1;
        ((tj4) this.c.A).setValue(Boolean.TRUE);
        runnable.run();
    }
}

package h4;

import ah.h0;
import android.graphics.Rect;
import android.os.CancellationSignal;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import b4.x;
import d2.t;
import i3.z;
import i4.p;
import java.util.function.Consumer;
import n2.f1;
import x4.k;
import zc.i1;
import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements ScrollCaptureCallback {

    /* renamed from: a  reason: collision with root package name */
    public final p f6068a;

    /* renamed from: b  reason: collision with root package name */
    public final k f6069b;

    /* renamed from: c  reason: collision with root package name */
    public final t f6070c;

    /* renamed from: d  reason: collision with root package name */
    public final x f6071d;

    /* renamed from: e  reason: collision with root package name */
    public final h0 f6072e;

    /* renamed from: f  reason: collision with root package name */
    public final f f6073f;

    public c(p pVar, k kVar, h0 h0Var, t tVar, x xVar) {
        this.f6068a = pVar;
        this.f6069b = kVar;
        this.f6070c = tVar;
        this.f6071d = xVar;
        this.f6072e = new h0(h0Var.B.H(d.A));
        this.f6073f = new f(kVar.a(), new g2.b(this, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x00a2, code lost:
        if (r10 == r1) goto L31;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00ef  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(h4.c r12, android.view.ScrollCaptureSession r13, x4.k r14, ec.c r15) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h4.c.a(h4.c, android.view.ScrollCaptureSession, x4.k, ec.c):java.lang.Object");
    }

    public final void onScrollCaptureEnd(Runnable runnable) {
        zc.x.v(this.f6072e, i1.B, null, new di.b(this, runnable, null, 15), 2);
    }

    public final void onScrollCaptureImageRequest(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Rect rect, Consumer consumer) {
        l1 v10 = zc.x.v(this.f6072e, null, null, new a9.d(this, scrollCaptureSession, rect, consumer, (cc.c) null, 15), 3);
        v10.I(new a4.a(14, cancellationSignal));
        cancellationSignal.setOnCancelListener(new d2.k(1, v10));
    }

    public final void onScrollCaptureSearch(CancellationSignal cancellationSignal, Consumer consumer) {
        consumer.accept(z.w(this.f6069b));
    }

    public final void onScrollCaptureStart(ScrollCaptureSession scrollCaptureSession, CancellationSignal cancellationSignal, Runnable runnable) {
        this.f6073f.f6075b = 0.0f;
        ((f1) this.f6070c.B).setValue(Boolean.TRUE);
        runnable.run();
    }
}

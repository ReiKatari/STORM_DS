package p1;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements d1, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {

    /* renamed from: b0  reason: collision with root package name */
    public static long f11175b0;
    public final View A;
    public boolean L;
    public boolean Y;
    public long Z;
    public final PriorityQueue B = new PriorityQueue(11, new a4.e0(8));
    public final Choreographer R = Choreographer.getInstance();
    public final l.g0 X = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003e, code lost:
        if (r0 >= 30.0f) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, l.g0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public a(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.A = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            a4.e0 r1 = new a4.e0
            r2 = 8
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.B = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.R = r0
            l.g0 r0 = new l.g0
            r0.<init>()
            r4.X = r0
            long r0 = p1.a.f11175b0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L4b
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L41
            if (r0 == 0) goto L41
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L41
            goto L43
        L41:
            r0 = 1114636288(0x42700000, float:60.0)
        L43:
            r1 = 1000000000(0x3b9aca00, float:0.0047237873)
            float r1 = (float) r1
            float r1 = r1 / r0
            long r0 = (long) r1
            p1.a.f11175b0 = r0
        L4b:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L57
            r5 = 1
            r4.Y = r5
        L57:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.a.<init>(android.view.View):void");
    }

    @Override // p1.d1
    public final void a(b1 b1Var) {
        this.B.add(new g1(1, b1Var));
        if (!this.L) {
            this.L = true;
            this.A.post(this);
        }
    }

    public final boolean b() {
        l.g0 g0Var = this.X;
        long a10 = g0Var.a();
        p7.k.y(a10, "compose:lazy:prefetch:available_time_nanos");
        boolean z10 = true;
        if (a10 > 0) {
            PriorityQueue priorityQueue = this.B;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((g1) peek).f11211b.c(g0Var)) {
                priorityQueue.poll();
                z10 = false;
            }
            g0Var.f8418a = false;
        }
        return z10;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j2) {
        if (this.Y) {
            this.Z = j2;
            this.A.post(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.Y = true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.Y = false;
        this.A.removeCallbacks(this);
        this.R.removeFrameCallback(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z10;
        PriorityQueue priorityQueue = this.B;
        if (!priorityQueue.isEmpty() && this.L && this.Y) {
            View view = this.A;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                if (System.nanoTime() > (2 * f11175b0) + nanos) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                l.g0 g0Var = this.X;
                g0Var.f8418a = z10;
                g0Var.f8419b = Math.max(this.Z, nanos) + f11175b0;
                boolean z11 = false;
                while (!priorityQueue.isEmpty() && !z11) {
                    if (g0Var.f8418a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z11 = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z11 = b();
                    }
                }
                if (z11) {
                    this.R.postFrameCallback(this);
                } else {
                    this.L = false;
                }
                p7.k.y(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.L = false;
    }
}

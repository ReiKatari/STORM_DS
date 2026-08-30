package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rj  reason: default package */
/* loaded from: classes.dex */
public final class rj implements zs4, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long c0;
    public final View A;
    public boolean L;
    public boolean Y;
    public long Z;
    public final PriorityQueue B = new PriorityQueue(11, new pj(0));
    public final Choreographer R = Choreographer.getInstance();
    public final qj X = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r0 >= 30.0f) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [qj, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public rj(android.view.View r5) {
        /*
            r4 = this;
            r4.<init>()
            r4.A = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            pj r1 = new pj
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.B = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.R = r0
            qj r0 = new qj
            r0.<init>()
            r4.X = r0
            long r0 = defpackage.rj.c0
            r2 = 0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L49
            android.view.Display r0 = r5.getDisplay()
            boolean r1 = r5.isInEditMode()
            if (r1 != 0) goto L40
            if (r0 == 0) goto L40
            float r0 = r0.getRefreshRate()
            r1 = 1106247680(0x41f00000, float:30.0)
            int r1 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r1 < 0) goto L40
            goto L42
        L40:
            r0 = 1114636288(0x42700000, float:60.0)
        L42:
            r1 = 1315859240(0x4e6e6b28, float:1.0E9)
            float r1 = r1 / r0
            long r0 = (long) r1
            defpackage.rj.c0 = r0
        L49:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L55
            r5 = 1
            r4.Y = r5
        L55:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rj.<init>(android.view.View):void");
    }

    @Override // defpackage.zs4
    public final void a(ys4 ys4Var) {
        this.B.add(new au4(1, ys4Var));
        if (!this.L) {
            this.L = true;
            this.A.post(this);
        }
    }

    public final boolean b() {
        qj qjVar = this.X;
        long a = qjVar.a();
        a53.U(a, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (a > 0) {
            PriorityQueue priorityQueue = this.B;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((au4) peek).b.c(qjVar)) {
                priorityQueue.poll();
                z = false;
            }
            qjVar.a = false;
        }
        return z;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        if (this.Y) {
            this.Z = j;
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
        boolean z;
        PriorityQueue priorityQueue = this.B;
        if (!priorityQueue.isEmpty() && this.L && this.Y) {
            View view = this.A;
            if (view.getWindowVisibility() == 0) {
                long nanos = TimeUnit.MILLISECONDS.toNanos(view.getDrawingTime());
                if (System.nanoTime() > (2 * c0) + nanos) {
                    z = true;
                } else {
                    z = false;
                }
                qj qjVar = this.X;
                qjVar.a = z;
                qjVar.b = Math.max(this.Z, nanos) + c0;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (qjVar.a) {
                        Trace.beginSection("compose:lazy:prefetch:idle_frame");
                        try {
                            z2 = b();
                        } finally {
                            Trace.endSection();
                        }
                    } else {
                        z2 = b();
                    }
                }
                if (z2) {
                    this.R.postFrameCallback(this);
                } else {
                    this.L = false;
                }
                a53.U(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.L = false;
    }
}

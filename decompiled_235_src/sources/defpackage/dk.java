package defpackage;

import android.os.Trace;
import android.view.Choreographer;
import android.view.Display;
import android.view.View;
import java.util.PriorityQueue;
import java.util.concurrent.TimeUnit;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk  reason: default package */
/* loaded from: classes.dex */
public final class dk implements b25, View.OnAttachStateChangeListener, Runnable, Choreographer.FrameCallback {
    public static long d0;
    public final View A;
    public boolean L;
    public boolean Y;
    public long Z;
    public final PriorityQueue B = new PriorityQueue(11, new bk(0));
    public final Choreographer R = Choreographer.getInstance();
    public final ck X = new Object();

    /* JADX WARN: Code restructure failed: missing block: B:8:0x003d, code lost:
        if (r0 >= 30.0f) goto L8;
     */
    /* JADX WARN: Type inference failed for: r0v2, types: [ck, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public dk(View view) {
        float f;
        this.A = view;
        if (d0 == 0) {
            Display display = view.getDisplay();
            if (!view.isInEditMode() && display != null) {
                f = display.getRefreshRate();
            }
            f = 60.0f;
            d0 = 1.0E9f / f;
        }
        view.addOnAttachStateChangeListener(this);
        if (view.isAttachedToWindow()) {
            this.Y = true;
        }
    }

    @Override // defpackage.b25
    public final void a(a25 a25Var) {
        this.B.add(new e35(1, a25Var));
        if (!this.L) {
            this.L = true;
            this.A.post(this);
        }
    }

    public final boolean b() {
        ck ckVar = this.X;
        long a = ckVar.a();
        lb4.J(a, "compose:lazy:prefetch:available_time_nanos");
        boolean z = true;
        if (a > 0) {
            PriorityQueue priorityQueue = this.B;
            Object peek = priorityQueue.peek();
            peek.getClass();
            if (!((e35) peek).b.c(ckVar)) {
                priorityQueue.poll();
                z = false;
            }
            ckVar.a = false;
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
                if (System.nanoTime() > (2 * d0) + nanos) {
                    z = true;
                } else {
                    z = false;
                }
                ck ckVar = this.X;
                ckVar.a = z;
                ckVar.b = Math.max(this.Z, nanos) + d0;
                boolean z2 = false;
                while (!priorityQueue.isEmpty() && !z2) {
                    if (ckVar.a) {
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
                lb4.J(0L, "compose:lazy:prefetch:available_time_nanos");
                return;
            }
        }
        this.L = false;
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk  reason: default package */
/* loaded from: classes.dex */
public final class dk implements defpackage.b25, android.view.View.OnAttachStateChangeListener, java.lang.Runnable, android.view.Choreographer.FrameCallback {
    public static long d0;
    public final android.view.View A;
    public final java.util.PriorityQueue B;
    public boolean L;
    public final android.view.Choreographer R;
    public final defpackage.ck X;
    public boolean Y;
    public long Z;

    public dk(android.view.View r5) {
            r4 = this;
            r4.<init>()
            r4.A = r5
            java.util.PriorityQueue r0 = new java.util.PriorityQueue
            bk r1 = new bk
            r2 = 0
            r1.<init>(r2)
            r2 = 11
            r0.<init>(r2, r1)
            r4.B = r0
            android.view.Choreographer r0 = android.view.Choreographer.getInstance()
            r4.R = r0
            ck r0 = new ck
            r0.<init>()
            r4.X = r0
            long r0 = defpackage.dk.d0
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
            defpackage.dk.d0 = r0
        L49:
            r5.addOnAttachStateChangeListener(r4)
            boolean r5 = r5.isAttachedToWindow()
            if (r5 == 0) goto L55
            r5 = 1
            r4.Y = r5
        L55:
            return
    }

    @Override // defpackage.b25
    public final void a(defpackage.a25 r3) {
            r2 = this;
            e35 r0 = new e35
            r1 = 1
            r0.<init>(r1, r3)
            java.util.PriorityQueue r3 = r2.B
            r3.add(r0)
            boolean r3 = r2.L
            if (r3 != 0) goto L16
            r2.L = r1
            android.view.View r3 = r2.A
            r3.post(r2)
        L16:
            return
    }

    public final boolean b() {
            r5 = this;
            ck r0 = r5.X
            long r1 = r0.a()
            java.lang.String r3 = "compose:lazy:prefetch:available_time_nanos"
            defpackage.lb4.J(r1, r3)
            r3 = 0
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r2 = 1
            if (r1 <= 0) goto L2d
            java.util.PriorityQueue r5 = r5.B
            java.lang.Object r1 = r5.peek()
            r1.getClass()
            e35 r1 = (defpackage.e35) r1
            a25 r1 = r1.b
            boolean r1 = r1.c(r0)
            r3 = 0
            if (r1 == 0) goto L27
            goto L2b
        L27:
            r5.poll()
            r2 = r3
        L2b:
            r0.a = r3
        L2d:
            return r2
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long r2) {
            r1 = this;
            boolean r0 = r1.Y
            if (r0 == 0) goto Lb
            r1.Z = r2
            android.view.View r2 = r1.A
            r2.post(r1)
        Lb:
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            r1 = 1
            r0.Y = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.Y = r1
            android.view.View r1 = r0.A
            r1.removeCallbacks(r0)
            android.view.Choreographer r1 = r0.R
            r1.removeFrameCallback(r0)
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            java.util.PriorityQueue r0 = r11.B
            boolean r1 = r0.isEmpty()
            r2 = 0
            if (r1 != 0) goto L7a
            boolean r1 = r11.L
            if (r1 == 0) goto L7a
            boolean r1 = r11.Y
            if (r1 == 0) goto L7a
            android.view.View r1 = r11.A
            int r3 = r1.getWindowVisibility()
            if (r3 == 0) goto L1a
            goto L7a
        L1a:
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r4 = r1.getDrawingTime()
            long r3 = r3.toNanos(r4)
            long r5 = java.lang.System.nanoTime()
            r7 = 2
            long r9 = defpackage.dk.d0
            long r7 = r7 * r9
            long r7 = r7 + r3
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 <= 0) goto L34
            r1 = 1
            goto L35
        L34:
            r1 = r2
        L35:
            ck r5 = r11.X
            r5.a = r1
            long r6 = r11.Z
            long r3 = java.lang.Math.max(r6, r3)
            long r6 = defpackage.dk.d0
            long r3 = r3 + r6
            r5.b = r3
            r1 = r2
        L45:
            boolean r3 = r0.isEmpty()
            if (r3 != 0) goto L68
            if (r1 != 0) goto L68
            boolean r1 = r5.a
            if (r1 == 0) goto L63
            java.lang.String r1 = "compose:lazy:prefetch:idle_frame"
            android.os.Trace.beginSection(r1)
            boolean r1 = r11.b()     // Catch: java.lang.Throwable -> L5e
            android.os.Trace.endSection()
            goto L45
        L5e:
            r11 = move-exception
            android.os.Trace.endSection()
            throw r11
        L63:
            boolean r1 = r11.b()
            goto L45
        L68:
            if (r1 == 0) goto L70
            android.view.Choreographer r0 = r11.R
            r0.postFrameCallback(r11)
            goto L72
        L70:
            r11.L = r2
        L72:
            java.lang.String r11 = "compose:lazy:prefetch:available_time_nanos"
            r0 = 0
            defpackage.lb4.J(r0, r11)
            return
        L7a:
            r11.L = r2
            return
    }
}

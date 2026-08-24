package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ik2  reason: default package */
/* loaded from: classes.dex */
public abstract class ik2 implements android.view.View.OnTouchListener, android.view.View.OnAttachStateChangeListener {
    public final float A;
    public final int B;
    public final int L;
    public final android.view.View R;
    public defpackage.hk2 X;
    public defpackage.hk2 Y;
    public boolean Z;
    public int d0;
    public final int[] e0;

    public ik2(android.view.View r3) {
            r2 = this;
            r2.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2.e0 = r1
            r2.R = r3
            r1 = 1
            r3.setLongClickable(r1)
            r3.addOnAttachStateChangeListener(r2)
            android.content.Context r3 = r3.getContext()
            android.view.ViewConfiguration r3 = android.view.ViewConfiguration.get(r3)
            int r3 = r3.getScaledTouchSlop()
            float r3 = (float) r3
            r2.A = r3
            int r3 = android.view.ViewConfiguration.getTapTimeout()
            r2.B = r3
            int r1 = android.view.ViewConfiguration.getLongPressTimeout()
            int r1 = r1 + r3
            int r1 = r1 / r0
            r2.L = r1
            return
    }

    public final void a() {
            r2 = this;
            hk2 r0 = r2.Y
            android.view.View r1 = r2.R
            if (r0 == 0) goto L9
            r1.removeCallbacks(r0)
        L9:
            hk2 r2 = r2.X
            if (r2 == 0) goto L10
            r1.removeCallbacks(r2)
        L10:
            return
    }

    public abstract defpackage.lh6 b();

    public abstract boolean c();

    public boolean d() {
            r1 = this;
            lh6 r1 = r1.b()
            if (r1 == 0) goto Lf
            boolean r0 = r1.a()
            if (r0 == 0) goto Lf
            r1.dismiss()
        Lf:
            r1 = 1
            return r1
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r13, android.view.MotionEvent r14) {
            r12 = this;
            boolean r13 = r12.Z
            r0 = 3
            android.view.View r1 = r12.R
            r2 = 0
            r3 = 1
            if (r13 == 0) goto L68
            lh6 r4 = r12.b()
            if (r4 == 0) goto L5c
            boolean r5 = r4.a()
            if (r5 != 0) goto L16
            goto L5c
        L16:
            mp1 r4 = r4.j()
            if (r4 == 0) goto L5c
            boolean r5 = r4.isShown()
            if (r5 != 0) goto L23
            goto L5c
        L23:
            android.view.MotionEvent r5 = android.view.MotionEvent.obtainNoHistory(r14)
            int[] r6 = r12.e0
            r1.getLocationOnScreen(r6)
            r1 = r6[r2]
            float r1 = (float) r1
            r7 = r6[r3]
            float r7 = (float) r7
            r5.offsetLocation(r1, r7)
            r4.getLocationOnScreen(r6)
            r1 = r6[r2]
            int r1 = -r1
            float r1 = (float) r1
            r6 = r6[r3]
            int r6 = -r6
            float r6 = (float) r6
            r5.offsetLocation(r1, r6)
            int r1 = r12.d0
            boolean r1 = r4.b(r5, r1)
            r5.recycle()
            int r14 = r14.getActionMasked()
            if (r14 == r3) goto L56
            if (r14 == r0) goto L56
            r14 = r3
            goto L57
        L56:
            r14 = r2
        L57:
            if (r1 == 0) goto L5c
            if (r14 == 0) goto L5c
            goto L62
        L5c:
            boolean r14 = r12.d()
            if (r14 != 0) goto L65
        L62:
            r14 = r3
            goto L111
        L65:
            r14 = r2
            goto L111
        L68:
            boolean r4 = r1.isEnabled()
            if (r4 != 0) goto L70
            goto Lfb
        L70:
            int r4 = r14.getActionMasked()
            if (r4 == 0) goto Lcf
            if (r4 == r3) goto Lcb
            r5 = 2
            if (r4 == r5) goto L7f
            if (r4 == r0) goto Lcb
            goto Lfb
        L7f:
            int r0 = r12.d0
            int r0 = r14.findPointerIndex(r0)
            if (r0 < 0) goto Lfb
            float r4 = r14.getX(r0)
            float r14 = r14.getY(r0)
            float r0 = r12.A
            float r5 = -r0
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 < 0) goto Lb9
            int r5 = (r14 > r5 ? 1 : (r14 == r5 ? 0 : -1))
            if (r5 < 0) goto Lb9
            int r5 = r1.getRight()
            int r6 = r1.getLeft()
            int r5 = r5 - r6
            float r5 = (float) r5
            float r5 = r5 + r0
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 >= 0) goto Lb9
            int r4 = r1.getBottom()
            int r5 = r1.getTop()
            int r4 = r4 - r5
            float r4 = (float) r4
            float r4 = r4 + r0
            int r14 = (r14 > r4 ? 1 : (r14 == r4 ? 0 : -1))
            if (r14 >= 0) goto Lb9
            goto Lfb
        Lb9:
            r12.a()
            android.view.ViewParent r14 = r1.getParent()
            r14.requestDisallowInterceptTouchEvent(r3)
            boolean r14 = r12.c()
            if (r14 == 0) goto Lfb
            r14 = r3
            goto Lfc
        Lcb:
            r12.a()
            goto Lfb
        Lcf:
            int r14 = r14.getPointerId(r2)
            r12.d0 = r14
            hk2 r14 = r12.X
            if (r14 != 0) goto Le0
            hk2 r14 = new hk2
            r14.<init>(r12, r2)
            r12.X = r14
        Le0:
            hk2 r14 = r12.X
            int r0 = r12.B
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
            hk2 r14 = r12.Y
            if (r14 != 0) goto Lf3
            hk2 r14 = new hk2
            r14.<init>(r12, r3)
            r12.Y = r14
        Lf3:
            hk2 r14 = r12.Y
            int r0 = r12.L
            long r4 = (long) r0
            r1.postDelayed(r14, r4)
        Lfb:
            r14 = r2
        Lfc:
            if (r14 == 0) goto L111
            long r4 = android.os.SystemClock.uptimeMillis()
            r10 = 0
            r11 = 0
            r8 = 3
            r9 = 0
            r6 = r4
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r4, r6, r8, r9, r10, r11)
            r1.onTouchEvent(r0)
            r0.recycle()
        L111:
            r12.Z = r14
            if (r14 != 0) goto L119
            if (r13 == 0) goto L118
            goto L119
        L118:
            return r2
        L119:
            return r3
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r1) {
            r0 = this;
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r1) {
            r0 = this;
            r1 = 0
            r0.Z = r1
            r1 = -1
            r0.d0 = r1
            hk2 r1 = r0.X
            if (r1 == 0) goto Lf
            android.view.View r0 = r0.R
            r0.removeCallbacks(r1)
        Lf:
            return
    }
}

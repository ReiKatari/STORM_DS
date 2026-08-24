package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: c83  reason: default package */
/* loaded from: classes.dex */
public final class c83 implements android.view.View.OnTouchListener {
    public final android.app.Dialog A;
    public final int B;
    public final int L;
    public final int R;

    public c83(android.app.Dialog r2, android.graphics.Rect r3) {
            r1 = this;
            r1.<init>()
            r1.A = r2
            int r0 = r3.left
            r1.B = r0
            int r3 = r3.top
            r1.L = r3
            android.content.Context r2 = r2.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = r2.getScaledWindowTouchSlop()
            r1.R = r2
            return
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            r5 = this;
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r0 = r6.findViewById(r0)
            int r1 = r5.B
            int r2 = r0.getLeft()
            int r2 = r2 + r1
            int r1 = r0.getWidth()
            int r1 = r1 + r2
            int r3 = r5.L
            int r4 = r0.getTop()
            int r4 = r4 + r3
            int r0 = r0.getHeight()
            int r0 = r0 + r4
            android.graphics.RectF r3 = new android.graphics.RectF
            float r2 = (float) r2
            float r4 = (float) r4
            float r1 = (float) r1
            float r0 = (float) r0
            r3.<init>(r2, r4, r1, r0)
            float r0 = r7.getX()
            float r1 = r7.getY()
            boolean r0 = r3.contains(r0, r1)
            r1 = 0
            if (r0 == 0) goto L38
            return r1
        L38:
            android.view.MotionEvent r0 = android.view.MotionEvent.obtain(r7)
            int r7 = r7.getAction()
            r2 = 1
            if (r7 != r2) goto L47
            r7 = 4
            r0.setAction(r7)
        L47:
            int r7 = android.os.Build.VERSION.SDK_INT
            r3 = 28
            if (r7 >= r3) goto L5b
            r0.setAction(r1)
            int r7 = r5.R
            int r1 = -r7
            int r1 = r1 - r2
            float r1 = (float) r1
            int r7 = -r7
            int r7 = r7 - r2
            float r7 = (float) r7
            r0.setLocation(r1, r7)
        L5b:
            r6.performClick()
            android.app.Dialog r5 = r5.A
            boolean r5 = r5.onTouchEvent(r0)
            return r5
    }
}

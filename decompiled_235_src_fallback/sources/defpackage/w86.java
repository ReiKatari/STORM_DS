package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w86  reason: default package */
/* loaded from: classes.dex */
public final class w86 extends android.view.TouchDelegate {
    public final android.view.View a;
    public final android.graphics.Rect b;
    public final android.graphics.Rect c;
    public final android.graphics.Rect d;
    public final int e;
    public boolean f;

    public w86(android.view.View r5, android.graphics.Rect r6, android.graphics.Rect r7) {
            r4 = this;
            r4.<init>(r6, r5)
            android.content.Context r0 = r5.getContext()
            android.view.ViewConfiguration r0 = android.view.ViewConfiguration.get(r0)
            int r0 = r0.getScaledTouchSlop()
            r4.e = r0
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r4.b = r1
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r4.d = r2
            android.graphics.Rect r3 = new android.graphics.Rect
            r3.<init>()
            r4.c = r3
            r1.set(r6)
            r2.set(r6)
            int r6 = -r0
            r2.inset(r6, r6)
            r3.set(r7)
            r4.a = r5
            return
    }

    @Override // android.view.TouchDelegate
    public final boolean onTouchEvent(android.view.MotionEvent r9) {
            r8 = this;
            float r0 = r9.getX()
            int r0 = (int) r0
            float r1 = r9.getY()
            int r1 = (int) r1
            int r2 = r9.getAction()
            r3 = 2
            r4 = 0
            r5 = 1
            if (r2 == 0) goto L32
            if (r2 == r5) goto L23
            if (r2 == r3) goto L23
            r6 = 3
            if (r2 == r6) goto L1b
            goto L3e
        L1b:
            boolean r2 = r8.f
            r8.f = r4
        L1f:
            r7 = r5
            r5 = r2
            r2 = r7
            goto L40
        L23:
            boolean r2 = r8.f
            if (r2 == 0) goto L1f
            android.graphics.Rect r6 = r8.d
            boolean r6 = r6.contains(r0, r1)
            if (r6 != 0) goto L1f
            r5 = r2
            r2 = r4
            goto L40
        L32:
            android.graphics.Rect r2 = r8.b
            boolean r2 = r2.contains(r0, r1)
            if (r2 == 0) goto L3e
            r8.f = r5
            r2 = r5
            goto L40
        L3e:
            r2 = r5
            r5 = r4
        L40:
            if (r5 == 0) goto L6e
            android.graphics.Rect r4 = r8.c
            android.view.View r8 = r8.a
            if (r2 == 0) goto L5e
            boolean r2 = r4.contains(r0, r1)
            if (r2 != 0) goto L5e
            int r0 = r8.getWidth()
            int r0 = r0 / r3
            float r0 = (float) r0
            int r1 = r8.getHeight()
            int r1 = r1 / r3
            float r1 = (float) r1
            r9.setLocation(r0, r1)
            goto L69
        L5e:
            int r2 = r4.left
            int r0 = r0 - r2
            float r0 = (float) r0
            int r2 = r4.top
            int r1 = r1 - r2
            float r1 = (float) r1
            r9.setLocation(r0, r1)
        L69:
            boolean r8 = r8.dispatchTouchEvent(r9)
            return r8
        L6e:
            return r4
    }
}

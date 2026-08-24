package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b53  reason: default package */
/* loaded from: classes.dex */
public final class b53 implements android.view.GestureDetector.OnGestureListener {
    public final /* synthetic */ defpackage.k60 a;

    public b53(defpackage.k60 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(android.view.MotionEvent r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(android.view.MotionEvent r4, android.view.MotionEvent r5, float r6, float r7) {
            r3 = this;
            k60 r3 = r3.a
            java.lang.Object r4 = r3.d
            oe r4 = (defpackage.oe) r4
            boolean r5 = r3.c
            r0 = 1
            if (r5 == 0) goto Lc
            goto L4e
        Lc:
            int r3 = r3.b
            r5 = 0
            r1 = 0
            r2 = 2
            if (r3 != r0) goto L30
            float r3 = java.lang.Math.abs(r6)
            float r7 = java.lang.Math.abs(r7)
            int r3 = (r3 > r7 ? 1 : (r3 == r7 ? 0 : -1))
            if (r3 <= 0) goto L4e
            int r3 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r3 <= 0) goto L24
            r2 = r0
        L24:
            te r3 = r4.L
            ah2 r3 = r3.getFocusOwner()
            eh2 r3 = (defpackage.eh2) r3
            r3.g(r2, r5)
            return r0
        L30:
            if (r3 != r2) goto L4e
            float r3 = java.lang.Math.abs(r7)
            float r6 = java.lang.Math.abs(r6)
            int r3 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r3 <= 0) goto L4e
            int r3 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r3 <= 0) goto L43
            r2 = r0
        L43:
            te r3 = r4.L
            ah2 r3 = r3.getFocusOwner()
            eh2 r3 = (defpackage.eh2) r3
            r3.g(r2, r5)
        L4e:
            return r0
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(android.view.MotionEvent r1) {
            r0 = this;
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(android.view.MotionEvent r1, android.view.MotionEvent r2, float r3, float r4) {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(android.view.MotionEvent r1) {
            r0 = this;
            return
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(android.view.MotionEvent r1) {
            r0 = this;
            r0 = 1
            return r0
    }
}

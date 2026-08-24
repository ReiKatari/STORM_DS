package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ql0  reason: default package */
/* loaded from: classes.dex */
public final class ql0 extends defpackage.ea7 {
    public static final java.lang.String[] A0 = null;
    public static final defpackage.ml0 B0 = null;
    public static final defpackage.ml0 C0 = null;
    public static final defpackage.ml0 D0 = null;
    public static final defpackage.ml0 E0 = null;
    public static final defpackage.ml0 F0 = null;

    static {
            java.lang.String r0 = "android:changeBounds:windowX"
            java.lang.String r1 = "android:changeBounds:windowY"
            java.lang.String r2 = "android:changeBounds:bounds"
            java.lang.String r3 = "android:changeBounds:clip"
            java.lang.String r4 = "android:changeBounds:parent"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r4, r0, r1}
            defpackage.ql0.A0 = r0
            ml0 r0 = new ml0
            r1 = 0
            java.lang.String r2 = "topLeft"
            java.lang.Class<android.graphics.PointF> r3 = android.graphics.PointF.class
            r0.<init>(r2, r1, r3)
            defpackage.ql0.B0 = r0
            ml0 r0 = new ml0
            r1 = 1
            java.lang.String r4 = "bottomRight"
            r0.<init>(r4, r1, r3)
            defpackage.ql0.C0 = r0
            ml0 r0 = new ml0
            r1 = 2
            r0.<init>(r4, r1, r3)
            defpackage.ql0.D0 = r0
            ml0 r0 = new ml0
            r1 = 3
            r0.<init>(r2, r1, r3)
            defpackage.ql0.E0 = r0
            ml0 r0 = new ml0
            java.lang.String r1 = "position"
            r2 = 4
            r0.<init>(r1, r2, r3)
            defpackage.ql0.F0 = r0
            return
    }

    public static void Q(defpackage.sa7 r6) {
            android.view.View r0 = r6.b
            java.util.HashMap r6 = r6.a
            boolean r1 = r0.isLaidOut()
            if (r1 != 0) goto L18
            int r1 = r0.getWidth()
            if (r1 != 0) goto L18
            int r1 = r0.getHeight()
            if (r1 == 0) goto L17
            goto L18
        L17:
            return
        L18:
            android.graphics.Rect r1 = new android.graphics.Rect
            int r2 = r0.getLeft()
            int r3 = r0.getTop()
            int r4 = r0.getRight()
            int r5 = r0.getBottom()
            r1.<init>(r2, r3, r4, r5)
            java.lang.String r2 = "android:changeBounds:bounds"
            r6.put(r2, r1)
            java.lang.String r1 = "android:changeBounds:parent"
            android.view.ViewParent r0 = r0.getParent()
            r6.put(r1, r0)
            return
    }

    @Override // defpackage.ea7
    public final void d(defpackage.sa7 r1) {
            r0 = this;
            Q(r1)
            return
    }

    @Override // defpackage.ea7
    public final void g(defpackage.sa7 r1) {
            r0 = this;
            Q(r1)
            return
    }

    @Override // defpackage.ea7
    public final android.animation.Animator l(android.view.ViewGroup r19, defpackage.sa7 r20, defpackage.sa7 r21) {
            r18 = this;
            r1 = r20
            r2 = r21
            if (r1 == 0) goto La
            java.util.HashMap r1 = r1.a
            if (r2 != 0) goto Ld
        La:
            r5 = 0
            goto L13e
        Ld:
            java.util.HashMap r4 = r2.a
            java.lang.String r5 = "android:changeBounds:parent"
            java.lang.Object r6 = r1.get(r5)
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            java.lang.Object r5 = r4.get(r5)
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            if (r6 == 0) goto La
            if (r5 != 0) goto L22
            goto La
        L22:
            android.view.View r2 = r2.b
            java.lang.String r5 = "android:changeBounds:bounds"
            java.lang.Object r6 = r1.get(r5)
            android.graphics.Rect r6 = (android.graphics.Rect) r6
            java.lang.Object r5 = r4.get(r5)
            android.graphics.Rect r5 = (android.graphics.Rect) r5
            int r7 = r6.left
            int r8 = r5.left
            int r9 = r6.top
            int r10 = r5.top
            int r11 = r6.right
            int r12 = r5.right
            int r6 = r6.bottom
            int r5 = r5.bottom
            int r13 = r11 - r7
            int r14 = r6 - r9
            int r15 = r12 - r8
            int r3 = r5 - r10
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r1 = r1.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = r4.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            r20 = 0
            r4 = 1
            if (r13 == 0) goto L5f
            if (r14 != 0) goto L63
        L5f:
            if (r15 == 0) goto L74
            if (r3 == 0) goto L74
        L63:
            if (r7 != r8) goto L6b
            if (r9 == r10) goto L68
            goto L6b
        L68:
            r16 = r20
            goto L6d
        L6b:
            r16 = r4
        L6d:
            if (r11 != r12) goto L71
            if (r6 == r5) goto L76
        L71:
            int r16 = r16 + 1
            goto L76
        L74:
            r16 = r20
        L76:
            if (r1 == 0) goto L7e
            boolean r17 = r1.equals(r0)
            if (r17 == 0) goto L82
        L7e:
            if (r1 != 0) goto L84
            if (r0 == 0) goto L84
        L82:
            int r16 = r16 + 1
        L84:
            r0 = r16
            if (r0 <= 0) goto La
            defpackage.dq7.a(r2, r7, r9, r11, r6)
            r1 = 2
            if (r0 != r1) goto Lf0
            if (r13 != r15) goto Laa
            if (r14 != r3) goto Laa
            r0 = r18
            x31 r1 = r0.s0
            float r3 = (float) r7
            float r5 = (float) r9
            float r6 = (float) r8
            float r7 = (float) r10
            r1.getClass()
            android.graphics.Path r1 = defpackage.x31.u(r3, r5, r6, r7)
            ml0 r3 = defpackage.ql0.F0
            r5 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r5, r1)
            goto L120
        Laa:
            r0 = r18
            pl0 r3 = new pl0
            r3.<init>(r2)
            x31 r13 = r0.s0
            float r7 = (float) r7
            float r9 = (float) r9
            float r8 = (float) r8
            float r10 = (float) r10
            r13.getClass()
            android.graphics.Path r7 = defpackage.x31.u(r7, r9, r8, r10)
            ml0 r8 = defpackage.ql0.B0
            r9 = 0
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofObject(r3, r8, r9, r7)
            x31 r8 = r0.s0
            float r10 = (float) r11
            float r6 = (float) r6
            float r11 = (float) r12
            float r5 = (float) r5
            r8.getClass()
            android.graphics.Path r5 = defpackage.x31.u(r10, r6, r11, r5)
            ml0 r6 = defpackage.ql0.C0
            android.animation.ObjectAnimator r5 = android.animation.ObjectAnimator.ofObject(r3, r6, r9, r5)
            android.animation.AnimatorSet r6 = new android.animation.AnimatorSet
            r6.<init>()
            android.animation.Animator[] r1 = new android.animation.Animator[r1]
            r1[r20] = r7
            r1[r4] = r5
            r6.playTogether(r1)
            nl0 r1 = new nl0
            r1.<init>(r3)
            r6.addListener(r1)
            r1 = r6
            goto L120
        Lf0:
            r0 = r18
            if (r7 != r8) goto Lf6
            if (r9 == r10) goto Lf8
        Lf6:
            r5 = 0
            goto L10d
        Lf8:
            x31 r1 = r0.s0
            float r3 = (float) r11
            float r6 = (float) r6
            float r7 = (float) r12
            float r5 = (float) r5
            r1.getClass()
            android.graphics.Path r1 = defpackage.x31.u(r3, r6, r7, r5)
            ml0 r3 = defpackage.ql0.D0
            r5 = 0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r5, r1)
            goto L120
        L10d:
            x31 r1 = r0.s0
            float r3 = (float) r7
            float r6 = (float) r9
            float r7 = (float) r8
            float r8 = (float) r10
            r1.getClass()
            android.graphics.Path r1 = defpackage.x31.u(r3, r6, r7, r8)
            ml0 r3 = defpackage.ql0.E0
            android.animation.ObjectAnimator r1 = android.animation.ObjectAnimator.ofObject(r2, r3, r5, r1)
        L120:
            android.view.ViewParent r3 = r2.getParent()
            boolean r3 = r3 instanceof android.view.ViewGroup
            if (r3 == 0) goto L13d
            android.view.ViewParent r2 = r2.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            defpackage.ej2.W(r2, r4)
            ea7 r0 = r0.p()
            ol0 r3 = new ol0
            r3.<init>(r2)
            r0.a(r3)
        L13d:
            return r1
        L13e:
            return r5
    }

    @Override // defpackage.ea7
    public final java.lang.String[] s() {
            r0 = this;
            java.lang.String[] r0 = defpackage.ql0.A0
            return r0
    }

    @Override // defpackage.ea7
    public final boolean v() {
            r0 = this;
            r0 = 1
            return r0
    }
}

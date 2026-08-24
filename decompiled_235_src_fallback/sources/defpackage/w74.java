package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: w74  reason: default package */
/* loaded from: classes.dex */
public final class w74 {
    public defpackage.m21 a;
    public defpackage.m21 b;
    public defpackage.z11 c;
    public defpackage.z11 d;
    public int e;
    public int f;
    public final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout g;

    public w74(androidx.constraintlayout.motion.widget.MotionLayout r1) {
            r0 = this;
            r0.<init>()
            r0.g = r1
            m21 r1 = new m21
            r1.<init>()
            r0.a = r1
            m21 r1 = new m21
            r1.<init>()
            r0.b = r1
            r1 = 0
            r0.c = r1
            r0.d = r1
            return
    }

    public static void c(defpackage.m21 r7, defpackage.m21 r8) {
            java.util.ArrayList r0 = r7.t0
            java.util.HashMap r1 = new java.util.HashMap
            r1.<init>()
            r1.put(r7, r8)
            java.util.ArrayList r2 = r8.t0
            r2.clear()
            r8.g(r7, r1)
            int r7 = r0.size()
            r2 = 0
            r3 = r2
        L18:
            if (r3 >= r7) goto L72
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            l21 r4 = (defpackage.l21) r4
            boolean r5 = r4 instanceof defpackage.a20
            if (r5 == 0) goto L2c
            a20 r5 = new a20
            r5.<init>()
            goto L59
        L2c:
            boolean r5 = r4 instanceof defpackage.av2
            if (r5 == 0) goto L36
            av2 r5 = new av2
            r5.<init>()
            goto L59
        L36:
            boolean r5 = r4 instanceof defpackage.me2
            if (r5 == 0) goto L40
            me2 r5 = new me2
            r5.<init>()
            goto L59
        L40:
            boolean r5 = r4 instanceof defpackage.gx4
            if (r5 == 0) goto L4a
            gx4 r5 = new gx4
            r5.<init>()
            goto L59
        L4a:
            boolean r5 = r4 instanceof defpackage.gx2
            if (r5 == 0) goto L54
            gx2 r5 = new gx2
            r5.<init>()
            goto L59
        L54:
            l21 r5 = new l21
            r5.<init>()
        L59:
            java.util.ArrayList r6 = r8.t0
            r6.add(r5)
            l21 r6 = r5.U
            if (r6 == 0) goto L6c
            m21 r6 = (defpackage.m21) r6
            java.util.ArrayList r6 = r6.t0
            r6.remove(r5)
            r5.D()
        L6c:
            r5.U = r8
            r1.put(r4, r5)
            goto L18
        L72:
            int r7 = r0.size()
        L76:
            if (r2 >= r7) goto L8a
            java.lang.Object r8 = r0.get(r2)
            int r2 = r2 + 1
            l21 r8 = (defpackage.l21) r8
            java.lang.Object r3 = r1.get(r8)
            l21 r3 = (defpackage.l21) r3
            r3.g(r8, r1)
            goto L76
        L8a:
            return
    }

    public static defpackage.l21 d(defpackage.m21 r4, android.view.View r5) {
            android.view.View r0 = r4.g0
            if (r0 != r5) goto L5
            return r4
        L5:
            java.util.ArrayList r4 = r4.t0
            int r0 = r4.size()
            r1 = 0
        Lc:
            if (r1 >= r0) goto L1c
            java.lang.Object r2 = r4.get(r1)
            l21 r2 = (defpackage.l21) r2
            android.view.View r3 = r2.g0
            if (r3 != r5) goto L19
            return r2
        L19:
            int r1 = r1 + 1
            goto Lc
        L1c:
            r4 = 0
            return r4
    }

    public final void a() {
            r22 = this;
            r0 = r22
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.g
            int r2 = r1.getChildCount()
            java.util.HashMap r3 = r1.z0
            r3.clear()
            android.util.SparseArray r4 = new android.util.SparseArray
            r4.<init>()
            int[] r5 = new int[r2]
            r7 = 0
        L15:
            if (r7 >= r2) goto L2f
            android.view.View r8 = r1.getChildAt(r7)
            m74 r9 = new m74
            r9.<init>(r8)
            int r10 = r8.getId()
            r5[r7] = r10
            r4.put(r10, r9)
            r3.put(r8, r9)
            int r7 = r7 + 1
            goto L15
        L2f:
            r7 = 0
        L30:
            if (r7 >= r2) goto L1f8
            android.view.View r9 = r1.getChildAt(r7)
            java.lang.Object r10 = r3.get(r9)
            m74 r10 = (defpackage.m74) r10
            if (r10 != 0) goto L4b
            r20 = r2
            r16 = r3
            r19 = r4
            r17 = r5
            r18 = r7
            r4 = 0
            goto L1ec
        L4b:
            android.graphics.Rect r11 = r10.a
            z11 r12 = r0.c
            java.lang.String r13 = ")"
            java.lang.String r14 = " ("
            java.lang.String r15 = "no widget for  "
            java.lang.String r6 = "MotionLayout"
            if (r12 == 0) goto L158
            m21 r12 = r0.a
            l21 r12 = d(r12, r9)
            if (r12 == 0) goto L118
            android.graphics.Rect r12 = androidx.constraintlayout.motion.widget.MotionLayout.o(r1, r12)
            z11 r8 = r0.c
            r16 = r3
            int r3 = r1.getWidth()
            r17 = r5
            int r5 = r1.getHeight()
            r18 = r7
            y74 r7 = r10.f
            r19 = r4
            int r4 = r8.d
            if (r4 == 0) goto L80
            defpackage.m74.f(r12, r11, r4, r3, r5)
        L80:
            r3 = 0
            r7.L = r3
            r7.R = r3
            r10.e(r7)
            int r3 = r12.left
            float r3 = (float) r3
            int r5 = r12.top
            float r5 = (float) r5
            r20 = r2
            int r2 = r12.width()
            float r2 = (float) r2
            r21 = r11
            int r11 = r12.height()
            float r11 = (float) r11
            r7.d(r3, r5, r2, r11)
            int r2 = r10.c
            u11 r2 = r8.h(r2)
            r7.a(r2)
            w11 r3 = r2.d
            float r5 = r3.g
            r10.l = r5
            k74 r5 = r10.h
            int r7 = r10.c
            r5.c(r12, r8, r4, r7)
            y11 r2 = r2.f
            int r2 = r2.i
            r10.C = r2
            int r2 = r3.j
            r10.E = r2
            float r2 = r3.i
            r10.F = r2
            android.view.View r2 = r10.b
            android.content.Context r2 = r2.getContext()
            int r4 = r3.l
            java.lang.String r5 = r3.k
            int r3 = r3.m
            r7 = -2
            if (r4 == r7) goto L110
            r7 = -1
            if (r4 == r7) goto L104
            if (r4 == 0) goto Lfe
            r2 = 1
            if (r4 == r2) goto Lf8
            r2 = 2
            if (r4 == r2) goto Lf2
            r2 = 4
            if (r4 == r2) goto Lec
            r2 = 5
            if (r4 == r2) goto Le6
            r2 = 0
        Le4:
            r4 = 0
            goto L115
        Le6:
            android.view.animation.OvershootInterpolator r2 = new android.view.animation.OvershootInterpolator
            r2.<init>()
            goto Le4
        Lec:
            android.view.animation.BounceInterpolator r2 = new android.view.animation.BounceInterpolator
            r2.<init>()
            goto Le4
        Lf2:
            android.view.animation.DecelerateInterpolator r2 = new android.view.animation.DecelerateInterpolator
            r2.<init>()
            goto Le4
        Lf8:
            android.view.animation.AccelerateInterpolator r2 = new android.view.animation.AccelerateInterpolator
            r2.<init>()
            goto Le4
        Lfe:
            android.view.animation.AccelerateDecelerateInterpolator r2 = new android.view.animation.AccelerateDecelerateInterpolator
            r2.<init>()
            goto Le4
        L104:
            gr1 r2 = defpackage.gr1.c(r5)
            l74 r3 = new l74
            r4 = 0
            r3.<init>(r2, r4)
            r2 = r3
            goto L115
        L110:
            r4 = 0
            android.view.animation.Interpolator r2 = android.view.animation.AnimationUtils.loadInterpolator(r2, r3)
        L115:
            r10.G = r2
            goto L165
        L118:
            r20 = r2
            r16 = r3
            r19 = r4
            r17 = r5
            r18 = r7
            r21 = r11
            r4 = 0
            int r2 = r1.I0
            if (r2 == 0) goto L165
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = defpackage.lb4.w()
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = defpackage.lb4.y(r9)
            r2.append(r3)
            r2.append(r14)
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r6, r2)
            goto L165
        L158:
            r20 = r2
            r16 = r3
            r19 = r4
            r17 = r5
            r18 = r7
            r21 = r11
            r4 = 0
        L165:
            z11 r2 = r0.d
            if (r2 == 0) goto L1ec
            m21 r2 = r0.b
            l21 r2 = d(r2, r9)
            if (r2 == 0) goto L1ba
            android.graphics.Rect r2 = androidx.constraintlayout.motion.widget.MotionLayout.o(r1, r2)
            z11 r3 = r0.d
            int r5 = r1.getWidth()
            int r6 = r1.getHeight()
            y74 r7 = r10.g
            int r8 = r3.d
            if (r8 == 0) goto L18c
            r9 = r21
            defpackage.m74.f(r2, r9, r8, r5, r6)
            r11 = r9
            goto L18d
        L18c:
            r11 = r2
        L18d:
            r2 = 1065353216(0x3f800000, float:1.0)
            r7.L = r2
            r7.R = r2
            r10.e(r7)
            int r2 = r11.left
            float r2 = (float) r2
            int r5 = r11.top
            float r5 = (float) r5
            int r6 = r11.width()
            float r6 = (float) r6
            int r9 = r11.height()
            float r9 = (float) r9
            r7.d(r2, r5, r6, r9)
            int r2 = r10.c
            u11 r2 = r3.h(r2)
            r7.a(r2)
            k74 r2 = r10.i
            int r5 = r10.c
            r2.c(r11, r3, r8, r5)
            goto L1ec
        L1ba:
            int r2 = r1.I0
            if (r2 == 0) goto L1ec
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = defpackage.lb4.w()
            r2.append(r3)
            r2.append(r15)
            java.lang.String r3 = defpackage.lb4.y(r9)
            r2.append(r3)
            r2.append(r14)
            java.lang.Class r3 = r9.getClass()
            java.lang.String r3 = r3.getName()
            r2.append(r3)
            r2.append(r13)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r6, r2)
        L1ec:
            int r7 = r18 + 1
            r3 = r16
            r5 = r17
            r4 = r19
            r2 = r20
            goto L30
        L1f8:
            r19 = r4
            r17 = r5
            r4 = 0
            r0 = r2
            r6 = r4
        L1ff:
            if (r6 >= r0) goto L22b
            r1 = r17[r6]
            r2 = r19
            java.lang.Object r1 = r2.get(r1)
            m74 r1 = (defpackage.m74) r1
            y74 r3 = r1.f
            int r3 = r3.g0
            r7 = -1
            if (r3 == r7) goto L226
            java.lang.Object r3 = r2.get(r3)
            m74 r3 = (defpackage.m74) r3
            y74 r4 = r1.f
            y74 r5 = r3.f
            r4.f(r3, r5)
            y74 r1 = r1.g
            y74 r4 = r3.g
            r1.f(r3, r4)
        L226:
            int r6 = r6 + 1
            r19 = r2
            goto L1ff
        L22b:
            return
    }

    public final void b(int r6, int r7) {
            r5 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r5.g
            int r1 = r0.getOptimizationLevel()
            int r2 = r0.u0
            int r3 = r0.getStartState()
            if (r2 != r3) goto L3d
            m21 r2 = r5.b
            z11 r3 = r5.d
            if (r3 == 0) goto L1b
            int r4 = r3.d
            if (r4 != 0) goto L19
            goto L1b
        L19:
            r4 = r7
            goto L1c
        L1b:
            r4 = r6
        L1c:
            if (r3 == 0) goto L25
            int r3 = r3.d
            if (r3 != 0) goto L23
            goto L25
        L23:
            r3 = r6
            goto L26
        L25:
            r3 = r7
        L26:
            r0.m(r2, r1, r4, r3)
            z11 r2 = r5.c
            if (r2 == 0) goto L3c
            m21 r5 = r5.a
            int r2 = r2.d
            if (r2 != 0) goto L35
            r3 = r6
            goto L36
        L35:
            r3 = r7
        L36:
            if (r2 != 0) goto L39
            r6 = r7
        L39:
            r0.m(r5, r1, r3, r6)
        L3c:
            return
        L3d:
            z11 r2 = r5.c
            if (r2 == 0) goto L52
            m21 r3 = r5.a
            int r2 = r2.d
            if (r2 != 0) goto L49
            r4 = r6
            goto L4a
        L49:
            r4 = r7
        L4a:
            if (r2 != 0) goto L4e
            r2 = r7
            goto L4f
        L4e:
            r2 = r6
        L4f:
            r0.m(r3, r1, r4, r2)
        L52:
            m21 r2 = r5.b
            z11 r5 = r5.d
            if (r5 == 0) goto L5f
            int r3 = r5.d
            if (r3 != 0) goto L5d
            goto L5f
        L5d:
            r3 = r7
            goto L60
        L5f:
            r3 = r6
        L60:
            if (r5 == 0) goto L66
            int r5 = r5.d
            if (r5 != 0) goto L67
        L66:
            r6 = r7
        L67:
            r0.m(r2, r1, r3, r6)
            return
    }

    public final void e(defpackage.z11 r7, defpackage.z11 r8) {
            r6 = this;
            r6.c = r7
            r6.d = r8
            m21 r0 = new m21
            r0.<init>()
            r6.a = r0
            m21 r0 = new m21
            r0.<init>()
            r6.b = r0
            m21 r1 = r6.a
            boolean r2 = androidx.constraintlayout.motion.widget.MotionLayout.t1
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r6.g
            m21 r3 = r2.L
            p11 r4 = r3.x0
            r1.x0 = r4
            ai1 r5 = r1.v0
            r5.h = r4
            p11 r4 = r3.x0
            r0.x0 = r4
            ai1 r0 = r0.v0
            r0.h = r4
            java.util.ArrayList r0 = r1.t0
            r0.clear()
            m21 r0 = r6.b
            java.util.ArrayList r0 = r0.t0
            r0.clear()
            m21 r0 = r6.a
            c(r3, r0)
            m21 r0 = r6.b
            c(r3, r0)
            float r0 = r2.D0
            double r0 = (double) r0
            r3 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r0 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r0 <= 0) goto L56
            if (r7 == 0) goto L50
            m21 r0 = r6.a
            r6.g(r0, r7)
        L50:
            m21 r7 = r6.b
            r6.g(r7, r8)
            goto L62
        L56:
            m21 r0 = r6.b
            r6.g(r0, r8)
            if (r7 == 0) goto L62
            m21 r8 = r6.a
            r6.g(r8, r7)
        L62:
            m21 r7 = r6.a
            boolean r8 = r2.j()
            r7.y0 = r8
            m21 r7 = r6.a
            bt r8 = r7.u0
            r8.a0(r7)
            m21 r7 = r6.b
            boolean r8 = r2.j()
            r7.y0 = r8
            m21 r7 = r6.b
            bt r8 = r7.u0
            r8.a0(r7)
            android.view.ViewGroup$LayoutParams r7 = r2.getLayoutParams()
            if (r7 == 0) goto La7
            int r8 = r7.width
            r0 = -2
            if (r8 != r0) goto L97
            m21 r8 = r6.a
            k21 r1 = defpackage.k21.WRAP_CONTENT
            r8.N(r1)
            m21 r8 = r6.b
            r8.N(r1)
        L97:
            int r7 = r7.height
            if (r7 != r0) goto La7
            m21 r7 = r6.a
            k21 r8 = defpackage.k21.WRAP_CONTENT
            r7.O(r8)
            m21 r6 = r6.b
            r6.O(r8)
        La7:
            return
    }

    public final void f() {
            r13 = this;
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.g
            int r1 = r0.w0
            int r2 = r0.x0
            int r3 = android.view.View.MeasureSpec.getMode(r1)
            int r4 = android.view.View.MeasureSpec.getMode(r2)
            r0.e1 = r3
            r0.f1 = r4
            r13.b(r1, r2)
            android.view.ViewParent r5 = r0.getParent()
            boolean r5 = r5 instanceof androidx.constraintlayout.motion.widget.MotionLayout
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L26
            r5 = 1073741824(0x40000000, float:2.0)
            if (r3 != r5) goto L26
            if (r4 != r5) goto L26
            goto L59
        L26:
            r13.b(r1, r2)
            m21 r3 = r13.a
            int r3 = r3.r()
            r0.a1 = r3
            m21 r3 = r13.a
            int r3 = r3.l()
            r0.b1 = r3
            m21 r3 = r13.b
            int r3 = r3.r()
            r0.c1 = r3
            m21 r3 = r13.b
            int r3 = r3.l()
            r0.d1 = r3
            int r4 = r0.a1
            int r5 = r0.c1
            if (r4 != r5) goto L56
            int r4 = r0.b1
            if (r4 == r3) goto L54
            goto L56
        L54:
            r3 = r8
            goto L57
        L56:
            r3 = r7
        L57:
            r0.Z0 = r3
        L59:
            int r3 = r0.a1
            int r4 = r0.b1
            int r5 = r0.e1
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r5 == r6) goto L65
            if (r5 != 0) goto L6f
        L65:
            float r5 = (float) r3
            float r9 = r0.g1
            int r10 = r0.c1
            int r10 = r10 - r3
            float r3 = (float) r10
            float r9 = r9 * r3
            float r9 = r9 + r5
            int r3 = (int) r9
        L6f:
            int r5 = r0.f1
            if (r5 == r6) goto L75
            if (r5 != 0) goto L7f
        L75:
            float r5 = (float) r4
            float r6 = r0.g1
            int r9 = r0.d1
            int r9 = r9 - r4
            float r4 = (float) r9
            float r6 = r6 * r4
            float r6 = r6 + r5
            int r4 = (int) r6
        L7f:
            m21 r5 = r13.a
            boolean r6 = r5.H0
            if (r6 != 0) goto L8f
            m21 r6 = r13.b
            boolean r6 = r6.H0
            if (r6 == 0) goto L8c
            goto L8f
        L8c:
            r6 = r5
            r5 = r8
            goto L91
        L8f:
            r6 = r5
            r5 = r7
        L91:
            boolean r6 = r6.I0
            if (r6 != 0) goto L9e
            m21 r13 = r13.b
            boolean r13 = r13.I0
            if (r13 == 0) goto L9c
            goto L9e
        L9c:
            r6 = r8
            goto L9f
        L9e:
            r6 = r7
        L9f:
            r0.l(r1, r2, r3, r4, r5, r6)
            java.util.HashMap r13 = r0.z0
            int r1 = r0.getChildCount()
            w74 r2 = r0.o1
            r2.a()
            r0.H0 = r7
            android.util.SparseArray r2 = new android.util.SparseArray
            r2.<init>()
            r3 = r8
        Lb5:
            if (r3 >= r1) goto Lcb
            android.view.View r4 = r0.getChildAt(r3)
            int r5 = r4.getId()
            java.lang.Object r4 = r13.get(r4)
            m74 r4 = (defpackage.m74) r4
            r2.put(r5, r4)
            int r3 = r3 + 1
            goto Lb5
        Lcb:
            int r2 = r0.getWidth()
            int r3 = r0.getHeight()
            androidx.constraintlayout.motion.widget.b r4 = r0.p0
            b84 r4 = r4.c
            r5 = -1
            if (r4 == 0) goto Ldd
            int r4 = r4.p
            goto Lde
        Ldd:
            r4 = r5
        Lde:
            if (r4 == r5) goto Lf4
            r6 = r8
        Le1:
            if (r6 >= r1) goto Lf4
            android.view.View r9 = r0.getChildAt(r6)
            java.lang.Object r9 = r13.get(r9)
            m74 r9 = (defpackage.m74) r9
            if (r9 == 0) goto Lf1
            r9.B = r4
        Lf1:
            int r6 = r6 + 1
            goto Le1
        Lf4:
            android.util.SparseBooleanArray r4 = new android.util.SparseBooleanArray
            r4.<init>()
            int r6 = r13.size()
            int[] r6 = new int[r6]
            r9 = r8
            r10 = r9
        L101:
            if (r9 >= r1) goto L122
            android.view.View r11 = r0.getChildAt(r9)
            java.lang.Object r11 = r13.get(r11)
            m74 r11 = (defpackage.m74) r11
            y74 r12 = r11.f
            int r12 = r12.g0
            if (r12 == r5) goto L11f
            r4.put(r12, r7)
            int r12 = r10 + 1
            y74 r11 = r11.f
            int r11 = r11.g0
            r6[r10] = r11
            r10 = r12
        L11f:
            int r9 = r9 + 1
            goto L101
        L122:
            r5 = r8
        L123:
            if (r5 >= r10) goto L143
            r9 = r6[r5]
            android.view.View r9 = r0.findViewById(r9)
            java.lang.Object r9 = r13.get(r9)
            m74 r9 = (defpackage.m74) r9
            if (r9 != 0) goto L134
            goto L140
        L134:
            androidx.constraintlayout.motion.widget.b r11 = r0.p0
            r11.e(r9)
            long r11 = r0.getNanoTime()
            r9.g(r11, r2, r3)
        L140:
            int r5 = r5 + 1
            goto L123
        L143:
            r5 = r8
        L144:
            if (r5 >= r1) goto L16c
            android.view.View r6 = r0.getChildAt(r5)
            java.lang.Object r9 = r13.get(r6)
            m74 r9 = (defpackage.m74) r9
            int r6 = r6.getId()
            boolean r6 = r4.get(r6)
            if (r6 == 0) goto L15b
            goto L169
        L15b:
            if (r9 == 0) goto L169
            androidx.constraintlayout.motion.widget.b r6 = r0.p0
            r6.e(r9)
            long r10 = r0.getNanoTime()
            r9.g(r10, r2, r3)
        L169:
            int r5 = r5 + 1
            goto L144
        L16c:
            androidx.constraintlayout.motion.widget.b r2 = r0.p0
            b84 r2 = r2.c
            r3 = 0
            if (r2 == 0) goto L176
            float r2 = r2.i
            goto L177
        L176:
            r2 = r3
        L177:
            int r3 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r3 == 0) goto L240
            double r3 = (double) r2
            r5 = 0
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 >= 0) goto L183
            goto L184
        L183:
            r7 = r8
        L184:
            float r2 = java.lang.Math.abs(r2)
            r3 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r4 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r9 = r3
            r6 = r4
            r5 = r8
        L191:
            r10 = 1065353216(0x3f800000, float:1.0)
            if (r5 >= r1) goto L217
            android.view.View r11 = r0.getChildAt(r5)
            java.lang.Object r11 = r13.get(r11)
            m74 r11 = (defpackage.m74) r11
            float r12 = r11.l
            boolean r12 = java.lang.Float.isNaN(r12)
            if (r12 != 0) goto L200
            r5 = r8
        L1a8:
            if (r5 >= r1) goto L1cb
            android.view.View r6 = r0.getChildAt(r5)
            java.lang.Object r6 = r13.get(r6)
            m74 r6 = (defpackage.m74) r6
            float r9 = r6.l
            boolean r9 = java.lang.Float.isNaN(r9)
            if (r9 != 0) goto L1c8
            float r9 = r6.l
            float r4 = java.lang.Math.min(r4, r9)
            float r6 = r6.l
            float r3 = java.lang.Math.max(r3, r6)
        L1c8:
            int r5 = r5 + 1
            goto L1a8
        L1cb:
            if (r8 >= r1) goto L240
            android.view.View r5 = r0.getChildAt(r8)
            java.lang.Object r5 = r13.get(r5)
            m74 r5 = (defpackage.m74) r5
            float r6 = r5.l
            boolean r6 = java.lang.Float.isNaN(r6)
            if (r6 != 0) goto L1fd
            float r6 = r10 - r2
            float r6 = r10 / r6
            r5.n = r6
            float r6 = r5.l
            if (r7 == 0) goto L1f4
            float r6 = r3 - r6
            float r9 = r3 - r4
            float r6 = r6 / r9
            float r6 = r6 * r2
            float r6 = r2 - r6
            r5.m = r6
            goto L1fd
        L1f4:
            float r6 = r6 - r4
            float r6 = r6 * r2
            float r9 = r3 - r4
            float r6 = r6 / r9
            float r6 = r2 - r6
            r5.m = r6
        L1fd:
            int r8 = r8 + 1
            goto L1cb
        L200:
            y74 r10 = r11.g
            float r11 = r10.X
            float r10 = r10.Y
            if (r7 == 0) goto L20a
            float r10 = r10 - r11
            goto L20b
        L20a:
            float r10 = r10 + r11
        L20b:
            float r6 = java.lang.Math.min(r6, r10)
            float r9 = java.lang.Math.max(r9, r10)
            int r5 = r5 + 1
            goto L191
        L217:
            if (r8 >= r1) goto L240
            android.view.View r3 = r0.getChildAt(r8)
            java.lang.Object r3 = r13.get(r3)
            m74 r3 = (defpackage.m74) r3
            y74 r4 = r3.g
            float r5 = r4.X
            float r4 = r4.Y
            if (r7 == 0) goto L22d
            float r4 = r4 - r5
            goto L22e
        L22d:
            float r4 = r4 + r5
        L22e:
            float r5 = r10 - r2
            float r5 = r10 / r5
            r3.n = r5
            float r4 = r4 - r6
            float r4 = r4 * r2
            float r5 = r9 - r6
            float r4 = r4 / r5
            float r4 = r2 - r4
            r3.m = r4
            int r8 = r8 + 1
            goto L217
        L240:
            return
    }

    public final void g(defpackage.m21 r14, defpackage.z11 r15) {
            r13 = this;
            android.util.SparseArray r5 = new android.util.SparseArray
            r5.<init>()
            o21 r4 = new o21
            r4.<init>()
            r5.clear()
            r6 = 0
            r5.put(r6, r14)
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r13.g
            int r1 = r0.getId()
            r5.put(r1, r14)
            if (r15 == 0) goto L3d
            int r1 = r15.d
            if (r1 == 0) goto L3d
            m21 r13 = r13.b
            int r1 = r0.getOptimizationLevel()
            int r2 = r0.getHeight()
            r3 = 1073741824(0x40000000, float:2.0)
            int r2 = android.view.View.MeasureSpec.makeMeasureSpec(r2, r3)
            int r7 = r0.getWidth()
            int r3 = android.view.View.MeasureSpec.makeMeasureSpec(r7, r3)
            boolean r7 = androidx.constraintlayout.motion.widget.MotionLayout.t1
            r0.m(r13, r1, r2, r3)
        L3d:
            java.util.ArrayList r13 = r14.t0
            int r1 = r13.size()
            r2 = r6
        L44:
            r7 = 1
            if (r2 >= r1) goto L5b
            java.lang.Object r3 = r13.get(r2)
            int r2 = r2 + 1
            l21 r3 = (defpackage.l21) r3
            r3.i0 = r7
            android.view.View r7 = r3.g0
            int r7 = r7.getId()
            r5.put(r7, r3)
            goto L44
        L5b:
            java.util.ArrayList r13 = r14.t0
            int r8 = r13.size()
            r1 = r6
        L62:
            if (r1 >= r8) goto L116
            java.lang.Object r2 = r13.get(r1)
            int r9 = r1 + 1
            r3 = r2
            l21 r3 = (defpackage.l21) r3
            android.view.View r2 = r3.g0
            int r1 = r2.getId()
            java.util.HashMap r10 = r15.g
            java.lang.Integer r11 = java.lang.Integer.valueOf(r1)
            boolean r11 = r10.containsKey(r11)
            if (r11 == 0) goto L8e
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            java.lang.Object r1 = r10.get(r1)
            u11 r1 = (defpackage.u11) r1
            if (r1 == 0) goto L8e
            r1.b(r4)
        L8e:
            int r1 = r2.getId()
            u11 r1 = r15.h(r1)
            v11 r1 = r1.e
            int r1 = r1.c
            r3.P(r1)
            int r1 = r2.getId()
            u11 r1 = r15.h(r1)
            v11 r1 = r1.e
            int r1 = r1.d
            r3.M(r1)
            boolean r1 = r2 instanceof defpackage.l11
            if (r1 == 0) goto Le3
            r1 = r2
            l11 r1 = (defpackage.l11) r1
            int r10 = r1.getId()
            java.util.HashMap r11 = r15.g
            java.lang.Integer r12 = java.lang.Integer.valueOf(r10)
            boolean r12 = r11.containsKey(r12)
            if (r12 == 0) goto Ld9
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)
            java.lang.Object r10 = r11.get(r10)
            u11 r10 = (defpackage.u11) r10
            if (r10 == 0) goto Ld9
            boolean r11 = r3 instanceof defpackage.gx2
            if (r11 == 0) goto Ld9
            r11 = r3
            gx2 r11 = (defpackage.gx2) r11
            r1.i(r10, r11, r4, r5)
        Ld9:
            boolean r1 = r2 instanceof androidx.constraintlayout.widget.Barrier
            if (r1 == 0) goto Le3
            r1 = r2
            androidx.constraintlayout.widget.Barrier r1 = (androidx.constraintlayout.widget.Barrier) r1
            r1.k()
        Le3:
            int r1 = r0.getLayoutDirection()
            r4.resolveLayoutDirection(r1)
            boolean r1 = androidx.constraintlayout.motion.widget.MotionLayout.t1
            r1 = 0
            r0.g(r1, r2, r3, r4, r5)
            int r1 = r2.getId()
            u11 r1 = r15.h(r1)
            x11 r1 = r1.c
            int r1 = r1.c
            if (r1 != r7) goto L105
            int r1 = r2.getVisibility()
            r3.h0 = r1
            goto L113
        L105:
            int r1 = r2.getId()
            u11 r1 = r15.h(r1)
            x11 r1 = r1.c
            int r1 = r1.b
            r3.h0 = r1
        L113:
            r1 = r9
            goto L62
        L116:
            java.util.ArrayList r13 = r14.t0
            int r14 = r13.size()
            r15 = r6
        L11d:
            if (r15 >= r14) goto L163
            java.lang.Object r0 = r13.get(r15)
            int r15 = r15 + 1
            l21 r0 = (defpackage.l21) r0
            boolean r1 = r0 instanceof defpackage.rq7
            if (r1 == 0) goto L11d
            android.view.View r1 = r0.g0
            l11 r1 = (defpackage.l11) r1
            gx2 r0 = (defpackage.gx2) r0
            r1.getClass()
            r0.u0 = r6
            l21[] r2 = r0.t0
            r3 = 0
            java.util.Arrays.fill(r2, r3)
            r2 = r6
        L13d:
            int r3 = r1.B
            if (r2 >= r3) goto L151
            int[] r3 = r1.A
            r3 = r3[r2]
            java.lang.Object r3 = r5.get(r3)
            l21 r3 = (defpackage.l21) r3
            r0.S(r3)
            int r2 = r2 + 1
            goto L13d
        L151:
            rq7 r0 = (defpackage.rq7) r0
            r1 = r6
        L154:
            int r2 = r0.u0
            if (r1 >= r2) goto L11d
            l21[] r2 = r0.t0
            r2 = r2[r1]
            if (r2 == 0) goto L160
            r2.F = r7
        L160:
            int r1 = r1 + 1
            goto L154
        L163:
            return
    }
}

package androidx.constraintlayout.motion.widget;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class MotionLayout extends androidx.constraintlayout.widget.ConstraintLayout implements defpackage.le4 {
    public static boolean t1;
    public long A0;
    public float B0;
    public float C0;
    public float D0;
    public long E0;
    public float F0;
    public boolean G0;
    public boolean H0;
    public int I0;
    public defpackage.v74 J0;
    public boolean K0;
    public final defpackage.yq6 L0;
    public final defpackage.u74 M0;
    public defpackage.ki1 N0;
    public int O0;
    public int P0;
    public boolean Q0;
    public float R0;
    public float S0;
    public long T0;
    public float U0;
    public boolean V0;
    public int W0;
    public long X0;
    public float Y0;
    public boolean Z0;
    public int a1;
    public int b1;
    public int c1;
    public int d1;
    public int e1;
    public int f1;
    public float g1;
    public final defpackage.ng3 h1;
    public boolean i1;
    public androidx.constraintlayout.motion.widget.a j1;
    public defpackage.q64 k1;
    public final android.graphics.Rect l1;
    public boolean m1;
    public androidx.constraintlayout.motion.widget.MotionLayout.a n1;
    public final defpackage.w74 o1;
    public androidx.constraintlayout.motion.widget.b p0;
    public boolean p1;
    public defpackage.t74 q0;
    public final android.graphics.RectF q1;
    public android.view.animation.Interpolator r0;
    public android.view.View r1;
    public float s0;
    public android.graphics.Matrix s1;
    public int t0;
    public int u0;
    public int v0;
    public int w0;
    public int x0;
    public boolean y0;
    public final java.util.HashMap z0;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout.a[] $VALUES = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.a FINISHED = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.a MOVING = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.a SETUP = null;
        public static final androidx.constraintlayout.motion.widget.MotionLayout.a UNDEFINED = null;

        private static /* synthetic */ androidx.constraintlayout.motion.widget.MotionLayout.a[] $values() {
                androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.UNDEFINED
                androidx.constraintlayout.motion.widget.MotionLayout$a r1 = androidx.constraintlayout.motion.widget.MotionLayout.a.SETUP
                androidx.constraintlayout.motion.widget.MotionLayout$a r2 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
                androidx.constraintlayout.motion.widget.MotionLayout$a r3 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
                androidx.constraintlayout.motion.widget.MotionLayout$a[] r0 = new androidx.constraintlayout.motion.widget.MotionLayout.a[]{r0, r1, r2, r3}
                return r0
        }

        static {
                androidx.constraintlayout.motion.widget.MotionLayout$a r0 = new androidx.constraintlayout.motion.widget.MotionLayout$a
                java.lang.String r1 = "UNDEFINED"
                r2 = 0
                r0.<init>(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout.a.UNDEFINED = r0
                androidx.constraintlayout.motion.widget.MotionLayout$a r0 = new androidx.constraintlayout.motion.widget.MotionLayout$a
                java.lang.String r1 = "SETUP"
                r2 = 1
                r0.<init>(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout.a.SETUP = r0
                androidx.constraintlayout.motion.widget.MotionLayout$a r0 = new androidx.constraintlayout.motion.widget.MotionLayout$a
                java.lang.String r1 = "MOVING"
                r2 = 2
                r0.<init>(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING = r0
                androidx.constraintlayout.motion.widget.MotionLayout$a r0 = new androidx.constraintlayout.motion.widget.MotionLayout$a
                java.lang.String r1 = "FINISHED"
                r2 = 3
                r0.<init>(r1, r2)
                androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED = r0
                androidx.constraintlayout.motion.widget.MotionLayout$a[] r0 = $values()
                androidx.constraintlayout.motion.widget.MotionLayout.a.$VALUES = r0
                return
        }

        a(java.lang.String r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2)
                return
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.a valueOf(java.lang.String r1) {
                java.lang.Class<androidx.constraintlayout.motion.widget.MotionLayout$a> r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                androidx.constraintlayout.motion.widget.MotionLayout$a r1 = (androidx.constraintlayout.motion.widget.MotionLayout.a) r1
                return r1
        }

        public static androidx.constraintlayout.motion.widget.MotionLayout.a[] values() {
                androidx.constraintlayout.motion.widget.MotionLayout$a[] r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.$VALUES
                java.lang.Object r0 = r0.clone()
                androidx.constraintlayout.motion.widget.MotionLayout$a[] r0 = (androidx.constraintlayout.motion.widget.MotionLayout.a[]) r0
                return r0
        }
    }

    public MotionLayout(android.content.Context r13, android.util.AttributeSet r14) {
            r12 = this;
            r12.<init>(r13, r14)
            r13 = 0
            r12.r0 = r13
            r0 = 0
            r12.s0 = r0
            r1 = -1
            r12.t0 = r1
            r12.u0 = r1
            r12.v0 = r1
            r2 = 0
            r12.w0 = r2
            r12.x0 = r2
            r3 = 1
            r12.y0 = r3
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            r12.z0 = r4
            r4 = 0
            r12.A0 = r4
            r4 = 1065353216(0x3f800000, float:1.0)
            r12.B0 = r4
            r12.C0 = r0
            r12.D0 = r0
            r12.F0 = r0
            r12.H0 = r2
            r12.I0 = r2
            r12.K0 = r2
            yq6 r4 = new yq6
            r4.<init>()
            zq6 r5 = new zq6
            r5.<init>()
            r5.k = r2
            r4.a = r5
            r4.c = r5
            r12.L0 = r4
            u74 r4 = new u74
            r4.<init>(r12)
            r12.M0 = r4
            r12.Q0 = r2
            r12.V0 = r2
            r12.W0 = r2
            r4 = -1
            r12.X0 = r4
            r12.Y0 = r0
            r12.Z0 = r2
            ng3 r4 = new ng3
            r4.<init>(r2)
            r12.h1 = r4
            r12.i1 = r2
            r12.k1 = r13
            java.util.HashMap r4 = new java.util.HashMap
            r4.<init>()
            android.graphics.Rect r4 = new android.graphics.Rect
            r4.<init>()
            r12.l1 = r4
            r12.m1 = r2
            androidx.constraintlayout.motion.widget.MotionLayout$a r4 = androidx.constraintlayout.motion.widget.MotionLayout.a.UNDEFINED
            r12.n1 = r4
            w74 r4 = new w74
            r4.<init>(r12)
            r12.o1 = r4
            r12.p1 = r2
            android.graphics.RectF r4 = new android.graphics.RectF
            r4.<init>()
            r12.q1 = r4
            r12.r1 = r13
            r12.s1 = r13
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            boolean r4 = r12.isInEditMode()
            androidx.constraintlayout.motion.widget.MotionLayout.t1 = r4
            java.lang.String r4 = "MotionLayout"
            if (r14 == 0) goto L10d
            android.content.Context r5 = r12.getContext()
            int[] r6 = defpackage.e75.l
            android.content.res.TypedArray r14 = r5.obtainStyledAttributes(r14, r6)
            int r5 = r14.getIndexCount()
            r6 = r2
            r7 = r3
        Laa:
            if (r6 >= r5) goto Lfd
            int r8 = r14.getIndex(r6)
            r9 = 2
            if (r8 != r9) goto Lc3
            int r8 = r14.getResourceId(r8, r1)
            androidx.constraintlayout.motion.widget.b r9 = new androidx.constraintlayout.motion.widget.b
            android.content.Context r10 = r12.getContext()
            r9.<init>(r10, r12, r8)
            r12.p0 = r9
            goto Lfa
        Lc3:
            if (r8 != r3) goto Lcc
            int r8 = r14.getResourceId(r8, r1)
            r12.u0 = r8
            goto Lfa
        Lcc:
            r10 = 4
            if (r8 != r10) goto Ld8
            float r8 = r14.getFloat(r8, r0)
            r12.F0 = r8
            r12.H0 = r3
            goto Lfa
        Ld8:
            if (r8 != 0) goto Ldf
            boolean r7 = r14.getBoolean(r8, r7)
            goto Lfa
        Ldf:
            r10 = 5
            if (r8 != r10) goto Lf1
            int r10 = r12.I0
            if (r10 != 0) goto Lfa
            boolean r8 = r14.getBoolean(r8, r2)
            if (r8 == 0) goto Led
            goto Lee
        Led:
            r9 = r2
        Lee:
            r12.I0 = r9
            goto Lfa
        Lf1:
            r9 = 3
            if (r8 != r9) goto Lfa
            int r8 = r14.getInt(r8, r2)
            r12.I0 = r8
        Lfa:
            int r6 = r6 + 1
            goto Laa
        Lfd:
            r14.recycle()
            androidx.constraintlayout.motion.widget.b r14 = r12.p0
            if (r14 != 0) goto L109
            java.lang.String r14 = "WARNING NO app:layoutDescription tag"
            android.util.Log.e(r4, r14)
        L109:
            if (r7 != 0) goto L10d
            r12.p0 = r13
        L10d:
            int r13 = r12.I0
            if (r13 == 0) goto L29d
            androidx.constraintlayout.motion.widget.b r13 = r12.p0
            if (r13 != 0) goto L11c
            java.lang.String r13 = "CHECK: motion scene not set! set \"app:layoutDescription=\"@xml/file\""
            android.util.Log.e(r4, r13)
            goto L29d
        L11c:
            int r13 = r13.g()
            androidx.constraintlayout.motion.widget.b r14 = r12.p0
            int r0 = r14.g()
            z11 r14 = r14.b(r0)
            android.content.Context r0 = r12.getContext()
            java.lang.String r13 = defpackage.lb4.x(r0, r13)
            int r0 = r12.getChildCount()
            r3 = r2
        L137:
            java.lang.String r5 = "CHECK: "
            if (r3 >= r0) goto L17f
            android.view.View r6 = r12.getChildAt(r3)
            int r7 = r6.getId()
            if (r7 != r1) goto L162
            java.lang.String r8 = " ALL VIEWS SHOULD HAVE ID's "
            java.lang.StringBuilder r8 = defpackage.i61.t(r5, r13, r8)
            java.lang.Class r9 = r6.getClass()
            java.lang.String r9 = r9.getName()
            r8.append(r9)
            java.lang.String r9 = " does not!"
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.w(r4, r8)
        L162:
            u11 r7 = r14.i(r7)
            if (r7 != 0) goto L17c
            java.lang.String r7 = " NO CONSTRAINTS for "
            java.lang.StringBuilder r5 = defpackage.i61.t(r5, r13, r7)
            java.lang.String r6 = defpackage.lb4.y(r6)
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            android.util.Log.w(r4, r5)
        L17c:
            int r3 = r3 + 1
            goto L137
        L17f:
            java.util.HashMap r0 = r14.g
            java.util.Set r0 = r0.keySet()
            java.lang.Integer[] r3 = new java.lang.Integer[r2]
            java.lang.Object[] r0 = r0.toArray(r3)
            java.lang.Integer[] r0 = (java.lang.Integer[]) r0
            int r3 = r0.length
            int[] r6 = new int[r3]
            r7 = r2
        L191:
            if (r7 >= r3) goto L19e
            r8 = r0[r7]
            int r8 = r8.intValue()
            r6[r7] = r8
            int r7 = r7 + 1
            goto L191
        L19e:
            r0 = r2
        L19f:
            if (r0 >= r3) goto L1e1
            r7 = r6[r0]
            android.content.Context r8 = r12.getContext()
            java.lang.String r8 = defpackage.lb4.x(r8, r7)
            r9 = r6[r0]
            android.view.View r9 = r12.findViewById(r9)
            if (r9 != 0) goto L1b8
            java.lang.String r9 = " NO View matches id "
            defpackage.lb1.w(r5, r13, r9, r8, r4)
        L1b8:
            u11 r9 = r14.h(r7)
            v11 r9 = r9.e
            int r9 = r9.d
            java.lang.String r10 = ") no LAYOUT_HEIGHT"
            java.lang.String r11 = "("
            if (r9 != r1) goto L1cd
            java.lang.String r9 = defpackage.lb1.n(r5, r13, r11, r8, r10)
            android.util.Log.w(r4, r9)
        L1cd:
            u11 r7 = r14.h(r7)
            v11 r7 = r7.e
            int r7 = r7.c
            if (r7 != r1) goto L1de
            java.lang.String r7 = defpackage.lb1.n(r5, r13, r11, r8, r10)
            android.util.Log.w(r4, r7)
        L1de:
            int r0 = r0 + 1
            goto L19f
        L1e1:
            android.util.SparseIntArray r13 = new android.util.SparseIntArray
            r13.<init>()
            android.util.SparseIntArray r14 = new android.util.SparseIntArray
            r14.<init>()
            androidx.constraintlayout.motion.widget.b r0 = r12.p0
            java.util.ArrayList r0 = r0.d
            int r3 = r0.size()
        L1f3:
            if (r2 >= r3) goto L29d
            java.lang.Object r5 = r0.get(r2)
            int r2 = r2 + 1
            b84 r5 = (defpackage.b84) r5
            androidx.constraintlayout.motion.widget.b r6 = r12.p0
            b84 r6 = r6.c
            if (r5 != r6) goto L208
            java.lang.String r6 = "CHECK: CURRENT"
            android.util.Log.v(r4, r6)
        L208:
            int r6 = r5.d
            int r7 = r5.c
            if (r6 != r7) goto L213
            java.lang.String r6 = "CHECK: start and end constraint set should not be the same!"
            android.util.Log.e(r4, r6)
        L213:
            int r6 = r5.d
            int r5 = r5.c
            android.content.Context r7 = r12.getContext()
            java.lang.String r7 = defpackage.lb4.x(r7, r6)
            android.content.Context r8 = r12.getContext()
            java.lang.String r8 = defpackage.lb4.x(r8, r5)
            int r9 = r13.get(r6)
            java.lang.String r10 = "->"
            if (r9 != r5) goto L246
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "CHECK: two transitions with the same start and end "
            r9.<init>(r11)
            r9.append(r7)
            r9.append(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            android.util.Log.e(r4, r9)
        L246:
            int r9 = r14.get(r5)
            if (r9 != r6) goto L263
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r11 = "CHECK: you can't have reverse transitions"
            r9.<init>(r11)
            r9.append(r7)
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            android.util.Log.e(r4, r8)
        L263:
            r13.put(r6, r5)
            r14.put(r5, r6)
            androidx.constraintlayout.motion.widget.b r8 = r12.p0
            z11 r6 = r8.b(r6)
            if (r6 != 0) goto L282
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r8 = " no such constraintSetStart "
            r6.<init>(r8)
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            android.util.Log.e(r4, r6)
        L282:
            androidx.constraintlayout.motion.widget.b r6 = r12.p0
            z11 r5 = r6.b(r5)
            if (r5 != 0) goto L1f3
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = " no such constraintSetEnd "
            r5.<init>(r6)
            r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.e(r4, r5)
            goto L1f3
        L29d:
            int r13 = r12.u0
            if (r13 != r1) goto L2be
            androidx.constraintlayout.motion.widget.b r13 = r12.p0
            if (r13 == 0) goto L2be
            int r13 = r13.g()
            r12.u0 = r13
            androidx.constraintlayout.motion.widget.b r13 = r12.p0
            int r13 = r13.g()
            r12.t0 = r13
            androidx.constraintlayout.motion.widget.b r13 = r12.p0
            b84 r13 = r13.c
            if (r13 != 0) goto L2ba
            goto L2bc
        L2ba:
            int r1 = r13.c
        L2bc:
            r12.v0 = r1
        L2be:
            return
    }

    public static android.graphics.Rect o(androidx.constraintlayout.motion.widget.MotionLayout r2, defpackage.l21 r3) {
            android.graphics.Rect r2 = r2.l1
            int r0 = r3.t()
            r2.top = r0
            int r0 = r3.s()
            r2.left = r0
            int r0 = r3.r()
            int r1 = r2.left
            int r0 = r0 + r1
            r2.right = r0
            int r3 = r3.l()
            int r0 = r2.top
            int r3 = r3 + r0
            r2.bottom = r3
            return r2
    }

    public final void A(int r4, defpackage.z11 r5) {
            r3 = this;
            androidx.constraintlayout.motion.widget.b r0 = r3.p0
            if (r0 == 0) goto L9
            android.util.SparseArray r0 = r0.g
            r0.put(r4, r5)
        L9:
            androidx.constraintlayout.motion.widget.b r0 = r3.p0
            int r1 = r3.t0
            z11 r0 = r0.b(r1)
            androidx.constraintlayout.motion.widget.b r1 = r3.p0
            int r2 = r3.v0
            z11 r1 = r1.b(r2)
            w74 r2 = r3.o1
            r2.e(r0, r1)
            r3.v()
            int r0 = r3.u0
            if (r0 != r4) goto L28
            r5.b(r3)
        L28:
            return
    }

    public final void B(int r14, android.view.View... r15) {
            r13 = this;
            androidx.constraintlayout.motion.widget.b r13 = r13.p0
            if (r13 == 0) goto L98
            pa r1 = r13.q
            java.lang.Object r13 = r1.X
            java.lang.String r13 = (java.lang.String) r13
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.lang.Object r0 = r1.L
            r7 = r0
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            int r8 = r7.size()
            r9 = 0
            r10 = 0
            r0 = r9
            r2 = r10
        L1c:
            if (r2 >= r8) goto L90
            java.lang.Object r3 = r7.get(r2)
            int r11 = r2 + 1
            yp7 r3 = (defpackage.yp7) r3
            int r2 = r3.a
            if (r2 != r14) goto L8e
            int r0 = r15.length
            r2 = r10
        L2c:
            if (r2 >= r0) goto L3c
            r4 = r15[r2]
            boolean r5 = r3.b(r4)
            if (r5 == 0) goto L39
            r6.add(r4)
        L39:
            int r2 = r2 + 1
            goto L2c
        L3c:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L8d
            android.view.View[] r0 = new android.view.View[r10]
            java.lang.Object[] r0 = r6.toArray(r0)
            r5 = r0
            android.view.View[] r5 = (android.view.View[]) r5
            java.lang.Object r0 = r1.B
            androidx.constraintlayout.motion.widget.MotionLayout r0 = (androidx.constraintlayout.motion.widget.MotionLayout) r0
            r2 = r0
            r0 = r3
            int r3 = r2.getCurrentState()
            int r4 = r0.e
            r12 = 2
            if (r4 == r12) goto L81
            r4 = -1
            if (r3 != r4) goto L6b
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "No support for ViewTransition within transition yet. Currently: "
            java.lang.String r2 = r3.concat(r2)
            android.util.Log.w(r13, r2)
            goto L89
        L6b:
            androidx.constraintlayout.motion.widget.b r2 = r2.p0
            if (r2 != 0) goto L71
            r4 = r9
            goto L76
        L71:
            z11 r2 = r2.b(r3)
            r4 = r2
        L76:
            if (r4 != 0) goto L79
            goto L89
        L79:
            java.lang.Object r2 = r1.B
            androidx.constraintlayout.motion.widget.MotionLayout r2 = (androidx.constraintlayout.motion.widget.MotionLayout) r2
            r0.a(r1, r2, r3, r4, r5)
            goto L89
        L81:
            java.lang.Object r2 = r1.B
            androidx.constraintlayout.motion.widget.MotionLayout r2 = (androidx.constraintlayout.motion.widget.MotionLayout) r2
            r4 = 0
            r0.a(r1, r2, r3, r4, r5)
        L89:
            r6.clear()
            goto L8e
        L8d:
            r0 = r3
        L8e:
            r2 = r11
            goto L1c
        L90:
            if (r0 != 0) goto L97
            java.lang.String r14 = " Could not find ViewTransition"
            android.util.Log.e(r13, r14)
        L97:
            return
        L98:
            java.lang.String r13 = "MotionLayout"
            java.lang.String r14 = " no motionScene"
            android.util.Log.e(r13, r14)
            return
    }

    @Override // defpackage.le4
    public final void a(android.view.View r1, int r2, int r3, int r4, int r5, int r6, int[] r7) {
            r0 = this;
            boolean r1 = r0.Q0
            r6 = 0
            if (r1 != 0) goto L9
            if (r2 != 0) goto L9
            if (r3 == 0) goto L14
        L9:
            r1 = r7[r6]
            int r1 = r1 + r4
            r7[r6] = r1
            r1 = 1
            r2 = r7[r1]
            int r2 = r2 + r5
            r7[r1] = r2
        L14:
            r0.Q0 = r6
            return
    }

    @Override // defpackage.ke4
    public final void b(android.view.View r1, int r2, int r3, int r4, int r5, int r6) {
            r0 = this;
            return
    }

    @Override // defpackage.ke4
    public final boolean c(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            androidx.constraintlayout.motion.widget.b r0 = r0.p0
            if (r0 == 0) goto L15
            b84 r0 = r0.c
            if (r0 == 0) goto L15
            androidx.constraintlayout.motion.widget.c r0 = r0.l
            if (r0 == 0) goto L15
            int r0 = r0.w
            r0 = r0 & 2
            if (r0 == 0) goto L13
            goto L15
        L13:
            r0 = 1
            return r0
        L15:
            r0 = 0
            return r0
    }

    @Override // defpackage.ke4
    public final void d(android.view.View r1, android.view.View r2, int r3, int r4) {
            r0 = this;
            long r1 = r0.getNanoTime()
            r0.T0 = r1
            r1 = 0
            r0.U0 = r1
            r0.R0 = r1
            r0.S0 = r1
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void dispatchDraw(android.graphics.Canvas r39) {
            r38 = this;
            r0 = r38
            r1 = r39
            r2 = 0
            r0.r(r2)
            androidx.constraintlayout.motion.widget.b r3 = r0.p0
            r4 = 0
            if (r3 == 0) goto L45
            pa r3 = r3.q
            if (r3 == 0) goto L45
            java.lang.Object r5 = r3.Z
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r3.Y
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            if (r6 != 0) goto L1c
            goto L45
        L1c:
            int r7 = r6.size()
            r8 = r2
        L21:
            if (r8 >= r7) goto L2f
            java.lang.Object r9 = r6.get(r8)
            int r8 = r8 + 1
            xp7 r9 = (defpackage.xp7) r9
            r9.a()
            goto L21
        L2f:
            java.lang.Object r6 = r3.Y
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r6.removeAll(r5)
            r5.clear()
            java.lang.Object r5 = r3.Y
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L45
            r3.Y = r4
        L45:
            super.dispatchDraw(r39)
            androidx.constraintlayout.motion.widget.b r3 = r0.p0
            if (r3 != 0) goto L4e
            goto L568
        L4e:
            int r3 = r0.I0
            r5 = 1
            r3 = r3 & r5
            r6 = 1093664768(0x41300000, float:11.0)
            r7 = 1092616192(0x41200000, float:10.0)
            if (r3 != r5) goto L131
            boolean r3 = r0.isInEditMode()
            if (r3 != 0) goto L131
            int r3 = r0.W0
            int r3 = r3 + r5
            r0.W0 = r3
            long r8 = r0.getNanoTime()
            long r10 = r0.X0
            r12 = -1
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 == 0) goto L8e
            long r10 = r8 - r10
            r12 = 200000000(0xbebc200, double:9.8813129E-316)
            int r3 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r3 <= 0) goto L90
            int r3 = r0.W0
            float r3 = (float) r3
            float r10 = (float) r10
            r11 = 814313567(0x3089705f, float:1.0E-9)
            float r10 = r10 * r11
            float r3 = r3 / r10
            r10 = 1120403456(0x42c80000, float:100.0)
            float r3 = r3 * r10
            int r3 = (int) r3
            float r3 = (float) r3
            float r3 = r3 / r10
            r0.Y0 = r3
            r0.W0 = r2
            r0.X0 = r8
            goto L90
        L8e:
            r0.X0 = r8
        L90:
            android.graphics.Paint r3 = new android.graphics.Paint
            r3.<init>()
            r8 = 1109917696(0x42280000, float:42.0)
            r3.setTextSize(r8)
            float r8 = r0.getProgress()
            r9 = 1148846080(0x447a0000, float:1000.0)
            float r8 = r8 * r9
            int r8 = (int) r8
            float r8 = (float) r8
            float r8 = r8 / r7
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            r9.<init>()
            float r10 = r0.Y0
            r9.append(r10)
            java.lang.String r10 = " fps "
            r9.append(r10)
            int r10 = r0.t0
            java.lang.String r11 = "UNDEFINED"
            r12 = -1
            if (r10 != r12) goto Lbc
            r10 = r11
            goto Lc8
        Lbc:
            android.content.Context r13 = r0.getContext()
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r10 = r13.getResourceEntryName(r10)
        Lc8:
            java.lang.String r13 = " -> "
            java.lang.String r9 = defpackage.i61.n(r9, r10, r13)
            java.lang.StringBuilder r9 = defpackage.lb1.s(r9)
            int r10 = r0.v0
            if (r10 != r12) goto Ld8
            r10 = r11
            goto Le4
        Ld8:
            android.content.Context r13 = r0.getContext()
            android.content.res.Resources r13 = r13.getResources()
            java.lang.String r10 = r13.getResourceEntryName(r10)
        Le4:
            r9.append(r10)
            java.lang.String r10 = " (progress: "
            r9.append(r10)
            r9.append(r8)
            java.lang.String r8 = " ) state="
            r9.append(r8)
            int r8 = r0.u0
            if (r8 != r12) goto Lfb
            java.lang.String r8 = "undefined"
            goto L10b
        Lfb:
            if (r8 != r12) goto Lfe
            goto L10a
        Lfe:
            android.content.Context r10 = r0.getContext()
            android.content.res.Resources r10 = r10.getResources()
            java.lang.String r11 = r10.getResourceEntryName(r8)
        L10a:
            r8 = r11
        L10b:
            r9.append(r8)
            java.lang.String r8 = r9.toString()
            r9 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r3.setColor(r9)
            int r9 = r0.getHeight()
            int r9 = r9 + (-29)
            float r9 = (float) r9
            r1.drawText(r8, r6, r9, r3)
            r9 = -7864184(0xffffffffff880088, float:NaN)
            r3.setColor(r9)
            int r9 = r0.getHeight()
            int r9 = r9 + (-30)
            float r9 = (float) r9
            r1.drawText(r8, r7, r9, r3)
        L131:
            int r3 = r0.I0
            if (r3 <= r5) goto L568
            v74 r3 = r0.J0
            if (r3 != 0) goto L140
            v74 r3 = new v74
            r3.<init>(r0)
            r0.J0 = r3
        L140:
            v74 r3 = r0.J0
            androidx.constraintlayout.motion.widget.b r8 = r0.p0
            b84 r9 = r8.c
            if (r9 == 0) goto L14b
            int r8 = r9.h
            goto L14d
        L14b:
            int r8 = r8.j
        L14d:
            int r9 = r0.I0
            android.graphics.Paint r10 = r3.g
            android.graphics.Paint r11 = r3.f
            android.graphics.Paint r12 = r3.i
            int r13 = r3.m
            android.graphics.Paint r14 = r3.e
            androidx.constraintlayout.motion.widget.MotionLayout r15 = r3.n
            java.util.HashMap r0 = r0.z0
            if (r0 == 0) goto L568
            int r16 = r0.size()
            if (r16 != 0) goto L167
            goto L568
        L167:
            r1.save()
            boolean r16 = r15.isInEditMode()
            r17 = r2
            r2 = 2
            if (r16 != 0) goto L1b3
            r4 = r9 & 1
            if (r4 != r2) goto L1b3
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            android.content.Context r18 = r15.getContext()
            android.content.res.Resources r2 = r18.getResources()
            int r5 = r15.v0
            java.lang.String r2 = r2.getResourceName(r5)
            r4.append(r2)
            java.lang.String r2 = ":"
            r4.append(r2)
            float r2 = r15.getProgress()
            r4.append(r2)
            java.lang.String r2 = r4.toString()
            int r4 = r15.getHeight()
            int r4 = r4 + (-30)
            float r4 = (float) r4
            android.graphics.Paint r5 = r3.h
            r1.drawText(r2, r7, r4, r5)
            int r4 = r15.getHeight()
            int r4 = r4 + (-29)
            float r4 = (float) r4
            r1.drawText(r2, r6, r4, r14)
        L1b3:
            java.util.Collection r0 = r0.values()
            java.util.Iterator r0 = r0.iterator()
        L1bb:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L565
            java.lang.Object r2 = r0.next()
            m74 r2 = (defpackage.m74) r2
            y74 r4 = r2.f
            java.util.ArrayList r5 = r2.u
            int r6 = r4.B
            int r7 = r5.size()
            r15 = r17
        L1d3:
            if (r15 >= r7) goto L1ea
            java.lang.Object r19 = r5.get(r15)
            int r15 = r15 + 1
            r20 = r0
            r0 = r19
            y74 r0 = (defpackage.y74) r0
            int r0 = r0.B
            int r6 = java.lang.Math.max(r6, r0)
            r0 = r20
            goto L1d3
        L1ea:
            r20 = r0
            y74 r0 = r2.g
            int r0 = r0.B
            int r0 = java.lang.Math.max(r6, r0)
            if (r9 <= 0) goto L1f9
            if (r0 != 0) goto L1f9
            r0 = 1
        L1f9:
            if (r0 != 0) goto L1fe
            r0 = r20
            goto L1bb
        L1fe:
            float[] r6 = r3.c
            int[] r7 = r3.b
            if (r6 == 0) goto L26e
            ak7[] r15 = r2.j
            r15 = r15[r17]
            double[] r15 = r15.g0()
            r26 = r6
            if (r7 == 0) goto L233
            int r6 = r5.size()
            r21 = r7
            r7 = r17
            r19 = r7
        L21a:
            if (r7 >= r6) goto L233
            java.lang.Object r22 = r5.get(r7)
            int r7 = r7 + 1
            r23 = r6
            r6 = r22
            y74 r6 = (defpackage.y74) r6
            int r22 = r19 + 1
            int r6 = r6.k0
            r21[r19] = r6
            r19 = r22
            r6 = r23
            goto L21a
        L233:
            r6 = r17
            r27 = r6
        L237:
            int r7 = r15.length
            if (r6 >= r7) goto L265
            ak7[] r7 = r2.j
            r7 = r7[r17]
            r19 = r8
            r28 = r9
            r8 = r15[r6]
            r29 = r6
            double[] r6 = r2.p
            r7.a0(r8, r6)
            y74 r6 = r2.f
            r22 = r15[r29]
            int[] r7 = r2.o
            double[] r8 = r2.p
            r21 = r6
            r24 = r7
            r25 = r8
            r21.c(r22, r24, r25, r26, r27)
            int r27 = r27 + 2
            int r6 = r29 + 1
            r8 = r19
            r9 = r28
            goto L237
        L265:
            r19 = r8
            r28 = r9
            int r27 = r27 / 2
            r6 = r27
            goto L274
        L26e:
            r19 = r8
            r28 = r9
            r6 = r17
        L274:
            r3.k = r6
            r6 = 1
            if (r0 < r6) goto L54e
            int r8 = r19 / 16
            float[] r6 = r3.a
            if (r6 == 0) goto L284
            int r6 = r6.length
            int r7 = r8 * 2
            if (r6 == r7) goto L291
        L284:
            int r6 = r8 * 2
            float[] r6 = new float[r6]
            r3.a = r6
            android.graphics.Path r6 = new android.graphics.Path
            r6.<init>()
            r3.d = r6
        L291:
            float r6 = (float) r13
            r1.translate(r6, r6)
            r6 = 1996488704(0x77000000, float:2.5961484E33)
            r14.setColor(r6)
            r12.setColor(r6)
            r11.setColor(r6)
            r10.setColor(r6)
            float[] r6 = r3.a
            int r7 = r8 + (-1)
            float r7 = (float) r7
            r9 = 1065353216(0x3f800000, float:1.0)
            float r7 = r9 / r7
            java.util.HashMap r15 = r2.y
            r29 = r9
            java.lang.String r9 = "translationX"
            if (r15 != 0) goto L2b8
            r15 = 0
        L2b5:
            r26 = r6
            goto L2bf
        L2b8:
            java.lang.Object r15 = r15.get(r9)
            qp7 r15 = (defpackage.qp7) r15
            goto L2b5
        L2bf:
            java.util.HashMap r6 = r2.y
            r30 = r7
            java.lang.String r7 = "translationY"
            if (r6 != 0) goto L2cb
            r6 = 0
        L2c8:
            r31 = r13
            goto L2d2
        L2cb:
            java.lang.Object r6 = r6.get(r7)
            qp7 r6 = (defpackage.qp7) r6
            goto L2c8
        L2d2:
            java.util.HashMap r13 = r2.z
            if (r13 != 0) goto L2d8
            r9 = 0
            goto L2de
        L2d8:
            java.lang.Object r9 = r13.get(r9)
            hp7 r9 = (defpackage.hp7) r9
        L2de:
            java.util.HashMap r13 = r2.z
            if (r13 != 0) goto L2e4
            r7 = 0
            goto L2ea
        L2e4:
            java.lang.Object r7 = r13.get(r7)
            hp7 r7 = (defpackage.hp7) r7
        L2ea:
            r13 = r17
        L2ec:
            r21 = 2143289344(0x7fc00000, float:NaN)
            r22 = 0
            if (r13 >= r8) goto L3ff
            r32 = r8
            float r8 = (float) r13
            float r8 = r8 * r30
            r23 = r8
            float r8 = r2.n
            int r24 = (r8 > r29 ? 1 : (r8 == r29 ? 0 : -1))
            if (r24 == 0) goto L32d
            r24 = r8
            float r8 = r2.m
            int r25 = (r23 > r8 ? 1 : (r23 == r8 ? 0 : -1))
            if (r25 >= 0) goto L30c
            r25 = r8
            r8 = r22
            goto L310
        L30c:
            r25 = r8
            r8 = r23
        L310:
            int r23 = (r8 > r25 ? 1 : (r8 == r25 ? 0 : -1))
            r33 = r12
            r34 = r13
            if (r23 <= 0) goto L32a
            double r12 = (double) r8
            r35 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r12 = (r12 > r35 ? 1 : (r12 == r35 ? 0 : -1))
            if (r12 >= 0) goto L32a
            float r8 = r8 - r25
            float r8 = r8 * r24
            r12 = r29
            float r8 = java.lang.Math.min(r8, r12)
            goto L333
        L32a:
            r12 = r29
            goto L333
        L32d:
            r33 = r12
            r34 = r13
            r8 = r23
        L333:
            double r12 = (double) r8
            r23 = r12
            gr1 r12 = r4.A
            int r13 = r5.size()
            r35 = r4
            r4 = r17
        L340:
            if (r4 >= r13) goto L370
            java.lang.Object r25 = r5.get(r4)
            int r4 = r4 + 1
            r27 = r4
            r4 = r25
            y74 r4 = (defpackage.y74) r4
            r36 = r5
            gr1 r5 = r4.A
            if (r5 == 0) goto L36b
            r25 = r5
            float r5 = r4.L
            int r37 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r37 >= 0) goto L361
            r22 = r5
            r12 = r25
            goto L36b
        L361:
            boolean r5 = java.lang.Float.isNaN(r21)
            if (r5 == 0) goto L36b
            float r4 = r4.L
            r21 = r4
        L36b:
            r4 = r27
            r5 = r36
            goto L340
        L370:
            r36 = r5
            if (r12 == 0) goto L38e
            boolean r4 = java.lang.Float.isNaN(r21)
            if (r4 == 0) goto L37c
            r21 = 1065353216(0x3f800000, float:1.0)
        L37c:
            float r4 = r8 - r22
            float r21 = r21 - r22
            float r4 = r4 / r21
            double r4 = (double) r4
            double r4 = r12.a(r4)
            float r4 = (float) r4
            float r4 = r4 * r21
            float r4 = r4 + r22
            double r12 = (double) r4
            goto L390
        L38e:
            r12 = r23
        L390:
            ak7[] r4 = r2.j
            r4 = r4[r17]
            double[] r5 = r2.p
            r4.a0(r12, r5)
            wt r4 = r2.k
            if (r4 == 0) goto L3a8
            double[] r5 = r2.p
            r37 = r10
            int r10 = r5.length
            if (r10 <= 0) goto L3aa
            r4.a0(r12, r5)
            goto L3aa
        L3a8:
            r37 = r10
        L3aa:
            y74 r4 = r2.f
            int[] r5 = r2.o
            double[] r10 = r2.p
            int r27 = r34 * 2
            r21 = r4
            r24 = r5
            r25 = r10
            r22 = r12
            r21.c(r22, r24, r25, r26, r27)
            if (r9 == 0) goto L3c9
            r4 = r26[r27]
            float r5 = r9.a(r8)
            float r5 = r5 + r4
            r26[r27] = r5
            goto L3d4
        L3c9:
            if (r15 == 0) goto L3d4
            r4 = r26[r27]
            float r5 = r15.a(r8)
            float r5 = r5 + r4
            r26[r27] = r5
        L3d4:
            if (r7 == 0) goto L3e2
            int r27 = r27 + 1
            r4 = r26[r27]
            float r5 = r7.a(r8)
            float r5 = r5 + r4
            r26[r27] = r5
            goto L3ef
        L3e2:
            if (r6 == 0) goto L3ef
            int r27 = r27 + 1
            r4 = r26[r27]
            float r5 = r6.a(r8)
            float r5 = r5 + r4
            r26[r27] = r5
        L3ef:
            int r13 = r34 + 1
            r8 = r32
            r12 = r33
            r4 = r35
            r5 = r36
            r10 = r37
            r29 = 1065353216(0x3f800000, float:1.0)
            goto L2ec
        L3ff:
            r35 = r4
            r37 = r10
            r33 = r12
            int r4 = r3.k
            r3.a(r1, r0, r4, r2)
            r4 = -21965(0xffffffffffffaa33, float:NaN)
            r14.setColor(r4)
            r4 = -2067046(0xffffffffffe0759a, float:NaN)
            r11.setColor(r4)
            r5 = r33
            r5.setColor(r4)
            r4 = -13391360(0xffffffffff33aa00, float:-2.388145E38)
            r6 = r37
            r6.setColor(r4)
            r4 = r31
            int r7 = -r4
            float r7 = (float) r7
            r1.translate(r7, r7)
            int r7 = r3.k
            r3.a(r1, r0, r7, r2)
            r7 = 5
            if (r0 != r7) goto L545
            float[] r0 = r3.j
            android.graphics.Path r8 = r3.d
            r8.reset()
            r8 = r17
        L43a:
            r10 = 50
            if (r8 > r10) goto L51c
            float r10 = (float) r8
            r12 = 1112014848(0x42480000, float:50.0)
            float r10 = r10 / r12
            r12 = 0
            float r10 = r2.a(r10, r12)
            ak7[] r13 = r2.j
            r13 = r13[r17]
            r15 = r7
            r16 = r8
            double r7 = (double) r10
            double[] r10 = r2.p
            r13.a0(r7, r10)
            int[] r7 = r2.o
            double[] r8 = r2.p
            r10 = r35
            float r13 = r10.X
            float r12 = r10.Y
            r24 = r15
            float r15 = r10.Z
            r25 = 1073741824(0x40000000, float:2.0)
            float r9 = r10.d0
            r26 = r0
            r27 = r2
            r0 = r17
        L46c:
            int r2 = r7.length
            r31 = r4
            if (r0 >= r2) goto L493
            r33 = r5
            r4 = r8[r0]
            float r4 = (float) r4
            r5 = r7[r0]
            r2 = 1
            if (r5 == r2) goto L48b
            r2 = 2
            if (r5 == r2) goto L489
            r2 = 3
            if (r5 == r2) goto L487
            r2 = 4
            if (r5 == r2) goto L485
            goto L48c
        L485:
            r9 = r4
            goto L48c
        L487:
            r15 = r4
            goto L48c
        L489:
            r12 = r4
            goto L48c
        L48b:
            r13 = r4
        L48c:
            int r0 = r0 + 1
            r4 = r31
            r5 = r33
            goto L46c
        L493:
            r33 = r5
            m74 r0 = r10.i0
            if (r0 == 0) goto L4b9
            double r4 = (double) r13
            double r7 = (double) r12
            double r12 = java.lang.Math.sin(r7)
            double r12 = r12 * r4
            r34 = 0
            double r12 = r12 + r34
            float r0 = r15 / r25
            r30 = r3
            double r2 = (double) r0
            double r12 = r12 - r2
            float r13 = (float) r12
            double r2 = java.lang.Math.cos(r7)
            double r2 = r2 * r4
            double r34 = r34 - r2
            float r0 = r9 / r25
            double r2 = (double) r0
            double r2 = r34 - r2
            float r12 = (float) r2
            goto L4bb
        L4b9:
            r30 = r3
        L4bb:
            float r15 = r15 + r13
            float r9 = r9 + r12
            java.lang.Float.isNaN(r21)
            java.lang.Float.isNaN(r21)
            float r13 = r13 + r22
            float r12 = r12 + r22
            float r15 = r15 + r22
            float r9 = r9 + r22
            r26[r17] = r13
            r18 = 1
            r26[r18] = r12
            r0 = 2
            r26[r0] = r15
            r29 = 3
            r26[r29] = r12
            r2 = 4
            r26[r2] = r15
            r26[r24] = r9
            r3 = 6
            r26[r3] = r13
            r4 = 7
            r26[r4] = r9
            r5 = r30
            android.graphics.Path r7 = r5.d
            r7.moveTo(r13, r12)
            android.graphics.Path r7 = r5.d
            r8 = r26[r0]
            r9 = r26[r29]
            r7.lineTo(r8, r9)
            android.graphics.Path r7 = r5.d
            r2 = 4
            r2 = r26[r2]
            r8 = r26[r24]
            r7.lineTo(r2, r8)
            android.graphics.Path r2 = r5.d
            r3 = r26[r3]
            r4 = r26[r4]
            r2.lineTo(r3, r4)
            android.graphics.Path r2 = r5.d
            r2.close()
            int r8 = r16 + 1
            r3 = r5
            r35 = r10
            r7 = r24
            r0 = r26
            r2 = r27
            r4 = r31
            r5 = r33
            goto L43a
        L51c:
            r31 = r4
            r33 = r5
            r0 = 2
            r18 = 1
            r25 = 1073741824(0x40000000, float:2.0)
            r5 = r3
            r2 = 1140850688(0x44000000, float:512.0)
            r14.setColor(r2)
            r2 = r25
            r1.translate(r2, r2)
            android.graphics.Path r2 = r5.d
            r1.drawPath(r2, r14)
            r2 = -1073741824(0xffffffffc0000000, float:-2.0)
            r1.translate(r2, r2)
            r2 = -65536(0xffffffffffff0000, float:NaN)
            r14.setColor(r2)
            android.graphics.Path r2 = r5.d
            r1.drawPath(r2, r14)
            goto L557
        L545:
            r31 = r4
            r33 = r5
            r0 = 2
            r18 = 1
            r5 = r3
            goto L557
        L54e:
            r5 = r3
            r18 = r6
            r6 = r10
            r33 = r12
            r31 = r13
            r0 = 2
        L557:
            r3 = r5
            r10 = r6
            r8 = r19
            r0 = r20
            r9 = r28
            r13 = r31
            r12 = r33
            goto L1bb
        L565:
            r1.restore()
        L568:
            return
    }

    @Override // defpackage.ke4
    public final void e(android.view.View r10, int r11) {
            r9 = this;
            androidx.constraintlayout.motion.widget.b r10 = r9.p0
            if (r10 == 0) goto L69
            float r11 = r9.U0
            r0 = 0
            int r1 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r1 != 0) goto Lc
            goto L69
        Lc:
            float r1 = r9.R0
            float r1 = r1 / r11
            float r9 = r9.S0
            float r9 = r9 / r11
            b84 r10 = r10.c
            if (r10 == 0) goto L69
            androidx.constraintlayout.motion.widget.c r10 = r10.l
            if (r10 == 0) goto L69
            float[] r7 = r10.n
            r11 = 0
            r10.m = r11
            androidx.constraintlayout.motion.widget.MotionLayout r8 = r10.r
            float r4 = r8.getProgress()
            androidx.constraintlayout.motion.widget.MotionLayout r2 = r10.r
            int r3 = r10.d
            float r5 = r10.h
            float r6 = r10.g
            r2.s(r3, r4, r5, r6, r7)
            float r2 = r10.k
            r11 = r7[r11]
            float r3 = r10.l
            r5 = 1
            r5 = r7[r5]
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 == 0) goto L40
            float r1 = r1 * r2
            float r1 = r1 / r11
            goto L43
        L40:
            float r9 = r9 * r3
            float r1 = r9 / r5
        L43:
            boolean r9 = java.lang.Float.isNaN(r1)
            if (r9 != 0) goto L4e
            r9 = 1077936128(0x40400000, float:3.0)
            float r9 = r1 / r9
            float r4 = r4 + r9
        L4e:
            int r9 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r9 == 0) goto L69
            r9 = 1065353216(0x3f800000, float:1.0)
            int r11 = (r4 > r9 ? 1 : (r4 == r9 ? 0 : -1))
            if (r11 == 0) goto L69
            int r10 = r10.c
            r11 = 3
            if (r10 == r11) goto L69
            double r2 = (double) r4
            r4 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r11 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r11 >= 0) goto L65
            goto L66
        L65:
            r0 = r9
        L66:
            r8.y(r0, r1, r10)
        L69:
            return
    }

    @Override // defpackage.ke4
    public final void f(android.view.View r19, int r20, int r21, int[] r22, int r23) {
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            r3 = r21
            androidx.constraintlayout.motion.widget.b r4 = r0.p0
            if (r4 != 0) goto Le
            goto L17e
        Le:
            b84 r5 = r4.c
            if (r5 == 0) goto L17e
            boolean r6 = r5.o
            if (r6 == 0) goto L18
            goto L17e
        L18:
            r7 = -1
            if (r6 != 0) goto L2b
            androidx.constraintlayout.motion.widget.c r6 = r5.l
            if (r6 == 0) goto L2b
            int r6 = r6.e
            if (r6 == r7) goto L2b
            int r8 = r1.getId()
            if (r8 == r6) goto L2b
            goto L17e
        L2b:
            b84 r6 = r4.c
            r8 = 0
            if (r6 == 0) goto L37
            androidx.constraintlayout.motion.widget.c r6 = r6.l
            if (r6 == 0) goto L37
            boolean r6 = r6.u
            goto L38
        L37:
            r6 = r8
        L38:
            r9 = 1065353216(0x3f800000, float:1.0)
            r10 = 0
            if (r6 == 0) goto L5a
            androidx.constraintlayout.motion.widget.c r6 = r5.l
            if (r6 == 0) goto L48
            int r6 = r6.w
            r6 = r6 & 4
            if (r6 == 0) goto L48
            r7 = r3
        L48:
            float r6 = r0.C0
            int r11 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r11 == 0) goto L52
            int r6 = (r6 > r10 ? 1 : (r6 == r10 ? 0 : -1))
            if (r6 != 0) goto L5a
        L52:
            boolean r6 = r1.canScrollVertically(r7)
            if (r6 == 0) goto L5a
            goto L17e
        L5a:
            androidx.constraintlayout.motion.widget.c r5 = r5.l
            r6 = 1
            if (r5 == 0) goto Ld4
            int r5 = r5.w
            r5 = r5 & r6
            if (r5 == 0) goto Ld4
            float r5 = (float) r2
            float r7 = (float) r3
            b84 r11 = r4.c
            if (r11 == 0) goto Lad
            androidx.constraintlayout.motion.widget.c r11 = r11.l
            if (r11 == 0) goto Lad
            float[] r12 = r11.n
            androidx.constraintlayout.motion.widget.MotionLayout r13 = r11.r
            float r14 = r13.getProgress()
            r17 = r12
            androidx.constraintlayout.motion.widget.MotionLayout r12 = r11.r
            int r13 = r11.d
            float r15 = r11.h
            r23 = r10
            float r10 = r11.g
            r16 = r10
            r12.s(r13, r14, r15, r16, r17)
            float r10 = r11.k
            int r12 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            r13 = 869711765(0x33d6bf95, float:1.0E-7)
            if (r12 == 0) goto L9d
            r7 = r17[r8]
            int r7 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r7 != 0) goto L98
            r17[r8] = r13
        L98:
            float r5 = r5 * r10
            r7 = r17[r8]
            float r5 = r5 / r7
            goto Lb1
        L9d:
            r5 = r17[r6]
            int r5 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r5 != 0) goto La5
            r17[r6] = r13
        La5:
            float r5 = r11.l
            float r7 = r7 * r5
            r5 = r17[r6]
            float r5 = r7 / r5
            goto Lb1
        Lad:
            r23 = r10
            r5 = r23
        Lb1:
            float r7 = r0.D0
            int r10 = (r7 > r23 ? 1 : (r7 == r23 ? 0 : -1))
            if (r10 > 0) goto Lbb
            int r10 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r10 < 0) goto Lc3
        Lbb:
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 < 0) goto Ld6
            int r5 = (r5 > r23 ? 1 : (r5 == r23 ? 0 : -1))
            if (r5 <= 0) goto Ld6
        Lc3:
            r1.setNestedScrollingEnabled(r8)
            g15 r0 = new g15
            r2 = r1
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            r3 = 16
            r0.<init>(r2, r3)
            r1.post(r0)
            return
        Ld4:
            r23 = r10
        Ld6:
            float r1 = r0.C0
            long r10 = r0.getNanoTime()
            float r5 = (float) r2
            r0.R0 = r5
            float r7 = (float) r3
            r0.S0 = r7
            long r12 = r0.T0
            long r12 = r10 - r12
            double r12 = (double) r12
            r14 = 4472406533629990549(0x3e112e0be826d695, double:1.0E-9)
            double r12 = r12 * r14
            float r12 = (float) r12
            r0.U0 = r12
            r0.T0 = r10
            b84 r4 = r4.c
            if (r4 == 0) goto L167
            androidx.constraintlayout.motion.widget.c r4 = r4.l
            if (r4 == 0) goto L167
            float[] r15 = r4.n
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r4.r
            float r12 = r10.getProgress()
            boolean r11 = r4.m
            if (r11 != 0) goto L10b
            r4.m = r6
            r10.setProgress(r12)
        L10b:
            r11 = r10
            androidx.constraintlayout.motion.widget.MotionLayout r10 = r4.r
            r13 = r11
            int r11 = r4.d
            r14 = r13
            float r13 = r4.h
            r16 = r14
            float r14 = r4.g
            r19 = r16
            r10.s(r11, r12, r13, r14, r15)
            float r10 = r4.k
            r11 = r15[r8]
            float r10 = r10 * r11
            float r11 = r4.l
            r13 = r15[r6]
            float r11 = r11 * r13
            float r11 = r11 + r10
            float r10 = java.lang.Math.abs(r11)
            double r10 = (double) r10
            r13 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            int r10 = (r10 > r13 ? 1 : (r10 == r13 ? 0 : -1))
            if (r10 >= 0) goto L13d
            r10 = 1008981770(0x3c23d70a, float:0.01)
            r15[r8] = r10
            r15[r6] = r10
        L13d:
            float r10 = r4.k
            int r11 = (r10 > r23 ? 1 : (r10 == r23 ? 0 : -1))
            if (r11 == 0) goto L148
            float r5 = r5 * r10
            r4 = r15[r8]
            float r5 = r5 / r4
            goto L14f
        L148:
            float r4 = r4.l
            float r7 = r7 * r4
            r4 = r15[r6]
            float r5 = r7 / r4
        L14f:
            float r12 = r12 + r5
            float r4 = java.lang.Math.min(r12, r9)
            r5 = r23
            float r4 = java.lang.Math.max(r4, r5)
            float r5 = r19.getProgress()
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 == 0) goto L167
            r11 = r19
            r11.setProgress(r4)
        L167:
            float r4 = r0.C0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 == 0) goto L171
            r22[r8] = r2
            r22[r6] = r3
        L171:
            r0.r(r8)
            r1 = r22[r8]
            if (r1 != 0) goto L17c
            r1 = r22[r6]
            if (r1 == 0) goto L17e
        L17c:
            r0.Q0 = r6
        L17e:
            return
    }

    public int[] getConstraintSetIds() {
            r4 = this;
            androidx.constraintlayout.motion.widget.b r4 = r4.p0
            if (r4 != 0) goto L6
            r4 = 0
            return r4
        L6:
            android.util.SparseArray r4 = r4.g
            int r0 = r4.size()
            int[] r1 = new int[r0]
            r2 = 0
        Lf:
            if (r2 >= r0) goto L1a
            int r3 = r4.keyAt(r2)
            r1[r2] = r3
            int r2 = r2 + 1
            goto Lf
        L1a:
            return r1
    }

    public int getCurrentState() {
            r0 = this;
            int r0 = r0.u0
            return r0
    }

    public java.util.ArrayList<defpackage.b84> getDefinedTransitions() {
            r0 = this;
            androidx.constraintlayout.motion.widget.b r0 = r0.p0
            if (r0 != 0) goto L6
            r0 = 0
            return r0
        L6:
            java.util.ArrayList r0 = r0.d
            return r0
    }

    public defpackage.ki1 getDesignTool() {
            r1 = this;
            ki1 r0 = r1.N0
            if (r0 != 0) goto Lb
            ki1 r0 = new ki1
            r0.<init>()
            r1.N0 = r0
        Lb:
            ki1 r1 = r1.N0
            return r1
    }

    public int getEndState() {
            r0 = this;
            int r0 = r0.v0
            return r0
    }

    public long getNanoTime() {
            r2 = this;
            long r0 = java.lang.System.nanoTime()
            return r0
    }

    public float getProgress() {
            r0 = this;
            float r0 = r0.D0
            return r0
    }

    public androidx.constraintlayout.motion.widget.b getScene() {
            r0 = this;
            androidx.constraintlayout.motion.widget.b r0 = r0.p0
            return r0
    }

    public int getStartState() {
            r0 = this;
            int r0 = r0.t0
            return r0
    }

    public float getTargetPosition() {
            r0 = this;
            float r0 = r0.F0
            return r0
    }

    public android.os.Bundle getTransitionState() {
            r3 = this;
            androidx.constraintlayout.motion.widget.a r0 = r3.j1
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.a r0 = new androidx.constraintlayout.motion.widget.a
            r0.<init>(r3)
            r3.j1 = r0
        Lb:
            androidx.constraintlayout.motion.widget.a r0 = r3.j1
            androidx.constraintlayout.motion.widget.MotionLayout r1 = r0.e
            int r2 = r1.v0
            r0.d = r2
            int r2 = r1.t0
            r0.c = r2
            float r2 = r1.getVelocity()
            r0.b = r2
            float r1 = r1.getProgress()
            r0.a = r1
            androidx.constraintlayout.motion.widget.a r3 = r3.j1
            r3.getClass()
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r1 = "motion.progress"
            float r2 = r3.a
            r0.putFloat(r1, r2)
            java.lang.String r1 = "motion.velocity"
            float r2 = r3.b
            r0.putFloat(r1, r2)
            java.lang.String r1 = "motion.StartState"
            int r2 = r3.c
            r0.putInt(r1, r2)
            java.lang.String r1 = "motion.EndState"
            int r3 = r3.d
            r0.putInt(r1, r3)
            return r0
    }

    public long getTransitionTimeMs() {
            r3 = this;
            androidx.constraintlayout.motion.widget.b r0 = r3.p0
            r1 = 1148846080(0x447a0000, float:1000.0)
            if (r0 == 0) goto L13
            b84 r2 = r0.c
            if (r2 == 0) goto Ld
            int r0 = r2.h
            goto Lf
        Ld:
            int r0 = r0.j
        Lf:
            float r0 = (float) r0
            float r0 = r0 / r1
            r3.B0 = r0
        L13:
            float r3 = r3.B0
            float r3 = r3 * r1
            long r0 = (long) r3
            return r0
    }

    public float getVelocity() {
            r0 = this;
            float r0 = r0.s0
            return r0
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout
    public final void k(int r1) {
            r0 = this;
            r1 = 0
            r0.j0 = r1
            return
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
            r9 = this;
            super.onAttachedToWindow()
            android.view.Display r0 = r9.getDisplay()
            if (r0 == 0) goto Lc
            r0.getRotation()
        Lc:
            androidx.constraintlayout.motion.widget.b r0 = r9.p0
            if (r0 == 0) goto L58
            int r1 = r9.u0
            r2 = -1
            if (r1 == r2) goto L58
            z11 r0 = r0.b(r1)
            androidx.constraintlayout.motion.widget.b r1 = r9.p0
            android.util.SparseArray r2 = r1.g
            r3 = 0
        L1e:
            int r4 = r2.size()
            if (r3 >= r4) goto L4f
            int r4 = r2.keyAt(r3)
            android.util.SparseIntArray r5 = r1.i
            int r6 = r5.get(r4)
            int r7 = r5.size()
        L32:
            if (r6 <= 0) goto L49
            if (r6 != r4) goto L37
            goto L3b
        L37:
            int r8 = r7 + (-1)
            if (r7 >= 0) goto L43
        L3b:
            java.lang.String r1 = "MotionScene"
            java.lang.String r2 = "Cannot be derived from yourself"
            android.util.Log.e(r1, r2)
            goto L4f
        L43:
            int r6 = r5.get(r6)
            r7 = r8
            goto L32
        L49:
            r1.l(r4, r9)
            int r3 = r3 + 1
            goto L1e
        L4f:
            if (r0 == 0) goto L54
            r0.b(r9)
        L54:
            int r0 = r9.u0
            r9.t0 = r0
        L58:
            r9.u()
            androidx.constraintlayout.motion.widget.a r0 = r9.j1
            if (r0 == 0) goto L72
            boolean r1 = r9.m1
            if (r1 == 0) goto L6e
            g15 r0 = new g15
            r1 = 17
            r0.<init>(r9, r1)
            r9.post(r0)
            return
        L6e:
            r0.a()
            return
        L72:
            androidx.constraintlayout.motion.widget.b r0 = r9.p0
            if (r0 == 0) goto L91
            b84 r0 = r0.c
            if (r0 == 0) goto L91
            int r0 = r0.n
            r1 = 4
            if (r0 != r1) goto L91
            r0 = 1065353216(0x3f800000, float:1.0)
            r9.p(r0)
            r0 = 0
            r9.k1 = r0
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.SETUP
            r9.setState(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r9.setState(r0)
        L91:
            return
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(android.view.MotionEvent r21) {
            r20 = this;
            r0 = r20
            androidx.constraintlayout.motion.widget.b r1 = r0.p0
            if (r1 == 0) goto La
            boolean r3 = r0.y0
            if (r3 != 0) goto Le
        La:
            r17 = 0
            goto L1c0
        Le:
            pa r5 = r1.q
            r1 = -1
            if (r5 == 0) goto L12d
            java.lang.Object r3 = r5.L
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            java.lang.Object r4 = r5.B
            androidx.constraintlayout.motion.widget.MotionLayout r4 = (androidx.constraintlayout.motion.widget.MotionLayout) r4
            int r7 = r4.getCurrentState()
            if (r7 != r1) goto L23
            goto L12d
        L23:
            java.lang.Object r6 = r5.R
            java.util.HashSet r6 = (java.util.HashSet) r6
            if (r6 != 0) goto L5d
            java.util.HashSet r6 = new java.util.HashSet
            r6.<init>()
            r5.R = r6
            int r6 = r3.size()
            r8 = 0
        L35:
            if (r8 >= r6) goto L5d
            java.lang.Object r9 = r3.get(r8)
            int r8 = r8 + 1
            yp7 r9 = (defpackage.yp7) r9
            int r10 = r4.getChildCount()
            r11 = 0
        L44:
            if (r11 >= r10) goto L35
            android.view.View r12 = r4.getChildAt(r11)
            boolean r13 = r9.c(r12)
            if (r13 == 0) goto L5a
            r12.getId()
            java.lang.Object r13 = r5.R
            java.util.HashSet r13 = (java.util.HashSet) r13
            r13.add(r12)
        L5a:
            int r11 = r11 + 1
            goto L44
        L5d:
            float r10 = r21.getX()
            float r11 = r21.getY()
            android.graphics.Rect r12 = new android.graphics.Rect
            r12.<init>()
            int r13 = r21.getAction()
            java.lang.Object r6 = r5.Y
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            r14 = 2
            r15 = 1
            if (r6 == 0) goto Lbc
            boolean r6 = r6.isEmpty()
            if (r6 != 0) goto Lbc
            java.lang.Object r6 = r5.Y
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            int r8 = r6.size()
            r9 = 0
        L85:
            if (r9 >= r8) goto Lbc
            java.lang.Object r16 = r6.get(r9)
            int r9 = r9 + 1
            r17 = 0
            r2 = r16
            xp7 r2 = (defpackage.xp7) r2
            android.graphics.Rect r1 = r2.l
            if (r13 == r15) goto Lb1
            if (r13 == r14) goto L9a
            goto Lb8
        L9a:
            m74 r14 = r2.c
            android.view.View r14 = r14.b
            r14.getHitRect(r1)
            int r14 = (int) r10
            int r15 = (int) r11
            boolean r1 = r1.contains(r14, r15)
            if (r1 != 0) goto Lb8
            boolean r1 = r2.h
            if (r1 != 0) goto Lb8
            r2.b()
            goto Lb8
        Lb1:
            boolean r1 = r2.h
            if (r1 != 0) goto Lb8
            r2.b()
        Lb8:
            r1 = -1
            r14 = 2
            r15 = 1
            goto L85
        Lbc:
            r17 = 0
            if (r13 == 0) goto Lc5
            r1 = 1
            if (r13 == r1) goto Lc5
            goto L12f
        Lc5:
            androidx.constraintlayout.motion.widget.b r1 = r4.p0
            if (r1 != 0) goto Lcc
            r1 = 0
        Lca:
            r8 = r1
            goto Ld1
        Lcc:
            z11 r1 = r1.b(r7)
            goto Lca
        Ld1:
            int r1 = r3.size()
            r2 = r17
        Ld7:
            if (r2 >= r1) goto L12f
            java.lang.Object r4 = r3.get(r2)
            int r2 = r2 + 1
            yp7 r4 = (defpackage.yp7) r4
            int r6 = r4.b
            r14 = 1
            if (r6 != r14) goto Lea
            r15 = 2
            if (r13 != 0) goto Ld7
            goto Lf5
        Lea:
            r15 = 2
            if (r6 != r15) goto Lf0
            if (r13 != r14) goto Ld7
            goto Lf5
        Lf0:
            r9 = 3
            if (r6 != r9) goto Ld7
            if (r13 != 0) goto Ld7
        Lf5:
            java.lang.Object r6 = r5.R
            java.util.HashSet r6 = (java.util.HashSet) r6
            java.util.Iterator r18 = r6.iterator()
        Lfd:
            boolean r6 = r18.hasNext()
            if (r6 == 0) goto Ld7
            java.lang.Object r6 = r18.next()
            android.view.View r6 = (android.view.View) r6
            boolean r9 = r4.c(r6)
            if (r9 != 0) goto L110
            goto Lfd
        L110:
            r6.getHitRect(r12)
            int r9 = (int) r10
            int r14 = (int) r11
            boolean r9 = r12.contains(r9, r14)
            if (r9 == 0) goto L12b
            java.lang.Object r9 = r5.B
            androidx.constraintlayout.motion.widget.MotionLayout r9 = (androidx.constraintlayout.motion.widget.MotionLayout) r9
            android.view.View[] r6 = new android.view.View[]{r6}
            r19 = r9
            r9 = r6
            r6 = r19
            r4.a(r5, r6, r7, r8, r9)
        L12b:
            r14 = 1
            goto Lfd
        L12d:
            r17 = 0
        L12f:
            androidx.constraintlayout.motion.widget.b r1 = r0.p0
            b84 r1 = r1.c
            if (r1 == 0) goto L1c0
            boolean r2 = r1.o
            if (r2 != 0) goto L1c0
            androidx.constraintlayout.motion.widget.c r1 = r1.l
            if (r1 == 0) goto L1c0
            int r2 = r21.getAction()
            if (r2 != 0) goto L15d
            android.graphics.RectF r2 = new android.graphics.RectF
            r2.<init>()
            android.graphics.RectF r2 = r1.b(r0, r2)
            if (r2 == 0) goto L15d
            float r3 = r21.getX()
            float r4 = r21.getY()
            boolean r2 = r2.contains(r3, r4)
            if (r2 != 0) goto L15d
            goto L1c0
        L15d:
            int r1 = r1.e
            r2 = -1
            if (r1 == r2) goto L1c0
            android.view.View r2 = r0.r1
            if (r2 == 0) goto L16c
            int r2 = r2.getId()
            if (r2 == r1) goto L172
        L16c:
            android.view.View r1 = r0.findViewById(r1)
            r0.r1 = r1
        L172:
            android.view.View r1 = r0.r1
            if (r1 == 0) goto L1c0
            int r1 = r1.getLeft()
            float r1 = (float) r1
            android.view.View r2 = r0.r1
            int r2 = r2.getTop()
            float r2 = (float) r2
            android.view.View r3 = r0.r1
            int r3 = r3.getRight()
            float r3 = (float) r3
            android.view.View r4 = r0.r1
            int r4 = r4.getBottom()
            float r4 = (float) r4
            android.graphics.RectF r5 = r0.q1
            r5.set(r1, r2, r3, r4)
            float r1 = r21.getX()
            float r2 = r21.getY()
            boolean r1 = r5.contains(r1, r2)
            if (r1 == 0) goto L1c0
            android.view.View r1 = r0.r1
            int r1 = r1.getLeft()
            float r1 = (float) r1
            android.view.View r2 = r0.r1
            int r2 = r2.getTop()
            float r2 = (float) r2
            android.view.View r3 = r0.r1
            r4 = r21
            boolean r1 = r0.t(r1, r2, r3, r4)
            if (r1 != 0) goto L1c0
            boolean r0 = r20.onTouchEvent(r21)
            return r0
        L1c0:
            return r17
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean r4, int r5, int r6, int r7, int r8) {
            r3 = this;
            r0 = 1
            r3.i1 = r0
            r1 = 0
            androidx.constraintlayout.motion.widget.b r2 = r3.p0     // Catch: java.lang.Throwable -> Le
            if (r2 != 0) goto L11
            super.onLayout(r4, r5, r6, r7, r8)     // Catch: java.lang.Throwable -> Le
            r3.i1 = r1
            return
        Le:
            r0 = move-exception
            r4 = r0
            goto L28
        L11:
            int r7 = r7 - r5
            int r8 = r8 - r6
            int r4 = r3.O0     // Catch: java.lang.Throwable -> Le
            if (r4 != r7) goto L1b
            int r4 = r3.P0     // Catch: java.lang.Throwable -> Le
            if (r4 == r8) goto L21
        L1b:
            r3.v()     // Catch: java.lang.Throwable -> Le
            r3.r(r0)     // Catch: java.lang.Throwable -> Le
        L21:
            r3.O0 = r7     // Catch: java.lang.Throwable -> Le
            r3.P0 = r8     // Catch: java.lang.Throwable -> Le
            r3.i1 = r1
            return
        L28:
            r3.i1 = r1
            throw r4
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    public final void onMeasure(int r18, int r19) {
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            androidx.constraintlayout.motion.widget.b r3 = r0.p0
            if (r3 != 0) goto Le
            super.onMeasure(r18, r19)
            return
        Le:
            int r3 = r0.w0
            r4 = 0
            r5 = 1
            if (r3 != r1) goto L1b
            int r3 = r0.x0
            if (r3 == r2) goto L19
            goto L1b
        L19:
            r3 = r4
            goto L1c
        L1b:
            r3 = r5
        L1c:
            boolean r6 = r0.p1
            if (r6 == 0) goto L26
            r0.p1 = r4
            r0.u()
            r3 = r5
        L26:
            boolean r6 = r0.g0
            if (r6 == 0) goto L2b
            r3 = r5
        L2b:
            r0.w0 = r1
            r0.x0 = r2
            androidx.constraintlayout.motion.widget.b r6 = r0.p0
            int r6 = r6.g()
            androidx.constraintlayout.motion.widget.b r7 = r0.p0
            b84 r7 = r7.c
            r8 = -1
            if (r7 != 0) goto L3e
            r7 = r8
            goto L40
        L3e:
            int r7 = r7.c
        L40:
            w74 r9 = r0.o1
            if (r3 != 0) goto L4c
            int r10 = r9.e
            if (r6 != r10) goto L4c
            int r10 = r9.f
            if (r7 == r10) goto L6b
        L4c:
            int r10 = r0.t0
            if (r10 == r8) goto L6b
            super.onMeasure(r18, r19)
            androidx.constraintlayout.motion.widget.b r1 = r0.p0
            z11 r1 = r1.b(r6)
            androidx.constraintlayout.motion.widget.b r2 = r0.p0
            z11 r2 = r2.b(r7)
            r9.e(r1, r2)
            r9.f()
            r9.e = r6
            r9.f = r7
            r1 = r4
            goto L71
        L6b:
            if (r3 == 0) goto L70
            super.onMeasure(r18, r19)
        L70:
            r1 = r5
        L71:
            boolean r2 = r0.Z0
            if (r2 != 0) goto L77
            if (r1 == 0) goto Lc4
        L77:
            int r1 = r0.getPaddingTop()
            int r2 = r0.getPaddingBottom()
            int r2 = r2 + r1
            int r1 = r0.getPaddingLeft()
            int r3 = r0.getPaddingRight()
            int r3 = r3 + r1
            m21 r1 = r0.L
            int r6 = r1.r()
            int r6 = r6 + r3
            int r1 = r1.l()
            int r1 = r1 + r2
            int r2 = r0.e1
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r3) goto L9d
            if (r2 != 0) goto Lac
        L9d:
            int r2 = r0.a1
            float r6 = (float) r2
            float r7 = r0.g1
            int r8 = r0.c1
            int r8 = r8 - r2
            float r2 = (float) r8
            float r7 = r7 * r2
            float r7 = r7 + r6
            int r6 = (int) r7
            r0.requestLayout()
        Lac:
            int r2 = r0.f1
            if (r2 == r3) goto Lb2
            if (r2 != 0) goto Lc1
        Lb2:
            int r1 = r0.b1
            float r2 = (float) r1
            float r3 = r0.g1
            int r7 = r0.d1
            int r7 = r7 - r1
            float r1 = (float) r7
            float r3 = r3 * r1
            float r3 = r3 + r2
            int r1 = (int) r3
            r0.requestLayout()
        Lc1:
            r0.setMeasuredDimension(r6, r1)
        Lc4:
            float r1 = r0.F0
            float r2 = r0.D0
            float r1 = r1 - r2
            float r1 = java.lang.Math.signum(r1)
            long r2 = r0.getNanoTime()
            t74 r6 = r0.q0
            boolean r7 = r6 instanceof defpackage.yq6
            r8 = 814313567(0x3089705f, float:1.0E-9)
            r9 = 0
            if (r7 != 0) goto Le6
            long r10 = r0.E0
            long r10 = r2 - r10
            float r7 = (float) r10
            float r7 = r7 * r1
            float r7 = r7 * r8
            float r10 = r0.B0
            float r7 = r7 / r10
            goto Le7
        Le6:
            r7 = r9
        Le7:
            float r10 = r0.D0
            float r10 = r10 + r7
            boolean r7 = r0.G0
            if (r7 == 0) goto Lf0
            float r10 = r0.F0
        Lf0:
            int r7 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r7 <= 0) goto Lfa
            float r11 = r0.F0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 >= 0) goto L104
        Lfa:
            int r11 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r11 > 0) goto L107
            float r11 = r0.F0
            int r11 = (r10 > r11 ? 1 : (r10 == r11 ? 0 : -1))
            if (r11 > 0) goto L107
        L104:
            float r10 = r0.F0
            goto L108
        L107:
            r5 = r4
        L108:
            if (r6 == 0) goto L11e
            if (r5 != 0) goto L11e
            boolean r5 = r0.K0
            if (r5 == 0) goto L11a
            long r10 = r0.A0
            long r2 = r2 - r10
            float r2 = (float) r2
            float r2 = r2 * r8
            float r10 = r6.getInterpolation(r2)
            goto L11e
        L11a:
            float r10 = r6.getInterpolation(r10)
        L11e:
            if (r7 <= 0) goto L126
            float r2 = r0.F0
            int r2 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r2 >= 0) goto L130
        L126:
            int r1 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r1 > 0) goto L132
            float r1 = r0.F0
            int r1 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r1 > 0) goto L132
        L130:
            float r10 = r0.F0
        L132:
            r0.g1 = r10
            int r1 = r0.getChildCount()
            long r13 = r0.getNanoTime()
            android.view.animation.Interpolator r2 = r0.r0
            if (r2 != 0) goto L142
        L140:
            r12 = r10
            goto L147
        L142:
            float r10 = r2.getInterpolation(r10)
            goto L140
        L147:
            if (r4 >= r1) goto L162
            android.view.View r2 = r0.getChildAt(r4)
            java.util.HashMap r3 = r0.z0
            java.lang.Object r3 = r3.get(r2)
            r11 = r3
            m74 r11 = (defpackage.m74) r11
            if (r11 == 0) goto L15f
            ng3 r15 = r0.h1
            r16 = r2
            r11.d(r12, r13, r15, r16)
        L15f:
            int r4 = r4 + 1
            goto L147
        L162:
            boolean r1 = r0.Z0
            if (r1 == 0) goto L169
            r0.requestLayout()
        L169:
            return
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedFling(android.view.View r1, float r2, float r3, boolean r4) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final boolean onNestedPreFling(android.view.View r1, float r2, float r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int r1) {
            r0 = this;
            androidx.constraintlayout.motion.widget.b r1 = r0.p0
            if (r1 == 0) goto L15
            boolean r0 = r0.j()
            r1.p = r0
            b84 r1 = r1.c
            if (r1 == 0) goto L15
            androidx.constraintlayout.motion.widget.c r1 = r1.l
            if (r1 == 0) goto L15
            r1.c(r0)
        L15:
            return
    }

    @Override // android.view.View
    public final boolean onTouchEvent(android.view.MotionEvent r31) {
            r30 = this;
            r0 = r30
            r1 = r31
            androidx.constraintlayout.motion.widget.b r2 = r0.p0
            if (r2 == 0) goto L7f0
            boolean r3 = r0.y0
            if (r3 == 0) goto L7f0
            boolean r2 = r2.n()
            if (r2 == 0) goto L7f0
            androidx.constraintlayout.motion.widget.b r2 = r0.p0
            b84 r3 = r2.c
            if (r3 == 0) goto L21
            boolean r3 = r3.o
            if (r3 == 0) goto L21
            boolean r0 = super.onTouchEvent(r31)
            return r0
        L21:
            int r3 = r0.getCurrentState()
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r2.a
            android.graphics.RectF r5 = new android.graphics.RectF
            r5.<init>()
            os0 r6 = r2.o
            if (r6 != 0) goto L3d
            r4.getClass()
            os0 r6 = defpackage.os0.R
            android.view.VelocityTracker r7 = android.view.VelocityTracker.obtain()
            r6.B = r7
            r2.o = r6
        L3d:
            os0 r6 = r2.o
            java.lang.Object r6 = r6.B
            android.view.VelocityTracker r6 = (android.view.VelocityTracker) r6
            if (r6 == 0) goto L48
            r6.addMovement(r1)
        L48:
            r8 = 2
            r10 = -1
            if (r3 == r10) goto L22b
            int r12 = r1.getAction()
            if (r12 == 0) goto L1c3
            if (r12 == r8) goto L56
            goto L22b
        L56:
            boolean r12 = r2.m
            if (r12 == 0) goto L5c
            goto L22b
        L5c:
            float r12 = r1.getRawY()
            float r13 = r2.s
            float r12 = r12 - r13
            float r13 = r1.getRawX()
            float r14 = r2.r
            float r13 = r13 - r14
            double r14 = (double) r13
            r16 = 0
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 != 0) goto L76
            double r14 = (double) r12
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 == 0) goto L7de
        L76:
            android.view.MotionEvent r14 = r2.l
            if (r14 != 0) goto L7c
            goto L7de
        L7c:
            if (r3 == r10) goto L18b
            zb r15 = r2.b
            if (r15 == 0) goto L89
            int r15 = r15.C(r3)
            if (r15 == r10) goto L89
            goto L8a
        L89:
            r15 = r3
        L8a:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.ArrayList r10 = r2.d
            int r8 = r10.size()
            r7 = 0
        L96:
            if (r7 >= r8) goto Lae
            java.lang.Object r20 = r10.get(r7)
            int r7 = r7 + 1
            r9 = r20
            b84 r9 = (defpackage.b84) r9
            int r11 = r9.d
            if (r11 == r15) goto Laa
            int r11 = r9.c
            if (r11 != r15) goto L96
        Laa:
            r6.add(r9)
            goto L96
        Lae:
            android.graphics.RectF r7 = new android.graphics.RectF
            r7.<init>()
            int r8 = r6.size()
            r9 = 0
            r10 = 0
            r11 = 0
        Lba:
            if (r10 >= r8) goto L188
            java.lang.Object r15 = r6.get(r10)
            int r10 = r10 + 1
            b84 r15 = (defpackage.b84) r15
            r21 = r6
            boolean r6 = r15.o
            if (r6 == 0) goto Lcf
            r22 = r8
            r23 = r9
            goto L10b
        Lcf:
            androidx.constraintlayout.motion.widget.c r6 = r15.l
            if (r6 == 0) goto L170
            r22 = r8
            boolean r8 = r2.p
            r6.c(r8)
            androidx.constraintlayout.motion.widget.c r6 = r15.l
            android.graphics.RectF r6 = r6.b(r4, r7)
            if (r6 == 0) goto Lf3
            float r8 = r14.getX()
            r23 = r9
            float r9 = r14.getY()
            boolean r6 = r6.contains(r8, r9)
            if (r6 != 0) goto Lf5
            goto L10b
        Lf3:
            r23 = r9
        Lf5:
            androidx.constraintlayout.motion.widget.c r6 = r15.l
            android.graphics.RectF r6 = r6.a(r4, r7)
            if (r6 == 0) goto L112
            float r8 = r14.getX()
            float r9 = r14.getY()
            boolean r6 = r6.contains(r8, r9)
            if (r6 != 0) goto L112
        L10b:
            r6 = r21
            r8 = r22
            r9 = r23
            goto Lba
        L112:
            androidx.constraintlayout.motion.widget.c r6 = r15.l
            float r8 = r6.k
            float r8 = r8 * r13
            float r9 = r6.l
            float r9 = r9 * r12
            float r9 = r9 + r8
            boolean r6 = r6.j
            if (r6 == 0) goto L158
            float r6 = r14.getX()
            androidx.constraintlayout.motion.widget.c r8 = r15.l
            r8.getClass()
            r8 = 1056964608(0x3f000000, float:0.5)
            float r6 = r6 - r8
            float r9 = r14.getY()
            r24 = r8
            androidx.constraintlayout.motion.widget.c r8 = r15.l
            r8.getClass()
            float r9 = r9 - r24
            float r8 = r13 + r6
            r24 = r7
            float r7 = r12 + r9
            r26 = r10
            r25 = r11
            double r10 = (double) r7
            double r7 = (double) r8
            double r7 = java.lang.Math.atan2(r10, r7)
            double r10 = (double) r6
            r27 = r7
            double r6 = (double) r9
            double r6 = java.lang.Math.atan2(r10, r6)
            double r7 = r27 - r6
            float r6 = (float) r7
            r7 = 1092616192(0x41200000, float:10.0)
            float r9 = r6 * r7
            goto L15e
        L158:
            r24 = r7
            r26 = r10
            r25 = r11
        L15e:
            int r6 = r15.c
            if (r6 != r3) goto L166
            r6 = -1082130432(0xffffffffbf800000, float:-1.0)
        L164:
            float r9 = r9 * r6
            goto L16a
        L166:
            r6 = 1066192077(0x3f8ccccd, float:1.1)
            goto L164
        L16a:
            int r6 = (r9 > r23 ? 1 : (r9 == r23 ? 0 : -1))
            if (r6 <= 0) goto L17a
            r11 = r15
            goto L17e
        L170:
            r24 = r7
            r22 = r8
            r23 = r9
            r26 = r10
            r25 = r11
        L17a:
            r9 = r23
            r11 = r25
        L17e:
            r6 = r21
            r8 = r22
            r7 = r24
            r10 = r26
            goto Lba
        L188:
            r25 = r11
            goto L18d
        L18b:
            b84 r11 = r2.c
        L18d:
            if (r11 == 0) goto L22b
            r0.setTransition(r11)
            b84 r3 = r2.c
            androidx.constraintlayout.motion.widget.c r3 = r3.l
            android.graphics.RectF r3 = r3.b(r4, r5)
            if (r3 == 0) goto L1b0
            android.view.MotionEvent r4 = r2.l
            float r4 = r4.getX()
            android.view.MotionEvent r5 = r2.l
            float r5 = r5.getY()
            boolean r3 = r3.contains(r4, r5)
            if (r3 != 0) goto L1b0
            r3 = 1
            goto L1b1
        L1b0:
            r3 = 0
        L1b1:
            r2.n = r3
            b84 r3 = r2.c
            androidx.constraintlayout.motion.widget.c r3 = r3.l
            float r4 = r2.r
            float r5 = r2.s
            r3.p = r4
            r3.q = r5
            r6 = 0
            r3.m = r6
            goto L22b
        L1c3:
            r6 = 0
            float r3 = r1.getRawX()
            r2.r = r3
            float r3 = r1.getRawY()
            r2.s = r3
            r2.l = r1
            r2.m = r6
            b84 r1 = r2.c
            androidx.constraintlayout.motion.widget.c r1 = r1.l
            if (r1 == 0) goto L7de
            android.graphics.RectF r1 = r1.a(r4, r5)
            if (r1 == 0) goto L1fa
            android.view.MotionEvent r3 = r2.l
            float r3 = r3.getX()
            android.view.MotionEvent r6 = r2.l
            float r6 = r6.getY()
            boolean r1 = r1.contains(r3, r6)
            if (r1 != 0) goto L1fa
            r1 = 0
            r2.l = r1
            r1 = 1
            r2.m = r1
            goto L7de
        L1fa:
            b84 r1 = r2.c
            androidx.constraintlayout.motion.widget.c r1 = r1.l
            android.graphics.RectF r1 = r1.b(r4, r5)
            if (r1 == 0) goto L21a
            android.view.MotionEvent r3 = r2.l
            float r3 = r3.getX()
            android.view.MotionEvent r4 = r2.l
            float r4 = r4.getY()
            boolean r1 = r1.contains(r3, r4)
            if (r1 != 0) goto L21a
            r1 = 1
            r2.n = r1
            goto L21d
        L21a:
            r6 = 0
            r2.n = r6
        L21d:
            b84 r1 = r2.c
            androidx.constraintlayout.motion.widget.c r1 = r1.l
            float r3 = r2.r
            float r2 = r2.s
            r1.p = r3
            r1.q = r2
            goto L7de
        L22b:
            boolean r3 = r2.m
            if (r3 == 0) goto L231
            goto L7de
        L231:
            b84 r3 = r2.c
            if (r3 == 0) goto L7af
            androidx.constraintlayout.motion.widget.c r3 = r3.l
            if (r3 == 0) goto L7af
            float[] r9 = r3.n
            boolean r4 = r2.n
            if (r4 != 0) goto L7af
            os0 r10 = r2.o
            androidx.constraintlayout.motion.widget.MotionLayout r11 = r3.r
            boolean r4 = r3.j
            r14 = 3
            r21 = 4576918229304087675(0x3f847ae147ae147b, double:0.01)
            if (r4 == 0) goto L59c
            int[] r4 = r3.o
            java.lang.Object r5 = r10.B
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            if (r5 == 0) goto L258
            r5.addMovement(r1)
        L258:
            int r5 = r1.getAction()
            if (r5 == 0) goto L58b
            r24 = 1135869952(0x43b40000, float:360.0)
            r25 = 1073741824(0x40000000, float:2.0)
            r6 = 1
            if (r5 == r6) goto L40f
            r6 = 2
            if (r5 == r6) goto L26a
            goto L7af
        L26a:
            r1.getRawY()
            r1.getRawX()
            int r5 = r11.getWidth()
            float r5 = (float) r5
            float r5 = r5 / r25
            int r6 = r11.getHeight()
            float r6 = (float) r6
            float r6 = r6 / r25
            int r12 = r3.i
            r13 = -1
            if (r12 == r13) goto L2b1
            android.view.View r5 = r11.findViewById(r12)
            r11.getLocationOnScreen(r4)
            r20 = 0
            r6 = r4[r20]
            float r6 = (float) r6
            int r12 = r5.getLeft()
            int r13 = r5.getRight()
            int r13 = r13 + r12
            float r12 = (float) r13
            float r12 = r12 / r25
            float r6 = r6 + r12
            r19 = 1
            r4 = r4[r19]
            float r4 = (float) r4
            int r12 = r5.getTop()
            int r5 = r5.getBottom()
            int r5 = r5 + r12
            float r5 = (float) r5
            float r5 = r5 / r25
            float r4 = r4 + r5
            r5 = r6
            r6 = r4
            goto L2fb
        L2b1:
            int r12 = r3.d
            r13 = -1
            if (r12 == r13) goto L2fb
            java.util.HashMap r13 = r11.z0
            android.view.View r12 = r11.findViewById(r12)
            java.lang.Object r12 = r13.get(r12)
            m74 r12 = (defpackage.m74) r12
            y74 r12 = r12.f
            int r12 = r12.g0
            android.view.View r12 = r11.findViewById(r12)
            if (r12 != 0) goto L2d4
            java.lang.String r4 = "TouchResponse"
            java.lang.String r12 = "could not find view to animate to"
            android.util.Log.e(r4, r12)
            goto L2fb
        L2d4:
            r11.getLocationOnScreen(r4)
            r20 = 0
            r5 = r4[r20]
            float r5 = (float) r5
            int r6 = r12.getLeft()
            int r13 = r12.getRight()
            int r13 = r13 + r6
            float r6 = (float) r13
            float r6 = r6 / r25
            float r5 = r5 + r6
            r19 = 1
            r4 = r4[r19]
            float r4 = (float) r4
            int r6 = r12.getTop()
            int r12 = r12.getBottom()
            int r12 = r12 + r6
            float r6 = (float) r12
            float r6 = r6 / r25
            float r6 = r6 + r4
        L2fb:
            float r4 = r1.getRawX()
            float r12 = r4 - r5
            float r4 = r1.getRawY()
            float r13 = r4 - r6
            float r4 = r1.getRawY()
            float r4 = r4 - r6
            double r14 = (double) r4
            float r4 = r1.getRawX()
            float r4 = r4 - r5
            double r7 = (double) r4
            double r14 = java.lang.Math.atan2(r14, r7)
            float r4 = r3.q
            float r4 = r4 - r6
            double r6 = (double) r4
            float r4 = r3.p
            float r4 = r4 - r5
            double r4 = (double) r4
            double r4 = java.lang.Math.atan2(r6, r4)
            double r4 = r14 - r4
            r6 = 4640537203540230144(0x4066800000000000, double:180.0)
            double r4 = r4 * r6
            r6 = 4614256656552045848(0x400921fb54442d18, double:3.141592653589793)
            double r4 = r4 / r6
            float r4 = (float) r4
            r5 = 1134886912(0x43a50000, float:330.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 <= 0) goto L33d
            float r4 = r4 - r24
        L33a:
            r23 = r4
            goto L346
        L33d:
            r5 = -1012596736(0xffffffffc3a50000, float:-330.0)
            int r5 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r5 >= 0) goto L33a
            float r4 = r4 + r24
            goto L33a
        L346:
            float r4 = java.lang.Math.abs(r23)
            double r4 = (double) r4
            int r4 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            if (r4 > 0) goto L353
            boolean r4 = r3.m
            if (r4 == 0) goto L7af
        L353:
            float r6 = r11.getProgress()
            boolean r4 = r3.m
            if (r4 != 0) goto L362
            r4 = 1
            r3.m = r4
            r11.setProgress(r6)
            goto L363
        L362:
            r4 = 1
        L363:
            int r5 = r3.d
            r7 = -1
            if (r5 == r7) goto L384
            r19 = r4
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.r
            float r7 = r3.h
            float r8 = r3.g
            r25 = r14
            r14 = 1000(0x3e8, float:1.401E-42)
            r15 = 1065353216(0x3f800000, float:1.0)
            r4.s(r5, r6, r7, r8, r9)
            r4 = r9[r19]
            double r4 = (double) r4
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            r9[r19] = r4
            goto L38e
        L384:
            r19 = r4
            r25 = r14
            r14 = 1000(0x3e8, float:1.401E-42)
            r15 = 1065353216(0x3f800000, float:1.0)
            r9[r19] = r24
        L38e:
            float r4 = r3.v
            float r23 = r23 * r4
            r4 = r9[r19]
            float r23 = r23 / r4
            float r4 = r23 + r6
            float r4 = java.lang.Math.min(r4, r15)
            r5 = 0
            float r4 = java.lang.Math.max(r4, r5)
            float r6 = r11.getProgress()
            int r7 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r7 == 0) goto L3ff
            int r7 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r7 == 0) goto L3b1
            int r5 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r5 != 0) goto L3b9
        L3b1:
            if (r7 != 0) goto L3b5
            r5 = 1
            goto L3b6
        L3b5:
            r5 = 0
        L3b6:
            r11.q(r5)
        L3b9:
            r11.setProgress(r4)
            java.lang.Object r4 = r10.B
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            if (r4 == 0) goto L3c5
            r4.computeCurrentVelocity(r14)
        L3c5:
            java.lang.Object r4 = r10.B
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            if (r4 == 0) goto L3d0
            float r4 = r4.getXVelocity()
            goto L3d1
        L3d0:
            r4 = 0
        L3d1:
            java.lang.Object r5 = r10.B
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            if (r5 == 0) goto L3dc
            float r6 = r5.getYVelocity()
            goto L3dd
        L3dc:
            r6 = 0
        L3dd:
            double r5 = (double) r6
            double r7 = (double) r4
            double r9 = java.lang.Math.hypot(r5, r7)
            double r4 = java.lang.Math.atan2(r5, r7)
            double r4 = r4 - r25
            double r4 = java.lang.Math.sin(r4)
            double r4 = r4 * r9
            double r6 = (double) r12
            double r8 = (double) r13
            double r6 = java.lang.Math.hypot(r6, r8)
            double r4 = r4 / r6
            float r4 = (float) r4
            double r4 = (double) r4
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            r11.s0 = r4
            goto L401
        L3ff:
            r11.s0 = r5
        L401:
            float r4 = r1.getRawX()
            r3.p = r4
            float r4 = r1.getRawY()
            r3.q = r4
            goto L7af
        L40f:
            r6 = 0
            r27 = 1065353216(0x3f800000, float:1.0)
            r3.m = r6
            java.lang.Object r5 = r10.B
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            if (r5 == 0) goto L41f
            r6 = 16
            r5.computeCurrentVelocity(r6)
        L41f:
            java.lang.Object r5 = r10.B
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            if (r5 == 0) goto L42c
            float r5 = r5.getXVelocity()
            r18 = r5
            goto L42e
        L42c:
            r18 = 0
        L42e:
            java.lang.Object r5 = r10.B
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            if (r5 == 0) goto L43a
            float r5 = r5.getYVelocity()
            r10 = r5
            goto L43b
        L43a:
            r10 = 0
        L43b:
            float r6 = r11.getProgress()
            int r5 = r11.getWidth()
            float r5 = (float) r5
            float r5 = r5 / r25
            int r7 = r11.getHeight()
            float r7 = (float) r7
            float r7 = r7 / r25
            int r8 = r3.i
            r12 = -1
            r28 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            if (r8 == r12) goto L482
            android.view.View r5 = r11.findViewById(r8)
            r11.getLocationOnScreen(r4)
            r20 = 0
            r7 = r4[r20]
            float r7 = (float) r7
            int r8 = r5.getLeft()
            int r12 = r5.getRight()
            int r12 = r12 + r8
            float r8 = (float) r12
            float r8 = r8 / r25
            float r7 = r7 + r8
            r19 = 1
            r4 = r4[r19]
            float r4 = (float) r4
            int r8 = r5.getTop()
            int r5 = r5.getBottom()
        L47a:
            int r5 = r5 + r8
            float r5 = (float) r5
            float r5 = r5 / r25
            float r4 = r4 + r5
            r5 = r7
            r7 = r4
            goto L4be
        L482:
            int r8 = r3.d
            r13 = -1
            if (r8 == r13) goto L4be
            java.util.HashMap r5 = r11.z0
            android.view.View r7 = r11.findViewById(r8)
            java.lang.Object r5 = r5.get(r7)
            m74 r5 = (defpackage.m74) r5
            y74 r5 = r5.f
            int r5 = r5.g0
            android.view.View r5 = r11.findViewById(r5)
            r11.getLocationOnScreen(r4)
            r20 = 0
            r7 = r4[r20]
            float r7 = (float) r7
            int r8 = r5.getLeft()
            int r12 = r5.getRight()
            int r12 = r12 + r8
            float r8 = (float) r12
            float r8 = r8 / r25
            float r7 = r7 + r8
            r19 = 1
            r4 = r4[r19]
            float r4 = (float) r4
            int r8 = r5.getTop()
            int r5 = r5.getBottom()
            goto L47a
        L4be:
            float r4 = r1.getRawX()
            float r12 = r4 - r5
            float r4 = r1.getRawY()
            float r13 = r4 - r7
            double r4 = (double) r13
            double r7 = (double) r12
            double r4 = java.lang.Math.atan2(r4, r7)
            double r21 = java.lang.Math.toDegrees(r4)
            int r5 = r3.d
            r7 = -1
            if (r5 == r7) goto L4f3
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.r
            float r7 = r3.h
            float r8 = r3.g
            r15 = r27
            r25 = 1077936128(0x40400000, float:3.0)
            r4.s(r5, r6, r7, r8, r9)
            r19 = 1
            r4 = r9[r19]
            double r4 = (double) r4
            double r4 = java.lang.Math.toDegrees(r4)
            float r4 = (float) r4
            r9[r19] = r4
            goto L4fb
        L4f3:
            r15 = r27
            r19 = 1
            r25 = 1077936128(0x40400000, float:3.0)
            r9[r19] = r24
        L4fb:
            float r10 = r10 + r13
            double r4 = (double) r10
            float r7 = r18 + r12
            double r7 = (double) r7
            double r4 = java.lang.Math.atan2(r4, r7)
            double r4 = java.lang.Math.toDegrees(r4)
            double r4 = r4 - r21
            float r4 = (float) r4
            r5 = 1115291648(0x427a0000, float:62.5)
            float r4 = r4 * r5
            boolean r5 = java.lang.Float.isNaN(r4)
            if (r5 != 0) goto L522
            float r5 = r4 * r25
            float r7 = r3.v
            float r5 = r5 * r7
            r19 = 1
            r7 = r9[r19]
            float r5 = r5 / r7
            float r5 = r5 + r6
        L51f:
            r16 = 0
            goto L524
        L522:
            r5 = r6
            goto L51f
        L524:
            int r7 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r7 == 0) goto L57a
            int r7 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r7 == 0) goto L57a
            int r7 = r3.c
            if (r7 == r14) goto L57a
            float r8 = r3.v
            float r4 = r4 * r8
            r19 = 1
            r8 = r9[r19]
            float r4 = r4 / r8
            double r8 = (double) r5
            int r5 = (r8 > r28 ? 1 : (r8 == r28 ? 0 : -1))
            if (r5 >= 0) goto L540
            r5 = 0
        L53e:
            r8 = 6
            goto L542
        L540:
            r5 = r15
            goto L53e
        L542:
            if (r7 != r8) goto L551
            float r5 = r6 + r4
            r16 = 0
            int r5 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r5 >= 0) goto L550
            float r4 = java.lang.Math.abs(r4)
        L550:
            r5 = r15
        L551:
            int r7 = r3.c
            r8 = 7
            if (r7 != r8) goto L562
            float r5 = r6 + r4
            int r5 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r5 <= 0) goto L561
            float r4 = java.lang.Math.abs(r4)
            float r4 = -r4
        L561:
            r5 = 0
        L562:
            int r3 = r3.c
            float r4 = r4 * r25
            r11.y(r5, r4, r3)
            r16 = 0
            int r3 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r3 >= 0) goto L573
            int r3 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r3 > 0) goto L7af
        L573:
            androidx.constraintlayout.motion.widget.MotionLayout$a r3 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r11.setState(r3)
            goto L7af
        L57a:
            r16 = 0
            int r3 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r3 >= 0) goto L584
            int r3 = (r15 > r5 ? 1 : (r15 == r5 ? 0 : -1))
            if (r3 > 0) goto L7af
        L584:
            androidx.constraintlayout.motion.widget.MotionLayout$a r3 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r11.setState(r3)
            goto L7af
        L58b:
            float r4 = r1.getRawX()
            r3.p = r4
            float r4 = r1.getRawY()
            r3.q = r4
            r6 = 0
            r3.m = r6
            goto L7af
        L59c:
            r12 = r14
            r14 = 1000(0x3e8, float:1.401E-42)
            r15 = 1065353216(0x3f800000, float:1.0)
            r25 = 1077936128(0x40400000, float:3.0)
            r28 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            java.lang.Object r4 = r10.B
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            if (r4 == 0) goto L5ae
            r4.addMovement(r1)
        L5ae:
            int r4 = r1.getAction()
            if (r4 == 0) goto L7a0
            r6 = 1
            if (r4 == r6) goto L6cf
            r6 = 2
            if (r4 == r6) goto L5bc
            goto L7af
        L5bc:
            float r4 = r1.getRawY()
            float r5 = r3.q
            float r12 = r4 - r5
            float r4 = r1.getRawX()
            float r5 = r3.p
            float r13 = r4 - r5
            float r4 = r3.k
            float r4 = r4 * r13
            float r5 = r3.l
            float r5 = r5 * r12
            float r5 = r5 + r4
            float r4 = java.lang.Math.abs(r5)
            float r5 = r3.x
            int r4 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r4 > 0) goto L5e1
            boolean r4 = r3.m
            if (r4 == 0) goto L7af
        L5e1:
            float r6 = r11.getProgress()
            boolean r4 = r3.m
            if (r4 != 0) goto L5ef
            r4 = 1
            r3.m = r4
            r11.setProgress(r6)
        L5ef:
            int r5 = r3.d
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.r
            r7 = -1
            if (r5 == r7) goto L602
            float r7 = r3.h
            float r8 = r3.g
            r4.s(r5, r6, r7, r8, r9)
            r19 = 1
            r20 = 0
            goto L61d
        L602:
            int r4 = r4.getWidth()
            int r5 = r11.getHeight()
            int r4 = java.lang.Math.min(r4, r5)
            float r4 = (float) r4
            float r5 = r3.l
            float r5 = r5 * r4
            r19 = 1
            r9[r19] = r5
            float r5 = r3.k
            float r4 = r4 * r5
            r20 = 0
            r9[r20] = r4
        L61d:
            float r4 = r3.k
            r5 = r9[r20]
            float r4 = r4 * r5
            float r5 = r3.l
            r7 = r9[r19]
            float r5 = r5 * r7
            float r5 = r5 + r4
            float r4 = r3.v
            float r5 = r5 * r4
            float r4 = java.lang.Math.abs(r5)
            double r4 = (double) r4
            int r4 = (r4 > r21 ? 1 : (r4 == r21 ? 0 : -1))
            r5 = 1008981770(0x3c23d70a, float:0.01)
            r20 = 0
            if (r4 >= 0) goto L63d
            r9[r20] = r5
            r9[r19] = r5
        L63d:
            float r4 = r3.k
            r7 = 0
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 == 0) goto L648
            r4 = r9[r20]
            float r13 = r13 / r4
            goto L64c
        L648:
            r4 = r9[r19]
            float r13 = r12 / r4
        L64c:
            float r6 = r6 + r13
            float r4 = java.lang.Math.min(r6, r15)
            float r4 = java.lang.Math.max(r4, r7)
            int r6 = r3.c
            r8 = 6
            if (r6 != r8) goto L65e
            float r4 = java.lang.Math.max(r4, r5)
        L65e:
            int r5 = r3.c
            r8 = 7
            if (r5 != r8) goto L66a
            r5 = 1065185444(0x3f7d70a4, float:0.99)
            float r4 = java.lang.Math.min(r4, r5)
        L66a:
            float r5 = r11.getProgress()
            int r6 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r6 == 0) goto L6be
            r16 = 0
            int r6 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r6 == 0) goto L67c
            int r5 = (r5 > r15 ? 1 : (r5 == r15 ? 0 : -1))
            if (r5 != 0) goto L684
        L67c:
            if (r6 != 0) goto L680
            r5 = 1
            goto L681
        L680:
            r5 = 0
        L681:
            r11.q(r5)
        L684:
            r11.setProgress(r4)
            java.lang.Object r4 = r10.B
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            if (r4 == 0) goto L690
            r4.computeCurrentVelocity(r14)
        L690:
            java.lang.Object r4 = r10.B
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            if (r4 == 0) goto L69b
            float r4 = r4.getXVelocity()
            goto L69c
        L69b:
            r4 = 0
        L69c:
            java.lang.Object r5 = r10.B
            android.view.VelocityTracker r5 = (android.view.VelocityTracker) r5
            if (r5 == 0) goto L6a7
            float r5 = r5.getYVelocity()
            goto L6a8
        L6a7:
            r5 = 0
        L6a8:
            float r6 = r3.k
            r7 = 0
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 == 0) goto L6b5
            r20 = 0
            r5 = r9[r20]
            float r4 = r4 / r5
            goto L6bb
        L6b5:
            r19 = 1
            r4 = r9[r19]
            float r4 = r5 / r4
        L6bb:
            r11.s0 = r4
            goto L6c1
        L6be:
            r7 = 0
            r11.s0 = r7
        L6c1:
            float r4 = r1.getRawX()
            r3.p = r4
            float r4 = r1.getRawY()
            r3.q = r4
            goto L7af
        L6cf:
            r6 = 0
            r3.m = r6
            java.lang.Object r4 = r10.B
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            if (r4 == 0) goto L6db
            r4.computeCurrentVelocity(r14)
        L6db:
            java.lang.Object r4 = r10.B
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            if (r4 == 0) goto L6e7
            float r4 = r4.getXVelocity()
            r13 = r4
            goto L6e8
        L6e7:
            r13 = 0
        L6e8:
            java.lang.Object r4 = r10.B
            android.view.VelocityTracker r4 = (android.view.VelocityTracker) r4
            if (r4 == 0) goto L6f4
            float r4 = r4.getYVelocity()
            r10 = r4
            goto L6f5
        L6f4:
            r10 = 0
        L6f5:
            float r6 = r11.getProgress()
            int r5 = r3.d
            androidx.constraintlayout.motion.widget.MotionLayout r4 = r3.r
            r7 = -1
            if (r5 == r7) goto L70c
            float r7 = r3.h
            float r8 = r3.g
            r4.s(r5, r6, r7, r8, r9)
            r19 = 1
            r20 = 0
            goto L727
        L70c:
            int r4 = r4.getWidth()
            int r5 = r11.getHeight()
            int r4 = java.lang.Math.min(r4, r5)
            float r4 = (float) r4
            float r5 = r3.l
            float r5 = r5 * r4
            r19 = 1
            r9[r19] = r5
            float r5 = r3.k
            float r4 = r4 * r5
            r20 = 0
            r9[r20] = r4
        L727:
            float r4 = r3.k
            r5 = r9[r20]
            r7 = r9[r19]
            r16 = 0
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L735
            float r13 = r13 / r5
            goto L737
        L735:
            float r13 = r10 / r7
        L737:
            boolean r4 = java.lang.Float.isNaN(r13)
            if (r4 != 0) goto L743
            float r4 = r13 / r25
            float r4 = r4 + r6
        L740:
            r16 = 0
            goto L745
        L743:
            r4 = r6
            goto L740
        L745:
            int r5 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r5 == 0) goto L790
            int r5 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r5 == 0) goto L790
            int r5 = r3.c
            if (r5 == r12) goto L790
            double r7 = (double) r4
            int r4 = (r7 > r28 ? 1 : (r7 == r28 ? 0 : -1))
            if (r4 >= 0) goto L759
            r4 = 0
        L757:
            r8 = 6
            goto L75b
        L759:
            r4 = r15
            goto L757
        L75b:
            if (r5 != r8) goto L76a
            float r4 = r6 + r13
            r16 = 0
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 >= 0) goto L769
            float r13 = java.lang.Math.abs(r13)
        L769:
            r4 = r15
        L76a:
            int r5 = r3.c
            r8 = 7
            if (r5 != r8) goto L77b
            float r4 = r6 + r13
            int r4 = (r4 > r15 ? 1 : (r4 == r15 ? 0 : -1))
            if (r4 <= 0) goto L77a
            float r4 = java.lang.Math.abs(r13)
            float r13 = -r4
        L77a:
            r4 = 0
        L77b:
            int r3 = r3.c
            r11.y(r4, r13, r3)
            r16 = 0
            int r3 = (r16 > r6 ? 1 : (r16 == r6 ? 0 : -1))
            if (r3 >= 0) goto L78a
            int r3 = (r15 > r6 ? 1 : (r15 == r6 ? 0 : -1))
            if (r3 > 0) goto L7af
        L78a:
            androidx.constraintlayout.motion.widget.MotionLayout$a r3 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r11.setState(r3)
            goto L7af
        L790:
            r16 = 0
            int r3 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            if (r3 >= 0) goto L79a
            int r3 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r3 > 0) goto L7af
        L79a:
            androidx.constraintlayout.motion.widget.MotionLayout$a r3 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r11.setState(r3)
            goto L7af
        L7a0:
            float r4 = r1.getRawX()
            r3.p = r4
            float r4 = r1.getRawY()
            r3.q = r4
            r6 = 0
            r3.m = r6
        L7af:
            float r3 = r1.getRawX()
            r2.r = r3
            float r3 = r1.getRawY()
            r2.s = r3
            int r1 = r1.getAction()
            r4 = 1
            if (r1 != r4) goto L7de
            os0 r1 = r2.o
            if (r1 == 0) goto L7de
            java.lang.Object r3 = r1.B
            android.view.VelocityTracker r3 = (android.view.VelocityTracker) r3
            if (r3 == 0) goto L7d3
            r3.recycle()
            r3 = 0
            r1.B = r3
            goto L7d4
        L7d3:
            r3 = 0
        L7d4:
            r2.o = r3
            int r1 = r0.u0
            r7 = -1
            if (r1 == r7) goto L7de
            r2.a(r1, r0)
        L7de:
            androidx.constraintlayout.motion.widget.b r0 = r0.p0
            b84 r0 = r0.c
            int r1 = r0.r
            r1 = r1 & 4
            if (r1 == 0) goto L7ed
            androidx.constraintlayout.motion.widget.c r0 = r0.l
            boolean r0 = r0.m
            return r0
        L7ed:
            r19 = 1
            return r19
        L7f0:
            boolean r0 = super.onTouchEvent(r31)
            return r0
    }

    public final void p(float r5) {
            r4 = this;
            androidx.constraintlayout.motion.widget.b r0 = r4.p0
            if (r0 != 0) goto L5
            goto L19
        L5:
            float r1 = r4.D0
            float r2 = r4.C0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 == 0) goto L13
            boolean r1 = r4.G0
            if (r1 == 0) goto L13
            r4.D0 = r2
        L13:
            float r1 = r4.D0
            int r2 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r2 != 0) goto L1a
        L19:
            return
        L1a:
            r2 = 0
            r4.K0 = r2
            r4.F0 = r5
            b84 r3 = r0.c
            if (r3 == 0) goto L26
            int r0 = r3.h
            goto L28
        L26:
            int r0 = r0.j
        L28:
            float r0 = (float) r0
            r3 = 1148846080(0x447a0000, float:1000.0)
            float r0 = r0 / r3
            r4.B0 = r0
            r4.setProgress(r5)
            r5 = 0
            r4.q0 = r5
            androidx.constraintlayout.motion.widget.b r5 = r4.p0
            android.view.animation.Interpolator r5 = r5.d()
            r4.r0 = r5
            r4.G0 = r2
            long r2 = r4.getNanoTime()
            r4.A0 = r2
            r5 = 1
            r4.H0 = r5
            r4.C0 = r1
            r4.D0 = r1
            r4.invalidate()
            return
    }

    public final void q(boolean r9) {
            r8 = this;
            int r0 = r8.getChildCount()
            r1 = 0
            r2 = r1
        L6:
            if (r2 >= r0) goto L42
            android.view.View r3 = r8.getChildAt(r2)
            java.util.HashMap r4 = r8.z0
            java.lang.Object r3 = r4.get(r3)
            m74 r3 = (defpackage.m74) r3
            if (r3 == 0) goto L3f
            android.view.View r4 = r3.b
            java.lang.String r4 = defpackage.lb4.y(r4)
            java.lang.String r5 = "button"
            boolean r4 = r5.equals(r4)
            if (r4 == 0) goto L3f
            rh3[] r4 = r3.A
            if (r4 == 0) goto L3f
            r4 = r1
        L29:
            rh3[] r5 = r3.A
            int r6 = r5.length
            if (r4 >= r6) goto L3f
            r5 = r5[r4]
            if (r9 == 0) goto L35
            r6 = -1027080192(0xffffffffc2c80000, float:-100.0)
            goto L37
        L35:
            r6 = 1120403456(0x42c80000, float:100.0)
        L37:
            android.view.View r7 = r3.b
            r5.g(r7, r6)
            int r4 = r4 + 1
            goto L29
        L3f:
            int r2 = r2 + 1
            goto L6
        L42:
            return
    }

    public final void r(boolean r21) {
            r20 = this;
            r0 = r20
            long r1 = r0.E0
            r3 = -1
            int r1 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r1 != 0) goto L10
            long r1 = r0.getNanoTime()
            r0.E0 = r1
        L10:
            float r1 = r0.D0
            r2 = 0
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            r4 = -1
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 <= 0) goto L20
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 >= 0) goto L20
            r0.u0 = r4
        L20:
            boolean r3 = r0.V0
            r6 = 1
            r7 = 0
            if (r3 != 0) goto L32
            boolean r3 = r0.H0
            if (r3 == 0) goto L22a
            if (r21 != 0) goto L32
            float r3 = r0.F0
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L22a
        L32:
            float r3 = r0.F0
            float r3 = r3 - r1
            float r1 = java.lang.Math.signum(r3)
            long r8 = r0.getNanoTime()
            t74 r3 = r0.q0
            r10 = 814313567(0x3089705f, float:1.0E-9)
            if (r3 != 0) goto L4f
            long r11 = r0.E0
            long r11 = r8 - r11
            float r11 = (float) r11
            float r11 = r11 * r1
            float r11 = r11 * r10
            float r12 = r0.B0
            float r11 = r11 / r12
            goto L50
        L4f:
            r11 = r2
        L50:
            float r12 = r0.D0
            float r12 = r12 + r11
            boolean r13 = r0.G0
            if (r13 == 0) goto L59
            float r12 = r0.F0
        L59:
            int r13 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r13 <= 0) goto L63
            float r14 = r0.F0
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 >= 0) goto L6d
        L63:
            int r14 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r14 > 0) goto L73
            float r14 = r0.F0
            int r14 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r14 > 0) goto L73
        L6d:
            float r12 = r0.F0
            r0.H0 = r7
            r14 = r6
            goto L74
        L73:
            r14 = r7
        L74:
            r0.D0 = r12
            r0.C0 = r12
            r0.E0 = r8
            r15 = 925353388(0x3727c5ac, float:1.0E-5)
            if (r3 == 0) goto Lf9
            if (r14 != 0) goto Lf9
            boolean r14 = r0.K0
            if (r14 == 0) goto Ldd
            long r11 = r0.A0
            long r11 = r8 - r11
            float r11 = (float) r11
            float r11 = r11 * r10
            float r3 = r3.getInterpolation(r11)
            t74 r10 = r0.q0
            r11 = 2
            yq6 r12 = r0.L0
            if (r10 != r12) goto La2
            xq6 r10 = r12.c
            boolean r10 = r10.a()
            if (r10 == 0) goto La0
            r10 = r11
            goto La3
        La0:
            r10 = r6
            goto La3
        La2:
            r10 = r7
        La3:
            r0.D0 = r3
            r0.E0 = r8
            t74 r8 = r0.q0
            if (r8 == 0) goto Ldb
            float r8 = r8.a()
            r0.s0 = r8
            float r9 = java.lang.Math.abs(r8)
            float r12 = r0.B0
            float r9 = r9 * r12
            int r9 = (r9 > r15 ? 1 : (r9 == r15 ? 0 : -1))
            if (r9 > 0) goto Lc0
            if (r10 != r11) goto Lc0
            r0.H0 = r7
        Lc0:
            int r9 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r9 <= 0) goto Lcd
            int r9 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 < 0) goto Lcd
            r0.D0 = r5
            r0.H0 = r7
            r3 = r5
        Lcd:
            int r8 = (r8 > r2 ? 1 : (r8 == r2 ? 0 : -1))
            if (r8 >= 0) goto Ldb
            int r8 = (r3 > r2 ? 1 : (r3 == r2 ? 0 : -1))
            if (r8 > 0) goto Ldb
            r0.D0 = r2
            r0.H0 = r7
            r12 = r2
            goto Lfc
        Ldb:
            r12 = r3
            goto Lfc
        Ldd:
            float r3 = r3.getInterpolation(r12)
            t74 r8 = r0.q0
            if (r8 == 0) goto Lec
            float r8 = r8.a()
            r0.s0 = r8
            goto Lf6
        Lec:
            float r12 = r12 + r11
            float r8 = r8.getInterpolation(r12)
            float r8 = r8 - r3
            float r8 = r8 * r1
            float r8 = r8 / r11
            r0.s0 = r8
        Lf6:
            r12 = r3
        Lf7:
            r10 = r7
            goto Lfc
        Lf9:
            r0.s0 = r11
            goto Lf7
        Lfc:
            float r3 = r0.s0
            float r3 = java.lang.Math.abs(r3)
            int r3 = (r3 > r15 ? 1 : (r3 == r15 ? 0 : -1))
            if (r3 <= 0) goto L10b
            androidx.constraintlayout.motion.widget.MotionLayout$a r3 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r0.setState(r3)
        L10b:
            if (r10 == r6) goto L132
            if (r13 <= 0) goto L115
            float r3 = r0.F0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L11f
        L115:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L123
            float r3 = r0.F0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L123
        L11f:
            float r12 = r0.F0
            r0.H0 = r7
        L123:
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 >= 0) goto L12b
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L132
        L12b:
            r0.H0 = r7
            androidx.constraintlayout.motion.widget.MotionLayout$a r3 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r0.setState(r3)
        L132:
            int r3 = r0.getChildCount()
            r0.V0 = r7
            long r16 = r0.getNanoTime()
            r0.g1 = r12
            android.view.animation.Interpolator r8 = r0.r0
            if (r8 != 0) goto L144
            r15 = r12
            goto L149
        L144:
            float r8 = r8.getInterpolation(r12)
            r15 = r8
        L149:
            android.view.animation.Interpolator r8 = r0.r0
            if (r8 == 0) goto L161
            float r9 = r0.B0
            float r9 = r1 / r9
            float r9 = r9 + r12
            float r8 = r8.getInterpolation(r9)
            r0.s0 = r8
            android.view.animation.Interpolator r9 = r0.r0
            float r9 = r9.getInterpolation(r12)
            float r8 = r8 - r9
            r0.s0 = r8
        L161:
            r8 = r7
        L162:
            if (r8 >= r3) goto L185
            android.view.View r9 = r0.getChildAt(r8)
            java.util.HashMap r10 = r0.z0
            java.lang.Object r10 = r10.get(r9)
            r14 = r10
            m74 r14 = (defpackage.m74) r14
            if (r14 == 0) goto L182
            boolean r10 = r0.V0
            ng3 r11 = r0.h1
            r19 = r9
            r18 = r11
            boolean r9 = r14.d(r15, r16, r18, r19)
            r9 = r9 | r10
            r0.V0 = r9
        L182:
            int r8 = r8 + 1
            goto L162
        L185:
            if (r13 <= 0) goto L18d
            float r3 = r0.F0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 >= 0) goto L197
        L18d:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 > 0) goto L199
            float r3 = r0.F0
            int r3 = (r12 > r3 ? 1 : (r12 == r3 ? 0 : -1))
            if (r3 > 0) goto L199
        L197:
            r3 = r6
            goto L19a
        L199:
            r3 = r7
        L19a:
            boolean r8 = r0.V0
            if (r8 != 0) goto L1a9
            boolean r8 = r0.H0
            if (r8 != 0) goto L1a9
            if (r3 == 0) goto L1a9
            androidx.constraintlayout.motion.widget.MotionLayout$a r8 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r0.setState(r8)
        L1a9:
            boolean r8 = r0.Z0
            if (r8 == 0) goto L1b0
            r0.requestLayout()
        L1b0:
            boolean r8 = r0.V0
            r3 = r3 ^ r6
            r3 = r3 | r8
            r0.V0 = r3
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 > 0) goto L1d3
            int r3 = r0.t0
            if (r3 == r4) goto L1d3
            int r4 = r0.u0
            if (r4 == r3) goto L1d3
            r0.u0 = r3
            androidx.constraintlayout.motion.widget.b r4 = r0.p0
            z11 r3 = r4.b(r3)
            r3.a(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$a r3 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r0.setState(r3)
            r7 = r6
        L1d3:
            double r3 = (double) r12
            r8 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            int r3 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r3 < 0) goto L1f1
            int r3 = r0.u0
            int r4 = r0.v0
            if (r3 == r4) goto L1f1
            r0.u0 = r4
            androidx.constraintlayout.motion.widget.b r3 = r0.p0
            z11 r3 = r3.b(r4)
            r3.a(r0)
            androidx.constraintlayout.motion.widget.MotionLayout$a r3 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r0.setState(r3)
            r7 = r6
        L1f1:
            boolean r3 = r0.V0
            if (r3 != 0) goto L20e
            boolean r3 = r0.H0
            if (r3 == 0) goto L1fa
            goto L20e
        L1fa:
            if (r13 <= 0) goto L200
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 == 0) goto L208
        L200:
            int r3 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r3 >= 0) goto L211
            int r3 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r3 != 0) goto L211
        L208:
            androidx.constraintlayout.motion.widget.MotionLayout$a r3 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r0.setState(r3)
            goto L211
        L20e:
            r0.invalidate()
        L211:
            boolean r3 = r0.V0
            if (r3 != 0) goto L22a
            boolean r3 = r0.H0
            if (r3 != 0) goto L22a
            if (r13 <= 0) goto L21f
            int r3 = (r12 > r5 ? 1 : (r12 == r5 ? 0 : -1))
            if (r3 == 0) goto L227
        L21f:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 >= 0) goto L22a
            int r1 = (r12 > r2 ? 1 : (r12 == r2 ? 0 : -1))
            if (r1 != 0) goto L22a
        L227:
            r0.u()
        L22a:
            float r1 = r0.D0
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 < 0) goto L23c
            int r1 = r0.u0
            int r2 = r0.v0
            if (r1 == r2) goto L237
            goto L238
        L237:
            r6 = r7
        L238:
            r0.u0 = r2
        L23a:
            r7 = r6
            goto L24b
        L23c:
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 > 0) goto L24b
            int r1 = r0.u0
            int r2 = r0.t0
            if (r1 == r2) goto L247
            goto L248
        L247:
            r6 = r7
        L248:
            r0.u0 = r2
            goto L23a
        L24b:
            boolean r1 = r0.p1
            r1 = r1 | r7
            r0.p1 = r1
            if (r7 == 0) goto L259
            boolean r1 = r0.i1
            if (r1 != 0) goto L259
            r0.requestLayout()
        L259:
            float r1 = r0.D0
            r0.C0 = r1
            return
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View, android.view.ViewParent
    public final void requestLayout() {
            r4 = this;
            boolean r0 = r4.Z0
            if (r0 != 0) goto L33
            int r0 = r4.u0
            r1 = -1
            if (r0 != r1) goto L33
            androidx.constraintlayout.motion.widget.b r0 = r4.p0
            if (r0 == 0) goto L33
            b84 r0 = r0.c
            if (r0 == 0) goto L33
            int r0 = r0.q
            if (r0 != 0) goto L16
            goto L32
        L16:
            r1 = 2
            if (r0 != r1) goto L33
            int r0 = r4.getChildCount()
            r1 = 0
        L1e:
            if (r1 >= r0) goto L32
            android.view.View r2 = r4.getChildAt(r1)
            java.util.HashMap r3 = r4.z0
            java.lang.Object r2 = r3.get(r2)
            m74 r2 = (defpackage.m74) r2
            r3 = 1
            r2.d = r3
            int r1 = r1 + 1
            goto L1e
        L32:
            return
        L33:
            super.requestLayout()
            return
    }

    public final void s(int r15, float r16, float r17, float r18, float[] r19) {
            r14 = this;
            android.util.SparseArray r1 = r14.A
            java.lang.Object r1 = r1.get(r15)
            android.view.View r1 = (android.view.View) r1
            java.util.HashMap r14 = r14.z0
            java.lang.Object r14 = r14.get(r1)
            m74 r14 = (defpackage.m74) r14
            if (r14 == 0) goto La8
            y74 r0 = r14.f
            float[] r2 = r14.v
            r3 = r16
            float r3 = r14.a(r3, r2)
            ak7[] r4 = r14.j
            r5 = 0
            if (r4 == 0) goto L79
            r4 = r4[r5]
            double r6 = (double) r3
            double[] r3 = r14.q
            r4.d0(r6, r3)
            ak7[] r3 = r14.j
            r3 = r3[r5]
            double[] r4 = r14.p
            r3.a0(r6, r4)
            r2 = r2[r5]
        L34:
            double[] r12 = r14.q
            int r3 = r12.length
            if (r5 >= r3) goto L42
            r3 = r12[r5]
            double r8 = (double) r2
            double r3 = r3 * r8
            r12[r5] = r3
            int r5 = r5 + 1
            goto L34
        L42:
            wt r2 = r14.k
            if (r2 == 0) goto L68
            double[] r3 = r14.p
            int r4 = r3.length
            if (r4 <= 0) goto La4
            r2.a0(r6, r3)
            wt r2 = r14.k
            double[] r3 = r14.q
            r2.d0(r6, r3)
            int[] r11 = r14.o
            double[] r12 = r14.q
            double[] r13 = r14.p
            r0.getClass()
            r8 = r17
            r9 = r18
            r10 = r19
            defpackage.y74.e(r8, r9, r10, r11, r12, r13)
            goto La4
        L68:
            int[] r11 = r14.o
            double[] r13 = r14.p
            r0.getClass()
            r8 = r17
            r9 = r18
            r10 = r19
            defpackage.y74.e(r8, r9, r10, r11, r12, r13)
            goto La4
        L79:
            y74 r14 = r14.g
            float r2 = r14.X
            float r3 = r0.X
            float r2 = r2 - r3
            float r3 = r14.Y
            float r4 = r0.Y
            float r3 = r3 - r4
            float r4 = r14.Z
            float r6 = r0.Z
            float r4 = r4 - r6
            float r14 = r14.d0
            float r0 = r0.d0
            float r14 = r14 - r0
            float r4 = r4 + r2
            float r14 = r14 + r3
            r0 = 1065353216(0x3f800000, float:1.0)
            float r6 = r0 - r17
            float r6 = r6 * r2
            float r4 = r4 * r17
            float r4 = r4 + r6
            r19[r5] = r4
            float r0 = r0 - r18
            float r0 = r0 * r3
            float r14 = r14 * r18
            float r14 = r14 + r0
            r0 = 1
            r19[r0] = r14
        La4:
            r1.getY()
            return
        La8:
            if (r1 != 0) goto Lb1
            java.lang.String r14 = ""
            java.lang.String r14 = defpackage.lb1.g(r15, r14)
            goto Lbd
        Lb1:
            android.content.Context r14 = r1.getContext()
            android.content.res.Resources r14 = r14.getResources()
            java.lang.String r14 = r14.getResourceName(r15)
        Lbd:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "WARNING could not find view id "
            r0.<init>(r1)
            r0.append(r14)
            java.lang.String r14 = r0.toString()
            java.lang.String r0 = "MotionLayout"
            android.util.Log.w(r0, r14)
            return
    }

    public void setDebugMode(int r1) {
            r0 = this;
            r0.I0 = r1
            r0.invalidate()
            return
    }

    public void setDelayedApplicationOfInitialState(boolean r1) {
            r0 = this;
            r0.m1 = r1
            return
    }

    public void setInteractionEnabled(boolean r1) {
            r0 = this;
            r0.y0 = r1
            return
    }

    public void setInterpolatedProgress(float r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.b r0 = r1.p0
            if (r0 == 0) goto L19
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r1.setState(r0)
            androidx.constraintlayout.motion.widget.b r0 = r1.p0
            android.view.animation.Interpolator r0 = r0.d()
            if (r0 == 0) goto L19
            float r2 = r0.getInterpolation(r2)
            r1.setProgress(r2)
            return
        L19:
            r1.setProgress(r2)
            return
    }

    public void setOnHide(float r1) {
            r0 = this;
            return
    }

    public void setOnShow(float r1) {
            r0 = this;
            return
    }

    public void setProgress(float r6) {
            r5 = this;
            r0 = 0
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            r2 = 1065353216(0x3f800000, float:1.0)
            if (r1 < 0) goto Lb
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L12
        Lb:
            java.lang.String r3 = "MotionLayout"
            java.lang.String r4 = "Warning! Progress is defined for values between 0.0 and 1.0 inclusive"
            android.util.Log.w(r3, r4)
        L12:
            boolean r3 = r5.isAttachedToWindow()
            if (r3 != 0) goto L28
            androidx.constraintlayout.motion.widget.a r0 = r5.j1
            if (r0 != 0) goto L23
            androidx.constraintlayout.motion.widget.a r0 = new androidx.constraintlayout.motion.widget.a
            r0.<init>(r5)
            r5.j1 = r0
        L23:
            androidx.constraintlayout.motion.widget.a r5 = r5.j1
            r5.a = r6
            return
        L28:
            if (r1 > 0) goto L4b
            float r1 = r5.D0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 != 0) goto L3b
            int r1 = r5.u0
            int r2 = r5.v0
            if (r1 != r2) goto L3b
            androidx.constraintlayout.motion.widget.MotionLayout$a r1 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r5.setState(r1)
        L3b:
            int r1 = r5.t0
            r5.u0 = r1
            float r1 = r5.D0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L78
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r5.setState(r0)
            goto L78
        L4b:
            int r1 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r1 < 0) goto L70
            float r1 = r5.D0
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 != 0) goto L60
            int r0 = r5.u0
            int r1 = r5.t0
            if (r0 != r1) goto L60
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r5.setState(r0)
        L60:
            int r0 = r5.v0
            r5.u0 = r0
            float r0 = r5.D0
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 != 0) goto L78
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            r5.setState(r0)
            goto L78
        L70:
            r0 = -1
            r5.u0 = r0
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.MOVING
            r5.setState(r0)
        L78:
            androidx.constraintlayout.motion.widget.b r0 = r5.p0
            if (r0 != 0) goto L7d
            return
        L7d:
            r0 = 1
            r5.G0 = r0
            r5.F0 = r6
            r5.C0 = r6
            r1 = -1
            r5.E0 = r1
            r5.A0 = r1
            r6 = 0
            r5.q0 = r6
            r5.H0 = r0
            r5.invalidate()
            return
    }

    public void setScene(androidx.constraintlayout.motion.widget.b r2) {
            r1 = this;
            r1.p0 = r2
            boolean r0 = r1.j()
            r2.p = r0
            b84 r2 = r2.c
            if (r2 == 0) goto L13
            androidx.constraintlayout.motion.widget.c r2 = r2.l
            if (r2 == 0) goto L13
            r2.c(r0)
        L13:
            r1.v()
            return
    }

    public void setStartState(int r2) {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L18
            androidx.constraintlayout.motion.widget.a r0 = r1.j1
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.a r0 = new androidx.constraintlayout.motion.widget.a
            r0.<init>(r1)
            r1.j1 = r0
        L11:
            androidx.constraintlayout.motion.widget.a r1 = r1.j1
            r1.c = r2
            r1.d = r2
            return
        L18:
            r1.u0 = r2
            return
    }

    public void setState(androidx.constraintlayout.motion.widget.MotionLayout.a r5) {
            r4 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.FINISHED
            if (r5 != r0) goto La
            int r1 = r4.u0
            r2 = -1
            if (r1 != r2) goto La
            goto L35
        La:
            androidx.constraintlayout.motion.widget.MotionLayout$a r1 = r4.n1
            r4.n1 = r5
            androidx.constraintlayout.motion.widget.MotionLayout$a r2 = androidx.constraintlayout.motion.widget.MotionLayout.a.UNDEFINED
            int r1 = r1.ordinal()
            r2 = 0
            if (r1 == 0) goto L2a
            r3 = 1
            if (r1 == r3) goto L2a
            r3 = 2
            if (r1 == r3) goto L1e
            goto L35
        L1e:
            if (r5 != r0) goto L35
            q64 r5 = r4.k1
            if (r5 == 0) goto L35
            r5.run()
            r4.k1 = r2
            return
        L2a:
            if (r5 != r0) goto L35
            q64 r5 = r4.k1
            if (r5 == 0) goto L35
            r5.run()
            r4.k1 = r2
        L35:
            return
    }

    public void setTransition(int r7) {
            r6 = this;
            androidx.constraintlayout.motion.widget.b r0 = r6.p0
            if (r0 == 0) goto Lcb
            java.util.ArrayList r0 = r0.d
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L1b
            java.lang.Object r4 = r0.get(r3)
            int r3 = r3 + 1
            b84 r4 = (defpackage.b84) r4
            int r5 = r4.a
            if (r5 != r7) goto Lc
            goto L1c
        L1b:
            r4 = 0
        L1c:
            int r7 = r4.d
            r6.t0 = r7
            int r7 = r4.c
            r6.v0 = r7
            boolean r7 = r6.isAttachedToWindow()
            if (r7 != 0) goto L40
            androidx.constraintlayout.motion.widget.a r7 = r6.j1
            if (r7 != 0) goto L35
            androidx.constraintlayout.motion.widget.a r7 = new androidx.constraintlayout.motion.widget.a
            r7.<init>(r6)
            r6.j1 = r7
        L35:
            androidx.constraintlayout.motion.widget.a r7 = r6.j1
            int r0 = r6.t0
            r7.c = r0
            int r6 = r6.v0
            r7.d = r6
            return
        L40:
            int r7 = r6.u0
            int r0 = r6.t0
            r1 = 1065353216(0x3f800000, float:1.0)
            r3 = 0
            if (r7 != r0) goto L4b
            r7 = r3
            goto L53
        L4b:
            int r0 = r6.v0
            if (r7 != r0) goto L51
            r7 = r1
            goto L53
        L51:
            r7 = 2143289344(0x7fc00000, float:NaN)
        L53:
            androidx.constraintlayout.motion.widget.b r0 = r6.p0
            r0.c = r4
            androidx.constraintlayout.motion.widget.c r4 = r4.l
            if (r4 == 0) goto L60
            boolean r0 = r0.p
            r4.c(r0)
        L60:
            androidx.constraintlayout.motion.widget.b r0 = r6.p0
            int r4 = r6.t0
            z11 r0 = r0.b(r4)
            androidx.constraintlayout.motion.widget.b r4 = r6.p0
            int r5 = r6.v0
            z11 r4 = r4.b(r5)
            w74 r5 = r6.o1
            r5.e(r0, r4)
            r6.v()
            float r0 = r6.D0
            int r0 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r0 == 0) goto La4
            int r0 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r0 != 0) goto L92
            r0 = 1
            r6.q(r0)
            androidx.constraintlayout.motion.widget.b r0 = r6.p0
            int r1 = r6.t0
            z11 r0 = r0.b(r1)
            r0.b(r6)
            goto La4
        L92:
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 != 0) goto La4
            r6.q(r2)
            androidx.constraintlayout.motion.widget.b r0 = r6.p0
            int r1 = r6.v0
            z11 r0 = r0.b(r1)
            r0.b(r6)
        La4:
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 == 0) goto Lac
            r0 = r3
            goto Lad
        Lac:
            r0 = r7
        Lad:
            r6.D0 = r0
            boolean r0 = java.lang.Float.isNaN(r7)
            if (r0 == 0) goto Lc8
            java.lang.String r7 = defpackage.lb4.w()
            java.lang.String r0 = " transitionToStart "
            java.lang.String r7 = r7.concat(r0)
            java.lang.String r0 = "MotionLayout"
            android.util.Log.v(r0, r7)
            r6.p(r3)
            return
        Lc8:
            r6.setProgress(r7)
        Lcb:
            return
    }

    public void setTransition(defpackage.b84 r4) {
            r3 = this;
            androidx.constraintlayout.motion.widget.b r0 = r3.p0
            r0.c = r4
            if (r4 == 0) goto Lf
            androidx.constraintlayout.motion.widget.c r1 = r4.l
            if (r1 == 0) goto Lf
            boolean r0 = r0.p
            r1.c(r0)
        Lf:
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.SETUP
            r3.setState(r0)
            int r0 = r3.u0
            androidx.constraintlayout.motion.widget.b r1 = r3.p0
            b84 r1 = r1.c
            r2 = -1
            if (r1 != 0) goto L1f
            r1 = r2
            goto L21
        L1f:
            int r1 = r1.c
        L21:
            if (r0 != r1) goto L2c
            r0 = 1065353216(0x3f800000, float:1.0)
            r3.D0 = r0
            r3.C0 = r0
            r3.F0 = r0
            goto L33
        L2c:
            r0 = 0
            r3.D0 = r0
            r3.C0 = r0
            r3.F0 = r0
        L33:
            int r4 = r4.r
            r4 = r4 & 1
            if (r4 == 0) goto L3c
            r0 = -1
            goto L40
        L3c:
            long r0 = r3.getNanoTime()
        L40:
            r3.E0 = r0
            androidx.constraintlayout.motion.widget.b r4 = r3.p0
            int r4 = r4.g()
            androidx.constraintlayout.motion.widget.b r0 = r3.p0
            b84 r1 = r0.c
            if (r1 != 0) goto L4f
            goto L51
        L4f:
            int r2 = r1.c
        L51:
            int r1 = r3.t0
            if (r4 != r1) goto L5a
            int r1 = r3.v0
            if (r2 != r1) goto L5a
            return
        L5a:
            r3.t0 = r4
            r3.v0 = r2
            r0.m(r4, r2)
            androidx.constraintlayout.motion.widget.b r4 = r3.p0
            int r0 = r3.t0
            z11 r4 = r4.b(r0)
            androidx.constraintlayout.motion.widget.b r0 = r3.p0
            int r1 = r3.v0
            z11 r0 = r0.b(r1)
            w74 r1 = r3.o1
            r1.e(r4, r0)
            int r4 = r3.t0
            int r0 = r3.v0
            r1.e = r4
            r1.f = r0
            r1.f()
            r3.v()
            return
    }

    public void setTransitionDuration(int r2) {
            r1 = this;
            androidx.constraintlayout.motion.widget.b r1 = r1.p0
            if (r1 != 0) goto Lc
            java.lang.String r1 = "MotionLayout"
            java.lang.String r2 = "MotionScene not defined"
            android.util.Log.e(r1, r2)
            return
        Lc:
            b84 r0 = r1.c
            if (r0 == 0) goto L19
            r1 = 8
            int r1 = java.lang.Math.max(r2, r1)
            r0.h = r1
            return
        L19:
            r1.j = r2
            return
    }

    public void setTransitionListener(defpackage.x74 r1) {
            r0 = this;
            return
    }

    public void setTransitionState(android.os.Bundle r3) {
            r2 = this;
            androidx.constraintlayout.motion.widget.a r0 = r2.j1
            if (r0 != 0) goto Lb
            androidx.constraintlayout.motion.widget.a r0 = new androidx.constraintlayout.motion.widget.a
            r0.<init>(r2)
            r2.j1 = r0
        Lb:
            androidx.constraintlayout.motion.widget.a r0 = r2.j1
            r0.getClass()
            java.lang.String r1 = "motion.progress"
            float r1 = r3.getFloat(r1)
            r0.a = r1
            java.lang.String r1 = "motion.velocity"
            float r1 = r3.getFloat(r1)
            r0.b = r1
            java.lang.String r1 = "motion.StartState"
            int r1 = r3.getInt(r1)
            r0.c = r1
            java.lang.String r1 = "motion.EndState"
            int r3 = r3.getInt(r1)
            r0.d = r3
            boolean r3 = r2.isAttachedToWindow()
            if (r3 == 0) goto L3b
            androidx.constraintlayout.motion.widget.a r2 = r2.j1
            r2.a()
        L3b:
            return
    }

    public final boolean t(float r8, float r9, android.view.View r10, android.view.MotionEvent r11) {
            r7 = this;
            boolean r0 = r10 instanceof android.view.ViewGroup
            r1 = 1
            if (r0 == 0) goto L36
            r0 = r10
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r2 = r0.getChildCount()
            int r2 = r2 - r1
        Ld:
            if (r2 < 0) goto L36
            android.view.View r3 = r0.getChildAt(r2)
            int r4 = r3.getLeft()
            float r4 = (float) r4
            float r4 = r4 + r8
            int r5 = r10.getScrollX()
            float r5 = (float) r5
            float r4 = r4 - r5
            int r5 = r3.getTop()
            float r5 = (float) r5
            float r5 = r5 + r9
            int r6 = r10.getScrollY()
            float r6 = (float) r6
            float r5 = r5 - r6
            boolean r3 = r7.t(r4, r5, r3, r11)
            if (r3 == 0) goto L33
            r0 = r1
            goto L37
        L33:
            int r2 = r2 + (-1)
            goto Ld
        L36:
            r0 = 0
        L37:
            if (r0 != 0) goto La9
            int r2 = r10.getRight()
            float r2 = (float) r2
            float r2 = r2 + r8
            int r3 = r10.getLeft()
            float r3 = (float) r3
            float r2 = r2 - r3
            int r3 = r10.getBottom()
            float r3 = (float) r3
            float r3 = r3 + r9
            int r4 = r10.getTop()
            float r4 = (float) r4
            float r3 = r3 - r4
            android.graphics.RectF r4 = r7.q1
            r4.set(r8, r9, r2, r3)
            int r2 = r11.getAction()
            if (r2 != 0) goto L6a
            float r2 = r11.getX()
            float r3 = r11.getY()
            boolean r2 = r4.contains(r2, r3)
            if (r2 == 0) goto La9
        L6a:
            float r8 = -r8
            float r9 = -r9
            android.graphics.Matrix r2 = r10.getMatrix()
            boolean r3 = r2.isIdentity()
            if (r3 == 0) goto L83
            r11.offsetLocation(r8, r9)
            boolean r7 = r10.onTouchEvent(r11)
            float r8 = -r8
            float r9 = -r9
            r11.offsetLocation(r8, r9)
            goto La6
        L83:
            android.view.MotionEvent r11 = android.view.MotionEvent.obtain(r11)
            r11.offsetLocation(r8, r9)
            android.graphics.Matrix r8 = r7.s1
            if (r8 != 0) goto L95
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r7.s1 = r8
        L95:
            android.graphics.Matrix r8 = r7.s1
            r2.invert(r8)
            android.graphics.Matrix r7 = r7.s1
            r11.transform(r7)
            boolean r7 = r10.onTouchEvent(r11)
            r11.recycle()
        La6:
            if (r7 == 0) goto La9
            return r1
        La9:
            return r0
    }

    @Override // android.view.View
    public final java.lang.String toString() {
            r3 = this;
            android.content.Context r0 = r3.getContext()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            int r2 = r3.t0
            java.lang.String r2 = defpackage.lb4.x(r0, r2)
            r1.append(r2)
            java.lang.String r2 = "->"
            r1.append(r2)
            int r2 = r3.v0
            java.lang.String r0 = defpackage.lb4.x(r0, r2)
            r1.append(r0)
            java.lang.String r0 = " (pos:"
            r1.append(r0)
            float r0 = r3.D0
            r1.append(r0)
            java.lang.String r0 = " Dpos/Dt:"
            r1.append(r0)
            float r3 = r3.s0
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            return r3
    }

    public final void u() {
            r12 = this;
            androidx.constraintlayout.motion.widget.b r0 = r12.p0
            if (r0 != 0) goto L6
            goto L122
        L6:
            int r1 = r12.u0
            boolean r0 = r0.a(r1, r12)
            if (r0 == 0) goto L12
            r12.requestLayout()
            return
        L12:
            int r0 = r12.u0
            r1 = -1
            if (r0 == r1) goto Lce
            androidx.constraintlayout.motion.widget.b r2 = r12.p0
            java.util.ArrayList r3 = r2.f
            java.util.ArrayList r2 = r2.d
            int r4 = r2.size()
            r5 = 0
            r6 = r5
        L23:
            if (r6 >= r4) goto L4a
            java.lang.Object r7 = r2.get(r6)
            int r6 = r6 + 1
            b84 r7 = (defpackage.b84) r7
            java.util.ArrayList r8 = r7.m
            int r8 = r8.size()
            if (r8 <= 0) goto L23
            java.util.ArrayList r7 = r7.m
            int r8 = r7.size()
            r9 = r5
        L3c:
            if (r9 >= r8) goto L23
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            a84 r10 = (defpackage.a84) r10
            r10.b(r12)
            goto L3c
        L4a:
            int r4 = r3.size()
            r6 = r5
        L4f:
            if (r6 >= r4) goto L76
            java.lang.Object r7 = r3.get(r6)
            int r6 = r6 + 1
            b84 r7 = (defpackage.b84) r7
            java.util.ArrayList r8 = r7.m
            int r8 = r8.size()
            if (r8 <= 0) goto L4f
            java.util.ArrayList r7 = r7.m
            int r8 = r7.size()
            r9 = r5
        L68:
            if (r9 >= r8) goto L4f
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            a84 r10 = (defpackage.a84) r10
            r10.b(r12)
            goto L68
        L76:
            int r4 = r2.size()
            r6 = r5
        L7b:
            if (r6 >= r4) goto La2
            java.lang.Object r7 = r2.get(r6)
            int r6 = r6 + 1
            b84 r7 = (defpackage.b84) r7
            java.util.ArrayList r8 = r7.m
            int r8 = r8.size()
            if (r8 <= 0) goto L7b
            java.util.ArrayList r8 = r7.m
            int r9 = r8.size()
            r10 = r5
        L94:
            if (r10 >= r9) goto L7b
            java.lang.Object r11 = r8.get(r10)
            int r10 = r10 + 1
            a84 r11 = (defpackage.a84) r11
            r11.a(r12, r0, r7)
            goto L94
        La2:
            int r2 = r3.size()
            r4 = r5
        La7:
            if (r4 >= r2) goto Lce
            java.lang.Object r6 = r3.get(r4)
            int r4 = r4 + 1
            b84 r6 = (defpackage.b84) r6
            java.util.ArrayList r7 = r6.m
            int r7 = r7.size()
            if (r7 <= 0) goto La7
            java.util.ArrayList r7 = r6.m
            int r8 = r7.size()
            r9 = r5
        Lc0:
            if (r9 >= r8) goto La7
            java.lang.Object r10 = r7.get(r9)
            int r9 = r9 + 1
            a84 r10 = (defpackage.a84) r10
            r10.a(r12, r0, r6)
            goto Lc0
        Lce:
            androidx.constraintlayout.motion.widget.b r0 = r12.p0
            boolean r0 = r0.n()
            if (r0 == 0) goto L122
            androidx.constraintlayout.motion.widget.b r12 = r12.p0
            b84 r12 = r12.c
            if (r12 == 0) goto L122
            androidx.constraintlayout.motion.widget.c r12 = r12.l
            if (r12 == 0) goto L122
            androidx.constraintlayout.motion.widget.MotionLayout r0 = r12.r
            int r2 = r12.d
            if (r2 == r1) goto L10a
            android.view.View r1 = r0.findViewById(r2)
            if (r1 != 0) goto L10b
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "cannot find TouchAnchorId @id/"
            r2.<init>(r3)
            android.content.Context r0 = r0.getContext()
            int r12 = r12.d
            java.lang.String r12 = defpackage.lb4.x(r0, r12)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            java.lang.String r0 = "TouchResponse"
            android.util.Log.e(r0, r12)
            goto L10b
        L10a:
            r1 = 0
        L10b:
            boolean r12 = r1 instanceof androidx.core.widget.NestedScrollView
            if (r12 == 0) goto L122
            androidx.core.widget.NestedScrollView r1 = (androidx.core.widget.NestedScrollView) r1
            t20 r12 = new t20
            r0 = 2
            r12.<init>(r0)
            r1.setOnTouchListener(r12)
            q61 r12 = new q61
            r12.<init>()
            r1.setOnScrollChangeListener(r12)
        L122:
            return
    }

    public final void v() {
            r1 = this;
            w74 r0 = r1.o1
            r0.f()
            r1.invalidate()
            return
    }

    public final void w(int r8) {
            r7 = this;
            androidx.constraintlayout.motion.widget.MotionLayout$a r0 = androidx.constraintlayout.motion.widget.MotionLayout.a.SETUP
            r7.setState(r0)
            r7.u0 = r8
            r0 = -1
            r7.t0 = r0
            r7.v0 = r0
            s11 r1 = r7.j0
            if (r1 == 0) goto Le0
            java.lang.Object r7 = r1.c
            androidx.constraintlayout.widget.ConstraintLayout r7 = (androidx.constraintlayout.widget.ConstraintLayout) r7
            java.lang.Cloneable r2 = r1.d
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            int r3 = r1.a
            r4 = 0
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            if (r3 != r8) goto L84
            if (r8 != r0) goto L28
            java.lang.Object r8 = r2.valueAt(r4)
            q11 r8 = (defpackage.q11) r8
            goto L2e
        L28:
            java.lang.Object r8 = r2.get(r3)
            q11 r8 = (defpackage.q11) r8
        L2e:
            int r2 = r1.b
            if (r2 == r0) goto L42
            java.util.ArrayList r3 = r8.b
            java.lang.Object r2 = r3.get(r2)
            r11 r2 = (defpackage.r11) r2
            boolean r2 = r2.a(r5, r5)
            if (r2 == 0) goto L42
            goto Leb
        L42:
            java.util.ArrayList r2 = r8.b
        L44:
            int r3 = r2.size()
            if (r4 >= r3) goto L5a
            java.lang.Object r3 = r2.get(r4)
            r11 r3 = (defpackage.r11) r3
            boolean r3 = r3.a(r5, r5)
            if (r3 == 0) goto L57
            goto L5b
        L57:
            int r4 = r4 + 1
            goto L44
        L5a:
            r4 = r0
        L5b:
            java.util.ArrayList r8 = r8.b
            int r2 = r1.b
            if (r2 != r4) goto L63
            goto Leb
        L63:
            if (r4 != r0) goto L67
            r2 = 0
            goto L6f
        L67:
            java.lang.Object r2 = r8.get(r4)
            r11 r2 = (defpackage.r11) r2
            z11 r2 = r2.f
        L6f:
            if (r4 != r0) goto L72
            goto L7a
        L72:
            java.lang.Object r8 = r8.get(r4)
            r11 r8 = (defpackage.r11) r8
            int r8 = r8.e
        L7a:
            if (r2 != 0) goto L7e
            goto Leb
        L7e:
            r1.b = r4
            r2.b(r7)
            return
        L84:
            r1.a = r8
            java.lang.Object r2 = r2.get(r8)
            q11 r2 = (defpackage.q11) r2
            java.util.ArrayList r3 = r2.b
        L8e:
            int r6 = r3.size()
            if (r4 >= r6) goto La4
            java.lang.Object r6 = r3.get(r4)
            r11 r6 = (defpackage.r11) r6
            boolean r6 = r6.a(r5, r5)
            if (r6 == 0) goto La1
            goto La5
        La1:
            int r4 = r4 + 1
            goto L8e
        La4:
            r4 = r0
        La5:
            java.util.ArrayList r3 = r2.b
            if (r4 != r0) goto Lac
            z11 r2 = r2.d
            goto Lb4
        Lac:
            java.lang.Object r2 = r3.get(r4)
            r11 r2 = (defpackage.r11) r2
            z11 r2 = r2.f
        Lb4:
            if (r4 != r0) goto Lb7
            goto Lbf
        Lb7:
            java.lang.Object r0 = r3.get(r4)
            r11 r0 = (defpackage.r11) r0
            int r0 = r0.e
        Lbf:
            if (r2 != 0) goto Lda
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r0 = "NO Constraint set found ! id="
            r7.<init>(r0)
            r7.append(r8)
            java.lang.String r8 = ", dim =-1.0, -1.0"
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            java.lang.String r8 = "ConstraintLayoutStates"
            android.util.Log.v(r8, r7)
            return
        Lda:
            r1.b = r4
            r2.b(r7)
            return
        Le0:
            androidx.constraintlayout.motion.widget.b r0 = r7.p0
            if (r0 == 0) goto Leb
            z11 r8 = r0.b(r8)
            r8.b(r7)
        Leb:
            return
    }

    public final void x(int r2, int r3) {
            r1 = this;
            boolean r0 = r1.isAttachedToWindow()
            if (r0 != 0) goto L18
            androidx.constraintlayout.motion.widget.a r0 = r1.j1
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.a r0 = new androidx.constraintlayout.motion.widget.a
            r0.<init>(r1)
            r1.j1 = r0
        L11:
            androidx.constraintlayout.motion.widget.a r1 = r1.j1
            r1.c = r2
            r1.d = r3
            return
        L18:
            androidx.constraintlayout.motion.widget.b r0 = r1.p0
            if (r0 == 0) goto L3d
            r1.t0 = r2
            r1.v0 = r3
            r0.m(r2, r3)
            androidx.constraintlayout.motion.widget.b r0 = r1.p0
            z11 r2 = r0.b(r2)
            androidx.constraintlayout.motion.widget.b r0 = r1.p0
            z11 r3 = r0.b(r3)
            w74 r0 = r1.o1
            r0.e(r2, r3)
            r1.v()
            r2 = 0
            r1.D0 = r2
            r1.p(r2)
        L3d:
            return
    }

    public final void y(float r18, float r19, int r20) {
            r17 = this;
            r0 = r17
            r3 = r18
            r4 = r19
            r1 = r20
            androidx.constraintlayout.motion.widget.b r2 = r0.p0
            if (r2 != 0) goto Ld
            goto L13
        Ld:
            float r2 = r0.D0
            int r2 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r2 != 0) goto L14
        L13:
            return
        L14:
            r2 = 1
            r0.K0 = r2
            long r5 = r0.getNanoTime()
            r0.A0 = r5
            androidx.constraintlayout.motion.widget.b r5 = r0.p0
            b84 r6 = r5.c
            if (r6 == 0) goto L26
            int r7 = r6.h
            goto L28
        L26:
            int r7 = r5.j
        L28:
            float r7 = (float) r7
            r8 = 1148846080(0x447a0000, float:1000.0)
            float r7 = r7 / r8
            r0.B0 = r7
            r0.F0 = r3
            r0.H0 = r2
            yq6 r8 = r0.L0
            r10 = 7
            r11 = 6
            r12 = 2
            r13 = 0
            r14 = 0
            if (r1 == 0) goto Lc2
            if (r1 == r2) goto Lc2
            if (r1 == r12) goto Lc2
            r15 = 4
            r16 = 1065353216(0x3f800000, float:1.0)
            u74 r9 = r0.M0
            if (r1 == r15) goto Lb2
            r15 = 5
            if (r1 == r15) goto L4f
            if (r1 == r11) goto Lc4
            if (r1 == r10) goto Lc4
            goto L15a
        L4f:
            float r1 = r0.D0
            float r2 = r5.f()
            int r5 = (r4 > r14 ? 1 : (r4 == r14 ? 0 : -1))
            r6 = 1073741824(0x40000000, float:2.0)
            if (r5 <= 0) goto L69
            float r5 = r4 / r2
            float r7 = r4 * r5
            float r2 = r2 * r5
            float r2 = r2 * r5
            float r2 = r2 / r6
            float r7 = r7 - r2
            float r7 = r7 + r1
            int r1 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r1 <= 0) goto L88
            goto L76
        L69:
            float r5 = -r4
            float r5 = r5 / r2
            float r7 = r4 * r5
            float r2 = r2 * r5
            float r2 = r2 * r5
            float r2 = r2 / r6
            float r2 = r2 + r7
            float r2 = r2 + r1
            int r1 = (r2 > r14 ? 1 : (r2 == r14 ? 0 : -1))
            if (r1 >= 0) goto L88
        L76:
            float r1 = r0.D0
            androidx.constraintlayout.motion.widget.b r2 = r0.p0
            float r2 = r2.f()
            r9.a = r4
            r9.b = r1
            r9.c = r2
            r0.q0 = r9
            goto L15a
        L88:
            float r2 = r0.D0
            float r5 = r0.B0
            androidx.constraintlayout.motion.widget.b r1 = r0.p0
            float r6 = r1.f()
            androidx.constraintlayout.motion.widget.b r1 = r0.p0
            b84 r1 = r1.c
            if (r1 == 0) goto La0
            androidx.constraintlayout.motion.widget.c r1 = r1.l
            if (r1 == 0) goto La0
            float r1 = r1.s
            r7 = r1
            goto La1
        La0:
            r7 = r14
        La1:
            yq6 r1 = r0.L0
            r1.b(r2, r3, r4, r5, r6, r7)
            r0.s0 = r14
            int r1 = r0.u0
            r0.F0 = r3
            r0.u0 = r1
            r0.q0 = r8
            goto L15a
        Lb2:
            float r1 = r0.D0
            float r2 = r5.f()
            r9.a = r4
            r9.b = r1
            r9.c = r2
            r0.q0 = r9
            goto L15a
        Lc2:
            r16 = 1065353216(0x3f800000, float:1.0)
        Lc4:
            if (r1 == r2) goto Ld0
            if (r1 != r10) goto Lc9
            goto Ld0
        Lc9:
            if (r1 == r12) goto Lcd
            if (r1 != r11) goto Ld1
        Lcd:
            r3 = r16
            goto Ld1
        Ld0:
            r3 = r14
        Ld1:
            if (r6 == 0) goto Lda
            androidx.constraintlayout.motion.widget.c r1 = r6.l
            if (r1 == 0) goto Lda
            int r1 = r1.D
            goto Ldb
        Lda:
            r1 = r13
        Ldb:
            float r2 = r0.D0
            r9 = r1
            yq6 r1 = r0.L0
            if (r9 != 0) goto Lf8
            float r6 = r5.f()
            androidx.constraintlayout.motion.widget.b r5 = r0.p0
            b84 r5 = r5.c
            if (r5 == 0) goto Lf2
            androidx.constraintlayout.motion.widget.c r5 = r5.l
            if (r5 == 0) goto Lf2
            float r14 = r5.s
        Lf2:
            r5 = r7
            r7 = r14
            r1.b(r2, r3, r4, r5, r6, r7)
            goto L152
        Lf8:
            if (r6 == 0) goto L101
            androidx.constraintlayout.motion.widget.c r4 = r6.l
            if (r4 == 0) goto L101
            float r4 = r4.z
            goto L102
        L101:
            r4 = r14
        L102:
            if (r6 == 0) goto L10b
            androidx.constraintlayout.motion.widget.c r5 = r6.l
            if (r5 == 0) goto L10b
            float r5 = r5.A
            goto L10c
        L10b:
            r5 = r14
        L10c:
            if (r6 == 0) goto L115
            androidx.constraintlayout.motion.widget.c r7 = r6.l
            if (r7 == 0) goto L115
            float r7 = r7.y
            goto L116
        L115:
            r7 = r14
        L116:
            if (r6 == 0) goto L11f
            androidx.constraintlayout.motion.widget.c r9 = r6.l
            if (r9 == 0) goto L11f
            float r9 = r9.B
            goto L120
        L11f:
            r9 = r14
        L120:
            if (r6 == 0) goto L129
            androidx.constraintlayout.motion.widget.c r6 = r6.l
            if (r6 == 0) goto L129
            int r6 = r6.C
            goto L12a
        L129:
            r6 = r13
        L12a:
            jo6 r10 = r1.b
            if (r10 != 0) goto L13b
            jo6 r10 = new jo6
            r10.<init>()
            r11 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            r10.a = r11
            r10.i = r13
            r1.b = r10
        L13b:
            jo6 r10 = r1.b
            r1.c = r10
            double r11 = (double) r3
            r10.c = r11
            double r11 = (double) r7
            r10.a = r11
            r10.e = r2
            double r1 = (double) r5
            r10.b = r1
            r10.g = r4
            r10.h = r9
            r10.i = r6
            r10.d = r14
        L152:
            int r1 = r0.u0
            r0.F0 = r3
            r0.u0 = r1
            r0.q0 = r8
        L15a:
            r0.G0 = r13
            long r1 = r0.getNanoTime()
            r0.A0 = r1
            r0.invalidate()
            return
    }

    public final void z(int r15) {
            r14 = this;
            boolean r0 = r14.isAttachedToWindow()
            if (r0 != 0) goto L16
            androidx.constraintlayout.motion.widget.a r0 = r14.j1
            if (r0 != 0) goto L11
            androidx.constraintlayout.motion.widget.a r0 = new androidx.constraintlayout.motion.widget.a
            r0.<init>(r14)
            r14.j1 = r0
        L11:
            androidx.constraintlayout.motion.widget.a r14 = r14.j1
            r14.d = r15
            return
        L16:
            androidx.constraintlayout.motion.widget.b r0 = r14.p0
            r1 = -1
            r2 = 0
            if (r0 == 0) goto L4f
            zb r0 = r0.b
            if (r0 == 0) goto L4f
            int r3 = r14.u0
            java.lang.Object r0 = r0.L
            android.util.SparseArray r0 = (android.util.SparseArray) r0
            java.lang.Object r0 = r0.get(r15)
            iq6 r0 = (defpackage.iq6) r0
            if (r0 != 0) goto L30
            r3 = r15
            goto L4c
        L30:
            java.util.ArrayList r4 = r0.b
            int r0 = r0.c
            if (r0 != r3) goto L37
            goto L4c
        L37:
            int r5 = r4.size()
            r6 = r2
        L3c:
            if (r6 >= r5) goto L4b
            java.lang.Object r7 = r4.get(r6)
            int r6 = r6 + 1
            jq6 r7 = (defpackage.jq6) r7
            int r7 = r7.e
            if (r3 != r7) goto L3c
            goto L4c
        L4b:
            r3 = r0
        L4c:
            if (r3 == r1) goto L4f
            r15 = r3
        L4f:
            int r0 = r14.u0
            if (r0 != r15) goto L54
            return
        L54:
            int r3 = r14.t0
            r4 = 0
            if (r3 != r15) goto L5d
            r14.p(r4)
            return
        L5d:
            int r3 = r14.v0
            r5 = 1065353216(0x3f800000, float:1.0)
            if (r3 != r15) goto L67
            r14.p(r5)
            return
        L67:
            r14.v0 = r15
            r3 = 0
            if (r0 == r1) goto L7a
            r14.x(r0, r15)
            r14.p(r5)
            r14.D0 = r4
            r14.p(r5)
            r14.k1 = r3
            return
        L7a:
            r14.K0 = r2
            r14.F0 = r5
            r14.C0 = r4
            r14.D0 = r4
            long r6 = r14.getNanoTime()
            r14.E0 = r6
            long r6 = r14.getNanoTime()
            r14.A0 = r6
            r14.G0 = r2
            r14.q0 = r3
            androidx.constraintlayout.motion.widget.b r0 = r14.p0
            b84 r6 = r0.c
            if (r6 == 0) goto L9b
            int r6 = r6.h
            goto L9d
        L9b:
            int r6 = r0.j
        L9d:
            float r6 = (float) r6
            r7 = 1148846080(0x447a0000, float:1000.0)
            float r6 = r6 / r7
            r14.B0 = r6
            r14.t0 = r1
            int r6 = r14.v0
            r0.m(r1, r6)
            android.util.SparseArray r0 = new android.util.SparseArray
            r0.<init>()
            int r1 = r14.getChildCount()
            java.util.HashMap r6 = r14.z0
            r6.clear()
            r7 = r2
        Lb9:
            if (r7 >= r1) goto Ld7
            android.view.View r8 = r14.getChildAt(r7)
            m74 r9 = new m74
            r9.<init>(r8)
            r6.put(r8, r9)
            int r9 = r8.getId()
            java.lang.Object r8 = r6.get(r8)
            m74 r8 = (defpackage.m74) r8
            r0.put(r9, r8)
            int r7 = r7 + 1
            goto Lb9
        Ld7:
            r0 = 1
            r14.H0 = r0
            androidx.constraintlayout.motion.widget.b r7 = r14.p0
            z11 r15 = r7.b(r15)
            w74 r7 = r14.o1
            r7.e(r3, r15)
            r14.v()
            r7.a()
            int r15 = r14.getChildCount()
            r3 = r2
        Lf0:
            if (r3 >= r15) goto L186
            android.view.View r7 = r14.getChildAt(r3)
            java.lang.Object r8 = r6.get(r7)
            m74 r8 = (defpackage.m74) r8
            if (r8 != 0) goto L100
            goto L182
        L100:
            y74 r9 = r8.f
            r9.L = r4
            r9.R = r4
            float r10 = r7.getX()
            float r11 = r7.getY()
            int r12 = r7.getWidth()
            float r12 = (float) r12
            int r13 = r7.getHeight()
            float r13 = (float) r13
            r9.d(r10, r11, r12, r13)
            k74 r8 = r8.h
            r8.getClass()
            r7.getX()
            r7.getY()
            r7.getWidth()
            r7.getHeight()
            int r9 = r7.getVisibility()
            r8.L = r9
            int r9 = r7.getVisibility()
            if (r9 == 0) goto L13a
            r9 = r4
            goto L13e
        L13a:
            float r9 = r7.getAlpha()
        L13e:
            r8.X = r9
            float r9 = r7.getElevation()
            r8.Y = r9
            float r9 = r7.getRotation()
            r8.Z = r9
            float r9 = r7.getRotationX()
            r8.d0 = r9
            float r9 = r7.getRotationY()
            r8.A = r9
            float r9 = r7.getScaleX()
            r8.e0 = r9
            float r9 = r7.getScaleY()
            r8.f0 = r9
            float r9 = r7.getPivotX()
            r8.g0 = r9
            float r9 = r7.getPivotY()
            r8.h0 = r9
            float r9 = r7.getTranslationX()
            r8.i0 = r9
            float r9 = r7.getTranslationY()
            r8.j0 = r9
            float r7 = r7.getTranslationZ()
            r8.k0 = r7
        L182:
            int r3 = r3 + 1
            goto Lf0
        L186:
            int r15 = r14.getWidth()
            int r3 = r14.getHeight()
            r7 = r2
        L18f:
            if (r7 >= r1) goto L1ad
            android.view.View r8 = r14.getChildAt(r7)
            java.lang.Object r8 = r6.get(r8)
            m74 r8 = (defpackage.m74) r8
            if (r8 != 0) goto L19e
            goto L1aa
        L19e:
            androidx.constraintlayout.motion.widget.b r9 = r14.p0
            r9.e(r8)
            long r9 = r14.getNanoTime()
            r8.g(r9, r15, r3)
        L1aa:
            int r7 = r7 + 1
            goto L18f
        L1ad:
            androidx.constraintlayout.motion.widget.b r15 = r14.p0
            b84 r15 = r15.c
            if (r15 == 0) goto L1b6
            float r15 = r15.i
            goto L1b7
        L1b6:
            r15 = r4
        L1b7:
            int r3 = (r15 > r4 ? 1 : (r15 == r4 ? 0 : -1))
            if (r3 == 0) goto L205
            r3 = 2139095039(0x7f7fffff, float:3.4028235E38)
            r7 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r8 = r2
        L1c2:
            if (r8 >= r1) goto L1e0
            android.view.View r9 = r14.getChildAt(r8)
            java.lang.Object r9 = r6.get(r9)
            m74 r9 = (defpackage.m74) r9
            y74 r9 = r9.g
            float r10 = r9.X
            float r9 = r9.Y
            float r9 = r9 + r10
            float r3 = java.lang.Math.min(r3, r9)
            float r7 = java.lang.Math.max(r7, r9)
            int r8 = r8 + 1
            goto L1c2
        L1e0:
            if (r2 >= r1) goto L205
            android.view.View r8 = r14.getChildAt(r2)
            java.lang.Object r8 = r6.get(r8)
            m74 r8 = (defpackage.m74) r8
            y74 r9 = r8.g
            float r10 = r9.X
            float r9 = r9.Y
            float r11 = r5 - r15
            float r11 = r5 / r11
            r8.n = r11
            float r10 = r10 + r9
            float r10 = r10 - r3
            float r10 = r10 * r15
            float r9 = r7 - r3
            float r10 = r10 / r9
            float r9 = r15 - r10
            r8.m = r9
            int r2 = r2 + 1
            goto L1e0
        L205:
            r14.C0 = r4
            r14.D0 = r4
            r14.H0 = r0
            r14.invalidate()
            return
    }
}

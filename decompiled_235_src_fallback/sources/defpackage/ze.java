package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ze  reason: default package */
/* loaded from: classes.dex */
public final class ze extends defpackage.b2 implements android.view.View.OnAttachStateChangeListener, android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener, android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener {
    public static final defpackage.o94 J0 = null;
    public final java.lang.String A0;
    public final defpackage.m44 B0;
    public final defpackage.p94 C0;
    public defpackage.ya6 D0;
    public boolean E0;
    public final defpackage.n94 F0;
    public final defpackage.n0 G0;
    public final java.util.ArrayList H0;
    public final defpackage.ye I0;
    public final defpackage.te R;
    public int X;
    public final defpackage.ye Y;
    public final android.view.accessibility.AccessibilityManager Z;
    public long d0;
    public java.util.List e0;
    public final defpackage.ue f0;
    public int g0;
    public int h0;
    public defpackage.v2 i0;
    public defpackage.v2 j0;
    public boolean k0;
    public final defpackage.p94 l0;
    public final defpackage.p94 m0;
    public final defpackage.un6 n0;
    public final defpackage.un6 o0;
    public int p0;
    public java.lang.Integer q0;
    public final defpackage.zu r0;
    public final defpackage.v80 s0;
    public boolean t0;
    public defpackage.ve u0;
    public defpackage.p94 v0;
    public final defpackage.q94 w0;
    public final defpackage.n94 x0;
    public final defpackage.n94 y0;
    public final java.lang.String z0;

    static {
            r0 = 32
            int[] r1 = new int[r0]
            r1 = {x0034: FILL_ARRAY_DATA  , data: [2131427345, 2131427346, 2131427357, 2131427368, 2131427371, 2131427372, 2131427373, 2131427374, 2131427375, 2131427376, 2131427347, 2131427348, 2131427349, 2131427350, 2131427351, 2131427352, 2131427353, 2131427354, 2131427355, 2131427356, 2131427358, 2131427359, 2131427360, 2131427361, 2131427362, 2131427363, 2131427364, 2131427365, 2131427366, 2131427367, 2131427369, 2131427370} // fill-array
            o94 r2 = defpackage.f93.a
            o94 r2 = new o94
            r2.<init>(r0)
            int r3 = r2.b
            if (r3 < 0) goto L2e
            int r4 = r3 + 32
            r2.b(r4)
            int[] r5 = r2.a
            int r6 = r2.b
            if (r3 == r6) goto L20
            defpackage.fv.r0(r4, r3, r6, r5, r5)
        L20:
            r4 = 0
            r6 = 12
            defpackage.fv.v0(r3, r4, r6, r1, r5)
            int r1 = r2.b
            int r1 = r1 + r0
            r2.b = r1
            defpackage.ze.J0 = r2
            return
        L2e:
            java.lang.String r0 = ""
            defpackage.e41.q(r0)
            return
    }

    public ze(defpackage.te r6) {
            r5 = this;
            r5.<init>()
            r5.R = r6
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r5.X = r0
            ye r1 = new ye
            r2 = 0
            r1.<init>(r5, r2)
            r5.Y = r1
            android.content.Context r1 = r6.getContext()
            java.lang.String r3 = "accessibility"
            java.lang.Object r1 = r1.getSystemService(r3)
            r1.getClass()
            android.view.accessibility.AccessibilityManager r1 = (android.view.accessibility.AccessibilityManager) r1
            r5.Z = r1
            r3 = 100
            r5.d0 = r3
            android.os.Handler r1 = new android.os.Handler
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            r1.<init>(r3)
            ue r1 = new ue
            r1.<init>(r5, r2)
            r5.f0 = r1
            r5.g0 = r0
            r5.h0 = r0
            p94 r0 = new p94
            r0.<init>()
            r5.l0 = r0
            p94 r0 = new p94
            r0.<init>()
            r5.m0 = r0
            un6 r0 = new un6
            r0.<init>(r2)
            r5.n0 = r0
            un6 r0 = new un6
            r0.<init>(r2)
            r5.o0 = r0
            r0 = -1
            r5.p0 = r0
            zu r0 = new zu
            r0.<init>(r2)
            r5.r0 = r0
            r0 = 6
            r1 = 1
            r3 = 0
            v80 r0 = defpackage.nb3.c(r1, r3, r3, r0)
            r5.s0 = r0
            r5.t0 = r1
            p94 r0 = defpackage.h93.a
            r0.getClass()
            r5.v0 = r0
            q94 r3 = new q94
            r3.<init>()
            r5.w0 = r3
            n94 r3 = new n94
            r3.<init>()
            r5.x0 = r3
            n94 r3 = new n94
            r3.<init>()
            r5.y0 = r3
            java.lang.String r3 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL"
            r5.z0 = r3
            java.lang.String r3 = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL"
            r5.A0 = r3
            m44 r3 = new m44
            r4 = 28
            r3.<init>(r4, r2)
            r5.B0 = r3
            p94 r2 = new p94
            r2.<init>()
            r5.C0 = r2
            ya6 r2 = new ya6
            ab6 r3 = r6.getSemanticsOwner()
            xa6 r3 = r3.a()
            r2.<init>(r3, r0)
            r5.D0 = r2
            int r0 = defpackage.c93.a
            n94 r0 = new n94
            r0.<init>()
            r5.F0 = r0
            r6.addOnAttachStateChangeListener(r5)
            n0 r6 = new n0
            r0 = 2
            r6.<init>(r5, r0)
            r5.G0 = r6
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5.H0 = r6
            ye r6 = new ye
            r6.<init>(r5, r1)
            r5.I0 = r6
            return
    }

    public static /* synthetic */ void E(defpackage.ze r1, int r2, int r3, java.lang.Integer r4, int r5) {
            r5 = r5 & 4
            r0 = 0
            if (r5 == 0) goto L6
            r4 = r0
        L6:
            r1.D(r2, r3, r4, r0)
            return
    }

    public static android.graphics.Rect L(defpackage.mp2 r4, float r5, float r6) {
            boolean r0 = r4 instanceof defpackage.qo4
            if (r0 != 0) goto Lb
            boolean r0 = r4 instanceof defpackage.ro4
            if (r0 == 0) goto L9
            goto Lb
        L9:
            r4 = 0
            return r4
        Lb:
            of5 r4 = r4.z()
            android.graphics.Rect r0 = new android.graphics.Rect
            float r1 = r4.a
            float r1 = r1 + r5
            int r1 = (int) r1
            float r2 = r4.b
            float r2 = r2 + r6
            int r2 = (int) r2
            float r3 = r4.c
            float r3 = r3 + r5
            int r5 = (int) r3
            float r4 = r4.d
            float r4 = r4 + r6
            int r4 = (int) r4
            r0.<init>(r1, r2, r5, r4)
            return r0
    }

    public static float[] N(defpackage.mp2 r13) {
            boolean r0 = r13 instanceof defpackage.ro4
            if (r0 == 0) goto L68
            ro4 r13 = (defpackage.ro4) r13
            u16 r13 = r13.f
            long r0 = r13.h
            long r2 = r13.g
            long r4 = r13.f
            long r6 = r13.e
            r13 = 32
            long r8 = r6 >> r13
            int r8 = (int) r8
            float r8 = java.lang.Float.intBitsToFloat(r8)
            r9 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r6 = r6 & r9
            int r6 = (int) r6
            float r6 = java.lang.Float.intBitsToFloat(r6)
            long r11 = r4 >> r13
            int r7 = (int) r11
            float r7 = java.lang.Float.intBitsToFloat(r7)
            long r4 = r4 & r9
            int r4 = (int) r4
            float r4 = java.lang.Float.intBitsToFloat(r4)
            long r11 = r2 >> r13
            int r5 = (int) r11
            float r5 = java.lang.Float.intBitsToFloat(r5)
            long r2 = r2 & r9
            int r2 = (int) r2
            float r2 = java.lang.Float.intBitsToFloat(r2)
            long r11 = r0 >> r13
            int r13 = (int) r11
            float r13 = java.lang.Float.intBitsToFloat(r13)
            long r0 = r0 & r9
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r1 = 8
            float[] r1 = new float[r1]
            r3 = 0
            r1[r3] = r8
            r3 = 1
            r1[r3] = r6
            r3 = 2
            r1[r3] = r7
            r3 = 3
            r1[r3] = r4
            r3 = 4
            r1[r3] = r5
            r3 = 5
            r1[r3] = r2
            r2 = 6
            r1[r2] = r13
            r13 = 7
            r1[r13] = r0
            return r1
        L68:
            r13 = 0
            return r13
    }

    public static android.graphics.Region O(defpackage.mp2 r8, float r9, float r10) {
            boolean r0 = r8 instanceof defpackage.po4
            r1 = 0
            if (r0 == 0) goto L43
            android.graphics.Region r0 = new android.graphics.Region
            po4 r8 = (defpackage.po4) r8
            of5 r2 = r8.z()
            of5 r2 = r2.h(r9, r10)
            android.graphics.Rect r3 = new android.graphics.Rect
            float r4 = r2.a
            r5 = 0
            float r4 = r4 + r5
            int r4 = (int) r4
            float r6 = r2.b
            float r6 = r6 + r5
            int r6 = (int) r6
            float r7 = r2.c
            float r7 = r7 + r5
            int r7 = (int) r7
            float r2 = r2.d
            float r2 = r2 + r5
            int r2 = (int) r2
            r3.<init>(r4, r6, r7, r2)
            r0.<init>(r3)
            android.graphics.Region r2 = new android.graphics.Region
            r2.<init>()
            hj r8 = r8.f
            boolean r3 = r8 instanceof defpackage.hj
            if (r3 == 0) goto L3e
            android.graphics.Path r8 = r8.a
            r8.offset(r9, r10)
            r2.setPath(r8, r0)
            return r2
        L3e:
            java.lang.String r8 = "Unable to obtain android.graphics.Path"
            defpackage.fa6.h(r8)
        L43:
            return r1
    }

    public static java.lang.CharSequence P(java.lang.CharSequence r3) {
            int r0 = r3.length()
            if (r0 != 0) goto L7
            goto L10
        L7:
            int r0 = r3.length()
            r1 = 100000(0x186a0, float:1.4013E-40)
            if (r0 > r1) goto L11
        L10:
            return r3
        L11:
            r0 = 99999(0x1869f, float:1.40128E-40)
            char r2 = r3.charAt(r0)
            boolean r2 = java.lang.Character.isHighSurrogate(r2)
            if (r2 == 0) goto L29
            char r2 = r3.charAt(r1)
            boolean r2 = java.lang.Character.isLowSurrogate(r2)
            if (r2 == 0) goto L29
            r1 = r0
        L29:
            r0 = 0
            java.lang.CharSequence r3 = r3.subSequence(r0, r1)
            r3.getClass()
            return r3
    }

    public static java.lang.String t(defpackage.xa6 r4) {
            r0 = 0
            if (r4 != 0) goto L4
            goto L4d
        L4:
            ta6 r4 = r4.d
            ja4 r1 = r4.A
            fb6 r2 = defpackage.bb6.a
            boolean r3 = r1.c(r2)
            if (r3 == 0) goto L1f
            java.lang.Object r4 = r4.c(r2)
            java.util.List r4 = (java.util.List) r4
            java.lang.String r1 = ","
            r2 = 62
            java.lang.String r4 = defpackage.ex3.a(r2, r0, r1, r4)
            return r4
        L1f:
            fb6 r4 = defpackage.bb6.G
            boolean r2 = r1.c(r4)
            if (r2 == 0) goto L35
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L2e
            r4 = r0
        L2e:
            fp r4 = (defpackage.fp) r4
            if (r4 == 0) goto L4d
            java.lang.String r4 = r4.B
            return r4
        L35:
            fb6 r4 = defpackage.bb6.C
            java.lang.Object r4 = r1.g(r4)
            if (r4 != 0) goto L3e
            r4 = r0
        L3e:
            java.util.List r4 = (java.util.List) r4
            if (r4 == 0) goto L4d
            java.lang.Object r4 = defpackage.gt0.J0(r4)
            fp r4 = (defpackage.fp) r4
            if (r4 == 0) goto L4d
            java.lang.String r4 = r4.B
            return r4
        L4d:
            return r0
    }

    public static final boolean x(defpackage.e76 r3, float r4) {
            on2 r0 = r3.a
            r1 = 0
            int r2 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r2 >= 0) goto L15
            java.lang.Object r2 = r0.c()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r2 > r1 ? 1 : (r2 == r1 ? 0 : -1))
            if (r2 > 0) goto L33
        L15:
            int r4 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r4 <= 0) goto L35
            java.lang.Object r4 = r0.c()
            java.lang.Number r4 = (java.lang.Number) r4
            float r4 = r4.floatValue()
            on2 r3 = r3.b
            java.lang.Object r3 = r3.c()
            java.lang.Number r3 = (java.lang.Number) r3
            float r3 = r3.floatValue()
            int r3 = (r4 > r3 ? 1 : (r4 == r3 ? 0 : -1))
            if (r3 >= 0) goto L35
        L33:
            r3 = 1
            return r3
        L35:
            r3 = 0
            return r3
    }

    public static final boolean y(defpackage.e76 r3) {
            on2 r0 = r3.a
            java.lang.Object r1 = r0.c()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            r2 = 0
            int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r1 <= 0) goto L13
            r3 = 1
            return r3
        L13:
            java.lang.Object r0 = r0.c()
            java.lang.Number r0 = (java.lang.Number) r0
            r0.floatValue()
            on2 r3 = r3.b
            java.lang.Object r3 = r3.c()
            java.lang.Number r3 = (java.lang.Number) r3
            r3.floatValue()
            r3 = 0
            return r3
    }

    public static final boolean z(defpackage.e76 r2) {
            on2 r0 = r2.a
            java.lang.Object r1 = r0.c()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            on2 r2 = r2.b
            java.lang.Object r2 = r2.c()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
            if (r2 >= 0) goto L1e
            r2 = 1
            return r2
        L1e:
            java.lang.Object r2 = r0.c()
            java.lang.Number r2 = (java.lang.Number) r2
            r2.floatValue()
            r2 = 0
            return r2
    }

    public final int A(int r1) {
            r0 = this;
            te r0 = r0.R
            ab6 r0 = r0.getSemanticsOwner()
            xa6 r0 = r0.a()
            int r0 = r0.f
            if (r1 != r0) goto L10
            r0 = -1
            return r0
        L10:
            return r1
    }

    public final void B(defpackage.xa6 r20, defpackage.ya6 r21) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r21
            int[] r3 = defpackage.p93.a
            q94 r3 = new q94
            r3.<init>()
            r4 = 4
            java.util.List r5 = defpackage.xa6.j(r4, r1)
            sm3 r6 = r1.c
            int r7 = r5.size()
            r8 = 0
            r9 = r8
        L1a:
            if (r9 >= r7) goto L40
            java.lang.Object r10 = r5.get(r9)
            xa6 r10 = (defpackage.xa6) r10
            g93 r11 = r0.s()
            int r10 = r10.f
            boolean r11 = r11.a(r10)
            if (r11 == 0) goto L3d
            q94 r11 = r2.b
            boolean r11 = r11.c(r10)
            if (r11 != 0) goto L3a
            r0.w(r6)
            return
        L3a:
            r3.a(r10)
        L3d:
            int r9 = r9 + 1
            goto L1a
        L40:
            q94 r2 = r2.b
            int[] r5 = r2.b
            long[] r2 = r2.a
            int r7 = r2.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L8b
            r9 = r8
        L4c:
            r10 = r2[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L86
            int r12 = r9 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = r8
        L66:
            if (r14 >= r12) goto L84
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L80
            int r15 = r9 << 3
            int r15 = r15 + r14
            r15 = r5[r15]
            boolean r15 = r3.c(r15)
            if (r15 != 0) goto L80
            r0.w(r6)
            return
        L80:
            long r10 = r10 >> r13
            int r14 = r14 + 1
            goto L66
        L84:
            if (r12 != r13) goto L8b
        L86:
            if (r9 == r7) goto L8b
            int r9 = r9 + 1
            goto L4c
        L8b:
            java.util.List r1 = defpackage.xa6.j(r4, r1)
            int r2 = r1.size()
        L93:
            if (r8 >= r2) goto Lb9
            java.lang.Object r3 = r1.get(r8)
            xa6 r3 = (defpackage.xa6) r3
            p94 r4 = r0.C0
            int r5 = r3.f
            java.lang.Object r4 = r4.b(r5)
            ya6 r4 = (defpackage.ya6) r4
            if (r4 == 0) goto Lb6
            g93 r5 = r0.s()
            int r6 = r3.f
            boolean r5 = r5.a(r6)
            if (r5 == 0) goto Lb6
            r0.B(r3, r4)
        Lb6:
            int r8 = r8 + 1
            goto L93
        Lb9:
            return
    }

    public final boolean C(android.view.accessibility.AccessibilityEvent r4) {
            r3 = this;
            boolean r0 = r3.v()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            int r0 = r4.getEventType()
            r2 = 2048(0x800, float:2.87E-42)
            if (r0 == r2) goto L19
            int r0 = r4.getEventType()
            r2 = 32768(0x8000, float:4.5918E-41)
            if (r0 != r2) goto L1c
        L19:
            r0 = 1
            r3.k0 = r0
        L1c:
            ye r0 = r3.Y     // Catch: java.lang.Throwable -> L2b
            java.lang.Object r4 = r0.g(r4)     // Catch: java.lang.Throwable -> L2b
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L2b
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L2b
            r3.k0 = r1
            return r4
        L2b:
            r4 = move-exception
            r3.k0 = r1
            throw r4
    }

    public final boolean D(int r2, int r3, java.lang.Integer r4, java.util.List r5) {
            r1 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r2 == r0) goto L2b
            boolean r0 = r1.v()
            if (r0 != 0) goto Lb
            goto L2b
        Lb:
            android.view.accessibility.AccessibilityEvent r2 = r1.o(r2, r3)
            if (r4 == 0) goto L18
            int r3 = r4.intValue()
            r2.setContentChangeTypes(r3)
        L18:
            if (r5 == 0) goto L26
            r3 = 0
            r4 = 62
            java.lang.String r0 = ","
            java.lang.String r3 = defpackage.ex3.a(r4, r3, r0, r5)
            r2.setContentDescription(r3)
        L26:
            boolean r1 = r1.C(r2)
            return r1
        L2b:
            r1 = 0
            return r1
    }

    public final void F(int r2, int r3, java.lang.String r4) {
            r1 = this;
            int r2 = r1.A(r2)
            r0 = 32
            android.view.accessibility.AccessibilityEvent r2 = r1.o(r2, r0)
            r2.setContentChangeTypes(r3)
            if (r4 == 0) goto L16
            java.util.List r3 = r2.getText()
            r3.add(r4)
        L16:
            r1.C(r2)
            return
    }

    public final void G(int r7) {
            r6 = this;
            ve r0 = r6.u0
            if (r0 == 0) goto L46
            xa6 r1 = r0.a
            int r2 = r1.f
            if (r7 == r2) goto Lb
            return
        Lb:
            long r2 = android.os.SystemClock.uptimeMillis()
            long r4 = r0.f
            long r2 = r2 - r4
            r4 = 1000(0x3e8, double:4.94E-321)
            int r7 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r7 > 0) goto L46
            int r7 = r1.f
            int r7 = r6.A(r7)
            r2 = 131072(0x20000, float:1.83671E-40)
            android.view.accessibility.AccessibilityEvent r7 = r6.o(r7, r2)
            int r2 = r0.d
            r7.setFromIndex(r2)
            int r2 = r0.e
            r7.setToIndex(r2)
            int r2 = r0.b
            r7.setAction(r2)
            int r0 = r0.c
            r7.setMovementGranularity(r0)
            java.util.List r0 = r7.getText()
            java.lang.String r1 = t(r1)
            r0.add(r1)
            r6.C(r7)
        L46:
            r7 = 0
            r6.u0 = r7
            return
    }

    public final void H(defpackage.g93 r57) {
            r56 = this;
            r0 = r56
            r6 = r57
            r1 = 64
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            java.util.ArrayList r8 = new java.util.ArrayList
            java.util.ArrayList r9 = r0.H0
            r8.<init>(r9)
            r9.clear()
            int[] r10 = r6.b
            long[] r11 = r6.a
            int r1 = r11.length
            r12 = 2
            int r13 = r1 + (-2)
            r14 = 0
            java.lang.Integer r2 = java.lang.Integer.valueOf(r14)
            if (r13 < 0) goto L66d
            r15 = r14
        L24:
            r3 = r11[r15]
            r16 = r12
            r17 = r13
            long r12 = ~r3
            r18 = 7
            long r12 = r12 << r18
            long r12 = r12 & r3
            r19 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r19
            int r1 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r1 == 0) goto L64c
            int r1 = r15 - r17
            int r1 = ~r1
            int r1 = r1 >>> 31
            r12 = 8
            int r13 = 8 - r1
            r21 = r3
            r1 = r14
        L47:
            if (r1 >= r13) goto L636
            r23 = 255(0xff, double:1.26E-321)
            long r3 = r21 & r23
            r25 = 128(0x80, double:6.3E-322)
            int r3 = (r3 > r25 ? 1 : (r3 == r25 ? 0 : -1))
            if (r3 >= 0) goto L60e
            int r3 = r15 << 3
            int r3 = r3 + r1
            r3 = r10[r3]
            p94 r4 = r0.C0
            java.lang.Object r4 = r4.b(r3)
            ya6 r4 = (defpackage.ya6) r4
            if (r4 != 0) goto L64
            goto L60e
        L64:
            ta6 r4 = r4.a
            ja4 r5 = r4.A
            java.lang.Object r27 = r6.b(r3)
            r14 = r27
            za6 r14 = (defpackage.za6) r14
            r27 = r12
            if (r14 == 0) goto L77
            xa6 r14 = r14.a
            goto L78
        L77:
            r14 = 0
        L78:
            if (r14 == 0) goto L607
            sm3 r12 = r14.c
            ta6 r6 = r14.d
            r29 = r10
            int r10 = r14.f
            r30 = r11
            ja4 r11 = r6.A
            r31 = r15
            java.lang.Object[] r15 = r11.b
            r32 = r15
            java.lang.Object[] r15 = r11.c
            r33 = r15
            long[] r15 = r11.a
            r34 = r1
            int r1 = r15.length
            int r1 = r1 + (-2)
            r35 = r15
            if (r1 < 0) goto L5bd
            r40 = r12
            r39 = r13
            r15 = 0
            r38 = 0
        La2:
            r12 = r35[r15]
            r41 = r14
            r42 = r15
            long r14 = ~r12
            long r14 = r14 << r18
            long r14 = r14 & r12
            long r14 = r14 & r19
            int r14 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r14 == 0) goto L597
            int r15 = r42 - r1
            int r14 = ~r15
            int r14 = r14 >>> 31
            int r14 = 8 - r14
            r15 = 0
        Lba:
            if (r15 >= r14) goto L581
            long r43 = r12 & r23
            int r43 = (r43 > r25 ? 1 : (r43 == r25 ? 0 : -1))
            if (r43 >= 0) goto L554
            int r43 = r42 << 3
            int r43 = r43 + r15
            r44 = r32[r43]
            r45 = r1
            r1 = r33[r43]
            r43 = r4
            r4 = r44
            fb6 r4 = (defpackage.fb6) r4
            r46 = r12
            fb6 r12 = defpackage.bb6.v
            boolean r13 = defpackage.nb3.k(r4, r12)
            if (r13 != 0) goto Le9
            fb6 r13 = defpackage.bb6.w
            boolean r13 = defpackage.nb3.k(r4, r13)
            if (r13 == 0) goto Le5
            goto Le9
        Le5:
            r44 = r15
            r15 = 0
            goto L11a
        Le9:
            int r13 = r8.size()
            r44 = r15
            r15 = 0
        Lf0:
            if (r15 >= r13) goto L10c
            java.lang.Object r48 = r8.get(r15)
            r49 = r13
            r13 = r48
            o76 r13 = (defpackage.o76) r13
            int r13 = r13.A
            if (r13 != r3) goto L107
            java.lang.Object r13 = r8.get(r15)
            o76 r13 = (defpackage.o76) r13
            goto L10d
        L107:
            int r15 = r15 + 1
            r13 = r49
            goto Lf0
        L10c:
            r13 = 0
        L10d:
            if (r13 == 0) goto L111
            r15 = 0
            goto L117
        L111:
            o76 r13 = new o76
            r13.<init>(r3, r9)
            r15 = 1
        L117:
            r9.add(r13)
        L11a:
            if (r15 != 0) goto L13a
            java.lang.Object r13 = r5.g(r4)
            if (r13 != 0) goto L123
            r13 = 0
        L123:
            boolean r13 = defpackage.nb3.k(r1, r13)
            if (r13 == 0) goto L13a
        L129:
            r13 = r3
            r53 = r7
            r48 = r8
            r28 = r14
            r15 = r40
            r7 = r45
            r3 = 0
            r12 = 1
            r8 = r2
            r14 = r5
            goto L551
        L13a:
            fb6 r13 = defpackage.bb6.d
            boolean r15 = defpackage.nb3.k(r4, r13)
            if (r15 == 0) goto L153
            r1.getClass()
            java.lang.String r1 = (java.lang.String) r1
            boolean r4 = r5.c(r13)
            r13 = r27
            if (r4 == 0) goto L129
            r0.F(r3, r13, r1)
            goto L129
        L153:
            r13 = r27
            fb6 r15 = defpackage.bb6.b
            boolean r15 = defpackage.nb3.k(r4, r15)
            if (r15 == 0) goto L16e
            int r1 = r0.A(r3)
            r15 = 2048(0x800, float:2.87E-42)
            E(r0, r1, r15, r7, r13)
            int r1 = r0.A(r3)
            E(r0, r1, r15, r2, r13)
            goto L129
        L16e:
            r15 = 2048(0x800, float:2.87E-42)
            fb6 r13 = defpackage.bb6.K
            boolean r13 = defpackage.nb3.k(r4, r13)
            if (r13 == 0) goto L18f
            int r1 = r0.A(r3)
            r4 = 8192(0x2000, float:1.148E-41)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13 = 8
            E(r0, r1, r15, r4, r13)
            int r1 = r0.A(r3)
            E(r0, r1, r15, r2, r13)
            goto L129
        L18f:
            fb6 r13 = defpackage.bb6.M
            boolean r13 = defpackage.nb3.k(r4, r13)
            if (r13 == 0) goto L1a7
            int r1 = r0.A(r3)
            r4 = 3072(0xc00, float:4.305E-42)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r13 = 8
            E(r0, r1, r15, r4, r13)
            goto L129
        L1a7:
            fb6 r13 = defpackage.bb6.c
            boolean r13 = defpackage.nb3.k(r4, r13)
            if (r13 == 0) goto L1c1
            int r1 = r0.A(r3)
            r13 = 8
            E(r0, r1, r15, r7, r13)
            int r1 = r0.A(r3)
            E(r0, r1, r15, r2, r13)
            goto L129
        L1c1:
            fb6 r13 = defpackage.bb6.J
            boolean r15 = defpackage.nb3.k(r4, r13)
            r48 = r8
            r8 = 4
            if (r15 == 0) goto L287
            fb6 r1 = defpackage.bb6.z
            java.lang.Object r1 = r11.g(r1)
            if (r1 != 0) goto L1d5
            r1 = 0
        L1d5:
            mq5 r1 = (defpackage.mq5) r1
            if (r1 != 0) goto L1e4
        L1d9:
            r28 = r14
            r15 = r40
            r4 = 8
            r12 = 0
            r13 = 2048(0x800, float:2.87E-42)
            goto L26f
        L1e4:
            int r1 = r1.a
            if (r1 != r8) goto L1d9
            java.lang.Object r1 = r11.g(r13)
            if (r1 != 0) goto L1ef
            r1 = 0
        L1ef:
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            boolean r1 = defpackage.nb3.k(r1, r4)
            if (r1 == 0) goto L25e
            int r1 = r0.A(r3)
            android.view.accessibility.AccessibilityEvent r1 = r0.o(r1, r8)
            xa6 r4 = new xa6
            r13 = r41
            z64 r8 = r13.a
            r15 = r40
            r12 = 1
            r4.<init>(r8, r12, r15, r6)
            ta6 r8 = r4.k()
            fb6 r12 = defpackage.bb6.a
            ja4 r8 = r8.A
            java.lang.Object r8 = r8.g(r12)
            if (r8 != 0) goto L21a
            r8 = 0
        L21a:
            java.util.List r8 = (java.util.List) r8
            r12 = 62
            r40 = r4
            java.lang.String r4 = ","
            r41 = r13
            r13 = 0
            if (r8 == 0) goto L22c
            java.lang.String r8 = defpackage.ex3.a(r12, r13, r4, r8)
            r13 = r8
        L22c:
            ta6 r8 = r40.k()
            fb6 r12 = defpackage.bb6.C
            ja4 r8 = r8.A
            java.lang.Object r8 = r8.g(r12)
            if (r8 != 0) goto L23b
            r8 = 0
        L23b:
            java.util.List r8 = (java.util.List) r8
            r28 = r14
            r12 = 0
            if (r8 == 0) goto L249
            r14 = 62
            java.lang.String r4 = defpackage.ex3.a(r14, r12, r4, r8)
            goto L24a
        L249:
            r4 = r12
        L24a:
            if (r13 == 0) goto L24f
            r1.setContentDescription(r13)
        L24f:
            if (r4 == 0) goto L258
            java.util.List r8 = r1.getText()
            r8.add(r4)
        L258:
            r0.C(r1)
            r13 = 2048(0x800, float:2.87E-42)
            goto L27d
        L25e:
            r28 = r14
            r15 = r40
            r12 = 0
            int r1 = r0.A(r3)
            r4 = 8
            r13 = 2048(0x800, float:2.87E-42)
            E(r0, r1, r13, r2, r4)
            goto L27d
        L26f:
            int r1 = r0.A(r3)
            E(r0, r1, r13, r7, r4)
            int r1 = r0.A(r3)
            E(r0, r1, r13, r2, r4)
        L27d:
            r8 = r2
            r13 = r3
            r14 = r5
            r53 = r7
        L282:
            r7 = r45
        L284:
            r3 = 0
            goto L53c
        L287:
            r36 = r8
            r28 = r14
            r15 = r40
            r13 = 2048(0x800, float:2.87E-42)
            r14 = 0
            fb6 r8 = defpackage.bb6.a
            boolean r8 = defpackage.nb3.k(r4, r8)
            if (r8 == 0) goto L2a9
            int r4 = r0.A(r3)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r36)
            r1.getClass()
            java.util.List r1 = (java.util.List) r1
            r0.D(r4, r13, r8, r1)
            goto L27d
        L2a9:
            fb6 r8 = defpackage.bb6.G
            boolean r13 = defpackage.nb3.k(r4, r8)
            r49 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r40 = 32
            java.lang.String r51 = ""
            if (r13 == 0) goto L3ce
            fb6 r1 = defpackage.sa6.k
            boolean r1 = r11.c(r1)
            if (r1 == 0) goto L3ba
            java.lang.Object r13 = r5.g(r8)
            if (r13 != 0) goto L2c9
            r13 = r14
        L2c9:
            fp r13 = (defpackage.fp) r13
            if (r13 == 0) goto L2ce
            goto L2d0
        L2ce:
            r13 = r51
        L2d0:
            java.lang.Object r1 = r11.g(r8)
            if (r1 != 0) goto L2d7
            r1 = r14
        L2d7:
            fp r1 = (defpackage.fp) r1
            if (r1 == 0) goto L2dc
            goto L2de
        L2dc:
            r1 = r51
        L2de:
            java.lang.CharSequence r4 = P(r1)
            int r8 = r13.length()
            int r12 = r1.length()
            if (r8 <= r12) goto L2ee
            r14 = r12
            goto L2ef
        L2ee:
            r14 = r8
        L2ef:
            r52 = r2
            r2 = 0
        L2f2:
            r53 = r7
            if (r2 >= r14) goto L30a
            char r7 = r13.charAt(r2)
            r51 = r8
            char r8 = r1.charAt(r2)
            if (r7 == r8) goto L303
            goto L30c
        L303:
            int r2 = r2 + 1
            r8 = r51
            r7 = r53
            goto L2f2
        L30a:
            r51 = r8
        L30c:
            r7 = 0
        L30d:
            int r8 = r14 - r2
            if (r7 >= r8) goto L328
            int r8 = r51 + (-1)
            int r8 = r8 - r7
            char r8 = r13.charAt(r8)
            int r54 = r12 + (-1)
            r55 = r7
            int r7 = r54 - r55
            char r7 = r1.charAt(r7)
            if (r8 == r7) goto L325
            goto L32a
        L325:
            int r7 = r55 + 1
            goto L30d
        L328:
            r55 = r7
        L32a:
            int r8 = r51 - r55
            int r8 = r8 - r2
            int r1 = r12 - r55
            int r1 = r1 - r2
            fb6 r7 = defpackage.bb6.L
            boolean r14 = r5.c(r7)
            boolean r7 = r11.c(r7)
            r51 = r7
            fb6 r7 = defpackage.bb6.G
            boolean r7 = r5.c(r7)
            if (r7 == 0) goto L34b
            if (r14 != 0) goto L34b
            if (r51 == 0) goto L34b
            r54 = 1
            goto L34d
        L34b:
            r54 = 0
        L34d:
            if (r7 == 0) goto L355
            if (r14 == 0) goto L355
            if (r51 != 0) goto L355
            r7 = 1
            goto L356
        L355:
            r7 = 0
        L356:
            if (r54 != 0) goto L37d
            if (r7 == 0) goto L35b
            goto L37d
        L35b:
            int r12 = r0.A(r3)
            r14 = 16
            android.view.accessibility.AccessibilityEvent r12 = r0.o(r12, r14)
            r12.setFromIndex(r2)
            r12.setRemovedCount(r8)
            r12.setAddedCount(r1)
            r12.setBeforeText(r13)
            java.util.List r1 = r12.getText()
            r1.add(r4)
            r13 = r3
            r14 = r5
            r2 = r52
            goto L392
        L37d:
            int r1 = r0.A(r3)
            java.lang.Integer r2 = java.lang.Integer.valueOf(r12)
            r8 = r3
            r3 = r52
            r14 = r5
            r13 = r8
            r5 = r4
            r4 = r2
            r2 = r52
            android.view.accessibility.AccessibilityEvent r12 = r0.p(r1, r2, r3, r4, r5)
        L392:
            java.lang.String r1 = "android.widget.EditText"
            r12.setClassName(r1)
            r0.C(r12)
            if (r54 != 0) goto L39e
            if (r7 == 0) goto L3b7
        L39e:
            fb6 r1 = defpackage.bb6.H
            java.lang.Object r1 = r6.c(r1)
            k47 r1 = (defpackage.k47) r1
            long r3 = r1.a
            long r7 = r3 >> r40
            int r1 = (int) r7
            r12.setFromIndex(r1)
            long r3 = r3 & r49
            int r1 = (int) r3
            r12.setToIndex(r1)
            r0.C(r12)
        L3b7:
            r8 = r2
            goto L282
        L3ba:
            r13 = r3
            r14 = r5
            r53 = r7
            int r1 = r0.A(r13)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r16)
            r4 = 2048(0x800, float:2.87E-42)
            r5 = 8
            E(r0, r1, r4, r3, r5)
            goto L3b7
        L3ce:
            r13 = r3
            r14 = r5
            r53 = r7
            r7 = r45
            fb6 r3 = defpackage.bb6.H
            boolean r5 = defpackage.nb3.k(r4, r3)
            if (r5 == 0) goto L428
            java.lang.Object r1 = r11.g(r8)
            if (r1 != 0) goto L3e3
            r1 = 0
        L3e3:
            fp r1 = (defpackage.fp) r1
            if (r1 == 0) goto L3ee
            java.lang.String r1 = r1.B
            if (r1 != 0) goto L3ec
            goto L3ee
        L3ec:
            r51 = r1
        L3ee:
            java.lang.Object r1 = r6.c(r3)
            k47 r1 = (defpackage.k47) r1
            long r3 = r1.a
            int r1 = r0.A(r13)
            r5 = r1
            long r0 = r3 >> r40
            int r0 = (int) r0
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            long r3 = r3 & r49
            int r1 = (int) r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r1)
            int r1 = r51.length()
            java.lang.Integer r4 = java.lang.Integer.valueOf(r1)
            java.lang.CharSequence r1 = P(r51)
            r8 = r5
            r5 = r1
            r1 = r8
            r8 = r2
            r2 = r0
            r0 = r56
            android.view.accessibility.AccessibilityEvent r1 = r0.p(r1, r2, r3, r4, r5)
            r0.C(r1)
            r0.G(r10)
            goto L284
        L428:
            r8 = r2
            boolean r2 = defpackage.nb3.k(r4, r12)
            if (r2 != 0) goto L437
            fb6 r2 = defpackage.bb6.w
            boolean r2 = defpackage.nb3.k(r4, r2)
            if (r2 == 0) goto L43a
        L437:
            r3 = 0
            goto L4fa
        L43a:
            fb6 r2 = defpackage.bb6.l
            boolean r2 = defpackage.nb3.k(r4, r2)
            if (r2 == 0) goto L468
            r1.getClass()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L45b
            int r1 = r0.A(r10)
            r4 = 8
            android.view.accessibility.AccessibilityEvent r1 = r0.o(r1, r4)
            r0.C(r1)
            goto L45d
        L45b:
            r4 = 8
        L45d:
            int r1 = r0.A(r10)
            r2 = 2048(0x800, float:2.87E-42)
            E(r0, r1, r2, r8, r4)
            goto L284
        L468:
            fb6 r2 = defpackage.sa6.x
            boolean r3 = defpackage.nb3.k(r4, r2)
            if (r3 == 0) goto L4c6
            java.lang.Object r1 = r6.c(r2)
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r2 = r14.g(r2)
            if (r2 != 0) goto L47d
            r2 = 0
        L47d:
            java.util.List r2 = (java.util.List) r2
            if (r2 == 0) goto L4bb
            ka4 r3 = defpackage.c66.a
            ka4 r3 = new ka4
            r3.<init>()
            int r4 = r1.size()
            if (r4 > 0) goto L4af
            ka4 r1 = new ka4
            r1.<init>()
            int r4 = r2.size()
            if (r4 > 0) goto L4a3
            boolean r1 = r3.equals(r1)
            r37 = 1
            r38 = r1 ^ 1
            goto L284
        L4a3:
            r3 = 0
            java.lang.Object r0 = r2.get(r3)
            r0.getClass()
            defpackage.u34.a()
            return
        L4af:
            r3 = 0
            java.lang.Object r0 = r1.get(r3)
            r0.getClass()
            defpackage.u34.a()
            return
        L4bb:
            r3 = 0
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L53c
        L4c2:
            r38 = 1
            goto L53c
        L4c6:
            r3 = 0
            boolean r2 = r1 instanceof defpackage.y1
            if (r2 == 0) goto L4c2
            y1 r1 = (defpackage.y1) r1
            java.lang.Object r2 = r14.g(r4)
            if (r2 != 0) goto L4d4
            r2 = 0
        L4d4:
            if (r1 != r2) goto L4d7
            goto L4f7
        L4d7:
            boolean r4 = r2 instanceof defpackage.y1
            if (r4 != 0) goto L4dc
            goto L4f6
        L4dc:
            java.lang.String r4 = r1.a
            y1 r2 = (defpackage.y1) r2
            ao2 r5 = r2.b
            java.lang.String r2 = r2.a
            boolean r2 = defpackage.nb3.k(r4, r2)
            if (r2 != 0) goto L4eb
            goto L4f6
        L4eb:
            ao2 r1 = r1.b
            if (r1 != 0) goto L4f2
            if (r5 == 0) goto L4f2
            goto L4f6
        L4f2:
            if (r1 == 0) goto L4f7
            if (r5 != 0) goto L4f7
        L4f6:
            goto L4c2
        L4f7:
            r38 = r3
            goto L53c
        L4fa:
            r0.w(r15)
            int r1 = r9.size()
            r2 = r3
        L502:
            if (r2 >= r1) goto L518
            java.lang.Object r4 = r9.get(r2)
            o76 r4 = (defpackage.o76) r4
            int r4 = r4.A
            if (r4 != r13) goto L515
            java.lang.Object r1 = r9.get(r2)
            o76 r1 = (defpackage.o76) r1
            goto L519
        L515:
            int r2 = r2 + 1
            goto L502
        L518:
            r1 = 0
        L519:
            r1.getClass()
            java.lang.Object r2 = r11.g(r12)
            if (r2 != 0) goto L523
            r2 = 0
        L523:
            e76 r2 = (defpackage.e76) r2
            r1.X = r2
            fb6 r2 = defpackage.bb6.w
            java.lang.Object r2 = r11.g(r2)
            if (r2 != 0) goto L530
            r2 = 0
        L530:
            e76 r2 = (defpackage.e76) r2
            r1.Y = r2
            java.util.List r2 = r1.B
            boolean r2 = r2.contains(r1)
            if (r2 != 0) goto L53e
        L53c:
            r12 = 1
            goto L551
        L53e:
            te r2 = r0.R
            bq4 r2 = r2.getSnapshotObserver()
            le r4 = new le
            r12 = 1
            r4.<init>(r12, r1, r0)
            qm6 r2 = r2.a
            ye r5 = r0.I0
            r2.d(r1, r5, r4)
        L551:
            r4 = 8
            goto L569
        L554:
            r43 = r4
            r53 = r7
            r48 = r8
            r46 = r12
            r28 = r14
            r44 = r15
            r15 = r40
            r12 = 1
            r7 = r1
            r8 = r2
            r13 = r3
            r14 = r5
            r3 = 0
            goto L551
        L569:
            long r1 = r46 >> r4
            int r5 = r44 + 1
            r27 = r4
            r3 = r13
            r40 = r15
            r4 = r43
            r12 = r1
            r15 = r5
            r1 = r7
            r2 = r8
            r5 = r14
            r14 = r28
            r8 = r48
            r7 = r53
            goto Lba
        L581:
            r13 = r3
            r43 = r4
            r53 = r7
            r48 = r8
            r4 = r27
            r15 = r40
            r3 = 0
            r12 = 1
            r7 = r1
            r8 = r2
            r1 = r14
            r14 = r5
            if (r1 != r4) goto L5cd
        L594:
            r1 = r42
            goto L5a6
        L597:
            r13 = r3
            r43 = r4
            r14 = r5
            r53 = r7
            r48 = r8
            r15 = r40
            r3 = 0
            r12 = 1
            r7 = r1
            r8 = r2
            goto L594
        L5a6:
            if (r1 == r7) goto L5cd
            int r1 = r1 + 1
            r2 = r8
            r3 = r13
            r5 = r14
            r40 = r15
            r14 = r41
            r4 = r43
            r8 = r48
            r27 = 8
            r15 = r1
            r1 = r7
            r7 = r53
            goto La2
        L5bd:
            r43 = r4
            r53 = r7
            r48 = r8
            r39 = r13
            r41 = r14
            r12 = 1
            r8 = r2
            r13 = r3
            r3 = 0
            r38 = r3
        L5cd:
            if (r38 != 0) goto L5f6
            java.util.Iterator r1 = r43.iterator()
        L5d3:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L5f3
            java.lang.Object r2 = r1.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            ta6 r4 = r41.k()
            java.lang.Object r2 = r2.getKey()
            fb6 r2 = (defpackage.fb6) r2
            ja4 r4 = r4.A
            boolean r2 = r4.c(r2)
            if (r2 != 0) goto L5d3
            r15 = r12
            goto L5f4
        L5f3:
            r15 = r3
        L5f4:
            r38 = r15
        L5f6:
            if (r38 == 0) goto L604
            int r1 = r0.A(r13)
            r13 = 8
            r15 = 2048(0x800, float:2.87E-42)
            E(r0, r1, r15, r8, r13)
            goto L61f
        L604:
            r13 = 8
            goto L61f
        L607:
            java.lang.String r0 = "no value for specified key"
            ug r0 = defpackage.i61.e(r0)
            throw r0
        L60e:
            r34 = r1
            r53 = r7
            r48 = r8
            r29 = r10
            r30 = r11
            r39 = r13
            r3 = r14
            r31 = r15
            r8 = r2
            r13 = r12
        L61f:
            long r21 = r21 >> r13
            int r1 = r34 + 1
            r6 = r57
            r14 = r3
            r2 = r8
            r12 = r13
            r10 = r29
            r11 = r30
            r15 = r31
            r13 = r39
            r8 = r48
            r7 = r53
            goto L47
        L636:
            r3 = r13
            r13 = r12
            r12 = r3
            r53 = r7
            r48 = r8
            r29 = r10
            r30 = r11
            r3 = r14
            r31 = r15
            r8 = r2
            if (r12 != r13) goto L66d
            r14 = r31
        L649:
            r1 = r17
            goto L658
        L64c:
            r53 = r7
            r48 = r8
            r29 = r10
            r30 = r11
            r3 = r14
            r8 = r2
            r14 = r15
            goto L649
        L658:
            if (r14 == r1) goto L66d
            int r15 = r14 + 1
            r6 = r57
            r13 = r1
            r14 = r3
            r2 = r8
            r12 = r16
            r10 = r29
            r11 = r30
            r8 = r48
            r7 = r53
            goto L24
        L66d:
            return
    }

    public final void I(defpackage.sm3 r6, defpackage.q94 r7) {
            r5 = this;
            boolean r0 = r6.H()
            if (r0 != 0) goto L8
            goto L79
        L8:
            te r0 = r5.R
            zm r0 = r0.getAndroidViewsHandler$ui()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r6)
            if (r0 == 0) goto L1a
            goto L79
        L1a:
            if0 r0 = r6.B0
            r1 = 8
            boolean r0 = r0.g(r1)
            r2 = 0
            if (r0 == 0) goto L26
            goto L3b
        L26:
            sm3 r6 = r6.v()
        L2a:
            if (r6 == 0) goto L3a
            if0 r0 = r6.B0
            boolean r0 = r0.g(r1)
            if (r0 == 0) goto L35
            goto L3b
        L35:
            sm3 r6 = r6.v()
            goto L2a
        L3a:
            r6 = r2
        L3b:
            if (r6 == 0) goto L79
            ta6 r0 = r6.x()
            if (r0 != 0) goto L44
            goto L79
        L44:
            boolean r0 = r0.L
            r3 = 1
            if (r0 != 0) goto L63
            sm3 r0 = r6.v()
        L4d:
            if (r0 == 0) goto L60
            ta6 r4 = r0.x()
            if (r4 == 0) goto L5b
            boolean r4 = r4.L
            if (r4 != r3) goto L5b
            r2 = r0
            goto L60
        L5b:
            sm3 r0 = r0.v()
            goto L4d
        L60:
            if (r2 == 0) goto L63
            r6 = r2
        L63:
            int r6 = r6.B
            boolean r7 = r7.a(r6)
            if (r7 != 0) goto L6c
            goto L79
        L6c:
            int r6 = r5.A(r6)
            r7 = 2048(0x800, float:2.87E-42)
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            E(r5, r6, r7, r0, r1)
        L79:
            return
    }

    public final void J(defpackage.sm3 r4) {
            r3 = this;
            boolean r0 = r4.H()
            if (r0 != 0) goto L7
            goto L2e
        L7:
            te r0 = r3.R
            zm r0 = r0.getAndroidViewsHandler$ui()
            java.util.HashMap r0 = r0.getLayoutNodeToHolder()
            boolean r0 = r0.containsKey(r4)
            if (r0 == 0) goto L18
            goto L2e
        L18:
            int r4 = r4.B
            p94 r0 = r3.l0
            java.lang.Object r0 = r0.b(r4)
            e76 r0 = (defpackage.e76) r0
            p94 r1 = r3.m0
            java.lang.Object r1 = r1.b(r4)
            e76 r1 = (defpackage.e76) r1
            if (r0 != 0) goto L2f
            if (r1 != 0) goto L2f
        L2e:
            return
        L2f:
            r2 = 4096(0x1000, float:5.74E-42)
            android.view.accessibility.AccessibilityEvent r4 = r3.o(r4, r2)
            if (r0 == 0) goto L57
            on2 r2 = r0.a
            java.lang.Object r2 = r2.c()
            java.lang.Number r2 = (java.lang.Number) r2
            float r2 = r2.floatValue()
            int r2 = (int) r2
            r4.setScrollX(r2)
            on2 r0 = r0.b
            java.lang.Object r0 = r0.c()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (int) r0
            r4.setMaxScrollX(r0)
        L57:
            if (r1 == 0) goto L79
            on2 r0 = r1.a
            java.lang.Object r0 = r0.c()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (int) r0
            r4.setScrollY(r0)
            on2 r0 = r1.b
            java.lang.Object r0 = r0.c()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (int) r0
            r4.setMaxScrollY(r0)
        L79:
            r3.C(r4)
            return
    }

    public final boolean K(defpackage.xa6 r11, int r12, int r13, boolean r14) {
            r10 = this;
            ta6 r0 = r11.d
            int r1 = r11.f
            fb6 r2 = defpackage.sa6.j
            ja4 r0 = r0.A
            boolean r0 = r0.c(r2)
            r3 = 0
            if (r0 == 0) goto L3a
            boolean r0 = defpackage.n16.i(r11)
            if (r0 == 0) goto L3a
            ta6 r10 = r11.d
            java.lang.Object r10 = r10.c(r2)
            y1 r10 = (defpackage.y1) r10
            ao2 r10 = r10.b
            fo2 r10 = (defpackage.fo2) r10
            if (r10 == 0) goto L47
            java.lang.Integer r11 = java.lang.Integer.valueOf(r12)
            java.lang.Integer r12 = java.lang.Integer.valueOf(r13)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r14)
            java.lang.Object r10 = r10.e(r11, r12, r13)
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            return r10
        L3a:
            if (r12 != r13) goto L41
            int r14 = r10.p0
            if (r13 != r14) goto L41
            goto L47
        L41:
            java.lang.String r9 = t(r11)
            if (r9 != 0) goto L48
        L47:
            return r3
        L48:
            if (r12 < 0) goto L53
            if (r12 != r13) goto L53
            int r11 = r9.length()
            if (r13 > r11) goto L53
            goto L54
        L53:
            r12 = -1
        L54:
            r10.p0 = r12
            int r11 = r9.length()
            r12 = 1
            if (r11 <= 0) goto L5e
            r3 = r12
        L5e:
            int r5 = r10.A(r1)
            r11 = 0
            if (r3 == 0) goto L6d
            int r13 = r10.p0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r6 = r13
            goto L6e
        L6d:
            r6 = r11
        L6e:
            if (r3 == 0) goto L78
            int r13 = r10.p0
            java.lang.Integer r13 = java.lang.Integer.valueOf(r13)
            r7 = r13
            goto L79
        L78:
            r7 = r11
        L79:
            if (r3 == 0) goto L83
            int r11 = r9.length()
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)
        L83:
            r4 = r10
            r8 = r11
            android.view.accessibility.AccessibilityEvent r10 = r4.p(r5, r6, r7, r8, r9)
            r4.C(r10)
            r4.G(r1)
            return r12
    }

    public final android.graphics.Rect M(float r8, float r9, float r10, float r11) {
            r7 = this;
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            long r0 = (long) r8
            int r8 = java.lang.Float.floatToRawIntBits(r9)
            long r8 = (long) r8
            r2 = 32
            long r0 = r0 << r2
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r8 = r8 & r3
            long r8 = r8 | r0
            te r7 = r7.R
            long r8 = r7.r(r8)
            int r10 = java.lang.Float.floatToRawIntBits(r10)
            long r0 = (long) r10
            int r10 = java.lang.Float.floatToRawIntBits(r11)
            long r10 = (long) r10
            long r0 = r0 << r2
            long r10 = r10 & r3
            long r10 = r10 | r0
            long r10 = r7.r(r10)
            android.graphics.Rect r7 = new android.graphics.Rect
            long r0 = r8 >> r2
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            long r5 = r10 >> r2
            int r2 = (int) r5
            float r5 = java.lang.Float.intBitsToFloat(r2)
            float r1 = java.lang.Math.min(r1, r5)
            double r5 = (double) r1
            double r5 = java.lang.Math.floor(r5)
            float r1 = (float) r5
            int r1 = (int) r1
            long r8 = r8 & r3
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            long r10 = r10 & r3
            int r10 = (int) r10
            float r11 = java.lang.Float.intBitsToFloat(r10)
            float r9 = java.lang.Math.min(r9, r11)
            double r3 = (double) r9
            double r3 = java.lang.Math.floor(r3)
            float r9 = (float) r3
            int r9 = (int) r9
            float r11 = java.lang.Float.intBitsToFloat(r0)
            float r0 = java.lang.Float.intBitsToFloat(r2)
            float r11 = java.lang.Math.max(r11, r0)
            double r2 = (double) r11
            double r2 = java.lang.Math.ceil(r2)
            float r11 = (float) r2
            int r11 = (int) r11
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r10 = java.lang.Float.intBitsToFloat(r10)
            float r8 = java.lang.Math.max(r8, r10)
            double r2 = (double) r8
            double r2 = java.lang.Math.ceil(r2)
            float r8 = (float) r2
            int r8 = (int) r8
            r7.<init>(r1, r9, r11, r8)
            return r7
    }

    public final void Q() {
            r32 = this;
            r0 = r32
            q94 r1 = new q94
            r1.<init>()
            q94 r2 = r0.w0
            int[] r3 = r2.b
            long[] r4 = r2.a
            int r5 = r4.length
            int r5 = r5 + (-2)
            p94 r6 = r0.C0
            r14 = 8
            if (r5 < 0) goto L9d
            r7 = 0
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
        L1b:
            r9 = r4[r7]
            r8 = 7
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = ~r9
            long r11 = r11 << r8
            long r11 = r11 & r9
            long r11 = r11 & r20
            int r11 = (r11 > r20 ? 1 : (r11 == r20 ? 0 : -1))
            if (r11 == 0) goto L95
            int r11 = r7 - r5
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = 0
        L34:
            if (r12 >= r11) goto L90
            long r22 = r9 & r18
            int r13 = (r22 > r16 ? 1 : (r22 == r16 ? 0 : -1))
            if (r13 >= 0) goto L88
            int r13 = r7 << 3
            int r13 = r13 + r12
            r13 = r3[r13]
            r22 = r8
            g93 r8 = r0.s()
            java.lang.Object r8 = r8.b(r13)
            za6 r8 = (defpackage.za6) r8
            r23 = 0
            if (r8 == 0) goto L54
            xa6 r8 = r8.a
            goto L56
        L54:
            r8 = r23
        L56:
            if (r8 == 0) goto L64
            ta6 r8 = r8.d
            fb6 r15 = defpackage.bb6.d
            ja4 r8 = r8.A
            boolean r8 = r8.c(r15)
            if (r8 != 0) goto L8a
        L64:
            r1.a(r13)
            java.lang.Object r8 = r6.b(r13)
            ya6 r8 = (defpackage.ya6) r8
            if (r8 == 0) goto L80
            ta6 r8 = r8.a
            fb6 r15 = defpackage.bb6.d
            ja4 r8 = r8.A
            java.lang.Object r8 = r8.g(r15)
            if (r8 != 0) goto L7c
            goto L7e
        L7c:
            r23 = r8
        L7e:
            java.lang.String r23 = (java.lang.String) r23
        L80:
            r8 = r23
            r15 = 32
            r0.F(r13, r15, r8)
            goto L8a
        L88:
            r22 = r8
        L8a:
            long r9 = r9 >> r14
            int r12 = r12 + 1
            r8 = r22
            goto L34
        L90:
            r22 = r8
            if (r11 != r14) goto La8
            goto L97
        L95:
            r22 = r8
        L97:
            if (r7 == r5) goto La8
            int r7 = r7 + 1
            goto L1b
        L9d:
            r16 = 128(0x80, double:6.3E-322)
            r18 = 255(0xff, double:1.26E-321)
            r20 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            r22 = 7
        La8:
            int[] r3 = r1.b
            long[] r1 = r1.a
            int r4 = r1.length
            int r4 = r4 + (-2)
            if (r4 < 0) goto L183
            r5 = 0
        Lb2:
            r7 = r1[r5]
            long r9 = ~r7
            long r9 = r9 << r22
            long r9 = r9 & r7
            long r9 = r9 & r20
            int r9 = (r9 > r20 ? 1 : (r9 == r20 ? 0 : -1))
            if (r9 == 0) goto L177
            int r9 = r5 - r4
            int r9 = ~r9
            int r9 = r9 >>> 31
            int r9 = 8 - r9
            r10 = 0
        Lc6:
            if (r10 >= r9) goto L171
            long r11 = r7 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L161
            int r11 = r5 << 3
            int r11 = r11 + r10
            r11 = r3[r11]
            int r12 = java.lang.Integer.hashCode(r11)
            r13 = -862048943(0xffffffffcc9e2d51, float:-8.293031E7)
            int r12 = r12 * r13
            int r13 = r12 << 16
            r12 = r12 ^ r13
            r13 = r12 & 127(0x7f, float:1.78E-43)
            int r15 = r2.c
            int r12 = r12 >>> 7
            r12 = r12 & r15
            r24 = r14
            r23 = 0
        Le9:
            long[] r14 = r2.a
            int r25 = r12 >> 3
            r26 = r12 & 7
            r27 = r1
            int r1 = r26 << 3
            r28 = r14[r25]
            long r28 = r28 >>> r1
            int r25 = r25 + 1
            r25 = r14[r25]
            int r14 = 64 - r1
            long r25 = r25 << r14
            r30 = r7
            long r7 = (long) r1
            long r7 = -r7
            r1 = 63
            long r7 = r7 >> r1
            long r7 = r25 & r7
            long r7 = r28 | r7
            r1 = r15
            long r14 = (long) r13
            r25 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r14 = r14 * r25
            long r14 = r14 ^ r7
            long r25 = r14 - r25
            long r14 = ~r14
            long r14 = r25 & r14
            long r14 = r14 & r20
        L11b:
            r25 = 0
            int r28 = (r14 > r25 ? 1 : (r14 == r25 ? 0 : -1))
            if (r28 == 0) goto L13f
            int r25 = java.lang.Long.numberOfTrailingZeros(r14)
            int r25 = r25 >> 3
            int r25 = r12 + r25
            r25 = r25 & r1
            r28 = r1
            int[] r1 = r2.b
            r1 = r1[r25]
            if (r1 != r11) goto L136
        L133:
            r1 = r25
            goto L14e
        L136:
            r25 = 1
            long r25 = r14 - r25
            long r14 = r14 & r25
            r1 = r28
            goto L11b
        L13f:
            r28 = r1
            long r14 = ~r7
            r1 = 6
            long r14 = r14 << r1
            long r7 = r7 & r14
            long r7 = r7 & r20
            int r1 = (r7 > r25 ? 1 : (r7 == r25 ? 0 : -1))
            if (r1 == 0) goto L154
            r25 = -1
            goto L133
        L14e:
            if (r1 < 0) goto L167
            r2.g(r1)
            goto L167
        L154:
            int r23 = r23 + 8
            int r12 = r12 + r23
            r12 = r12 & r28
            r1 = r27
            r15 = r28
            r7 = r30
            goto Le9
        L161:
            r27 = r1
            r30 = r7
            r24 = r14
        L167:
            long r7 = r30 >> r24
            int r10 = r10 + 1
            r14 = r24
            r1 = r27
            goto Lc6
        L171:
            r27 = r1
            r1 = r14
            if (r9 != r1) goto L183
            goto L179
        L177:
            r27 = r1
        L179:
            if (r5 == r4) goto L183
            int r5 = r5 + 1
            r1 = r27
            r14 = 8
            goto Lb2
        L183:
            r6.c()
            g93 r1 = r0.s()
            int[] r3 = r1.b
            java.lang.Object[] r4 = r1.c
            long[] r1 = r1.a
            int r5 = r1.length
            int r5 = r5 + (-2)
            if (r5 < 0) goto L1fc
            r7 = 0
        L196:
            r8 = r1[r7]
            long r10 = ~r8
            long r10 = r10 << r22
            long r10 = r10 & r8
            long r10 = r10 & r20
            int r10 = (r10 > r20 ? 1 : (r10 == r20 ? 0 : -1))
            if (r10 == 0) goto L1f5
            int r10 = r7 - r5
            int r10 = ~r10
            int r10 = r10 >>> 31
            r24 = 8
            int r14 = 8 - r10
            r10 = 0
        L1ac:
            if (r10 >= r14) goto L1f0
            long r11 = r8 & r18
            int r11 = (r11 > r16 ? 1 : (r11 == r16 ? 0 : -1))
            if (r11 >= 0) goto L1ea
            int r11 = r7 << 3
            int r11 = r11 + r10
            r12 = r3[r11]
            r11 = r4[r11]
            za6 r11 = (defpackage.za6) r11
            xa6 r11 = r11.a
            ta6 r13 = r11.d
            fb6 r15 = defpackage.bb6.d
            ja4 r13 = r13.A
            boolean r13 = r13.c(r15)
            if (r13 == 0) goto L1de
            boolean r13 = r2.a(r12)
            if (r13 == 0) goto L1de
            ta6 r13 = r11.d
            java.lang.Object r13 = r13.c(r15)
            java.lang.String r13 = (java.lang.String) r13
            r15 = 16
            r0.F(r12, r15, r13)
        L1de:
            ya6 r13 = new ya6
            g93 r15 = r0.s()
            r13.<init>(r11, r15)
            r6.i(r12, r13)
        L1ea:
            r11 = 8
            long r8 = r8 >> r11
            int r10 = r10 + 1
            goto L1ac
        L1f0:
            r11 = 8
            if (r14 != r11) goto L1fc
            goto L1f7
        L1f5:
            r11 = 8
        L1f7:
            if (r7 == r5) goto L1fc
            int r7 = r7 + 1
            goto L196
        L1fc:
            ya6 r1 = new ya6
            te r2 = r0.R
            ab6 r2 = r2.getSemanticsOwner()
            xa6 r2 = r2.a()
            g93 r3 = r0.s()
            r1.<init>(r2, r3)
            r0.D0 = r1
            return
    }

    @Override // defpackage.b2
    public final defpackage.os0 b(android.view.View r1) {
            r0 = this;
            ue r0 = r0.f0
            return r0
    }

    public final void j(int r20, defpackage.v2 r21, java.lang.String r22, android.os.Bundle r23) {
            r19 = this;
            r0 = r19
            r1 = r20
            r2 = r22
            r3 = r21
            r4 = r23
            android.view.accessibility.AccessibilityNodeInfo r3 = r3.a
            g93 r5 = r0.s()
            java.lang.Object r5 = r5.b(r1)
            za6 r5 = (defpackage.za6) r5
            if (r5 == 0) goto L319
            xa6 r5 = r5.a
            if (r5 != 0) goto L1e
            goto L319
        L1e:
            sm3 r6 = r5.c
            ta6 r7 = r5.d
            ja4 r8 = r7.A
            java.lang.String r9 = t(r5)
            java.lang.String r10 = r0.z0
            boolean r10 = defpackage.nb3.k(r2, r10)
            r11 = -1
            if (r10 == 0) goto L41
            n94 r0 = r0.x0
            int r0 = r0.d(r1)
            if (r0 == r11) goto L319
            android.os.Bundle r1 = r3.getExtras()
            r1.putInt(r2, r0)
            return
        L41:
            java.lang.String r10 = r0.A0
            boolean r10 = defpackage.nb3.k(r2, r10)
            if (r10 == 0) goto L59
            n94 r0 = r0.y0
            int r0 = r0.d(r1)
            if (r0 == r11) goto L319
            android.os.Bundle r1 = r3.getExtras()
            r1.putInt(r2, r0)
            return
        L59:
            fb6 r1 = defpackage.sa6.a
            boolean r1 = r8.c(r1)
            te r10 = r0.R
            r12 = 0
            if (r1 == 0) goto L18f
            if (r4 == 0) goto L18f
            java.lang.String r1 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY"
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 == 0) goto L18f
            java.lang.String r0 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX"
            int r0 = r4.getInt(r0, r11)
            java.lang.String r1 = "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH"
            int r1 = r4.getInt(r1, r11)
            if (r1 <= 0) goto L187
            if (r0 < 0) goto L187
            if (r9 == 0) goto L85
            int r4 = r9.length()
            goto L88
        L85:
            r4 = 2147483647(0x7fffffff, float:NaN)
        L88:
            if (r0 < r4) goto L8c
            goto L187
        L8c:
            a47 r4 = defpackage.ln2.E(r7)
            if (r4 != 0) goto L94
            goto L319
        L94:
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r7 = 0
        L9a:
            if (r7 >= r1) goto L176
            int r8 = r0 + r7
            z37 r9 = r4.a
            fp r9 = r9.a
            java.lang.String r9 = r9.B
            int r9 = r9.length()
            if (r8 < r9) goto Lb4
            r6.add(r12)
            r18 = r0
            r23 = r1
            r15 = r10
            goto L16c
        Lb4:
            of5 r8 = r4.b(r8)
            eg4 r9 = r5.d()
            r14 = 0
            if (r9 == 0) goto Ld0
            z64 r11 = r9.Y0()
            boolean r11 = r11.j0
            if (r11 == 0) goto Lc9
            goto Lca
        Lc9:
            r9 = r12
        Lca:
            if (r9 == 0) goto Ld0
            long r14 = r9.P(r14)
        Ld0:
            of5 r8 = r8.i(r14)
            of5 r9 = r5.g()
            boolean r11 = r8.g(r9)
            if (r11 == 0) goto Le3
            of5 r8 = r8.e(r9)
            goto Le4
        Le3:
            r8 = r12
        Le4:
            if (r8 == 0) goto L163
            float r9 = r8.a
            float r11 = r8.b
            int r9 = java.lang.Float.floatToRawIntBits(r9)
            long r14 = (long) r9
            int r9 = java.lang.Float.floatToRawIntBits(r11)
            long r12 = (long) r9
            r9 = 32
            long r14 = r14 << r9
            r16 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r11 = r12 & r16
            long r11 = r11 | r14
            long r11 = r10.r(r11)
            float r13 = r8.c
            float r8 = r8.d
            int r13 = java.lang.Float.floatToRawIntBits(r13)
            long r13 = (long) r13
            int r8 = java.lang.Float.floatToRawIntBits(r8)
            r19 = r9
            r15 = r10
            long r9 = (long) r8
            long r13 = r13 << r19
            long r8 = r9 & r16
            long r8 = r8 | r13
            long r8 = r15.r(r8)
            android.graphics.RectF r10 = new android.graphics.RectF
            long r13 = r11 >> r19
            int r13 = (int) r13
            float r14 = java.lang.Float.intBitsToFloat(r13)
            r18 = r0
            r23 = r1
            long r0 = r8 >> r19
            int r0 = (int) r0
            float r1 = java.lang.Float.intBitsToFloat(r0)
            float r1 = java.lang.Math.min(r14, r1)
            long r11 = r11 & r16
            int r11 = (int) r11
            float r12 = java.lang.Float.intBitsToFloat(r11)
            long r8 = r8 & r16
            int r8 = (int) r8
            float r9 = java.lang.Float.intBitsToFloat(r8)
            float r9 = java.lang.Math.min(r12, r9)
            float r12 = java.lang.Float.intBitsToFloat(r13)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            float r0 = java.lang.Math.max(r12, r0)
            float r11 = java.lang.Float.intBitsToFloat(r11)
            float r8 = java.lang.Float.intBitsToFloat(r8)
            float r8 = java.lang.Math.max(r11, r8)
            r10.<init>(r1, r9, r0, r8)
            goto L169
        L163:
            r18 = r0
            r23 = r1
            r15 = r10
            r10 = 0
        L169:
            r6.add(r10)
        L16c:
            int r7 = r7 + 1
            r1 = r23
            r10 = r15
            r0 = r18
            r12 = 0
            goto L9a
        L176:
            android.os.Bundle r0 = r3.getExtras()
            r1 = 0
            android.graphics.RectF[] r1 = new android.graphics.RectF[r1]
            java.lang.Object[] r1 = r6.toArray(r1)
            android.os.Parcelable[] r1 = (android.os.Parcelable[]) r1
            r0.putParcelableArray(r2, r1)
            return
        L187:
            java.lang.String r0 = "AccessibilityDelegate"
            java.lang.String r1 = "Invalid arguments for accessibility character locations"
            android.util.Log.e(r0, r1)
            return
        L18f:
            r15 = r10
            fb6 r1 = defpackage.bb6.A
            boolean r7 = r8.c(r1)
            if (r7 == 0) goto L1b7
            if (r4 == 0) goto L1b7
            java.lang.String r4 = "androidx.compose.ui.semantics.testTag"
            boolean r4 = defpackage.nb3.k(r2, r4)
            if (r4 == 0) goto L1b7
            java.lang.Object r0 = r8.g(r1)
            if (r0 != 0) goto L1aa
            r12 = 0
            goto L1ab
        L1aa:
            r12 = r0
        L1ab:
            java.lang.String r12 = (java.lang.String) r12
            if (r12 == 0) goto L319
            android.os.Bundle r0 = r3.getExtras()
            r0.putCharSequence(r2, r12)
            return
        L1b7:
            java.lang.String r1 = "androidx.compose.ui.semantics.id"
            boolean r1 = defpackage.nb3.k(r2, r1)
            if (r1 == 0) goto L1c9
            android.os.Bundle r0 = r3.getExtras()
            int r1 = r5.f
            r0.putInt(r2, r1)
            return
        L1c9:
            java.lang.String r1 = "androidx.compose.ui.semantics.shapeType"
            boolean r4 = defpackage.nb3.k(r2, r1)
            java.lang.String r7 = "androidx.compose.ui.semantics.shapeRegion"
            java.lang.String r9 = "androidx.compose.ui.semantics.shapeCorners"
            java.lang.String r10 = "androidx.compose.ui.semantics.shapeRect"
            if (r4 == 0) goto L25b
            fb6 r2 = defpackage.bb6.Q
            java.lang.Object r2 = r8.g(r2)
            if (r2 != 0) goto L1e1
            r12 = 0
            goto L1e2
        L1e1:
            r12 = r2
        L1e2:
            ke6 r12 = (defpackage.ke6) r12
            if (r12 == 0) goto L319
            android.graphics.Rect r2 = new android.graphics.Rect
            r2.<init>()
            r3.getBoundsInScreen(r2)
            of5 r0 = r0.u(r5, r2, r12)
            float r2 = r0.b
            float r4 = r0.a
            long r13 = r0.c()
            kk3 r0 = r6.v0
            qh1 r5 = r15.getDensity()
            mp2 r0 = r12.a(r13, r0, r5)
            boolean r5 = r0 instanceof defpackage.qo4
            if (r5 == 0) goto L21c
            android.os.Bundle r5 = r3.getExtras()
            r6 = 0
            r5.putInt(r1, r6)
            android.os.Bundle r1 = r3.getExtras()
            android.graphics.Rect r0 = L(r0, r4, r2)
            r1.putParcelable(r10, r0)
            return
        L21c:
            boolean r5 = r0 instanceof defpackage.ro4
            if (r5 == 0) goto L23f
            android.os.Bundle r5 = r3.getExtras()
            r6 = 1
            r5.putInt(r1, r6)
            android.os.Bundle r1 = r3.getExtras()
            android.graphics.Rect r2 = L(r0, r4, r2)
            r1.putParcelable(r10, r2)
            android.os.Bundle r1 = r3.getExtras()
            float[] r0 = N(r0)
            r1.putFloatArray(r9, r0)
            return
        L23f:
            boolean r5 = r0 instanceof defpackage.po4
            if (r5 == 0) goto L257
            android.os.Bundle r5 = r3.getExtras()
            r6 = 2
            r5.putInt(r1, r6)
            android.os.Bundle r1 = r3.getExtras()
            android.graphics.Region r0 = O(r0, r4, r2)
            r1.putParcelable(r7, r0)
            return
        L257:
            defpackage.i.d()
            return
        L25b:
            boolean r1 = defpackage.nb3.k(r2, r10)
            if (r1 == 0) goto L29c
            fb6 r1 = defpackage.bb6.Q
            java.lang.Object r1 = r8.g(r1)
            if (r1 != 0) goto L26b
            r12 = 0
            goto L26c
        L26b:
            r12 = r1
        L26c:
            ke6 r12 = (defpackage.ke6) r12
            if (r12 == 0) goto L319
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.getBoundsInScreen(r1)
            of5 r0 = r0.u(r5, r1, r12)
            long r1 = r0.c()
            kk3 r4 = r6.v0
            qh1 r5 = r15.getDensity()
            mp2 r1 = r12.a(r1, r4, r5)
            float r2 = r0.a
            float r0 = r0.b
            android.graphics.Rect r0 = L(r1, r2, r0)
            if (r0 == 0) goto L319
            android.os.Bundle r1 = r3.getExtras()
            r1.putParcelable(r10, r0)
            return
        L29c:
            boolean r1 = defpackage.nb3.k(r2, r9)
            if (r1 == 0) goto L2d9
            fb6 r1 = defpackage.bb6.Q
            java.lang.Object r1 = r8.g(r1)
            if (r1 != 0) goto L2ac
            r12 = 0
            goto L2ad
        L2ac:
            r12 = r1
        L2ad:
            ke6 r12 = (defpackage.ke6) r12
            if (r12 == 0) goto L319
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.getBoundsInScreen(r1)
            of5 r0 = r0.u(r5, r1, r12)
            long r0 = r0.c()
            kk3 r2 = r6.v0
            qh1 r4 = r15.getDensity()
            mp2 r0 = r12.a(r0, r2, r4)
            float[] r0 = N(r0)
            if (r0 == 0) goto L319
            android.os.Bundle r1 = r3.getExtras()
            r1.putFloatArray(r9, r0)
            return
        L2d9:
            boolean r1 = defpackage.nb3.k(r2, r7)
            if (r1 == 0) goto L319
            fb6 r1 = defpackage.bb6.Q
            java.lang.Object r1 = r8.g(r1)
            if (r1 != 0) goto L2e9
            r12 = 0
            goto L2ea
        L2e9:
            r12 = r1
        L2ea:
            ke6 r12 = (defpackage.ke6) r12
            if (r12 == 0) goto L319
            android.graphics.Rect r1 = new android.graphics.Rect
            r1.<init>()
            r3.getBoundsInScreen(r1)
            of5 r0 = r0.u(r5, r1, r12)
            long r1 = r0.c()
            kk3 r4 = r6.v0
            qh1 r5 = r15.getDensity()
            mp2 r1 = r12.a(r1, r4, r5)
            float r2 = r0.a
            float r0 = r0.b
            android.graphics.Region r0 = O(r1, r2, r0)
            if (r0 == 0) goto L319
            android.os.Bundle r1 = r3.getExtras()
            r1.putParcelable(r7, r0)
        L319:
            return
    }

    public final android.graphics.Rect k(defpackage.za6 r4) {
            r3 = this;
            m93 r4 = r4.b
            int r0 = r4.a
            float r0 = (float) r0
            int r1 = r4.b
            float r1 = (float) r1
            int r2 = r4.c
            float r2 = (float) r2
            int r4 = r4.d
            float r4 = (float) r4
            android.graphics.Rect r3 = r3.M(r0, r1, r2, r4)
            return r3
    }

    public final java.lang.Object l(defpackage.s41 r11) {
            r10 = this;
            boolean r0 = r11 instanceof defpackage.we
            if (r0 == 0) goto L13
            r0 = r11
            we r0 = (defpackage.we) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            we r0 = new we
            r0.<init>(r10, r11)
        L18:
            java.lang.Object r11 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 2
            zu r4 = r10.r0
            r5 = 1
            if (r2 == 0) goto L44
            if (r2 == r5) goto L3c
            if (r2 != r3) goto L35
            n80 r2 = r0.X
            q94 r6 = r0.R
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L32
        L2f:
            r11 = r6
            r6 = r2
            goto L56
        L32:
            r10 = move-exception
            goto Lc4
        L35:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L3c:
            n80 r2 = r0.X
            q94 r6 = r0.R
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L32
            goto L67
        L44:
            defpackage.oi2.Y(r11)
            q94 r11 = new q94     // Catch: java.lang.Throwable -> L32
            r11.<init>()     // Catch: java.lang.Throwable -> L32
            v80 r2 = r10.s0     // Catch: java.lang.Throwable -> L32
            r2.getClass()     // Catch: java.lang.Throwable -> L32
            n80 r6 = new n80     // Catch: java.lang.Throwable -> L32
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L32
        L56:
            r0.R = r11     // Catch: java.lang.Throwable -> L32
            r0.X = r6     // Catch: java.lang.Throwable -> L32
            r0.d0 = r5     // Catch: java.lang.Throwable -> L32
            java.lang.Object r2 = r6.b(r0)     // Catch: java.lang.Throwable -> L32
            if (r2 != r1) goto L63
            goto Lbd
        L63:
            r9 = r6
            r6 = r11
            r11 = r2
            r2 = r9
        L67:
            java.lang.Boolean r11 = (java.lang.Boolean) r11     // Catch: java.lang.Throwable -> L32
            boolean r11 = r11.booleanValue()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto Lbe
            r2.c()     // Catch: java.lang.Throwable -> L32
            boolean r11 = r10.v()     // Catch: java.lang.Throwable -> L32
            if (r11 == 0) goto La2
            int r11 = r4.L     // Catch: java.lang.Throwable -> L32
            r7 = 0
        L7b:
            if (r7 >= r11) goto L8c
            java.lang.Object[] r8 = r4.B     // Catch: java.lang.Throwable -> L32
            r8 = r8[r7]     // Catch: java.lang.Throwable -> L32
            sm3 r8 = (defpackage.sm3) r8     // Catch: java.lang.Throwable -> L32
            r10.I(r8, r6)     // Catch: java.lang.Throwable -> L32
            r10.J(r8)     // Catch: java.lang.Throwable -> L32
            int r7 = r7 + 1
            goto L7b
        L8c:
            r6.b()     // Catch: java.lang.Throwable -> L32
            te r11 = r10.R     // Catch: java.lang.Throwable -> L32
            android.os.Handler r11 = r11.getHandler()     // Catch: java.lang.Throwable -> L32
            boolean r7 = r10.E0     // Catch: java.lang.Throwable -> L32
            if (r7 != 0) goto La2
            if (r11 == 0) goto La2
            r10.E0 = r5     // Catch: java.lang.Throwable -> L32
            n0 r7 = r10.G0     // Catch: java.lang.Throwable -> L32
            r11.post(r7)     // Catch: java.lang.Throwable -> L32
        La2:
            r4.clear()     // Catch: java.lang.Throwable -> L32
            p94 r11 = r10.l0     // Catch: java.lang.Throwable -> L32
            r11.c()     // Catch: java.lang.Throwable -> L32
            p94 r11 = r10.m0     // Catch: java.lang.Throwable -> L32
            r11.c()     // Catch: java.lang.Throwable -> L32
            long r7 = r10.d0     // Catch: java.lang.Throwable -> L32
            r0.R = r6     // Catch: java.lang.Throwable -> L32
            r0.X = r2     // Catch: java.lang.Throwable -> L32
            r0.d0 = r3     // Catch: java.lang.Throwable -> L32
            java.lang.Object r11 = defpackage.q60.t(r7, r0)     // Catch: java.lang.Throwable -> L32
            if (r11 != r1) goto L2f
        Lbd:
            return r1
        Lbe:
            r4.clear()
            jg7 r10 = defpackage.jg7.a
            return r10
        Lc4:
            r4.clear()
            throw r10
    }

    public final boolean m(int r22, long r23, boolean r25) {
            r21 = this;
            r0 = r23
            r2 = r25
            android.os.Looper r3 = android.os.Looper.getMainLooper()
            java.lang.Thread r3 = r3.getThread()
            java.lang.Thread r4 = java.lang.Thread.currentThread()
            boolean r3 = defpackage.nb3.k(r3, r4)
            if (r3 != 0) goto L1a
        L16:
            r16 = 0
            goto L13d
        L1a:
            g93 r3 = r21.s()
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
            boolean r5 = defpackage.jk4.c(r0, r5)
            if (r5 != 0) goto L16
            r5 = 9223372034707292159(0x7fffffff7fffffff, double:NaN)
            long r5 = r5 & r0
            r7 = 36028792732385279(0x7fffff007fffff, double:2.848093183464406E-306)
            long r5 = r5 + r7
            r7 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            long r5 = r5 & r7
            r7 = 0
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r5 != 0) goto L16
            r5 = 1
            if (r2 != r5) goto L47
            fb6 r2 = defpackage.bb6.w
            goto L4b
        L47:
            if (r2 != 0) goto L138
            fb6 r2 = defpackage.bb6.v
        L4b:
            java.lang.Object[] r6 = r3.c
            long[] r3 = r3.a
            int r7 = r3.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L16
            r8 = 0
            r9 = 0
        L56:
            r10 = r3[r8]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L12c
            int r12 = r8 - r7
            int r12 = ~r12
            int r12 = r12 >>> 31
            r13 = 8
            int r12 = 8 - r12
            r14 = 0
        L70:
            if (r14 >= r12) goto L125
            r15 = 255(0xff, double:1.26E-321)
            long r15 = r15 & r10
            r17 = 128(0x80, double:6.3E-322)
            int r15 = (r15 > r17 ? 1 : (r15 == r17 ? 0 : -1))
            if (r15 >= 0) goto L116
            int r15 = r8 << 3
            int r15 = r15 + r14
            r15 = r6[r15]
            za6 r15 = (defpackage.za6) r15
            r16 = 0
            m93 r4 = r15.b
            int r5 = r4.a
            float r5 = (float) r5
            r25 = r13
            int r13 = r4.b
            float r13 = (float) r13
            int r0 = r4.c
            float r0 = (float) r0
            int r1 = r4.d
            float r1 = (float) r1
            r4 = 32
            r17 = r0
            r18 = r1
            long r0 = r23 >> r4
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            r19 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r4 = r0
            long r0 = r23 & r19
            int r0 = (int) r0
            float r0 = java.lang.Float.intBitsToFloat(r0)
            int r1 = (r4 > r5 ? 1 : (r4 == r5 ? 0 : -1))
            if (r1 < 0) goto Lb4
            r1 = 1
            goto Lb6
        Lb4:
            r1 = r16
        Lb6:
            int r4 = (r4 > r17 ? 1 : (r4 == r17 ? 0 : -1))
            if (r4 >= 0) goto Lbc
            r4 = 1
            goto Lbe
        Lbc:
            r4 = r16
        Lbe:
            r1 = r1 & r4
            int r4 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r4 < 0) goto Lc5
            r4 = 1
            goto Lc7
        Lc5:
            r4 = r16
        Lc7:
            r1 = r1 & r4
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 >= 0) goto Lce
            r0 = 1
            goto Ld0
        Lce:
            r0 = r16
        Ld0:
            r0 = r0 & r1
            if (r0 != 0) goto Ld4
            goto L11a
        Ld4:
            xa6 r0 = r15.a
            ta6 r0 = r0.d
            ja4 r0 = r0.A
            java.lang.Object r0 = r0.g(r2)
            if (r0 != 0) goto Le1
            r0 = 0
        Le1:
            e76 r0 = (defpackage.e76) r0
            if (r0 != 0) goto Le6
            goto L11a
        Le6:
            on2 r1 = r0.a
            if (r22 >= 0) goto Lfb
            java.lang.Object r0 = r1.c()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            r1 = 0
            int r0 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
            if (r0 <= 0) goto L11a
        Lf9:
            r9 = 1
            goto L11a
        Lfb:
            java.lang.Object r1 = r1.c()
            java.lang.Number r1 = (java.lang.Number) r1
            float r1 = r1.floatValue()
            on2 r0 = r0.b
            java.lang.Object r0 = r0.c()
            java.lang.Number r0 = (java.lang.Number) r0
            float r0 = r0.floatValue()
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 >= 0) goto L11a
            goto Lf9
        L116:
            r25 = r13
            r16 = 0
        L11a:
            long r10 = r10 >> r25
            int r14 = r14 + 1
            r0 = r23
            r13 = r25
            r5 = 1
            goto L70
        L125:
            r0 = r13
            r16 = 0
            if (r12 != r0) goto L12b
            goto L12e
        L12b:
            return r9
        L12c:
            r16 = 0
        L12e:
            if (r8 == r7) goto L137
            int r8 = r8 + 1
            r0 = r23
            r5 = 1
            goto L56
        L137:
            return r9
        L138:
            r16 = 0
            defpackage.i.d()
        L13d:
            return r16
    }

    public final void n() {
            r2 = this;
            java.lang.String r0 = "sendAccessibilitySemanticsStructureChangeEvents"
            android.os.Trace.beginSection(r0)
            boolean r0 = r2.v()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1a
            te r0 = r2.R     // Catch: java.lang.Throwable -> L42
            ab6 r0 = r0.getSemanticsOwner()     // Catch: java.lang.Throwable -> L42
            xa6 r0 = r0.a()     // Catch: java.lang.Throwable -> L42
            ya6 r1 = r2.D0     // Catch: java.lang.Throwable -> L42
            r2.B(r0, r1)     // Catch: java.lang.Throwable -> L42
        L1a:
            android.os.Trace.endSection()
            java.lang.String r0 = "sendSemanticsPropertyChangeEvents"
            android.os.Trace.beginSection(r0)
            g93 r0 = r2.s()     // Catch: java.lang.Throwable -> L3d
            r2.H(r0)     // Catch: java.lang.Throwable -> L3d
            android.os.Trace.endSection()
            java.lang.String r0 = "updateSemanticsNodesCopyAndPanes"
            android.os.Trace.beginSection(r0)
            r2.Q()     // Catch: java.lang.Throwable -> L38
            android.os.Trace.endSection()
            return
        L38:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
        L3d:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
        L42:
            r2 = move-exception
            android.os.Trace.endSection()
            throw r2
    }

    public final android.view.accessibility.AccessibilityEvent o(int r3, int r4) {
            r2 = this;
            android.view.accessibility.AccessibilityEvent r4 = android.view.accessibility.AccessibilityEvent.obtain(r4)
            r0 = 1
            r4.setEnabled(r0)
            java.lang.String r0 = "android.view.View"
            r4.setClassName(r0)
            te r0 = r2.R
            android.content.Context r1 = r0.getContext()
            java.lang.String r1 = r1.getPackageName()
            r4.setPackageName(r1)
            r4.setSource(r0, r3)
            boolean r0 = r2.v()
            if (r0 == 0) goto L5a
            g93 r2 = r2.s()
            java.lang.Object r2 = r2.b(r3)
            za6 r2 = (defpackage.za6) r2
            if (r2 == 0) goto L5a
            xa6 r2 = r2.a
            ta6 r3 = r2.d
            fb6 r0 = defpackage.bb6.L
            ja4 r3 = r3.A
            boolean r3 = r3.c(r0)
            r4.setPassword(r3)
            ta6 r2 = r2.d
            fb6 r3 = defpackage.bb6.o
            ja4 r2 = r2.A
            java.lang.Object r2 = r2.g(r3)
            if (r2 != 0) goto L4b
            r2 = 0
        L4b:
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            boolean r2 = defpackage.nb3.k(r2, r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r0 = 34
            if (r3 < r0) goto L5a
            defpackage.c2.k(r4, r2)
        L5a:
            return r4
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public final void onAccessibilityStateChanged(boolean r1) {
            r0 = this;
            r1 = 0
            r0.e0 = r1
            return
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public final void onTouchExplorationStateChanged(boolean r1) {
            r0 = this;
            r1 = 0
            r0.e0 = r1
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(android.view.View r2) {
            r1 = this;
            android.view.accessibility.AccessibilityManager r2 = r1.Z
            boolean r0 = r2.isEnabled()
            if (r0 == 0) goto Lb
            r0 = 0
            r1.e0 = r0
        Lb:
            r2.addAccessibilityStateChangeListener(r1)
            r2.addTouchExplorationStateChangeListener(r1)
            return
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(android.view.View r2) {
            r1 = this;
            te r2 = r1.R
            android.os.Handler r2 = r2.getHandler()
            r2.getClass()
            n0 r0 = r1.G0
            r2.removeCallbacks(r0)
            android.view.accessibility.AccessibilityManager r2 = r1.Z
            r2.removeAccessibilityStateChangeListener(r1)
            r2.removeTouchExplorationStateChangeListener(r1)
            return
    }

    public final android.view.accessibility.AccessibilityEvent p(int r2, java.lang.Integer r3, java.lang.Integer r4, java.lang.Integer r5, java.lang.CharSequence r6) {
            r1 = this;
            r0 = 8192(0x2000, float:1.148E-41)
            android.view.accessibility.AccessibilityEvent r1 = r1.o(r2, r0)
            if (r3 == 0) goto Lf
            int r2 = r3.intValue()
            r1.setFromIndex(r2)
        Lf:
            if (r4 == 0) goto L18
            int r2 = r4.intValue()
            r1.setToIndex(r2)
        L18:
            if (r5 == 0) goto L21
            int r2 = r5.intValue()
            r1.setItemCount(r2)
        L21:
            if (r6 == 0) goto L2a
            java.util.List r2 = r1.getText()
            r2.add(r6)
        L2a:
            return r1
    }

    public final int q(defpackage.xa6 r3) {
            r2 = this;
            ta6 r3 = r3.d
            fb6 r0 = defpackage.bb6.a
            ja4 r1 = r3.A
            boolean r0 = r1.c(r0)
            if (r0 != 0) goto L26
            fb6 r0 = defpackage.bb6.H
            ja4 r1 = r3.A
            boolean r1 = r1.c(r0)
            if (r1 == 0) goto L26
            java.lang.Object r2 = r3.c(r0)
            k47 r2 = (defpackage.k47) r2
            long r2 = r2.a
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r0
            int r2 = (int) r2
            return r2
        L26:
            int r2 = r2.p0
            return r2
    }

    public final int r(defpackage.xa6 r3) {
            r2 = this;
            ta6 r3 = r3.d
            fb6 r0 = defpackage.bb6.a
            ja4 r1 = r3.A
            boolean r0 = r1.c(r0)
            if (r0 != 0) goto L23
            fb6 r0 = defpackage.bb6.H
            ja4 r1 = r3.A
            boolean r1 = r1.c(r0)
            if (r1 == 0) goto L23
            java.lang.Object r2 = r3.c(r0)
            k47 r2 = (defpackage.k47) r2
            long r2 = r2.a
            r0 = 32
            long r2 = r2 >> r0
            int r2 = (int) r2
            return r2
        L23:
            int r2 = r2.p0
            return r2
    }

    public final defpackage.g93 s() {
            r7 = this;
            boolean r0 = r7.t0
            if (r0 == 0) goto L78
            r0 = 0
            r7.t0 = r0
            te r0 = r7.R
            ab6 r1 = r0.getSemanticsOwner()
            ne r2 = defpackage.ne.R
            p94 r1 = defpackage.u24.n(r1, r2)
            r7.v0 = r1
            boolean r1 = r7.v()
            if (r1 == 0) goto L78
            p94 r1 = r7.v0
            android.content.Context r0 = r0.getContext()
            android.content.res.Resources r0 = r0.getResources()
            n94 r2 = r7.x0
            r2.a()
            n94 r3 = r7.y0
            r3.a()
            r4 = -1
            java.lang.Object r4 = r1.b(r4)
            za6 r4 = (defpackage.za6) r4
            if (r4 == 0) goto L3b
            xa6 r4 = r4.a
            goto L3c
        L3b:
            r4 = 0
        L3c:
            r4.getClass()
            mc r5 = new mc
            r6 = 3
            r5.<init>(r1, r6)
            mc r1 = new mc
            r6 = 4
            r1.<init>(r0, r6)
            java.util.List r0 = defpackage.hf.b0(r4)
            java.util.ArrayList r0 = defpackage.hb6.b(r4, r5, r1, r0)
            int r1 = r0.size()
            r4 = 1
            int r1 = r1 - r4
            if (r4 > r1) goto L78
        L5b:
            int r5 = r4 + (-1)
            java.lang.Object r5 = r0.get(r5)
            xa6 r5 = (defpackage.xa6) r5
            int r5 = r5.f
            java.lang.Object r6 = r0.get(r4)
            xa6 r6 = (defpackage.xa6) r6
            int r6 = r6.f
            r2.f(r5, r6)
            r3.f(r6, r5)
            if (r4 == r1) goto L78
            int r4 = r4 + 1
            goto L5b
        L78:
            p94 r7 = r7.v0
            return r7
    }

    public final defpackage.of5 u(defpackage.xa6 r10, android.graphics.Rect r11, defpackage.ke6 r12) {
            r9 = this;
            xe r0 = new xe
            r0.<init>(r12)
            sm3 r10 = r10.c
            if0 r12 = r10.B0
            java.lang.Object r12 = r12.g
            z64 r12 = (defpackage.z64) r12
            int r1 = r12.R
            r1 = r1 & 8
            r2 = 0
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L78
        L16:
            if (r12 == 0) goto L78
            int r1 = r12.L
            r1 = r1 & 8
            if (r1 == 0) goto L6f
            r1 = r12
            r5 = r2
        L20:
            if (r1 == 0) goto L6f
            boolean r6 = r1 instanceof defpackage.va6
            if (r6 == 0) goto L32
            r6 = r1
            va6 r6 = (defpackage.va6) r6
            r6.A0(r0)
            boolean r6 = r0.A
            if (r6 == 0) goto L6a
            r2 = r1
            goto L78
        L32:
            int r6 = r1.L
            r6 = r6 & 8
            if (r6 == 0) goto L6a
            boolean r6 = r1 instanceof defpackage.zg1
            if (r6 == 0) goto L6a
            r6 = r1
            zg1 r6 = (defpackage.zg1) r6
            z64 r6 = r6.l0
            r7 = r4
        L42:
            if (r6 == 0) goto L67
            int r8 = r6.L
            r8 = r8 & 8
            if (r8 == 0) goto L64
            int r7 = r7 + 1
            if (r7 != r3) goto L50
            r1 = r6
            goto L64
        L50:
            if (r5 != 0) goto L5b
            ua4 r5 = new ua4
            r8 = 16
            z64[] r8 = new defpackage.z64[r8]
            r5.<init>(r8)
        L5b:
            if (r1 == 0) goto L61
            r5.b(r1)
            r1 = r2
        L61:
            r5.b(r6)
        L64:
            z64 r6 = r6.Y
            goto L42
        L67:
            if (r7 != r3) goto L6a
            goto L20
        L6a:
            z64 r1 = defpackage.nc1.A(r5)
            goto L20
        L6f:
            int r1 = r12.R
            r1 = r1 & 8
            if (r1 == 0) goto L78
            z64 r12 = r12.Y
            goto L16
        L78:
            va6 r2 = (defpackage.va6) r2
            if (r2 == 0) goto Lbb
            r12 = r2
            z64 r12 = (defpackage.z64) r12
            z64 r12 = r12.A
            boolean r12 = r12.j0
            if (r12 != r3) goto Lbb
            eg4 r10 = defpackage.nc1.e0(r2)
            jk3 r12 = defpackage.ej2.w(r10)
            of5 r10 = r12.O(r10, r4)
            float r12 = r10.a
            float r0 = r10.b
            float r1 = r10.c
            float r10 = r10.d
            android.graphics.Rect r9 = r9.M(r12, r0, r1, r10)
            int r10 = r9.left
            int r12 = r11.left
            int r10 = r10 - r12
            float r10 = (float) r10
            int r12 = r9.top
            int r11 = r11.top
            int r12 = r12 - r11
            float r11 = (float) r12
            of5 r12 = new of5
            int r0 = r9.width()
            float r0 = (float) r0
            float r0 = r0 + r10
            int r9 = r9.height()
            float r9 = (float) r9
            float r9 = r9 + r11
            r12.<init>(r10, r11, r0, r9)
            return r12
        Lbb:
            if0 r9 = r10.B0
            java.lang.Object r9 = r9.e
            eg4 r9 = (defpackage.eg4) r9
            of5 r9 = defpackage.ej2.k(r9, r4)
            return r9
    }

    public final boolean v() {
            r2 = this;
            android.view.accessibility.AccessibilityManager r0 = r2.Z
            boolean r1 = r0.isEnabled()
            if (r1 == 0) goto L1b
            java.util.List r1 = r2.e0
            if (r1 != 0) goto L13
            r1 = -1
            java.util.List r1 = r0.getEnabledAccessibilityServiceList(r1)
            r2.e0 = r1
        L13:
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L1b
            r2 = 1
            return r2
        L1b:
            r2 = 0
            return r2
    }

    public final void w(defpackage.sm3 r2) {
            r1 = this;
            zu r0 = r1.r0
            boolean r2 = r0.add(r2)
            if (r2 == 0) goto Lf
            v80 r1 = r1.s0
            jg7 r2 = defpackage.jg7.a
            r1.c(r2)
        Lf:
            return
    }
}

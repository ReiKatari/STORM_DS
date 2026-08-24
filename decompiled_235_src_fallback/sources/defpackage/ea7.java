package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ea7  reason: default package */
/* loaded from: classes.dex */
public abstract class ea7 implements java.lang.Cloneable {
    public static final android.animation.Animator[] w0 = null;
    public static final int[] x0 = null;
    public static final defpackage.x31 y0 = null;
    public static final java.lang.ThreadLocal z0 = null;
    public final java.lang.String A;
    public long B;
    public long L;
    public android.animation.TimeInterpolator R;
    public final java.util.ArrayList X;
    public final java.util.ArrayList Y;
    public defpackage.eb Z;
    public defpackage.eb d0;
    public defpackage.qa7 e0;
    public final int[] f0;
    public java.util.ArrayList g0;
    public java.util.ArrayList h0;
    public defpackage.da7[] i0;
    public final java.util.ArrayList j0;
    public android.animation.Animator[] k0;
    public int l0;
    public boolean m0;
    public boolean n0;
    public defpackage.ea7 o0;
    public java.util.ArrayList p0;
    public java.util.ArrayList q0;
    public defpackage.yh2 r0;
    public defpackage.x31 s0;
    public long t0;
    public defpackage.z97 u0;
    public long v0;

    static {
            r0 = 0
            android.animation.Animator[] r0 = new android.animation.Animator[r0]
            defpackage.ea7.w0 = r0
            r0 = 3
            r1 = 4
            r2 = 2
            r3 = 1
            int[] r0 = new int[]{r2, r3, r0, r1}
            defpackage.ea7.x0 = r0
            x31 r0 = new x31
            r1 = 29
            r0.<init>(r1)
            defpackage.ea7.y0 = r0
            java.lang.ThreadLocal r0 = new java.lang.ThreadLocal
            r0.<init>()
            defpackage.ea7.z0 = r0
            return
    }

    public ea7() {
            r3 = this;
            r3.<init>()
            java.lang.Class r0 = r3.getClass()
            java.lang.String r0 = r0.getName()
            r3.A = r0
            r0 = -1
            r3.B = r0
            r3.L = r0
            r0 = 0
            r3.R = r0
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.X = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.Y = r1
            eb r1 = new eb
            r2 = 24
            r1.<init>(r2)
            r3.Z = r1
            eb r1 = new eb
            r1.<init>(r2)
            r3.d0 = r1
            r3.e0 = r0
            int[] r1 = defpackage.ea7.x0
            r3.f0 = r1
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r3.j0 = r1
            android.animation.Animator[] r1 = defpackage.ea7.w0
            r3.k0 = r1
            r1 = 0
            r3.l0 = r1
            r3.m0 = r1
            r3.n0 = r1
            r3.o0 = r0
            r3.p0 = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r3.q0 = r0
            x31 r0 = defpackage.ea7.y0
            r3.s0 = r0
            return
    }

    public static void c(defpackage.eb r4, android.view.View r5, defpackage.sa7 r6) {
            java.lang.Object r0 = r4.B
            wu r0 = (defpackage.wu) r0
            java.lang.Object r1 = r4.X
            wu r1 = (defpackage.wu) r1
            java.lang.Object r2 = r4.L
            android.util.SparseArray r2 = (android.util.SparseArray) r2
            java.lang.Object r4 = r4.R
            hz3 r4 = (defpackage.hz3) r4
            r0.put(r5, r6)
            int r6 = r5.getId()
            r0 = 0
            if (r6 < 0) goto L27
            int r3 = r2.indexOfKey(r6)
            if (r3 < 0) goto L24
            r2.put(r6, r0)
            goto L27
        L24:
            r2.put(r6, r5)
        L27:
            java.util.WeakHashMap r6 = defpackage.ao7.a
            java.lang.String r6 = r5.getTransitionName()
            if (r6 == 0) goto L3c
            boolean r2 = r1.containsKey(r6)
            if (r2 == 0) goto L39
            r1.put(r6, r0)
            goto L3c
        L39:
            r1.put(r6, r5)
        L3c:
            android.view.ViewParent r6 = r5.getParent()
            boolean r6 = r6 instanceof android.widget.ListView
            if (r6 == 0) goto L79
            android.view.ViewParent r6 = r5.getParent()
            android.widget.ListView r6 = (android.widget.ListView) r6
            android.widget.ListAdapter r1 = r6.getAdapter()
            boolean r1 = r1.hasStableIds()
            if (r1 == 0) goto L79
            int r1 = r6.getPositionForView(r5)
            long r1 = r6.getItemIdAtPosition(r1)
            int r6 = r4.c(r1)
            if (r6 < 0) goto L72
            java.lang.Object r5 = r4.b(r1)
            android.view.View r5 = (android.view.View) r5
            if (r5 == 0) goto L79
            r6 = 0
            r5.setHasTransientState(r6)
            r4.f(r1, r0)
            return
        L72:
            r6 = 1
            r5.setHasTransientState(r6)
            r4.f(r1, r5)
        L79:
            return
    }

    public static defpackage.wu q() {
            java.lang.ThreadLocal r0 = defpackage.ea7.z0
            java.lang.Object r1 = r0.get()
            wu r1 = (defpackage.wu) r1
            if (r1 != 0) goto L13
            wu r1 = new wu
            r2 = 0
            r1.<init>(r2)
            r0.set(r1)
        L13:
            return r1
    }

    public static boolean z(defpackage.sa7 r0, defpackage.sa7 r1, java.lang.String r2) {
            java.util.HashMap r0 = r0.a
            java.lang.Object r0 = r0.get(r2)
            java.util.HashMap r1 = r1.a
            java.lang.Object r1 = r1.get(r2)
            if (r0 != 0) goto L12
            if (r1 != 0) goto L12
            r0 = 0
            return r0
        L12:
            r2 = 1
            if (r0 == 0) goto L1e
            if (r1 != 0) goto L18
            goto L1e
        L18:
            boolean r0 = r0.equals(r1)
            r0 = r0 ^ r2
            return r0
        L1e:
            return r2
    }

    public final void A(defpackage.ea7 r6, defpackage.fa6 r7, boolean r8) {
            r5 = this;
            ea7 r0 = r5.o0
            if (r0 == 0) goto L7
            r0.A(r6, r7, r8)
        L7:
            java.util.ArrayList r8 = r5.p0
            if (r8 == 0) goto L4c
            boolean r8 = r8.isEmpty()
            if (r8 != 0) goto L4c
            java.util.ArrayList r8 = r5.p0
            int r8 = r8.size()
            da7[] r0 = r5.i0
            if (r0 != 0) goto L1d
            da7[] r0 = new defpackage.da7[r8]
        L1d:
            r1 = 0
            r5.i0 = r1
            java.util.ArrayList r2 = r5.p0
            java.lang.Object[] r0 = r2.toArray(r0)
            da7[] r0 = (defpackage.da7[]) r0
            r2 = 0
        L29:
            if (r2 >= r8) goto L4a
            r3 = r0[r2]
            int r4 = r7.A
            switch(r4) {
                case 8: goto L42;
                case 9: goto L3e;
                case 10: goto L3a;
                case 11: goto L36;
                default: goto L32;
            }
        L32:
            r3.e()
            goto L45
        L36:
            r3.b()
            goto L45
        L3a:
            r3.f(r6)
            goto L45
        L3e:
            r3.a(r6)
            goto L45
        L42:
            r3.d(r6)
        L45:
            r0[r2] = r1
            int r2 = r2 + 1
            goto L29
        L4a:
            r5.i0 = r0
        L4c:
            return
    }

    public void B(android.view.View r5) {
            r4 = this;
            boolean r5 = r4.n0
            if (r5 != 0) goto L2f
            java.util.ArrayList r5 = r4.j0
            int r0 = r5.size()
            android.animation.Animator[] r1 = r4.k0
            java.lang.Object[] r5 = r5.toArray(r1)
            android.animation.Animator[] r5 = (android.animation.Animator[]) r5
            android.animation.Animator[] r1 = defpackage.ea7.w0
            r4.k0 = r1
            r1 = 1
            int r0 = r0 - r1
        L18:
            if (r0 < 0) goto L25
            r2 = r5[r0]
            r3 = 0
            r5[r0] = r3
            r2.pause()
            int r0 = r0 + (-1)
            goto L18
        L25:
            r4.k0 = r5
            fa6 r5 = defpackage.fa6.X
            r0 = 0
            r4.A(r4, r5, r0)
            r4.m0 = r1
        L2f:
            return
    }

    public void C() {
            r10 = this;
            wu r0 = q()
            r1 = 0
            r10.t0 = r1
            r3 = 0
        L9:
            java.util.ArrayList r4 = r10.q0
            int r4 = r4.size()
            java.util.ArrayList r5 = r10.q0
            if (r3 >= r4) goto L57
            java.lang.Object r4 = r5.get(r3)
            android.animation.Animator r4 = (android.animation.Animator) r4
            java.lang.Object r5 = r0.get(r4)
            u97 r5 = (defpackage.u97) r5
            if (r4 == 0) goto L54
            if (r5 == 0) goto L54
            android.animation.Animator r5 = r5.f
            long r6 = r10.L
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 < 0) goto L2e
            r5.setDuration(r6)
        L2e:
            long r6 = r10.B
            int r8 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r8 < 0) goto L3c
            long r8 = r5.getStartDelay()
            long r8 = r8 + r6
            r5.setStartDelay(r8)
        L3c:
            android.animation.TimeInterpolator r6 = r10.R
            if (r6 == 0) goto L43
            r5.setInterpolator(r6)
        L43:
            java.util.ArrayList r5 = r10.j0
            r5.add(r4)
            long r5 = r10.t0
            long r7 = r4.getTotalDuration()
            long r4 = java.lang.Math.max(r5, r7)
            r10.t0 = r4
        L54:
            int r3 = r3 + 1
            goto L9
        L57:
            r5.clear()
            return
    }

    public defpackage.ea7 D(defpackage.da7 r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.p0
            if (r0 != 0) goto L5
            goto L1d
        L5:
            boolean r0 = r0.remove(r2)
            if (r0 != 0) goto L12
            ea7 r0 = r1.o0
            if (r0 == 0) goto L12
            r0.D(r2)
        L12:
            java.util.ArrayList r2 = r1.p0
            int r2 = r2.size()
            if (r2 != 0) goto L1d
            r2 = 0
            r1.p0 = r2
        L1d:
            return r1
    }

    public void E(android.view.View r1) {
            r0 = this;
            java.util.ArrayList r0 = r0.Y
            r0.remove(r1)
            return
    }

    public void F(android.view.View r5) {
            r4 = this;
            boolean r5 = r4.m0
            if (r5 == 0) goto L33
            boolean r5 = r4.n0
            r0 = 0
            if (r5 != 0) goto L31
            java.util.ArrayList r5 = r4.j0
            int r1 = r5.size()
            android.animation.Animator[] r2 = r4.k0
            java.lang.Object[] r5 = r5.toArray(r2)
            android.animation.Animator[] r5 = (android.animation.Animator[]) r5
            android.animation.Animator[] r2 = defpackage.ea7.w0
            r4.k0 = r2
            int r1 = r1 + (-1)
        L1d:
            if (r1 < 0) goto L2a
            r2 = r5[r1]
            r3 = 0
            r5[r1] = r3
            r2.resume()
            int r1 = r1 + (-1)
            goto L1d
        L2a:
            r4.k0 = r5
            fa6 r5 = defpackage.fa6.Y
            r4.A(r4, r5, r0)
        L31:
            r4.m0 = r0
        L33:
            return
    }

    public void G() {
            r10 = this;
            r10.O()
            wu r0 = q()
            java.util.ArrayList r1 = r10.q0
            int r2 = r1.size()
            r3 = 0
        Le:
            if (r3 >= r2) goto L59
            java.lang.Object r4 = r1.get(r3)
            int r3 = r3 + 1
            android.animation.Animator r4 = (android.animation.Animator) r4
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto Le
            r10.O()
            if (r4 == 0) goto Le
            t97 r5 = new t97
            r5.<init>(r10, r0)
            r4.addListener(r5)
            long r5 = r10.L
            r7 = 0
            int r9 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r9 < 0) goto L36
            r4.setDuration(r5)
        L36:
            long r5 = r10.B
            int r7 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r7 < 0) goto L44
            long r7 = r4.getStartDelay()
            long r7 = r7 + r5
            r4.setStartDelay(r7)
        L44:
            android.animation.TimeInterpolator r5 = r10.R
            if (r5 == 0) goto L4b
            r4.setInterpolator(r5)
        L4b:
            s7 r5 = new s7
            r6 = 8
            r5.<init>(r10, r6)
            r4.addListener(r5)
            r4.start()
            goto Le
        L59:
            java.util.ArrayList r0 = r10.q0
            r0.clear()
            r10.n()
            return
    }

    public void H(long r19, long r21) {
            r18 = this;
            r0 = r18
            r1 = r19
            long r3 = r0.t0
            int r5 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            r6 = 0
            r7 = 1
            if (r5 >= 0) goto Le
            r5 = r7
            goto Lf
        Le:
            r5 = r6
        Lf:
            r8 = 0
            int r10 = (r21 > r8 ? 1 : (r21 == r8 ? 0 : -1))
            if (r10 >= 0) goto L19
            int r11 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r11 >= 0) goto L21
        L19:
            int r11 = (r21 > r3 ? 1 : (r21 == r3 ? 0 : -1))
            if (r11 <= 0) goto L28
            int r11 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r11 > 0) goto L28
        L21:
            r0.n0 = r6
            fa6 r11 = defpackage.fa6.B
            r0.A(r0, r11, r5)
        L28:
            java.util.ArrayList r11 = r0.j0
            int r12 = r11.size()
            android.animation.Animator[] r13 = r0.k0
            java.lang.Object[] r11 = r11.toArray(r13)
            android.animation.Animator[] r11 = (android.animation.Animator[]) r11
            android.animation.Animator[] r13 = defpackage.ea7.w0
            r0.k0 = r13
        L3a:
            if (r6 >= r12) goto L59
            r13 = r11[r6]
            r14 = 0
            r11[r6] = r14
            long r14 = r13.getTotalDuration()
            r16 = r3
            long r3 = java.lang.Math.max(r8, r1)
            long r3 = java.lang.Math.min(r3, r14)
            android.animation.AnimatorSet r13 = (android.animation.AnimatorSet) r13
            defpackage.q66.q(r13, r3)
            int r6 = r6 + 1
            r3 = r16
            goto L3a
        L59:
            r16 = r3
            r0.k0 = r11
            int r3 = (r1 > r16 ? 1 : (r1 == r16 ? 0 : -1))
            if (r3 <= 0) goto L65
            int r4 = (r21 > r16 ? 1 : (r21 == r16 ? 0 : -1))
            if (r4 <= 0) goto L6b
        L65:
            int r1 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r1 >= 0) goto L74
            if (r10 < 0) goto L74
        L6b:
            if (r3 <= 0) goto L6f
            r0.n0 = r7
        L6f:
            fa6 r1 = defpackage.fa6.L
            r0.A(r0, r1, r5)
        L74:
            return
    }

    public void I(long r1) {
            r0 = this;
            r0.L = r1
            return
    }

    public void J(defpackage.yh2 r1) {
            r0 = this;
            r0.r0 = r1
            return
    }

    public void K(android.animation.TimeInterpolator r1) {
            r0 = this;
            r0.R = r1
            return
    }

    public void L(defpackage.x31 r1) {
            r0 = this;
            if (r1 != 0) goto L7
            x31 r1 = defpackage.ea7.y0
            r0.s0 = r1
            return
        L7:
            r0.s0 = r1
            return
    }

    public void M() {
            r0 = this;
            return
    }

    public void N(long r1) {
            r0 = this;
            r0.B = r1
            return
    }

    public final void O() {
            r2 = this;
            int r0 = r2.l0
            if (r0 != 0) goto Lc
            fa6 r0 = defpackage.fa6.B
            r1 = 0
            r2.A(r2, r0, r1)
            r2.n0 = r1
        Lc:
            int r0 = r2.l0
            int r0 = r0 + 1
            r2.l0 = r0
            return
    }

    public java.lang.String P(java.lang.String r8) {
            r7 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>(r8)
            java.lang.Class r8 = r7.getClass()
            java.lang.String r8 = r8.getSimpleName()
            r0.append(r8)
            java.lang.String r8 = "@"
            r0.append(r8)
            int r8 = r7.hashCode()
            java.lang.String r8 = java.lang.Integer.toHexString(r8)
            r0.append(r8)
            java.lang.String r8 = ": "
            r0.append(r8)
            long r1 = r7.L
            r3 = -1
            int r8 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            java.lang.String r1 = ") "
            if (r8 == 0) goto L3c
            java.lang.String r8 = "dur("
            r0.append(r8)
            long r5 = r7.L
            r0.append(r5)
            r0.append(r1)
        L3c:
            long r5 = r7.B
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 == 0) goto L4f
            java.lang.String r8 = "dly("
            r0.append(r8)
            long r2 = r7.B
            r0.append(r2)
            r0.append(r1)
        L4f:
            android.animation.TimeInterpolator r8 = r7.R
            if (r8 == 0) goto L60
            java.lang.String r8 = "interp("
            r0.append(r8)
            android.animation.TimeInterpolator r8 = r7.R
            r0.append(r8)
            r0.append(r1)
        L60:
            java.util.ArrayList r8 = r7.X
            int r1 = r8.size()
            java.util.ArrayList r7 = r7.Y
            if (r1 > 0) goto L70
            int r1 = r7.size()
            if (r1 <= 0) goto Lb4
        L70:
            java.lang.String r1 = "tgts("
            r0.append(r1)
            int r1 = r8.size()
            java.lang.String r2 = ", "
            r3 = 0
            if (r1 <= 0) goto L94
            r1 = r3
        L7f:
            int r4 = r8.size()
            if (r1 >= r4) goto L94
            if (r1 <= 0) goto L8a
            r0.append(r2)
        L8a:
            java.lang.Object r4 = r8.get(r1)
            r0.append(r4)
            int r1 = r1 + 1
            goto L7f
        L94:
            int r8 = r7.size()
            if (r8 <= 0) goto Laf
        L9a:
            int r8 = r7.size()
            if (r3 >= r8) goto Laf
            if (r3 <= 0) goto La5
            r0.append(r2)
        La5:
            java.lang.Object r8 = r7.get(r3)
            r0.append(r8)
            int r3 = r3 + 1
            goto L9a
        Laf:
            java.lang.String r7 = ")"
            r0.append(r7)
        Lb4:
            java.lang.String r7 = r0.toString()
            return r7
    }

    public void a(defpackage.da7 r2) {
            r1 = this;
            java.util.ArrayList r0 = r1.p0
            if (r0 != 0) goto Lb
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.p0 = r0
        Lb:
            java.util.ArrayList r1 = r1.p0
            r1.add(r2)
            return
    }

    public void b(android.view.View r1) {
            r0 = this;
            java.util.ArrayList r0 = r0.Y
            r0.add(r1)
            return
    }

    public void cancel() {
            r4 = this;
            java.util.ArrayList r0 = r4.j0
            int r1 = r0.size()
            android.animation.Animator[] r2 = r4.k0
            java.lang.Object[] r0 = r0.toArray(r2)
            android.animation.Animator[] r0 = (android.animation.Animator[]) r0
            android.animation.Animator[] r2 = defpackage.ea7.w0
            r4.k0 = r2
            int r1 = r1 + (-1)
        L14:
            if (r1 < 0) goto L21
            r2 = r0[r1]
            r3 = 0
            r0[r1] = r3
            r2.cancel()
            int r1 = r1 + (-1)
            goto L14
        L21:
            r4.k0 = r0
            fa6 r0 = defpackage.fa6.R
            r1 = 0
            r4.A(r4, r0, r1)
            return
    }

    public /* bridge */ /* synthetic */ java.lang.Object clone() {
            r0 = this;
            ea7 r0 = r0.k()
            return r0
    }

    public abstract void d(defpackage.sa7 r1);

    public final void e(android.view.View r3, boolean r4) {
            r2 = this;
            if (r3 != 0) goto L3
            goto L48
        L3:
            r3.getId()
            android.view.ViewParent r0 = r3.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L31
            sa7 r0 = new sa7
            r0.<init>(r3)
            if (r4 == 0) goto L19
            r2.g(r0)
            goto L1c
        L19:
            r2.d(r0)
        L1c:
            java.util.ArrayList r1 = r0.c
            r1.add(r2)
            r2.f(r0)
            if (r4 == 0) goto L2c
            eb r1 = r2.Z
            c(r1, r3, r0)
            goto L31
        L2c:
            eb r1 = r2.d0
            c(r1, r3, r0)
        L31:
            boolean r0 = r3 instanceof android.view.ViewGroup
            if (r0 == 0) goto L48
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 0
        L38:
            int r1 = r3.getChildCount()
            if (r0 >= r1) goto L48
            android.view.View r1 = r3.getChildAt(r0)
            r2.e(r1, r4)
            int r0 = r0 + 1
            goto L38
        L48:
            return
    }

    public void f(defpackage.sa7 r1) {
            r0 = this;
            return
    }

    public abstract void g(defpackage.sa7 r1);

    public final void i(android.view.ViewGroup r8, boolean r9) {
            r7 = this;
            r7.j(r9)
            java.util.ArrayList r0 = r7.X
            int r1 = r0.size()
            java.util.ArrayList r2 = r7.Y
            if (r1 > 0) goto L18
            int r1 = r2.size()
            if (r1 <= 0) goto L14
            goto L18
        L14:
            r7.e(r8, r9)
            return
        L18:
            r1 = 0
            r3 = r1
        L1a:
            int r4 = r0.size()
            if (r3 >= r4) goto L56
            java.lang.Object r4 = r0.get(r3)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            android.view.View r4 = r8.findViewById(r4)
            if (r4 == 0) goto L53
            sa7 r5 = new sa7
            r5.<init>(r4)
            if (r9 == 0) goto L3b
            r7.g(r5)
            goto L3e
        L3b:
            r7.d(r5)
        L3e:
            java.util.ArrayList r6 = r5.c
            r6.add(r7)
            r7.f(r5)
            if (r9 == 0) goto L4e
            eb r6 = r7.Z
            c(r6, r4, r5)
            goto L53
        L4e:
            eb r6 = r7.d0
            c(r6, r4, r5)
        L53:
            int r3 = r3 + 1
            goto L1a
        L56:
            int r8 = r2.size()
            if (r1 >= r8) goto L88
            java.lang.Object r8 = r2.get(r1)
            android.view.View r8 = (android.view.View) r8
            sa7 r0 = new sa7
            r0.<init>(r8)
            if (r9 == 0) goto L6d
            r7.g(r0)
            goto L70
        L6d:
            r7.d(r0)
        L70:
            java.util.ArrayList r3 = r0.c
            r3.add(r7)
            r7.f(r0)
            if (r9 == 0) goto L80
            eb r3 = r7.Z
            c(r3, r8, r0)
            goto L85
        L80:
            eb r3 = r7.d0
            c(r3, r8, r0)
        L85:
            int r1 = r1 + 1
            goto L56
        L88:
            return
    }

    public final void j(boolean r1) {
            r0 = this;
            if (r1 == 0) goto L1e
            eb r1 = r0.Z
            java.lang.Object r1 = r1.B
            wu r1 = (defpackage.wu) r1
            r1.clear()
            eb r1 = r0.Z
            java.lang.Object r1 = r1.L
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            r1.clear()
            eb r0 = r0.Z
            java.lang.Object r0 = r0.R
            hz3 r0 = (defpackage.hz3) r0
            r0.a()
            return
        L1e:
            eb r1 = r0.d0
            java.lang.Object r1 = r1.B
            wu r1 = (defpackage.wu) r1
            r1.clear()
            eb r1 = r0.d0
            java.lang.Object r1 = r1.L
            android.util.SparseArray r1 = (android.util.SparseArray) r1
            r1.clear()
            eb r0 = r0.d0
            java.lang.Object r0 = r0.R
            hz3 r0 = (defpackage.hz3) r0
            r0.a()
            return
    }

    public defpackage.ea7 k() {
            r3 = this;
            java.lang.Object r0 = super.clone()     // Catch: java.lang.CloneNotSupportedException -> L29
            ea7 r0 = (defpackage.ea7) r0     // Catch: java.lang.CloneNotSupportedException -> L29
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.CloneNotSupportedException -> L29
            r1.<init>()     // Catch: java.lang.CloneNotSupportedException -> L29
            r0.q0 = r1     // Catch: java.lang.CloneNotSupportedException -> L29
            eb r1 = new eb     // Catch: java.lang.CloneNotSupportedException -> L29
            r2 = 24
            r1.<init>(r2)     // Catch: java.lang.CloneNotSupportedException -> L29
            r0.Z = r1     // Catch: java.lang.CloneNotSupportedException -> L29
            eb r1 = new eb     // Catch: java.lang.CloneNotSupportedException -> L29
            r1.<init>(r2)     // Catch: java.lang.CloneNotSupportedException -> L29
            r0.d0 = r1     // Catch: java.lang.CloneNotSupportedException -> L29
            r1 = 0
            r0.g0 = r1     // Catch: java.lang.CloneNotSupportedException -> L29
            r0.h0 = r1     // Catch: java.lang.CloneNotSupportedException -> L29
            r0.u0 = r1     // Catch: java.lang.CloneNotSupportedException -> L29
            r0.o0 = r3     // Catch: java.lang.CloneNotSupportedException -> L29
            r0.p0 = r1     // Catch: java.lang.CloneNotSupportedException -> L29
            return r0
        L29:
            r3 = move-exception
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>(r3)
            throw r0
    }

    public android.animation.Animator l(android.view.ViewGroup r1, defpackage.sa7 r2, defpackage.sa7 r3) {
            r0 = this;
            r0 = 0
            return r0
    }

    public void m(android.view.ViewGroup r20, defpackage.eb r21, defpackage.eb r22, java.util.ArrayList r23, java.util.ArrayList r24) {
            r19 = this;
            r0 = r19
            wu r1 = q()
            android.util.SparseIntArray r2 = new android.util.SparseIntArray
            r2.<init>()
            int r3 = r23.size()
            ea7 r4 = r0.p()
            z97 r4 = r4.u0
            if (r4 == 0) goto L19
            r4 = 1
            goto L1a
        L19:
            r4 = 0
        L1a:
            r6 = 0
        L1b:
            if (r6 >= r3) goto L111
            r7 = r23
            java.lang.Object r8 = r7.get(r6)
            sa7 r8 = (defpackage.sa7) r8
            r9 = r24
            java.lang.Object r10 = r9.get(r6)
            sa7 r10 = (defpackage.sa7) r10
            if (r8 == 0) goto L38
            java.util.ArrayList r12 = r8.c
            boolean r12 = r12.contains(r0)
            if (r12 != 0) goto L38
            r8 = 0
        L38:
            if (r10 == 0) goto L43
            java.util.ArrayList r12 = r10.c
            boolean r12 = r12.contains(r0)
            if (r12 != 0) goto L43
            r10 = 0
        L43:
            if (r8 != 0) goto L4f
            if (r10 != 0) goto L4f
        L47:
            r12 = r20
        L49:
            r16 = r3
            r17 = r4
            goto L109
        L4f:
            if (r8 == 0) goto L59
            if (r10 == 0) goto L59
            boolean r12 = r0.w(r8, r10)
            if (r12 == 0) goto L47
        L59:
            r12 = r20
            android.animation.Animator r13 = r0.l(r12, r8, r10)
            if (r13 == 0) goto L49
            java.lang.String r14 = r0.A
            if (r10 == 0) goto Ld8
            android.view.View r8 = r10.b
            java.lang.String[] r10 = r0.s()
            if (r10 == 0) goto Lcf
            int r15 = r10.length
            if (r15 <= 0) goto Lcf
            sa7 r15 = new sa7
            r15.<init>(r8)
            r5 = r22
            java.lang.Object r11 = r5.B
            wu r11 = (defpackage.wu) r11
            java.lang.Object r11 = r11.get(r8)
            sa7 r11 = (defpackage.sa7) r11
            r16 = r3
            r17 = r4
            if (r11 == 0) goto L9f
            r3 = 0
        L88:
            int r4 = r10.length
            if (r3 >= r4) goto L9f
            r4 = r10[r3]
            r18 = r3
            java.util.HashMap r3 = r11.a
            java.lang.Object r3 = r3.get(r4)
            java.util.HashMap r5 = r15.a
            r5.put(r4, r3)
            int r3 = r18 + 1
            r5 = r22
            goto L88
        L9f:
            int r3 = r1.L
            r4 = 0
        La2:
            if (r4 >= r3) goto Lcd
            java.lang.Object r5 = r1.f(r4)
            android.animation.Animator r5 = (android.animation.Animator) r5
            java.lang.Object r5 = r1.get(r5)
            u97 r5 = (defpackage.u97) r5
            sa7 r10 = r5.c
            if (r10 == 0) goto Lca
            android.view.View r10 = r5.a
            if (r10 != r8) goto Lca
            java.lang.String r10 = r5.b
            boolean r10 = r10.equals(r14)
            if (r10 == 0) goto Lca
            sa7 r5 = r5.c
            boolean r5 = r5.equals(r15)
            if (r5 == 0) goto Lca
            r11 = 0
            goto Ld5
        Lca:
            int r4 = r4 + 1
            goto La2
        Lcd:
            r11 = r13
            goto Ld5
        Lcf:
            r16 = r3
            r17 = r4
            r11 = r13
            r15 = 0
        Ld5:
            r13 = r11
            r11 = r15
            goto Ldf
        Ld8:
            r16 = r3
            r17 = r4
            android.view.View r8 = r8.b
            r11 = 0
        Ldf:
            if (r13 == 0) goto L109
            u97 r3 = new u97
            android.view.WindowId r4 = r12.getWindowId()
            r3.<init>()
            r3.a = r8
            r3.b = r14
            r3.c = r11
            r3.d = r4
            r3.e = r0
            r3.f = r13
            if (r17 == 0) goto L101
            android.animation.AnimatorSet r4 = new android.animation.AnimatorSet
            r4.<init>()
            r4.play(r13)
            r13 = r4
        L101:
            r1.put(r13, r3)
            java.util.ArrayList r3 = r0.q0
            r3.add(r13)
        L109:
            int r6 = r6 + 1
            r3 = r16
            r4 = r17
            goto L1b
        L111:
            int r3 = r2.size()
            if (r3 == 0) goto L14a
            r5 = 0
        L118:
            int r3 = r2.size()
            if (r5 >= r3) goto L14a
            int r3 = r2.keyAt(r5)
            java.util.ArrayList r4 = r0.q0
            java.lang.Object r3 = r4.get(r3)
            android.animation.Animator r3 = (android.animation.Animator) r3
            java.lang.Object r3 = r1.get(r3)
            u97 r3 = (defpackage.u97) r3
            int r4 = r2.valueAt(r5)
            long r6 = (long) r4
            r8 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            long r6 = r6 - r8
            android.animation.Animator r4 = r3.f
            long r8 = r4.getStartDelay()
            long r8 = r8 + r6
            android.animation.Animator r3 = r3.f
            r3.setStartDelay(r8)
            int r5 = r5 + 1
            goto L118
        L14a:
            return
    }

    public final void n() {
            r4 = this;
            int r0 = r4.l0
            r1 = 1
            int r0 = r0 - r1
            r4.l0 = r0
            if (r0 != 0) goto L52
            fa6 r0 = defpackage.fa6.L
            r2 = 0
            r4.A(r4, r0, r2)
            r0 = r2
        Lf:
            eb r3 = r4.Z
            java.lang.Object r3 = r3.R
            hz3 r3 = (defpackage.hz3) r3
            int r3 = r3.i()
            if (r0 >= r3) goto L2f
            eb r3 = r4.Z
            java.lang.Object r3 = r3.R
            hz3 r3 = (defpackage.hz3) r3
            java.lang.Object r3 = r3.j(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L2c
            r3.setHasTransientState(r2)
        L2c:
            int r0 = r0 + 1
            goto Lf
        L2f:
            r0 = r2
        L30:
            eb r3 = r4.d0
            java.lang.Object r3 = r3.R
            hz3 r3 = (defpackage.hz3) r3
            int r3 = r3.i()
            if (r0 >= r3) goto L50
            eb r3 = r4.d0
            java.lang.Object r3 = r3.R
            hz3 r3 = (defpackage.hz3) r3
            java.lang.Object r3 = r3.j(r0)
            android.view.View r3 = (android.view.View) r3
            if (r3 == 0) goto L4d
            r3.setHasTransientState(r2)
        L4d:
            int r0 = r0 + 1
            goto L30
        L50:
            r4.n0 = r1
        L52:
            return
    }

    public final defpackage.sa7 o(android.view.View r5, boolean r6) {
            r4 = this;
            qa7 r0 = r4.e0
            if (r0 == 0) goto L9
            sa7 r4 = r0.o(r5, r6)
            return r4
        L9:
            if (r6 == 0) goto Le
            java.util.ArrayList r0 = r4.g0
            goto L10
        Le:
            java.util.ArrayList r0 = r4.h0
        L10:
            if (r0 != 0) goto L13
            goto L3c
        L13:
            int r1 = r0.size()
            r2 = 0
        L18:
            if (r2 >= r1) goto L2b
            java.lang.Object r3 = r0.get(r2)
            sa7 r3 = (defpackage.sa7) r3
            if (r3 != 0) goto L23
            goto L3c
        L23:
            android.view.View r3 = r3.b
            if (r3 != r5) goto L28
            goto L2c
        L28:
            int r2 = r2 + 1
            goto L18
        L2b:
            r2 = -1
        L2c:
            if (r2 < 0) goto L3c
            if (r6 == 0) goto L33
            java.util.ArrayList r4 = r4.h0
            goto L35
        L33:
            java.util.ArrayList r4 = r4.g0
        L35:
            java.lang.Object r4 = r4.get(r2)
            sa7 r4 = (defpackage.sa7) r4
            return r4
        L3c:
            r4 = 0
            return r4
    }

    public final defpackage.ea7 p() {
            r1 = this;
            qa7 r0 = r1.e0
            if (r0 == 0) goto L8
            ea7 r1 = r0.p()
        L8:
            return r1
    }

    public java.lang.String[] s() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final defpackage.sa7 t(android.view.View r2, boolean r3) {
            r1 = this;
            qa7 r0 = r1.e0
            if (r0 == 0) goto L9
            sa7 r1 = r0.t(r2, r3)
            return r1
        L9:
            if (r3 == 0) goto Le
            eb r1 = r1.Z
            goto L10
        Le:
            eb r1 = r1.d0
        L10:
            java.lang.Object r1 = r1.B
            wu r1 = (defpackage.wu) r1
            java.lang.Object r1 = r1.get(r2)
            sa7 r1 = (defpackage.sa7) r1
            return r1
    }

    public final java.lang.String toString() {
            r1 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = r1.P(r0)
            return r1
    }

    public boolean u() {
            r0 = this;
            java.util.ArrayList r0 = r0.j0
            boolean r0 = r0.isEmpty()
            r0 = r0 ^ 1
            return r0
    }

    public abstract boolean v();

    public boolean w(defpackage.sa7 r5, defpackage.sa7 r6) {
            r4 = this;
            r0 = 0
            if (r5 == 0) goto L39
            if (r6 == 0) goto L39
            java.lang.String[] r4 = r4.s()
            if (r4 == 0) goto L1b
            int r1 = r4.length
            r2 = r0
        Ld:
            if (r2 >= r1) goto L39
            r3 = r4[r2]
            boolean r3 = z(r5, r6, r3)
            if (r3 == 0) goto L18
            goto L37
        L18:
            int r2 = r2 + 1
            goto Ld
        L1b:
            java.util.HashMap r4 = r5.a
            java.util.Set r4 = r4.keySet()
            java.util.Iterator r4 = r4.iterator()
        L25:
            boolean r1 = r4.hasNext()
            if (r1 == 0) goto L39
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            boolean r1 = z(r5, r6, r1)
            if (r1 == 0) goto L25
        L37:
            r4 = 1
            return r4
        L39:
            return r0
    }

    public final boolean y(android.view.View r5) {
            r4 = this;
            int r0 = r5.getId()
            java.util.ArrayList r1 = r4.X
            int r2 = r1.size()
            r3 = 1
            java.util.ArrayList r4 = r4.Y
            if (r2 != 0) goto L16
            int r2 = r4.size()
            if (r2 != 0) goto L16
            return r3
        L16:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            boolean r0 = r1.contains(r0)
            if (r0 != 0) goto L29
            boolean r4 = r4.contains(r5)
            if (r4 == 0) goto L27
            goto L29
        L27:
            r4 = 0
            return r4
        L29:
            return r3
    }
}

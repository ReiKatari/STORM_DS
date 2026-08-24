package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z9  reason: default package */
/* loaded from: classes.dex */
public final class z9 {
    public int a;
    public java.lang.Object b;
    public java.lang.Object c;
    public java.lang.Object d;
    public java.lang.Object e;
    public java.lang.Object f;

    public z9() {
            r2 = this;
            r2.<init>()
            r0 = 32
            hy2[] r1 = new defpackage.hy2[r0]
            r2.b = r1
            float[] r1 = new float[r0]
            r2.c = r1
            byte[] r0 = new byte[r0]
            r2.d = r0
            ka4 r0 = defpackage.c66.a
            ka4 r0 = new ka4
            r0.<init>()
            r2.e = r0
            ka4 r0 = new ka4
            r0.<init>()
            r2.f = r0
            return
    }

    public z9(android.view.View r2) {
            r1 = this;
            r1.<init>()
            r0 = -1
            r1.a = r0
            r1.b = r2
            ir r2 = defpackage.ir.a()
            r1.c = r2
            return
    }

    public void a() {
            r5 = this;
            java.lang.Object r0 = r5.b
            android.view.View r0 = (android.view.View) r0
            android.graphics.drawable.Drawable r1 = r0.getBackground()
            if (r1 == 0) goto L6d
            java.lang.Object r2 = r5.d
            wz0 r2 = (defpackage.wz0) r2
            if (r2 == 0) goto L52
            java.lang.Object r2 = r5.f
            wz0 r2 = (defpackage.wz0) r2
            if (r2 != 0) goto L1d
            wz0 r2 = new wz0
            r2.<init>()
            r5.f = r2
        L1d:
            java.lang.Object r2 = r5.f
            wz0 r2 = (defpackage.wz0) r2
            r3 = 0
            r2.c = r3
            r4 = 0
            r2.b = r4
            r2.d = r3
            r2.a = r4
            java.util.WeakHashMap r3 = defpackage.ao7.a
            android.content.res.ColorStateList r3 = r0.getBackgroundTintList()
            r4 = 1
            if (r3 == 0) goto L38
            r2.b = r4
            r2.c = r3
        L38:
            android.graphics.PorterDuff$Mode r3 = r0.getBackgroundTintMode()
            if (r3 == 0) goto L42
            r2.a = r4
            r2.d = r3
        L42:
            boolean r3 = r2.b
            if (r3 != 0) goto L4a
            boolean r3 = r2.a
            if (r3 == 0) goto L52
        L4a:
            int[] r5 = r0.getDrawableState()
            defpackage.ir.e(r1, r2, r5)
            return
        L52:
            java.lang.Object r2 = r5.e
            wz0 r2 = (defpackage.wz0) r2
            if (r2 == 0) goto L60
            int[] r5 = r0.getDrawableState()
            defpackage.ir.e(r1, r2, r5)
            return
        L60:
            java.lang.Object r5 = r5.d
            wz0 r5 = (defpackage.wz0) r5
            if (r5 == 0) goto L6d
            int[] r0 = r0.getDrawableState()
            defpackage.ir.e(r1, r5, r0)
        L6d:
            return
    }

    public boolean b(int r9) {
            r8 = this;
            java.lang.Object r0 = r8.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L3c
            java.lang.Object r4 = r0.get(r3)
            y9 r4 = (defpackage.y9) r4
            int r5 = r4.a
            r6 = 8
            r7 = 1
            if (r5 != r6) goto L24
            int r4 = r4.d
            int r5 = r3 + 1
            int r4 = r8.g(r4, r5)
            if (r4 != r9) goto L39
            goto L35
        L24:
            if (r5 != r7) goto L39
            int r5 = r4.b
            int r4 = r4.d
            int r4 = r4 + r5
        L2b:
            if (r5 >= r4) goto L39
            int r6 = r3 + 1
            int r6 = r8.g(r5, r6)
            if (r6 != r9) goto L36
        L35:
            return r7
        L36:
            int r5 = r5 + 1
            goto L2b
        L39:
            int r3 = r3 + 1
            goto La
        L3c:
            return r2
    }

    public void c() {
            r6 = this;
            java.lang.Object r0 = r6.d
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r1 = r0.size()
            r2 = 0
            r3 = r2
        La:
            if (r3 >= r1) goto L1c
            java.lang.Object r4 = r6.e
            uf5 r4 = (defpackage.uf5) r4
            java.lang.Object r5 = r0.get(r3)
            y9 r5 = (defpackage.y9) r5
            r4.a(r5)
            int r3 = r3 + 1
            goto La
        L1c:
            r6.r(r0)
            r6.a = r2
            return
    }

    public void d() {
            r9 = this;
            java.lang.Object r0 = r9.e
            uf5 r0 = (defpackage.uf5) r0
            r9.c()
            java.lang.Object r1 = r9.c
            java.util.ArrayList r1 = (java.util.ArrayList) r1
            int r2 = r1.size()
            r3 = 0
            r4 = r3
        L11:
            if (r4 >= r2) goto L64
            java.lang.Object r5 = r1.get(r4)
            y9 r5 = (defpackage.y9) r5
            int r6 = r5.a
            r7 = 1
            if (r6 == r7) goto L57
            r8 = 2
            if (r6 == r8) goto L41
            r7 = 4
            if (r6 == r7) goto L34
            r7 = 8
            if (r6 == r7) goto L29
            goto L61
        L29:
            r0.a(r5)
            int r6 = r5.b
            int r5 = r5.d
            r0.f(r6, r5)
            goto L61
        L34:
            r0.a(r5)
            int r6 = r5.b
            int r7 = r5.d
            java.lang.Object r5 = r5.c
            r0.d(r5, r6, r7)
            goto L61
        L41:
            r0.a(r5)
            int r6 = r5.b
            int r5 = r5.d
            androidx.recyclerview.widget.RecyclerView r8 = r0.A
            r8.T(r6, r7, r5)
            r8.g1 = r7
            sg5 r6 = r8.d1
            int r7 = r6.c
            int r7 = r7 + r5
            r6.c = r7
            goto L61
        L57:
            r0.a(r5)
            int r6 = r5.b
            int r5 = r5.d
            r0.e(r6, r5)
        L61:
            int r4 = r4 + 1
            goto L11
        L64:
            r9.r(r1)
            r9.a = r3
            return
    }

    public void e(defpackage.y9 r14) {
            r13 = this;
            java.lang.Object r0 = r13.b
            tz4 r0 = (defpackage.tz4) r0
            int r1 = r14.a
            r2 = 1
            if (r1 == r2) goto L79
            r3 = 8
            if (r1 == r3) goto L79
            int r3 = r14.b
            int r1 = r13.v(r3, r1)
            int r3 = r14.b
            int r4 = r14.a
            r5 = 2
            r6 = 4
            if (r4 == r5) goto L25
            if (r4 != r6) goto L1f
            r4 = r2
            goto L26
        L1f:
            java.lang.String r13 = "op should be remove or update."
            defpackage.e41.w(r14, r13)
            return
        L25:
            r4 = 0
        L26:
            r7 = r2
            r8 = r7
        L28:
            int r9 = r14.d
            r10 = 0
            if (r7 >= r9) goto L61
            int r9 = r14.b
            int r11 = r4 * r7
            int r11 = r11 + r9
            int r9 = r14.a
            int r9 = r13.v(r11, r9)
            int r11 = r14.a
            if (r11 == r5) goto L44
            if (r11 == r6) goto L3f
            goto L49
        L3f:
            int r12 = r1 + 1
            if (r9 != r12) goto L49
            goto L46
        L44:
            if (r9 != r1) goto L49
        L46:
            int r8 = r8 + 1
            goto L5e
        L49:
            java.lang.Object r12 = r14.c
            y9 r1 = r13.m(r12, r11, r1, r8)
            r13.f(r1, r3)
            r1.c = r10
            r0.c(r1)
            int r1 = r14.a
            if (r1 != r6) goto L5c
            int r3 = r3 + r8
        L5c:
            r8 = r2
            r1 = r9
        L5e:
            int r7 = r7 + 1
            goto L28
        L61:
            java.lang.Object r2 = r14.c
            r14.c = r10
            r0.c(r14)
            if (r8 <= 0) goto L78
            int r14 = r14.a
            y9 r14 = r13.m(r2, r14, r1, r8)
            r13.f(r14, r3)
            r14.c = r10
            r0.c(r14)
        L78:
            return
        L79:
            java.lang.String r13 = "should not dispatch add or move for pre layout"
            defpackage.i.h(r13)
            return
    }

    public void f(defpackage.y9 r3, int r4) {
            r2 = this;
            java.lang.Object r2 = r2.e
            uf5 r2 = (defpackage.uf5) r2
            r2.a(r3)
            int r0 = r3.a
            r1 = 2
            if (r0 == r1) goto L1d
            r1 = 4
            if (r0 != r1) goto L17
            int r0 = r3.d
            java.lang.Object r3 = r3.c
            r2.d(r3, r4, r0)
            return
        L17:
            java.lang.String r2 = "only remove and update ops can be dispatched in first pass"
            defpackage.i.h(r2)
            return
        L1d:
            int r3 = r3.d
            androidx.recyclerview.widget.RecyclerView r2 = r2.A
            r0 = 1
            r2.T(r4, r0, r3)
            r2.g1 = r0
            sg5 r2 = r2.d1
            int r4 = r2.c
            int r4 = r4 + r3
            r2.c = r4
            return
    }

    public int g(int r6, int r7) {
            r5 = this;
            java.lang.Object r5 = r5.d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            int r0 = r5.size()
        L8:
            if (r7 >= r0) goto L3f
            java.lang.Object r1 = r5.get(r7)
            y9 r1 = (defpackage.y9) r1
            int r2 = r1.a
            int r3 = r1.b
            r4 = 8
            if (r2 != r4) goto L28
            if (r3 != r6) goto L1d
            int r6 = r1.d
            goto L3c
        L1d:
            if (r3 >= r6) goto L21
            int r6 = r6 + (-1)
        L21:
            int r1 = r1.d
            if (r1 > r6) goto L3c
            int r6 = r6 + 1
            goto L3c
        L28:
            if (r3 > r6) goto L3c
            r4 = 2
            if (r2 != r4) goto L36
            int r1 = r1.d
            int r3 = r3 + r1
            if (r6 >= r3) goto L34
            r5 = -1
            return r5
        L34:
            int r6 = r6 - r1
            goto L3c
        L36:
            r3 = 1
            if (r2 != r3) goto L3c
            int r1 = r1.d
            int r6 = r6 + r1
        L3c:
            int r7 = r7 + 1
            goto L8
        L3f:
            return r6
    }

    public android.content.res.ColorStateList h() {
            r0 = this;
            java.lang.Object r0 = r0.e
            wz0 r0 = (defpackage.wz0) r0
            if (r0 == 0) goto Lb
            java.lang.Object r0 = r0.c
            android.content.res.ColorStateList r0 = (android.content.res.ColorStateList) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public android.graphics.PorterDuff.Mode i() {
            r0 = this;
            java.lang.Object r0 = r0.e
            wz0 r0 = (defpackage.wz0) r0
            if (r0 == 0) goto Lb
            java.io.Serializable r0 = r0.d
            android.graphics.PorterDuff$Mode r0 = (android.graphics.PorterDuff.Mode) r0
            return r0
        Lb:
            r0 = 0
            return r0
    }

    public boolean j() {
            r0 = this;
            java.lang.Object r0 = r0.c
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r0 <= 0) goto Lc
            r0 = 1
            return r0
        Lc:
            r0 = 0
            return r0
    }

    public void k(android.util.AttributeSet r10, int r11) {
            r9 = this;
            java.lang.Object r0 = r9.b
            android.view.View r0 = (android.view.View) r0
            android.content.Context r1 = r0.getContext()
            int[] r4 = defpackage.m75.A
            m44 r1 = defpackage.m44.A(r1, r10, r4, r11)
            java.lang.Object r2 = r1.L
            r8 = r2
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            java.lang.Object r2 = r9.b
            android.view.View r2 = (android.view.View) r2
            android.content.Context r3 = r2.getContext()
            java.lang.Object r5 = r1.L
            r6 = r5
            android.content.res.TypedArray r6 = (android.content.res.TypedArray) r6
            r5 = r10
            r7 = r11
            defpackage.ao7.m(r2, r3, r4, r5, r6, r7)
            r10 = 0
            boolean r11 = r8.hasValue(r10)     // Catch: java.lang.Throwable -> L4b
            r2 = -1
            if (r11 == 0) goto L52
            int r10 = r8.getResourceId(r10, r2)     // Catch: java.lang.Throwable -> L4b
            r9.a = r10     // Catch: java.lang.Throwable -> L4b
            java.lang.Object r10 = r9.c     // Catch: java.lang.Throwable -> L4b
            ir r10 = (defpackage.ir) r10     // Catch: java.lang.Throwable -> L4b
            android.content.Context r11 = r0.getContext()     // Catch: java.lang.Throwable -> L4b
            int r3 = r9.a     // Catch: java.lang.Throwable -> L4b
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L4b
            ol5 r4 = r10.a     // Catch: java.lang.Throwable -> L4e
            android.content.res.ColorStateList r11 = r4.f(r11, r3)     // Catch: java.lang.Throwable -> L4e
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L4b
            if (r11 == 0) goto L52
            r9.s(r11)     // Catch: java.lang.Throwable -> L4b
            goto L52
        L4b:
            r0 = move-exception
            r9 = r0
            goto L77
        L4e:
            r0 = move-exception
            r9 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L4e
            throw r9     // Catch: java.lang.Throwable -> L4b
        L52:
            r9 = 1
            boolean r10 = r8.hasValue(r9)     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L60
            android.content.res.ColorStateList r9 = r1.g(r9)     // Catch: java.lang.Throwable -> L4b
            r0.setBackgroundTintList(r9)     // Catch: java.lang.Throwable -> L4b
        L60:
            r9 = 2
            boolean r10 = r8.hasValue(r9)     // Catch: java.lang.Throwable -> L4b
            if (r10 == 0) goto L73
            int r9 = r8.getInt(r9, r2)     // Catch: java.lang.Throwable -> L4b
            r10 = 0
            android.graphics.PorterDuff$Mode r9 = defpackage.bp1.c(r9, r10)     // Catch: java.lang.Throwable -> L4b
            r0.setBackgroundTintMode(r9)     // Catch: java.lang.Throwable -> L4b
        L73:
            r1.D()
            return
        L77:
            r1.D()
            throw r9
    }

    public defpackage.hc4 l(java.lang.String r9) {
            r8 = this;
            r9.getClass()
            java.lang.Object r0 = r8.f
            ex6 r0 = (defpackage.ex6) r0
            if (r0 == 0) goto L3e
            java.lang.Object r0 = r0.getValue()
            fc4 r0 = (defpackage.fc4) r0
            if (r0 != 0) goto L12
            goto L3e
        L12:
            int r1 = defpackage.ic4.X
            java.lang.String r1 = "android-app://androidx.navigation/"
            java.lang.String r9 = r1.concat(r9)
            android.net.Uri r9 = android.net.Uri.parse(r9)
            r9.getClass()
            java.lang.Object r1 = r8.d
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1
            android.os.Bundle r4 = r0.d(r9, r1)
            if (r4 != 0) goto L2c
            goto L3e
        L2c:
            int r6 = r0.b(r9)
            hc4 r2 = new hc4
            java.lang.Object r8 = r8.b
            r3 = r8
            ic4 r3 = (defpackage.ic4) r3
            boolean r5 = r0.l
            r7 = 0
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
        L3e:
            r8 = 0
            return r8
    }

    public defpackage.y9 m(java.lang.Object r1, int r2, int r3, int r4) {
            r0 = this;
            java.lang.Object r0 = r0.b
            tz4 r0 = (defpackage.tz4) r0
            java.lang.Object r0 = r0.a()
            y9 r0 = (defpackage.y9) r0
            if (r0 != 0) goto L1a
            y9 r0 = new y9
            r0.<init>()
            r0.a = r2
            r0.b = r3
            r0.d = r4
            r0.c = r1
            return r0
        L1a:
            r0.a = r2
            r0.b = r3
            r0.d = r4
            r0.c = r1
            return r0
    }

    public void n() {
            r1 = this;
            r0 = -1
            r1.a = r0
            r0 = 0
            r1.s(r0)
            r1.a()
            return
    }

    public void o(int r4) {
            r3 = this;
            r3.a = r4
            java.lang.Object r0 = r3.c
            ir r0 = (defpackage.ir) r0
            if (r0 == 0) goto L1c
            java.lang.Object r1 = r3.b
            android.view.View r1 = (android.view.View) r1
            android.content.Context r1 = r1.getContext()
            monitor-enter(r0)
            ol5 r2 = r0.a     // Catch: java.lang.Throwable -> L19
            android.content.res.ColorStateList r4 = r2.f(r1, r4)     // Catch: java.lang.Throwable -> L19
            monitor-exit(r0)
            goto L1d
        L19:
            r3 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
            throw r3
        L1c:
            r4 = 0
        L1d:
            r3.s(r4)
            r3.a()
            return
    }

    public void p(defpackage.y9 r4) {
            r3 = this;
            java.lang.Object r0 = r3.e
            uf5 r0 = (defpackage.uf5) r0
            java.lang.Object r3 = r3.d
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r4)
            int r3 = r4.a
            r1 = 1
            if (r3 == r1) goto L3f
            r2 = 2
            if (r3 == r2) goto L32
            r1 = 4
            if (r3 == r1) goto L28
            r1 = 8
            if (r3 != r1) goto L22
            int r3 = r4.b
            int r4 = r4.d
            r0.f(r3, r4)
            return
        L22:
            java.lang.String r3 = "Unknown update op type for "
            defpackage.e41.w(r4, r3)
            return
        L28:
            int r3 = r4.b
            int r1 = r4.d
            java.lang.Object r4 = r4.c
            r0.d(r4, r3, r1)
            return
        L32:
            int r3 = r4.b
            int r4 = r4.d
            androidx.recyclerview.widget.RecyclerView r0 = r0.A
            r2 = 0
            r0.T(r3, r2, r4)
            r0.g1 = r1
            return
        L3f:
            int r3 = r4.b
            int r4 = r4.d
            r0.e(r3, r4)
            return
    }

    public void q() {
            r20 = this;
            r0 = r20
            java.lang.Object r1 = r0.b
            tz4 r1 = (defpackage.tz4) r1
            java.lang.Object r2 = r0.e
            uf5 r2 = (defpackage.uf5) r2
            java.lang.Object r3 = r0.f
            s63 r3 = (defpackage.s63) r3
            java.lang.Object r4 = r0.c
            java.util.ArrayList r4 = (java.util.ArrayList) r4
            r3.getClass()
        L15:
            int r5 = r4.size()
            r6 = 1
            int r5 = r5 - r6
            r8 = 0
        L1c:
            r9 = 8
            r10 = -1
            if (r5 < 0) goto L32
            java.lang.Object r11 = r4.get(r5)
            y9 r11 = (defpackage.y9) r11
            int r11 = r11.a
            if (r11 != r9) goto L2e
            if (r8 == 0) goto L2f
            goto L33
        L2e:
            r8 = r6
        L2f:
            int r5 = r5 + (-1)
            goto L1c
        L32:
            r5 = r10
        L33:
            r8 = 2
            r11 = 4
            if (r5 == r10) goto L1d5
            int r9 = r5 + 1
            java.lang.Object r13 = r3.B
            z9 r13 = (defpackage.z9) r13
            java.lang.Object r14 = r13.b
            tz4 r14 = (defpackage.tz4) r14
            java.lang.Object r15 = r4.get(r5)
            y9 r15 = (defpackage.y9) r15
            java.lang.Object r16 = r4.get(r9)
            r7 = r16
            y9 r7 = (defpackage.y9) r7
            int r10 = r7.a
            if (r10 == r6) goto L1a8
            if (r10 == r8) goto Lb6
            if (r10 == r11) goto L58
            goto L15
        L58:
            int r8 = r15.d
            int r10 = r7.b
            if (r8 >= r10) goto L63
            int r10 = r10 + (-1)
            r7.b = r10
            goto L75
        L63:
            int r12 = r7.d
            int r10 = r10 + r12
            if (r8 >= r10) goto L75
            int r12 = r12 + (-1)
            r7.d = r12
            int r8 = r15.b
            java.lang.Object r10 = r7.c
            y9 r6 = r13.m(r10, r11, r8, r6)
            goto L76
        L75:
            r6 = 0
        L76:
            int r8 = r15.b
            int r10 = r7.b
            if (r8 > r10) goto L81
            int r10 = r10 + 1
            r7.b = r10
            goto L95
        L81:
            int r12 = r7.d
            int r10 = r10 + r12
            if (r8 >= r10) goto L95
            int r10 = r10 - r8
            int r8 = r8 + 1
            java.lang.Object r12 = r7.c
            y9 r8 = r13.m(r12, r11, r8, r10)
            int r11 = r7.d
            int r11 = r11 - r10
            r7.d = r11
            goto L96
        L95:
            r8 = 0
        L96:
            r4.set(r9, r15)
            int r9 = r7.d
            if (r9 <= 0) goto La1
            r4.set(r5, r7)
            goto Laa
        La1:
            r4.remove(r5)
            r9 = 0
            r7.c = r9
            r14.c(r7)
        Laa:
            if (r6 == 0) goto Laf
            r4.add(r5, r6)
        Laf:
            if (r8 == 0) goto L15
            r4.add(r5, r8)
            goto L15
        Lb6:
            int r10 = r15.b
            int r11 = r15.d
            int r12 = r7.b
            if (r10 >= r11) goto Lce
            if (r12 != r10) goto Lca
            int r6 = r7.d
            int r10 = r11 - r10
            if (r6 != r10) goto Lca
            r6 = 0
        Lc7:
            r17 = 1
            goto Ldb
        Lca:
            r6 = 0
        Lcb:
            r17 = 0
            goto Ldb
        Lce:
            int r6 = r11 + 1
            if (r12 != r6) goto Ld9
            int r6 = r7.d
            int r10 = r10 - r11
            if (r6 != r10) goto Ld9
            r6 = 1
            goto Lc7
        Ld9:
            r6 = 1
            goto Lcb
        Ldb:
            if (r11 >= r12) goto Le2
            int r12 = r12 + (-1)
            r7.b = r12
            goto Lff
        Le2:
            int r10 = r7.d
            int r12 = r12 + r10
            if (r11 >= r12) goto Lff
            int r10 = r10 + (-1)
            r7.d = r10
            r15.a = r8
            r5 = 1
            r15.d = r5
            int r5 = r7.d
            if (r5 != 0) goto L15
            r4.remove(r9)
            r9 = 0
            r7.c = r9
            r14.c(r7)
            goto L15
        Lff:
            int r10 = r15.b
            int r11 = r7.b
            if (r10 > r11) goto L10b
            int r11 = r11 + 1
            r7.b = r11
        L109:
            r12 = 0
            goto L122
        L10b:
            int r12 = r7.d
            int r11 = r11 + r12
            if (r10 >= r11) goto L109
            int r11 = r11 - r10
            int r10 = r10 + 1
            r12 = 0
            y9 r18 = r13.m(r12, r8, r10, r11)
            int r8 = r15.b
            int r10 = r7.b
            int r8 = r8 - r10
            r7.d = r8
            r8 = r18
            goto L123
        L122:
            r8 = r12
        L123:
            if (r17 == 0) goto L132
            r4.set(r5, r7)
            r4.remove(r9)
            r15.c = r12
            r14.c(r15)
            goto L15
        L132:
            if (r6 == 0) goto L163
            if (r8 == 0) goto L14c
            int r6 = r15.b
            int r10 = r8.b
            if (r6 <= r10) goto L141
            int r10 = r8.d
            int r6 = r6 - r10
            r15.b = r6
        L141:
            int r6 = r15.d
            int r10 = r8.b
            if (r6 <= r10) goto L14c
            int r10 = r8.d
            int r6 = r6 - r10
            r15.d = r6
        L14c:
            int r6 = r15.b
            int r10 = r7.b
            if (r6 <= r10) goto L157
            int r10 = r7.d
            int r6 = r6 - r10
            r15.b = r6
        L157:
            int r6 = r15.d
            int r10 = r7.b
            if (r6 <= r10) goto L191
            int r10 = r7.d
            int r6 = r6 - r10
            r15.d = r6
            goto L191
        L163:
            if (r8 == 0) goto L17b
            int r6 = r15.b
            int r10 = r8.b
            if (r6 < r10) goto L170
            int r10 = r8.d
            int r6 = r6 - r10
            r15.b = r6
        L170:
            int r6 = r15.d
            int r10 = r8.b
            if (r6 < r10) goto L17b
            int r10 = r8.d
            int r6 = r6 - r10
            r15.d = r6
        L17b:
            int r6 = r15.b
            int r10 = r7.b
            if (r6 < r10) goto L186
            int r10 = r7.d
            int r6 = r6 - r10
            r15.b = r6
        L186:
            int r6 = r15.d
            int r10 = r7.b
            if (r6 < r10) goto L191
            int r10 = r7.d
            int r6 = r6 - r10
            r15.d = r6
        L191:
            r4.set(r5, r7)
            int r6 = r15.b
            int r7 = r15.d
            if (r6 == r7) goto L19e
            r4.set(r9, r15)
            goto L1a1
        L19e:
            r4.remove(r9)
        L1a1:
            if (r8 == 0) goto L15
            r4.add(r5, r8)
            goto L15
        L1a8:
            int r6 = r15.d
            int r8 = r7.b
            if (r6 >= r8) goto L1b1
            r16 = -1
            goto L1b3
        L1b1:
            r16 = 0
        L1b3:
            int r10 = r15.b
            if (r10 >= r8) goto L1b9
            int r16 = r16 + 1
        L1b9:
            if (r8 > r10) goto L1c0
            int r8 = r7.d
            int r10 = r10 + r8
            r15.b = r10
        L1c0:
            int r8 = r7.b
            if (r8 > r6) goto L1c9
            int r10 = r7.d
            int r6 = r6 + r10
            r15.d = r6
        L1c9:
            int r8 = r8 + r16
            r7.b = r8
            r4.set(r5, r7)
            r4.set(r9, r15)
            goto L15
        L1d5:
            int r3 = r4.size()
            r5 = 0
        L1da:
            if (r5 >= r3) goto L2b6
            java.lang.Object r6 = r4.get(r5)
            y9 r6 = (defpackage.y9) r6
            int r7 = r6.a
            r10 = 1
            if (r7 == r10) goto L2ac
            if (r7 == r8) goto L24d
            if (r7 == r11) goto L1f6
            if (r7 == r9) goto L1f2
        L1ed:
            r15 = 0
            r19 = 1
            goto L2b2
        L1f2:
            r0.p(r6)
            goto L1ed
        L1f6:
            int r7 = r6.b
            int r10 = r6.d
            int r10 = r10 + r7
            r12 = r7
            r13 = 0
            r14 = -1
        L1fe:
            if (r7 >= r10) goto L233
            wg5 r15 = r2.b(r7)
            if (r15 != 0) goto L21f
            boolean r15 = r0.b(r7)
            if (r15 == 0) goto L20d
            goto L21f
        L20d:
            r15 = 1
            if (r14 != r15) goto L21b
            java.lang.Object r14 = r6.c
            y9 r12 = r0.m(r14, r11, r12, r13)
            r0.p(r12)
            r12 = r7
            r13 = 0
        L21b:
            r14 = 0
        L21c:
            r19 = 1
            goto L22e
        L21f:
            if (r14 != 0) goto L22c
            java.lang.Object r14 = r6.c
            y9 r12 = r0.m(r14, r11, r12, r13)
            r0.e(r12)
            r12 = r7
            r13 = 0
        L22c:
            r14 = 1
            goto L21c
        L22e:
            int r13 = r13 + 1
            int r7 = r7 + 1
            goto L1fe
        L233:
            int r7 = r6.d
            if (r13 == r7) goto L243
            java.lang.Object r7 = r6.c
            r10 = 0
            r6.c = r10
            r1.c(r6)
            y9 r6 = r0.m(r7, r11, r12, r13)
        L243:
            if (r14 != 0) goto L249
            r0.e(r6)
            goto L1ed
        L249:
            r0.p(r6)
            goto L1ed
        L24d:
            int r7 = r6.b
            int r10 = r6.d
            int r10 = r10 + r7
            r12 = r7
            r13 = 0
            r14 = -1
        L255:
            if (r12 >= r10) goto L292
            wg5 r15 = r2.b(r12)
            if (r15 != 0) goto L263
            boolean r15 = r0.b(r12)
            if (r15 == 0) goto L265
        L263:
            r15 = 0
            goto L276
        L265:
            r15 = 1
            if (r14 != r15) goto L272
            r15 = 0
            y9 r14 = r0.m(r15, r8, r7, r13)
            r0.p(r14)
            r14 = 1
            goto L274
        L272:
            r15 = 0
            r14 = 0
        L274:
            r15 = 0
            goto L283
        L276:
            if (r14 != 0) goto L281
            y9 r14 = r0.m(r15, r8, r7, r13)
            r0.e(r14)
            r14 = 1
            goto L282
        L281:
            r14 = 0
        L282:
            r15 = 1
        L283:
            if (r14 == 0) goto L28b
            int r12 = r12 - r13
            int r10 = r10 - r13
            r13 = 1
        L288:
            r19 = 1
            goto L28e
        L28b:
            int r13 = r13 + 1
            goto L288
        L28e:
            int r12 = r12 + 1
            r14 = r15
            goto L255
        L292:
            r19 = 1
            int r10 = r6.d
            r15 = 0
            if (r13 == r10) goto L2a2
            r6.c = r15
            r1.c(r6)
            y9 r6 = r0.m(r15, r8, r7, r13)
        L2a2:
            if (r14 != 0) goto L2a8
            r0.e(r6)
            goto L2b2
        L2a8:
            r0.p(r6)
            goto L2b2
        L2ac:
            r19 = r10
            r15 = 0
            r0.p(r6)
        L2b2:
            int r5 = r5 + 1
            goto L1da
        L2b6:
            r4.clear()
            return
    }

    public void r(java.util.ArrayList r5) {
            r4 = this;
            int r0 = r5.size()
            r1 = 0
        L5:
            if (r1 >= r0) goto L1a
            java.lang.Object r2 = r5.get(r1)
            y9 r2 = (defpackage.y9) r2
            r3 = 0
            r2.c = r3
            java.lang.Object r3 = r4.b
            tz4 r3 = (defpackage.tz4) r3
            r3.c(r2)
            int r1 = r1 + 1
            goto L5
        L1a:
            r5.clear()
            return
    }

    public void s(android.content.res.ColorStateList r2) {
            r1 = this;
            if (r2 == 0) goto L19
            java.lang.Object r0 = r1.d
            wz0 r0 = (defpackage.wz0) r0
            if (r0 != 0) goto Lf
            wz0 r0 = new wz0
            r0.<init>()
            r1.d = r0
        Lf:
            java.lang.Object r0 = r1.d
            wz0 r0 = (defpackage.wz0) r0
            r0.c = r2
            r2 = 1
            r0.b = r2
            goto L1c
        L19:
            r2 = 0
            r1.d = r2
        L1c:
            r1.a()
            return
    }

    public void t(android.content.res.ColorStateList r2) {
            r1 = this;
            java.lang.Object r0 = r1.e
            wz0 r0 = (defpackage.wz0) r0
            if (r0 != 0) goto Ld
            wz0 r0 = new wz0
            r0.<init>()
            r1.e = r0
        Ld:
            java.lang.Object r0 = r1.e
            wz0 r0 = (defpackage.wz0) r0
            r0.c = r2
            r2 = 1
            r0.b = r2
            r1.a()
            return
    }

    public void u(android.graphics.PorterDuff.Mode r2) {
            r1 = this;
            java.lang.Object r0 = r1.e
            wz0 r0 = (defpackage.wz0) r0
            if (r0 != 0) goto Ld
            wz0 r0 = new wz0
            r0.<init>()
            r1.e = r0
        Ld:
            java.lang.Object r0 = r1.e
            wz0 r0 = (defpackage.wz0) r0
            r0.d = r2
            r2 = 1
            r0.a = r2
            r1.a()
            return
    }

    public int v(int r10, int r11) {
            r9 = this;
            java.lang.Object r0 = r9.b
            tz4 r0 = (defpackage.tz4) r0
            java.lang.Object r9 = r9.d
            java.util.ArrayList r9 = (java.util.ArrayList) r9
            int r1 = r9.size()
            r2 = 1
            int r1 = r1 - r2
        Le:
            r3 = 8
            if (r1 < 0) goto L84
            java.lang.Object r4 = r9.get(r1)
            y9 r4 = (defpackage.y9) r4
            int r5 = r4.a
            int r6 = r4.b
            r7 = 2
            if (r5 != r3) goto L66
            int r3 = r4.d
            if (r6 >= r3) goto L26
            r8 = r3
            r5 = r6
            goto L28
        L26:
            r5 = r3
            r8 = r6
        L28:
            if (r10 < r5) goto L4e
            if (r10 > r8) goto L4e
            if (r5 != r6) goto L3e
            if (r11 != r2) goto L35
            int r3 = r3 + 1
            r4.d = r3
            goto L3b
        L35:
            if (r11 != r7) goto L3b
            int r3 = r3 + (-1)
            r4.d = r3
        L3b:
            int r10 = r10 + 1
            goto L81
        L3e:
            if (r11 != r2) goto L45
            int r6 = r6 + 1
            r4.b = r6
            goto L4b
        L45:
            if (r11 != r7) goto L4b
            int r6 = r6 + (-1)
            r4.b = r6
        L4b:
            int r10 = r10 + (-1)
            goto L81
        L4e:
            if (r10 >= r6) goto L81
            if (r11 != r2) goto L5b
            int r6 = r6 + 1
            r4.b = r6
            int r3 = r3 + 1
            r4.d = r3
            goto L81
        L5b:
            if (r11 != r7) goto L81
            int r6 = r6 + (-1)
            r4.b = r6
            int r3 = r3 + (-1)
            r4.d = r3
            goto L81
        L66:
            if (r6 > r10) goto L74
            if (r5 != r2) goto L6e
            int r3 = r4.d
            int r10 = r10 - r3
            goto L81
        L6e:
            if (r5 != r7) goto L81
            int r3 = r4.d
            int r10 = r10 + r3
            goto L81
        L74:
            if (r11 != r2) goto L7b
            int r6 = r6 + 1
            r4.b = r6
            goto L81
        L7b:
            if (r11 != r7) goto L81
            int r6 = r6 + (-1)
            r4.b = r6
        L81:
            int r1 = r1 + (-1)
            goto Le
        L84:
            int r11 = r9.size()
            int r11 = r11 - r2
        L89:
            if (r11 < 0) goto Lb4
            java.lang.Object r1 = r9.get(r11)
            y9 r1 = (defpackage.y9) r1
            int r2 = r1.a
            int r4 = r1.d
            r5 = 0
            if (r2 != r3) goto La7
            int r2 = r1.b
            if (r4 == r2) goto L9e
            if (r4 >= 0) goto Lb1
        L9e:
            r9.remove(r11)
            r1.c = r5
            r0.c(r1)
            goto Lb1
        La7:
            if (r4 > 0) goto Lb1
            r9.remove(r11)
            r1.c = r5
            r0.c(r1)
        Lb1:
            int r11 = r11 + (-1)
            goto L89
        Lb4:
            return r10
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dp3  reason: default package */
/* loaded from: classes.dex */
public final class dp3 {
    public final java.util.ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final java.lang.Object g;
    public final java.lang.Object h;
    public java.lang.Object i;

    public dp3(defpackage.je5 r1, java.util.ArrayList r2, int r3, defpackage.bk1 r4, defpackage.pa r5, int r6, int r7, int r8) {
            r0 = this;
            r5.getClass()
            r0.<init>()
            r0.g = r1
            r0.a = r2
            r0.b = r3
            r0.h = r4
            r0.i = r5
            r0.c = r6
            r0.d = r7
            r0.e = r8
            return
    }

    public dp3(defpackage.oo3 r3) {
            r2 = this;
            r2.<init>()
            r2.g = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            bp3 r0 = new bp3
            r1 = 0
            r0.<init>(r1, r1)
            r3.add(r0)
            r2.a = r3
            r3 = -1
            r2.e = r3
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r2.h = r3
            yt1 r3 = defpackage.yt1.A
            r2.i = r3
            return
    }

    public static defpackage.dp3 a(defpackage.dp3 r9, int r10, defpackage.bk1 r11, defpackage.pa r12, int r13) {
            r0 = r13 & 1
            if (r0 == 0) goto L6
            int r10 = r9.b
        L6:
            r3 = r10
            r10 = r13 & 2
            if (r10 == 0) goto L10
            java.lang.Object r10 = r9.h
            r11 = r10
            bk1 r11 = (defpackage.bk1) r11
        L10:
            r4 = r11
            r10 = r13 & 4
            if (r10 == 0) goto L1a
            java.lang.Object r10 = r9.i
            r12 = r10
            pa r12 = (defpackage.pa) r12
        L1a:
            r5 = r12
            int r6 = r9.c
            int r7 = r9.d
            int r8 = r9.e
            r5.getClass()
            dp3 r0 = new dp3
            java.lang.Object r10 = r9.g
            r1 = r10
            je5 r1 = (defpackage.je5) r1
            java.util.ArrayList r2 = r9.a
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8)
            return r0
    }

    public int b() {
            r4 = this;
            int r0 = r4.e()
            double r0 = (double) r0
            r2 = 4607182418800017408(0x3ff0000000000000, double:1.0)
            double r0 = r0 * r2
            int r4 = r4.f
            double r2 = (double) r4
            double r0 = r0 / r2
            double r0 = java.lang.Math.sqrt(r0)
            int r4 = (int) r0
            int r4 = r4 + 1
            return r4
    }

    public defpackage.qj2 c(int r13) {
            r12 = this;
            java.lang.Object r0 = r12.h
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            java.lang.Object r1 = r12.g
            oo3 r1 = (defpackage.oo3) r1
            boolean r1 = r1.j
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L4a
            int r0 = r12.f
            int r13 = r13 * r0
            qj2 r1 = new qj2
            int r4 = r12.e()
            int r4 = r4 - r13
            if (r0 <= r4) goto L1b
            r0 = r4
        L1b:
            if (r0 >= 0) goto L1e
            r0 = r3
        L1e:
            java.lang.Object r4 = r12.i
            java.util.List r4 = (java.util.List) r4
            int r4 = r4.size()
            if (r0 != r4) goto L2d
            java.lang.Object r12 = r12.i
            java.util.List r12 = (java.util.List) r12
            goto L46
        L2d:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>(r0)
        L32:
            if (r3 >= r0) goto L43
            long r5 = defpackage.ej2.a(r2)
            ju2 r7 = new ju2
            r7.<init>(r5)
            r4.add(r7)
            int r3 = r3 + 1
            goto L32
        L43:
            r12.i = r4
            r12 = r4
        L46:
            r1.<init>(r13, r12)
            return r1
        L4a:
            int r1 = r12.b()
            int r1 = r13 / r1
            java.util.ArrayList r4 = r12.a
            int r5 = r4.size()
            int r5 = r5 - r2
            int r1 = java.lang.Math.min(r1, r5)
            int r5 = r12.b()
            int r5 = r5 * r1
            java.lang.Object r6 = r4.get(r1)
            bp3 r6 = (defpackage.bp3) r6
            int r6 = r6.a
            java.lang.Object r7 = r4.get(r1)
            bp3 r7 = (defpackage.bp3) r7
            int r7 = r7.b
            int r8 = r12.b
            if (r5 > r8) goto L7c
            if (r8 > r13) goto L7c
            int r6 = r12.c
            int r7 = r12.d
            r5 = r8
            goto L94
        L7c:
            int r8 = r12.e
            if (r1 != r8) goto L94
            int r8 = r13 - r5
            int r9 = r0.size()
            if (r8 >= r9) goto L94
            java.lang.Object r5 = r0.get(r8)
            java.lang.Number r5 = (java.lang.Number) r5
            int r6 = r5.intValue()
            r5 = r13
            r7 = r3
        L94:
            int r8 = r12.b()
            int r8 = r5 % r8
            if (r8 != 0) goto La8
            int r8 = r12.b()
            int r9 = r13 - r5
            r10 = 2
            if (r10 > r9) goto La8
            if (r9 >= r8) goto La8
            goto La9
        La8:
            r2 = r3
        La9:
            if (r2 == 0) goto Lb0
            r12.e = r1
            r0.clear()
        Lb0:
            if (r5 > r13) goto Lb3
            goto Ld1
        Lb3:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r8 = "currentLine ("
            r1.<init>(r8)
            r1.append(r5)
            java.lang.String r8 = ") > lineIndex ("
            r1.append(r8)
            r1.append(r13)
            r8 = 41
            r1.append(r8)
            java.lang.String r1 = r1.toString()
            defpackage.s53.c(r1)
        Ld1:
            if (r5 >= r13) goto L12d
            int r1 = r12.e()
            if (r6 >= r1) goto L12d
            if (r2 == 0) goto Le2
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.add(r1)
        Le2:
            r1 = r3
        Le3:
            int r8 = r12.f
            if (r1 >= r8) goto L102
            int r8 = r12.e()
            if (r6 >= r8) goto L102
            if (r7 != 0) goto Lf7
            int r8 = r12.g(r6)
            r11 = r8
            r8 = r7
            r7 = r11
            goto Lf8
        Lf7:
            r8 = r3
        Lf8:
            int r1 = r1 + r7
            int r9 = r12.f
            if (r1 <= r9) goto Lfe
            goto L102
        Lfe:
            int r6 = r6 + 1
            r7 = r8
            goto Le3
        L102:
            int r5 = r5 + 1
            int r1 = r12.b()
            int r1 = r5 % r1
            if (r1 != 0) goto Ld1
            int r1 = r12.e()
            if (r6 >= r1) goto Ld1
            int r1 = r12.b()
            int r1 = r5 / r1
            int r8 = r4.size()
            if (r8 != r1) goto L11f
            goto L124
        L11f:
            java.lang.String r1 = "invalid starting point"
            defpackage.s53.c(r1)
        L124:
            bp3 r1 = new bp3
            r1.<init>(r6, r7)
            r4.add(r1)
            goto Ld1
        L12d:
            r12.b = r13
            r12.c = r6
            r12.d = r7
            java.util.ArrayList r13 = new java.util.ArrayList
            r13.<init>()
            r0 = r3
            r1 = r6
        L13a:
            int r2 = r12.f
            if (r0 >= r2) goto L164
            int r2 = r12.e()
            if (r1 >= r2) goto L164
            if (r7 != 0) goto L14e
            int r2 = r12.g(r1)
            r11 = r7
            r7 = r2
            r2 = r11
            goto L14f
        L14e:
            r2 = r3
        L14f:
            int r0 = r0 + r7
            int r4 = r12.f
            if (r0 > r4) goto L164
            int r1 = r1 + 1
            long r4 = defpackage.ej2.a(r7)
            ju2 r7 = new ju2
            r7.<init>(r4)
            r13.add(r7)
            r7 = r2
            goto L13a
        L164:
            qj2 r12 = new qj2
            r12.<init>(r6, r13)
            return r12
    }

    public int d(int r9) {
            r8 = this;
            int r0 = r8.e()
            r1 = 0
            if (r0 > 0) goto L8
            return r1
        L8:
            int r0 = r8.e()
            if (r9 >= r0) goto Lf
            goto L14
        Lf:
            java.lang.String r0 = "ItemIndex > total count"
            defpackage.s53.a(r0)
        L14:
            java.lang.Object r0 = r8.g
            oo3 r0 = (defpackage.oo3) r0
            boolean r0 = r0.j
            if (r0 != 0) goto L20
            int r8 = r8.f
            int r9 = r9 / r8
            return r9
        L20:
            java.util.ArrayList r0 = r8.a
            int r2 = r0.size()
            int r3 = r0.size()
            defpackage.hf.h0(r3, r2)
            r3 = 1
            int r2 = r2 - r3
            r4 = r1
        L30:
            if (r4 > r2) goto L48
            int r5 = r4 + r2
            int r5 = r5 >>> r3
            java.lang.Object r6 = r0.get(r5)
            bp3 r6 = (defpackage.bp3) r6
            int r6 = r6.a
            int r6 = r6 - r9
            if (r6 >= 0) goto L43
            int r4 = r5 + 1
            goto L30
        L43:
            if (r6 <= 0) goto L4a
            int r2 = r5 + (-1)
            goto L30
        L48:
            int r4 = r4 + r3
            int r5 = -r4
        L4a:
            if (r5 < 0) goto L4d
            goto L50
        L4d:
            int r2 = -r5
            int r5 = r2 + (-2)
        L50:
            int r2 = r8.b()
            int r2 = r2 * r5
            java.lang.Object r4 = r0.get(r5)
            bp3 r4 = (defpackage.bp3) r4
            int r4 = r4.a
            if (r4 > r9) goto L60
            goto L65
        L60:
            java.lang.String r5 = "currentItemIndex > itemIndex"
            defpackage.s53.a(r5)
        L65:
            r5 = r1
        L66:
            if (r4 >= r9) goto La2
            int r6 = r4 + 1
            int r4 = r8.g(r4)
            int r5 = r5 + r4
            int r7 = r8.f
            if (r5 >= r7) goto L74
            goto L7d
        L74:
            if (r5 != r7) goto L7a
            int r2 = r2 + 1
            r5 = r1
            goto L7d
        L7a:
            int r2 = r2 + 1
            r5 = r4
        L7d:
            int r4 = r8.b()
            int r4 = r2 % r4
            if (r4 != 0) goto La0
            int r4 = r8.b()
            int r4 = r2 / r4
            int r7 = r0.size()
            if (r4 < r7) goto La0
            bp3 r4 = new bp3
            if (r5 <= 0) goto L97
            r7 = r3
            goto L98
        L97:
            r7 = r1
        L98:
            int r7 = r6 - r7
            r4.<init>(r7, r1)
            r0.add(r4)
        La0:
            r4 = r6
            goto L66
        La2:
            int r9 = r8.g(r9)
            int r9 = r9 + r5
            int r8 = r8.f
            if (r9 <= r8) goto Lac
            int r2 = r2 + r3
        Lac:
            return r2
    }

    public int e() {
            r0 = this;
            java.lang.Object r0 = r0.g
            oo3 r0 = (defpackage.oo3) r0
            ei r0 = r0.i
            int r0 = r0.B
            return r0
    }

    public defpackage.wl5 f(defpackage.pa r12) {
            r11 = this;
            java.lang.Object r0 = r11.h
            bk1 r0 = (defpackage.bk1) r0
            r12.getClass()
            int r1 = r11.b
            java.util.ArrayList r2 = r11.a
            int r3 = r2.size()
            r4 = 0
            if (r1 >= r3) goto L9c
            int r3 = r11.f
            r5 = 1
            int r3 = r3 + r5
            r11.f = r3
            java.lang.String r3 = " must call proceed() exactly once"
            java.lang.String r6 = "network interceptor "
            if (r0 == 0) goto L5d
            java.lang.Object r7 = r0.B
            w62 r7 = (defpackage.w62) r7
            ue5 r7 = r7.b()
            java.lang.Object r8 = r12.B
            i03 r8 = (defpackage.i03) r8
            r7.getClass()
            r8.getClass()
            ea r7 = r7.i
            i03 r7 = r7.h
            int r9 = r8.e
            int r10 = r7.e
            if (r9 != r10) goto L52
            java.lang.String r8 = r8.d
            java.lang.String r7 = r7.d
            boolean r7 = defpackage.nb3.k(r8, r7)
            if (r7 == 0) goto L52
            int r7 = r11.f
            if (r7 != r5) goto L49
            goto L5d
        L49:
            int r1 = r1 - r5
            java.lang.Object r11 = r2.get(r1)
            defpackage.e41.g(r11, r3, r6)
            return r4
        L52:
            int r1 = r1 - r5
            java.lang.Object r11 = r2.get(r1)
            java.lang.String r12 = " must retain the same host and port"
            defpackage.e41.g(r11, r12, r6)
            return r4
        L5d:
            int r7 = r1 + 1
            r8 = 58
            dp3 r11 = a(r11, r7, r4, r12, r8)
            java.lang.Object r12 = r2.get(r1)
            v93 r12 = (defpackage.v93) r12
            wl5 r1 = r12.a(r11)
            if (r1 == 0) goto L83
            if (r0 == 0) goto L82
            int r0 = r2.size()
            if (r7 >= r0) goto L82
            int r11 = r11.f
            if (r11 != r5) goto L7e
            goto L82
        L7e:
            defpackage.e41.g(r12, r3, r6)
            return r4
        L82:
            return r1
        L83:
            java.lang.NullPointerException r11 = new java.lang.NullPointerException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "interceptor "
            r0.<init>(r1)
            r0.append(r12)
            java.lang.String r12 = " returned null"
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.<init>(r12)
            throw r11
        L9c:
            java.lang.String r11 = "Check failed."
            defpackage.i.m(r11)
            return r4
    }

    public int g(int r2) {
            r1 = this;
            int r0 = r1.f
            defpackage.cp3.b = r0
            java.lang.Object r1 = r1.g
            oo3 r1 = (defpackage.oo3) r1
            ei r1 = r1.i
            bb3 r1 = r1.d(r2)
            int r0 = r1.a
            int r2 = r2 - r0
            vp3 r1 = r1.c
            mo3 r1 = (defpackage.mo3) r1
            eo2 r1 = r1.b
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            cp3 r0 = defpackage.cp3.a
            java.lang.Object r1 = r1.o(r0, r2)
            ju2 r1 = (defpackage.ju2) r1
            long r1 = r1.a
            int r1 = (int) r1
            return r1
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: h11  reason: default package */
/* loaded from: classes.dex */
public final class h11 {
    public java.util.HashSet a;
    public int b;
    public boolean c;
    public final defpackage.l21 d;
    public final defpackage.g11 e;
    public defpackage.h11 f;
    public int g;
    public int h;
    public defpackage.en6 i;

    public h11(defpackage.l21 r2, defpackage.g11 r3) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.a = r0
            r0 = 0
            r1.g = r0
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1.h = r0
            r1.d = r2
            r1.e = r3
            return
    }

    public final void a(defpackage.h11 r3, int r4) {
            r2 = this;
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = 0
            r2.b(r3, r4, r0, r1)
            return
    }

    public final boolean b(defpackage.h11 r2, int r3, int r4, boolean r5) {
            r1 = this;
            r0 = 1
            if (r2 != 0) goto L7
            r1.j()
            return r0
        L7:
            if (r5 != 0) goto L11
            boolean r5 = r1.i(r2)
            if (r5 != 0) goto L11
            r1 = 0
            return r1
        L11:
            r1.f = r2
            java.util.HashSet r5 = r2.a
            if (r5 != 0) goto L1e
            java.util.HashSet r5 = new java.util.HashSet
            r5.<init>()
            r2.a = r5
        L1e:
            h11 r2 = r1.f
            java.util.HashSet r2 = r2.a
            if (r2 == 0) goto L27
            r2.add(r1)
        L27:
            r1.g = r3
            r1.h = r4
            return r0
    }

    public final void c(int r2, defpackage.zs7 r3, java.util.ArrayList r4) {
            r1 = this;
            java.util.HashSet r1 = r1.a
            if (r1 == 0) goto L1a
            java.util.Iterator r1 = r1.iterator()
        L8:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L1a
            java.lang.Object r0 = r1.next()
            h11 r0 = (defpackage.h11) r0
            l21 r0 = r0.d
            defpackage.kj2.x(r0, r2, r4, r3)
            goto L8
        L1a:
            return
    }

    public final int d() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 != 0) goto L6
            r1 = 0
            return r1
        L6:
            int r1 = r1.b
            return r1
    }

    public final int e() {
            r3 = this;
            l21 r0 = r3.d
            int r0 = r0.h0
            r1 = 8
            if (r0 != r1) goto La
            r3 = 0
            return r3
        La:
            int r0 = r3.h
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            if (r0 == r2) goto L1b
            h11 r2 = r3.f
            if (r2 == 0) goto L1b
            l21 r2 = r2.d
            int r2 = r2.h0
            if (r2 != r1) goto L1b
            return r0
        L1b:
            int r3 = r3.g
            return r3
    }

    public final defpackage.h11 f() {
            r2 = this;
            g11 r0 = r2.e
            int r1 = r0.ordinal()
            l21 r2 = r2.d
            switch(r1) {
                case 0: goto L21;
                case 1: goto L1e;
                case 2: goto L1b;
                case 3: goto L18;
                case 4: goto L15;
                case 5: goto L21;
                case 6: goto L21;
                case 7: goto L21;
                case 8: goto L21;
                default: goto Lb;
            }
        Lb:
            java.lang.AssertionError r2 = new java.lang.AssertionError
            java.lang.String r0 = r0.name()
            r2.<init>(r0)
            throw r2
        L15:
            h11 r2 = r2.J
            return r2
        L18:
            h11 r2 = r2.I
            return r2
        L1b:
            h11 r2 = r2.L
            return r2
        L1e:
            h11 r2 = r2.K
            return r2
        L21:
            r2 = 0
            return r2
    }

    public final boolean g() {
            r2 = this;
            java.util.HashSet r2 = r2.a
            r0 = 0
            if (r2 != 0) goto L6
            return r0
        L6:
            java.util.Iterator r2 = r2.iterator()
        La:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L22
            java.lang.Object r1 = r2.next()
            h11 r1 = (defpackage.h11) r1
            h11 r1 = r1.f()
            boolean r1 = r1.h()
            if (r1 == 0) goto La
            r2 = 1
            return r2
        L22:
            return r0
    }

    public final boolean h() {
            r0 = this;
            h11 r0 = r0.f
            if (r0 == 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public final boolean i(defpackage.h11 r5) {
            r4 = this;
            r0 = 0
            if (r5 != 0) goto L5
            goto L74
        L5:
            l21 r1 = r5.d
            g11 r5 = r5.e
            g11 r2 = r4.e
            r3 = 1
            if (r5 != r2) goto L1d
            g11 r5 = defpackage.g11.BASELINE
            if (r2 != r5) goto L72
            boolean r5 = r1.E
            if (r5 == 0) goto L74
            l21 r4 = r4.d
            boolean r4 = r4.E
            if (r4 != 0) goto L72
            goto L74
        L1d:
            int r4 = r2.ordinal()
            switch(r4) {
                case 0: goto L74;
                case 1: goto L5c;
                case 2: goto L44;
                case 3: goto L5c;
                case 4: goto L44;
                case 5: goto L3b;
                case 6: goto L2e;
                case 7: goto L74;
                case 8: goto L74;
                default: goto L24;
            }
        L24:
            java.lang.AssertionError r4 = new java.lang.AssertionError
            java.lang.String r5 = r2.name()
            r4.<init>(r5)
            throw r4
        L2e:
            g11 r4 = defpackage.g11.BASELINE
            if (r5 == r4) goto L74
            g11 r4 = defpackage.g11.CENTER_X
            if (r5 == r4) goto L74
            g11 r4 = defpackage.g11.CENTER_Y
            if (r5 == r4) goto L74
            goto L72
        L3b:
            g11 r4 = defpackage.g11.LEFT
            if (r5 == r4) goto L74
            g11 r4 = defpackage.g11.RIGHT
            if (r5 != r4) goto L72
            goto L74
        L44:
            g11 r4 = defpackage.g11.TOP
            if (r5 == r4) goto L4f
            g11 r4 = defpackage.g11.BOTTOM
            if (r5 != r4) goto L4d
            goto L4f
        L4d:
            r4 = r0
            goto L50
        L4f:
            r4 = r3
        L50:
            boolean r1 = r1 instanceof defpackage.av2
            if (r1 == 0) goto L5b
            if (r4 != 0) goto L72
            g11 r4 = defpackage.g11.CENTER_Y
            if (r5 != r4) goto L74
            goto L72
        L5b:
            return r4
        L5c:
            g11 r4 = defpackage.g11.LEFT
            if (r5 == r4) goto L67
            g11 r4 = defpackage.g11.RIGHT
            if (r5 != r4) goto L65
            goto L67
        L65:
            r4 = r0
            goto L68
        L67:
            r4 = r3
        L68:
            boolean r1 = r1 instanceof defpackage.av2
            if (r1 == 0) goto L73
            if (r4 != 0) goto L72
            g11 r4 = defpackage.g11.CENTER_X
            if (r5 != r4) goto L74
        L72:
            return r3
        L73:
            return r4
        L74:
            return r0
    }

    public final void j() {
            r2 = this;
            h11 r0 = r2.f
            r1 = 0
            if (r0 == 0) goto L1a
            java.util.HashSet r0 = r0.a
            if (r0 == 0) goto L1a
            r0.remove(r2)
            h11 r0 = r2.f
            java.util.HashSet r0 = r0.a
            int r0 = r0.size()
            if (r0 != 0) goto L1a
            h11 r0 = r2.f
            r0.a = r1
        L1a:
            r2.a = r1
            r2.f = r1
            r0 = 0
            r2.g = r0
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r2.h = r1
            r2.c = r0
            r2.b = r0
            return
    }

    public final void k() {
            r2 = this;
            en6 r0 = r2.i
            if (r0 != 0) goto Le
            en6 r0 = new en6
            dn6 r1 = defpackage.dn6.UNRESTRICTED
            r0.<init>(r1)
            r2.i = r0
            return
        Le:
            r0.c()
            return
    }

    public final void l(int r1) {
            r0 = this;
            r0.b = r1
            r1 = 1
            r0.c = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            l21 r1 = r2.d
            java.lang.String r1 = r1.j0
            r0.append(r1)
            java.lang.String r1 = ":"
            r0.append(r1)
            g11 r2 = r2.e
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

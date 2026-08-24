package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gn  reason: default package */
/* loaded from: classes.dex */
public final class gn {
    public final defpackage.wc7 a;
    public final java.lang.Object b;
    public final defpackage.uo c;
    public final defpackage.vs4 d;
    public final defpackage.vs4 e;
    public final defpackage.eb4 f;
    public final defpackage.io6 g;
    public final defpackage.ap h;
    public final defpackage.ap i;
    public final defpackage.ap j;
    public final defpackage.ap k;

    public gn(java.lang.Object r4, defpackage.wc7 r5, java.lang.Object r6) {
            r3 = this;
            r3.<init>()
            r3.a = r5
            r3.b = r6
            uo r0 = new uo
            r1 = 0
            r2 = 60
            r0.<init>(r5, r4, r1, r2)
            r3.c = r0
            java.lang.Boolean r5 = java.lang.Boolean.FALSE
            vs4 r5 = defpackage.np2.Y(r5)
            r3.d = r5
            vs4 r4 = defpackage.np2.Y(r4)
            r3.e = r4
            eb4 r4 = new eb4
            r4.<init>()
            r3.f = r4
            io6 r4 = new io6
            r4.<init>(r6)
            r3.g = r4
            ap r4 = r0.L
            boolean r5 = r4 instanceof defpackage.wo
            if (r5 == 0) goto L36
            wo r6 = defpackage.nb3.e
            goto L46
        L36:
            boolean r6 = r4 instanceof defpackage.xo
            if (r6 == 0) goto L3d
            xo r6 = defpackage.nb3.f
            goto L46
        L3d:
            boolean r6 = r4 instanceof defpackage.yo
            if (r6 == 0) goto L44
            yo r6 = defpackage.nb3.g
            goto L46
        L44:
            zo r6 = defpackage.nb3.h
        L46:
            r3.h = r6
            if (r5 == 0) goto L4d
            wo r4 = defpackage.nb3.a
            goto L5d
        L4d:
            boolean r5 = r4 instanceof defpackage.xo
            if (r5 == 0) goto L54
            xo r4 = defpackage.nb3.b
            goto L5d
        L54:
            boolean r4 = r4 instanceof defpackage.yo
            if (r4 == 0) goto L5b
            yo r4 = defpackage.nb3.c
            goto L5d
        L5b:
            zo r4 = defpackage.nb3.d
        L5d:
            r3.i = r4
            r3.j = r6
            r3.k = r4
            return
    }

    public /* synthetic */ gn(java.lang.Object r1, defpackage.wc7 r2, java.lang.Object r3, int r4) {
            r0 = this;
            r4 = r4 & 4
            if (r4 == 0) goto L5
            r3 = 0
        L5:
            r0.<init>(r1, r2, r3)
            return
    }

    public static final java.lang.Object a(defpackage.gn r8, java.lang.Object r9) {
            wc7 r0 = r8.a
            ap r1 = r8.k
            ap r2 = r8.j
            ap r3 = r8.h
            boolean r3 = defpackage.nb3.k(r2, r3)
            if (r3 == 0) goto L17
            ap r8 = r8.i
            boolean r8 = defpackage.nb3.k(r1, r8)
            if (r8 == 0) goto L17
            goto L5f
        L17:
            qn2 r8 = r0.a
            java.lang.Object r8 = r8.g(r9)
            ap r8 = (defpackage.ap) r8
            int r3 = r8.b()
            r4 = 0
            r5 = r4
        L25:
            if (r4 >= r3) goto L56
            float r6 = r8.a(r4)
            float r7 = r2.a(r4)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 < 0) goto L3f
            float r6 = r8.a(r4)
            float r7 = r1.a(r4)
            int r6 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
            if (r6 <= 0) goto L53
        L3f:
            float r5 = r8.a(r4)
            float r6 = r2.a(r4)
            float r7 = r1.a(r4)
            float r5 = defpackage.gi2.p(r5, r6, r7)
            r8.e(r4, r5)
            r5 = 1
        L53:
            int r4 = r4 + 1
            goto L25
        L56:
            if (r5 == 0) goto L5f
            qn2 r9 = r0.b
            java.lang.Object r8 = r9.g(r8)
            return r8
        L5f:
            return r9
    }

    public static final void b(defpackage.gn r3) {
            uo r0 = r3.c
            ap r1 = r0.L
            r1.d()
            r1 = -9223372036854775808
            r0.R = r1
            vs4 r3 = r3.d
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r3.setValue(r0)
            return
    }

    public static java.lang.Object c(defpackage.gn r10, java.lang.Object r11, defpackage.to r12, defpackage.qn2 r13, defpackage.r41 r14, int r15) {
            r0 = r15 & 2
            if (r0 == 0) goto L6
            io6 r12 = r10.g
        L6:
            r1 = r12
            wc7 r12 = r10.a
            qn2 r12 = r12.b
            uo r0 = r10.c
            ap r0 = r0.L
            java.lang.Object r12 = r12.g(r0)
            r15 = r15 & 8
            if (r15 == 0) goto L18
            r13 = 0
        L18:
            r8 = r13
            java.lang.Object r3 = r10.d()
            wc7 r2 = r10.a
            jz6 r0 = new jz6
            qn2 r13 = r2.a
            java.lang.Object r13 = r13.g(r12)
            r5 = r13
            ap r5 = (defpackage.ap) r5
            r4 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            uo r11 = r10.c
            long r6 = r11.R
            eb4 r11 = r10.f
            dn r2 = new dn
            r9 = 0
            r3 = r10
            r4 = r12
            r5 = r0
            r2.<init>(r3, r4, r5, r6, r8, r9)
            java.lang.Object r10 = defpackage.eb4.a(r11, r2, r14)
            return r10
    }

    public final java.lang.Object d() {
            r0 = this;
            uo r0 = r0.c
            vs4 r0 = r0.B
            java.lang.Object r0 = r0.getValue()
            return r0
    }

    public final java.lang.Object e(defpackage.r41 r4, java.lang.Object r5) {
            r3 = this;
            en r0 = new en
            r1 = 0
            r2 = 0
            r0.<init>(r3, r5, r1, r2)
            eb4 r3 = r3.f
            java.lang.Object r3 = defpackage.eb4.a(r3, r0, r4)
            x61 r4 = defpackage.x61.COROUTINE_SUSPENDED
            if (r3 != r4) goto L12
            return r3
        L12:
            jg7 r3 = defpackage.jg7.a
            return r3
    }
}

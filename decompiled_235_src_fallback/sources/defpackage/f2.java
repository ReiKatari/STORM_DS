package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f2  reason: default package */
/* loaded from: classes.dex */
public final class f2 extends defpackage.d2 {
    public static defpackage.f2 d;
    public static final defpackage.jl5 e = null;
    public static final defpackage.jl5 f = null;
    public defpackage.a47 c;

    static {
            jl5 r0 = defpackage.jl5.Rtl
            defpackage.f2.e = r0
            jl5 r0 = defpackage.jl5.Ltr
            defpackage.f2.f = r0
            return
    }

    @Override // defpackage.d2
    public final int[] f(int r6) {
            r5 = this;
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            goto L49
        Lc:
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            if (r6 < r0) goto L17
            goto L49
        L17:
            a47 r0 = r5.c
            jl5 r2 = defpackage.f2.e
            java.lang.String r3 = "layoutResult"
            if (r6 >= 0) goto L2d
            if (r0 == 0) goto L29
            r6 = 0
            v84 r0 = r0.b
            int r6 = r0.d(r6)
            goto L3f
        L29:
            defpackage.nb3.a0(r3)
            throw r1
        L2d:
            if (r0 == 0) goto L5f
            v84 r0 = r0.b
            int r0 = r0.d(r6)
            int r4 = r5.s(r0, r2)
            if (r4 != r6) goto L3d
            r6 = r0
            goto L3f
        L3d:
            int r6 = r0 + 1
        L3f:
            a47 r0 = r5.c
            if (r0 == 0) goto L5b
            v84 r0 = r0.b
            int r0 = r0.f
            if (r6 < r0) goto L4a
        L49:
            return r1
        L4a:
            int r0 = r5.s(r6, r2)
            jl5 r1 = defpackage.f2.f
            int r6 = r5.s(r6, r1)
            int r6 = r6 + 1
            int[] r5 = r5.i(r0, r6)
            return r5
        L5b:
            defpackage.nb3.a0(r3)
            throw r1
        L5f:
            defpackage.nb3.a0(r3)
            throw r1
    }

    @Override // defpackage.d2
    public final int[] q(int r6) {
            r5 = this;
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Lc
            goto L4a
        Lc:
            if (r6 > 0) goto Lf
            goto L4a
        Lf:
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            a47 r2 = r5.c
            jl5 r3 = defpackage.f2.f
            java.lang.String r4 = "layoutResult"
            if (r6 <= r0) goto L34
            if (r2 == 0) goto L30
            java.lang.String r6 = r5.j()
            int r6 = r6.length()
            v84 r0 = r2.b
            int r6 = r0.d(r6)
            goto L48
        L30:
            defpackage.nb3.a0(r4)
            throw r1
        L34:
            if (r2 == 0) goto L5c
            v84 r0 = r2.b
            int r0 = r0.d(r6)
            int r2 = r5.s(r0, r3)
            int r2 = r2 + 1
            if (r2 != r6) goto L46
            r6 = r0
            goto L48
        L46:
            int r6 = r0 + (-1)
        L48:
            if (r6 >= 0) goto L4b
        L4a:
            return r1
        L4b:
            jl5 r0 = defpackage.f2.e
            int r0 = r5.s(r6, r0)
            int r6 = r5.s(r6, r3)
            int r6 = r6 + 1
            int[] r5 = r5.i(r0, r6)
            return r5
        L5c:
            defpackage.nb3.a0(r4)
            throw r1
    }

    public final int s(int r5, defpackage.jl5 r6) {
            r4 = this;
            a47 r0 = r4.c
            r1 = 0
            java.lang.String r2 = "layoutResult"
            if (r0 == 0) goto L36
            int r0 = r0.g(r5)
            a47 r3 = r4.c
            if (r3 == 0) goto L32
            jl5 r0 = r3.h(r0)
            a47 r4 = r4.c
            if (r6 == r0) goto L22
            if (r4 == 0) goto L1e
            int r4 = r4.g(r5)
            return r4
        L1e:
            defpackage.nb3.a0(r2)
            throw r1
        L22:
            if (r4 == 0) goto L2e
            r6 = 0
            v84 r4 = r4.b
            int r4 = r4.c(r5, r6)
            int r4 = r4 + (-1)
            return r4
        L2e:
            defpackage.nb3.a0(r2)
            throw r1
        L32:
            defpackage.nb3.a0(r2)
            throw r1
        L36:
            defpackage.nb3.a0(r2)
            throw r1
    }
}

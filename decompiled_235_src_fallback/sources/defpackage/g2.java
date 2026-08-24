package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g2  reason: default package */
/* loaded from: classes.dex */
public final class g2 extends defpackage.d2 {
    public static defpackage.g2 e;
    public static final defpackage.jl5 f = null;
    public static final defpackage.jl5 g = null;
    public defpackage.a47 c;
    public defpackage.xa6 d;

    static {
            jl5 r0 = defpackage.jl5.Rtl
            defpackage.g2.f = r0
            jl5 r0 = defpackage.jl5.Ltr
            defpackage.g2.g = r0
            return
    }

    @Override // defpackage.d2
    public final int[] f(int r6) {
            r5 = this;
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Ld
            goto L93
        Ld:
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            if (r6 < r0) goto L19
            goto L93
        L19:
            xa6 r0 = r5.d     // Catch: java.lang.IllegalStateException -> L93
            if (r0 == 0) goto L8d
            of5 r0 = r0.g()     // Catch: java.lang.IllegalStateException -> L93
            float r2 = r0.d     // Catch: java.lang.IllegalStateException -> L93
            float r0 = r0.b     // Catch: java.lang.IllegalStateException -> L93
            float r2 = r2 - r0
            int r0 = java.lang.Math.round(r2)     // Catch: java.lang.IllegalStateException -> L93
            if (r6 <= 0) goto L2d
            goto L2e
        L2d:
            r6 = 0
        L2e:
            a47 r2 = r5.c
            java.lang.String r3 = "layoutResult"
            if (r2 == 0) goto L89
            v84 r2 = r2.b
            int r2 = r2.d(r6)
            a47 r4 = r5.c
            if (r4 == 0) goto L85
            v84 r4 = r4.b
            float r2 = r4.f(r2)
            float r0 = (float) r0
            float r2 = r2 + r0
            a47 r0 = r5.c
            if (r0 == 0) goto L81
            v84 r0 = r0.b
            int r4 = r0.f
            int r4 = r4 + (-1)
            float r0 = r0.f(r4)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            a47 r4 = r5.c
            if (r0 >= 0) goto L69
            if (r4 == 0) goto L65
            v84 r0 = r4.b
            int r0 = r0.e(r2)
        L62:
            int r0 = r0 + (-1)
            goto L70
        L65:
            defpackage.nb3.a0(r3)
            throw r1
        L69:
            if (r4 == 0) goto L7d
            v84 r0 = r4.b
            int r0 = r0.f
            goto L62
        L70:
            jl5 r1 = defpackage.g2.g
            int r0 = r5.s(r0, r1)
            int r0 = r0 + 1
            int[] r5 = r5.i(r6, r0)
            return r5
        L7d:
            defpackage.nb3.a0(r3)
            throw r1
        L81:
            defpackage.nb3.a0(r3)
            throw r1
        L85:
            defpackage.nb3.a0(r3)
            throw r1
        L89:
            defpackage.nb3.a0(r3)
            throw r1
        L8d:
            java.lang.String r5 = "node"
            defpackage.nb3.a0(r5)     // Catch: java.lang.IllegalStateException -> L93
            throw r1     // Catch: java.lang.IllegalStateException -> L93
        L93:
            return r1
    }

    @Override // defpackage.d2
    public final int[] q(int r6) {
            r5 = this;
            java.lang.String r0 = r5.j()
            int r0 = r0.length()
            r1 = 0
            if (r0 > 0) goto Ld
            goto L82
        Ld:
            if (r6 > 0) goto L11
            goto L82
        L11:
            xa6 r0 = r5.d     // Catch: java.lang.IllegalStateException -> L82
            if (r0 == 0) goto L7c
            of5 r0 = r0.g()     // Catch: java.lang.IllegalStateException -> L82
            float r2 = r0.d     // Catch: java.lang.IllegalStateException -> L82
            float r0 = r0.b     // Catch: java.lang.IllegalStateException -> L82
            float r2 = r2 - r0
            int r0 = java.lang.Math.round(r2)     // Catch: java.lang.IllegalStateException -> L82
            java.lang.String r2 = r5.j()
            int r2 = r2.length()
            if (r2 <= r6) goto L2d
            goto L2e
        L2d:
            r6 = r2
        L2e:
            a47 r2 = r5.c
            java.lang.String r3 = "layoutResult"
            if (r2 == 0) goto L78
            v84 r2 = r2.b
            int r2 = r2.d(r6)
            a47 r4 = r5.c
            if (r4 == 0) goto L74
            v84 r4 = r4.b
            float r4 = r4.f(r2)
            float r0 = (float) r0
            float r4 = r4 - r0
            r0 = 0
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 <= 0) goto L5a
            a47 r0 = r5.c
            if (r0 == 0) goto L56
            v84 r0 = r0.b
            int r0 = r0.e(r4)
            goto L5b
        L56:
            defpackage.nb3.a0(r3)
            throw r1
        L5a:
            r0 = 0
        L5b:
            java.lang.String r1 = r5.j()
            int r1 = r1.length()
            if (r6 != r1) goto L69
            if (r0 >= r2) goto L69
            int r0 = r0 + 1
        L69:
            jl5 r1 = defpackage.g2.f
            int r0 = r5.s(r0, r1)
            int[] r5 = r5.i(r0, r6)
            return r5
        L74:
            defpackage.nb3.a0(r3)
            throw r1
        L78:
            defpackage.nb3.a0(r3)
            throw r1
        L7c:
            java.lang.String r5 = "node"
            defpackage.nb3.a0(r5)     // Catch: java.lang.IllegalStateException -> L82
            throw r1     // Catch: java.lang.IllegalStateException -> L82
        L82:
            return r1
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

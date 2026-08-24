package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ok1  reason: default package */
/* loaded from: classes.dex */
public abstract class ok1 {
    public static final defpackage.gr1 a = null;
    public static final defpackage.gr1 b = null;

    static {
            gr1 r0 = new gr1
            java.lang.String r1 = "UNDEFINED"
            r2 = 9
            r0.<init>(r1, r2)
            defpackage.ok1.a = r0
            gr1 r0 = new gr1
            java.lang.String r1 = "REUSABLE_CLAIMED"
            r0.<init>(r1, r2)
            defpackage.ok1.b = r0
            return
    }

    public static final void a(defpackage.r41 r9, java.lang.Object r10) {
            boolean r0 = r9 instanceof defpackage.nk1
            if (r0 == 0) goto Lae
            nk1 r9 = (defpackage.nk1) r9
            n61 r0 = r9.R
            s41 r1 = r9.X
            java.lang.Throwable r2 = defpackage.hm5.a(r10)
            if (r2 != 0) goto L12
            r3 = r10
            goto L18
        L12:
            av0 r3 = new av0
            r4 = 0
            r3.<init>(r2, r4)
        L18:
            l61 r2 = r1.b()
            boolean r2 = c(r0, r2)
            r4 = 1
            if (r2 == 0) goto L2f
            r9.Y = r3
            r9.L = r4
            l61 r10 = r1.b()
            b(r0, r10, r9)
            return
        L2f:
            l62 r0 = defpackage.m57.a()
            long r5 = r0.L
            r7 = 4294967296(0x100000000, double:2.121995791E-314)
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 < 0) goto L46
            r9.Y = r3
            r9.L = r4
            r0.o0(r9)
            goto La8
        L46:
            r0.p0(r4)
            l61 r2 = r1.b()     // Catch: java.lang.Throwable -> L69
            vs0 r3 = defpackage.vs0.h0     // Catch: java.lang.Throwable -> L69
            j61 r2 = r2.Z(r3)     // Catch: java.lang.Throwable -> L69
            rc3 r2 = (defpackage.rc3) r2     // Catch: java.lang.Throwable -> L69
            if (r2 == 0) goto L6b
            boolean r3 = r2.e()     // Catch: java.lang.Throwable -> L69
            if (r3 != 0) goto L6b
            java.util.concurrent.CancellationException r10 = r2.v()     // Catch: java.lang.Throwable -> L69
            em5 r10 = defpackage.oi2.p(r10)     // Catch: java.lang.Throwable -> L69
            r9.i(r10)     // Catch: java.lang.Throwable -> L69
            goto L8d
        L69:
            r10 = move-exception
            goto La4
        L6b:
            java.lang.Object r2 = r9.Z     // Catch: java.lang.Throwable -> L69
            l61 r3 = r1.b()     // Catch: java.lang.Throwable -> L69
            java.lang.Object r2 = defpackage.k57.c(r3, r2)     // Catch: java.lang.Throwable -> L69
            gr1 r5 = defpackage.k57.a     // Catch: java.lang.Throwable -> L69
            if (r2 == r5) goto L7e
            eg7 r5 = defpackage.mb3.O(r1, r3, r2)     // Catch: java.lang.Throwable -> L69
            goto L7f
        L7e:
            r5 = 0
        L7f:
            r1.i(r10)     // Catch: java.lang.Throwable -> L97
            if (r5 == 0) goto L8a
            boolean r10 = r5.x0()     // Catch: java.lang.Throwable -> L69
            if (r10 == 0) goto L8d
        L8a:
            defpackage.k57.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        L8d:
            boolean r10 = r0.r0()     // Catch: java.lang.Throwable -> L69
            if (r10 != 0) goto L8d
        L93:
            r0.n0(r4)
            goto La8
        L97:
            r10 = move-exception
            if (r5 == 0) goto La0
            boolean r1 = r5.x0()     // Catch: java.lang.Throwable -> L69
            if (r1 == 0) goto La3
        La0:
            defpackage.k57.a(r3, r2)     // Catch: java.lang.Throwable -> L69
        La3:
            throw r10     // Catch: java.lang.Throwable -> L69
        La4:
            r9.h(r10)     // Catch: java.lang.Throwable -> La9
            goto L93
        La8:
            return
        La9:
            r9 = move-exception
            r0.n0(r4)
            throw r9
        Lae:
            r9.i(r10)
            return
    }

    public static final void b(defpackage.n61 r1, defpackage.l61 r2, java.lang.Runnable r3) {
            r1.j0(r2, r3)     // Catch: java.lang.Throwable -> L4
            return
        L4:
            r3 = move-exception
            mk1 r0 = new mk1
            r0.<init>(r3, r1, r2)
            throw r0
    }

    public static final boolean c(defpackage.n61 r2, defpackage.l61 r3) {
            boolean r2 = r2.l0(r3)     // Catch: java.lang.Throwable -> L5
            return r2
        L5:
            r0 = move-exception
            mk1 r1 = new mk1
            r1.<init>(r0, r2, r3)
            throw r1
    }
}

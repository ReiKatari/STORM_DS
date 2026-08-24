package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ul5  reason: default package */
/* loaded from: classes.dex */
public final class ul5 {
    public defpackage.pa a;
    public defpackage.k55 b;
    public int c;
    public java.lang.String d;
    public defpackage.pv2 e;
    public defpackage.ww2 f;
    public defpackage.yl5 g;
    public defpackage.rm6 h;
    public defpackage.wl5 i;
    public defpackage.wl5 j;
    public defpackage.wl5 k;
    public long l;
    public long m;
    public defpackage.bk1 n;
    public defpackage.a97 o;

    public ul5() {
            r2 = this;
            r2.<init>()
            r0 = -1
            r2.c = r0
            xl5 r0 = defpackage.yl5.A
            r2.g = r0
            jd1 r0 = defpackage.a97.F
            r2.o = r0
            ww2 r0 = new ww2
            r1 = 0
            r0.<init>(r1, r1)
            r2.f = r0
            return
    }

    public static void b(java.lang.String r1, defpackage.wl5 r2) {
            if (r2 == 0) goto L2c
            wl5 r0 = r2.e0
            if (r0 != 0) goto L23
            wl5 r0 = r2.f0
            if (r0 != 0) goto L19
            wl5 r2 = r2.g0
            if (r2 != 0) goto Lf
            goto L2c
        Lf:
            java.lang.String r2 = ".priorResponse != null"
            java.lang.String r1 = r1.concat(r2)
            defpackage.i.f(r1)
            return
        L19:
            java.lang.String r2 = ".cacheResponse != null"
            java.lang.String r1 = r1.concat(r2)
            defpackage.i.f(r1)
            return
        L23:
            java.lang.String r2 = ".networkResponse != null"
            java.lang.String r1 = r1.concat(r2)
            defpackage.i.f(r1)
        L2c:
            return
    }

    public final defpackage.wl5 a() {
            r19 = this;
            r0 = r19
            int r4 = r0.c
            r1 = 0
            if (r4 < 0) goto L53
            r2 = r1
            pa r1 = r0.a
            if (r1 == 0) goto L4c
            r3 = r2
            k55 r2 = r0.b
            r5 = r3
            if (r2 == 0) goto L46
            java.lang.String r3 = r0.d
            if (r3 == 0) goto L40
            pv2 r5 = r0.e
            ww2 r6 = r0.f
            yw2 r6 = r6.f()
            yl5 r7 = r0.g
            rm6 r8 = r0.h
            wl5 r9 = r0.i
            wl5 r10 = r0.j
            wl5 r11 = r0.k
            long r12 = r0.l
            long r14 = r0.m
            r16 = r1
            bk1 r1 = r0.n
            a97 r0 = r0.o
            r17 = r0
            wl5 r0 = new wl5
            r18 = r16
            r16 = r1
            r1 = r18
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r14, r16, r17)
            return r0
        L40:
            java.lang.String r0 = "message == null"
            defpackage.i.m(r0)
            return r5
        L46:
            java.lang.String r0 = "protocol == null"
            defpackage.i.m(r0)
            return r5
        L4c:
            r5 = r2
            java.lang.String r0 = "request == null"
            defpackage.i.m(r0)
            return r5
        L53:
            r5 = r1
            java.lang.String r1 = "code < 0: "
            int r0 = r0.c
            defpackage.u34.u(r0, r1)
            return r5
    }
}

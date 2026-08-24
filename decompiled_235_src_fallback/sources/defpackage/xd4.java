package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd4  reason: default package */
/* loaded from: classes.dex */
public final class xd4 extends defpackage.oa4 {
    public final defpackage.oa4 o;
    public boolean p;

    public xd4(long r1, defpackage.zl6 r3, defpackage.qn2 r4, defpackage.qn2 r5, defpackage.oa4 r6) {
            r0 = this;
            r0.<init>(r1, r3, r4, r5)
            r0.o = r6
            r6.k()
            return
    }

    @Override // defpackage.oa4, defpackage.vl6
    public final void c() {
            r1 = this;
            boolean r0 = r1.c
            if (r0 != 0) goto L13
            super.c()
            boolean r0 = r1.p
            if (r0 != 0) goto L13
            r0 = 1
            r1.p = r0
            oa4 r1 = r1.o
            r1.l()
        L13:
            return
    }

    @Override // defpackage.oa4
    public final defpackage.qo2 w() {
            r11 = this;
            oa4 r0 = r11.o
            boolean r1 = r0.m
            if (r1 != 0) goto La
            boolean r1 = r0.c
            if (r1 == 0) goto Ld
        La:
            r2 = r11
            goto Lf8
        Ld:
            ka4 r5 = r11.h
            long r8 = r11.b
            r1 = 0
            if (r5 == 0) goto L24
            long r2 = r0.g()
            oa4 r0 = r11.o
            zl6 r0 = r0.d()
            java.util.HashMap r0 = defpackage.bm6.b(r2, r11, r0)
            r6 = r0
            goto L25
        L24:
            r6 = r1
        L25:
            java.lang.Object r10 = defpackage.bm6.c
            monitor-enter(r10)
            defpackage.bm6.c(r11)     // Catch: java.lang.Throwable -> L5a
            if (r5 == 0) goto L31
            int r0 = r5.d     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L33
        L31:
            r2 = r11
            goto L66
        L33:
            oa4 r0 = r11.o     // Catch: java.lang.Throwable -> L5a
            long r3 = r0.g()     // Catch: java.lang.Throwable -> L5a
            oa4 r0 = r11.o     // Catch: java.lang.Throwable -> L5a
            zl6 r7 = r0.d()     // Catch: java.lang.Throwable -> L5a
            r2 = r11
            qo2 r11 = r2.z(r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L5a
            xl6 r0 = defpackage.xl6.b     // Catch: java.lang.Throwable -> L5a
            boolean r0 = r11.equals(r0)     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L4e
            monitor-exit(r10)
            return r11
        L4e:
            oa4 r11 = r2.o     // Catch: java.lang.Throwable -> L5a
            ka4 r11 = r11.x()     // Catch: java.lang.Throwable -> L5a
            if (r11 == 0) goto L5e
            r11.j(r5)     // Catch: java.lang.Throwable -> L5a
            goto L69
        L5a:
            r0 = move-exception
            r11 = r0
            goto Lf6
        L5e:
            oa4 r11 = r2.o     // Catch: java.lang.Throwable -> L5a
            r11.B(r5)     // Catch: java.lang.Throwable -> L5a
            r2.h = r1     // Catch: java.lang.Throwable -> L5a
            goto L69
        L66:
            r2.a()     // Catch: java.lang.Throwable -> L5a
        L69:
            oa4 r11 = r2.o     // Catch: java.lang.Throwable -> L5a
            long r0 = r11.g()     // Catch: java.lang.Throwable -> L5a
            int r11 = defpackage.nb3.q(r0, r8)     // Catch: java.lang.Throwable -> L5a
            if (r11 >= 0) goto L7a
            oa4 r11 = r2.o     // Catch: java.lang.Throwable -> L5a
            r11.v()     // Catch: java.lang.Throwable -> L5a
        L7a:
            oa4 r11 = r2.o     // Catch: java.lang.Throwable -> L5a
            zl6 r0 = r11.d()     // Catch: java.lang.Throwable -> L5a
            zl6 r0 = r0.b(r8)     // Catch: java.lang.Throwable -> L5a
            zl6 r1 = r2.j     // Catch: java.lang.Throwable -> L5a
            zl6 r0 = r0.a(r1)     // Catch: java.lang.Throwable -> L5a
            r11.r(r0)     // Catch: java.lang.Throwable -> L5a
            oa4 r11 = r2.o     // Catch: java.lang.Throwable -> L5a
            r11.A(r8)     // Catch: java.lang.Throwable -> L5a
            oa4 r11 = r2.o     // Catch: java.lang.Throwable -> L5a
            int r0 = r2.d     // Catch: java.lang.Throwable -> L5a
            r1 = -1
            r2.d = r1     // Catch: java.lang.Throwable -> L5a
            if (r0 < 0) goto Lac
            int[] r1 = r11.k     // Catch: java.lang.Throwable -> L5a
            r1.getClass()     // Catch: java.lang.Throwable -> L5a
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5a
            int r4 = r3 + 1
            int[] r1 = java.util.Arrays.copyOf(r1, r4)     // Catch: java.lang.Throwable -> L5a
            r1[r3] = r0     // Catch: java.lang.Throwable -> L5a
            r11.k = r1     // Catch: java.lang.Throwable -> L5a
            goto Laf
        Lac:
            r11.getClass()     // Catch: java.lang.Throwable -> L5a
        Laf:
            oa4 r11 = r2.o     // Catch: java.lang.Throwable -> L5a
            zl6 r0 = r2.j     // Catch: java.lang.Throwable -> L5a
            r11.getClass()     // Catch: java.lang.Throwable -> L5a
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L5a
            zl6 r1 = r11.j     // Catch: java.lang.Throwable -> Lf2
            zl6 r0 = r1.d(r0)     // Catch: java.lang.Throwable -> Lf2
            r11.j = r0     // Catch: java.lang.Throwable -> Lf2
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5a
            oa4 r11 = r2.o     // Catch: java.lang.Throwable -> L5a
            int[] r0 = r2.k     // Catch: java.lang.Throwable -> L5a
            r11.getClass()     // Catch: java.lang.Throwable -> L5a
            int r1 = r0.length     // Catch: java.lang.Throwable -> L5a
            if (r1 != 0) goto Lcb
            goto Le0
        Lcb:
            int[] r1 = r11.k     // Catch: java.lang.Throwable -> L5a
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5a
            if (r3 != 0) goto Ld1
            goto Lde
        Ld1:
            int r3 = r1.length     // Catch: java.lang.Throwable -> L5a
            int r4 = r0.length     // Catch: java.lang.Throwable -> L5a
            int r5 = r3 + r4
            int[] r1 = java.util.Arrays.copyOf(r1, r5)     // Catch: java.lang.Throwable -> L5a
            r5 = 0
            java.lang.System.arraycopy(r0, r5, r1, r3, r4)     // Catch: java.lang.Throwable -> L5a
            r0 = r1
        Lde:
            r11.k = r0     // Catch: java.lang.Throwable -> L5a
        Le0:
            monitor-exit(r10)
            r11 = 1
            r2.m = r11
            boolean r0 = r2.p
            if (r0 != 0) goto Lef
            r2.p = r11
            oa4 r11 = r2.o
            r11.l()
        Lef:
            xl6 r11 = defpackage.xl6.b
            return r11
        Lf2:
            r0 = move-exception
            r11 = r0
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L5a
            throw r11     // Catch: java.lang.Throwable -> L5a
        Lf6:
            monitor-exit(r10)
            throw r11
        Lf8:
            wl6 r11 = new wl6
            r11.<init>(r2)
            return r11
    }
}

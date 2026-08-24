package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qk1  reason: default package */
/* loaded from: classes.dex */
public abstract class qk1 extends defpackage.mz6 {
    public int L;

    public qk1(int r4) {
            r3 = this;
            r0 = 0
            r2 = 0
            r3.<init>(r0, r2)
            r3.L = r4
            return
    }

    public void c(java.util.concurrent.CancellationException r1) {
            r0 = this;
            return
    }

    public abstract defpackage.r41 d();

    public java.lang.Throwable e(java.lang.Object r2) {
            r1 = this;
            boolean r1 = r2 instanceof defpackage.av0
            r0 = 0
            if (r1 == 0) goto L8
            av0 r2 = (defpackage.av0) r2
            goto L9
        L8:
            r2 = r0
        L9:
            if (r2 == 0) goto Le
            java.lang.Throwable r1 = r2.a
            return r1
        Le:
            return r0
    }

    public java.lang.Object g(java.lang.Object r1) {
            r0 = this;
            return r1
    }

    public final void h(java.lang.Throwable r4) {
            r3 = this;
            d71 r0 = new d71
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Fatal exception in coroutines machinery for "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r2 = ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers"
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1, r4)
            r41 r3 = r3.d()
            l61 r3 = r3.b()
            defpackage.f04.H(r3, r0)
            return
    }

    public abstract java.lang.Object k();

    @Override // java.lang.Runnable
    public final void run() {
            r11 = this;
            r41 r0 = r11.d()     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            r0.getClass()     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            nk1 r0 = (defpackage.nk1) r0     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            s41 r1 = r0.X     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            java.lang.Object r0 = r0.Z     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            l61 r2 = r1.b()     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            java.lang.Object r0 = defpackage.k57.c(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            gr1 r3 = defpackage.k57.a     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            r4 = 0
            if (r0 == r3) goto L25
            eg7 r3 = defpackage.mb3.O(r1, r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            goto L26
        L1f:
            r0 = move-exception
            goto L8c
        L22:
            r0 = move-exception
            goto L90
        L25:
            r3 = r4
        L26:
            l61 r5 = r1.b()     // Catch: java.lang.Throwable -> L49
            java.lang.Object r6 = r11.k()     // Catch: java.lang.Throwable -> L49
            java.lang.Throwable r7 = r11.e(r6)     // Catch: java.lang.Throwable -> L49
            if (r7 != 0) goto L4b
            int r8 = r11.L     // Catch: java.lang.Throwable -> L49
            r9 = 1
            if (r8 == r9) goto L3e
            r10 = 2
            if (r8 != r10) goto L3d
            goto L3e
        L3d:
            r9 = 0
        L3e:
            if (r9 == 0) goto L4b
            vs0 r4 = defpackage.vs0.h0     // Catch: java.lang.Throwable -> L49
            j61 r4 = r5.Z(r4)     // Catch: java.lang.Throwable -> L49
            rc3 r4 = (defpackage.rc3) r4     // Catch: java.lang.Throwable -> L49
            goto L4b
        L49:
            r1 = move-exception
            goto L80
        L4b:
            if (r4 == 0) goto L62
            boolean r5 = r4.e()     // Catch: java.lang.Throwable -> L49
            if (r5 != 0) goto L62
            java.util.concurrent.CancellationException r4 = r4.v()     // Catch: java.lang.Throwable -> L49
            r11.c(r4)     // Catch: java.lang.Throwable -> L49
            em5 r4 = defpackage.oi2.p(r4)     // Catch: java.lang.Throwable -> L49
            r1.i(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L62:
            if (r7 == 0) goto L6d
            em5 r4 = new em5     // Catch: java.lang.Throwable -> L49
            r4.<init>(r7)     // Catch: java.lang.Throwable -> L49
            r1.i(r4)     // Catch: java.lang.Throwable -> L49
            goto L74
        L6d:
            java.lang.Object r4 = r11.g(r6)     // Catch: java.lang.Throwable -> L49
            r1.i(r4)     // Catch: java.lang.Throwable -> L49
        L74:
            if (r3 == 0) goto L7c
            boolean r1 = r3.x0()     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            if (r1 == 0) goto L9d
        L7c:
            defpackage.k57.a(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            return
        L80:
            if (r3 == 0) goto L88
            boolean r3 = r3.x0()     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
            if (r3 == 0) goto L8b
        L88:
            defpackage.k57.a(r2, r0)     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
        L8b:
            throw r1     // Catch: java.lang.Throwable -> L1f defpackage.mk1 -> L22
        L8c:
            r11.h(r0)
            goto L9d
        L90:
            r41 r11 = r11.d()
            l61 r11 = r11.b()
            java.lang.Throwable r0 = r0.A
            defpackage.f04.H(r11, r0)
        L9d:
            return
    }
}

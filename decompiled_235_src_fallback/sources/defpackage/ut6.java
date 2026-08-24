package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ut6  reason: default package */
/* loaded from: classes.dex */
public final class ut6 implements defpackage.ne2 {
    public final defpackage.ne2 A;
    public final defpackage.bf4 B;

    public ut6(defpackage.ne2 r1, defpackage.bf4 r2) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r2
            return
    }

    @Override // defpackage.ne2
    public final java.lang.Object a(java.lang.Object r1, defpackage.r41 r2) {
            r0 = this;
            ne2 r0 = r0.A
            java.lang.Object r0 = r0.a(r1, r2)
            return r0
    }

    public final java.lang.Object b(defpackage.s41 r10) {
            r9 = this;
            boolean r0 = r10 instanceof defpackage.tt6
            if (r0 == 0) goto L13
            r0 = r10
            tt6 r0 = (defpackage.tt6) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            tt6 r0 = new tt6
            r0.<init>(r9, r10)
        L18:
            java.lang.Object r10 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            jg7 r3 = defpackage.jg7.a
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L33
            if (r2 != r5) goto L2d
            defpackage.oi2.Y(r10)
            return r3
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r9)
            return r4
        L33:
            k36 r9 = r0.X
            ut6 r2 = r0.R
            defpackage.oi2.Y(r10)     // Catch: java.lang.Throwable -> L3b
            goto L5d
        L3b:
            r10 = move-exception
            goto L7a
        L3d:
            defpackage.oi2.Y(r10)
            k36 r10 = new k36
            l61 r2 = r0.B
            r2.getClass()
            ne2 r7 = r9.A
            r10.<init>(r7, r2)
            bf4 r2 = r9.B     // Catch: java.lang.Throwable -> L76
            r0.R = r9     // Catch: java.lang.Throwable -> L76
            r0.X = r10     // Catch: java.lang.Throwable -> L76
            r0.d0 = r6     // Catch: java.lang.Throwable -> L76
            java.lang.Object r2 = r2.o(r10, r0)     // Catch: java.lang.Throwable -> L76
            if (r2 != r1) goto L5b
            goto L74
        L5b:
            r2 = r9
            r9 = r10
        L5d:
            r9.u()
            ne2 r9 = r2.A
            boolean r10 = r9 instanceof defpackage.ut6
            if (r10 == 0) goto L75
            ut6 r9 = (defpackage.ut6) r9
            r0.R = r4
            r0.X = r4
            r0.d0 = r5
            java.lang.Object r9 = r9.b(r0)
            if (r9 != r1) goto L75
        L74:
            return r1
        L75:
            return r3
        L76:
            r9 = move-exception
            r8 = r10
            r10 = r9
            r9 = r8
        L7a:
            r9.u()
            throw r10
    }
}

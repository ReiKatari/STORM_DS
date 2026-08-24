package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ft4  reason: default package */
/* loaded from: classes.dex */
public final class ft4 implements defpackage.d97, defpackage.ud5 {
    public final defpackage.eo2 a;
    public final defpackage.e36 b;
    public final java.util.concurrent.atomic.AtomicInteger c;
    public defpackage.c97 d;

    public ft4(defpackage.eo2 r1, defpackage.e36 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            java.util.concurrent.atomic.AtomicInteger r1 = new java.util.concurrent.atomic.AtomicInteger
            r2 = 0
            r1.<init>(r2)
            r0.c = r1
            return
    }

    @Override // defpackage.d97
    public final java.lang.Object a(defpackage.c97 r7, defpackage.eo2 r8, defpackage.hw6 r9) {
            r6 = this;
            ad r0 = new ad
            r4 = 0
            r5 = 2
            r1 = r6
            r2 = r7
            r3 = r8
            r0.<init>(r1, r2, r3, r4, r5)
            eo2 r6 = r1.a
            java.lang.Object r6 = r6.o(r0, r9)
            x61 r7 = defpackage.x61.COROUTINE_SUSPENDED
            return r6
    }

    @Override // defpackage.jz4
    public final java.lang.Object b(java.lang.String r11, defpackage.qn2 r12, defpackage.s41 r13) {
            r10 = this;
            boolean r0 = r13 instanceof defpackage.et4
            if (r0 == 0) goto L13
            r0 = r13
            et4 r0 = (defpackage.et4) r0
            int r1 = r0.d0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d0 = r1
            goto L18
        L13:
            et4 r0 = new et4
            r0.<init>(r10, r13)
        L18:
            java.lang.Object r13 = r0.Y
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.d0
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L31
            if (r2 != r3) goto L2a
            defpackage.oi2.Y(r13)
            return r13
        L2a:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r10)
            r10 = 0
            return r10
        L31:
            qn2 r12 = r0.X
            java.lang.String r11 = r0.R
            defpackage.oi2.Y(r13)
        L38:
            r6 = r11
            r7 = r12
            goto L4b
        L3b:
            defpackage.oi2.Y(r13)
            r0.R = r11
            r0.X = r12
            r0.d0 = r4
            java.lang.Boolean r13 = r10.c(r0)
            if (r13 != r1) goto L38
            goto L69
        L4b:
            java.lang.Boolean r13 = (java.lang.Boolean) r13
            boolean r11 = r13.booleanValue()
            r8 = 0
            if (r11 == 0) goto L6b
            yh0 r4 = new yh0
            r9 = 1
            r5 = r10
            r4.<init>(r5, r6, r7, r8, r9)
            r0.R = r8
            r0.X = r8
            r0.d0 = r3
            eo2 r10 = r5.a
            java.lang.Object r10 = r10.o(r4, r0)
            if (r10 != r1) goto L6a
        L69:
            return r1
        L6a:
            return r10
        L6b:
            r5 = r10
            e36 r10 = r5.b
            j36 r10 = r10.i0(r6)
            java.lang.Object r11 = r7.g(r10)     // Catch: java.lang.Throwable -> L7a
            defpackage.lb4.p(r10, r8)
            return r11
        L7a:
            r0 = move-exception
            r11 = r0
            throw r11     // Catch: java.lang.Throwable -> L7d
        L7d:
            r0 = move-exception
            r12 = r0
            defpackage.lb4.p(r10, r11)
            throw r12
    }

    @Override // defpackage.d97
    public final java.lang.Boolean c(defpackage.r41 r1) {
            r0 = this;
            c97 r1 = r0.d
            if (r1 != 0) goto Lf
            e36 r0 = r0.b
            boolean r0 = r0.Y()
            if (r0 == 0) goto Ld
            goto Lf
        Ld:
            r0 = 0
            goto L10
        Lf:
            r0 = 1
        L10:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @Override // defpackage.ud5
    public final defpackage.e36 d() {
            r0 = this;
            e36 r0 = r0.b
            return r0
    }

    public final java.lang.Object e(defpackage.c97 r9, defpackage.eo2 r10, defpackage.s41 r11) {
            r8 = this;
            boolean r0 = r11 instanceof defpackage.dt4
            if (r0 == 0) goto L13
            r0 = r11
            dt4 r0 = (defpackage.dt4) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            dt4 r0 = new dt4
            r0.<init>(r8, r11)
        L18:
            java.lang.Object r11 = r0.X
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Z
            java.lang.String r3 = "ROLLBACK TRANSACTION"
            r4 = 0
            java.util.concurrent.atomic.AtomicInteger r5 = r8.c
            r6 = 1
            e36 r7 = r8.b
            if (r2 == 0) goto L38
            if (r2 != r6) goto L32
            int r6 = r0.R
            defpackage.oi2.Y(r11)     // Catch: java.lang.Throwable -> L30
            goto L79
        L30:
            r9 = move-exception
            goto L8d
        L32:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r8)
            return r4
        L38:
            defpackage.oi2.Y(r11)
            int[] r11 = defpackage.ct4.a
            int r2 = r9.ordinal()
            r11 = r11[r2]
            if (r11 == r6) goto L5b
            r2 = 2
            if (r11 == r2) goto L55
            r2 = 3
            if (r11 != r2) goto L51
            java.lang.String r11 = "BEGIN EXCLUSIVE TRANSACTION"
            defpackage.ii2.s(r7, r11)
            goto L60
        L51:
            defpackage.i.d()
            return r4
        L55:
            java.lang.String r11 = "BEGIN IMMEDIATE TRANSACTION"
            defpackage.ii2.s(r7, r11)
            goto L60
        L5b:
            java.lang.String r11 = "BEGIN DEFERRED TRANSACTION"
            defpackage.ii2.s(r7, r11)
        L60:
            int r11 = r5.incrementAndGet()
            if (r11 <= 0) goto L68
            r8.d = r9
        L68:
            bt4 r9 = new bt4     // Catch: java.lang.Throwable -> L30
            r11 = 0
            r9.<init>(r8, r11)     // Catch: java.lang.Throwable -> L30
            r0.R = r6     // Catch: java.lang.Throwable -> L30
            r0.Z = r6     // Catch: java.lang.Throwable -> L30
            java.lang.Object r11 = r10.o(r9, r0)     // Catch: java.lang.Throwable -> L30
            if (r11 != r1) goto L79
            return r1
        L79:
            int r9 = r5.decrementAndGet()
            if (r9 != 0) goto L81
            r8.d = r4
        L81:
            if (r6 == 0) goto L89
            java.lang.String r8 = "END TRANSACTION"
            defpackage.ii2.s(r7, r8)
            return r11
        L89:
            defpackage.ii2.s(r7, r3)
            return r11
        L8d:
            throw r9     // Catch: java.lang.Throwable -> L8e
        L8e:
            r10 = move-exception
            int r11 = r5.decrementAndGet()     // Catch: android.database.SQLException -> L98
            if (r11 != 0) goto L9a
            r8.d = r4     // Catch: android.database.SQLException -> L98
            goto L9a
        L98:
            r8 = move-exception
            goto L9e
        L9a:
            defpackage.ii2.s(r7, r3)     // Catch: android.database.SQLException -> L98
            goto La1
        L9e:
            defpackage.mb3.q(r9, r8)
        La1:
            throw r10
    }
}

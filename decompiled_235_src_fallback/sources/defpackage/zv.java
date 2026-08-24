package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zv  reason: default package */
/* loaded from: classes.dex */
public final class zv implements defpackage.pp6 {
    public final java.util.List A;
    public final defpackage.te7 B;
    public final defpackage.qn2 L;
    public final defpackage.vs4 R;
    public boolean X;

    public zv(java.util.List r1, java.lang.Object r2, defpackage.te7 r3, defpackage.bt r4, defpackage.qn2 r5, defpackage.rh r6) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            r0.B = r3
            r0.L = r5
            vs4 r1 = defpackage.np2.Y(r2)
            r0.R = r1
            r1 = 1
            r0.X = r1
            return
    }

    public final java.lang.Object a(defpackage.s41 r14) {
            r13 = this;
            boolean r0 = r14 instanceof defpackage.yv
            if (r0 == 0) goto L13
            r0 = r14
            yv r0 = (defpackage.yv) r0
            int r1 = r0.f0
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f0 = r1
            goto L18
        L13:
            yv r0 = new yv
            r0.<init>(r13, r14)
        L18:
            java.lang.Object r14 = r0.d0
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.f0
            jg7 r3 = defpackage.jg7.a
            qn2 r4 = r13.L
            vs4 r5 = r13.R
            r6 = 1
            r7 = 0
            if (r2 == 0) goto L8a
            r8 = 0
            r9 = 2
            if (r2 == r6) goto L41
            if (r2 != r9) goto L3b
            int r1 = r0.Z
            int r2 = r0.Y
            java.util.List r8 = r0.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L38
            goto La0
        L38:
            r14 = move-exception
            goto Lb7
        L3b:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r13)
            return r8
        L41:
            int r2 = r0.Z
            int r10 = r0.Y
            ll5 r11 = r0.X
            java.util.List r12 = r0.R
            defpackage.oi2.Y(r14)     // Catch: java.lang.Throwable -> L38
            if (r14 == 0) goto L75
            te7 r1 = r13.B     // Catch: java.lang.Throwable -> L38
            int r2 = r1.d     // Catch: java.lang.Throwable -> L38
            oj2 r6 = r1.b     // Catch: java.lang.Throwable -> L38
            int r1 = r1.c     // Catch: java.lang.Throwable -> L38
            java.lang.Object r14 = defpackage.kj2.Z(r2, r14, r11, r6, r1)     // Catch: java.lang.Throwable -> L38
            r5.setValue(r14)     // Catch: java.lang.Throwable -> L38
            l61 r14 = r0.B
            r14.getClass()
            boolean r14 = defpackage.yh2.z(r14)
            r13.X = r7
            ve7 r13 = new ve7
            java.lang.Object r0 = r5.getValue()
            r13.<init>(r14, r0)
        L71:
            r4.g(r13)
            return r3
        L75:
            r0.R = r12     // Catch: java.lang.Throwable -> L38
            r0.X = r8     // Catch: java.lang.Throwable -> L38
            r0.Y = r10     // Catch: java.lang.Throwable -> L38
            r0.Z = r2     // Catch: java.lang.Throwable -> L38
            r0.f0 = r9     // Catch: java.lang.Throwable -> L38
            java.lang.Object r14 = defpackage.ps7.b(r0)     // Catch: java.lang.Throwable -> L38
            if (r14 != r1) goto L86
            return r1
        L86:
            r1 = r2
            r2 = r10
            r8 = r12
            goto La0
        L8a:
            defpackage.oi2.Y(r14)
            java.util.List r14 = r13.A     // Catch: java.lang.Throwable -> L38
            int r1 = r14.size()     // Catch: java.lang.Throwable -> L38
            r8 = r14
            r2 = r7
        L95:
            if (r2 >= r1) goto La2
            java.lang.Object r14 = r8.get(r2)     // Catch: java.lang.Throwable -> L38
            ll5 r14 = (defpackage.ll5) r14     // Catch: java.lang.Throwable -> L38
            r14.getClass()     // Catch: java.lang.Throwable -> L38
        La0:
            int r2 = r2 + r6
            goto L95
        La2:
            l61 r14 = r0.B
            r14.getClass()
            boolean r14 = defpackage.yh2.z(r14)
            r13.X = r7
            ve7 r13 = new ve7
            java.lang.Object r0 = r5.getValue()
            r13.<init>(r14, r0)
            goto L71
        Lb7:
            l61 r0 = r0.B
            r0.getClass()
            boolean r0 = defpackage.yh2.z(r0)
            r13.X = r7
            ve7 r13 = new ve7
            java.lang.Object r1 = r5.getValue()
            r13.<init>(r0, r1)
            r4.g(r13)
            throw r14
    }

    @Override // defpackage.pp6
    public final java.lang.Object getValue() {
            r0 = this;
            vs4 r0 = r0.R
            java.lang.Object r0 = r0.getValue()
            return r0
    }
}

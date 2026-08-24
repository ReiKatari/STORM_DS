package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yx4  reason: default package */
/* loaded from: classes.dex */
public final class yx4 extends defpackage.hw6 implements defpackage.eo2 {
    public defpackage.hb4 X;
    public defpackage.zx4 Y;
    public java.lang.CharSequence Z;
    public long d0;
    public int e0;
    public /* synthetic */ java.lang.Object f0;
    public final /* synthetic */ java.lang.CharSequence g0;
    public final /* synthetic */ long h0;
    public final /* synthetic */ defpackage.zx4 i0;

    public yx4(long r1, defpackage.r41 r3, defpackage.zx4 r4, java.lang.CharSequence r5) {
            r0 = this;
            r0.g0 = r5
            r0.h0 = r1
            r0.i0 = r4
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            android.view.textclassifier.TextClassifier r1 = defpackage.oc3.d(r1)
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            yx4 r0 = (defpackage.yx4) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r7, java.lang.Object r8) {
            r6 = this;
            yx4 r0 = new yx4
            long r1 = r6.h0
            zx4 r4 = r6.i0
            java.lang.CharSequence r5 = r6.g0
            r3 = r7
            r0.<init>(r1, r3, r4, r5)
            r0.f0 = r8
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r12.e0
            r2 = 2
            r3 = 1
            r4 = 0
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L1a
            if (r1 != r2) goto L14
            long r0 = r12.d0
            defpackage.oi2.Y(r13)
            goto Lbf
        L14:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            return r4
        L1a:
            long r0 = r12.d0
            java.lang.CharSequence r2 = r12.Z
            zx4 r3 = r12.Y
            hb4 r5 = r12.X
            java.lang.Object r12 = r12.f0
            android.view.textclassifier.TextSelection r12 = defpackage.oc3.e(r12)
            defpackage.oi2.Y(r13)
            goto L92
        L2c:
            defpackage.oi2.Y(r13)
            java.lang.Object r13 = r12.f0
            android.view.textclassifier.TextClassifier r9 = defpackage.oc3.d(r13)
            defpackage.yr1.C()
            long r5 = r12.h0
            int r13 = defpackage.k47.f(r5)
            int r1 = defpackage.k47.e(r5)
            java.lang.CharSequence r5 = r12.g0
            android.view.textclassifier.TextSelection$Request$Builder r13 = defpackage.yr1.q(r5, r13, r1)
            zx4 r1 = r12.i0
            android.os.LocaleList r6 = r1.b()
            android.view.textclassifier.TextSelection$Request$Builder r13 = defpackage.yr1.p(r13, r6)
            int r6 = android.os.Build.VERSION.SDK_INT
            r7 = 31
            if (r6 < r7) goto L5b
            defpackage.sd0.x(r13)
        L5b:
            android.view.textclassifier.TextSelection$Request r13 = defpackage.yr1.r(r13)
            android.view.textclassifier.TextSelection r13 = defpackage.yr1.s(r9, r13)
            int r8 = defpackage.oc3.a(r13)
            int r10 = defpackage.oc3.w(r13)
            long r10 = defpackage.jx2.f(r8, r10)
            if (r6 < r7) goto Lad
            android.view.textclassifier.TextClassification r6 = defpackage.sd0.p(r13)
            if (r6 == 0) goto Lad
            hb4 r2 = r1.e
            r12.f0 = r13
            r12.X = r2
            r12.Y = r1
            r12.Z = r5
            r12.d0 = r10
            r12.e0 = r3
            java.lang.Object r12 = r2.e(r12)
            if (r12 != r0) goto L8c
            goto Lbd
        L8c:
            r12 = r5
            r5 = r2
            r2 = r12
            r12 = r13
            r3 = r1
            r0 = r10
        L92:
            h07 r13 = new h07     // Catch: java.lang.Throwable -> La7
            android.view.textclassifier.TextClassification r12 = defpackage.sd0.C(r12)     // Catch: java.lang.Throwable -> La7
            r12.getClass()     // Catch: java.lang.Throwable -> La7
            r13.<init>(r2, r0, r12)     // Catch: java.lang.Throwable -> La7
            vs4 r12 = r3.g     // Catch: java.lang.Throwable -> La7
            r12.setValue(r13)     // Catch: java.lang.Throwable -> La7
            r5.h(r4)
            goto Lbf
        La7:
            r0 = move-exception
            r12 = r0
            r5.h(r4)
            throw r12
        Lad:
            r12.d0 = r10
            r12.e0 = r2
            zx4 r5 = r12.i0
            java.lang.CharSequence r6 = r12.g0
            r7 = r10
            r10 = r12
            java.lang.Object r12 = defpackage.zx4.a(r5, r6, r7, r9, r10)
            if (r12 != r0) goto Lbe
        Lbd:
            return r0
        Lbe:
            r0 = r7
        Lbf:
            k47 r12 = new k47
            r12.<init>(r0)
            return r12
    }
}

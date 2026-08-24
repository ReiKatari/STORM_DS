package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: fa4  reason: default package */
/* loaded from: classes.dex */
public final class fa4 extends defpackage.dm5 implements defpackage.eo2 {
    public defpackage.rr2 L;
    public defpackage.ga4 R;
    public long[] X;
    public int Y;
    public int Z;
    public /* synthetic */ java.lang.Object d0;
    public final /* synthetic */ defpackage.ga4 e0;
    public final /* synthetic */ defpackage.rr2 f0;

    public fa4(defpackage.ga4 r1, defpackage.rr2 r2, defpackage.r41 r3) {
            r0 = this;
            r0.e0 = r1
            r0.f0 = r2
            r1 = 2
            r0.<init>(r1, r3)
            return
    }

    @Override // defpackage.eo2
    public final java.lang.Object o(java.lang.Object r1, java.lang.Object r2) {
            r0 = this;
            rb6 r1 = (defpackage.rb6) r1
            r41 r2 = (defpackage.r41) r2
            r41 r0 = r0.q(r2, r1)
            fa4 r0 = (defpackage.fa4) r0
            jg7 r1 = defpackage.jg7.a
            java.lang.Object r0 = r0.s(r1)
            return r0
    }

    @Override // defpackage.d20
    public final defpackage.r41 q(defpackage.r41 r3, java.lang.Object r4) {
            r2 = this;
            fa4 r0 = new fa4
            ga4 r1 = r2.e0
            rr2 r2 = r2.f0
            r0.<init>(r1, r2, r3)
            r0.d0 = r4
            return r0
    }

    @Override // defpackage.d20
    public final java.lang.Object s(java.lang.Object r13) {
            r12 = this;
            x61 r0 = defpackage.x61.COROUTINE_SUSPENDED
            int r1 = r12.Z
            r2 = 1
            if (r1 == 0) goto L24
            if (r1 != r2) goto L1d
            int r1 = r12.Y
            long[] r3 = r12.X
            ga4 r4 = r12.R
            rr2 r5 = r12.L
            java.lang.Object r6 = r12.d0
            rb6 r6 = (defpackage.rb6) r6
            defpackage.oi2.Y(r13)
            r11 = r3
            r3 = r1
            r1 = r4
            r4 = r11
            goto L36
        L1d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r12)
            r12 = 0
            return r12
        L24:
            defpackage.oi2.Y(r13)
            java.lang.Object r13 = r12.d0
            rb6 r13 = (defpackage.rb6) r13
            ga4 r1 = r12.e0
            ea4 r3 = r1.B
            long[] r4 = r3.c
            int r3 = r3.e
            rr2 r5 = r12.f0
            r6 = r13
        L36:
            r13 = 2147483647(0x7fffffff, float:NaN)
            if (r3 == r13) goto L62
            r7 = r4[r3]
            r13 = 31
            long r7 = r7 >> r13
            r9 = 2147483647(0x7fffffff, double:1.060997895E-314)
            long r7 = r7 & r9
            int r13 = (int) r7
            r5.B = r3
            ea4 r7 = r1.B
            java.lang.Object[] r7 = r7.b
            r3 = r7[r3]
            r12.d0 = r6
            r12.L = r5
            r12.R = r1
            r12.X = r4
            r12.Y = r13
            r12.Z = r2
            x61 r3 = r6.c(r12, r3)
            if (r3 != r0) goto L60
            return r0
        L60:
            r3 = r13
            goto L36
        L62:
            jg7 r12 = defpackage.jg7.a
            return r12
    }
}

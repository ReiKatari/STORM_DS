package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vr5  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class vr5 implements defpackage.on2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ int B;
    public final /* synthetic */ int L;
    public final /* synthetic */ java.lang.Object R;
    public final /* synthetic */ java.lang.Object X;
    public final /* synthetic */ java.lang.Object Y;

    public /* synthetic */ vr5(defpackage.ls0 r2, int r3, int r4, defpackage.ci r5, defpackage.go3 r6) {
            r1 = this;
            r0 = 1
            r1.A = r0
            r1.<init>()
            r1.R = r2
            r1.B = r3
            r1.L = r4
            r1.X = r5
            r1.Y = r6
            return
    }

    public /* synthetic */ vr5(defpackage.ss5 r2, defpackage.ip3 r3, defpackage.pr3 r4, int r5, int r6) {
            r1 = this;
            r0 = 0
            r1.A = r0
            r1.<init>()
            r1.R = r2
            r1.X = r3
            r1.Y = r4
            r1.B = r5
            r1.L = r6
            return
    }

    @Override // defpackage.on2
    public final java.lang.Object c() {
            r17 = this;
            r0 = r17
            int r1 = r0.A
            r2 = 1
            r3 = 0
            java.lang.Object r4 = r0.Y
            java.lang.Object r5 = r0.X
            int r6 = r0.L
            int r7 = r0.B
            java.lang.Object r0 = r0.R
            switch(r1) {
                case 0: goto L8e;
                default: goto L13;
            }
        L13:
            ls0 r0 = (defpackage.ls0) r0
            java.lang.Object r1 = r0.e
            a47 r1 = (defpackage.a47) r1
            ci r5 = (defpackage.ci) r5
            go3 r4 = (defpackage.go3) r4
            java.lang.Object r4 = r4.getValue()
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            boolean r8 = r5.B
            m71 r5 = r5.m()
            m71 r9 = defpackage.m71.CROSSED
            if (r5 != r9) goto L33
            r5 = r2
            goto L34
        L33:
            r5 = r3
        L34:
            long r9 = r1.j(r7)
            v84 r11 = r1.b
            int r12 = defpackage.k47.c
            r12 = 32
            long r12 = r9 >> r12
            int r12 = (int) r12
            int r13 = r11.d(r12)
            int r14 = r11.f
            if (r13 != r4) goto L4a
            goto L57
        L4a:
            if (r4 < r14) goto L53
            int r12 = r14 + (-1)
            int r12 = r1.g(r12)
            goto L57
        L53:
            int r12 = r1.g(r4)
        L57:
            r15 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r9 = r9 & r15
            int r1 = (int) r9
            int r9 = r11.d(r1)
            if (r9 != r4) goto L65
            goto L71
        L65:
            if (r4 < r14) goto L6d
            int r14 = r14 - r2
            int r1 = r11.c(r14, r3)
            goto L71
        L6d:
            int r1 = r11.c(r4, r3)
        L71:
            if (r12 != r6) goto L78
            da6 r0 = r0.b(r1)
            goto L8d
        L78:
            if (r1 != r6) goto L7f
            da6 r0 = r0.b(r12)
            goto L8d
        L7f:
            r2 = r8 ^ r5
            if (r2 == 0) goto L86
            if (r7 > r1) goto L88
            goto L89
        L86:
            if (r7 < r12) goto L89
        L88:
            r12 = r1
        L89:
            da6 r0 = r0.b(r12)
        L8d:
            return r0
        L8e:
            ss5 r0 = (defpackage.ss5) r0
            ip3 r5 = (defpackage.ip3) r5
            pr3 r4 = (defpackage.pr3) r4
            n06 r1 = r0.f
            int[] r8 = defpackage.ps5.a
            int r1 = r1.ordinal()
            r1 = r8[r1]
            r9 = 0
            r10 = 2
            if (r1 == r2) goto Lad
            if (r1 != r10) goto La9
            int r1 = r4.h()
            goto Lb1
        La9:
            defpackage.i.d()
            goto Lcf
        Lad:
            int r1 = r5.g()
        Lb1:
            n06 r0 = r0.f
            int r0 = r0.ordinal()
            r0 = r8[r0]
            if (r0 == r2) goto Lc7
            if (r0 != r10) goto Lc3
            int r1 = r1 - r7
            if (r1 >= 0) goto Lc1
            goto Lcb
        Lc1:
            r3 = r1
            goto Lcb
        Lc3:
            defpackage.i.d()
            goto Lcf
        Lc7:
            int r1 = r1 - r7
            int r1 = r1 + r6
            if (r1 >= 0) goto Lc1
        Lcb:
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
        Lcf:
            return r9
    }
}

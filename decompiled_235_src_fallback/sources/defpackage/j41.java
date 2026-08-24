package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j41  reason: default package */
/* loaded from: classes.dex */
public final class j41 implements defpackage.f05 {
    public final defpackage.on2 a;

    public /* synthetic */ j41(defpackage.on2 r1) {
            r0 = this;
            r0.a = r1
            r0.<init>()
            return
    }

    @Override // defpackage.f05
    public long a(defpackage.m93 r8, long r9, defpackage.kk3 r11, long r12) {
            r7 = this;
            on2 r7 = r7.a
            java.lang.Object r7 = r7.c()
            i93 r7 = (defpackage.i93) r7
            long r0 = r7.a
            int r7 = r8.a
            r2 = 32
            long r3 = r0 >> r2
            int r3 = (int) r3
            int r7 = r7 + r3
            long r3 = r12 >> r2
            int r3 = (int) r3
            long r4 = r9 >> r2
            int r4 = (int) r4
            kk3 r5 = defpackage.kk3.Ltr
            r6 = 1
            if (r11 != r5) goto L1f
            r11 = r6
            goto L20
        L1f:
            r11 = 0
        L20:
            int r7 = defpackage.ak7.G(r7, r3, r4, r11)
            int r8 = r8.b
            r3 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r3
            int r11 = (int) r0
            int r8 = r8 + r11
            long r11 = r12 & r3
            int r11 = (int) r11
            long r9 = r9 & r3
            int r9 = (int) r9
            int r8 = defpackage.ak7.G(r8, r11, r9, r6)
            long r9 = (long) r7
            long r9 = r9 << r2
            long r7 = (long) r8
            long r7 = r7 & r3
            long r7 = r7 | r9
            return r7
    }
}

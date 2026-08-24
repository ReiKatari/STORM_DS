package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ml7  reason: default package */
/* loaded from: classes.dex */
public final class ml7 implements defpackage.il7 {
    public final defpackage.kl7 A;
    public final defpackage.ck5 B;
    public final long L;
    public final long R;

    public ml7(defpackage.kl7 r3, defpackage.ck5 r4) {
            r2 = this;
            r2.<init>()
            r2.A = r3
            r2.B = r4
            int r4 = r3.o()
            int r3 = r3.p()
            int r3 = r3 + r4
            long r3 = (long) r3
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r3 = r3 * r0
            r2.L = r3
            r3 = 0
            r2.R = r3
            return
    }

    @Override // defpackage.il7
    public final boolean a() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.il7
    public final long b(defpackage.ap r1, defpackage.ap r2, defpackage.ap r3) {
            r0 = this;
            r0 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            return r0
    }

    public final long c(long r9) {
            r8 = this;
            long r0 = r8.R
            long r2 = r9 + r0
            r4 = 0
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 > 0) goto Lb
            return r4
        Lb:
            long r9 = r9 + r0
            long r0 = r8.L
            long r2 = r9 / r0
            ck5 r8 = r8.B
            ck5 r6 = defpackage.ck5.Restart
            if (r8 == r6) goto L25
            r6 = 2
            long r6 = r2 % r6
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 != 0) goto L1f
            goto L25
        L1f:
            r4 = 1
            long r2 = r2 + r4
            long r2 = r2 * r0
            long r2 = r2 - r9
            return r2
        L25:
            long r2 = r2 * r0
            long r9 = r9 - r2
            return r9
    }

    public final defpackage.ap d(long r11, defpackage.ap r13, defpackage.ap r14, defpackage.ap r15) {
            r10 = this;
            long r0 = r10.R
            long r11 = r11 + r0
            long r2 = r10.L
            int r11 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r11 <= 0) goto L15
            kl7 r4 = r10.A
            long r5 = r2 - r0
            r7 = r13
            r9 = r14
            r8 = r15
            ap r10 = r4.h(r5, r7, r8, r9)
            return r10
        L15:
            r9 = r14
            return r9
    }

    @Override // defpackage.il7
    public final defpackage.ap h(long r7, defpackage.ap r9, defpackage.ap r10, defpackage.ap r11) {
            r6 = this;
            r1 = r7
            long r7 = r6.c(r1)
            r0 = r6
            r3 = r9
            r5 = r10
            r4 = r11
            ap r11 = r0.d(r1, r3, r4, r5)
            kl7 r6 = r0.A
            ap r6 = r6.h(r7, r9, r10, r11)
            return r6
    }

    @Override // defpackage.il7
    public final defpackage.ap q(long r7, defpackage.ap r9, defpackage.ap r10, defpackage.ap r11) {
            r6 = this;
            r1 = r7
            long r7 = r6.c(r1)
            r0 = r6
            r3 = r9
            r5 = r10
            r4 = r11
            ap r11 = r0.d(r1, r3, r4, r5)
            kl7 r6 = r0.A
            ap r6 = r6.q(r7, r9, r10, r11)
            return r6
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xn  reason: default package */
/* loaded from: classes.dex */
public final class xn extends defpackage.hb3 {
    public defpackage.w97 l0;
    public defpackage.qa4 m0;
    public defpackage.yn n0;
    public long o0;

    @Override // defpackage.z64
    public final void L0() {
            r2 = this;
            r0 = -9223372034707292160(0x8000000080000000, double:-1.0609978955E-314)
            r2.o0 = r0
            return
    }

    @Override // defpackage.hb3, defpackage.jm3
    public final defpackage.f34 c(defpackage.g34 r8, defpackage.x24 r9, long r10) {
            r7 = this;
            dx4 r9 = r9.y(r10)
            boolean r10 = r8.a0()
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r11 = 32
            if (r10 == 0) goto L1c
            int r10 = r9.A
            int r2 = r9.B
            long r3 = (long) r10
            long r3 = r3 << r11
            long r5 = (long) r2
            long r5 = r5 & r0
            long r2 = r3 | r5
            goto L5a
        L1c:
            w97 r10 = r7.l0
            int r2 = r9.A
            if (r10 != 0) goto L2c
            int r10 = r9.B
            long r2 = (long) r2
            long r2 = r2 << r11
            long r4 = (long) r10
            long r4 = r4 & r0
            long r2 = r2 | r4
            r7.o0 = r2
            goto L5a
        L2c:
            int r3 = r9.B
            long r4 = (long) r2
            long r4 = r4 << r11
            long r2 = (long) r3
            long r2 = r2 & r0
            long r2 = r2 | r4
            wn r4 = new wn
            r5 = 0
            r4.<init>(r7, r2, r5)
            wn r5 = new wn
            r6 = 1
            r5.<init>(r7, r2, r6)
            v97 r10 = r10.a(r4, r5)
            yn r2 = r7.n0
            r2.getClass()
            java.lang.Object r2 = r10.getValue()
            q93 r2 = (defpackage.q93) r2
            long r2 = r2.a
            java.lang.Object r10 = r10.getValue()
            q93 r10 = (defpackage.q93) r10
            long r4 = r10.a
            r7.o0 = r4
        L5a:
            long r10 = r2 >> r11
            int r10 = (int) r10
            long r0 = r0 & r2
            int r11 = (int) r0
            vn r0 = new vn
            r0.<init>(r7, r9, r2)
            zt1 r7 = defpackage.zt1.A
            f34 r7 = r8.K(r10, r11, r7, r0)
            return r7
    }
}

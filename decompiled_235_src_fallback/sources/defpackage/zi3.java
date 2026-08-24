package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zi3  reason: default package */
/* loaded from: classes.dex */
public final class zi3 extends defpackage.nt0 {
    public final /* synthetic */ int d;

    public /* synthetic */ zi3(int r1, int r2, long r3, java.lang.String r5) {
            r0 = this;
            r0.d = r2
            r0.<init>(r5, r1, r3)
            return
    }

    @Override // defpackage.nt0
    public final float a(int r1) {
            r0 = this;
            int r0 = r0.d
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r0 = 1073741824(0x40000000, float:2.0)
            return r0
        L8:
            if (r1 != 0) goto Ld
            r0 = 1120403456(0x42c80000, float:100.0)
            goto Lf
        Ld:
            r0 = 1124073472(0x43000000, float:128.0)
        Lf:
            return r0
    }

    @Override // defpackage.nt0
    public final float b(int r1) {
            r0 = this;
            int r0 = r0.d
            switch(r0) {
                case 0: goto L8;
                default: goto L5;
            }
        L5:
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            return r0
        L8:
            if (r1 != 0) goto Lc
            r0 = 0
            goto Le
        Lc:
            r0 = -1023410176(0xffffffffc3000000, float:-128.0)
        Le:
            return r0
    }

    @Override // defpackage.nt0
    public final long d(float r6, float r7, float r8) {
            r5 = this;
            int r5 = r5.d
            r0 = 4294967295(0xffffffff, double:2.1219957905E-314)
            r8 = 32
            switch(r5) {
                case 0: goto L34;
                default: goto Lc;
            }
        Lc:
            r5 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r2 >= 0) goto L13
            r6 = r5
        L13:
            r2 = 1073741824(0x40000000, float:2.0)
            int r3 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r3 <= 0) goto L1a
            r6 = r2
        L1a:
            int r3 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r3 >= 0) goto L1f
            r7 = r5
        L1f:
            int r5 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
            if (r5 <= 0) goto L24
            goto L25
        L24:
            r2 = r7
        L25:
            int r5 = java.lang.Float.floatToRawIntBits(r6)
            long r5 = (long) r5
            int r7 = java.lang.Float.floatToRawIntBits(r2)
            long r2 = (long) r7
            long r5 = r5 << r8
        L30:
            long r7 = r2 & r0
            long r5 = r5 | r7
            return r5
        L34:
            r5 = 0
            int r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r2 >= 0) goto L3a
            r6 = r5
        L3a:
            r5 = 1120403456(0x42c80000, float:100.0)
            int r2 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r2 <= 0) goto L41
            r6 = r5
        L41:
            r5 = -1023410176(0xffffffffc3000000, float:-128.0)
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 >= 0) goto L48
            r7 = r5
        L48:
            r5 = 1124073472(0x43000000, float:128.0)
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r2 <= 0) goto L4f
            r7 = r5
        L4f:
            r5 = 1098907648(0x41800000, float:16.0)
            float r6 = r6 + r5
            r5 = 1122500608(0x42e80000, float:116.0)
            float r6 = r6 / r5
            r5 = 990057071(0x3b03126f, float:0.002)
            float r7 = r7 * r5
            float r7 = r7 + r6
            r5 = 1045683377(0x3e53dcb1, float:0.20689656)
            int r2 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            r3 = 1041055179(0x3e0d3dcb, float:0.13793103)
            r4 = 1040416807(0x3e038027, float:0.12841855)
            if (r2 <= 0) goto L6b
            float r2 = r7 * r7
            float r2 = r2 * r7
            goto L6e
        L6b:
            float r7 = r7 - r3
            float r2 = r7 * r4
        L6e:
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 <= 0) goto L76
            float r5 = r6 * r6
            float r5 = r5 * r6
            goto L79
        L76:
            float r6 = r6 - r3
            float r5 = r6 * r4
        L79:
            float[] r6 = defpackage.jw2.u
            r7 = 0
            r7 = r6[r7]
            float r2 = r2 * r7
            r7 = 1
            r6 = r6[r7]
            float r5 = r5 * r6
            int r6 = java.lang.Float.floatToRawIntBits(r2)
            long r6 = (long) r6
            int r5 = java.lang.Float.floatToRawIntBits(r5)
            long r2 = (long) r5
            long r5 = r6 << r8
            goto L30
    }

    @Override // defpackage.nt0
    public final float e(float r1, float r2, float r3) {
            r0 = this;
            int r0 = r0.d
            switch(r0) {
                case 0: goto L14;
                default: goto L5;
            }
        L5:
            r0 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 >= 0) goto Lc
            r3 = r0
        Lc:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13
            r3 = r0
        L13:
            return r3
        L14:
            r0 = 0
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 >= 0) goto L1a
            r1 = r0
        L1a:
            r0 = 1120403456(0x42c80000, float:100.0)
            int r2 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r2 <= 0) goto L21
            r1 = r0
        L21:
            r0 = -1023410176(0xffffffffc3000000, float:-128.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 >= 0) goto L28
            r3 = r0
        L28:
            r0 = 1124073472(0x43000000, float:128.0)
            int r2 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r2 <= 0) goto L2f
            r3 = r0
        L2f:
            r0 = 1098907648(0x41800000, float:16.0)
            float r1 = r1 + r0
            r0 = 1122500608(0x42e80000, float:116.0)
            float r1 = r1 / r0
            r0 = 1000593162(0x3ba3d70a, float:0.005)
            float r3 = r3 * r0
            float r1 = r1 - r3
            r0 = 1045683377(0x3e53dcb1, float:0.20689656)
            int r0 = (r1 > r0 ? 1 : (r1 == r0 ? 0 : -1))
            if (r0 <= 0) goto L45
            float r0 = r1 * r1
            float r0 = r0 * r1
            goto L4d
        L45:
            r0 = 1041055179(0x3e0d3dcb, float:0.13793103)
            float r1 = r1 - r0
            r0 = 1040416807(0x3e038027, float:0.12841855)
            float r0 = r0 * r1
        L4d:
            float[] r1 = defpackage.jw2.u
            r2 = 2
            r1 = r1[r2]
            float r0 = r0 * r1
            return r0
    }

    @Override // defpackage.nt0
    public final long f(float r6, float r7, float r8, float r9, defpackage.nt0 r10) {
            r5 = this;
            int r5 = r5.d
            switch(r5) {
                case 0: goto L2d;
                default: goto L5;
            }
        L5:
            r5 = -1073741824(0xffffffffc0000000, float:-2.0)
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 >= 0) goto Lc
            r6 = r5
        Lc:
            r0 = 1073741824(0x40000000, float:2.0)
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 <= 0) goto L13
            r6 = r0
        L13:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 >= 0) goto L18
            r7 = r5
        L18:
            int r1 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r1 <= 0) goto L1d
            r7 = r0
        L1d:
            int r1 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r1 >= 0) goto L22
            r8 = r5
        L22:
            int r5 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r5 <= 0) goto L27
            goto L28
        L27:
            r0 = r8
        L28:
            long r5 = defpackage.hv.a(r6, r7, r0, r9, r10)
            return r5
        L2d:
            float[] r5 = defpackage.jw2.u
            r0 = 0
            r0 = r5[r0]
            float r6 = r6 / r0
            r0 = 1
            r0 = r5[r0]
            float r7 = r7 / r0
            r0 = 2
            r5 = r5[r0]
            float r8 = r8 / r5
            r5 = 1007753895(0x3c111aa7, float:0.008856452)
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            r1 = 1041055179(0x3e0d3dcb, float:0.13793103)
            r2 = 1090072424(0x40f92f68, float:7.787037)
            if (r0 <= 0) goto L4f
            double r3 = (double) r6
            double r3 = java.lang.Math.cbrt(r3)
            float r6 = (float) r3
            goto L51
        L4f:
            float r6 = r6 * r2
            float r6 = r6 + r1
        L51:
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 <= 0) goto L5c
            double r3 = (double) r7
            double r3 = java.lang.Math.cbrt(r3)
            float r7 = (float) r3
            goto L5e
        L5c:
            float r7 = r7 * r2
            float r7 = r7 + r1
        L5e:
            int r5 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r5 <= 0) goto L69
            double r0 = (double) r8
            double r0 = java.lang.Math.cbrt(r0)
            float r5 = (float) r0
            goto L6c
        L69:
            float r8 = r8 * r2
            float r5 = r8 + r1
        L6c:
            r8 = 1122500608(0x42e80000, float:116.0)
            float r8 = r8 * r7
            r0 = 1098907648(0x41800000, float:16.0)
            float r8 = r8 - r0
            r0 = 1140457472(0x43fa0000, float:500.0)
            float r6 = r6 - r7
            float r6 = r6 * r0
            r0 = 1128792064(0x43480000, float:200.0)
            float r7 = r7 - r5
            float r7 = r7 * r0
            r5 = 0
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 >= 0) goto L80
            r8 = r5
        L80:
            r5 = 1120403456(0x42c80000, float:100.0)
            int r0 = (r8 > r5 ? 1 : (r8 == r5 ? 0 : -1))
            if (r0 <= 0) goto L87
            r8 = r5
        L87:
            r5 = -1023410176(0xffffffffc3000000, float:-128.0)
            int r0 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r0 >= 0) goto L8e
            r6 = r5
        L8e:
            r0 = 1124073472(0x43000000, float:128.0)
            int r1 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r1 <= 0) goto L95
            r6 = r0
        L95:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 >= 0) goto L9a
            r7 = r5
        L9a:
            int r5 = (r7 > r0 ? 1 : (r7 == r0 ? 0 : -1))
            if (r5 <= 0) goto L9f
            goto La0
        L9f:
            r0 = r7
        La0:
            long r5 = defpackage.hv.a(r8, r6, r0, r9, r10)
            return r5
    }
}

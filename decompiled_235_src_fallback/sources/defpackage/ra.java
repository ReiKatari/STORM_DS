package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ra  reason: default package */
/* loaded from: classes.dex */
public final class ra extends defpackage.og4 {
    public final int a;
    public final java.lang.String b;
    public final int c;
    public final int d;
    public final int e;
    public final java.lang.String f;
    public final byte[] g;

    public ra(byte[] r3, java.lang.String r4, int r5, java.lang.String r6, int r7, int r8) {
            r2 = this;
            r2.<init>()
            int r0 = r3.length
            r1 = 16
            if (r0 < r1) goto L6e
            if (r0 < r5) goto L6e
            defpackage.kk7.a(r5)
            r0 = 10
            if (r7 < r0) goto L62
            java.lang.String r0 = "HmacSha1"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L1d
            r0 = 20
            if (r7 > r0) goto L36
        L1d:
            java.lang.String r0 = "HmacSha256"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L29
            r0 = 32
            if (r7 > r0) goto L36
        L29:
            java.lang.String r0 = "HmacSha512"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L3e
            r0 = 64
            if (r7 > r0) goto L36
            goto L3e
        L36:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "tag size too big"
            r2.<init>(r3)
            throw r2
        L3e:
            int r0 = r8 - r7
            int r0 = r0 - r5
            int r0 = r0 + (-8)
            if (r0 <= 0) goto L5a
            int r0 = r3.length
            byte[] r3 = java.util.Arrays.copyOf(r3, r0)
            r2.g = r3
            r2.f = r4
            r2.a = r5
            r2.b = r6
            r2.c = r7
            r2.d = r8
            int r8 = r8 - r7
            r2.e = r8
            return
        L5a:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "ciphertextSegmentSize too small"
            r2.<init>(r3)
            throw r2
        L62:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "tag size too small "
            java.lang.String r3 = defpackage.lb1.g(r7, r3)
            r2.<init>(r3)
            throw r2
        L6e:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            int r3 = java.lang.Math.max(r1, r5)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "ikm too short, must be >= "
            r4.<init>(r5)
            r4.append(r3)
            java.lang.String r3 = r4.toString()
            r2.<init>(r3)
            throw r2
    }

    public static byte[] i(defpackage.ra r2, byte[] r3, long r4, boolean r6) {
            r2 = 16
            java.nio.ByteBuffer r2 = java.nio.ByteBuffer.allocate(r2)
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.order(r0)
            r2.put(r3)
            r0 = 0
            int r3 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r3 > 0) goto L2e
            r0 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 >= 0) goto L2e
            int r3 = (int) r4
            r2.putInt(r3)
            byte r3 = (byte) r6
            r2.put(r3)
            r3 = 0
            r2.putInt(r3)
            byte[] r2 = r2.array()
            return r2
        L2e:
            java.lang.String r2 = "Index out of range"
            defpackage.e41.v(r2)
            r2 = 0
            return r2
    }

    @Override // defpackage.og4
    public final int c() {
            r0 = this;
            int r0 = r0.e()
            return r0
    }

    @Override // defpackage.og4
    public final int d() {
            r0 = this;
            int r0 = r0.d
            return r0
    }

    @Override // defpackage.og4
    public final int e() {
            r0 = this;
            int r0 = r0.a
            int r0 = r0 + 8
            return r0
    }

    @Override // defpackage.og4
    public final int f() {
            r0 = this;
            int r0 = r0.e
            return r0
    }

    @Override // defpackage.og4
    public final defpackage.mr6 g() {
            r1 = this;
            pa r0 = new pa
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.og4
    public final defpackage.nr6 h(byte[] r2) {
            r1 = this;
            qa r0 = new qa
            r0.<init>(r1, r2)
            return r0
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gb  reason: default package */
/* loaded from: classes.dex */
public final class gb extends defpackage.og4 {
    public final int a;
    public final int b;
    public final int c;
    public final java.lang.String d;
    public final byte[] e;

    public gb(java.lang.String r3, byte[] r4, int r5, int r6) {
            r2 = this;
            r2.<init>()
            int r0 = r4.length
            r1 = 16
            if (r0 < r1) goto L2e
            int r0 = r4.length
            if (r0 < r5) goto L2e
            defpackage.kk7.a(r5)
            int r0 = r2.e()
            int r0 = r0 + r1
            if (r6 <= r0) goto L26
            int r0 = r4.length
            byte[] r4 = java.util.Arrays.copyOf(r4, r0)
            r2.e = r4
            r2.d = r3
            r2.a = r5
            r2.b = r6
            int r6 = r6 - r1
            r2.c = r6
            return
        L26:
            java.security.InvalidAlgorithmParameterException r2 = new java.security.InvalidAlgorithmParameterException
            java.lang.String r3 = "ciphertextSegmentSize too small"
            r2.<init>(r3)
            throw r2
        L2e:
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

    public static javax.crypto.spec.GCMParameterSpec i(byte[] r3, long r4, boolean r6) {
            r0 = 12
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r0.order(r1)
            r0.put(r3)
            r1 = 0
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 > 0) goto L31
            r1 = 4294967296(0x100000000, double:2.121995791E-314)
            int r3 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r3 >= 0) goto L31
            int r3 = (int) r4
            r0.putInt(r3)
            byte r3 = (byte) r6
            r0.put(r3)
            javax.crypto.spec.GCMParameterSpec r3 = new javax.crypto.spec.GCMParameterSpec
            r4 = 128(0x80, float:1.8E-43)
            byte[] r5 = r0.array()
            r3.<init>(r4, r5)
            return r3
        L31:
            java.lang.String r3 = "Index out of range"
            defpackage.e41.v(r3)
            r3 = 0
            return r3
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
            int r0 = r0.b
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
            int r0 = r0.c
            return r0
    }

    @Override // defpackage.og4
    public final defpackage.mr6 g() {
            r1 = this;
            eb r0 = new eb
            r0.<init>(r1)
            return r0
    }

    @Override // defpackage.og4
    public final defpackage.nr6 h(byte[] r2) {
            r1 = this;
            fb r0 = new fb
            r0.<init>(r1, r2)
            return r0
    }
}

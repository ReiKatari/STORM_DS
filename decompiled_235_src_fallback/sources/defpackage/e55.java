package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: e55  reason: default package */
/* loaded from: classes.dex */
public final class e55 {
    public final defpackage.r90 a;
    public int b;
    public defpackage.x45 c;
    public boolean d;
    public int e;

    public e55(defpackage.r90 r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            r1 = -1
            r0.b = r1
            x45 r1 = defpackage.x45.INVALID
            r0.c = r1
            return
    }

    public static void a(int r2) {
            if (r2 < 0) goto L3
            return
        L3:
            b55 r0 = new b55
            java.lang.String r1 = "Unexpected negative length: "
            java.lang.String r2 = defpackage.lb1.g(r2, r1)
            r1 = 0
            r0.<init>(r2, r1)
            throw r0
    }

    public final int b(defpackage.q45 r8) {
            r7 = this;
            int[] r0 = defpackage.d55.b
            int r8 = r8.ordinal()
            r8 = r0[r8]
            r0 = 0
            r90 r1 = r7.a
            r2 = 1
            if (r8 == r2) goto L70
            r3 = 2
            if (r8 == r3) goto L1d
            r1 = 3
            if (r8 != r1) goto L19
            int r7 = r7.h()
            return r7
        L19:
            defpackage.i.d()
            return r0
        L1d:
            int r7 = r1.B
            int r8 = r1.A
            if (r7 == r8) goto L68
            java.lang.Object r4 = r1.L
            byte[] r4 = (byte[]) r4
            int r5 = r7 + 1
            r6 = r4[r7]
            if (r6 < 0) goto L30
            r1.B = r5
            goto L52
        L30:
            int r8 = r8 - r7
            if (r8 <= r2) goto L40
            int r7 = r7 + r3
            r8 = r4[r5]
            int r8 = r8 << 7
            r8 = r8 ^ r6
            if (r8 >= 0) goto L40
            r1.B = r7
            r6 = r8 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L52
        L40:
            r7 = r0
        L41:
            r8 = 32
            if (r0 >= r8) goto L60
            int r8 = r1.u()
            r3 = r8 & 127(0x7f, float:1.78E-43)
            int r3 = r3 << r0
            r7 = r7 | r3
            r8 = r8 & 128(0x80, float:1.8E-43)
            if (r8 != 0) goto L5d
            r6 = r7
        L52:
            int r7 = r6 << 31
            int r7 = r7 >> 31
            r7 = r7 ^ r6
            int r7 = r7 >> r2
            r8 = -2147483648(0xffffffff80000000, float:-0.0)
            r8 = r8 & r6
            r7 = r7 ^ r8
            return r7
        L5d:
            int r0 = r0 + 7
            goto L41
        L60:
            fc6 r7 = new fc6
            java.lang.String r8 = "Input stream is malformed: Varint too long (exceeded 32 bits)"
            r7.<init>(r8)
            throw r7
        L68:
            fc6 r7 = new fc6
            java.lang.String r8 = "Unexpected EOF"
            r7.<init>(r8)
            throw r7
        L70:
            long r7 = r1.v(r0)
            int r7 = (int) r7
            return r7
    }

    public final long c(defpackage.q45 r6) {
            r5 = this;
            int[] r0 = defpackage.d55.b
            int r6 = r6.ordinal()
            r6 = r0[r6]
            r0 = 0
            r90 r1 = r5.a
            r2 = 1
            if (r6 == r2) goto L30
            r3 = 2
            if (r6 == r3) goto L1f
            r0 = 3
            if (r6 != r0) goto L19
            long r5 = r5.j()
            return r5
        L19:
            defpackage.i.d()
            r5 = 0
            return r5
        L1f:
            long r5 = r1.v(r0)
            r0 = 63
            long r3 = r5 << r0
            long r0 = r3 >> r0
            long r0 = r0 ^ r5
            long r0 = r0 >> r2
            r2 = -9223372036854775808
            long r5 = r5 & r2
            long r5 = r5 ^ r0
            return r5
        L30:
            long r5 = r1.v(r0)
            return r5
    }

    public final defpackage.r90 d() {
            r3 = this;
            x45 r0 = defpackage.x45.SIZE_DELIMITED
            x45 r1 = r3.c
            if (r1 != r0) goto Lb
            r90 r3 = r3.e()
            return r3
        Lb:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected wire type "
            r1.<init>(r2)
            r1.append(r0)
            x45 r3 = r3.c
            defpackage.u34.z(r1, r3)
            r3 = 0
            return r3
    }

    public final defpackage.r90 e() {
            r4 = this;
            q45 r0 = defpackage.q45.DEFAULT
            int r0 = r4.b(r0)
            a(r0)
            r90 r4 = r4.a
            r4.t(r0)
            r90 r1 = new r90
            java.lang.Object r2 = r4.L
            byte[] r2 = (byte[]) r2
            int r3 = r4.B
            int r3 = r3 + r0
            r1.<init>(r2, r3)
            int r2 = r4.B
            r1.B = r2
            int r2 = r4.B
            int r2 = r2 + r0
            r4.B = r2
            return r1
    }

    public final byte[] f() {
            r6 = this;
            q45 r0 = defpackage.q45.DEFAULT
            int r0 = r6.b(r0)
            a(r0)
            r90 r6 = r6.a
            r6.t(r0)
            byte[] r1 = new byte[r0]
            int r2 = r6.A
            int r3 = r6.B
            int r2 = r2 - r3
            if (r2 >= r0) goto L18
            r0 = r2
        L18:
            java.lang.Object r2 = r6.L
            byte[] r2 = (byte[]) r2
            r4 = 0
            int r5 = r3 + r0
            defpackage.fv.q0(r4, r3, r5, r2, r1)
            int r2 = r6.B
            int r2 = r2 + r0
            r6.B = r2
            return r1
    }

    public final int g(defpackage.q45 r3) {
            r2 = this;
            r3.getClass()
            q45 r0 = defpackage.q45.FIXED
            if (r3 != r0) goto La
            x45 r0 = defpackage.x45.i32
            goto Lc
        La:
            x45 r0 = defpackage.x45.VARINT
        Lc:
            x45 r1 = r2.c
            if (r1 != r0) goto L15
            int r2 = r2.b(r3)
            return r2
        L15:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected wire type "
            r3.<init>(r1)
            r3.append(r0)
            x45 r2 = r2.c
            defpackage.u34.z(r3, r2)
            r2 = 0
            return r2
    }

    public final int h() {
            r4 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 4
            if (r0 >= r2) goto L14
            r90 r2 = r4.a
            int r2 = r2.u()
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 * 8
            int r2 = r2 << r3
            r1 = r1 | r2
            int r0 = r0 + 1
            goto L2
        L14:
            return r1
    }

    public final long i(defpackage.q45 r3) {
            r2 = this;
            r3.getClass()
            q45 r0 = defpackage.q45.FIXED
            if (r3 != r0) goto La
            x45 r0 = defpackage.x45.i64
            goto Lc
        La:
            x45 r0 = defpackage.x45.VARINT
        Lc:
            x45 r1 = r2.c
            if (r1 != r0) goto L15
            long r2 = r2.c(r3)
            return r2
        L15:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r1 = "Expected wire type "
            r3.<init>(r1)
            r3.append(r0)
            x45 r2 = r2.c
            defpackage.u34.z(r3, r2)
            r2 = 0
            return r2
    }

    public final long j() {
            r6 = this;
            r0 = 0
            r2 = 0
        L3:
            r3 = 8
            if (r2 >= r3) goto L17
            r90 r3 = r6.a
            int r3 = r3.u()
            r3 = r3 & 255(0xff, float:3.57E-43)
            long r3 = (long) r3
            int r5 = r2 * 8
            long r3 = r3 << r5
            long r0 = r0 | r3
            int r2 = r2 + 1
            goto L3
        L17:
            return r0
    }

    public final java.lang.String k() {
            r5 = this;
            x45 r0 = defpackage.x45.SIZE_DELIMITED
            x45 r1 = r5.c
            if (r1 != r0) goto L24
            q45 r0 = defpackage.q45.DEFAULT
            int r0 = r5.b(r0)
            a(r0)
            r90 r5 = r5.a
            java.lang.Object r1 = r5.L
            byte[] r1 = (byte[]) r1
            int r2 = r5.B
            int r3 = r2 + r0
            r4 = 4
            java.lang.String r1 = defpackage.xs6.W(r2, r1, r3, r4)
            int r2 = r5.B
            int r2 = r2 + r0
            r5.B = r2
            return r1
        L24:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected wire type "
            r1.<init>(r2)
            r1.append(r0)
            x45 r5 = r5.c
            defpackage.u34.z(r1, r5)
            r5 = 0
            return r5
    }

    public final int l() {
            r2 = this;
            boolean r0 = r2.d
            if (r0 == 0) goto L1b
            r0 = 0
            r2.d = r0
            int r0 = r2.b
            int r0 = r0 << 3
            x45 r1 = r2.c
            int r1 = r1.getTypeId()
            r0 = r0 | r1
            int r1 = r2.e
            int r1 = r2.n(r1)
            r2.e = r0
            return r1
        L1b:
            int r0 = r2.b
            int r0 = r0 << 3
            x45 r1 = r2.c
            int r1 = r1.getTypeId()
            r0 = r0 | r1
            r2.e = r0
            r90 r0 = r2.a
            r1 = 1
            long r0 = r0.v(r1)
            int r0 = (int) r0
            int r2 = r2.n(r0)
            return r2
    }

    public final void m() {
            r3 = this;
            x45 r0 = r3.c
            int[] r1 = defpackage.d55.a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            if (r0 == r1) goto L63
            r1 = 2
            if (r0 == r1) goto L5d
            r1 = 3
            if (r0 == r1) goto L33
            r1 = 4
            if (r0 != r1) goto L1c
            q45 r0 = defpackage.q45.FIXED
            r3.g(r0)
            return
        L1c:
            b55 r0 = new b55
            x45 r3 = r3.c
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unsupported start group or end group wire type: "
            r1.<init>(r2)
            r1.append(r3)
            java.lang.String r3 = r1.toString()
            r1 = 0
            r0.<init>(r3, r1)
            throw r0
        L33:
            x45 r0 = defpackage.x45.SIZE_DELIMITED
            x45 r1 = r3.c
            if (r1 != r0) goto L4d
            q45 r0 = defpackage.q45.DEFAULT
            int r0 = r3.b(r0)
            a(r0)
            r90 r3 = r3.a
            r3.t(r0)
            int r1 = r3.B
            int r1 = r1 + r0
            r3.B = r1
            return
        L4d:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Expected wire type "
            r1.<init>(r2)
            r1.append(r0)
            x45 r3 = r3.c
            defpackage.u34.z(r1, r3)
            return
        L5d:
            q45 r0 = defpackage.q45.FIXED
            r3.i(r0)
            return
        L63:
            q45 r0 = defpackage.q45.DEFAULT
            r3.g(r0)
            return
    }

    public final int n(int r2) {
            r1 = this;
            r0 = -1
            if (r2 != r0) goto La
            r1.b = r0
            x45 r2 = defpackage.x45.INVALID
            r1.c = r2
            return r0
        La:
            int r0 = r2 >>> 3
            r1.b = r0
            w45 r0 = defpackage.x45.Companion
            r0.getClass()
            x45[] r0 = defpackage.x45.access$getEntryArray$cp()
            r2 = r2 & 7
            r2 = r0[r2]
            r1.c = r2
            int r1 = r1.b
            return r1
    }
}

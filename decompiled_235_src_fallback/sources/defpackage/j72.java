package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j72  reason: default package */
/* loaded from: classes.dex */
public final class j72 extends java.io.InputStream implements java.io.DataInput {
    public static final java.nio.ByteOrder X = null;
    public static final java.nio.ByteOrder Y = null;
    public final java.io.DataInputStream A;
    public java.nio.ByteOrder B;
    public final int L;
    public int R;

    static {
            java.nio.ByteOrder r0 = java.nio.ByteOrder.LITTLE_ENDIAN
            defpackage.j72.X = r0
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            defpackage.j72.Y = r0
            return
    }

    public j72(java.io.InputStream r3) {
            r2 = this;
            r2.<init>()
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r2.B = r0
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r3)
            r2.A = r0
            int r3 = r0.available()
            r2.L = r3
            r1 = 0
            r2.R = r1
            r0.mark(r3)
            return
    }

    public j72(byte[] r2) {
            r1 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r2)
            r1.<init>(r0)
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r0 = this;
            java.io.DataInputStream r0 = r0.A
            int r0 = r0.available()
            return r0
    }

    public final void e(long r4) {
            r3 = this;
            int r0 = r3.R
            long r1 = (long) r0
            int r1 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r1 <= 0) goto L15
            r0 = 0
            r3.R = r0
            java.io.DataInputStream r0 = r3.A
            r0.reset()
            int r1 = r3.L
            r0.mark(r1)
            goto L17
        L15:
            long r0 = (long) r0
            long r4 = r4 - r0
        L17:
            int r4 = (int) r4
            int r3 = r3.skipBytes(r4)
            if (r3 != r4) goto L1f
            return
        L1f:
            java.lang.String r3 = "Couldn't seek up to the byteCount"
            defpackage.e41.i(r3)
            return
    }

    @Override // java.io.InputStream
    public final int read() {
            r1 = this;
            int r0 = r1.R
            int r0 = r0 + 1
            r1.R = r0
            java.io.DataInputStream r1 = r1.A
            int r1 = r1.read()
            return r1
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
            r1 = this;
            java.io.DataInputStream r0 = r1.A
            int r2 = r0.read(r2, r3, r4)
            int r3 = r1.R
            int r3 = r3 + r2
            r1.R = r3
            return r2
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
            r1 = this;
            int r0 = r1.R
            int r0 = r0 + 1
            r1.R = r0
            java.io.DataInputStream r1 = r1.A
            boolean r1 = r1.readBoolean()
            return r1
    }

    @Override // java.io.DataInput
    public final byte readByte() {
            r2 = this;
            int r0 = r2.R
            int r0 = r0 + 1
            r2.R = r0
            int r1 = r2.L
            if (r0 > r1) goto L19
            java.io.DataInputStream r2 = r2.A
            int r2 = r2.read()
            if (r2 < 0) goto L14
            byte r2 = (byte) r2
            return r2
        L14:
            defpackage.i.n()
        L17:
            r2 = 0
            return r2
        L19:
            defpackage.i.n()
            goto L17
    }

    @Override // java.io.DataInput
    public final char readChar() {
            r1 = this;
            int r0 = r1.R
            int r0 = r0 + 2
            r1.R = r0
            java.io.DataInputStream r1 = r1.A
            char r1 = r1.readChar()
            return r1
    }

    @Override // java.io.DataInput
    public final double readDouble() {
            r2 = this;
            long r0 = r2.readLong()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // java.io.DataInput
    public final float readFloat() {
            r0 = this;
            int r0 = r0.readInt()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r3) {
            r2 = this;
            int r0 = r2.R
            int r1 = r3.length
            int r0 = r0 + r1
            r2.R = r0
            int r1 = r2.L
            if (r0 > r1) goto L1c
            r0 = 0
            int r1 = r3.length
            java.io.DataInputStream r2 = r2.A
            int r2 = r2.read(r3, r0, r1)
            int r3 = r3.length
            if (r2 != r3) goto L16
            return
        L16:
            java.lang.String r2 = "Couldn't read up to the length of buffer"
            defpackage.e41.i(r2)
            return
        L1c:
            defpackage.i.n()
            return
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r3, int r4, int r5) {
            r2 = this;
            int r0 = r2.R
            int r0 = r0 + r5
            r2.R = r0
            int r1 = r2.L
            if (r0 > r1) goto L18
            java.io.DataInputStream r2 = r2.A
            int r2 = r2.read(r3, r4, r5)
            if (r2 != r5) goto L12
            return
        L12:
            java.lang.String r2 = "Couldn't read up to the length of buffer"
            defpackage.e41.i(r2)
            return
        L18:
            defpackage.i.n()
            return
    }

    @Override // java.io.DataInput
    public final int readInt() {
            r6 = this;
            int r0 = r6.R
            int r0 = r0 + 4
            r6.R = r0
            int r1 = r6.L
            if (r0 > r1) goto L4e
            java.io.DataInputStream r0 = r6.A
            int r1 = r0.read()
            int r2 = r0.read()
            int r3 = r0.read()
            int r0 = r0.read()
            r4 = r1 | r2
            r4 = r4 | r3
            r4 = r4 | r0
            if (r4 < 0) goto L49
            java.nio.ByteOrder r4 = r6.B
            java.nio.ByteOrder r5 = defpackage.j72.X
            if (r4 != r5) goto L32
            int r6 = r0 << 24
            int r0 = r3 << 16
            int r6 = r6 + r0
            int r0 = r2 << 8
            int r6 = r6 + r0
            int r6 = r6 + r1
            return r6
        L32:
            java.nio.ByteOrder r5 = defpackage.j72.Y
            if (r4 != r5) goto L40
            int r6 = r1 << 24
            int r1 = r2 << 16
            int r6 = r6 + r1
            int r1 = r3 << 8
            int r6 = r6 + r1
            int r6 = r6 + r0
            return r6
        L40:
            java.lang.String r0 = "Invalid byte order: "
            java.nio.ByteOrder r6 = r6.B
            defpackage.e41.x(r6, r0)
            r6 = 0
            return r6
        L49:
            defpackage.i.n()
            r6 = 0
            return r6
        L4e:
            defpackage.i.n()
            r6 = 0
            return r6
    }

    @Override // java.io.DataInput
    public final java.lang.String readLine() {
            r1 = this;
            java.lang.String r1 = "ExifInterface"
            java.lang.String r0 = "Currently unsupported"
            android.util.Log.d(r1, r0)
            r1 = 0
            return r1
    }

    @Override // java.io.DataInput
    public final long readLong() {
            r18 = this;
            r0 = r18
            int r1 = r0.R
            r2 = 8
            int r1 = r1 + r2
            r0.R = r1
            int r3 = r0.L
            if (r1 > r3) goto L92
            java.io.DataInputStream r1 = r0.A
            int r3 = r1.read()
            int r4 = r1.read()
            int r5 = r1.read()
            int r6 = r1.read()
            int r7 = r1.read()
            int r8 = r1.read()
            int r9 = r1.read()
            int r1 = r1.read()
            r10 = r3 | r4
            r10 = r10 | r5
            r10 = r10 | r6
            r10 = r10 | r7
            r10 = r10 | r8
            r10 = r10 | r9
            r10 = r10 | r1
            if (r10 < 0) goto L8c
            java.nio.ByteOrder r10 = r0.B
            java.nio.ByteOrder r11 = defpackage.j72.X
            r12 = 16
            r13 = 24
            r14 = 32
            r15 = 40
            r16 = 48
            r17 = 56
            if (r10 != r11) goto L64
            long r0 = (long) r1
            long r0 = r0 << r17
            long r9 = (long) r9
            long r9 = r9 << r16
            long r0 = r0 + r9
            long r8 = (long) r8
            long r8 = r8 << r15
            long r0 = r0 + r8
            long r7 = (long) r7
            long r7 = r7 << r14
            long r0 = r0 + r7
            long r6 = (long) r6
            long r6 = r6 << r13
            long r0 = r0 + r6
            long r5 = (long) r5
            long r5 = r5 << r12
            long r0 = r0 + r5
            long r4 = (long) r4
            long r4 = r4 << r2
            long r0 = r0 + r4
            long r2 = (long) r3
            long r0 = r0 + r2
            return r0
        L64:
            java.nio.ByteOrder r11 = defpackage.j72.Y
            if (r10 != r11) goto L82
            long r10 = (long) r3
            long r10 = r10 << r17
            long r3 = (long) r4
            long r3 = r3 << r16
            long r10 = r10 + r3
            long r3 = (long) r5
            long r3 = r3 << r15
            long r10 = r10 + r3
            long r3 = (long) r6
            long r3 = r3 << r14
            long r10 = r10 + r3
            long r3 = (long) r7
            long r3 = r3 << r13
            long r10 = r10 + r3
            long r3 = (long) r8
            long r3 = r3 << r12
            long r10 = r10 + r3
            long r3 = (long) r9
            long r2 = r3 << r2
            long r10 = r10 + r2
            long r0 = (long) r1
            long r10 = r10 + r0
            return r10
        L82:
            java.lang.String r1 = "Invalid byte order: "
            java.nio.ByteOrder r0 = r0.B
            defpackage.e41.x(r0, r1)
            r0 = 0
            return r0
        L8c:
            defpackage.i.n()
            r0 = 0
            return r0
        L92:
            defpackage.i.n()
            r0 = 0
            return r0
    }

    @Override // java.io.DataInput
    public final short readShort() {
            r4 = this;
            int r0 = r4.R
            int r0 = r0 + 2
            r4.R = r0
            int r1 = r4.L
            if (r0 > r1) goto L3a
            java.io.DataInputStream r0 = r4.A
            int r1 = r0.read()
            int r0 = r0.read()
            r2 = r1 | r0
            if (r2 < 0) goto L35
            java.nio.ByteOrder r2 = r4.B
            java.nio.ByteOrder r3 = defpackage.j72.X
            if (r2 != r3) goto L23
            int r4 = r0 << 8
            int r4 = r4 + r1
            short r4 = (short) r4
            return r4
        L23:
            java.nio.ByteOrder r3 = defpackage.j72.Y
            if (r2 != r3) goto L2c
            int r4 = r1 << 8
            int r4 = r4 + r0
            short r4 = (short) r4
            return r4
        L2c:
            java.lang.String r0 = "Invalid byte order: "
            java.nio.ByteOrder r4 = r4.B
            defpackage.e41.x(r4, r0)
            r4 = 0
            return r4
        L35:
            defpackage.i.n()
            r4 = 0
            return r4
        L3a:
            defpackage.i.n()
            r4 = 0
            return r4
    }

    @Override // java.io.DataInput
    public final java.lang.String readUTF() {
            r1 = this;
            int r0 = r1.R
            int r0 = r0 + 2
            r1.R = r0
            java.io.DataInputStream r1 = r1.A
            java.lang.String r1 = r1.readUTF()
            return r1
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
            r1 = this;
            int r0 = r1.R
            int r0 = r0 + 1
            r1.R = r0
            java.io.DataInputStream r1 = r1.A
            int r1 = r1.readUnsignedByte()
            return r1
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
            r4 = this;
            int r0 = r4.R
            int r0 = r0 + 2
            r4.R = r0
            int r1 = r4.L
            if (r0 > r1) goto L38
            java.io.DataInputStream r0 = r4.A
            int r1 = r0.read()
            int r0 = r0.read()
            r2 = r1 | r0
            if (r2 < 0) goto L33
            java.nio.ByteOrder r2 = r4.B
            java.nio.ByteOrder r3 = defpackage.j72.X
            if (r2 != r3) goto L22
            int r4 = r0 << 8
            int r4 = r4 + r1
            return r4
        L22:
            java.nio.ByteOrder r3 = defpackage.j72.Y
            if (r2 != r3) goto L2a
            int r4 = r1 << 8
            int r4 = r4 + r0
            return r4
        L2a:
            java.lang.String r0 = "Invalid byte order: "
            java.nio.ByteOrder r4 = r4.B
            defpackage.e41.x(r4, r0)
            r4 = 0
            return r4
        L33:
            defpackage.i.n()
            r4 = 0
            return r4
        L38:
            defpackage.i.n()
            r4 = 0
            return r4
    }

    @Override // java.io.DataInput
    public final int skipBytes(int r4) {
            r3 = this;
            int r0 = r3.L
            int r1 = r3.R
            int r0 = r0 - r1
            int r4 = java.lang.Math.min(r4, r0)
            r0 = 0
        La:
            if (r0 >= r4) goto L16
            java.io.DataInputStream r1 = r3.A
            int r2 = r4 - r0
            int r1 = r1.skipBytes(r2)
            int r0 = r0 + r1
            goto La
        L16:
            int r4 = r3.R
            int r4 = r4 + r0
            r3.R = r4
            return r0
    }
}

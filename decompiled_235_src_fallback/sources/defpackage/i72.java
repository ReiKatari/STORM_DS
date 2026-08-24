package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: i72  reason: default package */
/* loaded from: classes.dex */
public class i72 extends java.io.InputStream implements java.io.DataInput {
    public final java.io.DataInputStream A;
    public int B;
    public java.nio.ByteOrder L;
    public byte[] R;
    public final int X;

    public i72(java.io.InputStream r2) {
            r1 = this;
            java.nio.ByteOrder r0 = java.nio.ByteOrder.BIG_ENDIAN
            r1.<init>(r2, r0)
            return
    }

    public i72(java.io.InputStream r3, java.nio.ByteOrder r4) {
            r2 = this;
            r2.<init>()
            java.io.DataInputStream r0 = new java.io.DataInputStream
            r0.<init>(r3)
            r2.A = r0
            r1 = 0
            r0.mark(r1)
            r2.B = r1
            r2.L = r4
            boolean r4 = r3 instanceof defpackage.i72
            if (r4 == 0) goto L1b
            i72 r3 = (defpackage.i72) r3
            int r3 = r3.X
            goto L1c
        L1b:
            r3 = -1
        L1c:
            r2.X = r3
            return
    }

    public i72(byte[] r3) {
            r2 = this;
            java.io.ByteArrayInputStream r0 = new java.io.ByteArrayInputStream
            r0.<init>(r3)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.BIG_ENDIAN
            r2.<init>(r0, r1)
            int r3 = r3.length
            r2.X = r3
            return
    }

    @Override // java.io.InputStream
    public final int available() {
            r0 = this;
            java.io.DataInputStream r0 = r0.A
            int r0 = r0.available()
            return r0
    }

    public final void e(int r7) {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            if (r1 >= r7) goto L38
            int r2 = r7 - r1
            long r3 = (long) r2
            java.io.DataInputStream r5 = r6.A
            long r3 = r5.skip(r3)
            int r3 = (int) r3
            if (r3 > 0) goto L36
            byte[] r3 = r6.R
            r4 = 8192(0x2000, float:1.148E-41)
            if (r3 != 0) goto L1a
            byte[] r3 = new byte[r4]
            r6.R = r3
        L1a:
            int r2 = java.lang.Math.min(r4, r2)
            byte[] r3 = r6.R
            int r3 = r5.read(r3, r0, r2)
            r2 = -1
            if (r3 == r2) goto L28
            goto L36
        L28:
            java.io.EOFException r6 = new java.io.EOFException
            java.lang.String r0 = "Reached EOF while skipping "
            java.lang.String r1 = " bytes."
            java.lang.String r7 = defpackage.lb1.k(r0, r7, r1)
            r6.<init>(r7)
            throw r6
        L36:
            int r1 = r1 + r3
            goto L2
        L38:
            int r7 = r6.B
            int r7 = r7 + r1
            r6.B = r7
            return
    }

    @Override // java.io.InputStream
    public final void mark(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "Mark is currently unsupported"
            r0.<init>(r1)
            throw r0
    }

    @Override // java.io.InputStream
    public final int read() {
            r1 = this;
            int r0 = r1.B
            int r0 = r0 + 1
            r1.B = r0
            java.io.DataInputStream r1 = r1.A
            int r1 = r1.read()
            return r1
    }

    @Override // java.io.InputStream
    public final int read(byte[] r2, int r3, int r4) {
            r1 = this;
            java.io.DataInputStream r0 = r1.A
            int r2 = r0.read(r2, r3, r4)
            int r3 = r1.B
            int r3 = r3 + r2
            r1.B = r3
            return r2
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
            r1 = this;
            int r0 = r1.B
            int r0 = r0 + 1
            r1.B = r0
            java.io.DataInputStream r1 = r1.A
            boolean r1 = r1.readBoolean()
            return r1
    }

    @Override // java.io.DataInput
    public final byte readByte() {
            r1 = this;
            int r0 = r1.B
            int r0 = r0 + 1
            r1.B = r0
            java.io.DataInputStream r1 = r1.A
            int r1 = r1.read()
            if (r1 < 0) goto L10
            byte r1 = (byte) r1
            return r1
        L10:
            defpackage.i.n()
            r1 = 0
            return r1
    }

    @Override // java.io.DataInput
    public final char readChar() {
            r1 = this;
            int r0 = r1.B
            int r0 = r0 + 2
            r1.B = r0
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
            int r0 = r2.B
            int r1 = r3.length
            int r0 = r0 + r1
            r2.B = r0
            java.io.DataInputStream r2 = r2.A
            r2.readFully(r3)
            return
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] r2, int r3, int r4) {
            r1 = this;
            int r0 = r1.B
            int r0 = r0 + r4
            r1.B = r0
            java.io.DataInputStream r1 = r1.A
            r1.readFully(r2, r3, r4)
            return
    }

    @Override // java.io.DataInput
    public final int readInt() {
            r6 = this;
            int r0 = r6.B
            int r0 = r0 + 4
            r6.B = r0
            java.io.DataInputStream r0 = r6.A
            int r1 = r0.read()
            int r2 = r0.read()
            int r3 = r0.read()
            int r0 = r0.read()
            r4 = r1 | r2
            r4 = r4 | r3
            r4 = r4 | r0
            if (r4 < 0) goto L45
            java.nio.ByteOrder r4 = r6.L
            java.nio.ByteOrder r5 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r4 != r5) goto L2e
            int r6 = r0 << 24
            int r0 = r3 << 16
            int r6 = r6 + r0
            int r0 = r2 << 8
            int r6 = r6 + r0
            int r6 = r6 + r1
            return r6
        L2e:
            java.nio.ByteOrder r5 = java.nio.ByteOrder.BIG_ENDIAN
            if (r4 != r5) goto L3c
            int r6 = r1 << 24
            int r1 = r2 << 16
            int r6 = r6 + r1
            int r1 = r3 << 8
            int r6 = r6 + r1
            int r6 = r6 + r0
            return r6
        L3c:
            java.lang.String r0 = "Invalid byte order: "
            java.nio.ByteOrder r6 = r6.L
            defpackage.e41.x(r6, r0)
            r6 = 0
            return r6
        L45:
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
            int r1 = r0.B
            r2 = 8
            int r1 = r1 + r2
            r0.B = r1
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
            if (r10 < 0) goto L88
            java.nio.ByteOrder r10 = r0.L
            java.nio.ByteOrder r11 = java.nio.ByteOrder.LITTLE_ENDIAN
            r12 = 16
            r13 = 24
            r14 = 32
            r15 = 40
            r16 = 48
            r17 = 56
            if (r10 != r11) goto L60
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
        L60:
            java.nio.ByteOrder r11 = java.nio.ByteOrder.BIG_ENDIAN
            if (r10 != r11) goto L7e
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
        L7e:
            java.lang.String r1 = "Invalid byte order: "
            java.nio.ByteOrder r0 = r0.L
            defpackage.e41.x(r0, r1)
            r0 = 0
            return r0
        L88:
            defpackage.i.n()
            r0 = 0
            return r0
    }

    @Override // java.io.DataInput
    public final short readShort() {
            r4 = this;
            int r0 = r4.B
            int r0 = r0 + 2
            r4.B = r0
            java.io.DataInputStream r0 = r4.A
            int r1 = r0.read()
            int r0 = r0.read()
            r2 = r1 | r0
            if (r2 < 0) goto L31
            java.nio.ByteOrder r2 = r4.L
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r2 != r3) goto L1f
            int r4 = r0 << 8
            int r4 = r4 + r1
            short r4 = (short) r4
            return r4
        L1f:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            if (r2 != r3) goto L28
            int r4 = r1 << 8
            int r4 = r4 + r0
            short r4 = (short) r4
            return r4
        L28:
            java.lang.String r0 = "Invalid byte order: "
            java.nio.ByteOrder r4 = r4.L
            defpackage.e41.x(r4, r0)
            r4 = 0
            return r4
        L31:
            defpackage.i.n()
            r4 = 0
            return r4
    }

    @Override // java.io.DataInput
    public final java.lang.String readUTF() {
            r1 = this;
            int r0 = r1.B
            int r0 = r0 + 2
            r1.B = r0
            java.io.DataInputStream r1 = r1.A
            java.lang.String r1 = r1.readUTF()
            return r1
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
            r1 = this;
            int r0 = r1.B
            int r0 = r0 + 1
            r1.B = r0
            java.io.DataInputStream r1 = r1.A
            int r1 = r1.readUnsignedByte()
            return r1
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
            r4 = this;
            int r0 = r4.B
            int r0 = r0 + 2
            r4.B = r0
            java.io.DataInputStream r0 = r4.A
            int r1 = r0.read()
            int r0 = r0.read()
            r2 = r1 | r0
            if (r2 < 0) goto L2f
            java.nio.ByteOrder r2 = r4.L
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            if (r2 != r3) goto L1e
            int r4 = r0 << 8
            int r4 = r4 + r1
            return r4
        L1e:
            java.nio.ByteOrder r3 = java.nio.ByteOrder.BIG_ENDIAN
            if (r2 != r3) goto L26
            int r4 = r1 << 8
            int r4 = r4 + r0
            return r4
        L26:
            java.lang.String r0 = "Invalid byte order: "
            java.nio.ByteOrder r4 = r4.L
            defpackage.e41.x(r4, r0)
            r4 = 0
            return r4
        L2f:
            defpackage.i.n()
            r4 = 0
            return r4
    }

    @Override // java.io.InputStream
    public final void reset() {
            r1 = this;
            java.lang.UnsupportedOperationException r1 = new java.lang.UnsupportedOperationException
            java.lang.String r0 = "Reset is currently unsupported"
            r1.<init>(r0)
            throw r1
    }

    @Override // java.io.DataInput
    public final int skipBytes(int r1) {
            r0 = this;
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            java.lang.String r1 = "skipBytes is currently unsupported"
            r0.<init>(r1)
            throw r0
    }
}

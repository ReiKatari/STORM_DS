package com.github.junrar.io;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RandomAccessInputStream extends java.io.InputStream {
    private static final int BLOCK_MASK = 511;
    private static final int BLOCK_SHIFT = 9;
    private static final int BLOCK_SIZE = 512;
    private final java.util.Vector data;
    private boolean foundEOS;
    private long length;
    private long pointer;
    private final java.io.InputStream src;

    public RandomAccessInputStream(java.io.InputStream r4) {
            r3 = this;
            r3.<init>()
            r0 = 0
            r3.pointer = r0
            java.util.Vector r2 = new java.util.Vector
            r2.<init>()
            r3.data = r2
            r3.length = r0
            r0 = 0
            r3.foundEOS = r0
            r3.src = r4
            return
    }

    private long readUntil(long r9) {
            r8 = this;
            long r0 = r8.length
            int r2 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r2 >= 0) goto L7
            return r9
        L7:
            boolean r2 = r8.foundEOS
            if (r2 == 0) goto Lc
            return r0
        Lc:
            r2 = 9
            long r9 = r9 >>> r2
            int r9 = (int) r9
            long r0 = r0 >>> r2
            int r10 = (int) r0
        L12:
            if (r10 > r9) goto L3b
            r0 = 512(0x200, float:7.17E-43)
            byte[] r1 = new byte[r0]
            java.util.Vector r2 = r8.data
            r2.addElement(r1)
            r2 = 0
        L1e:
            if (r0 <= 0) goto L38
            java.io.InputStream r3 = r8.src
            int r3 = r3.read(r1, r2, r0)
            r4 = -1
            if (r3 != r4) goto L2f
            r9 = 1
            r8.foundEOS = r9
            long r8 = r8.length
            return r8
        L2f:
            int r2 = r2 + r3
            int r0 = r0 - r3
            long r4 = r8.length
            long r6 = (long) r3
            long r4 = r4 + r6
            r8.length = r4
            goto L1e
        L38:
            int r10 = r10 + 1
            goto L12
        L3b:
            long r8 = r8.length
            return r8
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
            r1 = this;
            java.util.Vector r0 = r1.data
            r0.removeAllElements()
            java.io.InputStream r1 = r1.src
            r1.close()
            return
    }

    public int getFilePointer() {
            r2 = this;
            long r0 = r2.pointer
            int r2 = (int) r0
            return r2
    }

    public long getLongFilePointer() {
            r2 = this;
            long r0 = r2.pointer
            return r0
    }

    @Override // java.io.InputStream
    public int read() {
            r6 = this;
            long r0 = r6.pointer
            r2 = 1
            long r0 = r0 + r2
            long r4 = r6.readUntil(r0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r0 < 0) goto L29
            java.util.Vector r0 = r6.data
            long r4 = r6.pointer
            r1 = 9
            long r4 = r4 >>> r1
            int r1 = (int) r4
            java.lang.Object r0 = r0.elementAt(r1)
            byte[] r0 = (byte[]) r0
            long r4 = r6.pointer
            long r2 = r2 + r4
            r6.pointer = r2
            r1 = 511(0x1ff, double:2.525E-321)
            long r1 = r1 & r4
            int r6 = (int) r1
            r6 = r0[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            return r6
        L29:
            r6 = -1
            return r6
    }

    @Override // java.io.InputStream
    public int read(byte[] r6, int r7, int r8) {
            r5 = this;
            r6.getClass()
            if (r7 < 0) goto L47
            if (r8 < 0) goto L47
            int r0 = r7 + r8
            int r1 = r6.length
            if (r0 > r1) goto L47
            if (r8 != 0) goto L10
            r5 = 0
            return r5
        L10:
            long r0 = r5.pointer
            long r2 = (long) r8
            long r0 = r0 + r2
            long r0 = r5.readUntil(r0)
            long r2 = r5.pointer
            int r0 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r0 > 0) goto L20
            r5 = -1
            return r5
        L20:
            java.util.Vector r0 = r5.data
            r1 = 9
            long r1 = r2 >>> r1
            int r1 = (int) r1
            java.lang.Object r0 = r0.elementAt(r1)
            byte[] r0 = (byte[]) r0
            long r1 = r5.pointer
            r3 = 511(0x1ff, double:2.525E-321)
            long r1 = r1 & r3
            int r1 = (int) r1
            int r1 = 512 - r1
            int r8 = java.lang.Math.min(r8, r1)
            long r1 = r5.pointer
            long r1 = r1 & r3
            int r1 = (int) r1
            java.lang.System.arraycopy(r0, r1, r6, r7, r8)
            long r6 = r5.pointer
            long r0 = (long) r8
            long r6 = r6 + r0
            r5.pointer = r6
            return r8
        L47:
            java.lang.IndexOutOfBoundsException r5 = new java.lang.IndexOutOfBoundsException
            r5.<init>()
            throw r5
    }

    public double readDouble() {
            r2 = this;
            long r0 = r2.readLong()
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    public float readFloat() {
            r0 = this;
            int r0 = r0.readInt()
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    public void readFully(byte[] r2) {
            r1 = this;
            int r0 = r2.length
            r1.readFully(r2, r0)
            return
    }

    public void readFully(byte[] r3, int r4) {
            r2 = this;
            r0 = 0
        L1:
            int r1 = r4 - r0
            int r1 = r2.read(r3, r0, r1)
            if (r1 >= 0) goto La
            goto Ld
        La:
            int r0 = r0 + r1
            if (r0 < r4) goto L1
        Ld:
            return
    }

    public int readInt() {
            r4 = this;
            int r0 = r4.read()
            int r1 = r4.read()
            int r2 = r4.read()
            int r4 = r4.read()
            r3 = r0 | r1
            r3 = r3 | r2
            r3 = r3 | r4
            if (r3 < 0) goto L20
            int r0 = r0 << 24
            int r1 = r1 << 16
            int r0 = r0 + r1
            int r1 = r2 << 8
            int r0 = r0 + r1
            int r0 = r0 + r4
            return r0
        L20:
            defpackage.i.n()
            r4 = 0
            return r4
    }

    public long readLong() {
            r6 = this;
            int r0 = r6.readInt()
            long r0 = (long) r0
            r2 = 32
            long r0 = r0 << r2
            int r6 = r6.readInt()
            long r2 = (long) r6
            r4 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r2 = r2 & r4
            long r0 = r0 + r2
            return r0
    }

    public short readShort() {
            r2 = this;
            int r0 = r2.read()
            int r2 = r2.read()
            r1 = r0 | r2
            if (r1 < 0) goto L11
            int r0 = r0 << 8
            int r0 = r0 + r2
            short r2 = (short) r0
            return r2
        L11:
            defpackage.i.n()
            r2 = 0
            return r2
    }

    public void seek(int r5) {
            r4 = this;
            long r0 = (long) r5
            r2 = 4294967295(0xffffffff, double:2.1219957905E-314)
            long r0 = r0 & r2
            r2 = 0
            int r5 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r5 >= 0) goto L10
            r4.pointer = r2
            return
        L10:
            r4.pointer = r0
            return
    }

    public void seek(long r4) {
            r3 = this;
            r0 = 0
            int r2 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r2 >= 0) goto L9
            r3.pointer = r0
            return
        L9:
            r3.pointer = r4
            return
    }
}

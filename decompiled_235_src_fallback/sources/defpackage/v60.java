package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: v60  reason: default package */
/* loaded from: classes.dex */
public final class v60 extends java.io.InputStream {
    public final java.nio.ByteBuffer A;
    public final java.nio.channels.SeekableByteChannel B;
    public long L;

    public v60(java.nio.channels.SeekableByteChannel r3, long r4) {
            r2 = this;
            r2.<init>()
            r2.B = r3
            r2.L = r4
            r0 = 8192(0x2000, double:4.0474E-320)
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 >= 0) goto L15
            r0 = 0
            int r3 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r3 <= 0) goto L15
            int r3 = (int) r4
            goto L17
        L15:
            r3 = 8192(0x2000, float:1.148E-41)
        L17:
            java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r3)
            r2.A = r3
            return
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
            r0 = this;
            return
    }

    @Override // java.io.InputStream
    public final int read() {
            r4 = this;
            long r0 = r4.L
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 <= 0) goto L2a
            r2 = 1
            long r0 = r0 - r2
            r4.L = r0
            r0 = 1
            java.nio.ByteBuffer r1 = r4.A
            java.nio.Buffer r2 = r1.rewind()
            r2.limit(r0)
            java.nio.channels.SeekableByteChannel r4 = r4.B
            int r4 = r4.read(r1)
            r1.flip()
            if (r4 >= 0) goto L23
            return r4
        L23:
            byte r4 = r1.get()
            r4 = r4 & 255(0xff, float:3.57E-43)
            return r4
        L2a:
            r4 = -1
            return r4
    }

    @Override // java.io.InputStream
    public final int read(byte[] r5, int r6, int r7) {
            r4 = this;
            if (r7 != 0) goto L4
            r4 = 0
            return r4
        L4:
            long r0 = r4.L
            r2 = 0
            int r2 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r2 > 0) goto Le
            r4 = -1
            return r4
        Le:
            long r2 = (long) r7
            int r2 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r2 <= 0) goto L14
            int r7 = (int) r0
        L14:
            java.nio.ByteBuffer r0 = r4.A
            int r1 = r0.capacity()
            java.nio.channels.SeekableByteChannel r2 = r4.B
            if (r7 > r1) goto L2d
            java.nio.Buffer r1 = r0.rewind()
            r1.limit(r7)
            int r7 = r2.read(r0)
            r0.flip()
            goto L38
        L2d:
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocate(r7)
            int r7 = r2.read(r0)
            r0.flip()
        L38:
            if (r7 < 0) goto L43
            r0.get(r5, r6, r7)
            long r5 = r4.L
            long r0 = (long) r7
            long r5 = r5 - r0
            r4.L = r5
        L43:
            return r7
    }
}

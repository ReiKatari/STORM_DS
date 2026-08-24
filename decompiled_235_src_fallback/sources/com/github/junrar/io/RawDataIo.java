package com.github.junrar.io;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RawDataIo implements com.github.junrar.io.SeekableReadOnlyByteChannel {
    private javax.crypto.Cipher cipher;
    private final java.util.LinkedList<java.lang.Byte> dataPool;
    private boolean isEncrypted;
    private final byte[] reused;
    private final com.github.junrar.io.SeekableReadOnlyByteChannel underlyingByteChannel;

    public RawDataIo(com.github.junrar.io.SeekableReadOnlyByteChannel r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.cipher = r0
            r0 = 0
            r1.isEncrypted = r0
            java.util.LinkedList r0 = new java.util.LinkedList
            r0.<init>()
            r1.dataPool = r0
            r0 = 1
            byte[] r0 = new byte[r0]
            r1.reused = r0
            r1.underlyingByteChannel = r2
            return
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void close() {
            r0 = this;
            com.github.junrar.io.SeekableReadOnlyByteChannel r0 = r0.underlyingByteChannel
            r0.close()
            return
    }

    public javax.crypto.Cipher getCipher() {
            r0 = this;
            javax.crypto.Cipher r0 = r0.cipher
            return r0
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public long getPosition() {
            r2 = this;
            com.github.junrar.io.SeekableReadOnlyByteChannel r2 = r2.underlyingByteChannel
            long r0 = r2.getPosition()
            return r0
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read() {
            r3 = this;
            byte[] r0 = r3.reused
            r1 = 1
            r2 = 0
            r3.read(r0, r2, r1)
            byte[] r3 = r3.reused
            r3 = r3[r2]
            return r3
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read(byte[] r3, int r4, int r5) {
            r2 = this;
            byte[] r0 = new byte[r5]
            int r2 = r2.readFully(r0, r5)
            r1 = 0
            java.lang.System.arraycopy(r0, r1, r3, r4, r5)
            return r2
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int readFully(byte[] r6, int r7) {
            r5 = this;
            boolean r0 = r5.isEncrypted
            if (r0 == 0) goto L53
            java.util.LinkedList<java.lang.Byte> r0 = r5.dataPool
            int r0 = r0.size()
            int r0 = r7 - r0
            int r1 = ~r0
            int r1 = r1 + 1
            r1 = r1 & 15
            int r0 = r0 + r1
            byte[] r1 = new byte[r0]
            r2 = 0
            if (r0 <= 0) goto L34
            com.github.junrar.io.SeekableReadOnlyByteChannel r3 = r5.underlyingByteChannel
            r3.readFully(r1, r0)
            javax.crypto.Cipher r0 = r5.cipher
            byte[] r0 = r0.update(r1)
            r1 = r2
        L23:
            int r3 = r0.length
            if (r1 >= r3) goto L34
            java.util.LinkedList<java.lang.Byte> r3 = r5.dataPool
            r4 = r0[r1]
            java.lang.Byte r4 = java.lang.Byte.valueOf(r4)
            r3.add(r4)
            int r1 = r1 + 1
            goto L23
        L34:
            r0 = r2
        L35:
            if (r2 >= r7) goto L52
            java.util.LinkedList<java.lang.Byte> r1 = r5.dataPool
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L52
            java.util.LinkedList<java.lang.Byte> r1 = r5.dataPool
            java.lang.Object r1 = r1.poll()
            java.lang.Byte r1 = (java.lang.Byte) r1
            byte r1 = r1.byteValue()
            r6[r2] = r1
            int r0 = r0 + 1
            int r2 = r2 + 1
            goto L35
        L52:
            return r0
        L53:
            com.github.junrar.io.SeekableReadOnlyByteChannel r5 = r5.underlyingByteChannel
            int r5 = r5.readFully(r6, r7)
            return r5
    }

    public void setCipher(javax.crypto.Cipher r1) {
            r0 = this;
            r0.cipher = r1
            r1 = 1
            r0.isEncrypted = r1
            return
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void setPosition(long r1) {
            r0 = this;
            com.github.junrar.io.SeekableReadOnlyByteChannel r0 = r0.underlyingByteChannel
            r0.setPosition(r1)
            return
    }
}

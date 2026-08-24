package com.github.junrar.io;

import java.util.LinkedList;
import javax.crypto.Cipher;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RawDataIo implements SeekableReadOnlyByteChannel {
    private final SeekableReadOnlyByteChannel underlyingByteChannel;
    private Cipher cipher = null;
    private boolean isEncrypted = false;
    private final LinkedList<Byte> dataPool = new LinkedList<>();
    private final byte[] reused = new byte[1];

    public RawDataIo(SeekableReadOnlyByteChannel seekableReadOnlyByteChannel) {
        this.underlyingByteChannel = seekableReadOnlyByteChannel;
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void close() {
        this.underlyingByteChannel.close();
    }

    public Cipher getCipher() {
        return this.cipher;
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public long getPosition() {
        return this.underlyingByteChannel.getPosition();
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read() {
        read(this.reused, 0, 1);
        return this.reused[0];
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int readFully(byte[] bArr, int i) {
        if (this.isEncrypted) {
            int size = i - this.dataPool.size();
            int i2 = size + (((~size) + 1) & 15);
            byte[] bArr2 = new byte[i2];
            if (i2 > 0) {
                this.underlyingByteChannel.readFully(bArr2, i2);
                byte[] update = this.cipher.update(bArr2);
                for (byte b : update) {
                    this.dataPool.add(Byte.valueOf(b));
                }
            }
            int i3 = 0;
            for (int i4 = 0; i4 < i && !this.dataPool.isEmpty(); i4++) {
                bArr[i4] = this.dataPool.poll().byteValue();
                i3++;
            }
            return i3;
        }
        return this.underlyingByteChannel.readFully(bArr, i);
    }

    public void setCipher(Cipher cipher) {
        this.cipher = cipher;
        this.isEncrypted = true;
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public void setPosition(long j) {
        this.underlyingByteChannel.setPosition(j);
    }

    @Override // com.github.junrar.io.SeekableReadOnlyByteChannel
    public int read(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        int readFully = readFully(bArr2, i2);
        System.arraycopy(bArr2, 0, bArr, i, i2);
        return readFully;
    }
}

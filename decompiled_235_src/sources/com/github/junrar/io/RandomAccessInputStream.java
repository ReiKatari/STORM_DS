package com.github.junrar.io;

import java.io.InputStream;
import java.util.Vector;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class RandomAccessInputStream extends InputStream {
    private static final int BLOCK_MASK = 511;
    private static final int BLOCK_SHIFT = 9;
    private static final int BLOCK_SIZE = 512;
    private final InputStream src;
    private long pointer = 0;
    private final Vector data = new Vector();
    private long length = 0;
    private boolean foundEOS = false;

    public RandomAccessInputStream(InputStream inputStream) {
        this.src = inputStream;
    }

    private long readUntil(long j) {
        long j2 = this.length;
        if (j < j2) {
            return j;
        }
        if (this.foundEOS) {
            return j2;
        }
        int i = (int) (j >>> 9);
        for (int i2 = (int) (j2 >>> 9); i2 <= i; i2++) {
            int i3 = 512;
            byte[] bArr = new byte[512];
            this.data.addElement(bArr);
            int i4 = 0;
            while (i3 > 0) {
                int read = this.src.read(bArr, i4, i3);
                if (read == -1) {
                    this.foundEOS = true;
                    return this.length;
                }
                i4 += read;
                i3 -= read;
                this.length += read;
            }
        }
        return this.length;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.data.removeAllElements();
        this.src.close();
    }

    public int getFilePointer() {
        return (int) this.pointer;
    }

    public long getLongFilePointer() {
        return this.pointer;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        bArr.getClass();
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            if (i2 == 0) {
                return 0;
            }
            long readUntil = readUntil(this.pointer + i2);
            long j = this.pointer;
            if (readUntil <= j) {
                return -1;
            }
            int min = Math.min(i2, 512 - ((int) (this.pointer & 511)));
            System.arraycopy((byte[]) this.data.elementAt((int) (j >>> 9)), (int) (this.pointer & 511), bArr, i, min);
            this.pointer += min;
            return min;
        }
        throw new IndexOutOfBoundsException();
    }

    public double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    public float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    public void readFully(byte[] bArr, int i) {
        int i2 = 0;
        do {
            int read = read(bArr, i2, i - i2);
            if (read >= 0) {
                i2 += read;
            } else {
                return;
            }
        } while (i2 < i);
    }

    public int readInt() {
        int read = read();
        int read2 = read();
        int read3 = read();
        int read4 = read();
        if ((read | read2 | read3 | read4) >= 0) {
            return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
        }
        i.n();
        return 0;
    }

    public long readLong() {
        return (readInt() << 32) + (readInt() & 4294967295L);
    }

    public short readShort() {
        int read = read();
        int read2 = read();
        if ((read | read2) >= 0) {
            return (short) ((read << 8) + read2);
        }
        i.n();
        return (short) 0;
    }

    public void seek(int i) {
        long j = i & 4294967295L;
        if (j < 0) {
            this.pointer = 0L;
        } else {
            this.pointer = j;
        }
    }

    public void readFully(byte[] bArr) {
        readFully(bArr, bArr.length);
    }

    public void seek(long j) {
        if (j < 0) {
            this.pointer = 0L;
        } else {
            this.pointer = j;
        }
    }

    @Override // java.io.InputStream
    public int read() {
        long j = this.pointer + 1;
        if (readUntil(j) >= j) {
            long j2 = this.pointer;
            this.pointer = 1 + j2;
            return ((byte[]) this.data.elementAt((int) (this.pointer >>> 9)))[(int) (511 & j2)] & 255;
        }
        return -1;
    }
}

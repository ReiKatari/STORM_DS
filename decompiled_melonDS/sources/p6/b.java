package p6;

import a0.j;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.InputStream;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class b extends InputStream implements DataInput {
    public final DataInputStream A;
    public int B;
    public ByteOrder L;
    public byte[] R;
    public final int X;

    public b(InputStream inputStream, ByteOrder byteOrder) {
        int i2;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A = dataInputStream;
        dataInputStream.mark(0);
        this.B = 0;
        this.L = byteOrder;
        if (inputStream instanceof b) {
            i2 = ((b) inputStream).X;
        } else {
            i2 = -1;
        }
        this.X = i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.A.available();
    }

    public final void d(int i2) {
        int i10 = 0;
        while (i10 < i2) {
            int i11 = i2 - i10;
            DataInputStream dataInputStream = this.A;
            int skip = (int) dataInputStream.skip(i11);
            if (skip <= 0) {
                if (this.R == null) {
                    this.R = new byte[8192];
                }
                skip = dataInputStream.read(this.R, 0, Math.min(8192, i11));
                if (skip == -1) {
                    throw new EOFException(w.d.m("Reached EOF while skipping ", i2, " bytes."));
                }
            }
            i10 += skip;
        }
        this.B += i10;
    }

    @Override // java.io.InputStream
    public final void mark(int i2) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.B++;
        return this.A.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.B++;
        return this.A.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.B++;
        int read = this.A.read();
        if (read >= 0) {
            return (byte) read;
        }
        j.c();
        return (byte) 0;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.B += 2;
        return this.A.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.B += bArr.length;
        this.A.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.B += 4;
        DataInputStream dataInputStream = this.A;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.L;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            wa.b.g(this.L, "Invalid byte order: ");
            return 0;
        }
        j.c();
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        long j2;
        long j10;
        this.B += 8;
        DataInputStream dataInputStream = this.A;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.L;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                j2 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                j10 = read;
            } else if (byteOrder == ByteOrder.BIG_ENDIAN) {
                j2 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                j10 = read8;
            } else {
                wa.b.g(this.L, "Invalid byte order: ");
                return 0L;
            }
            return j2 + j10;
        }
        j.c();
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.B += 2;
        DataInputStream dataInputStream = this.A;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.L;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (short) ((read << 8) + read2);
            }
            wa.b.g(this.L, "Invalid byte order: ");
            return (short) 0;
        }
        j.c();
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.B += 2;
        return this.A.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.B++;
        return this.A.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.B += 2;
        DataInputStream dataInputStream = this.A;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.L;
            if (byteOrder == ByteOrder.LITTLE_ENDIAN) {
                return (read2 << 8) + read;
            }
            if (byteOrder == ByteOrder.BIG_ENDIAN) {
                return (read << 8) + read2;
            }
            wa.b.g(this.L, "Invalid byte order: ");
            return 0;
        }
        j.c();
        return 0;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i2) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i2, int i10) {
        this.B += i10;
        this.A.readFully(bArr, i2, i10);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        int read = this.A.read(bArr, i2, i10);
        this.B += read;
        return read;
    }

    public b(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public b(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
        this.X = bArr.length;
    }
}

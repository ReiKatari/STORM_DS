package c;

import android.util.Log;
import fj.j;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a extends InputStream implements DataInput {
    public static final ByteOrder X = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder Y = ByteOrder.BIG_ENDIAN;
    public final DataInputStream A;
    public ByteOrder B;
    public final int L;
    public int R;

    public a(InputStream inputStream) {
        this.B = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.A = dataInputStream;
        int available = dataInputStream.available();
        this.L = available;
        this.R = 0;
        dataInputStream.mark(available);
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.A.available();
    }

    public final void d(long j2) {
        int i2 = this.R;
        if (i2 > j2) {
            this.R = 0;
            DataInputStream dataInputStream = this.A;
            dataInputStream.reset();
            dataInputStream.mark(this.L);
        } else {
            j2 -= i2;
        }
        int i10 = (int) j2;
        if (skipBytes(i10) == i10) {
            return;
        }
        j.h("Couldn't seek up to the byteCount");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.R++;
        return this.A.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.R++;
        return this.A.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        int i2 = this.R + 1;
        this.R = i2;
        if (i2 <= this.L) {
            int read = this.A.read();
            if (read >= 0) {
                return (byte) read;
            }
            a0.j.c();
            return (byte) 0;
        }
        a0.j.c();
        return (byte) 0;
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.R += 2;
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
        int length = this.R + bArr.length;
        this.R = length;
        if (length <= this.L) {
            if (this.A.read(bArr, 0, bArr.length) == bArr.length) {
                return;
            }
            j.h("Couldn't read up to the length of buffer");
            return;
        }
        a0.j.c();
    }

    @Override // java.io.DataInput
    public final int readInt() {
        int i2 = this.R + 4;
        this.R = i2;
        if (i2 <= this.L) {
            DataInputStream dataInputStream = this.A;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            int read3 = dataInputStream.read();
            int read4 = dataInputStream.read();
            if ((read | read2 | read3 | read4) >= 0) {
                ByteOrder byteOrder = this.B;
                if (byteOrder == X) {
                    return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == Y) {
                    return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
                }
                wa.b.g(this.B, "Invalid byte order: ");
                return 0;
            }
            a0.j.c();
            return 0;
        }
        a0.j.c();
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
        int i2 = this.R + 8;
        this.R = i2;
        if (i2 <= this.L) {
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
                ByteOrder byteOrder = this.B;
                if (byteOrder == X) {
                    j2 = (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8);
                    j10 = read;
                } else if (byteOrder == Y) {
                    j2 = (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8);
                    j10 = read8;
                } else {
                    wa.b.g(this.B, "Invalid byte order: ");
                    return 0L;
                }
                return j2 + j10;
            }
            a0.j.c();
            return 0L;
        }
        a0.j.c();
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        int i2 = this.R + 2;
        this.R = i2;
        if (i2 <= this.L) {
            DataInputStream dataInputStream = this.A;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.B;
                if (byteOrder == X) {
                    return (short) ((read2 << 8) + read);
                }
                if (byteOrder == Y) {
                    return (short) ((read << 8) + read2);
                }
                wa.b.g(this.B, "Invalid byte order: ");
                return (short) 0;
            }
            a0.j.c();
            return (short) 0;
        }
        a0.j.c();
        return (short) 0;
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.R += 2;
        return this.A.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.R++;
        return this.A.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        int i2 = this.R + 2;
        this.R = i2;
        if (i2 <= this.L) {
            DataInputStream dataInputStream = this.A;
            int read = dataInputStream.read();
            int read2 = dataInputStream.read();
            if ((read | read2) >= 0) {
                ByteOrder byteOrder = this.B;
                if (byteOrder == X) {
                    return (read2 << 8) + read;
                }
                if (byteOrder == Y) {
                    return (read << 8) + read2;
                }
                wa.b.g(this.B, "Invalid byte order: ");
                return 0;
            }
            a0.j.c();
            return 0;
        }
        a0.j.c();
        return 0;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i2) {
        int min = Math.min(i2, this.L - this.R);
        int i10 = 0;
        while (i10 < min) {
            i10 += this.A.skipBytes(min - i10);
        }
        this.R += i10;
        return i10;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i2, int i10) {
        int read = this.A.read(bArr, i2, i10);
        this.R += read;
        return read;
    }

    public a(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i2, int i10) {
        int i11 = this.R + i10;
        this.R = i11;
        if (i11 <= this.L) {
            if (this.A.read(bArr, i2, i10) == i10) {
                return;
            }
            j.h("Couldn't read up to the length of buffer");
            return;
        }
        a0.j.c();
    }
}

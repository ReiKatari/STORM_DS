package defpackage;

import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.ByteOrder;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: r22  reason: default package */
/* loaded from: classes.dex */
public final class r22 extends InputStream implements DataInput {
    public static final ByteOrder X = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder Y = ByteOrder.BIG_ENDIAN;
    public final DataInputStream A;
    public ByteOrder B;
    public final int L;
    public int R;

    public r22(InputStream inputStream) {
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

    public final void d(long j) {
        int i = this.R;
        if (i > j) {
            this.R = 0;
            DataInputStream dataInputStream = this.A;
            dataInputStream.reset();
            dataInputStream.mark(this.L);
        } else {
            j -= i;
        }
        int i2 = (int) j;
        if (skipBytes(i2) == i2) {
            return;
        }
        f81.j("Couldn't seek up to the byteCount");
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
        int i = this.R + 1;
        this.R = i;
        if (i <= this.L) {
            int read = this.A.read();
            if (read >= 0) {
                return (byte) read;
            }
            i.l();
            return (byte) 0;
        }
        i.l();
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
            f81.j("Couldn't read up to the length of buffer");
            return;
        }
        i.l();
    }

    @Override // java.io.DataInput
    public final int readInt() {
        int i = this.R + 4;
        this.R = i;
        if (i <= this.L) {
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
                f81.y(this.B, "Invalid byte order: ");
                return 0;
            }
            i.l();
            return 0;
        }
        i.l();
        return 0;
    }

    @Override // java.io.DataInput
    public final String readLine() {
        Log.d("ExifInterface", "Currently unsupported");
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        int i = this.R + 8;
        this.R = i;
        if (i <= this.L) {
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
                    return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
                }
                if (byteOrder == Y) {
                    return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
                }
                f81.y(this.B, "Invalid byte order: ");
                return 0L;
            }
            i.l();
            return 0L;
        }
        i.l();
        return 0L;
    }

    @Override // java.io.DataInput
    public final short readShort() {
        int i = this.R + 2;
        this.R = i;
        if (i <= this.L) {
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
                f81.y(this.B, "Invalid byte order: ");
                return (short) 0;
            }
            i.l();
            return (short) 0;
        }
        i.l();
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
        int i = this.R + 2;
        this.R = i;
        if (i <= this.L) {
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
                f81.y(this.B, "Invalid byte order: ");
                return 0;
            }
            i.l();
            return 0;
        }
        i.l();
        return 0;
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        int min = Math.min(i, this.L - this.R);
        int i2 = 0;
        while (i2 < min) {
            i2 += this.A.skipBytes(min - i2);
        }
        this.R += i2;
        return i2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.A.read(bArr, i, i2);
        this.R += read;
        return read;
    }

    public r22(byte[] bArr) {
        this(new ByteArrayInputStream(bArr));
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        int i3 = this.R + i2;
        this.R = i3;
        if (i3 <= this.L) {
            if (this.A.read(bArr, i, i2) == i2) {
                return;
            }
            f81.j("Couldn't read up to the length of buffer");
            return;
        }
        i.l();
    }
}

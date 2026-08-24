package defpackage;

import android.os.Parcel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: pc1  reason: default package */
/* loaded from: classes.dex */
public final class pc1 {
    public Parcel a;

    public long a() {
        int i = kt0.i;
        long readLong = this.a.readLong();
        long j = 63 & readLong;
        if (j < 16) {
            return readLong;
        }
        return (readLong & (-64)) | (j + 1);
    }

    public long b() {
        long j;
        Parcel parcel = this.a;
        byte readByte = parcel.readByte();
        if (readByte == 1) {
            j = 4294967296L;
        } else if (readByte == 2) {
            j = 8589934592L;
        } else {
            j = 0;
        }
        if (y47.a(j, 0L)) {
            return x47.c;
        }
        return hi2.J(parcel.readFloat(), j);
    }

    public void c(byte b) {
        this.a.writeByte(b);
    }

    public void d(float f) {
        this.a.writeFloat(f);
    }

    public void e(long j) {
        long b = x47.b(j);
        byte b2 = 0;
        if (!y47.a(b, 0L)) {
            if (y47.a(b, 4294967296L)) {
                b2 = 1;
            } else if (y47.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        c(b2);
        if (!y47.a(x47.b(j), 0L)) {
            d(x47.c(j));
        }
    }
}

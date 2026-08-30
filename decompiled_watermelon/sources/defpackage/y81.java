package defpackage;

import android.os.Parcel;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: y81  reason: default package */
/* loaded from: classes.dex */
public final class y81 {
    public Parcel a;

    public long a() {
        int i = xq0.i;
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
        if (js6.a(j, 0L)) {
            return is6.c;
        }
        return hi2.L(parcel.readFloat(), j);
    }

    public void c(byte b) {
        this.a.writeByte(b);
    }

    public void d(float f) {
        this.a.writeFloat(f);
    }

    public void e(long j) {
        long b = is6.b(j);
        byte b2 = 0;
        if (!js6.a(b, 0L)) {
            if (js6.a(b, 4294967296L)) {
                b2 = 1;
            } else if (js6.a(b, 8589934592L)) {
                b2 = 2;
            }
        }
        c(b2);
        if (!js6.a(is6.b(j), 0L)) {
            d(is6.c(j));
        }
    }
}

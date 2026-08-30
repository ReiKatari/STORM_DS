package k1;

import android.os.Parcel;
import i3.s;
import p7.t;
import x4.o;
import x4.p;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public Parcel f7952a;

    public long a() {
        int i2 = s.f6688i;
        long readLong = this.f7952a.readLong();
        long j2 = 63 & readLong;
        if (j2 < 16) {
            return readLong;
        }
        return (readLong & (-64)) | (j2 + 1);
    }

    public long b() {
        long j2;
        Parcel parcel = this.f7952a;
        byte readByte = parcel.readByte();
        if (readByte == 1) {
            j2 = 4294967296L;
        } else if (readByte == 2) {
            j2 = 8589934592L;
        } else {
            j2 = 0;
        }
        if (p.a(j2, 0L)) {
            return o.f14349c;
        }
        return t.C(j2, parcel.readFloat());
    }

    public void c(byte b10) {
        this.f7952a.writeByte(b10);
    }

    public void d(float f8) {
        this.f7952a.writeFloat(f8);
    }

    public void e(long j2) {
        long b10 = o.b(j2);
        byte b11 = 0;
        if (!p.a(b10, 0L)) {
            if (p.a(b10, 4294967296L)) {
                b11 = 1;
            } else if (p.a(b10, 8589934592L)) {
                b11 = 2;
            }
        }
        c(b11);
        if (!p.a(o.b(j2), 0L)) {
            d(o.c(j2));
        }
    }
}

package n2;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d1 extends z2.z implements Parcelable, z2.n, s2, w0 {
    public static final Parcelable.Creator<d1> CREATOR = new a1(2);
    public k2 B;

    public d1(long j2) {
        z2.f j10 = z2.l.j();
        k2 k2Var = new k2(j10.g(), j2);
        if (!(j10 instanceof z2.a)) {
            k2Var.f14883b = new k2(1, j2);
        }
        this.B = k2Var;
    }

    @Override // z2.y
    public final z2.a0 a() {
        return this.B;
    }

    @Override // z2.y
    public final z2.a0 b(z2.a0 a0Var, z2.a0 a0Var2, z2.a0 a0Var3) {
        if (((k2) a0Var2).f9952c == ((k2) a0Var3).f9952c) {
            return a0Var2;
        }
        return null;
    }

    @Override // z2.y
    public final void c(z2.a0 a0Var) {
        a0Var.getClass();
        this.B = (k2) a0Var;
    }

    @Override // z2.n
    public final e d() {
        return e.Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final long g() {
        return ((k2) z2.l.t(this.B, this)).f9952c;
    }

    @Override // n2.s2
    public final Object getValue() {
        return Long.valueOf(g());
    }

    public final void h(long j2) {
        z2.f j10;
        k2 k2Var = (k2) z2.l.h(this.B);
        if (k2Var.f9952c != j2) {
            k2 k2Var2 = this.B;
            synchronized (z2.l.f14919c) {
                j10 = z2.l.j();
                ((k2) z2.l.o(k2Var2, this, j10, k2Var)).f9952c = j2;
            }
            z2.l.n(j10, this);
        }
    }

    @Override // n2.w0
    public final void setValue(Object obj) {
        h(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((k2) z2.l.h(this.B)).f9952c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeLong(g());
    }
}

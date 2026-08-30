package n2;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b1 extends z2.z implements Parcelable, z2.n, s2, w0 {
    public static final Parcelable.Creator<b1> CREATOR = new a1(0);
    public i2 B;

    public b1(float f8) {
        z2.f j2 = z2.l.j();
        i2 i2Var = new i2(j2.g(), f8);
        if (!(j2 instanceof z2.a)) {
            i2Var.f14883b = new i2(1, f8);
        }
        this.B = i2Var;
    }

    @Override // z2.y
    public final z2.a0 a() {
        return this.B;
    }

    @Override // z2.y
    public final z2.a0 b(z2.a0 a0Var, z2.a0 a0Var2, z2.a0 a0Var3) {
        if (((i2) a0Var2).f9941c == ((i2) a0Var3).f9941c) {
            return a0Var2;
        }
        return null;
    }

    @Override // z2.y
    public final void c(z2.a0 a0Var) {
        a0Var.getClass();
        this.B = (i2) a0Var;
    }

    @Override // z2.n
    public final e d() {
        return e.Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final float g() {
        return ((i2) z2.l.t(this.B, this)).f9941c;
    }

    @Override // n2.s2
    public final Object getValue() {
        return Float.valueOf(g());
    }

    public final void h(float f8) {
        z2.f j2;
        i2 i2Var = (i2) z2.l.h(this.B);
        if (i2Var.f9941c == f8) {
            return;
        }
        i2 i2Var2 = this.B;
        synchronized (z2.l.f14919c) {
            j2 = z2.l.j();
            ((i2) z2.l.o(i2Var2, this, j2, i2Var)).f9941c = f8;
        }
        z2.l.n(j2, this);
    }

    @Override // n2.w0
    public final void setValue(Object obj) {
        h(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((i2) z2.l.h(this.B)).f9941c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeFloat(g());
    }
}

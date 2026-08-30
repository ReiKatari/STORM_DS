package n2;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c1 extends z2.z implements Parcelable, z2.n, s2, w0 {
    public static final Parcelable.Creator<c1> CREATOR = new a1(1);
    public j2 B;

    public c1(int i2) {
        z2.f j2 = z2.l.j();
        j2 j2Var = new j2(i2, j2.g());
        if (!(j2 instanceof z2.a)) {
            j2Var.f14883b = new j2(i2, 1);
        }
        this.B = j2Var;
    }

    @Override // z2.y
    public final z2.a0 a() {
        return this.B;
    }

    @Override // z2.y
    public final z2.a0 b(z2.a0 a0Var, z2.a0 a0Var2, z2.a0 a0Var3) {
        if (((j2) a0Var2).f9942c == ((j2) a0Var3).f9942c) {
            return a0Var2;
        }
        return null;
    }

    @Override // z2.y
    public final void c(z2.a0 a0Var) {
        a0Var.getClass();
        this.B = (j2) a0Var;
    }

    @Override // z2.n
    public final e d() {
        return e.Z;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final int g() {
        return ((j2) z2.l.t(this.B, this)).f9942c;
    }

    @Override // n2.s2
    public final Object getValue() {
        return Integer.valueOf(g());
    }

    public final void h(int i2) {
        z2.f j2;
        j2 j2Var = (j2) z2.l.h(this.B);
        if (j2Var.f9942c != i2) {
            j2 j2Var2 = this.B;
            synchronized (z2.l.f14919c) {
                j2 = z2.l.j();
                ((j2) z2.l.o(j2Var2, this, j2, j2Var)).f9942c = i2;
            }
            z2.l.n(j2, this);
        }
    }

    @Override // n2.w0
    public final void setValue(Object obj) {
        h(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((j2) z2.l.h(this.B)).f9942c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(g());
    }
}

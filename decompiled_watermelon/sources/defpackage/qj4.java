package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: qj4  reason: default package */
/* loaded from: classes.dex */
public final class qj4 extends qe6 implements Parcelable, ra6, ae6, k24 {
    public static final Parcelable.Creator<qj4> CREATOR = new x8(25);
    public pa6 B;

    public qj4(int i) {
        ga6 j = ma6.j();
        pa6 pa6Var = new pa6(i, j.g());
        if (!(j instanceof jm2)) {
            pa6Var.b = new pa6(i, 1L);
        }
        this.B = pa6Var;
    }

    @Override // defpackage.pe6
    public final se6 b() {
        return this.B;
    }

    @Override // defpackage.pe6
    public final se6 c(se6 se6Var, se6 se6Var2, se6 se6Var3) {
        if (((pa6) se6Var2).c == ((pa6) se6Var3).c) {
            return se6Var2;
        }
        return null;
    }

    @Override // defpackage.pe6
    public final void d(se6 se6Var) {
        se6Var.getClass();
        this.B = (pa6) se6Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ra6
    public final ta6 e() {
        return k45.n0;
    }

    @Override // defpackage.ae6
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((pa6) ma6.t(this.B, this)).c;
    }

    public final void i(int i) {
        ga6 j;
        pa6 pa6Var = (pa6) ma6.h(this.B);
        if (pa6Var.c != i) {
            pa6 pa6Var2 = this.B;
            synchronized (ma6.c) {
                j = ma6.j();
                ((pa6) ma6.o(pa6Var2, this, j, pa6Var)).c = i;
            }
            ma6.n(j, this);
        }
    }

    @Override // defpackage.k24
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((pa6) ma6.h(this.B)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}

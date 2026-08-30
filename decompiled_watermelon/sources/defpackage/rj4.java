package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rj4  reason: default package */
/* loaded from: classes.dex */
public final class rj4 extends qe6 implements Parcelable, ra6, ae6, k24 {
    public static final Parcelable.Creator<rj4> CREATOR = new x8(26);
    public qa6 B;

    public rj4(long j) {
        ga6 j2 = ma6.j();
        qa6 qa6Var = new qa6(j2.g(), j);
        if (!(j2 instanceof jm2)) {
            qa6Var.b = new qa6(1L, j);
        }
        this.B = qa6Var;
    }

    @Override // defpackage.pe6
    public final se6 b() {
        return this.B;
    }

    @Override // defpackage.pe6
    public final se6 c(se6 se6Var, se6 se6Var2, se6 se6Var3) {
        if (((qa6) se6Var2).c == ((qa6) se6Var3).c) {
            return se6Var2;
        }
        return null;
    }

    @Override // defpackage.pe6
    public final void d(se6 se6Var) {
        se6Var.getClass();
        this.B = (qa6) se6Var;
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
        return Long.valueOf(h());
    }

    public final long h() {
        return ((qa6) ma6.t(this.B, this)).c;
    }

    public final void i(long j) {
        ga6 j2;
        qa6 qa6Var = (qa6) ma6.h(this.B);
        if (qa6Var.c != j) {
            qa6 qa6Var2 = this.B;
            synchronized (ma6.c) {
                j2 = ma6.j();
                ((qa6) ma6.o(qa6Var2, this, j2, qa6Var)).c = j;
            }
            ma6.n(j2, this);
        }
    }

    @Override // defpackage.k24
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((qa6) ma6.h(this.B)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}

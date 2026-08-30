package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: tj4  reason: default package */
/* loaded from: classes.dex */
public final class tj4 extends qe6 implements Parcelable, ra6 {
    public static final Parcelable.Creator<tj4> CREATOR = new sj4(0);
    public final ta6 B;
    public sa6 L;

    public tj4(Object obj, ta6 ta6Var) {
        this.B = ta6Var;
        ga6 j = ma6.j();
        sa6 sa6Var = new sa6(j.g(), obj);
        if (!(j instanceof jm2)) {
            sa6Var.b = new sa6(1L, obj);
        }
        this.L = sa6Var;
    }

    @Override // defpackage.pe6
    public final se6 b() {
        return this.L;
    }

    @Override // defpackage.pe6
    public final se6 c(se6 se6Var, se6 se6Var2, se6 se6Var3) {
        sa6 sa6Var = (sa6) se6Var;
        if (this.B.b(((sa6) se6Var2).c, ((sa6) se6Var3).c)) {
            return se6Var2;
        }
        return null;
    }

    @Override // defpackage.pe6
    public final void d(se6 se6Var) {
        se6Var.getClass();
        this.L = (sa6) se6Var;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.ra6
    public final ta6 e() {
        return this.B;
    }

    @Override // defpackage.ae6
    public final Object getValue() {
        return ((sa6) ma6.t(this.L, this)).c;
    }

    @Override // defpackage.k24
    public final void setValue(Object obj) {
        ga6 j;
        sa6 sa6Var = (sa6) ma6.h(this.L);
        if (!this.B.b(sa6Var.c, obj)) {
            sa6 sa6Var2 = this.L;
            synchronized (ma6.c) {
                j = ma6.j();
                ((sa6) ma6.o(sa6Var2, this, j, sa6Var)).c = obj;
            }
            ma6.n(j, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((sa6) ma6.h(this.L)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        k45 k45Var = k45.f0;
        ta6 ta6Var = this.B;
        if (b53.x(ta6Var, k45Var)) {
            i2 = 0;
        } else if (b53.x(ta6Var, k45.n0)) {
            i2 = 1;
        } else if (b53.x(ta6Var, sn1.q0)) {
            i2 = 2;
        } else {
            i.n("Only known types of MutableState's SnapshotMutationPolicy are supported");
            return;
        }
        parcel.writeInt(i2);
    }
}

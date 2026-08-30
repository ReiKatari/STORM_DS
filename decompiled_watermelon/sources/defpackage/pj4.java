package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pj4  reason: default package */
/* loaded from: classes.dex */
public final class pj4 extends qe6 implements Parcelable, ra6, ae6, k24 {
    public static final Parcelable.Creator<pj4> CREATOR = new x8(24);
    public oa6 B;

    public pj4(float f) {
        ga6 j = ma6.j();
        oa6 oa6Var = new oa6(f, j.g());
        if (!(j instanceof jm2)) {
            oa6Var.b = new oa6(f, 1L);
        }
        this.B = oa6Var;
    }

    @Override // defpackage.pe6
    public final se6 b() {
        return this.B;
    }

    @Override // defpackage.pe6
    public final se6 c(se6 se6Var, se6 se6Var2, se6 se6Var3) {
        if (((oa6) se6Var2).c == ((oa6) se6Var3).c) {
            return se6Var2;
        }
        return null;
    }

    @Override // defpackage.pe6
    public final void d(se6 se6Var) {
        se6Var.getClass();
        this.B = (oa6) se6Var;
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
        return Float.valueOf(h());
    }

    public final float h() {
        return ((oa6) ma6.t(this.B, this)).c;
    }

    public final void i(float f) {
        ga6 j;
        oa6 oa6Var = (oa6) ma6.h(this.B);
        if (oa6Var.c == f) {
            return;
        }
        oa6 oa6Var2 = this.B;
        synchronized (ma6.c) {
            j = ma6.j();
            ((oa6) ma6.o(oa6Var2, this, j, oa6Var)).c = f;
        }
        ma6.n(j, this);
    }

    @Override // defpackage.k24
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((oa6) ma6.h(this.B)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}

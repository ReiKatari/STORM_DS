package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ts4  reason: default package */
/* loaded from: classes.dex */
public final class ts4 extends fq6 implements Parcelable, gm6, pp6, qa4 {
    public static final Parcelable.Creator<ts4> CREATOR = new y8(26);
    public fm6 B;

    public ts4(long j) {
        vl6 j2 = bm6.j();
        fm6 fm6Var = new fm6(j2.g(), j);
        if (!(j2 instanceof os2)) {
            fm6Var.b = new fm6(1L, j);
        }
        this.B = fm6Var;
    }

    @Override // defpackage.eq6
    public final hq6 a() {
        return this.B;
    }

    @Override // defpackage.eq6
    public final hq6 b(hq6 hq6Var, hq6 hq6Var2, hq6 hq6Var3) {
        if (((fm6) hq6Var2).c == ((fm6) hq6Var3).c) {
            return hq6Var2;
        }
        return null;
    }

    @Override // defpackage.gm6
    public final im6 d() {
        return xd5.s0;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eq6
    public final void f(hq6 hq6Var) {
        hq6Var.getClass();
        this.B = (fm6) hq6Var;
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        return Long.valueOf(h());
    }

    public final long h() {
        return ((fm6) bm6.t(this.B, this)).c;
    }

    public final void i(long j) {
        vl6 j2;
        fm6 fm6Var = (fm6) bm6.h(this.B);
        if (fm6Var.c != j) {
            fm6 fm6Var2 = this.B;
            synchronized (bm6.c) {
                j2 = bm6.j();
                ((fm6) bm6.o(fm6Var2, this, j2, fm6Var)).c = j;
            }
            bm6.n(j2, this);
        }
    }

    @Override // defpackage.qa4
    public final void setValue(Object obj) {
        i(((Number) obj).longValue());
    }

    public final String toString() {
        return "MutableLongState(value=" + ((fm6) bm6.h(this.B)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(h());
    }
}

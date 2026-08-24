package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: rs4  reason: default package */
/* loaded from: classes.dex */
public final class rs4 extends fq6 implements Parcelable, gm6, pp6, qa4 {
    public static final Parcelable.Creator<rs4> CREATOR = new y8(24);
    public dm6 B;

    public rs4(float f) {
        vl6 j = bm6.j();
        dm6 dm6Var = new dm6(f, j.g());
        if (!(j instanceof os2)) {
            dm6Var.b = new dm6(f, 1L);
        }
        this.B = dm6Var;
    }

    @Override // defpackage.eq6
    public final hq6 a() {
        return this.B;
    }

    @Override // defpackage.eq6
    public final hq6 b(hq6 hq6Var, hq6 hq6Var2, hq6 hq6Var3) {
        if (((dm6) hq6Var2).c == ((dm6) hq6Var3).c) {
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
        this.B = (dm6) hq6Var;
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        return Float.valueOf(h());
    }

    public final float h() {
        return ((dm6) bm6.t(this.B, this)).c;
    }

    public final void i(float f) {
        vl6 j;
        dm6 dm6Var = (dm6) bm6.h(this.B);
        if (dm6Var.c == f) {
            return;
        }
        dm6 dm6Var2 = this.B;
        synchronized (bm6.c) {
            j = bm6.j();
            ((dm6) bm6.o(dm6Var2, this, j, dm6Var)).c = f;
        }
        bm6.n(j, this);
    }

    @Override // defpackage.qa4
    public final void setValue(Object obj) {
        i(((Number) obj).floatValue());
    }

    public final String toString() {
        return "MutableFloatState(value=" + ((dm6) bm6.h(this.B)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(h());
    }
}

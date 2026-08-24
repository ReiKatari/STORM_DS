package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vs4  reason: default package */
/* loaded from: classes.dex */
public final class vs4 extends fq6 implements Parcelable, gm6 {
    public static final Parcelable.Creator<vs4> CREATOR = new us4(0);
    public final im6 B;
    public hm6 L;

    public vs4(Object obj, im6 im6Var) {
        this.B = im6Var;
        vl6 j = bm6.j();
        hm6 hm6Var = new hm6(j.g(), obj);
        if (!(j instanceof os2)) {
            hm6Var.b = new hm6(1L, obj);
        }
        this.L = hm6Var;
    }

    @Override // defpackage.eq6
    public final hq6 a() {
        return this.L;
    }

    @Override // defpackage.eq6
    public final hq6 b(hq6 hq6Var, hq6 hq6Var2, hq6 hq6Var3) {
        hm6 hm6Var = (hm6) hq6Var;
        if (this.B.i(((hm6) hq6Var2).c, ((hm6) hq6Var3).c)) {
            return hq6Var2;
        }
        return null;
    }

    @Override // defpackage.gm6
    public final im6 d() {
        return this.B;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // defpackage.eq6
    public final void f(hq6 hq6Var) {
        hq6Var.getClass();
        this.L = (hm6) hq6Var;
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        return ((hm6) bm6.t(this.L, this)).c;
    }

    @Override // defpackage.qa4
    public final void setValue(Object obj) {
        vl6 j;
        hm6 hm6Var = (hm6) bm6.h(this.L);
        if (!this.B.i(hm6Var.c, obj)) {
            hm6 hm6Var2 = this.L;
            synchronized (bm6.c) {
                j = bm6.j();
                ((hm6) bm6.o(hm6Var2, this, j, hm6Var)).c = obj;
            }
            bm6.n(j, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((hm6) bm6.h(this.L)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        parcel.writeValue(getValue());
        vs0 vs0Var = vs0.j0;
        im6 im6Var = this.B;
        if (nb3.k(im6Var, vs0Var)) {
            i2 = 0;
        } else if (nb3.k(im6Var, xd5.s0)) {
            i2 = 1;
        } else if (nb3.k(im6Var, vs0.s0)) {
            i2 = 2;
        } else {
            i.m("Only known types of MutableState's SnapshotMutationPolicy are supported");
            return;
        }
        parcel.writeInt(i2);
    }
}

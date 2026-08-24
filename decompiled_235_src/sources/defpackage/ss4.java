package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ss4  reason: default package */
/* loaded from: classes.dex */
public final class ss4 extends fq6 implements Parcelable, gm6, pp6, qa4 {
    public static final Parcelable.Creator<ss4> CREATOR = new y8(25);
    public em6 B;

    public ss4(int i) {
        vl6 j = bm6.j();
        em6 em6Var = new em6(i, j.g());
        if (!(j instanceof os2)) {
            em6Var.b = new em6(i, 1L);
        }
        this.B = em6Var;
    }

    @Override // defpackage.eq6
    public final hq6 a() {
        return this.B;
    }

    @Override // defpackage.eq6
    public final hq6 b(hq6 hq6Var, hq6 hq6Var2, hq6 hq6Var3) {
        if (((em6) hq6Var2).c == ((em6) hq6Var3).c) {
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
        this.B = (em6) hq6Var;
    }

    @Override // defpackage.pp6
    public final Object getValue() {
        return Integer.valueOf(h());
    }

    public final int h() {
        return ((em6) bm6.t(this.B, this)).c;
    }

    public final void i(int i) {
        vl6 j;
        em6 em6Var = (em6) bm6.h(this.B);
        if (em6Var.c != i) {
            em6 em6Var2 = this.B;
            synchronized (bm6.c) {
                j = bm6.j();
                ((em6) bm6.o(em6Var2, this, j, em6Var)).c = i;
            }
            bm6.n(j, this);
        }
    }

    @Override // defpackage.qa4
    public final void setValue(Object obj) {
        i(((Number) obj).intValue());
    }

    public final String toString() {
        return "MutableIntState(value=" + ((em6) bm6.h(this.B)).c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(h());
    }
}

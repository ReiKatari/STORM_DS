package n2;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f1 extends z2.z implements Parcelable, z2.n {
    public static final Parcelable.Creator<f1> CREATOR = new Object();
    public final e B;
    public l2 L;

    public f1(Object obj, e eVar) {
        this.B = eVar;
        z2.f j2 = z2.l.j();
        l2 l2Var = new l2(j2.g(), obj);
        if (!(j2 instanceof z2.a)) {
            l2Var.f14883b = new l2(1, obj);
        }
        this.L = l2Var;
    }

    @Override // z2.y
    public final z2.a0 a() {
        return this.L;
    }

    @Override // z2.y
    public final z2.a0 b(z2.a0 a0Var, z2.a0 a0Var2, z2.a0 a0Var3) {
        l2 l2Var = (l2) a0Var;
        if (this.B.b(((l2) a0Var2).f9954c, ((l2) a0Var3).f9954c)) {
            return a0Var2;
        }
        return null;
    }

    @Override // z2.y
    public final void c(z2.a0 a0Var) {
        a0Var.getClass();
        this.L = (l2) a0Var;
    }

    @Override // z2.n
    public final e d() {
        return this.B;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // n2.s2
    public final Object getValue() {
        return ((l2) z2.l.t(this.L, this)).f9954c;
    }

    @Override // n2.w0
    public final void setValue(Object obj) {
        z2.f j2;
        l2 l2Var = (l2) z2.l.h(this.L);
        if (!this.B.b(l2Var.f9954c, obj)) {
            l2 l2Var2 = this.L;
            synchronized (z2.l.f14919c) {
                j2 = z2.l.j();
                ((l2) z2.l.o(l2Var2, this, j2, l2Var)).f9954c = obj;
            }
            z2.l.n(j2, this);
        }
    }

    public final String toString() {
        return "MutableState(value=" + ((l2) z2.l.h(this.L)).f9954c + ")@" + hashCode();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i10;
        parcel.writeValue(getValue());
        e eVar = e.R;
        e eVar2 = this.B;
        if (nc.k.a(eVar2, eVar)) {
            i10 = 0;
        } else if (nc.k.a(eVar2, e.Z)) {
            i10 = 1;
        } else if (nc.k.a(eVar2, e.X)) {
            i10 = 2;
        } else {
            a0.j.p("Only known types of MutableState's SnapshotMutationPolicy are supported");
            return;
        }
        parcel.writeInt(i10);
    }
}

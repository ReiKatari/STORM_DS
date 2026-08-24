package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n63  reason: default package */
/* loaded from: classes.dex */
public final class n63 implements Parcelable {
    public static final m63 CREATOR = new Object();
    public final i63 A;

    public n63(Parcel parcel) {
        m63 m63Var = CREATOR;
        this.A = new i63((b63) ((u52) b63.getEntries()).get(parcel.readInt()), m63.a(m63Var, parcel), m63.a(m63Var, parcel));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        i63 i63Var = this.A;
        parcel.writeInt(i63Var.a.ordinal());
        m63 m63Var = CREATOR;
        m63.b(m63Var, parcel, i63Var.b);
        m63.b(m63Var, parcel, i63Var.c);
    }

    public n63(i63 i63Var) {
        i63Var.getClass();
        this.A = i63Var;
    }
}

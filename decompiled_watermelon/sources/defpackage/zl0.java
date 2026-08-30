package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import me.magnum.melonds.domain.model.Cheat;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zl0  reason: default package */
/* loaded from: classes.dex */
public final class zl0 implements Parcelable {
    public static final Parcelable.Creator<zl0> CREATOR = new x8(7);
    public final Long A;
    public final long B;
    public final String L;
    public final String R;
    public final String X;
    public final boolean Y;

    public zl0(Long l, long j, String str, String str2, String str3, boolean z) {
        str.getClass();
        str3.getClass();
        this.A = l;
        this.B = j;
        this.L = str;
        this.R = str2;
        this.X = str3;
        this.Y = z;
    }

    public final Cheat a() {
        return new Cheat(this.A, this.B, this.L, this.R, this.X, this.Y);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        Long l = this.A;
        if (l == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeLong(l.longValue());
        }
        parcel.writeLong(this.B);
        parcel.writeString(this.L);
        parcel.writeString(this.R);
        parcel.writeString(this.X);
        parcel.writeInt(this.Y ? 1 : 0);
    }
}

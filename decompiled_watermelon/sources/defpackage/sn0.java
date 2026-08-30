package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sn0  reason: default package */
/* loaded from: classes.dex */
public final class sn0 extends r {
    public static final Parcelable.Creator<sn0> CREATOR = new sj4(2);
    public boolean L;

    public sn0(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = parcel.readInt() == 1;
    }

    @Override // defpackage.r, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.L ? 1 : 0);
    }
}

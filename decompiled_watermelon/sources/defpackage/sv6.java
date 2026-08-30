package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sv6  reason: default package */
/* loaded from: classes.dex */
public final class sv6 extends r {
    public static final Parcelable.Creator<sv6> CREATOR = new sj4(6);
    public int L;
    public boolean R;

    public sv6(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        boolean z;
        this.L = parcel.readInt();
        if (parcel.readInt() != 0) {
            z = true;
        } else {
            z = false;
        }
        this.R = z;
    }

    @Override // defpackage.r, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.L);
        parcel.writeInt(this.R ? 1 : 0);
    }
}

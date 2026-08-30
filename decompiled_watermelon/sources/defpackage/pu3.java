package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pu3  reason: default package */
/* loaded from: classes.dex */
public final class pu3 extends r {
    public static final Parcelable.Creator<pu3> CREATOR = new wa6(3);
    public boolean L;

    public pu3(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        if (classLoader == null) {
            pu3.class.getClassLoader();
        }
        this.L = parcel.readInt() == 1;
    }

    @Override // defpackage.r, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.L ? 1 : 0);
    }
}

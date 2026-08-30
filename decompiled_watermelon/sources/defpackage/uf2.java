package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: uf2  reason: default package */
/* loaded from: classes.dex */
public final class uf2 implements Parcelable {
    public static final Parcelable.Creator<uf2> CREATOR = new sj4(3);
    public final Bundle A;

    public uf2(Parcel parcel, ClassLoader classLoader) {
        Bundle readBundle = parcel.readBundle();
        this.A = readBundle;
        if (classLoader != null && readBundle != null) {
            readBundle.setClassLoader(classLoader);
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeBundle(this.A);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: z65  reason: default package */
/* loaded from: classes.dex */
public final class z65 extends r {
    public static final Parcelable.Creator<z65> CREATOR = new sj4(4);
    public Parcelable L;

    public z65(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = parcel.readParcelable(classLoader == null ? q65.class.getClassLoader() : classLoader);
    }

    @Override // defpackage.r, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.L, 0);
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: jx5  reason: default package */
/* loaded from: classes.dex */
public final class jx5 extends r {
    public static final Parcelable.Creator<jx5> CREATOR = new wa6(4);
    public boolean L;

    public jx5(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        this.L = ((Boolean) parcel.readValue(null)).booleanValue();
    }

    public final String toString() {
        return "SearchView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " isIconified=" + this.L + "}";
    }

    @Override // defpackage.r, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeValue(Boolean.valueOf(this.L));
    }
}

package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: b21  reason: default package */
/* loaded from: classes.dex */
public final class b21 extends r {
    public static final Parcelable.Creator<b21> CREATOR = new wa6(2);
    public SparseArray L;

    public b21(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.L = new SparseArray(readInt);
        for (int i = 0; i < readInt; i++) {
            this.L.append(iArr[i], readParcelableArray[i]);
        }
    }

    @Override // defpackage.r, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        super.writeToParcel(parcel, i);
        SparseArray sparseArray = this.L;
        if (sparseArray != null) {
            i2 = sparseArray.size();
        } else {
            i2 = 0;
        }
        parcel.writeInt(i2);
        int[] iArr = new int[i2];
        Parcelable[] parcelableArr = new Parcelable[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            iArr[i3] = this.L.keyAt(i3);
            parcelableArr[i3] = (Parcelable) this.L.valueAt(i3);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i);
    }
}

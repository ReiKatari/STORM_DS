package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: j51  reason: default package */
/* loaded from: classes.dex */
public final class j51 extends s {
    public static final Parcelable.Creator<j51> CREATOR = new lm6(2);
    public SparseArray L;

    public j51(Parcel parcel, ClassLoader classLoader) {
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

    @Override // defpackage.s, android.os.Parcelable
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

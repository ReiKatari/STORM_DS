package k5;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import z2.o;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends i6.b {
    public static final Parcelable.Creator<f> CREATOR = new o(5);
    public SparseArray L;

    public f(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        int[] iArr = new int[readInt];
        parcel.readIntArray(iArr);
        Parcelable[] readParcelableArray = parcel.readParcelableArray(classLoader);
        this.L = new SparseArray(readInt);
        for (int i2 = 0; i2 < readInt; i2++) {
            this.L.append(iArr[i2], readParcelableArray[i2]);
        }
    }

    @Override // i6.b, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int i10;
        super.writeToParcel(parcel, i2);
        SparseArray sparseArray = this.L;
        if (sparseArray != null) {
            i10 = sparseArray.size();
        } else {
            i10 = 0;
        }
        parcel.writeInt(i10);
        int[] iArr = new int[i10];
        Parcelable[] parcelableArr = new Parcelable[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            iArr[i11] = this.L.keyAt(i11);
            parcelableArr[i11] = (Parcelable) this.L.valueAt(i11);
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelableArray(parcelableArr, i2);
    }
}

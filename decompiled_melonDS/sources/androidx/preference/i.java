package androidx.preference;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends m {
    public static final Parcelable.Creator<i> CREATOR = new a8.l(8);
    public HashSet A;

    public i(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.A = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.A, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        super.writeToParcel(parcel, i2);
        parcel.writeInt(this.A.size());
        HashSet hashSet = this.A;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public i() {
        super(AbsSavedState.EMPTY_STATE);
    }
}

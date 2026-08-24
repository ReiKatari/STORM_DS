package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z84  reason: default package */
/* loaded from: classes.dex */
public final class z84 extends v05 {
    public static final Parcelable.Creator<z84> CREATOR = new y8(21);
    public HashSet A;

    public z84(Parcel parcel) {
        super(parcel);
        int readInt = parcel.readInt();
        this.A = new HashSet();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Collections.addAll(this.A, strArr);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeInt(this.A.size());
        HashSet hashSet = this.A;
        parcel.writeStringArray((String[]) hashSet.toArray(new String[hashSet.size()]));
    }

    public z84() {
        super(AbsSavedState.EMPTY_STATE);
    }
}

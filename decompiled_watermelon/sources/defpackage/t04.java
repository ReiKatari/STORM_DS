package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
import java.util.Collections;
import java.util.HashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t04  reason: default package */
/* loaded from: classes.dex */
public final class t04 extends sr4 {
    public static final Parcelable.Creator<t04> CREATOR = new x8(21);
    public HashSet A;

    public t04(Parcel parcel) {
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

    public t04() {
        super(AbsSavedState.EMPTY_STATE);
    }
}

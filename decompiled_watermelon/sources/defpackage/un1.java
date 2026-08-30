package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbsSavedState;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: un1  reason: default package */
/* loaded from: classes.dex */
public final class un1 extends sr4 {
    public static final Parcelable.Creator<un1> CREATOR = new x8(10);
    public String A;

    public un1(Parcel parcel) {
        super(parcel);
        this.A = parcel.readString();
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A);
    }

    public un1() {
        super(AbsSavedState.EMPTY_STATE);
    }
}

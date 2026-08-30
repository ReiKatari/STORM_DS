package defpackage;

import android.os.Parcel;
import android.view.AbsSavedState;
import com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kk7  reason: default package */
/* loaded from: classes.dex */
public final class kk7 extends sr4 {
    public static final jk7 CREATOR = new Object();
    public MasterSwitchPreferenceAttrs A;

    public kk7(Parcel parcel) {
        super(parcel);
        this.A = (MasterSwitchPreferenceAttrs) hi2.Q(parcel, kk7.class.getClassLoader(), MasterSwitchPreferenceAttrs.class);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A, 0);
    }

    public kk7() {
        super(AbsSavedState.EMPTY_STATE);
    }
}

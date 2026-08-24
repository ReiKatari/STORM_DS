package defpackage;

import android.os.Parcel;
import android.view.AbsSavedState;
import com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cz7  reason: default package */
/* loaded from: classes.dex */
public final class cz7 extends v05 {
    public static final bz7 CREATOR = new Object();
    public MasterSwitchPreferenceAttrs A;

    public cz7(Parcel parcel) {
        super(parcel);
        this.A = (MasterSwitchPreferenceAttrs) xk2.H(parcel, cz7.class.getClassLoader(), MasterSwitchPreferenceAttrs.class);
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

    public cz7() {
        super(AbsSavedState.EMPTY_STATE);
    }
}

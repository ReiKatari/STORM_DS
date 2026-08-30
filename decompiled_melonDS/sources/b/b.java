package b;

import android.os.Parcel;
import android.view.AbsSavedState;
import androidx.preference.m;
import com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends m {
    public static final a CREATOR = new Object();
    public MasterSwitchPreferenceAttrs A;

    public b(Parcel parcel) {
        super(parcel);
        this.A = (MasterSwitchPreferenceAttrs) p7.a.v(parcel, b.class.getClassLoader(), MasterSwitchPreferenceAttrs.class);
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.view.AbsSavedState, android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.getClass();
        super.writeToParcel(parcel, i2);
        parcel.writeParcelable(this.A, 0);
    }

    public b() {
        super(AbsSavedState.EMPTY_STATE);
    }
}

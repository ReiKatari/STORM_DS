package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz7  reason: default package */
/* loaded from: classes.dex */
public final class dz7 implements Parcelable.Creator {
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        parcel.getClass();
        return new MasterSwitchPreferenceAttrs(parcel);
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        return new MasterSwitchPreferenceAttrs[i];
    }
}

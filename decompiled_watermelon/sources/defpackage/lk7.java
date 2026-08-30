package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.smp.masterswitchpreference.MasterSwitchPreferenceAttrs;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: lk7  reason: default package */
/* loaded from: classes.dex */
public final class lk7 implements Parcelable.Creator {
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

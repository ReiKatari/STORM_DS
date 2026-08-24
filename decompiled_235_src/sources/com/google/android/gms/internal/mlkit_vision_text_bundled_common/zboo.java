package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zboo extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zboo> CREATOR = new zbop();
    private final String zba;
    private final Rect zbb;
    private final List zbc;
    private final float zbd;
    private final float zbe;

    public zboo(String str, Rect rect, List list, float f, float f2) {
        this.zba = str;
        this.zbb = rect;
        this.zbc = list;
        this.zbd = f;
        this.zbe = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zba;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zbb, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeFloat(parcel, 4, this.zbd);
        SafeParcelWriter.writeFloat(parcel, 5, this.zbe);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.graphics.Rect;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zboi extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zboi> CREATOR = new zboj();
    private final String zba;
    private final Rect zbb;
    private final List zbc;
    private final String zbd;
    private final List zbe;
    private final float zbf;
    private final float zbg;

    public zboi(String str, Rect rect, List list, String str2, List list2, float f, float f2) {
        this.zba = str;
        this.zbb = rect;
        this.zbc = list;
        this.zbd = str2;
        this.zbe = list2;
        this.zbf = f;
        this.zbg = f2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zba;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeParcelable(parcel, 2, this.zbb, i, false);
        SafeParcelWriter.writeTypedList(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeString(parcel, 4, this.zbd, false);
        SafeParcelWriter.writeTypedList(parcel, 5, this.zbe, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.zbf);
        SafeParcelWriter.writeFloat(parcel, 7, this.zbg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final Rect zba() {
        return this.zbb;
    }

    public final String zbb() {
        return this.zbd;
    }

    public final String zbc() {
        return this.zba;
    }

    public final List zbd() {
        return this.zbc;
    }
}

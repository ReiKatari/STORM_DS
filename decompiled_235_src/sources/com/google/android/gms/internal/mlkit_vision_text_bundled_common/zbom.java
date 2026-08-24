package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbom extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbom> CREATOR = new zbon();
    private final String zba;
    private final String zbb;
    private final String zbc;
    private final boolean zbd;
    private final int zbe;
    private final String zbf;
    private final boolean zbg;

    public zbom(String str, String str2, String str3, boolean z, int i, String str4, boolean z2) {
        this.zba = str;
        this.zbb = str2;
        this.zbc = str3;
        this.zbf = str4;
        this.zbe = i;
        this.zbd = z;
        this.zbg = z2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        String str = this.zba;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeString(parcel, 1, str, false);
        SafeParcelWriter.writeString(parcel, 2, this.zbb, false);
        SafeParcelWriter.writeString(parcel, 3, this.zbc, false);
        SafeParcelWriter.writeBoolean(parcel, 4, this.zbd);
        SafeParcelWriter.writeInt(parcel, 5, this.zbe);
        SafeParcelWriter.writeString(parcel, 6, this.zbf, false);
        SafeParcelWriter.writeBoolean(parcel, 7, this.zbg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }

    public final String zba() {
        return this.zba;
    }

    public final String zbb() {
        return this.zbf;
    }

    public final String zbc() {
        return this.zbc;
    }

    public final boolean zbd() {
        return this.zbg;
    }
}

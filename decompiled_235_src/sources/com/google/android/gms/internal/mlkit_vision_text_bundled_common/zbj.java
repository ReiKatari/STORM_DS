package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbj extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbj> CREATOR = new zbk();
    public final zbh[] zba;
    public final zbd zbb;
    public final zbd zbc;
    public final String zbd;
    public final float zbe;
    public final String zbf;
    public final boolean zbg;

    public zbj(zbh[] zbhVarArr, zbd zbdVar, zbd zbdVar2, String str, float f, String str2, boolean z) {
        this.zba = zbhVarArr;
        this.zbb = zbdVar;
        this.zbc = zbdVar2;
        this.zbd = str;
        this.zbe = f;
        this.zbf = str2;
        this.zbg = z;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zbh[] zbhVarArr = this.zba;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, zbhVarArr, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zbb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zbc, i, false);
        SafeParcelWriter.writeString(parcel, 5, this.zbd, false);
        SafeParcelWriter.writeFloat(parcel, 6, this.zbe);
        SafeParcelWriter.writeString(parcel, 7, this.zbf, false);
        SafeParcelWriter.writeBoolean(parcel, 8, this.zbg);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

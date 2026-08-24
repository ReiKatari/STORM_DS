package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbf extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zbf> CREATOR = new zbg();
    public final zbj[] zba;
    public final zbd zbb;
    public final zbd zbc;
    public final zbd zbd;
    public final String zbe;
    public final float zbf;
    public final String zbg;
    public final int zbh;
    public final boolean zbi;
    public final int zbj;
    public final int zbk;

    public zbf(zbj[] zbjVarArr, zbd zbdVar, zbd zbdVar2, zbd zbdVar3, String str, float f, String str2, int i, boolean z, int i2, int i3) {
        this.zba = zbjVarArr;
        this.zbb = zbdVar;
        this.zbc = zbdVar2;
        this.zbd = zbdVar3;
        this.zbe = str;
        this.zbf = f;
        this.zbg = str2;
        this.zbh = i;
        this.zbi = z;
        this.zbj = i2;
        this.zbk = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        zbj[] zbjVarArr = this.zba;
        int beginObjectHeader = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeTypedArray(parcel, 2, zbjVarArr, i, false);
        SafeParcelWriter.writeParcelable(parcel, 3, this.zbb, i, false);
        SafeParcelWriter.writeParcelable(parcel, 4, this.zbc, i, false);
        SafeParcelWriter.writeParcelable(parcel, 5, this.zbd, i, false);
        SafeParcelWriter.writeString(parcel, 6, this.zbe, false);
        SafeParcelWriter.writeFloat(parcel, 7, this.zbf);
        SafeParcelWriter.writeString(parcel, 8, this.zbg, false);
        SafeParcelWriter.writeInt(parcel, 9, this.zbh);
        SafeParcelWriter.writeBoolean(parcel, 10, this.zbi);
        SafeParcelWriter.writeInt(parcel, 11, this.zbj);
        SafeParcelWriter.writeInt(parcel, 12, this.zbk);
        SafeParcelWriter.finishObjectHeader(parcel, beginObjectHeader);
    }
}

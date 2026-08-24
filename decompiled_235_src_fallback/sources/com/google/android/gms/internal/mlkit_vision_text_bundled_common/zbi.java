package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbi implements android.os.Parcelable.Creator {
    public zbi() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r2) {
            r1 = this;
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r2)
        L4:
            int r0 = r2.dataPosition()
            if (r0 >= r1) goto L15
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r2, r0)
            goto L4
        L15:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r2, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh
            r1.<init>()
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh[] r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh[r1]
            return r0
    }
}

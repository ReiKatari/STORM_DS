package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbk implements android.os.Parcelable.Creator {
    public zbk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r12) {
            r11 = this;
            int r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r12)
            r0 = 0
            r1 = 0
            r2 = 0
            r10 = r0
            r4 = r1
            r5 = r4
            r6 = r5
            r7 = r6
            r9 = r7
            r8 = r2
        Le:
            int r0 = r12.dataPosition()
            if (r0 >= r11) goto L55
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r12)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            switch(r1) {
                case 2: goto L4b;
                case 3: goto L41;
                case 4: goto L37;
                case 5: goto L32;
                case 6: goto L2d;
                case 7: goto L28;
                case 8: goto L23;
                default: goto L1f;
            }
        L1f:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r12, r0)
            goto Le
        L23:
            boolean r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r12, r0)
            goto Le
        L28:
            java.lang.String r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r0)
            goto Le
        L2d:
            float r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r12, r0)
            goto Le
        L32:
            java.lang.String r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r12, r0)
            goto Le
        L37:
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r0, r1)
            r6 = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd) r6
            goto Le
        L41:
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r12, r0, r1)
            r5 = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r5 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd) r5
            goto Le
        L4b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh.CREATOR
            java.lang.Object[] r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r12, r0, r1)
            r4 = r0
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh[] r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbh[]) r4
            goto Le
        L55:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r12, r11)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj r3 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj
            r3.<init>(r4, r5, r6, r7, r8, r9, r10)
            return r3
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj[] r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj[r1]
            return r0
    }
}

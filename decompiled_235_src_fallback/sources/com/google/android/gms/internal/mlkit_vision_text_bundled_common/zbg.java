package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbg implements android.os.Parcelable.Creator {
    public zbg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r18) {
            r17 = this;
            r0 = r18
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r0)
            r2 = 0
            r3 = 0
            r4 = 0
            r13 = r2
            r14 = r13
            r15 = r14
            r16 = r15
            r6 = r3
            r7 = r6
            r8 = r7
            r9 = r8
            r10 = r9
            r12 = r10
            r11 = r4
        L15:
            int r2 = r0.dataPosition()
            if (r2 >= r1) goto L75
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r0)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            switch(r3) {
                case 2: goto L6b;
                case 3: goto L61;
                case 4: goto L57;
                case 5: goto L4d;
                case 6: goto L48;
                case 7: goto L43;
                case 8: goto L3e;
                case 9: goto L39;
                case 10: goto L34;
                case 11: goto L2f;
                case 12: goto L2a;
                default: goto L26;
            }
        L26:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r0, r2)
            goto L15
        L2a:
            int r16 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L15
        L2f:
            int r15 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L15
        L34:
            boolean r14 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r0, r2)
            goto L15
        L39:
            int r13 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r0, r2)
            goto L15
        L3e:
            java.lang.String r12 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L15
        L43:
            float r11 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r0, r2)
            goto L15
        L48:
            java.lang.String r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r0, r2)
            goto L15
        L4d:
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd> r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r9 = r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r9 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd) r9
            goto L15
        L57:
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd> r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r8 = r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r8 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd) r8
            goto L15
        L61:
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd> r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd.CREATOR
            android.os.Parcelable r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r0, r2, r3)
            r7 = r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd r7 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbd) r7
            goto L15
        L6b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj> r3 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj.CREATOR
            java.lang.Object[] r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r0, r2, r3)
            r6 = r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj[] r6 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbj[]) r6
            goto L15
        L75:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r0, r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf r5 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            return r5
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf[] r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf[r1]
            return r0
    }
}

package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbon implements android.os.Parcelable.Creator {
    public zbon() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r11)
            r0 = 0
            r1 = 0
            r6 = r0
            r7 = r6
            r9 = r7
            r3 = r1
            r4 = r3
            r5 = r4
            r8 = r5
        Ld:
            int r0 = r11.dataPosition()
            if (r0 >= r10) goto L45
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            switch(r1) {
                case 1: goto L40;
                case 2: goto L3b;
                case 3: goto L36;
                case 4: goto L31;
                case 5: goto L2c;
                case 6: goto L27;
                case 7: goto L22;
                default: goto L1e;
            }
        L1e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r0)
            goto Ld
        L22:
            boolean r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r11, r0)
            goto Ld
        L27:
            java.lang.String r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r11, r0)
            goto Ld
        L2c:
            int r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r11, r0)
            goto Ld
        L31:
            boolean r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readBoolean(r11, r0)
            goto Ld
        L36:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r11, r0)
            goto Ld
        L3b:
            java.lang.String r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r11, r0)
            goto Ld
        L40:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r11, r0)
            goto Ld
        L45:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r10)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom r2 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom[] r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbom[r1]
            return r0
    }
}

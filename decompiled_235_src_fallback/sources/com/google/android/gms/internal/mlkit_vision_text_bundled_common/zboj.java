package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zboj implements android.os.Parcelable.Creator {
    public zboj() {
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
            r8 = r0
            r9 = r8
            r3 = r1
            r4 = r3
            r5 = r4
            r6 = r5
            r7 = r6
        Ld:
            int r0 = r11.dataPosition()
            if (r0 >= r10) goto L4e
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            switch(r1) {
                case 1: goto L49;
                case 2: goto L3f;
                case 3: goto L38;
                case 4: goto L33;
                case 5: goto L2c;
                case 6: goto L27;
                case 7: goto L22;
                default: goto L1e;
            }
        L1e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r0)
            goto Ld
        L22:
            float r9 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r11, r0)
            goto Ld
        L27:
            float r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r11, r0)
            goto Ld
        L2c:
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbog> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbog.CREATOR
            java.util.ArrayList r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r11, r0, r1)
            goto Ld
        L33:
            java.lang.String r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r11, r0)
            goto Ld
        L38:
            android.os.Parcelable$Creator r1 = android.graphics.Point.CREATOR
            java.util.ArrayList r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r11, r0, r1)
            goto Ld
        L3f:
            android.os.Parcelable$Creator r1 = android.graphics.Rect.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r11, r0, r1)
            r4 = r0
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            goto Ld
        L49:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r11, r0)
            goto Ld
        L4e:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r10)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi r2 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return r2
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi[] r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi[r1]
            return r0
    }
}

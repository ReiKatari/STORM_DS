package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbof implements android.os.Parcelable.Creator {
    public zbof() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r0 = 0
            r2 = r0
            r3 = r2
            r4 = r3
            r5 = r4
            r6 = r5
        La:
            int r0 = r9.dataPosition()
            if (r0 >= r8) goto L4d
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            r7 = 1
            if (r1 == r7) goto L48
            r7 = 2
            if (r1 == r7) goto L3e
            r7 = 3
            if (r1 == r7) goto L37
            r7 = 4
            if (r1 == r7) goto L32
            r7 = 5
            if (r1 == r7) goto L2b
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r0)
            goto La
        L2b:
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi> r1 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboi.CREATOR
            java.util.ArrayList r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r9, r0, r1)
            goto La
        L32:
            java.lang.String r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r9, r0)
            goto La
        L37:
            android.os.Parcelable$Creator r1 = android.graphics.Point.CREATOR
            java.util.ArrayList r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r9, r0, r1)
            goto La
        L3e:
            android.os.Parcelable$Creator r1 = android.graphics.Rect.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r0, r1)
            r3 = r0
            android.graphics.Rect r3 = (android.graphics.Rect) r3
            goto La
        L48:
            java.lang.String r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r9, r0)
            goto La
        L4d:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r8)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe r1 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe
            r1.<init>(r2, r3, r4, r5, r6)
            return r1
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe[] r0 = new com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboe[r1]
            return r0
    }
}

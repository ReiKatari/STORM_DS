package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzvk implements android.os.Parcelable.Creator {
    public zzvk() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r9) {
            r8 = this;
            int r8 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r9)
            r0 = 0
            r1 = 0
            r6 = r0
            r7 = r6
            r3 = r1
            r4 = r3
            r5 = r4
        Lb:
            int r0 = r9.dataPosition()
            if (r0 >= r8) goto L4c
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            r2 = 1
            if (r1 == r2) goto L47
            r2 = 2
            if (r1 == r2) goto L3d
            r2 = 3
            if (r1 == r2) goto L36
            r2 = 4
            if (r1 == r2) goto L31
            r2 = 5
            if (r1 == r2) goto L2c
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r0)
            goto Lb
        L2c:
            float r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r9, r0)
            goto Lb
        L31:
            float r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readFloat(r9, r0)
            goto Lb
        L36:
            android.os.Parcelable$Creator r1 = android.graphics.Point.CREATOR
            java.util.ArrayList r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r9, r0, r1)
            goto Lb
        L3d:
            android.os.Parcelable$Creator r1 = android.graphics.Rect.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r9, r0, r1)
            r4 = r0
            android.graphics.Rect r4 = (android.graphics.Rect) r4
            goto Lb
        L47:
            java.lang.String r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r9, r0)
            goto Lb
        L4c:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r8)
            com.google.android.gms.internal.mlkit_vision_text_common.zzvj r2 = new com.google.android.gms.internal.mlkit_vision_text_common.zzvj
            r2.<init>(r3, r4, r5, r6, r7)
            return r2
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzvj[] r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzvj[r1]
            return r0
    }
}

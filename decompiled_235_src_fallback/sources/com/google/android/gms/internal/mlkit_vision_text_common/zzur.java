package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzur implements android.os.Parcelable.Creator {
    public zzur() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r11) {
            r10 = this;
            int r10 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r11)
            r0 = 0
            r2 = 0
            r8 = r0
            r4 = r2
            r5 = r4
            r6 = r5
            r7 = r6
        Lc:
            int r0 = r11.dataPosition()
            if (r0 >= r10) goto L4b
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r11)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            r2 = 1
            if (r1 == r2) goto L45
            r2 = 2
            if (r1 == r2) goto L3f
            r2 = 3
            if (r1 == r2) goto L39
            r2 = 4
            if (r1 == r2) goto L33
            r2 = 5
            if (r1 == r2) goto L2d
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r11, r0)
            goto Lc
        L2d:
            long r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readLong(r11, r0)
            r8 = r0
            goto Lc
        L33:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r11, r0)
            r7 = r0
            goto Lc
        L39:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r11, r0)
            r6 = r0
            goto Lc
        L3f:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r11, r0)
            r5 = r0
            goto Lc
        L45:
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r11, r0)
            r4 = r0
            goto Lc
        L4b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r11, r10)
            com.google.android.gms.internal.mlkit_vision_text_common.zzuq r3 = new com.google.android.gms.internal.mlkit_vision_text_common.zzuq
            r3.<init>(r4, r5, r6, r7, r8)
            return r3
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzuq[] r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzuq[r1]
            return r0
    }
}

package com.google.android.gms.internal.mlkit_vision_text_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzvg implements android.os.Parcelable.Creator {
    public zzvg() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r6) {
            r5 = this;
            int r5 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r6)
            r0 = 0
            r1 = r0
        L6:
            int r2 = r6.dataPosition()
            if (r2 >= r5) goto L2a
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r6)
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r2)
            r4 = 1
            if (r3 == r4) goto L25
            r4 = 2
            if (r3 == r4) goto L1e
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r6, r2)
            goto L6
        L1e:
            android.os.Parcelable$Creator<com.google.android.gms.internal.mlkit_vision_text_common.zzuz> r1 = com.google.android.gms.internal.mlkit_vision_text_common.zzuz.CREATOR
            java.util.ArrayList r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedList(r6, r2, r1)
            goto L6
        L25:
            java.lang.String r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createString(r6, r2)
            goto L6
        L2a:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r6, r5)
            com.google.android.gms.internal.mlkit_vision_text_common.zzvf r5 = new com.google.android.gms.internal.mlkit_vision_text_common.zzvf
            r5.<init>(r0, r1)
            return r5
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.internal.mlkit_vision_text_common.zzvf[] r0 = new com.google.android.gms.internal.mlkit_vision_text_common.zzvf[r1]
            return r0
    }
}

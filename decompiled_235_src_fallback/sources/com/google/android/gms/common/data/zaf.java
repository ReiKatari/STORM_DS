package com.google.android.gms.common.data;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaf implements android.os.Parcelable.Creator {
    public zaf() {
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
            r4 = r0
            r5 = r4
            r7 = r5
            r3 = r1
            r6 = r3
        Lb:
            int r0 = r9.dataPosition()
            if (r0 >= r8) goto L4b
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r9)
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r0)
            r2 = 1
            if (r1 == r2) goto L46
            r2 = 2
            if (r1 == r2) goto L3c
            r2 = 3
            if (r1 == r2) goto L37
            r2 = 4
            if (r1 == r2) goto L32
            r2 = 1000(0x3e8, float:1.401E-42)
            if (r1 == r2) goto L2d
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r9, r0)
            goto Lb
        L2d:
            int r3 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r0)
            goto Lb
        L32:
            android.os.Bundle r7 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createBundle(r9, r0)
            goto Lb
        L37:
            int r6 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readInt(r9, r0)
            goto Lb
        L3c:
            android.os.Parcelable$Creator r1 = android.database.CursorWindow.CREATOR
            java.lang.Object[] r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createTypedArray(r9, r0, r1)
            r5 = r0
            android.database.CursorWindow[] r5 = (android.database.CursorWindow[]) r5
            goto Lb
        L46:
            java.lang.String[] r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createStringArray(r9, r0)
            goto Lb
        L4b:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r9, r8)
            com.google.android.gms.common.data.DataHolder r2 = new com.google.android.gms.common.data.DataHolder
            r2.<init>(r3, r4, r5, r6, r7)
            r2.zad()
            return r2
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.data.DataHolder[] r0 = new com.google.android.gms.common.data.DataHolder[r1]
            return r0
    }
}

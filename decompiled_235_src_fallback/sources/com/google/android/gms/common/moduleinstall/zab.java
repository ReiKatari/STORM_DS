package com.google.android.gms.common.moduleinstall;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zab implements android.os.Parcelable.Creator {
    public zab() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ java.lang.Object createFromParcel(android.os.Parcel r5) {
            r4 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.validateObjectHeader(r5)
            r0 = 0
        L5:
            int r1 = r5.dataPosition()
            if (r1 >= r4) goto L23
            int r1 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.readHeader(r5)
            int r2 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.getFieldId(r1)
            r3 = 1
            if (r2 == r3) goto L1a
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.skipUnknownField(r5, r1)
            goto L5
        L1a:
            android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelReader.createParcelable(r5, r1, r0)
            android.app.PendingIntent r0 = (android.app.PendingIntent) r0
            goto L5
        L23:
            com.google.android.gms.common.internal.safeparcel.SafeParcelReader.ensureAtEnd(r5, r4)
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse r4 = new com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse
            r4.<init>(r0)
            return r4
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ java.lang.Object[] newArray(int r1) {
            r0 = this;
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse[] r0 = new com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse[r1]
            return r0
    }
}

package com.google.android.gms.common.moduleinstall;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModuleInstallIntentResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> CREATOR = null;
    private final android.app.PendingIntent zaa;

    static {
            com.google.android.gms.common.moduleinstall.zab r0 = new com.google.android.gms.common.moduleinstall.zab
            r0.<init>()
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse.CREATOR = r0
            return
    }

    public ModuleInstallIntentResponse(android.app.PendingIntent r1) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            return
    }

    public android.app.PendingIntent getPendingIntent() {
            r0 = this;
            android.app.PendingIntent r0 = r0.zaa
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r4, int r5) {
            r3 = this;
            int r0 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r4)
            android.app.PendingIntent r3 = r3.getPendingIntent()
            r1 = 0
            r2 = 1
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeParcelable(r4, r2, r3, r5, r1)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r4, r0)
            return
    }
}

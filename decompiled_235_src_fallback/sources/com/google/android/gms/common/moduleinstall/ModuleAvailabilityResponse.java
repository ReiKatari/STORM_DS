package com.google.android.gms.common.moduleinstall;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModuleAvailabilityResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> CREATOR = null;
    private final boolean zaa;
    private final int zab;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.CLASS)
    /* loaded from: classes.dex */
    public @interface AvailabilityStatus {
        public static final int STATUS_ALREADY_AVAILABLE = 0;
        public static final int STATUS_READY_TO_DOWNLOAD = 1;
        public static final int STATUS_UNKNOWN_MODULE = 2;
    }

    static {
            com.google.android.gms.common.moduleinstall.zaa r0 = new com.google.android.gms.common.moduleinstall.zaa
            r0.<init>()
            com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse.CREATOR = r0
            return
    }

    public ModuleAvailabilityResponse(boolean r1, int r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    public boolean areModulesAvailable() {
            r0 = this;
            boolean r0 = r0.zaa
            return r0
    }

    public int getAvailabilityStatus() {
            r0 = this;
            int r0 = r0.zab
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r0 = 1
            boolean r1 = r2.areModulesAvailable()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r0, r1)
            r0 = 2
            int r2 = r2.getAvailabilityStatus()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }
}

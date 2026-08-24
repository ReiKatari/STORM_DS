package com.google.android.gms.common.moduleinstall;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModuleInstallResponse extends com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable {
    public static final android.os.Parcelable.Creator<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> CREATOR = null;
    private final int zaa;
    private final boolean zab;

    static {
            com.google.android.gms.common.moduleinstall.zad r0 = new com.google.android.gms.common.moduleinstall.zad
            r0.<init>()
            com.google.android.gms.common.moduleinstall.ModuleInstallResponse.CREATOR = r0
            return
    }

    public ModuleInstallResponse(int r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public ModuleInstallResponse(int r1, boolean r2) {
            r0 = this;
            r0.<init>()
            r0.zaa = r1
            r0.zab = r2
            return
    }

    public boolean areModulesAlreadyInstalled() {
            r0 = this;
            int r0 = r0.zaa
            if (r0 != 0) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    public int getSessionId() {
            r0 = this;
            int r0 = r0.zaa
            return r0
    }

    @Override // android.os.Parcelable
    public void writeToParcel(android.os.Parcel r3, int r4) {
            r2 = this;
            int r4 = com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.beginObjectHeader(r3)
            r0 = 1
            int r1 = r2.getSessionId()
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeInt(r3, r0, r1)
            r0 = 2
            boolean r2 = r2.zab
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.writeBoolean(r3, r0, r2)
            com.google.android.gms.common.internal.safeparcel.SafeParcelWriter.finishObjectHeader(r3, r4)
            return
    }

    public final boolean zaa() {
            r0 = this;
            boolean r0 = r0.zab
            return r0
    }
}

package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zag extends defpackage.hz7 implements com.google.android.gms.common.moduleinstall.internal.zah {
    public zag() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener"
            r1.<init>(r0)
            return
    }

    @Override // defpackage.hz7
    public final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r3 = 1
            if (r1 != r3) goto L12
            android.os.Parcelable$Creator<com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate> r1 = com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate.CREATOR
            android.os.Parcelable r1 = defpackage.kz7.a(r2, r1)
            com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate r1 = (com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate) r1
            defpackage.kz7.b(r2)
            r0.zab(r1)
            return r3
        L12:
            r0 = 0
            return r0
    }
}

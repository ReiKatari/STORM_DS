package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zad extends defpackage.hz7 implements com.google.android.gms.common.moduleinstall.internal.zae {
    public zad() {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks"
            r1.<init>(r0)
            return
    }

    @Override // defpackage.hz7
    public final boolean zaa(int r1, android.os.Parcel r2, android.os.Parcel r3, int r4) {
            r0 = this;
            r3 = 1
            if (r1 == r3) goto L4b
            r4 = 2
            if (r1 == r4) goto L34
            r4 = 3
            if (r1 == r4) goto L1d
            r4 = 4
            if (r1 == r4) goto Le
            r0 = 0
            return r0
        Le:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = defpackage.kz7.a(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            defpackage.kz7.b(r2)
            r0.zab(r1)
            goto L61
        L1d:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = defpackage.kz7.a(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator<com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse> r4 = com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse.CREATOR
            android.os.Parcelable r4 = defpackage.kz7.a(r2, r4)
            com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse r4 = (com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse) r4
            defpackage.kz7.b(r2)
            r0.zac(r1, r4)
            goto L61
        L34:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = defpackage.kz7.a(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator<com.google.android.gms.common.moduleinstall.ModuleInstallResponse> r4 = com.google.android.gms.common.moduleinstall.ModuleInstallResponse.CREATOR
            android.os.Parcelable r4 = defpackage.kz7.a(r2, r4)
            com.google.android.gms.common.moduleinstall.ModuleInstallResponse r4 = (com.google.android.gms.common.moduleinstall.ModuleInstallResponse) r4
            defpackage.kz7.b(r2)
            r0.zad(r1, r4)
            goto L61
        L4b:
            android.os.Parcelable$Creator<com.google.android.gms.common.api.Status> r1 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = defpackage.kz7.a(r2, r1)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            android.os.Parcelable$Creator<com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse> r4 = com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse.CREATOR
            android.os.Parcelable r4 = defpackage.kz7.a(r2, r4)
            com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse r4 = (com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse) r4
            defpackage.kz7.b(r2)
            r0.zae(r1, r4)
        L61:
            return r3
    }
}

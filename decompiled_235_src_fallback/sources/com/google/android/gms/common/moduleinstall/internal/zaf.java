package com.google.android.gms.common.moduleinstall.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaf extends defpackage.gz7 implements android.os.IInterface {
    public zaf(android.os.IBinder r2) {
            r1 = this;
            java.lang.String r0 = "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService"
            r1.<init>(r2, r0)
            return
    }

    public final void zae(com.google.android.gms.common.moduleinstall.internal.zae r2, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r3) {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            defpackage.kz7.d(r0, r2)
            defpackage.kz7.c(r0, r3)
            r2 = 1
            r1.zac(r2, r0)
            return
    }

    public final void zaf(com.google.android.gms.common.moduleinstall.internal.zae r2, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r3) {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            defpackage.kz7.d(r0, r2)
            defpackage.kz7.c(r0, r3)
            r2 = 3
            r1.zac(r2, r0)
            return
    }

    public final void zag(com.google.android.gms.common.moduleinstall.internal.zae r2, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r3, com.google.android.gms.common.moduleinstall.internal.zah r4) {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            defpackage.kz7.d(r0, r2)
            defpackage.kz7.c(r0, r3)
            defpackage.kz7.d(r0, r4)
            r2 = 2
            r1.zac(r2, r0)
            return
    }

    public final void zah(com.google.android.gms.common.api.internal.IStatusCallback r2, com.google.android.gms.common.moduleinstall.internal.ApiFeatureRequest r3) {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            defpackage.kz7.d(r0, r2)
            defpackage.kz7.c(r0, r3)
            r2 = 4
            r1.zac(r2, r0)
            return
    }

    public final void zai(com.google.android.gms.common.api.internal.IStatusCallback r2, com.google.android.gms.common.moduleinstall.internal.zah r3) {
            r1 = this;
            android.os.Parcel r0 = r1.zaa()
            defpackage.kz7.d(r0, r2)
            defpackage.kz7.d(r0, r3)
            r2 = 6
            r1.zac(r2, r0)
            return
    }
}

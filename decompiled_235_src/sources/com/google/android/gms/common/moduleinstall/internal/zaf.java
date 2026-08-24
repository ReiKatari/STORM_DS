package com.google.android.gms.common.moduleinstall.internal;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.internal.IStatusCallback;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zaf extends gz7 implements IInterface {
    public zaf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.moduleinstall.internal.IModuleInstallService");
    }

    public final void zae(zae zaeVar, ApiFeatureRequest apiFeatureRequest) {
        Parcel zaa = zaa();
        kz7.d(zaa, zaeVar);
        kz7.c(zaa, apiFeatureRequest);
        zac(1, zaa);
    }

    public final void zaf(zae zaeVar, ApiFeatureRequest apiFeatureRequest) {
        Parcel zaa = zaa();
        kz7.d(zaa, zaeVar);
        kz7.c(zaa, apiFeatureRequest);
        zac(3, zaa);
    }

    public final void zag(zae zaeVar, ApiFeatureRequest apiFeatureRequest, zah zahVar) {
        Parcel zaa = zaa();
        kz7.d(zaa, zaeVar);
        kz7.c(zaa, apiFeatureRequest);
        kz7.d(zaa, zahVar);
        zac(2, zaa);
    }

    public final void zah(IStatusCallback iStatusCallback, ApiFeatureRequest apiFeatureRequest) {
        Parcel zaa = zaa();
        kz7.d(zaa, iStatusCallback);
        kz7.c(zaa, apiFeatureRequest);
        zac(4, zaa);
    }

    public final void zai(IStatusCallback iStatusCallback, zah zahVar) {
        Parcel zaa = zaa();
        kz7.d(zaa, iStatusCallback);
        kz7.d(zaa, zahVar);
        zac(6, zaa);
    }
}

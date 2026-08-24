package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zad extends hz7 implements zae {
    public zad() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallCallbacks");
    }

    @Override // defpackage.hz7
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return false;
                    }
                    kz7.b(parcel);
                    zab((Status) kz7.a(parcel, Status.CREATOR));
                } else {
                    kz7.b(parcel);
                    zac((Status) kz7.a(parcel, Status.CREATOR), (ModuleInstallIntentResponse) kz7.a(parcel, ModuleInstallIntentResponse.CREATOR));
                }
            } else {
                kz7.b(parcel);
                zad((Status) kz7.a(parcel, Status.CREATOR), (ModuleInstallResponse) kz7.a(parcel, ModuleInstallResponse.CREATOR));
            }
        } else {
            kz7.b(parcel);
            zae((Status) kz7.a(parcel, Status.CREATOR), (ModuleAvailabilityResponse) kz7.a(parcel, ModuleAvailabilityResponse.CREATOR));
        }
        return true;
    }
}

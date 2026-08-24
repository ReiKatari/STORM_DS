package com.google.android.gms.common.moduleinstall.internal;

import android.os.IInterface;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallIntentResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public interface zae extends IInterface {
    void zab(Status status);

    void zac(Status status, ModuleInstallIntentResponse moduleInstallIntentResponse);

    void zad(Status status, ModuleInstallResponse moduleInstallResponse);

    void zae(Status status, ModuleAvailabilityResponse moduleAvailabilityResponse);
}

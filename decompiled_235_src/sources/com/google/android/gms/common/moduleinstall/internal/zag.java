package com.google.android.gms.common.moduleinstall.internal;

import android.os.Parcel;
import com.google.android.gms.common.moduleinstall.ModuleInstallStatusUpdate;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zag extends hz7 implements zah {
    public zag() {
        super("com.google.android.gms.common.moduleinstall.internal.IModuleInstallStatusListener");
    }

    @Override // defpackage.hz7
    public final boolean zaa(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i == 1) {
            kz7.b(parcel);
            zab((ModuleInstallStatusUpdate) kz7.a(parcel, ModuleInstallStatusUpdate.CREATOR));
            return true;
        }
        return false;
    }
}

package com.google.android.gms.common.moduleinstall;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.moduleinstall.internal.zay;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class ModuleInstall {
    private ModuleInstall() {
    }

    public static ModuleInstallClient getClient(Activity activity) {
        return new zay(activity);
    }

    public static ModuleInstallClient getClient(Context context) {
        return new zay(context);
    }
}

package com.google.mlkit.vision.text.pipeline;

import android.os.RemoteException;
import com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class zbo {
    public static zbo zbc(int i, RemoteException remoteException) {
        return new zbb(i, zbki.zbe(remoteException));
    }

    public abstract int zba();

    public abstract zbki zbb();

    public final boolean zbd() {
        if (!zbb().zbc()) {
            return true;
        }
        return false;
    }
}

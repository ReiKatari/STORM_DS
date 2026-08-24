package com.google.android.gms.internal.mlkit_vision_text_bundled_common;

import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbvu {
    public static final /* synthetic */ int zba = 0;
    private static final zbvu zbb = new zbvu();
    private final ConcurrentMap zbd = new ConcurrentHashMap();
    private final zbvy zbc = new zbvd();

    private zbvu() {
    }

    public static zbvu zba() {
        return zbb;
    }

    public final zbvx zbb(Class cls) {
        zbuo.zbc(cls, "messageType");
        zbvx zbvxVar = (zbvx) this.zbd.get(cls);
        if (zbvxVar == null) {
            zbvx zba2 = this.zbc.zba(cls);
            zbuo.zbc(cls, "messageType");
            zbvx zbvxVar2 = (zbvx) this.zbd.putIfAbsent(cls, zba2);
            if (zbvxVar2 == null) {
                return zba2;
            }
            return zbvxVar2;
        }
        return zbvxVar;
    }
}

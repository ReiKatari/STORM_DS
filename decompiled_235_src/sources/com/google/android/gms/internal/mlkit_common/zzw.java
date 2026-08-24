package com.google.android.gms.internal.mlkit_common;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzw {
    public static void zza(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 != null) {
                return;
            }
            u34.x(lb1.A("null value in entry: ", obj.toString(), "=null"));
            return;
        }
        u34.x("null key in entry: null=".concat(String.valueOf(obj2)));
    }
}

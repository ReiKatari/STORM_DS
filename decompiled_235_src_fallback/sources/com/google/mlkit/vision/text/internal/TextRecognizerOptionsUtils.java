package com.google.mlkit.vision.text.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class TextRecognizerOptionsUtils {
    private TextRecognizerOptionsUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static boolean isThickClient(java.util.concurrent.atomic.AtomicReference<java.lang.Boolean> r1, java.lang.String r2) {
            java.lang.Object r0 = r1.get()
            if (r0 == 0) goto L11
            java.lang.Object r1 = r1.get()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            boolean r1 = r1.booleanValue()
            return r1
        L11:
            com.google.mlkit.common.sdkinternal.MlKitContext r0 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            android.content.Context r0 = r0.getApplicationContext()
            int r2 = com.google.android.gms.dynamite.DynamiteModule.getLocalVersion(r0, r2)
            if (r2 <= 0) goto L21
            r2 = 1
            goto L22
        L21:
            r2 = 0
        L22:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            r1.set(r0)
            return r2
    }
}

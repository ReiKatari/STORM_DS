package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwo implements java.security.PrivilegedExceptionAction {
    public zbwo() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // java.security.PrivilegedExceptionAction
    public final /* bridge */ /* synthetic */ java.lang.Object run() {
            r6 = this;
            java.lang.Class<sun.misc.Unsafe> r6 = sun.misc.Unsafe.class
            java.lang.reflect.Field[] r0 = r6.getDeclaredFields()
            int r1 = r0.length
            r2 = 0
        L8:
            r3 = 0
            if (r2 >= r1) goto L25
            r4 = r0[r2]
            r5 = 1
            r4.setAccessible(r5)
            java.lang.Object r3 = r4.get(r3)
            boolean r4 = r6.isInstance(r3)
            if (r4 == 0) goto L22
            java.lang.Object r6 = r6.cast(r3)
            sun.misc.Unsafe r6 = (sun.misc.Unsafe) r6
            return r6
        L22:
            int r2 = r2 + 1
            goto L8
        L25:
            return r3
    }
}

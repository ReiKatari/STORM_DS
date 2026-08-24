package com.google.android.gms.dynamite;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zzc extends dalvik.system.PathClassLoader {
    public zzc(java.lang.String r1, java.lang.ClassLoader r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    @Override // java.lang.ClassLoader
    public final java.lang.Class loadClass(java.lang.String r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "java."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L15
            java.lang.String r0 = "android."
            boolean r0 = r2.startsWith(r0)
            if (r0 != 0) goto L15
            java.lang.Class r1 = r1.findClass(r2)     // Catch: java.lang.ClassNotFoundException -> L15
            return r1
        L15:
            java.lang.Class r1 = super.loadClass(r2, r3)
            return r1
    }
}

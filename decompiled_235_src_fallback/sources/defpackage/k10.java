package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k10  reason: default package */
/* loaded from: classes.dex */
public final class k10 {
    public final android.content.Context a;

    public k10(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public final java.io.File a(defpackage.n00 r3) {
            r2 = this;
            android.content.Context r2 = r2.a
            java.io.File r2 = r2.getExternalCacheDir()
            if (r2 == 0) goto L27
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "background_thumbnails"
            r0.<init>(r2, r1)
            boolean r2 = r0.isDirectory()
            if (r2 != 0) goto L1b
            boolean r2 = r0.mkdirs()
            if (r2 == 0) goto L27
        L1b:
            java.io.File r2 = new java.io.File
            java.util.UUID r3 = r3.a
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r2.<init>(r0, r3)
            return r2
        L27:
            r2 = 0
            return r2
    }
}

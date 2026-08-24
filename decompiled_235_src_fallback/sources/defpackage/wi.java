package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wi  reason: default package */
/* loaded from: classes.dex */
public final class wi {
    public final defpackage.kh a;
    public final java.io.File b;

    public wi(defpackage.kh r2, android.content.Context r3) {
            r1 = this;
            r2.getClass()
            r1.<init>()
            r1.a = r2
            java.io.File r2 = new java.io.File
            java.io.File r3 = r3.getNoBackupFilesDir()
            java.lang.String r0 = "ra_offline/prefetch"
            r2.<init>(r3, r0)
            r1.b = r2
            return
    }

    public final java.io.File a(java.lang.String r2, java.lang.String r3) {
            r1 = this;
            java.io.File r0 = new java.io.File
            byte[] r2 = defpackage.xs6.X(r2)
            java.lang.String r2 = defpackage.yh2.L(r2)
            java.io.File r1 = r1.b
            r0.<init>(r1, r2)
            java.io.File r1 = new java.io.File
            byte[] r2 = defpackage.xs6.X(r3)
            java.lang.String r2 = defpackage.yh2.L(r2)
            java.lang.String r3 = ".pb"
            java.lang.String r2 = r2.concat(r3)
            r1.<init>(r0, r2)
            return r1
    }
}

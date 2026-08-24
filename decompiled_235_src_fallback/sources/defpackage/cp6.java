package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cp6  reason: default package */
/* loaded from: classes.dex */
public final class cp6 implements defpackage.uh7 {
    @Override // defpackage.uh7
    public final defpackage.zl1 a(android.net.Uri r1) {
            r0 = this;
            r1.getClass()
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L14
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            vd5 r0 = new vd5
            r0.<init>(r1)
            return r0
        L14:
            r0 = 0
            return r0
    }

    @Override // defpackage.uh7
    public final defpackage.zl1 b(android.net.Uri r1) {
            r0 = this;
            r1.getClass()
            zl1 r0 = r0.a(r1)
            return r0
    }

    @Override // defpackage.uh7
    public final defpackage.zl1 c(android.net.Uri r2) {
            r1 = this;
            java.lang.String r1 = r2.getPath()
            if (r1 == 0) goto L21
            java.io.File r2 = new java.io.File
            r2.<init>(r1)
            java.lang.String r1 = r2.getName()
            java.io.File r2 = r2.getParentFile()
            if (r2 == 0) goto L21
            vd5 r0 = new vd5
            r0.<init>(r2)
            java.lang.String r2 = "*/*"
            zl1 r1 = r0.c(r2, r1)
            return r1
        L21:
            r1 = 0
            return r1
    }

    @Override // defpackage.uh7
    public final boolean d(android.net.Uri r1) {
            r0 = this;
            java.lang.String r0 = r1.getPath()
            if (r0 == 0) goto L10
            java.io.File r1 = new java.io.File
            r1.<init>(r0)
            boolean r0 = r1.isFile()
            return r0
        L10:
            r0 = 0
            return r0
    }
}

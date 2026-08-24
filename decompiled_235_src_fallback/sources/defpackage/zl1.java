package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zl1  reason: default package */
/* loaded from: classes.dex */
public abstract class zl1 {
    public static defpackage.qi6 g(android.content.Context r1, android.net.Uri r2) {
            qi6 r0 = new qi6
            r0.<init>()
            r0.b = r1
            r0.c = r2
            return r0
    }

    public static defpackage.qi6 h(android.content.Context r2, android.net.Uri r3) {
            java.lang.String r0 = android.provider.DocumentsContract.getTreeDocumentId(r3)
            boolean r1 = android.provider.DocumentsContract.isDocumentUri(r2, r3)
            if (r1 == 0) goto Le
            java.lang.String r0 = android.provider.DocumentsContract.getDocumentId(r3)
        Le:
            r1 = 0
            if (r0 == 0) goto L27
            android.net.Uri r0 = android.provider.DocumentsContract.buildDocumentUriUsingTree(r3, r0)
            if (r0 == 0) goto L1d
            qi6 r3 = new qi6
            r3.<init>(r2, r0)
            return r3
        L1d:
            java.lang.String r2 = "Failed to build documentUri from a tree: "
            java.lang.String r2 = defpackage.xg6.n(r3, r2)
            defpackage.u34.x(r2)
            return r1
        L27:
            java.lang.String r2 = "Could not get document ID from Uri: "
            java.lang.String r2 = defpackage.xg6.n(r3, r2)
            defpackage.i.h(r2)
            return r1
    }

    public abstract boolean a();

    public abstract defpackage.zl1 b(java.lang.String r1);

    public abstract defpackage.zl1 c(java.lang.String r1, java.lang.String r2);

    public abstract boolean d();

    public abstract boolean e();

    public final defpackage.zl1 f(java.lang.String r5) {
            r4 = this;
            zl1[] r4 = r4.o()
            int r0 = r4.length
            r1 = 0
        L6:
            if (r1 >= r0) goto L18
            r2 = r4[r1]
            java.lang.String r3 = r2.i()
            boolean r3 = r5.equals(r3)
            if (r3 == 0) goto L15
            return r2
        L15:
            int r1 = r1 + 1
            goto L6
        L18:
            r4 = 0
            return r4
    }

    public abstract java.lang.String i();

    public abstract android.net.Uri j();

    public abstract boolean k();

    public abstract boolean l();

    public abstract long m();

    public abstract long n();

    public abstract defpackage.zl1[] o();
}

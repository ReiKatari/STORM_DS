package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vh7  reason: default package */
/* loaded from: classes.dex */
public final class vh7 implements defpackage.zh3 {
    @Override // defpackage.zh3
    public final java.lang.String a(java.lang.Object r2, defpackage.fo4 r3) {
            r1 = this;
            android.net.Uri r2 = (android.net.Uri) r2
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "android.resource"
            boolean r1 = defpackage.nb3.k(r1, r0)
            if (r1 == 0) goto L33
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r2)
            r2 = 45
            r1.append(r2)
            android.content.Context r2 = r3.a
            android.content.res.Resources r2 = r2.getResources()
            android.content.res.Configuration r2 = r2.getConfiguration()
            android.graphics.Bitmap$Config[] r3 = defpackage.k.a
            int r2 = r2.uiMode
            r2 = r2 & 48
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            return r1
        L33:
            java.lang.String r1 = r2.toString()
            return r1
    }
}

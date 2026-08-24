package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ya2  reason: default package */
/* loaded from: classes.dex */
public final class ya2 implements defpackage.zh3 {
    public final boolean a;

    public ya2(boolean r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    @Override // defpackage.zh3
    public final java.lang.String a(java.lang.Object r1, defpackage.fo4 r2) {
            r0 = this;
            java.io.File r1 = (java.io.File) r1
            boolean r0 = r0.a
            if (r0 == 0) goto L23
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r2 = r1.getPath()
            r0.append(r2)
            r2 = 58
            r0.append(r2)
            long r1 = r1.lastModified()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L23:
            java.lang.String r0 = r1.getPath()
            return r0
    }
}

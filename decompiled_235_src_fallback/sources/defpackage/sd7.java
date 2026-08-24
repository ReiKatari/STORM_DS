package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sd7  reason: default package */
/* loaded from: classes.dex */
public class sd7 extends defpackage.yc7 {
    public sd7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r4) {
            r3 = this;
            jf3 r3 = r4.n0()
            jf3 r0 = defpackage.jf3.NULL
            r1 = 0
            if (r3 != r0) goto Ld
            r4.j0()
            return r1
        Ld:
            java.lang.String r3 = r4.l0()
            java.util.StringTokenizer r4 = new java.util.StringTokenizer
            java.lang.String r0 = "_"
            r4.<init>(r3, r0)
            boolean r3 = r4.hasMoreElements()
            if (r3 == 0) goto L23
            java.lang.String r3 = r4.nextToken()
            goto L24
        L23:
            r3 = r1
        L24:
            boolean r0 = r4.hasMoreElements()
            if (r0 == 0) goto L2f
            java.lang.String r0 = r4.nextToken()
            goto L30
        L2f:
            r0 = r1
        L30:
            boolean r2 = r4.hasMoreElements()
            if (r2 == 0) goto L3a
            java.lang.String r1 = r4.nextToken()
        L3a:
            if (r0 != 0) goto L44
            if (r1 != 0) goto L44
            java.util.Locale r4 = new java.util.Locale
            r4.<init>(r3)
            return r4
        L44:
            if (r1 != 0) goto L4c
            java.util.Locale r4 = new java.util.Locale
            r4.<init>(r3, r0)
            return r4
        L4c:
            java.util.Locale r4 = new java.util.Locale
            r4.<init>(r3, r0, r1)
            return r4
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            java.util.Locale r2 = (java.util.Locale) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r2.toString()
        La:
            r1.c0(r0)
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: od7  reason: default package */
/* loaded from: classes.dex */
public class od7 extends defpackage.yc7 {
    public od7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r3) {
            r2 = this;
            jf3 r2 = r3.n0()
            jf3 r0 = defpackage.jf3.NULL
            r1 = 0
            if (r2 != r0) goto Ld
            r3.j0()
            return r1
        Ld:
            java.lang.String r2 = r3.l0()     // Catch: java.net.URISyntaxException -> L20
            java.lang.String r3 = "null"
            boolean r3 = r2.equals(r3)     // Catch: java.net.URISyntaxException -> L20
            if (r3 == 0) goto L1a
            return r1
        L1a:
            java.net.URI r3 = new java.net.URI     // Catch: java.net.URISyntaxException -> L20
            r3.<init>(r2)     // Catch: java.net.URISyntaxException -> L20
            return r3
        L20:
            r2 = move-exception
            ne3 r3 = new ne3
            r3.<init>(r2)
            throw r3
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            java.net.URI r2 = (java.net.URI) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r2.toASCIIString()
        La:
            r1.c0(r0)
            return
    }
}

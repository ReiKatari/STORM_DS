package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nd7  reason: default package */
/* loaded from: classes.dex */
public class nd7 extends defpackage.yc7 {
    public nd7() {
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
            java.lang.String r2 = r3.l0()
            java.lang.String r3 = "null"
            boolean r3 = r2.equals(r3)
            if (r3 == 0) goto L1a
            return r1
        L1a:
            java.net.URL r3 = new java.net.URL
            r3.<init>(r2)
            return r3
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            java.net.URL r2 = (java.net.URL) r2
            if (r2 != 0) goto L6
            r0 = 0
            goto La
        L6:
            java.lang.String r0 = r2.toExternalForm()
        La:
            r1.c0(r0)
            return
    }
}

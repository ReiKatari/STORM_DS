package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: qd7  reason: default package */
/* loaded from: classes.dex */
public class qd7 extends defpackage.yc7 {
    public qd7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r5) {
            r4 = this;
            jf3 r4 = r5.n0()
            jf3 r0 = defpackage.jf3.NULL
            if (r4 != r0) goto Ld
            r5.j0()
            r4 = 0
            return r4
        Ld:
            java.lang.String r4 = r5.l0()
            java.util.UUID r4 = java.util.UUID.fromString(r4)     // Catch: java.lang.IllegalArgumentException -> L16
            return r4
        L16:
            r0 = move-exception
            ne3 r1 = new ne3
            java.lang.String r2 = "Failed parsing '"
            java.lang.String r3 = "' as UUID; at path "
            java.lang.StringBuilder r4 = defpackage.i61.t(r2, r4, r3)
            java.lang.String r5 = r5.D()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r1.<init>(r4, r0)
            throw r1
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r1, java.lang.Object r2) {
            r0 = this;
            java.util.UUID r2 = (java.util.UUID) r2
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

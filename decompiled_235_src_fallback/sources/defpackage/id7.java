package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: id7  reason: default package */
/* loaded from: classes.dex */
public class id7 extends defpackage.yc7 {
    public id7() {
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
            defpackage.qo2.n(r4)     // Catch: java.lang.NumberFormatException -> L1a
            java.math.BigInteger r0 = new java.math.BigInteger     // Catch: java.lang.NumberFormatException -> L1a
            r0.<init>(r4)     // Catch: java.lang.NumberFormatException -> L1a
            return r0
        L1a:
            r0 = move-exception
            ne3 r1 = new ne3
            java.lang.String r2 = "Failed parsing '"
            java.lang.String r3 = "' as BigInteger; at path "
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
            java.math.BigInteger r2 = (java.math.BigInteger) r2
            r1.a0(r2)
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dd7  reason: default package */
/* loaded from: classes.dex */
public class dd7 extends defpackage.yc7 {
    public dd7() {
            r0 = this;
            r0.<init>()
            return
    }

    @Override // defpackage.yc7
    public final java.lang.Object b(defpackage.hf3 r2) {
            r1 = this;
            jf3 r1 = r2.n0()
            jf3 r0 = defpackage.jf3.NULL
            if (r1 != r0) goto Ld
            r2.j0()
            r1 = 0
            return r1
        Ld:
            long r1 = r2.a0()     // Catch: java.lang.NumberFormatException -> L16
            java.lang.Long r1 = java.lang.Long.valueOf(r1)     // Catch: java.lang.NumberFormatException -> L16
            return r1
        L16:
            r1 = move-exception
            ne3 r2 = new ne3
            r2.<init>(r1)
            throw r2
    }

    @Override // defpackage.yc7
    public final void c(defpackage.vf3 r3, java.lang.Object r4) {
            r2 = this;
            java.lang.Number r4 = (java.lang.Number) r4
            if (r4 != 0) goto L8
            r3.A()
            return
        L8:
            long r0 = r4.longValue()
            r3.X(r0)
            return
    }
}

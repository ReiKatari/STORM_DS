package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: u40  reason: default package */
/* loaded from: classes.dex */
public final class u40 extends defpackage.xk5 {
    @Override // defpackage.xk5
    public final boolean a(defpackage.m44 r1) {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.xk5
    public final defpackage.aj c(defpackage.m44 r2, int r3) {
            r1 = this;
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r0 = "Unrecognized type of request: "
            r3.<init>(r0)
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            r1.<init>(r2)
            throw r1
    }
}

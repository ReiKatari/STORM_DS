package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f1  reason: default package */
/* loaded from: classes.dex */
public final class f1 extends defpackage.nc1 {
    public final java.lang.Object t;

    public f1(java.io.InputStream r2) {
            r1 = this;
            r1.<init>()
            java.lang.String r0 = "origin"
            java.util.Objects.requireNonNull(r2, r0)
            r1.t = r2
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.Class r1 = r2.getClass()
            java.lang.String r1 = r1.getSimpleName()
            r0.append(r1)
            java.lang.String r1 = "["
            r0.append(r1)
            java.lang.Object r2 = r2.t
            java.lang.String r2 = r2.toString()
            r0.append(r2)
            java.lang.String r2 = "]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tn4  reason: default package */
/* loaded from: classes.dex */
public final class tn4 extends defpackage.nj2 {
    public final java.lang.Throwable i;

    public tn4(java.lang.Throwable r1) {
            r0 = this;
            r0.<init>()
            r0.i = r1
            return
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "FAILURE ("
            r0.<init>(r1)
            java.lang.Throwable r2 = r2.i
            java.lang.String r2 = r2.getMessage()
            r0.append(r2)
            java.lang.String r2 = ")"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

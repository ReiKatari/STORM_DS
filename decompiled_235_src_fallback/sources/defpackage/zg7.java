package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: zg7  reason: default package */
/* loaded from: classes.dex */
public final class zg7 extends defpackage.ah7 {
    @Override // defpackage.ah7
    public final java.lang.Object a(java.lang.Class r3) {
            r2 = this;
            java.lang.UnsupportedOperationException r2 = new java.lang.UnsupportedOperationException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Cannot allocate "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ". Usage of JDK sun.misc.Unsafe is enabled, but it could not be used. Make sure your runtime is configured correctly."
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r2.<init>(r3)
            throw r2
    }
}

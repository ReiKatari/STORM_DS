package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: mk1  reason: default package */
/* loaded from: classes.dex */
public final class mk1 extends java.lang.Exception {
    public final java.lang.Throwable A;

    public mk1(java.lang.Throwable r3, defpackage.n61 r4, defpackage.l61 r5) {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Coroutine dispatcher "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = " threw an exception, context = "
            r0.append(r4)
            r0.append(r5)
            java.lang.String r4 = r0.toString()
            r2.<init>(r4, r3)
            r2.A = r3
            return
    }

    @Override // java.lang.Throwable
    public final java.lang.Throwable getCause() {
            r0 = this;
            java.lang.Throwable r0 = r0.A
            return r0
    }
}

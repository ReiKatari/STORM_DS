package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n62  reason: default package */
/* loaded from: classes.dex */
public final class n62 extends defpackage.o62 {
    public final java.lang.Runnable L;

    public n62(java.lang.Runnable r1, long r2) {
            r0 = this;
            r0.<init>(r2)
            r0.L = r1
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r0 = this;
            java.lang.Runnable r0 = r0.L
            r0.run()
            return
    }

    @Override // defpackage.o62
    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.toString()
            r0.append(r1)
            java.lang.Runnable r2 = r2.L
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

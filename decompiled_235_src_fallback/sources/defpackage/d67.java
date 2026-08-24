package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d67  reason: default package */
/* loaded from: classes.dex */
public final class d67 extends defpackage.o66 implements java.lang.Runnable {
    public final long Z;

    public d67(long r2, defpackage.s41 r4) {
            r1 = this;
            l61 r0 = r4.b()
            r1.<init>(r4, r0)
            r1.Z = r2
            return
    }

    @Override // defpackage.ed3
    public final java.lang.String f0() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = super.f0()
            r0.append(r1)
            java.lang.String r1 = "(timeMillis="
            r0.append(r1)
            long r1 = r3.Z
            r0.append(r1)
            r3 = 41
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }

    @Override // java.lang.Runnable
    public final void run() {
            r3 = this;
            l61 r0 = r3.X
            defpackage.q60.D(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Timed out waiting for "
            r0.<init>(r1)
            long r1 = r3.Z
            r0.append(r1)
            java.lang.String r1 = " ms"
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            c67 r1 = new c67
            r1.<init>(r0, r3)
            r3.s(r1)
            return
    }
}

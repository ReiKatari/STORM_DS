package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: vl4  reason: default package */
/* loaded from: classes.dex */
public final class vl4 extends defpackage.z64 implements defpackage.j34 {
    public defpackage.qn2 k0;
    public long l0;

    @Override // defpackage.z64
    public final boolean G0() {
            r0 = this;
            r0 = 1
            return r0
    }

    @Override // defpackage.j34
    public final void b(long r3) {
            r2 = this;
            long r0 = r2.l0
            boolean r0 = defpackage.q93.b(r0, r3)
            if (r0 != 0) goto L14
            qn2 r0 = r2.k0
            q93 r1 = new q93
            r1.<init>(r3)
            r0.g(r1)
            r2.l0 = r3
        L14:
            return
    }
}

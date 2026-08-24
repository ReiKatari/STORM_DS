package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nb6  reason: default package */
/* loaded from: classes.dex */
public final class nb6 extends defpackage.p96 {
    public final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceArray Z;

    public nb6(long r1, defpackage.nb6 r3, int r4) {
            r0 = this;
            r0.<init>(r1, r3, r4)
            java.util.concurrent.atomic.AtomicReferenceArray r1 = new java.util.concurrent.atomic.AtomicReferenceArray
            int r2 = defpackage.mb6.f
            r1.<init>(r2)
            r0.Z = r1
            return
    }

    @Override // defpackage.p96
    public final int l() {
            r0 = this;
            int r0 = defpackage.mb6.f
            return r0
    }

    @Override // defpackage.p96
    public final void m(int r2, defpackage.l61 r3) {
            r1 = this;
            gr1 r3 = defpackage.mb6.e
            java.util.concurrent.atomic.AtomicReferenceArray r0 = r1.Z
            r0.set(r2, r3)
            r1.n()
            return
    }

    public final java.lang.String toString() {
            r3 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SemaphoreSegment[id="
            r0.<init>(r1)
            long r1 = r3.X
            r0.append(r1)
            java.lang.String r1 = ", hashCode="
            r0.append(r1)
            int r3 = r3.hashCode()
            r0.append(r3)
            r3 = 93
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
    }
}

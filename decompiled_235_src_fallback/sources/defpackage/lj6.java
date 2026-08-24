package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lj6  reason: default package */
/* loaded from: classes.dex */
public abstract class lj6 implements java.lang.Comparable {
    public final long A;

    public lj6(long r1) {
            r0 = this;
            r0.<init>()
            r0.A = r1
            return
    }

    @Override // java.lang.Comparable
    public final int compareTo(java.lang.Object r3) {
            r2 = this;
            lj6 r3 = (defpackage.lj6) r3
            r3.getClass()
            long r0 = r2.A
            long r2 = r3.A
            int r2 = defpackage.nb3.q(r0, r2)
            return r2
    }
}

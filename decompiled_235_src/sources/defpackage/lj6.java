package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lj6  reason: default package */
/* loaded from: classes.dex */
public abstract class lj6 implements Comparable {
    public final long A;

    public lj6(long j) {
        this.A = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        lj6 lj6Var = (lj6) obj;
        lj6Var.getClass();
        return nb3.q(this.A, lj6Var.A);
    }
}

package oe;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class o0 implements Comparable {
    public final long A;

    public o0(long j2) {
        this.A = j2;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        o0 o0Var = (o0) obj;
        o0Var.getClass();
        return nc.k.c(this.A, o0Var.A);
    }
}

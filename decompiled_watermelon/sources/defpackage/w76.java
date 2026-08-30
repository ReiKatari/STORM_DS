package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w76  reason: default package */
/* loaded from: classes.dex */
public abstract class w76 implements Comparable {
    public final long A;

    public w76(long j) {
        this.A = j;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        w76 w76Var = (w76) obj;
        w76Var.getClass();
        return b53.F(this.A, w76Var.A);
    }
}

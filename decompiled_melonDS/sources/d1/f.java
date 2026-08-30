package d1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface f {
    boolean a();

    Object b(long j2);

    long c();

    w1 d();

    Object e();

    p f(long j2);

    default boolean g(long j2) {
        if (j2 >= c()) {
            return true;
        }
        return false;
    }
}

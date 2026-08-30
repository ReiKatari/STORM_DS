package y3;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public interface s0 {
    z a(z zVar);

    default long d(z zVar, z zVar2) {
        z a10 = a(zVar);
        z a11 = a(zVar2);
        if (a10 instanceof r0) {
            return ((r0) a10).F(a11, 0L, true);
        }
        if (a11 instanceof r0) {
            return ((r0) a11).F(a10, 0L, true) ^ (-9223372034707292160L);
        }
        return a10.F(a10, 0L, true);
    }
}

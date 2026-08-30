package w;

import j0.l2;
import j0.n2;
import java.util.UUID;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w0 implements l2 {
    public final j0.g1 A;

    public w0() {
        j0.g1 b10 = j0.g1.b();
        b10.o(l2.E, new Object());
        b10.o(j0.a1.f7148n, 34);
        b10.o(n0.k.V, x0.class);
        b10.o(n0.k.U, x0.class.getCanonicalName() + "-" + UUID.randomUUID());
        this.A = b10;
    }

    @Override // j0.l2
    public final n2 r() {
        return n2.METERING_REPEATING;
    }

    @Override // j0.p1
    public final j0.r0 x() {
        return this.A;
    }
}

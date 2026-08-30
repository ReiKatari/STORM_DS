package ih;

import wc.j;
import wc.k;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements k {
    public long A;
    public int B;

    @Override // wc.k
    public wc.g toInstant() {
        long j2 = this.A;
        if (j2 >= wc.g.L.A && j2 <= wc.g.R.A) {
            return j.f(this.B, j2);
        }
        throw new IllegalArgumentException("The parsed date is outside the range representable by Instant (Unix epoch second " + j2 + ')');
    }
}

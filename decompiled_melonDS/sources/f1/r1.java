package f1;

import android.widget.Magnifier;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r1 extends p1 {
    @Override // f1.p1, f1.n1
    public final void a(long j2, long j10) {
        if (!Float.isNaN(Float.NaN)) {
            this.f4640a.setZoom(Float.NaN);
        }
        int i2 = ((9223372034707292159L & j10) > 9205357640488583168L ? 1 : ((9223372034707292159L & j10) == 9205357640488583168L ? 0 : -1));
        Magnifier magnifier = this.f4640a;
        if (i2 != 0) {
            magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        } else {
            magnifier.show(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)));
        }
    }
}

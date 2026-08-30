package nd;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class l1 extends d1 {

    /* renamed from: a  reason: collision with root package name */
    public short[] f10330a;

    /* renamed from: b  reason: collision with root package name */
    public int f10331b;

    @Override // nd.d1
    public final Object a() {
        return Arrays.copyOf(this.f10330a, this.f10331b);
    }

    @Override // nd.d1
    public final void b(int i2) {
        short[] sArr = this.f10330a;
        if (sArr.length < i2) {
            int length = sArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            this.f10330a = Arrays.copyOf(sArr, i2);
        }
    }

    @Override // nd.d1
    public final int d() {
        return this.f10331b;
    }
}

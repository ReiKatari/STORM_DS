package nd;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class o0 extends d1 {

    /* renamed from: a  reason: collision with root package name */
    public long[] f10341a;

    /* renamed from: b  reason: collision with root package name */
    public int f10342b;

    @Override // nd.d1
    public final Object a() {
        return Arrays.copyOf(this.f10341a, this.f10342b);
    }

    @Override // nd.d1
    public final void b(int i2) {
        long[] jArr = this.f10341a;
        if (jArr.length < i2) {
            int length = jArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            this.f10341a = Arrays.copyOf(jArr, i2);
        }
    }

    @Override // nd.d1
    public final int d() {
        return this.f10342b;
    }
}

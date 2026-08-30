package nd;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n extends d1 {

    /* renamed from: a  reason: collision with root package name */
    public char[] f10335a;

    /* renamed from: b  reason: collision with root package name */
    public int f10336b;

    @Override // nd.d1
    public final Object a() {
        return Arrays.copyOf(this.f10335a, this.f10336b);
    }

    @Override // nd.d1
    public final void b(int i2) {
        char[] cArr = this.f10335a;
        if (cArr.length < i2) {
            int length = cArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            this.f10335a = Arrays.copyOf(cArr, i2);
        }
    }

    @Override // nd.d1
    public final int d() {
        return this.f10336b;
    }
}

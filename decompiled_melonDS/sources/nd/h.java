package nd;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h extends d1 {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f10310a;

    /* renamed from: b  reason: collision with root package name */
    public int f10311b;

    @Override // nd.d1
    public final Object a() {
        return Arrays.copyOf(this.f10310a, this.f10311b);
    }

    @Override // nd.d1
    public final void b(int i2) {
        byte[] bArr = this.f10310a;
        if (bArr.length < i2) {
            int length = bArr.length * 2;
            if (i2 < length) {
                i2 = length;
            }
            this.f10310a = Arrays.copyOf(bArr, i2);
        }
    }

    @Override // nd.d1
    public final int d() {
        return this.f10311b;
    }
}

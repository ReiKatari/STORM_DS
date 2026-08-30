package ek;

import zj.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends a {

    /* renamed from: d  reason: collision with root package name */
    public final byte[] f4508d;

    /* renamed from: e  reason: collision with root package name */
    public int f4509e;

    public b(zj.b bVar) {
        byte[] a10 = bVar.a(65531);
        this.f4508d = a10;
        this.f4509e = a10.length;
    }

    @Override // ek.a
    public final void f() {
        int i2 = this.f4506b;
        if (((-16777216) & i2) == 0) {
            try {
                byte[] bArr = this.f4508d;
                int i10 = this.f4509e;
                this.f4509e = i10 + 1;
                this.f4507c = (this.f4507c << 8) | (bArr[i10] & 255);
                this.f4506b = i2 << 8;
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw new g();
            }
        }
    }
}

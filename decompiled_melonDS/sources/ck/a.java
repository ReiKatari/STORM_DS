package ck;

import zj.b;
import zj.g;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a  reason: collision with root package name */
    public final byte[] f2902a;

    /* renamed from: b  reason: collision with root package name */
    public final int f2903b;

    /* renamed from: c  reason: collision with root package name */
    public int f2904c = 0;

    /* renamed from: d  reason: collision with root package name */
    public int f2905d = 0;

    /* renamed from: e  reason: collision with root package name */
    public int f2906e = 0;

    /* renamed from: f  reason: collision with root package name */
    public int f2907f = 0;

    /* renamed from: g  reason: collision with root package name */
    public int f2908g = 0;

    /* renamed from: h  reason: collision with root package name */
    public int f2909h = 0;

    public a(int i2, b bVar) {
        this.f2903b = i2;
        this.f2902a = bVar.a(i2);
    }

    public final void a(int i2, int i10) {
        int i11;
        if (i2 >= 0 && i2 < this.f2906e) {
            int min = Math.min(this.f2907f - this.f2905d, i10);
            this.f2908g = i10 - min;
            this.f2909h = i2;
            int i12 = (this.f2905d - i2) - 1;
            byte[] bArr = this.f2902a;
            if (i12 < 0) {
                int i13 = this.f2903b;
                int i14 = i12 + i13;
                int min2 = Math.min(i13 - i14, min);
                System.arraycopy(bArr, i14, bArr, this.f2905d, min2);
                this.f2905d += min2;
                min -= min2;
                if (min != 0) {
                    i12 = 0;
                } else {
                    return;
                }
            }
            do {
                int min3 = Math.min(min, this.f2905d - i12);
                System.arraycopy(bArr, i12, bArr, this.f2905d, min3);
                i11 = this.f2905d + min3;
                this.f2905d = i11;
                min -= min3;
            } while (min > 0);
            if (this.f2906e < i11) {
                this.f2906e = i11;
                return;
            }
            return;
        }
        throw new g();
    }
}

package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cc3  reason: default package */
/* loaded from: classes.dex */
public final class cc3 {
    public final byte[] a;
    public final int b;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public cc3(int i, ut utVar) {
        this.b = i;
        this.a = utVar.a(i);
    }

    public final void a(int i, int i2) {
        int i3;
        if (i >= 0 && i < this.e) {
            int min = Math.min(this.f - this.d, i2);
            this.g = i2 - min;
            this.h = i;
            int i4 = (this.d - i) - 1;
            byte[] bArr = this.a;
            if (i4 < 0) {
                int i5 = this.b;
                int i6 = i4 + i5;
                int min2 = Math.min(i5 - i6, min);
                System.arraycopy(bArr, i6, bArr, this.d, min2);
                this.d += min2;
                min -= min2;
                if (min != 0) {
                    i4 = 0;
                } else {
                    return;
                }
            }
            do {
                int min3 = Math.min(min, this.d - i4);
                System.arraycopy(bArr, i4, bArr, this.d, min3);
                i3 = this.d + min3;
                this.d = i3;
                min -= min3;
            } while (min > 0);
            if (this.e < i3) {
                this.e = i3;
                return;
            }
            return;
        }
        throw new w31();
    }
}

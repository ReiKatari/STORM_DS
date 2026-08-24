package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ui3  reason: default package */
/* loaded from: classes.dex */
public final class ui3 {
    public final byte[] a;
    public final int b;
    public int c = 0;
    public int d = 0;
    public int e = 0;
    public int f = 0;
    public int g = 0;
    public int h = 0;

    public ui3(int i, mu muVar) {
        this.b = i;
        this.a = muVar.a(i);
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
        throw new e71();
    }
}

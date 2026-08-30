package a1;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a  reason: collision with root package name */
    public int[] f111a;

    /* renamed from: b  reason: collision with root package name */
    public int f112b;

    public w(int i2) {
        int[] iArr;
        if (i2 == 0) {
            iArr = n.f73a;
        } else {
            iArr = new int[i2];
        }
        this.f111a = iArr;
    }

    public final void a(int i2) {
        b(this.f112b + 1);
        int[] iArr = this.f111a;
        int i10 = this.f112b;
        iArr[i10] = i2;
        this.f112b = i10 + 1;
    }

    public final void b(int i2) {
        int[] iArr = this.f111a;
        if (iArr.length < i2) {
            this.f111a = Arrays.copyOf(iArr, Math.max(i2, (iArr.length * 3) / 2));
        }
    }

    public final int c(int i2) {
        if (i2 >= 0 && i2 < this.f112b) {
            return this.f111a[i2];
        }
        wa.b.f("Index must be between 0 and size");
        return 0;
    }

    public final void d(int i2) {
        int i10;
        if (i2 >= 0 && i2 < (i10 = this.f112b)) {
            int[] iArr = this.f111a;
            int i11 = iArr[i2];
            if (i2 != i10 - 1) {
                zb.k.g(i2, i2 + 1, i10, iArr, iArr);
            }
            this.f112b--;
            return;
        }
        wa.b.f("Index must be between 0 and size");
    }

    public final void e(int i2, int i10) {
        if (i2 >= 0 && i2 < this.f112b) {
            int[] iArr = this.f111a;
            int i11 = iArr[i2];
            iArr[i2] = i10;
            return;
        }
        wa.b.f("Index must be between 0 and size");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof w) {
            w wVar = (w) obj;
            int i2 = wVar.f112b;
            int i10 = this.f112b;
            if (i2 == i10) {
                int[] iArr = this.f111a;
                int[] iArr2 = wVar.f111a;
                sc.d L = p7.j.L(0, i10);
                int i11 = L.A;
                int i12 = L.B;
                if (i11 <= i12) {
                    while (iArr[i11] == iArr2[i11]) {
                        if (i11 != i12) {
                            i11++;
                        } else {
                            return true;
                        }
                    }
                    return false;
                }
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int[] iArr = this.f111a;
        int i2 = this.f112b;
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            i10 += Integer.hashCode(iArr[i11]) * 31;
        }
        return i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append((CharSequence) "[");
        int[] iArr = this.f111a;
        int i2 = this.f112b;
        int i10 = 0;
        while (true) {
            if (i10 < i2) {
                int i11 = iArr[i10];
                if (i10 == -1) {
                    sb2.append((CharSequence) "...");
                    break;
                }
                if (i10 != 0) {
                    sb2.append((CharSequence) ", ");
                }
                sb2.append(i11);
                i10++;
            } else {
                sb2.append((CharSequence) "]");
                break;
            }
        }
        return sb2.toString();
    }

    public /* synthetic */ w() {
        this(16);
    }
}

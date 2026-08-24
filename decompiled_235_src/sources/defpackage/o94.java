package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: o94  reason: default package */
/* loaded from: classes.dex */
public final class o94 {
    public int[] a;
    public int b;

    public o94(int i) {
        int[] iArr;
        if (i == 0) {
            iArr = p93.a;
        } else {
            iArr = new int[i];
        }
        this.a = iArr;
    }

    public final void a(int i) {
        b(this.b + 1);
        int[] iArr = this.a;
        int i2 = this.b;
        iArr[i2] = i;
        this.b = i2 + 1;
    }

    public final void b(int i) {
        int[] iArr = this.a;
        if (iArr.length < i) {
            this.a = Arrays.copyOf(iArr, Math.max(i, (iArr.length * 3) / 2));
        }
    }

    public final int c(int i) {
        if (i >= 0 && i < this.b) {
            return this.a[i];
        }
        e41.q("Index must be between 0 and size");
        return 0;
    }

    public final int d() {
        int i = this.b;
        if (i != 0) {
            return this.a[i - 1];
        }
        fa6.e("IntList is empty.");
        return 0;
    }

    public final void e(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.b)) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            if (i != i2 - 1) {
                fv.r0(i, i + 1, i2, iArr, iArr);
            }
            this.b--;
            return;
        }
        e41.q("Index must be between 0 and size");
    }

    public final boolean equals(Object obj) {
        if (obj instanceof o94) {
            o94 o94Var = (o94) obj;
            int i = o94Var.b;
            int i2 = this.b;
            if (i == i2) {
                int[] iArr = this.a;
                int[] iArr2 = o94Var.a;
                l93 R = gi2.R(0, i2);
                int i3 = R.A;
                int i4 = R.B;
                if (i3 <= i4) {
                    while (iArr[i3] == iArr2[i3]) {
                        if (i3 != i4) {
                            i3++;
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

    public final void f(int i, int i2) {
        if (i >= 0 && i < this.b) {
            int[] iArr = this.a;
            int i3 = iArr[i];
            iArr[i] = i2;
            return;
        }
        e41.q("Index must be between 0 and size");
    }

    public final int hashCode() {
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 += Integer.hashCode(iArr[i3]) * 31;
        }
        return i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append((CharSequence) "[");
        int[] iArr = this.a;
        int i = this.b;
        int i2 = 0;
        while (true) {
            if (i2 < i) {
                int i3 = iArr[i2];
                if (i2 == -1) {
                    sb.append((CharSequence) "...");
                    break;
                }
                if (i2 != 0) {
                    sb.append((CharSequence) ", ");
                }
                sb.append(i3);
                i2++;
            } else {
                sb.append((CharSequence) "]");
                break;
            }
        }
        return sb.toString();
    }

    public /* synthetic */ o94() {
        this(16);
    }
}

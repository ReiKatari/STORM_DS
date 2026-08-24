package defpackage;

import android.view.View;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dy7  reason: default package */
/* loaded from: classes.dex */
public final class dy7 implements di6 {
    public static final boolean[] c = {true, true, true, false, true, false, false, false};
    public static final int[] d = {0, 1, 2, 2, 3, 3, 3, 3};
    public int a;
    public int b;

    @Override // defpackage.di6
    public int a(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6 = i - 1;
        int i7 = (i2 + i) - 5;
        int i8 = i;
        while (true) {
            i3 = 0;
            if (i8 > i7) {
                break;
            }
            if ((bArr[i8] & 254) == 232) {
                int i9 = i8 - i6;
                int i10 = i9 & (-4);
                int[] iArr = d;
                if (i10 != 0) {
                    this.b = 0;
                } else {
                    int i11 = (this.b << (i9 - 1)) & 7;
                    this.b = i11;
                    if (i11 != 0 && (!c[i11] || (i4 = bArr[(i8 + 4) - iArr[i11]] & 255) == 0 || i4 == 255)) {
                        this.b = (i11 << 1) | 1;
                        i6 = i8;
                    }
                }
                int i12 = i8 + 4;
                int i13 = bArr[i12];
                int i14 = i13 & 255;
                if (i14 != 0 && i14 != 255) {
                    this.b = (this.b << 1) | 1;
                    i6 = i8;
                } else {
                    int i15 = i8 + 1;
                    int i16 = i8 + 2;
                    int i17 = i8 + 3;
                    int i18 = (i13 << 24) | (bArr[i15] & 255) | ((bArr[i16] & 255) << 8) | ((bArr[i17] & 255) << 16);
                    while (true) {
                        i5 = i18 - ((this.a + i8) - i);
                        int i19 = this.b;
                        if (i19 != 0) {
                            int i20 = iArr[i19] * 8;
                            int i21 = ((byte) (i5 >>> (24 - i20))) & 255;
                            if (i21 != 0 && i21 != 255) {
                                break;
                            }
                            i18 = i5 ^ ((1 << (32 - i20)) - 1);
                        } else {
                            break;
                        }
                    }
                    int i22 = (i5 << 7) >> 7;
                    bArr[i15] = (byte) i22;
                    bArr[i16] = (byte) (i22 >>> 8);
                    bArr[i17] = (byte) (i22 >>> 16);
                    bArr[i12] = (byte) (i22 >>> 24);
                    i6 = i8;
                    i8 = i12;
                }
            }
            i8++;
        }
        int i23 = i8 - i6;
        if ((i23 & (-4)) == 0) {
            i3 = this.b << (i23 - 1);
        }
        this.b = i3;
        int i24 = i8 - i;
        this.a += i24;
        return i24;
    }

    public void b(wg5 wg5Var) {
        View view = wg5Var.a;
        this.a = view.getLeft();
        this.b = view.getTop();
        view.getRight();
        view.getBottom();
    }
}

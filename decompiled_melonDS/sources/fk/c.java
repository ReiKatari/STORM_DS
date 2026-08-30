package fk;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final boolean[] f4994c = {true, true, true, false, true, false, false, false};

    /* renamed from: d  reason: collision with root package name */
    public static final int[] f4995d = {0, 1, 2, 2, 3, 3, 3, 3};

    /* renamed from: a  reason: collision with root package name */
    public int f4996a;

    /* renamed from: b  reason: collision with root package name */
    public int f4997b;

    @Override // fk.b
    public final int a(byte[] bArr, int i2, int i10) {
        int i11;
        int i12;
        int i13;
        int i14 = i2 - 1;
        int i15 = (i10 + i2) - 5;
        int i16 = i2;
        while (true) {
            i11 = 0;
            if (i16 > i15) {
                break;
            }
            if ((bArr[i16] & 254) == 232) {
                int i17 = i16 - i14;
                int i18 = i17 & (-4);
                int[] iArr = f4995d;
                if (i18 != 0) {
                    this.f4997b = 0;
                } else {
                    int i19 = (this.f4997b << (i17 - 1)) & 7;
                    this.f4997b = i19;
                    if (i19 != 0 && (!f4994c[i19] || (i12 = bArr[(i16 + 4) - iArr[i19]] & 255) == 0 || i12 == 255)) {
                        this.f4997b = (i19 << 1) | 1;
                        i14 = i16;
                    }
                }
                int i20 = i16 + 4;
                int i21 = bArr[i20];
                int i22 = i21 & 255;
                if (i22 != 0 && i22 != 255) {
                    this.f4997b = (this.f4997b << 1) | 1;
                    i14 = i16;
                } else {
                    int i23 = i16 + 1;
                    int i24 = i16 + 2;
                    int i25 = i16 + 3;
                    int i26 = (i21 << 24) | (bArr[i23] & 255) | ((bArr[i24] & 255) << 8) | ((bArr[i25] & 255) << 16);
                    while (true) {
                        i13 = i26 - ((this.f4996a + i16) - i2);
                        int i27 = this.f4997b;
                        if (i27 != 0) {
                            int i28 = iArr[i27] * 8;
                            int i29 = ((byte) (i13 >>> (24 - i28))) & 255;
                            if (i29 != 0 && i29 != 255) {
                                break;
                            }
                            i26 = i13 ^ ((1 << (32 - i28)) - 1);
                        } else {
                            break;
                        }
                    }
                    int i30 = (i13 << 7) >> 7;
                    bArr[i23] = (byte) i30;
                    bArr[i24] = (byte) (i30 >>> 8);
                    bArr[i25] = (byte) (i30 >>> 16);
                    bArr[i20] = (byte) (i30 >>> 24);
                    i14 = i16;
                    i16 = i20;
                }
            }
            i16++;
        }
        int i31 = i16 - i14;
        if ((i31 & (-4)) == 0) {
            i11 = this.f4997b << (i31 - 1);
        }
        this.f4997b = i11;
        int i32 = i16 - i2;
        this.f4996a += i32;
        return i32;
    }
}

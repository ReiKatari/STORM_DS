package fk;

import k7.w;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements b {

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f4991c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f4992a;

    /* renamed from: b  reason: collision with root package name */
    public int f4993b;

    @Override // fk.b
    public final int a(byte[] bArr, int i2, int i10) {
        char c4;
        int i11;
        switch (this.f4992a) {
            case 0:
                char c10 = 16;
                int i12 = (i2 + i10) - 16;
                int i13 = i2;
                while (i13 <= i12) {
                    int i14 = f4991c[bArr[i13] & 31];
                    int i15 = 5;
                    int i16 = 0;
                    while (i16 < 3) {
                        if (((i14 >>> i16) & 1) == 0) {
                            c4 = c10;
                            i11 = i15;
                        } else {
                            int i17 = i15 >>> 3;
                            int i18 = i15 & 7;
                            c4 = c10;
                            long j2 = 0;
                            int i19 = 0;
                            while (i19 < 6) {
                                j2 |= (bArr[(i13 + i17) + i19] & 255) << (i19 * 8);
                                i19++;
                                i15 = i15;
                            }
                            i11 = i15;
                            long j10 = j2 >>> i18;
                            if (((j10 >>> 37) & 15) == 5 && ((j10 >>> 9) & 7) == 0) {
                                long j11 = (((((int) ((j10 >>> 13) & 1048575)) | ((((int) (j10 >>> 36)) & 1) << 20)) << 4) - ((this.f4993b + i13) - i2)) >>> 4;
                                long j12 = ((((j10 & (-77309403137L)) | ((j11 & 1048575) << 13)) | ((j11 & 1048576) << c4)) << i18) | (j2 & ((1 << i18) - 1));
                                for (int i20 = 0; i20 < 6; i20++) {
                                    bArr[i13 + i17 + i20] = (byte) (j12 >>> (i20 * 8));
                                }
                            }
                        }
                        i16++;
                        i15 = i11 + 41;
                        c10 = c4;
                    }
                    i13 += 16;
                }
                int i21 = i13 - i2;
                this.f4993b += i21;
                return i21;
            case DSiCameraSource.FrontCamera /* 1 */:
                int i22 = (i2 + i10) - 4;
                int i23 = i2;
                while (i23 <= i22) {
                    if ((bArr[i23 + 3] & 255) == 235) {
                        int i24 = i23 + 2;
                        int i25 = i23 + 1;
                        int i26 = (((((bArr[i24] & 255) << 16) | ((bArr[i25] & 255) << 8)) | (bArr[i23] & 255)) << 2) - ((this.f4993b + i23) - i2);
                        bArr[i24] = (byte) (i26 >>> 18);
                        bArr[i25] = (byte) (i26 >>> 10);
                        bArr[i23] = (byte) (i26 >>> 2);
                    }
                    i23 += 4;
                }
                int i27 = i23 - i2;
                this.f4993b += i27;
                return i27;
            case 2:
                int i28 = (i2 + i10) - 4;
                int i29 = i2;
                while (i29 <= i28) {
                    int i30 = i29 + 1;
                    int i31 = bArr[i30];
                    if ((i31 & 248) == 240) {
                        int i32 = i29 + 3;
                        int i33 = bArr[i32];
                        if ((i33 & 248) == 248) {
                            int i34 = ((i31 & 7) << 19) | ((bArr[i29] & 255) << 11) | ((i33 & 7) << 8);
                            int i35 = i29 + 2;
                            int i36 = ((i34 | (bArr[i35] & 255)) << 1) - ((this.f4993b + i29) - i2);
                            bArr[i30] = (byte) (240 | ((i36 >>> 20) & 7));
                            bArr[i29] = (byte) (i36 >>> 12);
                            bArr[i32] = (byte) (((i36 >>> 9) & 7) | 248);
                            bArr[i35] = (byte) (i36 >>> 1);
                            i29 = i35;
                        }
                    }
                    i29 += 2;
                }
                int i37 = i29 - i2;
                this.f4993b += i37;
                return i37;
            case 3:
                int i38 = (i2 + i10) - 4;
                int i39 = i2;
                while (i39 <= i38) {
                    if ((bArr[i39] & 252) == 72 && (bArr[i39 + 3] & 3) == 1) {
                        w.E(bArr, i39, ((w.t(i39, bArr) + (-((this.f4993b + i39) - i2))) & 67108860) | 1207959553);
                    }
                    i39 += 4;
                }
                int i40 = i39 - i2;
                this.f4993b += i40;
                return i40;
            default:
                int i41 = (i2 + i10) - 4;
                int i42 = i2;
                while (i42 <= i41) {
                    byte b10 = bArr[i42];
                    if ((b10 == 64 && (bArr[i42 + 1] & 192) == 0) || (b10 == Byte.MAX_VALUE && (bArr[i42 + 1] & 192) == 192)) {
                        w.E(bArr, i42, ((((w.t(i42, bArr) + (-(((this.f4993b + i42) - i2) >>> 2))) << 9) >> 9) & 1073741823) | 1073741824);
                    }
                    i42 += 4;
                }
                int i43 = i42 - i2;
                this.f4993b += i43;
                return i43;
        }
    }
}

package com.github.junrar.rarfile;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class FileNameDecoder {
    public static String decode(byte[] bArr, int i) {
        int i2;
        int i3 = i + 1;
        int i4 = getChar(bArr, i);
        StringBuilder sb = new StringBuilder();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        while (i3 < bArr.length) {
            if (i5 == 0) {
                i6 = getChar(bArr, i3);
                i3++;
                i5 = 8;
            }
            int i8 = i6 >>> 6;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 != 2) {
                        if (i8 == 3) {
                            i2 = i3 + 1;
                            int i9 = getChar(bArr, i3);
                            if ((i9 & 128) != 0) {
                                i3 += 2;
                                int i10 = getChar(bArr, i2);
                                int i11 = (i9 & 127) + 2;
                                while (i11 > 0 && i7 < bArr.length) {
                                    sb.append((char) ((i4 << 8) + ((getChar(bArr, i7) + i10) & 255)));
                                    i11--;
                                    i7++;
                                }
                            } else {
                                int i12 = i9 + 2;
                                while (i12 > 0 && i7 < bArr.length) {
                                    sb.append((char) getChar(bArr, i7));
                                    i12--;
                                    i7++;
                                }
                                i3 = i2;
                            }
                        }
                    } else {
                        sb.append((char) ((getChar(bArr, i3 + 1) << 8) + getChar(bArr, i3)));
                        i7++;
                        i3 += 2;
                    }
                    i6 = (i6 << 2) & 255;
                    i5 -= 2;
                } else {
                    i2 = i3 + 1;
                    sb.append((char) (getChar(bArr, i3) + (i4 << 8)));
                }
            } else {
                i2 = i3 + 1;
                sb.append((char) getChar(bArr, i3));
            }
            i7++;
            i3 = i2;
            i6 = (i6 << 2) & 255;
            i5 -= 2;
        }
        return sb.toString();
    }

    public static int getChar(byte[] bArr, int i) {
        return bArr[i] & 255;
    }
}

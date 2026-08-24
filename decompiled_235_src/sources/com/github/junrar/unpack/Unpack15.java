package com.github.junrar.unpack;

import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.vm.BitInput;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Unpack15 extends BitInput {
    private static final int STARTHF0 = 4;
    private static final int STARTHF1 = 5;
    private static final int STARTHF2 = 5;
    private static final int STARTHF3 = 6;
    private static final int STARTHF4 = 8;
    private static final int STARTL1 = 2;
    private static final int STARTL2 = 3;
    protected int AvrLn1;
    protected int AvrLn2;
    protected int AvrLn3;
    protected int AvrPlc;
    protected int AvrPlcB;
    protected int Buf60;
    protected int FlagBuf;
    protected int FlagsCnt;
    protected int LCount;
    protected int MaxDist3;
    protected int Nhfb;
    protected int Nlzb;
    protected int NumHuf;
    protected int StMode;
    protected long destUnpSize;
    protected int lastDist;
    protected int lastLength;
    protected int oldDistPtr;
    protected int readBorder;
    protected int readTop;
    protected boolean suspended;
    protected boolean unpAllBuf;
    protected ComprDataIO unpIO;
    protected int unpPtr;
    protected boolean unpSomeRead;
    protected byte[] window;
    protected int wrPtr;
    private static final int[] DecL1 = {32768, 40960, 49152, 53248, 57344, 59904, 60928, 61440, 61952, 61952, 65535};
    private static final int[] PosL1 = {0, 0, 0, 2, 3, 5, 7, 11, 16, 20, 24, 32, 32};
    private static final int[] DecL2 = {40960, 49152, 53248, 57344, 59904, 60928, 61440, 61952, 62016, 65535};
    private static final int[] PosL2 = {0, 0, 0, 0, 5, 7, 9, 13, 18, 22, 26, 34, 36};
    private static final int[] DecHf0 = {32768, 49152, 57344, 61952, 61952, 61952, 61952, 61952, 65535};
    private static final int[] PosHf0 = {0, 0, 0, 0, 0, 8, 16, 24, 33, 33, 33, 33, 33};
    private static final int[] DecHf1 = {8192, 49152, 57344, 61440, 61952, 61952, 63456, 65535};
    private static final int[] PosHf1 = {0, 0, 0, 0, 0, 0, 4, 44, 60, 76, 80, 80, 127};
    private static final int[] DecHf2 = {4096, 9216, 32768, 49152, 64000, 65535, 65535, 65535};
    private static final int[] PosHf2 = {0, 0, 0, 0, 0, 0, 2, 7, 53, 117, 233, 0, 0};
    private static final int[] DecHf3 = {2048, 9216, 60928, 65152, 65535, 65535, 65535};
    private static final int[] PosHf3 = {0, 0, 0, 0, 0, 0, 0, 2, 16, 218, 251, 0, 0};
    private static final int[] DecHf4 = {65280, 65535, 65535, 65535, 65535, 65535};
    private static final int[] PosHf4 = {0, 0, 0, 0, 0, 0, 0, 0, 0, 255, 0, 0, 0};
    static int[] ShortLen1 = {1, 3, 4, 4, 5, 6, 7, 8, 8, 4, 4, 5, 6, 6, 4, 0};
    static int[] ShortXor1 = {0, 160, 208, 224, 240, 248, 252, 254, 255, 192, 128, 144, 152, 156, 176};
    static int[] ShortLen2 = {2, 3, 3, 3, 4, 4, 5, 6, 6, 4, 4, 5, 6, 6, 4, 0};
    static int[] ShortXor2 = {0, 64, 96, 160, 208, 224, 240, 248, 252, 192, 128, 144, 152, 156, 176};
    protected int[] oldDist = new int[4];
    protected int[] ChSet = new int[256];
    protected int[] ChSetA = new int[256];
    protected int[] ChSetB = new int[256];
    protected int[] ChSetC = new int[256];
    protected int[] Place = new int[256];
    protected int[] PlaceA = new int[256];
    protected int[] PlaceB = new int[256];
    protected int[] PlaceC = new int[256];
    protected int[] NToPl = new int[256];
    protected int[] NToPlB = new int[256];
    protected int[] NToPlC = new int[256];

    private int getShortLen1(int i) {
        if (i == 1) {
            return this.Buf60 + 3;
        }
        return ShortLen1[i];
    }

    private int getShortLen2(int i) {
        if (i == 3) {
            return this.Buf60 + 3;
        }
        return ShortLen2[i];
    }

    public void corrHuff(int[] iArr, int[] iArr2) {
        int i = 0;
        for (int i2 = 7; i2 >= 0; i2--) {
            int i3 = 0;
            while (i3 < 32) {
                iArr[i] = (iArr[i] & (-256)) | i2;
                i3++;
                i++;
            }
        }
        Arrays.fill(iArr2, 0);
        for (int i4 = 6; i4 >= 0; i4--) {
            iArr2[i4] = (7 - i4) * 32;
        }
    }

    public int decodeNum(int i, int i2, int[] iArr, int[] iArr2) {
        int i3 = i & 65520;
        int i4 = 0;
        int i5 = 0;
        while (iArr[i5] <= i3) {
            i2++;
            i5++;
        }
        faddbits(i2);
        if (i5 != 0) {
            i4 = iArr[i5 - 1];
        }
        return ((i3 - i4) >>> (16 - i2)) + iArr2[i2];
    }

    public void getFlagsBuf() {
        int decodeNum = decodeNum(fgetbits(), 5, DecHf2, PosHf2);
        while (true) {
            int[] iArr = this.ChSetC;
            int i = iArr[decodeNum];
            this.FlagBuf = i >>> 8;
            int[] iArr2 = this.NToPlC;
            int i2 = i + 1;
            int i3 = i & 255;
            int i4 = iArr2[i3];
            iArr2[i3] = i4 + 1;
            if ((i2 & 255) != 0) {
                iArr[decodeNum] = iArr[i4];
                iArr[i4] = i2;
                return;
            }
            corrHuff(iArr, iArr2);
        }
    }

    public void huffDecode() {
        int decodeNum;
        int fgetbits = fgetbits();
        int i = this.AvrPlc;
        int i2 = 4;
        if (i > 30207) {
            decodeNum = decodeNum(fgetbits, 8, DecHf4, PosHf4);
        } else if (i > 24063) {
            decodeNum = decodeNum(fgetbits, 6, DecHf3, PosHf3);
        } else if (i > 13823) {
            decodeNum = decodeNum(fgetbits, 5, DecHf2, PosHf2);
        } else if (i > 3583) {
            decodeNum = decodeNum(fgetbits, 5, DecHf1, PosHf1);
        } else {
            decodeNum = decodeNum(fgetbits, 4, DecHf0, PosHf0);
        }
        int i3 = decodeNum & 255;
        if (this.StMode != 0) {
            if (i3 == 0 && fgetbits > 4095) {
                i3 = 256;
            }
            i3--;
            if (i3 == -1) {
                int fgetbits2 = fgetbits();
                faddbits(1);
                if ((32768 & fgetbits2) != 0) {
                    this.StMode = 0;
                    this.NumHuf = 0;
                    return;
                }
                if ((fgetbits2 & 16384) == 0) {
                    i2 = 3;
                }
                faddbits(1);
                faddbits(5);
                oldCopyString((decodeNum(fgetbits(), 5, DecHf2, PosHf2) << 5) | (fgetbits() >>> 11), i2);
                return;
            }
        } else {
            int i4 = this.NumHuf;
            this.NumHuf = i4 + 1;
            if (i4 >= 16 && this.FlagsCnt == 0) {
                this.StMode = 1;
            }
        }
        int i5 = this.AvrPlc + i3;
        this.AvrPlc = i5 - (i5 >>> 8);
        int i6 = this.Nhfb + 16;
        this.Nhfb = i6;
        if (i6 > 255) {
            this.Nhfb = 144;
            this.Nlzb >>>= 1;
        }
        byte[] bArr = this.window;
        int i7 = this.unpPtr;
        this.unpPtr = i7 + 1;
        bArr[i7] = (byte) (this.ChSet[i3] >>> 8);
        this.destUnpSize--;
        while (true) {
            int[] iArr = this.ChSet;
            int i8 = iArr[i3];
            int[] iArr2 = this.NToPl;
            int i9 = i8 + 1;
            int i10 = i8 & 255;
            int i11 = iArr2[i10];
            iArr2[i10] = i11 + 1;
            if ((i9 & 255) > 161) {
                corrHuff(iArr, iArr2);
            } else {
                iArr[i3] = iArr[i11];
                iArr[i11] = i9;
                return;
            }
        }
    }

    public void initHuff() {
        for (int i = 0; i < 256; i++) {
            int[] iArr = this.Place;
            int[] iArr2 = this.PlaceA;
            this.PlaceB[i] = i;
            iArr2[i] = i;
            iArr[i] = i;
            int[] iArr3 = this.PlaceC;
            int i2 = ((~i) + 1) & 255;
            iArr3[i] = i2;
            int[] iArr4 = this.ChSet;
            int i3 = i << 8;
            this.ChSetB[i] = i3;
            iArr4[i] = i3;
            this.ChSetA[i] = i;
            this.ChSetC[i] = i2 << 8;
        }
        Arrays.fill(this.NToPl, 0);
        Arrays.fill(this.NToPlB, 0);
        Arrays.fill(this.NToPlC, 0);
        corrHuff(this.ChSetB, this.NToPlB);
    }

    public void longLZ() {
        int decodeNum;
        int[] iArr;
        int i;
        int i2;
        int i3 = 0;
        this.NumHuf = 0;
        int i4 = this.Nlzb + 16;
        this.Nlzb = i4;
        if (i4 > 255) {
            this.Nlzb = 144;
            this.Nhfb >>>= 1;
        }
        int i5 = this.AvrLn2;
        int fgetbits = fgetbits();
        int i6 = this.AvrLn2;
        if (i6 >= 122) {
            fgetbits = decodeNum(fgetbits, 3, DecL2, PosL2);
        } else if (i6 >= 64) {
            fgetbits = decodeNum(fgetbits, 2, DecL1, PosL1);
        } else if (fgetbits < 256) {
            faddbits(16);
        } else {
            while (((fgetbits << i3) & 32768) == 0) {
                i3++;
            }
            faddbits(i3 + 1);
            fgetbits = i3;
        }
        int i7 = this.AvrLn2 + fgetbits;
        this.AvrLn2 = i7 - (i7 >>> 5);
        int fgetbits2 = fgetbits();
        int i8 = this.AvrPlcB;
        if (i8 > 10495) {
            decodeNum = decodeNum(fgetbits2, 5, DecHf2, PosHf2);
        } else if (i8 > 1791) {
            decodeNum = decodeNum(fgetbits2, 5, DecHf1, PosHf1);
        } else {
            decodeNum = decodeNum(fgetbits2, 4, DecHf0, PosHf0);
        }
        int i9 = this.AvrPlcB + decodeNum;
        this.AvrPlcB = i9 - (i9 >>> 8);
        while (true) {
            iArr = this.ChSetB;
            int i10 = iArr[decodeNum & 255];
            int[] iArr2 = this.NToPlB;
            i = i10 + 1;
            int i11 = i10 & 255;
            i2 = iArr2[i11];
            iArr2[i11] = i2 + 1;
            if ((i & 255) != 0) {
                break;
            }
            corrHuff(iArr, iArr2);
        }
        iArr[decodeNum] = iArr[i2];
        iArr[i2] = i;
        int fgetbits3 = ((65280 & i) | (fgetbits() >>> 8)) >>> 1;
        faddbits(7);
        int i12 = this.AvrLn3;
        if (fgetbits != 1 && fgetbits != 4) {
            if (fgetbits == 0 && fgetbits3 <= this.MaxDist3) {
                int i13 = i12 + 1;
                this.AvrLn3 = i13 - (i13 >>> 8);
            } else if (i12 > 0) {
                this.AvrLn3 = i12 - 1;
            }
        }
        int i14 = fgetbits + 3;
        if (fgetbits3 >= this.MaxDist3) {
            i14 = fgetbits + 4;
        }
        if (fgetbits3 <= 256) {
            i14 += 8;
        }
        if (i12 <= 176 && (this.AvrPlc < 10752 || i5 >= 64)) {
            this.MaxDist3 = 8193;
        } else {
            this.MaxDist3 = 32512;
        }
        int[] iArr3 = this.oldDist;
        int i15 = this.oldDistPtr;
        int i16 = i15 + 1;
        this.oldDistPtr = i16;
        iArr3[i15] = fgetbits3;
        this.oldDistPtr = i16 & 3;
        this.lastLength = i14;
        this.lastDist = fgetbits3;
        oldCopyString(fgetbits3, i14);
    }

    public void oldCopyString(int i, int i2) {
        this.destUnpSize -= i2;
        int i3 = this.unpPtr;
        int i4 = (i3 - i) & Compress.MAXWINMASK;
        if (i == 1) {
            byte[] bArr = this.window;
            Arrays.fill(bArr, i3, i3 + i2, bArr[i4]);
            this.unpPtr += i2;
        } else if (i4 + i2 <= i3) {
            byte[] bArr2 = this.window;
            System.arraycopy(bArr2, i4, bArr2, i3, i2);
            this.unpPtr += i2;
        } else {
            while (true) {
                int i5 = i2 - 1;
                if (i2 != 0) {
                    byte[] bArr3 = this.window;
                    int i6 = this.unpPtr;
                    bArr3[i6] = bArr3[i4];
                    this.unpPtr = (i6 + 1) & Compress.MAXWINMASK;
                    i4 = (i4 + 1) & Compress.MAXWINMASK;
                    i2 = i5;
                } else {
                    return;
                }
            }
        }
    }

    public void oldUnpInitData(boolean z) {
        if (!z) {
            this.Buf60 = 0;
            this.NumHuf = 0;
            this.AvrLn3 = 0;
            this.AvrLn2 = 0;
            this.AvrLn1 = 0;
            this.AvrPlcB = 0;
            this.AvrPlc = 13568;
            this.MaxDist3 = 8193;
            this.Nlzb = 128;
            this.Nhfb = 128;
        }
        this.FlagsCnt = 0;
        this.FlagBuf = 0;
        this.StMode = 0;
        this.LCount = 0;
        this.readTop = 0;
    }

    public void oldUnpWriteBuf() {
        int i = this.unpPtr;
        int i2 = this.wrPtr;
        if (i != i2) {
            this.unpSomeRead = true;
        }
        ComprDataIO comprDataIO = this.unpIO;
        if (i < i2) {
            comprDataIO.unpWrite(this.window, i2, (-i2) & Compress.MAXWINMASK);
            this.unpIO.unpWrite(this.window, 0, this.unpPtr);
            this.unpAllBuf = true;
        } else {
            comprDataIO.unpWrite(this.window, i2, i - i2);
        }
        this.wrPtr = this.unpPtr;
    }

    public void shortLZ() {
        int i;
        this.NumHuf = 0;
        int fgetbits = fgetbits();
        if (this.LCount == 2) {
            faddbits(1);
            if (fgetbits >= 32768) {
                oldCopyString(this.lastDist, this.lastLength);
                return;
            } else {
                fgetbits <<= 1;
                this.LCount = 0;
            }
        }
        int i2 = fgetbits >>> 8;
        if (this.AvrLn1 < 37) {
            i = 0;
            while (((ShortXor1[i] ^ i2) & (~(255 >>> getShortLen1(i)))) != 0) {
                i++;
            }
            faddbits(getShortLen1(i));
        } else {
            i = 0;
            while (((ShortXor2[i] ^ i2) & (~(255 >>> getShortLen2(i)))) != 0) {
                i++;
            }
            faddbits(getShortLen2(i));
        }
        if (i >= 9) {
            if (i == 9) {
                this.LCount++;
                oldCopyString(this.lastDist, this.lastLength);
                return;
            } else if (i == 14) {
                this.LCount = 0;
                int decodeNum = decodeNum(fgetbits(), 3, DecL2, PosL2) + 5;
                int fgetbits2 = (fgetbits() >>> 1) | 32768;
                faddbits(15);
                this.lastLength = decodeNum;
                this.lastDist = fgetbits2;
                oldCopyString(fgetbits2, decodeNum);
                return;
            } else {
                this.LCount = 0;
                int i3 = this.oldDist[(this.oldDistPtr - (i - 9)) & 3];
                int decodeNum2 = decodeNum(fgetbits(), 2, DecL1, PosL1);
                int i4 = decodeNum2 + 2;
                if (i4 == 257 && i == 10) {
                    this.Buf60 ^= 1;
                    return;
                }
                if (i3 > 256) {
                    i4 = decodeNum2 + 3;
                }
                if (i3 >= this.MaxDist3) {
                    i4++;
                }
                int[] iArr = this.oldDist;
                int i5 = this.oldDistPtr;
                int i6 = i5 + 1;
                this.oldDistPtr = i6;
                iArr[i5] = i3;
                this.oldDistPtr = i6 & 3;
                this.lastLength = i4;
                this.lastDist = i3;
                oldCopyString(i3, i4);
                return;
            }
        }
        this.LCount = 0;
        int i7 = this.AvrLn1 + i;
        this.AvrLn1 = i7 - (i7 >>> 4);
        int decodeNum3 = decodeNum(fgetbits(), 5, DecHf2, PosHf2) & 255;
        int[] iArr2 = this.ChSetA;
        int i8 = iArr2[decodeNum3];
        int i9 = decodeNum3 - 1;
        if (i9 != -1) {
            int[] iArr3 = this.PlaceA;
            iArr3[i8] = iArr3[i8] - 1;
            int i10 = iArr2[i9];
            iArr3[i10] = iArr3[i10] + 1;
            iArr2[decodeNum3] = i10;
            iArr2[i9] = i8;
        }
        int i11 = i + 2;
        int[] iArr4 = this.oldDist;
        int i12 = this.oldDistPtr;
        int i13 = i12 + 1;
        this.oldDistPtr = i13;
        int i14 = i8 + 1;
        iArr4[i12] = i14;
        this.oldDistPtr = i13 & 3;
        this.lastLength = i11;
        this.lastDist = i14;
        oldCopyString(i14, i11);
    }

    public abstract void unpInitData(boolean z);

    public boolean unpReadBuf() {
        int i = this.readTop;
        int i2 = this.inAddr;
        int i3 = i - i2;
        if (i3 < 0) {
            return false;
        }
        if (i2 > 16384) {
            if (i3 > 0) {
                byte[] bArr = this.inBuf;
                System.arraycopy(bArr, i2, bArr, 0, i3);
            }
            this.inAddr = 0;
            this.readTop = i3;
            i = i3;
        }
        int unpRead = this.unpIO.unpRead(this.inBuf, i, (32768 - i) & (-16));
        if (unpRead > 0) {
            this.readTop += unpRead;
        }
        this.readBorder = this.readTop - 30;
        if (unpRead == -1) {
            return false;
        }
        return true;
    }

    public void unpack15(boolean z) {
        if (this.suspended) {
            this.unpPtr = this.wrPtr;
        } else {
            unpInitData(z);
            oldUnpInitData(z);
            unpReadBuf();
            if (!z) {
                initHuff();
                this.unpPtr = 0;
            } else {
                this.unpPtr = this.wrPtr;
            }
            this.destUnpSize--;
        }
        if (this.destUnpSize >= 0) {
            getFlagsBuf();
            this.FlagsCnt = 8;
        }
        while (this.destUnpSize >= 0) {
            this.unpPtr &= Compress.MAXWINMASK;
            if (this.inAddr > this.readTop - 30 && !unpReadBuf()) {
                break;
            }
            int i = this.wrPtr;
            int i2 = this.unpPtr;
            if ((4194303 & (i - i2)) < 270 && i != i2) {
                oldUnpWriteBuf();
                if (this.suspended) {
                    return;
                }
            }
            if (this.StMode != 0) {
                huffDecode();
            } else {
                int i3 = this.FlagsCnt - 1;
                this.FlagsCnt = i3;
                if (i3 < 0) {
                    getFlagsBuf();
                    this.FlagsCnt = 7;
                }
                int i4 = this.FlagBuf;
                if ((i4 & 128) != 0) {
                    this.FlagBuf = i4 << 1;
                    if (this.Nlzb > this.Nhfb) {
                        longLZ();
                    } else {
                        huffDecode();
                    }
                } else {
                    this.FlagBuf = i4 << 1;
                    int i5 = this.FlagsCnt - 1;
                    this.FlagsCnt = i5;
                    if (i5 < 0) {
                        getFlagsBuf();
                        this.FlagsCnt = 7;
                    }
                    int i6 = this.FlagBuf;
                    if ((i6 & 128) != 0) {
                        this.FlagBuf = i6 << 1;
                        if (this.Nlzb > this.Nhfb) {
                            huffDecode();
                        } else {
                            longLZ();
                        }
                    } else {
                        this.FlagBuf = i6 << 1;
                        shortLZ();
                    }
                }
            }
        }
        oldUnpWriteBuf();
    }
}

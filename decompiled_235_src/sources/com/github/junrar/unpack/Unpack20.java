package com.github.junrar.unpack;

import com.github.junrar.unpack.decode.AudioVariables;
import com.github.junrar.unpack.decode.BitDecode;
import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.decode.Decode;
import com.github.junrar.unpack.decode.DistDecode;
import com.github.junrar.unpack.decode.LitDecode;
import com.github.junrar.unpack.decode.LowDistDecode;
import com.github.junrar.unpack.decode.MultDecode;
import com.github.junrar.unpack.decode.RepDecode;
import java.util.Arrays;
import me.magnum.melonds.impl.emulator.debug.RendererDebugBridge;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Unpack20 extends Unpack15 {
    protected int UnpAudioBlock;
    protected int UnpChannelDelta;
    protected int UnpChannels;
    protected int UnpCurChannel;
    public static final int[] LDecode = {0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224};
    public static final byte[] LBits = {0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5};
    public static final int[] DDecode = {0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, RendererDebugBridge.CAPTURE_HEIGHT, 512, 768, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576, 32768, 49152, 65536, 98304, 131072, 196608, 262144, 327680, 393216, 458752, 524288, 589824, 655360, 720896, 786432, 851968, 917504, 983040};
    public static final int[] DBits = {0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16};
    public static final int[] SDDecode = {0, 4, 8, 16, 32, 64, 128, 192};
    public static final int[] SDBits = {2, 2, 3, 4, 5, 6, 6, 6};
    protected MultDecode[] MD = new MultDecode[4];
    protected byte[] UnpOldTable20 = new byte[1028];
    protected AudioVariables[] AudV = new AudioVariables[4];
    protected LitDecode LD = new LitDecode();
    protected DistDecode DD = new DistDecode();
    protected LowDistDecode LDD = new LowDistDecode();
    protected RepDecode RD = new RepDecode();
    protected BitDecode BD = new BitDecode();

    public void CopyString20(int i, int i2) {
        int[] iArr = this.oldDist;
        int i3 = this.oldDistPtr;
        this.oldDistPtr = i3 + 1;
        iArr[i3 & 3] = i2;
        this.lastDist = i2;
        this.lastLength = i;
        this.destUnpSize -= i;
        int i4 = this.unpPtr;
        int i5 = i4 - i2;
        if (i5 < 4194004 && i4 < 4194004) {
            int i6 = i5 + i;
            byte[] bArr = this.window;
            if (i6 <= i4) {
                System.arraycopy(bArr, i5, bArr, i4, i);
                this.unpPtr += i;
                return;
            }
            int i7 = i4 + 1;
            this.unpPtr = i7;
            int i8 = i5 + 1;
            bArr[i4] = bArr[i5];
            this.unpPtr = i4 + 2;
            int i9 = i5 + 2;
            bArr[i7] = bArr[i8];
            while (i > 2) {
                i--;
                byte[] bArr2 = this.window;
                int i10 = this.unpPtr;
                this.unpPtr = i10 + 1;
                bArr2[i10] = bArr2[i9];
                i9++;
            }
            return;
        }
        while (true) {
            int i11 = i - 1;
            if (i != 0) {
                byte[] bArr3 = this.window;
                int i12 = this.unpPtr;
                bArr3[i12] = bArr3[i5 & Compress.MAXWINMASK];
                this.unpPtr = (i12 + 1) & Compress.MAXWINMASK;
                i = i11;
                i5++;
            } else {
                return;
            }
        }
    }

    public byte DecodeAudio(int i) {
        AudioVariables audioVariables = this.AudV[this.UnpCurChannel];
        audioVariables.setByteCount(audioVariables.getByteCount() + 1);
        audioVariables.setD4(audioVariables.getD3());
        audioVariables.setD3(audioVariables.getD2());
        audioVariables.setD2(audioVariables.getLastDelta() - audioVariables.getD1());
        audioVariables.setD1(audioVariables.getLastDelta());
        int k5 = (((((audioVariables.getK5() * this.UnpChannelDelta) + (audioVariables.getD4() * audioVariables.getK4())) + (((audioVariables.getD3() * audioVariables.getK3()) + (audioVariables.getD2() * audioVariables.getK2())) + ((audioVariables.getD1() * audioVariables.getK1()) + (audioVariables.getLastChar() * 8)))) >>> 3) & 255) - i;
        int i2 = ((byte) i) << 3;
        int[] dif = audioVariables.getDif();
        dif[0] = Math.abs(i2) + dif[0];
        int[] dif2 = audioVariables.getDif();
        dif2[1] = Math.abs(i2 - audioVariables.getD1()) + dif2[1];
        int[] dif3 = audioVariables.getDif();
        dif3[2] = Math.abs(audioVariables.getD1() + i2) + dif3[2];
        int[] dif4 = audioVariables.getDif();
        dif4[3] = Math.abs(i2 - audioVariables.getD2()) + dif4[3];
        int[] dif5 = audioVariables.getDif();
        dif5[4] = Math.abs(audioVariables.getD2() + i2) + dif5[4];
        int[] dif6 = audioVariables.getDif();
        dif6[5] = Math.abs(i2 - audioVariables.getD3()) + dif6[5];
        int[] dif7 = audioVariables.getDif();
        dif7[6] = Math.abs(audioVariables.getD3() + i2) + dif7[6];
        int[] dif8 = audioVariables.getDif();
        dif8[7] = Math.abs(i2 - audioVariables.getD4()) + dif8[7];
        int[] dif9 = audioVariables.getDif();
        dif9[8] = Math.abs(audioVariables.getD4() + i2) + dif9[8];
        int[] dif10 = audioVariables.getDif();
        dif10[9] = Math.abs(i2 - this.UnpChannelDelta) + dif10[9];
        int[] dif11 = audioVariables.getDif();
        dif11[10] = Math.abs(i2 + this.UnpChannelDelta) + dif11[10];
        audioVariables.setLastDelta((byte) (k5 - audioVariables.getLastChar()));
        this.UnpChannelDelta = audioVariables.getLastDelta();
        audioVariables.setLastChar(k5);
        if ((audioVariables.getByteCount() & 31) == 0) {
            int i3 = audioVariables.getDif()[0];
            audioVariables.getDif()[0] = 0;
            int i4 = 0;
            for (int i5 = 1; i5 < audioVariables.getDif().length; i5++) {
                if (audioVariables.getDif()[i5] < i3) {
                    i3 = audioVariables.getDif()[i5];
                    i4 = i5;
                }
                audioVariables.getDif()[i5] = 0;
            }
            switch (i4) {
                case 1:
                    if (audioVariables.getK1() >= -16) {
                        audioVariables.setK1(audioVariables.getK1() - 1);
                        break;
                    }
                    break;
                case 2:
                    if (audioVariables.getK1() < 16) {
                        audioVariables.setK1(audioVariables.getK1() + 1);
                        break;
                    }
                    break;
                case 3:
                    if (audioVariables.getK2() >= -16) {
                        audioVariables.setK2(audioVariables.getK2() - 1);
                        break;
                    }
                    break;
                case 4:
                    if (audioVariables.getK2() < 16) {
                        audioVariables.setK2(audioVariables.getK2() + 1);
                        break;
                    }
                    break;
                case 5:
                    if (audioVariables.getK3() >= -16) {
                        audioVariables.setK3(audioVariables.getK3() - 1);
                        break;
                    }
                    break;
                case 6:
                    if (audioVariables.getK3() < 16) {
                        audioVariables.setK3(audioVariables.getK3() + 1);
                        break;
                    }
                    break;
                case 7:
                    if (audioVariables.getK4() >= -16) {
                        audioVariables.setK4(audioVariables.getK4() - 1);
                        break;
                    }
                    break;
                case 8:
                    if (audioVariables.getK4() < 16) {
                        audioVariables.setK4(audioVariables.getK4() + 1);
                        break;
                    }
                    break;
                case 9:
                    if (audioVariables.getK5() >= -16) {
                        audioVariables.setK5(audioVariables.getK5() - 1);
                        break;
                    }
                    break;
                case 10:
                    if (audioVariables.getK5() < 16) {
                        audioVariables.setK5(audioVariables.getK5() + 1);
                        break;
                    }
                    break;
            }
        }
        return (byte) k5;
    }

    public void ReadLastTables() {
        if (this.readTop >= this.inAddr + 5) {
            if (this.UnpAudioBlock != 0) {
                if (decodeNumber(this.MD[this.UnpCurChannel]) == 256) {
                    ReadTables20();
                }
            } else if (decodeNumber(this.LD) == 269) {
                ReadTables20();
            }
        }
    }

    public boolean ReadTables20() {
        int i;
        int i2;
        byte[] bArr = new byte[19];
        byte[] bArr2 = new byte[1028];
        if (this.inAddr > this.readTop - 25 && !unpReadBuf()) {
            return false;
        }
        int i3 = getbits();
        this.UnpAudioBlock = 32768 & i3;
        if ((i3 & 16384) == 0) {
            Arrays.fill(this.UnpOldTable20, (byte) 0);
        }
        addbits(2);
        if (this.UnpAudioBlock != 0) {
            int i4 = ((i3 >>> 12) & 3) + 1;
            this.UnpChannels = i4;
            if (this.UnpCurChannel >= i4) {
                this.UnpCurChannel = 0;
            }
            addbits(2);
            i = this.UnpChannels * Compress.MC20;
        } else {
            i = 374;
        }
        for (int i5 = 0; i5 < 19; i5++) {
            bArr[i5] = (byte) (getbits() >>> 12);
            addbits(4);
        }
        makeDecodeTables(bArr, 0, this.BD, 19);
        int i6 = 0;
        while (true) {
            int i7 = this.inAddr;
            if (i6 < i) {
                if (i7 > this.readTop - 5 && !unpReadBuf()) {
                    return false;
                }
                int decodeNumber = decodeNumber(this.BD);
                if (decodeNumber < 16) {
                    bArr2[i6] = (byte) ((decodeNumber + this.UnpOldTable20[i6]) & 15);
                    i6++;
                } else if (decodeNumber == 16) {
                    int i8 = (getbits() >>> 14) + 3;
                    addbits(2);
                    while (true) {
                        int i9 = i8 - 1;
                        if (i8 > 0 && i6 < i) {
                            bArr2[i6] = bArr2[i6 - 1];
                            i6++;
                            i8 = i9;
                        }
                    }
                } else {
                    if (decodeNumber == 17) {
                        i2 = (getbits() >>> 13) + 3;
                        addbits(3);
                    } else {
                        i2 = (getbits() >>> 9) + 11;
                        addbits(7);
                    }
                    while (true) {
                        int i10 = i2 - 1;
                        if (i2 > 0 && i6 < i) {
                            bArr2[i6] = 0;
                            i6++;
                            i2 = i10;
                        }
                    }
                }
            } else if (i7 > this.readTop) {
                return true;
            } else {
                if (this.UnpAudioBlock != 0) {
                    for (int i11 = 0; i11 < this.UnpChannels; i11++) {
                        makeDecodeTables(bArr2, i11 * Compress.MC20, this.MD[i11], Compress.MC20);
                    }
                } else {
                    makeDecodeTables(bArr2, 0, this.LD, Compress.NC20);
                    makeDecodeTables(bArr2, Compress.NC20, this.DD, 48);
                    makeDecodeTables(bArr2, 346, this.RD, 28);
                }
                byte[] bArr3 = this.UnpOldTable20;
                System.arraycopy(bArr2, 0, bArr3, 0, bArr3.length);
                return true;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002e, code lost:
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0036, code lost:
        if (r0 < r2[3]) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        if (r0 < r2[5]) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0050, code lost:
        if (r0 < r2[7]) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006c, code lost:
        if (r0 < r2[9]) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0076, code lost:
        if (r0 < r2[11]) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0089, code lost:
        if (r0 < r2[13]) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x002c, code lost:
        if (r0 < r2[1]) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int decodeNumber(Decode decode) {
        int i;
        long j = getbits() & 65534;
        int[] decodeLen = decode.getDecodeLen();
        int i2 = 8;
        if (j < decodeLen[8]) {
            i = 4;
            if (j < decodeLen[4]) {
                i2 = 2;
                if (j < decodeLen[2]) {
                    i = 1;
                } else {
                    i2 = 3;
                }
            } else {
                i = 6;
                if (j < decodeLen[6]) {
                    i2 = 5;
                } else {
                    i = 7;
                }
            }
        } else {
            i2 = 12;
            if (j < decodeLen[12]) {
                i = 10;
                if (j < decodeLen[10]) {
                    i2 = 9;
                } else {
                    i = 11;
                }
            } else {
                i2 = 14;
                if (j < decodeLen[14]) {
                    i = 13;
                } else {
                    i2 = 15;
                }
            }
        }
        addbits(i2);
        int i3 = decode.getDecodePos()[i2] + ((((int) j) - decodeLen[i2 - 1]) >>> (16 - i2));
        if (i3 >= decode.getMaxNum()) {
            i3 = 0;
        }
        return decode.getDecodeNum()[i3];
    }

    public void makeDecodeTables(byte[] bArr, int i, Decode decode, int i2) {
        int i3;
        int[] iArr = new int[16];
        int[] iArr2 = new int[16];
        Arrays.fill(iArr, 0);
        Arrays.fill(decode.getDecodeNum(), 0);
        int i4 = 0;
        while (true) {
            if (i4 >= i2) {
                break;
            }
            int i5 = bArr[i + i4] & 15;
            iArr[i5] = iArr[i5] + 1;
            i4++;
        }
        iArr[0] = 0;
        iArr2[0] = 0;
        decode.getDecodePos()[0] = 0;
        decode.getDecodeLen()[0] = 0;
        long j = 0;
        for (i3 = 1; i3 < 16; i3++) {
            j = (j + iArr[i3]) * 2;
            long j2 = j << (15 - i3);
            if (j2 > 65535) {
                j2 = 65535;
            }
            decode.getDecodeLen()[i3] = (int) j2;
            int[] decodePos = decode.getDecodePos();
            int i6 = i3 - 1;
            int i7 = decode.getDecodePos()[i6] + iArr[i6];
            decodePos[i3] = i7;
            iArr2[i3] = i7;
        }
        for (int i8 = 0; i8 < i2; i8++) {
            int i9 = i + i8;
            if (bArr[i9] != 0) {
                int[] decodeNum = decode.getDecodeNum();
                int i10 = bArr[i9] & 15;
                int i11 = iArr2[i10];
                iArr2[i10] = i11 + 1;
                decodeNum[i11] = i8;
            }
        }
        decode.setMaxNum(i2);
    }

    public void unpInitData20(boolean z) {
        if (!z) {
            int i = 0;
            this.UnpCurChannel = 0;
            this.UnpChannelDelta = 0;
            this.UnpChannels = 1;
            int i2 = 0;
            while (true) {
                AudioVariables[] audioVariablesArr = this.AudV;
                if (i2 >= audioVariablesArr.length) {
                    break;
                }
                audioVariablesArr[i2] = new AudioVariables();
                i2++;
            }
            Arrays.fill(this.UnpOldTable20, (byte) 0);
            while (true) {
                MultDecode[] multDecodeArr = this.MD;
                if (i < multDecodeArr.length) {
                    multDecodeArr[i] = new MultDecode();
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public void unpack20(boolean z) {
        if (this.suspended) {
            this.unpPtr = this.wrPtr;
        } else {
            unpInitData(z);
            if (unpReadBuf()) {
                if (z || ReadTables20()) {
                    this.destUnpSize--;
                } else {
                    return;
                }
            } else {
                return;
            }
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
            if (this.UnpAudioBlock != 0) {
                int decodeNumber = decodeNumber(this.MD[this.UnpCurChannel]);
                if (decodeNumber == 256) {
                    if (!ReadTables20()) {
                        break;
                    }
                } else {
                    byte[] bArr = this.window;
                    int i3 = this.unpPtr;
                    this.unpPtr = i3 + 1;
                    bArr[i3] = DecodeAudio(decodeNumber);
                    int i4 = this.UnpCurChannel + 1;
                    this.UnpCurChannel = i4;
                    if (i4 == this.UnpChannels) {
                        this.UnpCurChannel = 0;
                    }
                    this.destUnpSize--;
                }
            } else {
                int decodeNumber2 = decodeNumber(this.LD);
                if (decodeNumber2 < 256) {
                    byte[] bArr2 = this.window;
                    int i5 = this.unpPtr;
                    this.unpPtr = i5 + 1;
                    bArr2[i5] = (byte) decodeNumber2;
                    this.destUnpSize--;
                } else if (decodeNumber2 > 269) {
                    int i6 = decodeNumber2 - 270;
                    int i7 = LDecode[i6] + 3;
                    byte b = LBits[i6];
                    if (b > 0) {
                        i7 += getbits() >>> (16 - b);
                        addbits(b);
                    }
                    int decodeNumber3 = decodeNumber(this.DD);
                    int i8 = DDecode[decodeNumber3] + 1;
                    int i9 = DBits[decodeNumber3];
                    if (i9 > 0) {
                        i8 += getbits() >>> (16 - i9);
                        addbits(i9);
                    }
                    if (i8 >= 8192) {
                        int i10 = i7 + 1;
                        if (i8 >= 262144) {
                            i7 += 2;
                        } else {
                            i7 = i10;
                        }
                    }
                    CopyString20(i7, i8);
                } else if (decodeNumber2 == 269) {
                    if (!ReadTables20()) {
                        break;
                    }
                } else if (decodeNumber2 == 256) {
                    CopyString20(this.lastLength, this.lastDist);
                } else if (decodeNumber2 < 261) {
                    int i11 = this.oldDist[(this.oldDistPtr - (decodeNumber2 - 256)) & 3];
                    int decodeNumber4 = decodeNumber(this.RD);
                    int i12 = LDecode[decodeNumber4] + 2;
                    byte b2 = LBits[decodeNumber4];
                    if (b2 > 0) {
                        i12 += getbits() >>> (16 - b2);
                        addbits(b2);
                    }
                    if (i11 >= 257) {
                        int i13 = i12 + 1;
                        if (i11 >= 8192) {
                            i13 = i12 + 2;
                            if (i11 >= 262144) {
                                i12 += 3;
                            }
                        }
                        i12 = i13;
                    }
                    CopyString20(i12, i11);
                } else if (decodeNumber2 < 270) {
                    int i14 = decodeNumber2 - 261;
                    int i15 = SDDecode[i14] + 1;
                    int i16 = SDBits[i14];
                    if (i16 > 0) {
                        i15 += getbits() >>> (16 - i16);
                        addbits(i16);
                    }
                    CopyString20(2, i15);
                }
            }
        }
        ReadLastTables();
        oldUnpWriteBuf();
    }
}

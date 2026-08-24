package com.github.junrar.unpack;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Unpack15 extends com.github.junrar.unpack.vm.BitInput {
    private static final int[] DecHf0 = null;
    private static final int[] DecHf1 = null;
    private static final int[] DecHf2 = null;
    private static final int[] DecHf3 = null;
    private static final int[] DecHf4 = null;
    private static final int[] DecL1 = null;
    private static final int[] DecL2 = null;
    private static final int[] PosHf0 = null;
    private static final int[] PosHf1 = null;
    private static final int[] PosHf2 = null;
    private static final int[] PosHf3 = null;
    private static final int[] PosHf4 = null;
    private static final int[] PosL1 = null;
    private static final int[] PosL2 = null;
    private static final int STARTHF0 = 4;
    private static final int STARTHF1 = 5;
    private static final int STARTHF2 = 5;
    private static final int STARTHF3 = 6;
    private static final int STARTHF4 = 8;
    private static final int STARTL1 = 2;
    private static final int STARTL2 = 3;
    static int[] ShortLen1;
    static int[] ShortLen2;
    static int[] ShortXor1;
    static int[] ShortXor2;
    protected int AvrLn1;
    protected int AvrLn2;
    protected int AvrLn3;
    protected int AvrPlc;
    protected int AvrPlcB;
    protected int Buf60;
    protected int[] ChSet;
    protected int[] ChSetA;
    protected int[] ChSetB;
    protected int[] ChSetC;
    protected int FlagBuf;
    protected int FlagsCnt;
    protected int LCount;
    protected int MaxDist3;
    protected int[] NToPl;
    protected int[] NToPlB;
    protected int[] NToPlC;
    protected int Nhfb;
    protected int Nlzb;
    protected int NumHuf;
    protected int[] Place;
    protected int[] PlaceA;
    protected int[] PlaceB;
    protected int[] PlaceC;
    protected int StMode;
    protected long destUnpSize;
    protected int lastDist;
    protected int lastLength;
    protected int[] oldDist;
    protected int oldDistPtr;
    protected int readBorder;
    protected int readTop;
    protected boolean suspended;
    protected boolean unpAllBuf;
    protected com.github.junrar.unpack.ComprDataIO unpIO;
    protected int unpPtr;
    protected boolean unpSomeRead;
    protected byte[] window;
    protected int wrPtr;

    static {
            r0 = 11
            int[] r0 = new int[r0]
            r0 = {x0092: FILL_ARRAY_DATA  , data: [32768, 40960, 49152, 53248, 57344, 59904, 60928, 61440, 61952, 61952, 65535} // fill-array
            com.github.junrar.unpack.Unpack15.DecL1 = r0
            r0 = 13
            int[] r1 = new int[r0]
            r1 = {x00ac: FILL_ARRAY_DATA  , data: [0, 0, 0, 2, 3, 5, 7, 11, 16, 20, 24, 32, 32} // fill-array
            com.github.junrar.unpack.Unpack15.PosL1 = r1
            r1 = 10
            int[] r1 = new int[r1]
            r1 = {x00ca: FILL_ARRAY_DATA  , data: [40960, 49152, 53248, 57344, 59904, 60928, 61440, 61952, 62016, 65535} // fill-array
            com.github.junrar.unpack.Unpack15.DecL2 = r1
            int[] r1 = new int[r0]
            r1 = {x00e2: FILL_ARRAY_DATA  , data: [0, 0, 0, 0, 5, 7, 9, 13, 18, 22, 26, 34, 36} // fill-array
            com.github.junrar.unpack.Unpack15.PosL2 = r1
            r1 = 9
            int[] r1 = new int[r1]
            r1 = {x0100: FILL_ARRAY_DATA  , data: [32768, 49152, 57344, 61952, 61952, 61952, 61952, 61952, 65535} // fill-array
            com.github.junrar.unpack.Unpack15.DecHf0 = r1
            int[] r1 = new int[r0]
            r1 = {x0116: FILL_ARRAY_DATA  , data: [0, 0, 0, 0, 0, 8, 16, 24, 33, 33, 33, 33, 33} // fill-array
            com.github.junrar.unpack.Unpack15.PosHf0 = r1
            r1 = 8
            int[] r2 = new int[r1]
            r2 = {x0134: FILL_ARRAY_DATA  , data: [8192, 49152, 57344, 61440, 61952, 61952, 63456, 65535} // fill-array
            com.github.junrar.unpack.Unpack15.DecHf1 = r2
            int[] r2 = new int[r0]
            r2 = {x0148: FILL_ARRAY_DATA  , data: [0, 0, 0, 0, 0, 0, 4, 44, 60, 76, 80, 80, 127} // fill-array
            com.github.junrar.unpack.Unpack15.PosHf1 = r2
            int[] r1 = new int[r1]
            r1 = {x0166: FILL_ARRAY_DATA  , data: [4096, 9216, 32768, 49152, 64000, 65535, 65535, 65535} // fill-array
            com.github.junrar.unpack.Unpack15.DecHf2 = r1
            int[] r1 = new int[r0]
            r1 = {x017a: FILL_ARRAY_DATA  , data: [0, 0, 0, 0, 0, 0, 2, 7, 53, 117, 233, 0, 0} // fill-array
            com.github.junrar.unpack.Unpack15.PosHf2 = r1
            r1 = 7
            int[] r1 = new int[r1]
            r1 = {x0198: FILL_ARRAY_DATA  , data: [2048, 9216, 60928, 65152, 65535, 65535, 65535} // fill-array
            com.github.junrar.unpack.Unpack15.DecHf3 = r1
            int[] r1 = new int[r0]
            r1 = {x01aa: FILL_ARRAY_DATA  , data: [0, 0, 0, 0, 0, 0, 0, 2, 16, 218, 251, 0, 0} // fill-array
            com.github.junrar.unpack.Unpack15.PosHf3 = r1
            r1 = 6
            int[] r1 = new int[r1]
            r1 = {x01c8: FILL_ARRAY_DATA  , data: [65280, 65535, 65535, 65535, 65535, 65535} // fill-array
            com.github.junrar.unpack.Unpack15.DecHf4 = r1
            int[] r0 = new int[r0]
            r0 = {x01d8: FILL_ARRAY_DATA  , data: [0, 0, 0, 0, 0, 0, 0, 0, 0, 255, 0, 0, 0} // fill-array
            com.github.junrar.unpack.Unpack15.PosHf4 = r0
            r0 = 16
            int[] r1 = new int[r0]
            r1 = {x01f6: FILL_ARRAY_DATA  , data: [1, 3, 4, 4, 5, 6, 7, 8, 8, 4, 4, 5, 6, 6, 4, 0} // fill-array
            com.github.junrar.unpack.Unpack15.ShortLen1 = r1
            r1 = 15
            int[] r1 = new int[r1]
            r1 = {x021a: FILL_ARRAY_DATA  , data: [0, 160, 208, 224, 240, 248, 252, 254, 255, 192, 128, 144, 152, 156, 176} // fill-array
            com.github.junrar.unpack.Unpack15.ShortXor1 = r1
            int[] r0 = new int[r0]
            r0 = {x023c: FILL_ARRAY_DATA  , data: [2, 3, 3, 3, 4, 4, 5, 6, 6, 4, 4, 5, 6, 6, 4, 0} // fill-array
            com.github.junrar.unpack.Unpack15.ShortLen2 = r0
            r0 = 15
            int[] r0 = new int[r0]
            r0 = {x0260: FILL_ARRAY_DATA  , data: [0, 64, 96, 160, 208, 224, 240, 248, 252, 192, 128, 144, 152, 156, 176} // fill-array
            com.github.junrar.unpack.Unpack15.ShortXor2 = r0
            return
    }

    public Unpack15() {
            r2 = this;
            r2.<init>()
            r0 = 4
            int[] r0 = new int[r0]
            r2.oldDist = r0
            r0 = 256(0x100, float:3.59E-43)
            int[] r1 = new int[r0]
            r2.ChSet = r1
            int[] r1 = new int[r0]
            r2.ChSetA = r1
            int[] r1 = new int[r0]
            r2.ChSetB = r1
            int[] r1 = new int[r0]
            r2.ChSetC = r1
            int[] r1 = new int[r0]
            r2.Place = r1
            int[] r1 = new int[r0]
            r2.PlaceA = r1
            int[] r1 = new int[r0]
            r2.PlaceB = r1
            int[] r1 = new int[r0]
            r2.PlaceC = r1
            int[] r1 = new int[r0]
            r2.NToPl = r1
            int[] r1 = new int[r0]
            r2.NToPlB = r1
            int[] r0 = new int[r0]
            r2.NToPlC = r0
            return
    }

    private int getShortLen1(int r2) {
            r1 = this;
            r0 = 1
            if (r2 != r0) goto L8
            int r1 = r1.Buf60
            int r1 = r1 + 3
            return r1
        L8:
            int[] r1 = com.github.junrar.unpack.Unpack15.ShortLen1
            r1 = r1[r2]
            return r1
    }

    private int getShortLen2(int r2) {
            r1 = this;
            r0 = 3
            if (r2 != r0) goto L7
            int r1 = r1.Buf60
            int r1 = r1 + r0
            return r1
        L7:
            int[] r1 = com.github.junrar.unpack.Unpack15.ShortLen2
            r1 = r1[r2]
            return r1
    }

    public void corrHuff(int[] r6, int[] r7) {
            r5 = this;
            r5 = 0
            r0 = 7
            r1 = r5
        L3:
            r2 = 32
            if (r0 < 0) goto L19
            r3 = r5
        L8:
            if (r3 >= r2) goto L16
            r4 = r6[r1]
            r4 = r4 & (-256(0xffffffffffffff00, float:NaN))
            r4 = r4 | r0
            r6[r1] = r4
            int r3 = r3 + 1
            int r1 = r1 + 1
            goto L8
        L16:
            int r0 = r0 + (-1)
            goto L3
        L19:
            java.util.Arrays.fill(r7, r5)
            r5 = 6
        L1d:
            if (r5 < 0) goto L27
            int r6 = 7 - r5
            int r6 = r6 * r2
            r7[r5] = r6
            int r5 = r5 + (-1)
            goto L1d
        L27:
            return
    }

    public int decodeNum(int r4, int r5, int[] r6, int[] r7) {
            r3 = this;
            r0 = 65520(0xfff0, float:9.1813E-41)
            r4 = r4 & r0
            r0 = 0
            r1 = r0
        L6:
            r2 = r6[r1]
            if (r2 > r4) goto Lf
            int r5 = r5 + 1
            int r1 = r1 + 1
            goto L6
        Lf:
            r3.faddbits(r5)
            if (r1 == 0) goto L18
            int r1 = r1 + (-1)
            r0 = r6[r1]
        L18:
            int r4 = r4 - r0
            int r3 = 16 - r5
            int r3 = r4 >>> r3
            r4 = r7[r5]
            int r3 = r3 + r4
            return r3
    }

    public void getFlagsBuf() {
            r7 = this;
            int r0 = r7.fgetbits()
            int[] r1 = com.github.junrar.unpack.Unpack15.DecHf2
            int[] r2 = com.github.junrar.unpack.Unpack15.PosHf2
            r3 = 5
            int r0 = r7.decodeNum(r0, r3, r1, r2)
        Ld:
            int[] r1 = r7.ChSetC
            r2 = r1[r0]
            int r3 = r2 >>> 8
            r7.FlagBuf = r3
            int[] r3 = r7.NToPlC
            int r4 = r2 + 1
            r2 = r2 & 255(0xff, float:3.57E-43)
            r5 = r3[r2]
            int r6 = r5 + 1
            r3[r2] = r6
            r2 = r4 & 255(0xff, float:3.57E-43)
            if (r2 == 0) goto L2c
            r7 = r1[r5]
            r1[r0] = r7
            r1[r5] = r4
            return
        L2c:
            r7.corrHuff(r1, r3)
            goto Ld
    }

    public void huffDecode() {
            r9 = this;
            int r0 = r9.fgetbits()
            int r1 = r9.AvrPlc
            r2 = 30207(0x75ff, float:4.2329E-41)
            r3 = 4
            r4 = 8
            r5 = 5
            if (r1 <= r2) goto L17
            int[] r1 = com.github.junrar.unpack.Unpack15.DecHf4
            int[] r2 = com.github.junrar.unpack.Unpack15.PosHf4
            int r1 = r9.decodeNum(r0, r4, r1, r2)
            goto L47
        L17:
            r2 = 24063(0x5dff, float:3.372E-41)
            if (r1 <= r2) goto L25
            int[] r1 = com.github.junrar.unpack.Unpack15.DecHf3
            int[] r2 = com.github.junrar.unpack.Unpack15.PosHf3
            r6 = 6
            int r1 = r9.decodeNum(r0, r6, r1, r2)
            goto L47
        L25:
            r2 = 13823(0x35ff, float:1.937E-41)
            if (r1 <= r2) goto L32
            int[] r1 = com.github.junrar.unpack.Unpack15.DecHf2
            int[] r2 = com.github.junrar.unpack.Unpack15.PosHf2
            int r1 = r9.decodeNum(r0, r5, r1, r2)
            goto L47
        L32:
            r2 = 3583(0xdff, float:5.021E-42)
            if (r1 <= r2) goto L3f
            int[] r1 = com.github.junrar.unpack.Unpack15.DecHf1
            int[] r2 = com.github.junrar.unpack.Unpack15.PosHf1
            int r1 = r9.decodeNum(r0, r5, r1, r2)
            goto L47
        L3f:
            int[] r1 = com.github.junrar.unpack.Unpack15.DecHf0
            int[] r2 = com.github.junrar.unpack.Unpack15.PosHf0
            int r1 = r9.decodeNum(r0, r3, r1, r2)
        L47:
            r2 = 255(0xff, float:3.57E-43)
            r1 = r1 & r2
            int r6 = r9.StMode
            r7 = 16
            r8 = 1
            if (r6 == 0) goto L94
            if (r1 != 0) goto L59
            r6 = 4095(0xfff, float:5.738E-42)
            if (r0 <= r6) goto L59
            r1 = 256(0x100, float:3.59E-43)
        L59:
            r0 = -1
            int r1 = r1 + r0
            if (r1 != r0) goto La2
            int r0 = r9.fgetbits()
            r9.faddbits(r8)
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            if (r1 == 0) goto L70
            r0 = 0
            r9.StMode = r0
            r9.NumHuf = r0
            return
        L70:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L75
            goto L76
        L75:
            r3 = 3
        L76:
            r9.faddbits(r8)
            int r0 = r9.fgetbits()
            int[] r1 = com.github.junrar.unpack.Unpack15.DecHf2
            int[] r2 = com.github.junrar.unpack.Unpack15.PosHf2
            int r0 = r9.decodeNum(r0, r5, r1, r2)
            int r0 = r0 << r5
            int r1 = r9.fgetbits()
            int r1 = r1 >>> 11
            r0 = r0 | r1
            r9.faddbits(r5)
            r9.oldCopyString(r0, r3)
            return
        L94:
            int r0 = r9.NumHuf
            int r3 = r0 + 1
            r9.NumHuf = r3
            if (r0 < r7) goto La2
            int r0 = r9.FlagsCnt
            if (r0 != 0) goto La2
            r9.StMode = r8
        La2:
            int r0 = r9.AvrPlc
            int r0 = r0 + r1
            int r3 = r0 >>> 8
            int r0 = r0 - r3
            r9.AvrPlc = r0
            int r0 = r9.Nhfb
            int r0 = r0 + r7
            r9.Nhfb = r0
            if (r0 <= r2) goto Lba
            r0 = 144(0x90, float:2.02E-43)
            r9.Nhfb = r0
            int r0 = r9.Nlzb
            int r0 = r0 >>> r8
            r9.Nlzb = r0
        Lba:
            byte[] r0 = r9.window
            int r3 = r9.unpPtr
            int r5 = r3 + 1
            r9.unpPtr = r5
            int[] r5 = r9.ChSet
            r5 = r5[r1]
            int r4 = r5 >>> 8
            byte r4 = (byte) r4
            r0[r3] = r4
            long r3 = r9.destUnpSize
            r5 = 1
            long r3 = r3 - r5
            r9.destUnpSize = r3
        Ld2:
            int[] r0 = r9.ChSet
            r3 = r0[r1]
            int[] r4 = r9.NToPl
            int r5 = r3 + 1
            r3 = r3 & r2
            r6 = r4[r3]
            int r7 = r6 + 1
            r4[r3] = r7
            r3 = r5 & 255(0xff, float:3.57E-43)
            r7 = 161(0xa1, float:2.26E-43)
            if (r3 <= r7) goto Leb
            r9.corrHuff(r0, r4)
            goto Ld2
        Leb:
            r9 = r0[r6]
            r0[r1] = r9
            r0[r6] = r5
            return
    }

    public void initHuff() {
            r6 = this;
            r0 = 0
            r1 = r0
        L2:
            r2 = 256(0x100, float:3.59E-43)
            if (r1 >= r2) goto L32
            int[] r2 = r6.Place
            int[] r3 = r6.PlaceA
            int[] r4 = r6.PlaceB
            r4[r1] = r1
            r3[r1] = r1
            r2[r1] = r1
            int[] r2 = r6.PlaceC
            int r3 = ~r1
            int r3 = r3 + 1
            r3 = r3 & 255(0xff, float:3.57E-43)
            r2[r1] = r3
            int[] r2 = r6.ChSet
            int[] r4 = r6.ChSetB
            int r5 = r1 << 8
            r4[r1] = r5
            r2[r1] = r5
            int[] r2 = r6.ChSetA
            r2[r1] = r1
            int[] r2 = r6.ChSetC
            int r3 = r3 << 8
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2
        L32:
            int[] r1 = r6.NToPl
            java.util.Arrays.fill(r1, r0)
            int[] r1 = r6.NToPlB
            java.util.Arrays.fill(r1, r0)
            int[] r1 = r6.NToPlC
            java.util.Arrays.fill(r1, r0)
            int[] r0 = r6.ChSetB
            int[] r1 = r6.NToPlB
            r6.corrHuff(r0, r1)
            return
    }

    public void longLZ() {
            r15 = this;
            r0 = 0
            r15.NumHuf = r0
            int r1 = r15.Nlzb
            r2 = 16
            int r1 = r1 + r2
            r15.Nlzb = r1
            r3 = 1
            r4 = 255(0xff, float:3.57E-43)
            if (r1 <= r4) goto L18
            r1 = 144(0x90, float:2.02E-43)
            r15.Nlzb = r1
            int r1 = r15.Nhfb
            int r1 = r1 >>> r3
            r15.Nhfb = r1
        L18:
            int r1 = r15.AvrLn2
            int r5 = r15.fgetbits()
            int r6 = r15.AvrLn2
            r7 = 122(0x7a, float:1.71E-43)
            r8 = 256(0x100, float:3.59E-43)
            r9 = 64
            r10 = 3
            if (r6 < r7) goto L32
            int[] r0 = com.github.junrar.unpack.Unpack15.DecL2
            int[] r2 = com.github.junrar.unpack.Unpack15.PosL2
            int r5 = r15.decodeNum(r5, r10, r0, r2)
            goto L55
        L32:
            if (r6 < r9) goto L3e
            int[] r0 = com.github.junrar.unpack.Unpack15.DecL1
            int[] r2 = com.github.junrar.unpack.Unpack15.PosL1
            r6 = 2
            int r5 = r15.decodeNum(r5, r6, r0, r2)
            goto L55
        L3e:
            if (r5 >= r8) goto L44
            r15.faddbits(r2)
            goto L55
        L44:
            int r2 = r5 << r0
            r6 = 32768(0x8000, float:4.5918E-41)
            r2 = r2 & r6
            if (r2 != 0) goto L4f
            int r0 = r0 + 1
            goto L44
        L4f:
            int r2 = r0 + 1
            r15.faddbits(r2)
            r5 = r0
        L55:
            int r0 = r15.AvrLn2
            int r0 = r0 + r5
            int r2 = r0 >>> 5
            int r0 = r0 - r2
            r15.AvrLn2 = r0
            int r0 = r15.fgetbits()
            int r2 = r15.AvrPlcB
            r6 = 10495(0x28ff, float:1.4707E-41)
            r7 = 4
            r11 = 5
            if (r2 <= r6) goto L72
            int[] r2 = com.github.junrar.unpack.Unpack15.DecHf2
            int[] r6 = com.github.junrar.unpack.Unpack15.PosHf2
            int r0 = r15.decodeNum(r0, r11, r2, r6)
            goto L87
        L72:
            r6 = 1791(0x6ff, float:2.51E-42)
            if (r2 <= r6) goto L7f
            int[] r2 = com.github.junrar.unpack.Unpack15.DecHf1
            int[] r6 = com.github.junrar.unpack.Unpack15.PosHf1
            int r0 = r15.decodeNum(r0, r11, r2, r6)
            goto L87
        L7f:
            int[] r2 = com.github.junrar.unpack.Unpack15.DecHf0
            int[] r6 = com.github.junrar.unpack.Unpack15.PosHf0
            int r0 = r15.decodeNum(r0, r7, r2, r6)
        L87:
            int r2 = r15.AvrPlcB
            int r2 = r2 + r0
            int r6 = r2 >>> 8
            int r2 = r2 - r6
            r15.AvrPlcB = r2
        L8f:
            int[] r2 = r15.ChSetB
            r6 = r0 & 255(0xff, float:3.57E-43)
            r6 = r2[r6]
            int[] r11 = r15.NToPlB
            int r12 = r6 + 1
            r6 = r6 & r4
            r13 = r11[r6]
            int r14 = r13 + 1
            r11[r6] = r14
            r6 = r12 & 255(0xff, float:3.57E-43)
            if (r6 != 0) goto La8
            r15.corrHuff(r2, r11)
            goto L8f
        La8:
            r4 = r2[r13]
            r2[r0] = r4
            r2[r13] = r12
            r0 = 65280(0xff00, float:9.1477E-41)
            r0 = r0 & r12
            int r2 = r15.fgetbits()
            int r2 = r2 >>> 8
            r0 = r0 | r2
            int r0 = r0 >>> r3
            r2 = 7
            r15.faddbits(r2)
            int r2 = r15.AvrLn3
            if (r5 == r3) goto Ld8
            if (r5 == r7) goto Ld8
            if (r5 != 0) goto Ld2
            int r3 = r15.MaxDist3
            if (r0 > r3) goto Ld2
            int r3 = r2 + 1
            int r4 = r3 >>> 8
            int r3 = r3 - r4
            r15.AvrLn3 = r3
            goto Ld8
        Ld2:
            if (r2 <= 0) goto Ld8
            int r3 = r2 + (-1)
            r15.AvrLn3 = r3
        Ld8:
            int r3 = r5 + 3
            int r4 = r15.MaxDist3
            if (r0 < r4) goto Le0
            int r3 = r5 + 4
        Le0:
            if (r0 > r8) goto Le4
            int r3 = r3 + 8
        Le4:
            r4 = 176(0xb0, float:2.47E-43)
            if (r2 > r4) goto Lf6
            int r2 = r15.AvrPlc
            r4 = 10752(0x2a00, float:1.5067E-41)
            if (r2 < r4) goto Lf1
            if (r1 >= r9) goto Lf1
            goto Lf6
        Lf1:
            r1 = 8193(0x2001, float:1.1481E-41)
            r15.MaxDist3 = r1
            goto Lfa
        Lf6:
            r1 = 32512(0x7f00, float:4.5559E-41)
            r15.MaxDist3 = r1
        Lfa:
            int[] r1 = r15.oldDist
            int r2 = r15.oldDistPtr
            int r4 = r2 + 1
            r15.oldDistPtr = r4
            r1[r2] = r0
            r1 = r4 & 3
            r15.oldDistPtr = r1
            r15.lastLength = r3
            r15.lastDist = r0
            r15.oldCopyString(r0, r3)
            return
    }

    public void oldCopyString(int r6, int r7) {
            r5 = this;
            long r0 = r5.destUnpSize
            long r2 = (long) r7
            long r0 = r0 - r2
            r5.destUnpSize = r0
            int r0 = r5.unpPtr
            int r1 = r0 - r6
            r2 = 4194303(0x3fffff, float:5.87747E-39)
            r1 = r1 & r2
            r3 = 1
            if (r6 != r3) goto L20
            byte[] r6 = r5.window
            int r2 = r0 + r7
            r1 = r6[r1]
            java.util.Arrays.fill(r6, r0, r2, r1)
            int r6 = r5.unpPtr
            int r6 = r6 + r7
            r5.unpPtr = r6
            return
        L20:
            int r6 = r1 + r7
            if (r6 > r0) goto L2f
            byte[] r6 = r5.window
            java.lang.System.arraycopy(r6, r1, r6, r0, r7)
            int r6 = r5.unpPtr
            int r6 = r6 + r7
            r5.unpPtr = r6
            return
        L2f:
            int r6 = r7 + (-1)
            if (r7 == 0) goto L44
            byte[] r7 = r5.window
            int r0 = r5.unpPtr
            r4 = r7[r1]
            r7[r0] = r4
            int r0 = r0 + r3
            r7 = r0 & r2
            r5.unpPtr = r7
            int r1 = r1 + r3
            r1 = r1 & r2
            r7 = r6
            goto L2f
        L44:
            return
    }

    public void oldUnpInitData(boolean r2) {
            r1 = this;
            r0 = 0
            if (r2 != 0) goto L1d
            r1.Buf60 = r0
            r1.NumHuf = r0
            r1.AvrLn3 = r0
            r1.AvrLn2 = r0
            r1.AvrLn1 = r0
            r1.AvrPlcB = r0
            r2 = 13568(0x3500, float:1.9013E-41)
            r1.AvrPlc = r2
            r2 = 8193(0x2001, float:1.1481E-41)
            r1.MaxDist3 = r2
            r2 = 128(0x80, float:1.8E-43)
            r1.Nlzb = r2
            r1.Nhfb = r2
        L1d:
            r1.FlagsCnt = r0
            r1.FlagBuf = r0
            r1.StMode = r0
            r1.LCount = r0
            r1.readTop = r0
            return
    }

    public void oldUnpWriteBuf() {
            r6 = this;
            int r0 = r6.unpPtr
            int r1 = r6.wrPtr
            r2 = 1
            if (r0 == r1) goto L9
            r6.unpSomeRead = r2
        L9:
            com.github.junrar.unpack.ComprDataIO r3 = r6.unpIO
            if (r0 >= r1) goto L24
            byte[] r0 = r6.window
            int r4 = -r1
            r5 = 4194303(0x3fffff, float:5.87747E-39)
            r4 = r4 & r5
            r3.unpWrite(r0, r1, r4)
            com.github.junrar.unpack.ComprDataIO r0 = r6.unpIO
            byte[] r1 = r6.window
            r3 = 0
            int r4 = r6.unpPtr
            r0.unpWrite(r1, r3, r4)
            r6.unpAllBuf = r2
            goto L2a
        L24:
            byte[] r2 = r6.window
            int r0 = r0 - r1
            r3.unpWrite(r2, r1, r0)
        L2a:
            int r0 = r6.unpPtr
            r6.wrPtr = r0
            return
    }

    public void shortLZ() {
            r11 = this;
            r0 = 0
            r11.NumHuf = r0
            int r1 = r11.fgetbits()
            int r2 = r11.LCount
            r3 = 32768(0x8000, float:4.5918E-41)
            r4 = 1
            r5 = 2
            if (r2 != r5) goto L21
            r11.faddbits(r4)
            if (r1 < r3) goto L1d
            int r0 = r11.lastDist
            int r1 = r11.lastLength
            r11.oldCopyString(r0, r1)
            return
        L1d:
            int r1 = r1 << 1
            r11.LCount = r0
        L21:
            int r1 = r1 >>> 8
            int r2 = r11.AvrLn1
            r6 = 37
            r7 = 255(0xff, float:3.57E-43)
            if (r2 >= r6) goto L46
            r2 = r0
        L2c:
            int[] r6 = com.github.junrar.unpack.Unpack15.ShortXor1
            r6 = r6[r2]
            r6 = r6 ^ r1
            int r8 = r11.getShortLen1(r2)
            int r8 = r7 >>> r8
            int r8 = ~r8
            r6 = r6 & r8
            if (r6 != 0) goto L43
            int r1 = r11.getShortLen1(r2)
            r11.faddbits(r1)
            goto L5d
        L43:
            int r2 = r2 + 1
            goto L2c
        L46:
            r2 = r0
        L47:
            int[] r6 = com.github.junrar.unpack.Unpack15.ShortXor2
            r6 = r6[r2]
            r6 = r6 ^ r1
            int r8 = r11.getShortLen2(r2)
            int r8 = r7 >>> r8
            int r8 = ~r8
            r6 = r6 & r8
            if (r6 != 0) goto L12c
            int r1 = r11.getShortLen2(r2)
            r11.faddbits(r1)
        L5d:
            r1 = 5
            r6 = 9
            r8 = 3
            if (r2 < r6) goto Le2
            if (r2 != r6) goto L72
            int r0 = r11.LCount
            int r0 = r0 + r4
            r11.LCount = r0
            int r0 = r11.lastDist
            int r1 = r11.lastLength
            r11.oldCopyString(r0, r1)
            return
        L72:
            r6 = 14
            if (r2 != r6) goto L98
            r11.LCount = r0
            int r0 = r11.fgetbits()
            int[] r2 = com.github.junrar.unpack.Unpack15.DecL2
            int[] r5 = com.github.junrar.unpack.Unpack15.PosL2
            int r0 = r11.decodeNum(r0, r8, r2, r5)
            int r0 = r0 + r1
            int r1 = r11.fgetbits()
            int r1 = r1 >>> r4
            r1 = r1 | r3
            r2 = 15
            r11.faddbits(r2)
            r11.lastLength = r0
            r11.lastDist = r1
            r11.oldCopyString(r1, r0)
            return
        L98:
            r11.LCount = r0
            int[] r0 = r11.oldDist
            int r1 = r11.oldDistPtr
            int r3 = r2 + (-9)
            int r1 = r1 - r3
            r1 = r1 & r8
            r0 = r0[r1]
            int r1 = r11.fgetbits()
            int[] r3 = com.github.junrar.unpack.Unpack15.DecL1
            int[] r6 = com.github.junrar.unpack.Unpack15.PosL1
            int r1 = r11.decodeNum(r1, r5, r3, r6)
            int r3 = r1 + 2
            r5 = 257(0x101, float:3.6E-43)
            if (r3 != r5) goto Lc0
            r5 = 10
            if (r2 != r5) goto Lc0
            int r0 = r11.Buf60
            r0 = r0 ^ r4
            r11.Buf60 = r0
            return
        Lc0:
            r2 = 256(0x100, float:3.59E-43)
            if (r0 <= r2) goto Lc6
            int r3 = r1 + 3
        Lc6:
            int r1 = r11.MaxDist3
            if (r0 < r1) goto Lcc
            int r3 = r3 + 1
        Lcc:
            int[] r1 = r11.oldDist
            int r2 = r11.oldDistPtr
            int r4 = r2 + 1
            r11.oldDistPtr = r4
            r1[r2] = r0
            r1 = r4 & 3
            r11.oldDistPtr = r1
            r11.lastLength = r3
            r11.lastDist = r0
            r11.oldCopyString(r0, r3)
            return
        Le2:
            r11.LCount = r0
            int r0 = r11.AvrLn1
            int r0 = r0 + r2
            int r3 = r0 >>> 4
            int r0 = r0 - r3
            r11.AvrLn1 = r0
            int r0 = r11.fgetbits()
            int[] r3 = com.github.junrar.unpack.Unpack15.DecHf2
            int[] r6 = com.github.junrar.unpack.Unpack15.PosHf2
            int r0 = r11.decodeNum(r0, r1, r3, r6)
            r0 = r0 & r7
            int[] r1 = r11.ChSetA
            r3 = r1[r0]
            int r6 = r0 + (-1)
            r7 = -1
            if (r6 == r7) goto L114
            int[] r7 = r11.PlaceA
            r9 = r7[r3]
            int r9 = r9 - r4
            r7[r3] = r9
            r9 = r1[r6]
            r10 = r7[r9]
            int r10 = r10 + r4
            r7[r9] = r10
            r1[r0] = r9
            r1[r6] = r3
        L114:
            int r2 = r2 + r5
            int[] r0 = r11.oldDist
            int r1 = r11.oldDistPtr
            int r5 = r1 + 1
            r11.oldDistPtr = r5
            int r3 = r3 + r4
            r0[r1] = r3
            r0 = r5 & 3
            r11.oldDistPtr = r0
            r11.lastLength = r2
            r11.lastDist = r3
            r11.oldCopyString(r3, r2)
            return
        L12c:
            int r2 = r2 + 1
            goto L47
    }

    public abstract void unpInitData(boolean r1);

    public boolean unpReadBuf() {
            r5 = this;
            int r0 = r5.readTop
            int r1 = r5.inAddr
            int r2 = r0 - r1
            r3 = 0
            if (r2 >= 0) goto La
            return r3
        La:
            r4 = 16384(0x4000, float:2.2959E-41)
            if (r1 <= r4) goto L1a
            if (r2 <= 0) goto L15
            byte[] r0 = r5.inBuf
            java.lang.System.arraycopy(r0, r1, r0, r3, r2)
        L15:
            r5.inAddr = r3
            r5.readTop = r2
            r0 = r2
        L1a:
            com.github.junrar.unpack.ComprDataIO r1 = r5.unpIO
            byte[] r2 = r5.inBuf
            r4 = 32768(0x8000, float:4.5918E-41)
            int r4 = r4 - r0
            r4 = r4 & (-16)
            int r0 = r1.unpRead(r2, r0, r4)
            if (r0 <= 0) goto L2f
            int r1 = r5.readTop
            int r1 = r1 + r0
            r5.readTop = r1
        L2f:
            int r1 = r5.readTop
            int r1 = r1 + (-30)
            r5.readBorder = r1
            r5 = -1
            if (r0 == r5) goto L3a
            r5 = 1
            return r5
        L3a:
            return r3
    }

    public void unpack15(boolean r6) {
            r5 = this;
            boolean r0 = r5.suspended
            if (r0 == 0) goto L9
            int r6 = r5.wrPtr
            r5.unpPtr = r6
            goto L26
        L9:
            r5.unpInitData(r6)
            r5.oldUnpInitData(r6)
            r5.unpReadBuf()
            if (r6 != 0) goto L1b
            r5.initHuff()
            r6 = 0
            r5.unpPtr = r6
            goto L1f
        L1b:
            int r6 = r5.wrPtr
            r5.unpPtr = r6
        L1f:
            long r0 = r5.destUnpSize
            r2 = 1
            long r0 = r0 - r2
            r5.destUnpSize = r0
        L26:
            long r0 = r5.destUnpSize
            r2 = 0
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto L35
            r5.getFlagsBuf()
            r6 = 8
            r5.FlagsCnt = r6
        L35:
            long r0 = r5.destUnpSize
            int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r6 < 0) goto Lca
            int r6 = r5.unpPtr
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            r6 = r6 & r0
            r5.unpPtr = r6
            int r6 = r5.inAddr
            int r1 = r5.readTop
            int r1 = r1 + (-30)
            if (r6 <= r1) goto L53
            boolean r6 = r5.unpReadBuf()
            if (r6 != 0) goto L53
            goto Lca
        L53:
            int r6 = r5.wrPtr
            int r1 = r5.unpPtr
            int r4 = r6 - r1
            r0 = r0 & r4
            r4 = 270(0x10e, float:3.78E-43)
            if (r0 >= r4) goto L68
            if (r6 == r1) goto L68
            r5.oldUnpWriteBuf()
            boolean r6 = r5.suspended
            if (r6 == 0) goto L68
            return
        L68:
            int r6 = r5.StMode
            if (r6 == 0) goto L70
            r5.huffDecode()
            goto L35
        L70:
            int r6 = r5.FlagsCnt
            int r6 = r6 + (-1)
            r5.FlagsCnt = r6
            r0 = 7
            if (r6 >= 0) goto L7e
            r5.getFlagsBuf()
            r5.FlagsCnt = r0
        L7e:
            int r6 = r5.FlagBuf
            r1 = r6 & 128(0x80, float:1.8E-43)
            if (r1 == 0) goto L96
            int r6 = r6 << 1
            r5.FlagBuf = r6
            int r6 = r5.Nlzb
            int r0 = r5.Nhfb
            if (r6 <= r0) goto L92
            r5.longLZ()
            goto L35
        L92:
            r5.huffDecode()
            goto L35
        L96:
            int r6 = r6 << 1
            r5.FlagBuf = r6
            int r6 = r5.FlagsCnt
            int r6 = r6 + (-1)
            r5.FlagsCnt = r6
            if (r6 >= 0) goto La7
            r5.getFlagsBuf()
            r5.FlagsCnt = r0
        La7:
            int r6 = r5.FlagBuf
            r0 = r6 & 128(0x80, float:1.8E-43)
            if (r0 == 0) goto Lc1
            int r6 = r6 << 1
            r5.FlagBuf = r6
            int r6 = r5.Nlzb
            int r0 = r5.Nhfb
            if (r6 <= r0) goto Lbc
            r5.huffDecode()
            goto L35
        Lbc:
            r5.longLZ()
            goto L35
        Lc1:
            int r6 = r6 << 1
            r5.FlagBuf = r6
            r5.shortLZ()
            goto L35
        Lca:
            r5.oldUnpWriteBuf()
            return
    }
}

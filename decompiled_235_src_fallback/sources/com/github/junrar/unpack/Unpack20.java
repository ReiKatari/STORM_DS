package com.github.junrar.unpack;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class Unpack20 extends com.github.junrar.unpack.Unpack15 {
    public static final int[] DBits = null;
    public static final int[] DDecode = null;
    public static final byte[] LBits = null;
    public static final int[] LDecode = null;
    public static final int[] SDBits = null;
    public static final int[] SDDecode = null;
    protected com.github.junrar.unpack.decode.AudioVariables[] AudV;
    protected com.github.junrar.unpack.decode.BitDecode BD;
    protected com.github.junrar.unpack.decode.DistDecode DD;
    protected com.github.junrar.unpack.decode.LitDecode LD;
    protected com.github.junrar.unpack.decode.LowDistDecode LDD;
    protected com.github.junrar.unpack.decode.MultDecode[] MD;
    protected com.github.junrar.unpack.decode.RepDecode RD;
    protected int UnpAudioBlock;
    protected int UnpChannelDelta;
    protected int UnpChannels;
    protected int UnpCurChannel;
    protected byte[] UnpOldTable20;

    static {
            r0 = 28
            int[] r1 = new int[r0]
            r1 = {x0032: FILL_ARRAY_DATA  , data: [0, 1, 2, 3, 4, 5, 6, 7, 8, 10, 12, 14, 16, 20, 24, 28, 32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224} // fill-array
            com.github.junrar.unpack.Unpack20.LDecode = r1
            byte[] r0 = new byte[r0]
            r0 = {x006e: FILL_ARRAY_DATA  , data: [0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2, 3, 3, 3, 3, 4, 4, 4, 4, 5, 5, 5, 5} // fill-array
            com.github.junrar.unpack.Unpack20.LBits = r0
            r0 = 48
            int[] r1 = new int[r0]
            r1 = {x0080: FILL_ARRAY_DATA  , data: [0, 1, 2, 3, 4, 6, 8, 12, 16, 24, 32, 48, 64, 96, 128, 192, 256, 384, 512, 768, 1024, 1536, 2048, 3072, 4096, 6144, 8192, 12288, 16384, 24576, 32768, 49152, 65536, 98304, 131072, 196608, 262144, 327680, 393216, 458752, 524288, 589824, 655360, 720896, 786432, 851968, 917504, 983040} // fill-array
            com.github.junrar.unpack.Unpack20.DDecode = r1
            int[] r0 = new int[r0]
            r0 = {x00e4: FILL_ARRAY_DATA  , data: [0, 0, 0, 0, 1, 1, 2, 2, 3, 3, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 9, 10, 10, 11, 11, 12, 12, 13, 13, 14, 14, 15, 15, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16, 16} // fill-array
            com.github.junrar.unpack.Unpack20.DBits = r0
            r0 = 8
            int[] r1 = new int[r0]
            r1 = {x0148: FILL_ARRAY_DATA  , data: [0, 4, 8, 16, 32, 64, 128, 192} // fill-array
            com.github.junrar.unpack.Unpack20.SDDecode = r1
            int[] r0 = new int[r0]
            r0 = {x015c: FILL_ARRAY_DATA  , data: [2, 2, 3, 4, 5, 6, 6, 6} // fill-array
            com.github.junrar.unpack.Unpack20.SDBits = r0
            return
    }

    public Unpack20() {
            r2 = this;
            r2.<init>()
            r0 = 4
            com.github.junrar.unpack.decode.MultDecode[] r1 = new com.github.junrar.unpack.decode.MultDecode[r0]
            r2.MD = r1
            r1 = 1028(0x404, float:1.44E-42)
            byte[] r1 = new byte[r1]
            r2.UnpOldTable20 = r1
            com.github.junrar.unpack.decode.AudioVariables[] r0 = new com.github.junrar.unpack.decode.AudioVariables[r0]
            r2.AudV = r0
            com.github.junrar.unpack.decode.LitDecode r0 = new com.github.junrar.unpack.decode.LitDecode
            r0.<init>()
            r2.LD = r0
            com.github.junrar.unpack.decode.DistDecode r0 = new com.github.junrar.unpack.decode.DistDecode
            r0.<init>()
            r2.DD = r0
            com.github.junrar.unpack.decode.LowDistDecode r0 = new com.github.junrar.unpack.decode.LowDistDecode
            r0.<init>()
            r2.LDD = r0
            com.github.junrar.unpack.decode.RepDecode r0 = new com.github.junrar.unpack.decode.RepDecode
            r0.<init>()
            r2.RD = r0
            com.github.junrar.unpack.decode.BitDecode r0 = new com.github.junrar.unpack.decode.BitDecode
            r0.<init>()
            r2.BD = r0
            return
    }

    public void CopyString20(int r6, int r7) {
            r5 = this;
            int[] r0 = r5.oldDist
            int r1 = r5.oldDistPtr
            int r2 = r1 + 1
            r5.oldDistPtr = r2
            r1 = r1 & 3
            r0[r1] = r7
            r5.lastDist = r7
            r5.lastLength = r6
            long r0 = r5.destUnpSize
            long r2 = (long) r6
            long r0 = r0 - r2
            r5.destUnpSize = r0
            int r0 = r5.unpPtr
            int r7 = r0 - r7
            r1 = 4194004(0x3ffed4, float:5.877051E-39)
            if (r7 >= r1) goto L57
            if (r0 >= r1) goto L57
            int r1 = r7 + r6
            byte[] r2 = r5.window
            if (r1 > r0) goto L30
            java.lang.System.arraycopy(r2, r7, r2, r0, r6)
            int r7 = r5.unpPtr
            int r7 = r7 + r6
            r5.unpPtr = r7
            return
        L30:
            int r1 = r0 + 1
            r5.unpPtr = r1
            int r3 = r7 + 1
            r4 = r2[r7]
            r2[r0] = r4
            r4 = 2
            int r0 = r0 + r4
            r5.unpPtr = r0
            int r7 = r7 + r4
            r0 = r2[r3]
            r2[r1] = r0
        L43:
            if (r6 <= r4) goto L72
            int r6 = r6 + (-1)
            byte[] r0 = r5.window
            int r1 = r5.unpPtr
            int r2 = r1 + 1
            r5.unpPtr = r2
            int r2 = r7 + 1
            r7 = r0[r7]
            r0[r1] = r7
            r7 = r2
            goto L43
        L57:
            int r0 = r6 + (-1)
            if (r6 == 0) goto L72
            byte[] r6 = r5.window
            int r1 = r5.unpPtr
            int r2 = r7 + 1
            r3 = 4194303(0x3fffff, float:5.87747E-39)
            r7 = r7 & r3
            r7 = r6[r7]
            r6[r1] = r7
            int r1 = r1 + 1
            r6 = r1 & r3
            r5.unpPtr = r6
            r6 = r0
            r7 = r2
            goto L57
        L72:
            return
    }

    public byte DecodeAudio(int r11) {
            r10 = this;
            com.github.junrar.unpack.decode.AudioVariables[] r0 = r10.AudV
            int r1 = r10.UnpCurChannel
            r0 = r0[r1]
            int r1 = r0.getByteCount()
            r2 = 1
            int r1 = r1 + r2
            r0.setByteCount(r1)
            int r1 = r0.getD3()
            r0.setD4(r1)
            int r1 = r0.getD2()
            r0.setD3(r1)
            int r1 = r0.getLastDelta()
            int r3 = r0.getD1()
            int r1 = r1 - r3
            r0.setD2(r1)
            int r1 = r0.getLastDelta()
            r0.setD1(r1)
            int r1 = r0.getLastChar()
            r3 = 8
            int r1 = r1 * r3
            int r4 = r0.getK1()
            int r5 = r0.getD1()
            int r5 = r5 * r4
            int r5 = r5 + r1
            int r1 = r0.getK2()
            int r4 = r0.getD2()
            int r4 = r4 * r1
            int r1 = r0.getK3()
            int r6 = r0.getD3()
            int r6 = r6 * r1
            int r6 = r6 + r4
            int r6 = r6 + r5
            int r1 = r0.getK4()
            int r4 = r0.getD4()
            int r4 = r4 * r1
            int r1 = r0.getK5()
            int r5 = r10.UnpChannelDelta
            int r1 = r1 * r5
            int r1 = r1 + r4
            int r1 = r1 + r6
            r4 = 3
            int r1 = r1 >>> r4
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 - r11
            byte r11 = (byte) r11
            int r11 = r11 << r4
            int[] r5 = r0.getDif()
            r6 = 0
            r7 = r5[r6]
            int r8 = java.lang.Math.abs(r11)
            int r8 = r8 + r7
            r5[r6] = r8
            int[] r5 = r0.getDif()
            r7 = r5[r2]
            int r8 = r0.getD1()
            int r8 = r11 - r8
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 + r7
            r5[r2] = r8
            int[] r5 = r0.getDif()
            r7 = 2
            r8 = r5[r7]
            int r9 = r0.getD1()
            int r9 = r9 + r11
            int r9 = java.lang.Math.abs(r9)
            int r9 = r9 + r8
            r5[r7] = r9
            int[] r5 = r0.getDif()
            r7 = r5[r4]
            int r8 = r0.getD2()
            int r8 = r11 - r8
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 + r7
            r5[r4] = r8
            int[] r4 = r0.getDif()
            r5 = 4
            r7 = r4[r5]
            int r8 = r0.getD2()
            int r8 = r8 + r11
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 + r7
            r4[r5] = r8
            int[] r4 = r0.getDif()
            r5 = 5
            r7 = r4[r5]
            int r8 = r0.getD3()
            int r8 = r11 - r8
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 + r7
            r4[r5] = r8
            int[] r4 = r0.getDif()
            r5 = 6
            r7 = r4[r5]
            int r8 = r0.getD3()
            int r8 = r8 + r11
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 + r7
            r4[r5] = r8
            int[] r4 = r0.getDif()
            r5 = 7
            r7 = r4[r5]
            int r8 = r0.getD4()
            int r8 = r11 - r8
            int r8 = java.lang.Math.abs(r8)
            int r8 = r8 + r7
            r4[r5] = r8
            int[] r4 = r0.getDif()
            r5 = r4[r3]
            int r7 = r0.getD4()
            int r7 = r7 + r11
            int r7 = java.lang.Math.abs(r7)
            int r7 = r7 + r5
            r4[r3] = r7
            int[] r3 = r0.getDif()
            r4 = 9
            r5 = r3[r4]
            int r7 = r10.UnpChannelDelta
            int r7 = r11 - r7
            int r7 = java.lang.Math.abs(r7)
            int r7 = r7 + r5
            r3[r4] = r7
            int[] r3 = r0.getDif()
            r4 = 10
            r5 = r3[r4]
            int r7 = r10.UnpChannelDelta
            int r11 = r11 + r7
            int r11 = java.lang.Math.abs(r11)
            int r11 = r11 + r5
            r3[r4] = r11
            int r11 = r0.getLastChar()
            int r11 = r1 - r11
            byte r11 = (byte) r11
            r0.setLastDelta(r11)
            int r11 = r0.getLastDelta()
            r10.UnpChannelDelta = r11
            r0.setLastChar(r1)
            int r10 = r0.getByteCount()
            r10 = r10 & 31
            if (r10 != 0) goto L222
            int[] r10 = r0.getDif()
            r10 = r10[r6]
            int[] r11 = r0.getDif()
            r11[r6] = r6
            r11 = r2
            r3 = r6
        L163:
            int[] r4 = r0.getDif()
            int r4 = r4.length
            if (r11 >= r4) goto L182
            int[] r4 = r0.getDif()
            r4 = r4[r11]
            if (r4 >= r10) goto L179
            int[] r10 = r0.getDif()
            r10 = r10[r11]
            r3 = r11
        L179:
            int[] r4 = r0.getDif()
            r4[r11] = r6
            int r11 = r11 + 1
            goto L163
        L182:
            r10 = -16
            r11 = 16
            switch(r3) {
                case 1: goto L214;
                case 2: goto L205;
                case 3: goto L1f6;
                case 4: goto L1e7;
                case 5: goto L1d8;
                case 6: goto L1c9;
                case 7: goto L1ba;
                case 8: goto L1ab;
                case 9: goto L19b;
                case 10: goto L18b;
                default: goto L189;
            }
        L189:
            goto L222
        L18b:
            int r10 = r0.getK5()
            if (r10 >= r11) goto L222
            int r10 = r0.getK5()
            int r10 = r10 + r2
            r0.setK5(r10)
            goto L222
        L19b:
            int r11 = r0.getK5()
            if (r11 < r10) goto L222
            int r10 = r0.getK5()
            int r10 = r10 - r2
            r0.setK5(r10)
            goto L222
        L1ab:
            int r10 = r0.getK4()
            if (r10 >= r11) goto L222
            int r10 = r0.getK4()
            int r10 = r10 + r2
            r0.setK4(r10)
            goto L222
        L1ba:
            int r11 = r0.getK4()
            if (r11 < r10) goto L222
            int r10 = r0.getK4()
            int r10 = r10 - r2
            r0.setK4(r10)
            goto L222
        L1c9:
            int r10 = r0.getK3()
            if (r10 >= r11) goto L222
            int r10 = r0.getK3()
            int r10 = r10 + r2
            r0.setK3(r10)
            goto L222
        L1d8:
            int r11 = r0.getK3()
            if (r11 < r10) goto L222
            int r10 = r0.getK3()
            int r10 = r10 - r2
            r0.setK3(r10)
            goto L222
        L1e7:
            int r10 = r0.getK2()
            if (r10 >= r11) goto L222
            int r10 = r0.getK2()
            int r10 = r10 + r2
            r0.setK2(r10)
            goto L222
        L1f6:
            int r11 = r0.getK2()
            if (r11 < r10) goto L222
            int r10 = r0.getK2()
            int r10 = r10 - r2
            r0.setK2(r10)
            goto L222
        L205:
            int r10 = r0.getK1()
            if (r10 >= r11) goto L222
            int r10 = r0.getK1()
            int r10 = r10 + r2
            r0.setK1(r10)
            goto L222
        L214:
            int r11 = r0.getK1()
            if (r11 < r10) goto L222
            int r10 = r0.getK1()
            int r10 = r10 - r2
            r0.setK1(r10)
        L222:
            byte r10 = (byte) r1
            return r10
    }

    public void ReadLastTables() {
            r2 = this;
            int r0 = r2.readTop
            int r1 = r2.inAddr
            int r1 = r1 + 5
            if (r0 < r1) goto L2b
            int r0 = r2.UnpAudioBlock
            if (r0 == 0) goto L1e
            com.github.junrar.unpack.decode.MultDecode[] r0 = r2.MD
            int r1 = r2.UnpCurChannel
            r0 = r0[r1]
            int r0 = r2.decodeNumber(r0)
            r1 = 256(0x100, float:3.59E-43)
            if (r0 != r1) goto L2b
            r2.ReadTables20()
            return
        L1e:
            com.github.junrar.unpack.decode.LitDecode r0 = r2.LD
            int r0 = r2.decodeNumber(r0)
            r1 = 269(0x10d, float:3.77E-43)
            if (r0 != r1) goto L2b
            r2.ReadTables20()
        L2b:
            return
    }

    public boolean ReadTables20() {
            r11 = this;
            r0 = 19
            byte[] r1 = new byte[r0]
            r2 = 1028(0x404, float:1.44E-42)
            byte[] r2 = new byte[r2]
            int r3 = r11.inAddr
            int r4 = r11.readTop
            int r4 = r4 + (-25)
            r5 = 0
            if (r3 <= r4) goto L18
            boolean r3 = r11.unpReadBuf()
            if (r3 != 0) goto L18
            return r5
        L18:
            int r3 = r11.getbits()
            r4 = 32768(0x8000, float:4.5918E-41)
            r4 = r4 & r3
            r11.UnpAudioBlock = r4
            r4 = r3 & 16384(0x4000, float:2.2959E-41)
            if (r4 != 0) goto L2b
            byte[] r4 = r11.UnpOldTable20
            java.util.Arrays.fill(r4, r5)
        L2b:
            r4 = 2
            r11.addbits(r4)
            int r6 = r11.UnpAudioBlock
            r7 = 257(0x101, float:3.6E-43)
            r8 = 3
            r9 = 1
            if (r6 == 0) goto L4a
            int r3 = r3 >>> 12
            r3 = r3 & r8
            int r3 = r3 + r9
            r11.UnpChannels = r3
            int r6 = r11.UnpCurChannel
            if (r6 < r3) goto L43
            r11.UnpCurChannel = r5
        L43:
            r11.addbits(r4)
            int r3 = r11.UnpChannels
            int r3 = r3 * r7
            goto L4c
        L4a:
            r3 = 374(0x176, float:5.24E-43)
        L4c:
            r6 = r5
        L4d:
            if (r6 >= r0) goto L5f
            int r10 = r11.getbits()
            int r10 = r10 >>> 12
            byte r10 = (byte) r10
            r1[r6] = r10
            r10 = 4
            r11.addbits(r10)
            int r6 = r6 + 1
            goto L4d
        L5f:
            com.github.junrar.unpack.decode.BitDecode r6 = r11.BD
            r11.makeDecodeTables(r1, r5, r6, r0)
            r0 = r5
        L65:
            int r1 = r11.inAddr
            if (r0 >= r3) goto Ld1
            int r6 = r11.readTop
            int r6 = r6 + (-5)
            if (r1 <= r6) goto L76
            boolean r1 = r11.unpReadBuf()
            if (r1 != 0) goto L76
            return r5
        L76:
            com.github.junrar.unpack.decode.BitDecode r1 = r11.BD
            int r1 = r11.decodeNumber(r1)
            r6 = 16
            if (r1 >= r6) goto L8d
            byte[] r6 = r11.UnpOldTable20
            r6 = r6[r0]
            int r1 = r1 + r6
            r1 = r1 & 15
            byte r1 = (byte) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L65
        L8d:
            if (r1 != r6) goto La9
            int r1 = r11.getbits()
            int r1 = r1 >>> 14
            int r1 = r1 + r8
            r11.addbits(r4)
        L99:
            int r6 = r1 + (-1)
            if (r1 <= 0) goto L65
            if (r0 >= r3) goto L65
            int r1 = r0 + (-1)
            r1 = r2[r1]
            r2[r0] = r1
            int r0 = r0 + 1
            r1 = r6
            goto L99
        La9:
            r6 = 17
            if (r1 != r6) goto Lb8
            int r1 = r11.getbits()
            int r1 = r1 >>> 13
            int r1 = r1 + r8
            r11.addbits(r8)
            goto Lc4
        Lb8:
            int r1 = r11.getbits()
            int r1 = r1 >>> 9
            int r1 = r1 + 11
            r6 = 7
            r11.addbits(r6)
        Lc4:
            int r6 = r1 + (-1)
            if (r1 <= 0) goto L65
            if (r0 >= r3) goto L65
            int r1 = r0 + 1
            r2[r0] = r5
            r0 = r1
            r1 = r6
            goto Lc4
        Ld1:
            int r0 = r11.readTop
            if (r1 <= r0) goto Ld6
            return r9
        Ld6:
            int r0 = r11.UnpAudioBlock
            if (r0 == 0) goto Leb
            r0 = r5
        Ldb:
            int r1 = r11.UnpChannels
            if (r0 >= r1) goto L102
            int r1 = r0 * 257
            com.github.junrar.unpack.decode.MultDecode[] r3 = r11.MD
            r3 = r3[r0]
            r11.makeDecodeTables(r2, r1, r3, r7)
            int r0 = r0 + 1
            goto Ldb
        Leb:
            com.github.junrar.unpack.decode.LitDecode r0 = r11.LD
            r1 = 298(0x12a, float:4.18E-43)
            r11.makeDecodeTables(r2, r5, r0, r1)
            com.github.junrar.unpack.decode.DistDecode r0 = r11.DD
            r3 = 48
            r11.makeDecodeTables(r2, r1, r0, r3)
            com.github.junrar.unpack.decode.RepDecode r0 = r11.RD
            r1 = 28
            r3 = 346(0x15a, float:4.85E-43)
            r11.makeDecodeTables(r2, r3, r0, r1)
        L102:
            byte[] r11 = r11.UnpOldTable20
            int r0 = r11.length
            java.lang.System.arraycopy(r2, r5, r11, r5, r0)
            return r9
    }

    public int decodeNumber(com.github.junrar.unpack.decode.Decode r8) {
            r7 = this;
            int r0 = r7.getbits()
            r1 = 65534(0xfffe, float:9.1833E-41)
            r0 = r0 & r1
            long r0 = (long) r0
            int[] r2 = r8.getDecodeLen()
            r3 = 8
            r4 = r2[r3]
            long r4 = (long) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L53
            r4 = 4
            r5 = r2[r4]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L39
            r3 = 2
            r5 = r2[r3]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L30
            r4 = 1
            r5 = r2[r4]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L8e
        L2e:
            r3 = r4
            goto L8e
        L30:
            r3 = 3
            r5 = r2[r3]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L2e
            goto L8e
        L39:
            r4 = 6
            r5 = r2[r4]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L4a
            r3 = 5
            r5 = r2[r3]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L2e
            goto L8e
        L4a:
            r4 = 7
            r5 = r2[r4]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L8e
            goto L2e
        L53:
            r3 = 12
            r4 = r2[r3]
            long r4 = (long) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L79
            r4 = 10
            r5 = r2[r4]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L6f
            r3 = 9
            r5 = r2[r3]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L2e
            goto L8e
        L6f:
            r4 = 11
            r5 = r2[r4]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L8e
            goto L2e
        L79:
            r3 = 14
            r4 = r2[r3]
            long r4 = (long) r4
            int r4 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r4 >= 0) goto L8c
            r4 = 13
            r5 = r2[r4]
            long r5 = (long) r5
            int r5 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r5 >= 0) goto L8e
            goto L2e
        L8c:
            r3 = 15
        L8e:
            r7.addbits(r3)
            int[] r7 = r8.getDecodePos()
            r7 = r7[r3]
            int r0 = (int) r0
            int r1 = r3 + (-1)
            r1 = r2[r1]
            int r0 = r0 - r1
            int r1 = 16 - r3
            int r0 = r0 >>> r1
            int r7 = r7 + r0
            int r0 = r8.getMaxNum()
            if (r7 < r0) goto La8
            r7 = 0
        La8:
            int[] r8 = r8.getDecodeNum()
            r7 = r8[r7]
            return r7
    }

    public void makeDecodeTables(byte[] r12, int r13, com.github.junrar.unpack.decode.Decode r14, int r15) {
            r11 = this;
            r11 = 16
            int[] r0 = new int[r11]
            int[] r1 = new int[r11]
            r2 = 0
            java.util.Arrays.fill(r0, r2)
            int[] r3 = r14.getDecodeNum()
            java.util.Arrays.fill(r3, r2)
            r3 = r2
        L12:
            r4 = 1
            if (r3 >= r15) goto L23
            int r5 = r13 + r3
            r5 = r12[r5]
            r5 = r5 & 15
            r6 = r0[r5]
            int r6 = r6 + r4
            r0[r5] = r6
            int r3 = r3 + 1
            goto L12
        L23:
            r0[r2] = r2
            r1[r2] = r2
            int[] r3 = r14.getDecodePos()
            r3[r2] = r2
            int[] r3 = r14.getDecodeLen()
            r3[r2] = r2
            r5 = 0
        L35:
            if (r4 >= r11) goto L67
            r3 = r0[r4]
            long r7 = (long) r3
            long r5 = r5 + r7
            r7 = 2
            long r5 = r5 * r7
            int r3 = 15 - r4
            long r7 = r5 << r3
            r9 = 65535(0xffff, double:3.23786E-319)
            int r3 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r3 <= 0) goto L4a
            r7 = r9
        L4a:
            int[] r3 = r14.getDecodeLen()
            int r7 = (int) r7
            r3[r4] = r7
            int[] r3 = r14.getDecodePos()
            int[] r7 = r14.getDecodePos()
            int r8 = r4 + (-1)
            r7 = r7[r8]
            r8 = r0[r8]
            int r7 = r7 + r8
            r3[r4] = r7
            r1[r4] = r7
            int r4 = r4 + 1
            goto L35
        L67:
            if (r2 >= r15) goto L82
            int r11 = r13 + r2
            r0 = r12[r11]
            if (r0 == 0) goto L7f
            int[] r0 = r14.getDecodeNum()
            r11 = r12[r11]
            r11 = r11 & 15
            r3 = r1[r11]
            int r4 = r3 + 1
            r1[r11] = r4
            r0[r3] = r2
        L7f:
            int r2 = r2 + 1
            goto L67
        L82:
            r14.setMaxNum(r15)
            return
    }

    public void unpInitData20(boolean r4) {
            r3 = this;
            if (r4 != 0) goto L2e
            r4 = 0
            r3.UnpCurChannel = r4
            r3.UnpChannelDelta = r4
            r0 = 1
            r3.UnpChannels = r0
            r0 = r4
        Lb:
            com.github.junrar.unpack.decode.AudioVariables[] r1 = r3.AudV
            int r2 = r1.length
            if (r0 >= r2) goto L1a
            com.github.junrar.unpack.decode.AudioVariables r2 = new com.github.junrar.unpack.decode.AudioVariables
            r2.<init>()
            r1[r0] = r2
            int r0 = r0 + 1
            goto Lb
        L1a:
            byte[] r0 = r3.UnpOldTable20
            java.util.Arrays.fill(r0, r4)
        L1f:
            com.github.junrar.unpack.decode.MultDecode[] r0 = r3.MD
            int r1 = r0.length
            if (r4 >= r1) goto L2e
            com.github.junrar.unpack.decode.MultDecode r1 = new com.github.junrar.unpack.decode.MultDecode
            r1.<init>()
            r0[r4] = r1
            int r4 = r4 + 1
            goto L1f
        L2e:
            return
    }

    public void unpack20(boolean r10) {
            r9 = this;
            boolean r0 = r9.suspended
            r1 = 1
            if (r0 == 0) goto Lb
            int r10 = r9.wrPtr
            r9.unpPtr = r10
            goto L23
        Lb:
            r9.unpInitData(r10)
            boolean r0 = r9.unpReadBuf()
            if (r0 != 0) goto L15
            goto L57
        L15:
            if (r10 != 0) goto L1e
            boolean r10 = r9.ReadTables20()
            if (r10 != 0) goto L1e
            goto L57
        L1e:
            long r3 = r9.destUnpSize
            long r3 = r3 - r1
            r9.destUnpSize = r3
        L23:
            long r3 = r9.destUnpSize
            r5 = 0
            int r10 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r10 < 0) goto L176
            int r10 = r9.unpPtr
            r0 = 4194303(0x3fffff, float:5.87747E-39)
            r10 = r10 & r0
            r9.unpPtr = r10
            int r10 = r9.inAddr
            int r3 = r9.readTop
            int r3 = r3 + (-30)
            if (r10 <= r3) goto L43
            boolean r10 = r9.unpReadBuf()
            if (r10 != 0) goto L43
            goto L176
        L43:
            int r10 = r9.wrPtr
            int r3 = r9.unpPtr
            int r4 = r10 - r3
            r0 = r0 & r4
            r4 = 270(0x10e, float:3.78E-43)
            if (r0 >= r4) goto L58
            if (r10 == r3) goto L58
            r9.oldUnpWriteBuf()
            boolean r10 = r9.suspended
            if (r10 == 0) goto L58
        L57:
            return
        L58:
            int r10 = r9.UnpAudioBlock
            r0 = 256(0x100, float:3.59E-43)
            if (r10 == 0) goto L93
            com.github.junrar.unpack.decode.MultDecode[] r10 = r9.MD
            int r3 = r9.UnpCurChannel
            r10 = r10[r3]
            int r10 = r9.decodeNumber(r10)
            if (r10 != r0) goto L72
            boolean r10 = r9.ReadTables20()
            if (r10 != 0) goto L23
            goto L176
        L72:
            byte[] r0 = r9.window
            int r3 = r9.unpPtr
            int r4 = r3 + 1
            r9.unpPtr = r4
            byte r10 = r9.DecodeAudio(r10)
            r0[r3] = r10
            int r10 = r9.UnpCurChannel
            int r10 = r10 + 1
            r9.UnpCurChannel = r10
            int r0 = r9.UnpChannels
            if (r10 != r0) goto L8d
            r10 = 0
            r9.UnpCurChannel = r10
        L8d:
            long r3 = r9.destUnpSize
            long r3 = r3 - r1
            r9.destUnpSize = r3
            goto L23
        L93:
            com.github.junrar.unpack.decode.LitDecode r10 = r9.LD
            int r10 = r9.decodeNumber(r10)
            if (r10 >= r0) goto Lad
            byte[] r0 = r9.window
            int r3 = r9.unpPtr
            int r4 = r3 + 1
            r9.unpPtr = r4
            byte r10 = (byte) r10
            r0[r3] = r10
            long r3 = r9.destUnpSize
            long r3 = r3 - r1
            r9.destUnpSize = r3
            goto L23
        Lad:
            r3 = 8192(0x2000, float:1.148E-41)
            r5 = 269(0x10d, float:3.77E-43)
            if (r10 <= r5) goto Lfe
            int[] r0 = com.github.junrar.unpack.Unpack20.LDecode
            int r10 = r10 + (-270)
            r0 = r0[r10]
            int r0 = r0 + 3
            byte[] r4 = com.github.junrar.unpack.Unpack20.LBits
            r10 = r4[r10]
            if (r10 <= 0) goto Lcc
            int r4 = r9.getbits()
            int r5 = 16 - r10
            int r4 = r4 >>> r5
            int r0 = r0 + r4
            r9.addbits(r10)
        Lcc:
            com.github.junrar.unpack.decode.DistDecode r10 = r9.DD
            int r10 = r9.decodeNumber(r10)
            int[] r4 = com.github.junrar.unpack.Unpack20.DDecode
            r4 = r4[r10]
            int r4 = r4 + 1
            int[] r5 = com.github.junrar.unpack.Unpack20.DBits
            r10 = r5[r10]
            if (r10 <= 0) goto Le9
            int r5 = r9.getbits()
            int r6 = 16 - r10
            int r5 = r5 >>> r6
            int r4 = r4 + r5
            r9.addbits(r10)
        Le9:
            if (r4 < r3) goto Lf9
            int r10 = r0 + 1
            long r5 = (long) r4
            r7 = 262144(0x40000, double:1.295163E-318)
            int r3 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r3 < 0) goto Lf8
            int r0 = r0 + 2
            goto Lf9
        Lf8:
            r0 = r10
        Lf9:
            r9.CopyString20(r0, r4)
            goto L23
        Lfe:
            if (r10 != r5) goto L108
            boolean r10 = r9.ReadTables20()
            if (r10 != 0) goto L23
            goto L176
        L108:
            if (r10 != r0) goto L113
            int r10 = r9.lastLength
            int r0 = r9.lastDist
            r9.CopyString20(r10, r0)
            goto L23
        L113:
            r0 = 261(0x105, float:3.66E-43)
            r5 = 2
            if (r10 >= r0) goto L156
            int[] r0 = r9.oldDist
            int r4 = r9.oldDistPtr
            int r10 = r10 + (-256)
            int r4 = r4 - r10
            r10 = r4 & 3
            r10 = r0[r10]
            com.github.junrar.unpack.decode.RepDecode r0 = r9.RD
            int r0 = r9.decodeNumber(r0)
            int[] r4 = com.github.junrar.unpack.Unpack20.LDecode
            r4 = r4[r0]
            int r4 = r4 + r5
            byte[] r5 = com.github.junrar.unpack.Unpack20.LBits
            r0 = r5[r0]
            if (r0 <= 0) goto L13f
            int r5 = r9.getbits()
            int r6 = 16 - r0
            int r5 = r5 >>> r6
            int r4 = r4 + r5
            r9.addbits(r0)
        L13f:
            r0 = 257(0x101, float:3.6E-43)
            if (r10 < r0) goto L151
            int r0 = r4 + 1
            if (r10 < r3) goto L150
            int r0 = r4 + 2
            r3 = 262144(0x40000, float:3.67342E-40)
            if (r10 < r3) goto L150
            int r4 = r4 + 3
            goto L151
        L150:
            r4 = r0
        L151:
            r9.CopyString20(r4, r10)
            goto L23
        L156:
            if (r10 >= r4) goto L23
            int[] r0 = com.github.junrar.unpack.Unpack20.SDDecode
            int r10 = r10 + (-261)
            r0 = r0[r10]
            int r0 = r0 + 1
            int[] r3 = com.github.junrar.unpack.Unpack20.SDBits
            r10 = r3[r10]
            if (r10 <= 0) goto L171
            int r3 = r9.getbits()
            int r4 = 16 - r10
            int r3 = r3 >>> r4
            int r0 = r0 + r3
            r9.addbits(r10)
        L171:
            r9.CopyString20(r5, r0)
            goto L23
        L176:
            r9.ReadLastTables()
            r9.oldUnpWriteBuf()
            return
    }
}

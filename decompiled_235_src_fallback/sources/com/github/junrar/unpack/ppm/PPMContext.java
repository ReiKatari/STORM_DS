package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class PPMContext extends com.github.junrar.unpack.ppm.Pointer {
    public static final int[] ExpEscape = null;
    public static final int size = 0;
    private static final int unionSize = 0;
    private final com.github.junrar.unpack.ppm.FreqData freqData;
    private int numStats;
    private final com.github.junrar.unpack.ppm.State oneState;
    private final int[] ps;
    private int suffix;
    private com.github.junrar.unpack.ppm.PPMContext tempPPMContext;
    private final com.github.junrar.unpack.ppm.State tempState1;
    private final com.github.junrar.unpack.ppm.State tempState2;
    private final com.github.junrar.unpack.ppm.State tempState3;
    private final com.github.junrar.unpack.ppm.State tempState4;
    private final com.github.junrar.unpack.ppm.State tempState5;

    static {
            r0 = 6
            int r1 = java.lang.Math.max(r0, r0)
            com.github.junrar.unpack.ppm.PPMContext.unionSize = r1
            int r1 = r1 + r0
            com.github.junrar.unpack.ppm.PPMContext.size = r1
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x0014: FILL_ARRAY_DATA  , data: [25, 14, 9, 7, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 2} // fill-array
            com.github.junrar.unpack.ppm.PPMContext.ExpEscape = r0
            return
    }

    public PPMContext(byte[] r3) {
            r2 = this;
            r2.<init>(r3)
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            r1 = 0
            r0.<init>(r1)
            r2.tempState1 = r0
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            r0.<init>(r1)
            r2.tempState2 = r0
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            r0.<init>(r1)
            r2.tempState3 = r0
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            r0.<init>(r1)
            r2.tempState4 = r0
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            r0.<init>(r1)
            r2.tempState5 = r0
            r2.tempPPMContext = r1
            r0 = 256(0x100, float:3.59E-43)
            int[] r0 = new int[r0]
            r2.ps = r0
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            r0.<init>(r3)
            r2.oneState = r0
            com.github.junrar.unpack.ppm.FreqData r0 = new com.github.junrar.unpack.ppm.FreqData
            r0.<init>(r3)
            r2.freqData = r0
            return
    }

    private int getArrayIndex(com.github.junrar.unpack.ppm.ModelPPM r3, com.github.junrar.unpack.ppm.State r4) {
            r2 = this;
            com.github.junrar.unpack.ppm.SubAllocator r0 = r3.getSubAlloc()
            byte[] r0 = r0.getHeap()
            com.github.junrar.unpack.ppm.PPMContext r0 = r2.getTempPPMContext(r0)
            int r2 = r2.getSuffix()
            r0.setAddress(r2)
            int r2 = r3.getPrevSuccess()
            int[] r1 = r3.getNS2BSIndx()
            int r0 = r0.getNumStats()
            int r0 = r0 + (-1)
            r0 = r1[r0]
            int r2 = r2 + r0
            int r0 = r3.getHiBitsFlag()
            int[] r1 = r3.getHB2Flag()
            int r4 = r4.getSymbol()
            r4 = r1[r4]
            int r4 = r4 * 2
            int r4 = r4 + r0
            int r4 = r4 + r2
            int r2 = r3.getRunLength()
            int r2 = r2 >>> 26
            r2 = r2 & 32
            int r4 = r4 + r2
            return r4
    }

    private com.github.junrar.unpack.ppm.PPMContext getTempPPMContext(byte[] r3) {
            r2 = this;
            com.github.junrar.unpack.ppm.PPMContext r0 = r2.tempPPMContext
            if (r0 != 0) goto Lc
            com.github.junrar.unpack.ppm.PPMContext r0 = new com.github.junrar.unpack.ppm.PPMContext
            r1 = 0
            r0.<init>(r1)
            r2.tempPPMContext = r0
        Lc:
            com.github.junrar.unpack.ppm.PPMContext r2 = r2.tempPPMContext
            com.github.junrar.unpack.ppm.PPMContext r2 = r2.init(r3)
            return r2
    }

    private com.github.junrar.unpack.ppm.SEE2Context makeEscFreq2(com.github.junrar.unpack.ppm.ModelPPM r6, int r7) {
            r5 = this;
            int r0 = r5.getNumStats()
            r1 = 256(0x100, float:3.59E-43)
            if (r0 == r1) goto L63
            byte[] r1 = r6.getHeap()
            com.github.junrar.unpack.ppm.PPMContext r1 = r5.getTempPPMContext(r1)
            int r2 = r5.getSuffix()
            r1.setAddress(r2)
            int[] r2 = r6.getNS2Indx()
            int r3 = r7 + (-1)
            r2 = r2[r3]
            int r1 = r1.getNumStats()
            int r1 = r1 - r0
            r3 = 0
            r4 = 1
            if (r7 >= r1) goto L2a
            r1 = r4
            goto L2b
        L2a:
            r1 = r3
        L2b:
            com.github.junrar.unpack.ppm.FreqData r5 = r5.freqData
            int r5 = r5.getSummFreq()
            int r0 = r0 * 11
            if (r5 >= r0) goto L37
            r5 = r4
            goto L38
        L37:
            r5 = r3
        L38:
            int r5 = r5 * 2
            int r5 = r5 + r1
            int r0 = r6.getNumMasked()
            if (r0 <= r7) goto L42
            r3 = r4
        L42:
            int r3 = r3 * 4
            int r3 = r3 + r5
            int r5 = r6.getHiBitsFlag()
            int r5 = r5 + r3
            com.github.junrar.unpack.ppm.SEE2Context[][] r7 = r6.getSEE2Cont()
            r7 = r7[r2]
            r5 = r7[r5]
            com.github.junrar.unpack.ppm.RangeCoder r6 = r6.getCoder()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r6 = r6.getSubRange()
            int r7 = r5.getMean()
            long r0 = (long) r7
            r6.setScale(r0)
            return r5
        L63:
            com.github.junrar.unpack.ppm.SEE2Context r5 = r6.getDummySEE2Cont()
            com.github.junrar.unpack.ppm.RangeCoder r6 = r6.getCoder()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r6 = r6.getSubRange()
            r0 = 1
            r6.setScale(r0)
            return r5
    }

    public int createChild(com.github.junrar.unpack.ppm.ModelPPM r2, com.github.junrar.unpack.ppm.State r3, com.github.junrar.unpack.ppm.StateRef r4) {
            r1 = this;
            com.github.junrar.unpack.ppm.SubAllocator r0 = r2.getSubAlloc()
            byte[] r0 = r0.getHeap()
            com.github.junrar.unpack.ppm.PPMContext r0 = r1.getTempPPMContext(r0)
            com.github.junrar.unpack.ppm.SubAllocator r2 = r2.getSubAlloc()
            int r2 = r2.allocContext()
            r0.setAddress(r2)
            r2 = 1
            r0.setNumStats(r2)
            r0.setOneState(r4)
            r0.setSuffix(r1)
            r3.setSuccessor(r0)
            int r1 = r0.getAddress()
            return r1
    }

    public void decodeBinSymbol(com.github.junrar.unpack.ppm.ModelPPM r14) {
            r13 = this;
            com.github.junrar.unpack.ppm.State r0 = r13.tempState1
            byte[] r1 = r14.getHeap()
            com.github.junrar.unpack.ppm.State r0 = r0.init(r1)
            com.github.junrar.unpack.ppm.State r1 = r13.oneState
            int r1 = r1.getAddress()
            r0.setAddress(r1)
            int[] r1 = r14.getHB2Flag()
            com.github.junrar.unpack.ppm.State r2 = r14.getFoundState()
            int r2 = r2.getSymbol()
            r1 = r1[r2]
            r14.setHiBitsFlag(r1)
            int r1 = r0.getFreq()
            r2 = 1
            int r1 = r1 - r2
            int r3 = r13.getArrayIndex(r14, r0)
            int[][] r4 = r14.getBinSumm()
            r4 = r4[r1]
            r4 = r4[r3]
            com.github.junrar.unpack.ppm.RangeCoder r5 = r14.getCoder()
            r6 = 14
            long r5 = r5.getCurrentShiftCount(r6)
            long r7 = (long) r4
            int r5 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            r6 = 65535(0xffff, float:9.1834E-41)
            r9 = 2
            r10 = 7
            r11 = 0
            if (r5 >= 0) goto L92
            com.github.junrar.unpack.ppm.State r5 = r14.getFoundState()
            int r12 = r0.getAddress()
            r5.setAddress(r12)
            int r5 = r0.getFreq()
            r12 = 128(0x80, float:1.8E-43)
            if (r5 >= r12) goto L5f
            r11 = r2
        L5f:
            r0.incFreq(r11)
            com.github.junrar.unpack.ppm.RangeCoder r0 = r14.getCoder()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r0.getSubRange()
            r11 = 0
            r0.setLowCount(r11)
            com.github.junrar.unpack.ppm.RangeCoder r0 = r14.getCoder()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r0.getSubRange()
            r0.setHighCount(r7)
            int r0 = r4 + 128
            int r13 = r13.getMean(r4, r10, r9)
            int r0 = r0 - r13
            r13 = r0 & r6
            int[][] r0 = r14.getBinSumm()
            r0 = r0[r1]
            r0[r3] = r13
            r14.setPrevSuccess(r2)
            r14.incRunLength(r2)
            return
        L92:
            com.github.junrar.unpack.ppm.RangeCoder r5 = r14.getCoder()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r5 = r5.getSubRange()
            r5.setLowCount(r7)
            int r13 = r13.getMean(r4, r10, r9)
            int r4 = r4 - r13
            r13 = r4 & r6
            int[][] r4 = r14.getBinSumm()
            r1 = r4[r1]
            r1[r3] = r13
            com.github.junrar.unpack.ppm.RangeCoder r1 = r14.getCoder()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r1 = r1.getSubRange()
            r3 = 16384(0x4000, double:8.095E-320)
            r1.setHighCount(r3)
            int[] r1 = com.github.junrar.unpack.ppm.PPMContext.ExpEscape
            int r13 = r13 >>> 10
            r13 = r1[r13]
            r14.setInitEsc(r13)
            r14.setNumMasked(r2)
            int[] r13 = r14.getCharMask()
            int r0 = r0.getSymbol()
            int r1 = r14.getEscCount()
            r13[r0] = r1
            r14.setPrevSuccess(r11)
            com.github.junrar.unpack.ppm.State r13 = r14.getFoundState()
            r13.setAddress(r11)
            return
    }

    public boolean decodeSymbol1(com.github.junrar.unpack.ppm.ModelPPM r14) {
            r13 = this;
            com.github.junrar.unpack.ppm.RangeCoder r0 = r14.getCoder()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r1 = r0.getSubRange()
            com.github.junrar.unpack.ppm.FreqData r2 = r13.freqData
            int r2 = r2.getSummFreq()
            long r2 = (long) r2
            r1.setScale(r2)
            com.github.junrar.unpack.ppm.State r1 = new com.github.junrar.unpack.ppm.State
            byte[] r2 = r14.getHeap()
            r1.<init>(r2)
            com.github.junrar.unpack.ppm.FreqData r2 = r13.freqData
            int r2 = r2.getStats()
            r1.setAddress(r2)
            int r2 = r0.getCurrentCount()
            long r2 = (long) r2
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r4 = r0.getSubRange()
            long r4 = r4.getScale()
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            r5 = 0
            if (r4 < 0) goto L37
            return r5
        L37:
            int r4 = r1.getFreq()
            long r6 = (long) r4
            int r8 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            r9 = 1
            if (r8 >= 0) goto L8c
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r2 = r0.getSubRange()
            r2.setHighCount(r6)
            int r2 = r4 * 2
            long r2 = (long) r2
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r6 = r0.getSubRange()
            long r6 = r6.getScale()
            int r2 = (r2 > r6 ? 1 : (r2 == r6 ? 0 : -1))
            if (r2 <= 0) goto L58
            r5 = r9
        L58:
            r14.setPrevSuccess(r5)
            int r2 = r14.getPrevSuccess()
            r14.incRunLength(r2)
            r2 = 4
            int r4 = r4 + r2
            com.github.junrar.unpack.ppm.State r3 = r14.getFoundState()
            int r1 = r1.getAddress()
            r3.setAddress(r1)
            com.github.junrar.unpack.ppm.State r1 = r14.getFoundState()
            r1.setFreq(r4)
            com.github.junrar.unpack.ppm.FreqData r1 = r13.freqData
            r1.incSummFreq(r2)
            r1 = 124(0x7c, float:1.74E-43)
            if (r4 <= r1) goto L82
            r13.rescale(r14)
        L82:
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r13 = r0.getSubRange()
            r0 = 0
            r13.setLowCount(r0)
            return r9
        L8c:
            com.github.junrar.unpack.ppm.State r6 = r14.getFoundState()
            int r6 = r6.getAddress()
            if (r6 != 0) goto L97
            return r5
        L97:
            r14.setPrevSuccess(r5)
            int r6 = r13.getNumStats()
            int r7 = r6 + (-1)
            r8 = r7
        La1:
            com.github.junrar.unpack.ppm.State r10 = r1.incAddress()
            int r10 = r10.getFreq()
            int r4 = r4 + r10
            long r10 = (long) r4
            int r12 = (r10 > r2 ? 1 : (r10 == r2 ? 0 : -1))
            if (r12 > 0) goto L109
            int r8 = r8 + (-1)
            if (r8 != 0) goto La1
            int[] r13 = r14.getHB2Flag()
            com.github.junrar.unpack.ppm.State r2 = r14.getFoundState()
            int r2 = r2.getSymbol()
            r13 = r13[r2]
            r14.setHiBitsFlag(r13)
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r13 = r0.getSubRange()
            r13.setLowCount(r10)
            int[] r13 = r14.getCharMask()
            int r2 = r1.getSymbol()
            int r3 = r14.getEscCount()
            r13[r2] = r3
            r14.setNumMasked(r6)
            com.github.junrar.unpack.ppm.State r13 = r14.getFoundState()
            r13.setAddress(r5)
        Le3:
            int[] r13 = r14.getCharMask()
            com.github.junrar.unpack.ppm.State r2 = r1.decAddress()
            int r2 = r2.getSymbol()
            int r3 = r14.getEscCount()
            r13[r2] = r3
            int r7 = r7 + (-1)
            if (r7 != 0) goto Le3
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r13 = r0.getSubRange()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r14 = r0.getSubRange()
            long r0 = r14.getScale()
            r13.setHighCount(r0)
            return r9
        L109:
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r2 = r0.getSubRange()
            int r3 = r1.getFreq()
            int r4 = r4 - r3
            long r3 = (long) r4
            r2.setLowCount(r3)
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r0.getSubRange()
            r0.setHighCount(r10)
            int r0 = r1.getAddress()
            r13.update1(r14, r0)
            return r9
    }

    public boolean decodeSymbol2(com.github.junrar.unpack.ppm.ModelPPM r13) {
            r12 = this;
            int r0 = r12.getNumStats()
            int r1 = r13.getNumMasked()
            int r0 = r0 - r1
            com.github.junrar.unpack.ppm.SEE2Context r1 = r12.makeEscFreq2(r13, r0)
            com.github.junrar.unpack.ppm.RangeCoder r2 = r13.getCoder()
            com.github.junrar.unpack.ppm.State r3 = r12.tempState1
            byte[] r4 = r13.getHeap()
            com.github.junrar.unpack.ppm.State r3 = r3.init(r4)
            com.github.junrar.unpack.ppm.State r4 = r12.tempState2
            byte[] r5 = r13.getHeap()
            com.github.junrar.unpack.ppm.State r4 = r4.init(r5)
            com.github.junrar.unpack.ppm.FreqData r5 = r12.freqData
            int r5 = r5.getStats()
            int r5 = r5 + (-6)
            r3.setAddress(r5)
            r5 = 0
            r6 = r5
            r7 = r6
        L33:
            r3.incAddress()
            int[] r8 = r13.getCharMask()
            int r9 = r3.getSymbol()
            r8 = r8[r9]
            int r9 = r13.getEscCount()
            if (r8 == r9) goto L33
            int r8 = r3.getFreq()
            int r6 = r6 + r8
            int[] r8 = r12.ps
            int r9 = r7 + 1
            int r10 = r3.getAddress()
            r8[r7] = r10
            int r0 = r0 + (-1)
            if (r0 != 0) goto L100
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r2.getSubRange()
            r0.incScale(r6)
            int r0 = r2.getCurrentCount()
            long r7 = (long) r0
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r2.getSubRange()
            long r9 = r0.getScale()
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r0 < 0) goto L72
            return r5
        L72:
            int[] r0 = r12.ps
            r0 = r0[r5]
            r3.setAddress(r0)
            long r9 = (long) r6
            int r0 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            r11 = 1
            if (r0 >= 0) goto Lb2
            r0 = r5
        L80:
            int r4 = r3.getFreq()
            int r5 = r5 + r4
            long r9 = (long) r5
            int r4 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r4 > 0) goto L93
            int[] r4 = r12.ps
            int r0 = r0 + r11
            r4 = r4[r0]
            r3.setAddress(r4)
            goto L80
        L93:
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r2.getSubRange()
            r0.setHighCount(r9)
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r2.getSubRange()
            int r2 = r3.getFreq()
            int r5 = r5 - r2
            long r4 = (long) r5
            r0.setLowCount(r4)
            r1.update()
            int r0 = r3.getAddress()
            r12.update2(r13, r0)
            goto Lff
        Lb2:
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r2.getSubRange()
            r0.setLowCount(r9)
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r2.getSubRange()
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r3 = r2.getSubRange()
            long r5 = r3.getScale()
            r0.setHighCount(r5)
            int r0 = r12.getNumStats()
            int r3 = r13.getNumMasked()
            int r0 = r0 - r3
            r7 = -1
            r3 = r7
        Ld3:
            int[] r5 = r12.ps
            int r3 = r3 + r11
            r5 = r5[r3]
            r4.setAddress(r5)
            int[] r5 = r13.getCharMask()
            int r6 = r4.getSymbol()
            int r8 = r13.getEscCount()
            r5[r6] = r8
            int r0 = r0 + r7
            if (r0 != 0) goto Ld3
            com.github.junrar.unpack.ppm.RangeCoder$SubRange r0 = r2.getSubRange()
            long r2 = r0.getScale()
            int r0 = (int) r2
            r1.incSumm(r0)
            int r12 = r12.getNumStats()
            r13.setNumMasked(r12)
        Lff:
            return r11
        L100:
            r7 = r9
            goto L33
    }

    public com.github.junrar.unpack.ppm.FreqData getFreqData() {
            r0 = this;
            com.github.junrar.unpack.ppm.FreqData r0 = r0.freqData
            return r0
    }

    public int getMean(int r1, int r2, int r3) {
            r0 = this;
            r0 = 1
            int r3 = r2 - r3
            int r0 = r0 << r3
            int r1 = r1 + r0
            int r0 = r1 >>> r2
            return r0
    }

    public final int getNumStats() {
            r2 = this;
            byte[] r0 = r2.mem
            if (r0 == 0) goto L10
            int r1 = r2.pos
            short r0 = com.github.junrar.io.Raw.readShortLittleEndian(r0, r1)
            r1 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r1
            r2.numStats = r0
        L10:
            int r2 = r2.numStats
            return r2
    }

    public com.github.junrar.unpack.ppm.State getOneState() {
            r0 = this;
            com.github.junrar.unpack.ppm.State r0 = r0.oneState
            return r0
    }

    public int getSuffix() {
            r2 = this;
            byte[] r0 = r2.mem
            if (r0 == 0) goto Le
            int r1 = r2.pos
            int r1 = r1 + 8
            int r0 = com.github.junrar.io.Raw.readIntLittleEndian(r0, r1)
            r2.suffix = r0
        Le:
            int r2 = r2.suffix
            return r2
    }

    public com.github.junrar.unpack.ppm.PPMContext init(byte[] r2) {
            r1 = this;
            r1.mem = r2
            r0 = 0
            r1.pos = r0
            com.github.junrar.unpack.ppm.State r0 = r1.oneState
            r0.init(r2)
            com.github.junrar.unpack.ppm.FreqData r0 = r1.freqData
            r0.init(r2)
            return r1
    }

    public void rescale(com.github.junrar.unpack.ppm.ModelPPM r14) {
            r13 = this;
            int r0 = r13.getNumStats()
            int r1 = r13.getNumStats()
            r2 = 1
            int r1 = r1 - r2
            com.github.junrar.unpack.ppm.State r3 = new com.github.junrar.unpack.ppm.State
            byte[] r4 = r14.getHeap()
            r3.<init>(r4)
            com.github.junrar.unpack.ppm.State r4 = new com.github.junrar.unpack.ppm.State
            byte[] r5 = r14.getHeap()
            r4.<init>(r5)
            com.github.junrar.unpack.ppm.State r5 = new com.github.junrar.unpack.ppm.State
            byte[] r6 = r14.getHeap()
            r5.<init>(r6)
            com.github.junrar.unpack.ppm.State r6 = r14.getFoundState()
            int r6 = r6.getAddress()
            r4.setAddress(r6)
        L30:
            int r6 = r4.getAddress()
            com.github.junrar.unpack.ppm.FreqData r7 = r13.freqData
            int r7 = r7.getStats()
            if (r6 == r7) goto L4c
            int r6 = r4.getAddress()
            int r6 = r6 + (-6)
            r5.setAddress(r6)
            com.github.junrar.unpack.ppm.State.ppmdSwap(r4, r5)
            r4.decAddress()
            goto L30
        L4c:
            com.github.junrar.unpack.ppm.FreqData r6 = r13.freqData
            int r6 = r6.getStats()
            r5.setAddress(r6)
            r6 = 4
            r5.incFreq(r6)
            com.github.junrar.unpack.ppm.FreqData r7 = r13.freqData
            r7.incSummFreq(r6)
            com.github.junrar.unpack.ppm.FreqData r6 = r13.freqData
            int r6 = r6.getSummFreq()
            int r7 = r4.getFreq()
            int r6 = r6 - r7
            int r7 = r14.getOrderFall()
            if (r7 == 0) goto L71
            r7 = r2
            goto L72
        L71:
            r7 = 0
        L72:
            int r8 = r4.getFreq()
            int r8 = r8 + r7
            int r8 = r8 >>> r2
            r4.setFreq(r8)
            com.github.junrar.unpack.ppm.FreqData r8 = r13.freqData
            int r9 = r4.getFreq()
            r8.setSummFreq(r9)
        L84:
            r4.incAddress()
            int r8 = r4.getFreq()
            int r6 = r6 - r8
            int r8 = r4.getFreq()
            int r8 = r8 + r7
            int r8 = r8 >>> r2
            r4.setFreq(r8)
            com.github.junrar.unpack.ppm.FreqData r8 = r13.freqData
            int r9 = r4.getFreq()
            r8.incSummFreq(r9)
            int r8 = r4.getAddress()
            int r8 = r8 + (-6)
            r5.setAddress(r8)
            int r8 = r4.getFreq()
            int r9 = r5.getFreq()
            if (r8 <= r9) goto L103
            int r8 = r4.getAddress()
            r3.setAddress(r8)
            com.github.junrar.unpack.ppm.StateRef r8 = new com.github.junrar.unpack.ppm.StateRef
            r8.<init>()
            r8.setValues(r3)
            com.github.junrar.unpack.ppm.State r9 = new com.github.junrar.unpack.ppm.State
            byte[] r10 = r14.getHeap()
            r9.<init>(r10)
            com.github.junrar.unpack.ppm.State r10 = new com.github.junrar.unpack.ppm.State
            byte[] r11 = r14.getHeap()
            r10.<init>(r11)
        Ld2:
            int r11 = r3.getAddress()
            int r11 = r11 + (-6)
            r9.setAddress(r11)
            r3.setValues(r9)
            r3.decAddress()
            int r11 = r3.getAddress()
            int r11 = r11 + (-6)
            r10.setAddress(r11)
            int r11 = r3.getAddress()
            com.github.junrar.unpack.ppm.FreqData r12 = r13.freqData
            int r12 = r12.getStats()
            if (r11 == r12) goto L100
            int r11 = r8.getFreq()
            int r12 = r10.getFreq()
            if (r11 > r12) goto Ld2
        L100:
            r3.setValues(r8)
        L103:
            int r1 = r1 + (-1)
            if (r1 != 0) goto L84
            int r3 = r4.getFreq()
            if (r3 != 0) goto L164
        L10d:
            int r1 = r1 + r2
            r4.decAddress()
            int r3 = r4.getFreq()
            if (r3 == 0) goto L10d
            int r6 = r6 + r1
            int r3 = r13.getNumStats()
            int r3 = r3 - r1
            r13.setNumStats(r3)
            int r1 = r13.getNumStats()
            if (r1 != r2) goto L164
            com.github.junrar.unpack.ppm.StateRef r1 = new com.github.junrar.unpack.ppm.StateRef
            r1.<init>()
            com.github.junrar.unpack.ppm.FreqData r3 = r13.freqData
            int r3 = r3.getStats()
            r5.setAddress(r3)
            r1.setValues(r5)
        L137:
            int r3 = r1.getFreq()
            int r3 = r3 >>> r2
            r1.decFreq(r3)
            int r6 = r6 >>> r2
            if (r6 > r2) goto L137
            com.github.junrar.unpack.ppm.SubAllocator r3 = r14.getSubAlloc()
            com.github.junrar.unpack.ppm.FreqData r4 = r13.freqData
            int r4 = r4.getStats()
            int r0 = r0 + r2
            int r0 = r0 >>> r2
            r3.freeUnits(r4, r0)
            com.github.junrar.unpack.ppm.State r0 = r13.oneState
            r0.setValues(r1)
            com.github.junrar.unpack.ppm.State r14 = r14.getFoundState()
            com.github.junrar.unpack.ppm.State r13 = r13.oneState
            int r13 = r13.getAddress()
            r14.setAddress(r13)
            return
        L164:
            int r1 = r6 >>> 1
            int r6 = r6 - r1
            com.github.junrar.unpack.ppm.FreqData r1 = r13.freqData
            r1.incSummFreq(r6)
            int r0 = r0 + r2
            int r0 = r0 >>> r2
            int r1 = r13.getNumStats()
            int r1 = r1 + r2
            int r1 = r1 >>> r2
            if (r0 == r1) goto L189
            com.github.junrar.unpack.ppm.FreqData r2 = r13.freqData
            com.github.junrar.unpack.ppm.SubAllocator r3 = r14.getSubAlloc()
            com.github.junrar.unpack.ppm.FreqData r4 = r13.freqData
            int r4 = r4.getStats()
            int r0 = r3.shrinkUnits(r4, r0, r1)
            r2.setStats(r0)
        L189:
            com.github.junrar.unpack.ppm.State r14 = r14.getFoundState()
            com.github.junrar.unpack.ppm.FreqData r13 = r13.freqData
            int r13 = r13.getStats()
            r14.setAddress(r13)
            return
    }

    @Override // com.github.junrar.unpack.ppm.Pointer
    public void setAddress(int r2) {
            r1 = this;
            super.setAddress(r2)
            com.github.junrar.unpack.ppm.State r0 = r1.oneState
            int r2 = r2 + 2
            r0.setAddress(r2)
            com.github.junrar.unpack.ppm.FreqData r1 = r1.freqData
            r1.setAddress(r2)
            return
    }

    public void setFreqData(com.github.junrar.unpack.ppm.FreqData r3) {
            r2 = this;
            com.github.junrar.unpack.ppm.FreqData r0 = r2.freqData
            int r1 = r3.getSummFreq()
            r0.setSummFreq(r1)
            com.github.junrar.unpack.ppm.FreqData r2 = r2.freqData
            int r3 = r3.getStats()
            r2.setStats(r3)
            return
    }

    public final void setNumStats(int r2) {
            r1 = this;
            r0 = 65535(0xffff, float:9.1834E-41)
            r0 = r0 & r2
            r1.numStats = r0
            byte[] r0 = r1.mem
            if (r0 == 0) goto L10
            int r1 = r1.pos
            short r2 = (short) r2
            com.github.junrar.io.Raw.writeShortLittleEndian(r0, r1, r2)
        L10:
            return
    }

    public void setOneState(com.github.junrar.unpack.ppm.StateRef r1) {
            r0 = this;
            com.github.junrar.unpack.ppm.State r0 = r0.oneState
            r0.setValues(r1)
            return
    }

    public void setSuffix(int r2) {
            r1 = this;
            r1.suffix = r2
            byte[] r0 = r1.mem
            if (r0 == 0) goto Ld
            int r1 = r1.pos
            int r1 = r1 + 8
            com.github.junrar.io.Raw.writeIntLittleEndian(r0, r1, r2)
        Ld:
            return
    }

    public void setSuffix(com.github.junrar.unpack.ppm.PPMContext r1) {
            r0 = this;
            int r1 = r1.getAddress()
            r0.setSuffix(r1)
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "PPMContext[\n  pos="
            r0.<init>(r1)
            int r1 = r2.pos
            r0.append(r1)
            java.lang.String r1 = "\n  size="
            r0.append(r1)
            int r1 = com.github.junrar.unpack.ppm.PPMContext.size
            r0.append(r1)
            java.lang.String r1 = "\n  numStats="
            r0.append(r1)
            int r1 = r2.getNumStats()
            r0.append(r1)
            java.lang.String r1 = "\n  Suffix="
            r0.append(r1)
            int r1 = r2.getSuffix()
            r0.append(r1)
            java.lang.String r1 = "\n  freqData="
            r0.append(r1)
            com.github.junrar.unpack.ppm.FreqData r1 = r2.freqData
            r0.append(r1)
            java.lang.String r1 = "\n  oneState="
            r0.append(r1)
            com.github.junrar.unpack.ppm.State r2 = r2.oneState
            r0.append(r2)
            java.lang.String r2 = "\n]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public void update1(com.github.junrar.unpack.ppm.ModelPPM r4, int r5) {
            r3 = this;
            com.github.junrar.unpack.ppm.State r0 = r4.getFoundState()
            r0.setAddress(r5)
            com.github.junrar.unpack.ppm.State r0 = r4.getFoundState()
            r1 = 4
            r0.incFreq(r1)
            com.github.junrar.unpack.ppm.FreqData r0 = r3.freqData
            r0.incSummFreq(r1)
            com.github.junrar.unpack.ppm.State r0 = r3.tempState3
            byte[] r1 = r4.getHeap()
            com.github.junrar.unpack.ppm.State r0 = r0.init(r1)
            com.github.junrar.unpack.ppm.State r1 = r3.tempState4
            byte[] r2 = r4.getHeap()
            com.github.junrar.unpack.ppm.State r1 = r1.init(r2)
            r0.setAddress(r5)
            int r5 = r5 + (-6)
            r1.setAddress(r5)
            int r5 = r0.getFreq()
            int r2 = r1.getFreq()
            if (r5 <= r2) goto L53
            com.github.junrar.unpack.ppm.State.ppmdSwap(r0, r1)
            com.github.junrar.unpack.ppm.State r5 = r4.getFoundState()
            int r0 = r1.getAddress()
            r5.setAddress(r0)
            int r5 = r1.getFreq()
            r0 = 124(0x7c, float:1.74E-43)
            if (r5 <= r0) goto L53
            r3.rescale(r4)
        L53:
            return
    }

    public void update2(com.github.junrar.unpack.ppm.ModelPPM r3, int r4) {
            r2 = this;
            com.github.junrar.unpack.ppm.State r0 = r2.tempState5
            byte[] r1 = r3.getHeap()
            com.github.junrar.unpack.ppm.State r0 = r0.init(r1)
            r0.setAddress(r4)
            com.github.junrar.unpack.ppm.State r1 = r3.getFoundState()
            r1.setAddress(r4)
            com.github.junrar.unpack.ppm.State r4 = r3.getFoundState()
            r1 = 4
            r4.incFreq(r1)
            com.github.junrar.unpack.ppm.FreqData r4 = r2.freqData
            r4.incSummFreq(r1)
            int r4 = r0.getFreq()
            r0 = 124(0x7c, float:1.74E-43)
            if (r4 <= r0) goto L2c
            r2.rescale(r3)
        L2c:
            r2 = 1
            r3.incEscCount(r2)
            int r2 = r3.getInitRL()
            r3.setRunLength(r2)
            return
    }
}

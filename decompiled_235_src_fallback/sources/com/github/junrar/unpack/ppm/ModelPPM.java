package com.github.junrar.unpack.ppm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModelPPM {
    public static final int BIN_SCALE = 16384;
    public static final int INTERVAL = 128;
    public static final int INT_BITS = 7;
    private static final int[] InitBinEsc = null;
    public static final int MAX_FREQ = 124;
    public static final int MAX_O = 64;
    public static final int PERIOD_BITS = 7;
    public static final int TOT_BITS = 14;
    private final int[] HB2Flag;
    private final int[] NS2BSIndx;
    private final int[] NS2Indx;
    private final com.github.junrar.unpack.ppm.SEE2Context[][] SEE2Cont;
    private final int[][] binSumm;
    private final int[] charMask;
    private final com.github.junrar.unpack.ppm.RangeCoder coder;
    private com.github.junrar.unpack.ppm.SEE2Context dummySEE2Cont;
    private int escCount;
    private com.github.junrar.unpack.ppm.State foundState;
    private int hiBitsFlag;
    private int initEsc;
    private int initRL;
    private com.github.junrar.unpack.ppm.PPMContext maxContext;
    private int maxOrder;
    private com.github.junrar.unpack.ppm.PPMContext minContext;
    private int numMasked;
    private int orderFall;
    private int prevSuccess;
    private final int[] ps;
    private int runLength;
    private final com.github.junrar.unpack.ppm.SubAllocator subAlloc;
    private final com.github.junrar.unpack.ppm.PPMContext tempPPMContext1;
    private final com.github.junrar.unpack.ppm.PPMContext tempPPMContext2;
    private final com.github.junrar.unpack.ppm.PPMContext tempPPMContext3;
    private final com.github.junrar.unpack.ppm.PPMContext tempPPMContext4;
    private final com.github.junrar.unpack.ppm.State tempState1;
    private final com.github.junrar.unpack.ppm.State tempState2;
    private final com.github.junrar.unpack.ppm.State tempState3;
    private final com.github.junrar.unpack.ppm.State tempState4;
    private final com.github.junrar.unpack.ppm.StateRef tempStateRef1;
    private final com.github.junrar.unpack.ppm.StateRef tempStateRef2;

    static {
            r0 = 8
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA  , data: [15581, 7999, 22975, 18675, 25761, 23228, 26162, 24657} // fill-array
            com.github.junrar.unpack.ppm.ModelPPM.InitBinEsc = r0
            return
    }

    public ModelPPM() {
            r5 = this;
            r5.<init>()
            r0 = 2
            int[] r1 = new int[r0]
            r2 = 1
            r3 = 16
            r1[r2] = r3
            r3 = 0
            r4 = 25
            r1[r3] = r4
            java.lang.Class<com.github.junrar.unpack.ppm.SEE2Context> r4 = com.github.junrar.unpack.ppm.SEE2Context.class
            java.lang.Object r1 = java.lang.reflect.Array.newInstance(r4, r1)
            com.github.junrar.unpack.ppm.SEE2Context[][] r1 = (com.github.junrar.unpack.ppm.SEE2Context[][]) r1
            r5.SEE2Cont = r1
            r1 = 256(0x100, float:3.59E-43)
            int[] r4 = new int[r1]
            r5.charMask = r4
            int[] r4 = new int[r1]
            r5.NS2Indx = r4
            int[] r4 = new int[r1]
            r5.NS2BSIndx = r4
            int[] r1 = new int[r1]
            r5.HB2Flag = r1
            int[] r0 = new int[r0]
            r1 = 64
            r0[r2] = r1
            r2 = 128(0x80, float:1.8E-43)
            r0[r3] = r2
            java.lang.Class r2 = java.lang.Integer.TYPE
            java.lang.Object r0 = java.lang.reflect.Array.newInstance(r2, r0)
            int[][] r0 = (int[][]) r0
            r5.binSumm = r0
            com.github.junrar.unpack.ppm.RangeCoder r0 = new com.github.junrar.unpack.ppm.RangeCoder
            r0.<init>()
            r5.coder = r0
            com.github.junrar.unpack.ppm.SubAllocator r0 = new com.github.junrar.unpack.ppm.SubAllocator
            r0.<init>()
            r5.subAlloc = r0
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            r2 = 0
            r0.<init>(r2)
            r5.tempState1 = r0
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            r0.<init>(r2)
            r5.tempState2 = r0
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            r0.<init>(r2)
            r5.tempState3 = r0
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            r0.<init>(r2)
            r5.tempState4 = r0
            com.github.junrar.unpack.ppm.StateRef r0 = new com.github.junrar.unpack.ppm.StateRef
            r0.<init>()
            r5.tempStateRef1 = r0
            com.github.junrar.unpack.ppm.StateRef r0 = new com.github.junrar.unpack.ppm.StateRef
            r0.<init>()
            r5.tempStateRef2 = r0
            com.github.junrar.unpack.ppm.PPMContext r0 = new com.github.junrar.unpack.ppm.PPMContext
            r0.<init>(r2)
            r5.tempPPMContext1 = r0
            com.github.junrar.unpack.ppm.PPMContext r0 = new com.github.junrar.unpack.ppm.PPMContext
            r0.<init>(r2)
            r5.tempPPMContext2 = r0
            com.github.junrar.unpack.ppm.PPMContext r0 = new com.github.junrar.unpack.ppm.PPMContext
            r0.<init>(r2)
            r5.tempPPMContext3 = r0
            com.github.junrar.unpack.ppm.PPMContext r0 = new com.github.junrar.unpack.ppm.PPMContext
            r0.<init>(r2)
            r5.tempPPMContext4 = r0
            int[] r0 = new int[r1]
            r5.ps = r0
            r5.minContext = r2
            r5.maxContext = r2
            return
    }

    private void clearMask() {
            r1 = this;
            r0 = 1
            r1.escCount = r0
            int[] r1 = r1.charMask
            r0 = 0
            java.util.Arrays.fill(r1, r0)
            return
    }

    private int createSuccessors(boolean r10, com.github.junrar.unpack.ppm.State r11) {
            r9 = this;
            com.github.junrar.unpack.ppm.StateRef r0 = r9.tempStateRef2
            com.github.junrar.unpack.ppm.State r1 = r9.tempState1
            byte[] r2 = r9.getHeap()
            com.github.junrar.unpack.ppm.State r1 = r1.init(r2)
            com.github.junrar.unpack.ppm.PPMContext r2 = r9.tempPPMContext1
            byte[] r3 = r9.getHeap()
            com.github.junrar.unpack.ppm.PPMContext r2 = r2.init(r3)
            com.github.junrar.unpack.ppm.PPMContext r3 = r9.minContext
            int r3 = r3.getAddress()
            r2.setAddress(r3)
            com.github.junrar.unpack.ppm.PPMContext r3 = r9.tempPPMContext2
            byte[] r4 = r9.getHeap()
            com.github.junrar.unpack.ppm.PPMContext r3 = r3.init(r4)
            com.github.junrar.unpack.ppm.State r4 = r9.foundState
            int r4 = r4.getSuccessor()
            r3.setAddress(r4)
            com.github.junrar.unpack.ppm.State r4 = r9.tempState2
            byte[] r5 = r9.getHeap()
            com.github.junrar.unpack.ppm.State r4 = r4.init(r5)
            r5 = 1
            r6 = 0
            if (r10 != 0) goto L56
            int[] r10 = r9.ps
            com.github.junrar.unpack.ppm.State r7 = r9.foundState
            int r7 = r7.getAddress()
            r10[r6] = r7
            int r10 = r2.getSuffix()
            if (r10 != 0) goto L53
            r10 = r5
        L51:
            r7 = r10
            goto L58
        L53:
            r7 = r5
            r10 = r6
            goto L58
        L56:
            r10 = r6
            goto L51
        L58:
            if (r10 != 0) goto Ld5
            int r10 = r11.getAddress()
            if (r10 == 0) goto L70
            int r10 = r11.getAddress()
            r4.setAddress(r10)
            int r10 = r2.getSuffix()
            r2.setAddress(r10)
            r10 = r5
            goto L71
        L70:
            r10 = r6
        L71:
            if (r10 != 0) goto Lb2
            int r10 = r2.getSuffix()
            r2.setAddress(r10)
            int r10 = r2.getNumStats()
            if (r10 == r5) goto La7
            com.github.junrar.unpack.ppm.FreqData r10 = r2.getFreqData()
            int r10 = r10.getStats()
            r4.setAddress(r10)
            int r10 = r4.getSymbol()
            com.github.junrar.unpack.ppm.State r11 = r9.foundState
            int r11 = r11.getSymbol()
            if (r10 == r11) goto Lb2
        L97:
            r4.incAddress()
            int r10 = r4.getSymbol()
            com.github.junrar.unpack.ppm.State r11 = r9.foundState
            int r11 = r11.getSymbol()
            if (r10 != r11) goto L97
            goto Lb2
        La7:
            com.github.junrar.unpack.ppm.State r10 = r2.getOneState()
            int r10 = r10.getAddress()
            r4.setAddress(r10)
        Lb2:
            int r10 = r4.getSuccessor()
            int r11 = r3.getAddress()
            if (r10 == r11) goto Lc4
            int r10 = r4.getSuccessor()
            r2.setAddress(r10)
            goto Ld5
        Lc4:
            int[] r10 = r9.ps
            int r11 = r7 + 1
            int r8 = r4.getAddress()
            r10[r7] = r8
            int r10 = r2.getSuffix()
            r7 = r11
            if (r10 != 0) goto L70
        Ld5:
            if (r7 != 0) goto Ldc
            int r9 = r2.getAddress()
            return r9
        Ldc:
            byte[] r10 = r9.getHeap()
            int r11 = r3.getAddress()
            r10 = r10[r11]
            r0.setSymbol(r10)
            int r10 = r3.getAddress()
            int r10 = r10 + r5
            r0.setSuccessor(r10)
            int r10 = r2.getNumStats()
            if (r10 == r5) goto L151
            int r10 = r2.getAddress()
            com.github.junrar.unpack.ppm.SubAllocator r11 = r9.subAlloc
            int r11 = r11.getPText()
            if (r10 > r11) goto L104
            return r6
        L104:
            com.github.junrar.unpack.ppm.FreqData r10 = r2.getFreqData()
            int r10 = r10.getStats()
            r4.setAddress(r10)
            int r10 = r4.getSymbol()
            int r11 = r0.getSymbol()
            if (r10 == r11) goto L126
        L119:
            r4.incAddress()
            int r10 = r4.getSymbol()
            int r11 = r0.getSymbol()
            if (r10 != r11) goto L119
        L126:
            int r10 = r4.getFreq()
            int r10 = r10 - r5
            com.github.junrar.unpack.ppm.FreqData r11 = r2.getFreqData()
            int r11 = r11.getSummFreq()
            int r3 = r2.getNumStats()
            int r11 = r11 - r3
            int r11 = r11 - r10
            int r3 = r10 * 2
            if (r3 > r11) goto L145
            int r10 = r10 * 5
            if (r10 <= r11) goto L143
            r10 = r5
            goto L14c
        L143:
            r10 = r6
            goto L14c
        L145:
            int r10 = r11 * 3
            int r10 = r10 + r3
            int r10 = r10 - r5
            int r11 = r11 * 2
            int r10 = r10 / r11
        L14c:
            int r5 = r5 + r10
            r0.setFreq(r5)
            goto L15c
        L151:
            com.github.junrar.unpack.ppm.State r10 = r2.getOneState()
            int r10 = r10.getFreq()
            r0.setFreq(r10)
        L15c:
            int[] r10 = r9.ps
            int r7 = r7 + (-1)
            r10 = r10[r7]
            r1.setAddress(r10)
            int r10 = r2.createChild(r9, r1, r0)
            r2.setAddress(r10)
            int r10 = r2.getAddress()
            if (r10 != 0) goto L173
            return r6
        L173:
            if (r7 != 0) goto L15c
            int r9 = r2.getAddress()
            return r9
    }

    private void restartModelRare() {
            r9 = this;
            int[] r0 = r9.charMask
            r1 = 0
            java.util.Arrays.fill(r0, r1)
            com.github.junrar.unpack.ppm.SubAllocator r0 = r9.subAlloc
            r0.initSubAllocator()
            int r0 = r9.maxOrder
            r2 = 12
            int r0 = java.lang.Math.min(r0, r2)
            int r0 = -r0
            r2 = 1
            int r0 = r0 - r2
            r9.initRL = r0
            com.github.junrar.unpack.ppm.SubAllocator r0 = r9.subAlloc
            int r0 = r0.allocContext()
            com.github.junrar.unpack.ppm.PPMContext r3 = r9.minContext
            r3.setAddress(r0)
            com.github.junrar.unpack.ppm.PPMContext r3 = r9.maxContext
            r3.setAddress(r0)
            com.github.junrar.unpack.ppm.PPMContext r0 = r9.minContext
            r0.setSuffix(r1)
            int r0 = r9.maxOrder
            r9.orderFall = r0
            com.github.junrar.unpack.ppm.PPMContext r0 = r9.minContext
            r3 = 256(0x100, float:3.59E-43)
            r0.setNumStats(r3)
            com.github.junrar.unpack.ppm.PPMContext r0 = r9.minContext
            com.github.junrar.unpack.ppm.FreqData r0 = r0.getFreqData()
            com.github.junrar.unpack.ppm.PPMContext r4 = r9.minContext
            int r4 = r4.getNumStats()
            int r4 = r4 + r2
            r0.setSummFreq(r4)
            com.github.junrar.unpack.ppm.SubAllocator r0 = r9.subAlloc
            r4 = 128(0x80, float:1.8E-43)
            int r0 = r0.allocUnits(r4)
            com.github.junrar.unpack.ppm.State r5 = r9.foundState
            r5.setAddress(r0)
            com.github.junrar.unpack.ppm.PPMContext r5 = r9.minContext
            com.github.junrar.unpack.ppm.FreqData r5 = r5.getFreqData()
            r5.setStats(r0)
            com.github.junrar.unpack.ppm.State r0 = new com.github.junrar.unpack.ppm.State
            com.github.junrar.unpack.ppm.SubAllocator r5 = r9.subAlloc
            byte[] r5 = r5.getHeap()
            r0.<init>(r5)
            com.github.junrar.unpack.ppm.PPMContext r5 = r9.minContext
            com.github.junrar.unpack.ppm.FreqData r5 = r5.getFreqData()
            int r5 = r5.getStats()
            int r6 = r9.initRL
            r9.runLength = r6
            r9.prevSuccess = r1
            r6 = r1
        L7a:
            if (r6 >= r3) goto L8e
            int r7 = r6 * 6
            int r7 = r7 + r5
            r0.setAddress(r7)
            r0.setSymbol(r6)
            r0.setFreq(r2)
            r0.setSuccessor(r1)
            int r6 = r6 + 1
            goto L7a
        L8e:
            r0 = r1
        L8f:
            if (r0 >= r4) goto Lb5
            r2 = r1
        L92:
            r3 = 8
            if (r2 >= r3) goto Lb2
            r3 = r1
        L97:
            r5 = 64
            if (r3 >= r5) goto Laf
            int[][] r5 = r9.binSumm
            r5 = r5[r0]
            int r6 = r2 + r3
            int[] r7 = com.github.junrar.unpack.ppm.ModelPPM.InitBinEsc
            r7 = r7[r2]
            int r8 = r0 + 2
            int r7 = r7 / r8
            int r7 = 16384 - r7
            r5[r6] = r7
            int r3 = r3 + 8
            goto L97
        Laf:
            int r2 = r2 + 1
            goto L92
        Lb2:
            int r0 = r0 + 1
            goto L8f
        Lb5:
            r0 = r1
        Lb6:
            r2 = 25
            if (r0 >= r2) goto Ld2
            r2 = r1
        Lbb:
            r3 = 16
            if (r2 >= r3) goto Lcf
            com.github.junrar.unpack.ppm.SEE2Context[][] r3 = r9.SEE2Cont
            r3 = r3[r0]
            r3 = r3[r2]
            int r4 = r0 * 5
            int r4 = r4 + 10
            r3.init(r4)
            int r2 = r2 + 1
            goto Lbb
        Lcf:
            int r0 = r0 + 1
            goto Lb6
        Ld2:
            return
    }

    private void startModelRare(int r6) {
            r5 = this;
            r0 = 1
            r5.escCount = r0
            r5.maxOrder = r6
            r5.restartModelRare()
            int[] r6 = r5.NS2BSIndx
            r1 = 0
            r6[r1] = r1
            r2 = 2
            r6[r0] = r2
            r6 = r1
        L11:
            r2 = 9
            if (r6 >= r2) goto L1f
            int[] r2 = r5.NS2BSIndx
            int r3 = r6 + 2
            r4 = 4
            r2[r3] = r4
            int r6 = r6 + 1
            goto L11
        L1f:
            r6 = r1
        L20:
            r2 = 245(0xf5, float:3.43E-43)
            if (r6 >= r2) goto L2e
            int[] r2 = r5.NS2BSIndx
            int r3 = r6 + 11
            r4 = 6
            r2[r3] = r4
            int r6 = r6 + 1
            goto L20
        L2e:
            r6 = r1
        L2f:
            r2 = 3
            if (r6 >= r2) goto L39
            int[] r2 = r5.NS2Indx
            r2[r6] = r6
            int r6 = r6 + 1
            goto L2f
        L39:
            r2 = r0
            r3 = r2
            r0 = r6
        L3c:
            r4 = 256(0x100, float:3.59E-43)
            if (r6 >= r4) goto L50
            int[] r4 = r5.NS2Indx
            r4[r6] = r0
            int r2 = r2 + (-1)
            if (r2 != 0) goto L4d
            int r3 = r3 + 1
            int r0 = r0 + 1
            r2 = r3
        L4d:
            int r6 = r6 + 1
            goto L3c
        L50:
            r6 = r1
        L51:
            r0 = 64
            if (r6 >= r0) goto L5c
            int[] r0 = r5.HB2Flag
            r0[r6] = r1
            int r6 = r6 + 1
            goto L51
        L5c:
            r6 = 192(0xc0, float:2.69E-43)
            if (r1 >= r6) goto L6b
            int[] r6 = r5.HB2Flag
            int r0 = r1 + 64
            r2 = 8
            r6[r0] = r2
            int r1 = r1 + 1
            goto L5c
        L6b:
            com.github.junrar.unpack.ppm.SEE2Context r5 = r5.dummySEE2Cont
            r6 = 7
            r5.setShift(r6)
            return
    }

    private void updateModel() {
            r15 = this;
            com.github.junrar.unpack.ppm.StateRef r0 = r15.tempStateRef1
            com.github.junrar.unpack.ppm.State r1 = r15.foundState
            r0.setValues(r1)
            com.github.junrar.unpack.ppm.State r1 = r15.tempState3
            byte[] r2 = r15.getHeap()
            com.github.junrar.unpack.ppm.State r1 = r1.init(r2)
            com.github.junrar.unpack.ppm.State r2 = r15.tempState4
            byte[] r3 = r15.getHeap()
            com.github.junrar.unpack.ppm.State r2 = r2.init(r3)
            com.github.junrar.unpack.ppm.PPMContext r3 = r15.tempPPMContext3
            byte[] r4 = r15.getHeap()
            com.github.junrar.unpack.ppm.PPMContext r3 = r3.init(r4)
            com.github.junrar.unpack.ppm.PPMContext r4 = r15.tempPPMContext4
            byte[] r5 = r15.getHeap()
            com.github.junrar.unpack.ppm.PPMContext r4 = r4.init(r5)
            com.github.junrar.unpack.ppm.PPMContext r5 = r15.minContext
            int r5 = r5.getSuffix()
            r3.setAddress(r5)
            int r5 = r0.getFreq()
            r6 = 31
            r7 = 2
            r8 = 1
            if (r5 >= r6) goto Lb2
            int r5 = r3.getAddress()
            if (r5 == 0) goto Lb2
            int r5 = r3.getNumStats()
            if (r5 == r8) goto L9c
            com.github.junrar.unpack.ppm.FreqData r5 = r3.getFreqData()
            int r5 = r5.getStats()
            r1.setAddress(r5)
            int r5 = r1.getSymbol()
            int r6 = r0.getSymbol()
            if (r5 == r6) goto L89
        L63:
            r1.incAddress()
            int r5 = r1.getSymbol()
            int r6 = r0.getSymbol()
            if (r5 != r6) goto L63
            int r5 = r1.getAddress()
            int r5 = r5 + (-6)
            r2.setAddress(r5)
            int r5 = r1.getFreq()
            int r6 = r2.getFreq()
            if (r5 < r6) goto L89
            com.github.junrar.unpack.ppm.State.ppmdSwap(r1, r2)
            r1.decAddress()
        L89:
            int r2 = r1.getFreq()
            r5 = 115(0x73, float:1.61E-43)
            if (r2 >= r5) goto Lb2
            r1.incFreq(r7)
            com.github.junrar.unpack.ppm.FreqData r2 = r3.getFreqData()
            r2.incSummFreq(r7)
            goto Lb2
        L9c:
            com.github.junrar.unpack.ppm.State r2 = r3.getOneState()
            int r2 = r2.getAddress()
            r1.setAddress(r2)
            int r2 = r1.getFreq()
            r5 = 32
            if (r2 >= r5) goto Lb2
            r1.incFreq(r8)
        Lb2:
            int r2 = r15.orderFall
            if (r2 != 0) goto Le1
            com.github.junrar.unpack.ppm.State r0 = r15.foundState
            int r1 = r15.createSuccessors(r8, r1)
            r0.setSuccessor(r1)
            com.github.junrar.unpack.ppm.PPMContext r0 = r15.minContext
            com.github.junrar.unpack.ppm.State r1 = r15.foundState
            int r1 = r1.getSuccessor()
            r0.setAddress(r1)
            com.github.junrar.unpack.ppm.PPMContext r0 = r15.maxContext
            com.github.junrar.unpack.ppm.State r1 = r15.foundState
            int r1 = r1.getSuccessor()
            r0.setAddress(r1)
            com.github.junrar.unpack.ppm.PPMContext r0 = r15.minContext
            int r0 = r0.getAddress()
            if (r0 != 0) goto Le0
            r15.updateModelRestart()
        Le0:
            return
        Le1:
            com.github.junrar.unpack.ppm.SubAllocator r2 = r15.subAlloc
            byte[] r2 = r2.getHeap()
            com.github.junrar.unpack.ppm.SubAllocator r5 = r15.subAlloc
            int r5 = r5.getPText()
            int r6 = r0.getSymbol()
            byte r6 = (byte) r6
            r2[r5] = r6
            com.github.junrar.unpack.ppm.SubAllocator r2 = r15.subAlloc
            r2.incPText()
            com.github.junrar.unpack.ppm.SubAllocator r2 = r15.subAlloc
            int r2 = r2.getPText()
            r4.setAddress(r2)
            com.github.junrar.unpack.ppm.SubAllocator r2 = r15.subAlloc
            int r2 = r2.getPText()
            com.github.junrar.unpack.ppm.SubAllocator r5 = r15.subAlloc
            int r5 = r5.getFakeUnitsStart()
            if (r2 < r5) goto L114
            r15.updateModelRestart()
            return
        L114:
            int r2 = r0.getSuccessor()
            r5 = 0
            if (r2 == 0) goto L15a
            int r2 = r0.getSuccessor()
            com.github.junrar.unpack.ppm.SubAllocator r6 = r15.subAlloc
            int r6 = r6.getPText()
            if (r2 > r6) goto L138
            int r2 = r15.createSuccessors(r5, r1)
            r0.setSuccessor(r2)
            int r2 = r0.getSuccessor()
            if (r2 != 0) goto L138
            r15.updateModelRestart()
            return
        L138:
            int r2 = r15.orderFall
            int r2 = r2 - r8
            r15.orderFall = r2
            if (r2 != 0) goto L168
            int r2 = r0.getSuccessor()
            r4.setAddress(r2)
            com.github.junrar.unpack.ppm.PPMContext r2 = r15.maxContext
            int r2 = r2.getAddress()
            com.github.junrar.unpack.ppm.PPMContext r6 = r15.minContext
            int r6 = r6.getAddress()
            if (r2 == r6) goto L168
            com.github.junrar.unpack.ppm.SubAllocator r2 = r15.subAlloc
            r2.decPText(r8)
            goto L168
        L15a:
            com.github.junrar.unpack.ppm.State r2 = r15.foundState
            int r6 = r4.getAddress()
            r2.setSuccessor(r6)
            com.github.junrar.unpack.ppm.PPMContext r2 = r15.minContext
            r0.setSuccessor(r2)
        L168:
            com.github.junrar.unpack.ppm.PPMContext r2 = r15.minContext
            int r2 = r2.getNumStats()
            com.github.junrar.unpack.ppm.PPMContext r6 = r15.minContext
            com.github.junrar.unpack.ppm.FreqData r6 = r6.getFreqData()
            int r6 = r6.getSummFreq()
            int r6 = r6 - r2
            int r9 = r0.getFreq()
            int r9 = r9 - r8
            int r6 = r6 - r9
            com.github.junrar.unpack.ppm.PPMContext r9 = r15.maxContext
            int r9 = r9.getAddress()
            r3.setAddress(r9)
        L188:
            int r9 = r3.getAddress()
            com.github.junrar.unpack.ppm.PPMContext r10 = r15.minContext
            int r10 = r10.getAddress()
            if (r9 == r10) goto L2b3
            int r9 = r3.getNumStats()
            r10 = 3
            if (r9 == r8) goto L1ec
            r11 = r9 & 1
            if (r11 != 0) goto L1c4
            com.github.junrar.unpack.ppm.FreqData r11 = r3.getFreqData()
            com.github.junrar.unpack.ppm.SubAllocator r12 = r15.subAlloc
            com.github.junrar.unpack.ppm.FreqData r13 = r3.getFreqData()
            int r13 = r13.getStats()
            int r14 = r9 >>> 1
            int r12 = r12.expandUnits(r13, r14)
            r11.setStats(r12)
            com.github.junrar.unpack.ppm.FreqData r11 = r3.getFreqData()
            int r11 = r11.getStats()
            if (r11 != 0) goto L1c4
            r15.updateModelRestart()
            return
        L1c4:
            int r11 = r9 * 2
            if (r11 >= r2) goto L1ca
            r11 = r8
            goto L1cb
        L1ca:
            r11 = r5
        L1cb:
            int r12 = r9 * 4
            if (r12 > r2) goto L1d1
            r12 = r8
            goto L1d2
        L1d1:
            r12 = r5
        L1d2:
            com.github.junrar.unpack.ppm.FreqData r13 = r3.getFreqData()
            int r13 = r13.getSummFreq()
            int r14 = r9 * 8
            if (r13 > r14) goto L1e0
            r13 = r8
            goto L1e1
        L1e0:
            r13 = r5
        L1e1:
            r12 = r12 & r13
            int r12 = r12 * r7
            int r12 = r12 + r11
            com.github.junrar.unpack.ppm.FreqData r11 = r3.getFreqData()
            r11.incSummFreq(r12)
            goto L236
        L1ec:
            com.github.junrar.unpack.ppm.SubAllocator r11 = r15.subAlloc
            int r11 = r11.allocUnits(r8)
            r1.setAddress(r11)
            int r11 = r1.getAddress()
            if (r11 != 0) goto L1ff
            r15.updateModelRestart()
            return
        L1ff:
            com.github.junrar.unpack.ppm.State r11 = r3.getOneState()
            r1.setValues(r11)
            com.github.junrar.unpack.ppm.FreqData r11 = r3.getFreqData()
            r11.setStats(r1)
            int r11 = r1.getFreq()
            r12 = 30
            if (r11 >= r12) goto L21d
            int r11 = r1.getFreq()
            r1.incFreq(r11)
            goto L222
        L21d:
            r11 = 120(0x78, float:1.68E-43)
            r1.setFreq(r11)
        L222:
            com.github.junrar.unpack.ppm.FreqData r11 = r3.getFreqData()
            int r12 = r1.getFreq()
            int r13 = r15.initEsc
            int r12 = r12 + r13
            if (r2 <= r10) goto L231
            r13 = r8
            goto L232
        L231:
            r13 = r5
        L232:
            int r12 = r12 + r13
            r11.setSummFreq(r12)
        L236:
            int r11 = r0.getFreq()
            int r11 = r11 * r7
            com.github.junrar.unpack.ppm.FreqData r12 = r3.getFreqData()
            int r12 = r12.getSummFreq()
            int r12 = r12 + 6
            int r12 = r12 * r11
            com.github.junrar.unpack.ppm.FreqData r11 = r3.getFreqData()
            int r11 = r11.getSummFreq()
            int r11 = r11 + r6
            int r13 = r11 * 6
            if (r12 >= r13) goto L269
            if (r12 <= r11) goto L257
            r13 = r8
            goto L258
        L257:
            r13 = r5
        L258:
            int r13 = r13 + r8
            int r11 = r11 * 4
            if (r12 < r11) goto L25f
            r11 = r8
            goto L260
        L25f:
            r11 = r5
        L260:
            int r13 = r13 + r11
            com.github.junrar.unpack.ppm.FreqData r11 = r3.getFreqData()
            r11.incSummFreq(r10)
            goto L28a
        L269:
            int r10 = r11 * 9
            if (r12 < r10) goto L26f
            r10 = r8
            goto L270
        L26f:
            r10 = r5
        L270:
            int r10 = r10 + 4
            int r13 = r11 * 12
            if (r12 < r13) goto L278
            r13 = r8
            goto L279
        L278:
            r13 = r5
        L279:
            int r10 = r10 + r13
            int r11 = r11 * 15
            if (r12 < r11) goto L280
            r11 = r8
            goto L281
        L280:
            r11 = r5
        L281:
            int r13 = r10 + r11
            com.github.junrar.unpack.ppm.FreqData r10 = r3.getFreqData()
            r10.incSummFreq(r13)
        L28a:
            com.github.junrar.unpack.ppm.FreqData r10 = r3.getFreqData()
            int r10 = r10.getStats()
            int r11 = r9 * 6
            int r11 = r11 + r10
            r1.setAddress(r11)
            r1.setSuccessor(r4)
            int r10 = r0.getSymbol()
            r1.setSymbol(r10)
            r1.setFreq(r13)
            int r9 = r9 + 1
            r3.setNumStats(r9)
            int r9 = r3.getSuffix()
            r3.setAddress(r9)
            goto L188
        L2b3:
            int r0 = r0.getSuccessor()
            com.github.junrar.unpack.ppm.PPMContext r1 = r15.maxContext
            r1.setAddress(r0)
            com.github.junrar.unpack.ppm.PPMContext r15 = r15.minContext
            r15.setAddress(r0)
            return
    }

    private void updateModelRestart() {
            r1 = this;
            r1.restartModelRare()
            r0 = 0
            r1.escCount = r0
            return
    }

    public int decodeChar() {
            r4 = this;
            com.github.junrar.unpack.ppm.PPMContext r0 = r4.minContext
            int r0 = r0.getAddress()
            com.github.junrar.unpack.ppm.SubAllocator r1 = r4.subAlloc
            int r1 = r1.getPText()
            r2 = -1
            if (r0 <= r1) goto Le9
            com.github.junrar.unpack.ppm.PPMContext r0 = r4.minContext
            int r0 = r0.getAddress()
            com.github.junrar.unpack.ppm.SubAllocator r1 = r4.subAlloc
            int r1 = r1.getHeapEnd()
            if (r0 <= r1) goto L1f
            goto Le9
        L1f:
            com.github.junrar.unpack.ppm.PPMContext r0 = r4.minContext
            int r0 = r0.getNumStats()
            com.github.junrar.unpack.ppm.PPMContext r1 = r4.minContext
            r3 = 1
            if (r0 == r3) goto L56
            com.github.junrar.unpack.ppm.FreqData r0 = r1.getFreqData()
            int r0 = r0.getStats()
            com.github.junrar.unpack.ppm.SubAllocator r1 = r4.subAlloc
            int r1 = r1.getPText()
            if (r0 <= r1) goto L55
            com.github.junrar.unpack.ppm.PPMContext r0 = r4.minContext
            com.github.junrar.unpack.ppm.FreqData r0 = r0.getFreqData()
            int r0 = r0.getStats()
            com.github.junrar.unpack.ppm.SubAllocator r1 = r4.subAlloc
            int r1 = r1.getHeapEnd()
            if (r0 <= r1) goto L4d
            goto L55
        L4d:
            com.github.junrar.unpack.ppm.PPMContext r0 = r4.minContext
            boolean r0 = r0.decodeSymbol1(r4)
            if (r0 != 0) goto L59
        L55:
            return r2
        L56:
            r1.decodeBinSymbol(r4)
        L59:
            com.github.junrar.unpack.ppm.RangeCoder r0 = r4.coder
            r0.decode()
        L5e:
            com.github.junrar.unpack.ppm.State r0 = r4.foundState
            int r0 = r0.getAddress()
            if (r0 != 0) goto Lb0
            com.github.junrar.unpack.ppm.RangeCoder r0 = r4.coder
            r0.ariDecNormalize()
        L6b:
            int r0 = r4.orderFall
            int r0 = r0 + r3
            r4.orderFall = r0
            com.github.junrar.unpack.ppm.PPMContext r0 = r4.minContext
            int r1 = r0.getSuffix()
            r0.setAddress(r1)
            com.github.junrar.unpack.ppm.PPMContext r0 = r4.minContext
            int r0 = r0.getAddress()
            com.github.junrar.unpack.ppm.SubAllocator r1 = r4.subAlloc
            int r1 = r1.getPText()
            if (r0 <= r1) goto Laf
            com.github.junrar.unpack.ppm.PPMContext r0 = r4.minContext
            int r0 = r0.getAddress()
            com.github.junrar.unpack.ppm.SubAllocator r1 = r4.subAlloc
            int r1 = r1.getHeapEnd()
            if (r0 <= r1) goto L96
            goto Laf
        L96:
            com.github.junrar.unpack.ppm.PPMContext r0 = r4.minContext
            int r0 = r0.getNumStats()
            int r1 = r4.numMasked
            if (r0 == r1) goto L6b
            com.github.junrar.unpack.ppm.PPMContext r0 = r4.minContext
            boolean r0 = r0.decodeSymbol2(r4)
            if (r0 != 0) goto La9
            return r2
        La9:
            com.github.junrar.unpack.ppm.RangeCoder r0 = r4.coder
            r0.decode()
            goto L5e
        Laf:
            return r2
        Lb0:
            com.github.junrar.unpack.ppm.State r0 = r4.foundState
            int r0 = r0.getSymbol()
            int r1 = r4.orderFall
            if (r1 != 0) goto Ld9
            com.github.junrar.unpack.ppm.State r1 = r4.foundState
            int r1 = r1.getSuccessor()
            com.github.junrar.unpack.ppm.SubAllocator r2 = r4.subAlloc
            int r2 = r2.getPText()
            if (r1 <= r2) goto Ld9
            com.github.junrar.unpack.ppm.State r1 = r4.foundState
            int r1 = r1.getSuccessor()
            com.github.junrar.unpack.ppm.PPMContext r2 = r4.minContext
            r2.setAddress(r1)
            com.github.junrar.unpack.ppm.PPMContext r2 = r4.maxContext
            r2.setAddress(r1)
            goto Le3
        Ld9:
            r4.updateModel()
            int r1 = r4.escCount
            if (r1 != 0) goto Le3
            r4.clearMask()
        Le3:
            com.github.junrar.unpack.ppm.RangeCoder r4 = r4.coder
            r4.ariDecNormalize()
            return r0
        Le9:
            return r2
    }

    public boolean decodeInit(com.github.junrar.unpack.Unpack r7, int r8) {
            r6 = this;
            int r8 = r7.getChar()
            r0 = r8 & 32
            r1 = 0
            r2 = 1
            if (r0 == 0) goto Lc
            r0 = r2
            goto Ld
        Lc:
            r0 = r1
        Ld:
            if (r0 == 0) goto L17
            int r3 = r7.getChar()
            if (r3 <= r2) goto L21
            r3 = r2
            goto L21
        L17:
            com.github.junrar.unpack.ppm.SubAllocator r3 = r6.subAlloc
            int r3 = r3.GetAllocatedMemory()
            if (r3 != 0) goto L20
            return r1
        L20:
            r3 = r1
        L21:
            r4 = r8 & 64
            if (r4 == 0) goto L2c
            int r4 = r7.getChar()
            r7.setPpmEscChar(r4)
        L2c:
            com.github.junrar.unpack.ppm.RangeCoder r4 = r6.coder
            r4.initDecoder(r7)
            if (r0 == 0) goto L91
            r7 = r8 & 31
            int r8 = r7 + 1
            r0 = 16
            if (r8 <= r0) goto L41
            int r7 = r7 + (-15)
            int r7 = r7 * 3
            int r8 = r7 + 16
        L41:
            com.github.junrar.unpack.ppm.SubAllocator r7 = r6.subAlloc
            if (r8 != r2) goto L49
            r7.stopSubAllocator()
            return r1
        L49:
            int r3 = r3 + r2
            r7.startSubAllocator(r3)
            com.github.junrar.unpack.ppm.PPMContext r7 = new com.github.junrar.unpack.ppm.PPMContext
            byte[] r3 = r6.getHeap()
            r7.<init>(r3)
            r6.minContext = r7
            com.github.junrar.unpack.ppm.PPMContext r7 = new com.github.junrar.unpack.ppm.PPMContext
            byte[] r3 = r6.getHeap()
            r7.<init>(r3)
            r6.maxContext = r7
            com.github.junrar.unpack.ppm.State r7 = new com.github.junrar.unpack.ppm.State
            byte[] r3 = r6.getHeap()
            r7.<init>(r3)
            r6.foundState = r7
            com.github.junrar.unpack.ppm.SEE2Context r7 = new com.github.junrar.unpack.ppm.SEE2Context
            r7.<init>()
            r6.dummySEE2Cont = r7
            r7 = r1
        L76:
            r3 = 25
            if (r7 >= r3) goto L8e
            r3 = r1
        L7b:
            if (r3 >= r0) goto L8b
            com.github.junrar.unpack.ppm.SEE2Context[][] r4 = r6.SEE2Cont
            r4 = r4[r7]
            com.github.junrar.unpack.ppm.SEE2Context r5 = new com.github.junrar.unpack.ppm.SEE2Context
            r5.<init>()
            r4[r3] = r5
            int r3 = r3 + 1
            goto L7b
        L8b:
            int r7 = r7 + 1
            goto L76
        L8e:
            r6.startModelRare(r8)
        L91:
            com.github.junrar.unpack.ppm.PPMContext r6 = r6.minContext
            int r6 = r6.getAddress()
            if (r6 == 0) goto L9a
            return r2
        L9a:
            return r1
    }

    public int[][] getBinSumm() {
            r0 = this;
            int[][] r0 = r0.binSumm
            return r0
    }

    public int[] getCharMask() {
            r0 = this;
            int[] r0 = r0.charMask
            return r0
    }

    public com.github.junrar.unpack.ppm.RangeCoder getCoder() {
            r0 = this;
            com.github.junrar.unpack.ppm.RangeCoder r0 = r0.coder
            return r0
    }

    public com.github.junrar.unpack.ppm.SEE2Context getDummySEE2Cont() {
            r0 = this;
            com.github.junrar.unpack.ppm.SEE2Context r0 = r0.dummySEE2Cont
            return r0
    }

    public int getEscCount() {
            r0 = this;
            int r0 = r0.escCount
            return r0
    }

    public com.github.junrar.unpack.ppm.State getFoundState() {
            r0 = this;
            com.github.junrar.unpack.ppm.State r0 = r0.foundState
            return r0
    }

    public int[] getHB2Flag() {
            r0 = this;
            int[] r0 = r0.HB2Flag
            return r0
    }

    public byte[] getHeap() {
            r0 = this;
            com.github.junrar.unpack.ppm.SubAllocator r0 = r0.subAlloc
            byte[] r0 = r0.getHeap()
            return r0
    }

    public int getHiBitsFlag() {
            r0 = this;
            int r0 = r0.hiBitsFlag
            return r0
    }

    public int getInitEsc() {
            r0 = this;
            int r0 = r0.initEsc
            return r0
    }

    public int getInitRL() {
            r0 = this;
            int r0 = r0.initRL
            return r0
    }

    public int[] getNS2BSIndx() {
            r0 = this;
            int[] r0 = r0.NS2BSIndx
            return r0
    }

    public int[] getNS2Indx() {
            r0 = this;
            int[] r0 = r0.NS2Indx
            return r0
    }

    public int getNumMasked() {
            r0 = this;
            int r0 = r0.numMasked
            return r0
    }

    public int getOrderFall() {
            r0 = this;
            int r0 = r0.orderFall
            return r0
    }

    public int getPrevSuccess() {
            r0 = this;
            int r0 = r0.prevSuccess
            return r0
    }

    public int getRunLength() {
            r0 = this;
            int r0 = r0.runLength
            return r0
    }

    public com.github.junrar.unpack.ppm.SEE2Context[][] getSEE2Cont() {
            r0 = this;
            com.github.junrar.unpack.ppm.SEE2Context[][] r0 = r0.SEE2Cont
            return r0
    }

    public com.github.junrar.unpack.ppm.SubAllocator getSubAlloc() {
            r0 = this;
            com.github.junrar.unpack.ppm.SubAllocator r0 = r0.subAlloc
            return r0
    }

    public void incEscCount(int r2) {
            r1 = this;
            int r0 = r1.getEscCount()
            int r0 = r0 + r2
            r1.setEscCount(r0)
            return
    }

    public void incRunLength(int r2) {
            r1 = this;
            int r0 = r1.getRunLength()
            int r0 = r0 + r2
            r1.setRunLength(r0)
            return
    }

    public void setEscCount(int r1) {
            r0 = this;
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.escCount = r1
            return
    }

    public void setHiBitsFlag(int r1) {
            r0 = this;
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.hiBitsFlag = r1
            return
    }

    public void setInitEsc(int r1) {
            r0 = this;
            r0.initEsc = r1
            return
    }

    public void setNumMasked(int r1) {
            r0 = this;
            r0.numMasked = r1
            return
    }

    public void setPrevSuccess(int r1) {
            r0 = this;
            r1 = r1 & 255(0xff, float:3.57E-43)
            r0.prevSuccess = r1
            return
    }

    public void setRunLength(int r1) {
            r0 = this;
            r0.runLength = r1
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "ModelPPM[\n  numMasked="
            r0.<init>(r1)
            int r1 = r2.numMasked
            r0.append(r1)
            java.lang.String r1 = "\n  initEsc="
            r0.append(r1)
            int r1 = r2.initEsc
            r0.append(r1)
            java.lang.String r1 = "\n  orderFall="
            r0.append(r1)
            int r1 = r2.orderFall
            r0.append(r1)
            java.lang.String r1 = "\n  maxOrder="
            r0.append(r1)
            int r1 = r2.maxOrder
            r0.append(r1)
            java.lang.String r1 = "\n  runLength="
            r0.append(r1)
            int r1 = r2.runLength
            r0.append(r1)
            java.lang.String r1 = "\n  initRL="
            r0.append(r1)
            int r1 = r2.initRL
            r0.append(r1)
            java.lang.String r1 = "\n  escCount="
            r0.append(r1)
            int r1 = r2.escCount
            r0.append(r1)
            java.lang.String r1 = "\n  prevSuccess="
            r0.append(r1)
            int r1 = r2.prevSuccess
            r0.append(r1)
            java.lang.String r1 = "\n  foundState="
            r0.append(r1)
            com.github.junrar.unpack.ppm.State r1 = r2.foundState
            r0.append(r1)
            java.lang.String r1 = "\n  coder="
            r0.append(r1)
            com.github.junrar.unpack.ppm.RangeCoder r1 = r2.coder
            r0.append(r1)
            java.lang.String r1 = "\n  subAlloc="
            r0.append(r1)
            com.github.junrar.unpack.ppm.SubAllocator r2 = r2.subAlloc
            r0.append(r2)
            java.lang.String r2 = "\n]"
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }
}

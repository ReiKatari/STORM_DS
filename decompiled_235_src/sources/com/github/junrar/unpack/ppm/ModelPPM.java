package com.github.junrar.unpack.ppm;

import com.github.junrar.unpack.Unpack;
import java.lang.reflect.Array;
import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModelPPM {
    public static final int BIN_SCALE = 16384;
    public static final int INTERVAL = 128;
    public static final int INT_BITS = 7;
    private static final int[] InitBinEsc = {15581, 7999, 22975, 18675, 25761, 23228, 26162, 24657};
    public static final int MAX_FREQ = 124;
    public static final int MAX_O = 64;
    public static final int PERIOD_BITS = 7;
    public static final int TOT_BITS = 14;
    private SEE2Context dummySEE2Cont;
    private int escCount;
    private State foundState;
    private int hiBitsFlag;
    private int initEsc;
    private int initRL;
    private int maxOrder;
    private int numMasked;
    private int orderFall;
    private int prevSuccess;
    private int runLength;
    private final SEE2Context[][] SEE2Cont = (SEE2Context[][]) Array.newInstance(SEE2Context.class, 25, 16);
    private final int[] charMask = new int[256];
    private final int[] NS2Indx = new int[256];
    private final int[] NS2BSIndx = new int[256];
    private final int[] HB2Flag = new int[256];
    private final int[][] binSumm = (int[][]) Array.newInstance(Integer.TYPE, 128, 64);
    private final RangeCoder coder = new RangeCoder();
    private final SubAllocator subAlloc = new SubAllocator();
    private final State tempState1 = new State(null);
    private final State tempState2 = new State(null);
    private final State tempState3 = new State(null);
    private final State tempState4 = new State(null);
    private final StateRef tempStateRef1 = new StateRef();
    private final StateRef tempStateRef2 = new StateRef();
    private final PPMContext tempPPMContext1 = new PPMContext(null);
    private final PPMContext tempPPMContext2 = new PPMContext(null);
    private final PPMContext tempPPMContext3 = new PPMContext(null);
    private final PPMContext tempPPMContext4 = new PPMContext(null);
    private final int[] ps = new int[64];
    private PPMContext minContext = null;
    private PPMContext maxContext = null;

    private void clearMask() {
        this.escCount = 1;
        Arrays.fill(this.charMask, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00d3, code lost:
        if (r2.getSuffix() == 0) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0145  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0070 -> B:15:0x0071). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private int createSuccessors(boolean z, State state) {
        int i;
        int i2;
        int summFreq;
        int i3;
        int i4;
        boolean z2;
        StateRef stateRef = this.tempStateRef2;
        State init = this.tempState1.init(getHeap());
        PPMContext init2 = this.tempPPMContext1.init(getHeap());
        init2.setAddress(this.minContext.getAddress());
        PPMContext init3 = this.tempPPMContext2.init(getHeap());
        init3.setAddress(this.foundState.getSuccessor());
        State init4 = this.tempState2.init(getHeap());
        if (!z) {
            this.ps[0] = this.foundState.getAddress();
            if (init2.getSuffix() == 0) {
                i = 1;
            } else {
                i2 = 1;
                i = 0;
                if (i == 0) {
                    if (state.getAddress() != 0) {
                        init4.setAddress(state.getAddress());
                        init2.setAddress(init2.getSuffix());
                        z2 = true;
                        if (!z2) {
                            init2.setAddress(init2.getSuffix());
                            if (init2.getNumStats() != 1) {
                                init4.setAddress(init2.getFreqData().getStats());
                                if (init4.getSymbol() != this.foundState.getSymbol()) {
                                    do {
                                        init4.incAddress();
                                    } while (init4.getSymbol() != this.foundState.getSymbol());
                                }
                            } else {
                                init4.setAddress(init2.getOneState().getAddress());
                            }
                        }
                        if (init4.getSuccessor() == init3.getAddress()) {
                            init2.setAddress(init4.getSuccessor());
                        } else {
                            this.ps[i2] = init4.getAddress();
                            i2++;
                        }
                    }
                    z2 = false;
                    if (!z2) {
                    }
                    if (init4.getSuccessor() == init3.getAddress()) {
                    }
                }
                if (i2 != 0) {
                    return init2.getAddress();
                }
                stateRef.setSymbol(getHeap()[init3.getAddress()]);
                stateRef.setSuccessor(init3.getAddress() + 1);
                if (init2.getNumStats() != 1) {
                    if (init2.getAddress() <= this.subAlloc.getPText()) {
                        return 0;
                    }
                    init4.setAddress(init2.getFreqData().getStats());
                    if (init4.getSymbol() != stateRef.getSymbol()) {
                        do {
                            init4.incAddress();
                        } while (init4.getSymbol() != stateRef.getSymbol());
                        int freq = init4.getFreq() - 1;
                        summFreq = (init2.getFreqData().getSummFreq() - init2.getNumStats()) - freq;
                        i3 = freq * 2;
                        if (i3 > summFreq) {
                            if (freq * 5 > summFreq) {
                                i4 = 1;
                            } else {
                                i4 = 0;
                            }
                        } else {
                            i4 = (((summFreq * 3) + i3) - 1) / (summFreq * 2);
                        }
                        stateRef.setFreq(1 + i4);
                    } else {
                        int freq2 = init4.getFreq() - 1;
                        summFreq = (init2.getFreqData().getSummFreq() - init2.getNumStats()) - freq2;
                        i3 = freq2 * 2;
                        if (i3 > summFreq) {
                        }
                        stateRef.setFreq(1 + i4);
                    }
                } else {
                    stateRef.setFreq(init2.getOneState().getFreq());
                }
                do {
                    i2--;
                    init.setAddress(this.ps[i2]);
                    init2.setAddress(init2.createChild(this, init, stateRef));
                    if (init2.getAddress() == 0) {
                        return 0;
                    }
                } while (i2 != 0);
                return init2.getAddress();
            }
        } else {
            i = 0;
        }
        i2 = i;
        if (i == 0) {
        }
        if (i2 != 0) {
        }
    }

    private void restartModelRare() {
        Arrays.fill(this.charMask, 0);
        this.subAlloc.initSubAllocator();
        this.initRL = (-Math.min(this.maxOrder, 12)) - 1;
        int allocContext = this.subAlloc.allocContext();
        this.minContext.setAddress(allocContext);
        this.maxContext.setAddress(allocContext);
        this.minContext.setSuffix(0);
        this.orderFall = this.maxOrder;
        this.minContext.setNumStats(256);
        this.minContext.getFreqData().setSummFreq(this.minContext.getNumStats() + 1);
        int allocUnits = this.subAlloc.allocUnits(128);
        this.foundState.setAddress(allocUnits);
        this.minContext.getFreqData().setStats(allocUnits);
        State state = new State(this.subAlloc.getHeap());
        int stats = this.minContext.getFreqData().getStats();
        this.runLength = this.initRL;
        this.prevSuccess = 0;
        for (int i = 0; i < 256; i++) {
            state.setAddress((i * 6) + stats);
            state.setSymbol(i);
            state.setFreq(1);
            state.setSuccessor(0);
        }
        for (int i2 = 0; i2 < 128; i2++) {
            for (int i3 = 0; i3 < 8; i3++) {
                for (int i4 = 0; i4 < 64; i4 += 8) {
                    this.binSumm[i2][i3 + i4] = 16384 - (InitBinEsc[i3] / (i2 + 2));
                }
            }
        }
        for (int i5 = 0; i5 < 25; i5++) {
            for (int i6 = 0; i6 < 16; i6++) {
                this.SEE2Cont[i5][i6].init((i5 * 5) + 10);
            }
        }
    }

    private void startModelRare(int i) {
        this.escCount = 1;
        this.maxOrder = i;
        restartModelRare();
        int[] iArr = this.NS2BSIndx;
        iArr[0] = 0;
        iArr[1] = 2;
        for (int i2 = 0; i2 < 9; i2++) {
            this.NS2BSIndx[i2 + 2] = 4;
        }
        for (int i3 = 0; i3 < 245; i3++) {
            this.NS2BSIndx[i3 + 11] = 6;
        }
        int i4 = 0;
        while (i4 < 3) {
            this.NS2Indx[i4] = i4;
            i4++;
        }
        int i5 = 1;
        int i6 = 1;
        int i7 = i4;
        while (i4 < 256) {
            this.NS2Indx[i4] = i7;
            i5--;
            if (i5 == 0) {
                i6++;
                i7++;
                i5 = i6;
            }
            i4++;
        }
        for (int i8 = 0; i8 < 64; i8++) {
            this.HB2Flag[i8] = 0;
        }
        for (int i9 = 0; i9 < 192; i9++) {
            this.HB2Flag[i9 + 64] = 8;
        }
        this.dummySEE2Cont.setShift(7);
    }

    private void updateModel() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        StateRef stateRef = this.tempStateRef1;
        stateRef.setValues(this.foundState);
        State init = this.tempState3.init(getHeap());
        State init2 = this.tempState4.init(getHeap());
        PPMContext init3 = this.tempPPMContext3.init(getHeap());
        PPMContext init4 = this.tempPPMContext4.init(getHeap());
        init3.setAddress(this.minContext.getSuffix());
        if (stateRef.getFreq() < 31 && init3.getAddress() != 0) {
            if (init3.getNumStats() != 1) {
                init.setAddress(init3.getFreqData().getStats());
                if (init.getSymbol() != stateRef.getSymbol()) {
                    do {
                        init.incAddress();
                    } while (init.getSymbol() != stateRef.getSymbol());
                    init2.setAddress(init.getAddress() - 6);
                    if (init.getFreq() >= init2.getFreq()) {
                        State.ppmdSwap(init, init2);
                        init.decAddress();
                    }
                }
                if (init.getFreq() < 115) {
                    init.incFreq(2);
                    init3.getFreqData().incSummFreq(2);
                }
            } else {
                init.setAddress(init3.getOneState().getAddress());
                if (init.getFreq() < 32) {
                    init.incFreq(1);
                }
            }
        }
        if (this.orderFall == 0) {
            this.foundState.setSuccessor(createSuccessors(true, init));
            this.minContext.setAddress(this.foundState.getSuccessor());
            this.maxContext.setAddress(this.foundState.getSuccessor());
            if (this.minContext.getAddress() == 0) {
                updateModelRestart();
                return;
            }
            return;
        }
        this.subAlloc.getHeap()[this.subAlloc.getPText()] = (byte) stateRef.getSymbol();
        this.subAlloc.incPText();
        init4.setAddress(this.subAlloc.getPText());
        if (this.subAlloc.getPText() >= this.subAlloc.getFakeUnitsStart()) {
            updateModelRestart();
            return;
        }
        if (stateRef.getSuccessor() != 0) {
            if (stateRef.getSuccessor() <= this.subAlloc.getPText()) {
                stateRef.setSuccessor(createSuccessors(false, init));
                if (stateRef.getSuccessor() == 0) {
                    updateModelRestart();
                    return;
                }
            }
            int i11 = this.orderFall - 1;
            this.orderFall = i11;
            if (i11 == 0) {
                init4.setAddress(stateRef.getSuccessor());
                if (this.maxContext.getAddress() != this.minContext.getAddress()) {
                    this.subAlloc.decPText(1);
                }
            }
        } else {
            this.foundState.setSuccessor(init4.getAddress());
            stateRef.setSuccessor(this.minContext);
        }
        int numStats = this.minContext.getNumStats();
        int summFreq = (this.minContext.getFreqData().getSummFreq() - numStats) - (stateRef.getFreq() - 1);
        init3.setAddress(this.maxContext.getAddress());
        while (init3.getAddress() != this.minContext.getAddress()) {
            int numStats2 = init3.getNumStats();
            if (numStats2 != 1) {
                if ((numStats2 & 1) == 0) {
                    init3.getFreqData().setStats(this.subAlloc.expandUnits(init3.getFreqData().getStats(), numStats2 >>> 1));
                    if (init3.getFreqData().getStats() == 0) {
                        updateModelRestart();
                        return;
                    }
                }
                if (numStats2 * 2 < numStats) {
                    i8 = 1;
                } else {
                    i8 = 0;
                }
                if (numStats2 * 4 <= numStats) {
                    i9 = 1;
                } else {
                    i9 = 0;
                }
                if (init3.getFreqData().getSummFreq() <= numStats2 * 8) {
                    i10 = 1;
                } else {
                    i10 = 0;
                }
                init3.getFreqData().incSummFreq(((i9 & i10) * 2) + i8);
            } else {
                init.setAddress(this.subAlloc.allocUnits(1));
                if (init.getAddress() == 0) {
                    updateModelRestart();
                    return;
                }
                init.setValues(init3.getOneState());
                init3.getFreqData().setStats(init);
                if (init.getFreq() < 30) {
                    init.incFreq(init.getFreq());
                } else {
                    init.setFreq(120);
                }
                FreqData freqData = init3.getFreqData();
                int freq = init.getFreq() + this.initEsc;
                if (numStats > 3) {
                    i = 1;
                } else {
                    i = 0;
                }
                freqData.setSummFreq(freq + i);
            }
            int summFreq2 = (init3.getFreqData().getSummFreq() + 6) * stateRef.getFreq() * 2;
            int summFreq3 = init3.getFreqData().getSummFreq() + summFreq;
            if (summFreq2 < summFreq3 * 6) {
                if (summFreq2 > summFreq3) {
                    i6 = 1;
                } else {
                    i6 = 0;
                }
                int i12 = i6 + 1;
                if (summFreq2 >= summFreq3 * 4) {
                    i7 = 1;
                } else {
                    i7 = 0;
                }
                i5 = i12 + i7;
                init3.getFreqData().incSummFreq(3);
            } else {
                if (summFreq2 >= summFreq3 * 9) {
                    i2 = 1;
                } else {
                    i2 = 0;
                }
                int i13 = i2 + 4;
                if (summFreq2 >= summFreq3 * 12) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                int i14 = i13 + i3;
                if (summFreq2 >= summFreq3 * 15) {
                    i4 = 1;
                } else {
                    i4 = 0;
                }
                i5 = i14 + i4;
                init3.getFreqData().incSummFreq(i5);
            }
            init.setAddress((numStats2 * 6) + init3.getFreqData().getStats());
            init.setSuccessor(init4);
            init.setSymbol(stateRef.getSymbol());
            init.setFreq(i5);
            init3.setNumStats(numStats2 + 1);
            init3.setAddress(init3.getSuffix());
        }
        int successor = stateRef.getSuccessor();
        this.maxContext.setAddress(successor);
        this.minContext.setAddress(successor);
    }

    private void updateModelRestart() {
        restartModelRare();
        this.escCount = 0;
    }

    public int decodeChar() {
        if (this.minContext.getAddress() <= this.subAlloc.getPText() || this.minContext.getAddress() > this.subAlloc.getHeapEnd()) {
            return -1;
        }
        int numStats = this.minContext.getNumStats();
        PPMContext pPMContext = this.minContext;
        if (numStats != 1) {
            if (pPMContext.getFreqData().getStats() <= this.subAlloc.getPText() || this.minContext.getFreqData().getStats() > this.subAlloc.getHeapEnd() || !this.minContext.decodeSymbol1(this)) {
                return -1;
            }
        } else {
            pPMContext.decodeBinSymbol(this);
        }
        this.coder.decode();
        while (this.foundState.getAddress() == 0) {
            this.coder.ariDecNormalize();
            do {
                this.orderFall++;
                PPMContext pPMContext2 = this.minContext;
                pPMContext2.setAddress(pPMContext2.getSuffix());
                if (this.minContext.getAddress() <= this.subAlloc.getPText() || this.minContext.getAddress() > this.subAlloc.getHeapEnd()) {
                    return -1;
                }
            } while (this.minContext.getNumStats() == this.numMasked);
            if (!this.minContext.decodeSymbol2(this)) {
                return -1;
            }
            this.coder.decode();
        }
        int symbol = this.foundState.getSymbol();
        if (this.orderFall == 0 && this.foundState.getSuccessor() > this.subAlloc.getPText()) {
            int successor = this.foundState.getSuccessor();
            this.minContext.setAddress(successor);
            this.maxContext.setAddress(successor);
        } else {
            updateModel();
            if (this.escCount == 0) {
                clearMask();
            }
        }
        this.coder.ariDecNormalize();
        return symbol;
    }

    public boolean decodeInit(Unpack unpack, int i) {
        boolean z;
        int i2;
        int i3 = unpack.getChar();
        if ((i3 & 32) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = unpack.getChar();
            if (i2 > 1) {
                i2 = 1;
            }
        } else if (this.subAlloc.GetAllocatedMemory() == 0) {
            return false;
        } else {
            i2 = 0;
        }
        if ((i3 & 64) != 0) {
            unpack.setPpmEscChar(unpack.getChar());
        }
        this.coder.initDecoder(unpack);
        if (z) {
            int i4 = i3 & 31;
            int i5 = i4 + 1;
            if (i5 > 16) {
                i5 = ((i4 - 15) * 3) + 16;
            }
            SubAllocator subAllocator = this.subAlloc;
            if (i5 == 1) {
                subAllocator.stopSubAllocator();
                return false;
            }
            subAllocator.startSubAllocator(i2 + 1);
            this.minContext = new PPMContext(getHeap());
            this.maxContext = new PPMContext(getHeap());
            this.foundState = new State(getHeap());
            this.dummySEE2Cont = new SEE2Context();
            for (int i6 = 0; i6 < 25; i6++) {
                for (int i7 = 0; i7 < 16; i7++) {
                    this.SEE2Cont[i6][i7] = new SEE2Context();
                }
            }
            startModelRare(i5);
        }
        if (this.minContext.getAddress() == 0) {
            return false;
        }
        return true;
    }

    public int[][] getBinSumm() {
        return this.binSumm;
    }

    public int[] getCharMask() {
        return this.charMask;
    }

    public RangeCoder getCoder() {
        return this.coder;
    }

    public SEE2Context getDummySEE2Cont() {
        return this.dummySEE2Cont;
    }

    public int getEscCount() {
        return this.escCount;
    }

    public State getFoundState() {
        return this.foundState;
    }

    public int[] getHB2Flag() {
        return this.HB2Flag;
    }

    public byte[] getHeap() {
        return this.subAlloc.getHeap();
    }

    public int getHiBitsFlag() {
        return this.hiBitsFlag;
    }

    public int getInitEsc() {
        return this.initEsc;
    }

    public int getInitRL() {
        return this.initRL;
    }

    public int[] getNS2BSIndx() {
        return this.NS2BSIndx;
    }

    public int[] getNS2Indx() {
        return this.NS2Indx;
    }

    public int getNumMasked() {
        return this.numMasked;
    }

    public int getOrderFall() {
        return this.orderFall;
    }

    public int getPrevSuccess() {
        return this.prevSuccess;
    }

    public int getRunLength() {
        return this.runLength;
    }

    public SEE2Context[][] getSEE2Cont() {
        return this.SEE2Cont;
    }

    public SubAllocator getSubAlloc() {
        return this.subAlloc;
    }

    public void incEscCount(int i) {
        setEscCount(getEscCount() + i);
    }

    public void incRunLength(int i) {
        setRunLength(getRunLength() + i);
    }

    public void setEscCount(int i) {
        this.escCount = i & 255;
    }

    public void setHiBitsFlag(int i) {
        this.hiBitsFlag = i & 255;
    }

    public void setInitEsc(int i) {
        this.initEsc = i;
    }

    public void setNumMasked(int i) {
        this.numMasked = i;
    }

    public void setPrevSuccess(int i) {
        this.prevSuccess = i & 255;
    }

    public void setRunLength(int i) {
        this.runLength = i;
    }

    public String toString() {
        return "ModelPPM[\n  numMasked=" + this.numMasked + "\n  initEsc=" + this.initEsc + "\n  orderFall=" + this.orderFall + "\n  maxOrder=" + this.maxOrder + "\n  runLength=" + this.runLength + "\n  initRL=" + this.initRL + "\n  escCount=" + this.escCount + "\n  prevSuccess=" + this.prevSuccess + "\n  foundState=" + this.foundState + "\n  coder=" + this.coder + "\n  subAlloc=" + this.subAlloc + "\n]";
    }
}

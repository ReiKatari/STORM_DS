package com.github.junrar.unpack.ppm;

import com.github.junrar.io.Raw;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class PPMContext extends Pointer {
    public static final int[] ExpEscape;
    public static final int size;
    private static final int unionSize;
    private final FreqData freqData;
    private int numStats;
    private final State oneState;
    private final int[] ps;
    private int suffix;
    private PPMContext tempPPMContext;
    private final State tempState1;
    private final State tempState2;
    private final State tempState3;
    private final State tempState4;
    private final State tempState5;

    static {
        int max = Math.max(6, 6);
        unionSize = max;
        size = max + 6;
        ExpEscape = new int[]{25, 14, 9, 7, 5, 5, 4, 4, 4, 3, 3, 3, 2, 2, 2, 2};
    }

    public PPMContext(byte[] bArr) {
        super(bArr);
        this.tempState1 = new State(null);
        this.tempState2 = new State(null);
        this.tempState3 = new State(null);
        this.tempState4 = new State(null);
        this.tempState5 = new State(null);
        this.tempPPMContext = null;
        this.ps = new int[256];
        this.oneState = new State(bArr);
        this.freqData = new FreqData(bArr);
    }

    private int getArrayIndex(ModelPPM modelPPM, State state) {
        PPMContext tempPPMContext = getTempPPMContext(modelPPM.getSubAlloc().getHeap());
        tempPPMContext.setAddress(getSuffix());
        return (modelPPM.getHB2Flag()[state.getSymbol()] * 2) + modelPPM.getHiBitsFlag() + modelPPM.getPrevSuccess() + modelPPM.getNS2BSIndx()[tempPPMContext.getNumStats() - 1] + ((modelPPM.getRunLength() >>> 26) & 32);
    }

    private PPMContext getTempPPMContext(byte[] bArr) {
        if (this.tempPPMContext == null) {
            this.tempPPMContext = new PPMContext(null);
        }
        return this.tempPPMContext.init(bArr);
    }

    private SEE2Context makeEscFreq2(ModelPPM modelPPM, int i) {
        int i2;
        int i3;
        int numStats = getNumStats();
        if (numStats != 256) {
            PPMContext tempPPMContext = getTempPPMContext(modelPPM.getHeap());
            tempPPMContext.setAddress(getSuffix());
            int i4 = modelPPM.getNS2Indx()[i - 1];
            int i5 = 0;
            if (i < tempPPMContext.getNumStats() - numStats) {
                i2 = 1;
            } else {
                i2 = 0;
            }
            if (this.freqData.getSummFreq() < numStats * 11) {
                i3 = 1;
            } else {
                i3 = 0;
            }
            int i6 = (i3 * 2) + i2;
            if (modelPPM.getNumMasked() > i) {
                i5 = 1;
            }
            SEE2Context sEE2Context = modelPPM.getSEE2Cont()[i4][modelPPM.getHiBitsFlag() + (i5 * 4) + i6];
            modelPPM.getCoder().getSubRange().setScale(sEE2Context.getMean());
            return sEE2Context;
        }
        SEE2Context dummySEE2Cont = modelPPM.getDummySEE2Cont();
        modelPPM.getCoder().getSubRange().setScale(1L);
        return dummySEE2Cont;
    }

    public int createChild(ModelPPM modelPPM, State state, StateRef stateRef) {
        PPMContext tempPPMContext = getTempPPMContext(modelPPM.getSubAlloc().getHeap());
        tempPPMContext.setAddress(modelPPM.getSubAlloc().allocContext());
        tempPPMContext.setNumStats(1);
        tempPPMContext.setOneState(stateRef);
        tempPPMContext.setSuffix(this);
        state.setSuccessor(tempPPMContext);
        return tempPPMContext.getAddress();
    }

    public void decodeBinSymbol(ModelPPM modelPPM) {
        State init = this.tempState1.init(modelPPM.getHeap());
        init.setAddress(this.oneState.getAddress());
        modelPPM.setHiBitsFlag(modelPPM.getHB2Flag()[modelPPM.getFoundState().getSymbol()]);
        int freq = init.getFreq() - 1;
        int arrayIndex = getArrayIndex(modelPPM, init);
        int i = modelPPM.getBinSumm()[freq][arrayIndex];
        long j = i;
        int i2 = 0;
        if (modelPPM.getCoder().getCurrentShiftCount(14) < j) {
            modelPPM.getFoundState().setAddress(init.getAddress());
            if (init.getFreq() < 128) {
                i2 = 1;
            }
            init.incFreq(i2);
            modelPPM.getCoder().getSubRange().setLowCount(0L);
            modelPPM.getCoder().getSubRange().setHighCount(j);
            modelPPM.getBinSumm()[freq][arrayIndex] = ((i + 128) - getMean(i, 7, 2)) & 65535;
            modelPPM.setPrevSuccess(1);
            modelPPM.incRunLength(1);
            return;
        }
        modelPPM.getCoder().getSubRange().setLowCount(j);
        int mean = (i - getMean(i, 7, 2)) & 65535;
        modelPPM.getBinSumm()[freq][arrayIndex] = mean;
        modelPPM.getCoder().getSubRange().setHighCount(16384L);
        modelPPM.setInitEsc(ExpEscape[mean >>> 10]);
        modelPPM.setNumMasked(1);
        modelPPM.getCharMask()[init.getSymbol()] = modelPPM.getEscCount();
        modelPPM.setPrevSuccess(0);
        modelPPM.getFoundState().setAddress(0);
    }

    public boolean decodeSymbol1(ModelPPM modelPPM) {
        long j;
        RangeCoder coder = modelPPM.getCoder();
        coder.getSubRange().setScale(this.freqData.getSummFreq());
        State state = new State(modelPPM.getHeap());
        state.setAddress(this.freqData.getStats());
        long currentCount = coder.getCurrentCount();
        int i = 0;
        if (currentCount >= coder.getSubRange().getScale()) {
            return false;
        }
        int freq = state.getFreq();
        long j2 = freq;
        if (currentCount < j2) {
            coder.getSubRange().setHighCount(j2);
            if (freq * 2 > coder.getSubRange().getScale()) {
                i = 1;
            }
            modelPPM.setPrevSuccess(i);
            modelPPM.incRunLength(modelPPM.getPrevSuccess());
            int i2 = freq + 4;
            modelPPM.getFoundState().setAddress(state.getAddress());
            modelPPM.getFoundState().setFreq(i2);
            this.freqData.incSummFreq(4);
            if (i2 > 124) {
                rescale(modelPPM);
            }
            coder.getSubRange().setLowCount(0L);
            return true;
        } else if (modelPPM.getFoundState().getAddress() == 0) {
            return false;
        } else {
            modelPPM.setPrevSuccess(0);
            int numStats = getNumStats();
            int i3 = numStats - 1;
            int i4 = i3;
            do {
                freq += state.incAddress().getFreq();
                j = freq;
                if (j <= currentCount) {
                    i4--;
                } else {
                    coder.getSubRange().setLowCount(freq - state.getFreq());
                    coder.getSubRange().setHighCount(j);
                    update1(modelPPM, state.getAddress());
                    return true;
                }
            } while (i4 != 0);
            modelPPM.setHiBitsFlag(modelPPM.getHB2Flag()[modelPPM.getFoundState().getSymbol()]);
            coder.getSubRange().setLowCount(j);
            modelPPM.getCharMask()[state.getSymbol()] = modelPPM.getEscCount();
            modelPPM.setNumMasked(numStats);
            modelPPM.getFoundState().setAddress(0);
            do {
                modelPPM.getCharMask()[state.decAddress().getSymbol()] = modelPPM.getEscCount();
                i3--;
            } while (i3 != 0);
            coder.getSubRange().setHighCount(coder.getSubRange().getScale());
            return true;
        }
    }

    public boolean decodeSymbol2(ModelPPM modelPPM) {
        long j;
        int numStats = getNumStats() - modelPPM.getNumMasked();
        SEE2Context makeEscFreq2 = makeEscFreq2(modelPPM, numStats);
        RangeCoder coder = modelPPM.getCoder();
        State init = this.tempState1.init(modelPPM.getHeap());
        State init2 = this.tempState2.init(modelPPM.getHeap());
        init.setAddress(this.freqData.getStats() - 6);
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        while (true) {
            init.incAddress();
            if (modelPPM.getCharMask()[init.getSymbol()] != modelPPM.getEscCount()) {
                i2 += init.getFreq();
                int i4 = i3 + 1;
                this.ps[i3] = init.getAddress();
                numStats--;
                if (numStats == 0) {
                    break;
                }
                i3 = i4;
            }
        }
        coder.getSubRange().incScale(i2);
        long currentCount = coder.getCurrentCount();
        if (currentCount >= coder.getSubRange().getScale()) {
            return false;
        }
        init.setAddress(this.ps[0]);
        long j2 = i2;
        if (currentCount < j2) {
            int i5 = 0;
            while (true) {
                i += init.getFreq();
                j = i;
                if (j > currentCount) {
                    break;
                }
                i5++;
                init.setAddress(this.ps[i5]);
            }
            coder.getSubRange().setHighCount(j);
            coder.getSubRange().setLowCount(i - init.getFreq());
            makeEscFreq2.update();
            update2(modelPPM, init.getAddress());
        } else {
            coder.getSubRange().setLowCount(j2);
            coder.getSubRange().setHighCount(coder.getSubRange().getScale());
            int numStats2 = getNumStats() - modelPPM.getNumMasked();
            int i6 = -1;
            do {
                i6++;
                init2.setAddress(this.ps[i6]);
                modelPPM.getCharMask()[init2.getSymbol()] = modelPPM.getEscCount();
                numStats2--;
            } while (numStats2 != 0);
            makeEscFreq2.incSumm((int) coder.getSubRange().getScale());
            modelPPM.setNumMasked(getNumStats());
        }
        return true;
    }

    public FreqData getFreqData() {
        return this.freqData;
    }

    public int getMean(int i, int i2, int i3) {
        return (i + (1 << (i2 - i3))) >>> i2;
    }

    public final int getNumStats() {
        byte[] bArr = this.mem;
        if (bArr != null) {
            this.numStats = Raw.readShortLittleEndian(bArr, this.pos) & 65535;
        }
        return this.numStats;
    }

    public State getOneState() {
        return this.oneState;
    }

    public int getSuffix() {
        byte[] bArr = this.mem;
        if (bArr != null) {
            this.suffix = Raw.readIntLittleEndian(bArr, this.pos + 8);
        }
        return this.suffix;
    }

    public PPMContext init(byte[] bArr) {
        this.mem = bArr;
        this.pos = 0;
        this.oneState.init(bArr);
        this.freqData.init(bArr);
        return this;
    }

    public void rescale(ModelPPM modelPPM) {
        int i;
        int numStats = getNumStats();
        int numStats2 = getNumStats() - 1;
        State state = new State(modelPPM.getHeap());
        State state2 = new State(modelPPM.getHeap());
        State state3 = new State(modelPPM.getHeap());
        state2.setAddress(modelPPM.getFoundState().getAddress());
        while (state2.getAddress() != this.freqData.getStats()) {
            state3.setAddress(state2.getAddress() - 6);
            State.ppmdSwap(state2, state3);
            state2.decAddress();
        }
        state3.setAddress(this.freqData.getStats());
        state3.incFreq(4);
        this.freqData.incSummFreq(4);
        int summFreq = this.freqData.getSummFreq() - state2.getFreq();
        if (modelPPM.getOrderFall() != 0) {
            i = 1;
        } else {
            i = 0;
        }
        state2.setFreq((state2.getFreq() + i) >>> 1);
        this.freqData.setSummFreq(state2.getFreq());
        do {
            state2.incAddress();
            summFreq -= state2.getFreq();
            state2.setFreq((state2.getFreq() + i) >>> 1);
            this.freqData.incSummFreq(state2.getFreq());
            state3.setAddress(state2.getAddress() - 6);
            if (state2.getFreq() > state3.getFreq()) {
                state.setAddress(state2.getAddress());
                StateRef stateRef = new StateRef();
                stateRef.setValues(state);
                State state4 = new State(modelPPM.getHeap());
                State state5 = new State(modelPPM.getHeap());
                do {
                    state4.setAddress(state.getAddress() - 6);
                    state.setValues(state4);
                    state.decAddress();
                    state5.setAddress(state.getAddress() - 6);
                    if (state.getAddress() == this.freqData.getStats()) {
                        break;
                    }
                } while (stateRef.getFreq() > state5.getFreq());
                state.setValues(stateRef);
            }
            numStats2--;
        } while (numStats2 != 0);
        if (state2.getFreq() == 0) {
            do {
                numStats2++;
                state2.decAddress();
            } while (state2.getFreq() == 0);
            summFreq += numStats2;
            setNumStats(getNumStats() - numStats2);
            if (getNumStats() == 1) {
                StateRef stateRef2 = new StateRef();
                state3.setAddress(this.freqData.getStats());
                stateRef2.setValues(state3);
                do {
                    stateRef2.decFreq(stateRef2.getFreq() >>> 1);
                    summFreq >>>= 1;
                } while (summFreq > 1);
                modelPPM.getSubAlloc().freeUnits(this.freqData.getStats(), (numStats + 1) >>> 1);
                this.oneState.setValues(stateRef2);
                modelPPM.getFoundState().setAddress(this.oneState.getAddress());
                return;
            }
        }
        this.freqData.incSummFreq(summFreq - (summFreq >>> 1));
        int i2 = (numStats + 1) >>> 1;
        int numStats3 = (getNumStats() + 1) >>> 1;
        if (i2 != numStats3) {
            this.freqData.setStats(modelPPM.getSubAlloc().shrinkUnits(this.freqData.getStats(), i2, numStats3));
        }
        modelPPM.getFoundState().setAddress(this.freqData.getStats());
    }

    @Override // com.github.junrar.unpack.ppm.Pointer
    public void setAddress(int i) {
        super.setAddress(i);
        int i2 = i + 2;
        this.oneState.setAddress(i2);
        this.freqData.setAddress(i2);
    }

    public void setFreqData(FreqData freqData) {
        this.freqData.setSummFreq(freqData.getSummFreq());
        this.freqData.setStats(freqData.getStats());
    }

    public final void setNumStats(int i) {
        this.numStats = 65535 & i;
        byte[] bArr = this.mem;
        if (bArr != null) {
            Raw.writeShortLittleEndian(bArr, this.pos, (short) i);
        }
    }

    public void setOneState(StateRef stateRef) {
        this.oneState.setValues(stateRef);
    }

    public void setSuffix(int i) {
        this.suffix = i;
        byte[] bArr = this.mem;
        if (bArr != null) {
            Raw.writeIntLittleEndian(bArr, this.pos + 8, i);
        }
    }

    public String toString() {
        return "PPMContext[\n  pos=" + this.pos + "\n  size=" + size + "\n  numStats=" + getNumStats() + "\n  Suffix=" + getSuffix() + "\n  freqData=" + this.freqData + "\n  oneState=" + this.oneState + "\n]";
    }

    public void update1(ModelPPM modelPPM, int i) {
        modelPPM.getFoundState().setAddress(i);
        modelPPM.getFoundState().incFreq(4);
        this.freqData.incSummFreq(4);
        State init = this.tempState3.init(modelPPM.getHeap());
        State init2 = this.tempState4.init(modelPPM.getHeap());
        init.setAddress(i);
        init2.setAddress(i - 6);
        if (init.getFreq() > init2.getFreq()) {
            State.ppmdSwap(init, init2);
            modelPPM.getFoundState().setAddress(init2.getAddress());
            if (init2.getFreq() > 124) {
                rescale(modelPPM);
            }
        }
    }

    public void update2(ModelPPM modelPPM, int i) {
        State init = this.tempState5.init(modelPPM.getHeap());
        init.setAddress(i);
        modelPPM.getFoundState().setAddress(i);
        modelPPM.getFoundState().incFreq(4);
        this.freqData.incSummFreq(4);
        if (init.getFreq() > 124) {
            rescale(modelPPM);
        }
        modelPPM.incEscCount(1);
        modelPPM.setRunLength(modelPPM.getInitRL());
    }

    public void setSuffix(PPMContext pPMContext) {
        setSuffix(pPMContext.getAddress());
    }
}

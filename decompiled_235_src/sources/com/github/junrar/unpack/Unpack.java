package com.github.junrar.unpack;

import com.github.junrar.unpack.decode.Compress;
import com.github.junrar.unpack.ppm.BlockTypes;
import com.github.junrar.unpack.ppm.ModelPPM;
import com.github.junrar.unpack.ppm.SubAllocator;
import com.github.junrar.unpack.vm.BitInput;
import com.github.junrar.unpack.vm.RarVM;
import com.github.junrar.unpack.vm.VMPreparedProgram;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Vector;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Unpack extends Unpack20 {
    public static int[] DBitLengthCounts = {4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 14, 0, 12};
    private boolean fileExtracted;
    private int lastFilter;
    private int lowDistRepCount;
    private boolean ppmError;
    private int ppmEscChar;
    private int prevLowDist;
    private boolean tablesRead;
    private BlockTypes unpBlockType;
    private long writtenFileSize;
    private final ModelPPM ppm = new ModelPPM();
    private final RarVM rarVM = new RarVM();
    private final List<UnpackFilter> filters = new ArrayList();
    private final List<UnpackFilter> prgStack = new ArrayList();
    private final List<Integer> oldFilterLengths = new ArrayList();
    private final byte[] unpOldTable = new byte[Compress.HUFF_TABLE_SIZE];

    public Unpack(ComprDataIO comprDataIO) {
        this.unpIO = comprDataIO;
        this.window = null;
        this.suspended = false;
        this.unpAllBuf = false;
        this.unpSomeRead = false;
    }

    private void ExecuteCode(VMPreparedProgram vMPreparedProgram) {
        if (vMPreparedProgram.getGlobalData().size() > 0) {
            vMPreparedProgram.getInitR()[6] = (int) this.writtenFileSize;
            this.rarVM.setLowEndianValue(vMPreparedProgram.getGlobalData(), 36, (int) this.writtenFileSize);
            this.rarVM.setLowEndianValue(vMPreparedProgram.getGlobalData(), 40, (int) (this.writtenFileSize >>> 32));
            this.rarVM.execute(vMPreparedProgram);
        }
    }

    private void UnpWriteArea(int i, int i2) {
        if (i2 != i) {
            this.unpSomeRead = true;
        }
        byte[] bArr = this.window;
        if (i2 < i) {
            UnpWriteData(bArr, i, (-i) & Compress.MAXWINMASK);
            UnpWriteData(this.window, 0, i2);
            this.unpAllBuf = true;
            return;
        }
        UnpWriteData(bArr, i, i2 - i);
    }

    private void UnpWriteBuf() {
        UnpackFilter unpackFilter;
        int i = this.wrPtr;
        int i2 = (this.unpPtr - i) & Compress.MAXWINMASK;
        int i3 = 0;
        while (i3 < this.prgStack.size()) {
            UnpackFilter unpackFilter2 = this.prgStack.get(i3);
            if (unpackFilter2 != null) {
                if (unpackFilter2.isNextWindow()) {
                    unpackFilter2.setNextWindow(false);
                } else {
                    int blockStart = unpackFilter2.getBlockStart();
                    int blockLength = unpackFilter2.getBlockLength();
                    if (((blockStart - i) & Compress.MAXWINMASK) >= i2) {
                        continue;
                    } else {
                        if (i != blockStart) {
                            UnpWriteArea(i, blockStart);
                            i2 = (this.unpPtr - blockStart) & Compress.MAXWINMASK;
                            i = blockStart;
                        }
                        if (blockLength <= i2) {
                            i = (blockStart + blockLength) & Compress.MAXWINMASK;
                            if (blockStart >= i && i != 0) {
                                int i4 = Compress.MAXWINSIZE - blockStart;
                                this.rarVM.setMemory(0, this.window, blockStart, i4);
                                this.rarVM.setMemory(i4, this.window, 0, i);
                            } else {
                                this.rarVM.setMemory(0, this.window, blockStart, blockLength);
                            }
                            VMPreparedProgram prg = this.filters.get(unpackFilter2.getParentFilter()).getPrg();
                            VMPreparedProgram prg2 = unpackFilter2.getPrg();
                            if (prg.getGlobalData().size() > 64) {
                                prg2.getGlobalData().setSize(prg.getGlobalData().size());
                                for (int i5 = 0; i5 < prg.getGlobalData().size() - 64; i5++) {
                                    int i6 = i5 + 64;
                                    prg2.getGlobalData().set(i6, prg.getGlobalData().get(i6));
                                }
                            }
                            ExecuteCode(prg2);
                            if (prg2.getGlobalData().size() > 64) {
                                if (prg.getGlobalData().size() < prg2.getGlobalData().size()) {
                                    prg.getGlobalData().setSize(prg2.getGlobalData().size());
                                }
                                for (int i7 = 0; i7 < prg2.getGlobalData().size() - 64; i7++) {
                                    int i8 = i7 + 64;
                                    prg.getGlobalData().set(i8, prg2.getGlobalData().get(i8));
                                }
                            } else {
                                prg.getGlobalData().clear();
                            }
                            int filteredDataOffset = prg2.getFilteredDataOffset();
                            int filteredDataSize = prg2.getFilteredDataSize();
                            byte[] bArr = new byte[filteredDataSize];
                            for (int i9 = 0; i9 < filteredDataSize; i9++) {
                                bArr[i9] = this.rarVM.getMem()[filteredDataOffset + i9];
                            }
                            this.prgStack.set(i3, null);
                            while (true) {
                                int i10 = i3 + 1;
                                if (i10 >= this.prgStack.size() || (unpackFilter = this.prgStack.get(i10)) == null || unpackFilter.getBlockStart() != blockStart || unpackFilter.getBlockLength() != filteredDataSize || unpackFilter.isNextWindow()) {
                                    break;
                                }
                                this.rarVM.setMemory(0, bArr, 0, filteredDataSize);
                                VMPreparedProgram prg3 = this.filters.get(unpackFilter.getParentFilter()).getPrg();
                                VMPreparedProgram prg4 = unpackFilter.getPrg();
                                if (prg3.getGlobalData().size() > 64) {
                                    prg4.getGlobalData().setSize(prg3.getGlobalData().size());
                                    for (int i11 = 0; i11 < prg3.getGlobalData().size() - 64; i11++) {
                                        int i12 = i11 + 64;
                                        prg4.getGlobalData().set(i12, prg3.getGlobalData().get(i12));
                                    }
                                }
                                ExecuteCode(prg4);
                                if (prg4.getGlobalData().size() > 64) {
                                    if (prg3.getGlobalData().size() < prg4.getGlobalData().size()) {
                                        prg3.getGlobalData().setSize(prg4.getGlobalData().size());
                                    }
                                    for (int i13 = 0; i13 < prg4.getGlobalData().size() - 64; i13++) {
                                        int i14 = i13 + 64;
                                        prg3.getGlobalData().set(i14, prg4.getGlobalData().get(i14));
                                    }
                                } else {
                                    prg3.getGlobalData().clear();
                                }
                                int filteredDataOffset2 = prg4.getFilteredDataOffset();
                                int filteredDataSize2 = prg4.getFilteredDataSize();
                                byte[] bArr2 = new byte[filteredDataSize2];
                                for (int i15 = 0; i15 < filteredDataSize2; i15++) {
                                    bArr2[i15] = prg4.getGlobalData().get(filteredDataOffset2 + i15).byteValue();
                                }
                                this.prgStack.set(i10, null);
                                i3 = i10;
                                filteredDataSize = filteredDataSize2;
                                bArr = bArr2;
                            }
                            this.unpIO.unpWrite(bArr, 0, filteredDataSize);
                            this.unpSomeRead = true;
                            this.writtenFileSize += filteredDataSize;
                            i2 = (this.unpPtr - i) & Compress.MAXWINMASK;
                        } else {
                            while (i3 < this.prgStack.size()) {
                                UnpackFilter unpackFilter3 = this.prgStack.get(i3);
                                if (unpackFilter3 != null && unpackFilter3.isNextWindow()) {
                                    unpackFilter3.setNextWindow(false);
                                }
                                i3++;
                            }
                            this.wrPtr = i;
                            return;
                        }
                    }
                }
            }
            i3++;
        }
        UnpWriteArea(i, this.unpPtr);
        this.wrPtr = this.unpPtr;
    }

    private void UnpWriteData(byte[] bArr, int i, int i2) {
        long j = this.writtenFileSize;
        long j2 = this.destUnpSize;
        if (j >= j2) {
            return;
        }
        long j3 = j2 - j;
        long j4 = i2;
        if (j4 > j3) {
            i2 = (int) j3;
        }
        this.unpIO.unpWrite(bArr, i, i2);
        this.writtenFileSize += j4;
    }

    private boolean addVMCode(int i, List<Byte> list, int i2) {
        int i3;
        boolean z;
        UnpackFilter unpackFilter;
        int i4;
        boolean z2;
        RarVM rarVM;
        int ReadData;
        BitInput bitInput = new BitInput();
        bitInput.InitBitInput();
        for (int i5 = 0; i5 < Math.min(32768, list.size()); i5++) {
            bitInput.getInBuf()[i5] = list.get(i5).byteValue();
        }
        this.rarVM.init();
        if ((i & 128) != 0) {
            i3 = RarVM.ReadData(bitInput);
            if (i3 == 0) {
                initFilters();
            } else {
                i3--;
            }
        } else {
            i3 = this.lastFilter;
        }
        if (i3 > this.filters.size() || i3 > this.oldFilterLengths.size()) {
            return false;
        }
        this.lastFilter = i3;
        if (i3 == this.filters.size()) {
            z = true;
        } else {
            z = false;
        }
        UnpackFilter unpackFilter2 = new UnpackFilter();
        if (z) {
            if (i3 > 1024) {
                return false;
            }
            unpackFilter = new UnpackFilter();
            this.filters.add(unpackFilter);
            unpackFilter2.setParentFilter(this.filters.size() - 1);
            this.oldFilterLengths.add(0);
            unpackFilter.setExecCount(0);
        } else {
            unpackFilter = this.filters.get(i3);
            unpackFilter2.setParentFilter(i3);
            unpackFilter.setExecCount(unpackFilter.getExecCount() + 1);
        }
        this.prgStack.add(unpackFilter2);
        unpackFilter2.setExecCount(unpackFilter.getExecCount());
        int ReadData2 = RarVM.ReadData(bitInput);
        if ((i & 64) != 0) {
            ReadData2 += 258;
        }
        unpackFilter2.setBlockStart((this.unpPtr + ReadData2) & Compress.MAXWINMASK);
        if ((i & 32) != 0) {
            unpackFilter2.setBlockLength(RarVM.ReadData(bitInput));
        } else {
            if (i3 < this.oldFilterLengths.size()) {
                i4 = this.oldFilterLengths.get(i3).intValue();
            } else {
                i4 = 0;
            }
            unpackFilter2.setBlockLength(i4);
        }
        int i6 = this.wrPtr;
        int i7 = this.unpPtr;
        if (i6 != i7 && ((i6 - i7) & Compress.MAXWINMASK) <= ReadData2) {
            z2 = true;
        } else {
            z2 = false;
        }
        unpackFilter2.setNextWindow(z2);
        this.oldFilterLengths.set(i3, Integer.valueOf(unpackFilter2.getBlockLength()));
        Arrays.fill(unpackFilter2.getPrg().getInitR(), 0);
        unpackFilter2.getPrg().getInitR()[3] = 245760;
        unpackFilter2.getPrg().getInitR()[4] = unpackFilter2.getBlockLength();
        unpackFilter2.getPrg().getInitR()[5] = unpackFilter2.getExecCount();
        if ((i & 16) != 0) {
            int fgetbits = bitInput.fgetbits() >>> 9;
            bitInput.faddbits(7);
            for (int i8 = 0; i8 < 7; i8++) {
                if (((1 << i8) & fgetbits) != 0) {
                    unpackFilter2.getPrg().getInitR()[i8] = RarVM.ReadData(bitInput);
                }
            }
        }
        if (z) {
            int ReadData3 = RarVM.ReadData(bitInput);
            if (ReadData3 >= 65536 || ReadData3 == 0) {
                return false;
            }
            byte[] bArr = new byte[ReadData3];
            for (int i9 = 0; i9 < ReadData3; i9++) {
                if (bitInput.Overflow(3)) {
                    return false;
                }
                bArr[i9] = (byte) (bitInput.fgetbits() >>> 8);
                bitInput.faddbits(8);
            }
            this.rarVM.prepare(bArr, ReadData3, unpackFilter.getPrg());
        }
        unpackFilter2.getPrg().setAltCmd(unpackFilter.getPrg().getCmd());
        unpackFilter2.getPrg().setCmdCount(unpackFilter.getPrg().getCmdCount());
        int size = unpackFilter.getPrg().getStaticData().size();
        if (size > 0 && size < 8192) {
            unpackFilter2.getPrg().setStaticData(unpackFilter.getPrg().getStaticData());
        }
        if (unpackFilter2.getPrg().getGlobalData().size() < 64) {
            unpackFilter2.getPrg().getGlobalData().clear();
            unpackFilter2.getPrg().getGlobalData().setSize(64);
        }
        Vector<Byte> globalData = unpackFilter2.getPrg().getGlobalData();
        int i10 = 0;
        while (true) {
            rarVM = this.rarVM;
            if (i10 >= 7) {
                break;
            }
            rarVM.setLowEndianValue(globalData, i10 * 4, unpackFilter2.getPrg().getInitR()[i10]);
            i10++;
        }
        rarVM.setLowEndianValue(globalData, 28, unpackFilter2.getBlockLength());
        this.rarVM.setLowEndianValue(globalData, 32, 0);
        this.rarVM.setLowEndianValue(globalData, 36, 0);
        this.rarVM.setLowEndianValue(globalData, 40, 0);
        this.rarVM.setLowEndianValue(globalData, 44, unpackFilter2.getExecCount());
        for (int i11 = 0; i11 < 16; i11++) {
            globalData.set(i11 + 48, (byte) 0);
        }
        if ((i & 8) != 0) {
            if (bitInput.Overflow(3) || (ReadData = RarVM.ReadData(bitInput)) > 8128) {
                return false;
            }
            int size2 = unpackFilter2.getPrg().getGlobalData().size();
            int i12 = ReadData + 64;
            if (size2 < i12) {
                unpackFilter2.getPrg().getGlobalData().setSize(i12 - size2);
            }
            Vector<Byte> globalData2 = unpackFilter2.getPrg().getGlobalData();
            for (int i13 = 0; i13 < ReadData; i13++) {
                if (bitInput.Overflow(3)) {
                    return false;
                }
                globalData2.set(64 + i13, Byte.valueOf((byte) (bitInput.fgetbits() >>> 8)));
                bitInput.faddbits(8);
            }
        }
        return true;
    }

    private void copyString(int i, int i2) {
        int i3 = this.unpPtr;
        int i4 = i3 - i2;
        if (i4 < 0 || i4 >= 4194044 || i3 >= 4194044) {
            while (true) {
                int i5 = i - 1;
                if (i != 0) {
                    byte[] bArr = this.window;
                    int i6 = this.unpPtr;
                    bArr[i6] = bArr[i4 & Compress.MAXWINMASK];
                    this.unpPtr = (i6 + 1) & Compress.MAXWINMASK;
                    i = i5;
                    i4++;
                } else {
                    return;
                }
            }
        } else if (i2 == 1) {
            byte[] bArr2 = this.window;
            Arrays.fill(bArr2, i3, i3 + i, bArr2[i4]);
            this.unpPtr += i;
        } else if (i4 + i <= i3) {
            byte[] bArr3 = this.window;
            System.arraycopy(bArr3, i4, bArr3, i3, i);
            this.unpPtr += i;
        } else {
            while (true) {
                byte[] bArr4 = this.window;
                int i7 = this.unpPtr;
                this.unpPtr = i7 + 1;
                int i8 = i4 + 1;
                bArr4[i7] = bArr4[i4];
                i--;
                if (i > 0) {
                    i4 = i8;
                } else {
                    return;
                }
            }
        }
    }

    private void initFilters() {
        this.oldFilterLengths.clear();
        this.lastFilter = 0;
        this.filters.clear();
        this.prgStack.clear();
    }

    private void insertLastMatch(int i, int i2) {
        this.lastDist = i2;
        this.lastLength = i;
    }

    private void insertOldDist(int i) {
        int[] iArr = this.oldDist;
        iArr[3] = iArr[2];
        iArr[2] = iArr[1];
        iArr[1] = iArr[0];
        iArr[0] = i;
    }

    private boolean readEndOfBlock() {
        boolean z;
        boolean z2;
        int i = getbits();
        if ((32768 & i) != 0) {
            addbits(1);
            z = true;
            z2 = false;
        } else {
            if ((i & 16384) != 0) {
                z = true;
            } else {
                z = false;
            }
            addbits(2);
            z2 = true;
        }
        this.tablesRead = !z;
        if (!z2 && (!z || readTables())) {
            return true;
        }
        return false;
    }

    private boolean readTables() {
        int fgetbits;
        int fgetbits2;
        byte[] bArr = new byte[20];
        byte[] bArr2 = new byte[Compress.HUFF_TABLE_SIZE];
        if (this.inAddr > this.readTop - 25 && !unpReadBuf()) {
            return false;
        }
        faddbits((8 - this.inBit) & 7);
        long fgetbits3 = fgetbits();
        if ((32768 & fgetbits3) != 0) {
            this.unpBlockType = BlockTypes.BLOCK_PPM;
            return this.ppm.decodeInit(this, this.ppmEscChar);
        }
        this.unpBlockType = BlockTypes.BLOCK_LZ;
        this.prevLowDist = 0;
        this.lowDistRepCount = 0;
        if ((fgetbits3 & 16384) == 0) {
            Arrays.fill(this.unpOldTable, (byte) 0);
        }
        faddbits(2);
        int i = 0;
        while (i < 20) {
            int fgetbits4 = (fgetbits() >>> 12) & 255;
            faddbits(4);
            if (fgetbits4 == 15) {
                int fgetbits5 = (fgetbits() >>> 12) & 255;
                faddbits(4);
                if (fgetbits5 == 0) {
                    bArr[i] = 15;
                } else {
                    int i2 = fgetbits5 + 2;
                    while (true) {
                        int i3 = i2 - 1;
                        if (i2 <= 0 || i >= 20) {
                            break;
                        }
                        bArr[i] = 0;
                        i++;
                        i2 = i3;
                    }
                    i--;
                }
            } else {
                bArr[i] = (byte) fgetbits4;
            }
            i++;
        }
        makeDecodeTables(bArr, 0, this.BD, 20);
        int i4 = 0;
        while (i4 < 404) {
            if (this.inAddr > this.readTop - 5 && !unpReadBuf()) {
                return false;
            }
            int decodeNumber = decodeNumber(this.BD);
            if (decodeNumber < 16) {
                bArr2[i4] = (byte) ((decodeNumber + this.unpOldTable[i4]) & 15);
                i4++;
            } else if (decodeNumber < 18) {
                if (decodeNumber == 16) {
                    fgetbits = (fgetbits() >>> 13) + 3;
                    faddbits(3);
                } else {
                    fgetbits = (fgetbits() >>> 9) + 11;
                    faddbits(7);
                }
                while (true) {
                    int i5 = fgetbits - 1;
                    if (fgetbits > 0 && i4 < 404) {
                        bArr2[i4] = bArr2[i4 - 1];
                        i4++;
                        fgetbits = i5;
                    }
                }
            } else {
                if (decodeNumber == 18) {
                    fgetbits2 = (fgetbits() >>> 13) + 3;
                    faddbits(3);
                } else {
                    fgetbits2 = (fgetbits() >>> 9) + 11;
                    faddbits(7);
                }
                while (true) {
                    int i6 = fgetbits2 - 1;
                    if (fgetbits2 > 0 && i4 < 404) {
                        bArr2[i4] = 0;
                        i4++;
                        fgetbits2 = i6;
                    }
                }
            }
        }
        this.tablesRead = true;
        if (this.inAddr > this.readTop) {
            return false;
        }
        makeDecodeTables(bArr2, 0, this.LD, Compress.NC);
        makeDecodeTables(bArr2, Compress.NC, this.DD, 60);
        makeDecodeTables(bArr2, 359, this.LDD, 17);
        makeDecodeTables(bArr2, 376, this.RD, 28);
        byte[] bArr3 = this.unpOldTable;
        System.arraycopy(bArr2, 0, bArr3, 0, bArr3.length);
        return true;
    }

    private boolean readVMCode() {
        int i = getbits() >>> 8;
        addbits(8);
        int i2 = (i & 7) + 1;
        if (i2 == 7) {
            i2 = (getbits() >>> 8) + 7;
            addbits(8);
        } else if (i2 == 8) {
            i2 = getbits();
            addbits(16);
        }
        ArrayList arrayList = new ArrayList();
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.inAddr >= this.readTop - 1 && !unpReadBuf() && i3 < i2 - 1) {
                return false;
            }
            arrayList.add(Byte.valueOf((byte) (getbits() >>> 8)));
            addbits(8);
        }
        return addVMCode(i, arrayList, i2);
    }

    private boolean readVMCodePPM() {
        int decodeChar;
        int decodeChar2 = this.ppm.decodeChar();
        if (decodeChar2 == -1) {
            return false;
        }
        int i = (decodeChar2 & 7) + 1;
        if (i == 7) {
            int decodeChar3 = this.ppm.decodeChar();
            if (decodeChar3 == -1) {
                return false;
            }
            i = decodeChar3 + 7;
        } else if (i == 8) {
            int decodeChar4 = this.ppm.decodeChar();
            if (decodeChar4 == -1 || (decodeChar = this.ppm.decodeChar()) == -1) {
                return false;
            }
            i = (decodeChar4 * 256) + decodeChar;
        }
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < i; i2++) {
            int decodeChar5 = this.ppm.decodeChar();
            if (decodeChar5 == -1) {
                return false;
            }
            arrayList.add(Byte.valueOf((byte) decodeChar5));
        }
        return addVMCode(decodeChar2, arrayList, i);
    }

    private void unpack29(boolean z) {
        int i;
        int[] iArr = new int[60];
        byte[] bArr = new byte[60];
        if (iArr[1] == 0) {
            int i2 = 0;
            int i3 = 0;
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int[] iArr2 = DBitLengthCounts;
                if (i2 >= iArr2.length) {
                    break;
                }
                int i6 = iArr2[i2];
                int i7 = 0;
                while (i7 < i6) {
                    iArr[i5] = i3;
                    bArr[i5] = (byte) i4;
                    i7++;
                    i5++;
                    i3 += 1 << i4;
                }
                i2++;
                i4++;
            }
        }
        this.fileExtracted = true;
        if (!this.suspended) {
            unpInitData(z);
            if (unpReadBuf()) {
                if ((!z || !this.tablesRead) && !readTables()) {
                    return;
                }
            } else {
                return;
            }
        }
        if (this.ppmError) {
            return;
        }
        while (true) {
            this.unpPtr &= Compress.MAXWINMASK;
            if (this.inAddr > this.readBorder && !unpReadBuf()) {
                break;
            }
            int i8 = this.wrPtr;
            int i9 = this.unpPtr;
            if ((4194303 & (i8 - i9)) < 260 && i8 != i9) {
                UnpWriteBuf();
                if (this.writtenFileSize > this.destUnpSize) {
                    return;
                }
                if (this.suspended) {
                    this.fileExtracted = false;
                    return;
                }
            }
            if (this.unpBlockType == BlockTypes.BLOCK_PPM) {
                int decodeChar = this.ppm.decodeChar();
                if (decodeChar == -1) {
                    this.ppmError = true;
                    break;
                }
                if (decodeChar == this.ppmEscChar) {
                    int decodeChar2 = this.ppm.decodeChar();
                    if (decodeChar2 == 0) {
                        if (!readTables()) {
                            break;
                        }
                    } else if (decodeChar2 == 2 || decodeChar2 == -1) {
                        break;
                    } else if (decodeChar2 == 3) {
                        if (!readVMCodePPM()) {
                            break;
                        }
                    } else if (decodeChar2 == 4) {
                        boolean z2 = false;
                        int i10 = 0;
                        int i11 = 0;
                        for (int i12 = 0; i12 < 4 && !z2; i12++) {
                            int decodeChar3 = this.ppm.decodeChar();
                            if (decodeChar3 == -1) {
                                z2 = true;
                            } else if (i12 == 3) {
                                i11 = decodeChar3 & 255;
                            } else {
                                i10 = (i10 << 8) + (decodeChar3 & 255);
                            }
                        }
                        if (z2) {
                            break;
                        }
                        copyString(i11 + 32, i10 + 2);
                    } else if (decodeChar2 == 5) {
                        int decodeChar4 = this.ppm.decodeChar();
                        if (decodeChar4 == -1) {
                            break;
                        }
                        copyString(decodeChar4 + 4, 1);
                    }
                }
                byte[] bArr2 = this.window;
                int i13 = this.unpPtr;
                this.unpPtr = i13 + 1;
                bArr2[i13] = (byte) decodeChar;
            } else {
                int decodeNumber = decodeNumber(this.LD);
                if (decodeNumber < 256) {
                    byte[] bArr3 = this.window;
                    int i14 = this.unpPtr;
                    this.unpPtr = i14 + 1;
                    bArr3[i14] = (byte) decodeNumber;
                } else if (decodeNumber >= 271) {
                    int i15 = decodeNumber - 271;
                    int i16 = Unpack20.LDecode[i15] + 3;
                    byte b = Unpack20.LBits[i15];
                    if (b > 0) {
                        i16 += getbits() >>> (16 - b);
                        addbits(b);
                    }
                    int decodeNumber2 = decodeNumber(this.DD);
                    int i17 = iArr[decodeNumber2] + 1;
                    byte b2 = bArr[decodeNumber2];
                    if (b2 > 0) {
                        if (decodeNumber2 > 9) {
                            if (b2 > 4) {
                                i17 += (getbits() >>> (20 - b2)) << 4;
                                addbits(b2 - 4);
                            }
                            int i18 = this.lowDistRepCount;
                            if (i18 > 0) {
                                this.lowDistRepCount = i18 - 1;
                                i = this.prevLowDist;
                            } else {
                                int decodeNumber3 = decodeNumber(this.LDD);
                                if (decodeNumber3 == 16) {
                                    this.lowDistRepCount = 15;
                                    i = this.prevLowDist;
                                } else {
                                    i17 += decodeNumber3;
                                    this.prevLowDist = decodeNumber3;
                                }
                            }
                            i17 += i;
                        } else {
                            i17 += getbits() >>> (16 - b2);
                            addbits(b2);
                        }
                    }
                    if (i17 >= 8192) {
                        int i19 = i16 + 1;
                        if (i17 >= 262144) {
                            i16 += 2;
                        } else {
                            i16 = i19;
                        }
                    }
                    insertOldDist(i17);
                    insertLastMatch(i16, i17);
                    copyString(i16, i17);
                } else if (decodeNumber == 256) {
                    if (!readEndOfBlock()) {
                        break;
                    }
                } else if (decodeNumber == 257) {
                    if (!readVMCode()) {
                        break;
                    }
                } else if (decodeNumber == 258) {
                    int i20 = this.lastLength;
                    if (i20 != 0) {
                        copyString(i20, this.lastDist);
                    }
                } else if (decodeNumber < 263) {
                    int i21 = decodeNumber - 259;
                    int[] iArr3 = this.oldDist;
                    int i22 = iArr3[i21];
                    System.arraycopy(iArr3, 0, iArr3, 1, i21);
                    this.oldDist[0] = i22;
                    int decodeNumber4 = decodeNumber(this.RD);
                    int i23 = Unpack20.LDecode[decodeNumber4] + 2;
                    byte b3 = Unpack20.LBits[decodeNumber4];
                    if (b3 > 0) {
                        i23 += getbits() >>> (16 - b3);
                        addbits(b3);
                    }
                    insertLastMatch(i23, i22);
                    copyString(i23, i22);
                } else if (decodeNumber < 272) {
                    int i24 = decodeNumber - 263;
                    int i25 = Unpack20.SDDecode[i24] + 1;
                    int i26 = Unpack20.SDBits[i24];
                    if (i26 > 0) {
                        i25 += getbits() >>> (16 - i26);
                        addbits(i26);
                    }
                    insertOldDist(i25);
                    insertLastMatch(2, i25);
                    copyString(2, i25);
                }
            }
        }
        UnpWriteBuf();
    }

    private void unstoreFile() {
        byte[] bArr = new byte[65536];
        while (true) {
            int unpRead = this.unpIO.unpRead(bArr, 0, (int) Math.min(65536L, this.destUnpSize));
            if (unpRead != 0 && unpRead != -1) {
                long j = this.destUnpSize;
                if (unpRead >= j) {
                    unpRead = (int) j;
                }
                this.unpIO.unpWrite(bArr, 0, unpRead);
                long j2 = this.destUnpSize;
                if (j2 >= 0) {
                    this.destUnpSize = j2 - unpRead;
                }
            } else {
                return;
            }
        }
    }

    public void cleanUp() {
        SubAllocator subAlloc;
        ModelPPM modelPPM = this.ppm;
        if (modelPPM != null && (subAlloc = modelPPM.getSubAlloc()) != null) {
            subAlloc.stopSubAllocator();
        }
    }

    public void doUnpack(int i, boolean z) {
        if (this.unpIO.getSubHeader().getUnpMethod() == 48) {
            unstoreFile();
        }
        if (i != 15) {
            if (i != 20 && i != 26) {
                if (i != 29 && i != 36) {
                    return;
                }
                unpack29(z);
                return;
            }
            unpack20(z);
            return;
        }
        unpack15(z);
    }

    public int getChar() {
        if (this.inAddr > 32738) {
            unpReadBuf();
        }
        byte[] bArr = this.inBuf;
        int i = this.inAddr;
        this.inAddr = i + 1;
        return bArr[i] & 255;
    }

    public int getPpmEscChar() {
        return this.ppmEscChar;
    }

    public void init(byte[] bArr) {
        if (bArr == null) {
            this.window = new byte[Compress.MAXWINSIZE];
        } else {
            this.window = bArr;
        }
        this.inAddr = 0;
        unpInitData(false);
    }

    public boolean isFileExtracted() {
        return this.fileExtracted;
    }

    public void setDestSize(long j) {
        this.destUnpSize = j;
        this.fileExtracted = false;
    }

    public void setPpmEscChar(int i) {
        this.ppmEscChar = i;
    }

    public void setSuspended(boolean z) {
        this.suspended = z;
    }

    @Override // com.github.junrar.unpack.Unpack15
    public void unpInitData(boolean z) {
        if (!z) {
            this.tablesRead = false;
            Arrays.fill(this.oldDist, 0);
            this.oldDistPtr = 0;
            this.lastDist = 0;
            this.lastLength = 0;
            Arrays.fill(this.unpOldTable, (byte) 0);
            this.unpPtr = 0;
            this.wrPtr = 0;
            this.ppmEscChar = 2;
            initFilters();
        }
        InitBitInput();
        this.ppmError = false;
        this.writtenFileSize = 0L;
        this.readTop = 0;
        this.readBorder = 0;
        unpInitData20(z);
    }
}

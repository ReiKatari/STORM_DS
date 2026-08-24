package com.github.junrar.unpack.ppm;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SubAllocator {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int FIXED_UNIT_SIZE = 12;
    public static final int N1 = 4;
    public static final int N2 = 4;
    public static final int N3 = 4;
    public static final int N4 = 26;
    public static final int N_INDEXES = 38;
    public static final int UNIT_SIZE = Math.max(PPMContext.size, 12);
    private int fakeUnitsStart;
    private int freeListPos;
    private int glueCount;
    private byte[] heap;
    private int heapEnd;
    private int heapStart;
    private int hiUnit;
    private int loUnit;
    private int pText;
    private int subAllocatorSize;
    private int tempMemBlockPos;
    private int unitsStart;
    private final int[] indx2Units = new int[38];
    private final int[] units2Indx = new int[128];
    private final RarNode[] freeList = new RarNode[38];
    private RarNode tempRarNode = null;
    private RarMemBlock tempRarMemBlock1 = null;
    private RarMemBlock tempRarMemBlock2 = null;
    private RarMemBlock tempRarMemBlock3 = null;

    public SubAllocator() {
        clean();
    }

    private int MBPtr(int i, int i2) {
        return i + U2B(i2);
    }

    private int U2B(int i) {
        return UNIT_SIZE * i;
    }

    private int allocUnitsRare(int i) {
        if (this.glueCount == 0) {
            this.glueCount = 255;
            glueFreeBlocks();
            if (this.freeList[i].getNext() != 0) {
                return removeNode(i);
            }
        }
        int i2 = i;
        do {
            i2++;
            if (i2 == 38) {
                this.glueCount--;
                int U2B = U2B(this.indx2Units[i]);
                int i3 = this.indx2Units[i] * 12;
                int i4 = this.fakeUnitsStart;
                if (i4 - this.pText > i3) {
                    this.fakeUnitsStart = i4 - i3;
                    int i5 = this.unitsStart - U2B;
                    this.unitsStart = i5;
                    return i5;
                }
                return 0;
            }
        } while (this.freeList[i2].getNext() == 0);
        int removeNode = removeNode(i2);
        splitBlock(removeNode, i2, i);
        return removeNode;
    }

    private void glueFreeBlocks() {
        RarMemBlock rarMemBlock = this.tempRarMemBlock1;
        rarMemBlock.setAddress(this.tempMemBlockPos);
        RarMemBlock rarMemBlock2 = this.tempRarMemBlock2;
        RarMemBlock rarMemBlock3 = this.tempRarMemBlock3;
        int i = this.loUnit;
        if (i != this.hiUnit) {
            this.heap[i] = 0;
        }
        rarMemBlock.setPrev(rarMemBlock);
        rarMemBlock.setNext(rarMemBlock);
        for (int i2 = 0; i2 < 38; i2++) {
            while (this.freeList[i2].getNext() != 0) {
                rarMemBlock2.setAddress(removeNode(i2));
                rarMemBlock2.insertAt(rarMemBlock);
                rarMemBlock2.setStamp(65535);
                rarMemBlock2.setNU(this.indx2Units[i2]);
            }
        }
        rarMemBlock2.setAddress(rarMemBlock.getNext());
        while (rarMemBlock2.getAddress() != rarMemBlock.getAddress()) {
            rarMemBlock3.setAddress(MBPtr(rarMemBlock2.getAddress(), rarMemBlock2.getNU()));
            while (rarMemBlock3.getStamp() == 65535) {
                if (rarMemBlock3.getNU() + rarMemBlock2.getNU() < 65536) {
                    rarMemBlock3.remove();
                    rarMemBlock2.setNU(rarMemBlock3.getNU() + rarMemBlock2.getNU());
                    rarMemBlock3.setAddress(MBPtr(rarMemBlock2.getAddress(), rarMemBlock2.getNU()));
                }
            }
            rarMemBlock2.setAddress(rarMemBlock2.getNext());
        }
        rarMemBlock2.setAddress(rarMemBlock.getNext());
        while (rarMemBlock2.getAddress() != rarMemBlock.getAddress()) {
            rarMemBlock2.remove();
            int nu = rarMemBlock2.getNU();
            while (nu > 128) {
                insertNode(rarMemBlock2.getAddress(), 37);
                nu -= 128;
                rarMemBlock2.setAddress(MBPtr(rarMemBlock2.getAddress(), 128));
            }
            int[] iArr = this.indx2Units;
            int i3 = this.units2Indx[nu - 1];
            if (iArr[i3] != nu) {
                i3--;
                int i4 = nu - iArr[i3];
                insertNode(MBPtr(rarMemBlock2.getAddress(), nu - i4), i4 - 1);
            }
            insertNode(rarMemBlock2.getAddress(), i3);
            rarMemBlock2.setAddress(rarMemBlock.getNext());
        }
    }

    private void insertNode(int i, int i2) {
        RarNode rarNode = this.tempRarNode;
        rarNode.setAddress(i);
        rarNode.setNext(this.freeList[i2].getNext());
        this.freeList[i2].setNext(rarNode);
    }

    private int removeNode(int i) {
        int next = this.freeList[i].getNext();
        RarNode rarNode = this.tempRarNode;
        rarNode.setAddress(next);
        this.freeList[i].setNext(rarNode.getNext());
        return next;
    }

    private int sizeOfFreeList() {
        return this.freeList.length * 4;
    }

    private void splitBlock(int i, int i2, int i3) {
        int[] iArr = this.indx2Units;
        int i4 = iArr[i2];
        int i5 = iArr[i3];
        int i6 = i4 - i5;
        int U2B = i + U2B(i5);
        int[] iArr2 = this.indx2Units;
        int i7 = this.units2Indx[i6 - 1];
        if (iArr2[i7] != i6) {
            int i8 = i7 - 1;
            insertNode(U2B, i8);
            int i9 = this.indx2Units[i8];
            U2B += U2B(i9);
            i6 -= i9;
        }
        insertNode(U2B, this.units2Indx[i6 - 1]);
    }

    public int GetAllocatedMemory() {
        return this.subAllocatorSize;
    }

    public int allocContext() {
        int i = this.hiUnit;
        if (i != this.loUnit) {
            int i2 = i - UNIT_SIZE;
            this.hiUnit = i2;
            return i2;
        } else if (this.freeList[0].getNext() != 0) {
            return removeNode(0);
        } else {
            return allocUnitsRare(0);
        }
    }

    public int allocUnits(int i) {
        int i2 = this.units2Indx[i - 1];
        if (this.freeList[i2].getNext() != 0) {
            return removeNode(i2);
        }
        int i3 = this.loUnit;
        int U2B = U2B(this.indx2Units[i2]) + i3;
        this.loUnit = U2B;
        if (U2B <= this.hiUnit) {
            return i3;
        }
        this.loUnit = U2B - U2B(this.indx2Units[i2]);
        return allocUnitsRare(i2);
    }

    public void clean() {
        this.subAllocatorSize = 0;
    }

    public void decPText(int i) {
        setPText(getPText() - i);
    }

    public int expandUnits(int i, int i2) {
        int[] iArr = this.units2Indx;
        int i3 = iArr[i2 - 1];
        if (i3 == iArr[i2]) {
            return i;
        }
        int allocUnits = allocUnits(i2 + 1);
        if (allocUnits != 0) {
            byte[] bArr = this.heap;
            System.arraycopy(bArr, i, bArr, allocUnits, U2B(i2));
            insertNode(i, i3);
        }
        return allocUnits;
    }

    public void freeUnits(int i, int i2) {
        insertNode(i, this.units2Indx[i2 - 1]);
    }

    public int getFakeUnitsStart() {
        return this.fakeUnitsStart;
    }

    public byte[] getHeap() {
        return this.heap;
    }

    public int getHeapEnd() {
        return this.heapEnd;
    }

    public int getPText() {
        return this.pText;
    }

    public int getUnitsStart() {
        return this.unitsStart;
    }

    public void incPText() {
        this.pText++;
    }

    public void initSubAllocator() {
        int i;
        byte[] bArr = this.heap;
        int i2 = this.freeListPos;
        Arrays.fill(bArr, i2, sizeOfFreeList() + i2, (byte) 0);
        int i3 = this.heapStart;
        this.pText = i3;
        int i4 = this.subAllocatorSize;
        int i5 = ((i4 / 8) / 12) * 84;
        int i6 = UNIT_SIZE;
        int i7 = (i5 / 12) * i6;
        int i8 = i4 - i5;
        int i9 = (i8 % 12) + ((i8 / 12) * i6) + i3;
        this.unitsStart = i9;
        this.loUnit = i9;
        this.fakeUnitsStart = i3 + i8;
        this.hiUnit = i9 + i7;
        int i10 = 1;
        int i11 = 0;
        while (i11 < 4) {
            this.indx2Units[i11] = i10 & 255;
            i11++;
            i10++;
        }
        int i12 = i10 + 1;
        while (i11 < 8) {
            this.indx2Units[i11] = i12 & 255;
            i11++;
            i12 += 2;
        }
        int i13 = i12 + 1;
        while (i11 < 12) {
            this.indx2Units[i11] = i13 & 255;
            i11++;
            i13 += 3;
        }
        int i14 = i13 + 1;
        while (i11 < 38) {
            this.indx2Units[i11] = i14 & 255;
            i11++;
            i14 += 4;
        }
        this.glueCount = 0;
        int i15 = 0;
        int i16 = 0;
        while (i15 < 128) {
            int i17 = i15 + 1;
            if (this.indx2Units[i16] < i17) {
                i = 1;
            } else {
                i = 0;
            }
            i16 += i;
            this.units2Indx[i15] = i16 & 255;
            i15 = i17;
        }
    }

    public void setFakeUnitsStart(int i) {
        this.fakeUnitsStart = i;
    }

    public void setPText(int i) {
        this.pText = i;
    }

    public void setUnitsStart(int i) {
        this.unitsStart = i;
    }

    public int shrinkUnits(int i, int i2, int i3) {
        int[] iArr = this.units2Indx;
        int i4 = iArr[i2 - 1];
        int i5 = iArr[i3 - 1];
        if (i4 == i5) {
            return i;
        }
        if (this.freeList[i5].getNext() != 0) {
            int removeNode = removeNode(i5);
            byte[] bArr = this.heap;
            System.arraycopy(bArr, i, bArr, removeNode, U2B(i3));
            insertNode(i, i4);
            return removeNode;
        }
        splitBlock(i, i4, i5);
        return i;
    }

    public boolean startSubAllocator(int i) {
        int i2 = i << 20;
        if (this.subAllocatorSize == i2) {
            return true;
        }
        stopSubAllocator();
        int i3 = UNIT_SIZE;
        int i4 = ((i2 / 12) * i3) + i3;
        this.tempMemBlockPos = i4 + 153;
        this.heap = new byte[i4 + 165];
        this.heapStart = 1;
        this.heapEnd = (1 + i4) - i3;
        this.subAllocatorSize = i2;
        int i5 = i4 + 1;
        this.freeListPos = i5;
        int i6 = 0;
        while (true) {
            RarNode[] rarNodeArr = this.freeList;
            if (i6 < rarNodeArr.length) {
                rarNodeArr[i6] = new RarNode(this.heap);
                this.freeList[i6].setAddress(i5);
                i6++;
                i5 += 4;
            } else {
                this.tempRarNode = new RarNode(this.heap);
                this.tempRarMemBlock1 = new RarMemBlock(this.heap);
                this.tempRarMemBlock2 = new RarMemBlock(this.heap);
                this.tempRarMemBlock3 = new RarMemBlock(this.heap);
                return true;
            }
        }
    }

    public void stopSubAllocator() {
        if (this.subAllocatorSize != 0) {
            this.subAllocatorSize = 0;
            this.heap = null;
            this.heapStart = 1;
            this.tempRarNode = null;
            this.tempRarMemBlock1 = null;
            this.tempRarMemBlock2 = null;
            this.tempRarMemBlock3 = null;
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SubAllocator[\n  subAllocatorSize=");
        sb.append(this.subAllocatorSize);
        sb.append("\n  glueCount=");
        sb.append(this.glueCount);
        sb.append("\n  heapStart=");
        sb.append(this.heapStart);
        sb.append("\n  loUnit=");
        sb.append(this.loUnit);
        sb.append("\n  hiUnit=");
        sb.append(this.hiUnit);
        sb.append("\n  pText=");
        sb.append(this.pText);
        sb.append("\n  unitsStart=");
        return lb1.o(sb, this.unitsStart, "\n]");
    }
}

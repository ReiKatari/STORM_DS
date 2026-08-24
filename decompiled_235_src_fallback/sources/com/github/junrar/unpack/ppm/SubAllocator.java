package com.github.junrar.unpack.ppm;
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
    public static final int UNIT_SIZE = 0;
    private int fakeUnitsStart;
    private final com.github.junrar.unpack.ppm.RarNode[] freeList;
    private int freeListPos;
    private int glueCount;
    private byte[] heap;
    private int heapEnd;
    private int heapStart;
    private int hiUnit;
    private final int[] indx2Units;
    private int loUnit;
    private int pText;
    private int subAllocatorSize;
    private int tempMemBlockPos;
    private com.github.junrar.unpack.ppm.RarMemBlock tempRarMemBlock1;
    private com.github.junrar.unpack.ppm.RarMemBlock tempRarMemBlock2;
    private com.github.junrar.unpack.ppm.RarMemBlock tempRarMemBlock3;
    private com.github.junrar.unpack.ppm.RarNode tempRarNode;
    private final int[] units2Indx;
    private int unitsStart;

    static {
            int r0 = com.github.junrar.unpack.ppm.PPMContext.size
            r1 = 12
            int r0 = java.lang.Math.max(r0, r1)
            com.github.junrar.unpack.ppm.SubAllocator.UNIT_SIZE = r0
            return
    }

    public SubAllocator() {
            r2 = this;
            r2.<init>()
            r0 = 38
            int[] r1 = new int[r0]
            r2.indx2Units = r1
            r1 = 128(0x80, float:1.8E-43)
            int[] r1 = new int[r1]
            r2.units2Indx = r1
            com.github.junrar.unpack.ppm.RarNode[] r0 = new com.github.junrar.unpack.ppm.RarNode[r0]
            r2.freeList = r0
            r0 = 0
            r2.tempRarNode = r0
            r2.tempRarMemBlock1 = r0
            r2.tempRarMemBlock2 = r0
            r2.tempRarMemBlock3 = r0
            r2.clean()
            return
    }

    private int MBPtr(int r1, int r2) {
            r0 = this;
            int r0 = r0.U2B(r2)
            int r1 = r1 + r0
            return r1
    }

    private int U2B(int r1) {
            r0 = this;
            int r0 = com.github.junrar.unpack.ppm.SubAllocator.UNIT_SIZE
            int r0 = r0 * r1
            return r0
    }

    private int allocUnitsRare(int r4) {
            r3 = this;
            int r0 = r3.glueCount
            if (r0 != 0) goto L1a
            r0 = 255(0xff, float:3.57E-43)
            r3.glueCount = r0
            r3.glueFreeBlocks()
            com.github.junrar.unpack.ppm.RarNode[] r0 = r3.freeList
            r0 = r0[r4]
            int r0 = r0.getNext()
            if (r0 == 0) goto L1a
            int r3 = r3.removeNode(r4)
            return r3
        L1a:
            r0 = r4
        L1b:
            int r0 = r0 + 1
            r1 = 38
            if (r0 != r1) goto L48
            int r0 = r3.glueCount
            int r0 = r0 + (-1)
            r3.glueCount = r0
            int[] r0 = r3.indx2Units
            r0 = r0[r4]
            int r0 = r3.U2B(r0)
            int[] r1 = r3.indx2Units
            r4 = r1[r4]
            int r4 = r4 * 12
            int r1 = r3.fakeUnitsStart
            int r2 = r3.pText
            int r2 = r1 - r2
            if (r2 <= r4) goto L46
            int r1 = r1 - r4
            r3.fakeUnitsStart = r1
            int r4 = r3.unitsStart
            int r4 = r4 - r0
            r3.unitsStart = r4
            return r4
        L46:
            r3 = 0
            return r3
        L48:
            com.github.junrar.unpack.ppm.RarNode[] r1 = r3.freeList
            r1 = r1[r0]
            int r1 = r1.getNext()
            if (r1 == 0) goto L1b
            int r1 = r3.removeNode(r0)
            r3.splitBlock(r1, r0, r4)
            return r1
    }

    private void glueFreeBlocks() {
            r6 = this;
            com.github.junrar.unpack.ppm.RarMemBlock r0 = r6.tempRarMemBlock1
            int r1 = r6.tempMemBlockPos
            r0.setAddress(r1)
            com.github.junrar.unpack.ppm.RarMemBlock r1 = r6.tempRarMemBlock2
            com.github.junrar.unpack.ppm.RarMemBlock r2 = r6.tempRarMemBlock3
            int r3 = r6.loUnit
            int r4 = r6.hiUnit
            r5 = 0
            if (r3 == r4) goto L16
            byte[] r4 = r6.heap
            r4[r3] = r5
        L16:
            r0.setPrev(r0)
            r0.setNext(r0)
        L1c:
            r3 = 38
            r4 = 65535(0xffff, float:9.1834E-41)
            if (r5 >= r3) goto L45
        L23:
            com.github.junrar.unpack.ppm.RarNode[] r3 = r6.freeList
            r3 = r3[r5]
            int r3 = r3.getNext()
            if (r3 == 0) goto L42
            int r3 = r6.removeNode(r5)
            r1.setAddress(r3)
            r1.insertAt(r0)
            r1.setStamp(r4)
            int[] r3 = r6.indx2Units
            r3 = r3[r5]
            r1.setNU(r3)
            goto L23
        L42:
            int r5 = r5 + 1
            goto L1c
        L45:
            int r3 = r0.getNext()
            r1.setAddress(r3)
        L4c:
            int r3 = r1.getAddress()
            int r5 = r0.getAddress()
            if (r3 == r5) goto L9f
            int r3 = r1.getAddress()
            int r5 = r1.getNU()
            int r3 = r6.MBPtr(r3, r5)
            r2.setAddress(r3)
        L65:
            int r3 = r2.getStamp()
            if (r3 != r4) goto L97
            int r3 = r1.getNU()
            int r5 = r2.getNU()
            int r5 = r5 + r3
            r3 = 65536(0x10000, float:9.1835E-41)
            if (r5 >= r3) goto L97
            r2.remove()
            int r3 = r1.getNU()
            int r5 = r2.getNU()
            int r5 = r5 + r3
            r1.setNU(r5)
            int r3 = r1.getAddress()
            int r5 = r1.getNU()
            int r3 = r6.MBPtr(r3, r5)
            r2.setAddress(r3)
            goto L65
        L97:
            int r3 = r1.getNext()
            r1.setAddress(r3)
            goto L4c
        L9f:
            int r2 = r0.getNext()
            r1.setAddress(r2)
        La6:
            int r2 = r1.getAddress()
            int r3 = r0.getAddress()
            if (r2 == r3) goto L101
            r1.remove()
            int r2 = r1.getNU()
        Lb7:
            r3 = 128(0x80, float:1.8E-43)
            if (r2 <= r3) goto Ld2
            int r4 = r1.getAddress()
            r5 = 37
            r6.insertNode(r4, r5)
            int r2 = r2 + (-128)
            int r4 = r1.getAddress()
            int r3 = r6.MBPtr(r4, r3)
            r1.setAddress(r3)
            goto Lb7
        Ld2:
            int[] r3 = r6.indx2Units
            int[] r4 = r6.units2Indx
            int r5 = r2 + (-1)
            r4 = r4[r5]
            r5 = r3[r4]
            if (r5 == r2) goto Lf2
            int r4 = r4 + (-1)
            r3 = r3[r4]
            int r3 = r2 - r3
            int r5 = r1.getAddress()
            int r2 = r2 - r3
            int r2 = r6.MBPtr(r5, r2)
            int r3 = r3 + (-1)
            r6.insertNode(r2, r3)
        Lf2:
            int r2 = r1.getAddress()
            r6.insertNode(r2, r4)
            int r2 = r0.getNext()
            r1.setAddress(r2)
            goto La6
        L101:
            return
    }

    private void insertNode(int r2, int r3) {
            r1 = this;
            com.github.junrar.unpack.ppm.RarNode r0 = r1.tempRarNode
            r0.setAddress(r2)
            com.github.junrar.unpack.ppm.RarNode[] r2 = r1.freeList
            r2 = r2[r3]
            int r2 = r2.getNext()
            r0.setNext(r2)
            com.github.junrar.unpack.ppm.RarNode[] r1 = r1.freeList
            r1 = r1[r3]
            r1.setNext(r0)
            return
    }

    private int removeNode(int r3) {
            r2 = this;
            com.github.junrar.unpack.ppm.RarNode[] r0 = r2.freeList
            r0 = r0[r3]
            int r0 = r0.getNext()
            com.github.junrar.unpack.ppm.RarNode r1 = r2.tempRarNode
            r1.setAddress(r0)
            com.github.junrar.unpack.ppm.RarNode[] r2 = r2.freeList
            r2 = r2[r3]
            int r3 = r1.getNext()
            r2.setNext(r3)
            return r0
    }

    private int sizeOfFreeList() {
            r0 = this;
            com.github.junrar.unpack.ppm.RarNode[] r0 = r0.freeList
            int r0 = r0.length
            int r0 = r0 * 4
            return r0
    }

    private void splitBlock(int r3, int r4, int r5) {
            r2 = this;
            int[] r0 = r2.indx2Units
            r4 = r0[r4]
            r5 = r0[r5]
            int r4 = r4 - r5
            int r5 = r2.U2B(r5)
            int r3 = r3 + r5
            int[] r5 = r2.indx2Units
            int[] r0 = r2.units2Indx
            int r1 = r4 + (-1)
            r0 = r0[r1]
            r5 = r5[r0]
            if (r5 == r4) goto L27
            int r0 = r0 + (-1)
            r2.insertNode(r3, r0)
            int[] r5 = r2.indx2Units
            r5 = r5[r0]
            int r0 = r2.U2B(r5)
            int r3 = r3 + r0
            int r4 = r4 - r5
        L27:
            int[] r5 = r2.units2Indx
            int r4 = r4 + (-1)
            r4 = r5[r4]
            r2.insertNode(r3, r4)
            return
    }

    public int GetAllocatedMemory() {
            r0 = this;
            int r0 = r0.subAllocatorSize
            return r0
    }

    public int allocContext() {
            r2 = this;
            int r0 = r2.hiUnit
            int r1 = r2.loUnit
            if (r0 == r1) goto Lc
            int r1 = com.github.junrar.unpack.ppm.SubAllocator.UNIT_SIZE
            int r0 = r0 - r1
            r2.hiUnit = r0
            return r0
        Lc:
            com.github.junrar.unpack.ppm.RarNode[] r0 = r2.freeList
            r1 = 0
            r0 = r0[r1]
            int r0 = r0.getNext()
            if (r0 == 0) goto L1c
            int r2 = r2.removeNode(r1)
            return r2
        L1c:
            int r2 = r2.allocUnitsRare(r1)
            return r2
    }

    public int allocUnits(int r4) {
            r3 = this;
            int[] r0 = r3.units2Indx
            int r4 = r4 + (-1)
            r4 = r0[r4]
            com.github.junrar.unpack.ppm.RarNode[] r0 = r3.freeList
            r0 = r0[r4]
            int r0 = r0.getNext()
            if (r0 == 0) goto L15
            int r3 = r3.removeNode(r4)
            return r3
        L15:
            int r0 = r3.loUnit
            int[] r1 = r3.indx2Units
            r1 = r1[r4]
            int r1 = r3.U2B(r1)
            int r1 = r1 + r0
            r3.loUnit = r1
            int r2 = r3.hiUnit
            if (r1 > r2) goto L27
            return r0
        L27:
            int[] r0 = r3.indx2Units
            r0 = r0[r4]
            int r0 = r3.U2B(r0)
            int r1 = r1 - r0
            r3.loUnit = r1
            int r3 = r3.allocUnitsRare(r4)
            return r3
    }

    public void clean() {
            r1 = this;
            r0 = 0
            r1.subAllocatorSize = r0
            return
    }

    public void decPText(int r2) {
            r1 = this;
            int r0 = r1.getPText()
            int r0 = r0 - r2
            r1.setPText(r0)
            return
    }

    public int expandUnits(int r4, int r5) {
            r3 = this;
            int[] r0 = r3.units2Indx
            int r1 = r5 + (-1)
            r1 = r0[r1]
            r0 = r0[r5]
            if (r1 != r0) goto Lb
            return r4
        Lb:
            int r0 = r5 + 1
            int r0 = r3.allocUnits(r0)
            if (r0 == 0) goto L1f
            byte[] r2 = r3.heap
            int r5 = r3.U2B(r5)
            java.lang.System.arraycopy(r2, r4, r2, r0, r5)
            r3.insertNode(r4, r1)
        L1f:
            return r0
    }

    public void freeUnits(int r2, int r3) {
            r1 = this;
            int[] r0 = r1.units2Indx
            int r3 = r3 + (-1)
            r3 = r0[r3]
            r1.insertNode(r2, r3)
            return
    }

    public int getFakeUnitsStart() {
            r0 = this;
            int r0 = r0.fakeUnitsStart
            return r0
    }

    public byte[] getHeap() {
            r0 = this;
            byte[] r0 = r0.heap
            return r0
    }

    public int getHeapEnd() {
            r0 = this;
            int r0 = r0.heapEnd
            return r0
    }

    public int getPText() {
            r0 = this;
            int r0 = r0.pText
            return r0
    }

    public int getUnitsStart() {
            r0 = this;
            int r0 = r0.unitsStart
            return r0
    }

    public void incPText() {
            r1 = this;
            int r0 = r1.pText
            int r0 = r0 + 1
            r1.pText = r0
            return
    }

    public void initSubAllocator() {
            r8 = this;
            byte[] r0 = r8.heap
            int r1 = r8.freeListPos
            int r2 = r8.sizeOfFreeList()
            int r2 = r2 + r1
            r3 = 0
            java.util.Arrays.fill(r0, r1, r2, r3)
            int r0 = r8.heapStart
            r8.pText = r0
            int r1 = r8.subAllocatorSize
            int r2 = r1 / 8
            r4 = 12
            int r2 = r2 / r4
            int r2 = r2 * 84
            int r5 = r2 / 12
            int r6 = com.github.junrar.unpack.ppm.SubAllocator.UNIT_SIZE
            int r5 = r5 * r6
            int r1 = r1 - r2
            int r2 = r1 / 12
            int r2 = r2 * r6
            int r6 = r1 % 12
            int r6 = r6 + r2
            int r6 = r6 + r0
            r8.unitsStart = r6
            r8.loUnit = r6
            int r0 = r0 + r1
            r8.fakeUnitsStart = r0
            int r6 = r6 + r5
            r8.hiUnit = r6
            r0 = 1
            r2 = r0
            r1 = r3
        L34:
            r5 = 4
            if (r1 >= r5) goto L42
            int[] r5 = r8.indx2Units
            r6 = r2 & 255(0xff, float:3.57E-43)
            r5[r1] = r6
            int r1 = r1 + 1
            int r2 = r2 + 1
            goto L34
        L42:
            int r2 = r2 + r0
        L43:
            r6 = 8
            if (r1 >= r6) goto L52
            int[] r6 = r8.indx2Units
            r7 = r2 & 255(0xff, float:3.57E-43)
            r6[r1] = r7
            int r1 = r1 + 1
            int r2 = r2 + 2
            goto L43
        L52:
            int r2 = r2 + r0
        L53:
            if (r1 >= r4) goto L60
            int[] r6 = r8.indx2Units
            r7 = r2 & 255(0xff, float:3.57E-43)
            r6[r1] = r7
            int r1 = r1 + 1
            int r2 = r2 + 3
            goto L53
        L60:
            int r2 = r2 + r0
        L61:
            r4 = 38
            if (r1 >= r4) goto L6f
            int[] r4 = r8.indx2Units
            r6 = r2 & 255(0xff, float:3.57E-43)
            r4[r1] = r6
            int r1 = r1 + 1
            int r2 = r2 + r5
            goto L61
        L6f:
            r8.glueCount = r3
            r1 = r3
            r2 = r1
        L73:
            r4 = 128(0x80, float:1.8E-43)
            if (r1 >= r4) goto L8b
            int[] r4 = r8.indx2Units
            r4 = r4[r2]
            int r5 = r1 + 1
            if (r4 >= r5) goto L81
            r4 = r0
            goto L82
        L81:
            r4 = r3
        L82:
            int r2 = r2 + r4
            int[] r4 = r8.units2Indx
            r6 = r2 & 255(0xff, float:3.57E-43)
            r4[r1] = r6
            r1 = r5
            goto L73
        L8b:
            return
    }

    public void setFakeUnitsStart(int r1) {
            r0 = this;
            r0.fakeUnitsStart = r1
            return
    }

    public void setPText(int r1) {
            r0 = this;
            r0.pText = r1
            return
    }

    public void setUnitsStart(int r1) {
            r0 = this;
            r0.unitsStart = r1
            return
    }

    public int shrinkUnits(int r3, int r4, int r5) {
            r2 = this;
            int[] r0 = r2.units2Indx
            int r4 = r4 + (-1)
            r4 = r0[r4]
            int r1 = r5 + (-1)
            r0 = r0[r1]
            if (r4 != r0) goto Ld
            return r3
        Ld:
            com.github.junrar.unpack.ppm.RarNode[] r1 = r2.freeList
            r1 = r1[r0]
            int r1 = r1.getNext()
            if (r1 == 0) goto L28
            int r0 = r2.removeNode(r0)
            byte[] r1 = r2.heap
            int r5 = r2.U2B(r5)
            java.lang.System.arraycopy(r1, r3, r1, r0, r5)
            r2.insertNode(r3, r4)
            return r0
        L28:
            r2.splitBlock(r3, r4, r0)
            return r3
    }

    public boolean startSubAllocator(int r6) {
            r5 = this;
            int r6 = r6 << 20
            int r0 = r5.subAllocatorSize
            r1 = 1
            if (r0 != r6) goto L8
            return r1
        L8:
            r5.stopSubAllocator()
            int r0 = r6 / 12
            int r2 = com.github.junrar.unpack.ppm.SubAllocator.UNIT_SIZE
            int r0 = r0 * r2
            int r0 = r0 + r2
            int r3 = r0 + 153
            r5.tempMemBlockPos = r3
            int r3 = r0 + 165
            byte[] r3 = new byte[r3]
            r5.heap = r3
            r5.heapStart = r1
            int r3 = r1 + r0
            int r3 = r3 - r2
            r5.heapEnd = r3
            r5.subAllocatorSize = r6
            int r0 = r0 + r1
            r5.freeListPos = r0
            r6 = 0
        L28:
            com.github.junrar.unpack.ppm.RarNode[] r2 = r5.freeList
            int r3 = r2.length
            if (r6 >= r3) goto L42
            com.github.junrar.unpack.ppm.RarNode r3 = new com.github.junrar.unpack.ppm.RarNode
            byte[] r4 = r5.heap
            r3.<init>(r4)
            r2[r6] = r3
            com.github.junrar.unpack.ppm.RarNode[] r2 = r5.freeList
            r2 = r2[r6]
            r2.setAddress(r0)
            int r6 = r6 + 1
            int r0 = r0 + 4
            goto L28
        L42:
            com.github.junrar.unpack.ppm.RarNode r6 = new com.github.junrar.unpack.ppm.RarNode
            byte[] r0 = r5.heap
            r6.<init>(r0)
            r5.tempRarNode = r6
            com.github.junrar.unpack.ppm.RarMemBlock r6 = new com.github.junrar.unpack.ppm.RarMemBlock
            byte[] r0 = r5.heap
            r6.<init>(r0)
            r5.tempRarMemBlock1 = r6
            com.github.junrar.unpack.ppm.RarMemBlock r6 = new com.github.junrar.unpack.ppm.RarMemBlock
            byte[] r0 = r5.heap
            r6.<init>(r0)
            r5.tempRarMemBlock2 = r6
            com.github.junrar.unpack.ppm.RarMemBlock r6 = new com.github.junrar.unpack.ppm.RarMemBlock
            byte[] r0 = r5.heap
            r6.<init>(r0)
            r5.tempRarMemBlock3 = r6
            return r1
    }

    public void stopSubAllocator() {
            r2 = this;
            int r0 = r2.subAllocatorSize
            if (r0 == 0) goto L15
            r0 = 0
            r2.subAllocatorSize = r0
            r0 = 0
            r2.heap = r0
            r1 = 1
            r2.heapStart = r1
            r2.tempRarNode = r0
            r2.tempRarMemBlock1 = r0
            r2.tempRarMemBlock2 = r0
            r2.tempRarMemBlock3 = r0
        L15:
            return
    }

    public java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "SubAllocator[\n  subAllocatorSize="
            r0.<init>(r1)
            int r1 = r2.subAllocatorSize
            r0.append(r1)
            java.lang.String r1 = "\n  glueCount="
            r0.append(r1)
            int r1 = r2.glueCount
            r0.append(r1)
            java.lang.String r1 = "\n  heapStart="
            r0.append(r1)
            int r1 = r2.heapStart
            r0.append(r1)
            java.lang.String r1 = "\n  loUnit="
            r0.append(r1)
            int r1 = r2.loUnit
            r0.append(r1)
            java.lang.String r1 = "\n  hiUnit="
            r0.append(r1)
            int r1 = r2.hiUnit
            r0.append(r1)
            java.lang.String r1 = "\n  pText="
            r0.append(r1)
            int r1 = r2.pText
            r0.append(r1)
            java.lang.String r1 = "\n  unitsStart="
            r0.append(r1)
            int r2 = r2.unitsStart
            java.lang.String r1 = "\n]"
            java.lang.String r2 = defpackage.lb1.o(r0, r2, r1)
            return r2
    }
}

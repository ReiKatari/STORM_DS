package com.github.junrar.unpack;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class Unpack extends com.github.junrar.unpack.Unpack20 {
    public static int[] DBitLengthCounts;
    private boolean fileExtracted;
    private final java.util.List<com.github.junrar.unpack.UnpackFilter> filters;
    private int lastFilter;
    private int lowDistRepCount;
    private final java.util.List<java.lang.Integer> oldFilterLengths;
    private final com.github.junrar.unpack.ppm.ModelPPM ppm;
    private boolean ppmError;
    private int ppmEscChar;
    private int prevLowDist;
    private final java.util.List<com.github.junrar.unpack.UnpackFilter> prgStack;
    private final com.github.junrar.unpack.vm.RarVM rarVM;
    private boolean tablesRead;
    private com.github.junrar.unpack.ppm.BlockTypes unpBlockType;
    private final byte[] unpOldTable;
    private long writtenFileSize;

    static {
            r0 = 19
            int[] r0 = new int[r0]
            r0 = {x000a: FILL_ARRAY_DATA  , data: [4, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 14, 0, 12} // fill-array
            com.github.junrar.unpack.Unpack.DBitLengthCounts = r0
            return
    }

    public Unpack(com.github.junrar.unpack.ComprDataIO r2) {
            r1 = this;
            r1.<init>()
            com.github.junrar.unpack.ppm.ModelPPM r0 = new com.github.junrar.unpack.ppm.ModelPPM
            r0.<init>()
            r1.ppm = r0
            com.github.junrar.unpack.vm.RarVM r0 = new com.github.junrar.unpack.vm.RarVM
            r0.<init>()
            r1.rarVM = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.filters = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.prgStack = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.oldFilterLengths = r0
            r0 = 404(0x194, float:5.66E-43)
            byte[] r0 = new byte[r0]
            r1.unpOldTable = r0
            r1.unpIO = r2
            r2 = 0
            r1.window = r2
            r2 = 0
            r1.suspended = r2
            r1.unpAllBuf = r2
            r1.unpSomeRead = r2
            return
    }

    private void ExecuteCode(com.github.junrar.unpack.vm.VMPreparedProgram r6) {
            r5 = this;
            java.util.Vector r0 = r6.getGlobalData()
            int r0 = r0.size()
            if (r0 <= 0) goto L38
            int[] r0 = r6.getInitR()
            long r1 = r5.writtenFileSize
            int r1 = (int) r1
            r2 = 6
            r0[r2] = r1
            com.github.junrar.unpack.vm.RarVM r0 = r5.rarVM
            java.util.Vector r1 = r6.getGlobalData()
            long r2 = r5.writtenFileSize
            int r2 = (int) r2
            r3 = 36
            r0.setLowEndianValue(r1, r3, r2)
            com.github.junrar.unpack.vm.RarVM r0 = r5.rarVM
            java.util.Vector r1 = r6.getGlobalData()
            long r2 = r5.writtenFileSize
            r4 = 32
            long r2 = r2 >>> r4
            int r2 = (int) r2
            r3 = 40
            r0.setLowEndianValue(r1, r3, r2)
            com.github.junrar.unpack.vm.RarVM r5 = r5.rarVM
            r5.execute(r6)
        L38:
            return
    }

    private void UnpWriteArea(int r5, int r6) {
            r4 = this;
            r0 = 1
            if (r6 == r5) goto L5
            r4.unpSomeRead = r0
        L5:
            byte[] r1 = r4.window
            if (r6 >= r5) goto L1a
            int r2 = -r5
            r3 = 4194303(0x3fffff, float:5.87747E-39)
            r2 = r2 & r3
            r4.UnpWriteData(r1, r5, r2)
            byte[] r5 = r4.window
            r1 = 0
            r4.UnpWriteData(r5, r1, r6)
            r4.unpAllBuf = r0
            return
        L1a:
            int r6 = r6 - r5
            r4.UnpWriteData(r1, r5, r6)
            return
    }

    private void UnpWriteBuf() {
            r15 = this;
            int r0 = r15.wrPtr
            int r1 = r15.unpPtr
            int r1 = r1 - r0
            r2 = 4194303(0x3fffff, float:5.87747E-39)
            r1 = r1 & r2
            r3 = 0
            r4 = r3
        Lb:
            java.util.List<com.github.junrar.unpack.UnpackFilter> r5 = r15.prgStack
            int r5 = r5.size()
            if (r4 >= r5) goto L25d
            java.util.List<com.github.junrar.unpack.UnpackFilter> r5 = r15.prgStack
            java.lang.Object r5 = r5.get(r4)
            com.github.junrar.unpack.UnpackFilter r5 = (com.github.junrar.unpack.UnpackFilter) r5
            r6 = 1
            if (r5 != 0) goto L20
            goto L25a
        L20:
            boolean r7 = r5.isNextWindow()
            if (r7 == 0) goto L2b
            r5.setNextWindow(r3)
            goto L25a
        L2b:
            int r7 = r5.getBlockStart()
            int r8 = r5.getBlockLength()
            int r9 = r7 - r0
            r9 = r9 & r2
            if (r9 >= r1) goto L25a
            if (r0 == r7) goto L43
            r15.UnpWriteArea(r0, r7)
            int r0 = r15.unpPtr
            int r0 = r0 - r7
            r1 = r0 & r2
            r0 = r7
        L43:
            if (r8 > r1) goto L239
            int r0 = r7 + r8
            r0 = r0 & r2
            if (r7 < r0) goto L5f
            if (r0 != 0) goto L4d
            goto L5f
        L4d:
            r1 = 4194304(0x400000, float:5.877472E-39)
            int r1 = r1 - r7
            com.github.junrar.unpack.vm.RarVM r8 = r15.rarVM
            byte[] r9 = r15.window
            r8.setMemory(r3, r9, r7, r1)
            com.github.junrar.unpack.vm.RarVM r8 = r15.rarVM
            byte[] r9 = r15.window
            r8.setMemory(r1, r9, r3, r0)
            goto L66
        L5f:
            com.github.junrar.unpack.vm.RarVM r1 = r15.rarVM
            byte[] r9 = r15.window
            r1.setMemory(r3, r9, r7, r8)
        L66:
            java.util.List<com.github.junrar.unpack.UnpackFilter> r1 = r15.filters
            int r8 = r5.getParentFilter()
            java.lang.Object r1 = r1.get(r8)
            com.github.junrar.unpack.UnpackFilter r1 = (com.github.junrar.unpack.UnpackFilter) r1
            com.github.junrar.unpack.vm.VMPreparedProgram r1 = r1.getPrg()
            com.github.junrar.unpack.vm.VMPreparedProgram r5 = r5.getPrg()
            java.util.Vector r8 = r1.getGlobalData()
            int r8 = r8.size()
            r9 = 64
            if (r8 <= r9) goto Lb5
            java.util.Vector r8 = r5.getGlobalData()
            java.util.Vector r10 = r1.getGlobalData()
            int r10 = r10.size()
            r8.setSize(r10)
            r8 = r3
        L96:
            java.util.Vector r10 = r1.getGlobalData()
            int r10 = r10.size()
            int r10 = r10 - r9
            if (r8 >= r10) goto Lb5
            java.util.Vector r10 = r5.getGlobalData()
            int r11 = r8 + 64
            java.util.Vector r12 = r1.getGlobalData()
            java.lang.Object r12 = r12.get(r11)
            r10.set(r11, r12)
            int r8 = r8 + 1
            goto L96
        Lb5:
            r15.ExecuteCode(r5)
            java.util.Vector r8 = r5.getGlobalData()
            int r8 = r8.size()
            if (r8 <= r9) goto L103
            java.util.Vector r8 = r1.getGlobalData()
            int r8 = r8.size()
            java.util.Vector r10 = r5.getGlobalData()
            int r10 = r10.size()
            if (r8 >= r10) goto Le3
            java.util.Vector r8 = r1.getGlobalData()
            java.util.Vector r10 = r5.getGlobalData()
            int r10 = r10.size()
            r8.setSize(r10)
        Le3:
            r8 = r3
        Le4:
            java.util.Vector r10 = r5.getGlobalData()
            int r10 = r10.size()
            int r10 = r10 - r9
            if (r8 >= r10) goto L10a
            java.util.Vector r10 = r1.getGlobalData()
            int r11 = r8 + 64
            java.util.Vector r12 = r5.getGlobalData()
            java.lang.Object r12 = r12.get(r11)
            r10.set(r11, r12)
            int r8 = r8 + 1
            goto Le4
        L103:
            java.util.Vector r1 = r1.getGlobalData()
            r1.clear()
        L10a:
            int r1 = r5.getFilteredDataOffset()
            int r5 = r5.getFilteredDataSize()
            byte[] r8 = new byte[r5]
            r10 = r3
        L115:
            if (r10 >= r5) goto L126
            com.github.junrar.unpack.vm.RarVM r11 = r15.rarVM
            byte[] r11 = r11.getMem()
            int r12 = r1 + r10
            r11 = r11[r12]
            r8[r10] = r11
            int r10 = r10 + 1
            goto L115
        L126:
            java.util.List<com.github.junrar.unpack.UnpackFilter> r1 = r15.prgStack
            r10 = 0
            r1.set(r4, r10)
        L12c:
            int r1 = r4 + 1
            java.util.List<com.github.junrar.unpack.UnpackFilter> r11 = r15.prgStack
            int r11 = r11.size()
            if (r1 >= r11) goto L227
            java.util.List<com.github.junrar.unpack.UnpackFilter> r11 = r15.prgStack
            java.lang.Object r11 = r11.get(r1)
            com.github.junrar.unpack.UnpackFilter r11 = (com.github.junrar.unpack.UnpackFilter) r11
            if (r11 == 0) goto L227
            int r12 = r11.getBlockStart()
            if (r12 != r7) goto L227
            int r12 = r11.getBlockLength()
            if (r12 != r5) goto L227
            boolean r12 = r11.isNextWindow()
            if (r12 == 0) goto L154
            goto L227
        L154:
            com.github.junrar.unpack.vm.RarVM r4 = r15.rarVM
            r4.setMemory(r3, r8, r3, r5)
            java.util.List<com.github.junrar.unpack.UnpackFilter> r4 = r15.filters
            int r5 = r11.getParentFilter()
            java.lang.Object r4 = r4.get(r5)
            com.github.junrar.unpack.UnpackFilter r4 = (com.github.junrar.unpack.UnpackFilter) r4
            com.github.junrar.unpack.vm.VMPreparedProgram r4 = r4.getPrg()
            com.github.junrar.unpack.vm.VMPreparedProgram r5 = r11.getPrg()
            java.util.Vector r8 = r4.getGlobalData()
            int r8 = r8.size()
            if (r8 <= r9) goto L1a6
            java.util.Vector r8 = r5.getGlobalData()
            java.util.Vector r11 = r4.getGlobalData()
            int r11 = r11.size()
            r8.setSize(r11)
            r8 = r3
        L187:
            java.util.Vector r11 = r4.getGlobalData()
            int r11 = r11.size()
            int r11 = r11 - r9
            if (r8 >= r11) goto L1a6
            java.util.Vector r11 = r5.getGlobalData()
            int r12 = r8 + 64
            java.util.Vector r13 = r4.getGlobalData()
            java.lang.Object r13 = r13.get(r12)
            r11.set(r12, r13)
            int r8 = r8 + 1
            goto L187
        L1a6:
            r15.ExecuteCode(r5)
            java.util.Vector r8 = r5.getGlobalData()
            int r8 = r8.size()
            if (r8 <= r9) goto L1f4
            java.util.Vector r8 = r4.getGlobalData()
            int r8 = r8.size()
            java.util.Vector r11 = r5.getGlobalData()
            int r11 = r11.size()
            if (r8 >= r11) goto L1d4
            java.util.Vector r8 = r4.getGlobalData()
            java.util.Vector r11 = r5.getGlobalData()
            int r11 = r11.size()
            r8.setSize(r11)
        L1d4:
            r8 = r3
        L1d5:
            java.util.Vector r11 = r5.getGlobalData()
            int r11 = r11.size()
            int r11 = r11 - r9
            if (r8 >= r11) goto L1fb
            java.util.Vector r11 = r4.getGlobalData()
            int r12 = r8 + 64
            java.util.Vector r13 = r5.getGlobalData()
            java.lang.Object r13 = r13.get(r12)
            r11.set(r12, r13)
            int r8 = r8 + 1
            goto L1d5
        L1f4:
            java.util.Vector r4 = r4.getGlobalData()
            r4.clear()
        L1fb:
            int r4 = r5.getFilteredDataOffset()
            int r8 = r5.getFilteredDataSize()
            byte[] r11 = new byte[r8]
            r12 = r3
        L206:
            if (r12 >= r8) goto L21d
            java.util.Vector r13 = r5.getGlobalData()
            int r14 = r4 + r12
            java.lang.Object r13 = r13.get(r14)
            java.lang.Byte r13 = (java.lang.Byte) r13
            byte r13 = r13.byteValue()
            r11[r12] = r13
            int r12 = r12 + 1
            goto L206
        L21d:
            java.util.List<com.github.junrar.unpack.UnpackFilter> r4 = r15.prgStack
            r4.set(r1, r10)
            r4 = r1
            r5 = r8
            r8 = r11
            goto L12c
        L227:
            com.github.junrar.unpack.ComprDataIO r1 = r15.unpIO
            r1.unpWrite(r8, r3, r5)
            r15.unpSomeRead = r6
            long r7 = r15.writtenFileSize
            long r9 = (long) r5
            long r7 = r7 + r9
            r15.writtenFileSize = r7
            int r1 = r15.unpPtr
            int r1 = r1 - r0
            r1 = r1 & r2
            goto L25a
        L239:
            java.util.List<com.github.junrar.unpack.UnpackFilter> r1 = r15.prgStack
            int r1 = r1.size()
            if (r4 >= r1) goto L257
            java.util.List<com.github.junrar.unpack.UnpackFilter> r1 = r15.prgStack
            java.lang.Object r1 = r1.get(r4)
            com.github.junrar.unpack.UnpackFilter r1 = (com.github.junrar.unpack.UnpackFilter) r1
            if (r1 == 0) goto L254
            boolean r2 = r1.isNextWindow()
            if (r2 == 0) goto L254
            r1.setNextWindow(r3)
        L254:
            int r4 = r4 + 1
            goto L239
        L257:
            r15.wrPtr = r0
            return
        L25a:
            int r4 = r4 + r6
            goto Lb
        L25d:
            int r1 = r15.unpPtr
            r15.UnpWriteArea(r0, r1)
            int r0 = r15.unpPtr
            r15.wrPtr = r0
            return
    }

    private void UnpWriteData(byte[] r6, int r7, int r8) {
            r5 = this;
            long r0 = r5.writtenFileSize
            long r2 = r5.destUnpSize
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 < 0) goto L9
            return
        L9:
            long r2 = r2 - r0
            long r0 = (long) r8
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L10
            int r8 = (int) r2
        L10:
            com.github.junrar.unpack.ComprDataIO r2 = r5.unpIO
            r2.unpWrite(r6, r7, r8)
            long r6 = r5.writtenFileSize
            long r6 = r6 + r0
            r5.writtenFileSize = r6
            return
    }

    private boolean addVMCode(int r12, java.util.List<java.lang.Byte> r13, int r14) {
            r11 = this;
            com.github.junrar.unpack.vm.BitInput r14 = new com.github.junrar.unpack.vm.BitInput
            r14.<init>()
            r14.InitBitInput()
            r0 = 0
            r1 = r0
        La:
            r2 = 32768(0x8000, float:4.5918E-41)
            int r3 = r13.size()
            int r2 = java.lang.Math.min(r2, r3)
            if (r1 >= r2) goto L2a
            byte[] r2 = r14.getInBuf()
            java.lang.Object r3 = r13.get(r1)
            java.lang.Byte r3 = (java.lang.Byte) r3
            byte r3 = r3.byteValue()
            r2[r1] = r3
            int r1 = r1 + 1
            goto La
        L2a:
            com.github.junrar.unpack.vm.RarVM r13 = r11.rarVM
            r13.init()
            r13 = r12 & 128(0x80, float:1.8E-43)
            if (r13 == 0) goto L40
            int r13 = com.github.junrar.unpack.vm.RarVM.ReadData(r14)
            if (r13 != 0) goto L3d
            r11.initFilters()
            goto L42
        L3d:
            int r13 = r13 + (-1)
            goto L42
        L40:
            int r13 = r11.lastFilter
        L42:
            java.util.List<com.github.junrar.unpack.UnpackFilter> r1 = r11.filters
            int r1 = r1.size()
            if (r13 > r1) goto L2ac
            java.util.List<java.lang.Integer> r1 = r11.oldFilterLengths
            int r1 = r1.size()
            if (r13 <= r1) goto L54
            goto L2ac
        L54:
            r11.lastFilter = r13
            java.util.List<com.github.junrar.unpack.UnpackFilter> r1 = r11.filters
            int r1 = r1.size()
            r2 = 1
            if (r13 != r1) goto L61
            r1 = r2
            goto L62
        L61:
            r1 = r0
        L62:
            com.github.junrar.unpack.UnpackFilter r3 = new com.github.junrar.unpack.UnpackFilter
            r3.<init>()
            if (r1 == 0) goto L8f
            r4 = 1024(0x400, float:1.435E-42)
            if (r13 <= r4) goto L6e
            return r0
        L6e:
            com.github.junrar.unpack.UnpackFilter r4 = new com.github.junrar.unpack.UnpackFilter
            r4.<init>()
            java.util.List<com.github.junrar.unpack.UnpackFilter> r5 = r11.filters
            r5.add(r4)
            java.util.List<com.github.junrar.unpack.UnpackFilter> r5 = r11.filters
            int r5 = r5.size()
            int r5 = r5 - r2
            r3.setParentFilter(r5)
            java.util.List<java.lang.Integer> r5 = r11.oldFilterLengths
            java.lang.Integer r6 = java.lang.Integer.valueOf(r0)
            r5.add(r6)
            r4.setExecCount(r0)
            goto La2
        L8f:
            java.util.List<com.github.junrar.unpack.UnpackFilter> r4 = r11.filters
            java.lang.Object r4 = r4.get(r13)
            com.github.junrar.unpack.UnpackFilter r4 = (com.github.junrar.unpack.UnpackFilter) r4
            r3.setParentFilter(r13)
            int r5 = r4.getExecCount()
            int r5 = r5 + r2
            r4.setExecCount(r5)
        La2:
            java.util.List<com.github.junrar.unpack.UnpackFilter> r5 = r11.prgStack
            r5.add(r3)
            int r5 = r4.getExecCount()
            r3.setExecCount(r5)
            int r5 = com.github.junrar.unpack.vm.RarVM.ReadData(r14)
            r6 = r12 & 64
            if (r6 == 0) goto Lb8
            int r5 = r5 + 258
        Lb8:
            int r6 = r11.unpPtr
            int r6 = r6 + r5
            r7 = 4194303(0x3fffff, float:5.87747E-39)
            r6 = r6 & r7
            r3.setBlockStart(r6)
            r6 = r12 & 32
            if (r6 == 0) goto Lce
            int r6 = com.github.junrar.unpack.vm.RarVM.ReadData(r14)
            r3.setBlockLength(r6)
            goto Le7
        Lce:
            java.util.List<java.lang.Integer> r6 = r11.oldFilterLengths
            int r6 = r6.size()
            if (r13 >= r6) goto Le3
            java.util.List<java.lang.Integer> r6 = r11.oldFilterLengths
            java.lang.Object r6 = r6.get(r13)
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            goto Le4
        Le3:
            r6 = r0
        Le4:
            r3.setBlockLength(r6)
        Le7:
            int r6 = r11.wrPtr
            int r8 = r11.unpPtr
            if (r6 == r8) goto Lf3
            int r6 = r6 - r8
            r6 = r6 & r7
            if (r6 > r5) goto Lf3
            r5 = r2
            goto Lf4
        Lf3:
            r5 = r0
        Lf4:
            r3.setNextWindow(r5)
            java.util.List<java.lang.Integer> r5 = r11.oldFilterLengths
            int r6 = r3.getBlockLength()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r5.set(r13, r6)
            com.github.junrar.unpack.vm.VMPreparedProgram r13 = r3.getPrg()
            int[] r13 = r13.getInitR()
            java.util.Arrays.fill(r13, r0)
            com.github.junrar.unpack.vm.VMPreparedProgram r13 = r3.getPrg()
            int[] r13 = r13.getInitR()
            r5 = 245760(0x3c000, float:3.44383E-40)
            r6 = 3
            r13[r6] = r5
            com.github.junrar.unpack.vm.VMPreparedProgram r13 = r3.getPrg()
            int[] r13 = r13.getInitR()
            int r5 = r3.getBlockLength()
            r7 = 4
            r13[r7] = r5
            com.github.junrar.unpack.vm.VMPreparedProgram r13 = r3.getPrg()
            int[] r13 = r13.getInitR()
            r5 = 5
            int r7 = r3.getExecCount()
            r13[r5] = r7
            r13 = r12 & 16
            r5 = 7
            if (r13 == 0) goto L162
            int r13 = r14.fgetbits()
            int r13 = r13 >>> 9
            r14.faddbits(r5)
            r7 = r0
        L14a:
            if (r7 >= r5) goto L162
            int r8 = r2 << r7
            r8 = r8 & r13
            if (r8 == 0) goto L15f
            com.github.junrar.unpack.vm.VMPreparedProgram r8 = r3.getPrg()
            int[] r8 = r8.getInitR()
            int r9 = com.github.junrar.unpack.vm.RarVM.ReadData(r14)
            r8[r7] = r9
        L15f:
            int r7 = r7 + 1
            goto L14a
        L162:
            r13 = 8
            if (r1 == 0) goto L196
            int r1 = com.github.junrar.unpack.vm.RarVM.ReadData(r14)
            r7 = 65536(0x10000, float:9.1835E-41)
            if (r1 >= r7) goto L195
            if (r1 != 0) goto L171
            goto L195
        L171:
            byte[] r7 = new byte[r1]
            r8 = r0
        L174:
            if (r8 >= r1) goto L18b
            boolean r9 = r14.Overflow(r6)
            if (r9 == 0) goto L17d
            return r0
        L17d:
            int r9 = r14.fgetbits()
            int r9 = r9 >>> r13
            byte r9 = (byte) r9
            r7[r8] = r9
            r14.faddbits(r13)
            int r8 = r8 + 1
            goto L174
        L18b:
            com.github.junrar.unpack.vm.RarVM r8 = r11.rarVM
            com.github.junrar.unpack.vm.VMPreparedProgram r9 = r4.getPrg()
            r8.prepare(r7, r1, r9)
            goto L196
        L195:
            return r0
        L196:
            com.github.junrar.unpack.vm.VMPreparedProgram r1 = r3.getPrg()
            com.github.junrar.unpack.vm.VMPreparedProgram r7 = r4.getPrg()
            java.util.List r7 = r7.getCmd()
            r1.setAltCmd(r7)
            com.github.junrar.unpack.vm.VMPreparedProgram r1 = r3.getPrg()
            com.github.junrar.unpack.vm.VMPreparedProgram r7 = r4.getPrg()
            int r7 = r7.getCmdCount()
            r1.setCmdCount(r7)
            com.github.junrar.unpack.vm.VMPreparedProgram r1 = r4.getPrg()
            java.util.Vector r1 = r1.getStaticData()
            int r1 = r1.size()
            if (r1 <= 0) goto L1d5
            r7 = 8192(0x2000, float:1.148E-41)
            if (r1 >= r7) goto L1d5
            com.github.junrar.unpack.vm.VMPreparedProgram r1 = r3.getPrg()
            com.github.junrar.unpack.vm.VMPreparedProgram r4 = r4.getPrg()
            java.util.Vector r4 = r4.getStaticData()
            r1.setStaticData(r4)
        L1d5:
            com.github.junrar.unpack.vm.VMPreparedProgram r1 = r3.getPrg()
            java.util.Vector r1 = r1.getGlobalData()
            int r1 = r1.size()
            r4 = 64
            if (r1 >= r4) goto L1fb
            com.github.junrar.unpack.vm.VMPreparedProgram r1 = r3.getPrg()
            java.util.Vector r1 = r1.getGlobalData()
            r1.clear()
            com.github.junrar.unpack.vm.VMPreparedProgram r1 = r3.getPrg()
            java.util.Vector r1 = r1.getGlobalData()
            r1.setSize(r4)
        L1fb:
            com.github.junrar.unpack.vm.VMPreparedProgram r1 = r3.getPrg()
            java.util.Vector r1 = r1.getGlobalData()
            r7 = r0
        L204:
            com.github.junrar.unpack.vm.RarVM r8 = r11.rarVM
            if (r7 >= r5) goto L21a
            int r9 = r7 * 4
            com.github.junrar.unpack.vm.VMPreparedProgram r10 = r3.getPrg()
            int[] r10 = r10.getInitR()
            r10 = r10[r7]
            r8.setLowEndianValue(r1, r9, r10)
            int r7 = r7 + 1
            goto L204
        L21a:
            r5 = 28
            int r7 = r3.getBlockLength()
            r8.setLowEndianValue(r1, r5, r7)
            com.github.junrar.unpack.vm.RarVM r5 = r11.rarVM
            r7 = 32
            r5.setLowEndianValue(r1, r7, r0)
            com.github.junrar.unpack.vm.RarVM r5 = r11.rarVM
            r7 = 36
            r5.setLowEndianValue(r1, r7, r0)
            com.github.junrar.unpack.vm.RarVM r5 = r11.rarVM
            r7 = 40
            r5.setLowEndianValue(r1, r7, r0)
            com.github.junrar.unpack.vm.RarVM r11 = r11.rarVM
            r5 = 44
            int r7 = r3.getExecCount()
            r11.setLowEndianValue(r1, r5, r7)
            r11 = r0
        L244:
            r5 = 16
            if (r11 >= r5) goto L254
            int r5 = r11 + 48
            java.lang.Byte r7 = java.lang.Byte.valueOf(r0)
            r1.set(r5, r7)
            int r11 = r11 + 1
            goto L244
        L254:
            r11 = r12 & 8
            if (r11 == 0) goto L2ab
            boolean r11 = r14.Overflow(r6)
            if (r11 == 0) goto L25f
            return r0
        L25f:
            int r11 = com.github.junrar.unpack.vm.RarVM.ReadData(r14)
            r12 = 8128(0x1fc0, float:1.139E-41)
            if (r11 <= r12) goto L268
            return r0
        L268:
            com.github.junrar.unpack.vm.VMPreparedProgram r12 = r3.getPrg()
            java.util.Vector r12 = r12.getGlobalData()
            int r12 = r12.size()
            int r1 = r11 + 64
            if (r12 >= r1) goto L284
            com.github.junrar.unpack.vm.VMPreparedProgram r5 = r3.getPrg()
            java.util.Vector r5 = r5.getGlobalData()
            int r1 = r1 - r12
            r5.setSize(r1)
        L284:
            com.github.junrar.unpack.vm.VMPreparedProgram r12 = r3.getPrg()
            java.util.Vector r12 = r12.getGlobalData()
            r1 = r0
        L28d:
            if (r1 >= r11) goto L2ab
            boolean r3 = r14.Overflow(r6)
            if (r3 == 0) goto L296
            return r0
        L296:
            int r3 = r4 + r1
            int r5 = r14.fgetbits()
            int r5 = r5 >>> r13
            byte r5 = (byte) r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r12.set(r3, r5)
            r14.faddbits(r13)
            int r1 = r1 + 1
            goto L28d
        L2ab:
            return r2
        L2ac:
            return r0
    }

    private void copyString(int r6, int r7) {
            r5 = this;
            int r0 = r5.unpPtr
            int r1 = r0 - r7
            r2 = 1
            if (r1 < 0) goto L43
            r3 = 4194044(0x3ffefc, float:5.877107E-39)
            if (r1 >= r3) goto L43
            if (r0 >= r3) goto L43
            if (r7 != r2) goto L1f
            byte[] r7 = r5.window
            int r2 = r0 + r6
            r1 = r7[r1]
            java.util.Arrays.fill(r7, r0, r2, r1)
            int r7 = r5.unpPtr
            int r7 = r7 + r6
            r5.unpPtr = r7
            return
        L1f:
            int r7 = r1 + r6
            if (r7 > r0) goto L2e
            byte[] r7 = r5.window
            java.lang.System.arraycopy(r7, r1, r7, r0, r6)
            int r7 = r5.unpPtr
            int r7 = r7 + r6
            r5.unpPtr = r7
            return
        L2e:
            byte[] r7 = r5.window
            int r0 = r5.unpPtr
            int r2 = r0 + 1
            r5.unpPtr = r2
            int r2 = r1 + 1
            r1 = r7[r1]
            r7[r0] = r1
            int r6 = r6 + (-1)
            if (r6 > 0) goto L41
            goto L5d
        L41:
            r1 = r2
            goto L2e
        L43:
            int r7 = r6 + (-1)
            if (r6 == 0) goto L5d
            byte[] r6 = r5.window
            int r0 = r5.unpPtr
            int r3 = r1 + 1
            r4 = 4194303(0x3fffff, float:5.87747E-39)
            r1 = r1 & r4
            r1 = r6[r1]
            r6[r0] = r1
            int r0 = r0 + r2
            r6 = r0 & r4
            r5.unpPtr = r6
            r6 = r7
            r1 = r3
            goto L43
        L5d:
            return
    }

    private void initFilters() {
            r1 = this;
            java.util.List<java.lang.Integer> r0 = r1.oldFilterLengths
            r0.clear()
            r0 = 0
            r1.lastFilter = r0
            java.util.List<com.github.junrar.unpack.UnpackFilter> r0 = r1.filters
            r0.clear()
            java.util.List<com.github.junrar.unpack.UnpackFilter> r1 = r1.prgStack
            r1.clear()
            return
    }

    private void insertLastMatch(int r1, int r2) {
            r0 = this;
            r0.lastDist = r2
            r0.lastLength = r1
            return
    }

    private void insertOldDist(int r4) {
            r3 = this;
            int[] r3 = r3.oldDist
            r0 = 2
            r1 = r3[r0]
            r2 = 3
            r3[r2] = r1
            r1 = 1
            r2 = r3[r1]
            r3[r0] = r2
            r0 = 0
            r2 = r3[r0]
            r3[r1] = r2
            r3[r0] = r4
            return
    }

    private boolean readEndOfBlock() {
            r5 = this;
            int r0 = r5.getbits()
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L12
            r5.addbits(r2)
            r0 = r2
            r1 = r3
            goto L1e
        L12:
            r0 = r0 & 16384(0x4000, float:2.2959E-41)
            if (r0 == 0) goto L18
            r0 = r2
            goto L19
        L18:
            r0 = r3
        L19:
            r1 = 2
            r5.addbits(r1)
            r1 = r2
        L1e:
            r4 = r0 ^ 1
            r5.tablesRead = r4
            if (r1 != 0) goto L2d
            if (r0 == 0) goto L2c
            boolean r5 = r5.readTables()
            if (r5 == 0) goto L2d
        L2c:
            return r2
        L2d:
            return r3
    }

    private boolean readTables() {
            r13 = this;
            r0 = 20
            byte[] r1 = new byte[r0]
            r2 = 404(0x194, float:5.66E-43)
            byte[] r3 = new byte[r2]
            int r4 = r13.inAddr
            int r5 = r13.readTop
            int r5 = r5 + (-25)
            r6 = 0
            if (r4 <= r5) goto L18
            boolean r4 = r13.unpReadBuf()
            if (r4 != 0) goto L18
            return r6
        L18:
            int r4 = r13.inBit
            int r4 = 8 - r4
            r5 = 7
            r4 = r4 & r5
            r13.faddbits(r4)
            int r4 = r13.fgetbits()
            long r7 = (long) r4
            r9 = 32768(0x8000, double:1.61895E-319)
            long r9 = r9 & r7
            r11 = 0
            int r4 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r4 == 0) goto L3d
            com.github.junrar.unpack.ppm.BlockTypes r0 = com.github.junrar.unpack.ppm.BlockTypes.BLOCK_PPM
            r13.unpBlockType = r0
            com.github.junrar.unpack.ppm.ModelPPM r0 = r13.ppm
            int r1 = r13.ppmEscChar
            boolean r13 = r0.decodeInit(r13, r1)
            return r13
        L3d:
            com.github.junrar.unpack.ppm.BlockTypes r4 = com.github.junrar.unpack.ppm.BlockTypes.BLOCK_LZ
            r13.unpBlockType = r4
            r13.prevLowDist = r6
            r13.lowDistRepCount = r6
            r9 = 16384(0x4000, double:8.095E-320)
            long r7 = r7 & r9
            int r4 = (r7 > r11 ? 1 : (r7 == r11 ? 0 : -1))
            if (r4 != 0) goto L51
            byte[] r4 = r13.unpOldTable
            java.util.Arrays.fill(r4, r6)
        L51:
            r4 = 2
            r13.faddbits(r4)
            r4 = r6
        L56:
            r7 = 15
            r8 = 1
            if (r4 >= r0) goto L90
            int r9 = r13.fgetbits()
            int r9 = r9 >>> 12
            r9 = r9 & 255(0xff, float:3.57E-43)
            r10 = 4
            r13.faddbits(r10)
            if (r9 != r7) goto L8b
            int r9 = r13.fgetbits()
            int r9 = r9 >>> 12
            r9 = r9 & 255(0xff, float:3.57E-43)
            r13.faddbits(r10)
            if (r9 != 0) goto L79
            r1[r4] = r7
            goto L8e
        L79:
            int r9 = r9 + 2
        L7b:
            int r7 = r9 + (-1)
            if (r9 <= 0) goto L88
            if (r4 >= r0) goto L88
            int r9 = r4 + 1
            r1[r4] = r6
            r4 = r9
            r9 = r7
            goto L7b
        L88:
            int r4 = r4 + (-1)
            goto L8e
        L8b:
            byte r7 = (byte) r9
            r1[r4] = r7
        L8e:
            int r4 = r4 + r8
            goto L56
        L90:
            com.github.junrar.unpack.decode.BitDecode r4 = r13.BD
            r13.makeDecodeTables(r1, r6, r4, r0)
            r0 = r6
        L96:
            if (r0 >= r2) goto L10f
            int r1 = r13.inAddr
            int r4 = r13.readTop
            int r4 = r4 + (-5)
            if (r1 <= r4) goto La7
            boolean r1 = r13.unpReadBuf()
            if (r1 != 0) goto La7
            return r6
        La7:
            com.github.junrar.unpack.decode.BitDecode r1 = r13.BD
            int r1 = r13.decodeNumber(r1)
            r4 = 16
            if (r1 >= r4) goto Lbd
            byte[] r4 = r13.unpOldTable
            r4 = r4[r0]
            int r1 = r1 + r4
            r1 = r1 & r7
            byte r1 = (byte) r1
            r3[r0] = r1
            int r0 = r0 + 1
            goto L96
        Lbd:
            r9 = 18
            r10 = 3
            if (r1 >= r9) goto Lea
            if (r1 != r4) goto Lcf
            int r1 = r13.fgetbits()
            int r1 = r1 >>> 13
            int r1 = r1 + r10
            r13.faddbits(r10)
            goto Lda
        Lcf:
            int r1 = r13.fgetbits()
            int r1 = r1 >>> 9
            int r1 = r1 + 11
            r13.faddbits(r5)
        Lda:
            int r4 = r1 + (-1)
            if (r1 <= 0) goto L96
            if (r0 >= r2) goto L96
            int r1 = r0 + (-1)
            r1 = r3[r1]
            r3[r0] = r1
            int r0 = r0 + 1
            r1 = r4
            goto Lda
        Lea:
            if (r1 != r9) goto Lf7
            int r1 = r13.fgetbits()
            int r1 = r1 >>> 13
            int r1 = r1 + r10
            r13.faddbits(r10)
            goto L102
        Lf7:
            int r1 = r13.fgetbits()
            int r1 = r1 >>> 9
            int r1 = r1 + 11
            r13.faddbits(r5)
        L102:
            int r4 = r1 + (-1)
            if (r1 <= 0) goto L96
            if (r0 >= r2) goto L96
            int r1 = r0 + 1
            r3[r0] = r6
            r0 = r1
            r1 = r4
            goto L102
        L10f:
            r13.tablesRead = r8
            int r0 = r13.inAddr
            int r1 = r13.readTop
            if (r0 <= r1) goto L118
            return r6
        L118:
            com.github.junrar.unpack.decode.LitDecode r0 = r13.LD
            r1 = 299(0x12b, float:4.19E-43)
            r13.makeDecodeTables(r3, r6, r0, r1)
            com.github.junrar.unpack.decode.DistDecode r0 = r13.DD
            r2 = 60
            r13.makeDecodeTables(r3, r1, r0, r2)
            com.github.junrar.unpack.decode.LowDistDecode r0 = r13.LDD
            r1 = 17
            r2 = 359(0x167, float:5.03E-43)
            r13.makeDecodeTables(r3, r2, r0, r1)
            com.github.junrar.unpack.decode.RepDecode r0 = r13.RD
            r1 = 28
            r2 = 376(0x178, float:5.27E-43)
            r13.makeDecodeTables(r3, r2, r0, r1)
            byte[] r13 = r13.unpOldTable
            int r0 = r13.length
            java.lang.System.arraycopy(r3, r6, r13, r6, r0)
            return r8
    }

    private boolean readVMCode() {
            r8 = this;
            int r0 = r8.getbits()
            r1 = 8
            int r0 = r0 >>> r1
            r8.addbits(r1)
            r2 = r0 & 7
            int r2 = r2 + 1
            r3 = 7
            if (r2 != r3) goto L1b
            int r2 = r8.getbits()
            int r2 = r2 >>> r1
            int r2 = r2 + r3
            r8.addbits(r1)
            goto L26
        L1b:
            if (r2 != r1) goto L26
            int r2 = r8.getbits()
            r3 = 16
            r8.addbits(r3)
        L26:
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            r4 = 0
            r5 = r4
        L2d:
            if (r5 >= r2) goto L55
            int r6 = r8.inAddr
            int r7 = r8.readTop
            int r7 = r7 + (-1)
            if (r6 < r7) goto L42
            boolean r6 = r8.unpReadBuf()
            if (r6 != 0) goto L42
            int r6 = r2 + (-1)
            if (r5 >= r6) goto L42
            return r4
        L42:
            int r6 = r8.getbits()
            int r6 = r6 >>> r1
            byte r6 = (byte) r6
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            r3.add(r6)
            r8.addbits(r1)
            int r5 = r5 + 1
            goto L2d
        L55:
            boolean r8 = r8.addVMCode(r0, r3, r2)
            return r8
    }

    private boolean readVMCodePPM() {
            r7 = this;
            com.github.junrar.unpack.ppm.ModelPPM r0 = r7.ppm
            int r0 = r0.decodeChar()
            r1 = 0
            r2 = -1
            if (r0 != r2) goto Lb
            return r1
        Lb:
            r3 = r0 & 7
            int r3 = r3 + 1
            r4 = 7
            if (r3 != r4) goto L1d
            com.github.junrar.unpack.ppm.ModelPPM r3 = r7.ppm
            int r3 = r3.decodeChar()
            if (r3 != r2) goto L1b
            return r1
        L1b:
            int r3 = r3 + r4
            goto L36
        L1d:
            r4 = 8
            if (r3 != r4) goto L36
            com.github.junrar.unpack.ppm.ModelPPM r3 = r7.ppm
            int r3 = r3.decodeChar()
            if (r3 != r2) goto L2a
            return r1
        L2a:
            com.github.junrar.unpack.ppm.ModelPPM r4 = r7.ppm
            int r4 = r4.decodeChar()
            if (r4 != r2) goto L33
            return r1
        L33:
            int r3 = r3 * 256
            int r3 = r3 + r4
        L36:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = r1
        L3c:
            if (r5 >= r3) goto L52
            com.github.junrar.unpack.ppm.ModelPPM r6 = r7.ppm
            int r6 = r6.decodeChar()
            if (r6 != r2) goto L47
            return r1
        L47:
            byte r6 = (byte) r6
            java.lang.Byte r6 = java.lang.Byte.valueOf(r6)
            r4.add(r6)
            int r5 = r5 + 1
            goto L3c
        L52:
            boolean r7 = r7.addVMCode(r0, r4, r3)
            return r7
    }

    private void unpack29(boolean r12) {
            r11 = this;
            r0 = 60
            int[] r1 = new int[r0]
            byte[] r0 = new byte[r0]
            r2 = 1
            r3 = r1[r2]
            r4 = 0
            if (r3 != 0) goto L2c
            r3 = r4
            r5 = r3
            r6 = r5
            r7 = r6
        L10:
            int[] r8 = com.github.junrar.unpack.Unpack.DBitLengthCounts
            int r9 = r8.length
            if (r3 >= r9) goto L2c
            r8 = r8[r3]
            r9 = r4
        L18:
            if (r9 >= r8) goto L27
            r1[r7] = r5
            byte r10 = (byte) r6
            r0[r7] = r10
            int r9 = r9 + 1
            int r7 = r7 + 1
            int r10 = r2 << r6
            int r5 = r5 + r10
            goto L18
        L27:
            int r3 = r3 + 1
            int r6 = r6 + 1
            goto L10
        L2c:
            r11.fileExtracted = r2
            boolean r3 = r11.suspended
            if (r3 != 0) goto L49
            r11.unpInitData(r12)
            boolean r3 = r11.unpReadBuf()
            if (r3 != 0) goto L3c
            goto L7c
        L3c:
            if (r12 == 0) goto L42
            boolean r12 = r11.tablesRead
            if (r12 != 0) goto L49
        L42:
            boolean r12 = r11.readTables()
            if (r12 != 0) goto L49
            goto L7c
        L49:
            boolean r12 = r11.ppmError
            if (r12 == 0) goto L4e
            goto L7c
        L4e:
            int r12 = r11.unpPtr
            r3 = 4194303(0x3fffff, float:5.87747E-39)
            r12 = r12 & r3
            r11.unpPtr = r12
            int r12 = r11.inAddr
            int r5 = r11.readBorder
            if (r12 <= r5) goto L64
            boolean r12 = r11.unpReadBuf()
            if (r12 != 0) goto L64
            goto L1bd
        L64:
            int r12 = r11.wrPtr
            int r5 = r11.unpPtr
            int r6 = r12 - r5
            r3 = r3 & r6
            r6 = 260(0x104, float:3.64E-43)
            if (r3 >= r6) goto L84
            if (r12 == r5) goto L84
            r11.UnpWriteBuf()
            long r5 = r11.writtenFileSize
            long r7 = r11.destUnpSize
            int r12 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r12 <= 0) goto L7d
        L7c:
            return
        L7d:
            boolean r12 = r11.suspended
            if (r12 == 0) goto L84
            r11.fileExtracted = r4
            return
        L84:
            com.github.junrar.unpack.ppm.BlockTypes r12 = r11.unpBlockType
            com.github.junrar.unpack.ppm.BlockTypes r3 = com.github.junrar.unpack.ppm.BlockTypes.BLOCK_PPM
            r5 = 3
            r6 = 4
            r7 = 2
            if (r12 != r3) goto L10d
            com.github.junrar.unpack.ppm.ModelPPM r12 = r11.ppm
            int r12 = r12.decodeChar()
            r3 = -1
            if (r12 != r3) goto L9a
            r11.ppmError = r2
            goto L1bd
        L9a:
            int r8 = r11.ppmEscChar
            if (r12 != r8) goto L100
            com.github.junrar.unpack.ppm.ModelPPM r8 = r11.ppm
            int r8 = r8.decodeChar()
            if (r8 != 0) goto Lae
            boolean r12 = r11.readTables()
            if (r12 != 0) goto L4e
            goto L1bd
        Lae:
            if (r8 == r7) goto L1bd
            if (r8 != r3) goto Lb4
            goto L1bd
        Lb4:
            if (r8 != r5) goto Lbe
            boolean r12 = r11.readVMCodePPM()
            if (r12 != 0) goto L4e
            goto L1bd
        Lbe:
            if (r8 != r6) goto Lec
            r12 = r4
            r7 = r12
            r8 = r7
            r9 = r8
        Lc4:
            if (r12 >= r6) goto Ldf
            if (r7 != 0) goto Ldf
            com.github.junrar.unpack.ppm.ModelPPM r10 = r11.ppm
            int r10 = r10.decodeChar()
            if (r10 != r3) goto Ld2
            r7 = r2
            goto Ldc
        Ld2:
            if (r12 != r5) goto Ld7
            r9 = r10 & 255(0xff, float:3.57E-43)
            goto Ldc
        Ld7:
            int r8 = r8 << 8
            r10 = r10 & 255(0xff, float:3.57E-43)
            int r8 = r8 + r10
        Ldc:
            int r12 = r12 + 1
            goto Lc4
        Ldf:
            if (r7 == 0) goto Le3
            goto L1bd
        Le3:
            int r9 = r9 + 32
            int r8 = r8 + 2
            r11.copyString(r9, r8)
            goto L4e
        Lec:
            r5 = 5
            if (r8 != r5) goto L100
            com.github.junrar.unpack.ppm.ModelPPM r12 = r11.ppm
            int r12 = r12.decodeChar()
            if (r12 != r3) goto Lf9
            goto L1bd
        Lf9:
            int r12 = r12 + 4
            r11.copyString(r12, r2)
            goto L4e
        L100:
            byte[] r3 = r11.window
            int r5 = r11.unpPtr
            int r6 = r5 + 1
            r11.unpPtr = r6
            byte r12 = (byte) r12
            r3[r5] = r12
            goto L4e
        L10d:
            com.github.junrar.unpack.decode.LitDecode r12 = r11.LD
            int r12 = r11.decodeNumber(r12)
            r3 = 256(0x100, float:3.59E-43)
            if (r12 >= r3) goto L124
            byte[] r3 = r11.window
            int r5 = r11.unpPtr
            int r6 = r5 + 1
            r11.unpPtr = r6
            byte r12 = (byte) r12
            r3[r5] = r12
            goto L4e
        L124:
            r8 = 271(0x10f, float:3.8E-43)
            if (r12 < r8) goto L1aa
            int[] r3 = com.github.junrar.unpack.Unpack20.LDecode
            int r12 = r12 + (-271)
            r3 = r3[r12]
            int r3 = r3 + r5
            byte[] r5 = com.github.junrar.unpack.Unpack20.LBits
            r12 = r5[r12]
            if (r12 <= 0) goto L140
            int r5 = r11.getbits()
            int r7 = 16 - r12
            int r5 = r5 >>> r7
            int r3 = r3 + r5
            r11.addbits(r12)
        L140:
            com.github.junrar.unpack.decode.DistDecode r12 = r11.DD
            int r12 = r11.decodeNumber(r12)
            r5 = r1[r12]
            int r5 = r5 + r2
            r7 = r0[r12]
            if (r7 <= 0) goto L18d
            r8 = 9
            if (r12 <= r8) goto L182
            if (r7 <= r6) goto L161
            int r12 = r11.getbits()
            int r8 = 20 - r7
            int r12 = r12 >>> r8
            int r12 = r12 << r6
            int r5 = r5 + r12
            int r7 = r7 + (-4)
            r11.addbits(r7)
        L161:
            int r12 = r11.lowDistRepCount
            if (r12 <= 0) goto L16d
            int r12 = r12 + (-1)
            r11.lowDistRepCount = r12
            int r12 = r11.prevLowDist
        L16b:
            int r5 = r5 + r12
            goto L18d
        L16d:
            com.github.junrar.unpack.decode.LowDistDecode r12 = r11.LDD
            int r12 = r11.decodeNumber(r12)
            r6 = 16
            if (r12 != r6) goto L17e
            r12 = 15
            r11.lowDistRepCount = r12
            int r12 = r11.prevLowDist
            goto L16b
        L17e:
            int r5 = r5 + r12
            r11.prevLowDist = r12
            goto L18d
        L182:
            int r12 = r11.getbits()
            int r6 = 16 - r7
            int r12 = r12 >>> r6
            int r5 = r5 + r12
            r11.addbits(r7)
        L18d:
            r12 = 8192(0x2000, float:1.148E-41)
            if (r5 < r12) goto L19f
            int r12 = r3 + 1
            long r6 = (long) r5
            r8 = 262144(0x40000, double:1.295163E-318)
            int r6 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r6 < 0) goto L19e
            int r3 = r3 + 2
            goto L19f
        L19e:
            r3 = r12
        L19f:
            r11.insertOldDist(r5)
            r11.insertLastMatch(r3, r5)
            r11.copyString(r3, r5)
            goto L4e
        L1aa:
            if (r12 != r3) goto L1b3
            boolean r12 = r11.readEndOfBlock()
            if (r12 != 0) goto L4e
            goto L1bd
        L1b3:
            r3 = 257(0x101, float:3.6E-43)
            if (r12 != r3) goto L1c1
            boolean r12 = r11.readVMCode()
            if (r12 != 0) goto L4e
        L1bd:
            r11.UnpWriteBuf()
            return
        L1c1:
            r3 = 258(0x102, float:3.62E-43)
            if (r12 != r3) goto L1d0
            int r12 = r11.lastLength
            if (r12 == 0) goto L4e
            int r3 = r11.lastDist
            r11.copyString(r12, r3)
            goto L4e
        L1d0:
            r3 = 263(0x107, float:3.69E-43)
            if (r12 >= r3) goto L205
            int r12 = r12 + (-259)
            int[] r3 = r11.oldDist
            r5 = r3[r12]
            java.lang.System.arraycopy(r3, r4, r3, r2, r12)
            int[] r12 = r11.oldDist
            r12[r4] = r5
            com.github.junrar.unpack.decode.RepDecode r12 = r11.RD
            int r12 = r11.decodeNumber(r12)
            int[] r3 = com.github.junrar.unpack.Unpack20.LDecode
            r3 = r3[r12]
            int r3 = r3 + r7
            byte[] r6 = com.github.junrar.unpack.Unpack20.LBits
            r12 = r6[r12]
            if (r12 <= 0) goto L1fd
            int r6 = r11.getbits()
            int r7 = 16 - r12
            int r6 = r6 >>> r7
            int r3 = r3 + r6
            r11.addbits(r12)
        L1fd:
            r11.insertLastMatch(r3, r5)
            r11.copyString(r3, r5)
            goto L4e
        L205:
            r3 = 272(0x110, float:3.81E-43)
            if (r12 >= r3) goto L4e
            int[] r3 = com.github.junrar.unpack.Unpack20.SDDecode
            int r12 = r12 + (-263)
            r3 = r3[r12]
            int r3 = r3 + r2
            int[] r5 = com.github.junrar.unpack.Unpack20.SDBits
            r12 = r5[r12]
            if (r12 <= 0) goto L221
            int r5 = r11.getbits()
            int r6 = 16 - r12
            int r5 = r5 >>> r6
            int r3 = r3 + r5
            r11.addbits(r12)
        L221:
            r11.insertOldDist(r3)
            r11.insertLastMatch(r7, r3)
            r11.copyString(r7, r3)
            goto L4e
    }

    private void unstoreFile() {
            r8 = this;
            r0 = 65536(0x10000, float:9.1835E-41)
            byte[] r0 = new byte[r0]
        L4:
            com.github.junrar.unpack.ComprDataIO r1 = r8.unpIO
            r2 = 65536(0x10000, double:3.2379E-319)
            long r4 = r8.destUnpSize
            long r2 = java.lang.Math.min(r2, r4)
            int r2 = (int) r2
            r3 = 0
            int r1 = r1.unpRead(r0, r3, r2)
            if (r1 == 0) goto L36
            r2 = -1
            if (r1 != r2) goto L1b
            goto L36
        L1b:
            long r4 = (long) r1
            long r6 = r8.destUnpSize
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 >= 0) goto L23
            goto L24
        L23:
            int r1 = (int) r6
        L24:
            com.github.junrar.unpack.ComprDataIO r2 = r8.unpIO
            r2.unpWrite(r0, r3, r1)
            long r2 = r8.destUnpSize
            r4 = 0
            int r4 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r4 < 0) goto L4
            long r4 = (long) r1
            long r2 = r2 - r4
            r8.destUnpSize = r2
            goto L4
        L36:
            return
    }

    public void cleanUp() {
            r0 = this;
            com.github.junrar.unpack.ppm.ModelPPM r0 = r0.ppm
            if (r0 == 0) goto Ld
            com.github.junrar.unpack.ppm.SubAllocator r0 = r0.getSubAlloc()
            if (r0 == 0) goto Ld
            r0.stopSubAllocator()
        Ld:
            return
    }

    public void doUnpack(int r3, boolean r4) {
            r2 = this;
            com.github.junrar.unpack.ComprDataIO r0 = r2.unpIO
            com.github.junrar.rarfile.FileHeader r0 = r0.getSubHeader()
            byte r0 = r0.getUnpMethod()
            r1 = 48
            if (r0 != r1) goto L11
            r2.unstoreFile()
        L11:
            r0 = 15
            if (r3 == r0) goto L2e
            r0 = 20
            if (r3 == r0) goto L2a
            r0 = 26
            if (r3 == r0) goto L2a
            r0 = 29
            if (r3 == r0) goto L26
            r0 = 36
            if (r3 == r0) goto L26
            return
        L26:
            r2.unpack29(r4)
            return
        L2a:
            r2.unpack20(r4)
            return
        L2e:
            r2.unpack15(r4)
            return
    }

    public int getChar() {
            r3 = this;
            int r0 = r3.inAddr
            r1 = 32738(0x7fe2, float:4.5876E-41)
            if (r0 <= r1) goto L9
            r3.unpReadBuf()
        L9:
            byte[] r0 = r3.inBuf
            int r1 = r3.inAddr
            int r2 = r1 + 1
            r3.inAddr = r2
            r3 = r0[r1]
            r3 = r3 & 255(0xff, float:3.57E-43)
            return r3
    }

    public int getPpmEscChar() {
            r0 = this;
            int r0 = r0.ppmEscChar
            return r0
    }

    public void init(byte[] r1) {
            r0 = this;
            if (r1 != 0) goto L9
            r1 = 4194304(0x400000, float:5.877472E-39)
            byte[] r1 = new byte[r1]
            r0.window = r1
            goto Lb
        L9:
            r0.window = r1
        Lb:
            r1 = 0
            r0.inAddr = r1
            r0.unpInitData(r1)
            return
    }

    public boolean isFileExtracted() {
            r0 = this;
            boolean r0 = r0.fileExtracted
            return r0
    }

    public void setDestSize(long r1) {
            r0 = this;
            r0.destUnpSize = r1
            r1 = 0
            r0.fileExtracted = r1
            return
    }

    public void setPpmEscChar(int r1) {
            r0 = this;
            r0.ppmEscChar = r1
            return
    }

    public void setSuspended(boolean r1) {
            r0 = this;
            r0.suspended = r1
            return
    }

    @Override // com.github.junrar.unpack.Unpack15
    public void unpInitData(boolean r4) {
            r3 = this;
            r0 = 0
            if (r4 != 0) goto L1f
            r3.tablesRead = r0
            int[] r1 = r3.oldDist
            java.util.Arrays.fill(r1, r0)
            r3.oldDistPtr = r0
            r3.lastDist = r0
            r3.lastLength = r0
            byte[] r1 = r3.unpOldTable
            java.util.Arrays.fill(r1, r0)
            r3.unpPtr = r0
            r3.wrPtr = r0
            r1 = 2
            r3.ppmEscChar = r1
            r3.initFilters()
        L1f:
            r3.InitBitInput()
            r3.ppmError = r0
            r1 = 0
            r3.writtenFileSize = r1
            r3.readTop = r0
            r3.readBorder = r0
            r3.unpInitData20(r4)
            return
    }
}

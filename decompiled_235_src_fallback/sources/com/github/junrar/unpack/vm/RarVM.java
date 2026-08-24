package com.github.junrar.unpack.vm;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class RarVM extends com.github.junrar.unpack.vm.BitInput {
    private static final long UINT_MASK = -1;
    public static final int VM_FIXEDGLOBALSIZE = 64;
    public static final int VM_GLOBALMEMADDR = 245760;
    public static final int VM_GLOBALMEMSIZE = 8192;
    public static final int VM_MEMMASK = 262143;
    public static final int VM_MEMSIZE = 262144;
    private static final int regCount = 8;
    private int IP;
    private final int[] R;
    private int codeSize;
    private int flags;
    private int maxOpCount;
    private byte[] mem;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: com.github.junrar.unpack.vm.RarVM$1  reason: invalid class name */
    /* loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$github$junrar$unpack$vm$VMCommands = null;
        static final /* synthetic */ int[] $SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters = null;

        static {
                com.github.junrar.unpack.vm.VMStandardFilters[] r0 = com.github.junrar.unpack.vm.VMStandardFilters.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters = r0
                r1 = 1
                com.github.junrar.unpack.vm.VMStandardFilters r2 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_E8     // Catch: java.lang.NoSuchFieldError -> L12
                int r2 = r2.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r0[r2] = r1     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                r0 = 2
                int[] r2 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters     // Catch: java.lang.NoSuchFieldError -> L1d
                com.github.junrar.unpack.vm.VMStandardFilters r3 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_E8E9     // Catch: java.lang.NoSuchFieldError -> L1d
                int r3 = r3.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2[r3] = r0     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                r2 = 3
                int[] r3 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters     // Catch: java.lang.NoSuchFieldError -> L28
                com.github.junrar.unpack.vm.VMStandardFilters r4 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_ITANIUM     // Catch: java.lang.NoSuchFieldError -> L28
                int r4 = r4.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28
                r3[r4] = r2     // Catch: java.lang.NoSuchFieldError -> L28
            L28:
                r3 = 4
                int[] r4 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters     // Catch: java.lang.NoSuchFieldError -> L33
                com.github.junrar.unpack.vm.VMStandardFilters r5 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_DELTA     // Catch: java.lang.NoSuchFieldError -> L33
                int r5 = r5.ordinal()     // Catch: java.lang.NoSuchFieldError -> L33
                r4[r5] = r3     // Catch: java.lang.NoSuchFieldError -> L33
            L33:
                r4 = 5
                int[] r5 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters     // Catch: java.lang.NoSuchFieldError -> L3e
                com.github.junrar.unpack.vm.VMStandardFilters r6 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_RGB     // Catch: java.lang.NoSuchFieldError -> L3e
                int r6 = r6.ordinal()     // Catch: java.lang.NoSuchFieldError -> L3e
                r5[r6] = r4     // Catch: java.lang.NoSuchFieldError -> L3e
            L3e:
                r5 = 6
                int[] r6 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters     // Catch: java.lang.NoSuchFieldError -> L49
                com.github.junrar.unpack.vm.VMStandardFilters r7 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_AUDIO     // Catch: java.lang.NoSuchFieldError -> L49
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L49
                r6[r7] = r5     // Catch: java.lang.NoSuchFieldError -> L49
            L49:
                r6 = 7
                int[] r7 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters     // Catch: java.lang.NoSuchFieldError -> L54
                com.github.junrar.unpack.vm.VMStandardFilters r8 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_UPCASE     // Catch: java.lang.NoSuchFieldError -> L54
                int r8 = r8.ordinal()     // Catch: java.lang.NoSuchFieldError -> L54
                r7[r8] = r6     // Catch: java.lang.NoSuchFieldError -> L54
            L54:
                com.github.junrar.unpack.vm.VMCommands[] r7 = com.github.junrar.unpack.vm.VMCommands.values()
                int r7 = r7.length
                int[] r7 = new int[r7]
                com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands = r7
                com.github.junrar.unpack.vm.VMCommands r8 = com.github.junrar.unpack.vm.VMCommands.VM_MOV     // Catch: java.lang.NoSuchFieldError -> L65
                int r8 = r8.ordinal()     // Catch: java.lang.NoSuchFieldError -> L65
                r7[r8] = r1     // Catch: java.lang.NoSuchFieldError -> L65
            L65:
                int[] r1 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L6f
                com.github.junrar.unpack.vm.VMCommands r7 = com.github.junrar.unpack.vm.VMCommands.VM_MOVB     // Catch: java.lang.NoSuchFieldError -> L6f
                int r7 = r7.ordinal()     // Catch: java.lang.NoSuchFieldError -> L6f
                r1[r7] = r0     // Catch: java.lang.NoSuchFieldError -> L6f
            L6f:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L79
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_MOVD     // Catch: java.lang.NoSuchFieldError -> L79
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L79
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L79
            L79:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L83
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_CMP     // Catch: java.lang.NoSuchFieldError -> L83
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L83
                r0[r1] = r3     // Catch: java.lang.NoSuchFieldError -> L83
            L83:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L8d
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_CMPB     // Catch: java.lang.NoSuchFieldError -> L8d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L8d
                r0[r1] = r4     // Catch: java.lang.NoSuchFieldError -> L8d
            L8d:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L97
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_CMPD     // Catch: java.lang.NoSuchFieldError -> L97
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L97
                r0[r1] = r5     // Catch: java.lang.NoSuchFieldError -> L97
            L97:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> La1
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_ADD     // Catch: java.lang.NoSuchFieldError -> La1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> La1
                r0[r1] = r6     // Catch: java.lang.NoSuchFieldError -> La1
            La1:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> Lad
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_ADDB     // Catch: java.lang.NoSuchFieldError -> Lad
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lad
                r2 = 8
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lad
            Lad:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> Lb9
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_ADDD     // Catch: java.lang.NoSuchFieldError -> Lb9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lb9
                r2 = 9
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lb9
            Lb9:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> Lc5
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_SUB     // Catch: java.lang.NoSuchFieldError -> Lc5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lc5
                r2 = 10
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lc5
            Lc5:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> Ld1
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_SUBB     // Catch: java.lang.NoSuchFieldError -> Ld1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ld1
                r2 = 11
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ld1
            Ld1:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> Ldd
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_SUBD     // Catch: java.lang.NoSuchFieldError -> Ldd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Ldd
                r2 = 12
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Ldd
            Ldd:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> Le9
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_JZ     // Catch: java.lang.NoSuchFieldError -> Le9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Le9
                r2 = 13
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Le9
            Le9:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> Lf5
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_JNZ     // Catch: java.lang.NoSuchFieldError -> Lf5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> Lf5
                r2 = 14
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> Lf5
            Lf5:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L101
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_INC     // Catch: java.lang.NoSuchFieldError -> L101
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L101
                r2 = 15
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L101
            L101:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L10d
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_INCB     // Catch: java.lang.NoSuchFieldError -> L10d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L10d
                r2 = 16
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L10d
            L10d:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L119
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_INCD     // Catch: java.lang.NoSuchFieldError -> L119
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L119
                r2 = 17
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L119
            L119:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L125
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_DEC     // Catch: java.lang.NoSuchFieldError -> L125
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L125
                r2 = 18
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L125
            L125:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L131
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_DECB     // Catch: java.lang.NoSuchFieldError -> L131
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L131
                r2 = 19
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L131
            L131:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L13d
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_DECD     // Catch: java.lang.NoSuchFieldError -> L13d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L13d
                r2 = 20
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L13d
            L13d:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L149
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_JMP     // Catch: java.lang.NoSuchFieldError -> L149
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L149
                r2 = 21
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L149
            L149:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L155
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_XOR     // Catch: java.lang.NoSuchFieldError -> L155
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L155
                r2 = 22
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L155
            L155:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L161
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_AND     // Catch: java.lang.NoSuchFieldError -> L161
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L161
                r2 = 23
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L161
            L161:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L16d
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_OR     // Catch: java.lang.NoSuchFieldError -> L16d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L16d
                r2 = 24
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L16d
            L16d:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L179
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_TEST     // Catch: java.lang.NoSuchFieldError -> L179
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L179
                r2 = 25
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L179
            L179:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L185
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_JS     // Catch: java.lang.NoSuchFieldError -> L185
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L185
                r2 = 26
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L185
            L185:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L191
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_JNS     // Catch: java.lang.NoSuchFieldError -> L191
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L191
                r2 = 27
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L191
            L191:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L19d
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_JB     // Catch: java.lang.NoSuchFieldError -> L19d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L19d
                r2 = 28
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L19d
            L19d:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L1a9
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_JBE     // Catch: java.lang.NoSuchFieldError -> L1a9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1a9
                r2 = 29
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1a9
            L1a9:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L1b5
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_JA     // Catch: java.lang.NoSuchFieldError -> L1b5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1b5
                r2 = 30
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1b5
            L1b5:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L1c1
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_JAE     // Catch: java.lang.NoSuchFieldError -> L1c1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1c1
                r2 = 31
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1c1
            L1c1:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L1cd
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_PUSH     // Catch: java.lang.NoSuchFieldError -> L1cd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1cd
                r2 = 32
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1cd
            L1cd:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L1d9
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_POP     // Catch: java.lang.NoSuchFieldError -> L1d9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d9
                r2 = 33
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d9
            L1d9:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L1e5
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_CALL     // Catch: java.lang.NoSuchFieldError -> L1e5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1e5
                r2 = 34
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1e5
            L1e5:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L1f1
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_NOT     // Catch: java.lang.NoSuchFieldError -> L1f1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1f1
                r2 = 35
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1f1
            L1f1:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L1fd
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_SHL     // Catch: java.lang.NoSuchFieldError -> L1fd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1fd
                r2 = 36
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1fd
            L1fd:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L209
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_SHR     // Catch: java.lang.NoSuchFieldError -> L209
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L209
                r2 = 37
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L209
            L209:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L215
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_SAR     // Catch: java.lang.NoSuchFieldError -> L215
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L215
                r2 = 38
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L215
            L215:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L221
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_NEG     // Catch: java.lang.NoSuchFieldError -> L221
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L221
                r2 = 39
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L221
            L221:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L22d
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_NEGB     // Catch: java.lang.NoSuchFieldError -> L22d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L22d
                r2 = 40
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L22d
            L22d:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L239
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_NEGD     // Catch: java.lang.NoSuchFieldError -> L239
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L239
                r2 = 41
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L239
            L239:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L245
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_PUSHA     // Catch: java.lang.NoSuchFieldError -> L245
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L245
                r2 = 42
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L245
            L245:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L251
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_POPA     // Catch: java.lang.NoSuchFieldError -> L251
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L251
                r2 = 43
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L251
            L251:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L25d
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_PUSHF     // Catch: java.lang.NoSuchFieldError -> L25d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L25d
                r2 = 44
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L25d
            L25d:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L269
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_POPF     // Catch: java.lang.NoSuchFieldError -> L269
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L269
                r2 = 45
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L269
            L269:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L275
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_MOVZX     // Catch: java.lang.NoSuchFieldError -> L275
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L275
                r2 = 46
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L275
            L275:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L281
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_MOVSX     // Catch: java.lang.NoSuchFieldError -> L281
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L281
                r2 = 47
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L281
            L281:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L28d
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_XCHG     // Catch: java.lang.NoSuchFieldError -> L28d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L28d
                r2 = 48
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L28d
            L28d:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L299
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_MUL     // Catch: java.lang.NoSuchFieldError -> L299
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L299
                r2 = 49
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L299
            L299:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L2a5
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_DIV     // Catch: java.lang.NoSuchFieldError -> L2a5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2a5
                r2 = 50
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2a5
            L2a5:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L2b1
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_ADC     // Catch: java.lang.NoSuchFieldError -> L2b1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2b1
                r2 = 51
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2b1
            L2b1:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L2bd
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_SBB     // Catch: java.lang.NoSuchFieldError -> L2bd
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2bd
                r2 = 52
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2bd
            L2bd:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L2c9
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_RET     // Catch: java.lang.NoSuchFieldError -> L2c9
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2c9
                r2 = 53
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2c9
            L2c9:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L2d5
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_STANDARD     // Catch: java.lang.NoSuchFieldError -> L2d5
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2d5
                r2 = 54
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2d5
            L2d5:
                int[] r0 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands     // Catch: java.lang.NoSuchFieldError -> L2e1
                com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_PRINT     // Catch: java.lang.NoSuchFieldError -> L2e1
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L2e1
                r2 = 55
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L2e1
            L2e1:
                return
        }
    }

    public RarVM() {
            r1 = this;
            r1.<init>()
            r0 = 8
            int[] r0 = new int[r0]
            r1.R = r0
            r0 = 25000000(0x17d7840, float:4.6555036E-38)
            r1.maxOpCount = r0
            r0 = 0
            r1.mem = r0
            return
    }

    private boolean ExecuteCode(java.util.List<com.github.junrar.unpack.vm.VMPreparedCommand> r19, int r20) {
            r18 = this;
            r0 = r18
            r1 = 25000000(0x17d7840, float:4.6555036E-38)
            r0.maxOpCount = r1
            r1 = r20
            r0.codeSize = r1
            r1 = 0
            r0.IP = r1
        Le:
            int r2 = r0.IP
            r3 = r19
            java.lang.Object r2 = r3.get(r2)
            com.github.junrar.unpack.vm.VMPreparedCommand r2 = (com.github.junrar.unpack.vm.VMPreparedCommand) r2
            com.github.junrar.unpack.vm.VMPreparedOperand r4 = r2.getOp1()
            int r4 = r0.getOperand(r4)
            com.github.junrar.unpack.vm.VMPreparedOperand r5 = r2.getOp2()
            int r5 = r0.getOperand(r5)
            int[] r6 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands
            com.github.junrar.unpack.vm.VMCommands r7 = r2.getOpCode()
            int r7 = r7.ordinal()
            r6 = r6[r7]
            r7 = 8
            r8 = 0
            r12 = 262143(0x3ffff, float:3.6734E-40)
            r13 = -1
            r15 = 7
            r16 = -2
            r10 = 1
            switch(r6) {
                case 1: goto L70b;
                case 2: goto L701;
                case 3: goto L6f7;
                case 4: goto L6c8;
                case 5: goto L6a1;
                case 6: goto L678;
                case 7: goto L61a;
                case 8: goto L603;
                case 9: goto L5ec;
                case 10: goto L5b2;
                case 11: goto L59b;
                case 12: goto L584;
                case 13: goto L56e;
                case 14: goto L558;
                case 15: goto L529;
                case 16: goto L51e;
                case 17: goto L513;
                case 18: goto L4e8;
                case 19: goto L4d9;
                case 20: goto L4ca;
                case 21: goto L4bf;
                case 22: goto L48d;
                case 23: goto L45b;
                case 24: goto L429;
                case 25: goto L400;
                case 26: goto L3ea;
                case 27: goto L3d4;
                case 28: goto L3be;
                case 29: goto L3a1;
                case 30: goto L384;
                case 31: goto L36e;
                case 32: goto L35a;
                case 33: goto L342;
                case 34: goto L326;
                case 35: goto L310;
                case 36: goto L2cb;
                case 37: goto L28c;
                case 38: goto L24d;
                case 39: goto L21e;
                case 40: goto L212;
                case 41: goto L206;
                case 42: goto L1e3;
                case 43: goto L1c9;
                case 44: goto L1b7;
                case 45: goto L1a0;
                case 46: goto L195;
                case 47: goto L189;
                case 48: goto L161;
                case 49: goto L13c;
                case 50: goto L11a;
                case 51: goto Lc7;
                case 52: goto L73;
                case 53: goto L57;
                case 54: goto L46;
                default: goto L44;
            }
        L44:
            goto L71e
        L46:
            com.github.junrar.unpack.vm.VMPreparedOperand r2 = r2.getOp1()
            int r2 = r2.getData()
            com.github.junrar.unpack.vm.VMStandardFilters r2 = com.github.junrar.unpack.vm.VMStandardFilters.findFilter(r2)
            r0.ExecuteStandardFilter(r2)
            goto L71e
        L57:
            int[] r2 = r0.R
            r2 = r2[r15]
            r4 = 262144(0x40000, float:3.67342E-40)
            if (r2 < r4) goto L60
            return r10
        L60:
            byte[] r4 = r0.mem
            r2 = r2 & r12
            int r2 = r0.getValue(r1, r4, r2)
            r0.setIP(r2)
            int[] r2 = r0.R
            r4 = r2[r15]
            int r4 = r4 + 4
            r2[r15] = r4
            goto Le
        L73:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            int r7 = r0.flags
            com.github.junrar.unpack.vm.VMFlags r8 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            int r8 = r8.getFlag()
            r7 = r7 & r8
            long r8 = (long) r6
            boolean r11 = r2.isByteMode()
            byte[] r12 = r0.mem
            int r5 = r0.getValue(r11, r12, r5)
            long r11 = (long) r5
            long r11 = r13 - r11
            long r8 = r8 & r11
            long r11 = (long) r7
            long r13 = r13 - r11
            long r8 = r8 & r13
            int r5 = (int) r8
            boolean r8 = r2.isByteMode()
            if (r8 == 0) goto La1
            r5 = r5 & 255(0xff, float:3.57E-43)
        La1:
            if (r5 > r6) goto Lb9
            if (r5 != r6) goto La8
            if (r7 == 0) goto La8
            goto Lb9
        La8:
            if (r5 != 0) goto Lb1
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r6 = r6.getFlag()
            goto Lba
        Lb1:
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r6 = r6.getFlag()
            r6 = r6 & r5
            goto Lba
        Lb9:
            r6 = r10
        Lba:
            r0.flags = r6
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            goto L71e
        Lc7:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            int r7 = r0.flags
            com.github.junrar.unpack.vm.VMFlags r8 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            int r8 = r8.getFlag()
            r7 = r7 & r8
            long r8 = (long) r6
            boolean r11 = r2.isByteMode()
            byte[] r12 = r0.mem
            int r5 = r0.getValue(r11, r12, r5)
            long r11 = (long) r5
            long r11 = r11 + r13
            long r8 = r8 & r11
            long r11 = (long) r7
            long r11 = r11 + r13
            long r8 = r8 & r11
            int r5 = (int) r8
            boolean r8 = r2.isByteMode()
            if (r8 == 0) goto Lf4
            r5 = r5 & 255(0xff, float:3.57E-43)
        Lf4:
            if (r5 < r6) goto L10c
            if (r5 != r6) goto Lfb
            if (r7 == 0) goto Lfb
            goto L10c
        Lfb:
            if (r5 != 0) goto L104
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r6 = r6.getFlag()
            goto L10d
        L104:
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r6 = r6.getFlag()
            r6 = r6 & r5
            goto L10d
        L10c:
            r6 = r10
        L10d:
            r0.flags = r6
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            goto L71e
        L11a:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r5 = r0.getValue(r6, r7, r5)
            if (r5 == 0) goto L71e
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            int r6 = r6 / r5
            boolean r2 = r2.isByteMode()
            byte[] r5 = r0.mem
            r0.setValue(r2, r5, r4, r6)
            goto L71e
        L13c:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            long r6 = (long) r6
            boolean r8 = r2.isByteMode()
            byte[] r9 = r0.mem
            int r5 = r0.getValue(r8, r9, r5)
            long r8 = (long) r5
            long r8 = r8 * r13
            long r5 = r6 & r8
            int r5 = (int) r5
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            goto L71e
        L161:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            boolean r7 = r2.isByteMode()
            byte[] r8 = r0.mem
            boolean r9 = r2.isByteMode()
            byte[] r11 = r0.mem
            int r9 = r0.getValue(r9, r11, r5)
            r0.setValue(r7, r8, r4, r9)
            boolean r2 = r2.isByteMode()
            byte[] r4 = r0.mem
            r0.setValue(r2, r4, r5, r6)
            goto L71e
        L189:
            byte[] r2 = r0.mem
            int r5 = r0.getValue(r10, r2, r5)
            byte r5 = (byte) r5
            r0.setValue(r1, r2, r4, r5)
            goto L71e
        L195:
            byte[] r2 = r0.mem
            int r5 = r0.getValue(r10, r2, r5)
            r0.setValue(r1, r2, r4, r5)
            goto L71e
        L1a0:
            byte[] r2 = r0.mem
            int[] r4 = r0.R
            r4 = r4[r15]
            r4 = r4 & r12
            int r2 = r0.getValue(r1, r2, r4)
            r0.flags = r2
            int[] r2 = r0.R
            r4 = r2[r15]
            int r4 = r4 + 4
            r2[r15] = r4
            goto L71e
        L1b7:
            int[] r2 = r0.R
            r4 = r2[r15]
            int r4 = r4 + (-4)
            r2[r15] = r4
            byte[] r2 = r0.mem
            r4 = r4 & r12
            int r5 = r0.flags
            r0.setValue(r1, r2, r4, r5)
            goto L71e
        L1c9:
            int[] r2 = r0.R
            r2 = r2[r15]
            r4 = r1
        L1ce:
            if (r4 >= r7) goto L71e
            int[] r5 = r0.R
            int r6 = 7 - r4
            byte[] r8 = r0.mem
            r9 = r2 & r12
            int r8 = r0.getValue(r1, r8, r9)
            r5[r6] = r8
            int r4 = r4 + 1
            int r2 = r2 + 4
            goto L1ce
        L1e3:
            int[] r2 = r0.R
            r2 = r2[r15]
            int r2 = r2 + (-4)
            r4 = r1
        L1ea:
            if (r4 >= r7) goto L1fc
            byte[] r5 = r0.mem
            r6 = r2 & r12
            int[] r8 = r0.R
            r8 = r8[r4]
            r0.setValue(r1, r5, r6, r8)
            int r4 = r4 + 1
            int r2 = r2 + (-4)
            goto L1ea
        L1fc:
            int[] r2 = r0.R
            r4 = r2[r15]
            int r4 = r4 + (-32)
            r2[r15] = r4
            goto L71e
        L206:
            byte[] r2 = r0.mem
            int r5 = r0.getValue(r1, r2, r4)
            int r5 = -r5
            r0.setValue(r1, r2, r4, r5)
            goto L71e
        L212:
            byte[] r2 = r0.mem
            int r5 = r0.getValue(r10, r2, r4)
            int r5 = -r5
            r0.setValue(r10, r2, r4, r5)
            goto L71e
        L21e:
            boolean r5 = r2.isByteMode()
            byte[] r6 = r0.mem
            int r5 = r0.getValue(r5, r6, r4)
            int r5 = -r5
            if (r5 != 0) goto L232
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r6 = r6.getFlag()
            goto L240
        L232:
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            int r6 = r6.getFlag()
            com.github.junrar.unpack.vm.VMFlags r7 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r7 = r7.getFlag()
            r7 = r7 & r5
            r6 = r6 | r7
        L240:
            r0.flags = r6
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            goto L71e
        L24d:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            boolean r7 = r2.isByteMode()
            byte[] r8 = r0.mem
            int r5 = r0.getValue(r7, r8, r5)
            int r7 = r6 >>> r5
            if (r7 != 0) goto L26c
            com.github.junrar.unpack.vm.VMFlags r8 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r8 = r8.getFlag()
            goto L273
        L26c:
            com.github.junrar.unpack.vm.VMFlags r8 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r8 = r8.getFlag()
            r8 = r8 & r7
        L273:
            int r5 = r5 + (-1)
            int r5 = r6 >>> r5
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            int r6 = r6.getFlag()
            r5 = r5 & r6
            r5 = r5 | r8
            r0.flags = r5
            boolean r2 = r2.isByteMode()
            byte[] r5 = r0.mem
            r0.setValue(r2, r5, r4, r7)
            goto L71e
        L28c:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            boolean r7 = r2.isByteMode()
            byte[] r8 = r0.mem
            int r5 = r0.getValue(r7, r8, r5)
            int r7 = r6 >>> r5
            if (r7 != 0) goto L2ab
            com.github.junrar.unpack.vm.VMFlags r8 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r8 = r8.getFlag()
            goto L2b2
        L2ab:
            com.github.junrar.unpack.vm.VMFlags r8 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r8 = r8.getFlag()
            r8 = r8 & r7
        L2b2:
            int r5 = r5 + (-1)
            int r5 = r6 >>> r5
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            int r6 = r6.getFlag()
            r5 = r5 & r6
            r5 = r5 | r8
            r0.flags = r5
            boolean r2 = r2.isByteMode()
            byte[] r5 = r0.mem
            r0.setValue(r2, r5, r4, r7)
            goto L71e
        L2cb:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            boolean r7 = r2.isByteMode()
            byte[] r8 = r0.mem
            int r5 = r0.getValue(r7, r8, r5)
            int r7 = r6 << r5
            if (r7 != 0) goto L2ea
            com.github.junrar.unpack.vm.VMFlags r8 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r8 = r8.getFlag()
            goto L2f1
        L2ea:
            com.github.junrar.unpack.vm.VMFlags r8 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r8 = r8.getFlag()
            r8 = r8 & r7
        L2f1:
            int r5 = r5 + (-1)
            int r5 = r6 << r5
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r5 = r5 & r6
            if (r5 == 0) goto L301
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            int r5 = r5.getFlag()
            goto L302
        L301:
            r5 = r1
        L302:
            r5 = r5 | r8
            r0.flags = r5
            boolean r2 = r2.isByteMode()
            byte[] r5 = r0.mem
            r0.setValue(r2, r5, r4, r7)
            goto L71e
        L310:
            boolean r5 = r2.isByteMode()
            byte[] r6 = r0.mem
            boolean r2 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r2 = r0.getValue(r2, r7, r4)
            int r2 = ~r2
            r0.setValue(r5, r6, r4, r2)
            goto L71e
        L326:
            int[] r2 = r0.R
            r5 = r2[r15]
            int r5 = r5 + (-4)
            r2[r15] = r5
            byte[] r2 = r0.mem
            r5 = r5 & r12
            int r6 = r0.IP
            int r6 = r6 + r10
            r0.setValue(r1, r2, r5, r6)
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            r0.setIP(r2)
            goto Le
        L342:
            byte[] r2 = r0.mem
            int[] r5 = r0.R
            r5 = r5[r15]
            r5 = r5 & r12
            int r5 = r0.getValue(r1, r2, r5)
            r0.setValue(r1, r2, r4, r5)
            int[] r2 = r0.R
            r4 = r2[r15]
            int r4 = r4 + 4
            r2[r15] = r4
            goto L71e
        L35a:
            int[] r2 = r0.R
            r5 = r2[r15]
            int r5 = r5 + (-4)
            r2[r15] = r5
            byte[] r2 = r0.mem
            r5 = r5 & r12
            int r4 = r0.getValue(r1, r2, r4)
            r0.setValue(r1, r2, r5, r4)
            goto L71e
        L36e:
            int r2 = r0.flags
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            int r5 = r5.getFlag()
            r2 = r2 & r5
            if (r2 != 0) goto L71e
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            r0.setIP(r2)
            goto Le
        L384:
            int r2 = r0.flags
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            int r5 = r5.getFlag()
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r6 = r6.getFlag()
            r5 = r5 | r6
            r2 = r2 & r5
            if (r2 != 0) goto L71e
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            r0.setIP(r2)
            goto Le
        L3a1:
            int r2 = r0.flags
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            int r5 = r5.getFlag()
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r6 = r6.getFlag()
            r5 = r5 | r6
            r2 = r2 & r5
            if (r2 == 0) goto L71e
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            r0.setIP(r2)
            goto Le
        L3be:
            int r2 = r0.flags
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FC
            int r5 = r5.getFlag()
            r2 = r2 & r5
            if (r2 == 0) goto L71e
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            r0.setIP(r2)
            goto Le
        L3d4:
            int r2 = r0.flags
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r5 = r5.getFlag()
            r2 = r2 & r5
            if (r2 != 0) goto L71e
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            r0.setIP(r2)
            goto Le
        L3ea:
            int r2 = r0.flags
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r5 = r5.getFlag()
            r2 = r2 & r5
            if (r2 == 0) goto L71e
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            r0.setIP(r2)
            goto Le
        L400:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r4 = r0.getValue(r6, r7, r4)
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            int r2 = r0.getValue(r2, r6, r5)
            r2 = r2 & r4
            if (r2 != 0) goto L41e
            com.github.junrar.unpack.vm.VMFlags r2 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r2 = r2.getFlag()
            goto L425
        L41e:
            com.github.junrar.unpack.vm.VMFlags r4 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r4 = r4.getFlag()
            r2 = r2 & r4
        L425:
            r0.flags = r2
            goto L71e
        L429:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            boolean r7 = r2.isByteMode()
            byte[] r8 = r0.mem
            int r5 = r0.getValue(r7, r8, r5)
            r5 = r5 | r6
            if (r5 != 0) goto L447
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r6 = r6.getFlag()
            goto L44e
        L447:
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r6 = r6.getFlag()
            r6 = r6 & r5
        L44e:
            r0.flags = r6
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            goto L71e
        L45b:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            boolean r7 = r2.isByteMode()
            byte[] r8 = r0.mem
            int r5 = r0.getValue(r7, r8, r5)
            r5 = r5 & r6
            if (r5 != 0) goto L479
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r6 = r6.getFlag()
            goto L480
        L479:
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r6 = r6.getFlag()
            r6 = r6 & r5
        L480:
            r0.flags = r6
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            goto L71e
        L48d:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            boolean r7 = r2.isByteMode()
            byte[] r8 = r0.mem
            int r5 = r0.getValue(r7, r8, r5)
            r5 = r5 ^ r6
            if (r5 != 0) goto L4ab
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r6 = r6.getFlag()
            goto L4b2
        L4ab:
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r6 = r6.getFlag()
            r6 = r6 & r5
        L4b2:
            r0.flags = r6
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            goto L71e
        L4bf:
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            r0.setIP(r2)
            goto Le
        L4ca:
            byte[] r2 = r0.mem
            int r5 = r0.getValue(r1, r2, r4)
            long r5 = (long) r5
            long r5 = r5 & r16
            int r5 = (int) r5
            r0.setValue(r1, r2, r4, r5)
            goto L71e
        L4d9:
            byte[] r2 = r0.mem
            int r5 = r0.getValue(r10, r2, r4)
            long r5 = (long) r5
            long r5 = r5 & r16
            int r5 = (int) r5
            r0.setValue(r10, r2, r4, r5)
            goto L71e
        L4e8:
            boolean r5 = r2.isByteMode()
            byte[] r6 = r0.mem
            int r5 = r0.getValue(r5, r6, r4)
            long r5 = (long) r5
            long r5 = r5 & r16
            int r5 = (int) r5
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            if (r5 != 0) goto L508
            com.github.junrar.unpack.vm.VMFlags r2 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r2 = r2.getFlag()
            goto L50f
        L508:
            com.github.junrar.unpack.vm.VMFlags r2 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r2 = r2.getFlag()
            r2 = r2 & r5
        L50f:
            r0.flags = r2
            goto L71e
        L513:
            byte[] r2 = r0.mem
            r0.getValue(r1, r2, r4)
            int r5 = (int) r8
            r0.setValue(r1, r2, r4, r5)
            goto L71e
        L51e:
            byte[] r2 = r0.mem
            r0.getValue(r10, r2, r4)
            int r5 = (int) r8
            r0.setValue(r10, r2, r4, r5)
            goto L71e
        L529:
            boolean r5 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.getValue(r5, r6, r4)
            int r5 = (int) r8
            boolean r6 = r2.isByteMode()
            if (r6 == 0) goto L53b
            r5 = r5 & 255(0xff, float:3.57E-43)
        L53b:
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            if (r5 != 0) goto L54d
            com.github.junrar.unpack.vm.VMFlags r2 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r2 = r2.getFlag()
            goto L554
        L54d:
            com.github.junrar.unpack.vm.VMFlags r2 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r2 = r2.getFlag()
            r2 = r2 & r5
        L554:
            r0.flags = r2
            goto L71e
        L558:
            int r2 = r0.flags
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r5 = r5.getFlag()
            r2 = r2 & r5
            if (r2 != 0) goto L71e
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            r0.setIP(r2)
            goto Le
        L56e:
            int r2 = r0.flags
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r5 = r5.getFlag()
            r2 = r2 & r5
            if (r2 == 0) goto L71e
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            r0.setIP(r2)
            goto Le
        L584:
            byte[] r2 = r0.mem
            int r6 = r0.getValue(r1, r2, r4)
            long r6 = (long) r6
            byte[] r8 = r0.mem
            int r5 = r0.getValue(r1, r8, r5)
            long r8 = (long) r5
            long r13 = r13 - r8
            long r5 = r6 & r13
            int r5 = (int) r5
            r0.setValue(r1, r2, r4, r5)
            goto L71e
        L59b:
            byte[] r2 = r0.mem
            int r6 = r0.getValue(r10, r2, r4)
            long r6 = (long) r6
            byte[] r8 = r0.mem
            int r5 = r0.getValue(r10, r8, r5)
            long r8 = (long) r5
            long r13 = r13 - r8
            long r5 = r6 & r13
            int r5 = (int) r5
            r0.setValue(r10, r2, r4, r5)
            goto L71e
        L5b2:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            long r7 = (long) r6
            boolean r9 = r2.isByteMode()
            byte[] r11 = r0.mem
            int r5 = r0.getValue(r9, r11, r5)
            long r11 = (long) r5
            long r13 = r13 - r11
            long r7 = r7 & r13
            int r5 = (int) r7
            if (r5 != 0) goto L5d4
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r6 = r6.getFlag()
            goto L5df
        L5d4:
            if (r5 <= r6) goto L5d8
            r6 = r10
            goto L5df
        L5d8:
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r6 = r6.getFlag()
            r6 = r6 & r5
        L5df:
            r0.flags = r6
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            goto L71e
        L5ec:
            byte[] r2 = r0.mem
            int r6 = r0.getValue(r1, r2, r4)
            long r6 = (long) r6
            byte[] r8 = r0.mem
            int r5 = r0.getValue(r1, r8, r5)
            long r8 = (long) r5
            long r8 = r8 + r13
            long r5 = r6 & r8
            int r5 = (int) r5
            r0.setValue(r1, r2, r4, r5)
            goto L71e
        L603:
            byte[] r2 = r0.mem
            int r6 = r0.getValue(r10, r2, r4)
            long r6 = (long) r6
            byte[] r8 = r0.mem
            int r5 = r0.getValue(r10, r8, r5)
            long r8 = (long) r5
            long r8 = r8 + r13
            long r5 = r6 & r8
            int r5 = (int) r5
            r0.setValue(r10, r2, r4, r5)
            goto L71e
        L61a:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r6 = r0.getValue(r6, r7, r4)
            long r7 = (long) r6
            boolean r9 = r2.isByteMode()
            byte[] r11 = r0.mem
            int r5 = r0.getValue(r9, r11, r5)
            long r11 = (long) r5
            long r7 = r7 + r11
            int r5 = (int) r7
            boolean r7 = r2.isByteMode()
            if (r7 == 0) goto L657
            r7 = r5 & 255(0xff, float:3.57E-43)
            if (r7 >= r6) goto L63e
            r5 = r10
            goto L653
        L63e:
            if (r7 != 0) goto L647
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r5 = r5.getFlag()
            goto L653
        L647:
            r5 = r5 & 128(0x80, float:1.8E-43)
            if (r5 == 0) goto L652
            com.github.junrar.unpack.vm.VMFlags r5 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r5 = r5.getFlag()
            goto L653
        L652:
            r5 = r1
        L653:
            r0.flags = r5
            r5 = r7
            goto L66d
        L657:
            if (r5 >= r6) goto L65b
            r6 = r10
            goto L66b
        L65b:
            if (r5 != 0) goto L664
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r6 = r6.getFlag()
            goto L66b
        L664:
            com.github.junrar.unpack.vm.VMFlags r6 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r6 = r6.getFlag()
            r6 = r6 & r5
        L66b:
            r0.flags = r6
        L66d:
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            r0.setValue(r2, r6, r4, r5)
            goto L71e
        L678:
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r1, r2, r4)
            byte[] r4 = r0.mem
            int r4 = r0.getValue(r1, r4, r5)
            int r4 = r2 - r4
            if (r4 != 0) goto L692
            com.github.junrar.unpack.vm.VMFlags r2 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r2 = r2.getFlag()
            r0.flags = r2
            goto L71e
        L692:
            if (r4 <= r2) goto L696
            r2 = r10
            goto L69d
        L696:
            com.github.junrar.unpack.vm.VMFlags r2 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r2 = r2.getFlag()
            r2 = r2 & r4
        L69d:
            r0.flags = r2
            goto L71e
        L6a1:
            byte[] r2 = r0.mem
            int r2 = r0.getValue(r10, r2, r4)
            byte[] r4 = r0.mem
            int r4 = r0.getValue(r10, r4, r5)
            int r4 = r2 - r4
            if (r4 != 0) goto L6ba
            com.github.junrar.unpack.vm.VMFlags r2 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r2 = r2.getFlag()
            r0.flags = r2
            goto L71e
        L6ba:
            if (r4 <= r2) goto L6be
            r2 = r10
            goto L6c5
        L6be:
            com.github.junrar.unpack.vm.VMFlags r2 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r2 = r2.getFlag()
            r2 = r2 & r4
        L6c5:
            r0.flags = r2
            goto L71e
        L6c8:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            int r4 = r0.getValue(r6, r7, r4)
            boolean r2 = r2.isByteMode()
            byte[] r6 = r0.mem
            int r2 = r0.getValue(r2, r6, r5)
            int r2 = r4 - r2
            if (r2 != 0) goto L6e9
            com.github.junrar.unpack.vm.VMFlags r2 = com.github.junrar.unpack.vm.VMFlags.VM_FZ
            int r2 = r2.getFlag()
            r0.flags = r2
            goto L71e
        L6e9:
            if (r2 <= r4) goto L6ed
            r2 = r10
            goto L6f4
        L6ed:
            com.github.junrar.unpack.vm.VMFlags r4 = com.github.junrar.unpack.vm.VMFlags.VM_FS
            int r4 = r4.getFlag()
            r2 = r2 & r4
        L6f4:
            r0.flags = r2
            goto L71e
        L6f7:
            byte[] r2 = r0.mem
            int r5 = r0.getValue(r1, r2, r5)
            r0.setValue(r1, r2, r4, r5)
            goto L71e
        L701:
            byte[] r2 = r0.mem
            int r5 = r0.getValue(r10, r2, r5)
            r0.setValue(r10, r2, r4, r5)
            goto L71e
        L70b:
            boolean r6 = r2.isByteMode()
            byte[] r7 = r0.mem
            boolean r2 = r2.isByteMode()
            byte[] r8 = r0.mem
            int r2 = r0.getValue(r2, r8, r5)
            r0.setValue(r6, r7, r4, r2)
        L71e:
            int r2 = r0.IP
            int r2 = r2 + r10
            r0.IP = r2
            int r2 = r0.maxOpCount
            int r2 = r2 - r10
            r0.maxOpCount = r2
            goto Le
    }

    private void ExecuteStandardFilter(com.github.junrar.unpack.vm.VMStandardFilters r38) {
            r37 = this;
            r0 = r37
            int[] r1 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMStandardFilters
            int r2 = r38.ordinal()
            r1 = r1[r2]
            r2 = 245760(0x3c000, float:3.44383E-40)
            r7 = 245792(0x3c020, float:3.44428E-40)
            r8 = 122880(0x1e000, float:1.72192E-40)
            r11 = 2
            r14 = 4
            r16 = 6
            r3 = 0
            switch(r1) {
                case 1: goto L2ec;
                case 2: goto L2ec;
                case 3: goto L277;
                case 4: goto L24a;
                case 5: goto L198;
                case 6: goto L4f;
                case 7: goto L1d;
                default: goto L1b;
            }
        L1b:
            goto L356
        L1d:
            int[] r1 = r0.R
            r1 = r1[r14]
            if (r1 < r8) goto L25
            goto L356
        L25:
            r4 = r1
            r2 = r3
        L27:
            byte[] r5 = r0.mem
            if (r2 >= r1) goto L42
            int r6 = r2 + 1
            r8 = r5[r2]
            if (r8 != r11) goto L3b
            int r2 = r2 + 2
            r8 = r5[r6]
            if (r8 == r11) goto L3c
            int r8 = r8 + (-32)
            byte r8 = (byte) r8
            goto L3c
        L3b:
            r2 = r6
        L3c:
            int r6 = r4 + 1
            r5[r4] = r8
            r4 = r6
            goto L27
        L42:
            r2 = 245788(0x3c01c, float:3.44422E-40)
            int r4 = r4 - r1
            r0.setValue(r3, r5, r2, r4)
            byte[] r2 = r0.mem
            r0.setValue(r3, r2, r7, r1)
            return
        L4f:
            int[] r1 = r0.R
            r2 = r1[r14]
            r1 = r1[r3]
            r17 = 255(0xff, double:1.26E-321)
            byte[] r5 = r0.mem
            r0.setValue(r3, r5, r7, r2)
            if (r2 < r8) goto L60
            goto L356
        L60:
            r5 = r3
            r6 = r5
        L62:
            if (r5 >= r1) goto L356
            r7 = 7
            long[] r8 = new long[r7]
            r13 = r3
            r15 = r13
            r22 = r15
            r28 = r22
            r38 = r5
            r12 = r38
            r27 = r11
            r26 = r14
            r4 = 0
            r19 = 0
            r21 = 5
            r23 = 0
            r25 = 1
            r11 = r28
            r14 = r11
        L82:
            if (r12 >= r2) goto L188
            int r4 = (int) r4
            int r5 = r4 - r22
            r29 = 8
            long r29 = r29 * r23
            r22 = 3
            int r10 = r15 * r4
            r31 = r3
            r32 = r4
            long r3 = (long) r10
            long r29 = r29 + r3
            int r3 = r14 * r5
            long r3 = (long) r3
            long r29 = r29 + r3
            int r3 = r11 * r13
            long r3 = (long) r3
            long r29 = r29 + r3
            long r3 = r29 >>> r22
            long r3 = r3 & r17
            byte[] r10 = r0.mem
            int r29 = r6 + 1
            r6 = r10[r6]
            r6 = r6 & 255(0xff, float:3.57E-43)
            r33 = r10
            long r9 = (long) r6
            long r3 = r3 - r9
            int r6 = r2 + r12
            int r7 = (int) r3
            byte r7 = (byte) r7
            r33[r6] = r7
            long r6 = r3 - r23
            int r6 = (int) r6
            byte r6 = (byte) r6
            long r6 = (long) r6
            int r9 = (int) r9
            byte r9 = (byte) r9
            int r9 = r9 << 3
            r23 = r8[r31]
            int r10 = java.lang.Math.abs(r9)
            r34 = r1
            r33 = r2
            long r1 = (long) r10
            long r23 = r23 + r1
            r8[r31] = r23
            r1 = r8[r25]
            int r10 = r9 - r32
            int r10 = java.lang.Math.abs(r10)
            r23 = r1
            long r1 = (long) r10
            long r1 = r23 + r1
            r8[r25] = r1
            r1 = r8[r27]
            int r10 = r9 + r32
            int r10 = java.lang.Math.abs(r10)
            r23 = r1
            long r1 = (long) r10
            long r1 = r23 + r1
            r8[r27] = r1
            r1 = r8[r22]
            int r10 = r9 - r5
            int r10 = java.lang.Math.abs(r10)
            r23 = r1
            long r1 = (long) r10
            long r1 = r23 + r1
            r8[r22] = r1
            r1 = r8[r26]
            int r10 = r9 + r5
            int r10 = java.lang.Math.abs(r10)
            r23 = r1
            long r1 = (long) r10
            long r1 = r23 + r1
            r8[r26] = r1
            r1 = r8[r21]
            int r10 = r9 - r13
            int r10 = java.lang.Math.abs(r10)
            r23 = r1
            long r1 = (long) r10
            long r1 = r23 + r1
            r8[r21] = r1
            r1 = r8[r16]
            int r9 = r9 + r13
            int r9 = java.lang.Math.abs(r9)
            long r9 = (long) r9
            long r1 = r1 + r9
            r8[r16] = r1
            r1 = r28 & 31
            if (r1 != 0) goto L172
            r1 = r8[r31]
            r8[r31] = r19
            r23 = r1
            r1 = r19
            r9 = r25
            r10 = 7
        L133:
            if (r9 >= r10) goto L143
            r35 = r8[r9]
            int r13 = (r35 > r23 ? 1 : (r35 == r23 ? 0 : -1))
            if (r13 >= 0) goto L13e
            long r1 = (long) r9
            r23 = r35
        L13e:
            r8[r9] = r19
            int r9 = r9 + 1
            goto L133
        L143:
            int r1 = (int) r1
            r2 = -16
            switch(r1) {
                case 1: goto L16d;
                case 2: goto L166;
                case 3: goto L15f;
                case 4: goto L158;
                case 5: goto L151;
                case 6: goto L14a;
                default: goto L149;
            }
        L149:
            goto L173
        L14a:
            r1 = 16
            if (r11 >= r1) goto L173
            int r11 = r11 + 1
            goto L173
        L151:
            r1 = 16
            if (r11 < r2) goto L173
            int r11 = r11 + (-1)
            goto L173
        L158:
            r1 = 16
            if (r14 >= r1) goto L173
            int r14 = r14 + 1
            goto L173
        L15f:
            r1 = 16
            if (r14 < r2) goto L173
            int r14 = r14 + (-1)
            goto L173
        L166:
            r1 = 16
            if (r15 >= r1) goto L173
            int r15 = r15 + 1
            goto L173
        L16d:
            if (r15 < r2) goto L173
            int r15 = r15 + (-1)
            goto L173
        L172:
            r10 = 7
        L173:
            int r12 = r12 + r34
            int r28 = r28 + 1
            r23 = r3
            r13 = r5
            r4 = r6
            r7 = r10
            r6 = r29
            r3 = r31
            r22 = r32
            r2 = r33
            r1 = r34
            goto L82
        L188:
            r34 = r1
            r33 = r2
            r31 = r3
            r22 = 3
            int r5 = r38 + 1
            r14 = r26
            r11 = r27
            goto L62
        L198:
            r31 = r3
            r27 = r11
            r26 = r14
            r17 = 255(0xff, double:1.26E-321)
            r19 = 0
            r22 = 3
            r25 = 1
            int[] r1 = r0.R
            r2 = r1[r26]
            r3 = r1[r31]
            int r3 = r3 + (-3)
            r1 = r1[r25]
            byte[] r4 = r0.mem
            r5 = r31
            r0.setValue(r5, r4, r7, r2)
            if (r2 >= r8) goto L356
            if (r1 >= 0) goto L1bd
            goto L356
        L1bd:
            r5 = r22
            r4 = 0
            r31 = 0
        L1c2:
            if (r4 >= r5) goto L22a
            r6 = r4
            r7 = r19
        L1c7:
            if (r6 >= r2) goto L223
            int r9 = r6 - r3
            if (r9 < r5) goto L201
            int r9 = r9 + r2
            byte[] r10 = r0.mem
            r11 = r10[r9]
            r11 = r11 & 255(0xff, float:3.57E-43)
            int r9 = r9 - r5
            r9 = r10[r9]
            r9 = r9 & 255(0xff, float:3.57E-43)
            long r10 = (long) r11
            long r12 = r7 + r10
            long r14 = (long) r9
            long r12 = r12 - r14
            r9 = r6
            long r5 = r12 - r7
            int r5 = (int) r5
            int r5 = java.lang.Math.abs(r5)
            r6 = r1
            r38 = r2
            long r1 = r12 - r10
            int r1 = (int) r1
            int r1 = java.lang.Math.abs(r1)
            long r12 = r12 - r14
            int r2 = (int) r12
            int r2 = java.lang.Math.abs(r2)
            if (r5 > r1) goto L1fb
            if (r5 > r2) goto L1fb
            goto L205
        L1fb:
            if (r1 > r2) goto L1ff
            r7 = r10
            goto L205
        L1ff:
            r7 = r14
            goto L205
        L201:
            r38 = r2
            r9 = r6
            r6 = r1
        L205:
            byte[] r1 = r0.mem
            int r2 = r31 + 1
            r5 = r1[r31]
            long r10 = (long) r5
            long r7 = r7 - r10
            long r10 = r7 & r17
            int r5 = r38 + r9
            long r7 = r7 & r17
            int r7 = (int) r7
            byte r7 = (byte) r7
            r1[r5] = r7
            int r1 = r9 + 3
            r5 = r6
            r6 = r1
            r1 = r5
            r31 = r2
            r7 = r10
            r5 = 3
            r2 = r38
            goto L1c7
        L223:
            r6 = r1
            r38 = r2
            int r4 = r4 + 1
            r5 = 3
            goto L1c2
        L22a:
            r6 = r1
            r38 = r2
            int r2 = r38 + (-2)
        L22f:
            if (r1 >= r2) goto L356
            byte[] r3 = r0.mem
            int r4 = r38 + r1
            int r5 = r4 + 1
            r5 = r3[r5]
            r6 = r3[r4]
            int r6 = r6 + r5
            byte r6 = (byte) r6
            r3[r4] = r6
            int r4 = r4 + 2
            r6 = r3[r4]
            int r6 = r6 + r5
            byte r5 = (byte) r6
            r3[r4] = r5
            int r1 = r1 + 3
            goto L22f
        L24a:
            r26 = r14
            int[] r1 = r0.R
            r2 = r1[r26]
            r5 = 0
            r1 = r1[r5]
            int r3 = r2 * 2
            byte[] r4 = r0.mem
            r0.setValue(r5, r4, r7, r2)
            if (r2 < r8) goto L25e
            goto L356
        L25e:
            r4 = 0
            r5 = 0
        L260:
            if (r4 >= r1) goto L356
            int r6 = r2 + r4
            r7 = 0
        L265:
            if (r6 >= r3) goto L274
            byte[] r8 = r0.mem
            int r9 = r5 + 1
            r5 = r8[r5]
            int r7 = r7 - r5
            byte r7 = (byte) r7
            r8[r6] = r7
            int r6 = r6 + r1
            r5 = r9
            goto L265
        L274:
            int r4 = r4 + 1
            goto L260
        L277:
            r27 = r11
            r26 = r14
            r21 = 5
            r25 = 1
            int[] r1 = r0.R
            r3 = r1[r26]
            r1 = r1[r16]
            long r4 = (long) r1
            if (r3 < r2) goto L28a
            goto L356
        L28a:
            r1 = 16
            byte[] r2 = new byte[r1]
            r2 = {x037a: FILL_ARRAY_DATA  , data: [4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0} // fill-array
            long r4 = r4 >>> r26
            r6 = 0
        L294:
            int r7 = r3 + (-21)
            if (r6 >= r7) goto L356
            byte[] r7 = r0.mem
            r7 = r7[r6]
            r7 = r7 & 31
            int r7 = r7 - r1
            if (r7 < 0) goto L2dc
            r7 = r2[r7]
            if (r7 == 0) goto L2dc
            r9 = r27
            r8 = 0
        L2a8:
            if (r8 > r9) goto L2d9
            int r10 = r25 << r8
            r10 = r10 & r7
            if (r10 == 0) goto L2d0
            int r10 = r8 * 41
            int r11 = r10 + 42
            r12 = r26
            int r11 = r0.filterItanium_GetBits(r6, r11, r12)
            r12 = r21
            if (r11 != r12) goto L2d2
            int r10 = r10 + 18
            r11 = 20
            int r13 = r0.filterItanium_GetBits(r6, r10, r11)
            long r13 = (long) r13
            long r13 = r13 - r4
            int r13 = (int) r13
            r14 = 1048575(0xfffff, float:1.469367E-39)
            r13 = r13 & r14
            r0.filterItanium_SetBits(r6, r13, r10, r11)
            goto L2d2
        L2d0:
            r12 = r21
        L2d2:
            int r8 = r8 + 1
            r21 = r12
            r26 = 4
            goto L2a8
        L2d9:
            r12 = r21
            goto L2e0
        L2dc:
            r12 = r21
            r9 = r27
        L2e0:
            int r6 = r6 + 16
            r7 = 1
            long r4 = r4 + r7
            r27 = r9
            r21 = r12
            r26 = 4
            goto L294
        L2ec:
            r19 = 0
            int[] r1 = r0.R
            r26 = 4
            r3 = r1[r26]
            r1 = r1[r16]
            long r4 = (long) r1
            if (r3 < r2) goto L2fa
            goto L356
        L2fa:
            com.github.junrar.unpack.vm.VMStandardFilters r1 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_E8E9
            r2 = r38
            if (r2 != r1) goto L303
            r1 = 233(0xe9, float:3.27E-43)
            goto L305
        L303:
            r1 = 232(0xe8, float:3.25E-43)
        L305:
            byte r1 = (byte) r1
            r2 = 0
            r26 = 4
        L309:
            int r6 = r3 + (-4)
            if (r2 >= r6) goto L356
            byte[] r6 = r0.mem
            int r7 = r2 + 1
            r8 = r6[r2]
            r9 = -24
            if (r8 == r9) goto L31d
            if (r8 != r1) goto L31a
            goto L31d
        L31a:
            r2 = r7
            r14 = 0
            goto L309
        L31d:
            long r8 = (long) r7
            long r8 = r8 + r4
            r10 = 0
            int r6 = r0.getValue(r10, r6, r7)
            long r10 = (long) r6
            r12 = -2147483648(0xffffffff80000000, double:NaN)
            long r14 = r10 & r12
            int r6 = (r14 > r19 ? 1 : (r14 == r19 ? 0 : -1))
            if (r6 == 0) goto L341
            long r8 = r8 + r10
            long r8 = r8 & r12
            int r6 = (r8 > r19 ? 1 : (r8 == r19 ? 0 : -1))
            if (r6 != 0) goto L33f
            byte[] r6 = r0.mem
            int r8 = (int) r10
            r9 = 16777216(0x1000000, float:2.3509887E-38)
            int r8 = r8 + r9
            r14 = 0
            r0.setValue(r14, r6, r7, r8)
            goto L353
        L33f:
            r14 = 0
            goto L353
        L341:
            r14 = 0
            r15 = 16777216(0x1000000, double:8.289046E-317)
            long r15 = r10 - r15
            long r12 = r12 & r15
            int r6 = (r12 > r19 ? 1 : (r12 == r19 ? 0 : -1))
            if (r6 == 0) goto L353
            byte[] r6 = r0.mem
            long r10 = r10 - r8
            int r8 = (int) r10
            r0.setValue(r14, r6, r7, r8)
        L353:
            int r2 = r2 + 5
            goto L309
        L356:
            return
    }

    private com.github.junrar.unpack.vm.VMStandardFilters IsStandardFilter(byte[] r9, int r10) {
            r8 = this;
            com.github.junrar.unpack.vm.VMStandardFilterSignature r0 = new com.github.junrar.unpack.vm.VMStandardFilterSignature
            r8 = -1386780537(0xffffffffad576887, float:-1.2244545E-11)
            com.github.junrar.unpack.vm.VMStandardFilters r10 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_E8
            r1 = 53
            r0.<init>(r1, r8, r10)
            com.github.junrar.unpack.vm.VMStandardFilterSignature r1 = new com.github.junrar.unpack.vm.VMStandardFilterSignature
            r8 = 1020781950(0x3cd7e57e, float:0.026354548)
            com.github.junrar.unpack.vm.VMStandardFilters r10 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_E8E9
            r2 = 57
            r1.<init>(r2, r8, r10)
            com.github.junrar.unpack.vm.VMStandardFilterSignature r2 = new com.github.junrar.unpack.vm.VMStandardFilterSignature
            r8 = 929663295(0x3769893f, float:1.3919837E-5)
            com.github.junrar.unpack.vm.VMStandardFilters r10 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_ITANIUM
            r3 = 120(0x78, float:1.68E-43)
            r2.<init>(r3, r8, r10)
            com.github.junrar.unpack.vm.VMStandardFilterSignature r3 = new com.github.junrar.unpack.vm.VMStandardFilterSignature
            r8 = 235276157(0xe06077d, float:1.652038E-30)
            com.github.junrar.unpack.vm.VMStandardFilters r10 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_DELTA
            r4 = 29
            r3.<init>(r4, r8, r10)
            com.github.junrar.unpack.vm.VMStandardFilterSignature r4 = new com.github.junrar.unpack.vm.VMStandardFilterSignature
            r8 = 472669640(0x1c2c5dc8, float:5.7031236E-22)
            com.github.junrar.unpack.vm.VMStandardFilters r10 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_RGB
            r5 = 149(0x95, float:2.09E-43)
            r4.<init>(r5, r8, r10)
            com.github.junrar.unpack.vm.VMStandardFilterSignature r5 = new com.github.junrar.unpack.vm.VMStandardFilterSignature
            r8 = -1132075263(0xffffffffbc85e701, float:-0.016345503)
            com.github.junrar.unpack.vm.VMStandardFilters r10 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_AUDIO
            r6 = 216(0xd8, float:3.03E-43)
            r5.<init>(r6, r8, r10)
            com.github.junrar.unpack.vm.VMStandardFilterSignature r6 = new com.github.junrar.unpack.vm.VMStandardFilterSignature
            r8 = 1186579808(0x46b9c560, float:23778.688)
            com.github.junrar.unpack.vm.VMStandardFilters r10 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_UPCASE
            r7 = 40
            r6.<init>(r7, r8, r10)
            com.github.junrar.unpack.vm.VMStandardFilterSignature[] r8 = new com.github.junrar.unpack.vm.VMStandardFilterSignature[]{r0, r1, r2, r3, r4, r5, r6}
            int r10 = r9.length
            r0 = -1
            r1 = 0
            int r10 = com.github.junrar.crc.RarCRC.checkCrc(r0, r9, r1, r10)
            int r10 = ~r10
        L60:
            r0 = 7
            if (r1 >= r0) goto L7e
            r0 = r8[r1]
            int r0 = r0.getCRC()
            if (r0 != r10) goto L7b
            r0 = r8[r1]
            int r0 = r0.getLength()
            int r2 = r9.length
            if (r0 != r2) goto L7b
            r8 = r8[r1]
            com.github.junrar.unpack.vm.VMStandardFilters r8 = r8.getType()
            return r8
        L7b:
            int r1 = r1 + 1
            goto L60
        L7e:
            com.github.junrar.unpack.vm.VMStandardFilters r8 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_NONE
            return r8
    }

    public static int ReadData(com.github.junrar.unpack.vm.BitInput r6) {
            int r0 = r6.fgetbits()
            r1 = 49152(0xc000, float:6.8877E-41)
            r1 = r1 & r0
            r2 = 10
            r3 = 6
            if (r1 == 0) goto L4e
            r4 = 16384(0x4000, float:2.2959E-41)
            r5 = 2
            if (r1 == r4) goto L38
            r0 = 32768(0x8000, float:4.5918E-41)
            r2 = 16
            if (r1 == r0) goto L2d
            r6.faddbits(r5)
            int r0 = r6.fgetbits()
            int r0 = r0 << r2
            r6.faddbits(r2)
            int r1 = r6.fgetbits()
            r0 = r0 | r1
            r6.faddbits(r2)
            return r0
        L2d:
            r6.faddbits(r5)
            int r0 = r6.fgetbits()
            r6.faddbits(r2)
            return r0
        L38:
            r1 = r0 & 15360(0x3c00, float:2.1524E-41)
            if (r1 != 0) goto L47
            int r0 = r0 >>> r5
            r0 = r0 & 255(0xff, float:3.57E-43)
            r0 = r0 | (-256(0xffffffffffffff00, float:NaN))
            r1 = 14
            r6.faddbits(r1)
            return r0
        L47:
            int r0 = r0 >>> r3
            r0 = r0 & 255(0xff, float:3.57E-43)
            r6.faddbits(r2)
            return r0
        L4e:
            r6.faddbits(r3)
            int r6 = r0 >>> 10
            r6 = r6 & 15
            return r6
    }

    private void decodeArg(com.github.junrar.unpack.vm.VMPreparedOperand r7, boolean r8) {
            r6 = this;
            int r0 = r6.fgetbits()
            r1 = 32768(0x8000, float:4.5918E-41)
            r1 = r1 & r0
            r2 = 4
            r3 = 7
            if (r1 == 0) goto L22
            com.github.junrar.unpack.vm.VMOpType r8 = com.github.junrar.unpack.vm.VMOpType.VM_OPREG
            r7.setType(r8)
            int r8 = r0 >>> 12
            r8 = r8 & r3
            r7.setData(r8)
            int r8 = r7.getData()
            r7.setOffset(r8)
            r6.faddbits(r2)
            return
        L22:
            r1 = 49152(0xc000, float:6.8877E-41)
            r1 = r1 & r0
            r4 = 10
            r5 = 6
            if (r1 != 0) goto L49
            com.github.junrar.unpack.vm.VMOpType r1 = com.github.junrar.unpack.vm.VMOpType.VM_OPINT
            r7.setType(r1)
            if (r8 == 0) goto L3d
            int r8 = r0 >>> 6
            r8 = r8 & 255(0xff, float:3.57E-43)
            r7.setData(r8)
            r6.faddbits(r4)
            return
        L3d:
            r8 = 2
            r6.faddbits(r8)
            int r6 = ReadData(r6)
            r7.setData(r6)
            return
        L49:
            com.github.junrar.unpack.vm.VMOpType r8 = com.github.junrar.unpack.vm.VMOpType.VM_OPREGMEM
            r7.setType(r8)
            r8 = r0 & 8192(0x2000, float:1.148E-41)
            r1 = 0
            if (r8 != 0) goto L67
            int r8 = r0 >>> 10
            r8 = r8 & r3
            r7.setData(r8)
            int r8 = r7.getData()
            r7.setOffset(r8)
            r7.setBase(r1)
            r6.faddbits(r5)
            return
        L67:
            r8 = r0 & 4096(0x1000, float:5.74E-42)
            if (r8 != 0) goto L7c
            int r8 = r0 >>> 9
            r8 = r8 & r3
            r7.setData(r8)
            int r8 = r7.getData()
            r7.setOffset(r8)
            r6.faddbits(r3)
            goto L82
        L7c:
            r7.setData(r1)
            r6.faddbits(r2)
        L82:
            int r6 = ReadData(r6)
            r7.setBase(r6)
            return
    }

    private int filterItanium_GetBits(int r5, int r6, int r7) {
            r4 = this;
            int r0 = r6 / 8
            r6 = r6 & 7
            byte[] r4 = r4.mem
            int r1 = r0 + 1
            int r2 = r5 + r0
            r2 = r4[r2]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r3 = r0 + 2
            int r1 = r1 + r5
            r1 = r4[r1]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 8
            r1 = r1 | r2
            int r0 = r0 + 3
            int r3 = r3 + r5
            r2 = r4[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << 16
            r1 = r1 | r2
            int r5 = r5 + r0
            r4 = r4[r5]
            r4 = r4 & 255(0xff, float:3.57E-43)
            int r4 = r4 << 24
            r4 = r4 | r1
            int r4 = r4 >>> r6
            int r5 = 32 - r7
            r6 = -1
            int r5 = r6 >>> r5
            r4 = r4 & r5
            return r4
    }

    private void filterItanium_SetBits(int r5, int r6, int r7, int r8) {
            r4 = this;
            int r0 = r7 / 8
            r7 = r7 & 7
            int r8 = 32 - r8
            r1 = -1
            int r8 = r1 >>> r8
            int r8 = r8 << r7
            int r8 = ~r8
            int r6 = r6 << r7
            r7 = 0
        Ld:
            r1 = 4
            if (r7 >= r1) goto L29
            byte[] r1 = r4.mem
            int r2 = r5 + r0
            int r2 = r2 + r7
            r3 = r1[r2]
            r3 = r3 & r8
            byte r3 = (byte) r3
            r1[r2] = r3
            r3 = r3 | r6
            byte r3 = (byte) r3
            r1[r2] = r3
            int r8 = r8 >>> 8
            r1 = -16777216(0xffffffffff000000, float:-1.7014118E38)
            r8 = r8 | r1
            int r6 = r6 >>> 8
            int r7 = r7 + 1
            goto Ld
        L29:
            return
    }

    private int getOperand(com.github.junrar.unpack.vm.VMPreparedOperand r3) {
            r2 = this;
            com.github.junrar.unpack.vm.VMOpType r0 = r3.getType()
            com.github.junrar.unpack.vm.VMOpType r1 = com.github.junrar.unpack.vm.VMOpType.VM_OPREGMEM
            if (r0 != r1) goto L1c
            int r0 = r3.getOffset()
            int r3 = r3.getBase()
            int r3 = r3 + r0
            r0 = 262143(0x3ffff, float:3.6734E-40)
            r3 = r3 & r0
            byte[] r2 = r2.mem
            int r2 = com.github.junrar.io.Raw.readIntLittleEndian(r2, r3)
            return r2
        L1c:
            int r3 = r3.getOffset()
            byte[] r2 = r2.mem
            int r2 = com.github.junrar.io.Raw.readIntLittleEndian(r2, r3)
            return r2
    }

    private int getValue(boolean r1, byte[] r2, int r3) {
            r0 = this;
            if (r1 == 0) goto L10
            boolean r0 = r0.isVMMem(r2)
            if (r0 == 0) goto Lb
            r0 = r2[r3]
            return r0
        Lb:
            r0 = r2[r3]
            r0 = r0 & 255(0xff, float:3.57E-43)
            return r0
        L10:
            boolean r0 = r0.isVMMem(r2)
            if (r0 == 0) goto L1b
            int r0 = com.github.junrar.io.Raw.readIntLittleEndian(r2, r3)
            return r0
        L1b:
            int r0 = com.github.junrar.io.Raw.readIntBigEndian(r2, r3)
            return r0
    }

    private boolean isVMMem(byte[] r1) {
            r0 = this;
            byte[] r0 = r0.mem
            if (r0 != r1) goto L6
            r0 = 1
            return r0
        L6:
            r0 = 0
            return r0
    }

    private void optimize(com.github.junrar.unpack.vm.VMPreparedProgram r5) {
            r4 = this;
            java.util.List r4 = r5.getCmd()
            java.util.Iterator r5 = r4.iterator()
        L8:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto Lf1
            java.lang.Object r0 = r5.next()
            com.github.junrar.unpack.vm.VMPreparedCommand r0 = (com.github.junrar.unpack.vm.VMPreparedCommand) r0
            int[] r1 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands
            com.github.junrar.unpack.vm.VMCommands r2 = r0.getOpCode()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 1
            if (r1 == r2) goto Le1
            r3 = 4
            if (r1 == r3) goto Ld1
            byte[] r1 = com.github.junrar.unpack.vm.VMCmdFlags.VM_CmdFlags
            com.github.junrar.unpack.vm.VMCommands r3 = r0.getOpCode()
            int r3 = r3.getVMCommand()
            r1 = r1[r3]
            r1 = r1 & 64
            if (r1 != 0) goto L37
            goto L8
        L37:
            int r1 = r4.indexOf(r0)
            int r1 = r1 + r2
        L3c:
            int r2 = r4.size()
            if (r1 >= r2) goto L61
            byte[] r2 = com.github.junrar.unpack.vm.VMCmdFlags.VM_CmdFlags
            java.lang.Object r3 = r4.get(r1)
            com.github.junrar.unpack.vm.VMPreparedCommand r3 = (com.github.junrar.unpack.vm.VMPreparedCommand) r3
            com.github.junrar.unpack.vm.VMCommands r3 = r3.getOpCode()
            int r3 = r3.getVMCommand()
            r2 = r2[r3]
            r3 = r2 & 56
            if (r3 == 0) goto L59
            goto L8
        L59:
            r2 = r2 & 64
            if (r2 == 0) goto L5e
            goto L61
        L5e:
            int r1 = r1 + 1
            goto L3c
        L61:
            int[] r1 = com.github.junrar.unpack.vm.RarVM.AnonymousClass1.$SwitchMap$com$github$junrar$unpack$vm$VMCommands
            com.github.junrar.unpack.vm.VMCommands r2 = r0.getOpCode()
            int r2 = r2.ordinal()
            r1 = r1[r2]
            r2 = 7
            if (r1 == r2) goto Lc1
            r2 = 10
            if (r1 == r2) goto Lb1
            r2 = 15
            if (r1 == r2) goto La1
            r2 = 18
            if (r1 == r2) goto L91
            r2 = 39
            if (r1 == r2) goto L81
            goto L8
        L81:
            boolean r1 = r0.isByteMode()
            if (r1 == 0) goto L8a
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_NEGB
            goto L8c
        L8a:
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_NEGD
        L8c:
            r0.setOpCode(r1)
            goto L8
        L91:
            boolean r1 = r0.isByteMode()
            if (r1 == 0) goto L9a
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_DECB
            goto L9c
        L9a:
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_DECD
        L9c:
            r0.setOpCode(r1)
            goto L8
        La1:
            boolean r1 = r0.isByteMode()
            if (r1 == 0) goto Laa
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_INCB
            goto Lac
        Laa:
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_INCD
        Lac:
            r0.setOpCode(r1)
            goto L8
        Lb1:
            boolean r1 = r0.isByteMode()
            if (r1 == 0) goto Lba
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_SUBB
            goto Lbc
        Lba:
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_SUBD
        Lbc:
            r0.setOpCode(r1)
            goto L8
        Lc1:
            boolean r1 = r0.isByteMode()
            if (r1 == 0) goto Lca
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_ADDB
            goto Lcc
        Lca:
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_ADDD
        Lcc:
            r0.setOpCode(r1)
            goto L8
        Ld1:
            boolean r1 = r0.isByteMode()
            if (r1 == 0) goto Lda
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_CMPB
            goto Ldc
        Lda:
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_CMPD
        Ldc:
            r0.setOpCode(r1)
            goto L8
        Le1:
            boolean r1 = r0.isByteMode()
            if (r1 == 0) goto Lea
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_MOVB
            goto Lec
        Lea:
            com.github.junrar.unpack.vm.VMCommands r1 = com.github.junrar.unpack.vm.VMCommands.VM_MOVD
        Lec:
            r0.setOpCode(r1)
            goto L8
        Lf1:
            return
    }

    private boolean setIP(int r3) {
            r2 = this;
            int r0 = r2.codeSize
            r1 = 1
            if (r3 < r0) goto L6
            return r1
        L6:
            int r0 = r2.maxOpCount
            int r0 = r0 - r1
            r2.maxOpCount = r0
            if (r0 > 0) goto Lf
            r2 = 0
            return r2
        Lf:
            r2.IP = r3
            return r1
    }

    private void setValue(boolean r1, byte[] r2, int r3, int r4) {
            r0 = this;
            if (r1 == 0) goto L15
            boolean r0 = r0.isVMMem(r2)
            if (r0 == 0) goto Lc
            byte r0 = (byte) r4
            r2[r3] = r0
            return
        Lc:
            r0 = r2[r3]
            r0 = r4 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            byte r0 = (byte) r0
            r2[r3] = r0
            return
        L15:
            boolean r0 = r0.isVMMem(r2)
            if (r0 == 0) goto L1f
            com.github.junrar.io.Raw.writeIntLittleEndian(r2, r3, r4)
            return
        L1f:
            com.github.junrar.io.Raw.writeIntBigEndian(r2, r3, r4)
            return
    }

    public void execute(com.github.junrar.unpack.vm.VMPreparedProgram r12) {
            r11 = this;
            r0 = 0
            r1 = r0
        L2:
            int[] r2 = r12.getInitR()
            int r2 = r2.length
            if (r1 >= r2) goto L16
            int[] r2 = r11.R
            int[] r3 = r12.getInitR()
            r3 = r3[r1]
            r2[r1] = r3
            int r1 = r1 + 1
            goto L2
        L16:
            java.util.Vector r1 = r12.getGlobalData()
            int r1 = r1.size()
            r2 = 8192(0x2000, float:1.148E-41)
            int r1 = java.lang.Math.min(r1, r2)
            long r1 = (long) r1
            r3 = 0
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            r6 = 245760(0x3c000, float:3.44383E-40)
            if (r5 == 0) goto L4b
            r5 = r0
        L2f:
            long r7 = (long) r5
            int r7 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r7 >= 0) goto L4b
            byte[] r7 = r11.mem
            int r8 = r5 + r6
            java.util.Vector r9 = r12.getGlobalData()
            java.lang.Object r9 = r9.get(r5)
            java.lang.Byte r9 = (java.lang.Byte) r9
            byte r9 = r9.byteValue()
            r7[r8] = r9
            int r5 = r5 + 1
            goto L2f
        L4b:
            java.util.Vector r5 = r12.getStaticData()
            int r5 = r5.size()
            long r7 = (long) r5
            r9 = 8192(0x2000, double:4.0474E-320)
            long r9 = r9 - r1
            long r7 = java.lang.Math.min(r7, r9)
            int r3 = (r7 > r3 ? 1 : (r7 == r3 ? 0 : -1))
            if (r3 == 0) goto L7d
            r3 = r0
        L60:
            long r4 = (long) r3
            int r4 = (r4 > r7 ? 1 : (r4 == r7 ? 0 : -1))
            if (r4 >= 0) goto L7d
            byte[] r4 = r11.mem
            int r5 = (int) r1
            int r5 = r5 + r6
            int r5 = r5 + r3
            java.util.Vector r9 = r12.getStaticData()
            java.lang.Object r9 = r9.get(r3)
            java.lang.Byte r9 = (java.lang.Byte) r9
            byte r9 = r9.byteValue()
            r4[r5] = r9
            int r3 = r3 + 1
            goto L60
        L7d:
            int[] r1 = r11.R
            r2 = 7
            r3 = 262144(0x40000, float:3.67342E-40)
            r1[r2] = r3
            r11.flags = r0
            java.util.List r1 = r12.getAltCmd()
            int r1 = r1.size()
            if (r1 == 0) goto L95
            java.util.List r1 = r12.getAltCmd()
            goto L99
        L95:
            java.util.List r1 = r12.getCmd()
        L99:
            int r2 = r12.getCmdCount()
            boolean r2 = r11.ExecuteCode(r1, r2)
            if (r2 != 0) goto Lae
            java.lang.Object r1 = r1.get(r0)
            com.github.junrar.unpack.vm.VMPreparedCommand r1 = (com.github.junrar.unpack.vm.VMPreparedCommand) r1
            com.github.junrar.unpack.vm.VMCommands r2 = com.github.junrar.unpack.vm.VMCommands.VM_RET
            r1.setOpCode(r2)
        Lae:
            byte[] r1 = r11.mem
            r2 = 245792(0x3c020, float:3.44428E-40)
            int r1 = r11.getValue(r0, r1, r2)
            r2 = 262143(0x3ffff, float:3.6734E-40)
            r1 = r1 & r2
            byte[] r4 = r11.mem
            r5 = 245788(0x3c01c, float:3.44422E-40)
            int r4 = r11.getValue(r0, r4, r5)
            r2 = r2 & r4
            int r4 = r1 + r2
            if (r4 < r3) goto Lcb
            r1 = r0
            r2 = r1
        Lcb:
            r12.setFilteredDataOffset(r1)
            r12.setFilteredDataSize(r2)
            java.util.Vector r1 = r12.getGlobalData()
            r1.clear()
            byte[] r1 = r11.mem
            r2 = 245808(0x3c030, float:3.4445E-40)
            int r1 = r11.getValue(r0, r1, r2)
            r2 = 8128(0x1fc0, float:1.139E-41)
            int r1 = java.lang.Math.min(r1, r2)
            if (r1 == 0) goto L108
            java.util.Vector r2 = r12.getGlobalData()
            int r1 = r1 + 64
            r2.setSize(r1)
        Lf2:
            if (r0 >= r1) goto L108
            java.util.Vector r2 = r12.getGlobalData()
            byte[] r3 = r11.mem
            int r4 = r0 + r6
            r3 = r3[r4]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2.set(r0, r3)
            int r0 = r0 + 1
            goto Lf2
        L108:
            return
    }

    public byte[] getMem() {
            r0 = this;
            byte[] r0 = r0.mem
            return r0
    }

    public void init() {
            r1 = this;
            byte[] r0 = r1.mem
            if (r0 != 0) goto Lb
            r0 = 262148(0x40004, float:3.67348E-40)
            byte[] r0 = new byte[r0]
            r1.mem = r0
        Lb:
            return
    }

    public void prepare(byte[] r9, int r10, com.github.junrar.unpack.vm.VMPreparedProgram r11) {
            r8 = this;
            r8.InitBitInput()
            r0 = 32768(0x8000, float:4.5918E-41)
            int r1 = java.lang.Math.min(r0, r10)
            r2 = 0
            r3 = r2
        Lc:
            if (r3 >= r1) goto L1b
            byte[] r4 = r8.inBuf
            r5 = r4[r3]
            r6 = r9[r3]
            r5 = r5 | r6
            byte r5 = (byte) r5
            r4[r3] = r5
            int r3 = r3 + 1
            goto Lc
        L1b:
            r1 = 1
            r3 = r1
            r4 = r2
        L1e:
            if (r3 >= r10) goto L27
            r5 = r9[r3]
            r4 = r4 ^ r5
            byte r4 = (byte) r4
            int r3 = r3 + 1
            goto L1e
        L27:
            r3 = 8
            r8.faddbits(r3)
            r11.setCmdCount(r2)
            r5 = r9[r2]
            if (r4 != r5) goto L186
            com.github.junrar.unpack.vm.VMStandardFilters r9 = r8.IsStandardFilter(r9, r10)
            com.github.junrar.unpack.vm.VMStandardFilters r4 = com.github.junrar.unpack.vm.VMStandardFilters.VMSF_NONE
            if (r9 == r4) goto L70
            com.github.junrar.unpack.vm.VMPreparedCommand r10 = new com.github.junrar.unpack.vm.VMPreparedCommand
            r10.<init>()
            com.github.junrar.unpack.vm.VMCommands r4 = com.github.junrar.unpack.vm.VMCommands.VM_STANDARD
            r10.setOpCode(r4)
            com.github.junrar.unpack.vm.VMPreparedOperand r4 = r10.getOp1()
            int r9 = r9.getFilter()
            r4.setData(r9)
            com.github.junrar.unpack.vm.VMPreparedOperand r9 = r10.getOp1()
            com.github.junrar.unpack.vm.VMOpType r4 = com.github.junrar.unpack.vm.VMOpType.VM_OPNONE
            r9.setType(r4)
            com.github.junrar.unpack.vm.VMPreparedOperand r9 = r10.getOp2()
            r9.setType(r4)
            java.util.List r9 = r11.getCmd()
            r9.add(r10)
            int r9 = r11.getCmdCount()
            int r9 = r9 + r1
            r11.setCmdCount(r9)
            r10 = r2
        L70:
            int r9 = r8.fgetbits()
            r8.faddbits(r1)
            r9 = r9 & r0
            if (r9 == 0) goto La0
            ReadData(r8)
            r9 = r2
        L7e:
            int r4 = r8.inAddr
            if (r4 >= r10) goto La0
            long r4 = (long) r9
            r6 = 0
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 >= 0) goto La0
            java.util.Vector r4 = r11.getStaticData()
            int r5 = r8.fgetbits()
            int r5 = r5 >>> r3
            byte r5 = (byte) r5
            java.lang.Byte r5 = java.lang.Byte.valueOf(r5)
            r4.add(r5)
            r8.faddbits(r3)
            int r9 = r9 + 1
            goto L7e
        La0:
            int r9 = r8.inAddr
            if (r9 >= r10) goto L186
            com.github.junrar.unpack.vm.VMPreparedCommand r9 = new com.github.junrar.unpack.vm.VMPreparedCommand
            r9.<init>()
            int r4 = r8.fgetbits()
            r5 = r4 & r0
            r6 = 4
            if (r5 != 0) goto Lbf
            int r4 = r4 >>> 12
            com.github.junrar.unpack.vm.VMCommands r4 = com.github.junrar.unpack.vm.VMCommands.findVMCommand(r4)
            r9.setOpCode(r4)
            r8.faddbits(r6)
            goto Lce
        Lbf:
            int r4 = r4 >>> 10
            int r4 = r4 + (-24)
            com.github.junrar.unpack.vm.VMCommands r4 = com.github.junrar.unpack.vm.VMCommands.findVMCommand(r4)
            r9.setOpCode(r4)
            r4 = 6
            r8.faddbits(r4)
        Lce:
            byte[] r4 = com.github.junrar.unpack.vm.VMCmdFlags.VM_CmdFlags
            com.github.junrar.unpack.vm.VMCommands r5 = r9.getOpCode()
            int r5 = r5.getVMCommand()
            r4 = r4[r5]
            r4 = r4 & r6
            if (r4 == 0) goto Lef
            int r4 = r8.fgetbits()
            int r4 = r4 >>> 15
            if (r4 != r1) goto Le7
            r4 = r1
            goto Le8
        Le7:
            r4 = r2
        Le8:
            r9.setByteMode(r4)
            r8.faddbits(r1)
            goto Lf2
        Lef:
            r9.setByteMode(r2)
        Lf2:
            com.github.junrar.unpack.vm.VMPreparedOperand r4 = r9.getOp1()
            com.github.junrar.unpack.vm.VMOpType r5 = com.github.junrar.unpack.vm.VMOpType.VM_OPNONE
            r4.setType(r5)
            com.github.junrar.unpack.vm.VMPreparedOperand r4 = r9.getOp2()
            r4.setType(r5)
            byte[] r4 = com.github.junrar.unpack.vm.VMCmdFlags.VM_CmdFlags
            com.github.junrar.unpack.vm.VMCommands r5 = r9.getOpCode()
            int r5 = r5.getVMCommand()
            r4 = r4[r5]
            r4 = r4 & 3
            if (r4 <= 0) goto L175
            com.github.junrar.unpack.vm.VMPreparedOperand r5 = r9.getOp1()
            boolean r6 = r9.isByteMode()
            r8.decodeArg(r5, r6)
            r5 = 2
            if (r4 != r5) goto L12c
            com.github.junrar.unpack.vm.VMPreparedOperand r4 = r9.getOp2()
            boolean r5 = r9.isByteMode()
            r8.decodeArg(r4, r5)
            goto L175
        L12c:
            com.github.junrar.unpack.vm.VMPreparedOperand r4 = r9.getOp1()
            com.github.junrar.unpack.vm.VMOpType r4 = r4.getType()
            com.github.junrar.unpack.vm.VMOpType r5 = com.github.junrar.unpack.vm.VMOpType.VM_OPINT
            if (r4 != r5) goto L175
            byte[] r4 = com.github.junrar.unpack.vm.VMCmdFlags.VM_CmdFlags
            com.github.junrar.unpack.vm.VMCommands r5 = r9.getOpCode()
            int r5 = r5.getVMCommand()
            r4 = r4[r5]
            r4 = r4 & 24
            if (r4 == 0) goto L175
            com.github.junrar.unpack.vm.VMPreparedOperand r4 = r9.getOp1()
            int r4 = r4.getData()
            r5 = 256(0x100, float:3.59E-43)
            if (r4 < r5) goto L157
            int r4 = r4 + (-256)
            goto L16e
        L157:
            r5 = 136(0x88, float:1.9E-43)
            if (r4 < r5) goto L15e
            int r4 = r4 + (-264)
            goto L169
        L15e:
            r5 = 16
            if (r4 < r5) goto L165
            int r4 = r4 + (-8)
            goto L169
        L165:
            if (r4 < r3) goto L169
            int r4 = r4 + (-16)
        L169:
            int r5 = r11.getCmdCount()
            int r4 = r4 + r5
        L16e:
            com.github.junrar.unpack.vm.VMPreparedOperand r5 = r9.getOp1()
            r5.setData(r4)
        L175:
            int r4 = r11.getCmdCount()
            int r4 = r4 + r1
            r11.setCmdCount(r4)
            java.util.List r4 = r11.getCmd()
            r4.add(r9)
            goto La0
        L186:
            com.github.junrar.unpack.vm.VMPreparedCommand r9 = new com.github.junrar.unpack.vm.VMPreparedCommand
            r9.<init>()
            com.github.junrar.unpack.vm.VMCommands r0 = com.github.junrar.unpack.vm.VMCommands.VM_RET
            r9.setOpCode(r0)
            com.github.junrar.unpack.vm.VMPreparedOperand r0 = r9.getOp1()
            com.github.junrar.unpack.vm.VMOpType r2 = com.github.junrar.unpack.vm.VMOpType.VM_OPNONE
            r0.setType(r2)
            com.github.junrar.unpack.vm.VMPreparedOperand r0 = r9.getOp2()
            r0.setType(r2)
            java.util.List r0 = r11.getCmd()
            r0.add(r9)
            int r9 = r11.getCmdCount()
            int r9 = r9 + r1
            r11.setCmdCount(r9)
            if (r10 == 0) goto L1b4
            r8.optimize(r11)
        L1b4:
            return
    }

    public void setLowEndianValue(java.util.Vector<java.lang.Byte> r2, int r3, int r4) {
            r1 = this;
            r1 = r4 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r2.set(r3, r1)
            int r1 = r3 + 1
            int r0 = r4 >>> 8
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r2.set(r1, r0)
            int r1 = r3 + 2
            int r0 = r4 >>> 16
            r0 = r0 & 255(0xff, float:3.57E-43)
            byte r0 = (byte) r0
            java.lang.Byte r0 = java.lang.Byte.valueOf(r0)
            r2.set(r1, r0)
            int r3 = r3 + 3
            int r1 = r4 >>> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            byte r1 = (byte) r1
            java.lang.Byte r1 = java.lang.Byte.valueOf(r1)
            r2.set(r3, r1)
            return
    }

    public void setLowEndianValue(byte[] r1, int r2, int r3) {
            r0 = this;
            com.github.junrar.io.Raw.writeIntLittleEndian(r1, r2, r3)
            return
    }

    public void setMemory(int r6, byte[] r7, int r8, int r9) {
            r5 = this;
            r0 = 262144(0x40000, float:3.67342E-40)
            if (r6 >= r0) goto L1f
            r1 = 0
        L5:
            int r2 = r7.length
            int r2 = r2 - r8
            int r2 = java.lang.Math.min(r2, r9)
            if (r1 >= r2) goto L1f
            int r2 = r0 - r6
            if (r2 >= r1) goto L12
            goto L1f
        L12:
            byte[] r2 = r5.mem
            int r3 = r6 + r1
            int r4 = r8 + r1
            r4 = r7[r4]
            r2[r3] = r4
            int r1 = r1 + 1
            goto L5
        L1f:
            return
    }
}

package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sa2  reason: default package */
/* loaded from: classes.dex */
public enum sa2 extends java.lang.Enum {
    private static final /* synthetic */ defpackage.sa2[] $VALUES = null;
    public static final defpackage.sa2 BOOL = null;
    public static final defpackage.sa2 BOOL_LIST = null;
    public static final defpackage.sa2 BOOL_LIST_PACKED = null;
    public static final defpackage.sa2 BYTES = null;
    public static final defpackage.sa2 BYTES_LIST = null;
    public static final defpackage.sa2 DOUBLE = null;
    public static final defpackage.sa2 DOUBLE_LIST = null;
    public static final defpackage.sa2 DOUBLE_LIST_PACKED = null;
    private static final java.lang.reflect.Type[] EMPTY_TYPES = null;
    public static final defpackage.sa2 ENUM = null;
    public static final defpackage.sa2 ENUM_LIST = null;
    public static final defpackage.sa2 ENUM_LIST_PACKED = null;
    public static final defpackage.sa2 FIXED32 = null;
    public static final defpackage.sa2 FIXED32_LIST = null;
    public static final defpackage.sa2 FIXED32_LIST_PACKED = null;
    public static final defpackage.sa2 FIXED64 = null;
    public static final defpackage.sa2 FIXED64_LIST = null;
    public static final defpackage.sa2 FIXED64_LIST_PACKED = null;
    public static final defpackage.sa2 FLOAT = null;
    public static final defpackage.sa2 FLOAT_LIST = null;
    public static final defpackage.sa2 FLOAT_LIST_PACKED = null;
    public static final defpackage.sa2 GROUP = null;
    public static final defpackage.sa2 GROUP_LIST = null;
    public static final defpackage.sa2 INT32 = null;
    public static final defpackage.sa2 INT32_LIST = null;
    public static final defpackage.sa2 INT32_LIST_PACKED = null;
    public static final defpackage.sa2 INT64 = null;
    public static final defpackage.sa2 INT64_LIST = null;
    public static final defpackage.sa2 INT64_LIST_PACKED = null;
    public static final defpackage.sa2 MAP = null;
    public static final defpackage.sa2 MESSAGE = null;
    public static final defpackage.sa2 MESSAGE_LIST = null;
    public static final defpackage.sa2 SFIXED32 = null;
    public static final defpackage.sa2 SFIXED32_LIST = null;
    public static final defpackage.sa2 SFIXED32_LIST_PACKED = null;
    public static final defpackage.sa2 SFIXED64 = null;
    public static final defpackage.sa2 SFIXED64_LIST = null;
    public static final defpackage.sa2 SFIXED64_LIST_PACKED = null;
    public static final defpackage.sa2 SINT32 = null;
    public static final defpackage.sa2 SINT32_LIST = null;
    public static final defpackage.sa2 SINT32_LIST_PACKED = null;
    public static final defpackage.sa2 SINT64 = null;
    public static final defpackage.sa2 SINT64_LIST = null;
    public static final defpackage.sa2 SINT64_LIST_PACKED = null;
    public static final defpackage.sa2 STRING = null;
    public static final defpackage.sa2 STRING_LIST = null;
    public static final defpackage.sa2 UINT32 = null;
    public static final defpackage.sa2 UINT32_LIST = null;
    public static final defpackage.sa2 UINT32_LIST_PACKED = null;
    public static final defpackage.sa2 UINT64 = null;
    public static final defpackage.sa2 UINT64_LIST = null;
    public static final defpackage.sa2 UINT64_LIST_PACKED = null;
    private static final defpackage.sa2[] VALUES = null;
    private final defpackage.sa2.a collection;
    private final java.lang.Class<?> elementType;
    private final int id;
    private final defpackage.pc3 javaType;
    private final boolean primitiveScalar;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: sa2$a */
    /* loaded from: classes.dex */
    public enum a extends java.lang.Enum {
        private static final /* synthetic */ defpackage.sa2.a[] $VALUES = null;
        public static final defpackage.sa2.a MAP = null;
        public static final defpackage.sa2.a PACKED_VECTOR = null;
        public static final defpackage.sa2.a SCALAR = null;
        public static final defpackage.sa2.a VECTOR = null;
        private final boolean isList;

        static {
                sa2$a r0 = new sa2$a
                java.lang.String r1 = "SCALAR"
                r2 = 0
                r0.<init>(r1, r2, r2)
                defpackage.sa2.a.SCALAR = r0
                sa2$a r1 = new sa2$a
                java.lang.String r3 = "VECTOR"
                r4 = 1
                r1.<init>(r3, r4, r4)
                defpackage.sa2.a.VECTOR = r1
                sa2$a r3 = new sa2$a
                java.lang.String r5 = "PACKED_VECTOR"
                r6 = 2
                r3.<init>(r5, r6, r4)
                defpackage.sa2.a.PACKED_VECTOR = r3
                sa2$a r4 = new sa2$a
                java.lang.String r5 = "MAP"
                r6 = 3
                r4.<init>(r5, r6, r2)
                defpackage.sa2.a.MAP = r4
                sa2$a[] r0 = new defpackage.sa2.a[]{r0, r1, r3, r4}
                defpackage.sa2.a.$VALUES = r0
                return
        }

        a(java.lang.String r1, int r2, boolean r3) {
                r0 = this;
                r0.<init>(r1, r2)
                r0.isList = r3
                return
        }

        public static defpackage.sa2.a valueOf(java.lang.String r1) {
                java.lang.Class<sa2$a> r0 = defpackage.sa2.a.class
                java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
                sa2$a r1 = (defpackage.sa2.a) r1
                return r1
        }

        public static defpackage.sa2.a[] values() {
                sa2$a[] r0 = defpackage.sa2.a.$VALUES
                java.lang.Object r0 = r0.clone()
                sa2$a[] r0 = (defpackage.sa2.a[]) r0
                return r0
        }

        public boolean isList() {
                r0 = this;
                boolean r0 = r0.isList
                return r0
        }
    }

    static {
            sa2 r0 = new sa2
            sa2$a r5 = defpackage.sa2.a.SCALAR
            pc3 r11 = defpackage.pc3.DOUBLE
            java.lang.String r1 = "DOUBLE"
            r2 = 0
            r3 = 0
            r4 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            r5 = r4
            defpackage.sa2.DOUBLE = r0
            sa2 r1 = new sa2
            pc3 r17 = defpackage.pc3.FLOAT
            java.lang.String r2 = "FLOAT"
            r3 = 1
            r4 = 1
            r6 = r17
            r1.<init>(r2, r3, r4, r5, r6)
            r18 = r1
            defpackage.sa2.FLOAT = r18
            sa2 r1 = new sa2
            pc3 r24 = defpackage.pc3.LONG
            java.lang.String r2 = "INT64"
            r3 = 2
            r4 = 2
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)
            r25 = r1
            defpackage.sa2.INT64 = r25
            sa2 r1 = new sa2
            r3 = 3
            r4 = 3
            java.lang.String r2 = "UINT64"
            r1.<init>(r2, r3, r4, r5, r6)
            r26 = r1
            defpackage.sa2.UINT64 = r26
            sa2 r1 = new sa2
            pc3 r32 = defpackage.pc3.INT
            java.lang.String r2 = "INT32"
            r3 = 4
            r4 = 4
            r6 = r32
            r1.<init>(r2, r3, r4, r5, r6)
            r33 = r1
            defpackage.sa2.INT32 = r33
            sa2 r1 = new sa2
            r3 = 5
            r4 = 5
            java.lang.String r2 = "FIXED64"
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)
            r34 = r1
            defpackage.sa2.FIXED64 = r34
            sa2 r1 = new sa2
            r3 = 6
            r4 = 6
            java.lang.String r2 = "FIXED32"
            r6 = r32
            r1.<init>(r2, r3, r4, r5, r6)
            r35 = r1
            defpackage.sa2.FIXED32 = r35
            sa2 r1 = new sa2
            pc3 r41 = defpackage.pc3.BOOLEAN
            java.lang.String r2 = "BOOL"
            r3 = 7
            r4 = 7
            r6 = r41
            r1.<init>(r2, r3, r4, r5, r6)
            r42 = r1
            defpackage.sa2.BOOL = r42
            sa2 r1 = new sa2
            pc3 r48 = defpackage.pc3.STRING
            java.lang.String r2 = "STRING"
            r3 = 8
            r4 = 8
            r6 = r48
            r1.<init>(r2, r3, r4, r5, r6)
            r49 = r1
            defpackage.sa2.STRING = r49
            sa2 r1 = new sa2
            pc3 r6 = defpackage.pc3.MESSAGE
            java.lang.String r2 = "MESSAGE"
            r3 = 9
            r4 = 9
            r1.<init>(r2, r3, r4, r5, r6)
            r56 = r1
            r55 = r6
            defpackage.sa2.MESSAGE = r56
            sa2 r1 = new sa2
            pc3 r6 = defpackage.pc3.BYTE_STRING
            java.lang.String r2 = "BYTES"
            r3 = 10
            r4 = 10
            r1.<init>(r2, r3, r4, r5, r6)
            r63 = r1
            r62 = r6
            defpackage.sa2.BYTES = r63
            sa2 r1 = new sa2
            r3 = 11
            r4 = 11
            java.lang.String r2 = "UINT32"
            r6 = r32
            r1.<init>(r2, r3, r4, r5, r6)
            r64 = r1
            defpackage.sa2.UINT32 = r64
            sa2 r1 = new sa2
            pc3 r70 = defpackage.pc3.ENUM
            java.lang.String r2 = "ENUM"
            r3 = 12
            r4 = 12
            r6 = r70
            r1.<init>(r2, r3, r4, r5, r6)
            r71 = r1
            defpackage.sa2.ENUM = r71
            sa2 r1 = new sa2
            r3 = 13
            r4 = 13
            java.lang.String r2 = "SFIXED32"
            r6 = r32
            r1.<init>(r2, r3, r4, r5, r6)
            r72 = r1
            defpackage.sa2.SFIXED32 = r72
            sa2 r1 = new sa2
            r3 = 14
            r4 = 14
            java.lang.String r2 = "SFIXED64"
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)
            r73 = r1
            defpackage.sa2.SFIXED64 = r73
            sa2 r16 = new sa2
            r3 = 15
            r4 = 15
            java.lang.String r2 = "SINT32"
            r1 = r16
            r6 = r32
            r1.<init>(r2, r3, r4, r5, r6)
            r74 = r1
            defpackage.sa2.SINT32 = r74
            sa2 r1 = new sa2
            r3 = 16
            r4 = 16
            java.lang.String r2 = "SINT64"
            r6 = r24
            r1.<init>(r2, r3, r4, r5, r6)
            r75 = r1
            defpackage.sa2.SINT64 = r75
            sa2 r1 = new sa2
            r3 = 17
            r4 = 17
            java.lang.String r2 = "GROUP"
            r6 = r55
            r1.<init>(r2, r3, r4, r5, r6)
            defpackage.sa2.GROUP = r1
            sa2 r19 = new sa2
            sa2$a r23 = defpackage.sa2.a.VECTOR
            java.lang.String r7 = "DOUBLE_LIST"
            r8 = 18
            r9 = 18
            r6 = r19
            r10 = r23
            r6.<init>(r7, r8, r9, r10, r11)
            r2 = r6
            defpackage.sa2.DOUBLE_LIST = r2
            sa2 r20 = new sa2
            r14 = 19
            r15 = 19
            java.lang.String r13 = "FLOAT_LIST"
            r12 = r20
            r16 = r23
            r12.<init>(r13, r14, r15, r16, r17)
            r3 = r12
            defpackage.sa2.FLOAT_LIST = r3
            sa2 r19 = new sa2
            r21 = 20
            r22 = 20
            java.lang.String r20 = "INT64_LIST"
            r19.<init>(r20, r21, r22, r23, r24)
            r4 = r19
            defpackage.sa2.INT64_LIST = r4
            sa2 r19 = new sa2
            r21 = 21
            r22 = 21
            java.lang.String r20 = "UINT64_LIST"
            r19.<init>(r20, r21, r22, r23, r24)
            r5 = r19
            defpackage.sa2.UINT64_LIST = r5
            sa2 r27 = new sa2
            r29 = 22
            r30 = 22
            java.lang.String r28 = "INT32_LIST"
            r31 = r23
            r27.<init>(r28, r29, r30, r31, r32)
            r76 = r27
            defpackage.sa2.INT32_LIST = r76
            sa2 r19 = new sa2
            r21 = 23
            r22 = 23
            java.lang.String r20 = "FIXED64_LIST"
            r19.<init>(r20, r21, r22, r23, r24)
            r77 = r19
            defpackage.sa2.FIXED64_LIST = r77
            sa2 r27 = new sa2
            r29 = 24
            r30 = 24
            java.lang.String r28 = "FIXED32_LIST"
            r27.<init>(r28, r29, r30, r31, r32)
            r78 = r3
            r3 = r25
            r25 = r27
            defpackage.sa2.FIXED32_LIST = r25
            sa2 r36 = new sa2
            r38 = 25
            r39 = 25
            java.lang.String r37 = "BOOL_LIST"
            r40 = r23
            r36.<init>(r37, r38, r39, r40, r41)
            r79 = r4
            r4 = r26
            r26 = r36
            defpackage.sa2.BOOL_LIST = r26
            sa2 r43 = new sa2
            r45 = 26
            r46 = 26
            java.lang.String r44 = "STRING_LIST"
            r47 = r23
            r43.<init>(r44, r45, r46, r47, r48)
            defpackage.sa2.STRING_LIST = r43
            sa2 r50 = new sa2
            r52 = 27
            r53 = 27
            java.lang.String r51 = "MESSAGE_LIST"
            r54 = r23
            r50.<init>(r51, r52, r53, r54, r55)
            r44 = r50
            defpackage.sa2.MESSAGE_LIST = r44
            sa2 r57 = new sa2
            r59 = 28
            r60 = 28
            java.lang.String r58 = "BYTES_LIST"
            r61 = r23
            r57.<init>(r58, r59, r60, r61, r62)
            defpackage.sa2.BYTES_LIST = r57
            sa2 r27 = new sa2
            r29 = 29
            r30 = 29
            java.lang.String r28 = "UINT32_LIST"
            r27.<init>(r28, r29, r30, r31, r32)
            r45 = r27
            defpackage.sa2.UINT32_LIST = r45
            sa2 r65 = new sa2
            r67 = 30
            r68 = 30
            java.lang.String r66 = "ENUM_LIST"
            r69 = r23
            r65.<init>(r66, r67, r68, r69, r70)
            r46 = r65
            defpackage.sa2.ENUM_LIST = r46
            sa2 r27 = new sa2
            r29 = 31
            r30 = 31
            java.lang.String r28 = "SFIXED32_LIST"
            r27.<init>(r28, r29, r30, r31, r32)
            r47 = r27
            defpackage.sa2.SFIXED32_LIST = r47
            sa2 r19 = new sa2
            r21 = 32
            r22 = 32
            java.lang.String r20 = "SFIXED64_LIST"
            r19.<init>(r20, r21, r22, r23, r24)
            r48 = r5
            r5 = r33
            r33 = r19
            defpackage.sa2.SFIXED64_LIST = r33
            sa2 r27 = new sa2
            r29 = 33
            r30 = 33
            java.lang.String r28 = "SINT32_LIST"
            r27.<init>(r28, r29, r30, r31, r32)
            r58 = r34
            r34 = r27
            defpackage.sa2.SINT32_LIST = r34
            sa2 r19 = new sa2
            r21 = 34
            r22 = 34
            java.lang.String r20 = "SINT64_LIST"
            r19.<init>(r20, r21, r22, r23, r24)
            r59 = r35
            r35 = r19
            defpackage.sa2.SINT64_LIST = r35
            sa2 r36 = new sa2
            sa2$a r23 = defpackage.sa2.a.PACKED_VECTOR
            java.lang.String r7 = "DOUBLE_LIST_PACKED"
            r8 = 35
            r9 = 35
            r10 = r23
            r6 = r36
            r6.<init>(r7, r8, r9, r10, r11)
            defpackage.sa2.DOUBLE_LIST_PACKED = r6
            sa2 r37 = new sa2
            r14 = 36
            r15 = 36
            java.lang.String r13 = "FLOAT_LIST_PACKED"
            r16 = r23
            r12 = r37
            r12.<init>(r13, r14, r15, r16, r17)
            defpackage.sa2.FLOAT_LIST_PACKED = r12
            sa2 r19 = new sa2
            r21 = 37
            r22 = 37
            java.lang.String r20 = "INT64_LIST_PACKED"
            r19.<init>(r20, r21, r22, r23, r24)
            r7 = r19
            defpackage.sa2.INT64_LIST_PACKED = r7
            sa2 r19 = new sa2
            r21 = 38
            r22 = 38
            java.lang.String r20 = "UINT64_LIST_PACKED"
            r19.<init>(r20, r21, r22, r23, r24)
            r8 = r19
            defpackage.sa2.UINT64_LIST_PACKED = r8
            sa2 r40 = new sa2
            r29 = 39
            r30 = 39
            java.lang.String r28 = "INT32_LIST_PACKED"
            r31 = r23
            r27 = r40
            r27.<init>(r28, r29, r30, r31, r32)
            r9 = r27
            defpackage.sa2.INT32_LIST_PACKED = r9
            sa2 r19 = new sa2
            r21 = 40
            r22 = 40
            java.lang.String r20 = "FIXED64_LIST_PACKED"
            r19.<init>(r20, r21, r22, r23, r24)
            r10 = r19
            defpackage.sa2.FIXED64_LIST_PACKED = r10
            sa2 r27 = new sa2
            r29 = 41
            r30 = 41
            java.lang.String r28 = "FIXED32_LIST_PACKED"
            r27.<init>(r28, r29, r30, r31, r32)
            r11 = r8
            r8 = r42
            r42 = r27
            defpackage.sa2.FIXED32_LIST_PACKED = r42
            sa2 r36 = new sa2
            r38 = 42
            r39 = 42
            java.lang.String r37 = "BOOL_LIST_PACKED"
            r40 = r23
            r36.<init>(r37, r38, r39, r40, r41)
            defpackage.sa2.BOOL_LIST_PACKED = r36
            sa2 r27 = new sa2
            r29 = 43
            r30 = 43
            java.lang.String r28 = "UINT32_LIST_PACKED"
            r27.<init>(r28, r29, r30, r31, r32)
            r13 = r44
            r44 = r27
            defpackage.sa2.UINT32_LIST_PACKED = r44
            sa2 r65 = new sa2
            r67 = 44
            r68 = 44
            java.lang.String r66 = "ENUM_LIST_PACKED"
            r69 = r23
            r65.<init>(r66, r67, r68, r69, r70)
            defpackage.sa2.ENUM_LIST_PACKED = r65
            sa2 r27 = new sa2
            r29 = 45
            r30 = 45
            java.lang.String r28 = "SFIXED32_LIST_PACKED"
            r27.<init>(r28, r29, r30, r31, r32)
            r14 = r46
            r46 = r27
            defpackage.sa2.SFIXED32_LIST_PACKED = r46
            sa2 r19 = new sa2
            r21 = 46
            r22 = 46
            java.lang.String r20 = "SFIXED64_LIST_PACKED"
            r19.<init>(r20, r21, r22, r23, r24)
            r15 = r47
            r47 = r19
            defpackage.sa2.SFIXED64_LIST_PACKED = r47
            sa2 r27 = new sa2
            r29 = 47
            r30 = 47
            java.lang.String r28 = "SINT32_LIST_PACKED"
            r27.<init>(r28, r29, r30, r31, r32)
            defpackage.sa2.SINT32_LIST_PACKED = r27
            sa2 r19 = new sa2
            r21 = 48
            r22 = 48
            java.lang.String r20 = "SINT64_LIST_PACKED"
            r19.<init>(r20, r21, r22, r23, r24)
            defpackage.sa2.SINT64_LIST_PACKED = r19
            sa2 r50 = new sa2
            r52 = 49
            r53 = 49
            java.lang.String r51 = "GROUP_LIST"
            r50.<init>(r51, r52, r53, r54, r55)
            defpackage.sa2.GROUP_LIST = r50
            sa2 r80 = new sa2
            sa2$a r84 = defpackage.sa2.a.MAP
            pc3 r85 = defpackage.pc3.VOID
            java.lang.String r81 = "MAP"
            r82 = 50
            r83 = 50
            r80.<init>(r81, r82, r83, r84, r85)
            defpackage.sa2.MAP = r80
            r38 = r7
            r40 = r9
            r41 = r10
            r39 = r11
            r37 = r12
            r28 = r13
            r31 = r14
            r32 = r15
            r30 = r45
            r22 = r48
            r9 = r49
            r10 = r56
            r29 = r57
            r7 = r59
            r11 = r63
            r12 = r64
            r45 = r65
            r13 = r71
            r14 = r72
            r15 = r73
            r16 = r74
            r17 = r75
            r23 = r76
            r24 = r77
            r20 = r78
            r21 = r79
            r51 = r80
            r49 = r19
            r48 = r27
            r27 = r43
            r19 = r2
            r2 = r18
            r43 = r36
            r18 = r1
            r36 = r6
            r6 = r58
            r1 = r0
            sa2[] r0 = new defpackage.sa2[]{r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41, r42, r43, r44, r45, r46, r47, r48, r49, r50, r51}
            defpackage.sa2.$VALUES = r0
            r0 = 0
            java.lang.reflect.Type[] r1 = new java.lang.reflect.Type[r0]
            defpackage.sa2.EMPTY_TYPES = r1
            sa2[] r1 = values()
            int r2 = r1.length
            sa2[] r2 = new defpackage.sa2[r2]
            defpackage.sa2.VALUES = r2
            int r2 = r1.length
        L3af:
            if (r0 >= r2) goto L3bc
            r3 = r1[r0]
            sa2[] r4 = defpackage.sa2.VALUES
            int r5 = r3.id
            r4[r5] = r3
            int r0 = r0 + 1
            goto L3af
        L3bc:
            return
    }

    sa2(java.lang.String r1, int r2, int r3, defpackage.sa2.a r4, defpackage.pc3 r5) {
            r0 = this;
            r0.<init>(r1, r2)
            r0.id = r3
            r0.collection = r4
            r0.javaType = r5
            int[] r1 = defpackage.ra2.a
            int r2 = r4.ordinal()
            r1 = r1[r2]
            r2 = 2
            r3 = 1
            if (r1 == r3) goto L22
            if (r1 == r2) goto L1b
            r1 = 0
            r0.elementType = r1
            goto L28
        L1b:
            java.lang.Class r1 = r5.getBoxedType()
            r0.elementType = r1
            goto L28
        L22:
            java.lang.Class r1 = r5.getBoxedType()
            r0.elementType = r1
        L28:
            sa2$a r1 = defpackage.sa2.a.SCALAR
            if (r4 != r1) goto L3c
            int[] r1 = defpackage.ra2.b
            int r4 = r5.ordinal()
            r1 = r1[r4]
            if (r1 == r3) goto L3c
            if (r1 == r2) goto L3c
            r2 = 3
            if (r1 == r2) goto L3c
            goto L3d
        L3c:
            r3 = 0
        L3d:
            r0.primitiveScalar = r3
            return
    }

    public static defpackage.sa2 forId(int r2) {
            if (r2 < 0) goto Lb
            sa2[] r0 = defpackage.sa2.VALUES
            int r1 = r0.length
            if (r2 < r1) goto L8
            goto Lb
        L8:
            r2 = r0[r2]
            return r2
        Lb:
            r2 = 0
            return r2
    }

    private static java.lang.reflect.Type getGenericSuperList(java.lang.Class<?> r6) {
            java.lang.reflect.Type[] r0 = r6.getGenericInterfaces()
            int r1 = r0.length
            r2 = 0
        L6:
            java.lang.Class<java.util.List> r3 = java.util.List.class
            if (r2 >= r1) goto L23
            r4 = r0[r2]
            boolean r5 = r4 instanceof java.lang.reflect.ParameterizedType
            if (r5 == 0) goto L20
            r5 = r4
            java.lang.reflect.ParameterizedType r5 = (java.lang.reflect.ParameterizedType) r5
            java.lang.reflect.Type r5 = r5.getRawType()
            java.lang.Class r5 = (java.lang.Class) r5
            boolean r3 = r3.isAssignableFrom(r5)
            if (r3 == 0) goto L20
            return r4
        L20:
            int r2 = r2 + 1
            goto L6
        L23:
            java.lang.reflect.Type r6 = r6.getGenericSuperclass()
            boolean r0 = r6 instanceof java.lang.reflect.ParameterizedType
            if (r0 == 0) goto L3b
            r0 = r6
            java.lang.reflect.ParameterizedType r0 = (java.lang.reflect.ParameterizedType) r0
            java.lang.reflect.Type r0 = r0.getRawType()
            java.lang.Class r0 = (java.lang.Class) r0
            boolean r0 = r3.isAssignableFrom(r0)
            if (r0 == 0) goto L3b
            return r6
        L3b:
            r6 = 0
            return r6
    }

    private static java.lang.reflect.Type getListParameter(java.lang.Class<?> r9, java.lang.reflect.Type[] r10) {
        L0:
            r0 = 0
            java.lang.Class<java.util.List> r1 = java.util.List.class
            r2 = 0
            if (r9 == r1) goto L68
            java.lang.reflect.Type r3 = getGenericSuperList(r9)
            boolean r4 = r3 instanceof java.lang.reflect.ParameterizedType
            if (r4 == 0) goto L4d
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type[] r1 = r3.getActualTypeArguments()
            r4 = r2
        L15:
            int r5 = r1.length
            if (r4 >= r5) goto L45
            r5 = r1[r4]
            boolean r6 = r5 instanceof java.lang.reflect.TypeVariable
            if (r6 == 0) goto L42
            java.lang.reflect.TypeVariable[] r6 = r9.getTypeParameters()
            int r7 = r10.length
            int r8 = r6.length
            if (r7 != r8) goto L3c
            r7 = r2
        L27:
            int r8 = r6.length
            if (r7 >= r8) goto L36
            r8 = r6[r7]
            if (r5 != r8) goto L33
            r5 = r10[r7]
            r1[r4] = r5
            goto L42
        L33:
            int r7 = r7 + 1
            goto L27
        L36:
            java.lang.String r9 = "Unable to find replacement for "
            defpackage.e41.p(r5, r9)
            return r0
        L3c:
            java.lang.String r9 = "Type array mismatch"
            defpackage.u34.j(r9)
            return r0
        L42:
            int r4 = r4 + 1
            goto L15
        L45:
            java.lang.reflect.Type r9 = r3.getRawType()
            java.lang.Class r9 = (java.lang.Class) r9
            r10 = r1
            goto L0
        L4d:
            java.lang.reflect.Type[] r10 = defpackage.sa2.EMPTY_TYPES
            java.lang.Class[] r0 = r9.getInterfaces()
            int r3 = r0.length
        L54:
            if (r2 >= r3) goto L63
            r4 = r0[r2]
            boolean r5 = r1.isAssignableFrom(r4)
            if (r5 == 0) goto L60
            r9 = r4
            goto L0
        L60:
            int r2 = r2 + 1
            goto L54
        L63:
            java.lang.Class r9 = r9.getSuperclass()
            goto L0
        L68:
            int r9 = r10.length
            r1 = 1
            if (r9 != r1) goto L6f
            r9 = r10[r2]
            return r9
        L6f:
            java.lang.String r9 = "Unable to identify parameter type for List<T>"
            defpackage.u34.j(r9)
            return r0
    }

    private boolean isValidForList(java.lang.reflect.Field r4) {
            r3 = this;
            java.lang.Class r0 = r4.getType()
            pc3 r1 = r3.javaType
            java.lang.Class r1 = r1.getType()
            boolean r1 = r1.isAssignableFrom(r0)
            if (r1 != 0) goto L12
            r3 = 0
            return r3
        L12:
            java.lang.reflect.Type[] r1 = defpackage.sa2.EMPTY_TYPES
            java.lang.reflect.Type r2 = r4.getGenericType()
            boolean r2 = r2 instanceof java.lang.reflect.ParameterizedType
            if (r2 == 0) goto L26
            java.lang.reflect.Type r4 = r4.getGenericType()
            java.lang.reflect.ParameterizedType r4 = (java.lang.reflect.ParameterizedType) r4
            java.lang.reflect.Type[] r1 = r4.getActualTypeArguments()
        L26:
            java.lang.reflect.Type r4 = getListParameter(r0, r1)
            boolean r0 = r4 instanceof java.lang.Class
            if (r0 != 0) goto L30
            r3 = 1
            return r3
        L30:
            java.lang.Class<?> r3 = r3.elementType
            java.lang.Class r4 = (java.lang.Class) r4
            boolean r3 = r3.isAssignableFrom(r4)
            return r3
    }

    public static defpackage.sa2 valueOf(java.lang.String r1) {
            java.lang.Class<sa2> r0 = defpackage.sa2.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            sa2 r1 = (defpackage.sa2) r1
            return r1
    }

    public static defpackage.sa2[] values() {
            sa2[] r0 = defpackage.sa2.$VALUES
            java.lang.Object r0 = r0.clone()
            sa2[] r0 = (defpackage.sa2[]) r0
            return r0
    }

    public defpackage.pc3 getJavaType() {
            r0 = this;
            pc3 r0 = r0.javaType
            return r0
    }

    public int id() {
            r0 = this;
            int r0 = r0.id
            return r0
    }

    public boolean isList() {
            r0 = this;
            sa2$a r0 = r0.collection
            boolean r0 = r0.isList()
            return r0
    }

    public boolean isMap() {
            r1 = this;
            sa2$a r1 = r1.collection
            sa2$a r0 = defpackage.sa2.a.MAP
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean isPacked() {
            r1 = this;
            sa2$a r0 = defpackage.sa2.a.PACKED_VECTOR
            sa2$a r1 = r1.collection
            boolean r1 = r0.equals(r1)
            return r1
    }

    public boolean isPrimitiveScalar() {
            r0 = this;
            boolean r0 = r0.primitiveScalar
            return r0
    }

    public boolean isScalar() {
            r1 = this;
            sa2$a r1 = r1.collection
            sa2$a r0 = defpackage.sa2.a.SCALAR
            if (r1 != r0) goto L8
            r1 = 1
            return r1
        L8:
            r1 = 0
            return r1
    }

    public boolean isValidForField(java.lang.reflect.Field r3) {
            r2 = this;
            sa2$a r0 = defpackage.sa2.a.VECTOR
            sa2$a r1 = r2.collection
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto Lf
            boolean r2 = r2.isValidForList(r3)
            return r2
        Lf:
            pc3 r2 = r2.javaType
            java.lang.Class r2 = r2.getType()
            java.lang.Class r3 = r3.getType()
            boolean r2 = r2.isAssignableFrom(r3)
            return r2
    }
}

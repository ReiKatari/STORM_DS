package com.github.junrar.unpack.decode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public enum CodeType extends java.lang.Enum<com.github.junrar.unpack.decode.CodeType> {
    private static final /* synthetic */ com.github.junrar.unpack.decode.CodeType[] $VALUES = null;
    public static final com.github.junrar.unpack.decode.CodeType CODE_CACHELZ = null;
    public static final com.github.junrar.unpack.decode.CodeType CODE_ENDFILE = null;
    public static final com.github.junrar.unpack.decode.CodeType CODE_HUFFMAN = null;
    public static final com.github.junrar.unpack.decode.CodeType CODE_LZ = null;
    public static final com.github.junrar.unpack.decode.CodeType CODE_LZ2 = null;
    public static final com.github.junrar.unpack.decode.CodeType CODE_REPEATLZ = null;
    public static final com.github.junrar.unpack.decode.CodeType CODE_STARTFILE = null;
    public static final com.github.junrar.unpack.decode.CodeType CODE_VM = null;
    public static final com.github.junrar.unpack.decode.CodeType CODE_VMDATA = null;

    static {
            com.github.junrar.unpack.decode.CodeType r0 = new com.github.junrar.unpack.decode.CodeType
            java.lang.String r1 = "CODE_HUFFMAN"
            r2 = 0
            r0.<init>(r1, r2)
            com.github.junrar.unpack.decode.CodeType.CODE_HUFFMAN = r0
            com.github.junrar.unpack.decode.CodeType r1 = new com.github.junrar.unpack.decode.CodeType
            java.lang.String r2 = "CODE_LZ"
            r3 = 1
            r1.<init>(r2, r3)
            com.github.junrar.unpack.decode.CodeType.CODE_LZ = r1
            com.github.junrar.unpack.decode.CodeType r2 = new com.github.junrar.unpack.decode.CodeType
            java.lang.String r3 = "CODE_LZ2"
            r4 = 2
            r2.<init>(r3, r4)
            com.github.junrar.unpack.decode.CodeType.CODE_LZ2 = r2
            com.github.junrar.unpack.decode.CodeType r3 = new com.github.junrar.unpack.decode.CodeType
            java.lang.String r4 = "CODE_REPEATLZ"
            r5 = 3
            r3.<init>(r4, r5)
            com.github.junrar.unpack.decode.CodeType.CODE_REPEATLZ = r3
            com.github.junrar.unpack.decode.CodeType r4 = new com.github.junrar.unpack.decode.CodeType
            java.lang.String r5 = "CODE_CACHELZ"
            r6 = 4
            r4.<init>(r5, r6)
            com.github.junrar.unpack.decode.CodeType.CODE_CACHELZ = r4
            com.github.junrar.unpack.decode.CodeType r5 = new com.github.junrar.unpack.decode.CodeType
            java.lang.String r6 = "CODE_STARTFILE"
            r7 = 5
            r5.<init>(r6, r7)
            com.github.junrar.unpack.decode.CodeType.CODE_STARTFILE = r5
            com.github.junrar.unpack.decode.CodeType r6 = new com.github.junrar.unpack.decode.CodeType
            java.lang.String r7 = "CODE_ENDFILE"
            r8 = 6
            r6.<init>(r7, r8)
            com.github.junrar.unpack.decode.CodeType.CODE_ENDFILE = r6
            com.github.junrar.unpack.decode.CodeType r7 = new com.github.junrar.unpack.decode.CodeType
            java.lang.String r8 = "CODE_VM"
            r9 = 7
            r7.<init>(r8, r9)
            com.github.junrar.unpack.decode.CodeType.CODE_VM = r7
            com.github.junrar.unpack.decode.CodeType r8 = new com.github.junrar.unpack.decode.CodeType
            java.lang.String r9 = "CODE_VMDATA"
            r10 = 8
            r8.<init>(r9, r10)
            com.github.junrar.unpack.decode.CodeType.CODE_VMDATA = r8
            com.github.junrar.unpack.decode.CodeType[] r0 = new com.github.junrar.unpack.decode.CodeType[]{r0, r1, r2, r3, r4, r5, r6, r7, r8}
            com.github.junrar.unpack.decode.CodeType.$VALUES = r0
            return
    }

    CodeType(java.lang.String r1, int r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    public static com.github.junrar.unpack.decode.CodeType valueOf(java.lang.String r1) {
            java.lang.Class<com.github.junrar.unpack.decode.CodeType> r0 = com.github.junrar.unpack.decode.CodeType.class
            java.lang.Enum r1 = java.lang.Enum.valueOf(r0, r1)
            com.github.junrar.unpack.decode.CodeType r1 = (com.github.junrar.unpack.decode.CodeType) r1
            return r1
    }

    public static com.github.junrar.unpack.decode.CodeType[] values() {
            com.github.junrar.unpack.decode.CodeType[] r0 = com.github.junrar.unpack.decode.CodeType.$VALUES
            java.lang.Object r0 = r0.clone()
            com.github.junrar.unpack.decode.CodeType[] r0 = (com.github.junrar.unpack.decode.CodeType[]) r0
            return r0
    }
}

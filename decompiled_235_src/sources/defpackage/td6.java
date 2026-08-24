package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: td6  reason: default package */
/* loaded from: classes.dex */
public enum td6 {
    COPY(new byte[]{0}),
    LZMA(new byte[]{3, 1, 1}),
    LZMA2(new byte[]{33}),
    DEFLATE(new byte[]{4, 1, 8}),
    DEFLATE64(new byte[]{4, 1, 9}),
    BZIP2(new byte[]{4, 2, 2}),
    AES256SHA256(new byte[]{6, -15, 7, 1}),
    BCJ_X86_FILTER(new byte[]{3, 3, 1, 3}),
    BCJ_PPC_FILTER(new byte[]{3, 3, 2, 5}),
    BCJ_IA64_FILTER(new byte[]{3, 3, 4, 1}),
    BCJ_ARM_FILTER(new byte[]{3, 3, 5, 1}),
    BCJ_ARM_THUMB_FILTER(new byte[]{3, 3, 7, 1}),
    BCJ_SPARC_FILTER(new byte[]{3, 3, 8, 5}),
    DELTA_FILTER(new byte[]{3});
    
    private final byte[] id;

    td6(byte[] bArr) {
        this.id = bArr;
    }

    public static td6 byId(byte[] bArr) {
        td6[] td6VarArr;
        for (td6 td6Var : (td6[]) td6.class.getEnumConstants()) {
            if (Arrays.equals(td6Var.id, bArr)) {
                return td6Var;
            }
        }
        return null;
    }

    public byte[] getId() {
        byte[] bArr = this.id;
        return Arrays.copyOf(bArr, bArr.length);
    }
}

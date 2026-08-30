package defpackage;

import java.util.Arrays;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h26  reason: default package */
/* loaded from: classes.dex */
public enum h26 {
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

    h26(byte[] bArr) {
        this.id = bArr;
    }

    public static h26 byId(byte[] bArr) {
        h26[] h26VarArr;
        for (h26 h26Var : (h26[]) h26.class.getEnumConstants()) {
            if (Arrays.equals(h26Var.id, bArr)) {
                return h26Var;
            }
        }
        return null;
    }

    public byte[] getId() {
        byte[] bArr = this.id;
        return Arrays.copyOf(bArr, bArr.length);
    }
}

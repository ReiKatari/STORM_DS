package ij;

import java.util.Arrays;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public enum w {
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
    

    /* renamed from: id  reason: collision with root package name */
    private final byte[] f7139id;

    w(byte[] bArr) {
        this.f7139id = bArr;
    }

    public static w byId(byte[] bArr) {
        w[] wVarArr;
        for (w wVar : (w[]) w.class.getEnumConstants()) {
            if (Arrays.equals(wVar.f7139id, bArr)) {
                return wVar;
            }
        }
        return null;
    }

    public byte[] getId() {
        byte[] bArr = this.f7139id;
        return Arrays.copyOf(bArr, bArr.length);
    }
}

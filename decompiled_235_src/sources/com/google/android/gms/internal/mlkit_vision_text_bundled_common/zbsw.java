package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbsw extends zbtb {
    private final int zbc;

    public zbsw(byte[] bArr, int i, int i2) {
        super(bArr);
        zbtc.zbh(0, i2, bArr.length);
        this.zbc = i2;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final byte zba(int i) {
        int i2 = this.zbc;
        if (((i2 - (i + 1)) | i) < 0) {
            if (i < 0) {
                throw new ArrayIndexOutOfBoundsException(lb1.g(i, "Index < 0: "));
            }
            throw new ArrayIndexOutOfBoundsException(lb1.j("Index > length: ", i, i2, ", "));
        }
        return ((zbtb) this).zba[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final byte zbb(int i) {
        return ((zbtb) this).zba[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb
    public final int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final int zbd() {
        return this.zbc;
    }
}

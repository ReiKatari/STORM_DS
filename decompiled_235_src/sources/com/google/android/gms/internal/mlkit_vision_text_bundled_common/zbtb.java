package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class zbtb extends zbta {
    protected final byte[] zba;

    public zbtb(byte[] bArr) {
        super(null);
        bArr.getClass();
        this.zba = bArr;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof zbtc) || zbd() != ((zbtc) obj).zbd()) {
            return false;
        }
        if (zbd() == 0) {
            return true;
        }
        if (obj instanceof zbtb) {
            zbtb zbtbVar = (zbtb) obj;
            int zbi = zbi();
            int zbi2 = zbtbVar.zbi();
            if (zbi != 0 && zbi2 != 0 && zbi != zbi2) {
                return false;
            }
            int zbd = zbd();
            if (zbd <= zbtbVar.zbd()) {
                if (zbd <= zbtbVar.zbd()) {
                    byte[] bArr = this.zba;
                    byte[] bArr2 = zbtbVar.zba;
                    zbtbVar.zbc();
                    int i = 0;
                    int i2 = 0;
                    while (i < zbd) {
                        if (bArr[i] != bArr2[i2]) {
                            return false;
                        }
                        i++;
                        i2++;
                    }
                    return true;
                }
                i.h(lb1.j("Ran off end of other: 0, ", zbd, zbtbVar.zbd(), ", "));
                return false;
            }
            throw new IllegalArgumentException("Length too large: " + zbd + zbd());
        }
        return obj.equals(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public byte zba(int i) {
        return this.zba[i];
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public byte zbb(int i) {
        return this.zba[i];
    }

    public int zbc() {
        return 0;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public int zbd() {
        return this.zba.length;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final int zbe(int i, int i2, int i3) {
        return zbuo.zbb(i, this.zba, 0, i3);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final zbtc zbf(int i, int i2) {
        int zbh = zbtc.zbh(0, i2, zbd());
        if (zbh == 0) {
            return zbtc.zbb;
        }
        return new zbsw(this.zba, 0, zbh);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc
    public final void zbg(zbst zbstVar) {
        ((zbth) zbstVar).zbc(this.zba, 0, zbd());
    }
}

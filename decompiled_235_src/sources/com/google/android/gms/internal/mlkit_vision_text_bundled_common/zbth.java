package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbth extends zbtk {
    private final byte[] zbb;
    private final int zbc;
    private int zbd;

    public zbth(byte[] bArr, int i, int i2) {
        super(null);
        int length = bArr.length;
        if (((length - i2) | i2) >= 0) {
            this.zbb = bArr;
            this.zbd = 0;
            this.zbc = i2;
            return;
        }
        throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i2)));
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final int zba() {
        return this.zbc - this.zbd;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbb(byte b) {
        try {
            byte[] bArr = this.zbb;
            int i = this.zbd;
            this.zbd = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e);
        }
    }

    public final void zbc(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, 0, this.zbb, this.zbd, i2);
            this.zbd += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), Integer.valueOf(i2)), e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbd(int i, boolean z) {
        zbw(i << 3);
        zbb(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbe(byte[] bArr, int i, int i2) {
        zbw(i2);
        zbc(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbf(int i, zbtc zbtcVar) {
        zbw((i << 3) | 2);
        zbg(zbtcVar);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbg(zbtc zbtcVar) {
        zbw(zbtcVar.zbd());
        zbtcVar.zbg(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbh(int i, int i2) {
        zbw((i << 3) | 5);
        zbi(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbi(int i) {
        try {
            byte[] bArr = this.zbb;
            int i2 = this.zbd;
            int i3 = i2 + 1;
            this.zbd = i3;
            bArr[i2] = (byte) (i & 255);
            int i4 = i2 + 2;
            this.zbd = i4;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i2 + 3;
            this.zbd = i5;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.zbd = i2 + 4;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbj(int i, long j) {
        zbw((i << 3) | 1);
        zbk(j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbk(long j) {
        try {
            byte[] bArr = this.zbb;
            int i = this.zbd;
            int i2 = i + 1;
            this.zbd = i2;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i + 2;
            this.zbd = i3;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i + 3;
            this.zbd = i4;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i + 4;
            this.zbd = i5;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i + 5;
            this.zbd = i6;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i + 6;
            this.zbd = i7;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i + 7;
            this.zbd = i8;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.zbd = i + 8;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbl(int i, int i2) {
        zbw(i << 3);
        zbm(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbm(int i) {
        if (i >= 0) {
            zbw(i);
        } else {
            zby(i);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbn(byte[] bArr, int i, int i2) {
        zbc(bArr, 0, i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbo(int i, zbvm zbvmVar, zbvx zbvxVar) {
        zbw((i << 3) | 2);
        zbw(((zbsj) zbvmVar).zbj(zbvxVar));
        zbvxVar.zbi(zbvmVar, this.zba);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbp(zbvm zbvmVar) {
        zbw(zbvmVar.zbo());
        zbvmVar.zbL(this);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbq(int i, zbvm zbvmVar) {
        zbw(11);
        zbv(2, i);
        zbw(26);
        zbp(zbvmVar);
        zbw(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbr(int i, zbtc zbtcVar) {
        zbw(11);
        zbv(2, i);
        zbf(3, zbtcVar);
        zbw(12);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbs(int i, String str) {
        zbw((i << 3) | 2);
        zbt(str);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbt(String str) {
        int i = this.zbd;
        try {
            int zbD = zbtk.zbD(str.length() * 3);
            int zbD2 = zbtk.zbD(str.length());
            if (zbD2 == zbD) {
                int i2 = i + zbD2;
                this.zbd = i2;
                int zbb = zbwv.zbb(str, this.zbb, i2, this.zbc - i2);
                this.zbd = i;
                zbw((zbb - i) - zbD2);
                this.zbd = zbb;
                return;
            }
            zbw(zbwv.zbc(str));
            byte[] bArr = this.zbb;
            int i3 = this.zbd;
            this.zbd = zbwv.zbb(str, bArr, i3, this.zbc - i3);
        } catch (zbwu e) {
            this.zbd = i;
            zbG(str, e);
        } catch (IndexOutOfBoundsException e2) {
            throw new zbti(e2);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbu(int i, int i2) {
        zbw((i << 3) | i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbv(int i, int i2) {
        zbw(i << 3);
        zbw(i2);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbw(int i) {
        while (true) {
            int i2 = i & (-128);
            byte[] bArr = this.zbb;
            if (i2 == 0) {
                int i3 = this.zbd;
                this.zbd = i3 + 1;
                bArr[i3] = (byte) i;
                return;
            }
            try {
                int i4 = this.zbd;
                this.zbd = i4 + 1;
                bArr[i4] = (byte) ((i | 128) & 255);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e);
            }
            throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e);
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zbx(int i, long j) {
        zbw(i << 3);
        zby(j);
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtk
    public final void zby(long j) {
        boolean z;
        z = zbtk.zbc;
        if (!z || this.zbc - this.zbd < 10) {
            while (true) {
                int i = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
                byte[] bArr = this.zbb;
                if (i == 0) {
                    int i2 = this.zbd;
                    this.zbd = i2 + 1;
                    bArr[i2] = (byte) j;
                    return;
                }
                try {
                    int i3 = this.zbd;
                    this.zbd = i3 + 1;
                    bArr[i3] = (byte) ((((int) j) | 128) & 255);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e);
                }
                throw new zbti(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.zbd), Integer.valueOf(this.zbc), 1), e);
            }
        }
        while (true) {
            int i4 = ((j & (-128)) > 0L ? 1 : ((j & (-128)) == 0L ? 0 : -1));
            int i5 = (int) j;
            byte[] bArr2 = this.zbb;
            if (i4 == 0) {
                int i6 = this.zbd;
                this.zbd = i6 + 1;
                zbws.zbn(bArr2, i6, (byte) i5);
                return;
            }
            int i7 = this.zbd;
            this.zbd = i7 + 1;
            zbws.zbn(bArr2, i7, (byte) ((i5 | 128) & 255));
            j >>>= 7;
        }
    }
}

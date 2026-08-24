package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
abstract class zbkn extends zbjz {
    final CharSequence zbb;
    int zbc = 0;
    int zbd = Integer.MAX_VALUE;

    public zbkn(zbko zbkoVar, CharSequence charSequence) {
        this.zbb = charSequence;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbjz
    public final /* bridge */ /* synthetic */ Object zba() {
        int zbc;
        int i = this.zbc;
        while (true) {
            int i2 = this.zbc;
            if (i2 != -1) {
                int zbd = zbd(i2);
                if (zbd == -1) {
                    zbd = this.zbb.length();
                    this.zbc = -1;
                    zbc = -1;
                } else {
                    zbc = zbc(zbd);
                    this.zbc = zbc;
                }
                if (zbc == i) {
                    int i3 = zbc + 1;
                    this.zbc = i3;
                    if (i3 > this.zbb.length()) {
                        this.zbc = -1;
                    }
                } else {
                    if (i < zbd) {
                        this.zbb.charAt(i);
                    }
                    if (i < zbd) {
                        this.zbb.charAt(zbd - 1);
                    }
                    int i4 = this.zbd;
                    if (i4 == 1) {
                        zbd = this.zbb.length();
                        this.zbc = -1;
                        if (zbd > i) {
                            this.zbb.charAt(zbd - 1);
                        }
                    } else {
                        this.zbd = i4 - 1;
                    }
                    return this.zbb.subSequence(i, zbd).toString();
                }
            } else {
                zbb();
                return null;
            }
        }
    }

    public abstract int zbc(int i);

    public abstract int zbd(int i);
}

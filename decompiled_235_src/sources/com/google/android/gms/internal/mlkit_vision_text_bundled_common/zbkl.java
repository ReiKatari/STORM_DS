package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbkl extends zbkn {
    final /* synthetic */ zbkm zba;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zbkl(zbkm zbkmVar, zbko zbkoVar, CharSequence charSequence) {
        super(zbkoVar, charSequence);
        this.zba = zbkmVar;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkn
    public final int zbc(int i) {
        return this.zba.zba.length() + i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0026, code lost:
        r7 = r7 + 1;
     */
    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkn
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int zbd(int i) {
        int length = ((zbkn) this).zbb.length();
        int length2 = this.zba.zba.length();
        int i2 = length - length2;
        while (i <= i2) {
            for (int i3 = 0; i3 < length2; i3++) {
                if (((zbkn) this).zbb.charAt(i3 + i) != this.zba.zba.charAt(i3)) {
                    break;
                }
            }
            return i;
        }
        return -1;
    }
}

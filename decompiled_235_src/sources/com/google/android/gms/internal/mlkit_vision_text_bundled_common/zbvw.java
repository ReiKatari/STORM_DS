package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbvw implements zbvj {
    private final zbvm zba;
    private final String zbb;
    private final Object[] zbc;
    private final int zbd;

    public zbvw(zbvm zbvmVar, String str, Object[] objArr) {
        this.zba = zbvmVar;
        this.zbb = str;
        this.zbc = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.zbd = charAt;
            return;
        }
        int i = charAt & 8191;
        int i2 = 1;
        int i3 = 13;
        while (true) {
            int i4 = i2 + 1;
            char charAt2 = str.charAt(i2);
            if (charAt2 >= 55296) {
                i |= (charAt2 & 8191) << i3;
                i3 += 13;
                i2 = i4;
            } else {
                this.zbd = i | (charAt2 << i3);
                return;
            }
        }
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final zbvm zba() {
        return this.zba;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final boolean zbb() {
        if ((this.zbd & 2) == 2) {
            return true;
        }
        return false;
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvj
    public final int zbc() {
        int i = this.zbd;
        if ((i & 1) != 0) {
            return 1;
        }
        if ((i & 4) == 4) {
            return 3;
        }
        return 2;
    }

    public final String zbd() {
        return this.zbb;
    }

    public final Object[] zbe() {
        return this.zbc;
    }
}

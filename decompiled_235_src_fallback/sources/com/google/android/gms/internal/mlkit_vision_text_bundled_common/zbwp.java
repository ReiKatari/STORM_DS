package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zbwp extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr {
    public zbwp(sun.misc.Unsafe r1) {
            r0 = this;
            r0.<init>(r1)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final double zba(java.lang.Object r1, long r2) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.zba
            long r0 = r0.getLong(r1, r2)
            double r0 = java.lang.Double.longBitsToDouble(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final float zbb(java.lang.Object r1, long r2) {
            r0 = this;
            sun.misc.Unsafe r0 = r0.zba
            int r0 = r0.getInt(r1, r2)
            float r0 = java.lang.Float.intBitsToFloat(r0)
            return r0
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbc(java.lang.Object r1, long r2, boolean r4) {
            r0 = this;
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbb
            if (r0 == 0) goto L8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbi(r1, r2, r4)
            return
        L8:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbj(r1, r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbd(java.lang.Object r1, long r2, byte r4) {
            r0 = this;
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbb
            if (r0 == 0) goto L8
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbk(r1, r2, r4)
            return
        L8:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbl(r1, r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbe(java.lang.Object r1, long r2, double r4) {
            r0 = this;
            long r4 = java.lang.Double.doubleToLongBits(r4)
            sun.misc.Unsafe r0 = r0.zba
            r0.putLong(r1, r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final void zbf(java.lang.Object r1, long r2, float r4) {
            r0 = this;
            int r4 = java.lang.Float.floatToIntBits(r4)
            sun.misc.Unsafe r0 = r0.zba
            r0.putInt(r1, r2, r4)
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbwr
    public final boolean zbg(java.lang.Object r1, long r2) {
            r0 = this;
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbb
            if (r0 == 0) goto L9
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbt(r1, r2)
            return r0
        L9:
            boolean r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbws.zbu(r1, r2)
            return r0
    }
}

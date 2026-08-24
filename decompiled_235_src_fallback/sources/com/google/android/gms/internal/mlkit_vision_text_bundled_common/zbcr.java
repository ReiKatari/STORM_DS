package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zbcr {
    private final int zba;
    private final int zbb;

    public zbcr(int r5, int r6) {
            r4 = this;
            r4.<init>()
            r0 = 1
            r1 = 0
            r2 = 32767(0x7fff, float:4.5916E-41)
            if (r5 >= r2) goto Ld
            if (r5 < 0) goto Ld
            r3 = r0
            goto Le
        Ld:
            r3 = r1
        Le:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkj.zbc(r3)
            if (r6 >= r2) goto L16
            if (r6 < 0) goto L16
            goto L17
        L16:
            r0 = r1
        L17:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkj.zbc(r0)
            r4.zba = r5
            r4.zbb = r6
            return
    }

    public final boolean equals(java.lang.Object r4) {
            r3 = this;
            boolean r0 = r4 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr
            r1 = 0
            if (r0 == 0) goto L15
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr r4 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbcr) r4
            int r0 = r3.zba
            int r2 = r4.zba
            if (r0 != r2) goto L15
            int r3 = r3.zbb
            int r4 = r4.zbb
            if (r3 != r4) goto L15
            r3 = 1
            return r3
        L15:
            return r1
    }

    public final int hashCode() {
            r1 = this;
            int r0 = r1.zba
            int r1 = r1.zbb
            int r0 = r0 << 16
            r1 = r1 | r0
            return r1
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            int r1 = r2.zba
            r0.append(r1)
            java.lang.String r1 = "x"
            r0.append(r1)
            int r2 = r2.zbb
            r0.append(r2)
            java.lang.String r2 = r0.toString()
            return r2
    }

    public final int zba() {
            r0 = this;
            int r0 = r0.zbb
            return r0
    }

    public final int zbb() {
            r0 = this;
            int r0 = r0.zba
            return r0
    }
}

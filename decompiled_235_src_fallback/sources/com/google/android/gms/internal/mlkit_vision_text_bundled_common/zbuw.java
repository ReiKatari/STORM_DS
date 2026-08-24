package com.google.android.gms.internal.mlkit_vision_text_bundled_common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class zbuw {
    protected volatile com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm zba;
    private volatile com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc zbb;

    public zbuw() {
            r0 = this;
            r0.<init>()
            return
    }

    public boolean equals(java.lang.Object r3) {
            r2 = this;
            if (r2 != r3) goto L4
            r2 = 1
            return r2
        L4:
            boolean r0 = r3 instanceof com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw
            if (r0 != 0) goto La
            r2 = 0
            return r2
        La:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw r3 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuw) r3
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0 = r2.zba
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1 = r3.zba
            if (r0 != 0) goto L22
            if (r1 == 0) goto L15
            goto L22
        L15:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2 = r2.zbb()
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r3 = r3.zbb()
            boolean r2 = r2.equals(r3)
            return r2
        L22:
            if (r0 == 0) goto L2c
            if (r1 != 0) goto L27
            goto L2c
        L27:
            boolean r2 = r0.equals(r1)
            return r2
        L2c:
            if (r0 == 0) goto L3c
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2 = r0.zbm()
            r3.zbd(r2)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2 = r3.zba
            boolean r2 = r0.equals(r2)
            return r2
        L3c:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r3 = r1.zbm()
            r2.zbd(r3)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2 = r2.zba
            boolean r2 = r2.equals(r1)
            return r2
    }

    public int hashCode() {
            r0 = this;
            r0 = 1
            return r0
    }

    public final int zba() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = r1.zbb
            if (r0 == 0) goto Lc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r1 = r1.zbb
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb r1 = (com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtb) r1
            byte[] r1 = r1.zba
            int r1 = r1.length
            return r1
        Lc:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0 = r1.zba
            if (r0 == 0) goto L17
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r1 = r1.zba
            int r1 = r1.zbo()
            return r1
        L17:
            r1 = 0
            return r1
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc zbb() {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = r1.zbb
            if (r0 == 0) goto L7
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r1 = r1.zbb
            return r1
        L7:
            monitor-enter(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = r1.zbb     // Catch: java.lang.Throwable -> L10
            if (r0 == 0) goto L12
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = r1.zbb     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L10:
            r0 = move-exception
            goto L27
        L12:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0 = r1.zba     // Catch: java.lang.Throwable -> L10
            if (r0 != 0) goto L1b
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb     // Catch: java.lang.Throwable -> L10
            r1.zbb = r0     // Catch: java.lang.Throwable -> L10
            goto L23
        L1b:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0 = r1.zba     // Catch: java.lang.Throwable -> L10
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = r0.zbk()     // Catch: java.lang.Throwable -> L10
            r1.zbb = r0     // Catch: java.lang.Throwable -> L10
        L23:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = r1.zbb     // Catch: java.lang.Throwable -> L10
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            return r0
        L27:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L10
            throw r0
    }

    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm zbc(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r3) {
            r2 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0 = r2.zba
            r1 = 0
            r2.zbb = r1
            r2.zba = r3
            return r0
    }

    public final void zbd(com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0 = r1.zba
            if (r0 == 0) goto L5
            goto L1c
        L5:
            monitor-enter(r1)
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbvm r0 = r1.zba     // Catch: java.lang.Throwable -> Lc
            if (r0 == 0) goto Le
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            return
        Lc:
            r2 = move-exception
            goto L1d
        Le:
            r1.zba = r2     // Catch: java.lang.Throwable -> Lc com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L15
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb     // Catch: java.lang.Throwable -> Lc com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L15
            r1.zbb = r0     // Catch: java.lang.Throwable -> Lc com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbuq -> L15
            goto L1b
        L15:
            r1.zba = r2     // Catch: java.lang.Throwable -> Lc
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtc.zbb     // Catch: java.lang.Throwable -> Lc
            r1.zbb = r2     // Catch: java.lang.Throwable -> Lc
        L1b:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
        L1c:
            return
        L1d:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lc
            throw r2
    }
}

package com.google.mlkit.vision.text.bundled.common;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class zba extends com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnz {
    private final android.content.Context zba;
    private final java.lang.String zbb;
    private final boolean zbc;
    private final java.lang.String zbd;
    private final java.lang.String zbe;
    private com.google.mlkit.vision.text.pipeline.zbi zbf;

    public zba(android.content.Context r1, java.lang.String r2, java.lang.String r3, java.lang.String r4, boolean r5) {
            r0 = this;
            r0.<init>()
            r0.zba = r1
            r0.zbb = r2
            r0.zbd = r3
            r0.zbe = r4
            r0.zbc = r5
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok zbb(defpackage.d13 r2, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx r3) {
            r1 = this;
            com.google.mlkit.vision.text.pipeline.zbi r1 = r1.zbf
            if (r1 == 0) goto L29
            java.lang.Object r1 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r1)
            com.google.mlkit.vision.text.pipeline.zbi r1 = (com.google.mlkit.vision.text.pipeline.zbi) r1
            r0 = 1
            com.google.mlkit.vision.text.pipeline.zbn r1 = r1.zbb(r2, r3, r0)
            com.google.mlkit.vision.text.pipeline.zbo r2 = r1.zbc()
            boolean r3 = r2.zbd()
            if (r3 == 0) goto L1e
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbok r1 = r1.zbb()
            return r1
        L1e:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r1 = r2.zbb()
            java.lang.Object r1 = r1.zba()
            android.os.RemoteException r1 = (android.os.RemoteException) r1
            throw r1
        L29:
            android.os.RemoteException r1 = new android.os.RemoteException
            java.lang.String r2 = "Process is started without initiation."
            r1.<init>(r2)
            throw r1
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final void zbc() {
            r4 = this;
            com.google.mlkit.vision.text.pipeline.zbi r0 = r4.zbf
            if (r0 != 0) goto L48
            java.lang.String r0 = "mlkit_google_ocr_pipeline"
            java.lang.System.loadLibrary(r0)
            java.lang.String r0 = r4.zbe
            if (r0 == 0) goto L17
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L14
            goto L17
        L14:
            java.lang.String r0 = r4.zbe
            goto L19
        L17:
            java.lang.String r0 = ""
        L19:
            java.lang.String r1 = r4.zbb
            java.lang.String r2 = r4.zbd
            boolean r3 = r4.zbc
            com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions$Builder r0 = com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions.builder(r1, r2, r0)
            r0.setEnableLowLatencyInBackground(r3)
            android.content.Context r1 = r4.zba
            com.google.mlkit.vision.text.pipeline.VkpTextRecognizerOptions r0 = r0.build()
            com.google.mlkit.vision.text.pipeline.zbi r0 = com.google.mlkit.vision.text.pipeline.zbi.zba(r1, r0)
            r4.zbf = r0
            com.google.mlkit.vision.text.pipeline.zbo r4 = r0.zbc()
            boolean r0 = r4.zbd()
            if (r0 == 0) goto L3d
            goto L48
        L3d:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r4 = r4.zbb()
            java.lang.Object r4 = r4.zba()
            android.os.RemoteException r4 = (android.os.RemoteException) r4
            throw r4
        L48:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final void zbd() {
            r1 = this;
            com.google.mlkit.vision.text.pipeline.zbi r0 = r1.zbf
            if (r0 == 0) goto La
            r0.zbd()
            r0 = 0
            r1.zbf = r0
        La:
            return
    }

    @Override // com.google.android.gms.internal.mlkit_vision_text_bundled_common.zboa
    public final com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbf[] zbe(defpackage.d13 r1, com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbnx r2) {
            r0 = this;
            android.os.RemoteException r0 = new android.os.RemoteException
            java.lang.String r1 = "#recognizeBitmap should not be triggered from text thick client."
            r0.<init>(r1)
            throw r0
    }
}

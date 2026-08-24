package com.google.android.libraries.vision.visionkit.pipeline.alt;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class PipelineException extends java.lang.Exception {
    private static final java.lang.String ROOT_CAUSE_DELIMITER = "#vk ";
    private final defpackage.k18 statusCode;
    private final java.lang.String statusMessage;
    private final defpackage.b28 visionkitStatus;

    public PipelineException(int r3, java.lang.String r4) {
            r2 = this;
            k18[] r0 = defpackage.k18.values()
            r0 = r0[r3]
            java.lang.String r0 = r0.zba()
            java.lang.String r1 = ": "
            java.lang.String r0 = defpackage.lb1.m(r0, r1, r4)
            r2.<init>(r0)
            k18[] r0 = defpackage.k18.values()
            r3 = r0[r3]
            r2.statusCode = r3
            r2.statusMessage = r4
            r3 = 0
            r2.visionkitStatus = r3
            return
    }

    private PipelineException(defpackage.b28 r4) {
            r3 = this;
            k18[] r0 = defpackage.k18.values()
            int r1 = r4.a()
            r0 = r0[r1]
            java.lang.String r0 = r0.zba()
            java.lang.String r1 = r4.c()
            java.lang.String r2 = ": "
            java.lang.String r0 = defpackage.lb1.m(r0, r2, r1)
            r3.<init>(r0)
            k18[] r0 = defpackage.k18.values()
            int r1 = r4.a()
            r0 = r0[r1]
            r3.statusCode = r0
            java.lang.String r0 = r4.c()
            r3.statusMessage = r0
            r3.visionkitStatus = r4
            return
    }

    public PipelineException(byte[] r2) {
            r1 = this;
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbtp.zba()
            b28 r2 = defpackage.b28.b(r2, r0)
            r1.<init>(r2)
            return
    }

    public java.util.List<defpackage.h08> getComponentStatuses() {
            r0 = this;
            b28 r0 = r0.visionkitStatus
            if (r0 == 0) goto L9
            java.util.List r0 = r0.zbf()
            return r0
        L9:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbkx.zbh()
            return r0
    }

    public com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki<java.lang.String> getRootCauseMessage() {
            r2 = this;
            java.lang.String r0 = r2.statusMessage
            java.lang.String r1 = "#vk "
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L42
            java.lang.String r2 = r2.statusMessage
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbko r0 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbko.zba(r1)
            java.util.List r2 = r0.zbb(r2)
            if (r2 == 0) goto L2c
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L27
            int r0 = r2.size()
            int r0 = r0 + (-1)
            java.lang.Object r2 = r2.get(r0)
            goto L3b
        L27:
            defpackage.fa6.c()
            r2 = 0
            return r2
        L2c:
            java.util.Iterator r2 = r2.iterator()
        L30:
            java.lang.Object r0 = r2.next()
            boolean r1 = r2.hasNext()
            if (r1 != 0) goto L30
            r2 = r0
        L3b:
            java.lang.String r2 = (java.lang.String) r2
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbe(r2)
            return r2
        L42:
            com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki r2 = com.google.android.gms.internal.mlkit_vision_text_bundled_common.zbki.zbd()
            return r2
    }

    public defpackage.k18 getStatusCode() {
            r0 = this;
            k18 r0 = r0.statusCode
            return r0
    }

    public java.lang.String getStatusMessage() {
            r0 = this;
            java.lang.String r0 = r0.statusMessage
            return r0
    }
}

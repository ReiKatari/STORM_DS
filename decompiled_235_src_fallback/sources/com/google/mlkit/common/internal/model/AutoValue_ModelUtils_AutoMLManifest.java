package com.google.mlkit.common.internal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
final class AutoValue_ModelUtils_AutoMLManifest extends com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest {
    private final java.lang.String zza;
    private final java.lang.String zzb;
    private final java.lang.String zzc;

    public AutoValue_ModelUtils_AutoMLManifest(java.lang.String r2, java.lang.String r3, java.lang.String r4) {
            r1 = this;
            r1.<init>()
            r0 = 0
            if (r2 == 0) goto L1d
            r1.zza = r2
            if (r3 == 0) goto L17
            r1.zzb = r3
            if (r4 == 0) goto L11
            r1.zzc = r4
            return
        L11:
            java.lang.String r1 = "Null labelsFile"
            defpackage.u34.x(r1)
            throw r0
        L17:
            java.lang.String r1 = "Null modelFile"
            defpackage.u34.x(r1)
            throw r0
        L1d:
            java.lang.String r1 = "Null modelType"
            defpackage.u34.x(r1)
            throw r0
    }

    public final boolean equals(java.lang.Object r5) {
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L4
            return r0
        L4:
            boolean r1 = r5 instanceof com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
            r2 = 0
            if (r1 == 0) goto L30
            com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest r5 = (com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest) r5
            java.lang.String r1 = r4.zza
            java.lang.String r3 = r5.getModelType()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            java.lang.String r1 = r4.zzb
            java.lang.String r3 = r5.getModelFile()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L30
            java.lang.String r4 = r4.zzc
            java.lang.String r5 = r5.getLabelsFile()
            boolean r4 = r4.equals(r5)
            if (r4 == 0) goto L30
            return r0
        L30:
            return r2
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public java.lang.String getLabelsFile() {
            r0 = this;
            java.lang.String r0 = r0.zzc
            return r0
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public java.lang.String getModelFile() {
            r0 = this;
            java.lang.String r0 = r0.zzb
            return r0
    }

    @Override // com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest
    public java.lang.String getModelType() {
            r0 = this;
            java.lang.String r0 = r0.zza
            return r0
    }

    public final int hashCode() {
            r3 = this;
            java.lang.String r0 = r3.zza
            int r0 = r0.hashCode()
            r1 = 1000003(0xf4243, float:1.401303E-39)
            r0 = r0 ^ r1
            java.lang.String r2 = r3.zzb
            int r0 = r0 * r1
            int r2 = r2.hashCode()
            r0 = r0 ^ r2
            java.lang.String r3 = r3.zzc
            int r0 = r0 * r1
            int r3 = r3.hashCode()
            r3 = r3 ^ r0
            return r3
    }

    public final java.lang.String toString() {
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "AutoMLManifest{modelType="
            r0.<init>(r1)
            java.lang.String r1 = r2.zza
            r0.append(r1)
            java.lang.String r1 = ", modelFile="
            r0.append(r1)
            java.lang.String r1 = r2.zzb
            r0.append(r1)
            java.lang.String r1 = ", labelsFile="
            r0.append(r1)
            java.lang.String r2 = r2.zzc
            java.lang.String r1 = "}"
            java.lang.String r2 = defpackage.i61.n(r0, r2, r1)
            return r2
    }
}

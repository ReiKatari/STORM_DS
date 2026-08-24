package com.google.mlkit.vision.common.internal;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class AutoMLModelUtils {
    private AutoMLModelUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.String[] getModelAndLabelFilePaths(android.content.Context r2, com.google.mlkit.common.model.LocalModel r3, boolean r4) {
            if (r4 == 0) goto Ld
            java.lang.String r0 = r3.getAssetFilePath()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
            goto L17
        Ld:
            java.lang.String r0 = r3.getAbsoluteFilePath()
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r0)
            java.lang.String r0 = (java.lang.String) r0
        L17:
            boolean r3 = r3.isManifestFile()
            if (r3 == 0) goto L6a
            com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest r2 = com.google.mlkit.common.internal.model.ModelUtils.parseManifestFile(r0, r4, r2)
            if (r2 == 0) goto L63
            java.lang.String r3 = r2.getModelType()
            java.lang.String r4 = "IMAGE_LABELING"
            boolean r3 = r4.equals(r3)
            java.lang.Object[] r4 = new java.lang.Object[]{r4}
            java.lang.String r1 = "Model type should be: %s."
            com.google.android.gms.common.internal.Preconditions.checkState(r3, r1, r4)
            java.io.File r3 = new java.io.File
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            java.lang.String r4 = r4.getParent()
            java.lang.String r0 = r2.getModelFile()
            r3.<init>(r4, r0)
            java.lang.String r0 = r3.toString()
            java.io.File r3 = new java.io.File
            java.io.File r4 = new java.io.File
            r4.<init>(r0)
            java.lang.String r4 = r4.getParent()
            java.lang.String r2 = r2.getLabelsFile()
            r3.<init>(r4, r2)
            java.lang.String r2 = r3.toString()
            goto L6c
        L63:
            java.lang.String r2 = "Failed to parse manifest file."
            defpackage.e41.i(r2)
            r2 = 0
            return r2
        L6a:
            java.lang.String r2 = ""
        L6c:
            java.lang.String[] r2 = new java.lang.String[]{r0, r2}
            return r2
    }

    public static java.util.List<java.lang.String> readLabelsFile(android.content.Context r3, java.lang.String r4, boolean r5) {
            java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            if (r5 == 0) goto L12
            android.content.res.AssetManager r3 = r3.getAssets()
            java.io.InputStream r3 = r3.open(r4)
            goto L1c
        L12:
            java.io.FileInputStream r3 = new java.io.FileInputStream
            java.io.File r5 = new java.io.File
            r5.<init>(r4)
            r3.<init>(r5)
        L1c:
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L36
            java.io.InputStreamReader r5 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L36
            java.lang.String r2 = "UTF-8"
            r5.<init>(r3, r2)     // Catch: java.lang.Throwable -> L36
            r4.<init>(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L36
        L2c:
            if (r5 == 0) goto L38
            r1.add(r5)     // Catch: java.lang.Throwable -> L36
            java.lang.String r5 = r4.readLine()     // Catch: java.lang.Throwable -> L36
            goto L2c
        L36:
            r4 = move-exception
            goto L3e
        L38:
            if (r3 == 0) goto L3d
            r3.close()
        L3d:
            return r1
        L3e:
            if (r3 == 0) goto L56
            r3.close()     // Catch: java.lang.Throwable -> L44
            goto L56
        L44:
            r3 = move-exception
            java.lang.String r5 = "addSuppressed"
            java.lang.Class[] r1 = new java.lang.Class[]{r0}     // Catch: java.lang.Exception -> L56
            java.lang.reflect.Method r5 = r0.getDeclaredMethod(r5, r1)     // Catch: java.lang.Exception -> L56
            java.lang.Object[] r3 = new java.lang.Object[]{r3}     // Catch: java.lang.Exception -> L56
            r5.invoke(r4, r3)     // Catch: java.lang.Exception -> L56
        L56:
            throw r4
    }
}

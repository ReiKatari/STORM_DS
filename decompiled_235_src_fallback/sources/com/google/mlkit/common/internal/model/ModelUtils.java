package com.google.mlkit.common.internal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModelUtils {
    private static final com.google.android.gms.common.internal.GmsLogger zza = null;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class AutoMLManifest {
        public AutoMLManifest() {
                r0 = this;
                r0.<init>()
                return
        }

        public abstract java.lang.String getLabelsFile();

        public abstract java.lang.String getModelFile();

        public abstract java.lang.String getModelType();
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class ModelLoggingInfo {
        public ModelLoggingInfo() {
                r0 = this;
                r0.<init>()
                return
        }

        public static com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo zza(long r1, java.lang.String r3, boolean r4) {
                java.lang.String r3 = com.google.android.gms.internal.mlkit_common.zzu.zzb(r3)
                com.google.mlkit.common.internal.model.AutoValue_ModelUtils_ModelLoggingInfo r0 = new com.google.mlkit.common.internal.model.AutoValue_ModelUtils_ModelLoggingInfo
                r0.<init>(r1, r3, r4)
                return r0
        }

        public abstract java.lang.String getHash();

        public abstract long getSize();

        public abstract boolean isManifestModel();
    }

    static {
            com.google.android.gms.common.internal.GmsLogger r0 = new com.google.android.gms.common.internal.GmsLogger
            java.lang.String r1 = "ModelUtils"
            java.lang.String r2 = ""
            r0.<init>(r1, r2)
            com.google.mlkit.common.internal.model.ModelUtils.zza = r0
            return
    }

    private ModelUtils() {
            r0 = this;
            r0.<init>()
            return
    }

    public static com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo getModelLoggingInfo(android.content.Context r11, com.google.mlkit.common.model.LocalModel r12) {
            java.lang.String r0 = r12.getAssetFilePath()
            java.lang.String r1 = r12.getAbsoluteFilePath()
            android.net.Uri r2 = r12.getUri()
            java.lang.String r3 = "Failed to open model file"
            java.lang.String r4 = "ModelUtils"
            r5 = 0
            if (r0 == 0) goto L46
            boolean r6 = r12.isManifestFile()
            if (r6 == 0) goto L22
            r6 = 1
            java.lang.String r0 = zzb(r11, r0, r6)
            if (r0 == 0) goto L21
            goto L22
        L21:
            return r5
        L22:
            android.content.res.AssetManager r6 = r11.getAssets()     // Catch: java.io.IOException -> L32
            android.content.res.AssetFileDescriptor r6 = r6.openFd(r0)     // Catch: java.io.IOException -> L32
            long r7 = r6.getLength()     // Catch: java.lang.Throwable -> L34
            r6.close()     // Catch: java.io.IOException -> L32
            goto L70
        L32:
            r11 = move-exception
            goto L40
        L34:
            r11 = move-exception
            if (r6 == 0) goto L3f
            r6.close()     // Catch: java.lang.Throwable -> L3b
            goto L3f
        L3b:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch: java.io.IOException -> L32
        L3f:
            throw r11     // Catch: java.io.IOException -> L32
        L40:
            com.google.android.gms.common.internal.GmsLogger r12 = com.google.mlkit.common.internal.model.ModelUtils.zza
            r12.e(r4, r3, r11)
            return r5
        L46:
            if (r1 == 0) goto L61
            boolean r6 = r12.isManifestFile()
            if (r6 == 0) goto L57
            r6 = 0
            java.lang.String r1 = zzb(r11, r1, r6)
            if (r1 == 0) goto L56
            goto L57
        L56:
            return r5
        L57:
            java.io.File r6 = new java.io.File
            r6.<init>(r1)
            long r7 = r6.length()
            goto L70
        L61:
            if (r2 == 0) goto L128
            java.lang.String r6 = "r"
            android.content.res.AssetFileDescriptor r6 = com.google.android.gms.internal.mlkit_common.zzi.zza(r11, r2, r6)     // Catch: java.io.IOException -> L114
            long r7 = r6.getLength()     // Catch: java.lang.Throwable -> L116
            r6.close()     // Catch: java.io.IOException -> L114
        L70:
            com.google.mlkit.common.sdkinternal.MlKitContext r6 = com.google.mlkit.common.sdkinternal.MlKitContext.getInstance()
            java.lang.Class<com.google.mlkit.common.sdkinternal.SharedPrefManager> r9 = com.google.mlkit.common.sdkinternal.SharedPrefManager.class
            java.lang.Object r6 = r6.get(r9)
            com.google.mlkit.common.sdkinternal.SharedPrefManager r6 = (com.google.mlkit.common.sdkinternal.SharedPrefManager) r6
            if (r0 == 0) goto L80
            r9 = r0
            goto L8e
        L80:
            if (r1 == 0) goto L84
            r9 = r1
            goto L8e
        L84:
            java.lang.Object r9 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            android.net.Uri r9 = (android.net.Uri) r9
            java.lang.String r9 = r9.toString()
        L8e:
            java.lang.String r10 = r6.zzb(r9, r7)
            if (r10 == 0) goto L9d
            boolean r11 = r12.isManifestFile()
            com.google.mlkit.common.internal.model.ModelUtils$ModelLoggingInfo r11 = com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo.zza(r7, r10, r11)
            return r11
        L9d:
            java.lang.String r10 = "Failed to close model file"
            if (r0 == 0) goto Lae
            android.content.res.AssetManager r11 = r11.getAssets()     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            java.io.InputStream r11 = r11.open(r0)     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            goto Lc9
        Laa:
            r11 = move-exception
            goto Lf1
        Lac:
            r11 = move-exception
            goto Lf3
        Lae:
            if (r1 == 0) goto Lbb
            java.io.FileInputStream r11 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            r0.<init>(r1)     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            r11.<init>(r0)     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            goto Lc9
        Lbb:
            java.lang.Object r0 = com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            android.net.Uri r0 = (android.net.Uri) r0     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            int r1 = com.google.android.gms.internal.mlkit_common.zzi.zza     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            com.google.android.gms.internal.mlkit_common.zzh r1 = com.google.android.gms.internal.mlkit_common.zzh.zza     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
            java.io.InputStream r11 = com.google.android.gms.internal.mlkit_common.zzi.zzb(r11, r0, r1)     // Catch: java.lang.Throwable -> Laa java.io.IOException -> Lac
        Lc9:
            if (r11 == 0) goto Ld4
            java.lang.String r0 = zzc(r11)     // Catch: java.lang.Throwable -> Ld0 java.io.IOException -> Ld2
            goto Ld5
        Ld0:
            r12 = move-exception
            goto Lef
        Ld2:
            r12 = move-exception
            goto Lf5
        Ld4:
            r0 = r5
        Ld5:
            if (r0 == 0) goto Lda
            r6.zzc(r9, r7, r0)     // Catch: java.lang.Throwable -> Ld0 java.io.IOException -> Ld2
        Lda:
            boolean r12 = r12.isManifestFile()     // Catch: java.lang.Throwable -> Ld0 java.io.IOException -> Ld2
            com.google.mlkit.common.internal.model.ModelUtils$ModelLoggingInfo r12 = com.google.mlkit.common.internal.model.ModelUtils.ModelLoggingInfo.zza(r7, r0, r12)     // Catch: java.lang.Throwable -> Ld0 java.io.IOException -> Ld2
            if (r11 == 0) goto Lee
            r11.close()     // Catch: java.io.IOException -> Le8
            return r12
        Le8:
            r11 = move-exception
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.internal.model.ModelUtils.zza
            r0.e(r4, r10, r11)
        Lee:
            return r12
        Lef:
            r5 = r11
            goto L107
        Lf1:
            r12 = r11
            goto L107
        Lf3:
            r12 = r11
            r11 = r5
        Lf5:
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.internal.model.ModelUtils.zza     // Catch: java.lang.Throwable -> Ld0
            r0.e(r4, r3, r12)     // Catch: java.lang.Throwable -> Ld0
            if (r11 == 0) goto L106
            r11.close()     // Catch: java.io.IOException -> L100
            goto L106
        L100:
            r11 = move-exception
            com.google.android.gms.common.internal.GmsLogger r12 = com.google.mlkit.common.internal.model.ModelUtils.zza
            r12.e(r4, r10, r11)
        L106:
            return r5
        L107:
            if (r5 == 0) goto L113
            r5.close()     // Catch: java.io.IOException -> L10d
            goto L113
        L10d:
            r11 = move-exception
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.internal.model.ModelUtils.zza
            r0.e(r4, r10, r11)
        L113:
            throw r12
        L114:
            r11 = move-exception
            goto L122
        L116:
            r11 = move-exception
            if (r6 == 0) goto L121
            r6.close()     // Catch: java.lang.Throwable -> L11d
            goto L121
        L11d:
            r12 = move-exception
            r11.addSuppressed(r12)     // Catch: java.io.IOException -> L114
        L121:
            throw r11     // Catch: java.io.IOException -> L114
        L122:
            com.google.android.gms.common.internal.GmsLogger r12 = com.google.mlkit.common.internal.model.ModelUtils.zza
            r12.e(r4, r3, r11)
            return r5
        L128:
            com.google.android.gms.common.internal.GmsLogger r11 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r12 = "Local model doesn't have any valid path."
            r11.e(r4, r12)
            return r5
    }

    public static java.lang.String getSHA256(java.io.File r2) {
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.io.IOException -> L17
            r0.<init>(r2)     // Catch: java.io.IOException -> L17
            java.lang.String r2 = zzc(r0)     // Catch: java.lang.Throwable -> Ld
            r0.close()     // Catch: java.io.IOException -> L17
            return r2
        Ld:
            r2 = move-exception
            r0.close()     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            r2.addSuppressed(r0)     // Catch: java.io.IOException -> L17
        L16:
            throw r2     // Catch: java.io.IOException -> L17
        L17:
            r2 = move-exception
            com.google.android.gms.common.internal.GmsLogger r0 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r2 = r2.toString()
            java.lang.String r1 = "Failed to create FileInputStream for model: "
            java.lang.String r2 = r1.concat(r2)
            java.lang.String r1 = "ModelUtils"
            r0.e(r1, r2)
            r2 = 0
            return r2
    }

    public static com.google.mlkit.common.internal.model.ModelUtils.AutoMLManifest parseManifestFile(java.lang.String r6, boolean r7, android.content.Context r8) {
            java.lang.String r0 = "Json string from the manifest file: "
            java.lang.String r1 = java.lang.String.valueOf(r6)
            com.google.android.gms.common.internal.GmsLogger r2 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r3 = "Manifest file path: "
            java.lang.String r1 = r3.concat(r1)
            java.lang.String r3 = "ModelUtils"
            r2.d(r3, r1)
            r1 = 0
            if (r7 == 0) goto L24
            android.content.res.AssetManager r4 = r8.getAssets()     // Catch: java.io.IOException -> L2f
            java.io.InputStream r4 = r4.open(r6)     // Catch: java.io.IOException -> L2f
            if (r4 == 0) goto L37
            r4.close()     // Catch: java.io.IOException -> L2f
            goto L37
        L24:
            java.io.File r4 = new java.io.File
            r4.<init>(r6)
            boolean r4 = r4.exists()
            if (r4 != 0) goto L37
        L2f:
            com.google.android.gms.common.internal.GmsLogger r6 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r7 = "Manifest file does not exist."
            r6.e(r3, r7)
            return r1
        L37:
            boolean r4 = r6.isEmpty()     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r5 = 0
            if (r4 == 0) goto L45
            byte[] r6 = new byte[r5]     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            goto L68
        L41:
            r6 = move-exception
            goto L9f
        L43:
            r6 = move-exception
            goto L9f
        L45:
            if (r7 == 0) goto L50
            android.content.res.AssetManager r7 = r8.getAssets()     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.io.InputStream r6 = r7.open(r6)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            goto L5b
        L50:
            java.io.FileInputStream r7 = new java.io.FileInputStream     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.io.File r8 = new java.io.File     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r8.<init>(r6)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r7.<init>(r8)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r6 = r7
        L5b:
            int r7 = r6.available()     // Catch: java.lang.Throwable -> L93
            byte[] r8 = new byte[r7]     // Catch: java.lang.Throwable -> L93
            r6.read(r8, r5, r7)     // Catch: java.lang.Throwable -> L93
            r6.close()     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r6 = r8
        L68:
            java.lang.String r7 = new java.lang.String     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.lang.String r8 = "UTF-8"
            r7.<init>(r6, r8)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.lang.String r6 = r0.concat(r7)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r2.d(r3, r6)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            org.json.JSONObject r6 = new org.json.JSONObject     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r6.<init>(r7)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.lang.String r7 = "modelType"
            java.lang.String r7 = r6.getString(r7)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.lang.String r8 = "modelFile"
            java.lang.String r8 = r6.getString(r8)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            java.lang.String r0 = "labelsFile"
            java.lang.String r6 = r6.getString(r0)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest r0 = new com.google.mlkit.common.internal.model.AutoValue_ModelUtils_AutoMLManifest     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            r0.<init>(r7, r8, r6)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
            return r0
        L93:
            r7 = move-exception
            if (r6 == 0) goto L9e
            r6.close()     // Catch: java.lang.Throwable -> L9a
            goto L9e
        L9a:
            r6 = move-exception
            r7.addSuppressed(r6)     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
        L9e:
            throw r7     // Catch: java.io.IOException -> L41 org.json.JSONException -> L43
        L9f:
            com.google.android.gms.common.internal.GmsLogger r7 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r8 = "Error parsing the manifest file."
            r7.e(r3, r8, r6)
            return r1
    }

    public static boolean zza(java.io.File r4, java.lang.String r5) {
            java.lang.String r4 = getSHA256(r4)
            java.lang.String r0 = java.lang.String.valueOf(r4)
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r2 = "ModelUtils"
            java.lang.String r3 = "Calculated hash value is: "
            java.lang.String r0 = r3.concat(r0)
            r1.d(r2, r0)
            boolean r4 = r5.equals(r4)
            return r4
    }

    private static java.lang.String zzb(android.content.Context r1, java.lang.String r2, boolean r3) {
            com.google.mlkit.common.internal.model.ModelUtils$AutoMLManifest r1 = parseManifestFile(r2, r3, r1)
            if (r1 != 0) goto L11
            com.google.android.gms.common.internal.GmsLogger r1 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r2 = "ModelUtils"
            java.lang.String r3 = "Failed to parse manifest file."
            r1.e(r2, r3)
            r1 = 0
            return r1
        L11:
            java.io.File r3 = new java.io.File
            java.io.File r0 = new java.io.File
            r0.<init>(r2)
            java.lang.String r2 = r0.getParent()
            java.lang.String r1 = r1.getModelFile()
            r3.<init>(r2, r1)
            java.lang.String r1 = r3.toString()
            return r1
    }

    private static java.lang.String zzc(java.io.InputStream r6) {
            java.lang.String r0 = "ModelUtils"
            java.lang.String r1 = "SHA-256"
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r1)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            r2 = 1048576(0x100000, float:1.469368E-39)
            byte[] r2 = new byte[r2]     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
        Lc:
            int r3 = r6.read(r2)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            r4 = -1
            r5 = 0
            if (r3 == r4) goto L18
            r1.update(r2, r5, r3)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            goto Lc
        L18:
            byte[] r6 = r1.digest()     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            r1.<init>()     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
        L21:
            int r2 = r6.length     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            if (r5 >= r2) goto L3e
            r2 = r6[r5]     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            r2 = r2 & 255(0xff, float:3.57E-43)
            java.lang.String r2 = java.lang.Integer.toHexString(r2)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            int r3 = r2.length()     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            r4 = 1
            if (r3 != r4) goto L38
            r3 = 48
            r1.append(r3)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
        L38:
            r1.append(r2)     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            int r5 = r5 + 1
            goto L21
        L3e:
            java.lang.String r6 = r1.toString()     // Catch: java.io.IOException -> L43 java.security.NoSuchAlgorithmException -> L4b
            return r6
        L43:
            com.google.android.gms.common.internal.GmsLogger r6 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r1 = "Failed to read model file"
            r6.e(r0, r1)
            goto L52
        L4b:
            com.google.android.gms.common.internal.GmsLogger r6 = com.google.mlkit.common.internal.model.ModelUtils.zza
            java.lang.String r1 = "Do not have SHA-256 algorithm"
            r6.e(r0, r1)
        L52:
            r6 = 0
            return r6
    }
}

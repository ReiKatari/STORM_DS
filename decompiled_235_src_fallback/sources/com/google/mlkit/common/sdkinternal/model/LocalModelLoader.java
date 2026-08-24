package com.google.mlkit.common.sdkinternal.model;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class LocalModelLoader {
    private java.nio.MappedByteBuffer zza;
    private final android.content.Context zzb;
    private final com.google.mlkit.common.model.LocalModel zzc;

    public LocalModelLoader(android.content.Context r1, com.google.mlkit.common.model.LocalModel r2) {
            r0 = this;
            r0.<init>()
            r0.zzb = r1
            r0.zzc = r2
            return
    }

    public com.google.mlkit.common.model.LocalModel getLocalModel() {
            r0 = this;
            com.google.mlkit.common.model.LocalModel r0 = r0.zzc
            return r0
    }

    public java.nio.MappedByteBuffer load() {
            r11 = this;
            android.content.Context r0 = r11.zzb
            java.lang.String r1 = "Context can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            com.google.mlkit.common.model.LocalModel r0 = r11.zzc
            java.lang.String r1 = "Model source can not be null"
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r0, r1)
            java.nio.MappedByteBuffer r0 = r11.zza
            if (r0 == 0) goto L13
            return r0
        L13:
            com.google.mlkit.common.model.LocalModel r0 = r11.zzc
            java.lang.String r1 = r0.getAbsoluteFilePath()
            java.lang.String r2 = r0.getAssetFilePath()
            android.net.Uri r3 = r0.getUri()
            java.lang.String r0 = "r"
            r4 = 14
            if (r1 == 0) goto L77
            java.io.RandomAccessFile r2 = new java.io.RandomAccessFile     // Catch: java.io.IOException -> L46
            r2.<init>(r1, r0)     // Catch: java.io.IOException -> L46
            java.nio.channels.FileChannel r5 = r2.getChannel()     // Catch: java.lang.Throwable -> L48
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L4b
            long r9 = r5.size()     // Catch: java.lang.Throwable -> L4b
            r7 = 0
            java.nio.MappedByteBuffer r0 = r5.map(r6, r7, r9)     // Catch: java.lang.Throwable -> L4b
            r11.zza = r0     // Catch: java.lang.Throwable -> L4b
            r5.close()     // Catch: java.lang.Throwable -> L48
            r2.close()     // Catch: java.io.IOException -> L46
            goto Lf9
        L46:
            r0 = move-exception
            goto L61
        L48:
            r0 = move-exception
            r1 = r0
            goto L58
        L4b:
            r0 = move-exception
            r1 = r0
            if (r5 == 0) goto L57
            r5.close()     // Catch: java.lang.Throwable -> L53
            goto L57
        L53:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.lang.Throwable -> L48
        L57:
            throw r1     // Catch: java.lang.Throwable -> L48
        L58:
            r2.close()     // Catch: java.lang.Throwable -> L5c
            goto L60
        L5c:
            r0 = move-exception
            r1.addSuppressed(r0)     // Catch: java.io.IOException -> L46
        L60:
            throw r1     // Catch: java.io.IOException -> L46
        L61:
            com.google.mlkit.common.model.LocalModel r11 = r11.zzc
            com.google.mlkit.common.MlKitException r1 = new com.google.mlkit.common.MlKitException
            java.lang.String r11 = r11.getAbsoluteFilePath()
            java.lang.String r11 = java.lang.String.valueOf(r11)
            java.lang.String r2 = "Can not open the local file: "
            java.lang.String r11 = r2.concat(r11)
            r1.<init>(r11, r4, r0)
            throw r1
        L77:
            if (r2 == 0) goto Ld3
            android.content.Context r0 = r11.zzb     // Catch: java.io.IOException -> La7
            android.content.res.AssetManager r0 = r0.getAssets()     // Catch: java.io.IOException -> La7
            android.content.res.AssetFileDescriptor r1 = r0.openFd(r2)     // Catch: java.io.IOException -> La7
            java.io.FileInputStream r0 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> Laa
            java.io.FileDescriptor r3 = r1.getFileDescriptor()     // Catch: java.lang.Throwable -> Laa
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Laa
            java.nio.channels.FileChannel r5 = r0.getChannel()     // Catch: java.lang.Throwable -> Laa
            long r7 = r1.getStartOffset()     // Catch: java.lang.Throwable -> Lad
            long r9 = r1.getDeclaredLength()     // Catch: java.lang.Throwable -> Lad
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> Lad
            java.nio.MappedByteBuffer r0 = r5.map(r6, r7, r9)     // Catch: java.lang.Throwable -> Lad
            r11.zza = r0     // Catch: java.lang.Throwable -> Lad
            r5.close()     // Catch: java.lang.Throwable -> Laa
            r1.close()     // Catch: java.io.IOException -> La7
            goto Lf9
        La7:
            r0 = move-exception
            r11 = r0
            goto Lc5
        Laa:
            r0 = move-exception
            r11 = r0
            goto Lba
        Lad:
            r0 = move-exception
            r11 = r0
            if (r5 == 0) goto Lb9
            r5.close()     // Catch: java.lang.Throwable -> Lb5
            goto Lb9
        Lb5:
            r0 = move-exception
            r11.addSuppressed(r0)     // Catch: java.lang.Throwable -> Laa
        Lb9:
            throw r11     // Catch: java.lang.Throwable -> Laa
        Lba:
            if (r1 == 0) goto Lc4
            r1.close()     // Catch: java.lang.Throwable -> Lc0
            goto Lc4
        Lc0:
            r0 = move-exception
            r11.addSuppressed(r0)     // Catch: java.io.IOException -> La7
        Lc4:
            throw r11     // Catch: java.io.IOException -> La7
        Lc5:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = "Can not load the file from asset: "
            java.lang.String r3 = ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression"
            java.lang.String r1 = defpackage.lb1.A(r1, r2, r3)
            r0.<init>(r1, r4, r11)
            throw r0
        Ld3:
            if (r3 == 0) goto L12a
            android.content.Context r1 = r11.zzb     // Catch: java.io.IOException -> Lfc
            android.content.res.AssetFileDescriptor r1 = com.google.android.gms.internal.mlkit_common.zzi.zza(r1, r3, r0)     // Catch: java.io.IOException -> Lfc
            java.io.FileInputStream r0 = r1.createInputStream()     // Catch: java.lang.Throwable -> Lff
            java.nio.channels.FileChannel r5 = r0.getChannel()     // Catch: java.lang.Throwable -> Lff
            long r7 = r1.getStartOffset()     // Catch: java.lang.Throwable -> L102
            long r9 = r1.getLength()     // Catch: java.lang.Throwable -> L102
            java.nio.channels.FileChannel$MapMode r6 = java.nio.channels.FileChannel.MapMode.READ_ONLY     // Catch: java.lang.Throwable -> L102
            java.nio.MappedByteBuffer r0 = r5.map(r6, r7, r9)     // Catch: java.lang.Throwable -> L102
            r11.zza = r0     // Catch: java.lang.Throwable -> L102
            r5.close()     // Catch: java.lang.Throwable -> Lff
            r1.close()     // Catch: java.io.IOException -> Lfc
        Lf9:
            java.nio.MappedByteBuffer r11 = r11.zza
            return r11
        Lfc:
            r0 = move-exception
            r11 = r0
            goto L11a
        Lff:
            r0 = move-exception
            r11 = r0
            goto L10f
        L102:
            r0 = move-exception
            r11 = r0
            if (r5 == 0) goto L10e
            r5.close()     // Catch: java.lang.Throwable -> L10a
            goto L10e
        L10a:
            r0 = move-exception
            r11.addSuppressed(r0)     // Catch: java.lang.Throwable -> Lff
        L10e:
            throw r11     // Catch: java.lang.Throwable -> Lff
        L10f:
            if (r1 == 0) goto L119
            r1.close()     // Catch: java.lang.Throwable -> L115
            goto L119
        L115:
            r0 = move-exception
            r11.addSuppressed(r0)     // Catch: java.io.IOException -> Lfc
        L119:
            throw r11     // Catch: java.io.IOException -> Lfc
        L11a:
            com.google.mlkit.common.MlKitException r0 = new com.google.mlkit.common.MlKitException
            java.lang.String r1 = r3.toString()
            java.lang.String r2 = "Can not load the file from URI: "
            java.lang.String r1 = r2.concat(r1)
            r0.<init>(r1, r4, r11)
            throw r0
        L12a:
            com.google.mlkit.common.MlKitException r11 = new com.google.mlkit.common.MlKitException
            java.lang.String r0 = "Can not load the model. One of filePath, assetFilePath or URI must be set for the model."
            r11.<init>(r0, r4)
            throw r11
    }
}

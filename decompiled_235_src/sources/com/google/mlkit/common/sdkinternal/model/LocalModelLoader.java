package com.google.mlkit.common.sdkinternal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.mlkit.common.MlKitException;
import com.google.mlkit.common.model.LocalModel;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class LocalModelLoader {
    private MappedByteBuffer zza;
    private final Context zzb;
    private final LocalModel zzc;

    public LocalModelLoader(Context context, LocalModel localModel) {
        this.zzb = context;
        this.zzc = localModel;
    }

    public LocalModel getLocalModel() {
        return this.zzc;
    }

    public MappedByteBuffer load() {
        Preconditions.checkNotNull(this.zzb, "Context can not be null");
        Preconditions.checkNotNull(this.zzc, "Model source can not be null");
        MappedByteBuffer mappedByteBuffer = this.zza;
        if (mappedByteBuffer != null) {
            return mappedByteBuffer;
        }
        LocalModel localModel = this.zzc;
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        String assetFilePath = localModel.getAssetFilePath();
        Uri uri = localModel.getUri();
        if (absoluteFilePath != null) {
            try {
                RandomAccessFile randomAccessFile = new RandomAccessFile(absoluteFilePath, "r");
                FileChannel channel = randomAccessFile.getChannel();
                this.zza = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
                channel.close();
                randomAccessFile.close();
            } catch (IOException e) {
                throw new MlKitException("Can not open the local file: ".concat(String.valueOf(this.zzc.getAbsoluteFilePath())), 14, e);
            }
        } else if (assetFilePath != null) {
            try {
                AssetFileDescriptor openFd = this.zzb.getAssets().openFd(assetFilePath);
                FileChannel channel2 = new FileInputStream(openFd.getFileDescriptor()).getChannel();
                this.zza = channel2.map(FileChannel.MapMode.READ_ONLY, openFd.getStartOffset(), openFd.getDeclaredLength());
                channel2.close();
                openFd.close();
            } catch (IOException e2) {
                throw new MlKitException(lb1.A("Can not load the file from asset: ", assetFilePath, ". Please double check your asset file name and ensure it's not compressed. See documentation for details how to use aaptOptions to skip file compression"), 14, e2);
            }
        } else if (uri != null) {
            try {
                AssetFileDescriptor zza = zzi.zza(this.zzb, uri, "r");
                FileChannel channel3 = zza.createInputStream().getChannel();
                this.zza = channel3.map(FileChannel.MapMode.READ_ONLY, zza.getStartOffset(), zza.getLength());
                channel3.close();
                zza.close();
            } catch (IOException e3) {
                throw new MlKitException("Can not load the file from URI: ".concat(uri.toString()), 14, e3);
            }
        } else {
            throw new MlKitException("Can not load the model. One of filePath, assetFilePath or URI must be set for the model.", 14);
        }
        return this.zza;
    }
}

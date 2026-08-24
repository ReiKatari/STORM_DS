package com.google.mlkit.common.model;

import android.net.Uri;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzq;
import com.google.android.gms.internal.mlkit_common.zzr;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class LocalModel {
    private final String zza;
    private final String zzb;
    private final Uri zzc;
    private final boolean zzd;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class Builder {
        private String zza = null;
        private String zzb = null;
        private Uri zzc = null;
        private boolean zzd = false;

        public LocalModel build() {
            String str = this.zza;
            boolean z = true;
            if ((str == null || this.zzb != null || this.zzc != null) && ((str != null || this.zzb == null || this.zzc != null) && (str != null || this.zzb != null || this.zzc == null))) {
                z = false;
            }
            Preconditions.checkArgument(z, "Set one of filePath, assetFilePath and URI.");
            return new LocalModel(this.zza, this.zzb, this.zzc, this.zzd, null);
        }

        public Builder setAbsoluteFilePath(String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.zzb == null && this.zzc == null && !this.zzd) {
                z = true;
            }
            Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zza = str;
            return this;
        }

        public Builder setAbsoluteManifestFilePath(String str) {
            Preconditions.checkNotEmpty(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.zzb == null && this.zzc == null && (this.zza == null || this.zzd)) {
                z = true;
            }
            Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zza = str;
            this.zzd = true;
            return this;
        }

        public Builder setAssetFilePath(String str) {
            Preconditions.checkNotEmpty(str, "Model Source file path can not be empty");
            boolean z = false;
            if (this.zza == null && this.zzc == null && !this.zzd) {
                z = true;
            }
            Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zzb = str;
            return this;
        }

        public Builder setAssetManifestFilePath(String str) {
            Preconditions.checkNotEmpty(str, "Manifest file path can not be empty");
            boolean z = false;
            if (this.zza == null && this.zzc == null && (this.zzb == null || this.zzd)) {
                z = true;
            }
            Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zzb = str;
            this.zzd = true;
            return this;
        }

        public Builder setUri(Uri uri) {
            boolean z = false;
            if (this.zza == null && this.zzb == null) {
                z = true;
            }
            Preconditions.checkArgument(z, "A local model source is from absolute file path, asset file path or URI, you can only set one of them.");
            this.zzc = uri;
            return this;
        }
    }

    public /* synthetic */ LocalModel(String str, String str2, Uri uri, boolean z, zzc zzcVar) {
        this.zza = str;
        this.zzb = str2;
        this.zzc = uri;
        this.zzd = z;
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof LocalModel)) {
            return false;
        }
        LocalModel localModel = (LocalModel) obj;
        if (!Objects.equal(this.zza, localModel.zza) || !Objects.equal(this.zzb, localModel.zzb) || !Objects.equal(this.zzc, localModel.zzc) || this.zzd != localModel.zzd) {
            return false;
        }
        return true;
    }

    public String getAbsoluteFilePath() {
        return this.zza;
    }

    public String getAssetFilePath() {
        return this.zzb;
    }

    public Uri getUri() {
        return this.zzc;
    }

    public int hashCode() {
        return Objects.hashCode(this.zza, this.zzb, this.zzc, Boolean.valueOf(this.zzd));
    }

    public boolean isManifestFile() {
        return this.zzd;
    }

    public String toString() {
        zzq zza = zzr.zza(this);
        zza.zza("absoluteFilePath", this.zza);
        zza.zza("assetFilePath", this.zzb);
        zza.zza("uri", this.zzc);
        zza.zzb("isManifestFile", this.zzd);
        return zza.toString();
    }
}

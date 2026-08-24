package com.google.mlkit.common.internal.model;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import com.google.android.gms.common.internal.GmsLogger;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.mlkit_common.zzh;
import com.google.android.gms.internal.mlkit_common.zzi;
import com.google.android.gms.internal.mlkit_common.zzu;
import com.google.mlkit.common.model.LocalModel;
import com.google.mlkit.common.sdkinternal.MlKitContext;
import com.google.mlkit.common.sdkinternal.SharedPrefManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import org.json.JSONException;
import org.json.JSONObject;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class ModelUtils {
    private static final GmsLogger zza = new GmsLogger("ModelUtils", "");

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class AutoMLManifest {
        public abstract String getLabelsFile();

        public abstract String getModelFile();

        public abstract String getModelType();
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static abstract class ModelLoggingInfo {
        public static ModelLoggingInfo zza(long j, String str, boolean z) {
            return new AutoValue_ModelUtils_ModelLoggingInfo(j, zzu.zzb(str), z);
        }

        public abstract String getHash();

        public abstract long getSize();

        public abstract boolean isManifestModel();
    }

    private ModelUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0109 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ModelLoggingInfo getModelLoggingInfo(Context context, LocalModel localModel) {
        long length;
        String uri;
        Throwable th;
        IOException e;
        InputStream inputStream;
        String zzc;
        String assetFilePath = localModel.getAssetFilePath();
        String absoluteFilePath = localModel.getAbsoluteFilePath();
        Uri uri2 = localModel.getUri();
        ?? r5 = 0;
        if (assetFilePath != null) {
            if (localModel.isManifestFile() && (assetFilePath = zzb(context, assetFilePath, true)) == null) {
                return null;
            }
            try {
                AssetFileDescriptor openFd = context.getAssets().openFd(assetFilePath);
                length = openFd.getLength();
                openFd.close();
            } catch (IOException e2) {
                zza.e("ModelUtils", "Failed to open model file", e2);
                return null;
            }
        } else if (absoluteFilePath != null) {
            if (localModel.isManifestFile() && (absoluteFilePath = zzb(context, absoluteFilePath, false)) == null) {
                return null;
            }
            length = new File(absoluteFilePath).length();
        } else if (uri2 != null) {
            try {
                AssetFileDescriptor zza2 = zzi.zza(context, uri2, "r");
                length = zza2.getLength();
                zza2.close();
            } catch (IOException e3) {
                zza.e("ModelUtils", "Failed to open model file", e3);
                return null;
            }
        } else {
            zza.e("ModelUtils", "Local model doesn't have any valid path.");
            return null;
        }
        SharedPrefManager sharedPrefManager = (SharedPrefManager) MlKitContext.getInstance().get(SharedPrefManager.class);
        if (assetFilePath != null) {
            uri = assetFilePath;
        } else if (absoluteFilePath != null) {
            uri = absoluteFilePath;
        } else {
            uri = ((Uri) Preconditions.checkNotNull(uri2)).toString();
        }
        String zzb = sharedPrefManager.zzb(uri, length);
        if (zzb != null) {
            return ModelLoggingInfo.zza(length, zzb, localModel.isManifestFile());
        }
        try {
            try {
                if (assetFilePath != null) {
                    inputStream = context.getAssets().open(assetFilePath);
                } else if (absoluteFilePath != null) {
                    inputStream = new FileInputStream(new File(absoluteFilePath));
                } else {
                    int i = zzi.zza;
                    inputStream = zzi.zzb(context, (Uri) Preconditions.checkNotNull(uri2), zzh.zza);
                }
                if (inputStream != null) {
                    try {
                        zzc = zzc(inputStream);
                    } catch (IOException e4) {
                        e = e4;
                        zza.e("ModelUtils", "Failed to open model file", e);
                        if (inputStream != null) {
                            try {
                                inputStream.close();
                            } catch (IOException e5) {
                                zza.e("ModelUtils", "Failed to close model file", e5);
                            }
                        }
                        return null;
                    }
                } else {
                    zzc = null;
                }
                if (zzc != null) {
                    sharedPrefManager.zzc(uri, length, zzc);
                }
                ModelLoggingInfo zza3 = ModelLoggingInfo.zza(length, zzc, localModel.isManifestFile());
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return zza3;
                    } catch (IOException e6) {
                        zza.e("ModelUtils", "Failed to close model file", e6);
                    }
                }
                return zza3;
            } catch (Throwable th2) {
                th = th2;
                r5 = context;
                if (r5 != 0) {
                    try {
                        r5.close();
                    } catch (IOException e7) {
                        zza.e("ModelUtils", "Failed to close model file", e7);
                    }
                }
                throw th;
            }
        } catch (IOException e8) {
            e = e8;
            inputStream = null;
        } catch (Throwable th3) {
            th = th3;
            if (r5 != 0) {
            }
            throw th;
        }
    }

    public static String getSHA256(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            String zzc = zzc(fileInputStream);
            fileInputStream.close();
            return zzc;
        } catch (IOException e) {
            zza.e("ModelUtils", "Failed to create FileInputStream for model: ".concat(e.toString()));
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002d, code lost:
        if (new java.io.File(r6).exists() == false) goto L5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static AutoMLManifest parseManifestFile(String str, boolean z, Context context) {
        InputStream fileInputStream;
        byte[] bArr;
        String valueOf = String.valueOf(str);
        GmsLogger gmsLogger = zza;
        gmsLogger.d("ModelUtils", "Manifest file path: ".concat(valueOf));
        if (z) {
            try {
                InputStream open = context.getAssets().open(str);
                if (open != null) {
                    open.close();
                }
            } catch (IOException unused) {
                zza.e("ModelUtils", "Manifest file does not exist.");
                return null;
            }
        }
        try {
            if (str.isEmpty()) {
                bArr = new byte[0];
            } else {
                if (z) {
                    fileInputStream = context.getAssets().open(str);
                } else {
                    fileInputStream = new FileInputStream(new File(str));
                }
                try {
                    int available = fileInputStream.available();
                    byte[] bArr2 = new byte[available];
                    fileInputStream.read(bArr2, 0, available);
                    fileInputStream.close();
                    bArr = bArr2;
                } catch (Throwable th) {
                    if (fileInputStream != null) {
                        try {
                            fileInputStream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                    }
                    throw th;
                }
            }
            String str2 = new String(bArr, "UTF-8");
            gmsLogger.d("ModelUtils", "Json string from the manifest file: ".concat(str2));
            JSONObject jSONObject = new JSONObject(str2);
            return new AutoValue_ModelUtils_AutoMLManifest(jSONObject.getString("modelType"), jSONObject.getString("modelFile"), jSONObject.getString("labelsFile"));
        } catch (IOException e) {
            e = e;
            zza.e("ModelUtils", "Error parsing the manifest file.", e);
            return null;
        } catch (JSONException e2) {
            e = e2;
            zza.e("ModelUtils", "Error parsing the manifest file.", e);
            return null;
        }
    }

    public static boolean zza(File file, String str) {
        String sha256 = getSHA256(file);
        zza.d("ModelUtils", "Calculated hash value is: ".concat(String.valueOf(sha256)));
        return str.equals(sha256);
    }

    private static String zzb(Context context, String str, boolean z) {
        AutoMLManifest parseManifestFile = parseManifestFile(str, z, context);
        if (parseManifestFile == null) {
            zza.e("ModelUtils", "Failed to parse manifest file.");
            return null;
        }
        return new File(new File(str).getParent(), parseManifestFile.getModelFile()).toString();
    }

    private static String zzc(InputStream inputStream) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] bArr = new byte[1048576];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    sb.append('0');
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (IOException unused) {
            zza.e("ModelUtils", "Failed to read model file");
            return null;
        } catch (NoSuchAlgorithmException unused2) {
            zza.e("ModelUtils", "Do not have SHA-256 algorithm");
            return null;
        }
    }
}

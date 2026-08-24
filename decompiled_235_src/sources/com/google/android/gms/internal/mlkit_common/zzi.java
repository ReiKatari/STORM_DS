package com.google.android.gms.internal.mlkit_common;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.ProviderInfo;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.os.Build;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.system.StructStat;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.Callable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class zzi {
    public static final /* synthetic */ int zza = 0;
    private static final String[] zzb = {"com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze"};
    private static final String[] zzc;
    private static final String[] zzd;

    static {
        String str;
        String str2;
        String str3 = Build.HARDWARE;
        String str4 = "";
        if (!str3.equals("goldfish") && !str3.equals("ranchu")) {
            str = "";
        } else {
            str = "androidx.test.services.storage.runfiles";
        }
        zzc = new String[]{"media", str};
        int i = Build.VERSION.SDK_INT;
        if (i > 25) {
            str2 = "";
        } else {
            str2 = "com.google.android.inputmethod.latin.inputcontent";
        }
        if (i <= 25) {
            str4 = "com.google.android.inputmethod.latin.dev.inputcontent";
        }
        zzd = new String[]{str2, str4, "com.google.android.apps.docs.storage.legacy"};
    }

    public static AssetFileDescriptor zza(Context context, Uri uri, String str) {
        zzh zzhVar = zzh.zza;
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(zzc2, "r");
        }
        if ("content".equals(scheme)) {
            if (zzj(context, zzc2, 1, zzhVar)) {
                AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(zzc2, "r");
                zzd(openAssetFileDescriptor);
                return openAssetFileDescriptor;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(zzc2, "r");
            zzd(openAssetFileDescriptor2);
            try {
                zzi(context, openAssetFileDescriptor2.getParcelFileDescriptor(), zzc2, zzhVar);
                return openAssetFileDescriptor2;
            } catch (FileNotFoundException e) {
                zzg(openAssetFileDescriptor2, e);
                throw e;
            } catch (IOException e2) {
                FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                fileNotFoundException.initCause(e2);
                zzg(openAssetFileDescriptor2, fileNotFoundException);
                throw fileNotFoundException;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    public static InputStream zzb(Context context, Uri uri, zzh zzhVar) {
        ContentResolver contentResolver = context.getContentResolver();
        Uri zzc2 = zzc(uri);
        String scheme = zzc2.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openInputStream(zzc2);
        }
        if ("content".equals(scheme)) {
            if (zzj(context, zzc2, 1, zzhVar)) {
                InputStream openInputStream = contentResolver.openInputStream(zzc2);
                zzd(openInputStream);
                return openInputStream;
            }
            throw new FileNotFoundException("Can't open content uri.");
        } else if ("file".equals(scheme)) {
            try {
                ParcelFileDescriptor openFileDescriptor = contentResolver.openFileDescriptor(Uri.fromFile(new File(zzc2.getPath()).getCanonicalFile()), "r");
                try {
                    zzi(context, openFileDescriptor, zzc2, zzhVar);
                    return new ParcelFileDescriptor.AutoCloseInputStream(openFileDescriptor);
                } catch (FileNotFoundException e) {
                    zzh(openFileDescriptor, e);
                    throw e;
                } catch (IOException e2) {
                    FileNotFoundException fileNotFoundException = new FileNotFoundException("Validation failed.");
                    fileNotFoundException.initCause(e2);
                    zzh(openFileDescriptor, fileNotFoundException);
                    throw fileNotFoundException;
                }
            } catch (IOException e3) {
                FileNotFoundException fileNotFoundException2 = new FileNotFoundException("Canonicalization failed.");
                fileNotFoundException2.initCause(e3);
                throw fileNotFoundException2;
            }
        } else {
            throw new FileNotFoundException("Unsupported scheme");
        }
    }

    private static Uri zzc(Uri uri) {
        if (Build.VERSION.SDK_INT < 30) {
            return Uri.parse(uri.toString());
        }
        return uri;
    }

    private static Object zzd(Object obj) {
        if (obj != null) {
            return obj;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }

    private static String zze(File file) {
        String canonicalPath = file.getCanonicalPath();
        if (!canonicalPath.endsWith("/")) {
            return canonicalPath.concat("/");
        }
        return canonicalPath;
    }

    private static void zzf(ParcelFileDescriptor parcelFileDescriptor, String str) {
        try {
            StructStat fstat = Os.fstat(parcelFileDescriptor.getFileDescriptor());
            try {
                StructStat lstat = Os.lstat(str);
                if (!OsConstants.S_ISLNK(lstat.st_mode)) {
                    if (fstat.st_dev == lstat.st_dev && fstat.st_ino == lstat.st_ino) {
                        return;
                    }
                    throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
                }
                throw new FileNotFoundException("Can't open file: ".concat(String.valueOf(str)));
            } catch (ErrnoException e) {
                throw new IOException(e);
            }
        } catch (ErrnoException e2) {
            throw new IOException(e2);
        }
    }

    private static void zzg(AssetFileDescriptor assetFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            assetFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static void zzh(ParcelFileDescriptor parcelFileDescriptor, FileNotFoundException fileNotFoundException) {
        try {
            parcelFileDescriptor.close();
        } catch (IOException e) {
            fileNotFoundException.addSuppressed(e);
        }
    }

    private static void zzi(final Context context, ParcelFileDescriptor parcelFileDescriptor, Uri uri, zzh zzhVar) {
        boolean z;
        File dataDir;
        String canonicalPath = new File(uri.getPath()).getCanonicalPath();
        zzf(parcelFileDescriptor, canonicalPath);
        if (!canonicalPath.startsWith("/proc/") && !canonicalPath.startsWith("/data/misc/")) {
            zzh.zza(zzhVar);
            File dataDir2 = context.getDataDir();
            boolean z2 = true;
            if (dataDir2 == null ? !canonicalPath.startsWith(zze(Environment.getDataDirectory())) : !canonicalPath.startsWith(zze(dataDir2))) {
                Context createDeviceProtectedStorageContext = context.createDeviceProtectedStorageContext();
                if (createDeviceProtectedStorageContext == null || (dataDir = createDeviceProtectedStorageContext.getDataDir()) == null || !canonicalPath.startsWith(zze(dataDir))) {
                    File[] zzk = zzk(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzb
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            int i = zzi.zza;
                            return context.getExternalFilesDirs(null);
                        }
                    });
                    int length = zzk.length;
                    int i = 0;
                    while (true) {
                        if (i < length) {
                            File file = zzk[i];
                            if (file != null && canonicalPath.startsWith(zze(file))) {
                                break;
                            }
                            i++;
                        } else {
                            File[] zzk2 = zzk(new Callable() { // from class: com.google.android.gms.internal.mlkit_common.zzc
                                @Override // java.util.concurrent.Callable
                                public final Object call() {
                                    int i2 = zzi.zza;
                                    return context.getExternalCacheDirs();
                                }
                            });
                            int length2 = zzk2.length;
                            int i2 = 0;
                            while (true) {
                                if (i2 < length2) {
                                    File file2 = zzk2[i2];
                                    if (file2 != null && canonicalPath.startsWith(zze(file2))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                        }
                    }
                }
            }
            z = zzhVar.zzb;
            if (z2 == z) {
                return;
            }
        }
        throw new FileNotFoundException("Can't open file: ".concat(canonicalPath));
    }

    private static boolean zzj(Context context, Uri uri, int i, zzh zzhVar) {
        boolean z;
        boolean z2;
        boolean z3;
        String authority = uri.getAuthority();
        ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
        if (resolveContentProvider == null) {
            int lastIndexOf = authority.lastIndexOf(64);
            if (lastIndexOf >= 0) {
                authority = authority.substring(lastIndexOf + 1);
                resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            }
            if (resolveContentProvider == null) {
                z3 = zzhVar.zzb;
                if (z3) {
                    return false;
                }
                return true;
            }
        }
        if (zzh.zzc(zzhVar, context, new zzj(uri, resolveContentProvider, authority)) - 1 == 1) {
            return false;
        }
        if (context.getPackageName().equals(resolveContentProvider.packageName)) {
            z2 = zzhVar.zzb;
            return z2;
        }
        z = zzhVar.zzb;
        if (z) {
            return false;
        }
        if (context.checkUriPermission(uri, Process.myPid(), Process.myUid(), 1) != 0 && resolveContentProvider.exported) {
            String[] strArr = zzc;
            int length = strArr.length;
            for (int i2 = 0; i2 < 2; i2++) {
                if (strArr[i2].equals(authority)) {
                    return true;
                }
            }
            String[] strArr2 = zzd;
            int length2 = strArr2.length;
            for (int i3 = 0; i3 < 3; i3++) {
                if (strArr2[i3].equals(authority)) {
                    return true;
                }
            }
            String[] strArr3 = zzb;
            for (int i4 = 0; i4 < 6; i4++) {
                String str = strArr3[i4];
                char charAt = str.charAt(str.length() - 1);
                String str2 = resolveContentProvider.packageName;
                if (charAt == '.') {
                    if (str2.startsWith(str)) {
                        return false;
                    }
                } else if (str2.equals(str)) {
                    return false;
                }
            }
        }
        return true;
    }

    private static File[] zzk(Callable callable) {
        try {
            return (File[]) callable.call();
        } catch (NullPointerException e) {
            throw e;
        } catch (Exception e2) {
            throw new RuntimeException(e2);
        }
    }
}

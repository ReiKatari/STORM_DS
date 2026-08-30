package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.pm.SigningInfo;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Locale;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cm2  reason: default package */
/* loaded from: classes.dex */
public final class cm2 {
    public final Context a;

    public cm2(Context context) {
        this.a = context;
    }

    public static void a(String str) {
        Log.w("GitHubUpdateInstall", "Downloaded update rejected reason=".concat(str));
    }

    public static t37 b(PackageInfo packageInfo) {
        t37 t37Var;
        long j;
        Signature[] signatureArr;
        SigningInfo signingInfo;
        String str = packageInfo.packageName;
        str.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            j = packageInfo.getLongVersionCode();
        } else {
            j = packageInfo.versionCode;
        }
        String str2 = packageInfo.versionName;
        int i2 = 0;
        if (i >= 28) {
            signingInfo = packageInfo.signingInfo;
            if (signingInfo != null) {
                signatureArr = signingInfo.getSigningCertificateHistory();
            } else {
                signatureArr = null;
            }
            if (signatureArr == null) {
                signatureArr = new Signature[0];
            }
        } else {
            signatureArr = packageInfo.signatures;
            if (signatureArr == null) {
                signatureArr = new Signature[0];
            }
        }
        Signature[] signatureArr2 = signatureArr;
        t37 t37Var2 = t37Var;
        long j2 = j;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int length = signatureArr2.length;
        int i3 = 0;
        while (i3 < length) {
            byte[] digest = MessageDigest.getInstance("SHA-256").digest(signatureArr2[i3].toByteArray());
            digest.getClass();
            StringBuilder sb = new StringBuilder();
            sb.append((CharSequence) "");
            int length2 = digest.length;
            int i4 = i2;
            int i5 = i4;
            while (i4 < length2) {
                byte b = digest[i4];
                i5++;
                if (i5 > 1) {
                    sb.append((CharSequence) "");
                }
                sb.append((CharSequence) String.format("%02x", Arrays.copyOf(new Object[]{Byte.valueOf(b)}, 1)));
                i4++;
                t37Var2 = t37Var2;
            }
            sb.append((CharSequence) "");
            linkedHashSet.add(sb.toString());
            i3++;
            i2 = 0;
            t37Var2 = t37Var2;
        }
        t37Var2 = new t37(str, j2, str2, linkedHashSet);
        return t37Var2;
    }

    public final boolean c(us usVar, File file) {
        PackageInfo packageArchiveInfo;
        PackageInfo packageInfo;
        boolean z;
        u37 u37Var;
        PackageManager.PackageInfoFlags of;
        PackageManager.PackageInfoFlags of2;
        usVar.getClass();
        if (file.isFile() && file.length() > 0) {
            int i = Build.VERSION.SDK_INT;
            Context context = this.a;
            if (i >= 33) {
                PackageManager packageManager = context.getPackageManager();
                String absolutePath = file.getAbsolutePath();
                of2 = PackageManager.PackageInfoFlags.of(134217728L);
                packageArchiveInfo = packageManager.getPackageArchiveInfo(absolutePath, of2);
            } else {
                packageArchiveInfo = context.getPackageManager().getPackageArchiveInfo(file.getAbsolutePath(), 134217728);
            }
            if (packageArchiveInfo == null) {
                a("unreadable_apk");
                return false;
            }
            PackageManager packageManager2 = context.getPackageManager();
            packageManager2.getClass();
            String packageName = context.getPackageName();
            packageName.getClass();
            if (i >= 33) {
                of = PackageManager.PackageInfoFlags.of(134217728L);
                packageInfo = packageManager2.getPackageInfo(packageName, of);
                packageInfo.getClass();
            } else {
                packageInfo = packageManager2.getPackageInfo(packageName, 134217728);
                packageInfo.getClass();
            }
            t37 b = b(packageArchiveInfo);
            t37 b2 = b(packageInfo);
            c87 c87Var = usVar.d;
            if (usVar.a == ts.PRODUCTION) {
                z = true;
            } else {
                z = false;
            }
            long j = usVar.f;
            long length = file.length();
            if (j > 0 && j != length) {
                u37Var = u37.SIZE_MISMATCH;
            } else if (b.a.equals("me.magnum.melondualds") && b2.a.equals("me.magnum.melondualds")) {
                if (b.b <= b2.b) {
                    u37Var = u37.VERSION_CODE_NOT_NEWER;
                } else {
                    if (z) {
                        c87 c87Var2 = c87.Z;
                        c87 J = sn2.J(b.c);
                        if (J == null || J.A != c87Var.A || J.B != c87Var.B || J.L != c87Var.L || J.R != c87Var.R || J.X != c87Var.X) {
                            u37Var = u37.VERSION_NAME_MISMATCH;
                        }
                    }
                    if (tq0.P0(b.d, b2.d).isEmpty()) {
                        u37Var = u37.SIGNATURE_MISMATCH;
                    } else {
                        u37Var = null;
                    }
                }
            } else {
                u37Var = u37.PACKAGE_MISMATCH;
            }
            if (u37Var == null) {
                return true;
            }
            String lowerCase = u37Var.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            a(lowerCase);
            return false;
        }
        a("missing_apk");
        return false;
    }
}

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
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs2  reason: default package */
/* loaded from: classes.dex */
public final class hs2 {
    public final Context a;

    public hs2(Context context) {
        this.a = context;
    }

    public static void a(String str) {
        Log.w("GitHubUpdateInstall", "Downloaded update rejected reason=".concat(str));
    }

    public static oh7 b(PackageInfo packageInfo) {
        oh7 oh7Var;
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
        oh7 oh7Var2 = oh7Var;
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
                oh7Var2 = oh7Var2;
            }
            sb.append((CharSequence) "");
            linkedHashSet.add(sb.toString());
            i3++;
            i2 = 0;
            oh7Var2 = oh7Var2;
        }
        oh7Var2 = new oh7(str, j2, str2, linkedHashSet);
        return oh7Var2;
    }

    public final boolean c(kt ktVar, File file) {
        PackageInfo packageArchiveInfo;
        PackageInfo packageInfo;
        boolean z;
        ph7 ph7Var;
        PackageManager.PackageInfoFlags of;
        PackageManager.PackageInfoFlags of2;
        ktVar.getClass();
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
            oh7 b = b(packageArchiveInfo);
            oh7 b2 = b(packageInfo);
            bm7 bm7Var = ktVar.d;
            if (ktVar.a == jt.PRODUCTION) {
                z = true;
            } else {
                z = false;
            }
            long j = ktVar.f;
            long length = file.length();
            if (j > 0 && j != length) {
                ph7Var = ph7.SIZE_MISMATCH;
            } else if (b.a.equals("me.magnum.melondualds") && b2.a.equals("me.magnum.melondualds")) {
                if (b.b <= b2.b) {
                    ph7Var = ph7.VERSION_CODE_NOT_NEWER;
                } else {
                    if (z) {
                        bm7 bm7Var2 = bm7.Z;
                        bm7 Z = np2.Z(b.c);
                        if (Z == null || Z.A != bm7Var.A || Z.B != bm7Var.B || Z.L != bm7Var.L || Z.R != bm7Var.R || Z.X != bm7Var.X) {
                            ph7Var = ph7.VERSION_NAME_MISMATCH;
                        }
                    }
                    if (gt0.M0(b.d, b2.d).isEmpty()) {
                        ph7Var = ph7.SIGNATURE_MISMATCH;
                    } else {
                        ph7Var = null;
                    }
                }
            } else {
                ph7Var = ph7.PACKAGE_MISMATCH;
            }
            if (ph7Var == null) {
                return true;
            }
            String lowerCase = ph7Var.name().toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            a(lowerCase);
            return false;
        }
        a("missing_apk");
        return false;
    }
}

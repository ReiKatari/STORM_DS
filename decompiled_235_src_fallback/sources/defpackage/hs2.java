package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: hs2  reason: default package */
/* loaded from: classes.dex */
public final class hs2 {
    public final android.content.Context a;

    public hs2(android.content.Context r1) {
            r0 = this;
            r0.<init>()
            r0.a = r1
            return
    }

    public static void a(java.lang.String r1) {
            java.lang.String r0 = "Downloaded update rejected reason="
            java.lang.String r1 = r0.concat(r1)
            java.lang.String r0 = "GitHubUpdateInstall"
            android.util.Log.w(r0, r1)
            return
    }

    public static defpackage.oh7 b(android.content.pm.PackageInfo r17) {
            r0 = r17
            oh7 r1 = new oh7
            r2 = r1
            java.lang.String r1 = r0.packageName
            r1.getClass()
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 28
            if (r3 < r4) goto L15
            long r5 = defpackage.yr1.b(r0)
            goto L18
        L15:
            int r5 = r0.versionCode
            long r5 = (long) r5
        L18:
            java.lang.String r7 = r0.versionName
            r8 = 0
            if (r3 < r4) goto L31
            android.content.pm.SigningInfo r0 = defpackage.yr1.c(r0)
            if (r0 == 0) goto L28
            android.content.pm.Signature[] r0 = defpackage.yr1.z(r0)
            goto L29
        L28:
            r0 = 0
        L29:
            if (r0 != 0) goto L2d
            android.content.pm.Signature[] r0 = new android.content.pm.Signature[r8]
        L2d:
            r9 = r0
            r0 = r2
            r2 = r5
            goto L38
        L31:
            android.content.pm.Signature[] r0 = r0.signatures
            if (r0 != 0) goto L2d
            android.content.pm.Signature[] r0 = new android.content.pm.Signature[r8]
            goto L2d
        L38:
            java.util.LinkedHashSet r5 = new java.util.LinkedHashSet
            r5.<init>()
            int r6 = r9.length
            r4 = r8
        L3f:
            if (r4 >= r6) goto L9b
            r10 = r9[r4]
            java.lang.String r11 = "SHA-256"
            java.security.MessageDigest r11 = java.security.MessageDigest.getInstance(r11)
            byte[] r10 = r10.toByteArray()
            byte[] r10 = r11.digest(r10)
            r10.getClass()
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r12 = ""
            r11.append(r12)
            int r13 = r10.length
            r14 = r8
            r15 = r14
        L61:
            if (r14 >= r13) goto L89
            r16 = r10[r14]
            r8 = 1
            int r15 = r15 + r8
            if (r15 <= r8) goto L6c
            r11.append(r12)
        L6c:
            java.lang.Byte r16 = java.lang.Byte.valueOf(r16)
            r17 = r0
            java.lang.Object[] r0 = new java.lang.Object[]{r16}
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r8)
            java.lang.String r8 = "%02x"
            java.lang.String r0 = java.lang.String.format(r8, r0)
            r11.append(r0)
            int r14 = r14 + 1
            r8 = 0
            r0 = r17
            goto L61
        L89:
            r17 = r0
            r11.append(r12)
            java.lang.String r0 = r11.toString()
            r5.add(r0)
            int r4 = r4 + 1
            r8 = 0
            r0 = r17
            goto L3f
        L9b:
            r4 = r7
            r0.<init>(r1, r2, r4, r5)
            return r0
    }

    public final boolean c(defpackage.kt r12, java.io.File r13) {
            r11 = this;
            r12.getClass()
            boolean r0 = r13.isFile()
            r1 = 0
            if (r0 == 0) goto L105
            long r2 = r13.length()
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 > 0) goto L16
            goto L105
        L16:
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 134217728(0x8000000, double:6.63123685E-316)
            r6 = 33
            android.content.Context r11 = r11.a
            r7 = 134217728(0x8000000, float:3.85186E-34)
            if (r0 < r6) goto L34
            android.content.pm.PackageManager r8 = r11.getPackageManager()
            java.lang.String r9 = r13.getAbsolutePath()
            android.content.pm.PackageManager$PackageInfoFlags r10 = defpackage.a81.b(r2)
            android.content.pm.PackageInfo r8 = defpackage.a81.a(r8, r9, r10)
            goto L40
        L34:
            android.content.pm.PackageManager r8 = r11.getPackageManager()
            java.lang.String r9 = r13.getAbsolutePath()
            android.content.pm.PackageInfo r8 = r8.getPackageArchiveInfo(r9, r7)
        L40:
            if (r8 != 0) goto L48
            java.lang.String r11 = "unreadable_apk"
            a(r11)
            return r1
        L48:
            android.content.pm.PackageManager r9 = r11.getPackageManager()
            r9.getClass()
            java.lang.String r11 = r11.getPackageName()
            r11.getClass()
            if (r0 < r6) goto L64
            android.content.pm.PackageManager$PackageInfoFlags r0 = defpackage.a81.b(r2)
            android.content.pm.PackageInfo r11 = defpackage.a81.s(r9, r11, r0)
            r11.getClass()
            goto L6b
        L64:
            android.content.pm.PackageInfo r11 = r9.getPackageInfo(r11, r7)
            r11.getClass()
        L6b:
            oh7 r0 = b(r8)
            oh7 r11 = b(r11)
            bm7 r2 = r12.d
            jt r3 = r12.a
            jt r6 = defpackage.jt.PRODUCTION
            r7 = 1
            if (r3 != r6) goto L7e
            r3 = r7
            goto L7f
        L7e:
            r3 = r1
        L7f:
            long r8 = r12.f
            long r12 = r13.length()
            int r4 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r4 <= 0) goto L90
            int r12 = (r8 > r12 ? 1 : (r8 == r12 ? 0 : -1))
            if (r12 == 0) goto L90
            ph7 r11 = defpackage.ph7.SIZE_MISMATCH
            goto Lf1
        L90:
            java.lang.String r12 = r0.a
            java.lang.String r13 = "me.magnum.melondualds"
            boolean r12 = r12.equals(r13)
            if (r12 == 0) goto Lef
            java.lang.String r12 = r11.a
            boolean r12 = r12.equals(r13)
            if (r12 != 0) goto La3
            goto Lef
        La3:
            long r12 = r0.b
            long r4 = r11.b
            int r12 = (r12 > r4 ? 1 : (r12 == r4 ? 0 : -1))
            if (r12 > 0) goto Lae
            ph7 r11 = defpackage.ph7.VERSION_CODE_NOT_NEWER
            goto Lf1
        Lae:
            if (r3 == 0) goto Ldc
            bm7 r12 = defpackage.bm7.Z
            java.lang.String r12 = r0.c
            bm7 r12 = defpackage.np2.Z(r12)
            if (r12 == 0) goto Ld9
            wl7 r13 = r12.A
            wl7 r3 = r2.A
            if (r13 != r3) goto Ld9
            int r13 = r12.B
            int r3 = r2.B
            if (r13 != r3) goto Ld9
            int r13 = r12.L
            int r3 = r2.L
            if (r13 != r3) goto Ld9
            int r13 = r12.R
            int r3 = r2.R
            if (r13 != r3) goto Ld9
            int r12 = r12.X
            int r13 = r2.X
            if (r12 != r13) goto Ld9
            goto Ldc
        Ld9:
            ph7 r11 = defpackage.ph7.VERSION_NAME_MISMATCH
            goto Lf1
        Ldc:
            java.util.LinkedHashSet r12 = r0.d
            java.util.LinkedHashSet r11 = r11.d
            java.util.LinkedHashSet r11 = defpackage.gt0.M0(r12, r11)
            boolean r11 = r11.isEmpty()
            if (r11 == 0) goto Led
            ph7 r11 = defpackage.ph7.SIGNATURE_MISMATCH
            goto Lf1
        Led:
            r11 = 0
            goto Lf1
        Lef:
            ph7 r11 = defpackage.ph7.PACKAGE_MISMATCH
        Lf1:
            if (r11 == 0) goto L104
            java.lang.String r11 = r11.name()
            java.util.Locale r12 = java.util.Locale.ROOT
            java.lang.String r11 = r11.toLowerCase(r12)
            r11.getClass()
            a(r11)
            return r1
        L104:
            return r7
        L105:
            java.lang.String r11 = "missing_apk"
            a(r11)
            return r1
    }
}

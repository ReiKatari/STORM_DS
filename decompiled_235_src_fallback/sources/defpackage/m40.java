package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: m40  reason: default package */
/* loaded from: classes.dex */
public final class m40 {
    public static final java.util.List c = null;
    public static final java.util.List d = null;
    public final android.content.Context a;
    public final defpackage.kd6 b;

    static {
            java.lang.String r0 = "https://github.com/ReiKatari/STORM_DS_TOOLS/releases/download/0.0.1/Nintendo_DS.zip"
            java.lang.String r1 = "https://raw.githubusercontent.com/archeader/melonDS-android/main/bios/ds_bios.zip"
            java.lang.String r2 = "https://cdn.jsdelivr.net/gh/archeader/melonDS-android@main/bios/ds_bios.zip"
            java.lang.String r3 = "https://github.com/melonds-emu/melonDS/releases/download/bios/nds_bios.zip"
            java.lang.String r4 = "https://archive.org/download/nds_bios_firmware/nds_bios_firmware.zip"
            java.lang.String[] r0 = new java.lang.String[]{r0, r1, r2, r3, r4}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.m40.c = r0
            java.lang.String r0 = "https://cdn.jsdelivr.net/gh/archeader/melonDS-android@main/bios/dsi_bios.zip"
            java.lang.String r1 = "https://github.com/melonds-emu/melonDS/releases/download/bios/dsi_bios.zip"
            java.lang.String r2 = "https://github.com/ReiKatari/STORM_DS_TOOLS/releases/download/0.0.1/Nintendo_DSi.zip"
            java.lang.String r3 = "https://raw.githubusercontent.com/archeader/melonDS-android/main/bios/dsi_bios.zip"
            java.lang.String[] r0 = new java.lang.String[]{r2, r3, r0, r1, r4}
            java.util.List r0 = defpackage.hf.c0(r0)
            defpackage.m40.d = r0
            return
    }

    public m40(android.content.Context r1, defpackage.kd6 r2) {
            r0 = this;
            r2.getClass()
            r0.<init>()
            r0.a = r1
            r0.b = r2
            return
    }

    public static final void a(defpackage.m40 r8, java.lang.String r9, java.io.File r10, defpackage.qn2 r11) {
            r8 = 0
            r0 = r8
        L2:
            r1 = 10
            if (r0 >= r1) goto L107
            java.net.URL r1 = new java.net.URL
            r1.<init>(r9)
            java.net.URLConnection r9 = r1.openConnection()
            r9.getClass()
            java.net.HttpURLConnection r9 = (java.net.HttpURLConnection) r9
            r2 = 20000(0x4e20, float:2.8026E-41)
            r9.setConnectTimeout(r2)
            r2 = 45000(0xafc8, float:6.3058E-41)
            r9.setReadTimeout(r2)
            r9.setInstanceFollowRedirects(r8)
            java.lang.String r2 = "User-Agent"
            java.lang.String r3 = "Mozilla/5.0 (Linux; Android 14; Mobile) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/128.0.0.0 Mobile Safari/537.36"
            r9.setRequestProperty(r2, r3)
            java.lang.String r2 = "Accept"
            java.lang.String r3 = "*/*"
            r9.setRequestProperty(r2, r3)
            r9.connect()
            int r2 = r9.getResponseCode()
            r3 = 301(0x12d, float:4.22E-43)
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)
            r4 = 302(0x12e, float:4.23E-43)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            r5 = 303(0x12f, float:4.25E-43)
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6 = 307(0x133, float:4.3E-43)
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7 = 308(0x134, float:4.32E-43)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            java.lang.Integer[] r3 = new java.lang.Integer[]{r3, r4, r5, r6, r7}
            java.util.List r3 = defpackage.hf.c0(r3)
            java.lang.Integer r4 = java.lang.Integer.valueOf(r2)
            boolean r3 = r3.contains(r4)
            if (r3 == 0) goto La7
            java.lang.String r3 = "Location"
            java.lang.String r3 = r9.getHeaderField(r3)
            r9.disconnect()
            if (r3 == 0) goto L9b
            boolean r9 = defpackage.qs6.v0(r3)
            if (r9 != 0) goto L9b
            java.lang.String r9 = "http://"
            boolean r9 = defpackage.xs6.g0(r3, r9, r8)
            if (r9 != 0) goto L96
            java.lang.String r9 = "https://"
            boolean r9 = defpackage.xs6.g0(r3, r9, r8)
            if (r9 == 0) goto L89
            goto L96
        L89:
            java.net.URL r9 = new java.net.URL
            r9.<init>(r1, r3)
            java.lang.String r9 = r9.toString()
            r9.getClass()
            goto L97
        L96:
            r9 = r3
        L97:
            int r0 = r0 + 1
            goto L2
        L9b:
            java.lang.String r8 = "HTTP redirect "
            java.lang.String r9 = " with missing Location header"
            java.lang.String r8 = defpackage.lb1.k(r8, r2, r9)
            defpackage.e41.i(r8)
            return
        La7:
            r0 = 200(0xc8, float:2.8E-43)
            if (r0 > r2) goto Lfa
            r0 = 300(0x12c, float:4.2E-43)
            if (r2 >= r0) goto Lfa
            int r0 = r9.getContentLength()
            java.io.InputStream r9 = r9.getInputStream()
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> Lec
            r1.<init>(r10)     // Catch: java.lang.Throwable -> Lec
            r10 = 8192(0x2000, float:1.148E-41)
            byte[] r10 = new byte[r10]     // Catch: java.lang.Throwable -> Le3
            r2 = r8
        Lc1:
            int r3 = r9.read(r10)     // Catch: java.lang.Throwable -> Le3
            r4 = -1
            if (r3 == r4) goto Le5
            r1.write(r10, r8, r3)     // Catch: java.lang.Throwable -> Le3
            int r2 = r2 + r3
            if (r0 <= 0) goto Lc1
            double r3 = (double) r2     // Catch: java.lang.Throwable -> Le3
            double r5 = (double) r0     // Catch: java.lang.Throwable -> Le3
            double r3 = r3 / r5
            r5 = 4636737291354636288(0x4059000000000000, double:100.0)
            double r3 = r3 * r5
            int r3 = (int) r3     // Catch: java.lang.Throwable -> Le3
            r4 = 100
            int r3 = defpackage.gi2.q(r3, r8, r4)     // Catch: java.lang.Throwable -> Le3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> Le3
            r11.g(r3)     // Catch: java.lang.Throwable -> Le3
            goto Lc1
        Le3:
            r8 = move-exception
            goto Lee
        Le5:
            r1.close()     // Catch: java.lang.Throwable -> Lec
            r9.close()
            return
        Lec:
            r8 = move-exception
            goto Lf4
        Lee:
            throw r8     // Catch: java.lang.Throwable -> Lef
        Lef:
            r10 = move-exception
            defpackage.ge7.t(r1, r8)     // Catch: java.lang.Throwable -> Lec
            throw r10     // Catch: java.lang.Throwable -> Lec
        Lf4:
            throw r8     // Catch: java.lang.Throwable -> Lf5
        Lf5:
            r10 = move-exception
            defpackage.ge7.t(r9, r8)
            throw r10
        Lfa:
            r9.disconnect()
            java.lang.String r8 = "HTTP error "
            java.lang.String r8 = defpackage.lb1.g(r2, r8)
            defpackage.e41.i(r8)
            return
        L107:
            java.lang.String r8 = "Too many redirects ("
            java.lang.String r9 = ")"
            java.lang.String r8 = defpackage.lb1.k(r8, r0, r9)
            defpackage.e41.i(r8)
            return
    }

    public static final void b(defpackage.m40 r3, java.io.File r4, java.io.File r5, boolean r6) {
            java.io.FileInputStream r3 = new java.io.FileInputStream
            r3.<init>(r4)
            java.util.zip.ZipInputStream r4 = new java.util.zip.ZipInputStream     // Catch: java.lang.Throwable -> L1e
            java.io.BufferedInputStream r0 = new java.io.BufferedInputStream     // Catch: java.lang.Throwable -> L1e
            r1 = 8192(0x2000, float:1.148E-41)
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L1e
            r4.<init>(r0)     // Catch: java.lang.Throwable -> L1e
        L11:
            java.util.zip.ZipEntry r0 = r4.getNextEntry()     // Catch: java.lang.Throwable -> L7e
            if (r0 != 0) goto L21
            r4.close()     // Catch: java.lang.Throwable -> L1e
            r3.close()
            return
        L1e:
            r4 = move-exception
            goto Lb2
        L21:
            java.lang.String r0 = r0.getName()     // Catch: java.lang.Throwable -> L7e
            r0.getClass()     // Catch: java.lang.Throwable -> L7e
            r1 = 47
            java.lang.String r0 = defpackage.qs6.O0(r1, r0, r0)     // Catch: java.lang.Throwable -> L7e
            java.util.Locale r1 = java.util.Locale.ROOT     // Catch: java.lang.Throwable -> L7e
            java.lang.String r0 = r0.toLowerCase(r1)     // Catch: java.lang.Throwable -> L7e
            r0.getClass()     // Catch: java.lang.Throwable -> L7e
            java.lang.String r1 = "bios7"
            r2 = 0
            boolean r1 = defpackage.qs6.j0(r0, r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L8b
            java.lang.String r1 = "arm7"
            boolean r1 = defpackage.qs6.j0(r0, r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L49
            goto L8b
        L49:
            java.lang.String r1 = "bios9"
            boolean r1 = defpackage.qs6.j0(r0, r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L88
            java.lang.String r1 = "arm9"
            boolean r1 = defpackage.qs6.j0(r0, r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L5a
            goto L88
        L5a:
            java.lang.String r1 = "firmware"
            boolean r1 = defpackage.qs6.j0(r0, r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L85
            java.lang.String r1 = "bios.bin"
            boolean r1 = defpackage.qs6.j0(r0, r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r1 == 0) goto L6b
            goto L85
        L6b:
            if (r6 == 0) goto L83
            java.lang.String r1 = "nand"
            boolean r1 = defpackage.qs6.j0(r0, r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r1 != 0) goto L80
            java.lang.String r1 = ".nand"
            boolean r0 = defpackage.xs6.Y(r0, r1, r2)     // Catch: java.lang.Throwable -> L7e
            if (r0 == 0) goto L83
            goto L80
        L7e:
            r5 = move-exception
            goto Lac
        L80:
            java.lang.String r0 = "nand.bin"
            goto L8d
        L83:
            r0 = 0
            goto L8d
        L85:
            java.lang.String r0 = "firmware.bin"
            goto L8d
        L88:
            java.lang.String r0 = "bios9.bin"
            goto L8d
        L8b:
            java.lang.String r0 = "bios7.bin"
        L8d:
            if (r0 == 0) goto La7
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L7e
            r1.<init>(r5, r0)     // Catch: java.lang.Throwable -> L7e
            java.io.FileOutputStream r0 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L7e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L7e
            defpackage.f04.w(r4, r0)     // Catch: java.lang.Throwable -> La0
            r0.close()     // Catch: java.lang.Throwable -> L7e
            goto La7
        La0:
            r5 = move-exception
            throw r5     // Catch: java.lang.Throwable -> La2
        La2:
            r6 = move-exception
            defpackage.ge7.t(r0, r5)     // Catch: java.lang.Throwable -> L7e
            throw r6     // Catch: java.lang.Throwable -> L7e
        La7:
            r4.closeEntry()     // Catch: java.lang.Throwable -> L7e
            goto L11
        Lac:
            throw r5     // Catch: java.lang.Throwable -> Lad
        Lad:
            r6 = move-exception
            defpackage.ge7.t(r4, r5)     // Catch: java.lang.Throwable -> L1e
            throw r6     // Catch: java.lang.Throwable -> L1e
        Lb2:
            throw r4     // Catch: java.lang.Throwable -> Lb3
        Lb3:
            r5 = move-exception
            defpackage.ge7.t(r3, r4)
            throw r5
    }

    public static final boolean c(defpackage.m40 r4, java.io.File r5) {
            java.io.File r4 = new java.io.File
            java.lang.String r0 = "bios7.bin"
            r4.<init>(r5, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "bios9.bin"
            r0.<init>(r5, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "firmware.bin"
            r1.<init>(r5, r2)
            boolean r5 = r4.exists()
            if (r5 == 0) goto L48
            long r4 = r4.length()
            r2 = 16384(0x4000, double:8.095E-320)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L48
            boolean r4 = r0.exists()
            if (r4 == 0) goto L48
            long r4 = r0.length()
            r2 = 4096(0x1000, double:2.0237E-320)
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L48
            boolean r4 = r1.exists()
            if (r4 == 0) goto L48
            long r4 = r1.length()
            r0 = 131072(0x20000, double:6.4758E-319)
            int r4 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            if (r4 < 0) goto L48
            r4 = 1
            return r4
        L48:
            r4 = 0
            return r4
    }

    public static final boolean d(defpackage.m40 r8, java.io.File r9) {
            java.io.File r8 = new java.io.File
            java.lang.String r0 = "bios7.bin"
            r8.<init>(r9, r0)
            java.io.File r0 = new java.io.File
            java.lang.String r1 = "bios9.bin"
            r0.<init>(r9, r1)
            java.io.File r1 = new java.io.File
            java.lang.String r2 = "firmware.bin"
            r1.<init>(r9, r2)
            java.io.File r2 = new java.io.File
            java.lang.String r3 = "nand.bin"
            r2.<init>(r9, r3)
            boolean r9 = r8.exists()
            r3 = 0
            if (r9 == 0) goto Ld4
            long r8 = r8.length()
            r4 = 65536(0x10000, double:3.2379E-319)
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 < 0) goto Ld4
            boolean r8 = r0.exists()
            if (r8 == 0) goto Ld4
            long r8 = r0.length()
            int r8 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r8 < 0) goto Ld4
            boolean r8 = r1.exists()
            if (r8 == 0) goto Ld4
            long r8 = r1.length()
            r0 = 131072(0x20000, double:6.4758E-319)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L4f
            goto Ld4
        L4f:
            boolean r8 = r2.exists()
            if (r8 == 0) goto Ld4
            long r8 = r2.length()
            r0 = 1048576(0x100000, double:5.180654E-318)
            int r8 = (r8 > r0 ? 1 : (r8 == r0 ? 0 : -1))
            if (r8 >= 0) goto L62
            goto Ld4
        L62:
            java.io.RandomAccessFile r8 = new java.io.RandomAccessFile     // Catch: java.lang.Throwable -> Ld4
            java.lang.String r9 = "r"
            r8.<init>(r2, r9)     // Catch: java.lang.Throwable -> Ld4
            long r0 = r8.length()     // Catch: java.lang.Throwable -> L90
            r4 = 64
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            java.lang.String r2 = "DSi eMMC CID/CPU"
            r6 = 16
            r7 = 1
            if (r9 < 0) goto L92
            long r4 = r0 - r4
            r8.seek(r4)     // Catch: java.lang.Throwable -> L90
            byte[] r9 = new byte[r6]     // Catch: java.lang.Throwable -> L90
            r8.readFully(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.String r4 = new java.lang.String     // Catch: java.lang.Throwable -> L90
            java.nio.charset.Charset r5 = defpackage.qm0.d     // Catch: java.lang.Throwable -> L90
            r4.<init>(r9, r5)     // Catch: java.lang.Throwable -> L90
            boolean r9 = defpackage.xs6.g0(r4, r2, r3)     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto L92
            goto Lca
        L90:
            r9 = move-exception
            goto Lce
        L92:
            r4 = 1046544(0xff810, double:5.170614E-318)
            int r9 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r9 < 0) goto Lb2
            r0 = 1046528(0xff800, double:5.170535E-318)
            r8.seek(r0)     // Catch: java.lang.Throwable -> L90
            byte[] r9 = new byte[r6]     // Catch: java.lang.Throwable -> L90
            r8.readFully(r9)     // Catch: java.lang.Throwable -> L90
            java.lang.String r0 = new java.lang.String     // Catch: java.lang.Throwable -> L90
            java.nio.charset.Charset r1 = defpackage.qm0.d     // Catch: java.lang.Throwable -> L90
            r0.<init>(r9, r1)     // Catch: java.lang.Throwable -> L90
            boolean r9 = defpackage.xs6.g0(r0, r2, r3)     // Catch: java.lang.Throwable -> L90
            if (r9 == 0) goto Lb2
            goto Lca
        Lb2:
            r0 = 0
            r8.seek(r0)     // Catch: java.lang.Throwable -> L90
            r9 = 512(0x200, float:7.17E-43)
            byte[] r0 = new byte[r9]     // Catch: java.lang.Throwable -> L90
            r8.readFully(r0)     // Catch: java.lang.Throwable -> L90
            r1 = r3
        Lbf:
            if (r1 >= r9) goto Lc9
            r2 = r0[r1]     // Catch: java.lang.Throwable -> L90
            if (r2 == 0) goto Lc6
            goto Lca
        Lc6:
            int r1 = r1 + 1
            goto Lbf
        Lc9:
            r7 = r3
        Lca:
            r8.close()     // Catch: java.lang.Throwable -> Ld4
            return r7
        Lce:
            throw r9     // Catch: java.lang.Throwable -> Lcf
        Lcf:
            r0 = move-exception
            defpackage.ge7.t(r8, r9)     // Catch: java.lang.Throwable -> Ld4
            throw r0     // Catch: java.lang.Throwable -> Ld4
        Ld4:
            return r3
    }

    public final java.lang.Object e(defpackage.i81 r7, defpackage.s41 r8) {
            r6 = this;
            boolean r0 = r8 instanceof defpackage.j40
            if (r0 == 0) goto L13
            r0 = r8
            j40 r0 = (defpackage.j40) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            j40 r0 = new j40
            r0.<init>(r6, r8)
        L18:
            java.lang.Object r8 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r8)
            goto L44
        L28:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r6)
            return r3
        L2e:
            defpackage.oi2.Y(r8)
            xe1 r8 = defpackage.xk1.a
            de1 r8 = defpackage.de1.L
            k40 r2 = new k40
            r5 = 0
            r2.<init>(r6, r7, r3, r5)
            r0.Y = r4
            java.lang.Object r8 = defpackage.hv.d0(r8, r2, r0)
            if (r8 != r1) goto L44
            return r1
        L44:
            hm5 r8 = (defpackage.hm5) r8
            java.lang.Object r6 = r8.A
            return r6
    }

    public final java.lang.Object f(defpackage.i81 r6, defpackage.s41 r7) {
            r5 = this;
            boolean r0 = r7 instanceof defpackage.l40
            if (r0 == 0) goto L13
            r0 = r7
            l40 r0 = (defpackage.l40) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            l40 r0 = new l40
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            x61 r1 = defpackage.x61.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 != r4) goto L28
            defpackage.oi2.Y(r7)
            goto L43
        L28:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.m(r5)
            return r3
        L2e:
            defpackage.oi2.Y(r7)
            xe1 r7 = defpackage.xk1.a
            de1 r7 = defpackage.de1.L
            k40 r2 = new k40
            r2.<init>(r5, r6, r3, r4)
            r0.Y = r4
            java.lang.Object r7 = defpackage.hv.d0(r7, r2, r0)
            if (r7 != r1) goto L43
            return r1
        L43:
            hm5 r7 = (defpackage.hm5) r7
            java.lang.Object r5 = r7.A
            return r5
    }
}

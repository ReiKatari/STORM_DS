package h7;

import android.content.pm.PackageInfo;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.zip.Deflater;
import java.util.zip.DeflaterOutputStream;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class e {

    /* renamed from: a  reason: collision with root package name */
    public static final na.f f6299a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final byte[] f6300b = {112, 114, 111, 0};

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f6301c = {112, 114, 109, 0};

    /* renamed from: d  reason: collision with root package name */
    public static final byte[] f6302d = {48, 49, 53, 0};

    /* renamed from: e  reason: collision with root package name */
    public static final byte[] f6303e = {48, 49, 48, 0};

    /* renamed from: f  reason: collision with root package name */
    public static final byte[] f6304f = {48, 48, 57, 0};

    /* renamed from: g  reason: collision with root package name */
    public static final byte[] f6305g = {48, 48, 53, 0};

    /* renamed from: h  reason: collision with root package name */
    public static final byte[] f6306h = {48, 48, 49, 0};

    /* renamed from: i  reason: collision with root package name */
    public static final byte[] f6307i = {48, 48, 49, 0};

    /* renamed from: j  reason: collision with root package name */
    public static final byte[] f6308j = {48, 48, 50, 0};

    public static byte[] a(byte[] bArr) {
        Deflater deflater = new Deflater(1);
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            DeflaterOutputStream deflaterOutputStream = new DeflaterOutputStream(byteArrayOutputStream, deflater);
            deflaterOutputStream.write(bArr);
            deflaterOutputStream.close();
            deflater.end();
            return byteArrayOutputStream.toByteArray();
        } catch (Throwable th2) {
            deflater.end();
            throw th2;
        }
    }

    public static byte[] b(a[] aVarArr, byte[] bArr) {
        int i2 = 0;
        int i10 = 0;
        for (a aVar : aVarArr) {
            i10 += ((((aVar.f6296g * 2) + 7) & (-8)) / 8) + (aVar.f6294e * 2) + d(aVar.f6290a, aVar.f6291b, bArr).getBytes(StandardCharsets.UTF_8).length + 16 + aVar.f6295f;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(i10);
        if (Arrays.equals(bArr, f6304f)) {
            int length = aVarArr.length;
            while (i2 < length) {
                a aVar2 = aVarArr[i2];
                q(byteArrayOutputStream, aVar2, d(aVar2.f6290a, aVar2.f6291b, bArr));
                p(byteArrayOutputStream, aVar2);
                i2++;
            }
        } else {
            for (a aVar3 : aVarArr) {
                q(byteArrayOutputStream, aVar3, d(aVar3.f6290a, aVar3.f6291b, bArr));
            }
            int length2 = aVarArr.length;
            while (i2 < length2) {
                p(byteArrayOutputStream, aVarArr[i2]);
                i2++;
            }
        }
        if (byteArrayOutputStream.size() == i10) {
            return byteArrayOutputStream.toByteArray();
        }
        throw new IllegalStateException("The bytes saved do not match expectation. actual=" + byteArrayOutputStream.size() + " expected=" + i10);
    }

    public static boolean c(File file) {
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            if (listFiles == null) {
                return false;
            }
            boolean z10 = true;
            for (File file2 : listFiles) {
                if (c(file2) && z10) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            return z10;
        }
        file.delete();
        return true;
    }

    public static String d(String str, String str2, byte[] bArr) {
        Object obj;
        byte[] bArr2 = f6306h;
        boolean equals = Arrays.equals(bArr, bArr2);
        byte[] bArr3 = f6305g;
        String str3 = "!";
        if (!equals && !Arrays.equals(bArr, bArr3)) {
            obj = "!";
        } else {
            obj = ":";
        }
        if (str.length() <= 0) {
            if ("!".equals(obj)) {
                return str2.replace(":", "!");
            }
            if (":".equals(obj)) {
                return str2.replace("!", ":");
            }
        } else if (str2.equals("classes.dex")) {
            return str;
        } else {
            if (!str2.contains("!") && !str2.contains(":")) {
                if (!str2.endsWith(".apk")) {
                    return w.d.s(w.d.t(str), (Arrays.equals(bArr, bArr2) || Arrays.equals(bArr, bArr3)) ? ":" : ":", str2);
                }
            } else if ("!".equals(obj)) {
                return str2.replace(":", "!");
            } else {
                if (":".equals(obj)) {
                    return str2.replace("!", ":");
                }
            }
        }
        return str2;
    }

    public static void e(PackageInfo packageInfo, File file) {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(new File(file, "profileinstaller_profileWrittenFor_lastUpdateTime.dat")));
            dataOutputStream.writeLong(packageInfo.lastUpdateTime);
            dataOutputStream.close();
        } catch (IOException unused) {
        }
    }

    public static byte[] f(InputStream inputStream, int i2) {
        byte[] bArr = new byte[i2];
        int i10 = 0;
        while (i10 < i2) {
            int read = inputStream.read(bArr, i10, i2 - i10);
            if (read >= 0) {
                i10 += read;
            } else {
                a0.j.p(w.d.l(i2, "Not enough bytes to read: "));
                return null;
            }
        }
        return bArr;
    }

    public static int[] g(ByteArrayInputStream byteArrayInputStream, int i2) {
        int[] iArr = new int[i2];
        int i10 = 0;
        for (int i11 = 0; i11 < i2; i11++) {
            i10 += (int) m(byteArrayInputStream, 2);
            iArr[i11] = i10;
        }
        return iArr;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
        if (r0.finished() == false) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0062, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x006a, code lost:
        throw new java.lang.IllegalStateException("Inflater did not finish");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static byte[] h(java.io.FileInputStream r8, int r9, int r10) {
        /*
            java.util.zip.Inflater r0 = new java.util.zip.Inflater
            r0.<init>()
            byte[] r1 = new byte[r10]     // Catch: java.lang.Throwable -> L2e
            r2 = 2048(0x800, float:2.87E-42)
            byte[] r2 = new byte[r2]     // Catch: java.lang.Throwable -> L2e
            r3 = 0
            r4 = r3
            r5 = r4
        Le:
            boolean r6 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            boolean r6 = r0.needsDictionary()     // Catch: java.lang.Throwable -> L2e
            if (r6 != 0) goto L57
            if (r4 >= r9) goto L57
            int r6 = r8.read(r2)     // Catch: java.lang.Throwable -> L2e
            if (r6 < 0) goto L3b
            r0.setInput(r2, r3, r6)     // Catch: java.lang.Throwable -> L2e
            int r7 = r10 - r5
            int r7 = r0.inflate(r1, r5, r7)     // Catch: java.lang.Throwable -> L2e java.util.zip.DataFormatException -> L30
            int r5 = r5 + r7
            int r4 = r4 + r6
            goto Le
        L2e:
            r8 = move-exception
            goto L8a
        L30:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L3b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Invalid zip data. Stream ended after $totalBytesRead bytes. Expected "
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " bytes"
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L57:
            if (r4 != r9) goto L6b
            boolean r8 = r0.finished()     // Catch: java.lang.Throwable -> L2e
            if (r8 == 0) goto L63
            r0.end()
            return r1
        L63:
            java.lang.String r8 = "Inflater did not finish"
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L6b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L2e
            r8.<init>()     // Catch: java.lang.Throwable -> L2e
            java.lang.String r10 = "Didn't read enough bytes during decompression. expected="
            r8.append(r10)     // Catch: java.lang.Throwable -> L2e
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r9 = " actual="
            r8.append(r9)     // Catch: java.lang.Throwable -> L2e
            r8.append(r4)     // Catch: java.lang.Throwable -> L2e
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Throwable -> L2e
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L2e
            r9.<init>(r8)     // Catch: java.lang.Throwable -> L2e
            throw r9     // Catch: java.lang.Throwable -> L2e
        L8a:
            r0.end()
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.e.h(java.io.FileInputStream, int, int):byte[]");
    }

    public static a[] i(FileInputStream fileInputStream, byte[] bArr, byte[] bArr2, a[] aVarArr) {
        byte[] bArr3 = f6307i;
        if (Arrays.equals(bArr, bArr3)) {
            if (!Arrays.equals(f6302d, bArr2)) {
                if (Arrays.equals(bArr, bArr3)) {
                    int m = (int) m(fileInputStream, 1);
                    byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
                    if (fileInputStream.read() <= 0) {
                        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
                        try {
                            a[] j2 = j(byteArrayInputStream, m, aVarArr);
                            byteArrayInputStream.close();
                            return j2;
                        } catch (Throwable th2) {
                            try {
                                byteArrayInputStream.close();
                            } catch (Throwable th3) {
                                th2.addSuppressed(th3);
                            }
                            throw th2;
                        }
                    }
                    a0.j.p("Content found after the end of file");
                    return null;
                }
                a0.j.p("Unsupported meta version");
                return null;
            }
            a0.j.p("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
            return null;
        } else if (Arrays.equals(bArr, f6308j)) {
            int m10 = (int) m(fileInputStream, 2);
            byte[] h10 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(h10);
                try {
                    a[] k10 = k(byteArrayInputStream2, bArr2, m10, aVarArr);
                    byteArrayInputStream2.close();
                    return k10;
                } catch (Throwable th4) {
                    try {
                        byteArrayInputStream2.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            }
            a0.j.p("Content found after the end of file");
            return null;
        } else {
            a0.j.p("Unsupported meta version");
            return null;
        }
    }

    public static a[] j(ByteArrayInputStream byteArrayInputStream, int i2, a[] aVarArr) {
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i2 == aVarArr.length) {
            String[] strArr = new String[i2];
            int[] iArr = new int[i2];
            for (int i10 = 0; i10 < i2; i10++) {
                iArr[i10] = (int) m(byteArrayInputStream, 2);
                strArr[i10] = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
            }
            for (int i11 = 0; i11 < i2; i11++) {
                a aVar = aVarArr[i11];
                if (aVar.f6291b.equals(strArr[i11])) {
                    int i12 = iArr[i11];
                    aVar.f6294e = i12;
                    aVar.f6297h = g(byteArrayInputStream, i12);
                } else {
                    a0.j.p("Order of dexfiles in metadata did not match baseline");
                    return null;
                }
            }
            return aVarArr;
        }
        a0.j.p("Mismatched number of dex files found in metadata");
        return null;
    }

    public static a[] k(ByteArrayInputStream byteArrayInputStream, byte[] bArr, int i2, a[] aVarArr) {
        String str;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        if (i2 == aVarArr.length) {
            for (int i10 = 0; i10 < i2; i10++) {
                m(byteArrayInputStream, 2);
                String str2 = new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8);
                long m = m(byteArrayInputStream, 4);
                int m10 = (int) m(byteArrayInputStream, 2);
                a aVar = null;
                if (aVarArr.length > 0) {
                    int indexOf = str2.indexOf("!");
                    if (indexOf < 0) {
                        indexOf = str2.indexOf(":");
                    }
                    if (indexOf > 0) {
                        str = str2.substring(indexOf + 1);
                    } else {
                        str = str2;
                    }
                    int i11 = 0;
                    while (true) {
                        if (i11 >= aVarArr.length) {
                            break;
                        } else if (aVarArr[i11].f6291b.equals(str)) {
                            aVar = aVarArr[i11];
                            break;
                        } else {
                            i11++;
                        }
                    }
                }
                if (aVar != null) {
                    aVar.f6293d = m;
                    int[] g10 = g(byteArrayInputStream, m10);
                    if (Arrays.equals(bArr, f6306h)) {
                        aVar.f6294e = m10;
                        aVar.f6297h = g10;
                    }
                } else {
                    a0.j.p("Missing profile key: ".concat(str2));
                    return null;
                }
            }
            return aVarArr;
        }
        a0.j.p("Mismatched number of dex files found in metadata");
        return null;
    }

    public static a[] l(FileInputStream fileInputStream, byte[] bArr, String str) {
        if (Arrays.equals(bArr, f6303e)) {
            int m = (int) m(fileInputStream, 1);
            byte[] h2 = h(fileInputStream, (int) m(fileInputStream, 4), (int) m(fileInputStream, 4));
            if (fileInputStream.read() <= 0) {
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(h2);
                try {
                    a[] n10 = n(byteArrayInputStream, str, m);
                    byteArrayInputStream.close();
                    return n10;
                } catch (Throwable th2) {
                    try {
                        byteArrayInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
            a0.j.p("Content found after the end of file");
            return null;
        }
        a0.j.p("Unsupported version");
        return null;
    }

    public static long m(InputStream inputStream, int i2) {
        byte[] f8 = f(inputStream, i2);
        long j2 = 0;
        for (int i10 = 0; i10 < i2; i10++) {
            j2 += (f8[i10] & 255) << (i10 * 8);
        }
        return j2;
    }

    public static a[] n(ByteArrayInputStream byteArrayInputStream, String str, int i2) {
        int i10;
        int i11 = 0;
        if (byteArrayInputStream.available() == 0) {
            return new a[0];
        }
        a[] aVarArr = new a[i2];
        for (int i12 = 0; i12 < i2; i12++) {
            int m = (int) m(byteArrayInputStream, 2);
            aVarArr[i12] = new a(str, new String(f(byteArrayInputStream, (int) m(byteArrayInputStream, 2)), StandardCharsets.UTF_8), m(byteArrayInputStream, 4), m, (int) m(byteArrayInputStream, 4), (int) m(byteArrayInputStream, 4), new int[m], new TreeMap());
        }
        int i13 = 0;
        while (i13 < i2) {
            a aVar = aVarArr[i13];
            int available = byteArrayInputStream.available();
            int i14 = aVar.f6295f;
            int i15 = aVar.f6296g;
            TreeMap treeMap = aVar.f6298i;
            int i16 = available - i14;
            int i17 = i11;
            while (byteArrayInputStream.available() > i16) {
                i17 += (int) m(byteArrayInputStream, 2);
                treeMap.put(Integer.valueOf(i17), 1);
                int m10 = (int) m(byteArrayInputStream, 2);
                while (m10 > 0) {
                    m(byteArrayInputStream, 2);
                    int m11 = (int) m(byteArrayInputStream, 1);
                    if (m11 != 6 && m11 != 7) {
                        while (m11 > 0) {
                            m(byteArrayInputStream, 1);
                            int i18 = i11;
                            int i19 = i13;
                            for (int m12 = (int) m(byteArrayInputStream, 1); m12 > 0; m12--) {
                                m(byteArrayInputStream, 2);
                            }
                            m11--;
                            i11 = i18;
                            i13 = i19;
                        }
                    }
                    m10--;
                    i11 = i11;
                    i13 = i13;
                }
            }
            int i20 = i11;
            int i21 = i13;
            if (byteArrayInputStream.available() == i16) {
                aVar.f6297h = g(byteArrayInputStream, aVar.f6294e);
                BitSet valueOf = BitSet.valueOf(f(byteArrayInputStream, (((i15 * 2) + 7) & (-8)) / 8));
                for (int i22 = i20; i22 < i15; i22++) {
                    if (valueOf.get(i22)) {
                        i10 = 2;
                    } else {
                        i10 = i20;
                    }
                    if (valueOf.get(i22 + i15)) {
                        i10 |= 4;
                    }
                    if (i10 != 0) {
                        Integer num = (Integer) treeMap.get(Integer.valueOf(i22));
                        if (num == null) {
                            num = Integer.valueOf(i20);
                        }
                        treeMap.put(Integer.valueOf(i22), Integer.valueOf(i10 | num.intValue()));
                    }
                }
                i13 = i21 + 1;
                i11 = i20;
            } else {
                a0.j.p("Read too much data during profile line parse");
                return null;
            }
        }
        return aVarArr;
    }

    /* JADX WARN: Finally extract failed */
    public static boolean o(ByteArrayOutputStream byteArrayOutputStream, byte[] bArr, a[] aVarArr) {
        ArrayList arrayList;
        int length;
        byte[] bArr2 = f6302d;
        int i2 = 0;
        if (Arrays.equals(bArr, bArr2)) {
            ArrayList arrayList2 = new ArrayList(3);
            ArrayList arrayList3 = new ArrayList(3);
            ByteArrayOutputStream byteArrayOutputStream2 = new ByteArrayOutputStream();
            try {
                v(byteArrayOutputStream2, aVarArr.length);
                int i10 = 2;
                int i11 = 2;
                for (a aVar : aVarArr) {
                    u(byteArrayOutputStream2, aVar.f6292c, 4);
                    u(byteArrayOutputStream2, aVar.f6293d, 4);
                    u(byteArrayOutputStream2, aVar.f6296g, 4);
                    String d4 = d(aVar.f6290a, aVar.f6291b, bArr2);
                    Charset charset = StandardCharsets.UTF_8;
                    int length2 = d4.getBytes(charset).length;
                    v(byteArrayOutputStream2, length2);
                    i11 = i11 + 14 + length2;
                    byteArrayOutputStream2.write(d4.getBytes(charset));
                }
                byte[] byteArray = byteArrayOutputStream2.toByteArray();
                if (i11 == byteArray.length) {
                    j jVar = new j(b.DEX_FILES, byteArray, false);
                    byteArrayOutputStream2.close();
                    arrayList2.add(jVar);
                    ByteArrayOutputStream byteArrayOutputStream3 = new ByteArrayOutputStream();
                    int i12 = 0;
                    for (int i13 = 0; i13 < aVarArr.length; i13++) {
                        try {
                            a aVar2 = aVarArr[i13];
                            v(byteArrayOutputStream3, i13);
                            v(byteArrayOutputStream3, aVar2.f6294e);
                            i12 = i12 + 4 + (aVar2.f6294e * i10);
                            int[] iArr = aVar2.f6297h;
                            int length3 = iArr.length;
                            int i14 = 0;
                            int i15 = 0;
                            while (i14 < length3) {
                                int i16 = iArr[i14];
                                v(byteArrayOutputStream3, i16 - i15);
                                i14++;
                                i10 = i10;
                                i15 = i16;
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    byte[] byteArray2 = byteArrayOutputStream3.toByteArray();
                    if (i12 == byteArray2.length) {
                        j jVar2 = new j(b.CLASSES, byteArray2, true);
                        byteArrayOutputStream3.close();
                        arrayList2.add(jVar2);
                        byteArrayOutputStream3 = new ByteArrayOutputStream();
                        int i17 = 0;
                        int i18 = 0;
                        while (i17 < aVarArr.length) {
                            try {
                                a aVar3 = aVarArr[i17];
                                int i19 = i2;
                                for (Map.Entry entry : aVar3.f6298i.entrySet()) {
                                    i19 |= ((Integer) entry.getValue()).intValue();
                                }
                                ByteArrayOutputStream byteArrayOutputStream4 = new ByteArrayOutputStream();
                                r(byteArrayOutputStream4, i19, aVar3);
                                byte[] byteArray3 = byteArrayOutputStream4.toByteArray();
                                byteArrayOutputStream4.close();
                                ByteArrayOutputStream byteArrayOutputStream5 = new ByteArrayOutputStream();
                                s(byteArrayOutputStream5, aVar3);
                                byte[] byteArray4 = byteArrayOutputStream5.toByteArray();
                                byteArrayOutputStream5.close();
                                v(byteArrayOutputStream3, i17);
                                int length4 = byteArray3.length + 2 + byteArray4.length;
                                int i20 = i18 + 6;
                                ArrayList arrayList4 = arrayList3;
                                u(byteArrayOutputStream3, length4, 4);
                                v(byteArrayOutputStream3, i19);
                                byteArrayOutputStream3.write(byteArray3);
                                byteArrayOutputStream3.write(byteArray4);
                                i18 = i20 + length4;
                                i17++;
                                arrayList3 = arrayList4;
                                i2 = 0;
                            } finally {
                                try {
                                    byteArrayOutputStream3.close();
                                } catch (Throwable th3) {
                                    th2.addSuppressed(th3);
                                }
                            }
                        }
                        ArrayList arrayList5 = arrayList3;
                        byte[] byteArray5 = byteArrayOutputStream3.toByteArray();
                        if (i18 == byteArray5.length) {
                            j jVar3 = new j(b.METHODS, byteArray5, true);
                            byteArrayOutputStream3.close();
                            arrayList2.add(jVar3);
                            long j2 = 4;
                            long size = j2 + j2 + 4 + (arrayList2.size() * 16);
                            u(byteArrayOutputStream, arrayList2.size(), 4);
                            int i21 = 0;
                            while (i21 < arrayList2.size()) {
                                j jVar4 = (j) arrayList2.get(i21);
                                b bVar = jVar4.f6316a;
                                byte[] bArr3 = jVar4.f6317b;
                                u(byteArrayOutputStream, bVar.getValue(), 4);
                                u(byteArrayOutputStream, size, 4);
                                if (jVar4.f6318c) {
                                    byte[] a10 = a(bArr3);
                                    arrayList = arrayList5;
                                    arrayList.add(a10);
                                    u(byteArrayOutputStream, a10.length, 4);
                                    u(byteArrayOutputStream, bArr3.length, 4);
                                    length = a10.length;
                                } else {
                                    arrayList = arrayList5;
                                    arrayList.add(bArr3);
                                    u(byteArrayOutputStream, bArr3.length, 4);
                                    u(byteArrayOutputStream, 0L, 4);
                                    length = bArr3.length;
                                }
                                size += length;
                                i21++;
                                arrayList5 = arrayList;
                            }
                            ArrayList arrayList6 = arrayList5;
                            for (int i22 = 0; i22 < arrayList6.size(); i22++) {
                                byteArrayOutputStream.write((byte[]) arrayList6.get(i22));
                            }
                            return true;
                        }
                        throw new IllegalStateException("Expected size " + i18 + ", does not match actual size " + byteArray5.length);
                    }
                    throw new IllegalStateException("Expected size " + i12 + ", does not match actual size " + byteArray2.length);
                }
                throw new IllegalStateException("Expected size " + i11 + ", does not match actual size " + byteArray.length);
            } catch (Throwable th4) {
                try {
                    byteArrayOutputStream2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        byte[] bArr4 = f6303e;
        if (Arrays.equals(bArr, bArr4)) {
            byte[] b10 = b(aVarArr, bArr4);
            u(byteArrayOutputStream, aVarArr.length, 1);
            u(byteArrayOutputStream, b10.length, 4);
            byte[] a11 = a(b10);
            u(byteArrayOutputStream, a11.length, 4);
            byteArrayOutputStream.write(a11);
            return true;
        }
        byte[] bArr5 = f6305g;
        if (Arrays.equals(bArr, bArr5)) {
            u(byteArrayOutputStream, aVarArr.length, 1);
            for (a aVar4 : aVarArr) {
                String d10 = d(aVar4.f6290a, aVar4.f6291b, bArr5);
                Charset charset2 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d10.getBytes(charset2).length);
                v(byteArrayOutputStream, aVar4.f6297h.length);
                u(byteArrayOutputStream, aVar4.f6298i.size() * 4, 4);
                u(byteArrayOutputStream, aVar4.f6292c, 4);
                byteArrayOutputStream.write(d10.getBytes(charset2));
                for (Integer num : aVar4.f6298i.keySet()) {
                    v(byteArrayOutputStream, num.intValue());
                    v(byteArrayOutputStream, 0);
                }
                for (int i23 : aVar4.f6297h) {
                    v(byteArrayOutputStream, i23);
                }
            }
            return true;
        }
        byte[] bArr6 = f6304f;
        if (Arrays.equals(bArr, bArr6)) {
            byte[] b11 = b(aVarArr, bArr6);
            u(byteArrayOutputStream, aVarArr.length, 1);
            u(byteArrayOutputStream, b11.length, 4);
            byte[] a12 = a(b11);
            u(byteArrayOutputStream, a12.length, 4);
            byteArrayOutputStream.write(a12);
            return true;
        }
        byte[] bArr7 = f6306h;
        if (Arrays.equals(bArr, bArr7)) {
            v(byteArrayOutputStream, aVarArr.length);
            for (a aVar5 : aVarArr) {
                String str = aVar5.f6290a;
                TreeMap treeMap = aVar5.f6298i;
                String d11 = d(str, aVar5.f6291b, bArr7);
                Charset charset3 = StandardCharsets.UTF_8;
                v(byteArrayOutputStream, d11.getBytes(charset3).length);
                v(byteArrayOutputStream, treeMap.size());
                v(byteArrayOutputStream, aVar5.f6297h.length);
                u(byteArrayOutputStream, aVar5.f6292c, 4);
                byteArrayOutputStream.write(d11.getBytes(charset3));
                for (Integer num2 : treeMap.keySet()) {
                    v(byteArrayOutputStream, num2.intValue());
                }
                for (int i24 : aVar5.f6297h) {
                    v(byteArrayOutputStream, i24);
                }
            }
            return true;
        }
        return false;
    }

    public static void p(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        s(byteArrayOutputStream, aVar);
        int i2 = aVar.f6296g;
        int[] iArr = aVar.f6297h;
        int length = iArr.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = iArr[i10];
            v(byteArrayOutputStream, i12 - i11);
            i10++;
            i11 = i12;
        }
        byte[] bArr = new byte[(((i2 * 2) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f6298i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            if ((intValue2 & 2) != 0) {
                int i13 = intValue / 8;
                bArr[i13] = (byte) (bArr[i13] | (1 << (intValue % 8)));
            }
            if ((intValue2 & 4) != 0) {
                int i14 = intValue + i2;
                int i15 = i14 / 8;
                bArr[i15] = (byte) ((1 << (i14 % 8)) | bArr[i15]);
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void q(ByteArrayOutputStream byteArrayOutputStream, a aVar, String str) {
        Charset charset = StandardCharsets.UTF_8;
        v(byteArrayOutputStream, str.getBytes(charset).length);
        v(byteArrayOutputStream, aVar.f6294e);
        u(byteArrayOutputStream, aVar.f6295f, 4);
        u(byteArrayOutputStream, aVar.f6292c, 4);
        u(byteArrayOutputStream, aVar.f6296g, 4);
        byteArrayOutputStream.write(str.getBytes(charset));
    }

    public static void r(ByteArrayOutputStream byteArrayOutputStream, int i2, a aVar) {
        int i10 = aVar.f6296g;
        byte[] bArr = new byte[(((Integer.bitCount(i2 & (-2)) * i10) + 7) & (-8)) / 8];
        for (Map.Entry entry : aVar.f6298i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            int intValue2 = ((Integer) entry.getValue()).intValue();
            int i11 = 0;
            for (int i12 = 1; i12 <= 4; i12 <<= 1) {
                if (i12 != 1 && (i12 & i2) != 0) {
                    if ((i12 & intValue2) == i12) {
                        int i13 = (i11 * i10) + intValue;
                        int i14 = i13 / 8;
                        bArr[i14] = (byte) ((1 << (i13 % 8)) | bArr[i14]);
                    }
                    i11++;
                }
            }
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void s(ByteArrayOutputStream byteArrayOutputStream, a aVar) {
        int i2 = 0;
        for (Map.Entry entry : aVar.f6298i.entrySet()) {
            int intValue = ((Integer) entry.getKey()).intValue();
            if ((((Integer) entry.getValue()).intValue() & 1) != 0) {
                v(byteArrayOutputStream, intValue - i2);
                v(byteArrayOutputStream, 0);
                i2 = intValue;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01cb A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0211  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x02e4 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:253:0x0107 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:269:0x016e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x01d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0156  */
    /* JADX WARN: Type inference failed for: r7v24, types: [java.io.OutputStream, java.io.ByteArrayOutputStream] */
    /* JADX WARN: Type inference failed for: r7v25, types: [int] */
    /* JADX WARN: Type inference failed for: r7v26 */
    /* JADX WARN: Type inference failed for: r7v32 */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v46 */
    /* JADX WARN: Type inference failed for: r7v47 */
    /* JADX WARN: Type inference failed for: r7v5, types: [java.io.FileInputStream, java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void t(android.content.Context r18, java.util.concurrent.Executor r19, h7.d r20, boolean r21) {
        /*
            Method dump skipped, instructions count: 758
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h7.e.t(android.content.Context, java.util.concurrent.Executor, h7.d, boolean):void");
    }

    public static void u(ByteArrayOutputStream byteArrayOutputStream, long j2, int i2) {
        byte[] bArr = new byte[i2];
        for (int i10 = 0; i10 < i2; i10++) {
            bArr[i10] = (byte) ((j2 >> (i10 * 8)) & 255);
        }
        byteArrayOutputStream.write(bArr);
    }

    public static void v(ByteArrayOutputStream byteArrayOutputStream, int i2) {
        u(byteArrayOutputStream, i2, 2);
    }
}

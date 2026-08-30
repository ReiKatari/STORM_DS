package p7;

import a1.w0;
import ai.c0;
import ai.y0;
import android.content.Context;
import android.content.res.Resources;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.os.Trace;
import android.util.Log;
import androidx.preference.Preference;
import h1.n1;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.Executor;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import me.magnum.melonds.R;
import n2.p1;
import od.x;
import zc.w;
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f11419a = 0;

    public static final String A(int i2, long j2) {
        if (j2 >= 0) {
            f(i2);
            String l10 = Long.toString(j2, i2);
            l10.getClass();
            return l10;
        }
        long j10 = i2;
        long j11 = ((j2 >>> 1) / j10) << 1;
        long j12 = j2 - (j11 * j10);
        if (j12 >= j10) {
            j12 -= j10;
            j11++;
        }
        f(i2);
        String l11 = Long.toString(j11, i2);
        l11.getClass();
        f(i2);
        String l12 = Long.toString(j12, i2);
        l12.getClass();
        return l11.concat(l12);
    }

    public static final void a(sh.c cVar, int i2, mc.l lVar, mc.a aVar, n2.m mVar, int i10) {
        int ordinal;
        int i11;
        int i12;
        int i13;
        int i14;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        rg.d dVar;
        int i15;
        String str;
        lVar.getClass();
        aVar.getClass();
        n2.r rVar = (n2.r) mVar;
        rVar.Z(1844300576);
        if (cVar == null) {
            ordinal = -1;
        } else {
            ordinal = cVar.ordinal();
        }
        if (rVar.d(ordinal)) {
            i11 = 4;
        } else {
            i11 = 2;
        }
        int i16 = i10 | i11;
        if (rVar.d(i2)) {
            i12 = 32;
        } else {
            i12 = 16;
        }
        int i17 = i16 | i12;
        if (rVar.h(lVar)) {
            i13 = 256;
        } else {
            i13 = 128;
        }
        int i18 = i17 | i13;
        if (rVar.h(aVar)) {
            i14 = 2048;
        } else {
            i14 = 1024;
        }
        int i19 = i18 | i14;
        if ((i19 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i19 & 1, z10)) {
            rg.d D = m.D(rVar);
            if ((i19 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean f8 = z11 | rVar.f(D);
            if ((i19 & 112) == 32) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z15 = f8 | z12;
            if ((i19 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z16 = z15 | z13;
            if ((i19 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            boolean z17 = z14 | z16;
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (!z17 && L != eVar) {
                dVar = D;
            } else {
                a9.d dVar2 = new a9.d(cVar, D, i2, aVar, lVar, (cc.c) null);
                dVar = D;
                rVar.h0(dVar2);
                L = dVar2;
            }
            n2.s.g(cVar, (mc.p) L, rVar);
            if (cVar == null) {
                i15 = -1;
            } else {
                i15 = th.a.f13187a[cVar.ordinal()];
            }
            if (i15 != -1) {
                if (i15 != 1) {
                    if (i15 != 2) {
                        if (i15 == 3) {
                            str = kc.a.h(rVar, -1448609595, R.string.label_height, rVar, false);
                        } else {
                            throw w.d.i(rVar, -1448617560, false);
                        }
                    } else {
                        str = kc.a.h(rVar, -1448612508, R.string.label_width, rVar, false);
                    }
                } else {
                    str = kc.a.h(rVar, -1448615357, R.string.label_size, rVar, false);
                }
            } else {
                rVar.X(-1957168034);
                rVar.p(false);
                str = "";
            }
            Object L2 = rVar.L();
            if (L2 == eVar) {
                L2 = new x(20);
                rVar.h0(L2);
            }
            m.c(str, dVar, (mc.l) L2, null, rVar, 384, 8);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(cVar, i2, lVar, aVar, i10);
        }
    }

    public static final void b(Boolean bool, Object obj, androidx.lifecycle.x xVar, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(696924721);
        if ((i2 & 6) == 0) {
            if (rVar.h(bool)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(obj)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i2 & 384) == 0) {
            i10 |= 128;
        }
        if ((i2 & 3072) == 0) {
            if (rVar.h(lVar)) {
                i11 = 2048;
            } else {
                i11 = 1024;
            }
            i10 |= i11;
        }
        if ((i10 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
            } else {
                xVar = (androidx.lifecycle.x) rVar.j(u6.d.f13496a);
            }
            int i14 = i10 & (-897);
            rVar.q();
            boolean f8 = rVar.f(bool) | rVar.f(obj) | rVar.f(xVar);
            Object L = rVar.L();
            if (f8 || L == n2.l.f9953a) {
                L = new u6.c(xVar.getLifecycle());
                rVar.h0(L);
            }
            c(xVar, (u6.c) L, lVar, rVar, (i14 >> 3) & 896);
        } else {
            rVar.R();
        }
        androidx.lifecycle.x xVar2 = xVar;
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new y0(bool, obj, xVar2, lVar, i2, 5);
        }
    }

    public static final void c(androidx.lifecycle.x xVar, u6.c cVar, mc.l lVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        int i13;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(228371534);
        if ((i2 & 6) == 0) {
            if (rVar.h(xVar)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(cVar)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(lVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        boolean z11 = false;
        if ((i10 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            boolean h2 = rVar.h(cVar);
            if ((i10 & 896) == 256) {
                z11 = true;
            }
            boolean h10 = h2 | z11 | rVar.h(xVar);
            Object L = rVar.L();
            if (h10 || L == n2.l.f9953a) {
                L = new c0(xVar, cVar, lVar, 17);
                rVar.h0(L);
            }
            n2.s.c(xVar, cVar, (mc.l) L, rVar);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new b2.f(xVar, cVar, lVar, i2, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0085  */
    /* JADX WARN: Type inference failed for: r7v4, types: [nc.t, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(androidx.lifecycle.r r6, ec.c r7) {
        /*
            boolean r0 = r7 instanceof q9.b
            if (r0 == 0) goto L13
            r0 = r7
            q9.b r0 = (q9.b) r0
            int r1 = r0.Z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Z = r1
            goto L18
        L13:
            q9.b r0 = new q9.b
            r0.<init>(r7)
        L18:
            java.lang.Object r7 = r0.Y
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Z
            yb.y r3 = yb.y.f14813a
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2f
            nc.t r6 = r0.X
            androidx.lifecycle.r r0 = r0.R
            p7.j.I(r7)     // Catch: java.lang.Throwable -> L2d
            goto L70
        L2d:
            r7 = move-exception
            goto L7f
        L2f:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r6)
            r6 = 0
            return r6
        L36:
            p7.j.I(r7)
            androidx.lifecycle.q r7 = r6.b()
            androidx.lifecycle.q r2 = androidx.lifecycle.q.STARTED
            boolean r7 = r7.isAtLeast(r2)
            if (r7 == 0) goto L46
            goto L79
        L46:
            nc.t r7 = new nc.t
            r7.<init>()
            r0.R = r6     // Catch: java.lang.Throwable -> L7a
            r0.X = r7     // Catch: java.lang.Throwable -> L7a
            r0.Z = r4     // Catch: java.lang.Throwable -> L7a
            zc.h r2 = new zc.h     // Catch: java.lang.Throwable -> L7a
            cc.c r0 = pc.a.A(r0)     // Catch: java.lang.Throwable -> L7a
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L7a
            r2.v()     // Catch: java.lang.Throwable -> L7a
            q9.c r0 = new q9.c     // Catch: java.lang.Throwable -> L7a
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L7a
            r7.A = r0     // Catch: java.lang.Throwable -> L7a
            r6.a(r0)     // Catch: java.lang.Throwable -> L7a
            java.lang.Object r0 = r2.u()     // Catch: java.lang.Throwable -> L7a
            if (r0 != r1) goto L6e
            return r1
        L6e:
            r0 = r6
            r6 = r7
        L70:
            java.lang.Object r6 = r6.A
            androidx.lifecycle.w r6 = (androidx.lifecycle.w) r6
            if (r6 == 0) goto L79
            r0.c(r6)
        L79:
            return r3
        L7a:
            r0 = move-exception
            r5 = r0
            r0 = r6
            r6 = r7
            r7 = r5
        L7f:
            java.lang.Object r6 = r6.A
            androidx.lifecycle.w r6 = (androidx.lifecycle.w) r6
            if (r6 == 0) goto L88
            r0.c(r6)
        L88:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p7.k.d(androidx.lifecycle.r, ec.c):java.lang.Object");
    }

    public static long e(boolean z10, int i2, p8.a aVar, long j2, long j10, int i10, boolean z11, long j11, long j12, long j13, long j14) {
        long j15;
        long scalb;
        aVar.getClass();
        if (j14 != Long.MAX_VALUE && z11) {
            if (i10 != 0) {
                long j16 = j10 + 900000;
                if (j14 < j16) {
                    return j16;
                }
            }
            return j14;
        } else if (z10) {
            if (aVar == p8.a.LINEAR) {
                scalb = j2 * i2;
            } else {
                scalb = Math.scalb((float) j2, i2 - 1);
            }
            if (scalb > 18000000) {
                scalb = 18000000;
            }
            return j10 + scalb;
        } else if (z11) {
            if (i10 == 0) {
                j15 = j10 + j11;
            } else {
                j15 = j10 + j13;
            }
            if (j12 != j13 && i10 == 0) {
                return (j13 - j12) + j15;
            }
            return j15;
        } else if (j10 == -1) {
            return Long.MAX_VALUE;
        } else {
            return j10 + j11;
        }
    }

    public static void f(int i2) {
        if (2 <= i2 && i2 < 37) {
            return;
        }
        m9.o.n(kc.a.i("radix ", i2, " was not in valid range "), new sc.b(2, 36, 1));
    }

    public static boolean g(File file, Resources resources, int i2) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i2);
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
        try {
            boolean h2 = h(file, inputStream);
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused) {
                }
            }
            return h2;
        } catch (Throwable th3) {
            th = th3;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static boolean h(File file, InputStream inputStream) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e6) {
                e = e6;
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    try {
                        break;
                    } catch (IOException unused) {
                    }
                }
            }
            fileOutputStream.close();
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return true;
        } catch (IOException e10) {
            e = e10;
            fileOutputStream2 = fileOutputStream;
            Log.e("TypefaceCompatUtil", "Error copying resource contents to temp file: " + e.getMessage());
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused2) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th3) {
            th = th3;
            fileOutputStream2 = fileOutputStream;
            if (fileOutputStream2 != null) {
                try {
                    fileOutputStream2.close();
                } catch (IOException unused3) {
                }
            }
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static int i(String str, int i2, int i10, boolean z10) {
        boolean z11;
        while (i2 < i10) {
            char charAt = str.charAt(i2);
            if ((charAt >= ' ' || charAt == '\t') && charAt < 127 && (('0' > charAt || charAt >= ':') && (('a' > charAt || charAt >= '{') && (('A' > charAt || charAt >= '[') && charAt != ':')))) {
                z11 = false;
            } else {
                z11 = true;
            }
            if (z11 == (!z10)) {
                return i2;
            }
            i2++;
        }
        return i10;
    }

    public static final boolean j(char c4, char c10, boolean z10) {
        if (c4 == c10) {
            return true;
        }
        if (!z10) {
            return false;
        }
        char upperCase = Character.toUpperCase(c4);
        char upperCase2 = Character.toUpperCase(c10);
        if (upperCase == upperCase2 || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)) {
            return true;
        }
        return false;
    }

    public static final b5.l k(Executor executor, String str, mc.a aVar) {
        executor.getClass();
        return a.a.A(new c8.i(executor, str, aVar, 3));
    }

    public static final ArrayList l(List list) {
        Object obj;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            sd.b bVar = (sd.b) it.next();
            if (bVar.f12867b) {
                obj = null;
            } else {
                obj = bVar.f12866a;
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static long m(int i2, int i10, int i11, int i12) {
        int min;
        int i13;
        int i14 = 262142;
        int min2 = Math.min(i11, 262142);
        int i15 = Preference.DEFAULT_ORDER;
        if (i12 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i12, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i13 = min2;
        } else {
            i13 = min;
        }
        if (i13 >= 8191) {
            if (i13 < 32767) {
                i14 = 65534;
            } else if (i13 < 65535) {
                i14 = 32766;
            } else if (i13 < 262143) {
                i14 = 8190;
            } else {
                x4.b.k(i13);
                wa.b.a();
                return 0L;
            }
        }
        if (i10 != Integer.MAX_VALUE) {
            i15 = Math.min(i14, i10);
        }
        return x4.b.a(Math.min(i14, i2), i15, min2, min);
    }

    public static long n(int i2, int i10, int i11, int i12) {
        int min;
        int i13;
        int i14 = 262142;
        int min2 = Math.min(i2, 262142);
        int i15 = Preference.DEFAULT_ORDER;
        if (i10 == Integer.MAX_VALUE) {
            min = Integer.MAX_VALUE;
        } else {
            min = Math.min(i10, 262142);
        }
        if (min == Integer.MAX_VALUE) {
            i13 = min2;
        } else {
            i13 = min;
        }
        if (i13 >= 8191) {
            if (i13 < 32767) {
                i14 = 65534;
            } else if (i13 < 65535) {
                i14 = 32766;
            } else if (i13 < 262143) {
                i14 = 8190;
            } else {
                x4.b.k(i13);
                wa.b.a();
                return 0L;
            }
        }
        if (i12 != Integer.MAX_VALUE) {
            i15 = Math.min(i14, i12);
        }
        return x4.b.a(min2, min, Math.min(i14, i11), i15);
    }

    public static final int o(q1.s sVar) {
        long g10;
        if (sVar.f12177e == n1.Vertical) {
            g10 = sVar.g() & 4294967295L;
        } else {
            g10 = sVar.g() >> 32;
        }
        return (int) g10;
    }

    public static File p(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i2 = 0; i2 < 100; i2++) {
            File file = new File(cacheDir, str + i2);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static final int q(int i2, int i10) {
        return (i2 >> i10) & 31;
    }

    public static boolean r(String str, x.p pVar) {
        if ("robolectric".equals(Build.FINGERPRINT)) {
            return true;
        }
        try {
            int[] iArr = (int[]) pVar.b(str).a(CameraCharacteristics.REQUEST_AVAILABLE_CAPABILITIES);
            if (iArr != null) {
                for (int i2 : iArr) {
                    if (i2 == 0) {
                        return true;
                    }
                }
            }
            return false;
        } catch (x.a e6) {
            throw new Exception(new Exception(e6));
        }
    }

    public static boolean s(char c4) {
        if (!Character.isWhitespace(c4) && !Character.isSpaceChar(c4)) {
            return false;
        }
        return true;
    }

    public static b5.l t(cc.g gVar, mc.p pVar) {
        w wVar = w.DEFAULT;
        gVar.getClass();
        wVar.getClass();
        return a.a.A(new c8.i(gVar, wVar, pVar));
    }

    public static MappedByteBuffer u(Context context, Uri uri) {
        ParcelFileDescriptor openFileDescriptor;
        try {
            openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
        } catch (IOException unused) {
        }
        if (openFileDescriptor == null) {
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
                return null;
            }
            return null;
        }
        FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
        FileChannel channel = fileInputStream.getChannel();
        MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
        fileInputStream.close();
        openFileDescriptor.close();
        return map;
    }

    public static long v(int i2, String str) {
        int i10 = i(str, 0, i2, false);
        Matcher matcher = pi.n.f11763n.matcher(str);
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = -1;
        int i16 = -1;
        while (i10 < i2) {
            int i17 = i(str, i10 + 1, i2, true);
            matcher.region(i10, i17);
            if (i12 == -1 && matcher.usePattern(pi.n.f11763n).matches()) {
                String group = matcher.group(1);
                group.getClass();
                i12 = Integer.parseInt(group);
                String group2 = matcher.group(2);
                group2.getClass();
                i15 = Integer.parseInt(group2);
                String group3 = matcher.group(3);
                group3.getClass();
                i16 = Integer.parseInt(group3);
            } else if (i13 == -1 && matcher.usePattern(pi.n.m).matches()) {
                String group4 = matcher.group(1);
                group4.getClass();
                i13 = Integer.parseInt(group4);
            } else {
                if (i14 == -1) {
                    Pattern pattern = pi.n.f11762l;
                    if (matcher.usePattern(pattern).matches()) {
                        String group5 = matcher.group(1);
                        group5.getClass();
                        Locale locale = Locale.US;
                        locale.getClass();
                        String lowerCase = group5.toLowerCase(locale);
                        lowerCase.getClass();
                        String pattern2 = pattern.pattern();
                        pattern2.getClass();
                        i14 = vc.h.h0(pattern2, lowerCase, 0, false, 6) / 4;
                    }
                }
                if (i11 == -1 && matcher.usePattern(pi.n.f11761k).matches()) {
                    String group6 = matcher.group(1);
                    group6.getClass();
                    i11 = Integer.parseInt(group6);
                }
            }
            i10 = i(str, i17 + 1, i2, false);
        }
        if (70 <= i11 && i11 < 100) {
            i11 += 1900;
        }
        if (i11 >= 0 && i11 < 70) {
            i11 += 2000;
        }
        if (i11 >= 1601) {
            if (i14 != -1) {
                if (1 <= i13 && i13 < 32) {
                    if (i12 >= 0 && i12 < 24) {
                        if (i15 >= 0 && i15 < 60) {
                            if (i16 >= 0 && i16 < 60) {
                                GregorianCalendar gregorianCalendar = new GregorianCalendar(qi.g.f12552a);
                                gregorianCalendar.setLenient(false);
                                gregorianCalendar.set(1, i11);
                                gregorianCalendar.set(2, i14 - 1);
                                gregorianCalendar.set(5, i13);
                                gregorianCalendar.set(11, i12);
                                gregorianCalendar.set(12, i15);
                                gregorianCalendar.set(13, i16);
                                gregorianCalendar.set(14, 0);
                                return gregorianCalendar.getTimeInMillis();
                            }
                            a0.j.h("Failed requirement.");
                            return 0L;
                        }
                        a0.j.h("Failed requirement.");
                        return 0L;
                    }
                    a0.j.h("Failed requirement.");
                    return 0L;
                }
                a0.j.h("Failed requirement.");
                return 0L;
            }
            a0.j.h("Failed requirement.");
            return 0L;
        }
        a0.j.h("Failed requirement.");
        return 0L;
    }

    public static final void w(a1.e eVar, mc.l lVar) {
        eVar.getClass();
        w0 w0Var = new w0(999);
        int i2 = eVar.L;
        int i10 = 0;
        int i11 = 0;
        while (i10 < i2) {
            w0Var.put(eVar.f(i10), eVar.i(i10));
            i10++;
            i11++;
            if (i11 == 999) {
                lVar.k(w0Var);
                w0Var.clear();
                i11 = 0;
            }
        }
        if (i11 > 0) {
            lVar.k(w0Var);
        }
    }

    public static final void x(a1.q qVar, mc.l lVar) {
        qVar.getClass();
        a1.q qVar2 = new a1.q(999);
        int j2 = qVar.j();
        int i2 = 0;
        int i10 = 0;
        while (i2 < j2) {
            qVar2.g(qVar.f(i2), qVar.k(i2));
            i2++;
            i10++;
            if (i10 == 999) {
                lVar.k(qVar2);
                qVar2.a();
                i10 = 0;
            }
        }
        if (i10 > 0) {
            lVar.k(qVar2);
        }
    }

    public static final void y(long j2, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            Trace.setCounter(str, j2);
        }
    }

    public static final double z(long j2) {
        return ((j2 >>> 11) * 2048) + (j2 & 2047);
    }
}

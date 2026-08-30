package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.StatFs;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import android.view.View;
import android.view.autofill.AutofillManager;
import androidx.core.widget.NestedScrollView;
import androidx.profileinstaller.ProfileInstallReceiver;
import androidx.recyclerview.widget.RecyclerView;
import java.io.File;
import java.security.GeneralSecurityException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import me.magnum.melonds.ui.layouteditor.LayoutEditorActivity;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ka3  reason: default package */
/* loaded from: classes.dex */
public final class ka3 implements oe3, oj2, sc5, j90, ou3, kf1, rw2, t11, ou4, h94 {
    public final /* synthetic */ int A;
    public final Object B;

    public ka3(Context context, int i) {
        long j;
        int memoryClass;
        this.A = i;
        switch (i) {
            case 19:
                StringBuilder sb = e67.a;
                File file = new File(context.getApplicationContext().getCacheDir(), "picasso-cache");
                if (!file.exists()) {
                    file.mkdirs();
                }
                try {
                    StatFs statFs = new StatFs(file.getAbsolutePath());
                    j = (statFs.getBlockCountLong() * statFs.getBlockSizeLong()) / 50;
                } catch (IllegalArgumentException unused) {
                    j = 5242880;
                }
                long max = Math.max(Math.min(j, 52428800L), 5242880L);
                yb4 yb4Var = new yb4();
                yb4Var.l = new d80(file, max);
                this.B = new zb4(yb4Var);
                return;
            default:
                StringBuilder sb2 = e67.a;
                ActivityManager activityManager = (ActivityManager) context.getSystemService("activity");
                if ((context.getApplicationInfo().flags & 1048576) != 0) {
                    memoryClass = activityManager.getLargeMemoryClass();
                } else {
                    memoryClass = activityManager.getMemoryClass();
                }
                this.B = new ss3((int) ((memoryClass * 1048576) / 7), 0);
                return;
        }
    }

    public static hi6 B(e55 e55Var, vw2 vw2Var, ow3 ow3Var, pw3 pw3Var) {
        String str;
        boolean z;
        BitmapDrawable bitmapDrawable = new BitmapDrawable(vw2Var.a.getResources(), pw3Var.a);
        i81 i81Var = i81.MEMORY_CACHE;
        Map map = pw3Var.b;
        Object obj = map.get("coil#disk_cache_key");
        Boolean bool = null;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        Object obj2 = map.get("coil#is_sampled");
        if (obj2 instanceof Boolean) {
            bool = (Boolean) obj2;
        }
        boolean z2 = false;
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        Bitmap.Config[] configArr = k.a;
        if (e55Var != null && e55Var.A) {
            z2 = true;
        }
        return new hi6(bitmapDrawable, vw2Var, i81Var, ow3Var, str, z, z2);
    }

    public static int F() {
        SecureRandom secureRandom = new SecureRandom();
        byte[] bArr = new byte[4];
        int i = 0;
        while (i == 0) {
            secureRandom.nextBytes(bArr);
            i = ((bArr[0] & Byte.MAX_VALUE) << 24) | ((bArr[1] & 255) << 16) | ((bArr[2] & 255) << 8) | (bArr[3] & 255);
        }
        return i;
    }

    public static final ka3 G(dz4 dz4Var, bq0 bq0Var) {
        byte[] bArr;
        uz1 q = uz1.q(dz4Var.w(), o32.a());
        if (q.o().size() != 0) {
            try {
                x70 o = q.o();
                int size = o.size();
                if (size == 0) {
                    bArr = s33.b;
                } else {
                    byte[] bArr2 = new byte[size];
                    o.i(size, bArr2);
                    bArr = bArr2;
                }
                qb3 t = qb3.t(bq0Var.S(bArr, new byte[0]), o32.a());
                if (t.p() > 0) {
                    return new ka3(1, t);
                }
                throw new GeneralSecurityException("empty keyset");
            } catch (i53 unused) {
                f81.u("invalid keyset, corrupted key material");
                return null;
            }
        }
        f81.u("empty keyset");
        return null;
    }

    public static pj3 I(ka3 ka3Var, int i) {
        mi2 mi2Var;
        pk3 pk3Var = (pk3) ka3Var.B;
        ga6 z = io2.z();
        if (z != null) {
            mi2Var = z.e();
        } else {
            mi2Var = null;
        }
        mi2 mi2Var2 = mi2Var;
        ga6 Y = io2.Y(z);
        try {
            jk3 jk3Var = (jk3) pk3Var.f.getValue();
            io2.l0(z, Y, mi2Var2);
            return pk3Var.q.a(i, jk3Var.j, pk3Var.d, new gi3(i, jk3Var));
        } catch (Throwable th) {
            io2.l0(z, Y, mi2Var2);
            throw th;
        }
    }

    public static q16 s(ow2 ow2Var) {
        if (ow2Var == null) {
            return null;
        }
        return new q16(ow2Var, new Size(ow2Var.c(), ow2Var.a()), new bc0(new ac1(null, im6.b, ow2Var.s().c())));
    }

    public static /* synthetic */ void u(ka3 ka3Var, m70 m70Var, int i) {
        ka3Var.t(m70Var, i, jv4.DEFAULT);
    }

    public synchronized pb3 A(ua3 ua3Var) {
        ca3 c;
        int F;
        try {
            c = k85.c(ua3Var);
            synchronized (this) {
                F = F();
                while (y(F)) {
                    F = F();
                }
            }
            return (pb3) r2.a();
        } catch (Throwable th) {
            throw th;
        }
        gg4 p = ua3Var.p();
        if (p == gg4.UNKNOWN_PREFIX) {
            p = gg4.TINK;
        }
        ob3 v = pb3.v();
        v.c();
        pb3.m((pb3) v.B, c);
        v.c();
        pb3.p((pb3) v.B, F);
        pa3 pa3Var = pa3.ENABLED;
        v.c();
        pb3.o((pb3) v.B, pa3Var);
        v.c();
        pb3.n((pb3) v.B, p);
        return (pb3) v.a();
    }

    public void C(View view, int i, boolean z) {
        if (Build.VERSION.SDK_INT >= 27) {
            ((AutofillManager) this.B).notifyViewVisibilityChanged(view, i, z);
        }
    }

    public void D() {
        LayoutEditorActivity layoutEditorActivity = (LayoutEditorActivity) this.B;
        int i = LayoutEditorActivity.M0;
        layoutEditorActivity.C();
        bf3 B = layoutEditorActivity.B();
        nd3 nd3Var = (nd3) B.i.getValue();
        if (nd3Var != null) {
            tq5.w(ua7.a(B), null, null, new ze3(B, nd3Var, null, 0), 3);
        }
        layoutEditorActivity.finish();
    }

    public k91 E(ci3 ci3Var, ee eeVar) {
        long j;
        boolean z;
        long D;
        cs3 cs3Var = (cs3) this.B;
        List list = (List) ci3Var.B;
        cs3 cs3Var2 = new cs3(list.size());
        int size = list.size();
        int i = 0;
        while (i < size) {
            tp4 tp4Var = (tp4) list.get(i);
            long j2 = tp4Var.a;
            sp4 sp4Var = (sp4) cs3Var.b(j2);
            if (sp4Var == null) {
                j = tp4Var.b;
                D = tp4Var.d;
                z = false;
            } else {
                long j3 = sp4Var.a;
                j = j3;
                z = sp4Var.c;
                D = eeVar.D(sp4Var.b);
            }
            long j4 = tp4Var.a;
            int i2 = i;
            List list2 = list;
            int i3 = size;
            cs3Var2.g(j4, new rp4(j4, tp4Var.b, tp4Var.d, tp4Var.e, tp4Var.f, j, D, z, tp4Var.g, tp4Var.i, tp4Var.j, tp4Var.k, tp4Var.l, tp4Var.m));
            boolean z2 = tp4Var.e;
            if (z2) {
                cs3Var.g(j2, new sp4(tp4Var.b, tp4Var.c, z2));
            } else {
                cs3Var.h(j2);
            }
            i = i2 + 1;
            list = list2;
            size = i3;
        }
        return new k91(cs3Var2, ci3Var);
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, l75] */
    public ArrayList H(int i) {
        mi2 mi2Var;
        yh3 yh3Var;
        ArrayList arrayList = new ArrayList();
        ki3 ki3Var = (ki3) this.B;
        ga6 z = io2.z();
        if (z != null) {
            mi2Var = z.e();
        } else {
            mi2Var = null;
        }
        ga6 Y = io2.Y(z);
        try {
            if (ki3Var.b) {
                yh3Var = ki3Var.c;
            } else {
                yh3Var = (yh3) ki3Var.e.getValue();
            }
            yh3 yh3Var2 = yh3Var;
            if (yh3Var2 != null) {
                ?? obj = new Object();
                obj.A = 1;
                List list = (List) yh3Var2.k.n(Integer.valueOf(i));
                int size = list.size();
                int i2 = 0;
                l75 l75Var = obj;
                while (i2 < size) {
                    ti4 ti4Var = (ti4) list.get(i2);
                    qj3 qj3Var = ki3Var.o;
                    int intValue = ((Number) ti4Var.A).intValue();
                    long j = ((lz0) ti4Var.B).a;
                    ci3 ci3Var = ki3.w;
                    l75 l75Var2 = l75Var;
                    arrayList.add(qj3Var.a(intValue, j, false, new qm((ArrayList) null, l75Var2, list, i, yh3Var2)));
                    i2++;
                    l75Var = l75Var2;
                }
            }
            io2.l0(z, Y, mi2Var);
            return arrayList;
        } catch (Throwable th) {
            io2.l0(z, Y, mi2Var);
            throw th;
        }
    }

    public void J(byte[] bArr) {
        bArr.getClass();
        m70 m70Var = (m70) this.B;
        u(this, m70Var, bArr.length);
        int length = bArr.length;
        if (length == 0) {
            return;
        }
        m70Var.b(length);
        nu.c0(m70Var.b, 0, length, bArr, m70Var.a);
        m70Var.b += length;
    }

    public void K(int i, int i2, jv4 jv4Var) {
        qv4 qv4Var;
        m70 m70Var = (m70) this.B;
        jv4Var.getClass();
        if (jv4Var == jv4.FIXED) {
            qv4Var = qv4.i32;
        } else {
            qv4Var = qv4.VARINT;
        }
        u(this, m70Var, qv4Var.wireIntWithTag(i2));
        t(m70Var, i, jv4Var);
    }

    @Override // defpackage.h94
    public void L(Object obj) {
        ((wz0) this.B).accept(obj);
    }

    public void M(m70 m70Var) {
        m70Var.getClass();
        m70 m70Var2 = (m70) this.B;
        u(this, m70Var2, m70Var.b);
        int i = m70Var.b;
        m70Var2.b(i);
        nu.c0(m70Var2.b, 0, i, m70Var.a, m70Var2.a);
        m70Var2.b += i;
    }

    @Override // defpackage.rw2
    public int a() {
        return ((qh) this.B).a();
    }

    @Override // defpackage.rw2
    public ow2 b() {
        return s(((qh) this.B).b());
    }

    @Override // defpackage.rw2
    public int c() {
        return ((qh) this.B).c();
    }

    @Override // defpackage.rw2
    public void close() {
        ((qh) this.B).close();
    }

    @Override // defpackage.rw2
    public int d() {
        return ((qh) this.B).d();
    }

    @Override // defpackage.kf1
    public boolean e(float f) {
        if (f == RecyclerView.A1) {
            return false;
        }
        q();
        ((NestedScrollView) this.B).j((int) f);
        return true;
    }

    @Override // defpackage.rw2
    public void f() {
        ((qh) this.B).f();
    }

    @Override // defpackage.rw2
    public void g(qw2 qw2Var, Executor executor) {
        ((qh) this.B).g(new hi0(2, this, qw2Var), executor);
    }

    @Override // defpackage.rw2
    public Surface getSurface() {
        return ((qh) this.B).getSurface();
    }

    @Override // defpackage.oj2
    public void h(Throwable th) {
        Object obj;
        tf0 tf0Var = (tf0) this.B;
        tm3 tm3Var = new tm3(0, tf0Var);
        if (nk2.M()) {
            tm3Var.run();
        } else {
            CountDownLatch countDownLatch = new CountDownLatch(1);
            nl2.D("Unable to post to main thread", new Handler(Looper.getMainLooper()).post(new xc4(7, tm3Var, countDownLatch)));
            try {
                if (!countDownLatch.await(30000L, TimeUnit.MILLISECONDS)) {
                    throw new IllegalStateException("Timeout to wait main thread execution");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
        xg0 xg0Var = (xg0) tf0Var.R;
        if (xg0Var != null) {
            xg0Var.getClass();
            xe0 xe0Var = xg0Var.n;
            xe0Var.getClass();
            tq0.Z0(xe0Var.n, new j0(16, tf0Var));
            xg0 xg0Var2 = (xg0) tf0Var.R;
            xg0Var2.getClass();
            synchronized (xg0Var2.b) {
                try {
                    xg0Var2.e.removeCallbacksAndMessages("retry_token");
                    int ordinal = xg0Var2.p.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2 || ordinal == 3) {
                                xg0Var2.p = wg0.SHUTDOWN;
                                xg0.a(xg0Var2.r);
                                xg0Var2.q = ct3.k0(new a31(4, xg0Var2));
                            }
                            obj = xg0Var2.q;
                        } else {
                            throw new IllegalStateException("CameraX could not be shutdown when it is initializing.");
                        }
                    } else {
                        xg0Var2.p = wg0.SHUTDOWN;
                        obj = jx2.L;
                    }
                } finally {
                }
            }
        } else {
            obj = jx2.L;
        }
        obj.getClass();
        synchronized (tf0Var.A) {
            tf0Var.B = null;
            tf0Var.L = obj;
            ((HashMap) tf0Var.Z).clear();
            ((HashSet) tf0Var.c0).clear();
        }
        tf0Var.j(null, null);
    }

    @Override // defpackage.j90
    public Object i(i90 i90Var) {
        boolean z;
        np3 np3Var = (np3) this.B;
        if (np3Var.Y == null) {
            z = true;
        } else {
            z = false;
        }
        nl2.D("The result can only set once!", z);
        np3Var.Y = i90Var;
        return "ListFuture[" + this + "]";
    }

    @Override // defpackage.ou4
    public void j() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override // defpackage.t11
    public Object k(Object obj) {
        return Optional.ofNullable(((t11) this.B).k((gc5) obj));
    }

    @Override // defpackage.oj2
    public /* bridge */ /* synthetic */ void l(Object obj) {
        Void r1 = (Void) obj;
    }

    @Override // defpackage.ou4
    public void m(int i, Object obj) {
        String str;
        switch (i) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case ig7.b /* 6 */:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
        ((ProfileInstallReceiver) this.B).setResultCode(i);
    }

    @Override // defpackage.rw2
    public int n() {
        return ((qh) this.B).n();
    }

    @Override // defpackage.kf1
    public float o() {
        return -((NestedScrollView) this.B).getVerticalScrollFactorCompat();
    }

    @Override // defpackage.h94
    public void onError(Throwable th) {
        ve2.x("ObserverToConsumerAdapter", "Unexpected error in Observable", th);
    }

    @Override // defpackage.rw2
    public ow2 p() {
        return s(((qh) this.B).p());
    }

    @Override // defpackage.kf1
    public void q() {
        ((NestedScrollView) this.B).R.abortAnimation();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.p31 r(defpackage.sj0 r6, defpackage.k11 r7) {
        /*
            r5 = this;
            boolean r0 = r7 instanceof defpackage.k94
            if (r0 == 0) goto L13
            r0 = r7
            k94 r0 = (defpackage.k94) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            k94 r0 = new k94
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.R
            p31 r1 = defpackage.p31.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L2e
            if (r2 == r4) goto L2a
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.i.n(r5)
            return r3
        L2a:
            defpackage.me2.a0(r7)
            goto L3e
        L2e:
            defpackage.me2.a0(r7)
            java.lang.Object r5 = r5.B
            ee6 r5 = (defpackage.ee6) r5
            r0.Y = r4
            java.lang.Object r5 = r5.a(r6, r0)
            if (r5 != r1) goto L3e
            return r1
        L3e:
            defpackage.f81.c()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka3.r(sj0, k11):p31");
    }

    public void t(m70 m70Var, int i, jv4 jv4Var) {
        int i2 = bw4.a[jv4Var.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    int i3 = (i << 1) ^ (i >> 31);
                    m70Var.b(5);
                    if ((i3 & (-128)) == 0) {
                        byte[] bArr = m70Var.a;
                        int i4 = m70Var.b;
                        m70Var.b = i4 + 1;
                        bArr[i4] = (byte) i3;
                        return;
                    }
                    long j = i3;
                    m70Var.a(m70.c[Long.numberOfLeadingZeros(j)], j);
                    return;
                }
                i.c();
                return;
            }
            long j2 = i;
            m70Var.getClass();
            int i5 = m70.c[Long.numberOfLeadingZeros(j2)];
            m70Var.b(i5 + 1);
            m70Var.a(i5, j2);
            return;
        }
        ((m70) this.B).c(Integer.reverseBytes(i));
    }

    public String toString() {
        switch (this.A) {
            case 1:
                return d67.a((qb3) this.B).toString();
            default:
                return super.toString();
        }
    }

    public void v(m70 m70Var, long j, jv4 jv4Var) {
        int i = bw4.a[jv4Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    long j2 = (j >> 63) ^ (j << 1);
                    int i2 = m70.c[Long.numberOfLeadingZeros(j2)];
                    m70Var.b(i2 + 1);
                    m70Var.a(i2, j2);
                    return;
                }
                i.c();
                return;
            }
            int i3 = m70.c[Long.numberOfLeadingZeros(j)];
            m70Var.b(i3 + 1);
            m70Var.a(i3, j);
            return;
        }
        ((m70) this.B).d(Long.reverseBytes(j));
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0075, code lost:
        if (r6 != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x00e4, code lost:
        if (java.lang.Math.abs(r2 - (r10 * r3)) > 1.0d) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f7, code lost:
        if (java.lang.Math.abs(r8 - r1) > 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0103, code lost:
        if (java.lang.Math.abs(r2 - r3) > 1) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0108, code lost:
        if (r12 != 1.0d) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x010b, code lost:
        if (r0 != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0110, code lost:
        if (r12 <= 1.0d) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0112, code lost:
        if (r6 == false) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0114, code lost:
        r7 = false;
     */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0119 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:83:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.pw3 w(defpackage.vw2 r18, defpackage.ow3 r19, defpackage.h76 r20, defpackage.uu5 r21) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ka3.w(vw2, ow3, h76, uu5):pw3");
    }

    public synchronized ka3 x() {
        qb3 qb3Var;
        qb3Var = (qb3) ((nb3) this.B).a();
        if (qb3Var.p() > 0) {
        } else {
            throw new GeneralSecurityException("empty keyset");
        }
        return new ka3(1, qb3Var);
    }

    public synchronized boolean y(int i) {
        for (pb3 pb3Var : Collections.unmodifiableList(((qb3) ((nb3) this.B).B).q())) {
            if (pb3Var.r() == i) {
                return true;
            }
        }
        return false;
    }

    public ow3 z(vw2 vw2Var, Object obj, df4 df4Var, t12 t12Var) {
        String str;
        Map map;
        ow3 ow3Var = vw2Var.e;
        List list = vw2Var.h;
        if (ow3Var != null) {
            return ow3Var;
        }
        List list2 = ((c55) this.B).g.c;
        int size = list2.size();
        int i = 0;
        while (true) {
            if (i < size) {
                ti4 ti4Var = (ti4) list2.get(i);
                hb3 hb3Var = (hb3) ti4Var.A;
                if (((Class) ti4Var.B).isAssignableFrom(obj.getClass())) {
                    hb3Var.getClass();
                    str = hb3Var.a(obj, df4Var);
                    if (str != null) {
                        break;
                    }
                }
                i++;
            } else {
                str = null;
                break;
            }
        }
        if (str == null) {
            return null;
        }
        Map map2 = vw2Var.z.A;
        if (map2.isEmpty()) {
            map = qp1.A;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            Iterator it = map2.entrySet().iterator();
            if (!it.hasNext()) {
                map = linkedHashMap;
            } else {
                ((Map.Entry) it.next()).getValue().getClass();
                c44.b();
                return null;
            }
        }
        if (list.isEmpty() && map.isEmpty()) {
            return new ow3(str);
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(map);
        if (!list.isEmpty()) {
            if (list.size() <= 0) {
                linkedHashMap2.put("coil#transformation_size", df4Var.d.toString());
            } else {
                list.get(0).getClass();
                c44.b();
                return null;
            }
        }
        return new ow3(str, linkedHashMap2);
    }

    public ka3(c55 c55Var, ci3 ci3Var) {
        this.A = 14;
        this.B = c55Var;
    }

    public /* synthetic */ ka3(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    public ka3(int i, byte b) {
        Object vn1Var;
        this.A = i;
        switch (i) {
            case 10:
                this.B = new pq3();
                new HashMap();
                return;
            case 24:
                if (Build.VERSION.SDK_INT >= 28) {
                    vn1Var = new Object();
                } else {
                    vn1Var = new vn1(17);
                }
                this.B = vn1Var;
                return;
            case 25:
                this.B = new cs3((Object) null);
                return;
            default:
                ht3 ht3Var = new ht3();
                this.B = ht3Var;
                if (ht3Var.B) {
                    return;
                }
                if (ht3Var.L) {
                    pr4.a("ManagedValuesStore tried to enter composition twice. Did you attempt to install the same store multiple times or into two compositions?");
                }
                ht3Var.a();
                ht3Var.L = true;
                return;
        }
    }

    public ka3(int i) {
        this.A = 18;
        this.B = fe6.a(new int[i]);
    }
}

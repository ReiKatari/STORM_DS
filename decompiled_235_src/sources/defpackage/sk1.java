package defpackage;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcelable;
import android.util.Log;
import android.view.Surface;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Future;
import me.magnum.melonds.MelonEmulator;
import me.magnum.melonds.ui.emulator.EmulatorSurfaceView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: sk1  reason: default package */
/* loaded from: classes.dex */
public final class sk1 extends Handler {
    public final /* synthetic */ int a;
    public Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk1(Looper looper, Object obj, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }

    private final void a(Message message) {
        CountDownLatch countDownLatch;
        String str;
        message.getClass();
        int i = message.what;
        long j = 0;
        if (i != 1) {
            int i2 = 0;
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        nm4 nm4Var = (nm4) this.b;
                        int i3 = message.arg1;
                        int i4 = message.arg2;
                        Object obj = message.obj;
                        obj.getClass();
                        om4 om4Var = (om4) obj;
                        try {
                            if (nm4Var.B && nm4Var.Y.a.d()) {
                                long nanoTime = System.nanoTime();
                                Boolean valueOf = Boolean.valueOf(MelonEmulator.a.prewarmOpenGlRetroArchFilter(i3, i4));
                                Boolean bool = Boolean.FALSE;
                                if (valueOf instanceof em5) {
                                    valueOf = bool;
                                }
                                boolean booleanValue = valueOf.booleanValue();
                                long nanoTime2 = (System.nanoTime() - nanoTime) / 1000000;
                                if (booleanValue) {
                                    j = nanoTime2;
                                }
                                om4Var.b = j;
                                if (booleanValue) {
                                    str = "ready";
                                } else {
                                    str = "failed";
                                }
                                Log.i("OpenGlFrameRenderCoordinator", "Shader prewarm " + str + " in " + nanoTime2 + "ms (atlas " + i3 + "x" + i4 + ")");
                                countDownLatch = om4Var.a;
                                countDownLatch.countDown();
                                return;
                            }
                            countDownLatch = om4Var.a;
                            countDownLatch.countDown();
                            return;
                        } finally {
                            om4Var.a.countDown();
                        }
                    }
                    return;
                }
                nm4 nm4Var2 = (nm4) this.b;
                if (!nm4Var2.L) {
                    nm4Var2.L = true;
                    nm4Var2.B = false;
                    pm4 pm4Var = nm4Var2.Y;
                    synchronized (pm4Var.d) {
                        try {
                            ArrayList arrayList = pm4Var.e;
                            int size = arrayList.size();
                            int i5 = 0;
                            while (i5 < size) {
                                Object obj2 = arrayList.get(i5);
                                i5++;
                                ((EmulatorSurfaceView) obj2).b(pm4Var.a);
                            }
                            ArrayList arrayList2 = pm4Var.f;
                            int size2 = arrayList2.size();
                            while (i2 < size2) {
                                Object obj3 = arrayList2.get(i2);
                                i2++;
                                ((EmulatorSurfaceView) obj3).b(pm4Var.a);
                            }
                            pm4Var.e.clear();
                            pm4Var.f.clear();
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (nm4Var2.Y.a.d()) {
                        try {
                            MelonEmulator.a.releaseOpenGlRetroArchFilter();
                        } catch (Throwable unused) {
                        }
                    }
                    EGLDisplay eGLDisplay = nm4Var2.Y.a.a;
                    EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                    EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                    nm4Var2.Y.a.b();
                    return;
                }
                return;
            }
            pm4 pm4Var2 = ((nm4) this.b).Y;
            synchronized (pm4Var2.d) {
                try {
                    ArrayList arrayList3 = pm4Var2.f;
                    int size3 = arrayList3.size();
                    while (i2 < size3) {
                        Object obj4 = arrayList3.get(i2);
                        i2++;
                        ((EmulatorSurfaceView) obj4).b(pm4Var2.a);
                    }
                    pm4Var2.f.clear();
                } finally {
                }
            }
            return;
        }
        nm4 nm4Var3 = (nm4) this.b;
        long j2 = message.getData().getLong("frame-deadline");
        if (!nm4Var3.B) {
            return;
        }
        pm4 pm4Var3 = nm4Var3.Y;
        synchronized (pm4Var3.d) {
            if (j2 > 0) {
                try {
                    j = j2 - (((float) nm4Var3.R.A) * 2.0f);
                } finally {
                }
            }
            pm4Var3.a.d();
            MelonEmulator.a.presentFrame(j, nm4Var3.X);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f9, code lost:
        if (r4 < 0) goto L77;
     */
    /* JADX WARN: Removed duplicated region for block: B:239:0x04a2  */
    /* JADX WARN: Removed duplicated region for block: B:342:? A[RETURN, SYNTHETIC] */
    @Override // android.os.Handler
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void handleMessage(Message message) {
        boolean z;
        boolean z2;
        Object a;
        Object[] objArr;
        long j;
        long j2;
        long j3;
        ArrayList arrayList;
        NetworkInfo networkInfo = null;
        Long l = null;
        ArrayList arrayList2 = null;
        int i = 0;
        switch (this.a) {
            case 0:
                uk1 uk1Var = (uk1) this.b;
                switch (message.what) {
                    case 1:
                        uk1Var.e((i33) message.obj, true);
                        return;
                    case 2:
                        i33 i33Var = (i33) message.obj;
                        uk1Var.getClass();
                        LinkedHashMap linkedHashMap = (LinkedHashMap) uk1Var.f;
                        String str = i33Var.d;
                        sw4 sw4Var = i33Var.a;
                        v40 v40Var = (v40) linkedHashMap.get(str);
                        if (v40Var != null) {
                            v40Var.b(i33Var);
                            if (v40Var.a()) {
                                linkedHashMap.remove(str);
                                sw4Var.getClass();
                            }
                        }
                        if (((LinkedHashSet) uk1Var.i).contains(i33Var.e)) {
                            ((WeakHashMap) uk1Var.h).remove(i33Var.a());
                            sw4Var.getClass();
                        }
                        i33 i33Var2 = (i33) ((WeakHashMap) uk1Var.g).remove(i33Var.a());
                        if (i33Var2 != null) {
                            i33Var2.a.getClass();
                            return;
                        }
                        return;
                    case 3:
                    case 8:
                    default:
                        sw4.i.post(new rk1(message, 0));
                        return;
                    case 4:
                        v40 v40Var2 = (v40) message.obj;
                        uk1Var.getClass();
                        v40Var2.getClass();
                        String str2 = v40Var2.Y;
                        if (e44.shouldWriteToMemoryCache(0)) {
                            Bitmap bitmap = v40Var2.h0;
                            nr1 nr1Var = (nr1) ((s63) uk1Var.l).B;
                            if (str2 != null && bitmap != null) {
                                StringBuilder sb = ck7.a;
                                int allocationByteCount = bitmap.getAllocationByteCount();
                                if (allocationByteCount >= 0) {
                                    if (allocationByteCount > nr1Var.maxSize()) {
                                        nr1Var.remove(str2);
                                    } else {
                                        nr1Var.put(str2, new xz3(bitmap, allocationByteCount));
                                    }
                                } else {
                                    e41.y(bitmap, "Negative size: ");
                                    return;
                                }
                            } else {
                                u34.x("key == null || bitmap == null");
                                return;
                            }
                        }
                        ((LinkedHashMap) uk1Var.f).remove(str2);
                        uk1Var.a(v40Var2);
                        v40Var2.B.getClass();
                        return;
                    case 5:
                        v40 v40Var3 = (v40) message.obj;
                        uk1Var.getClass();
                        WeakHashMap weakHashMap = (WeakHashMap) uk1Var.g;
                        boolean z3 = uk1Var.b;
                        vw4 vw4Var = (vw4) uk1Var.d;
                        Future future = v40Var3.i0;
                        xk5 xk5Var = v40Var3.e0;
                        if (future == null || !future.isCancelled()) {
                            if (vw4Var.isShutdown()) {
                                uk1Var.d(v40Var3, false);
                                return;
                            }
                            if (z3) {
                                StringBuilder sb2 = ck7.a;
                                networkInfo = ((ConnectivityManager) ((Context) uk1Var.c).getSystemService("connectivity")).getActiveNetworkInfo();
                            }
                            int i2 = v40Var3.m0;
                            if (i2 > 0) {
                                v40Var3.m0 = i2 - 1;
                                z = xk5Var.d(networkInfo);
                            } else {
                                z = false;
                            }
                            if (z) {
                                v40Var3.B.getClass();
                                if (v40Var3.k0 instanceof df4) {
                                    v40Var3.d0 |= ze4.NO_CACHE.index;
                                }
                                v40Var3.i0 = vw4Var.submit(v40Var3);
                                return;
                            }
                            if (z3) {
                                xk5Var.getClass();
                                if (xk5Var instanceof ff4) {
                                    z2 = true;
                                    uk1Var.d(v40Var3, z2);
                                    if (!z2) {
                                        i33 i33Var3 = v40Var3.f0;
                                        if (i33Var3 != null && (a = i33Var3.a()) != null) {
                                            i33Var3.f = true;
                                            weakHashMap.put(a, i33Var3);
                                        }
                                        ArrayList arrayList3 = v40Var3.g0;
                                        if (arrayList3 != null) {
                                            int size = arrayList3.size();
                                            while (i < size) {
                                                i33 i33Var4 = (i33) arrayList3.get(i);
                                                Object a2 = i33Var4.a();
                                                if (a2 != null) {
                                                    i33Var4.f = true;
                                                    weakHashMap.put(a2, i33Var4);
                                                }
                                                i++;
                                            }
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                            }
                            z2 = false;
                            uk1Var.d(v40Var3, z2);
                            if (!z2) {
                            }
                        } else {
                            return;
                        }
                        break;
                    case 6:
                        uk1Var.d((v40) message.obj, false);
                        return;
                    case 7:
                        uk1Var.getClass();
                        ArrayList arrayList4 = (ArrayList) uk1Var.n;
                        ArrayList arrayList5 = new ArrayList(arrayList4);
                        arrayList4.clear();
                        Handler handler = (Handler) uk1Var.k;
                        handler.sendMessage(handler.obtainMessage(8, arrayList5));
                        if (!arrayList5.isEmpty()) {
                            ((v40) arrayList5.get(0)).B.getClass();
                            return;
                        }
                        return;
                    case 9:
                        NetworkInfo networkInfo2 = (NetworkInfo) message.obj;
                        vw4 vw4Var2 = (vw4) uk1Var.d;
                        WeakHashMap weakHashMap2 = (WeakHashMap) uk1Var.g;
                        if (vw4Var2 != null) {
                            if (networkInfo2 != null && networkInfo2.isConnectedOrConnecting()) {
                                int type = networkInfo2.getType();
                                if (type != 0) {
                                    if (type != 1 && type != 6 && type != 9) {
                                        vw4Var2.e(3);
                                    } else {
                                        vw4Var2.e(4);
                                    }
                                } else {
                                    int subtype = networkInfo2.getSubtype();
                                    switch (subtype) {
                                        case 1:
                                        case 2:
                                            vw4Var2.e(1);
                                            break;
                                        default:
                                            switch (subtype) {
                                                case 12:
                                                    break;
                                                case 13:
                                                case 14:
                                                case 15:
                                                    vw4Var2.e(3);
                                                    break;
                                                default:
                                                    vw4Var2.e(3);
                                                    break;
                                            }
                                        case 3:
                                        case 4:
                                        case 5:
                                        case 6:
                                            vw4Var2.e(2);
                                            break;
                                    }
                                }
                            } else {
                                vw4Var2.e(3);
                            }
                        }
                        if (networkInfo2 != null && networkInfo2.isConnected() && !weakHashMap2.isEmpty()) {
                            Iterator it = weakHashMap2.values().iterator();
                            while (it.hasNext()) {
                                i33 i33Var5 = (i33) it.next();
                                it.remove();
                                i33Var5.a.getClass();
                                uk1Var.e(i33Var5, false);
                            }
                            return;
                        }
                        return;
                    case 10:
                        uk1Var.getClass();
                        return;
                    case 11:
                        Object obj = message.obj;
                        WeakHashMap weakHashMap3 = (WeakHashMap) uk1Var.h;
                        if (((LinkedHashSet) uk1Var.i).add(obj)) {
                            Iterator it2 = ((LinkedHashMap) uk1Var.f).values().iterator();
                            while (it2.hasNext()) {
                                v40 v40Var4 = (v40) it2.next();
                                v40Var4.B.getClass();
                                i33 i33Var6 = v40Var4.f0;
                                ArrayList arrayList6 = v40Var4.g0;
                                if (arrayList6 != null && !arrayList6.isEmpty()) {
                                    objArr = 1;
                                } else {
                                    objArr = null;
                                }
                                if (i33Var6 != null || objArr != null) {
                                    if (i33Var6 != null && i33Var6.e.equals(obj)) {
                                        v40Var4.b(i33Var6);
                                        weakHashMap3.put(i33Var6.a(), i33Var6);
                                    }
                                    if (objArr != null) {
                                        for (int size2 = arrayList6.size() - 1; size2 >= 0; size2--) {
                                            i33 i33Var7 = (i33) arrayList6.get(size2);
                                            if (i33Var7.e.equals(obj)) {
                                                v40Var4.b(i33Var7);
                                                weakHashMap3.put(i33Var7.a(), i33Var7);
                                            }
                                        }
                                    }
                                    if (v40Var4.a()) {
                                        it2.remove();
                                    }
                                }
                            }
                            return;
                        }
                        return;
                    case 12:
                        Object obj2 = message.obj;
                        if (((LinkedHashSet) uk1Var.i).remove(obj2)) {
                            Iterator it3 = ((WeakHashMap) uk1Var.h).values().iterator();
                            while (it3.hasNext()) {
                                i33 i33Var8 = (i33) it3.next();
                                if (i33Var8.e.equals(obj2)) {
                                    if (arrayList2 == null) {
                                        arrayList2 = new ArrayList();
                                    }
                                    arrayList2.add(i33Var8);
                                    it3.remove();
                                }
                            }
                            if (arrayList2 != null) {
                                Handler handler2 = (Handler) uk1Var.k;
                                handler2.sendMessage(handler2.obtainMessage(13, arrayList2));
                                return;
                            }
                            return;
                        }
                        return;
                }
            case 1:
                int i3 = message.what;
                if (i3 != -3 && i3 != -2 && i3 != -1) {
                    if (i3 == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.b).get(), message.what);
                return;
            case 2:
                a(message);
                return;
            case 3:
                if (message.what == 1) {
                    ((k15) this.b).bindPreferences();
                    return;
                }
                return;
            case 4:
                pq6 pq6Var = (pq6) this.b;
                int i4 = message.what;
                if (i4 != 0) {
                    if (i4 != 1) {
                        if (i4 != 2) {
                            if (i4 != 3) {
                                if (i4 != 4) {
                                    sw4.i.post(new rk1(message, 1));
                                    return;
                                }
                                pq6Var.k++;
                                long longValue = ((Long) message.obj).longValue() + pq6Var.e;
                                pq6Var.e = longValue;
                                pq6Var.h = longValue / pq6Var.k;
                                return;
                            }
                            long j4 = message.arg1;
                            pq6Var.m++;
                            long j5 = pq6Var.g + j4;
                            pq6Var.g = j5;
                            pq6Var.j = j5 / pq6Var.l;
                            return;
                        }
                        long j6 = message.arg1;
                        int i5 = pq6Var.l + 1;
                        pq6Var.l = i5;
                        long j7 = pq6Var.f + j6;
                        pq6Var.f = j7;
                        pq6Var.i = j7 / i5;
                        return;
                    }
                    pq6Var.d++;
                    return;
                }
                pq6Var.c++;
                return;
            default:
                message.getClass();
                switch (message.what) {
                    case 1:
                        Object obj3 = message.obj;
                        obj3.getClass();
                        Bundle data = message.getData();
                        data.getClass();
                        tr7.a((tr7) this.b, (EmulatorSurfaceView) obj3, (Surface) ((Parcelable) nc1.R(data, "surface", Surface.class)), message.getData().getInt("width"), message.getData().getInt("height"));
                        return;
                    case 2:
                        tr7 tr7Var = (tr7) this.b;
                        Object obj4 = message.obj;
                        obj4.getClass();
                        EmulatorSurfaceView emulatorSurfaceView = (EmulatorSurfaceView) obj4;
                        int i6 = message.getData().getInt("width");
                        int i7 = message.getData().getInt("height");
                        if (tr7Var.B) {
                            xr7 xr7Var = tr7Var.X;
                            synchronized (xr7Var.c) {
                                ur7 ur7Var = (ur7) xr7Var.d.get(emulatorSurfaceView);
                                if (ur7Var != null) {
                                    i = ur7Var.a;
                                }
                            }
                            if (i != 0) {
                                MelonEmulator.a.resizeVulkanSurface(i, i6, i7);
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        Object obj5 = message.obj;
                        obj5.getClass();
                        int i8 = message.getData().getInt("generation");
                        Bundle data2 = message.getData();
                        data2.getClass();
                        tr7.b((tr7) this.b, (EmulatorSurfaceView) obj5, i8, (Bitmap) ((Parcelable) nc1.R(data2, "background-bitmap", Bitmap.class)));
                        return;
                    case 4:
                        tr7 tr7Var2 = (tr7) this.b;
                        int i9 = message.arg1;
                        if (tr7Var2.B || !tr7Var2.L) {
                            MelonEmulator.a.detachVulkanSurface(i9);
                            return;
                        }
                        return;
                    case 5:
                        tr7 tr7Var3 = (tr7) this.b;
                        long j8 = message.getData().getLong("frame-deadline");
                        if (tr7Var3.B) {
                            Long valueOf = Long.valueOf(j8);
                            if (j8 > 0) {
                                l = valueOf;
                            }
                            if (l != null) {
                                j = l.longValue();
                            } else {
                                j = 0;
                            }
                            if (j > 0) {
                                long j9 = tr7Var3.R.a;
                                if (j9 > 0) {
                                    j3 = (j9 * 5) / 4;
                                } else {
                                    j3 = 1000000;
                                }
                                j2 = j - gi2.s(j3, 500000L, 2000000L);
                                break;
                            }
                            j2 = 0;
                            long nanoTime = System.nanoTime();
                            MelonEmulator.a.presentVulkanFrame(j, j2);
                            wr7 wr7Var = tr7Var3.R;
                            long nanoTime2 = System.nanoTime() - nanoTime;
                            wr7Var.getClass();
                            if (nanoTime2 < 0) {
                                nanoTime2 = 0;
                            }
                            long j10 = wr7Var.a;
                            if (j10 != 0) {
                                nanoTime2 = ((j10 * 7) + nanoTime2) / 8;
                            }
                            wr7Var.a = nanoTime2;
                            return;
                        }
                        return;
                    case 6:
                        tr7 tr7Var4 = (tr7) this.b;
                        if (!tr7Var4.L) {
                            tr7Var4.L = true;
                            tr7Var4.B = false;
                            sk1 sk1Var = tr7Var4.A;
                            if (sk1Var != null) {
                                sk1Var.removeCallbacksAndMessages(null);
                            }
                            tr7Var4.A = null;
                            xr7 xr7Var2 = tr7Var4.X;
                            synchronized (xr7Var2.c) {
                                arrayList = new ArrayList();
                                for (ur7 ur7Var2 : xr7Var2.d.values()) {
                                    int i10 = ur7Var2.a;
                                    Integer valueOf2 = Integer.valueOf(i10);
                                    if (i10 == 0) {
                                        valueOf2 = null;
                                    }
                                    if (valueOf2 != null) {
                                        arrayList.add(valueOf2);
                                    }
                                }
                            }
                            int size3 = arrayList.size();
                            int i11 = 0;
                            while (i11 < size3) {
                                Object obj6 = arrayList.get(i11);
                                i11++;
                                MelonEmulator.a.detachVulkanSurface(((Number) obj6).intValue());
                            }
                            xr7 xr7Var3 = tr7Var4.X;
                            synchronized (xr7Var3.c) {
                                try {
                                    for (ur7 ur7Var3 : xr7Var3.d.values()) {
                                        ur7Var3.a = 0;
                                        ur7Var3.e = null;
                                    }
                                    xr7Var3.e.clear();
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                            return;
                        }
                        return;
                    default:
                        return;
                }
        }
    }

    public /* synthetic */ sk1() {
        this.a = 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ sk1(Object obj, Looper looper, int i) {
        super(looper);
        this.a = i;
        this.b = obj;
    }
}

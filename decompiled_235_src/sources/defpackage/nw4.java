package defpackage;

import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nw4  reason: default package */
/* loaded from: classes.dex */
public final class nw4 implements DSiCameraSource {
    public final Context a;
    public final iu3 b;
    public final uv4 c;
    public final o41 d;
    public f35 e;
    public final zb f;
    public final ExecutorService g;
    public final Handler h;
    public final float[] i;
    public final float[] j;

    public nw4(Context context, iu3 iu3Var, uv4 uv4Var) {
        this.a = context;
        this.b = iu3Var;
        this.c = uv4Var;
        xe1 xe1Var = xk1.a;
        this.d = g04.i(e04.a.Y);
        this.f = new zb(3, (byte) 0);
        this.g = Executors.newSingleThreadExecutor();
        this.h = new Handler(Looper.getMainLooper());
        this.i = new float[614400];
        this.j = new float[614400];
    }

    public final void a(int i) {
        int i2;
        int i3;
        zt3 zt3Var;
        gx3 gx3Var;
        to2 to2Var;
        Executor d72Var;
        f35 f35Var = f35.b;
        Context context = this.a;
        ci0 ci0Var = f35.b.a;
        synchronized (ci0Var.a) {
            Object obj = q41.a;
            i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                i3 = c2.f(context);
            } else {
                i3 = 0;
            }
            LinkedHashMap linkedHashMap = xt3.a;
            synchronized (linkedHashMap) {
                Integer valueOf = Integer.valueOf(i3);
                Object obj2 = linkedHashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = new zt3();
                    linkedHashMap.put(valueOf, obj2);
                }
                zt3Var = (zt3) obj2;
            }
            ci0Var.e = zt3Var;
            gx3Var = (to2) ci0Var.b;
            if (gx3Var == null) {
                gj0 gj0Var = new gj0(context, null);
                gx3 gx3Var2 = (gx3) ci0Var.c;
                if (gx3Var2 instanceof to2) {
                    to2Var = (to2) gx3Var2;
                } else {
                    to2Var = new to2(gx3Var2);
                }
                ll0 T = l.T(l.T(to2Var, new h61(new bg2(gj0Var, 10), 12), u24.j()), new d51(new h61(new t00(ci0Var, gj0Var, context), 13), 23), u24.j());
                ci0Var.b = T;
                T.a(u24.j(), new uo2(0, T, new s63(ci0Var, 11)));
                gx3Var = l.F(T);
            }
        }
        new dv4(4);
        ll0 T2 = l.T(gx3Var, new d51(new Object(), 23), u24.j());
        xd0 xd0Var = new xd0(T2, this, i);
        Context context2 = this.a;
        if (i2 >= 28) {
            d72Var = pp.g(context2);
        } else {
            d72Var = new d72(new Handler(context2.getMainLooper()), 0);
        }
        T2.a(d72Var, xd0Var);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int i, byte[] bArr, int i2, int i3, boolean z) {
        bArr.getClass();
        zb zbVar = this.f;
        byte[] bArr2 = ((byte[][]) zbVar.L)[zbVar.B];
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
        g04.x(this.d, null);
        f35 f35Var = this.e;
        if (f35Var != null) {
            f35Var.a.m();
        }
        this.e = null;
        this.g.shutdownNow();
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
        boolean z;
        Object systemService = this.a.getSystemService("camera");
        systemService.getClass();
        String[] cameraIdList = ((CameraManager) systemService).getCameraIdList();
        cameraIdList.getClass();
        if (cameraIdList.length == 0) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int i) {
        for (int i2 = 0; i2 < 480; i2++) {
            for (int i3 = 0; i3 < 640; i3++) {
                int i4 = ((i2 * 640) + i3) * 2;
                float[] fArr = this.i;
                fArr[i4] = i3;
                fArr[i4 + 1] = i2;
            }
        }
        zb zbVar = this.f;
        Arrays.fill(((byte[][]) zbVar.L)[zbVar.B], (byte) 0);
        if (ge7.s(this.a, "android.permission.CAMERA") != 0) {
            hv.L(this.d, null, null, new l7(this, i, null, 4), 3);
            return;
        }
        this.h.post(new om(this, i, 4));
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i) {
        this.h.post(new rk3(this, 5));
    }
}

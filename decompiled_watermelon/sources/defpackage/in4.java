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
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: in4  reason: default package */
/* loaded from: classes.dex */
public final class in4 implements DSiCameraSource {
    public final Context a;
    public final gn3 b;
    public final pm4 c;
    public final g11 d;
    public bu4 e;
    public final sb f;
    public final ExecutorService g;
    public final Handler h;
    public final float[] i;
    public final float[] j;

    public in4(Context context, gn3 gn3Var, pm4 pm4Var) {
        this.a = context;
        this.b = gn3Var;
        this.c = pm4Var;
        bb1 bb1Var = tg1.a;
        this.d = iq2.c(bt3.a.Y);
        this.f = new sb(3, (byte) 0);
        this.g = Executors.newSingleThreadExecutor();
        this.h = new Handler(Looper.getMainLooper());
        this.i = new float[614400];
        this.j = new float[614400];
    }

    public final void a(int i) {
        int i2;
        int i3;
        xm3 xm3Var;
        fq3 fq3Var;
        pj2 pj2Var;
        Executor l22Var;
        bu4 bu4Var = bu4.b;
        Context context = this.a;
        tf0 tf0Var = bu4.b.a;
        synchronized (tf0Var.A) {
            Object obj = i11.a;
            i2 = Build.VERSION.SDK_INT;
            if (i2 >= 34) {
                i3 = a2.f(context);
            } else {
                i3 = 0;
            }
            LinkedHashMap linkedHashMap = vm3.a;
            synchronized (linkedHashMap) {
                Integer valueOf = Integer.valueOf(i3);
                Object obj2 = linkedHashMap.get(valueOf);
                if (obj2 == null) {
                    obj2 = new xm3();
                    linkedHashMap.put(valueOf, obj2);
                }
                xm3Var = (xm3) obj2;
            }
            tf0Var.X = xm3Var;
            fq3Var = (pj2) tf0Var.B;
            if (fq3Var == null) {
                xg0 xg0Var = new xg0(context, null);
                fq3 fq3Var2 = (fq3) tf0Var.L;
                if (fq3Var2 instanceof pj2) {
                    pj2Var = (pj2) fq3Var2;
                } else {
                    pj2Var = new pj2(fq3Var2);
                }
                cj0 f0 = jv3.f0(jv3.f0(pj2Var, new a31(13, new kb2(10, xg0Var)), iq2.l()), new t71(21, new a31(14, new cz((Object) tf0Var, (Object) xg0Var, context, 14))), iq2.l());
                tf0Var.B = f0;
                f0.a(new qj2(0, f0, new ka3(7, tf0Var)), iq2.l());
                fq3Var = jv3.N(f0);
            }
        }
        cj0 f02 = jv3.f0(fq3Var, new t71(21, new c44(new n44(22))), iq2.l());
        ob0 ob0Var = new ob0(f02, this, i);
        Context context2 = this.a;
        if (i2 >= 28) {
            l22Var = dp.g(context2);
        } else {
            l22Var = new l22(new Handler(context2.getMainLooper()), 0);
        }
        f02.a(ob0Var, l22Var);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int i, byte[] bArr, int i2, int i3, boolean z) {
        bArr.getClass();
        sb sbVar = this.f;
        byte[] bArr2 = ((byte[][]) sbVar.L)[sbVar.B];
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
        iq2.f(this.d, null);
        bu4 bu4Var = this.e;
        if (bu4Var != null) {
            bu4Var.a.m();
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
        sb sbVar = this.f;
        Arrays.fill(((byte[][]) sbVar.L)[sbVar.B], (byte) 0);
        if (jv3.o(this.a, "android.permission.CAMERA") != 0) {
            tq5.w(this.d, null, null, new k7(this, i, null, 4), 3);
            return;
        }
        this.h.post(new cm(i, 4, this));
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i) {
        this.h.post(new tm3(3, this));
    }
}

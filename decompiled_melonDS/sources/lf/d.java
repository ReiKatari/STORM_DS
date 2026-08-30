package lf;

import a6.k;
import ah.h0;
import aj.g;
import android.content.Context;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import d0.w;
import ed.n;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import l.i0;
import m0.i;
import me.magnum.melonds.common.camera.DSiCameraSource;
import mh.z;
import p1.c1;
import pf.q;
import sd.h;
import u1.h1;
import zc.g0;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d implements DSiCameraSource {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9075a;

    /* renamed from: b  reason: collision with root package name */
    public final q f9076b;

    /* renamed from: c  reason: collision with root package name */
    public final h f9077c;

    /* renamed from: d  reason: collision with root package name */
    public final h0 f9078d;

    /* renamed from: e  reason: collision with root package name */
    public x0.f f9079e;

    /* renamed from: f  reason: collision with root package name */
    public final bk.a f9080f;

    /* renamed from: g  reason: collision with root package name */
    public final ExecutorService f9081g;

    /* renamed from: h  reason: collision with root package name */
    public final Handler f9082h;

    /* renamed from: i  reason: collision with root package name */
    public final float[] f9083i;

    /* renamed from: j  reason: collision with root package name */
    public final float[] f9084j;

    public d(Context context, q qVar, h hVar) {
        this.f9075a = context;
        this.f9076b = qVar;
        this.f9077c = hVar;
        gd.f fVar = g0.f15015a;
        this.f9078d = x.a(n.f4465a.Y);
        this.f9080f = new bk.a(6, (byte) 0);
        this.f9081g = Executors.newSingleThreadExecutor();
        this.f9082h = new Handler(Looper.getMainLooper());
        this.f9083i = new float[614400];
        this.f9084j = new float[614400];
    }

    public final void a(int i2) {
        ta.a aVar;
        Executor eVar;
        x0.f fVar = x0.f.f14319b;
        Context context = this.f9075a;
        d5.f fVar2 = x0.f.f14319b.f14320a;
        synchronized (fVar2.f3839a) {
            aVar = (m0.d) fVar2.f3840b;
            if (aVar == null) {
                w wVar = new w(context, null);
                m0.b g10 = i.g(m0.d.b((ta.a) fVar2.f3841c), new ah.e(20, new z(24, wVar)), ij.a.D());
                fVar2.f3840b = g10;
                c1 c1Var = new c1(fVar2, wVar, context);
                g10.a(new m0.h(0, g10, c1Var), ij.a.D());
                aVar = i.d(g10);
            }
        }
        wa.b bVar = new wa.b(new h1(13));
        m0.b g11 = i.g(aVar, new i0(4, bVar), ij.a.D());
        d.i iVar = new d.i(g11, this, i2, 3);
        Context context2 = this.f9075a;
        if (Build.VERSION.SDK_INT >= 28) {
            eVar = k.g(context2);
        } else {
            eVar = new l0.e(1, new Handler(context2.getMainLooper()));
        }
        g11.a(iVar, eVar);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int i2, byte[] bArr, int i10, int i11, boolean z10) {
        bArr.getClass();
        bk.a aVar = this.f9080f;
        byte[] bArr2 = ((byte[][]) aVar.L)[aVar.B];
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
        x.f(this.f9078d, null);
        x0.f fVar = this.f9079e;
        if (fVar != null) {
            fVar.f14320a.f();
        }
        this.f9079e = null;
        this.f9081g.shutdownNow();
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
        boolean z10;
        Object systemService = this.f9075a.getSystemService("camera");
        systemService.getClass();
        String[] cameraIdList = ((CameraManager) systemService).getCameraIdList();
        cameraIdList.getClass();
        if (cameraIdList.length == 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int i2) {
        for (int i10 = 0; i10 < 480; i10++) {
            for (int i11 = 0; i11 < 640; i11++) {
                int i12 = ((i10 * 640) + i11) * 2;
                float[] fArr = this.f9083i;
                fArr[i12] = i11;
                fArr[i12 + 1] = i10;
            }
        }
        bk.a aVar = this.f9080f;
        Arrays.fill(((byte[][]) aVar.L)[aVar.B], (byte) 0);
        if (g.k(this.f9075a, "android.permission.CAMERA") != 0) {
            x.v(this.f9078d, null, null, new ai.f(this, i2, null, 1), 3);
            return;
        }
        this.f9082h.post(new d2.d(i2, 1, this));
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i2) {
        this.f9082h.post(new a8.f(19, this));
    }
}

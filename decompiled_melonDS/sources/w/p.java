package w;

import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.os.Handler;
import android.util.ArrayMap;
import android.view.Surface;
import d0.p1;
import j0.h2;
import j0.o1;
import j0.w1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class p extends CameraDevice.StateCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f14007a = 1;

    /* renamed from: b  reason: collision with root package name */
    public final Object f14008b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f14009c;

    public p(Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f14009c = executor;
        this.f14008b = stateCallback;
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onClosed(CameraDevice cameraDevice) {
        switch (this.f14007a) {
            case 0:
                ((x) this.f14009c).v("openCameraConfigAndClose camera closed", null);
                ((b5.i) this.f14008b).b(null);
                return;
            default:
                ((Executor) this.f14009c).execute(new x.k(this, cameraDevice, 0));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onDisconnected(CameraDevice cameraDevice) {
        switch (this.f14007a) {
            case 0:
                ((x) this.f14009c).v("openCameraConfigAndClose camera disconnected", null);
                ((b5.i) this.f14008b).b(null);
                return;
            default:
                ((Executor) this.f14009c).execute(new x.k(this, cameraDevice, 1));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onError(CameraDevice cameraDevice, int i2) {
        switch (this.f14007a) {
            case 0:
                ((x) this.f14009c).v("openCameraConfigAndClose camera error " + i2, null);
                ((b5.i) this.f14008b).b(null);
                return;
            default:
                ((Executor) this.f14009c).execute(new d.i(this, cameraDevice, i2, 7));
                return;
        }
    }

    @Override // android.hardware.camera2.CameraDevice.StateCallback
    public final void onOpened(CameraDevice cameraDevice) {
        int i2 = this.f14007a;
        Object obj = this.f14009c;
        switch (i2) {
            case 0:
                x xVar = (x) obj;
                l0.h hVar = xVar.L;
                xVar.v("openCameraConfigAndClose camera opened", null);
                p0 p0Var = new p0(xVar.D0, new o1(Collections.EMPTY_LIST), false);
                SurfaceTexture surfaceTexture = new SurfaceTexture(0);
                surfaceTexture.setDefaultBufferSize(640, 480);
                Surface surface = new Surface(surfaceTexture);
                p1 p1Var = new p1(surface);
                m0.i.d(p1Var.f7299e).a(new g(1, surface, surfaceTexture), ij.a.D());
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                HashSet hashSet = new HashSet();
                j0.g1 b10 = j0.g1.b();
                ArrayList arrayList = new ArrayList();
                j0.h1 a10 = j0.h1.a();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                ArrayList arrayList4 = new ArrayList();
                a7.v a11 = j0.i.a(p1Var);
                a11.X = d0.a0.f3320d;
                linkedHashSet.add(a11.h());
                xVar.v("Start configAndClose.", null);
                ArrayList arrayList5 = new ArrayList(linkedHashSet);
                ArrayList arrayList6 = new ArrayList(arrayList2);
                ArrayList arrayList7 = new ArrayList(arrayList3);
                ArrayList arrayList8 = new ArrayList(arrayList4);
                ArrayList arrayList9 = new ArrayList(hashSet);
                j0.i1 a12 = j0.i1.a(b10);
                ArrayList arrayList10 = new ArrayList(arrayList);
                h2 h2Var = h2.f7211b;
                ArrayMap arrayMap = new ArrayMap();
                ArrayMap arrayMap2 = a10.f7212a;
                for (String str : arrayMap2.keySet()) {
                    arrayMap.put(str, arrayMap2.get(str));
                }
                w1 w1Var = new w1(arrayList5, arrayList6, arrayList7, arrayList8, new j0.p0(arrayList9, a12, 1, arrayList10, false, new h2(arrayMap), null), null, null, 0, null);
                x0 x0Var = xVar.f14085x0;
                m0.b g10 = m0.i.g(m0.d.b(a.a.A(new m0.e(p0Var.l(w1Var, cameraDevice, new g1((o1) x0Var.f14093f, (o1) x0Var.f14094g, (x0) x0Var.f14092e, (l0.h) x0Var.f14089b, (l0.d) x0Var.f14090c, (Handler) x0Var.f14091d)), 0))), new bi.h(12, p0Var, p1Var), hVar);
                Objects.requireNonNull(cameraDevice);
                g10.a(new r0.b(6, cameraDevice), hVar);
                return;
            default:
                ((Executor) obj).execute(new x.k(this, cameraDevice, 2));
                return;
        }
    }

    public p(x xVar, b5.i iVar) {
        this.f14009c = xVar;
        this.f14008b = iVar;
    }
}

package p1;

import ah.m1;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.params.InputConfiguration;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Handler;
import android.view.Surface;
import android.widget.ImageView;
import android.widget.Toast;
import androidx.cardview.widget.CardView;
import d1.w1;
import j0.h2;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
import y3.s1;
import zc.l1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class a0 implements s1, m0.c, com.squareup.picasso.f, fj.f0, j0.u, wc.k, y2.j {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;

    public a0(int i2) {
        this.A = i2;
        switch (i2) {
            case 2:
                this.B = new Object();
                this.L = new a1.s(16);
                return;
            case 3:
                this.B = new ArrayList();
                this.L = new ArrayList();
                return;
            case 4:
                return;
            default:
                w1 w1Var = d1.d.f3545j;
                Float valueOf = Float.valueOf(0.0f);
                this.L = new d1.k(w1Var, valueOf, (d1.p) w1Var.f3690a.k(valueOf), Long.MIN_VALUE, Long.MIN_VALUE, false);
                return;
        }
    }

    public static String t(Class cls) {
        int modifiers = cls.getModifiers();
        if (Modifier.isInterface(modifiers)) {
            return "Interfaces can't be instantiated! Register an InstanceCreator or a TypeAdapter for this type. Interface name: ".concat(cls.getName());
        }
        if (Modifier.isAbstract(modifiers)) {
            return "Abstract classes can't be instantiated! Adjust the R8 configuration or register an InstanceCreator or a TypeAdapter for this type. Class name: " + cls.getName() + "\nSee " + "https://github.com/google/gson/blob/main/Troubleshooting.md#".concat("r8-abstract-class");
        }
        return null;
    }

    public void A(v5.e eVar) {
        gk.a aVar = (gk.a) this.L;
        l.i0 i0Var = (l.i0) this.B;
        int i2 = eVar.f13740b;
        if (i2 == 0) {
            aVar.execute(new m0.h(8, i0Var, eVar.f13739a));
        } else {
            aVar.execute(new com.google.android.material.datepicker.g(i2, 2, i0Var));
        }
    }

    public void B(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        executor.getClass();
        stateCallback.getClass();
        try {
            ((CameraManager) this.B).openCamera(str, new w.p(executor, stateCallback), ((x.t) this.L).f14309b);
        } catch (CameraAccessException e6) {
            throw new x.a(e6);
        }
    }

    public void C(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        x.o oVar;
        if (executor != null) {
            x.t tVar = (x.t) this.L;
            synchronized (tVar.f14308a) {
                try {
                    oVar = (x.o) tVar.f14308a.get(availabilityCallback);
                    if (oVar == null) {
                        oVar = new x.o(executor, availabilityCallback);
                        tVar.f14308a.put(availabilityCallback, oVar);
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            ((CameraManager) this.B).registerAvailabilityCallback(oVar, tVar.f14309b);
            return;
        }
        a0.j.h("executor was null");
    }

    @Override // m0.c
    public void D(Object obj) {
        switch (this.A) {
            case 7:
                r0.m mVar = (r0.m) obj;
                mVar.getClass();
                ((r0.d) ((c1) this.L).A).b(mVar);
                return;
            case 11:
                r0.m mVar2 = (r0.m) obj;
                mVar2.getClass();
                ((r0.n) ((a7.v) this.L).A).b(mVar2);
                return;
            default:
                Void r22 = (Void) obj;
                ((Surface) this.B).release();
                ((SurfaceTexture) this.L).release();
                return;
        }
    }

    public q8.j E(x8.i iVar) {
        q8.j k10;
        iVar.getClass();
        synchronized (this.L) {
            k10 = ((m1) this.B).k(iVar);
        }
        return k10;
    }

    public int F(List list, l0.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.B).setRepeatingBurst(list, new a0.k(hVar, captureCallback), ((x.h) this.L).f14296a);
    }

    public void G(int i2, int i10, int i11, int i12) {
        CardView cardView = (CardView) this.L;
        cardView.R.set(i2, i10, i11, i12);
        Rect rect = cardView.L;
        CardView.a(cardView, i2 + rect.left, i10 + rect.top, i11 + rect.right, i12 + rect.bottom);
    }

    public int H(CaptureRequest captureRequest, l0.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.B).setRepeatingRequest(captureRequest, new a0.k(hVar, captureCallback), ((x.h) this.L).f14296a);
    }

    public void I(q8.j jVar, p8.x xVar) {
        jVar.getClass();
        ((z8.a) this.L).f14969a.execute(new a0.i(this, jVar, xVar, 9));
    }

    public void J(q8.j jVar, int i2) {
        jVar.getClass();
        ((z8.a) this.L).f14969a.execute(new y8.j((q8.d) this.B, jVar, false, i2));
    }

    public q8.j K(x8.i iVar) {
        q8.j l10;
        synchronized (this.L) {
            l10 = ((m1) this.B).l(iVar);
        }
        return l10;
    }

    public void L(CameraManager.AvailabilityCallback availabilityCallback) {
        x.o oVar;
        if (availabilityCallback != null) {
            x.t tVar = (x.t) this.L;
            synchronized (tVar.f14308a) {
                oVar = (x.o) tVar.f14308a.remove(availabilityCallback);
            }
        } else {
            oVar = null;
        }
        if (oVar != null) {
            synchronized (oVar.f14304c) {
                oVar.f14305d = true;
            }
        }
        ((CameraManager) this.B).unregisterAvailabilityCallback(oVar);
    }

    public void M(float f8, x4.c cVar, zc.u uVar) {
        mc.l lVar;
        if (f8 <= cVar.v(q0.f11249a)) {
            return;
        }
        z2.f e6 = z2.q.e();
        if (e6 != null) {
            lVar = e6.e();
        } else {
            lVar = null;
        }
        z2.f h2 = z2.q.h(e6);
        try {
            float floatValue = ((Number) ((d1.k) this.L).B.getValue()).floatValue();
            l1 l1Var = (l1) this.B;
            if (l1Var != null) {
                l1Var.i(null);
            }
            d1.k kVar = (d1.k) this.L;
            if (kVar.Y) {
                this.L = d1.d.l(kVar, floatValue - f8, 0.0f, 30);
            } else {
                this.L = new d1.k(d1.d.f3545j, Float.valueOf(-f8), null, 60);
            }
            this.B = zc.x.v(uVar, null, null, new a9.b(27, null, this), 3);
            z2.q.k(e6, h2, lVar);
        } catch (Throwable th2) {
            z2.q.k(e6, h2, lVar);
            throw th2;
        }
    }

    public void N(j0.c0 c0Var, d0.f fVar) {
        d0.e eVar;
        if (fVar != null && fVar.f3365a == 8) {
            eVar = new d0.e(d0.s.CLOSED, fVar);
        } else {
            switch (w.k0.f13993a[c0Var.ordinal()]) {
                case DSiCameraSource.FrontCamera /* 1 */:
                    j0.l0 l0Var = (j0.l0) this.B;
                    synchronized (l0Var.f7256b) {
                        Iterator it = l0Var.f7259e.entrySet().iterator();
                        while (true) {
                            if (it.hasNext()) {
                                if (((j0.k0) ((Map.Entry) it.next()).getValue()).f7242a == j0.c0.CLOSING) {
                                    eVar = new d0.e(d0.s.OPENING, null);
                                }
                            } else {
                                eVar = new d0.e(d0.s.PENDING_OPEN, null);
                            }
                        }
                    }
                    break;
                case 2:
                    eVar = new d0.e(d0.s.OPENING, fVar);
                    break;
                case 3:
                case 4:
                    eVar = new d0.e(d0.s.OPEN, fVar);
                    break;
                case l1.c.f8511g /* 5 */:
                case l1.c.f8509e /* 6 */:
                    eVar = new d0.e(d0.s.CLOSING, fVar);
                    break;
                case 7:
                case 8:
                    eVar = new d0.e(d0.s.CLOSED, fVar);
                    break;
                default:
                    m9.o.h(c0Var, "Unknown internal camera state: ");
                    return;
            }
        }
        aj.g.o("CameraStateMachine", "New public camera state " + eVar + " from " + c0Var + " and " + fVar);
        if (!Objects.equals((d0.e) ((androidx.lifecycle.f0) this.L).c(), eVar)) {
            aj.g.o("CameraStateMachine", "Publishing new public camera state " + eVar);
            ((androidx.lifecycle.f0) this.L).i(eVar);
        }
    }

    @Override // j0.u
    public h2 a() {
        return (h2) this.B;
    }

    @Override // j0.u
    public j0.t b() {
        Integer num = (Integer) ((CaptureResult) this.L).get(CaptureResult.FLASH_STATE);
        if (num == null) {
            return j0.t.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0 && intValue != 1) {
            if (intValue != 2) {
                if (intValue != 3 && intValue != 4) {
                    aj.g.s("C2CameraCaptureResult", "Undefined flash state: " + num);
                    return j0.t.UNKNOWN;
                }
                return j0.t.FIRED;
            }
            return j0.t.READY;
        }
        return j0.t.NONE;
    }

    @Override // j0.u
    public long c() {
        Long l10 = (Long) ((CaptureResult) this.L).get(CaptureResult.SENSOR_TIMESTAMP);
        if (l10 == null) {
            return -1L;
        }
        return l10.longValue();
    }

    @Override // y2.j
    public Object d(y2.c cVar, Object obj) {
        return ((mc.p) this.B).j(cVar, obj);
    }

    @Override // j0.u
    public j0.q e() {
        Integer num = (Integer) ((CaptureResult) this.L).get(CaptureResult.CONTROL_AE_STATE);
        if (num == null) {
            return j0.q.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        if (intValue != 4) {
                            if (intValue != 5) {
                                aj.g.s("C2CameraCaptureResult", "Undefined ae state: " + num);
                                return j0.q.UNKNOWN;
                            }
                        } else {
                            return j0.q.FLASH_REQUIRED;
                        }
                    } else {
                        return j0.q.LOCKED;
                    }
                } else {
                    return j0.q.CONVERGED;
                }
            }
            return j0.q.SEARCHING;
        }
        return j0.q.INACTIVE;
    }

    @Override // y2.j
    public Object f(Object obj) {
        return ((mc.l) this.L).k(obj);
    }

    @Override // com.squareup.picasso.f
    public void g(Exception exc) {
        if (exc != null) {
            exc.printStackTrace();
        }
        Toast.makeText(((me.magnum.melonds.ui.layouteditor.b) this.B).getContext(), (int) R.string.layout_background_load_failed, 1).show();
    }

    @Override // j0.u
    public j0.s h() {
        Integer num = (Integer) ((CaptureResult) this.L).get(CaptureResult.CONTROL_AWB_STATE);
        if (num == null) {
            return j0.s.UNKNOWN;
        }
        int intValue = num.intValue();
        if (intValue != 0) {
            if (intValue != 1) {
                if (intValue != 2) {
                    if (intValue != 3) {
                        aj.g.s("C2CameraCaptureResult", "Undefined awb state: " + num);
                        return j0.s.UNKNOWN;
                    }
                    return j0.s.LOCKED;
                }
                return j0.s.CONVERGED;
            }
            return j0.s.METERING;
        }
        return j0.s.INACTIVE;
    }

    @Override // y3.s1
    public void i(a1.a1 a1Var) {
        int i2;
        a1.d0 d0Var = (a1.d0) this.L;
        d0Var.a();
        a1.i0 i0Var = (a1.i0) a1Var.B;
        Object[] objArr = i0Var.f49b;
        long[] jArr = i0Var.f50c;
        int i10 = i0Var.f52e;
        while (i10 != Integer.MAX_VALUE) {
            int i11 = (int) ((jArr[i10] >> 31) & 2147483647L);
            Object obj = objArr[i10];
            Object b10 = ((y) this.B).b(obj);
            int d4 = d0Var.d(b10);
            if (d4 >= 0) {
                i2 = d0Var.f34c[d4];
            } else {
                i2 = 0;
            }
            if (i2 == 7) {
                a1Var.remove(obj);
            } else {
                d0Var.g(i2 + 1, b10);
            }
            i10 = i11;
        }
    }

    @Override // fj.f0
    public fj.g0 j() {
        return (ti.f) this.L;
    }

    @Override // com.squareup.picasso.f
    public void k() {
        ImageView.ScaleType scaleType;
        ImageView.ScaleType scaleType2;
        ImageView imageView = ((me.magnum.melonds.ui.layouteditor.b) this.B).L.f9052e;
        ve.a aVar = ((oe.h0) this.L).f10935b;
        aVar.getClass();
        int intrinsicWidth = imageView.getDrawable().getIntrinsicWidth();
        int intrinsicHeight = imageView.getDrawable().getIntrinsicHeight();
        float f8 = intrinsicWidth / intrinsicHeight;
        float width = ((imageView.getWidth() - imageView.getPaddingLeft()) - imageView.getPaddingRight()) / ((imageView.getHeight() - imageView.getPaddingStart()) - imageView.getPaddingLeft());
        switch (ef.b.f4481a[aVar.ordinal()]) {
            case DSiCameraSource.FrontCamera /* 1 */:
                imageView.setScaleType(ImageView.ScaleType.FIT_XY);
                return;
            case 2:
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return;
            case 3:
                imageView.setScaleType(ImageView.ScaleType.MATRIX);
                if (width > f8) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    return;
                } else {
                    imageView.setScaleType(ImageView.ScaleType.FIT_START);
                    return;
                }
            case 4:
                if (width > f8) {
                    imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                    return;
                } else {
                    imageView.setScaleType(ImageView.ScaleType.FIT_END);
                    return;
                }
            case l1.c.f8511g /* 5 */:
                if (width > f8) {
                    Context context = imageView.getContext();
                    context.getClass();
                    if (context.getResources().getConfiguration().getLayoutDirection() == 0) {
                        scaleType = ImageView.ScaleType.FIT_START;
                    } else {
                        scaleType = ImageView.ScaleType.FIT_END;
                    }
                    imageView.setScaleType(scaleType);
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return;
            case l1.c.f8509e /* 6 */:
                if (width > f8) {
                    Context context2 = imageView.getContext();
                    context2.getClass();
                    if (context2.getResources().getConfiguration().getLayoutDirection() == 0) {
                        scaleType2 = ImageView.ScaleType.FIT_END;
                    } else {
                        scaleType2 = ImageView.ScaleType.FIT_START;
                    }
                    imageView.setScaleType(scaleType2);
                    return;
                }
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                return;
            default:
                m9.o.o();
                return;
        }
    }

    @Override // j0.u
    public CaptureResult l() {
        return (CaptureResult) this.L;
    }

    @Override // fj.f0
    public fj.e0 m() {
        return (ti.e) this.B;
    }

    @Override // j0.u
    public j0.r n() {
        Integer num = (Integer) ((CaptureResult) this.L).get(CaptureResult.CONTROL_AF_STATE);
        if (num == null) {
            return j0.r.UNKNOWN;
        }
        switch (num.intValue()) {
            case 0:
                return j0.r.INACTIVE;
            case DSiCameraSource.FrontCamera /* 1 */:
            case 3:
                return j0.r.SCANNING;
            case 2:
                return j0.r.PASSIVE_FOCUSED;
            case 4:
                return j0.r.LOCKED_FOCUSED;
            case l1.c.f8511g /* 5 */:
                return j0.r.LOCKED_NOT_FOCUSED;
            case l1.c.f8509e /* 6 */:
                return j0.r.PASSIVE_NOT_FOCUSED;
            default:
                aj.g.s("C2CameraCaptureResult", "Undefined af state: " + num);
                return j0.r.UNKNOWN;
        }
    }

    @Override // y3.s1
    public boolean o(Object obj, Object obj2) {
        y yVar = (y) this.B;
        return nc.k.a(yVar.b(obj), yVar.b(obj2));
    }

    public boolean p(long j2) {
        Object obj;
        List list = (List) ((a0) this.L).B;
        int size = list.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                obj = list.get(i2);
                if (v3.s.e(((v3.v) obj).f13708a, j2)) {
                    break;
                }
                i2++;
            } else {
                obj = null;
                break;
            }
        }
        v3.v vVar = (v3.v) obj;
        if (vVar == null) {
            return false;
        }
        return vVar.f13715h;
    }

    public q4.x q(List list) {
        q4.g gVar;
        Exception e6;
        long b10;
        q4.g gVar2;
        l4.q0 q0Var = null;
        try {
            int size = list.size();
            int i2 = 0;
            gVar = null;
            while (i2 < size) {
                try {
                    gVar2 = (q4.g) list.get(i2);
                } catch (Exception e10) {
                    e6 = e10;
                }
                try {
                    gVar2.a((com.google.android.material.datepicker.n) this.L);
                    i2++;
                    gVar = gVar2;
                } catch (Exception e11) {
                    e6 = e11;
                    gVar = gVar2;
                    StringBuilder sb2 = new StringBuilder();
                    StringBuilder sb3 = new StringBuilder("Error while applying EditCommand batch to buffer (length=");
                    sb3.append(((dk.a) ((com.google.android.material.datepicker.n) this.L).Y).b());
                    sb3.append(", composition=");
                    sb3.append(((com.google.android.material.datepicker.n) this.L).c());
                    sb3.append(", selection=");
                    com.google.android.material.datepicker.n nVar = (com.google.android.material.datepicker.n) this.L;
                    sb3.append((Object) l4.q0.h(l4.i0.b(nVar.B, nVar.L)));
                    sb3.append("):");
                    sb2.append(sb3.toString());
                    sb2.append('\n');
                    zb.l.X(list, sb2, new mh.z(17, gVar, this), 60);
                    throw new RuntimeException(sb2.toString(), e6);
                }
            }
            com.google.android.material.datepicker.n nVar2 = (com.google.android.material.datepicker.n) this.L;
            nVar2.getClass();
            l4.h hVar = new l4.h(((dk.a) nVar2.Y).toString());
            com.google.android.material.datepicker.n nVar3 = (com.google.android.material.datepicker.n) this.L;
            long b11 = l4.i0.b(nVar3.B, nVar3.L);
            l4.q0 q0Var2 = new l4.q0(b11);
            if (!l4.q0.g(((q4.x) this.B).f12277b)) {
                q0Var = q0Var2;
            }
            if (q0Var != null) {
                b10 = q0Var.f8885a;
            } else {
                b10 = l4.i0.b(l4.q0.e(b11), l4.q0.f(b11));
            }
            q4.x xVar = new q4.x(hVar, b10, ((com.google.android.material.datepicker.n) this.L).c());
            this.B = xVar;
            return xVar;
        } catch (Exception e12) {
            gVar = null;
            e6 = e12;
        }
    }

    public void r() {
        c1 c1Var = (c1) this.B;
        if (c1Var != null) {
            ((AtomicBoolean) c1Var.B).set(true);
            ((ScheduledFuture) c1Var.A).cancel(true);
        }
        this.B = null;
    }

    public int s(List list, l0.h hVar, CameraCaptureSession.CaptureCallback captureCallback) {
        return ((CameraCaptureSession) this.B).captureBurst(list, new a0.k(hVar, captureCallback), ((x.h) this.L).f14296a);
    }

    @Override // wc.k
    public wc.g toInstant() {
        throw new IllegalArgumentException(((String) this.B) + " when parsing an Instant from \"" + wc.j.n(64, (CharSequence) this.L) + '\"');
    }

    public String toString() {
        switch (this.A) {
            case 23:
                return ((HashMap) this.B).toString();
            default:
                return super.toString();
        }
    }

    public boolean u(x8.i iVar) {
        boolean containsKey;
        synchronized (this.L) {
            containsKey = ((m1) this.B).f798b.containsKey(iVar);
        }
        return containsKey;
    }

    public void v(y.s sVar) {
        CameraDevice cameraDevice = (CameraDevice) this.B;
        cameraDevice.getClass();
        y.r rVar = sVar.f14656a;
        rVar.c().getClass();
        List<y.h> d4 = rVar.d();
        if (d4 != null) {
            if (rVar.g() != null) {
                String id2 = cameraDevice.getId();
                for (y.h hVar : d4) {
                    String d10 = hVar.f14638a.d();
                    if (d10 != null && !d10.isEmpty()) {
                        aj.g.y0("CameraDeviceCompat", "Camera " + id2 + ": Camera doesn't support physicalCameraId " + d10 + ". Ignoring.");
                    }
                }
                x.f fVar = new x.f(rVar.g(), rVar.c());
                List<y.h> d11 = rVar.d();
                x.m mVar = (x.m) this.L;
                mVar.getClass();
                Handler handler = mVar.f14301a;
                y.g f8 = rVar.f();
                try {
                    if (f8 != null) {
                        InputConfiguration inputConfiguration = f8.f14637a.f14636a;
                        inputConfiguration.getClass();
                        cameraDevice.createReprocessableCaptureSessionByConfigurations(inputConfiguration, y.s.a(d11), fVar, handler);
                        return;
                    } else if (rVar.b() == 1) {
                        ArrayList arrayList = new ArrayList(d11.size());
                        for (y.h hVar2 : d11) {
                            arrayList.add(((OutputConfiguration) hVar2.f14638a.c()).getSurface());
                        }
                        cameraDevice.createConstrainedHighSpeedCaptureSession(arrayList, fVar, handler);
                        return;
                    } else {
                        cameraDevice.createCaptureSessionByOutputConfigurations(y.s.a(d11), fVar, handler);
                        return;
                    }
                } catch (CameraAccessException e6) {
                    throw new x.a(e6);
                }
            }
            a0.j.h("Invalid executor");
            return;
        }
        a0.j.h("Invalid output configurations");
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x0132, code lost:
        if (wa.i.g(r0[0]) != java.lang.String.class) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c1 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public wa.p w(bb.a r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 454
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p1.a0.w(bb.a, boolean):wa.p");
    }

    public CameraCharacteristics x(String str) {
        try {
            return ((CameraManager) this.B).getCameraCharacteristics(str);
        } catch (CameraAccessException e6) {
            throw new x.a(e6);
        }
    }

    public Set y() {
        return Collections.EMPTY_SET;
    }

    @Override // m0.c
    public void z(Throwable th2) {
        switch (this.A) {
            case 7:
                int i2 = ((r0.l) this.B).f12587f;
                if (i2 == 2 && (th2 instanceof CancellationException)) {
                    aj.g.o("SurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                } else {
                    aj.g.z0("SurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(p7.j.y(i2)), th2);
                    return;
                }
            case 11:
                int i10 = ((r0.l) this.B).f12587f;
                if (i10 == 2 && (th2 instanceof CancellationException)) {
                    aj.g.o("DualSurfaceProcessorNode", "Downstream VideoCapture failed to provide Surface.");
                    return;
                } else {
                    aj.g.z0("DualSurfaceProcessorNode", "Downstream node failed to provide Surface. Target: ".concat(p7.j.y(i10)), th2);
                    return;
                }
            default:
                throw new IllegalStateException("Future should never fail. Did it get completed by GC?", th2);
        }
    }

    public /* synthetic */ a0(Object obj, r0.l lVar, int i2) {
        this.A = i2;
        this.L = obj;
        this.B = lVar;
    }

    public a0(CameraCaptureSession cameraCaptureSession, x.h hVar) {
        this.A = 25;
        cameraCaptureSession.getClass();
        this.B = cameraCaptureSession;
        this.L = hVar;
    }

    /* JADX WARN: Type inference failed for: r4v1, types: [androidx.lifecycle.d0, java.lang.Object, androidx.lifecycle.f0] */
    public a0(j0.l0 l0Var) {
        this.A = 20;
        this.B = l0Var;
        ?? d0Var = new androidx.lifecycle.d0();
        this.L = d0Var;
        d0Var.i(new d0.e(d0.s.CLOSED, null));
    }

    public /* synthetic */ a0(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    public a0(CameraDevice cameraDevice, x.m mVar) {
        this.A = 26;
        cameraDevice.getClass();
        this.B = cameraDevice;
        this.L = mVar;
    }

    public a0(Context context, x.t tVar) {
        this.A = 27;
        this.B = (CameraManager) context.getSystemService("camera");
        this.L = tVar;
    }

    public a0(q8.d dVar, z8.a aVar) {
        this.A = 6;
        dVar.getClass();
        aVar.getClass();
        this.B = dVar;
        this.L = aVar;
    }

    public a0(m1 m1Var) {
        this.A = 5;
        this.B = m1Var;
        this.L = new Object();
    }

    public a0(y yVar) {
        this.A = 0;
        this.B = yVar;
        a1.d0 d0Var = a1.r0.f92a;
        this.L = new a1.d0();
    }

    public a0(e9.a aVar) {
        this.A = 13;
        ui.e eVar = (ui.e) aVar.f4417d;
        this.B = new ti.e(aVar, eVar.g().m(), -1L, true);
        this.L = new ti.f(aVar, eVar.g().j(), -1L, true);
    }

    public a0(l0.h hVar) {
        this.A = 22;
        this.L = new AtomicBoolean(true);
    }

    public a0(CardView cardView) {
        this.A = 29;
        this.L = cardView;
    }

    public a0(CharSequence charSequence, String str) {
        this.A = 24;
        charSequence.getClass();
        this.B = str;
        this.L = charSequence;
    }

    public a0(w.x xVar) {
        this.A = 19;
        this.L = xVar;
        this.B = null;
    }
}

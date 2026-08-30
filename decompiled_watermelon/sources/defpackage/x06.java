package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: x06  reason: default package */
/* loaded from: classes.dex */
public final class x06 extends w06 {
    /* JADX WARN: Type inference failed for: r0v4, types: [w06, x06] */
    public static x06 d(b57 b57Var, Size size) {
        if (((ng0) b57Var.d(b57.H, null)) != null) {
            ?? w06Var = new w06();
            size.getClass();
            d16 d16Var = (d16) b57Var.d(b57.F, null);
            ef4 ef4Var = ef4.L;
            ef4Var.getClass();
            int i = d16.a().g.c;
            ArrayList arrayList = w06Var.d;
            ArrayList arrayList2 = w06Var.c;
            vh0 vh0Var = w06Var.b;
            if (d16Var != null) {
                wh0 wh0Var = d16Var.g;
                i = wh0Var.c;
                for (CameraDevice.StateCallback stateCallback : d16Var.c) {
                    if (!arrayList2.contains(stateCallback)) {
                        arrayList2.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : d16Var.d) {
                    if (!arrayList.contains(stateCallback2)) {
                        arrayList.add(stateCallback2);
                    }
                }
                vh0Var.b(wh0Var.d);
                ef4Var = wh0Var.b;
            }
            vh0Var.getClass();
            vh0Var.e = x14.j(ef4Var);
            if (b57Var instanceof ot4) {
                Rational rational = pt4.a;
                if (((PreviewPixelHDRnetQuirk) oe1.a().b(PreviewPixelHDRnetQuirk.class)) != null && !b53.x(pt4.a, new Rational(size.getWidth(), size.getHeight()))) {
                    x14 f = x14.f();
                    CaptureRequest.Key key = CaptureRequest.TONEMAP_MODE;
                    key.getClass();
                    f.r(dt3.a0(key), 2);
                    vh0Var.d(new bq0(ef4.b(f)));
                }
            }
            new bq0(b57Var);
            Object d = b57Var.d(cb0.Y, Integer.valueOf(i));
            d.getClass();
            vh0Var.c = ((Number) d).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) b57Var.d(cb0.Z, null);
            if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
                arrayList2.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) b57Var.d(cb0.c0, null);
            if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
                arrayList.add(stateCallback4);
            }
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) b57Var.d(cb0.d0, null);
            if (captureCallback != null) {
                kg0 kg0Var = new kg0(captureCallback);
                vh0Var.c(kg0Var);
                ArrayList arrayList3 = w06Var.e;
                if (!arrayList3.contains(kg0Var)) {
                    arrayList3.add(kg0Var);
                }
            }
            int z = b57Var.z();
            if (z != 0) {
                vh0Var.getClass();
                if (z != 0) {
                    ((x14) vh0Var.e).r(b57.T, Integer.valueOf(z));
                }
            }
            int o = b57Var.o();
            if (o != 0) {
                vh0Var.getClass();
                if (o != 0) {
                    ((x14) vh0Var.e).r(b57.U, Integer.valueOf(o));
                }
            }
            x14 f2 = x14.f();
            uw uwVar = cb0.g0;
            String str = (String) b57Var.d(uwVar, null);
            if (str != null) {
                f2.r(uwVar, str);
            }
            uw uwVar2 = cb0.e0;
            Long l = (Long) b57Var.d(uwVar2, null);
            if (l != null) {
                f2.r(uwVar2, Long.valueOf(l.longValue()));
            }
            vh0Var.d(f2);
            bb0 bb0Var = new bb0(2);
            b57Var.k(new hi0(0, bb0Var, b57Var));
            vh0Var.d(new bq0(ef4.b(bb0Var.B)));
            return w06Var;
        }
        f81.A((String) b57Var.d(an6.z, b57Var.toString()), "Implementation is missing option unpacker for ");
        return null;
    }

    public final void a(cw0 cw0Var) {
        this.b.d(cw0Var);
    }

    public final void b(hc1 hc1Var, sm1 sm1Var, int i) {
        r9 a = hx.a(hc1Var);
        if (sm1Var != null) {
            a.e = sm1Var;
            a.c = Integer.valueOf(i);
            this.a.add(a.k());
            ((HashSet) this.b.d).add(hc1Var);
            return;
        }
        c44.i("Null dynamicRange");
    }

    public final d16 c() {
        return new d16(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.h(), this.f, this.g, this.h, this.i);
    }
}

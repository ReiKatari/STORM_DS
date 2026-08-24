package defpackage;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lc6  reason: default package */
/* loaded from: classes.dex */
public final class lc6 extends kc6 {
    /* JADX WARN: Type inference failed for: r0v4, types: [lc6, kc6] */
    public static lc6 d(zi7 zi7Var, Size size) {
        if (((wi0) zi7Var.b(zi7.I, null)) != null) {
            ?? kc6Var = new kc6();
            size.getClass();
            rc6 rc6Var = (rc6) zi7Var.b(zi7.G, null);
            go4 go4Var = go4.L;
            go4Var.getClass();
            int i = rc6.a().g.c;
            ArrayList arrayList = kc6Var.d;
            ArrayList arrayList2 = kc6Var.c;
            dk0 dk0Var = kc6Var.b;
            if (rc6Var != null) {
                ek0 ek0Var = rc6Var.g;
                i = ek0Var.c;
                for (CameraDevice.StateCallback stateCallback : rc6Var.c) {
                    if (!arrayList2.contains(stateCallback)) {
                        arrayList2.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : rc6Var.d) {
                    if (!arrayList.contains(stateCallback2)) {
                        arrayList.add(stateCallback2);
                    }
                }
                dk0Var.c(ek0Var.d);
                go4Var = ek0Var.b;
            }
            dk0Var.getClass();
            dk0Var.X = da4.k(go4Var);
            if (zi7Var instanceof q25) {
                Rational rational = r25.a;
                if (((PreviewPixelHDRnetQuirk) si1.a().b(PreviewPixelHDRnetQuirk.class)) != null && !nb3.k(r25.a, new Rational(size.getWidth(), size.getHeight()))) {
                    da4 d = da4.d();
                    CaptureRequest.Key key = CaptureRequest.TONEMAP_MODE;
                    key.getClass();
                    d.m(nw7.T(key), 2);
                    dk0Var.e(new os0(go4.a(d)));
                }
            }
            new os0(zi7Var);
            Object b = zi7Var.b(kd0.Y, Integer.valueOf(i));
            b.getClass();
            dk0Var.L = ((Number) b).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) zi7Var.b(kd0.Z, null);
            if (stateCallback3 != null && !arrayList2.contains(stateCallback3)) {
                arrayList2.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) zi7Var.b(kd0.d0, null);
            if (stateCallback4 != null && !arrayList.contains(stateCallback4)) {
                arrayList.add(stateCallback4);
            }
            CameraCaptureSession.CaptureCallback captureCallback = (CameraCaptureSession.CaptureCallback) zi7Var.b(kd0.e0, null);
            if (captureCallback != null) {
                ti0 ti0Var = new ti0(captureCallback);
                dk0Var.d(ti0Var);
                ArrayList arrayList3 = kc6Var.e;
                if (!arrayList3.contains(ti0Var)) {
                    arrayList3.add(ti0Var);
                }
            }
            int E = zi7Var.E();
            if (E != 0) {
                dk0Var.getClass();
                if (E != 0) {
                    ((da4) dk0Var.X).m(zi7.U, Integer.valueOf(E));
                }
            }
            int y = zi7Var.y();
            if (y != 0) {
                dk0Var.getClass();
                if (y != 0) {
                    ((da4) dk0Var.X).m(zi7.V, Integer.valueOf(y));
                }
            }
            da4 d2 = da4.d();
            xx xxVar = kd0.h0;
            String str = (String) zi7Var.b(xxVar, null);
            if (str != null) {
                d2.m(xxVar, str);
            }
            xx xxVar2 = kd0.f0;
            Long l = (Long) zi7Var.b(xxVar2, null);
            if (l != null) {
                d2.m(xxVar2, Long.valueOf(l.longValue()));
            }
            dk0Var.e(d2);
            jd0 jd0Var = new jd0(2);
            zi7Var.h(new pk0(0, jd0Var, zi7Var));
            dk0Var.e(new os0(go4.a(jd0Var.B)));
            return kc6Var;
        }
        e41.z((String) zi7Var.b(kz6.C, zi7Var.toString()), "Implementation is missing option unpacker for ");
        return null;
    }

    public final void a(yy0 yy0Var) {
        this.b.e(yy0Var);
    }

    public final void b(ig1 ig1Var, yq1 yq1Var, int i) {
        s9 a = wy.a(ig1Var);
        if (yq1Var != null) {
            a.e = yq1Var;
            a.c = Integer.valueOf(i);
            this.a.add(a.k());
            ((HashSet) this.b.R).add(ig1Var);
            return;
        }
        u34.x("Null dynamicRange");
    }

    public final rc6 c() {
        return new rc6(new ArrayList(this.a), new ArrayList(this.c), new ArrayList(this.d), new ArrayList(this.e), this.b.i(), this.f, this.g, this.h, this.i);
    }
}

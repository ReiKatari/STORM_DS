package j0;

import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CaptureRequest;
import android.util.Rational;
import android.util.Size;
import androidx.camera.camera2.internal.compat.quirk.PreviewPixelHDRnetQuirk;
import java.util.ArrayList;
import java.util.HashSet;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r1 extends q1 {
    /* JADX WARN: Type inference failed for: r0v4, types: [j0.q1, j0.r1] */
    public static r1 d(l2 l2Var, Size size) {
        if (((w.e0) l2Var.h(l2.E, null)) != null) {
            ?? q1Var = new q1();
            w1 w1Var = (w1) l2Var.h(l2.C, null);
            i1 i1Var = i1.L;
            int i2 = w1.a().f7322g.f7276c;
            if (w1Var != null) {
                i2 = w1Var.f7322g.f7276c;
                for (CameraDevice.StateCallback stateCallback : w1Var.f7318c) {
                    ArrayList arrayList = q1Var.f7283c;
                    if (!arrayList.contains(stateCallback)) {
                        arrayList.add(stateCallback);
                    }
                }
                for (CameraCaptureSession.StateCallback stateCallback2 : w1Var.f7319d) {
                    ArrayList arrayList2 = q1Var.f7284d;
                    if (!arrayList2.contains(stateCallback2)) {
                        arrayList2.add(stateCallback2);
                    }
                }
                q1Var.f7282b.d(w1Var.f7322g.f7277d);
                i1Var = w1Var.f7322g.f7275b;
            }
            d0.i1 i1Var2 = q1Var.f7282b;
            i1Var2.getClass();
            i1Var2.R = g1.c(i1Var);
            if (l2Var instanceof j1) {
                Rational rational = a0.h.f7a;
                if (((PreviewPixelHDRnetQuirk) z.a.f14847a.j(PreviewPixelHDRnetQuirk.class)) != null && !a0.h.f7a.equals(new Rational(size.getWidth(), size.getHeight()))) {
                    g1 b10 = g1.b();
                    b10.o(v.a.Z(CaptureRequest.TONEMAP_MODE), 2);
                    q1Var.f7282b.i(new a0.b(13, i1.a(b10)));
                }
            }
            q1Var.f7282b.A = ((Integer) l2Var.h(v.a.L, Integer.valueOf(i2))).intValue();
            CameraDevice.StateCallback stateCallback3 = (CameraDevice.StateCallback) l2Var.h(v.a.X, new CameraDevice.StateCallback());
            ArrayList arrayList3 = q1Var.f7283c;
            if (!arrayList3.contains(stateCallback3)) {
                arrayList3.add(stateCallback3);
            }
            CameraCaptureSession.StateCallback stateCallback4 = (CameraCaptureSession.StateCallback) l2Var.h(v.a.Y, new CameraCaptureSession.StateCallback());
            ArrayList arrayList4 = q1Var.f7284d;
            if (!arrayList4.contains(stateCallback4)) {
                arrayList4.add(stateCallback4);
            }
            w.l0 l0Var = new w.l0((CameraCaptureSession.CaptureCallback) l2Var.h(v.a.Z, new CameraCaptureSession.CaptureCallback()));
            q1Var.f7282b.g(l0Var);
            ArrayList arrayList5 = q1Var.f7285e;
            if (!arrayList5.contains(l0Var)) {
                arrayList5.add(l0Var);
            }
            g gVar = l2.P;
            Integer num = (Integer) l2Var.h(gVar, 0);
            int intValue = num.intValue();
            if (intValue != 0) {
                d0.i1 i1Var3 = q1Var.f7282b;
                i1Var3.getClass();
                if (intValue != 0) {
                    ((g1) i1Var3.R).o(gVar, num);
                }
            }
            int B = l2Var.B();
            if (B != 0) {
                d0.i1 i1Var4 = q1Var.f7282b;
                i1Var4.getClass();
                if (B != 0) {
                    ((g1) i1Var4.R).o(l2.O, Integer.valueOf(B));
                }
            }
            g1 b11 = g1.b();
            g gVar2 = v.a.f13571b0;
            b11.o(gVar2, (String) l2Var.h(gVar2, null));
            g gVar3 = v.a.R;
            Long l10 = (Long) l2Var.h(gVar3, -1L);
            l10.getClass();
            b11.o(gVar3, l10);
            q1Var.f7282b.i(b11);
            q1Var.f7282b.i(c0.f.c(l2Var).b());
            return q1Var;
        }
        a0.j.g((String) l2Var.h(n0.k.U, l2Var.toString()), "Implementation is missing option unpacker for ");
        return null;
    }

    public final void a(r0 r0Var) {
        this.f7282b.i(r0Var);
    }

    public final void b(u0 u0Var, d0.a0 a0Var, int i2) {
        a7.v a10 = i.a(u0Var);
        if (a0Var != null) {
            a10.X = a0Var;
            a10.L = Integer.valueOf(i2);
            this.f7281a.add(a10.h());
            ((HashSet) this.f7282b.L).add(u0Var);
            return;
        }
        m9.o.i("Null dynamicRange");
    }

    public final w1 c() {
        return new w1(new ArrayList(this.f7281a), new ArrayList(this.f7283c), new ArrayList(this.f7284d), new ArrayList(this.f7285e), this.f7282b.j(), this.f7286f, this.f7287g, this.f7288h, this.f7289i);
    }
}

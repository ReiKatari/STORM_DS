package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: wz3  reason: default package */
/* loaded from: classes.dex */
public final class wz3 implements gi7 {
    public final op6 a;
    public final kj7 b;
    public li7 c;
    public final boolean d;
    public boolean e;
    public final s94 f;
    public final AtomicInteger g;
    public tu0 h;
    public jg1 i;

    /* JADX WARN: Type inference failed for: r3v1, types: [qx3, s94] */
    public wz3(lg0 lg0Var, op6 op6Var, kj7 kj7Var, ou0 ou0Var) {
        boolean m0;
        op6Var.getClass();
        kj7Var.getClass();
        ou0Var.getClass();
        this.a = op6Var;
        this.b = kj7Var;
        boolean z = false;
        if (lg0Var != null) {
            lg0.g.getClass();
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
            key.getClass();
            int[] iArr = (int[]) ((qc0) lg0Var).c(key);
            if (iArr == null) {
                m0 = false;
            } else {
                m0 = fv.m0(iArr, 6);
            }
            if (m0) {
                z = true;
            }
        }
        this.d = z;
        this.f = new qx3(-1);
        this.g = new AtomicInteger(-1);
        if (z) {
            ou0Var.a(new vz3(this), kj7Var.e);
        }
    }

    public final void a(List list) {
        if (!this.d) {
            return;
        }
        if (list.isEmpty()) {
            this.i = u24.b(Boolean.FALSE);
        } else {
            this.i = hv.i(this.b.f, null, null, new m5((Object) this, list, (r41) null, 21), 3);
        }
    }

    @Override // defpackage.gi7
    public final void b(li7 li7Var) {
        this.c = li7Var;
        if (this.e) {
            if (li7Var != null) {
                d(true, false);
            } else {
                c(this.f, 0);
            }
        }
    }

    public final void c(s94 s94Var, int i) {
        if (this.g.getAndSet(i) != i) {
            if (nj2.x()) {
                s94Var.f(Integer.valueOf(i));
            } else {
                s94Var.g(Integer.valueOf(i));
            }
        }
    }

    public final tu0 d(boolean z, boolean z2) {
        if (kj2.F("CXCP")) {
            Log.d("CXCP", "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + z);
        }
        tu0 tu0Var = new tu0();
        if (!this.d) {
            tu0Var.v0(new IllegalStateException("Low Light Boost is not supported!"));
            return tu0Var;
        }
        hv.L(this.b.f, null, null, new t81((r41) null, this, tu0Var, z, z2), 3);
        return tu0Var;
    }

    @Override // defpackage.gi7
    public final void reset() {
        tu0 tu0Var = this.h;
        if (tu0Var != null) {
            i61.A("There is a new enableLowLightBoost being set", tu0Var);
        }
        this.h = null;
        d(false, true);
    }
}

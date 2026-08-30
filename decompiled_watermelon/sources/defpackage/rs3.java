package defpackage;

import android.hardware.camera2.CameraCharacteristics;
import android.util.Log;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rs3  reason: default package */
/* loaded from: classes.dex */
public final class rs3 implements i47 {
    public final zd6 a;
    public final n57 b;
    public n47 c;
    public final boolean d;
    public boolean e;
    public final m14 f;
    public final AtomicInteger g;
    public gs0 h;
    public ic1 i;

    /* JADX WARN: Type inference failed for: r3v1, types: [m14, pq3] */
    public rs3(ce0 ce0Var, zd6 zd6Var, n57 n57Var, bs0 bs0Var) {
        boolean Y;
        zd6Var.getClass();
        n57Var.getClass();
        bs0Var.getClass();
        this.a = zd6Var;
        this.b = n57Var;
        boolean z = false;
        if (ce0Var != null) {
            ce0.g.getClass();
            CameraCharacteristics.Key key = CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES;
            key.getClass();
            int[] iArr = (int[]) ((ia0) ce0Var).c(key);
            if (iArr == null) {
                Y = false;
            } else {
                Y = nu.Y(iArr, 6);
            }
            if (Y) {
                z = true;
            }
        }
        this.d = z;
        this.f = new pq3(-1);
        this.g = new AtomicInteger(-1);
        if (z) {
            bs0Var.a(new qs3(this), n57Var.e);
        }
    }

    public final void a(List list) {
        if (!this.d) {
            return;
        }
        if (list.isEmpty()) {
            this.i = a53.d(Boolean.FALSE);
        } else {
            this.i = tq5.e(this.b.f, null, null, new n5((Object) this, list, (j11) null, 18), 3);
        }
    }

    @Override // defpackage.i47
    public final void b(n47 n47Var) {
        this.c = n47Var;
        if (this.e) {
            if (n47Var != null) {
                d(true, false);
            } else {
                c(this.f, 0);
            }
        }
    }

    public final void c(m14 m14Var, int i) {
        if (this.g.getAndSet(i) != i) {
            if (nk2.M()) {
                m14Var.f(Integer.valueOf(i));
            } else {
                m14Var.g(Integer.valueOf(i));
            }
        }
    }

    public final gs0 d(boolean z, boolean z2) {
        if (ve2.D("CXCP")) {
            Log.d("CXCP", "LowLightBoostControl#setLowLightBoostAsync: lowLightBoost = " + z);
        }
        gs0 gs0Var = new gs0();
        if (!this.d) {
            gs0Var.v0(new IllegalStateException("Low Light Boost is not supported!"));
            return gs0Var;
        }
        tq5.w(this.b.f, null, null, new f51((j11) null, this, gs0Var, z, z2), 3);
        return gs0Var;
    }

    @Override // defpackage.i47
    public final void reset() {
        gs0 gs0Var = this.h;
        if (gs0Var != null) {
            b31.z("There is a new enableLowLightBoost being set", gs0Var);
        }
        this.h = null;
        d(false, true);
    }
}

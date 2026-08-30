package defpackage;

import java.util.Collections;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: w90  reason: default package */
/* loaded from: classes.dex */
public final class w90 implements ra5 {
    public final Object A = new Object();
    public final Object B = new Object();
    public bb0 L = new bb0(0);
    public gs0 R;
    public gs0 X;

    @Override // defpackage.ra5
    public final void K(gb5 gb5Var, long j, hh hhVar) {
        synchronized (this.B) {
            gs0 gs0Var = this.R;
            if (gs0Var != null) {
                if (b53.x(((im6) gb5Var.a(km6.a, im6.b)).a.get("Camera2CameraControl.tag"), Integer.valueOf(gs0Var.hashCode()))) {
                    gs0Var.c0(null);
                    this.R = null;
                    gs0 gs0Var2 = this.X;
                    if (gs0Var2 != null) {
                        gs0Var2.c0(null);
                        this.X = null;
                    }
                }
            }
        }
    }

    public final gs0 a(n47 n47Var, boolean z) {
        cb0 a;
        gs0 gs0Var = new gs0();
        synchronized (this.A) {
            a = this.L.a();
        }
        synchronized (this.B) {
            try {
                if (n47Var != null) {
                    gs0 gs0Var2 = this.R;
                    if (z) {
                        if (gs0Var2 != null) {
                            gs0Var2.v0(new Exception("Camera2CameraControl was updated with new options."));
                        }
                    } else if (gs0Var2 != null) {
                        l.K(gs0Var, gs0Var2);
                    }
                    this.R = gs0Var;
                    Map singletonMap = Collections.singletonMap("Camera2CameraControl.tag", Integer.valueOf(gs0Var.hashCode()));
                    singletonMap.getClass();
                    n47Var.h(a, singletonMap);
                } else {
                    gs0 gs0Var3 = this.X;
                    if (gs0Var3 != null) {
                        gs0Var3.v0(new Exception("Camera2CameraControl was updated with new options."));
                    }
                    this.X = gs0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return gs0Var;
    }
}

package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bh  reason: default package */
/* loaded from: classes.dex */
public final class bh extends CameraExtensionSession$StateCallback {
    public final cd a;
    public final t32 b;
    public final ab0 c;
    public final q03 d;
    public final di e;
    public final fw f;
    public final fw g;

    public bh(cd cdVar, t32 t32Var, l16 l16Var, ab0 ab0Var, q03 q03Var, di diVar) {
        ab0Var.getClass();
        this.a = cdVar;
        this.b = t32Var;
        this.c = ab0Var;
        this.d = q03Var;
        this.e = diVar;
        this.f = w81.g(l16Var);
        this.g = w81.g(null);
    }

    public final fd a(CameraExtensionSession cameraExtensionSession, ab0 ab0Var) {
        fd fdVar = (fd) this.g.a;
        if (fdVar != null) {
            return fdVar;
        }
        fd fdVar2 = new fd(this.a, cameraExtensionSession, ab0Var, this.e);
        if (this.g.a(null, fdVar2)) {
            return fdVar2;
        }
        Object obj = this.g.a;
        obj.getClass();
        return (fd) obj;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        ab0 ab0Var = this.c;
        a(cameraExtensionSession, ab0Var);
        fd a = a(cameraExtensionSession, ab0Var);
        t32 t32Var = this.b;
        t32Var.getClass();
        t32Var.a.h(a);
        l16 l16Var = (l16) this.f.b(null);
        if (l16Var != null) {
            l16Var.b();
        }
        t32Var.b();
        q03 q03Var = this.d;
        if (q03Var != null) {
            q03Var.q(this.a.L);
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        fd a = a(cameraExtensionSession, this.c);
        t32 t32Var = this.b;
        t32Var.getClass();
        t32Var.a.g(a);
        l16 l16Var = (l16) this.f.b(null);
        if (l16Var != null) {
            l16Var.b();
        }
        t32Var.b();
        q03 q03Var = this.d;
        if (q03Var != null) {
            q03Var.r(this.a.L);
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        fd a = a(cameraExtensionSession, this.c);
        t32 t32Var = this.b;
        t32Var.getClass();
        t32Var.a.f(a);
        l16 l16Var = (l16) this.f.b(null);
        if (l16Var != null) {
            l16Var.b();
        }
        q03 q03Var = this.d;
        if (q03Var != null) {
            q03Var.s(this.a.L);
        }
    }
}

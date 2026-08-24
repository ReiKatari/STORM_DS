package defpackage;

import android.hardware.camera2.CameraExtensionSession;
import android.hardware.camera2.CameraExtensionSession$StateCallback;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: nh  reason: default package */
/* loaded from: classes.dex */
public final class nh extends CameraExtensionSession$StateCallback {
    public final rd a;
    public final l82 b;
    public final id0 c;
    public final u63 d;
    public final pi e;
    public final xw f;
    public final xw g;

    public nh(rd rdVar, l82 l82Var, zc6 zc6Var, id0 id0Var, u63 u63Var, pi piVar) {
        id0Var.getClass();
        this.a = rdVar;
        this.b = l82Var;
        this.c = id0Var;
        this.d = u63Var;
        this.e = piVar;
        this.f = g04.u(zc6Var);
        this.g = g04.u(null);
    }

    public final td a(CameraExtensionSession cameraExtensionSession, id0 id0Var) {
        td tdVar = (td) this.g.a;
        if (tdVar != null) {
            return tdVar;
        }
        td tdVar2 = new td(this.a, cameraExtensionSession, id0Var, this.e);
        if (this.g.a(null, tdVar2)) {
            return tdVar2;
        }
        Object obj = this.g.a;
        obj.getClass();
        return (td) obj;
    }

    public final void onClosed(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        id0 id0Var = this.c;
        a(cameraExtensionSession, id0Var);
        td a = a(cameraExtensionSession, id0Var);
        l82 l82Var = this.b;
        l82Var.getClass();
        l82Var.a.d(a);
        zc6 zc6Var = (zc6) this.f.b(null);
        if (zc6Var != null) {
            zc6Var.a();
        }
        l82Var.a();
        u63 u63Var = this.d;
        if (u63Var != null) {
            u63Var.t(this.a.L);
        }
    }

    public final void onConfigureFailed(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        td a = a(cameraExtensionSession, this.c);
        l82 l82Var = this.b;
        l82Var.getClass();
        l82Var.a.h(a);
        zc6 zc6Var = (zc6) this.f.b(null);
        if (zc6Var != null) {
            zc6Var.a();
        }
        l82Var.a();
        u63 u63Var = this.d;
        if (u63Var != null) {
            u63Var.u(this.a.L);
        }
    }

    public final void onConfigured(CameraExtensionSession cameraExtensionSession) {
        cameraExtensionSession.getClass();
        td a = a(cameraExtensionSession, this.c);
        l82 l82Var = this.b;
        l82Var.getClass();
        l82Var.a.g(a);
        zc6 zc6Var = (zc6) this.f.b(null);
        if (zc6Var != null) {
            zc6Var.a();
        }
        u63 u63Var = this.d;
        if (u63Var != null) {
            u63Var.v(this.a.L);
        }
    }
}

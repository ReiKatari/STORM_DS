package defpackage;

import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g91  reason: default package */
/* loaded from: classes.dex */
public final class g91 implements DSiCameraSource {
    public final Map a;
    public final kd6 b;
    public final o41 c;
    public DSiCameraSource d;
    public nc1 e;

    public g91(Map map, kd6 kd6Var) {
        this.a = map;
        this.b = kd6Var;
        xe1 xe1Var = xk1.a;
        o41 i = g04.i(e04.a.Y);
        this.c = i;
        this.e = f91.t;
        hv.L(i, null, null, new a6(this, null, 13), 3);
    }

    public final void a() {
        DSiCameraSource dSiCameraSource;
        nc1 nc1Var = this.e;
        if ((nc1Var instanceof e91) && (dSiCameraSource = this.d) != null) {
            dSiCameraSource.stopCamera(((e91) nc1Var).t);
        }
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int i, byte[] bArr, int i2, int i3, boolean z) {
        bArr.getClass();
        DSiCameraSource dSiCameraSource = this.d;
        if (dSiCameraSource != null) {
            dSiCameraSource.captureFrame(i, bArr, i2, i3, z);
        }
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
        this.d = null;
        for (DSiCameraSource dSiCameraSource : this.a.values()) {
            dSiCameraSource.dispose();
        }
        g04.x(this.c, null);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
        return true;
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int i) {
        this.e = new e91(i);
        DSiCameraSource dSiCameraSource = this.d;
        if (dSiCameraSource != null) {
            dSiCameraSource.startCamera(i);
        }
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i) {
        this.e = f91.t;
        DSiCameraSource dSiCameraSource = this.d;
        if (dSiCameraSource != null) {
            dSiCameraSource.stopCamera(i);
        }
    }
}

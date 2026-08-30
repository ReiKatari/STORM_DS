package defpackage;

import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: s51  reason: default package */
/* loaded from: classes.dex */
public final class s51 implements DSiCameraSource {
    public final Map a;
    public final w16 b;
    public final g11 c;
    public DSiCameraSource d;
    public l e;

    public s51(Map map, w16 w16Var) {
        this.a = map;
        this.b = w16Var;
        bb1 bb1Var = tg1.a;
        g11 c = iq2.c(bt3.a.Y);
        this.c = c;
        this.e = r51.u;
        tq5.w(c, null, null, new a6(this, null, 13), 3);
    }

    public final void a() {
        DSiCameraSource dSiCameraSource;
        l lVar = this.e;
        if ((lVar instanceof q51) && (dSiCameraSource = this.d) != null) {
            dSiCameraSource.stopCamera(((q51) lVar).u);
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
        iq2.f(this.c, null);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
        return true;
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int i) {
        this.e = new q51(i);
        DSiCameraSource dSiCameraSource = this.d;
        if (dSiCameraSource != null) {
            dSiCameraSource.startCamera(i);
        }
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i) {
        this.e = r51.u;
        DSiCameraSource dSiCameraSource = this.d;
        if (dSiCameraSource != null) {
            dSiCameraSource.stopCamera(i);
        }
    }
}

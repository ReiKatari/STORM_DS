package defpackage;

import android.content.Context;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: we6  reason: default package */
/* loaded from: classes.dex */
public final class we6 implements DSiCameraSource {
    public final Context a;
    public final w16 b;
    public final p20 c;
    public final g11 d;
    public kd6 e;
    public final byte[] f;

    public we6(Context context, w16 w16Var, p20 p20Var) {
        this.a = context;
        this.b = w16Var;
        this.c = p20Var;
        bb1 bb1Var = tg1.a;
        ha1 ha1Var = ha1.L;
        mi6 c = hi2.c();
        ha1Var.getClass();
        this.d = iq2.c(se.O(ha1Var, c));
        this.f = new byte[614400];
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int i, byte[] bArr, int i2, int i3, boolean z) {
        bArr.getClass();
        byte[] bArr2 = this.f;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
        iq2.f(this.d, null);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
        return true;
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int i) {
        this.e = tq5.w(this.d, null, null, new ys3(this, null, 10), 3);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i) {
        kd6 kd6Var = this.e;
        if (kd6Var != null) {
            kd6Var.i(null);
        }
        this.e = null;
    }
}

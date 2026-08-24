package defpackage;

import android.content.Context;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lq6  reason: default package */
/* loaded from: classes.dex */
public final class lq6 implements DSiCameraSource {
    public final Context a;
    public final kd6 b;
    public final o40 c;
    public final o41 d;
    public ap6 e;
    public final byte[] f;

    public lq6(Context context, kd6 kd6Var, o40 o40Var) {
        this.a = context;
        this.b = kd6Var;
        this.c = o40Var;
        xe1 xe1Var = xk1.a;
        de1 de1Var = de1.L;
        gu6 c = oi2.c();
        de1Var.getClass();
        this.d = g04.i(jw2.y(de1Var, c));
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
        g04.x(this.d, null);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
        return true;
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int i) {
        this.e = hv.L(this.d, null, null, new ns3(this, null, 11), 3);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i) {
        ap6 ap6Var = this.e;
        if (ap6Var != null) {
            ap6Var.h(null);
        }
        this.e = null;
    }
}

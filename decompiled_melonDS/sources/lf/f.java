package lf;

import ah.h0;
import android.content.Context;
import me.magnum.melonds.common.camera.DSiCameraSource;
import zc.g0;
import zc.l1;
import zc.m1;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements DSiCameraSource {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9085a;

    /* renamed from: b  reason: collision with root package name */
    public final cf.d f9086b;

    /* renamed from: c  reason: collision with root package name */
    public final qf.a f9087c;

    /* renamed from: d  reason: collision with root package name */
    public final h0 f9088d;

    /* renamed from: e  reason: collision with root package name */
    public l1 f9089e;

    /* renamed from: f  reason: collision with root package name */
    public final byte[] f9090f;

    public f(Context context, cf.d dVar, qf.a aVar) {
        this.f9085a = context;
        this.f9086b = dVar;
        this.f9087c = aVar;
        gd.f fVar = g0.f15015a;
        gd.e eVar = gd.e.L;
        m1 c4 = x.c();
        eVar.getClass();
        this.f9088d = x.a(pc.a.G(eVar, c4));
        this.f9090f = new byte[614400];
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int i2, byte[] bArr, int i10, int i11, boolean z10) {
        bArr.getClass();
        byte[] bArr2 = this.f9090f;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
        x.f(this.f9088d, null);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
        return true;
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int i2) {
        this.f9089e = x.v(this.f9088d, null, null, new a9.b(22, null, this), 3);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i2) {
        l1 l1Var = this.f9089e;
        if (l1Var != null) {
            l1Var.i(null);
        }
        this.f9089e = null;
    }
}

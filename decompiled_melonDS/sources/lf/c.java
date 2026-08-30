package lf;

import ah.h0;
import ed.n;
import java.util.Map;
import me.magnum.melonds.common.camera.DSiCameraSource;
import zc.g0;
import zc.x;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements DSiCameraSource {

    /* renamed from: a  reason: collision with root package name */
    public final Map f9070a;

    /* renamed from: b  reason: collision with root package name */
    public final cf.d f9071b;

    /* renamed from: c  reason: collision with root package name */
    public final h0 f9072c;

    /* renamed from: d  reason: collision with root package name */
    public DSiCameraSource f9073d;

    /* renamed from: e  reason: collision with root package name */
    public ij.a f9074e;

    public c(Map map, cf.d dVar) {
        this.f9070a = map;
        this.f9071b = dVar;
        gd.f fVar = g0.f15015a;
        h0 a10 = x.a(n.f4465a.Y);
        this.f9072c = a10;
        this.f9074e = b.f9069e;
        x.v(a10, null, null, new a9.b(21, null, this), 3);
    }

    public final void a() {
        DSiCameraSource dSiCameraSource;
        ij.a aVar = this.f9074e;
        if ((aVar instanceof a) && (dSiCameraSource = this.f9073d) != null) {
            dSiCameraSource.stopCamera(((a) aVar).f9068e);
        }
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void captureFrame(int i2, byte[] bArr, int i10, int i11, boolean z10) {
        bArr.getClass();
        DSiCameraSource dSiCameraSource = this.f9073d;
        if (dSiCameraSource != null) {
            dSiCameraSource.captureFrame(i2, bArr, i10, i11, z10);
        }
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void dispose() {
        this.f9073d = null;
        for (DSiCameraSource dSiCameraSource : this.f9070a.values()) {
            dSiCameraSource.dispose();
        }
        x.f(this.f9072c, null);
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final boolean isAvailable() {
        return true;
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void startCamera(int i2) {
        this.f9074e = new a(i2);
        DSiCameraSource dSiCameraSource = this.f9073d;
        if (dSiCameraSource != null) {
            dSiCameraSource.startCamera(i2);
        }
    }

    @Override // me.magnum.melonds.common.camera.DSiCameraSource
    public final void stopCamera(int i2) {
        this.f9074e = b.f9069e;
        DSiCameraSource dSiCameraSource = this.f9073d;
        if (dSiCameraSource != null) {
            dSiCameraSource.stopCamera(i2);
        }
    }
}

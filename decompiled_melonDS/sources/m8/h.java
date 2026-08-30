package m8;

import a4.n;
import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.SurfaceTexture;
import android.view.Surface;
import d1.e2;
import java.util.concurrent.atomic.AtomicBoolean;
import me.magnum.melonds.common.camera.DSiCameraSource;
import r0.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements z5.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9347a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f9348b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ Object f9349c;

    public /* synthetic */ h(int i2, Object obj, Object obj2) {
        this.f9347a = i2;
        this.f9348b = obj;
        this.f9349c = obj2;
    }

    @Override // z5.a
    public final void accept(Object obj) {
        switch (this.f9347a) {
            case 0:
                j jVar = (j) this.f9348b;
                Activity activity = (Activity) this.f9349c;
                Configuration configuration = (Configuration) obj;
                n nVar = jVar.f9354e;
                if (nVar != null) {
                    nVar.B(activity, jVar.a(activity));
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                d0.j jVar2 = (d0.j) obj;
                ((Surface) this.f9348b).release();
                ((SurfaceTexture) this.f9349c).release();
                return;
            case 2:
                r0.d dVar = (r0.d) this.f9348b;
                m mVar = (m) this.f9349c;
                d0.i iVar = (d0.i) obj;
                mVar.close();
                Surface surface = (Surface) dVar.f12572h.remove(mVar);
                if (surface != null) {
                    e2 e2Var = dVar.f12565a;
                    t0.i.d((AtomicBoolean) e2Var.L, true);
                    t0.i.c((Thread) e2Var.X);
                    e2Var.n(surface, true);
                    return;
                }
                return;
            default:
                s0.e eVar = (s0.e) this.f9348b;
                m mVar2 = (m) this.f9349c;
                d0.i iVar2 = (d0.i) obj;
                mVar2.close();
                Surface surface2 = (Surface) eVar.f12801h.remove(mVar2);
                if (surface2 != null) {
                    s0.c cVar = eVar.f12794a;
                    t0.i.d((AtomicBoolean) cVar.L, true);
                    t0.i.c((Thread) cVar.X);
                    cVar.n(surface2, true);
                    return;
                }
                return;
        }
    }
}

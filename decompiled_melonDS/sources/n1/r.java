package n1;

import me.magnum.melonds.common.camera.DSiCameraSource;
import n2.c1;
import p1.i0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class r {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f9833a;

    /* renamed from: b  reason: collision with root package name */
    public final c1 f9834b;

    /* renamed from: c  reason: collision with root package name */
    public final c1 f9835c;

    /* renamed from: d  reason: collision with root package name */
    public boolean f9836d;

    /* renamed from: e  reason: collision with root package name */
    public Object f9837e;

    /* renamed from: f  reason: collision with root package name */
    public final i0 f9838f;

    public r(int i2, int i10, int i11) {
        this.f9833a = i11;
        switch (i11) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f9834b = new c1(i2);
                this.f9835c = new c1(i10);
                this.f9838f = new i0(i2, 90, 200);
                return;
            default:
                this.f9834b = new c1(i2);
                this.f9835c = new c1(i10);
                this.f9838f = new i0(i2, 30, 100);
                return;
        }
    }

    public final void a(int i2, int i10) {
        switch (this.f9833a) {
            case 0:
                if (i2 < 0.0f) {
                    k1.b.a("Index should be non-negative (" + i2 + ')');
                }
                this.f9834b.h(i2);
                this.f9838f.a(i2);
                this.f9835c.h(i10);
                return;
            default:
                if (i2 < 0.0f) {
                    k1.b.a("Index should be non-negative");
                }
                this.f9834b.h(i2);
                this.f9838f.a(i2);
                this.f9835c.h(i10);
                return;
        }
    }
}

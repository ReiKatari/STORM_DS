package sj;

import me.magnum.melonds.common.camera.DSiCameraSource;
import vj.v;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends xj.a {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f12967a;

    /* renamed from: b  reason: collision with root package name */
    public final vj.a f12968b;

    /* JADX WARN: Type inference failed for: r2v1, types: [vj.a, v8.e] */
    public f(int i2) {
        this.f12967a = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                this.f12968b = new v8.e();
                return;
            default:
                this.f12968b = new vj.i(1);
                return;
        }
    }

    @Override // xj.a
    public void a(CharSequence charSequence) {
        int i2 = this.f12967a;
    }

    @Override // xj.a
    public boolean b(vj.a aVar) {
        switch (this.f12967a) {
            case 0:
                return true;
            default:
                return super.b(aVar);
        }
    }

    @Override // xj.a
    public final vj.a d() {
        switch (this.f12967a) {
            case 0:
                return (vj.i) this.f12968b;
            default:
                return (v) this.f12968b;
        }
    }

    @Override // xj.a
    public boolean e() {
        switch (this.f12967a) {
            case 0:
                return true;
            default:
                return super.e();
        }
    }

    @Override // xj.a
    public final a g(g gVar) {
        switch (this.f12967a) {
            case 0:
                return a.a(gVar.f12972b);
            default:
                return null;
        }
    }

    private final void h(CharSequence charSequence) {
    }
}

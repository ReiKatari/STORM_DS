package gk;

import java.util.Objects;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends y0 {

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ int f5720d;

    /* renamed from: e  reason: collision with root package name */
    public final String f5721e;

    /* renamed from: f  reason: collision with root package name */
    public final b f5722f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f5723g;

    public d0(String str, int i2, boolean z10) {
        this.f5720d = i2;
        switch (i2) {
            case DSiCameraSource.FrontCamera /* 1 */:
                b bVar = b.B;
                Objects.requireNonNull(str, "name == null");
                this.f5721e = str;
                this.f5722f = bVar;
                this.f5723g = z10;
                return;
            case 2:
                b bVar2 = b.B;
                Objects.requireNonNull(str, "name == null");
                this.f5721e = str;
                this.f5722f = bVar2;
                this.f5723g = z10;
                return;
            default:
                b bVar3 = b.B;
                Objects.requireNonNull(str, "name == null");
                this.f5721e = str;
                this.f5722f = bVar3;
                this.f5723g = z10;
                return;
        }
    }

    @Override // gk.y0
    public final void a(o0 o0Var, Object obj) {
        switch (this.f5720d) {
            case 0:
                if (obj != null) {
                    this.f5722f.getClass();
                    String obj2 = obj.toString();
                    if (obj2 != null) {
                        o0Var.a(this.f5721e, obj2, this.f5723g);
                        return;
                    }
                    return;
                }
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                if (obj != null) {
                    this.f5722f.getClass();
                    String obj3 = obj.toString();
                    if (obj3 != null) {
                        o0Var.b(this.f5721e, obj3, this.f5723g);
                        return;
                    }
                    return;
                }
                return;
            default:
                if (obj != null) {
                    this.f5722f.getClass();
                    String obj4 = obj.toString();
                    if (obj4 != null) {
                        o0Var.d(this.f5721e, obj4, this.f5723g);
                        return;
                    }
                    return;
                }
                return;
        }
    }
}

package a5;

import android.view.ActionMode;
import b4.u1;
import f2.b1;
import me.magnum.melonds.R;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class a implements n2.g0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f379a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ Object f380b;

    public /* synthetic */ a(int i2, Object obj) {
        this.f379a = i2;
        this.f380b = obj;
    }

    @Override // n2.g0
    public final void dispose() {
        switch (this.f379a) {
            case 0:
                i0 i0Var = (i0) this.f380b;
                i0Var.dismiss();
                i0Var.f401b0.c();
                return;
            case DSiCameraSource.FrontCamera /* 1 */:
                m0 m0Var = (m0) this.f380b;
                m0Var.c();
                m0Var.setTag(R.id.view_tree_lifecycle_owner, null);
                m0Var.f410l0.removeViewImmediate(m0Var);
                return;
            case 2:
                b2.b bVar = (b2.b) ((b2.d) this.f380b).f1747c.getValue();
                if (bVar != null) {
                    bVar.close();
                    return;
                }
                return;
            case 3:
                ((u1) this.f380b).B.b();
                return;
            case 4:
                h.g gVar = ((e.a) this.f380b).f4131a;
                if (gVar != null) {
                    gVar.b();
                    return;
                } else {
                    a0.j.p("Launcher has not been initialized");
                    return;
                }
            case l1.c.f8511g /* 5 */:
                ((mc.a) ((a4.n) this.f380b).B).b();
                return;
            case l1.c.f8509e /* 6 */:
                og.h hVar = (og.h) this.f380b;
                hVar.c();
                hVar.f11000f0.removeView(hVar);
                return;
            case 7:
                ((p1.x) this.f380b).f11284d = null;
                return;
            case 8:
                p1.o0 o0Var = (p1.o0) this.f380b;
                e9.a aVar = o0Var.f11240c;
                if (aVar != null) {
                    aVar.f4414a = false;
                }
                o0Var.f11240c = null;
                return;
            case l1.c.f8508d /* 9 */:
                ((p1.j0) this.f380b).f11224f = true;
                return;
            case l1.c.f8510f /* 10 */:
                ((b1) this.f380b).o();
                return;
            default:
                z1.f fVar = (z1.f) this.f380b;
                z2.u uVar = fVar.f14871e;
                ah.e eVar = uVar.f14952h;
                if (eVar != null) {
                    eVar.f();
                }
                uVar.a();
                ActionMode actionMode = fVar.f14874h;
                if (actionMode != null) {
                    actionMode.finish();
                }
                fVar.f14874h = null;
                return;
        }
    }
}

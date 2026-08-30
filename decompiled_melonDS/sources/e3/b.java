package e3;

import a4.l;
import a4.p2;
import android.view.DragEvent;
import android.view.View;
import b3.o;
import d2.t;
import me.magnum.melonds.common.camera.DSiCameraSource;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b implements View.OnDragListener, c {

    /* renamed from: a  reason: collision with root package name */
    public final f f4251a;

    /* renamed from: b  reason: collision with root package name */
    public final a1.f f4252b;

    /* renamed from: c  reason: collision with root package name */
    public final a f4253c;

    /* JADX WARN: Type inference failed for: r0v0, types: [e3.f, b3.o] */
    public b() {
        ?? oVar = new o();
        oVar.f4257k0 = 0L;
        this.f4251a = oVar;
        this.f4252b = new a1.f(0);
        this.f4253c = new a(this);
    }

    /* JADX WARN: Type inference failed for: r6v2, types: [nc.p, java.lang.Object] */
    @Override // android.view.View.OnDragListener
    public final boolean onDrag(View view, DragEvent dragEvent) {
        t tVar = new t(1, dragEvent);
        int action = dragEvent.getAction();
        a1.f fVar = this.f4252b;
        f fVar2 = this.f4251a;
        switch (action) {
            case DSiCameraSource.FrontCamera /* 1 */:
                ?? obj = new Object();
                e eVar = new e(tVar, fVar2, obj);
                if (eVar.k(fVar2) == p2.ContinueTraversal) {
                    l.z(fVar2, eVar);
                }
                boolean z10 = obj.A;
                fVar.getClass();
                a1.a aVar = new a1.a(fVar);
                while (aVar.hasNext()) {
                    ((f) aVar.next()).S0();
                }
                return z10;
            case 2:
                fVar2.R0(tVar);
                return false;
            case 3:
                return fVar2.O0();
            case 4:
                a4.a aVar2 = new a4.a(12, tVar);
                if (aVar2.k(fVar2) == p2.ContinueTraversal) {
                    l.z(fVar2, aVar2);
                }
                fVar.clear();
                return false;
            case l1.c.f8511g /* 5 */:
                fVar2.P0();
                return false;
            case l1.c.f8509e /* 6 */:
                fVar2.Q0();
                return false;
            default:
                return false;
        }
    }
}

package p;

import android.view.View;
import androidx.appcompat.view.menu.ActionMenuItemView;
import me.magnum.melonds.common.camera.DSiCameraSource;
import q.u1;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class b extends u1 {

    /* renamed from: d0  reason: collision with root package name */
    public final /* synthetic */ int f11072d0 = 0;

    /* renamed from: e0  reason: collision with root package name */
    public final /* synthetic */ View f11073e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ActionMenuItemView actionMenuItemView) {
        super(actionMenuItemView);
        this.f11073e0 = actionMenuItemView;
    }

    @Override // q.u1
    public final b0 b() {
        q.f fVar;
        switch (this.f11072d0) {
            case 0:
                c cVar = ((ActionMenuItemView) this.f11073e0).f885j0;
                if (cVar != null && (fVar = ((q.g) cVar).f11904a.f11925n0) != null) {
                    return fVar.a();
                }
                return null;
            default:
                q.f fVar2 = ((q.i) this.f11073e0).R.f11924m0;
                if (fVar2 == null) {
                    return null;
                }
                return fVar2.a();
        }
    }

    @Override // q.u1
    public final boolean c() {
        b0 b10;
        switch (this.f11072d0) {
            case 0:
                ActionMenuItemView actionMenuItemView = (ActionMenuItemView) this.f11073e0;
                k kVar = actionMenuItemView.f883h0;
                if (kVar != null && kVar.c(actionMenuItemView.f880e0) && (b10 = b()) != null && b10.b()) {
                    return true;
                }
                return false;
            default:
                ((q.i) this.f11073e0).R.l();
                return true;
        }
    }

    @Override // q.u1
    public boolean d() {
        switch (this.f11072d0) {
            case DSiCameraSource.FrontCamera /* 1 */:
                q.j jVar = ((q.i) this.f11073e0).R;
                if (jVar.f11926o0 != null) {
                    return false;
                }
                jVar.c();
                return true;
            default:
                return super.d();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(q.i iVar, q.i iVar2) {
        super(iVar2);
        this.f11073e0 = iVar;
    }
}

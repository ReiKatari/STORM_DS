package q;

import android.content.Context;
import android.view.View;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f extends p.v {

    /* renamed from: l  reason: collision with root package name */
    public final /* synthetic */ int f11901l = 0;
    public final /* synthetic */ j m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, p.d0 d0Var, View view) {
        super(context, d0Var, view, false, R.attr.actionOverflowMenuStyle, 0);
        this.m = jVar;
        if ((d0Var.A.f11155x & 32) != 32) {
            View view2 = jVar.f11914c0;
            this.f11168e = view2 == null ? (View) jVar.f11913b0 : view2;
        }
        l.i0 i0Var = jVar.f11927q0;
        this.f11171h = i0Var;
        p.t tVar = this.f11172i;
        if (tVar != null) {
            tVar.j(i0Var);
        }
    }

    @Override // p.v
    public final void c() {
        switch (this.f11901l) {
            case 0:
                this.m.f11925n0 = null;
                super.c();
                return;
            default:
                j jVar = this.m;
                p.l lVar = jVar.L;
                if (lVar != null) {
                    lVar.c(true);
                }
                jVar.f11924m0 = null;
                super.c();
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(j jVar, Context context, p.l lVar, View view) {
        super(context, lVar, view, true, R.attr.actionOverflowMenuStyle, 0);
        this.m = jVar;
        this.f11169f = 8388613;
        l.i0 i0Var = jVar.f11927q0;
        this.f11171h = i0Var;
        p.t tVar = this.f11172i;
        if (tVar != null) {
            tVar.j(i0Var);
        }
    }
}

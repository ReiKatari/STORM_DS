package p;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class h implements x, AdapterView.OnItemClickListener {
    public Context A;
    public LayoutInflater B;
    public l L;
    public ExpandedMenuView R;
    public w X;
    public g Y;

    public h(ContextWrapper contextWrapper) {
        this.A = contextWrapper;
        this.B = LayoutInflater.from(contextWrapper);
    }

    @Override // p.x
    public final void a(l lVar, boolean z10) {
        w wVar = this.X;
        if (wVar != null) {
            wVar.a(lVar, z10);
        }
    }

    @Override // p.x
    public final void d() {
        g gVar = this.Y;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, p.w, java.lang.Object, android.content.DialogInterface$OnDismissListener, p.m] */
    @Override // p.x
    public final boolean f(d0 d0Var) {
        boolean hasVisibleItems = d0Var.hasVisibleItems();
        Context context = d0Var.f11110a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.A = d0Var;
        bk.a aVar = new bk.a(context);
        l.d dVar = (l.d) aVar.L;
        h hVar = new h(dVar.f8356a);
        obj.L = hVar;
        hVar.X = obj;
        d0Var.b(hVar, context);
        h hVar2 = obj.L;
        if (hVar2.Y == null) {
            hVar2.Y = new g(hVar2);
        }
        dVar.f8372r = hVar2.Y;
        dVar.f8373s = obj;
        View view = d0Var.f11123o;
        if (view != null) {
            dVar.f8360e = view;
        } else {
            dVar.f8358c = d0Var.f11122n;
            dVar.f8359d = d0Var.m;
        }
        dVar.f8370p = obj;
        l.g i2 = aVar.i();
        obj.B = i2;
        i2.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.B.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.B.show();
        w wVar = this.X;
        if (wVar != null) {
            wVar.l(d0Var);
            return true;
        }
        return true;
    }

    @Override // p.x
    public final void g(Context context, l lVar) {
        if (this.A != null) {
            this.A = context;
            if (this.B == null) {
                this.B = LayoutInflater.from(context);
            }
        }
        this.L = lVar;
        g gVar = this.Y;
        if (gVar != null) {
            gVar.notifyDataSetChanged();
        }
    }

    @Override // p.x
    public final boolean h(n nVar) {
        return false;
    }

    @Override // p.x
    public final boolean i() {
        return false;
    }

    @Override // p.x
    public final void j(w wVar) {
        throw null;
    }

    @Override // p.x
    public final boolean k(n nVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i2, long j2) {
        this.L.q(this.Y.getItem(i2), this, 0);
    }
}

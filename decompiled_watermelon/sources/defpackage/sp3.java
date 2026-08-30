package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: sp3  reason: default package */
/* loaded from: classes.dex */
public final class sp3 implements mx3, AdapterView.OnItemClickListener {
    public Context A;
    public LayoutInflater B;
    public uw3 L;
    public ExpandedMenuView R;
    public lx3 X;
    public rp3 Y;

    public sp3(ContextWrapper contextWrapper) {
        this.A = contextWrapper;
        this.B = LayoutInflater.from(contextWrapper);
    }

    @Override // defpackage.mx3
    public final boolean b(zw3 zw3Var) {
        return false;
    }

    @Override // defpackage.mx3
    public final void d(lx3 lx3Var) {
        throw null;
    }

    @Override // defpackage.mx3
    public final boolean e(zw3 zw3Var) {
        return false;
    }

    @Override // defpackage.mx3
    public final void f(uw3 uw3Var, boolean z) {
        lx3 lx3Var = this.X;
        if (lx3Var != null) {
            lx3Var.f(uw3Var, z);
        }
    }

    @Override // defpackage.mx3
    public final void g() {
        rp3 rp3Var = this.Y;
        if (rp3Var != null) {
            rp3Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.mx3
    public final void i(Context context, uw3 uw3Var) {
        if (this.A != null) {
            this.A = context;
            if (this.B == null) {
                this.B = LayoutInflater.from(context);
            }
        }
        this.L = uw3Var;
        rp3 rp3Var = this.Y;
        if (rp3Var != null) {
            rp3Var.notifyDataSetChanged();
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.content.DialogInterface$OnClickListener, ww3, lx3, java.lang.Object, android.content.DialogInterface$OnDismissListener] */
    @Override // defpackage.mx3
    public final boolean j(rh6 rh6Var) {
        boolean hasVisibleItems = rh6Var.hasVisibleItems();
        Context context = rh6Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.A = rh6Var;
        sb sbVar = new sb(context);
        pb pbVar = (pb) sbVar.L;
        sp3 sp3Var = new sp3(pbVar.a);
        obj.L = sp3Var;
        sp3Var.X = obj;
        rh6Var.b(sp3Var, context);
        sp3 sp3Var2 = obj.L;
        if (sp3Var2.Y == null) {
            sp3Var2.Y = new rp3(sp3Var2);
        }
        pbVar.r = sp3Var2.Y;
        pbVar.s = obj;
        View view = rh6Var.o;
        if (view != null) {
            pbVar.e = view;
        } else {
            pbVar.c = rh6Var.n;
            pbVar.d = rh6Var.m;
        }
        pbVar.p = obj;
        tb l = sbVar.l();
        obj.B = l;
        l.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.B.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.B.show();
        lx3 lx3Var = this.X;
        if (lx3Var != null) {
            lx3Var.M(rh6Var);
            return true;
        }
        return true;
    }

    @Override // defpackage.mx3
    public final boolean k() {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.L.q(this.Y.getItem(i), this, 0);
    }
}

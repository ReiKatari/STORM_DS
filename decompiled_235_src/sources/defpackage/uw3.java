package defpackage;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: uw3  reason: default package */
/* loaded from: classes.dex */
public final class uw3 implements b54, AdapterView.OnItemClickListener {
    public Context A;
    public LayoutInflater B;
    public i44 L;
    public ExpandedMenuView R;
    public a54 X;
    public tw3 Y;

    public uw3(ContextWrapper contextWrapper) {
        this.A = contextWrapper;
        this.B = LayoutInflater.from(contextWrapper);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [a54, android.content.DialogInterface$OnClickListener, java.lang.Object, k44, android.content.DialogInterface$OnDismissListener] */
    @Override // defpackage.b54
    public final boolean b(it6 it6Var) {
        boolean hasVisibleItems = it6Var.hasVisibleItems();
        Context context = it6Var.a;
        if (!hasVisibleItems) {
            return false;
        }
        ?? obj = new Object();
        obj.A = it6Var;
        zb zbVar = new zb(context);
        wb wbVar = (wb) zbVar.L;
        uw3 uw3Var = new uw3(wbVar.a);
        obj.L = uw3Var;
        uw3Var.X = obj;
        it6Var.b(uw3Var, context);
        uw3 uw3Var2 = obj.L;
        if (uw3Var2.Y == null) {
            uw3Var2.Y = new tw3(uw3Var2);
        }
        wbVar.r = uw3Var2.Y;
        wbVar.s = obj;
        View view = it6Var.o;
        if (view != null) {
            wbVar.e = view;
        } else {
            wbVar.c = it6Var.n;
            wbVar.d = it6Var.m;
        }
        wbVar.p = obj;
        ac l = zbVar.l();
        obj.B = l;
        l.setOnDismissListener(obj);
        WindowManager.LayoutParams attributes = obj.B.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        obj.B.show();
        a54 a54Var = this.X;
        if (a54Var != null) {
            a54Var.M(it6Var);
            return true;
        }
        return true;
    }

    @Override // defpackage.b54
    public final boolean c() {
        return false;
    }

    @Override // defpackage.b54
    public final void d(i44 i44Var, boolean z) {
        a54 a54Var = this.X;
        if (a54Var != null) {
            a54Var.d(i44Var, z);
        }
    }

    @Override // defpackage.b54
    public final boolean f(o44 o44Var) {
        return false;
    }

    @Override // defpackage.b54
    public final void g(a54 a54Var) {
        throw null;
    }

    @Override // defpackage.b54
    public final boolean h(o44 o44Var) {
        return false;
    }

    @Override // defpackage.b54
    public final void i() {
        tw3 tw3Var = this.Y;
        if (tw3Var != null) {
            tw3Var.notifyDataSetChanged();
        }
    }

    @Override // defpackage.b54
    public final void k(Context context, i44 i44Var) {
        if (this.A != null) {
            this.A = context;
            if (this.B == null) {
                this.B = LayoutInflater.from(context);
            }
        }
        this.L = i44Var;
        tw3 tw3Var = this.Y;
        if (tw3Var != null) {
            tw3Var.notifyDataSetChanged();
        }
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        this.L.q(this.Y.getItem(i), this, 0);
    }
}

package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: f44  reason: default package */
/* loaded from: classes.dex */
public final class f44 extends BaseAdapter {
    public final i44 A;
    public int B = -1;
    public boolean L;
    public final boolean R;
    public final LayoutInflater X;
    public final int Y;

    public f44(i44 i44Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.R = z;
        this.X = layoutInflater;
        this.A = i44Var;
        this.Y = i;
        a();
    }

    public final void a() {
        i44 i44Var = this.A;
        o44 o44Var = i44Var.v;
        if (o44Var != null) {
            i44Var.i();
            ArrayList arrayList = i44Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o44) arrayList.get(i)) == o44Var) {
                    this.B = i;
                    return;
                }
            }
        }
        this.B = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final o44 getItem(int i) {
        ArrayList l;
        boolean z = this.R;
        i44 i44Var = this.A;
        if (z) {
            i44Var.i();
            l = i44Var.j;
        } else {
            l = i44Var.l();
        }
        int i2 = this.B;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (o44) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.R;
        i44 i44Var = this.A;
        if (z) {
            i44Var.i();
            l = i44Var.j;
        } else {
            l = i44Var.l();
        }
        if (this.B < 0) {
            return l.size();
        }
        return l.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        boolean z = false;
        if (view == null) {
            view = this.X.inflate(this.Y, viewGroup, false);
        }
        int i3 = getItem(i).b;
        int i4 = i - 1;
        if (i4 >= 0) {
            i2 = getItem(i4).b;
        } else {
            i2 = i3;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.A.m() && i3 != i2) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        c54 c54Var = (c54) view;
        if (this.L) {
            listMenuItemView.setForceShowIcon(true);
        }
        c54Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

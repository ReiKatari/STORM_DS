package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rw3  reason: default package */
/* loaded from: classes.dex */
public final class rw3 extends BaseAdapter {
    public final uw3 A;
    public int B = -1;
    public boolean L;
    public final boolean R;
    public final LayoutInflater X;
    public final int Y;

    public rw3(uw3 uw3Var, LayoutInflater layoutInflater, boolean z, int i) {
        this.R = z;
        this.X = layoutInflater;
        this.A = uw3Var;
        this.Y = i;
        a();
    }

    public final void a() {
        uw3 uw3Var = this.A;
        zw3 zw3Var = uw3Var.v;
        if (zw3Var != null) {
            uw3Var.i();
            ArrayList arrayList = uw3Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((zw3) arrayList.get(i)) == zw3Var) {
                    this.B = i;
                    return;
                }
            }
        }
        this.B = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final zw3 getItem(int i) {
        ArrayList l;
        boolean z = this.R;
        uw3 uw3Var = this.A;
        if (z) {
            uw3Var.i();
            l = uw3Var.j;
        } else {
            l = uw3Var.l();
        }
        int i2 = this.B;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (zw3) l.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l;
        boolean z = this.R;
        uw3 uw3Var = this.A;
        if (z) {
            uw3Var.i();
            l = uw3Var.j;
        } else {
            l = uw3Var.l();
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
        nx3 nx3Var = (nx3) view;
        if (this.L) {
            listMenuItemView.setForceShowIcon(true);
        }
        nx3Var.c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

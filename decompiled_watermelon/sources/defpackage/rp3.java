package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rp3  reason: default package */
/* loaded from: classes.dex */
public final class rp3 extends BaseAdapter {
    public int A = -1;
    public final /* synthetic */ sp3 B;

    public rp3(sp3 sp3Var) {
        this.B = sp3Var;
        a();
    }

    public final void a() {
        uw3 uw3Var = this.B.L;
        zw3 zw3Var = uw3Var.v;
        if (zw3Var != null) {
            uw3Var.i();
            ArrayList arrayList = uw3Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((zw3) arrayList.get(i)) == zw3Var) {
                    this.A = i;
                    return;
                }
            }
        }
        this.A = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final zw3 getItem(int i) {
        sp3 sp3Var = this.B;
        uw3 uw3Var = sp3Var.L;
        uw3Var.i();
        ArrayList arrayList = uw3Var.j;
        sp3Var.getClass();
        int i2 = this.A;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (zw3) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        sp3 sp3Var = this.B;
        uw3 uw3Var = sp3Var.L;
        uw3Var.i();
        int size = uw3Var.j.size();
        sp3Var.getClass();
        if (this.A < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.B.B.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((nx3) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

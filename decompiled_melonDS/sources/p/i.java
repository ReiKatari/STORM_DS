package p;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i extends BaseAdapter {
    public final l A;
    public int B = -1;
    public boolean L;
    public final boolean R;
    public final LayoutInflater X;
    public final int Y;

    public i(l lVar, LayoutInflater layoutInflater, boolean z10, int i2) {
        this.R = z10;
        this.X = layoutInflater;
        this.A = lVar;
        this.Y = i2;
        a();
    }

    public final void a() {
        l lVar = this.A;
        n nVar = lVar.f11130v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f11119j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((n) arrayList.get(i2)) == nVar) {
                    this.B = i2;
                    return;
                }
            }
        }
        this.B = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final n getItem(int i2) {
        ArrayList l10;
        boolean z10 = this.R;
        l lVar = this.A;
        if (z10) {
            lVar.i();
            l10 = lVar.f11119j;
        } else {
            l10 = lVar.l();
        }
        int i10 = this.B;
        if (i10 >= 0 && i2 >= i10) {
            i2++;
        }
        return (n) l10.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList l10;
        boolean z10 = this.R;
        l lVar = this.A;
        if (z10) {
            lVar.i();
            l10 = lVar.f11119j;
        } else {
            l10 = lVar.l();
        }
        if (this.B < 0) {
            return l10.size();
        }
        return l10.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        int i10;
        boolean z10 = false;
        if (view == null) {
            view = this.X.inflate(this.Y, viewGroup, false);
        }
        int i11 = getItem(i2).f11134b;
        int i12 = i2 - 1;
        if (i12 >= 0) {
            i10 = getItem(i12).f11134b;
        } else {
            i10 = i11;
        }
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.A.m() && i11 != i10) {
            z10 = true;
        }
        listMenuItemView.setGroupDividerEnabled(z10);
        y yVar = (y) view;
        if (this.L) {
            listMenuItemView.setForceShowIcon(true);
        }
        yVar.b(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

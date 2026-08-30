package p;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class g extends BaseAdapter {
    public int A = -1;
    public final /* synthetic */ h B;

    public g(h hVar) {
        this.B = hVar;
        a();
    }

    public final void a() {
        l lVar = this.B.L;
        n nVar = lVar.f11130v;
        if (nVar != null) {
            lVar.i();
            ArrayList arrayList = lVar.f11119j;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                if (((n) arrayList.get(i2)) == nVar) {
                    this.A = i2;
                    return;
                }
            }
        }
        this.A = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final n getItem(int i2) {
        h hVar = this.B;
        l lVar = hVar.L;
        lVar.i();
        ArrayList arrayList = lVar.f11119j;
        hVar.getClass();
        int i10 = this.A;
        if (i10 >= 0 && i2 >= i10) {
            i2++;
        }
        return (n) arrayList.get(i2);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        h hVar = this.B;
        l lVar = hVar.L;
        lVar.i();
        int size = lVar.f11119j.size();
        hVar.getClass();
        if (this.A < 0) {
            return size;
        }
        return size - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        return i2;
    }

    @Override // android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        if (view == null) {
            view = this.B.B.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
        }
        ((y) view).b(getItem(i2));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

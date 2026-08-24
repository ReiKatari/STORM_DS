package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import com.stormds.emulator.R;
import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: tw3  reason: default package */
/* loaded from: classes.dex */
public final class tw3 extends BaseAdapter {
    public int A = -1;
    public final /* synthetic */ uw3 B;

    public tw3(uw3 uw3Var) {
        this.B = uw3Var;
        a();
    }

    public final void a() {
        i44 i44Var = this.B.L;
        o44 o44Var = i44Var.v;
        if (o44Var != null) {
            i44Var.i();
            ArrayList arrayList = i44Var.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (((o44) arrayList.get(i)) == o44Var) {
                    this.A = i;
                    return;
                }
            }
        }
        this.A = -1;
    }

    @Override // android.widget.Adapter
    /* renamed from: b */
    public final o44 getItem(int i) {
        uw3 uw3Var = this.B;
        i44 i44Var = uw3Var.L;
        i44Var.i();
        ArrayList arrayList = i44Var.j;
        uw3Var.getClass();
        int i2 = this.A;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return (o44) arrayList.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        uw3 uw3Var = this.B;
        i44 i44Var = uw3Var.L;
        i44Var.i();
        int size = i44Var.j.size();
        uw3Var.getClass();
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
        ((c54) view).c(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        a();
        super.notifyDataSetChanged();
    }
}

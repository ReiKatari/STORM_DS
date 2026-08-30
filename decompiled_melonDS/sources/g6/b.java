package g6;

import a0.j;
import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import b4.j3;
import q.z2;
import w.d;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class b extends BaseAdapter implements Filterable {
    public boolean A;
    public boolean B;
    public Cursor L;
    public int R;
    public j3 X;
    public a Y;
    public c Z;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.L;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                j3 j3Var = this.X;
                if (j3Var != null) {
                    cursor2.unregisterContentObserver(j3Var);
                }
                a aVar = this.Y;
                if (aVar != null) {
                    cursor2.unregisterDataSetObserver(aVar);
                }
            }
            this.L = cursor;
            if (cursor != null) {
                j3 j3Var2 = this.X;
                if (j3Var2 != null) {
                    cursor.registerContentObserver(j3Var2);
                }
                a aVar2 = this.Y;
                if (aVar2 != null) {
                    cursor.registerDataSetObserver(aVar2);
                }
                this.R = cursor.getColumnIndexOrThrow("_id");
                this.A = true;
                notifyDataSetChanged();
            } else {
                this.R = -1;
                this.A = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String c(Cursor cursor);

    public abstract View d(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (this.A && (cursor = this.L) != null) {
            return cursor.getCount();
        }
        return 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        if (this.A) {
            this.L.moveToPosition(i2);
            if (view == null) {
                z2 z2Var = (z2) this;
                view = z2Var.f12074d0.inflate(z2Var.f12073c0, viewGroup, false);
            }
            a(view, this.L);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [android.widget.Filter, g6.c] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.Z == null) {
            ?? filter = new Filter();
            filter.f5601a = this;
            this.Z = filter;
        }
        return this.Z;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i2) {
        Cursor cursor;
        if (this.A && (cursor = this.L) != null) {
            cursor.moveToPosition(i2);
            return this.L;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i2) {
        Cursor cursor;
        if (!this.A || (cursor = this.L) == null || !cursor.moveToPosition(i2)) {
            return 0L;
        }
        return this.L.getLong(this.R);
    }

    @Override // android.widget.Adapter
    public View getView(int i2, View view, ViewGroup viewGroup) {
        if (this.A) {
            if (this.L.moveToPosition(i2)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.L);
                return view;
            }
            j.p(d.l(i2, "couldn't move cursor to position "));
            return null;
        }
        j.p("this should only be called when the cursor is valid");
        return null;
    }
}

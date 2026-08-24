package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z71  reason: default package */
/* loaded from: classes.dex */
public abstract class z71 extends BaseAdapter implements Filterable {
    public boolean A;
    public boolean B;
    public Cursor L;
    public int R;
    public x71 X;
    public y71 Y;
    public d81 Z;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.L;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                x71 x71Var = this.X;
                if (x71Var != null) {
                    cursor2.unregisterContentObserver(x71Var);
                }
                y71 y71Var = this.Y;
                if (y71Var != null) {
                    cursor2.unregisterDataSetObserver(y71Var);
                }
            }
            this.L = cursor;
            if (cursor != null) {
                x71 x71Var2 = this.X;
                if (x71Var2 != null) {
                    cursor.registerContentObserver(x71Var2);
                }
                y71 y71Var2 = this.Y;
                if (y71Var2 != null) {
                    cursor.registerDataSetObserver(y71Var2);
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
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (this.A) {
            this.L.moveToPosition(i);
            if (view == null) {
                du6 du6Var = (du6) this;
                view = du6Var.f0.inflate(du6Var.e0, viewGroup, false);
            }
            a(view, this.L);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [android.widget.Filter, d81] */
    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.Z == null) {
            ?? filter = new Filter();
            filter.a = this;
            this.Z = filter;
        }
        return this.Z;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (this.A && (cursor = this.L) != null) {
            cursor.moveToPosition(i);
            return this.L;
        }
        return null;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (!this.A || (cursor = this.L) == null || !cursor.moveToPosition(i)) {
            return 0L;
        }
        return this.L.getLong(this.R);
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (this.A) {
            if (this.L.moveToPosition(i)) {
                if (view == null) {
                    view = d(viewGroup);
                }
                a(view, this.L);
                return view;
            }
            i.m(lb1.g(i, "couldn't move cursor to position "));
            return null;
        }
        i.m("this should only be called when the cursor is valid");
        return null;
    }
}

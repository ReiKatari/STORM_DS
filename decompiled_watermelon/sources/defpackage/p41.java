package defpackage;

import android.database.Cursor;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p41  reason: default package */
/* loaded from: classes.dex */
public abstract class p41 extends BaseAdapter implements Filterable {
    public boolean A;
    public boolean B;
    public Cursor L;
    public int R;
    public n41 X;
    public o41 Y;
    public t41 Z;

    public abstract void a(View view, Cursor cursor);

    public void b(Cursor cursor) {
        Cursor cursor2 = this.L;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                n41 n41Var = this.X;
                if (n41Var != null) {
                    cursor2.unregisterContentObserver(n41Var);
                }
                o41 o41Var = this.Y;
                if (o41Var != null) {
                    cursor2.unregisterDataSetObserver(o41Var);
                }
            }
            this.L = cursor;
            if (cursor != null) {
                n41 n41Var2 = this.X;
                if (n41Var2 != null) {
                    cursor.registerContentObserver(n41Var2);
                }
                o41 o41Var2 = this.Y;
                if (o41Var2 != null) {
                    cursor.registerDataSetObserver(o41Var2);
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
                ji6 ji6Var = (ji6) this;
                view = ji6Var.e0.inflate(ji6Var.d0, viewGroup, false);
            }
            a(view, this.L);
            return view;
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [t41, android.widget.Filter] */
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
            i.n(wh1.g(i, "couldn't move cursor to position "));
            return null;
        }
        i.n("this should only be called when the cursor is valid");
        return null;
    }
}

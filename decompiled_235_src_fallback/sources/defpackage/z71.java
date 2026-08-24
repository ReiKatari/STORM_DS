package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z71  reason: default package */
/* loaded from: classes.dex */
public abstract class z71 extends android.widget.BaseAdapter implements android.widget.Filterable {
    public boolean A;
    public boolean B;
    public android.database.Cursor L;
    public int R;
    public defpackage.x71 X;
    public defpackage.y71 Y;
    public defpackage.d81 Z;

    public abstract void a(android.view.View r1, android.database.Cursor r2);

    public void b(android.database.Cursor r3) {
            r2 = this;
            android.database.Cursor r0 = r2.L
            if (r3 != r0) goto L6
            r0 = 0
            goto L40
        L6:
            if (r0 == 0) goto L16
            x71 r1 = r2.X
            if (r1 == 0) goto Lf
            r0.unregisterContentObserver(r1)
        Lf:
            y71 r1 = r2.Y
            if (r1 == 0) goto L16
            r0.unregisterDataSetObserver(r1)
        L16:
            r2.L = r3
            if (r3 == 0) goto L37
            x71 r1 = r2.X
            if (r1 == 0) goto L21
            r3.registerContentObserver(r1)
        L21:
            y71 r1 = r2.Y
            if (r1 == 0) goto L28
            r3.registerDataSetObserver(r1)
        L28:
            java.lang.String r1 = "_id"
            int r3 = r3.getColumnIndexOrThrow(r1)
            r2.R = r3
            r3 = 1
            r2.A = r3
            r2.notifyDataSetChanged()
            goto L40
        L37:
            r3 = -1
            r2.R = r3
            r3 = 0
            r2.A = r3
            r2.notifyDataSetInvalidated()
        L40:
            if (r0 == 0) goto L45
            r0.close()
        L45:
            return
    }

    public abstract java.lang.String c(android.database.Cursor r1);

    public abstract android.view.View d(android.view.ViewGroup r1);

    @Override // android.widget.Adapter
    public final int getCount() {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto Ld
            android.database.Cursor r1 = r1.L
            if (r1 == 0) goto Ld
            int r1 = r1.getCount()
            return r1
        Ld:
            r1 = 0
            return r1
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public android.view.View getDropDownView(int r2, android.view.View r3, android.view.ViewGroup r4) {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto L1d
            android.database.Cursor r0 = r1.L
            r0.moveToPosition(r2)
            if (r3 != 0) goto L17
            r2 = r1
            du6 r2 = (defpackage.du6) r2
            int r3 = r2.e0
            r0 = 0
            android.view.LayoutInflater r2 = r2.f0
            android.view.View r3 = r2.inflate(r3, r4, r0)
        L17:
            android.database.Cursor r2 = r1.L
            r1.a(r3, r2)
            return r3
        L1d:
            r1 = 0
            return r1
    }

    @Override // android.widget.Filterable
    public final android.widget.Filter getFilter() {
            r1 = this;
            d81 r0 = r1.Z
            if (r0 != 0) goto Ld
            d81 r0 = new d81
            r0.<init>()
            r0.a = r1
            r1.Z = r0
        Ld:
            d81 r1 = r1.Z
            return r1
    }

    @Override // android.widget.Adapter
    public final java.lang.Object getItem(int r2) {
            r1 = this;
            boolean r0 = r1.A
            if (r0 == 0) goto Le
            android.database.Cursor r0 = r1.L
            if (r0 == 0) goto Le
            r0.moveToPosition(r2)
            android.database.Cursor r1 = r1.L
            return r1
        Le:
            r1 = 0
            return r1
    }

    @Override // android.widget.Adapter
    public final long getItemId(int r4) {
            r3 = this;
            boolean r0 = r3.A
            r1 = 0
            if (r0 == 0) goto L19
            android.database.Cursor r0 = r3.L
            if (r0 == 0) goto L19
            boolean r4 = r0.moveToPosition(r4)
            if (r4 == 0) goto L19
            android.database.Cursor r4 = r3.L
            int r3 = r3.R
            long r3 = r4.getLong(r3)
            return r3
        L19:
            return r1
    }

    @Override // android.widget.Adapter
    public android.view.View getView(int r3, android.view.View r4, android.view.ViewGroup r5) {
            r2 = this;
            boolean r0 = r2.A
            r1 = 0
            if (r0 == 0) goto L23
            android.database.Cursor r0 = r2.L
            boolean r0 = r0.moveToPosition(r3)
            if (r0 == 0) goto L19
            if (r4 != 0) goto L13
            android.view.View r4 = r2.d(r5)
        L13:
            android.database.Cursor r3 = r2.L
            r2.a(r4, r3)
            return r4
        L19:
            java.lang.String r2 = "couldn't move cursor to position "
            java.lang.String r2 = defpackage.lb1.g(r3, r2)
            defpackage.i.m(r2)
            return r1
        L23:
            java.lang.String r2 = "this should only be called when the cursor is valid"
            defpackage.i.m(r2)
            return r1
    }
}

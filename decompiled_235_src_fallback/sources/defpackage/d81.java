package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: d81  reason: default package */
/* loaded from: classes.dex */
public final class d81 extends android.widget.Filter {
    public defpackage.z71 a;

    @Override // android.widget.Filter
    public final java.lang.CharSequence convertResultToString(java.lang.Object r1) {
            r0 = this;
            z71 r0 = r0.a
            android.database.Cursor r1 = (android.database.Cursor) r1
            java.lang.String r0 = r0.c(r1)
            return r0
    }

    @Override // android.widget.Filter
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
            r3 = this;
            z71 r3 = r3.a
            du6 r3 = (defpackage.du6) r3
            androidx.appcompat.widget.SearchView r0 = r3.g0
            if (r4 != 0) goto Lb
            java.lang.String r4 = ""
            goto Lf
        Lb:
            java.lang.String r4 = r4.toString()
        Lf:
            int r1 = r0.getVisibility()
            r2 = 0
            if (r1 != 0) goto L31
            int r0 = r0.getWindowVisibility()
            if (r0 == 0) goto L1d
            goto L31
        L1d:
            android.app.SearchableInfo r0 = r3.h0     // Catch: java.lang.RuntimeException -> L29
            android.database.Cursor r3 = r3.g(r0, r4)     // Catch: java.lang.RuntimeException -> L29
            if (r3 == 0) goto L31
            r3.getCount()     // Catch: java.lang.RuntimeException -> L29
            goto L32
        L29:
            r3 = move-exception
            java.lang.String r4 = "SuggestionsAdapter"
            java.lang.String r0 = "Search suggestions query threw an exception."
            android.util.Log.w(r4, r0, r3)
        L31:
            r3 = r2
        L32:
            android.widget.Filter$FilterResults r4 = new android.widget.Filter$FilterResults
            r4.<init>()
            if (r3 == 0) goto L42
            int r0 = r3.getCount()
            r4.count = r0
            r4.values = r3
            goto L47
        L42:
            r3 = 0
            r4.count = r3
            r4.values = r2
        L47:
            return r4
    }

    @Override // android.widget.Filter
    public final void publishResults(java.lang.CharSequence r1, android.widget.Filter.FilterResults r2) {
            r0 = this;
            z71 r0 = r0.a
            android.database.Cursor r1 = r0.L
            java.lang.Object r2 = r2.values
            if (r2 == 0) goto Lf
            if (r2 == r1) goto Lf
            android.database.Cursor r2 = (android.database.Cursor) r2
            r0.b(r2)
        Lf:
            return
    }
}

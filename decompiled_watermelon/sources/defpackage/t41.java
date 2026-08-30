package defpackage;

import android.database.Cursor;
import android.widget.Filter;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t41  reason: default package */
/* loaded from: classes.dex */
public final class t41 extends Filter {
    public p41 a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return this.a.c((Cursor) obj);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0042  */
    @Override // android.widget.Filter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.widget.Filter.FilterResults performFiltering(java.lang.CharSequence r4) {
        /*
            r3 = this;
            p41 r3 = r3.a
            ji6 r3 = (defpackage.ji6) r3
            androidx.appcompat.widget.SearchView r0 = r3.f0
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
            android.app.SearchableInfo r0 = r3.g0     // Catch: java.lang.RuntimeException -> L29
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
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t41.performFiltering(java.lang.CharSequence):android.widget.Filter$FilterResults");
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        p41 p41Var = this.a;
        Cursor cursor = p41Var.L;
        Object obj = filterResults.values;
        if (obj != null && obj != cursor) {
            p41Var.b((Cursor) obj);
        }
    }
}

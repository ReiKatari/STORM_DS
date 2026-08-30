package defpackage;

import android.app.SearchableInfo;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.appcompat.widget.SearchView;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ji6  reason: default package */
/* loaded from: classes.dex */
public final class ji6 extends p41 implements View.OnClickListener {
    public static final /* synthetic */ int s0 = 0;
    public final int c0;
    public final int d0;
    public final LayoutInflater e0;
    public final SearchView f0;
    public final SearchableInfo g0;
    public final Context h0;
    public final WeakHashMap i0;
    public final int j0;
    public int k0;
    public ColorStateList l0;
    public int m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;

    public ji6(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.B = true;
        this.L = null;
        this.A = false;
        this.R = -1;
        this.X = new n41(this);
        this.Y = new o41(0, this);
        this.d0 = suggestionRowLayout;
        this.c0 = suggestionRowLayout;
        this.e0 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.k0 = 1;
        this.m0 = -1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.f0 = searchView;
        this.g0 = searchableInfo;
        this.j0 = searchView.getSuggestionCommitIconResId();
        this.h0 = context;
        this.i0 = weakHashMap;
    }

    public static String h(Cursor cursor, int i) {
        if (i == -1) {
            return null;
        }
        try {
            return cursor.getString(i);
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    @Override // defpackage.p41
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji6.a(android.view.View, android.database.Cursor):void");
    }

    @Override // defpackage.p41
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.m0 = cursor.getColumnIndex("suggest_text_1");
                this.n0 = cursor.getColumnIndex("suggest_text_2");
                this.o0 = cursor.getColumnIndex("suggest_text_2_url");
                this.p0 = cursor.getColumnIndex("suggest_icon_1");
                this.q0 = cursor.getColumnIndex("suggest_icon_2");
                this.r0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // defpackage.p41
    public final String c(Cursor cursor) {
        String h;
        String h2;
        if (cursor != null) {
            String h3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (h3 != null) {
                return h3;
            }
            SearchableInfo searchableInfo = this.g0;
            if (searchableInfo.shouldRewriteQueryFromData() && (h2 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
                return h2;
            }
            if (searchableInfo.shouldRewriteQueryFromText() && (h = h(cursor, cursor.getColumnIndex("suggest_text_1"))) != null) {
                return h;
            }
            return null;
        }
        return null;
    }

    @Override // defpackage.p41
    public final View d(ViewGroup viewGroup) {
        View inflate = this.e0.inflate(this.c0, viewGroup, false);
        inflate.setTag(new ii6(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.j0);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.h0.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(wh1.i(uri, "Single path segment is not a resource ID: "));
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(wh1.i(uri, "More than two path segments: "));
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException(wh1.i(uri, "No resource found for: "));
                }
                throw new FileNotFoundException(wh1.i(uri, "No path: "));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(wh1.i(uri, "No package found for authority: "));
            }
        }
        throw new FileNotFoundException(wh1.i(uri, "No authority: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.drawable.Drawable f(java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 276
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ji6.f(java.lang.String):android.graphics.drawable.Drawable");
    }

    public final Cursor g(SearchableInfo searchableInfo, String str) {
        String suggestAuthority;
        String[] strArr = null;
        if (searchableInfo == null || (suggestAuthority = searchableInfo.getSuggestAuthority()) == null) {
            return null;
        }
        Uri.Builder fragment = new Uri.Builder().scheme("content").authority(suggestAuthority).query("").fragment("");
        String suggestPath = searchableInfo.getSuggestPath();
        if (suggestPath != null) {
            fragment.appendEncodedPath(suggestPath);
        }
        fragment.appendPath("search_suggest_query");
        String suggestSelection = searchableInfo.getSuggestSelection();
        if (suggestSelection != null) {
            strArr = new String[]{str};
        } else {
            fragment.appendPath(str);
        }
        String[] strArr2 = strArr;
        fragment.appendQueryParameter("limit", String.valueOf(50));
        return this.h0.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // defpackage.p41, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.e0.inflate(this.d0, viewGroup, false);
            if (inflate != null) {
                ((ii6) inflate.getTag()).a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // defpackage.p41, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View d = this.d(viewGroup);
            ((ii6) d.getTag()).a.setText(e.toString());
            return d;
        }
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public final boolean hasStableIds() {
        return false;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        Bundle bundle;
        super.notifyDataSetChanged();
        Cursor cursor = this.L;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetInvalidated() {
        Bundle bundle;
        super.notifyDataSetInvalidated();
        Cursor cursor = this.L;
        if (cursor != null) {
            bundle = cursor.getExtras();
        } else {
            bundle = null;
        }
        if (bundle != null) {
            bundle.getBoolean("in_progress");
        }
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object tag = view.getTag();
        if (tag instanceof CharSequence) {
            this.f0.p((CharSequence) tag);
        }
    }
}

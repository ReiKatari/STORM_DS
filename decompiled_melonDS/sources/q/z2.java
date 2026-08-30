package q;

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
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class z2 extends g6.b implements View.OnClickListener {

    /* renamed from: r0  reason: collision with root package name */
    public static final /* synthetic */ int f12071r0 = 0;

    /* renamed from: b0  reason: collision with root package name */
    public final int f12072b0;

    /* renamed from: c0  reason: collision with root package name */
    public final int f12073c0;

    /* renamed from: d0  reason: collision with root package name */
    public final LayoutInflater f12074d0;

    /* renamed from: e0  reason: collision with root package name */
    public final SearchView f12075e0;

    /* renamed from: f0  reason: collision with root package name */
    public final SearchableInfo f12076f0;

    /* renamed from: g0  reason: collision with root package name */
    public final Context f12077g0;

    /* renamed from: h0  reason: collision with root package name */
    public final WeakHashMap f12078h0;

    /* renamed from: i0  reason: collision with root package name */
    public final int f12079i0;

    /* renamed from: j0  reason: collision with root package name */
    public int f12080j0;

    /* renamed from: k0  reason: collision with root package name */
    public ColorStateList f12081k0;

    /* renamed from: l0  reason: collision with root package name */
    public int f12082l0;

    /* renamed from: m0  reason: collision with root package name */
    public int f12083m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f12084n0;

    /* renamed from: o0  reason: collision with root package name */
    public int f12085o0;
    public int p0;

    /* renamed from: q0  reason: collision with root package name */
    public int f12086q0;

    public z2(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.B = true;
        this.L = null;
        this.A = false;
        this.R = -1;
        this.X = new b4.j3(this);
        this.Y = new g6.a(0, this);
        this.f12073c0 = suggestionRowLayout;
        this.f12072b0 = suggestionRowLayout;
        this.f12074d0 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.f12080j0 = 1;
        this.f12082l0 = -1;
        this.f12083m0 = -1;
        this.f12084n0 = -1;
        this.f12085o0 = -1;
        this.p0 = -1;
        this.f12086q0 = -1;
        this.f12075e0 = searchView;
        this.f12076f0 = searchableInfo;
        this.f12079i0 = searchView.getSuggestionCommitIconResId();
        this.f12077g0 = context;
        this.f12078h0 = weakHashMap;
    }

    public static String h(Cursor cursor, int i2) {
        if (i2 == -1) {
            return null;
        }
        try {
            return cursor.getString(i2);
        } catch (Exception e6) {
            Log.e("SuggestionsAdapter", "unexpected error retrieving valid column from cursor, did the remote process die?", e6);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0134  */
    @Override // g6.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.view.View r21, android.database.Cursor r22) {
        /*
            Method dump skipped, instructions count: 423
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: q.z2.a(android.view.View, android.database.Cursor):void");
    }

    @Override // g6.b
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.f12082l0 = cursor.getColumnIndex("suggest_text_1");
                this.f12083m0 = cursor.getColumnIndex("suggest_text_2");
                this.f12084n0 = cursor.getColumnIndex("suggest_text_2_url");
                this.f12085o0 = cursor.getColumnIndex("suggest_icon_1");
                this.p0 = cursor.getColumnIndex("suggest_icon_2");
                this.f12086q0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e6) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e6);
        }
    }

    @Override // g6.b
    public final String c(Cursor cursor) {
        String h2;
        String h10;
        if (cursor != null) {
            String h11 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (h11 != null) {
                return h11;
            }
            SearchableInfo searchableInfo = this.f12076f0;
            if (searchableInfo.shouldRewriteQueryFromData() && (h10 = h(cursor, cursor.getColumnIndex("suggest_intent_data"))) != null) {
                return h10;
            }
            if (searchableInfo.shouldRewriteQueryFromText() && (h2 = h(cursor, cursor.getColumnIndex("suggest_text_1"))) != null) {
                return h2;
            }
            return null;
        }
        return null;
    }

    @Override // g6.b
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f12074d0.inflate(this.f12072b0, viewGroup, false);
        inflate.setTag(new y2(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.f12079i0);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.f12077g0.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(kc.a.f("Single path segment is not a resource ID: ", uri));
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(kc.a.f("More than two path segments: ", uri));
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException(kc.a.f("No resource found for: ", uri));
                }
                throw new FileNotFoundException(kc.a.f("No path: ", uri));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(kc.a.f("No package found for authority: ", uri));
            }
        }
        throw new FileNotFoundException(kc.a.f("No authority: ", uri));
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
        throw new UnsupportedOperationException("Method not decompiled: q.z2.f(java.lang.String):android.graphics.drawable.Drawable");
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
        return this.f12077g0.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // g6.b, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i2, view, viewGroup);
        } catch (RuntimeException e6) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e6);
            View inflate = this.f12074d0.inflate(this.f12073c0, viewGroup, false);
            if (inflate != null) {
                ((y2) inflate.getTag()).f12059a.setText(e6.toString());
            }
            return inflate;
        }
    }

    @Override // g6.b, android.widget.Adapter
    public final View getView(int i2, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i2, view, viewGroup);
        } catch (RuntimeException e6) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e6);
            View d4 = d(viewGroup);
            ((y2) d4.getTag()).f12059a.setText(e6.toString());
            return d4;
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
            this.f12075e0.p((CharSequence) tag);
        }
    }
}

package defpackage;

import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.TextAppearanceSpan;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.SearchView;
import com.stormds.emulator.R;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: du6  reason: default package */
/* loaded from: classes.dex */
public final class du6 extends z71 implements View.OnClickListener {
    public static final /* synthetic */ int t0 = 0;
    public final int d0;
    public final int e0;
    public final LayoutInflater f0;
    public final SearchView g0;
    public final SearchableInfo h0;
    public final Context i0;
    public final WeakHashMap j0;
    public final int k0;
    public int l0;
    public ColorStateList m0;
    public int n0;
    public int o0;
    public int p0;
    public int q0;
    public int r0;
    public int s0;

    public du6(Context context, SearchView searchView, SearchableInfo searchableInfo, WeakHashMap weakHashMap) {
        int suggestionRowLayout = searchView.getSuggestionRowLayout();
        this.B = true;
        this.L = null;
        this.A = false;
        this.R = -1;
        this.X = new x71(this);
        this.Y = new y71(this, 0);
        this.e0 = suggestionRowLayout;
        this.d0 = suggestionRowLayout;
        this.f0 = (LayoutInflater) context.getSystemService("layout_inflater");
        this.l0 = 1;
        this.n0 = -1;
        this.o0 = -1;
        this.p0 = -1;
        this.q0 = -1;
        this.r0 = -1;
        this.s0 = -1;
        this.g0 = searchView;
        this.h0 = searchableInfo;
        this.k0 = searchView.getSuggestionCommitIconResId();
        this.i0 = context;
        this.j0 = weakHashMap;
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
    @Override // defpackage.z71
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(View view, Cursor cursor) {
        int i;
        int i2;
        int i3;
        Drawable f;
        Drawable f2;
        Drawable.ConstantState constantState;
        ActivityInfo activityInfo;
        int iconResource;
        String str;
        cu6 cu6Var = (cu6) view.getTag();
        int i4 = this.s0;
        if (i4 != -1) {
            i = cursor.getInt(i4);
        } else {
            i = 0;
        }
        TextView textView = cu6Var.a;
        TextView textView2 = cu6Var.b;
        ImageView imageView = cu6Var.e;
        if (textView != null) {
            String h = h(cursor, this.n0);
            textView.setText(h);
            if (TextUtils.isEmpty(h)) {
                textView.setVisibility(8);
            } else {
                textView.setVisibility(0);
            }
        }
        Context context = this.i0;
        if (textView2 != null) {
            String h2 = h(cursor, this.p0);
            if (h2 != null) {
                if (this.m0 == null) {
                    TypedValue typedValue = new TypedValue();
                    context.getTheme().resolveAttribute(R.attr.textColorSearchUrl, typedValue, true);
                    this.m0 = context.getResources().getColorStateList(typedValue.resourceId);
                }
                SpannableString spannableString = new SpannableString(h2);
                spannableString.setSpan(new TextAppearanceSpan(null, 0, 0, this.m0, null), 0, h2.length(), 33);
                str = spannableString;
            } else {
                str = h(cursor, this.o0);
            }
            if (TextUtils.isEmpty(str)) {
                if (textView != null) {
                    textView.setSingleLine(false);
                    textView.setMaxLines(2);
                }
            } else if (textView != null) {
                textView.setSingleLine(true);
                textView.setMaxLines(1);
            }
            textView2.setText(str);
            if (TextUtils.isEmpty(str)) {
                textView2.setVisibility(8);
            } else {
                textView2.setVisibility(0);
            }
        }
        ImageView imageView2 = cu6Var.c;
        if (imageView2 != null) {
            int i5 = this.q0;
            if (i5 == -1) {
                f2 = null;
            } else {
                f2 = f(cursor.getString(i5));
                if (f2 == null) {
                    ComponentName searchActivity = this.h0.getSearchActivity();
                    String flattenToShortString = searchActivity.flattenToShortString();
                    WeakHashMap weakHashMap = this.j0;
                    if (weakHashMap.containsKey(flattenToShortString)) {
                        Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(flattenToShortString);
                        if (constantState2 == null) {
                            f2 = null;
                        } else {
                            f2 = constantState2.newDrawable(context.getResources());
                        }
                    } else {
                        PackageManager packageManager = context.getPackageManager();
                        try {
                            activityInfo = packageManager.getActivityInfo(searchActivity, 128);
                            iconResource = activityInfo.getIconResource();
                        } catch (PackageManager.NameNotFoundException e) {
                            Log.w("SuggestionsAdapter", e.toString());
                        }
                        if (iconResource != 0) {
                            Drawable drawable = packageManager.getDrawable(searchActivity.getPackageName(), iconResource, activityInfo.applicationInfo);
                            if (drawable == null) {
                                StringBuilder t = xg6.t("Invalid icon resource ", iconResource, " for ");
                                t.append(searchActivity.flattenToShortString());
                                Log.w("SuggestionsAdapter", t.toString());
                            } else {
                                f2 = drawable;
                                if (f2 != null) {
                                    constantState = null;
                                } else {
                                    constantState = f2.getConstantState();
                                }
                                weakHashMap.put(flattenToShortString, constantState);
                            }
                        }
                        f2 = null;
                        if (f2 != null) {
                        }
                        weakHashMap.put(flattenToShortString, constantState);
                    }
                    if (f2 == null) {
                        f2 = context.getPackageManager().getDefaultActivityIcon();
                    }
                }
            }
            imageView2.setImageDrawable(f2);
            if (f2 == null) {
                imageView2.setVisibility(4);
            } else {
                imageView2.setVisibility(0);
                f2.setVisible(false, false);
                f2.setVisible(true, false);
            }
        }
        ImageView imageView3 = cu6Var.d;
        if (imageView3 != null) {
            int i6 = this.r0;
            if (i6 == -1) {
                f = null;
            } else {
                f = f(cursor.getString(i6));
            }
            imageView3.setImageDrawable(f);
            if (f == null) {
                imageView3.setVisibility(8);
            } else {
                imageView3.setVisibility(0);
                f.setVisible(false, false);
                i2 = 1;
                f.setVisible(true, false);
                i3 = this.l0;
                if (i3 == 2 && (i3 != i2 || (i & 1) == 0)) {
                    imageView.setVisibility(8);
                    return;
                }
                imageView.setVisibility(0);
                imageView.setTag(textView.getText());
                imageView.setOnClickListener(this);
            }
        }
        i2 = 1;
        i3 = this.l0;
        if (i3 == 2) {
        }
        imageView.setVisibility(0);
        imageView.setTag(textView.getText());
        imageView.setOnClickListener(this);
    }

    @Override // defpackage.z71
    public final void b(Cursor cursor) {
        try {
            super.b(cursor);
            if (cursor != null) {
                this.n0 = cursor.getColumnIndex("suggest_text_1");
                this.o0 = cursor.getColumnIndex("suggest_text_2");
                this.p0 = cursor.getColumnIndex("suggest_text_2_url");
                this.q0 = cursor.getColumnIndex("suggest_icon_1");
                this.r0 = cursor.getColumnIndex("suggest_icon_2");
                this.s0 = cursor.getColumnIndex("suggest_flags");
            }
        } catch (Exception e) {
            Log.e("SuggestionsAdapter", "error changing cursor and caching columns", e);
        }
    }

    @Override // defpackage.z71
    public final String c(Cursor cursor) {
        String h;
        String h2;
        if (cursor != null) {
            String h3 = h(cursor, cursor.getColumnIndex("suggest_intent_query"));
            if (h3 != null) {
                return h3;
            }
            SearchableInfo searchableInfo = this.h0;
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

    @Override // defpackage.z71
    public final View d(ViewGroup viewGroup) {
        View inflate = this.f0.inflate(this.d0, viewGroup, false);
        inflate.setTag(new cu6(inflate));
        ((ImageView) inflate.findViewById(R.id.edit_query)).setImageResource(this.k0);
        return inflate;
    }

    public final Drawable e(Uri uri) {
        int parseInt;
        String authority = uri.getAuthority();
        if (!TextUtils.isEmpty(authority)) {
            try {
                Resources resourcesForApplication = this.i0.getPackageManager().getResourcesForApplication(authority);
                List<String> pathSegments = uri.getPathSegments();
                if (pathSegments != null) {
                    int size = pathSegments.size();
                    if (size == 1) {
                        try {
                            parseInt = Integer.parseInt(pathSegments.get(0));
                        } catch (NumberFormatException unused) {
                            throw new FileNotFoundException(xg6.n(uri, "Single path segment is not a resource ID: "));
                        }
                    } else if (size == 2) {
                        parseInt = resourcesForApplication.getIdentifier(pathSegments.get(1), pathSegments.get(0), authority);
                    } else {
                        throw new FileNotFoundException(xg6.n(uri, "More than two path segments: "));
                    }
                    if (parseInt != 0) {
                        return resourcesForApplication.getDrawable(parseInt);
                    }
                    throw new FileNotFoundException(xg6.n(uri, "No resource found for: "));
                }
                throw new FileNotFoundException(xg6.n(uri, "No path: "));
            } catch (PackageManager.NameNotFoundException unused2) {
                throw new FileNotFoundException(xg6.n(uri, "No package found for authority: "));
            }
        }
        throw new FileNotFoundException(xg6.n(uri, "No authority: "));
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x010c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Drawable f(String str) {
        Drawable newDrawable;
        Drawable newDrawable2;
        WeakHashMap weakHashMap = this.j0;
        Context context = this.i0;
        Drawable drawable = null;
        if (str != null && !str.isEmpty() && !"0".equals(str)) {
            try {
                int parseInt = Integer.parseInt(str);
                String str2 = "android.resource://" + context.getPackageName() + "/" + parseInt;
                Drawable.ConstantState constantState = (Drawable.ConstantState) weakHashMap.get(str2);
                if (constantState == null) {
                    newDrawable2 = null;
                } else {
                    newDrawable2 = constantState.newDrawable();
                }
                if (newDrawable2 != null) {
                    return newDrawable2;
                }
                Drawable drawable2 = context.getDrawable(parseInt);
                if (drawable2 != null) {
                    weakHashMap.put(str2, drawable2.getConstantState());
                }
                return drawable2;
            } catch (Resources.NotFoundException unused) {
                Log.w("SuggestionsAdapter", "Icon resource not found: ".concat(str));
                return null;
            } catch (NumberFormatException unused2) {
                Drawable.ConstantState constantState2 = (Drawable.ConstantState) weakHashMap.get(str);
                if (constantState2 == null) {
                    newDrawable = null;
                } else {
                    newDrawable = constantState2.newDrawable();
                }
                if (newDrawable != null) {
                    return newDrawable;
                }
                Uri parse = Uri.parse(str);
                try {
                } catch (FileNotFoundException e) {
                    Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e.getMessage());
                    if (drawable != null) {
                        weakHashMap.put(str, drawable.getConstantState());
                    }
                    return drawable;
                }
                if ("android.resource".equals(parse.getScheme())) {
                    try {
                        drawable = e(parse);
                        if (drawable != null) {
                        }
                    } catch (Resources.NotFoundException unused3) {
                        throw new FileNotFoundException("Resource does not exist: " + parse);
                    }
                } else {
                    InputStream openInputStream = context.getContentResolver().openInputStream(parse);
                    if (openInputStream != null) {
                        Drawable createFromStream = Drawable.createFromStream(openInputStream, null);
                        try {
                            openInputStream.close();
                        } catch (IOException e2) {
                            Log.e("SuggestionsAdapter", "Error closing icon stream for " + parse, e2);
                        }
                        drawable = createFromStream;
                        if (drawable != null) {
                        }
                    } else {
                        throw new FileNotFoundException("Failed to open " + parse);
                    }
                }
                Log.w("SuggestionsAdapter", "Icon not found: " + parse + ", " + e.getMessage());
                if (drawable != null) {
                }
            }
        }
        return drawable;
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
        return this.i0.getContentResolver().query(fragment.build(), null, suggestSelection, strArr2, null);
    }

    @Override // defpackage.z71, android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getDropDownView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View inflate = this.f0.inflate(this.e0, viewGroup, false);
            if (inflate != null) {
                ((cu6) inflate.getTag()).a.setText(e.toString());
            }
            return inflate;
        }
    }

    @Override // defpackage.z71, android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        try {
            return super.getView(i, view, viewGroup);
        } catch (RuntimeException e) {
            Log.w("SuggestionsAdapter", "Search suggestions cursor threw exception.", e);
            View d = this.d(viewGroup);
            ((cu6) d.getTag()).a.setText(e.toString());
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
            this.g0.p((CharSequence) tag);
        }
    }
}

package androidx.appcompat.widget;

import android.app.PendingIntent;
import android.app.SearchableInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.Cursor;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.widget.AutoCompleteTextView;
import android.widget.ImageView;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* loaded from: classes.dex */
public class SearchView extends bo3 implements mq0 {
    public static final ez3 d1;
    public final int[] A0;
    public final ImageView B0;
    public final Drawable C0;
    public final int D0;
    public final int E0;
    public final Intent F0;
    public final Intent G0;
    public final CharSequence H0;
    public hx5 I0;
    public View.OnFocusChangeListener J0;
    public View.OnClickListener K0;
    public boolean L0;
    public boolean M0;
    public p41 N0;
    public boolean O0;
    public CharSequence P0;
    public boolean Q0;
    public boolean R0;
    public int S0;
    public boolean T0;
    public String U0;
    public CharSequence V0;
    public boolean W0;
    public int X0;
    public SearchableInfo Y0;
    public Bundle Z0;
    public final dx5 a1;
    public final dx5 b1;
    public final WeakHashMap c1;
    public final SearchAutoComplete n0;
    public final View o0;
    public final View p0;
    public final View q0;
    public final ImageView r0;
    public final ImageView s0;
    public final ImageView t0;
    public final ImageView u0;
    public final View v0;
    public kx5 w0;
    public final Rect x0;
    public final Rect y0;
    public final int[] z0;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ez3] */
    static {
        ez3 ez3Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.a = null;
            obj.b = null;
            obj.c = null;
            ez3.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                obj.a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                obj.b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            ez3Var = obj;
        }
        d1 = ez3Var;
    }

    public SearchView(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.x0 = new Rect();
        this.y0 = new Rect();
        this.z0 = new int[2];
        this.A0 = new int[2];
        this.a1 = new dx5(this, 0);
        this.b1 = new dx5(this, 1);
        this.c1 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        fx5 fx5Var = new fx5(this);
        nr nrVar = new nr(2, this);
        gl1 gl1Var = new gl1(3, this);
        cx5 cx5Var = new cx5(this);
        int[] iArr = by4.u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        n85 n85Var = new n85(context, obtainStyledAttributes);
        aa7.m(this, context, iArr, null, obtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.n0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.o0 = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.p0 = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.q0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.r0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.s0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.t0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.u0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.B0 = imageView5;
        findViewById.setBackground(n85Var.f(20));
        findViewById2.setBackground(n85Var.f(25));
        imageView.setImageDrawable(n85Var.f(23));
        imageView2.setImageDrawable(n85Var.f(15));
        imageView3.setImageDrawable(n85Var.f(12));
        imageView4.setImageDrawable(n85Var.f(28));
        imageView5.setImageDrawable(n85Var.f(23));
        this.C0 = n85Var.f(22);
        sn2.N(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.D0 = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.E0 = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(cx5Var);
        searchAutoComplete.setOnEditorActionListener(fx5Var);
        searchAutoComplete.setOnItemClickListener(nrVar);
        searchAutoComplete.setOnItemSelectedListener(gl1Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new ex5(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.H0 = obtainStyledAttributes.getText(14);
        this.P0 = obtainStyledAttributes.getText(21);
        int i = obtainStyledAttributes.getInt(6, -1);
        if (i != -1) {
            setImeOptions(i);
        }
        int i2 = obtainStyledAttributes.getInt(5, -1);
        if (i2 != -1) {
            setInputType(i2);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        n85Var.t();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.F0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.G0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.v0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new f40(1, this));
        }
        w(this.L0);
        t();
    }

    private int getPreferredHeight() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_height);
    }

    private int getPreferredWidth() {
        return getContext().getResources().getDimensionPixelSize(R.dimen.abc_search_view_preferred_width);
    }

    private void setQuery(CharSequence charSequence) {
        int length;
        SearchAutoComplete searchAutoComplete = this.n0;
        searchAutoComplete.setText(charSequence);
        if (TextUtils.isEmpty(charSequence)) {
            length = 0;
        } else {
            length = charSequence.length();
        }
        searchAutoComplete.setSelection(length);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void clearFocus() {
        this.R0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.n0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.R0 = false;
    }

    public int getImeOptions() {
        return this.n0.getImeOptions();
    }

    public int getInputType() {
        return this.n0.getInputType();
    }

    public int getMaxWidth() {
        return this.S0;
    }

    public CharSequence getQuery() {
        return this.n0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.P0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.Y0;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.Y0.getHintId());
        }
        return this.H0;
    }

    public int getSuggestionCommitIconResId() {
        return this.E0;
    }

    public int getSuggestionRowLayout() {
        return this.D0;
    }

    public p41 getSuggestionsAdapter() {
        return this.N0;
    }

    public final Intent j(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.V0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.Z0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.Y0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.Z0;
        if (bundle2 != null) {
            bundle.putParcelable("app_data", bundle2);
        }
        Intent intent3 = new Intent(intent);
        Resources resources = getResources();
        if (searchableInfo.getVoiceLanguageModeId() != 0) {
            str = resources.getString(searchableInfo.getVoiceLanguageModeId());
        } else {
            str = "free_form";
        }
        String str4 = null;
        if (searchableInfo.getVoicePromptTextId() != 0) {
            str2 = resources.getString(searchableInfo.getVoicePromptTextId());
        } else {
            str2 = null;
        }
        if (searchableInfo.getVoiceLanguageId() != 0) {
            str3 = resources.getString(searchableInfo.getVoiceLanguageId());
        } else {
            str3 = null;
        }
        if (searchableInfo.getVoiceMaxResults() != 0) {
            i = searchableInfo.getVoiceMaxResults();
        } else {
            i = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.n0;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        ez3 ez3Var = d1;
        ez3Var.getClass();
        ez3.a();
        Method method = ez3Var.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        ez3Var.getClass();
        ez3.a();
        Method method2 = ez3Var.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.n0;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.L0) {
                clearFocus();
                w(true);
                return;
            }
            return;
        }
        searchAutoComplete.setText("");
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
    }

    public final void n(int i) {
        int i2;
        Uri parse;
        String h;
        Cursor cursor = this.N0.L;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = ji6.s0;
                String h2 = ji6.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h2 == null) {
                    h2 = this.Y0.getSuggestIntentAction();
                }
                if (h2 == null) {
                    h2 = "android.intent.action.SEARCH";
                }
                String h3 = ji6.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h3 == null) {
                    h3 = this.Y0.getSuggestIntentData();
                }
                if (h3 != null && (h = ji6.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h3 = h3 + "/" + Uri.encode(h);
                }
                if (h3 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h3);
                }
                intent = j(parse, h2, ji6.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), ji6.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e) {
                try {
                    i2 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i2 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i2 + " returned exception.", e);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e2) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e2);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.n0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i) {
        Editable text = this.n0.getText();
        Cursor cursor = this.N0.L;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                String c = this.N0.c(cursor);
                if (c != null) {
                    setQuery(c);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    @Override // defpackage.mq0
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.n0;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.V0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.X0);
        this.W0 = false;
    }

    @Override // defpackage.mq0
    public final void onActionViewExpanded() {
        if (this.W0) {
            return;
        }
        this.W0 = true;
        SearchAutoComplete searchAutoComplete = this.n0;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.X0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.a1);
        post(this.b1);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.bo3, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.n0;
            int[] iArr = this.z0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.A0;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            Rect rect = this.x0;
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.y0;
            rect2.set(i7, 0, i8, i9);
            kx5 kx5Var = this.w0;
            if (kx5Var == null) {
                kx5 kx5Var2 = new kx5(searchAutoComplete, rect2, rect);
                this.w0 = kx5Var2;
                setTouchDelegate(kx5Var2);
                return;
            }
            kx5Var.b.set(rect2);
            Rect rect3 = kx5Var.d;
            rect3.set(rect2);
            int i10 = -kx5Var.e;
            rect3.inset(i10, i10);
            kx5Var.c.set(rect);
        }
    }

    @Override // defpackage.bo3, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.M0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i3 = this.S0) > 0) {
                    size = Math.min(i3, size);
                }
            } else {
                size = this.S0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i4 = this.S0;
            size = i4 > 0 ? Math.min(i4, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (mode2 != Integer.MIN_VALUE) {
            if (mode2 == 0) {
                size2 = getPreferredHeight();
            }
        } else {
            size2 = Math.min(getPreferredHeight(), size2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 1073741824), View.MeasureSpec.makeMeasureSpec(size2, 1073741824));
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof jx5)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        jx5 jx5Var = (jx5) parcelable;
        super.onRestoreInstanceState(jx5Var.A);
        w(jx5Var.L);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [r, android.os.Parcelable, jx5] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? rVar = new r(super.onSaveInstanceState());
        rVar.L = this.M0;
        return rVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.a1);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.n0;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.I0 != null) {
                text.toString();
                return;
            }
            if (this.Y0 != null) {
                getContext().startActivity(j(null, "android.intent.action.SEARCH", null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        int i;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.n0.getText());
        if (isEmpty && (!this.L0 || this.W0)) {
            i = 8;
        } else {
            i = 0;
        }
        ImageView imageView = this.t0;
        imageView.setVisibility(i);
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            if (!isEmpty) {
                iArr = ViewGroup.ENABLED_STATE_SET;
            } else {
                iArr = ViewGroup.EMPTY_STATE_SET;
            }
            drawable.setState(iArr);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean requestFocus(int i, Rect rect) {
        if (this.R0 || !isFocusable()) {
            return false;
        }
        if (!this.M0) {
            boolean requestFocus = this.n0.requestFocus(i, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    public final void s() {
        int[] iArr;
        if (this.n0.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.p0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.q0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.Z0 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.n0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.K0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.L0 == z) {
            return;
        }
        this.L0 = z;
        w(z);
        t();
    }

    public void setImeOptions(int i) {
        this.n0.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.n0.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.S0 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.J0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(hx5 hx5Var) {
        this.I0 = hx5Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.K0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.P0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.Q0 = z;
        p41 p41Var = this.N0;
        if (p41Var instanceof ji6) {
            ji6 ji6Var = (ji6) p41Var;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            ji6Var.k0 = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void setSearchableInfo(android.app.SearchableInfo r7) {
        /*
            r6 = this;
            r6.Y0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.n0
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.Y0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.Y0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.Y0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            p41 r7 = r6.N0
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.Y0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            ji6 r7 = new ji6
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.Y0
            java.util.WeakHashMap r5 = r6.c1
            r7.<init>(r3, r6, r4, r5)
            r6.N0 = r7
            r2.setAdapter(r7)
            p41 r7 = r6.N0
            ji6 r7 = (defpackage.ji6) r7
            boolean r3 = r6.Q0
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.k0 = r3
        L62:
            r6.t()
        L65:
            android.app.SearchableInfo r7 = r6.Y0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.Y0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.F0
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.Y0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.G0
        L85:
            if (r0 == 0) goto L98
            android.content.Context r7 = r6.getContext()
            android.content.pm.PackageManager r7 = r7.getPackageManager()
            r4 = 65536(0x10000, float:9.1835E-41)
            android.content.pm.ResolveInfo r7 = r7.resolveActivity(r0, r4)
            if (r7 == 0) goto L98
            goto L99
        L98:
            r1 = r3
        L99:
            r6.T0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.M0
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.O0 = z;
        w(this.M0);
    }

    public void setSuggestionsAdapter(p41 p41Var) {
        this.N0 = p41Var;
        this.n0.setAdapter(p41Var);
    }

    public final void t() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.L0;
        SearchAutoComplete searchAutoComplete = this.n0;
        if (z && (drawable = this.C0) != null) {
            int textSize = (int) (searchAutoComplete.getTextSize() * 1.25d);
            drawable.setBounds(0, 0, textSize, textSize);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("   ");
            spannableStringBuilder.setSpan(new ImageSpan(drawable), 1, 2, 33);
            spannableStringBuilder.append(queryHint);
            queryHint = spannableStringBuilder;
        }
        searchAutoComplete.setHint(queryHint);
    }

    public final void u() {
        int i;
        if ((this.O0 || this.T0) && !this.M0 && (this.s0.getVisibility() == 0 || this.u0.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.q0.setVisibility(i);
    }

    public final void v(boolean z) {
        int i;
        boolean z2 = this.O0;
        if (z2 && ((z2 || this.T0) && !this.M0 && hasFocus() && (z || !this.T0))) {
            i = 0;
        } else {
            i = 8;
        }
        this.s0.setVisibility(i);
    }

    public final void w(boolean z) {
        int i;
        int i2;
        int i3;
        this.M0 = z;
        int i4 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.n0.getText());
        this.r0.setVisibility(i);
        v(!isEmpty);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.o0.setVisibility(i2);
        ImageView imageView = this.B0;
        if (imageView.getDrawable() != null && !this.L0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        r();
        if (this.T0 && !this.M0 && isEmpty) {
            this.s0.setVisibility(8);
            i4 = 0;
        }
        this.u0.setVisibility(i4);
        u();
    }

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends yp {
        public int c0;
        public SearchView d0;
        public boolean e0;
        public final d f0;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f0 = new d(this);
            this.c0 = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i = configuration.screenWidthDp;
            int i2 = configuration.screenHeightDp;
            if (i >= 960 && i2 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i < 600) {
                if (i < 640 || i2 < 480) {
                    return 160;
                }
                return 192;
            }
            return 192;
        }

        public final void a() {
            if (Build.VERSION.SDK_INT >= 29) {
                c.b(this, 1);
                if (enoughToFilter()) {
                    showDropDown();
                    return;
                }
                return;
            }
            ez3 ez3Var = SearchView.d1;
            ez3Var.getClass();
            ez3.a();
            Method method = ez3Var.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.c0 > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // defpackage.yp, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.e0) {
                d dVar = this.f0;
                removeCallbacks(dVar);
                post(dVar);
            }
            return onCreateInputConnection;
        }

        @Override // android.view.View
        public final void onFinishInflate() {
            super.onFinishInflate();
            setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onFocusChanged(boolean z, int i, Rect rect) {
            super.onFocusChanged(z, i, rect);
            SearchView searchView = this.d0;
            searchView.w(searchView.M0);
            searchView.post(searchView.a1);
            if (searchView.n0.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
            if (i == 4) {
                if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                    KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                    if (keyDispatcherState != null) {
                        keyDispatcherState.startTracking(keyEvent, this);
                    }
                    return true;
                } else if (keyEvent.getAction() == 1) {
                    KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                    if (keyDispatcherState2 != null) {
                        keyDispatcherState2.handleUpEvent(keyEvent);
                    }
                    if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                        this.d0.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z) {
            super.onWindowFocusChanged(z);
            if (z && this.d0.hasFocus() && getVisibility() == 0) {
                this.e0 = true;
                Context context = getContext();
                ez3 ez3Var = SearchView.d1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f0;
            if (!z) {
                this.e0 = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.e0 = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.e0 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.d0 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.c0 = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(gx5 gx5Var) {
    }

    public void setOnSuggestionListener(ix5 ix5Var) {
    }
}

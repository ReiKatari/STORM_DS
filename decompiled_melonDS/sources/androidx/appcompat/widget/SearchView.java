package androidx.appcompat.widget;

import a6.x0;
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
import ec.f;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
import p1.c1;
import p7.t;
import q.j0;
import q.n;
import q.o2;
import q.p2;
import q.q2;
import q.r2;
import q.s2;
import q.t2;
import q.u2;
import q.v2;
import q.w1;
import q.w2;
import q.x1;
import q.x2;
import q.z2;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class SearchView extends w1 implements o.b {

    /* renamed from: c1  reason: collision with root package name */
    public static final f f963c1;
    public final ImageView A0;
    public final Drawable B0;
    public final int C0;
    public final int D0;
    public final Intent E0;
    public final Intent F0;
    public final CharSequence G0;
    public u2 H0;
    public View.OnFocusChangeListener I0;
    public View.OnClickListener J0;
    public boolean K0;
    public boolean L0;
    public g6.b M0;
    public boolean N0;
    public CharSequence O0;
    public boolean P0;
    public boolean Q0;
    public int R0;
    public boolean S0;
    public String T0;
    public CharSequence U0;
    public boolean V0;
    public int W0;
    public SearchableInfo X0;
    public Bundle Y0;
    public final p2 Z0;

    /* renamed from: a1  reason: collision with root package name */
    public final p2 f964a1;

    /* renamed from: b1  reason: collision with root package name */
    public final WeakHashMap f965b1;

    /* renamed from: m0  reason: collision with root package name */
    public final SearchAutoComplete f966m0;

    /* renamed from: n0  reason: collision with root package name */
    public final View f967n0;

    /* renamed from: o0  reason: collision with root package name */
    public final View f968o0;
    public final View p0;

    /* renamed from: q0  reason: collision with root package name */
    public final ImageView f969q0;

    /* renamed from: r0  reason: collision with root package name */
    public final ImageView f970r0;

    /* renamed from: s0  reason: collision with root package name */
    public final ImageView f971s0;

    /* renamed from: t0  reason: collision with root package name */
    public final ImageView f972t0;

    /* renamed from: u0  reason: collision with root package name */
    public final View f973u0;

    /* renamed from: v0  reason: collision with root package name */
    public x2 f974v0;

    /* renamed from: w0  reason: collision with root package name */
    public final Rect f975w0;

    /* renamed from: x0  reason: collision with root package name */
    public final Rect f976x0;

    /* renamed from: y0  reason: collision with root package name */
    public final int[] f977y0;

    /* renamed from: z0  reason: collision with root package name */
    public final int[] f978z0;

    /* JADX WARN: Type inference failed for: r0v1, types: [ec.f, java.lang.Object] */
    static {
        f fVar = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.f4439a = null;
            obj.f4440b = null;
            obj.f4441c = null;
            f.a();
            try {
                Method declaredMethod = AutoCompleteTextView.class.getDeclaredMethod("doBeforeTextChanged", null);
                obj.f4439a = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            try {
                Method declaredMethod2 = AutoCompleteTextView.class.getDeclaredMethod("doAfterTextChanged", null);
                obj.f4440b = declaredMethod2;
                declaredMethod2.setAccessible(true);
            } catch (NoSuchMethodException unused2) {
            }
            try {
                Method method = AutoCompleteTextView.class.getMethod("ensureImeVisible", Boolean.TYPE);
                obj.f4441c = method;
                method.setAccessible(true);
            } catch (NoSuchMethodException unused3) {
            }
            fVar = obj;
        }
        f963c1 = fVar;
    }

    public SearchView(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.f975w0 = new Rect();
        this.f976x0 = new Rect();
        this.f977y0 = new int[2];
        this.f978z0 = new int[2];
        this.Z0 = new p2(this, 0);
        this.f964a1 = new p2(this, 1);
        this.f965b1 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        s2 s2Var = new s2(this);
        j0 j0Var = new j0(1, this);
        x1 x1Var = new x1(1, this);
        o2 o2Var = new o2(this);
        int[] iArr = k.a.f7930u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        c1 c1Var = new c1(context, obtainStyledAttributes);
        x0.n(this, context, iArr, null, obtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.f966m0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.f967n0 = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.f968o0 = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.p0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.f969q0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.f970r0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.f971s0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.f972t0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.A0 = imageView5;
        findViewById.setBackground(c1Var.h(20));
        findViewById2.setBackground(c1Var.h(25));
        imageView.setImageDrawable(c1Var.h(23));
        imageView2.setImageDrawable(c1Var.h(15));
        imageView3.setImageDrawable(c1Var.h(12));
        imageView4.setImageDrawable(c1Var.h(28));
        imageView5.setImageDrawable(c1Var.h(23));
        this.B0 = c1Var.h(22);
        t.E(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.C0 = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.D0 = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(o2Var);
        searchAutoComplete.setOnEditorActionListener(s2Var);
        searchAutoComplete.setOnItemClickListener(j0Var);
        searchAutoComplete.setOnItemSelectedListener(x1Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new q2(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.G0 = obtainStyledAttributes.getText(14);
        this.O0 = obtainStyledAttributes.getText(21);
        int i2 = obtainStyledAttributes.getInt(6, -1);
        if (i2 != -1) {
            setImeOptions(i2);
        }
        int i10 = obtainStyledAttributes.getInt(5, -1);
        if (i10 != -1) {
            setInputType(i10);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        c1Var.p();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.E0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.F0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.f973u0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new r2(0, this));
        }
        w(this.K0);
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
        SearchAutoComplete searchAutoComplete = this.f966m0;
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
        this.Q0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.f966m0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.Q0 = false;
    }

    public int getImeOptions() {
        return this.f966m0.getImeOptions();
    }

    public int getInputType() {
        return this.f966m0.getInputType();
    }

    public int getMaxWidth() {
        return this.R0;
    }

    public CharSequence getQuery() {
        return this.f966m0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.O0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.X0;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.X0.getHintId());
        }
        return this.G0;
    }

    public int getSuggestionCommitIconResId() {
        return this.D0;
    }

    public int getSuggestionRowLayout() {
        return this.C0;
    }

    public g6.b getSuggestionsAdapter() {
        return this.M0;
    }

    public final Intent j(String str, Uri uri, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.U0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.Y0;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.X0.getSearchActivity());
        return intent;
    }

    public final Intent k(Intent intent, SearchableInfo searchableInfo) {
        String str;
        String str2;
        String str3;
        int i2;
        ComponentName searchActivity = searchableInfo.getSearchActivity();
        Intent intent2 = new Intent("android.intent.action.SEARCH");
        intent2.setComponent(searchActivity);
        PendingIntent activity = PendingIntent.getActivity(getContext(), 0, intent2, 1107296256);
        Bundle bundle = new Bundle();
        Bundle bundle2 = this.Y0;
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
            i2 = searchableInfo.getVoiceMaxResults();
        } else {
            i2 = 1;
        }
        intent3.putExtra("android.speech.extra.LANGUAGE_MODEL", str);
        intent3.putExtra("android.speech.extra.PROMPT", str2);
        intent3.putExtra("android.speech.extra.LANGUAGE", str3);
        intent3.putExtra("android.speech.extra.MAX_RESULTS", i2);
        if (searchActivity != null) {
            str4 = searchActivity.flattenToShortString();
        }
        intent3.putExtra("calling_package", str4);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT", activity);
        intent3.putExtra("android.speech.extra.RESULTS_PENDINGINTENT_BUNDLE", bundle);
        return intent3;
    }

    public final void l() {
        int i2 = Build.VERSION.SDK_INT;
        SearchAutoComplete searchAutoComplete = this.f966m0;
        if (i2 >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        f fVar = f963c1;
        fVar.getClass();
        f.a();
        Method method = fVar.f4439a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        fVar.getClass();
        f.a();
        Method method2 = fVar.f4440b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.f966m0;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.K0) {
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

    public final void n(int i2) {
        int i10;
        Uri parse;
        String h2;
        Cursor cursor = this.M0.L;
        if (cursor != null && cursor.moveToPosition(i2)) {
            Intent intent = null;
            try {
                int i11 = z2.f12071r0;
                String h10 = z2.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h10 == null) {
                    h10 = this.X0.getSuggestIntentAction();
                }
                if (h10 == null) {
                    h10 = "android.intent.action.SEARCH";
                }
                String h11 = z2.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h11 == null) {
                    h11 = this.X0.getSuggestIntentData();
                }
                if (h11 != null && (h2 = z2.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h11 = h11 + "/" + Uri.encode(h2);
                }
                if (h11 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h11);
                }
                intent = j(h10, parse, z2.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), z2.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
            } catch (RuntimeException e6) {
                try {
                    i10 = cursor.getPosition();
                } catch (RuntimeException unused) {
                    i10 = -1;
                }
                Log.w("SearchView", "Search suggestions cursor at row " + i10 + " returned exception.", e6);
            }
            if (intent != null) {
                try {
                    getContext().startActivity(intent);
                } catch (RuntimeException e10) {
                    Log.e("SearchView", "Failed launch activity: " + intent, e10);
                }
            }
        }
        SearchAutoComplete searchAutoComplete = this.f966m0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i2) {
        Editable text = this.f966m0.getText();
        Cursor cursor = this.M0.L;
        if (cursor != null) {
            if (cursor.moveToPosition(i2)) {
                String c4 = this.M0.c(cursor);
                if (c4 != null) {
                    setQuery(c4);
                    return;
                } else {
                    setQuery(text);
                    return;
                }
            }
            setQuery(text);
        }
    }

    @Override // o.b
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.f966m0;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.U0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.W0);
        this.V0 = false;
    }

    @Override // o.b
    public final void onActionViewExpanded() {
        if (this.V0) {
            return;
        }
        this.V0 = true;
        SearchAutoComplete searchAutoComplete = this.f966m0;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.W0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.Z0);
        post(this.f964a1);
        super.onDetachedFromWindow();
    }

    @Override // q.w1, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z10, int i2, int i10, int i11, int i12) {
        super.onLayout(z10, i2, i10, i11, i12);
        if (z10) {
            SearchAutoComplete searchAutoComplete = this.f966m0;
            int[] iArr = this.f977y0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.f978z0;
            getLocationInWindow(iArr2);
            int i13 = iArr[1] - iArr2[1];
            int i14 = iArr[0] - iArr2[0];
            Rect rect = this.f975w0;
            rect.set(i14, i13, searchAutoComplete.getWidth() + i14, searchAutoComplete.getHeight() + i13);
            int i15 = rect.left;
            int i16 = rect.right;
            int i17 = i12 - i10;
            Rect rect2 = this.f976x0;
            rect2.set(i15, 0, i16, i17);
            x2 x2Var = this.f974v0;
            if (x2Var == null) {
                x2 x2Var2 = new x2(searchAutoComplete, rect2, rect);
                this.f974v0 = x2Var2;
                setTouchDelegate(x2Var2);
                return;
            }
            x2Var.f12054b.set(rect2);
            Rect rect3 = x2Var.f12056d;
            rect3.set(rect2);
            int i18 = -x2Var.f12057e;
            rect3.inset(i18, i18);
            x2Var.f12055c.set(rect);
        }
    }

    @Override // q.w1, android.view.View
    public final void onMeasure(int i2, int i10) {
        int i11;
        if (this.L0) {
            super.onMeasure(i2, i10);
            return;
        }
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i2);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i11 = this.R0) > 0) {
                    size = Math.min(i11, size);
                }
            } else {
                size = this.R0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i12 = this.R0;
            size = i12 > 0 ? Math.min(i12, size) : Math.min(getPreferredWidth(), size);
        }
        int mode2 = View.MeasureSpec.getMode(i10);
        int size2 = View.MeasureSpec.getSize(i10);
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
        if (!(parcelable instanceof w2)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        w2 w2Var = (w2) parcelable;
        super.onRestoreInstanceState(w2Var.A);
        w(w2Var.L);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [i6.b, android.os.Parcelable, q.w2] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? bVar = new i6.b(super.onSaveInstanceState());
        bVar.L = this.L0;
        return bVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z10) {
        super.onWindowFocusChanged(z10);
        post(this.Z0);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.f966m0;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.H0 != null) {
                text.toString();
                return;
            }
            if (this.X0 != null) {
                getContext().startActivity(j("android.intent.action.SEARCH", null, null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        int i2;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.f966m0.getText());
        if (isEmpty && (!this.K0 || this.V0)) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        ImageView imageView = this.f971s0;
        imageView.setVisibility(i2);
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
    public final boolean requestFocus(int i2, Rect rect) {
        if (this.Q0 || !isFocusable()) {
            return false;
        }
        if (!this.L0) {
            boolean requestFocus = this.f966m0.requestFocus(i2, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i2, rect);
    }

    public final void s() {
        int[] iArr;
        if (this.f966m0.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.f968o0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.p0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.Y0 = bundle;
    }

    public void setIconified(boolean z10) {
        if (z10) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.f966m0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.J0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z10) {
        if (this.K0 == z10) {
            return;
        }
        this.K0 = z10;
        w(z10);
        t();
    }

    public void setImeOptions(int i2) {
        this.f966m0.setImeOptions(i2);
    }

    public void setInputType(int i2) {
        this.f966m0.setInputType(i2);
    }

    public void setMaxWidth(int i2) {
        this.R0 = i2;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.I0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(u2 u2Var) {
        this.H0 = u2Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.J0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.O0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z10) {
        int i2;
        this.P0 = z10;
        g6.b bVar = this.M0;
        if (bVar instanceof z2) {
            z2 z2Var = (z2) bVar;
            if (z10) {
                i2 = 2;
            } else {
                i2 = 1;
            }
            z2Var.f12080j0 = i2;
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
            r6.X0 = r7
            r0 = 0
            r1 = 1
            androidx.appcompat.widget.SearchView$SearchAutoComplete r2 = r6.f966m0
            if (r7 == 0) goto L65
            int r7 = r7.getSuggestThreshold()
            r2.setThreshold(r7)
            android.app.SearchableInfo r7 = r6.X0
            int r7 = r7.getImeOptions()
            r2.setImeOptions(r7)
            android.app.SearchableInfo r7 = r6.X0
            int r7 = r7.getInputType()
            r3 = r7 & 15
            if (r3 != r1) goto L31
            r3 = -65537(0xfffffffffffeffff, float:NaN)
            r7 = r7 & r3
            android.app.SearchableInfo r3 = r6.X0
            java.lang.String r3 = r3.getSuggestAuthority()
            if (r3 == 0) goto L31
            r3 = 589824(0x90000, float:8.2652E-40)
            r7 = r7 | r3
        L31:
            r2.setInputType(r7)
            g6.b r7 = r6.M0
            if (r7 == 0) goto L3b
            r7.b(r0)
        L3b:
            android.app.SearchableInfo r7 = r6.X0
            java.lang.String r7 = r7.getSuggestAuthority()
            if (r7 == 0) goto L62
            q.z2 r7 = new q.z2
            android.content.Context r3 = r6.getContext()
            android.app.SearchableInfo r4 = r6.X0
            java.util.WeakHashMap r5 = r6.f965b1
            r7.<init>(r3, r6, r4, r5)
            r6.M0 = r7
            r2.setAdapter(r7)
            g6.b r7 = r6.M0
            q.z2 r7 = (q.z2) r7
            boolean r3 = r6.P0
            if (r3 == 0) goto L5f
            r3 = 2
            goto L60
        L5f:
            r3 = r1
        L60:
            r7.f12080j0 = r3
        L62:
            r6.t()
        L65:
            android.app.SearchableInfo r7 = r6.X0
            r3 = 0
            if (r7 == 0) goto L98
            boolean r7 = r7.getVoiceSearchEnabled()
            if (r7 == 0) goto L98
            android.app.SearchableInfo r7 = r6.X0
            boolean r7 = r7.getVoiceSearchLaunchWebSearch()
            if (r7 == 0) goto L7b
            android.content.Intent r0 = r6.E0
            goto L85
        L7b:
            android.app.SearchableInfo r7 = r6.X0
            boolean r7 = r7.getVoiceSearchLaunchRecognizer()
            if (r7 == 0) goto L85
            android.content.Intent r0 = r6.F0
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
            r6.S0 = r1
            if (r1 == 0) goto La2
            java.lang.String r7 = "nm"
            r2.setPrivateImeOptions(r7)
        La2:
            boolean r7 = r6.L0
            r6.w(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.SearchView.setSearchableInfo(android.app.SearchableInfo):void");
    }

    public void setSubmitButtonEnabled(boolean z10) {
        this.N0 = z10;
        w(this.L0);
    }

    public void setSuggestionsAdapter(g6.b bVar) {
        this.M0 = bVar;
        this.f966m0.setAdapter(bVar);
    }

    public final void t() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z10 = this.K0;
        SearchAutoComplete searchAutoComplete = this.f966m0;
        if (z10 && (drawable = this.B0) != null) {
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
        int i2;
        if ((this.N0 || this.S0) && !this.L0 && (this.f970r0.getVisibility() == 0 || this.f972t0.getVisibility() == 0)) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.p0.setVisibility(i2);
    }

    public final void v(boolean z10) {
        int i2;
        boolean z11 = this.N0;
        if (z11 && ((z11 || this.S0) && !this.L0 && hasFocus() && (z10 || !this.S0))) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        this.f970r0.setVisibility(i2);
    }

    public final void w(boolean z10) {
        int i2;
        int i10;
        int i11;
        this.L0 = z10;
        int i12 = 8;
        if (z10) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.f966m0.getText());
        this.f969q0.setVisibility(i2);
        v(!isEmpty);
        if (z10) {
            i10 = 8;
        } else {
            i10 = 0;
        }
        this.f967n0.setVisibility(i10);
        ImageView imageView = this.A0;
        if (imageView.getDrawable() != null && !this.K0) {
            i11 = 0;
        } else {
            i11 = 8;
        }
        imageView.setVisibility(i11);
        r();
        if (this.S0 && !this.L0 && isEmpty) {
            this.f970r0.setVisibility(8);
            i12 = 0;
        }
        this.f972t0.setVisibility(i12);
        u();
    }

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends n {

        /* renamed from: b0  reason: collision with root package name */
        public int f979b0;

        /* renamed from: c0  reason: collision with root package name */
        public SearchView f980c0;

        /* renamed from: d0  reason: collision with root package name */
        public boolean f981d0;

        /* renamed from: e0  reason: collision with root package name */
        public final d f982e0;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f982e0 = new d(this);
            this.f979b0 = getThreshold();
        }

        private int getSearchViewTextMinWidthDp() {
            Configuration configuration = getResources().getConfiguration();
            int i2 = configuration.screenWidthDp;
            int i10 = configuration.screenHeightDp;
            if (i2 >= 960 && i10 >= 720 && configuration.orientation == 2) {
                return 256;
            }
            if (i2 < 600) {
                if (i2 < 640 || i10 < 480) {
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
            f fVar = SearchView.f963c1;
            fVar.getClass();
            f.a();
            Method method = fVar.f4441c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.f979b0 > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // q.n, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f981d0) {
                d dVar = this.f982e0;
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
        public final void onFocusChanged(boolean z10, int i2, Rect rect) {
            super.onFocusChanged(z10, i2, rect);
            SearchView searchView = this.f980c0;
            searchView.w(searchView.L0);
            searchView.post(searchView.Z0);
            if (searchView.f966m0.hasFocus()) {
                searchView.l();
            }
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final boolean onKeyPreIme(int i2, KeyEvent keyEvent) {
            if (i2 == 4) {
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
                        this.f980c0.clearFocus();
                        setImeVisibility(false);
                        return true;
                    }
                }
            }
            return super.onKeyPreIme(i2, keyEvent);
        }

        @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
        public final void onWindowFocusChanged(boolean z10) {
            super.onWindowFocusChanged(z10);
            if (z10 && this.f980c0.hasFocus() && getVisibility() == 0) {
                this.f981d0 = true;
                Context context = getContext();
                f fVar = SearchView.f963c1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z10) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.f982e0;
            if (!z10) {
                this.f981d0 = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f981d0 = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f981d0 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.f980c0 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i2) {
            super.setThreshold(i2);
            this.f979b0 = i2;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(t2 t2Var) {
    }

    public void setOnSuggestionListener(v2 v2Var) {
    }
}

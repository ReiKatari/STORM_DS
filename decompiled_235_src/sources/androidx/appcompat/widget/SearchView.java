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
import com.stormds.emulator.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class SearchView extends dv3 implements zs0 {
    public static final f74 e1;
    public final int[] A0;
    public final int[] B0;
    public final ImageView C0;
    public final Drawable D0;
    public final int E0;
    public final int F0;
    public final Intent G0;
    public final Intent H0;
    public final CharSequence I0;
    public t86 J0;
    public View.OnFocusChangeListener K0;
    public View.OnClickListener L0;
    public boolean M0;
    public boolean N0;
    public z71 O0;
    public boolean P0;
    public CharSequence Q0;
    public boolean R0;
    public boolean S0;
    public int T0;
    public boolean U0;
    public String V0;
    public CharSequence W0;
    public boolean X0;
    public int Y0;
    public SearchableInfo Z0;
    public Bundle a1;
    public final p86 b1;
    public final p86 c1;
    public final WeakHashMap d1;
    public final SearchAutoComplete o0;
    public final View p0;
    public final View q0;
    public final View r0;
    public final ImageView s0;
    public final ImageView t0;
    public final ImageView u0;
    public final ImageView v0;
    public final View w0;
    public w86 x0;
    public final Rect y0;
    public final Rect z0;

    /* JADX WARN: Type inference failed for: r0v1, types: [f74, java.lang.Object] */
    static {
        f74 f74Var = null;
        if (Build.VERSION.SDK_INT < 29) {
            ?? obj = new Object();
            obj.a = null;
            obj.b = null;
            obj.c = null;
            f74.a();
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
            f74Var = obj;
        }
        e1 = f74Var;
    }

    public SearchView(Context context) {
        super(context, null, R.attr.searchViewStyle);
        this.y0 = new Rect();
        this.z0 = new Rect();
        this.A0 = new int[2];
        this.B0 = new int[2];
        this.b1 = new p86(this, 0);
        this.c1 = new p86(this, 1);
        this.d1 = new WeakHashMap();
        a aVar = new a(this);
        b bVar = new b(this);
        r86 r86Var = new r86(this);
        as asVar = new as(this, 2);
        np1 np1Var = new np1(this, 3);
        o86 o86Var = new o86(this);
        int[] iArr = m75.u;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, iArr, R.attr.searchViewStyle, 0);
        m44 m44Var = new m44(context, obtainStyledAttributes);
        ao7.m(this, context, iArr, null, obtainStyledAttributes, R.attr.searchViewStyle);
        LayoutInflater.from(context).inflate(obtainStyledAttributes.getResourceId(19, R.layout.abc_search_view), (ViewGroup) this, true);
        SearchAutoComplete searchAutoComplete = (SearchAutoComplete) findViewById(R.id.search_src_text);
        this.o0 = searchAutoComplete;
        searchAutoComplete.setSearchView(this);
        this.p0 = findViewById(R.id.search_edit_frame);
        View findViewById = findViewById(R.id.search_plate);
        this.q0 = findViewById;
        View findViewById2 = findViewById(R.id.submit_area);
        this.r0 = findViewById2;
        ImageView imageView = (ImageView) findViewById(R.id.search_button);
        this.s0 = imageView;
        ImageView imageView2 = (ImageView) findViewById(R.id.search_go_btn);
        this.t0 = imageView2;
        ImageView imageView3 = (ImageView) findViewById(R.id.search_close_btn);
        this.u0 = imageView3;
        ImageView imageView4 = (ImageView) findViewById(R.id.search_voice_btn);
        this.v0 = imageView4;
        ImageView imageView5 = (ImageView) findViewById(R.id.search_mag_icon);
        this.C0 = imageView5;
        findViewById.setBackground(m44Var.k(20));
        findViewById2.setBackground(m44Var.k(25));
        imageView.setImageDrawable(m44Var.k(23));
        imageView2.setImageDrawable(m44Var.k(15));
        imageView3.setImageDrawable(m44Var.k(12));
        imageView4.setImageDrawable(m44Var.k(28));
        imageView5.setImageDrawable(m44Var.k(23));
        this.D0 = m44Var.k(22);
        bl2.R(imageView, getResources().getString(R.string.abc_searchview_description_search));
        this.E0 = obtainStyledAttributes.getResourceId(26, R.layout.abc_search_dropdown_item_icons_2line);
        this.F0 = obtainStyledAttributes.getResourceId(13, 0);
        imageView.setOnClickListener(aVar);
        imageView3.setOnClickListener(aVar);
        imageView2.setOnClickListener(aVar);
        imageView4.setOnClickListener(aVar);
        searchAutoComplete.setOnClickListener(aVar);
        searchAutoComplete.addTextChangedListener(o86Var);
        searchAutoComplete.setOnEditorActionListener(r86Var);
        searchAutoComplete.setOnItemClickListener(asVar);
        searchAutoComplete.setOnItemSelectedListener(np1Var);
        searchAutoComplete.setOnKeyListener(bVar);
        searchAutoComplete.setOnFocusChangeListener(new q86(this));
        setIconifiedByDefault(obtainStyledAttributes.getBoolean(18, true));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        if (dimensionPixelSize != -1) {
            setMaxWidth(dimensionPixelSize);
        }
        this.I0 = obtainStyledAttributes.getText(14);
        this.Q0 = obtainStyledAttributes.getText(21);
        int i = obtainStyledAttributes.getInt(6, -1);
        if (i != -1) {
            setImeOptions(i);
        }
        int i2 = obtainStyledAttributes.getInt(5, -1);
        if (i2 != -1) {
            setInputType(i2);
        }
        setFocusable(obtainStyledAttributes.getBoolean(1, true));
        m44Var.D();
        Intent intent = new Intent("android.speech.action.WEB_SEARCH");
        this.G0 = intent;
        intent.addFlags(268435456);
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "web_search");
        Intent intent2 = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        this.H0 = intent2;
        intent2.addFlags(268435456);
        View findViewById3 = findViewById(searchAutoComplete.getDropDownAnchor());
        this.w0 = findViewById3;
        if (findViewById3 != null) {
            findViewById3.addOnLayoutChangeListener(new d60(this, 1));
        }
        w(this.M0);
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
        SearchAutoComplete searchAutoComplete = this.o0;
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
        this.S0 = true;
        super.clearFocus();
        SearchAutoComplete searchAutoComplete = this.o0;
        searchAutoComplete.clearFocus();
        searchAutoComplete.setImeVisibility(false);
        this.S0 = false;
    }

    public int getImeOptions() {
        return this.o0.getImeOptions();
    }

    public int getInputType() {
        return this.o0.getInputType();
    }

    public int getMaxWidth() {
        return this.T0;
    }

    public CharSequence getQuery() {
        return this.o0.getText();
    }

    public CharSequence getQueryHint() {
        CharSequence charSequence = this.Q0;
        if (charSequence != null) {
            return charSequence;
        }
        SearchableInfo searchableInfo = this.Z0;
        if (searchableInfo != null && searchableInfo.getHintId() != 0) {
            return getContext().getText(this.Z0.getHintId());
        }
        return this.I0;
    }

    public int getSuggestionCommitIconResId() {
        return this.F0;
    }

    public int getSuggestionRowLayout() {
        return this.E0;
    }

    public z71 getSuggestionsAdapter() {
        return this.O0;
    }

    public final Intent j(Uri uri, String str, String str2, String str3) {
        Intent intent = new Intent(str);
        intent.addFlags(268435456);
        if (uri != null) {
            intent.setData(uri);
        }
        intent.putExtra("user_query", this.W0);
        if (str3 != null) {
            intent.putExtra("query", str3);
        }
        if (str2 != null) {
            intent.putExtra("intent_extra_data_key", str2);
        }
        Bundle bundle = this.a1;
        if (bundle != null) {
            intent.putExtra("app_data", bundle);
        }
        intent.setComponent(this.Z0.getSearchActivity());
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
        Bundle bundle2 = this.a1;
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
        SearchAutoComplete searchAutoComplete = this.o0;
        if (i >= 29) {
            c.a(searchAutoComplete);
            return;
        }
        f74 f74Var = e1;
        f74Var.getClass();
        f74.a();
        Method method = f74Var.a;
        if (method != null) {
            try {
                method.invoke(searchAutoComplete, null);
            } catch (Exception unused) {
            }
        }
        f74Var.getClass();
        f74.a();
        Method method2 = f74Var.b;
        if (method2 != null) {
            try {
                method2.invoke(searchAutoComplete, null);
            } catch (Exception unused2) {
            }
        }
    }

    public final void m() {
        SearchAutoComplete searchAutoComplete = this.o0;
        if (TextUtils.isEmpty(searchAutoComplete.getText())) {
            if (this.M0) {
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
        Cursor cursor = this.O0.L;
        if (cursor != null && cursor.moveToPosition(i)) {
            Intent intent = null;
            try {
                int i3 = du6.t0;
                String h2 = du6.h(cursor, cursor.getColumnIndex("suggest_intent_action"));
                if (h2 == null) {
                    h2 = this.Z0.getSuggestIntentAction();
                }
                if (h2 == null) {
                    h2 = "android.intent.action.SEARCH";
                }
                String h3 = du6.h(cursor, cursor.getColumnIndex("suggest_intent_data"));
                if (h3 == null) {
                    h3 = this.Z0.getSuggestIntentData();
                }
                if (h3 != null && (h = du6.h(cursor, cursor.getColumnIndex("suggest_intent_data_id"))) != null) {
                    h3 = h3 + "/" + Uri.encode(h);
                }
                if (h3 == null) {
                    parse = null;
                } else {
                    parse = Uri.parse(h3);
                }
                intent = j(parse, h2, du6.h(cursor, cursor.getColumnIndex("suggest_intent_extra_data")), du6.h(cursor, cursor.getColumnIndex("suggest_intent_query")));
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
        SearchAutoComplete searchAutoComplete = this.o0;
        searchAutoComplete.setImeVisibility(false);
        searchAutoComplete.dismissDropDown();
    }

    public final void o(int i) {
        Editable text = this.o0.getText();
        Cursor cursor = this.O0.L;
        if (cursor != null) {
            if (cursor.moveToPosition(i)) {
                String c = this.O0.c(cursor);
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

    @Override // defpackage.zs0
    public final void onActionViewCollapsed() {
        SearchAutoComplete searchAutoComplete = this.o0;
        searchAutoComplete.setText("");
        searchAutoComplete.setSelection(searchAutoComplete.length());
        this.W0 = "";
        clearFocus();
        w(true);
        searchAutoComplete.setImeOptions(this.Y0);
        this.X0 = false;
    }

    @Override // defpackage.zs0
    public final void onActionViewExpanded() {
        if (this.X0) {
            return;
        }
        this.X0 = true;
        SearchAutoComplete searchAutoComplete = this.o0;
        int imeOptions = searchAutoComplete.getImeOptions();
        this.Y0 = imeOptions;
        searchAutoComplete.setImeOptions(imeOptions | 33554432);
        searchAutoComplete.setText("");
        setIconified(false);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        removeCallbacks(this.b1);
        post(this.c1);
        super.onDetachedFromWindow();
    }

    @Override // defpackage.dv3, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z) {
            SearchAutoComplete searchAutoComplete = this.o0;
            int[] iArr = this.A0;
            searchAutoComplete.getLocationInWindow(iArr);
            int[] iArr2 = this.B0;
            getLocationInWindow(iArr2);
            int i5 = iArr[1] - iArr2[1];
            int i6 = iArr[0] - iArr2[0];
            Rect rect = this.y0;
            rect.set(i6, i5, searchAutoComplete.getWidth() + i6, searchAutoComplete.getHeight() + i5);
            int i7 = rect.left;
            int i8 = rect.right;
            int i9 = i4 - i2;
            Rect rect2 = this.z0;
            rect2.set(i7, 0, i8, i9);
            w86 w86Var = this.x0;
            if (w86Var == null) {
                w86 w86Var2 = new w86(searchAutoComplete, rect2, rect);
                this.x0 = w86Var2;
                setTouchDelegate(w86Var2);
                return;
            }
            w86Var.b.set(rect2);
            Rect rect3 = w86Var.d;
            rect3.set(rect2);
            int i10 = -w86Var.e;
            rect3.inset(i10, i10);
            w86Var.c.set(rect);
        }
    }

    @Override // defpackage.dv3, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        if (this.N0) {
            super.onMeasure(i, i2);
            return;
        }
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        if (mode != Integer.MIN_VALUE) {
            if (mode != 0) {
                if (mode == 1073741824 && (i3 = this.T0) > 0) {
                    size = Math.min(i3, size);
                }
            } else {
                size = this.T0;
                if (size <= 0) {
                    size = getPreferredWidth();
                }
            }
        } else {
            int i4 = this.T0;
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
        if (!(parcelable instanceof v86)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        v86 v86Var = (v86) parcelable;
        super.onRestoreInstanceState(v86Var.A);
        w(v86Var.L);
        requestLayout();
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [s, android.os.Parcelable, v86] */
    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        ?? sVar = new s(super.onSaveInstanceState());
        sVar.L = this.N0;
        return sVar;
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        post(this.b1);
    }

    public final void p(CharSequence charSequence) {
        setQuery(charSequence);
    }

    public final void q() {
        SearchAutoComplete searchAutoComplete = this.o0;
        Editable text = searchAutoComplete.getText();
        if (text != null && TextUtils.getTrimmedLength(text) > 0) {
            if (this.J0 != null) {
                text.toString();
                return;
            }
            if (this.Z0 != null) {
                getContext().startActivity(j(null, "android.intent.action.SEARCH", null, text.toString()));
            }
            searchAutoComplete.setImeVisibility(false);
            searchAutoComplete.dismissDropDown();
        }
    }

    public final void r() {
        int i;
        int[] iArr;
        boolean isEmpty = TextUtils.isEmpty(this.o0.getText());
        if (isEmpty && (!this.M0 || this.X0)) {
            i = 8;
        } else {
            i = 0;
        }
        ImageView imageView = this.u0;
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
        if (this.S0 || !isFocusable()) {
            return false;
        }
        if (!this.N0) {
            boolean requestFocus = this.o0.requestFocus(i, rect);
            if (requestFocus) {
                w(false);
            }
            return requestFocus;
        }
        return super.requestFocus(i, rect);
    }

    public final void s() {
        int[] iArr;
        if (this.o0.hasFocus()) {
            iArr = ViewGroup.FOCUSED_STATE_SET;
        } else {
            iArr = ViewGroup.EMPTY_STATE_SET;
        }
        Drawable background = this.q0.getBackground();
        if (background != null) {
            background.setState(iArr);
        }
        Drawable background2 = this.r0.getBackground();
        if (background2 != null) {
            background2.setState(iArr);
        }
        invalidate();
    }

    public void setAppSearchData(Bundle bundle) {
        this.a1 = bundle;
    }

    public void setIconified(boolean z) {
        if (z) {
            m();
            return;
        }
        w(false);
        SearchAutoComplete searchAutoComplete = this.o0;
        searchAutoComplete.requestFocus();
        searchAutoComplete.setImeVisibility(true);
        View.OnClickListener onClickListener = this.L0;
        if (onClickListener != null) {
            onClickListener.onClick(this);
        }
    }

    public void setIconifiedByDefault(boolean z) {
        if (this.M0 == z) {
            return;
        }
        this.M0 = z;
        w(z);
        t();
    }

    public void setImeOptions(int i) {
        this.o0.setImeOptions(i);
    }

    public void setInputType(int i) {
        this.o0.setInputType(i);
    }

    public void setMaxWidth(int i) {
        this.T0 = i;
        requestLayout();
    }

    public void setOnQueryTextFocusChangeListener(View.OnFocusChangeListener onFocusChangeListener) {
        this.K0 = onFocusChangeListener;
    }

    public void setOnQueryTextListener(t86 t86Var) {
        this.J0 = t86Var;
    }

    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.L0 = onClickListener;
    }

    public void setQueryHint(CharSequence charSequence) {
        this.Q0 = charSequence;
        t();
    }

    public void setQueryRefinementEnabled(boolean z) {
        int i;
        this.R0 = z;
        z71 z71Var = this.O0;
        if (z71Var instanceof du6) {
            du6 du6Var = (du6) z71Var;
            if (z) {
                i = 2;
            } else {
                i = 1;
            }
            du6Var.l0 = i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0095, code lost:
        if (getContext().getPackageManager().resolveActivity(r0, 65536) != null) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void setSearchableInfo(SearchableInfo searchableInfo) {
        int i;
        this.Z0 = searchableInfo;
        Intent intent = null;
        boolean z = true;
        SearchAutoComplete searchAutoComplete = this.o0;
        if (searchableInfo != null) {
            searchAutoComplete.setThreshold(searchableInfo.getSuggestThreshold());
            searchAutoComplete.setImeOptions(this.Z0.getImeOptions());
            int inputType = this.Z0.getInputType();
            if ((inputType & 15) == 1) {
                inputType &= -65537;
                if (this.Z0.getSuggestAuthority() != null) {
                    inputType |= 589824;
                }
            }
            searchAutoComplete.setInputType(inputType);
            z71 z71Var = this.O0;
            if (z71Var != null) {
                z71Var.b(null);
            }
            if (this.Z0.getSuggestAuthority() != null) {
                du6 du6Var = new du6(getContext(), this, this.Z0, this.d1);
                this.O0 = du6Var;
                searchAutoComplete.setAdapter(du6Var);
                du6 du6Var2 = (du6) this.O0;
                if (this.R0) {
                    i = 2;
                } else {
                    i = 1;
                }
                du6Var2.l0 = i;
            }
            t();
        }
        SearchableInfo searchableInfo2 = this.Z0;
        if (searchableInfo2 != null && searchableInfo2.getVoiceSearchEnabled()) {
            if (this.Z0.getVoiceSearchLaunchWebSearch()) {
                intent = this.G0;
            } else if (this.Z0.getVoiceSearchLaunchRecognizer()) {
                intent = this.H0;
            }
            if (intent != null) {
            }
        }
        z = false;
        this.U0 = z;
        if (z) {
            searchAutoComplete.setPrivateImeOptions("nm");
        }
        w(this.N0);
    }

    public void setSubmitButtonEnabled(boolean z) {
        this.P0 = z;
        w(this.N0);
    }

    public void setSuggestionsAdapter(z71 z71Var) {
        this.O0 = z71Var;
        this.o0.setAdapter(z71Var);
    }

    public final void t() {
        Drawable drawable;
        SpannableStringBuilder queryHint = getQueryHint();
        if (queryHint == null) {
            queryHint = "";
        }
        boolean z = this.M0;
        SearchAutoComplete searchAutoComplete = this.o0;
        if (z && (drawable = this.D0) != null) {
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
        if ((this.P0 || this.U0) && !this.N0 && (this.t0.getVisibility() == 0 || this.v0.getVisibility() == 0)) {
            i = 0;
        } else {
            i = 8;
        }
        this.r0.setVisibility(i);
    }

    public final void v(boolean z) {
        int i;
        boolean z2 = this.P0;
        if (z2 && ((z2 || this.U0) && !this.N0 && hasFocus() && (z || !this.U0))) {
            i = 0;
        } else {
            i = 8;
        }
        this.t0.setVisibility(i);
    }

    public final void w(boolean z) {
        int i;
        int i2;
        int i3;
        this.N0 = z;
        int i4 = 8;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        boolean isEmpty = TextUtils.isEmpty(this.o0.getText());
        this.s0.setVisibility(i);
        v(!isEmpty);
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        this.p0.setVisibility(i2);
        ImageView imageView = this.C0;
        if (imageView.getDrawable() != null && !this.M0) {
            i3 = 0;
        } else {
            i3 = 8;
        }
        imageView.setVisibility(i3);
        r();
        if (this.U0 && !this.N0 && isEmpty) {
            this.t0.setVisibility(8);
            i4 = 0;
        }
        this.v0.setVisibility(i4);
        u();
    }

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* loaded from: classes.dex */
    public static class SearchAutoComplete extends kq {
        public int d0;
        public SearchView e0;
        public boolean f0;
        public final d g0;

        public SearchAutoComplete(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.g0 = new d(this);
            this.d0 = getThreshold();
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
            f74 f74Var = SearchView.e1;
            f74Var.getClass();
            f74.a();
            Method method = f74Var.c;
            if (method != null) {
                try {
                    method.invoke(this, Boolean.TRUE);
                } catch (Exception unused) {
                }
            }
        }

        @Override // android.widget.AutoCompleteTextView
        public final boolean enoughToFilter() {
            if (this.d0 > 0 && !super.enoughToFilter()) {
                return false;
            }
            return true;
        }

        @Override // defpackage.kq, android.widget.TextView, android.view.View
        public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
            InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
            if (this.f0) {
                d dVar = this.g0;
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
            SearchView searchView = this.e0;
            searchView.w(searchView.N0);
            searchView.post(searchView.b1);
            if (searchView.o0.hasFocus()) {
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
                        this.e0.clearFocus();
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
            if (z && this.e0.hasFocus() && getVisibility() == 0) {
                this.f0 = true;
                Context context = getContext();
                f74 f74Var = SearchView.e1;
                if (context.getResources().getConfiguration().orientation == 2) {
                    a();
                }
            }
        }

        public void setImeVisibility(boolean z) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            d dVar = this.g0;
            if (!z) {
                this.f0 = false;
                removeCallbacks(dVar);
                inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
            } else if (inputMethodManager.isActive(this)) {
                this.f0 = false;
                removeCallbacks(dVar);
                inputMethodManager.showSoftInput(this, 0);
            } else {
                this.f0 = true;
            }
        }

        public void setSearchView(SearchView searchView) {
            this.e0 = searchView;
        }

        @Override // android.widget.AutoCompleteTextView
        public void setThreshold(int i) {
            super.setThreshold(i);
            this.d0 = i;
        }

        @Override // android.widget.AutoCompleteTextView
        public final void performCompletion() {
        }

        @Override // android.widget.AutoCompleteTextView
        public final void replaceText(CharSequence charSequence) {
        }
    }

    public void setOnCloseListener(s86 s86Var) {
    }

    public void setOnSuggestionListener(u86 u86Var) {
    }
}

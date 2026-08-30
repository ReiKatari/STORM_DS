package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public class Preference implements Comparable<Preference> {
    private static final String CLIPBOARD_ID = "Preference";
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    private boolean mAllowDividerAbove;
    private boolean mAllowDividerBelow;
    private boolean mBaseMethodCalled;
    private final View.OnClickListener mClickListener;
    private final Context mContext;
    private boolean mCopyingEnabled;
    private Object mDefaultValue;
    private String mDependencyKey;
    private boolean mDependencyMet;
    private List<Preference> mDependents;
    private boolean mEnabled;
    private Bundle mExtras;
    private String mFragment;
    private boolean mHasId;
    private boolean mHasSingleLineTitleAttr;
    private Drawable mIcon;
    private int mIconResId;
    private boolean mIconSpaceReserved;
    private long mId;
    private Intent mIntent;
    private String mKey;
    private int mLayoutResId;
    private n mListener;
    private o mOnChangeListener;
    private p mOnClickListener;
    private q mOnCopyListener;
    private int mOrder;
    private boolean mParentDependencyMet;
    private PreferenceGroup mParentGroup;
    private boolean mPersistent;
    private s mPreferenceDataStore;
    private f0 mPreferenceManager;
    private boolean mRequiresKey;
    private boolean mSelectable;
    private boolean mShouldDisableView;
    private boolean mSingleLineTitle;
    private CharSequence mSummary;
    private r mSummaryProvider;
    private CharSequence mTitle;
    private int mViewId;
    private boolean mVisible;
    private boolean mWasDetached;
    private int mWidgetLayoutResId;

    public Preference(Context context, AttributeSet attributeSet, int i2, int i10) {
        this.mOrder = DEFAULT_ORDER;
        this.mViewId = 0;
        this.mEnabled = true;
        this.mSelectable = true;
        this.mPersistent = true;
        this.mDependencyMet = true;
        this.mParentDependencyMet = true;
        this.mVisible = true;
        this.mAllowDividerAbove = true;
        this.mAllowDividerBelow = true;
        this.mSingleLineTitle = true;
        this.mShouldDisableView = true;
        this.mLayoutResId = R.layout.preference;
        this.mClickListener = new l(this);
        this.mContext = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j0.f1577g, i2, i10);
        this.mIconResId = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        String string = obtainStyledAttributes.getString(26);
        this.mKey = string == null ? obtainStyledAttributes.getString(6) : string;
        CharSequence text = obtainStyledAttributes.getText(34);
        this.mTitle = text == null ? obtainStyledAttributes.getText(4) : text;
        CharSequence text2 = obtainStyledAttributes.getText(33);
        this.mSummary = text2 == null ? obtainStyledAttributes.getText(7) : text2;
        this.mOrder = obtainStyledAttributes.getInt(28, obtainStyledAttributes.getInt(8, DEFAULT_ORDER));
        String string2 = obtainStyledAttributes.getString(22);
        this.mFragment = string2 == null ? obtainStyledAttributes.getString(13) : string2;
        this.mLayoutResId = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.mWidgetLayoutResId = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.mEnabled = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        this.mSelectable = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.mPersistent = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        String string3 = obtainStyledAttributes.getString(19);
        this.mDependencyKey = string3 == null ? obtainStyledAttributes.getString(10) : string3;
        this.mAllowDividerAbove = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, this.mSelectable));
        this.mAllowDividerBelow = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, this.mSelectable));
        if (obtainStyledAttributes.hasValue(18)) {
            this.mDefaultValue = onGetDefaultValue(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.mDefaultValue = onGetDefaultValue(obtainStyledAttributes, 11);
        }
        this.mShouldDisableView = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.mHasSingleLineTitleAttr = hasValue;
        if (hasValue) {
            this.mSingleLineTitle = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.mIconSpaceReserved = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.mVisible = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.mCopyingEnabled = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }

    public static void b(View view, boolean z10) {
        view.setEnabled(z10);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                b(viewGroup.getChildAt(childCount), z10);
            }
        }
    }

    public final void a() {
        if (TextUtils.isEmpty(this.mDependencyKey)) {
            return;
        }
        Preference findPreferenceInHierarchy = findPreferenceInHierarchy(this.mDependencyKey);
        if (findPreferenceInHierarchy != null) {
            if (findPreferenceInHierarchy.mDependents == null) {
                findPreferenceInHierarchy.mDependents = new ArrayList();
            }
            findPreferenceInHierarchy.mDependents.add(this);
            onDependencyChanged(findPreferenceInHierarchy, findPreferenceInHierarchy.shouldDisableDependents());
            return;
        }
        String str = this.mDependencyKey;
        String str2 = this.mKey;
        CharSequence charSequence = this.mTitle;
        throw new IllegalStateException("Dependency \"" + str + "\" not found for preference \"" + str2 + "\" (title: \"" + ((Object) charSequence) + "\"");
    }

    public void assignParent(PreferenceGroup preferenceGroup) {
        if (preferenceGroup != null && this.mParentGroup != null) {
            a0.j.p("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        } else {
            this.mParentGroup = preferenceGroup;
        }
    }

    public final void c(SharedPreferences.Editor editor) {
        if (!this.mPreferenceManager.f1555e) {
            editor.apply();
        }
    }

    public boolean callChangeListener(Object obj) {
        o oVar = this.mOnChangeListener;
        if (oVar != null && !oVar.a(this, obj)) {
            return false;
        }
        return true;
    }

    public final void clearWasDetached() {
        this.mWasDetached = false;
    }

    @Override // java.lang.Comparable
    public int compareTo(Preference preference) {
        int i2 = this.mOrder;
        int i10 = preference.mOrder;
        if (i2 != i10) {
            return i2 - i10;
        }
        CharSequence charSequence = this.mTitle;
        CharSequence charSequence2 = preference.mTitle;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.mTitle.toString());
    }

    public final void d() {
        Preference findPreferenceInHierarchy;
        List<Preference> list;
        String str = this.mDependencyKey;
        if (str != null && (findPreferenceInHierarchy = findPreferenceInHierarchy(str)) != null && (list = findPreferenceInHierarchy.mDependents) != null) {
            list.remove(this);
        }
    }

    public void dispatchRestoreInstanceState(Bundle bundle) {
        Parcelable parcelable;
        if (hasKey() && (parcelable = bundle.getParcelable(this.mKey)) != null) {
            this.mBaseMethodCalled = false;
            onRestoreInstanceState(parcelable);
            if (!this.mBaseMethodCalled) {
                a0.j.p("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    public void dispatchSaveInstanceState(Bundle bundle) {
        if (hasKey()) {
            this.mBaseMethodCalled = false;
            Parcelable onSaveInstanceState = onSaveInstanceState();
            if (this.mBaseMethodCalled) {
                if (onSaveInstanceState != null) {
                    bundle.putParcelable(this.mKey, onSaveInstanceState);
                    return;
                }
                return;
            }
            a0.j.p("Derived class did not call super.onSaveInstanceState()");
        }
    }

    public <T extends Preference> T findPreferenceInHierarchy(String str) {
        PreferenceScreen preferenceScreen;
        f0 f0Var = this.mPreferenceManager;
        if (f0Var == null || (preferenceScreen = f0Var.f1557g) == null) {
            return null;
        }
        return (T) preferenceScreen.f(str);
    }

    public Context getContext() {
        return this.mContext;
    }

    public String getDependency() {
        return this.mDependencyKey;
    }

    public Bundle getExtras() {
        if (this.mExtras == null) {
            this.mExtras = new Bundle();
        }
        return this.mExtras;
    }

    public StringBuilder getFilterableStringBuilder() {
        StringBuilder sb2 = new StringBuilder();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            sb2.append(title);
            sb2.append(' ');
        }
        CharSequence summary = getSummary();
        if (!TextUtils.isEmpty(summary)) {
            sb2.append(summary);
            sb2.append(' ');
        }
        if (sb2.length() > 0) {
            sb2.setLength(sb2.length() - 1);
        }
        return sb2;
    }

    public String getFragment() {
        return this.mFragment;
    }

    public Drawable getIcon() {
        int i2;
        if (this.mIcon == null && (i2 = this.mIconResId) != 0) {
            this.mIcon = k7.w.p(this.mContext, i2);
        }
        return this.mIcon;
    }

    public long getId() {
        return this.mId;
    }

    public Intent getIntent() {
        return this.mIntent;
    }

    public String getKey() {
        return this.mKey;
    }

    public final int getLayoutResource() {
        return this.mLayoutResId;
    }

    public o getOnPreferenceChangeListener() {
        return this.mOnChangeListener;
    }

    public p getOnPreferenceClickListener() {
        return this.mOnClickListener;
    }

    public int getOrder() {
        return this.mOrder;
    }

    public PreferenceGroup getParent() {
        return this.mParentGroup;
    }

    public boolean getPersistedBoolean(boolean z10) {
        if (!shouldPersist()) {
            return z10;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.c().getBoolean(this.mKey, z10);
    }

    public float getPersistedFloat(float f8) {
        if (!shouldPersist()) {
            return f8;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.c().getFloat(this.mKey, f8);
    }

    public int getPersistedInt(int i2) {
        if (!shouldPersist()) {
            return i2;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.c().getInt(this.mKey, i2);
    }

    public long getPersistedLong(long j2) {
        if (!shouldPersist()) {
            return j2;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.c().getLong(this.mKey, j2);
    }

    public String getPersistedString(String str) {
        if (!shouldPersist()) {
            return str;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.c().getString(this.mKey, str);
    }

    public Set<String> getPersistedStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return set;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.c().getStringSet(this.mKey, set);
    }

    public s getPreferenceDataStore() {
        f0 f0Var = this.mPreferenceManager;
        if (f0Var != null) {
            f0Var.getClass();
        }
        return null;
    }

    public f0 getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public SharedPreferences getSharedPreferences() {
        if (this.mPreferenceManager != null) {
            getPreferenceDataStore();
            return this.mPreferenceManager.c();
        }
        return null;
    }

    public boolean getShouldDisableView() {
        return this.mShouldDisableView;
    }

    public CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().c(this);
        }
        return this.mSummary;
    }

    public final r getSummaryProvider() {
        return this.mSummaryProvider;
    }

    public CharSequence getTitle() {
        return this.mTitle;
    }

    public final int getWidgetLayoutResource() {
        return this.mWidgetLayoutResId;
    }

    public boolean hasKey() {
        return !TextUtils.isEmpty(this.mKey);
    }

    public boolean isCopyingEnabled() {
        return this.mCopyingEnabled;
    }

    public boolean isEnabled() {
        if (this.mEnabled && this.mDependencyMet && this.mParentDependencyMet) {
            return true;
        }
        return false;
    }

    public boolean isIconSpaceReserved() {
        return this.mIconSpaceReserved;
    }

    public boolean isPersistent() {
        return this.mPersistent;
    }

    public boolean isSelectable() {
        return this.mSelectable;
    }

    public final boolean isShown() {
        if (!isVisible() || getPreferenceManager() == null) {
            return false;
        }
        if (this == getPreferenceManager().f1557g) {
            return true;
        }
        PreferenceGroup parent = getParent();
        if (parent == null) {
            return false;
        }
        return parent.isShown();
    }

    public boolean isSingleLineTitle() {
        return this.mSingleLineTitle;
    }

    public final boolean isVisible() {
        return this.mVisible;
    }

    public void notifyChanged() {
        n nVar = this.mListener;
        if (nVar != null) {
            d0 d0Var = (d0) nVar;
            int indexOf = d0Var.f1541f.indexOf(this);
            if (indexOf != -1) {
                d0Var.f7619a.d(indexOf, 1, this);
            }
        }
    }

    public void notifyDependencyChange(boolean z10) {
        List<Preference> list = this.mDependents;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                list.get(i2).onDependencyChanged(this, z10);
            }
        }
    }

    public void notifyHierarchyChanged() {
        n nVar = this.mListener;
        if (nVar != null) {
            d0 d0Var = (d0) nVar;
            Handler handler = d0Var.f1543h;
            w wVar = d0Var.f1544i;
            handler.removeCallbacks(wVar);
            handler.post(wVar);
        }
    }

    public void onAttached() {
        a();
    }

    public void onAttachedToHierarchy(f0 f0Var) {
        long j2;
        this.mPreferenceManager = f0Var;
        if (!this.mHasId) {
            synchronized (f0Var) {
                j2 = f0Var.f1552b;
                f0Var.f1552b = 1 + j2;
            }
            this.mId = j2;
        }
        getPreferenceDataStore();
        if (shouldPersist() && getSharedPreferences().contains(this.mKey)) {
            onSetInitialValue(true, null);
            return;
        }
        Object obj = this.mDefaultValue;
        if (obj != null) {
            onSetInitialValue(false, obj);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0108  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onBindViewHolder(androidx.preference.i0 r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.onBindViewHolder(androidx.preference.i0):void");
    }

    public void onDependencyChanged(Preference preference, boolean z10) {
        if (this.mDependencyMet == z10) {
            this.mDependencyMet = !z10;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onDetached() {
        d();
        this.mWasDetached = true;
    }

    public Object onGetDefaultValue(TypedArray typedArray, int i2) {
        return null;
    }

    public void onParentChanged(Preference preference, boolean z10) {
        if (this.mParentDependencyMet == z10) {
            this.mParentDependencyMet = !z10;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onPrepareForRemoval() {
        d();
    }

    public void onRestoreInstanceState(Parcelable parcelable) {
        this.mBaseMethodCalled = true;
        if (parcelable != AbsSavedState.EMPTY_STATE && parcelable != null) {
            a0.j.h("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable onSaveInstanceState() {
        this.mBaseMethodCalled = true;
        return AbsSavedState.EMPTY_STATE;
    }

    @Deprecated
    public void onSetInitialValue(boolean z10, Object obj) {
        onSetInitialValue(obj);
    }

    public Bundle peekExtras() {
        return this.mExtras;
    }

    public void performClick() {
        a0 a0Var;
        if (isEnabled() && isSelectable()) {
            onClick();
            p pVar = this.mOnClickListener;
            if (pVar != null) {
                pVar.a(this);
                return;
            }
            f0 preferenceManager = getPreferenceManager();
            if ((preferenceManager == null || (a0Var = preferenceManager.f1558h) == null || !a0Var.onPreferenceTreeClick(this)) && this.mIntent != null) {
                getContext().startActivity(this.mIntent);
            }
        }
    }

    public boolean persistBoolean(boolean z10) {
        if (!shouldPersist()) {
            return false;
        }
        if (z10 == getPersistedBoolean(!z10)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor b10 = this.mPreferenceManager.b();
        b10.putBoolean(this.mKey, z10);
        c(b10);
        return true;
    }

    public boolean persistFloat(float f8) {
        if (!shouldPersist()) {
            return false;
        }
        if (f8 == getPersistedFloat(Float.NaN)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor b10 = this.mPreferenceManager.b();
        b10.putFloat(this.mKey, f8);
        c(b10);
        return true;
    }

    public boolean persistInt(int i2) {
        if (!shouldPersist()) {
            return false;
        }
        if (i2 == getPersistedInt(~i2)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor b10 = this.mPreferenceManager.b();
        b10.putInt(this.mKey, i2);
        c(b10);
        return true;
    }

    public boolean persistLong(long j2) {
        if (!shouldPersist()) {
            return false;
        }
        if (j2 == getPersistedLong(~j2)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor b10 = this.mPreferenceManager.b();
        b10.putLong(this.mKey, j2);
        c(b10);
        return true;
    }

    public boolean persistString(String str) {
        if (!shouldPersist()) {
            return false;
        }
        if (TextUtils.equals(str, getPersistedString(null))) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor b10 = this.mPreferenceManager.b();
        b10.putString(this.mKey, str);
        c(b10);
        return true;
    }

    public boolean persistStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return false;
        }
        if (set.equals(getPersistedStringSet(null))) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor b10 = this.mPreferenceManager.b();
        b10.putStringSet(this.mKey, set);
        c(b10);
        return true;
    }

    public void requireKey() {
        if (!TextUtils.isEmpty(this.mKey)) {
            this.mRequiresKey = true;
        } else {
            a0.j.p("Preference does not have a key assigned.");
        }
    }

    public void restoreHierarchyState(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveHierarchyState(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCopyingEnabled(boolean z10) {
        if (this.mCopyingEnabled != z10) {
            this.mCopyingEnabled = z10;
            notifyChanged();
        }
    }

    public void setDefaultValue(Object obj) {
        this.mDefaultValue = obj;
    }

    public void setDependency(String str) {
        d();
        this.mDependencyKey = str;
        a();
    }

    public void setEnabled(boolean z10) {
        if (this.mEnabled != z10) {
            this.mEnabled = z10;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void setFragment(String str) {
        this.mFragment = str;
    }

    public void setIcon(Drawable drawable) {
        if (this.mIcon != drawable) {
            this.mIcon = drawable;
            this.mIconResId = 0;
            notifyChanged();
        }
    }

    public void setIconSpaceReserved(boolean z10) {
        if (this.mIconSpaceReserved != z10) {
            this.mIconSpaceReserved = z10;
            notifyChanged();
        }
    }

    public void setIntent(Intent intent) {
        this.mIntent = intent;
    }

    public void setKey(String str) {
        this.mKey = str;
        if (this.mRequiresKey && !hasKey()) {
            requireKey();
        }
    }

    public void setLayoutResource(int i2) {
        this.mLayoutResId = i2;
    }

    public final void setOnPreferenceChangeInternalListener(n nVar) {
        this.mListener = nVar;
    }

    public void setOnPreferenceChangeListener(o oVar) {
        this.mOnChangeListener = oVar;
    }

    public void setOnPreferenceClickListener(p pVar) {
        this.mOnClickListener = pVar;
    }

    public void setOrder(int i2) {
        if (i2 != this.mOrder) {
            this.mOrder = i2;
            notifyHierarchyChanged();
        }
    }

    public void setPersistent(boolean z10) {
        this.mPersistent = z10;
    }

    public void setSelectable(boolean z10) {
        if (this.mSelectable != z10) {
            this.mSelectable = z10;
            notifyChanged();
        }
    }

    public void setShouldDisableView(boolean z10) {
        if (this.mShouldDisableView != z10) {
            this.mShouldDisableView = z10;
            notifyChanged();
        }
    }

    public void setSingleLineTitle(boolean z10) {
        this.mHasSingleLineTitleAttr = true;
        this.mSingleLineTitle = z10;
    }

    public void setSummary(CharSequence charSequence) {
        if (getSummaryProvider() == null) {
            if (!TextUtils.equals(this.mSummary, charSequence)) {
                this.mSummary = charSequence;
                notifyChanged();
                return;
            }
            return;
        }
        a0.j.p("Preference already has a SummaryProvider set.");
    }

    public final void setSummaryProvider(r rVar) {
        this.mSummaryProvider = rVar;
        notifyChanged();
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.mTitle)) {
            this.mTitle = charSequence;
            notifyChanged();
        }
    }

    public void setViewId(int i2) {
        this.mViewId = i2;
    }

    public final void setVisible(boolean z10) {
        if (this.mVisible != z10) {
            this.mVisible = z10;
            n nVar = this.mListener;
            if (nVar != null) {
                d0 d0Var = (d0) nVar;
                Handler handler = d0Var.f1543h;
                w wVar = d0Var.f1544i;
                handler.removeCallbacks(wVar);
                handler.post(wVar);
            }
        }
    }

    public void setWidgetLayoutResource(int i2) {
        this.mWidgetLayoutResId = i2;
    }

    public boolean shouldDisableDependents() {
        return !isEnabled();
    }

    public boolean shouldPersist() {
        if (this.mPreferenceManager != null && isPersistent() && hasKey()) {
            return true;
        }
        return false;
    }

    public String toString() {
        return getFilterableStringBuilder().toString();
    }

    public final boolean wasDetached() {
        return this.mWasDetached;
    }

    public void onSetInitialValue(Object obj) {
    }

    public void setIcon(int i2) {
        setIcon(k7.w.p(this.mContext, i2));
        this.mIconResId = i2;
    }

    public void setTitle(int i2) {
        setTitle(this.mContext.getString(i2));
    }

    public void setSummary(int i2) {
        setSummary(this.mContext.getString(i2));
    }

    public void onClick() {
    }

    @Deprecated
    public void onInitializeAccessibilityNodeInfo(b6.g gVar) {
    }

    public void setPreferenceDataStore(s sVar) {
    }

    public void performClick(View view) {
        performClick();
    }

    public void onAttachedToHierarchy(f0 f0Var, long j2) {
        this.mId = j2;
        this.mHasId = true;
        try {
            onAttachedToHierarchy(f0Var);
        } finally {
            this.mHasId = false;
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p5.b.b(context, R.attr.preferenceStyle, 16842894), 0);
    }
}

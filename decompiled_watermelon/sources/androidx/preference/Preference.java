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
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
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
    private tr4 mListener;
    private ur4 mOnChangeListener;
    private vr4 mOnClickListener;
    private wr4 mOnCopyListener;
    private int mOrder;
    private boolean mParentDependencyMet;
    private PreferenceGroup mParentGroup;
    private boolean mPersistent;
    private bs4 mPreferenceDataStore;
    private ts4 mPreferenceManager;
    private boolean mRequiresKey;
    private boolean mSelectable;
    private boolean mShouldDisableView;
    private boolean mSingleLineTitle;
    private CharSequence mSummary;
    private xr4 mSummaryProvider;
    private CharSequence mTitle;
    private int mViewId;
    private boolean mVisible;
    private boolean mWasDetached;
    private int mWidgetLayoutResId;

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
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
        this.mClickListener = new q7(3, this);
        this.mContext = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, xx4.g, i, i2);
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

    public static void b(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                b(viewGroup.getChildAt(childCount), z);
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
            i.n("This preference already has a parent. You must remove the existing parent before assigning a new one.");
        } else {
            this.mParentGroup = preferenceGroup;
        }
    }

    public final void c(SharedPreferences.Editor editor) {
        if (!this.mPreferenceManager.e) {
            editor.apply();
        }
    }

    public boolean callChangeListener(Object obj) {
        ur4 ur4Var = this.mOnChangeListener;
        if (ur4Var != null && !ur4Var.a(this, obj)) {
            return false;
        }
        return true;
    }

    public final void clearWasDetached() {
        this.mWasDetached = false;
    }

    @Override // java.lang.Comparable
    public int compareTo(Preference preference) {
        int i = this.mOrder;
        int i2 = preference.mOrder;
        if (i != i2) {
            return i - i2;
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
                i.n("Derived class did not call super.onRestoreInstanceState()");
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
            i.n("Derived class did not call super.onSaveInstanceState()");
        }
    }

    public <T extends Preference> T findPreferenceInHierarchy(String str) {
        PreferenceScreen preferenceScreen;
        ts4 ts4Var = this.mPreferenceManager;
        if (ts4Var == null || (preferenceScreen = ts4Var.g) == null) {
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
        StringBuilder sb = new StringBuilder();
        CharSequence title = getTitle();
        if (!TextUtils.isEmpty(title)) {
            sb.append(title);
            sb.append(' ');
        }
        CharSequence summary = getSummary();
        if (!TextUtils.isEmpty(summary)) {
            sb.append(summary);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb;
    }

    public String getFragment() {
        return this.mFragment;
    }

    public Drawable getIcon() {
        int i;
        if (this.mIcon == null && (i = this.mIconResId) != 0) {
            this.mIcon = l07.M(this.mContext, i);
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

    public ur4 getOnPreferenceChangeListener() {
        return this.mOnChangeListener;
    }

    public vr4 getOnPreferenceClickListener() {
        return this.mOnClickListener;
    }

    public int getOrder() {
        return this.mOrder;
    }

    public PreferenceGroup getParent() {
        return this.mParentGroup;
    }

    public boolean getPersistedBoolean(boolean z) {
        if (!shouldPersist()) {
            return z;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.d().getBoolean(this.mKey, z);
    }

    public float getPersistedFloat(float f) {
        if (!shouldPersist()) {
            return f;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.d().getFloat(this.mKey, f);
    }

    public int getPersistedInt(int i) {
        if (!shouldPersist()) {
            return i;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.d().getInt(this.mKey, i);
    }

    public long getPersistedLong(long j) {
        if (!shouldPersist()) {
            return j;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.d().getLong(this.mKey, j);
    }

    public String getPersistedString(String str) {
        if (!shouldPersist()) {
            return str;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.d().getString(this.mKey, str);
    }

    public Set<String> getPersistedStringSet(Set<String> set) {
        if (!shouldPersist()) {
            return set;
        }
        getPreferenceDataStore();
        return this.mPreferenceManager.d().getStringSet(this.mKey, set);
    }

    public bs4 getPreferenceDataStore() {
        ts4 ts4Var = this.mPreferenceManager;
        if (ts4Var != null) {
            ts4Var.getClass();
        }
        return null;
    }

    public ts4 getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public SharedPreferences getSharedPreferences() {
        if (this.mPreferenceManager != null) {
            getPreferenceDataStore();
            return this.mPreferenceManager.d();
        }
        return null;
    }

    public boolean getShouldDisableView() {
        return this.mShouldDisableView;
    }

    public CharSequence getSummary() {
        if (getSummaryProvider() != null) {
            return getSummaryProvider().k(this);
        }
        return this.mSummary;
    }

    public final xr4 getSummaryProvider() {
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
        if (this == getPreferenceManager().g) {
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
        tr4 tr4Var = this.mListener;
        if (tr4Var != null) {
            rs4 rs4Var = (rs4) tr4Var;
            int indexOf = rs4Var.f.indexOf(this);
            if (indexOf != -1) {
                rs4Var.a.c(indexOf, 1, this);
            }
        }
    }

    public void notifyDependencyChange(boolean z) {
        List<Preference> list = this.mDependents;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                list.get(i).onDependencyChanged(this, z);
            }
        }
    }

    public void notifyHierarchyChanged() {
        tr4 tr4Var = this.mListener;
        if (tr4Var != null) {
            rs4 rs4Var = (rs4) tr4Var;
            Handler handler = rs4Var.h;
            es4 es4Var = rs4Var.i;
            handler.removeCallbacks(es4Var);
            handler.post(es4Var);
        }
    }

    public void onAttached() {
        a();
    }

    public void onAttachedToHierarchy(ts4 ts4Var) {
        long j;
        this.mPreferenceManager = ts4Var;
        if (!this.mHasId) {
            synchronized (ts4Var) {
                j = ts4Var.b;
                ts4Var.b = 1 + j;
            }
            this.mId = j;
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
    public void onBindViewHolder(defpackage.vs4 r9) {
        /*
            Method dump skipped, instructions count: 281
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.onBindViewHolder(vs4):void");
    }

    public void onDependencyChanged(Preference preference, boolean z) {
        if (this.mDependencyMet == z) {
            this.mDependencyMet = !z;
            notifyDependencyChange(shouldDisableDependents());
            notifyChanged();
        }
    }

    public void onDetached() {
        d();
        this.mWasDetached = true;
    }

    public Object onGetDefaultValue(TypedArray typedArray, int i) {
        return null;
    }

    public void onParentChanged(Preference preference, boolean z) {
        if (this.mParentDependencyMet == z) {
            this.mParentDependencyMet = !z;
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
            i.i("Wrong state class -- expecting Preference State");
        }
    }

    public Parcelable onSaveInstanceState() {
        this.mBaseMethodCalled = true;
        return AbsSavedState.EMPTY_STATE;
    }

    @Deprecated
    public void onSetInitialValue(boolean z, Object obj) {
        onSetInitialValue(obj);
    }

    public Bundle peekExtras() {
        return this.mExtras;
    }

    public void performClick() {
        is4 is4Var;
        if (isEnabled() && isSelectable()) {
            onClick();
            vr4 vr4Var = this.mOnClickListener;
            if (vr4Var != null) {
                vr4Var.c(this);
                return;
            }
            ts4 preferenceManager = getPreferenceManager();
            if ((preferenceManager == null || (is4Var = preferenceManager.h) == null || !is4Var.onPreferenceTreeClick(this)) && this.mIntent != null) {
                getContext().startActivity(this.mIntent);
            }
        }
    }

    public boolean persistBoolean(boolean z) {
        if (!shouldPersist()) {
            return false;
        }
        if (z == getPersistedBoolean(!z)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor c = this.mPreferenceManager.c();
        c.putBoolean(this.mKey, z);
        c(c);
        return true;
    }

    public boolean persistFloat(float f) {
        if (!shouldPersist()) {
            return false;
        }
        if (f == getPersistedFloat(Float.NaN)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor c = this.mPreferenceManager.c();
        c.putFloat(this.mKey, f);
        c(c);
        return true;
    }

    public boolean persistInt(int i) {
        if (!shouldPersist()) {
            return false;
        }
        if (i == getPersistedInt(~i)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor c = this.mPreferenceManager.c();
        c.putInt(this.mKey, i);
        c(c);
        return true;
    }

    public boolean persistLong(long j) {
        if (!shouldPersist()) {
            return false;
        }
        if (j == getPersistedLong(~j)) {
            return true;
        }
        getPreferenceDataStore();
        SharedPreferences.Editor c = this.mPreferenceManager.c();
        c.putLong(this.mKey, j);
        c(c);
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
        SharedPreferences.Editor c = this.mPreferenceManager.c();
        c.putString(this.mKey, str);
        c(c);
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
        SharedPreferences.Editor c = this.mPreferenceManager.c();
        c.putStringSet(this.mKey, set);
        c(c);
        return true;
    }

    public void requireKey() {
        if (!TextUtils.isEmpty(this.mKey)) {
            this.mRequiresKey = true;
        } else {
            i.n("Preference does not have a key assigned.");
        }
    }

    public void restoreHierarchyState(Bundle bundle) {
        dispatchRestoreInstanceState(bundle);
    }

    public void saveHierarchyState(Bundle bundle) {
        dispatchSaveInstanceState(bundle);
    }

    public void setCopyingEnabled(boolean z) {
        if (this.mCopyingEnabled != z) {
            this.mCopyingEnabled = z;
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

    public void setEnabled(boolean z) {
        if (this.mEnabled != z) {
            this.mEnabled = z;
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

    public void setIconSpaceReserved(boolean z) {
        if (this.mIconSpaceReserved != z) {
            this.mIconSpaceReserved = z;
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

    public void setLayoutResource(int i) {
        this.mLayoutResId = i;
    }

    public final void setOnPreferenceChangeInternalListener(tr4 tr4Var) {
        this.mListener = tr4Var;
    }

    public void setOnPreferenceChangeListener(ur4 ur4Var) {
        this.mOnChangeListener = ur4Var;
    }

    public void setOnPreferenceClickListener(vr4 vr4Var) {
        this.mOnClickListener = vr4Var;
    }

    public void setOrder(int i) {
        if (i != this.mOrder) {
            this.mOrder = i;
            notifyHierarchyChanged();
        }
    }

    public void setPersistent(boolean z) {
        this.mPersistent = z;
    }

    public void setSelectable(boolean z) {
        if (this.mSelectable != z) {
            this.mSelectable = z;
            notifyChanged();
        }
    }

    public void setShouldDisableView(boolean z) {
        if (this.mShouldDisableView != z) {
            this.mShouldDisableView = z;
            notifyChanged();
        }
    }

    public void setSingleLineTitle(boolean z) {
        this.mHasSingleLineTitleAttr = true;
        this.mSingleLineTitle = z;
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
        i.n("Preference already has a SummaryProvider set.");
    }

    public final void setSummaryProvider(xr4 xr4Var) {
        this.mSummaryProvider = xr4Var;
        notifyChanged();
    }

    public void setTitle(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.mTitle)) {
            this.mTitle = charSequence;
            notifyChanged();
        }
    }

    public void setViewId(int i) {
        this.mViewId = i;
    }

    public final void setVisible(boolean z) {
        if (this.mVisible != z) {
            this.mVisible = z;
            tr4 tr4Var = this.mListener;
            if (tr4Var != null) {
                rs4 rs4Var = (rs4) tr4Var;
                Handler handler = rs4Var.h;
                es4 es4Var = rs4Var.i;
                handler.removeCallbacks(es4Var);
                handler.post(es4Var);
            }
        }
    }

    public void setWidgetLayoutResource(int i) {
        this.mWidgetLayoutResId = i;
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

    public void setIcon(int i) {
        setIcon(l07.M(this.mContext, i));
        this.mIconResId = i;
    }

    public void setTitle(int i) {
        setTitle(this.mContext.getString(i));
    }

    public void onClick() {
    }

    public void setSummary(int i) {
        setSummary(this.mContext.getString(i));
    }

    @Deprecated
    public void onInitializeAccessibilityNodeInfo(t2 t2Var) {
    }

    public void setPreferenceDataStore(bs4 bs4Var) {
    }

    public void performClick(View view) {
        performClick();
    }

    public void onAttachedToHierarchy(ts4 ts4Var, long j) {
        this.mId = j;
        this.mHasId = true;
        try {
            onAttachedToHierarchy(ts4Var);
        } finally {
            this.mHasId = false;
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, gk2.M(context, R.attr.preferenceStyle, 16842894), 0);
    }
}

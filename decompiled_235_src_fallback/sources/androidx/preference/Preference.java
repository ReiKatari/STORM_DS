package androidx.preference;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public class Preference implements java.lang.Comparable<androidx.preference.Preference> {
    private static final java.lang.String CLIPBOARD_ID = "Preference";
    public static final int DEFAULT_ORDER = Integer.MAX_VALUE;
    private boolean mAllowDividerAbove;
    private boolean mAllowDividerBelow;
    private boolean mBaseMethodCalled;
    private final android.view.View.OnClickListener mClickListener;
    private final android.content.Context mContext;
    private boolean mCopyingEnabled;
    private java.lang.Object mDefaultValue;
    private java.lang.String mDependencyKey;
    private boolean mDependencyMet;
    private java.util.List<androidx.preference.Preference> mDependents;
    private boolean mEnabled;
    private android.os.Bundle mExtras;
    private java.lang.String mFragment;
    private boolean mHasId;
    private boolean mHasSingleLineTitleAttr;
    private android.graphics.drawable.Drawable mIcon;
    private int mIconResId;
    private boolean mIconSpaceReserved;
    private long mId;
    private android.content.Intent mIntent;
    private java.lang.String mKey;
    private int mLayoutResId;
    private defpackage.w05 mListener;
    private defpackage.x05 mOnChangeListener;
    private defpackage.y05 mOnClickListener;
    private defpackage.z05 mOnCopyListener;
    private int mOrder;
    private boolean mParentDependencyMet;
    private androidx.preference.PreferenceGroup mParentGroup;
    private boolean mPersistent;
    private defpackage.d15 mPreferenceDataStore;
    private defpackage.v15 mPreferenceManager;
    private boolean mRequiresKey;
    private boolean mSelectable;
    private boolean mShouldDisableView;
    private boolean mSingleLineTitle;
    private java.lang.CharSequence mSummary;
    private defpackage.a15 mSummaryProvider;
    private java.lang.CharSequence mTitle;
    private int mViewId;
    private boolean mVisible;
    private boolean mWasDetached;
    private int mWidgetLayoutResId;

    public Preference(android.content.Context r3, android.util.AttributeSet r4) {
            r2 = this;
            r0 = 2130969664(0x7f040440, float:1.7548016E38)
            r1 = 16842894(0x101008e, float:2.3693956E-38)
            int r0 = defpackage.xk2.l(r3, r0, r1)
            r1 = 0
            r2.<init>(r3, r4, r0, r1)
            return
    }

    public Preference(android.content.Context r7, android.util.AttributeSet r8, int r9, int r10) {
            r6 = this;
            r6.<init>()
            r0 = 2147483647(0x7fffffff, float:NaN)
            r6.mOrder = r0
            r1 = 0
            r6.mViewId = r1
            r2 = 1
            r6.mEnabled = r2
            r6.mSelectable = r2
            r6.mPersistent = r2
            r6.mDependencyMet = r2
            r6.mParentDependencyMet = r2
            r6.mVisible = r2
            r6.mAllowDividerAbove = r2
            r6.mAllowDividerBelow = r2
            r6.mSingleLineTitle = r2
            r6.mShouldDisableView = r2
            r3 = 2131624070(0x7f0e0086, float:1.887531E38)
            r6.mLayoutResId = r3
            r7 r4 = new r7
            r5 = 4
            r4.<init>(r6, r5)
            r6.mClickListener = r4
            r6.mContext = r7
            int[] r4 = defpackage.i75.g
            android.content.res.TypedArray r7 = r7.obtainStyledAttributes(r8, r4, r9, r10)
            r8 = 23
            int r9 = r7.getResourceId(r1, r1)
            int r8 = r7.getResourceId(r8, r9)
            r6.mIconResId = r8
            r8 = 26
            java.lang.String r8 = r7.getString(r8)
            if (r8 != 0) goto L4e
            r8 = 6
            java.lang.String r8 = r7.getString(r8)
        L4e:
            r6.mKey = r8
            r8 = 34
            java.lang.CharSequence r8 = r7.getText(r8)
            if (r8 != 0) goto L5c
            java.lang.CharSequence r8 = r7.getText(r5)
        L5c:
            r6.mTitle = r8
            r8 = 33
            java.lang.CharSequence r8 = r7.getText(r8)
            if (r8 != 0) goto L6b
            r8 = 7
            java.lang.CharSequence r8 = r7.getText(r8)
        L6b:
            r6.mSummary = r8
            r8 = 8
            int r8 = r7.getInt(r8, r0)
            r9 = 28
            int r8 = r7.getInt(r9, r8)
            r6.mOrder = r8
            r8 = 22
            java.lang.String r8 = r7.getString(r8)
            if (r8 != 0) goto L89
            r8 = 13
            java.lang.String r8 = r7.getString(r8)
        L89:
            r6.mFragment = r8
            r8 = 3
            int r8 = r7.getResourceId(r8, r3)
            r9 = 27
            int r8 = r7.getResourceId(r9, r8)
            r6.mLayoutResId = r8
            r8 = 9
            int r8 = r7.getResourceId(r8, r1)
            r9 = 35
            int r8 = r7.getResourceId(r9, r8)
            r6.mWidgetLayoutResId = r8
            r8 = 2
            boolean r8 = r7.getBoolean(r8, r2)
            r9 = 21
            boolean r8 = r7.getBoolean(r9, r8)
            r6.mEnabled = r8
            r8 = 5
            boolean r8 = r7.getBoolean(r8, r2)
            r9 = 30
            boolean r8 = r7.getBoolean(r9, r8)
            r6.mSelectable = r8
            r8 = 29
            boolean r9 = r7.getBoolean(r2, r2)
            boolean r8 = r7.getBoolean(r8, r9)
            r6.mPersistent = r8
            r8 = 19
            java.lang.String r8 = r7.getString(r8)
            if (r8 != 0) goto Lda
            r8 = 10
            java.lang.String r8 = r7.getString(r8)
        Lda:
            r6.mDependencyKey = r8
            boolean r8 = r6.mSelectable
            r9 = 16
            boolean r8 = r7.getBoolean(r9, r8)
            boolean r8 = r7.getBoolean(r9, r8)
            r6.mAllowDividerAbove = r8
            boolean r8 = r6.mSelectable
            r9 = 17
            boolean r8 = r7.getBoolean(r9, r8)
            boolean r8 = r7.getBoolean(r9, r8)
            r6.mAllowDividerBelow = r8
            r8 = 18
            boolean r9 = r7.hasValue(r8)
            if (r9 == 0) goto L107
            java.lang.Object r8 = r6.onGetDefaultValue(r7, r8)
            r6.mDefaultValue = r8
            goto L115
        L107:
            r8 = 11
            boolean r9 = r7.hasValue(r8)
            if (r9 == 0) goto L115
            java.lang.Object r8 = r6.onGetDefaultValue(r7, r8)
            r6.mDefaultValue = r8
        L115:
            r8 = 12
            boolean r8 = r7.getBoolean(r8, r2)
            r9 = 31
            boolean r8 = r7.getBoolean(r9, r8)
            r6.mShouldDisableView = r8
            r8 = 32
            boolean r9 = r7.hasValue(r8)
            r6.mHasSingleLineTitleAttr = r9
            if (r9 == 0) goto L139
            r9 = 14
            boolean r9 = r7.getBoolean(r9, r2)
            boolean r8 = r7.getBoolean(r8, r9)
            r6.mSingleLineTitle = r8
        L139:
            r8 = 15
            boolean r8 = r7.getBoolean(r8, r1)
            r9 = 24
            boolean r8 = r7.getBoolean(r9, r8)
            r6.mIconSpaceReserved = r8
            r8 = 25
            boolean r9 = r7.getBoolean(r8, r2)
            boolean r8 = r7.getBoolean(r8, r9)
            r6.mVisible = r8
            r8 = 20
            boolean r9 = r7.getBoolean(r8, r1)
            boolean r8 = r7.getBoolean(r8, r9)
            r6.mCopyingEnabled = r8
            r7.recycle()
            return
    }

    public static void b(android.view.View r2, boolean r3) {
            r2.setEnabled(r3)
            boolean r0 = r2 instanceof android.view.ViewGroup
            if (r0 == 0) goto L1b
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r0 = r2.getChildCount()
            int r0 = r0 + (-1)
        Lf:
            if (r0 < 0) goto L1b
            android.view.View r1 = r2.getChildAt(r0)
            b(r1, r3)
            int r0 = r0 + (-1)
            goto Lf
        L1b:
            return
    }

    public final void a() {
            r5 = this;
            java.lang.String r0 = r5.mDependencyKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L9
            return
        L9:
            java.lang.String r0 = r5.mDependencyKey
            androidx.preference.Preference r0 = r5.findPreferenceInHierarchy(r0)
            if (r0 == 0) goto L29
            java.util.List<androidx.preference.Preference> r1 = r0.mDependents
            if (r1 != 0) goto L1c
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            r0.mDependents = r1
        L1c:
            java.util.List<androidx.preference.Preference> r1 = r0.mDependents
            r1.add(r5)
            boolean r1 = r0.shouldDisableDependents()
            r5.onDependencyChanged(r0, r1)
            return
        L29:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = r5.mDependencyKey
            java.lang.String r2 = r5.mKey
            java.lang.CharSequence r5 = r5.mTitle
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Dependency \""
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = "\" not found for preference \""
            r3.append(r1)
            r3.append(r2)
            java.lang.String r1 = "\" (title: \""
            r3.append(r1)
            r3.append(r5)
            java.lang.String r5 = "\""
            r3.append(r5)
            java.lang.String r5 = r3.toString()
            r0.<init>(r5)
            throw r0
    }

    public void assignParent(androidx.preference.PreferenceGroup r2) {
            r1 = this;
            if (r2 == 0) goto Ld
            androidx.preference.PreferenceGroup r0 = r1.mParentGroup
            if (r0 != 0) goto L7
            goto Ld
        L7:
            java.lang.String r1 = "This preference already has a parent. You must remove the existing parent before assigning a new one."
            defpackage.i.m(r1)
            return
        Ld:
            r1.mParentGroup = r2
            return
    }

    public final void c(android.content.SharedPreferences.Editor r1) {
            r0 = this;
            v15 r0 = r0.mPreferenceManager
            boolean r0 = r0.e
            if (r0 != 0) goto L9
            r1.apply()
        L9:
            return
    }

    public boolean callChangeListener(java.lang.Object r2) {
            r1 = this;
            x05 r0 = r1.mOnChangeListener
            if (r0 == 0) goto Ld
            boolean r1 = r0.a(r1, r2)
            if (r1 == 0) goto Lb
            goto Ld
        Lb:
            r1 = 0
            return r1
        Ld:
            r1 = 1
            return r1
    }

    public final void clearWasDetached() {
            r1 = this;
            r0 = 0
            r1.mWasDetached = r0
            return
    }

    /* renamed from: compareTo  reason: avoid collision after fix types in other method */
    public int compareTo2(androidx.preference.Preference r3) {
            r2 = this;
            int r0 = r2.mOrder
            int r1 = r3.mOrder
            if (r0 == r1) goto L8
            int r0 = r0 - r1
            return r0
        L8:
            java.lang.CharSequence r2 = r2.mTitle
            java.lang.CharSequence r0 = r3.mTitle
            if (r2 != r0) goto L10
            r2 = 0
            return r2
        L10:
            if (r2 != 0) goto L14
            r2 = 1
            return r2
        L14:
            if (r0 != 0) goto L18
            r2 = -1
            return r2
        L18:
            java.lang.String r2 = r2.toString()
            java.lang.CharSequence r3 = r3.mTitle
            java.lang.String r3 = r3.toString()
            int r2 = r2.compareToIgnoreCase(r3)
            return r2
    }

    @Override // java.lang.Comparable
    public /* bridge */ /* synthetic */ int compareTo(androidx.preference.Preference r1) {
            r0 = this;
            androidx.preference.Preference r1 = (androidx.preference.Preference) r1
            int r0 = r0.compareTo2(r1)
            return r0
    }

    public final void d() {
            r1 = this;
            java.lang.String r0 = r1.mDependencyKey
            if (r0 == 0) goto L11
            androidx.preference.Preference r0 = r1.findPreferenceInHierarchy(r0)
            if (r0 == 0) goto L11
            java.util.List<androidx.preference.Preference> r0 = r0.mDependents
            if (r0 == 0) goto L11
            r0.remove(r1)
        L11:
            return
    }

    public void dispatchRestoreInstanceState(android.os.Bundle r2) {
            r1 = this;
            boolean r0 = r1.hasKey()
            if (r0 == 0) goto L1e
            java.lang.String r0 = r1.mKey
            android.os.Parcelable r2 = r2.getParcelable(r0)
            if (r2 == 0) goto L1e
            r0 = 0
            r1.mBaseMethodCalled = r0
            r1.onRestoreInstanceState(r2)
            boolean r1 = r1.mBaseMethodCalled
            if (r1 == 0) goto L19
            goto L1e
        L19:
            java.lang.String r1 = "Derived class did not call super.onRestoreInstanceState()"
            defpackage.i.m(r1)
        L1e:
            return
    }

    public void dispatchSaveInstanceState(android.os.Bundle r3) {
            r2 = this;
            boolean r0 = r2.hasKey()
            if (r0 == 0) goto L1e
            r0 = 0
            r2.mBaseMethodCalled = r0
            android.os.Parcelable r0 = r2.onSaveInstanceState()
            boolean r1 = r2.mBaseMethodCalled
            if (r1 == 0) goto L19
            if (r0 == 0) goto L1e
            java.lang.String r2 = r2.mKey
            r3.putParcelable(r2, r0)
            return
        L19:
            java.lang.String r2 = "Derived class did not call super.onSaveInstanceState()"
            defpackage.i.m(r2)
        L1e:
            return
    }

    public <T extends androidx.preference.Preference> T findPreferenceInHierarchy(java.lang.String r2) {
            r1 = this;
            v15 r1 = r1.mPreferenceManager
            r0 = 0
            if (r1 != 0) goto L6
            return r0
        L6:
            androidx.preference.PreferenceScreen r1 = r1.g
            if (r1 != 0) goto Lb
            return r0
        Lb:
            androidx.preference.Preference r1 = r1.f(r2)
            return r1
    }

    public android.content.Context getContext() {
            r0 = this;
            android.content.Context r0 = r0.mContext
            return r0
    }

    public java.lang.String getDependency() {
            r0 = this;
            java.lang.String r0 = r0.mDependencyKey
            return r0
    }

    public android.os.Bundle getExtras() {
            r1 = this;
            android.os.Bundle r0 = r1.mExtras
            if (r0 != 0) goto Lb
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.mExtras = r0
        Lb:
            android.os.Bundle r1 = r1.mExtras
            return r1
    }

    public java.lang.StringBuilder getFilterableStringBuilder() {
            r4 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.CharSequence r1 = r4.getTitle()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            r3 = 32
            if (r2 != 0) goto L17
            r0.append(r1)
            r0.append(r3)
        L17:
            java.lang.CharSequence r4 = r4.getSummary()
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L27
            r0.append(r4)
            r0.append(r3)
        L27:
            int r4 = r0.length()
            if (r4 <= 0) goto L36
            int r4 = r0.length()
            int r4 = r4 + (-1)
            r0.setLength(r4)
        L36:
            return r0
    }

    public java.lang.String getFragment() {
            r0 = this;
            java.lang.String r0 = r0.mFragment
            return r0
    }

    public android.graphics.drawable.Drawable getIcon() {
            r2 = this;
            android.graphics.drawable.Drawable r0 = r2.mIcon
            if (r0 != 0) goto L10
            int r0 = r2.mIconResId
            if (r0 == 0) goto L10
            android.content.Context r1 = r2.mContext
            android.graphics.drawable.Drawable r0 = defpackage.hf.S(r1, r0)
            r2.mIcon = r0
        L10:
            android.graphics.drawable.Drawable r2 = r2.mIcon
            return r2
    }

    public long getId() {
            r2 = this;
            long r0 = r2.mId
            return r0
    }

    public android.content.Intent getIntent() {
            r0 = this;
            android.content.Intent r0 = r0.mIntent
            return r0
    }

    public java.lang.String getKey() {
            r0 = this;
            java.lang.String r0 = r0.mKey
            return r0
    }

    public final int getLayoutResource() {
            r0 = this;
            int r0 = r0.mLayoutResId
            return r0
    }

    public defpackage.x05 getOnPreferenceChangeListener() {
            r0 = this;
            x05 r0 = r0.mOnChangeListener
            return r0
    }

    public defpackage.y05 getOnPreferenceClickListener() {
            r0 = this;
            y05 r0 = r0.mOnClickListener
            return r0
    }

    public int getOrder() {
            r0 = this;
            int r0 = r0.mOrder
            return r0
    }

    public androidx.preference.PreferenceGroup getParent() {
            r0 = this;
            androidx.preference.PreferenceGroup r0 = r0.mParentGroup
            return r0
    }

    public boolean getPersistedBoolean(boolean r2) {
            r1 = this;
            boolean r0 = r1.shouldPersist()
            if (r0 != 0) goto L7
            return r2
        L7:
            r1.getPreferenceDataStore()
            v15 r0 = r1.mPreferenceManager
            android.content.SharedPreferences r0 = r0.d()
            java.lang.String r1 = r1.mKey
            boolean r1 = r0.getBoolean(r1, r2)
            return r1
    }

    public float getPersistedFloat(float r2) {
            r1 = this;
            boolean r0 = r1.shouldPersist()
            if (r0 != 0) goto L7
            return r2
        L7:
            r1.getPreferenceDataStore()
            v15 r0 = r1.mPreferenceManager
            android.content.SharedPreferences r0 = r0.d()
            java.lang.String r1 = r1.mKey
            float r1 = r0.getFloat(r1, r2)
            return r1
    }

    public int getPersistedInt(int r2) {
            r1 = this;
            boolean r0 = r1.shouldPersist()
            if (r0 != 0) goto L7
            return r2
        L7:
            r1.getPreferenceDataStore()
            v15 r0 = r1.mPreferenceManager
            android.content.SharedPreferences r0 = r0.d()
            java.lang.String r1 = r1.mKey
            int r1 = r0.getInt(r1, r2)
            return r1
    }

    public long getPersistedLong(long r2) {
            r1 = this;
            boolean r0 = r1.shouldPersist()
            if (r0 != 0) goto L7
            return r2
        L7:
            r1.getPreferenceDataStore()
            v15 r0 = r1.mPreferenceManager
            android.content.SharedPreferences r0 = r0.d()
            java.lang.String r1 = r1.mKey
            long r1 = r0.getLong(r1, r2)
            return r1
    }

    public java.lang.String getPersistedString(java.lang.String r2) {
            r1 = this;
            boolean r0 = r1.shouldPersist()
            if (r0 != 0) goto L7
            return r2
        L7:
            r1.getPreferenceDataStore()
            v15 r0 = r1.mPreferenceManager
            android.content.SharedPreferences r0 = r0.d()
            java.lang.String r1 = r1.mKey
            java.lang.String r1 = r0.getString(r1, r2)
            return r1
    }

    public java.util.Set<java.lang.String> getPersistedStringSet(java.util.Set<java.lang.String> r2) {
            r1 = this;
            boolean r0 = r1.shouldPersist()
            if (r0 != 0) goto L7
            return r2
        L7:
            r1.getPreferenceDataStore()
            v15 r0 = r1.mPreferenceManager
            android.content.SharedPreferences r0 = r0.d()
            java.lang.String r1 = r1.mKey
            java.util.Set r1 = r0.getStringSet(r1, r2)
            return r1
    }

    public defpackage.d15 getPreferenceDataStore() {
            r1 = this;
            v15 r1 = r1.mPreferenceManager
            r0 = 0
            if (r1 == 0) goto L8
            r1.getClass()
        L8:
            return r0
    }

    public defpackage.v15 getPreferenceManager() {
            r0 = this;
            v15 r0 = r0.mPreferenceManager
            return r0
    }

    public android.content.SharedPreferences getSharedPreferences() {
            r1 = this;
            v15 r0 = r1.mPreferenceManager
            if (r0 == 0) goto Le
            r1.getPreferenceDataStore()
            v15 r1 = r1.mPreferenceManager
            android.content.SharedPreferences r1 = r1.d()
            return r1
        Le:
            r1 = 0
            return r1
    }

    public boolean getShouldDisableView() {
            r0 = this;
            boolean r0 = r0.mShouldDisableView
            return r0
    }

    public java.lang.CharSequence getSummary() {
            r1 = this;
            a15 r0 = r1.getSummaryProvider()
            if (r0 == 0) goto Lf
            a15 r0 = r1.getSummaryProvider()
            java.lang.CharSequence r1 = r0.i(r1)
            return r1
        Lf:
            java.lang.CharSequence r1 = r1.mSummary
            return r1
    }

    public final defpackage.a15 getSummaryProvider() {
            r0 = this;
            a15 r0 = r0.mSummaryProvider
            return r0
    }

    public java.lang.CharSequence getTitle() {
            r0 = this;
            java.lang.CharSequence r0 = r0.mTitle
            return r0
    }

    public final int getWidgetLayoutResource() {
            r0 = this;
            int r0 = r0.mWidgetLayoutResId
            return r0
    }

    public boolean hasKey() {
            r0 = this;
            java.lang.String r0 = r0.mKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r0 = r0 ^ 1
            return r0
    }

    public boolean isCopyingEnabled() {
            r0 = this;
            boolean r0 = r0.mCopyingEnabled
            return r0
    }

    public boolean isEnabled() {
            r1 = this;
            boolean r0 = r1.mEnabled
            if (r0 == 0) goto Le
            boolean r0 = r1.mDependencyMet
            if (r0 == 0) goto Le
            boolean r1 = r1.mParentDependencyMet
            if (r1 == 0) goto Le
            r1 = 1
            return r1
        Le:
            r1 = 0
            return r1
    }

    public boolean isIconSpaceReserved() {
            r0 = this;
            boolean r0 = r0.mIconSpaceReserved
            return r0
    }

    public boolean isPersistent() {
            r0 = this;
            boolean r0 = r0.mPersistent
            return r0
    }

    public boolean isSelectable() {
            r0 = this;
            boolean r0 = r0.mSelectable
            return r0
    }

    public final boolean isShown() {
            r2 = this;
            boolean r0 = r2.isVisible()
            r1 = 0
            if (r0 != 0) goto L8
            return r1
        L8:
            v15 r0 = r2.getPreferenceManager()
            if (r0 != 0) goto Lf
            return r1
        Lf:
            v15 r0 = r2.getPreferenceManager()
            androidx.preference.PreferenceScreen r0 = r0.g
            if (r2 != r0) goto L19
            r2 = 1
            return r2
        L19:
            androidx.preference.PreferenceGroup r2 = r2.getParent()
            if (r2 != 0) goto L20
            return r1
        L20:
            boolean r2 = r2.isShown()
            return r2
    }

    public boolean isSingleLineTitle() {
            r0 = this;
            boolean r0 = r0.mSingleLineTitle
            return r0
    }

    public final boolean isVisible() {
            r0 = this;
            boolean r0 = r0.mVisible
            return r0
    }

    public void notifyChanged() {
            r3 = this;
            w05 r0 = r3.mListener
            if (r0 == 0) goto L15
            t15 r0 = (defpackage.t15) r0
            java.util.ArrayList r1 = r0.f
            int r1 = r1.indexOf(r3)
            r2 = -1
            if (r1 == r2) goto L15
            xf5 r0 = r0.a
            r2 = 1
            r0.c(r1, r2, r3)
        L15:
            return
    }

    public void notifyDependencyChange(boolean r5) {
            r4 = this;
            java.util.List<androidx.preference.Preference> r0 = r4.mDependents
            if (r0 != 0) goto L5
            goto L18
        L5:
            int r1 = r0.size()
            r2 = 0
        La:
            if (r2 >= r1) goto L18
            java.lang.Object r3 = r0.get(r2)
            androidx.preference.Preference r3 = (androidx.preference.Preference) r3
            r3.onDependencyChanged(r4, r5)
            int r2 = r2 + 1
            goto La
        L18:
            return
    }

    public void notifyHierarchyChanged() {
            r1 = this;
            w05 r1 = r1.mListener
            if (r1 == 0) goto L10
            t15 r1 = (defpackage.t15) r1
            android.os.Handler r0 = r1.h
            g15 r1 = r1.i
            r0.removeCallbacks(r1)
            r0.post(r1)
        L10:
            return
    }

    public void onAttached() {
            r0 = this;
            r0.a()
            return
    }

    public void onAttachedToHierarchy(defpackage.v15 r5) {
            r4 = this;
            r4.mPreferenceManager = r5
            boolean r0 = r4.mHasId
            if (r0 != 0) goto L15
            monitor-enter(r5)
            long r0 = r5.b     // Catch: java.lang.Throwable -> L12
            r2 = 1
            long r2 = r2 + r0
            r5.b = r2     // Catch: java.lang.Throwable -> L12
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            r4.mId = r0
            goto L15
        L12:
            r4 = move-exception
            monitor-exit(r5)     // Catch: java.lang.Throwable -> L12
            throw r4
        L15:
            r4.getPreferenceDataStore()
            boolean r5 = r4.shouldPersist()
            if (r5 == 0) goto L31
            android.content.SharedPreferences r5 = r4.getSharedPreferences()
            java.lang.String r0 = r4.mKey
            boolean r5 = r5.contains(r0)
            if (r5 != 0) goto L2b
            goto L31
        L2b:
            r5 = 1
            r0 = 0
            r4.onSetInitialValue(r5, r0)
            return
        L31:
            java.lang.Object r5 = r4.mDefaultValue
            if (r5 == 0) goto L39
            r0 = 0
            r4.onSetInitialValue(r0, r5)
        L39:
            return
    }

    public void onAttachedToHierarchy(defpackage.v15 r1, long r2) {
            r0 = this;
            r0.mId = r2
            r2 = 1
            r0.mHasId = r2
            r2 = 0
            r0.onAttachedToHierarchy(r1)     // Catch: java.lang.Throwable -> Lc
            r0.mHasId = r2
            return
        Lc:
            r1 = move-exception
            r0.mHasId = r2
            throw r1
    }

    public void onBindViewHolder(defpackage.x15 r9) {
            r8 = this;
            android.view.View r0 = r9.a
            android.view.View$OnClickListener r1 = r8.mClickListener
            r0.setOnClickListener(r1)
            int r1 = r8.mViewId
            r0.setId(r1)
            r1 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r1 = r9.q(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            r2 = 8
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L37
            java.lang.CharSequence r5 = r8.getSummary()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L34
            r1.setText(r5)
            r1.setVisibility(r3)
            int r1 = r1.getCurrentTextColor()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            goto L38
        L34:
            r1.setVisibility(r2)
        L37:
            r1 = r4
        L38:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r9.q(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L75
            java.lang.CharSequence r6 = r8.getTitle()
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L72
            r5.setText(r6)
            r5.setVisibility(r3)
            boolean r6 = r8.mHasSingleLineTitleAttr
            if (r6 == 0) goto L5c
            boolean r6 = r8.mSingleLineTitle
            r5.setSingleLine(r6)
        L5c:
            boolean r6 = r8.isSelectable()
            if (r6 != 0) goto L75
            boolean r6 = r8.isEnabled()
            if (r6 == 0) goto L75
            if (r1 == 0) goto L75
            int r1 = r1.intValue()
            r5.setTextColor(r1)
            goto L75
        L72:
            r5.setVisibility(r2)
        L75:
            r1 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r1 = r9.q(r1)
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            r5 = 4
            if (r1 == 0) goto Lae
            int r6 = r8.mIconResId
            if (r6 != 0) goto L89
            android.graphics.drawable.Drawable r7 = r8.mIcon
            if (r7 == 0) goto L9c
        L89:
            android.graphics.drawable.Drawable r7 = r8.mIcon
            if (r7 != 0) goto L95
            android.content.Context r7 = r8.mContext
            android.graphics.drawable.Drawable r6 = defpackage.hf.S(r7, r6)
            r8.mIcon = r6
        L95:
            android.graphics.drawable.Drawable r6 = r8.mIcon
            if (r6 == 0) goto L9c
            r1.setImageDrawable(r6)
        L9c:
            android.graphics.drawable.Drawable r6 = r8.mIcon
            if (r6 == 0) goto La4
            r1.setVisibility(r3)
            goto Lae
        La4:
            boolean r6 = r8.mIconSpaceReserved
            if (r6 == 0) goto Laa
            r6 = r5
            goto Lab
        Laa:
            r6 = r2
        Lab:
            r1.setVisibility(r6)
        Lae:
            r1 = 2131427617(0x7f0b0121, float:1.8476855E38)
            android.view.View r1 = r9.q(r1)
            if (r1 != 0) goto Lbe
            r1 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r1 = r9.q(r1)
        Lbe:
            if (r1 == 0) goto Ld0
            android.graphics.drawable.Drawable r6 = r8.mIcon
            if (r6 == 0) goto Lc8
            r1.setVisibility(r3)
            goto Ld0
        Lc8:
            boolean r3 = r8.mIconSpaceReserved
            if (r3 == 0) goto Lcd
            r2 = r5
        Lcd:
            r1.setVisibility(r2)
        Ld0:
            boolean r1 = r8.mShouldDisableView
            if (r1 == 0) goto Ldc
            boolean r1 = r8.isEnabled()
            b(r0, r1)
            goto Le0
        Ldc:
            r1 = 1
            b(r0, r1)
        Le0:
            boolean r1 = r8.isSelectable()
            r0.setFocusable(r1)
            r0.setClickable(r1)
            boolean r2 = r8.mAllowDividerAbove
            r9.x = r2
            boolean r2 = r8.mAllowDividerBelow
            r9.y = r2
            boolean r9 = r8.isCopyingEnabled()
            if (r9 == 0) goto L103
            z05 r2 = r8.mOnCopyListener
            if (r2 != 0) goto L103
            z05 r2 = new z05
            r2.<init>(r8)
            r8.mOnCopyListener = r2
        L103:
            if (r9 == 0) goto L108
            z05 r8 = r8.mOnCopyListener
            goto L109
        L108:
            r8 = r4
        L109:
            r0.setOnCreateContextMenuListener(r8)
            r0.setLongClickable(r9)
            if (r9 == 0) goto L118
            if (r1 != 0) goto L118
            java.util.WeakHashMap r8 = defpackage.ao7.a
            r0.setBackground(r4)
        L118:
            return
    }

    public void onClick() {
            r0 = this;
            return
    }

    public void onDependencyChanged(androidx.preference.Preference r1, boolean r2) {
            r0 = this;
            boolean r1 = r0.mDependencyMet
            if (r1 != r2) goto L12
            r1 = r2 ^ 1
            r0.mDependencyMet = r1
            boolean r1 = r0.shouldDisableDependents()
            r0.notifyDependencyChange(r1)
            r0.notifyChanged()
        L12:
            return
    }

    public void onDetached() {
            r1 = this;
            r1.d()
            r0 = 1
            r1.mWasDetached = r0
            return
    }

    public java.lang.Object onGetDefaultValue(android.content.res.TypedArray r1, int r2) {
            r0 = this;
            r0 = 0
            return r0
    }

    @java.lang.Deprecated
    public void onInitializeAccessibilityNodeInfo(defpackage.v2 r1) {
            r0 = this;
            return
    }

    public void onParentChanged(androidx.preference.Preference r1, boolean r2) {
            r0 = this;
            boolean r1 = r0.mParentDependencyMet
            if (r1 != r2) goto L12
            r1 = r2 ^ 1
            r0.mParentDependencyMet = r1
            boolean r1 = r0.shouldDisableDependents()
            r0.notifyDependencyChange(r1)
            r0.notifyChanged()
        L12:
            return
    }

    public void onPrepareForRemoval() {
            r0 = this;
            r0.d()
            return
    }

    public void onRestoreInstanceState(android.os.Parcelable r2) {
            r1 = this;
            r0 = 1
            r1.mBaseMethodCalled = r0
            android.view.AbsSavedState r1 = android.view.AbsSavedState.EMPTY_STATE
            if (r2 == r1) goto Lf
            if (r2 != 0) goto La
            goto Lf
        La:
            java.lang.String r1 = "Wrong state class -- expecting Preference State"
            defpackage.i.h(r1)
        Lf:
            return
    }

    public android.os.Parcelable onSaveInstanceState() {
            r1 = this;
            r0 = 1
            r1.mBaseMethodCalled = r0
            android.view.AbsSavedState r1 = android.view.AbsSavedState.EMPTY_STATE
            return r1
    }

    public void onSetInitialValue(java.lang.Object r1) {
            r0 = this;
            return
    }

    @java.lang.Deprecated
    public void onSetInitialValue(boolean r1, java.lang.Object r2) {
            r0 = this;
            r0.onSetInitialValue(r2)
            return
    }

    public android.os.Bundle peekExtras() {
            r0 = this;
            android.os.Bundle r0 = r0.mExtras
            return r0
    }

    public void performClick() {
            r1 = this;
            boolean r0 = r1.isEnabled()
            if (r0 == 0) goto L36
            boolean r0 = r1.isSelectable()
            if (r0 != 0) goto Ld
            goto L36
        Ld:
            r1.onClick()
            y05 r0 = r1.mOnClickListener
            if (r0 == 0) goto L18
            r0.i(r1)
            return
        L18:
            v15 r0 = r1.getPreferenceManager()
            if (r0 == 0) goto L29
            k15 r0 = r0.h
            if (r0 == 0) goto L29
            boolean r0 = r0.onPreferenceTreeClick(r1)
            if (r0 == 0) goto L29
            goto L36
        L29:
            android.content.Intent r0 = r1.mIntent
            if (r0 == 0) goto L36
            android.content.Context r0 = r1.getContext()
            android.content.Intent r1 = r1.mIntent
            r0.startActivity(r1)
        L36:
            return
    }

    public void performClick(android.view.View r1) {
            r0 = this;
            r0.performClick()
            return
    }

    public boolean persistBoolean(boolean r4) {
            r3 = this;
            boolean r0 = r3.shouldPersist()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r0 = r4 ^ 1
            boolean r0 = r3.getPersistedBoolean(r0)
            r1 = 1
            if (r4 != r0) goto L12
            return r1
        L12:
            r3.getPreferenceDataStore()
            v15 r0 = r3.mPreferenceManager
            android.content.SharedPreferences$Editor r0 = r0.c()
            java.lang.String r2 = r3.mKey
            r0.putBoolean(r2, r4)
            r3.c(r0)
            return r1
    }

    public boolean persistFloat(float r4) {
            r3 = this;
            boolean r0 = r3.shouldPersist()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r0 = 2143289344(0x7fc00000, float:NaN)
            float r0 = r3.getPersistedFloat(r0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto L14
            return r1
        L14:
            r3.getPreferenceDataStore()
            v15 r0 = r3.mPreferenceManager
            android.content.SharedPreferences$Editor r0 = r0.c()
            java.lang.String r2 = r3.mKey
            r0.putFloat(r2, r4)
            r3.c(r0)
            return r1
    }

    public boolean persistInt(int r4) {
            r3 = this;
            boolean r0 = r3.shouldPersist()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            int r0 = ~r4
            int r0 = r3.getPersistedInt(r0)
            r1 = 1
            if (r4 != r0) goto L11
            return r1
        L11:
            r3.getPreferenceDataStore()
            v15 r0 = r3.mPreferenceManager
            android.content.SharedPreferences$Editor r0 = r0.c()
            java.lang.String r2 = r3.mKey
            r0.putInt(r2, r4)
            r3.c(r0)
            return r1
    }

    public boolean persistLong(long r4) {
            r3 = this;
            boolean r0 = r3.shouldPersist()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            long r0 = ~r4
            long r0 = r3.getPersistedLong(r0)
            int r0 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
            r1 = 1
            if (r0 != 0) goto L13
            return r1
        L13:
            r3.getPreferenceDataStore()
            v15 r0 = r3.mPreferenceManager
            android.content.SharedPreferences$Editor r0 = r0.c()
            java.lang.String r2 = r3.mKey
            r0.putLong(r2, r4)
            r3.c(r0)
            return r1
    }

    public boolean persistString(java.lang.String r4) {
            r3 = this;
            boolean r0 = r3.shouldPersist()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r0 = 0
            java.lang.String r0 = r3.getPersistedString(r0)
            boolean r0 = android.text.TextUtils.equals(r4, r0)
            r1 = 1
            if (r0 == 0) goto L15
            return r1
        L15:
            r3.getPreferenceDataStore()
            v15 r0 = r3.mPreferenceManager
            android.content.SharedPreferences$Editor r0 = r0.c()
            java.lang.String r2 = r3.mKey
            r0.putString(r2, r4)
            r3.c(r0)
            return r1
    }

    public boolean persistStringSet(java.util.Set<java.lang.String> r4) {
            r3 = this;
            boolean r0 = r3.shouldPersist()
            if (r0 != 0) goto L8
            r3 = 0
            return r3
        L8:
            r0 = 0
            java.util.Set r0 = r3.getPersistedStringSet(r0)
            boolean r0 = r4.equals(r0)
            r1 = 1
            if (r0 == 0) goto L15
            return r1
        L15:
            r3.getPreferenceDataStore()
            v15 r0 = r3.mPreferenceManager
            android.content.SharedPreferences$Editor r0 = r0.c()
            java.lang.String r2 = r3.mKey
            r0.putStringSet(r2, r4)
            r3.c(r0)
            return r1
    }

    public void requireKey() {
            r1 = this;
            java.lang.String r0 = r1.mKey
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto Lc
            r0 = 1
            r1.mRequiresKey = r0
            return
        Lc:
            java.lang.String r1 = "Preference does not have a key assigned."
            defpackage.i.m(r1)
            return
    }

    public void restoreHierarchyState(android.os.Bundle r1) {
            r0 = this;
            r0.dispatchRestoreInstanceState(r1)
            return
    }

    public void saveHierarchyState(android.os.Bundle r1) {
            r0 = this;
            r0.dispatchSaveInstanceState(r1)
            return
    }

    public void setCopyingEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mCopyingEnabled
            if (r0 == r2) goto L9
            r1.mCopyingEnabled = r2
            r1.notifyChanged()
        L9:
            return
    }

    public void setDefaultValue(java.lang.Object r1) {
            r0 = this;
            r0.mDefaultValue = r1
            return
    }

    public void setDependency(java.lang.String r1) {
            r0 = this;
            r0.d()
            r0.mDependencyKey = r1
            r0.a()
            return
    }

    public void setEnabled(boolean r2) {
            r1 = this;
            boolean r0 = r1.mEnabled
            if (r0 == r2) goto L10
            r1.mEnabled = r2
            boolean r2 = r1.shouldDisableDependents()
            r1.notifyDependencyChange(r2)
            r1.notifyChanged()
        L10:
            return
    }

    public void setFragment(java.lang.String r1) {
            r0 = this;
            r0.mFragment = r1
            return
    }

    public void setIcon(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            android.graphics.drawable.Drawable r0 = defpackage.hf.S(r0, r2)
            r1.setIcon(r0)
            r1.mIconResId = r2
            return
    }

    public void setIcon(android.graphics.drawable.Drawable r2) {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mIcon
            if (r0 == r2) goto Lc
            r1.mIcon = r2
            r2 = 0
            r1.mIconResId = r2
            r1.notifyChanged()
        Lc:
            return
    }

    public void setIconSpaceReserved(boolean r2) {
            r1 = this;
            boolean r0 = r1.mIconSpaceReserved
            if (r0 == r2) goto L9
            r1.mIconSpaceReserved = r2
            r1.notifyChanged()
        L9:
            return
    }

    public void setIntent(android.content.Intent r1) {
            r0 = this;
            r0.mIntent = r1
            return
    }

    public void setKey(java.lang.String r1) {
            r0 = this;
            r0.mKey = r1
            boolean r1 = r0.mRequiresKey
            if (r1 == 0) goto Lf
            boolean r1 = r0.hasKey()
            if (r1 != 0) goto Lf
            r0.requireKey()
        Lf:
            return
    }

    public void setLayoutResource(int r1) {
            r0 = this;
            r0.mLayoutResId = r1
            return
    }

    public final void setOnPreferenceChangeInternalListener(defpackage.w05 r1) {
            r0 = this;
            r0.mListener = r1
            return
    }

    public void setOnPreferenceChangeListener(defpackage.x05 r1) {
            r0 = this;
            r0.mOnChangeListener = r1
            return
    }

    public void setOnPreferenceClickListener(defpackage.y05 r1) {
            r0 = this;
            r0.mOnClickListener = r1
            return
    }

    public void setOrder(int r2) {
            r1 = this;
            int r0 = r1.mOrder
            if (r2 == r0) goto L9
            r1.mOrder = r2
            r1.notifyHierarchyChanged()
        L9:
            return
    }

    public void setPersistent(boolean r1) {
            r0 = this;
            r0.mPersistent = r1
            return
    }

    public void setPreferenceDataStore(defpackage.d15 r1) {
            r0 = this;
            return
    }

    public void setSelectable(boolean r2) {
            r1 = this;
            boolean r0 = r1.mSelectable
            if (r0 == r2) goto L9
            r1.mSelectable = r2
            r1.notifyChanged()
        L9:
            return
    }

    public void setShouldDisableView(boolean r2) {
            r1 = this;
            boolean r0 = r1.mShouldDisableView
            if (r0 == r2) goto L9
            r1.mShouldDisableView = r2
            r1.notifyChanged()
        L9:
            return
    }

    public void setSingleLineTitle(boolean r2) {
            r1 = this;
            r0 = 1
            r1.mHasSingleLineTitleAttr = r0
            r1.mSingleLineTitle = r2
            return
    }

    public void setSummary(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            java.lang.String r2 = r0.getString(r2)
            r1.setSummary(r2)
            return
    }

    public void setSummary(java.lang.CharSequence r2) {
            r1 = this;
            a15 r0 = r1.getSummaryProvider()
            if (r0 != 0) goto L14
            java.lang.CharSequence r0 = r1.mSummary
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 != 0) goto L13
            r1.mSummary = r2
            r1.notifyChanged()
        L13:
            return
        L14:
            java.lang.String r1 = "Preference already has a SummaryProvider set."
            defpackage.i.m(r1)
            return
    }

    public final void setSummaryProvider(defpackage.a15 r1) {
            r0 = this;
            r0.mSummaryProvider = r1
            r0.notifyChanged()
            return
    }

    public void setTitle(int r2) {
            r1 = this;
            android.content.Context r0 = r1.mContext
            java.lang.String r2 = r0.getString(r2)
            r1.setTitle(r2)
            return
    }

    public void setTitle(java.lang.CharSequence r2) {
            r1 = this;
            java.lang.CharSequence r0 = r1.mTitle
            boolean r0 = android.text.TextUtils.equals(r2, r0)
            if (r0 != 0) goto Ld
            r1.mTitle = r2
            r1.notifyChanged()
        Ld:
            return
    }

    public void setViewId(int r1) {
            r0 = this;
            r0.mViewId = r1
            return
    }

    public final void setVisible(boolean r2) {
            r1 = this;
            boolean r0 = r1.mVisible
            if (r0 == r2) goto L16
            r1.mVisible = r2
            w05 r1 = r1.mListener
            if (r1 == 0) goto L16
            t15 r1 = (defpackage.t15) r1
            android.os.Handler r2 = r1.h
            g15 r1 = r1.i
            r2.removeCallbacks(r1)
            r2.post(r1)
        L16:
            return
    }

    public void setWidgetLayoutResource(int r1) {
            r0 = this;
            r0.mWidgetLayoutResId = r1
            return
    }

    public boolean shouldDisableDependents() {
            r0 = this;
            boolean r0 = r0.isEnabled()
            r0 = r0 ^ 1
            return r0
    }

    public boolean shouldPersist() {
            r1 = this;
            v15 r0 = r1.mPreferenceManager
            if (r0 == 0) goto L12
            boolean r0 = r1.isPersistent()
            if (r0 == 0) goto L12
            boolean r1 = r1.hasKey()
            if (r1 == 0) goto L12
            r1 = 1
            return r1
        L12:
            r1 = 0
            return r1
    }

    public java.lang.String toString() {
            r0 = this;
            java.lang.StringBuilder r0 = r0.getFilterableStringBuilder()
            java.lang.String r0 = r0.toString()
            return r0
    }

    public final boolean wasDetached() {
            r0 = this;
            boolean r0 = r0.mWasDetached
            return r0
    }
}

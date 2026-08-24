package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k15  reason: default package */
/* loaded from: classes.dex */
public abstract class k15 extends androidx.fragment.app.o {
    public static final java.lang.String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final java.lang.String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final java.lang.String PREFERENCES_TAG = "android:preferences";
    private static final java.lang.String TAG = "PreferenceFragment";
    private final defpackage.i15 mDividerDecoration;
    private final android.os.Handler mHandler;
    private boolean mHavePrefs;
    private boolean mInitDone;
    private int mLayoutResId;
    androidx.recyclerview.widget.RecyclerView mList;
    private defpackage.v15 mPreferenceManager;
    private final java.lang.Runnable mRequestFocus;
    private java.lang.Runnable mSelectPreferenceRunnable;

    public k15() {
            r3 = this;
            r3.<init>()
            i15 r0 = new i15
            r0.<init>(r3)
            r3.mDividerDecoration = r0
            r0 = 2131624080(0x7f0e0090, float:1.887533E38)
            r3.mLayoutResId = r0
            sk1 r0 = new sk1
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 3
            r0.<init>(r3, r1, r2)
            r3.mHandler = r0
            g15 r0 = new g15
            r1 = 0
            r0.<init>(r3, r1)
            r3.mRequestFocus = r0
            return
    }

    public void addPreferencesFromResource(int r4) {
            r3 = this;
            v15 r0 = r3.mPreferenceManager
            if (r0 == 0) goto L14
            android.content.Context r1 = r3.requireContext()
            androidx.preference.PreferenceScreen r2 = r3.getPreferenceScreen()
            androidx.preference.PreferenceScreen r4 = r0.e(r1, r4, r2)
            r3.setPreferenceScreen(r4)
            return
        L14:
            java.lang.String r3 = "This should be called after super.onCreate."
            defpackage.u34.j(r3)
            return
    }

    public void bindPreferences() {
            r3 = this;
            androidx.preference.PreferenceScreen r0 = r3.getPreferenceScreen()
            if (r0 == 0) goto L14
            androidx.recyclerview.widget.RecyclerView r1 = r3.getListView()
            wf5 r2 = r3.onCreateAdapter(r0)
            r1.setAdapter(r2)
            r0.onAttached()
        L14:
            r3.onBindPreferences()
            return
    }

    public <T extends androidx.preference.Preference> T findPreference(java.lang.CharSequence r2) {
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

    public androidx.fragment.app.o getCallbackFragment() {
            r0 = this;
            r0 = 0
            return r0
    }

    public final androidx.recyclerview.widget.RecyclerView getListView() {
            r0 = this;
            androidx.recyclerview.widget.RecyclerView r0 = r0.mList
            return r0
    }

    public defpackage.v15 getPreferenceManager() {
            r0 = this;
            v15 r0 = r0.mPreferenceManager
            return r0
    }

    public androidx.preference.PreferenceScreen getPreferenceScreen() {
            r0 = this;
            v15 r0 = r0.mPreferenceManager
            androidx.preference.PreferenceScreen r0 = r0.g
            return r0
    }

    public void onBindPreferences() {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.o
    public void onCreate(android.os.Bundle r5) {
            r4 = this;
            super.onCreate(r5)
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.Context r1 = r4.requireContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 2130969665(0x7f040441, float:1.7548018E38)
            r3 = 1
            r1.resolveAttribute(r2, r0, r3)
            int r0 = r0.resourceId
            if (r0 != 0) goto L1e
            r0 = 2132017543(0x7f140187, float:1.9673367E38)
        L1e:
            android.content.Context r1 = r4.requireContext()
            android.content.res.Resources$Theme r1 = r1.getTheme()
            r2 = 0
            r1.applyStyle(r0, r2)
            v15 r0 = new v15
            android.content.Context r1 = r4.requireContext()
            r0.<init>(r1)
            r4.mPreferenceManager = r0
            r0.j = r4
            android.os.Bundle r0 = r4.getArguments()
            if (r0 == 0) goto L48
            android.os.Bundle r0 = r4.getArguments()
            java.lang.String r1 = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT"
            java.lang.String r0 = r0.getString(r1)
            goto L49
        L48:
            r0 = 0
        L49:
            r4.onCreatePreferences(r5, r0)
            return
    }

    public defpackage.wf5 onCreateAdapter(androidx.preference.PreferenceScreen r1) {
            r0 = this;
            t15 r0 = new t15
            r0.<init>(r1)
            return r0
    }

    public defpackage.gg5 onCreateLayoutManager() {
            r1 = this;
            androidx.recyclerview.widget.LinearLayoutManager r0 = new androidx.recyclerview.widget.LinearLayoutManager
            r1.requireContext()
            r0.<init>()
            return r0
    }

    public abstract void onCreatePreferences(android.os.Bundle r1, java.lang.String r2);

    public androidx.recyclerview.widget.RecyclerView onCreateRecyclerView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            android.content.Context r4 = r1.requireContext()
            android.content.pm.PackageManager r4 = r4.getPackageManager()
            java.lang.String r0 = "android.hardware.type.automotive"
            boolean r4 = r4.hasSystemFeature(r0)
            if (r4 == 0) goto L1c
            r4 = 2131427837(0x7f0b01fd, float:1.8477302E38)
            android.view.View r4 = r3.findViewById(r4)
            androidx.recyclerview.widget.RecyclerView r4 = (androidx.recyclerview.widget.RecyclerView) r4
            if (r4 == 0) goto L1c
            return r4
        L1c:
            r4 = 2131624083(0x7f0e0093, float:1.8875336E38)
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            androidx.recyclerview.widget.RecyclerView r2 = (androidx.recyclerview.widget.RecyclerView) r2
            gg5 r1 = r1.onCreateLayoutManager()
            r2.setLayoutManager(r1)
            w15 r1 = new w15
            r1.<init>(r2)
            r2.setAccessibilityDelegateCompat(r1)
            return r2
    }

    @Override // androidx.fragment.app.o
    public android.view.View onCreateView(android.view.LayoutInflater r9, android.view.ViewGroup r10, android.os.Bundle r11) {
            r8 = this;
            android.content.Context r0 = r8.requireContext()
            r1 = 0
            int[] r2 = defpackage.i75.h
            r3 = 2130969659(0x7f04043b, float:1.7548006E38)
            r4 = 0
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1, r2, r3, r4)
            int r2 = r8.mLayoutResId
            int r2 = r0.getResourceId(r4, r2)
            r8.mLayoutResId = r2
            r2 = 1
            android.graphics.drawable.Drawable r3 = r0.getDrawable(r2)
            r5 = 2
            r6 = -1
            int r5 = r0.getDimensionPixelSize(r5, r6)
            r7 = 3
            boolean r2 = r0.getBoolean(r7, r2)
            r0.recycle()
            android.content.Context r0 = r8.requireContext()
            android.view.LayoutInflater r9 = r9.cloneInContext(r0)
            int r0 = r8.mLayoutResId
            android.view.View r10 = r9.inflate(r0, r10, r4)
            r0 = 16908351(0x102003f, float:2.3877406E-38)
            android.view.View r0 = r10.findViewById(r0)
            boolean r4 = r0 instanceof android.view.ViewGroup
            if (r4 == 0) goto L79
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            androidx.recyclerview.widget.RecyclerView r9 = r8.onCreateRecyclerView(r9, r0, r11)
            if (r9 == 0) goto L73
            r8.mList = r9
            i15 r11 = r8.mDividerDecoration
            r9.i(r11)
            r8.setDivider(r3)
            if (r5 == r6) goto L5a
            r8.setDividerHeight(r5)
        L5a:
            i15 r9 = r8.mDividerDecoration
            r9.c = r2
            androidx.recyclerview.widget.RecyclerView r9 = r8.mList
            android.view.ViewParent r9 = r9.getParent()
            if (r9 != 0) goto L6b
            androidx.recyclerview.widget.RecyclerView r9 = r8.mList
            r0.addView(r9)
        L6b:
            android.os.Handler r9 = r8.mHandler
            java.lang.Runnable r8 = r8.mRequestFocus
            r9.post(r8)
            return r10
        L73:
            java.lang.String r8 = "Could not create RecyclerView"
            defpackage.u34.j(r8)
            return r1
        L79:
            java.lang.String r8 = "Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class"
            defpackage.i.m(r8)
            return r1
    }

    @Override // androidx.fragment.app.o
    public void onDestroyView() {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            java.lang.Runnable r1 = r2.mRequestFocus
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r2.mHandler
            r1 = 1
            r0.removeMessages(r1)
            boolean r0 = r2.mHavePrefs
            r1 = 0
            if (r0 == 0) goto L25
            androidx.recyclerview.widget.RecyclerView r0 = r2.getListView()
            r0.setAdapter(r1)
            androidx.preference.PreferenceScreen r0 = r2.getPreferenceScreen()
            if (r0 == 0) goto L22
            r0.onDetached()
        L22:
            r2.onUnbindPreferences()
        L25:
            r2.mList = r1
            super.onDestroyView()
            return
    }

    public void onDisplayPreferenceDialog(androidx.preference.Preference r6) {
            r5 = this;
            r5.getCallbackFragment()
            r0 = r5
        L4:
            if (r0 == 0) goto Lb
            androidx.fragment.app.o r0 = r0.getParentFragment()
            goto L4
        Lb:
            r5.getContext()
            r5.getActivity()
            androidx.fragment.app.u r0 = r5.getParentFragmentManager()
            java.lang.String r1 = "androidx.preference.PreferenceFragment.DIALOG"
            androidx.fragment.app.o r0 = r0.D(r1)
            if (r0 == 0) goto L1e
            return
        L1e:
            boolean r0 = r6 instanceof androidx.preference.EditTextPreference
            java.lang.String r2 = "key"
            r3 = 1
            if (r0 == 0) goto L3a
            java.lang.String r6 = r6.getKey()
            fs1 r0 = new fs1
            r0.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r3)
            r4.putString(r2, r6)
            r0.setArguments(r4)
            goto L6b
        L3a:
            boolean r0 = r6 instanceof androidx.preference.ListPreference
            if (r0 == 0) goto L53
            java.lang.String r6 = r6.getKey()
            dx3 r0 = new dx3
            r0.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r3)
            r4.putString(r2, r6)
            r0.setArguments(r4)
            goto L6b
        L53:
            boolean r0 = r6 instanceof androidx.preference.MultiSelectListPreference
            if (r0 == 0) goto L77
            java.lang.String r6 = r6.getKey()
            b94 r0 = new b94
            r0.<init>()
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>(r3)
            r4.putString(r2, r6)
            r0.setArguments(r4)
        L6b:
            r6 = 0
            r0.setTargetFragment(r5, r6)
            androidx.fragment.app.u r5 = r5.getParentFragmentManager()
            r0.show(r5, r1)
            return
        L77:
            java.lang.Class r5 = r6.getClass()
            java.lang.String r5 = r5.getSimpleName()
            java.lang.String r6 = ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference."
            java.lang.String r0 = "Cannot display dialog for an unknown Preference type: "
            defpackage.u34.h(r5, r6, r0)
            return
    }

    public void onNavigateToScreen(androidx.preference.PreferenceScreen r4) {
            r3 = this;
            r3.getCallbackFragment()
            r0 = 1
            r1 = 0
            r2 = r3
        L6:
            if (r2 == 0) goto Ld
            androidx.fragment.app.o r2 = r2.getParentFragment()
            goto L6
        Ld:
            android.content.Context r2 = r3.getContext()
            boolean r2 = r2 instanceof me.magnum.melonds.ui.settings.SettingsActivity
            if (r2 == 0) goto L1f
            android.content.Context r1 = r3.getContext()
            me.magnum.melonds.ui.settings.SettingsActivity r1 = (me.magnum.melonds.ui.settings.SettingsActivity) r1
            r1.C(r3, r4)
            goto L20
        L1f:
            r0 = r1
        L20:
            if (r0 != 0) goto L33
            androidx.fragment.app.p r0 = r3.getActivity()
            boolean r0 = r0 instanceof me.magnum.melonds.ui.settings.SettingsActivity
            if (r0 == 0) goto L33
            androidx.fragment.app.p r0 = r3.getActivity()
            me.magnum.melonds.ui.settings.SettingsActivity r0 = (me.magnum.melonds.ui.settings.SettingsActivity) r0
            r0.C(r3, r4)
        L33:
            return
    }

    public boolean onPreferenceTreeClick(androidx.preference.Preference r6) {
            r5 = this;
            java.lang.String r0 = r6.getFragment()
            r1 = 0
            if (r0 == 0) goto L83
            r5.getCallbackFragment()
            r0 = r5
        Lb:
            if (r0 == 0) goto L12
            androidx.fragment.app.o r0 = r0.getParentFragment()
            goto Lb
        L12:
            android.content.Context r0 = r5.getContext()
            boolean r0 = r0 instanceof me.magnum.melonds.ui.settings.SettingsActivity
            if (r0 == 0) goto L25
            android.content.Context r0 = r5.getContext()
            me.magnum.melonds.ui.settings.SettingsActivity r0 = (me.magnum.melonds.ui.settings.SettingsActivity) r0
            boolean r0 = r0.B(r5, r6)
            goto L26
        L25:
            r0 = r1
        L26:
            if (r0 != 0) goto L3a
            androidx.fragment.app.p r2 = r5.getActivity()
            boolean r2 = r2 instanceof me.magnum.melonds.ui.settings.SettingsActivity
            if (r2 == 0) goto L3a
            androidx.fragment.app.p r0 = r5.getActivity()
            me.magnum.melonds.ui.settings.SettingsActivity r0 = (me.magnum.melonds.ui.settings.SettingsActivity) r0
            boolean r0 = r0.B(r5, r6)
        L3a:
            if (r0 != 0) goto L81
            java.lang.String r0 = "PreferenceFragment"
            java.lang.String r2 = "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments."
            android.util.Log.w(r0, r2)
            androidx.fragment.app.u r0 = r5.getParentFragmentManager()
            android.os.Bundle r2 = r6.getExtras()
            gl2 r3 = r0.H()
            androidx.fragment.app.p r4 = r5.requireActivity()
            r4.getClassLoader()
            java.lang.String r6 = r6.getFragment()
            androidx.fragment.app.o r6 = r3.a(r6)
            r6.setArguments(r2)
            r6.setTargetFragment(r5, r1)
            androidx.fragment.app.a r1 = new androidx.fragment.app.a
            r1.<init>(r0)
            android.view.View r5 = r5.requireView()
            android.view.ViewParent r5 = r5.getParent()
            android.view.View r5 = (android.view.View) r5
            int r5 = r5.getId()
            r0 = 0
            r1.e(r5, r6, r0)
            r1.c()
            r1.h()
        L81:
            r5 = 1
            return r5
        L83:
            return r1
    }

    @Override // androidx.fragment.app.o
    public void onSaveInstanceState(android.os.Bundle r2) {
            r1 = this;
            androidx.preference.PreferenceScreen r1 = r1.getPreferenceScreen()
            if (r1 == 0) goto L13
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.saveHierarchyState(r0)
            java.lang.String r1 = "android:preferences"
            r2.putBundle(r1, r0)
        L13:
            return
    }

    @Override // androidx.fragment.app.o
    public void onStart() {
            r1 = this;
            super.onStart()
            v15 r0 = r1.mPreferenceManager
            r0.h = r1
            r0.i = r1
            return
    }

    @Override // androidx.fragment.app.o
    public void onStop() {
            r1 = this;
            super.onStop()
            v15 r1 = r1.mPreferenceManager
            r0 = 0
            r1.h = r0
            r1.i = r0
            return
    }

    public void onUnbindPreferences() {
            r0 = this;
            return
    }

    @Override // androidx.fragment.app.o
    public void onViewCreated(android.view.View r1, android.os.Bundle r2) {
            r0 = this;
            super.onViewCreated(r1, r2)
            if (r2 == 0) goto L16
            java.lang.String r1 = "android:preferences"
            android.os.Bundle r1 = r2.getBundle(r1)
            if (r1 == 0) goto L16
            androidx.preference.PreferenceScreen r2 = r0.getPreferenceScreen()
            if (r2 == 0) goto L16
            r2.restoreHierarchyState(r1)
        L16:
            boolean r1 = r0.mHavePrefs
            if (r1 == 0) goto L27
            r0.bindPreferences()
            java.lang.Runnable r1 = r0.mSelectPreferenceRunnable
            if (r1 == 0) goto L27
            r1.run()
            r1 = 0
            r0.mSelectPreferenceRunnable = r1
        L27:
            r1 = 1
            r0.mInitDone = r1
            return
    }

    public void scrollToPreference(androidx.preference.Preference r3) {
            r2 = this;
            h15 r0 = new h15
            r1 = 0
            r0.<init>(r2, r3, r1)
            androidx.recyclerview.widget.RecyclerView r3 = r2.mList
            if (r3 != 0) goto Ld
            r2.mSelectPreferenceRunnable = r0
            return
        Ld:
            r0.run()
            return
    }

    public void scrollToPreference(java.lang.String r3) {
            r2 = this;
            h15 r0 = new h15
            r1 = 0
            r0.<init>(r2, r1, r3)
            androidx.recyclerview.widget.RecyclerView r3 = r2.mList
            if (r3 != 0) goto Ld
            r2.mSelectPreferenceRunnable = r0
            return
        Ld:
            r0.run()
            return
    }

    public void setDivider(android.graphics.drawable.Drawable r2) {
            r1 = this;
            i15 r1 = r1.mDividerDecoration
            if (r2 == 0) goto Le
            r1.getClass()
            int r0 = r2.getIntrinsicHeight()
            r1.b = r0
            goto L11
        Le:
            r0 = 0
            r1.b = r0
        L11:
            r1.a = r2
            k15 r1 = r1.d
            androidx.recyclerview.widget.RecyclerView r1 = r1.mList
            java.util.ArrayList r2 = r1.o0
            int r2 = r2.size()
            if (r2 != 0) goto L20
            return
        L20:
            gg5 r2 = r1.m0
            if (r2 == 0) goto L29
            java.lang.String r0 = "Cannot invalidate item decorations during a scroll or layout"
            r2.c(r0)
        L29:
            r1.S()
            r1.requestLayout()
            return
    }

    public void setDividerHeight(int r2) {
            r1 = this;
            i15 r1 = r1.mDividerDecoration
            r1.b = r2
            k15 r1 = r1.d
            androidx.recyclerview.widget.RecyclerView r1 = r1.mList
            java.util.ArrayList r2 = r1.o0
            int r2 = r2.size()
            if (r2 != 0) goto L11
            return
        L11:
            gg5 r2 = r1.m0
            if (r2 == 0) goto L1a
            java.lang.String r0 = "Cannot invalidate item decorations during a scroll or layout"
            r2.c(r0)
        L1a:
            r1.S()
            r1.requestLayout()
            return
    }

    public void setPreferenceScreen(androidx.preference.PreferenceScreen r3) {
            r2 = this;
            v15 r0 = r2.mPreferenceManager
            androidx.preference.PreferenceScreen r1 = r0.g
            if (r3 == r1) goto L2b
            if (r1 == 0) goto Lb
            r1.onDetached()
        Lb:
            r0.g = r3
            if (r3 == 0) goto L2b
            r2.onUnbindPreferences()
            r3 = 1
            r2.mHavePrefs = r3
            boolean r0 = r2.mInitDone
            if (r0 == 0) goto L2b
            android.os.Handler r0 = r2.mHandler
            boolean r0 = r0.hasMessages(r3)
            if (r0 == 0) goto L22
            goto L2b
        L22:
            android.os.Handler r2 = r2.mHandler
            android.os.Message r2 = r2.obtainMessage(r3)
            r2.sendToTarget()
        L2b:
            return
    }

    public void setPreferencesFromResource(int r4, java.lang.String r5) {
            r3 = this;
            v15 r0 = r3.mPreferenceManager
            if (r0 == 0) goto L2a
            android.content.Context r1 = r3.requireContext()
            r2 = 0
            androidx.preference.PreferenceScreen r4 = r0.e(r1, r4, r2)
            if (r5 == 0) goto L24
            androidx.preference.Preference r4 = r4.f(r5)
            boolean r0 = r4 instanceof androidx.preference.PreferenceScreen
            if (r0 == 0) goto L18
            goto L24
        L18:
            java.lang.String r3 = "Preference object with key "
            java.lang.String r4 = " is not a PreferenceScreen"
            java.lang.String r3 = defpackage.lb1.A(r3, r5, r4)
            defpackage.i.h(r3)
            return
        L24:
            androidx.preference.PreferenceScreen r4 = (androidx.preference.PreferenceScreen) r4
            r3.setPreferenceScreen(r4)
            return
        L2a:
            java.lang.String r3 = "This should be called after super.onCreate."
            defpackage.u34.j(r3)
            return
    }
}

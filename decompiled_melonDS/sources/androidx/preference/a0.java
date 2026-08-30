package androidx.preference;

import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.g1;
import androidx.fragment.app.z0;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import j7.u0;
import me.magnum.melonds.R;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class a0 extends androidx.fragment.app.j0 {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private f0 mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private final y mDividerDecoration = new y(this);
    private int mLayoutResId = R.layout.preference_list_fragment;
    private final Handler mHandler = new v(0, Looper.getMainLooper(), this);
    private final Runnable mRequestFocus = new w(0, this);

    public void addPreferencesFromResource(int i2) {
        f0 f0Var = this.mPreferenceManager;
        if (f0Var != null) {
            setPreferenceScreen(f0Var.d(requireContext(), i2, getPreferenceScreen()));
        } else {
            m9.o.r("This should be called after super.onCreate.");
        }
    }

    public void bindPreferences() {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            getListView().setAdapter(onCreateAdapter(preferenceScreen));
            preferenceScreen.onAttached();
        }
        onBindPreferences();
    }

    public <T extends Preference> T findPreference(CharSequence charSequence) {
        PreferenceScreen preferenceScreen;
        f0 f0Var = this.mPreferenceManager;
        if (f0Var == null || (preferenceScreen = f0Var.f1557g) == null) {
            return null;
        }
        return (T) preferenceScreen.f(charSequence);
    }

    public androidx.fragment.app.j0 getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public f0 getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.f1557g;
    }

    @Override // androidx.fragment.app.j0
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i2 = typedValue.resourceId;
        if (i2 == 0) {
            i2 = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i2, false);
        f0 f0Var = new f0(requireContext());
        this.mPreferenceManager = f0Var;
        f0Var.f1560j = this;
        if (getArguments() != null) {
            str = getArguments().getString(ARG_PREFERENCE_ROOT);
        } else {
            str = null;
        }
        onCreatePreferences(bundle, str);
    }

    public j7.k0 onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new d0(preferenceScreen);
    }

    public u0 onCreateLayoutManager() {
        requireContext();
        return new LinearLayoutManager();
    }

    public abstract void onCreatePreferences(Bundle bundle, String str);

    public RecyclerView onCreateRecyclerView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RecyclerView recyclerView;
        if (requireContext().getPackageManager().hasSystemFeature("android.hardware.type.automotive") && (recyclerView = (RecyclerView) viewGroup.findViewById(R.id.recycler_view)) != null) {
            return recyclerView;
        }
        RecyclerView recyclerView2 = (RecyclerView) layoutInflater.inflate(R.layout.preference_recyclerview, viewGroup, false);
        recyclerView2.setLayoutManager(onCreateLayoutManager());
        recyclerView2.setAccessibilityDelegateCompat(new h0(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.j0
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, j0.f1578h, R.attr.preferenceFragmentCompatStyle, 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(0, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z10 = obtainStyledAttributes.getBoolean(3, true);
        obtainStyledAttributes.recycle();
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(requireContext());
        View inflate = cloneInContext.inflate(this.mLayoutResId, viewGroup, false);
        View findViewById = inflate.findViewById(16908351);
        if (findViewById instanceof ViewGroup) {
            ViewGroup viewGroup2 = (ViewGroup) findViewById;
            RecyclerView onCreateRecyclerView = onCreateRecyclerView(cloneInContext, viewGroup2, bundle);
            if (onCreateRecyclerView != null) {
                this.mList = onCreateRecyclerView;
                onCreateRecyclerView.i(this.mDividerDecoration);
                setDivider(drawable);
                if (dimensionPixelSize != -1) {
                    setDividerHeight(dimensionPixelSize);
                }
                this.mDividerDecoration.f1599c = z10;
                if (this.mList.getParent() == null) {
                    viewGroup2.addView(this.mList);
                }
                this.mHandler.post(this.mRequestFocus);
                return inflate;
            }
            m9.o.r("Could not create RecyclerView");
            return null;
        }
        a0.j.p("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        return null;
    }

    @Override // androidx.fragment.app.j0
    public void onDestroyView() {
        this.mHandler.removeCallbacks(this.mRequestFocus);
        this.mHandler.removeMessages(1);
        if (this.mHavePrefs) {
            getListView().setAdapter(null);
            PreferenceScreen preferenceScreen = getPreferenceScreen();
            if (preferenceScreen != null) {
                preferenceScreen.onDetached();
            }
            onUnbindPreferences();
        }
        this.mList = null;
        super.onDestroyView();
    }

    public void onDisplayPreferenceDialog(Preference preference) {
        androidx.fragment.app.w kVar;
        getCallbackFragment();
        for (androidx.fragment.app.j0 j0Var = this; j0Var != null; j0Var = j0Var.getParentFragment()) {
        }
        getContext();
        getActivity();
        if (getParentFragmentManager().D(DIALOG_FRAGMENT_TAG) != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            String key = preference.getKey();
            kVar = new d();
            Bundle bundle = new Bundle(1);
            bundle.putString("key", key);
            kVar.setArguments(bundle);
        } else if (preference instanceof ListPreference) {
            String key2 = preference.getKey();
            kVar = new h();
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", key2);
            kVar.setArguments(bundle2);
        } else if (preference instanceof MultiSelectListPreference) {
            String key3 = preference.getKey();
            kVar = new k();
            Bundle bundle3 = new Bundle(1);
            bundle3.putString("key", key3);
            kVar.setArguments(bundle3);
        } else {
            String simpleName = preference.getClass().getSimpleName();
            throw new IllegalArgumentException("Cannot display dialog for an unknown Preference type: " + simpleName + ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.");
        }
        kVar.setTargetFragment(this, 0);
        kVar.j(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
    }

    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        getCallbackFragment();
        for (androidx.fragment.app.j0 j0Var = this; j0Var != null; j0Var = j0Var.getParentFragment()) {
        }
        getContext();
        getActivity();
    }

    public boolean onPreferenceTreeClick(Preference preference) {
        boolean z10;
        if (preference.getFragment() == null) {
            return false;
        }
        getCallbackFragment();
        for (androidx.fragment.app.j0 j0Var = this; j0Var != null; j0Var = j0Var.getParentFragment()) {
        }
        if (getContext() instanceof SettingsActivity) {
            z10 = ((SettingsActivity) getContext()).B(this, preference);
        } else {
            z10 = false;
        }
        if (!z10 && (getActivity() instanceof SettingsActivity)) {
            z10 = ((SettingsActivity) getActivity()).B(this, preference);
        }
        if (!z10) {
            Log.w(TAG, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            g1 parentFragmentManager = getParentFragmentManager();
            Bundle extras = preference.getExtras();
            z0 H = parentFragmentManager.H();
            requireActivity().getClassLoader();
            androidx.fragment.app.j0 a10 = H.a(preference.getFragment());
            a10.setArguments(extras);
            a10.setTargetFragment(this, 0);
            androidx.fragment.app.a aVar = new androidx.fragment.app.a(parentFragmentManager);
            aVar.i(((View) requireView().getParent()).getId(), a10, null);
            if (aVar.f1236j) {
                aVar.f1235i = true;
                aVar.f1237k = null;
                aVar.e();
            } else {
                a0.j.p("This FragmentTransaction is not allowed to be added to the back stack.");
                return false;
            }
        }
        return true;
    }

    @Override // androidx.fragment.app.j0
    public void onSaveInstanceState(Bundle bundle) {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // androidx.fragment.app.j0
    public void onStart() {
        super.onStart();
        f0 f0Var = this.mPreferenceManager;
        f0Var.f1558h = this;
        f0Var.f1559i = this;
    }

    @Override // androidx.fragment.app.j0
    public void onStop() {
        super.onStop();
        f0 f0Var = this.mPreferenceManager;
        f0Var.f1558h = null;
        f0Var.f1559i = null;
    }

    @Override // androidx.fragment.app.j0
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        if (bundle != null && (bundle2 = bundle.getBundle(PREFERENCES_TAG)) != null && (preferenceScreen = getPreferenceScreen()) != null) {
            preferenceScreen.restoreHierarchyState(bundle2);
        }
        if (this.mHavePrefs) {
            bindPreferences();
            Runnable runnable = this.mSelectPreferenceRunnable;
            if (runnable != null) {
                runnable.run();
                this.mSelectPreferenceRunnable = null;
            }
        }
        this.mInitDone = true;
    }

    public void scrollToPreference(Preference preference) {
        x xVar = new x(this, preference, null);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = xVar;
        } else {
            xVar.run();
        }
    }

    public void setDivider(Drawable drawable) {
        y yVar = this.mDividerDecoration;
        if (drawable != null) {
            yVar.getClass();
            yVar.f1598b = drawable.getIntrinsicHeight();
        } else {
            yVar.f1598b = 0;
        }
        yVar.f1597a = drawable;
        RecyclerView recyclerView = yVar.f1600d.mList;
        if (recyclerView.f1644m0.size() == 0) {
            return;
        }
        u0 u0Var = recyclerView.f1640k0;
        if (u0Var != null) {
            u0Var.c("Cannot invalidate item decorations during a scroll or layout");
        }
        recyclerView.S();
        recyclerView.requestLayout();
    }

    public void setDividerHeight(int i2) {
        y yVar = this.mDividerDecoration;
        yVar.f1598b = i2;
        RecyclerView recyclerView = yVar.f1600d.mList;
        if (recyclerView.f1644m0.size() == 0) {
            return;
        }
        u0 u0Var = recyclerView.f1640k0;
        if (u0Var != null) {
            u0Var.c("Cannot invalidate item decorations during a scroll or layout");
        }
        recyclerView.S();
        recyclerView.requestLayout();
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        f0 f0Var = this.mPreferenceManager;
        PreferenceScreen preferenceScreen2 = f0Var.f1557g;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.onDetached();
            }
            f0Var.f1557g = preferenceScreen;
            if (preferenceScreen != null) {
                onUnbindPreferences();
                this.mHavePrefs = true;
                if (this.mInitDone && !this.mHandler.hasMessages(1)) {
                    this.mHandler.obtainMessage(1).sendToTarget();
                }
            }
        }
    }

    public void setPreferencesFromResource(int i2, String str) {
        f0 f0Var = this.mPreferenceManager;
        if (f0Var != null) {
            PreferenceScreen d4 = f0Var.d(requireContext(), i2, null);
            PreferenceScreen preferenceScreen = d4;
            if (str != null) {
                Preference f8 = d4.f(str);
                boolean z10 = f8 instanceof PreferenceScreen;
                preferenceScreen = f8;
                if (!z10) {
                    a0.j.h(kc.a.g("Preference object with key ", str, " is not a PreferenceScreen"));
                    return;
                }
            }
            setPreferenceScreen((PreferenceScreen) preferenceScreen);
            return;
        }
        m9.o.r("This should be called after super.onCreate.");
    }

    public void scrollToPreference(String str) {
        x xVar = new x(this, null, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = xVar;
        } else {
            xVar.run();
        }
    }

    public void onBindPreferences() {
    }

    public void onUnbindPreferences() {
    }
}

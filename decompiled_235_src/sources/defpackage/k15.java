package defpackage;

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
import androidx.fragment.app.a;
import androidx.fragment.app.i;
import androidx.fragment.app.o;
import androidx.fragment.app.u;
import androidx.preference.EditTextPreference;
import androidx.preference.ListPreference;
import androidx.preference.MultiSelectListPreference;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: k15  reason: default package */
/* loaded from: classes.dex */
public abstract class k15 extends o {
    public static final String ARG_PREFERENCE_ROOT = "androidx.preference.PreferenceFragmentCompat.PREFERENCE_ROOT";
    private static final String DIALOG_FRAGMENT_TAG = "androidx.preference.PreferenceFragment.DIALOG";
    private static final int MSG_BIND_PREFERENCES = 1;
    private static final String PREFERENCES_TAG = "android:preferences";
    private static final String TAG = "PreferenceFragment";
    private boolean mHavePrefs;
    private boolean mInitDone;
    RecyclerView mList;
    private v15 mPreferenceManager;
    private Runnable mSelectPreferenceRunnable;
    private final i15 mDividerDecoration = new i15(this);
    private int mLayoutResId = R.layout.preference_list_fragment;
    private final Handler mHandler = new sk1(this, Looper.getMainLooper(), 3);
    private final Runnable mRequestFocus = new g15(this, 0);

    public void addPreferencesFromResource(int i) {
        v15 v15Var = this.mPreferenceManager;
        if (v15Var != null) {
            setPreferenceScreen(v15Var.e(requireContext(), i, getPreferenceScreen()));
        } else {
            u34.j("This should be called after super.onCreate.");
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
        v15 v15Var = this.mPreferenceManager;
        if (v15Var == null || (preferenceScreen = v15Var.g) == null) {
            return null;
        }
        return (T) preferenceScreen.f(charSequence);
    }

    public o getCallbackFragment() {
        return null;
    }

    public final RecyclerView getListView() {
        return this.mList;
    }

    public v15 getPreferenceManager() {
        return this.mPreferenceManager;
    }

    public PreferenceScreen getPreferenceScreen() {
        return this.mPreferenceManager.g;
    }

    @Override // androidx.fragment.app.o
    public void onCreate(Bundle bundle) {
        String str;
        super.onCreate(bundle);
        TypedValue typedValue = new TypedValue();
        requireContext().getTheme().resolveAttribute(R.attr.preferenceTheme, typedValue, true);
        int i = typedValue.resourceId;
        if (i == 0) {
            i = R.style.PreferenceThemeOverlay;
        }
        requireContext().getTheme().applyStyle(i, false);
        v15 v15Var = new v15(requireContext());
        this.mPreferenceManager = v15Var;
        v15Var.j = this;
        if (getArguments() != null) {
            str = getArguments().getString(ARG_PREFERENCE_ROOT);
        } else {
            str = null;
        }
        onCreatePreferences(bundle, str);
    }

    public wf5 onCreateAdapter(PreferenceScreen preferenceScreen) {
        return new t15(preferenceScreen);
    }

    public gg5 onCreateLayoutManager() {
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
        recyclerView2.setAccessibilityDelegateCompat(new w15(recyclerView2));
        return recyclerView2;
    }

    @Override // androidx.fragment.app.o
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        TypedArray obtainStyledAttributes = requireContext().obtainStyledAttributes(null, i75.h, R.attr.preferenceFragmentCompatStyle, 0);
        this.mLayoutResId = obtainStyledAttributes.getResourceId(0, this.mLayoutResId);
        Drawable drawable = obtainStyledAttributes.getDrawable(1);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(2, -1);
        boolean z = obtainStyledAttributes.getBoolean(3, true);
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
                this.mDividerDecoration.c = z;
                if (this.mList.getParent() == null) {
                    viewGroup2.addView(this.mList);
                }
                this.mHandler.post(this.mRequestFocus);
                return inflate;
            }
            u34.j("Could not create RecyclerView");
            return null;
        }
        i.m("Content has view with id attribute 'android.R.id.list_container' that is not a ViewGroup class");
        return null;
    }

    @Override // androidx.fragment.app.o
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
        i b94Var;
        getCallbackFragment();
        for (o oVar = this; oVar != null; oVar = oVar.getParentFragment()) {
        }
        getContext();
        getActivity();
        if (getParentFragmentManager().D(DIALOG_FRAGMENT_TAG) != null) {
            return;
        }
        if (preference instanceof EditTextPreference) {
            String key = preference.getKey();
            b94Var = new fs1();
            Bundle bundle = new Bundle(1);
            bundle.putString("key", key);
            b94Var.setArguments(bundle);
        } else if (preference instanceof ListPreference) {
            String key2 = preference.getKey();
            b94Var = new dx3();
            Bundle bundle2 = new Bundle(1);
            bundle2.putString("key", key2);
            b94Var.setArguments(bundle2);
        } else if (preference instanceof MultiSelectListPreference) {
            String key3 = preference.getKey();
            b94Var = new b94();
            Bundle bundle3 = new Bundle(1);
            bundle3.putString("key", key3);
            b94Var.setArguments(bundle3);
        } else {
            u34.h(preference.getClass().getSimpleName(), ". Make sure to implement onPreferenceDisplayDialog() to handle displaying a custom dialog for this Preference.", "Cannot display dialog for an unknown Preference type: ");
            return;
        }
        b94Var.setTargetFragment(this, 0);
        b94Var.show(getParentFragmentManager(), DIALOG_FRAGMENT_TAG);
    }

    public void onNavigateToScreen(PreferenceScreen preferenceScreen) {
        getCallbackFragment();
        boolean z = true;
        for (o oVar = this; oVar != null; oVar = oVar.getParentFragment()) {
        }
        if (getContext() instanceof SettingsActivity) {
            ((SettingsActivity) getContext()).C(this, preferenceScreen);
        } else {
            z = false;
        }
        if (!z && (getActivity() instanceof SettingsActivity)) {
            ((SettingsActivity) getActivity()).C(this, preferenceScreen);
        }
    }

    public boolean onPreferenceTreeClick(Preference preference) {
        boolean z;
        if (preference.getFragment() == null) {
            return false;
        }
        getCallbackFragment();
        for (o oVar = this; oVar != null; oVar = oVar.getParentFragment()) {
        }
        if (getContext() instanceof SettingsActivity) {
            z = ((SettingsActivity) getContext()).B(this, preference);
        } else {
            z = false;
        }
        if (!z && (getActivity() instanceof SettingsActivity)) {
            z = ((SettingsActivity) getActivity()).B(this, preference);
        }
        if (!z) {
            Log.w(TAG, "onPreferenceStartFragment is not implemented in the parent activity - attempting to use a fallback implementation. You should implement this method so that you can configure the new fragment that will be displayed, and set a transition between the fragments.");
            u parentFragmentManager = getParentFragmentManager();
            Bundle extras = preference.getExtras();
            gl2 H = parentFragmentManager.H();
            requireActivity().getClassLoader();
            o a = H.a(preference.getFragment());
            a.setArguments(extras);
            a.setTargetFragment(this, 0);
            a aVar = new a(parentFragmentManager);
            aVar.e(((View) requireView().getParent()).getId(), a, null);
            aVar.c();
            aVar.h();
            return true;
        }
        return true;
    }

    @Override // androidx.fragment.app.o
    public void onSaveInstanceState(Bundle bundle) {
        PreferenceScreen preferenceScreen = getPreferenceScreen();
        if (preferenceScreen != null) {
            Bundle bundle2 = new Bundle();
            preferenceScreen.saveHierarchyState(bundle2);
            bundle.putBundle(PREFERENCES_TAG, bundle2);
        }
    }

    @Override // androidx.fragment.app.o
    public void onStart() {
        super.onStart();
        v15 v15Var = this.mPreferenceManager;
        v15Var.h = this;
        v15Var.i = this;
    }

    @Override // androidx.fragment.app.o
    public void onStop() {
        super.onStop();
        v15 v15Var = this.mPreferenceManager;
        v15Var.h = null;
        v15Var.i = null;
    }

    @Override // androidx.fragment.app.o
    public void onViewCreated(View view, Bundle bundle) {
        Bundle bundle2;
        PreferenceScreen preferenceScreen;
        super.onViewCreated(view, bundle);
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
        h15 h15Var = new h15(this, preference, null);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = h15Var;
        } else {
            h15Var.run();
        }
    }

    public void setDivider(Drawable drawable) {
        i15 i15Var = this.mDividerDecoration;
        if (drawable != null) {
            i15Var.getClass();
            i15Var.b = drawable.getIntrinsicHeight();
        } else {
            i15Var.b = 0;
        }
        i15Var.a = drawable;
        RecyclerView recyclerView = i15Var.d.mList;
        if (recyclerView.o0.size() == 0) {
            return;
        }
        gg5 gg5Var = recyclerView.m0;
        if (gg5Var != null) {
            gg5Var.c("Cannot invalidate item decorations during a scroll or layout");
        }
        recyclerView.S();
        recyclerView.requestLayout();
    }

    public void setDividerHeight(int i) {
        i15 i15Var = this.mDividerDecoration;
        i15Var.b = i;
        RecyclerView recyclerView = i15Var.d.mList;
        if (recyclerView.o0.size() == 0) {
            return;
        }
        gg5 gg5Var = recyclerView.m0;
        if (gg5Var != null) {
            gg5Var.c("Cannot invalidate item decorations during a scroll or layout");
        }
        recyclerView.S();
        recyclerView.requestLayout();
    }

    public void setPreferenceScreen(PreferenceScreen preferenceScreen) {
        v15 v15Var = this.mPreferenceManager;
        PreferenceScreen preferenceScreen2 = v15Var.g;
        if (preferenceScreen != preferenceScreen2) {
            if (preferenceScreen2 != null) {
                preferenceScreen2.onDetached();
            }
            v15Var.g = preferenceScreen;
            if (preferenceScreen != null) {
                onUnbindPreferences();
                this.mHavePrefs = true;
                if (this.mInitDone && !this.mHandler.hasMessages(1)) {
                    this.mHandler.obtainMessage(1).sendToTarget();
                }
            }
        }
    }

    public void setPreferencesFromResource(int i, String str) {
        v15 v15Var = this.mPreferenceManager;
        if (v15Var != null) {
            PreferenceScreen e = v15Var.e(requireContext(), i, null);
            PreferenceScreen preferenceScreen = e;
            if (str != null) {
                Preference f = e.f(str);
                boolean z = f instanceof PreferenceScreen;
                preferenceScreen = f;
                if (!z) {
                    i.h(lb1.A("Preference object with key ", str, " is not a PreferenceScreen"));
                    return;
                }
            }
            setPreferenceScreen((PreferenceScreen) preferenceScreen);
            return;
        }
        u34.j("This should be called after super.onCreate.");
    }

    public void scrollToPreference(String str) {
        h15 h15Var = new h15(this, null, str);
        if (this.mList == null) {
            this.mSelectPreferenceRunnable = h15Var;
        } else {
            h15Var.run();
        }
    }

    public void onBindPreferences() {
    }

    public void onUnbindPreferences() {
    }
}

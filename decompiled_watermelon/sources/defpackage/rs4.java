package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rs4  reason: default package */
/* loaded from: classes.dex */
public final class rs4 extends g65 implements tr4 {
    public final PreferenceGroup d;
    public ArrayList e;
    public ArrayList f;
    public final ArrayList g;
    public final es4 i = new es4(19, this);
    public final Handler h = new Handler(Looper.getMainLooper());

    public rs4(PreferenceScreen preferenceScreen) {
        this.d = preferenceScreen;
        preferenceScreen.setOnPreferenceChangeInternalListener(this);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        g(preferenceScreen.Z);
        m();
    }

    @Override // defpackage.g65
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.g65
    public final long b(int i) {
        if (!this.b) {
            return -1L;
        }
        return j(i).getId();
    }

    @Override // defpackage.g65
    public final int c(int i) {
        qs4 qs4Var = new qs4(j(i));
        ArrayList arrayList = this.g;
        int indexOf = arrayList.indexOf(qs4Var);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(qs4Var);
        return size;
    }

    @Override // defpackage.g65
    public final void e(g75 g75Var, int i) {
        vs4 vs4Var = (vs4) g75Var;
        Preference j = j(i);
        ColorStateList colorStateList = vs4Var.v;
        View view = vs4Var.a;
        Drawable background = view.getBackground();
        Drawable drawable = vs4Var.u;
        if (background != drawable) {
            WeakHashMap weakHashMap = aa7.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) vs4Var.q(16908310);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        j.onBindViewHolder(vs4Var);
    }

    @Override // defpackage.g65
    public final g75 f(ViewGroup viewGroup, int i) {
        qs4 qs4Var = (qs4) this.g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, xx4.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = l07.M(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(qs4Var.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap weakHashMap = aa7.a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = qs4Var.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new vs4(inflate);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [i32, java.lang.Object, androidx.preference.Preference] */
    public final ArrayList h(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.B.size();
        int i = 0;
        int i2 = 0;
        while (true) {
            String str = null;
            if (i < size) {
                Preference g = preferenceGroup.g(i);
                if (g.isVisible()) {
                    int i3 = preferenceGroup.Y;
                    if (i3 != Integer.MAX_VALUE && i2 >= i3) {
                        arrayList2.add(g);
                    } else {
                        arrayList.add(g);
                    }
                    if (!(g instanceof PreferenceGroup)) {
                        i2++;
                    } else {
                        PreferenceGroup preferenceGroup2 = (PreferenceGroup) g;
                        if (preferenceGroup2 instanceof PreferenceScreen) {
                            continue;
                        } else if (preferenceGroup.Y != Integer.MAX_VALUE && preferenceGroup2.Y != Integer.MAX_VALUE) {
                            i.n("Nesting an expandable group inside of another expandable group is not supported!");
                            return null;
                        } else {
                            ArrayList h = h(preferenceGroup2);
                            int size2 = h.size();
                            int i4 = 0;
                            while (i4 < size2) {
                                Object obj = h.get(i4);
                                i4++;
                                Preference preference = (Preference) obj;
                                int i5 = preferenceGroup.Y;
                                if (i5 != Integer.MAX_VALUE && i2 >= i5) {
                                    arrayList2.add(preference);
                                } else {
                                    arrayList.add(preference);
                                }
                                i2++;
                            }
                        }
                    }
                }
                i++;
            } else {
                int i6 = preferenceGroup.Y;
                if (i6 != Integer.MAX_VALUE && i2 > i6) {
                    Context context = preferenceGroup.getContext();
                    long id = preferenceGroup.getId();
                    ?? preference2 = new Preference(context, null);
                    preference2.setLayoutResource(R.layout.expand_button);
                    preference2.setIcon(R.drawable.ic_arrow_down_24dp);
                    preference2.setTitle(R.string.expand_button_title);
                    preference2.setOrder(999);
                    ArrayList arrayList3 = new ArrayList();
                    int size3 = arrayList2.size();
                    int i7 = 0;
                    while (i7 < size3) {
                        Object obj2 = arrayList2.get(i7);
                        i7++;
                        Preference preference3 = (Preference) obj2;
                        CharSequence title = preference3.getTitle();
                        boolean z = preference3 instanceof PreferenceGroup;
                        if (z && !TextUtils.isEmpty(title)) {
                            arrayList3.add((PreferenceGroup) preference3);
                        }
                        if (arrayList3.contains(preference3.getParent())) {
                            if (z) {
                                arrayList3.add((PreferenceGroup) preference3);
                            }
                        } else if (!TextUtils.isEmpty(title)) {
                            if (str == null) {
                                str = title;
                            } else {
                                str = preference2.getContext().getString(R.string.summary_collapsed_preference_list, str, title);
                            }
                        }
                    }
                    preference2.setSummary(str);
                    preference2.A = id + 1000000;
                    preference2.setOnPreferenceClickListener(new ci3(13, this, preferenceGroup, false));
                    arrayList.add(preference2);
                }
                return arrayList;
            }
        }
    }

    public final void i(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.B);
        }
        int size = preferenceGroup.B.size();
        for (int i = 0; i < size; i++) {
            Preference g = preferenceGroup.g(i);
            arrayList.add(g);
            qs4 qs4Var = new qs4(g);
            if (!this.g.contains(qs4Var)) {
                this.g.add(qs4Var);
            }
            if (g instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) g;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    i(arrayList, preferenceGroup2);
                }
            }
            g.setOnPreferenceChangeInternalListener(this);
        }
    }

    public final Preference j(int i) {
        if (i >= 0 && i < this.f.size()) {
            return (Preference) this.f.get(i);
        }
        return null;
    }

    public final int k(Preference preference) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            Preference preference2 = (Preference) this.f.get(i);
            if (preference2 != null && preference2.equals(preference)) {
                return i;
            }
        }
        return -1;
    }

    public final int l(String str) {
        int size = this.f.size();
        for (int i = 0; i < size; i++) {
            if (TextUtils.equals(str, ((Preference) this.f.get(i)).getKey())) {
                return i;
            }
        }
        return -1;
    }

    public final void m() {
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            ((Preference) obj).setOnPreferenceChangeInternalListener(null);
        }
        ArrayList arrayList2 = new ArrayList(this.e.size());
        this.e = arrayList2;
        PreferenceGroup preferenceGroup = this.d;
        i(arrayList2, preferenceGroup);
        this.f = h(preferenceGroup);
        preferenceGroup.getPreferenceManager();
        this.a.b();
        ArrayList arrayList3 = this.e;
        int size2 = arrayList3.size();
        while (i < size2) {
            Object obj2 = arrayList3.get(i);
            i++;
            ((Preference) obj2).clearWasDetached();
        }
    }
}

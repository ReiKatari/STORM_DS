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
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: t15  reason: default package */
/* loaded from: classes.dex */
public final class t15 extends wf5 implements w05 {
    public final PreferenceGroup d;
    public ArrayList e;
    public ArrayList f;
    public final ArrayList g;
    public final g15 i = new g15(this, 19);
    public final Handler h = new Handler(Looper.getMainLooper());

    public t15(PreferenceScreen preferenceScreen) {
        this.d = preferenceScreen;
        preferenceScreen.setOnPreferenceChangeInternalListener(this);
        this.e = new ArrayList();
        this.f = new ArrayList();
        this.g = new ArrayList();
        g(preferenceScreen.Z);
        m();
    }

    @Override // defpackage.wf5
    public final int a() {
        return this.f.size();
    }

    @Override // defpackage.wf5
    public final long b(int i) {
        if (!this.b) {
            return -1L;
        }
        return j(i).getId();
    }

    @Override // defpackage.wf5
    public final int c(int i) {
        s15 s15Var = new s15(j(i));
        ArrayList arrayList = this.g;
        int indexOf = arrayList.indexOf(s15Var);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(s15Var);
        return size;
    }

    @Override // defpackage.wf5
    public final void e(wg5 wg5Var, int i) {
        x15 x15Var = (x15) wg5Var;
        Preference j = j(i);
        ColorStateList colorStateList = x15Var.v;
        View view = x15Var.a;
        Drawable background = view.getBackground();
        Drawable drawable = x15Var.u;
        if (background != drawable) {
            WeakHashMap weakHashMap = ao7.a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) x15Var.q(16908310);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        j.onBindViewHolder(x15Var);
    }

    @Override // defpackage.wf5
    public final wg5 f(ViewGroup viewGroup, int i) {
        s15 s15Var = (s15) this.g.get(i);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, i75.a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = hf.S(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(s15Var.a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap weakHashMap = ao7.a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i2 = s15Var.b;
            if (i2 != 0) {
                from.inflate(i2, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new x15(inflate);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [a82, java.lang.Object, androidx.preference.Preference] */
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
                            i.m("Nesting an expandable group inside of another expandable group is not supported!");
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
                    preference2.setOnPreferenceClickListener(new ap3(16, this, preferenceGroup, false));
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
            s15 s15Var = new s15(g);
            if (!this.g.contains(s15Var)) {
                this.g.add(s15Var);
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

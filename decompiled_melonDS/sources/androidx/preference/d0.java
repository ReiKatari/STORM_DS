package androidx.preference;

import a6.x0;
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
import j7.j1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.WeakHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class d0 extends j7.k0 implements n {

    /* renamed from: d  reason: collision with root package name */
    public final PreferenceGroup f1539d;

    /* renamed from: e  reason: collision with root package name */
    public ArrayList f1540e;

    /* renamed from: f  reason: collision with root package name */
    public ArrayList f1541f;

    /* renamed from: g  reason: collision with root package name */
    public final ArrayList f1542g;

    /* renamed from: i  reason: collision with root package name */
    public final w f1544i = new w(2, this);

    /* renamed from: h  reason: collision with root package name */
    public final Handler f1543h = new Handler(Looper.getMainLooper());

    public d0(PreferenceScreen preferenceScreen) {
        this.f1539d = preferenceScreen;
        preferenceScreen.setOnPreferenceChangeInternalListener(this);
        this.f1540e = new ArrayList();
        this.f1541f = new ArrayList();
        this.f1542g = new ArrayList();
        h(preferenceScreen.Z);
        n();
    }

    @Override // j7.k0
    public final int a() {
        return this.f1541f.size();
    }

    @Override // j7.k0
    public final long b(int i2) {
        if (!this.f7620b) {
            return -1L;
        }
        return k(i2).getId();
    }

    @Override // j7.k0
    public final int c(int i2) {
        c0 c0Var = new c0(k(i2));
        ArrayList arrayList = this.f1542g;
        int indexOf = arrayList.indexOf(c0Var);
        if (indexOf != -1) {
            return indexOf;
        }
        int size = arrayList.size();
        arrayList.add(c0Var);
        return size;
    }

    @Override // j7.k0
    public final void e(j1 j1Var, int i2) {
        i0 i0Var = (i0) j1Var;
        Preference k10 = k(i2);
        ColorStateList colorStateList = i0Var.f1566v;
        View view = i0Var.f7594a;
        Drawable background = view.getBackground();
        Drawable drawable = i0Var.f1565u;
        if (background != drawable) {
            WeakHashMap weakHashMap = x0.f533a;
            view.setBackground(drawable);
        }
        TextView textView = (TextView) i0Var.q(16908310);
        if (textView != null && colorStateList != null && !textView.getTextColors().equals(colorStateList)) {
            textView.setTextColor(colorStateList);
        }
        k10.onBindViewHolder(i0Var);
    }

    @Override // j7.k0
    public final j1 f(ViewGroup viewGroup, int i2) {
        c0 c0Var = (c0) this.f1542g.get(i2);
        LayoutInflater from = LayoutInflater.from(viewGroup.getContext());
        TypedArray obtainStyledAttributes = viewGroup.getContext().obtainStyledAttributes((AttributeSet) null, j0.f1571a);
        Drawable drawable = obtainStyledAttributes.getDrawable(0);
        if (drawable == null) {
            drawable = k7.w.p(viewGroup.getContext(), 17301602);
        }
        obtainStyledAttributes.recycle();
        View inflate = from.inflate(c0Var.f1532a, viewGroup, false);
        if (inflate.getBackground() == null) {
            WeakHashMap weakHashMap = x0.f533a;
            inflate.setBackground(drawable);
        }
        ViewGroup viewGroup2 = (ViewGroup) inflate.findViewById(16908312);
        if (viewGroup2 != null) {
            int i10 = c0Var.f1533b;
            if (i10 != 0) {
                from.inflate(i10, viewGroup2);
            } else {
                viewGroup2.setVisibility(8);
            }
        }
        return new i0(inflate);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [androidx.preference.e, java.lang.Object, androidx.preference.Preference] */
    public final ArrayList i(PreferenceGroup preferenceGroup) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        int size = preferenceGroup.B.size();
        int i2 = 0;
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            Preference g10 = preferenceGroup.g(i11);
            if (g10.isVisible()) {
                int i12 = preferenceGroup.Y;
                if (i12 != Integer.MAX_VALUE && i10 >= i12) {
                    arrayList2.add(g10);
                } else {
                    arrayList.add(g10);
                }
                if (!(g10 instanceof PreferenceGroup)) {
                    i10++;
                } else {
                    PreferenceGroup preferenceGroup2 = (PreferenceGroup) g10;
                    if (preferenceGroup2 instanceof PreferenceScreen) {
                        continue;
                    } else if (preferenceGroup.Y != Integer.MAX_VALUE && preferenceGroup2.Y != Integer.MAX_VALUE) {
                        a0.j.p("Nesting an expandable group inside of another expandable group is not supported!");
                        return null;
                    } else {
                        ArrayList i13 = i(preferenceGroup2);
                        int size2 = i13.size();
                        int i14 = 0;
                        while (i14 < size2) {
                            Object obj = i13.get(i14);
                            i14++;
                            Preference preference = (Preference) obj;
                            int i15 = preferenceGroup.Y;
                            if (i15 != Integer.MAX_VALUE && i10 >= i15) {
                                arrayList2.add(preference);
                            } else {
                                arrayList.add(preference);
                            }
                            i10++;
                        }
                    }
                }
            }
        }
        int i16 = preferenceGroup.Y;
        if (i16 != Integer.MAX_VALUE && i10 > i16) {
            Context context = preferenceGroup.getContext();
            long id2 = preferenceGroup.getId();
            String str = null;
            ?? preference2 = new Preference(context, null);
            preference2.setLayoutResource(R.layout.expand_button);
            preference2.setIcon(R.drawable.ic_arrow_down_24dp);
            preference2.setTitle(R.string.expand_button_title);
            preference2.setOrder(999);
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList2.size();
            while (i2 < size3) {
                Object obj2 = arrayList2.get(i2);
                i2++;
                Preference preference3 = (Preference) obj2;
                CharSequence title = preference3.getTitle();
                boolean z10 = preference3 instanceof PreferenceGroup;
                if (z10 && !TextUtils.isEmpty(title)) {
                    arrayList3.add((PreferenceGroup) preference3);
                }
                if (arrayList3.contains(preference3.getParent())) {
                    if (z10) {
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
            preference2.A = id2 + 1000000;
            preference2.setOnPreferenceClickListener(new a0.g(7, this, preferenceGroup, false));
            arrayList.add(preference2);
        }
        return arrayList;
    }

    public final void j(ArrayList arrayList, PreferenceGroup preferenceGroup) {
        synchronized (preferenceGroup) {
            Collections.sort(preferenceGroup.B);
        }
        int size = preferenceGroup.B.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference g10 = preferenceGroup.g(i2);
            arrayList.add(g10);
            c0 c0Var = new c0(g10);
            if (!this.f1542g.contains(c0Var)) {
                this.f1542g.add(c0Var);
            }
            if (g10 instanceof PreferenceGroup) {
                PreferenceGroup preferenceGroup2 = (PreferenceGroup) g10;
                if (!(preferenceGroup2 instanceof PreferenceScreen)) {
                    j(arrayList, preferenceGroup2);
                }
            }
            g10.setOnPreferenceChangeInternalListener(this);
        }
    }

    public final Preference k(int i2) {
        if (i2 >= 0 && i2 < this.f1541f.size()) {
            return (Preference) this.f1541f.get(i2);
        }
        return null;
    }

    public final int l(Preference preference) {
        int size = this.f1541f.size();
        for (int i2 = 0; i2 < size; i2++) {
            Preference preference2 = (Preference) this.f1541f.get(i2);
            if (preference2 != null && preference2.equals(preference)) {
                return i2;
            }
        }
        return -1;
    }

    public final int m(String str) {
        int size = this.f1541f.size();
        for (int i2 = 0; i2 < size; i2++) {
            if (TextUtils.equals(str, ((Preference) this.f1541f.get(i2)).getKey())) {
                return i2;
            }
        }
        return -1;
    }

    public final void n() {
        ArrayList arrayList = this.f1540e;
        int size = arrayList.size();
        int i2 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ((Preference) obj).setOnPreferenceChangeInternalListener(null);
        }
        ArrayList arrayList2 = new ArrayList(this.f1540e.size());
        this.f1540e = arrayList2;
        PreferenceGroup preferenceGroup = this.f1539d;
        j(arrayList2, preferenceGroup);
        this.f1541f = i(preferenceGroup);
        preferenceGroup.getPreferenceManager();
        this.f7619a.b();
        ArrayList arrayList3 = this.f1540e;
        int size2 = arrayList3.size();
        while (i2 < size2) {
            Object obj2 = arrayList3.get(i2);
            i2++;
            ((Preference) obj2).clearWasDetached();
        }
    }
}

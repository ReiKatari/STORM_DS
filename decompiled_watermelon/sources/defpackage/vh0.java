package defpackage;

import android.hardware.camera2.CameraAccessException;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment;
import me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment$onCreateRecyclerView$1$2;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vh0  reason: default package */
/* loaded from: classes.dex */
public final class vh0 {
    public final /* synthetic */ int a;
    public Serializable b;
    public int c;
    public Object d;
    public Object e;
    public Object f;

    public vh0(int i) {
        this.a = i;
        switch (i) {
            case 4:
                return;
            default:
                this.d = new HashSet();
                this.e = x14.f();
                this.c = -1;
                this.b = new ArrayList();
                this.f = m24.a();
                return;
        }
    }

    public void a() {
        List<na0> n1;
        synchronized (((ArrayList) this.b)) {
            n1 = tq0.n1((ArrayList) this.b);
            ((ArrayList) this.b).clear();
        }
        for (na0 na0Var : n1) {
            Trace.beginSection("InvokeInternalListeners");
            int size = na0Var.d.size();
            for (int i = 0; i < size; i++) {
                gb5 gb5Var = (gb5) na0Var.d.get(i);
                int size2 = na0Var.e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((ra5) na0Var.e.get(i2)).N(gb5Var.Q());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = na0Var.d.size();
            for (int i3 = 0; i3 < size3; i3++) {
                gb5 gb5Var2 = (gb5) na0Var.d.get(i3);
                int size4 = gb5Var2.Q().d.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((ra5) gb5Var2.Q().d.get(i4)).N(gb5Var2.Q());
                }
            }
            Trace.endSection();
        }
        pa0 pa0Var = (pa0) this.d;
        synchronized (pa0Var.j) {
            Log.d("CXCP", pa0Var + "#abortCaptures");
            pa0Var.a.U();
        }
    }

    public void b(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            c((sb0) it.next());
        }
    }

    public void c(sb0 sb0Var) {
        ArrayList arrayList = (ArrayList) this.b;
        if (arrayList.contains(sb0Var)) {
            return;
        }
        arrayList.add(sb0Var);
    }

    public void d(cw0 cw0Var) {
        for (uw uwVar : cw0Var.e()) {
            ((x14) this.e).d(uwVar, null);
            ((x14) this.e).m(uwVar, cw0Var.c(uwVar), cw0Var.g(uwVar));
        }
    }

    /* JADX WARN: Type inference failed for: r2v6, types: [double[], java.io.Serializable] */
    public void e(double d, float f) {
        int length = ((float[]) this.d).length + 1;
        int binarySearch = Arrays.binarySearch((double[]) this.e, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.e = Arrays.copyOf((double[]) this.e, length);
        this.d = Arrays.copyOf((float[]) this.d, length);
        this.b = new double[length];
        double[] dArr = (double[]) this.e;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        ((double[]) this.e)[binarySearch] = d;
        ((float[]) this.d)[binarySearch] = f;
    }

    public void f(View view, int i, boolean z) {
        int o;
        RecyclerView recyclerView = ((e65) this.d).A;
        if (i < 0) {
            o = recyclerView.getChildCount();
        } else {
            o = o(i);
        }
        ((yj) this.e).f(o, z);
        if (z) {
            r(view);
        }
        recyclerView.addView(view, o);
        RecyclerView.N(view);
        ArrayList arrayList = recyclerView.A0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                BasePreferenceFragment$onCreateRecyclerView$1$2 basePreferenceFragment$onCreateRecyclerView$1$2 = (BasePreferenceFragment$onCreateRecyclerView$1$2) recyclerView.A0.get(size);
                basePreferenceFragment$onCreateRecyclerView$1$2.getClass();
                view.getClass();
                final RecyclerView recyclerView2 = basePreferenceFragment$onCreateRecyclerView$1$2.a;
                final BasePreferenceFragment basePreferenceFragment = basePreferenceFragment$onCreateRecyclerView$1$2.b;
                view.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: v00
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z2) {
                        int i2;
                        rs4 rs4Var;
                        SettingsActivity settingsActivity;
                        String str;
                        RecyclerView recyclerView3;
                        if (z2) {
                            g75 N = RecyclerView.N(view2);
                            if (N == null || (recyclerView3 = N.r) == null) {
                                i2 = -1;
                            } else {
                                i2 = recyclerView3.K(N);
                            }
                            g65 adapter = RecyclerView.this.getAdapter();
                            if (adapter instanceof rs4) {
                                rs4Var = (rs4) adapter;
                            } else {
                                rs4Var = null;
                            }
                            if (i2 != -1 && rs4Var != null) {
                                Preference j = rs4Var.j(i2);
                                if (j == null) {
                                    j = null;
                                }
                                if (j != null) {
                                    p activity = basePreferenceFragment.getActivity();
                                    if (activity instanceof SettingsActivity) {
                                        settingsActivity = (SettingsActivity) activity;
                                    } else {
                                        settingsActivity = null;
                                    }
                                    if (settingsActivity != null) {
                                        ee6 ee6Var = settingsActivity.B0;
                                        CharSequence title = j.getTitle();
                                        String str2 = (title == null || (str2 = title.toString()) == null) ? "" : "";
                                        CharSequence summary = j.getSummary();
                                        if (summary != null) {
                                            str = summary.toString();
                                        } else {
                                            str = null;
                                        }
                                        t16 t16Var = new t16(str2, str, j.getIcon());
                                        ee6Var.getClass();
                                        ee6Var.l(null, t16Var);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public void g(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int o;
        RecyclerView recyclerView = ((e65) this.d).A;
        if (i < 0) {
            o = recyclerView.getChildCount();
        } else {
            o = o(i);
        }
        ((yj) this.e).f(o, z);
        if (z) {
            r(view);
        }
        g75 N = RecyclerView.N(view);
        if (N != null) {
            if (!N.j() && !N.o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(N);
                i.j(sb, recyclerView.C());
                return;
            }
            if (RecyclerView.y1) {
                Log.d("RecyclerView", "reAttach " + N);
            }
            N.j &= -257;
        } else if (RecyclerView.x1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String C = recyclerView.C();
            sb2.append(", index: ");
            sb2.append(o);
            sb2.append(C);
            throw new IllegalArgumentException(sb2.toString());
        }
        recyclerView.attachViewToParent(view, o, layoutParams);
    }

    public wh0 h() {
        ArrayList arrayList = new ArrayList((HashSet) this.d);
        ef4 b = ef4.b((x14) this.e);
        int i = this.c;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.b);
        m24 m24Var = (m24) this.f;
        im6 im6Var = im6.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : m24Var.a.keySet()) {
            arrayMap.put(str, m24Var.a.get(str));
        }
        return new wh0(arrayList, b, i, arrayList2, new im6(arrayMap));
    }

    public void i(int i) {
        int o = o(i);
        ((yj) this.e).h(o);
        RecyclerView recyclerView = ((e65) this.d).A;
        View childAt = recyclerView.getChildAt(o);
        if (childAt != null) {
            g75 N = RecyclerView.N(childAt);
            if (N != null) {
                if (N.j() && !N.o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(N);
                    i.j(sb, recyclerView.C());
                    return;
                }
                if (RecyclerView.y1) {
                    Log.d("RecyclerView", "tmpDetach " + N);
                }
                N.a(256);
            }
        } else if (RecyclerView.x1) {
            i.f(o, recyclerView.C(), "No view at offset ");
            return;
        }
        recyclerView.detachViewFromParent(o);
    }

    public b44 j(int i) {
        return l(i, (g44) this.d, null, false);
    }

    public b44 k(String str, boolean z) {
        Object obj;
        g44 g44Var;
        str.getClass();
        ec6 ec6Var = (ec6) this.e;
        ec6Var.getClass();
        Iterator it = ((ay0) d06.w0(new v0(5, ec6Var))).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                b44 b44Var = (b44) obj;
                if (!gh6.g0((String) b44Var.B.e, str, false)) {
                    if (b44Var.B.l(str) != null) {
                        break;
                    }
                } else {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        b44 b44Var2 = (b44) obj;
        if (b44Var2 == null) {
            if (!z || (g44Var = ((g44) this.d).L) == null) {
                return null;
            }
            vh0 vh0Var = g44Var.Y;
            vh0Var.getClass();
            if (zg6.B0(str)) {
                return null;
            }
            return vh0Var.k(str, true);
        }
        return b44Var2;
    }

    public b44 l(int i, b44 b44Var, b44 b44Var2, boolean z) {
        g44 g44Var = (g44) this.d;
        ec6 ec6Var = (ec6) this.e;
        b44 b44Var3 = (b44) ec6Var.c(i);
        if (b44Var2 != null) {
            if (b53.x(b44Var3, b44Var2) && b53.x(b44Var3.L, b44Var2.L)) {
                return b44Var3;
            }
            b44Var3 = null;
        } else if (b44Var3 != null) {
            return b44Var3;
        }
        if (z) {
            Iterator it = ((ay0) d06.w0(new v0(5, ec6Var))).iterator();
            while (true) {
                if (it.hasNext()) {
                    b44 b44Var4 = (b44) it.next();
                    if ((b44Var4 instanceof g44) && !b44Var4.equals(b44Var)) {
                        b44Var3 = ((g44) b44Var4).Y.l(i, g44Var, b44Var2, true);
                        continue;
                    } else {
                        b44Var3 = null;
                        continue;
                    }
                    if (b44Var3 != null) {
                        break;
                    }
                } else {
                    b44Var3 = null;
                    break;
                }
            }
        }
        if (b44Var3 == null) {
            g44 g44Var2 = g44Var.L;
            if (g44Var2 == null || g44Var2.equals(b44Var)) {
                return null;
            }
            g44 g44Var3 = g44Var.L;
            g44Var3.getClass();
            return g44Var3.Y.l(i, g44Var, b44Var2, z);
        }
        return b44Var3;
    }

    public View m(int i) {
        return ((e65) this.d).A.getChildAt(o(i));
    }

    public int n() {
        return ((e65) this.d).A.getChildCount() - ((ArrayList) this.b).size();
    }

    public int o(int i) {
        yj yjVar = (yj) this.e;
        if (i >= 0) {
            int childCount = ((e65) this.d).A.getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                int b = i - (i2 - yjVar.b(i2));
                if (b == 0) {
                    while (yjVar.d(i2)) {
                        i2++;
                    }
                    return i2;
                }
                i2 += b;
            }
            return -1;
        }
        return -1;
    }

    public View p(int i) {
        return ((e65) this.d).A.getChildAt(i);
    }

    public int q() {
        return ((e65) this.d).A.getChildCount();
    }

    public void r(View view) {
        ((ArrayList) this.b).add(view);
        e65 e65Var = (e65) this.d;
        g75 N = RecyclerView.N(view);
        if (N != null) {
            View view2 = N.a;
            RecyclerView recyclerView = e65Var.A;
            int i = N.q;
            if (i != -1) {
                N.p = i;
            } else {
                N.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.Q()) {
                N.q = 4;
                recyclerView.p1.add(N);
                return;
            }
            view2.setImportantForAccessibility(4);
        }
    }

    public a44 s(a44 a44Var, os osVar, boolean z, b44 b44Var) {
        a44 a44Var2;
        g44 g44Var = (g44) this.d;
        ArrayList arrayList = new ArrayList();
        Iterator it = g44Var.iterator();
        while (true) {
            i44 i44Var = (i44) it;
            a44Var2 = null;
            if (!i44Var.hasNext()) {
                break;
            }
            b44 b44Var2 = (b44) i44Var.next();
            if (!b53.x(b44Var2, b44Var)) {
                a44Var2 = b44Var2.i(osVar);
            }
            if (a44Var2 != null) {
                arrayList.add(a44Var2);
            }
        }
        a44 a44Var3 = (a44) tq0.V0(arrayList);
        g44 g44Var2 = g44Var.L;
        if (g44Var2 != null && z && !g44Var2.equals(b44Var)) {
            a44Var2 = g44Var2.j(osVar, g44Var);
        }
        return (a44) tq0.V0(nu.o0(new a44[]{a44Var, a44Var3, a44Var2}));
    }

    public o27 t() {
        Log.d("CXCP", "Closing " + this);
        boolean a = ((aw) this.e).a();
        o27 o27Var = o27.a;
        if (a) {
            ((pa0) this.d).c();
            p31 p31Var = p31.COROUTINE_SUSPENDED;
        }
        return o27Var;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                return ((yj) this.e).toString() + ", hidden list:" + ((ArrayList) this.b).size();
            case 2:
                return "GraphRequestProcessor-" + this.c;
            case 3:
            default:
                return super.toString();
            case 4:
                return "pos =" + Arrays.toString((double[]) this.e) + " period=" + Arrays.toString((float[]) this.d);
        }
    }

    public void u() {
        pa0 pa0Var = (pa0) this.d;
        synchronized (pa0Var.j) {
            Log.d("CXCP", pa0Var + "#stopRepeating");
            pa0Var.a.A();
        }
    }

    public boolean v(boolean z, List list, Map map, Map map2, Map map3, List list2) {
        Throwable th;
        boolean z2;
        int i;
        boolean z3;
        map.getClass();
        map2.getClass();
        map3.getClass();
        list2.getClass();
        if (((aw) this.e).b()) {
            Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            na0 b = ((pa0) this.d).b(z, list, map, map2, map3, (t71) this.f, list2);
            if (b == null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((sa5) it.next()).getClass();
                    }
                }
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
                return false;
            } else if (((aw) this.e).b()) {
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
                return false;
            } else {
                if (!b.b) {
                    synchronized (((ArrayList) this.b)) {
                        ((ArrayList) this.b).add(b);
                    }
                }
                try {
                    Log.d("CXCP", this + " submitting " + b);
                    Trace.beginSection("InvokeInternalListeners");
                    int size = b.d.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        gb5 gb5Var = (gb5) b.d.get(i2);
                        int size2 = b.e.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            ((ra5) b.e.get(i3)).x(gb5Var);
                        }
                    }
                    Trace.endSection();
                    Trace.beginSection("InvokeRequestListeners");
                    int size3 = b.d.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        gb5 gb5Var2 = (gb5) b.d.get(i4);
                        int size4 = gb5Var2.Q().d.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            ((ra5) gb5Var2.Q().d.get(i5)).x(gb5Var2);
                        }
                    }
                } catch (CameraAccessException unused) {
                    if (!b.b) {
                        synchronized (((ArrayList) this.b)) {
                            ((ArrayList) this.b).remove(b);
                            Trace.beginSection("InvokeInternalListeners");
                            int size5 = b.d.size();
                            for (int i6 = 0; i6 < size5; i6++) {
                                gb5 gb5Var3 = (gb5) b.d.get(i6);
                                int size6 = b.e.size();
                                for (int i7 = 0; i7 < size6; i7++) {
                                    ((ra5) b.e.get(i7)).N(gb5Var3.Q());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size7 = b.d.size();
                            for (int i8 = 0; i8 < size7; i8++) {
                                gb5 gb5Var4 = (gb5) b.d.get(i8);
                                int size8 = gb5Var4.Q().d.size();
                                for (int i9 = 0; i9 < size8; i9++) {
                                    ((ra5) gb5Var4.Q().d.get(i9)).N(gb5Var4.Q());
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z2 = false;
                }
                synchronized (b) {
                    if (((aw) this.e).b()) {
                        Log.w("CXCP", "Failed to submit " + b + ": " + this + " is closed.");
                        if (!b.b) {
                            synchronized (((ArrayList) this.b)) {
                                ((ArrayList) this.b).remove(b);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size9 = b.d.size();
                            for (int i10 = 0; i10 < size9; i10++) {
                                gb5 gb5Var5 = (gb5) b.d.get(i10);
                                int size10 = b.e.size();
                                for (int i11 = 0; i11 < size10; i11++) {
                                    ((ra5) b.e.get(i11)).N(gb5Var5.Q());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size11 = b.d.size();
                            for (int i12 = 0; i12 < size11; i12++) {
                                gb5 gb5Var6 = (gb5) b.d.get(i12);
                                int size12 = gb5Var6.Q().d.size();
                                for (int i13 = 0; i13 < size12; i13++) {
                                    ((ra5) gb5Var6.Q().d.get(i13)).N(gb5Var6.Q());
                                }
                            }
                            return false;
                        }
                    } else {
                        Trace.beginSection("CXCP#submit(CaptureSequence)");
                        Integer d = ((pa0) this.d).d(b);
                        if (d != null) {
                            i = d.intValue();
                        } else {
                            i = -1;
                        }
                        b.m = Integer.valueOf(i);
                        if (i != -1) {
                            Trace.beginSection("InvokeInternalListeners");
                            int size13 = b.d.size();
                            for (int i14 = 0; i14 < size13; i14++) {
                                gb5 gb5Var7 = (gb5) b.d.get(i14);
                                int size14 = b.e.size();
                                for (int i15 = 0; i15 < size14; i15++) {
                                    ((ra5) b.e.get(i15)).C(gb5Var7);
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size15 = b.d.size();
                            for (int i16 = 0; i16 < size15; i16++) {
                                gb5 gb5Var8 = (gb5) b.d.get(i16);
                                int size16 = gb5Var8.Q().d.size();
                                for (int i17 = 0; i17 < size16; i17++) {
                                    ((ra5) gb5Var8.Q().d.get(i17)).C(gb5Var8);
                                }
                            }
                            z3 = true;
                            try {
                                Log.d("CXCP", this + " submitted " + b);
                            } catch (CameraAccessException unused2) {
                            } catch (Throwable th3) {
                                z2 = true;
                                th = th3;
                                if (!z2 && !b.b) {
                                    synchronized (((ArrayList) this.b)) {
                                        ((ArrayList) this.b).remove(b);
                                    }
                                    Trace.beginSection("InvokeInternalListeners");
                                    int size17 = b.d.size();
                                    for (int i18 = 0; i18 < size17; i18++) {
                                        gb5 gb5Var9 = (gb5) b.d.get(i18);
                                        int size18 = b.e.size();
                                        for (int i19 = 0; i19 < size18; i19++) {
                                            ((ra5) b.e.get(i19)).N(gb5Var9.Q());
                                        }
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("InvokeRequestListeners");
                                    int size19 = b.d.size();
                                    for (int i20 = 0; i20 < size19; i20++) {
                                        gb5 gb5Var10 = (gb5) b.d.get(i20);
                                        int size20 = gb5Var10.Q().d.size();
                                        for (int i21 = 0; i21 < size20; i21++) {
                                            ((ra5) gb5Var10.Q().d.get(i21)).N(gb5Var10.Q());
                                        }
                                    }
                                }
                                throw th;
                            }
                        } else {
                            Log.w("CXCP", "Failed to submit " + b + ": " + this + " received -1 from submit.");
                            z3 = false;
                        }
                        if (!z3 && !b.b) {
                            synchronized (((ArrayList) this.b)) {
                                ((ArrayList) this.b).remove(b);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size21 = b.d.size();
                            for (int i22 = 0; i22 < size21; i22++) {
                                gb5 gb5Var11 = (gb5) b.d.get(i22);
                                int size22 = b.e.size();
                                for (int i23 = 0; i23 < size22; i23++) {
                                    ((ra5) b.e.get(i23)).N(gb5Var11.Q());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size23 = b.d.size();
                            for (int i24 = 0; i24 < size23; i24++) {
                                gb5 gb5Var12 = (gb5) b.d.get(i24);
                                int size24 = gb5Var12.Q().d.size();
                                for (int i25 = 0; i25 < size24; i25++) {
                                    ((ra5) gb5Var12.Q().d.get(i25)).N(gb5Var12.Q());
                                }
                            }
                            return z3;
                        }
                        return z3;
                    }
                    return false;
                }
            }
        } finally {
            Trace.endSection();
        }
    }

    public void w(View view) {
        if (((ArrayList) this.b).remove(view)) {
            e65 e65Var = (e65) this.d;
            g75 N = RecyclerView.N(view);
            if (N != null) {
                RecyclerView recyclerView = e65Var.A;
                int i = N.p;
                if (recyclerView.Q()) {
                    N.q = i;
                    recyclerView.p1.add(N);
                } else {
                    N.a.setImportantForAccessibility(i);
                }
                N.p = 0;
            }
        }
    }

    public vh0(pa0 pa0Var) {
        this.a = 2;
        this.d = pa0Var;
        cw cwVar = bn2.a;
        cwVar.getClass();
        this.c = cw.b.incrementAndGet(cwVar);
        this.e = w81.e(false);
        this.b = new ArrayList();
        this.f = new t71(23, this);
    }

    public vh0(e65 e65Var) {
        this.a = 1;
        this.c = 0;
        this.d = e65Var;
        this.e = new yj();
        this.b = new ArrayList();
    }

    public vh0(g44 g44Var) {
        this.a = 3;
        this.d = g44Var;
        this.e = new ec6(0);
    }
}

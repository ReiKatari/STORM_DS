package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.hardware.camera2.CameraAccessException;
import android.os.Trace;
import android.util.ArrayMap;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.p;
import androidx.preference.Preference;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import me.magnum.melonds.ui.settings.SettingsActivity;
import me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment;
import me.magnum.melonds.ui.settings.fragments.BasePreferenceFragment$onCreateRecyclerView$1$2;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dk0  reason: default package */
/* loaded from: classes.dex */
public final class dk0 implements dx6 {
    public final /* synthetic */ int A;
    public Object B;
    public int L;
    public Object R;
    public Object X;
    public Object Y;

    public dk0(Class cls, Class[] clsArr) {
        this.A = 2;
        HashSet hashSet = new HashSet();
        this.R = hashSet;
        this.X = new HashSet();
        this.L = 0;
        this.Y = new HashSet();
        hashSet.add(cls);
        for (Class cls2 : clsArr) {
            ln2.k(cls2, "Null interface");
        }
        Collections.addAll((HashSet) this.R, clsArr);
    }

    public void a() {
        List<vc0> k1;
        synchronized (((ArrayList) this.B)) {
            k1 = gt0.k1((ArrayList) this.B);
            ((ArrayList) this.B).clear();
        }
        for (vc0 vc0Var : k1) {
            Trace.beginSection("InvokeInternalListeners");
            int size = vc0Var.d.size();
            for (int i = 0; i < size; i++) {
                yk5 yk5Var = (yk5) vc0Var.d.get(i);
                int size2 = vc0Var.e.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    ((jk5) vc0Var.e.get(i2)).N(yk5Var.c0());
                }
            }
            Trace.endSection();
            Trace.beginSection("InvokeRequestListeners");
            int size3 = vc0Var.d.size();
            for (int i3 = 0; i3 < size3; i3++) {
                yk5 yk5Var2 = (yk5) vc0Var.d.get(i3);
                int size4 = yk5Var2.c0().d.size();
                for (int i4 = 0; i4 < size4; i4++) {
                    ((jk5) yk5Var2.c0().d.get(i4)).N(yk5Var2.c0());
                }
            }
            Trace.endSection();
        }
        xc0 xc0Var = (xc0) this.R;
        synchronized (xc0Var.j) {
            Log.d("CXCP", xc0Var + "#abortCaptures");
            xc0Var.a.E();
        }
    }

    public void b(wh1 wh1Var) {
        if (!((HashSet) this.R).contains(wh1Var.a)) {
            ((HashSet) this.X).add(wh1Var);
        } else {
            i.h("Components are not allowed to depend on interfaces they themselves provide.");
        }
    }

    public void c(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            d((be0) it.next());
        }
    }

    public void d(be0 be0Var) {
        ArrayList arrayList = (ArrayList) this.B;
        if (arrayList.contains(be0Var)) {
            return;
        }
        arrayList.add(be0Var);
    }

    public void e(yy0 yy0Var) {
        for (xx xxVar : yy0Var.c()) {
            ((da4) this.X).b(xxVar, null);
            ((da4) this.X).l(xxVar, yy0Var.j(xxVar), yy0Var.e(xxVar));
        }
    }

    public void f(double d, float f) {
        int length = ((float[]) this.R).length + 1;
        int binarySearch = Arrays.binarySearch((double[]) this.X, d);
        if (binarySearch < 0) {
            binarySearch = (-binarySearch) - 1;
        }
        this.X = Arrays.copyOf((double[]) this.X, length);
        this.R = Arrays.copyOf((float[]) this.R, length);
        this.B = new double[length];
        double[] dArr = (double[]) this.X;
        System.arraycopy(dArr, binarySearch, dArr, binarySearch + 1, (length - binarySearch) - 1);
        ((double[]) this.X)[binarySearch] = d;
        ((float[]) this.R)[binarySearch] = f;
    }

    public void g(View view, int i, boolean z) {
        int r;
        RecyclerView recyclerView = ((uf5) this.R).A;
        if (i < 0) {
            r = recyclerView.getChildCount();
        } else {
            r = r(i);
        }
        ((kk) this.X).f(r, z);
        if (z) {
            u(view);
        }
        recyclerView.addView(view, r);
        RecyclerView.N(view);
        ArrayList arrayList = recyclerView.B0;
        if (arrayList != null) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                BasePreferenceFragment$onCreateRecyclerView$1$2 basePreferenceFragment$onCreateRecyclerView$1$2 = (BasePreferenceFragment$onCreateRecyclerView$1$2) recyclerView.B0.get(size);
                basePreferenceFragment$onCreateRecyclerView$1$2.getClass();
                view.getClass();
                final RecyclerView recyclerView2 = basePreferenceFragment$onCreateRecyclerView$1$2.a;
                final BasePreferenceFragment basePreferenceFragment = basePreferenceFragment$onCreateRecyclerView$1$2.b;
                view.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: p20
                    @Override // android.view.View.OnFocusChangeListener
                    public final void onFocusChange(View view2, boolean z2) {
                        int i2;
                        t15 t15Var;
                        SettingsActivity settingsActivity;
                        String str;
                        RecyclerView recyclerView3;
                        if (z2) {
                            wg5 N = RecyclerView.N(view2);
                            if (N == null || (recyclerView3 = N.r) == null) {
                                i2 = -1;
                            } else {
                                i2 = recyclerView3.K(N);
                            }
                            wf5 adapter = RecyclerView.this.getAdapter();
                            if (adapter instanceof t15) {
                                t15Var = (t15) adapter;
                            } else {
                                t15Var = null;
                            }
                            if (i2 != -1 && t15Var != null) {
                                Preference j = t15Var.j(i2);
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
                                        tp6 tp6Var = settingsActivity.C0;
                                        CharSequence title = j.getTitle();
                                        String str2 = (title == null || (str2 = title.toString()) == null) ? "" : "";
                                        CharSequence summary = j.getSummary();
                                        if (summary != null) {
                                            str = summary.toString();
                                        } else {
                                            str = null;
                                        }
                                        hd6 hd6Var = new hd6(str2, str, j.getIcon());
                                        tp6Var.getClass();
                                        tp6Var.m(null, hd6Var);
                                    }
                                }
                            }
                        }
                    }
                });
            }
        }
    }

    public void h(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int r;
        RecyclerView recyclerView = ((uf5) this.R).A;
        if (i < 0) {
            r = recyclerView.getChildCount();
        } else {
            r = r(i);
        }
        ((kk) this.X).f(r, z);
        if (z) {
            u(view);
        }
        wg5 N = RecyclerView.N(view);
        if (N != null) {
            if (!N.j() && !N.o()) {
                StringBuilder sb = new StringBuilder("Called attach on a child which is not detached: ");
                sb.append(N);
                i.j(sb, recyclerView.C());
                return;
            }
            if (RecyclerView.z1) {
                Log.d("RecyclerView", "reAttach " + N);
            }
            N.j &= -257;
        } else if (RecyclerView.y1) {
            StringBuilder sb2 = new StringBuilder("No ViewHolder found for child: ");
            sb2.append(view);
            String C = recyclerView.C();
            sb2.append(", index: ");
            sb2.append(r);
            sb2.append(C);
            throw new IllegalArgumentException(sb2.toString());
        }
        RecyclerView.a(recyclerView, view, r, layoutParams);
    }

    public ek0 i() {
        ArrayList arrayList = new ArrayList((HashSet) this.R);
        go4 a = go4.a((da4) this.X);
        int i = this.L;
        ArrayList arrayList2 = new ArrayList((ArrayList) this.B);
        sa4 sa4Var = (sa4) this.Y;
        sy6 sy6Var = sy6.b;
        ArrayMap arrayMap = new ArrayMap();
        for (String str : sa4Var.a.keySet()) {
            arrayMap.put(str, sa4Var.a.get(str));
        }
        return new ek0(arrayList, a, i, arrayList2, new sy6(arrayMap));
    }

    public bv0 j() {
        boolean z;
        if (((sv0) this.B) != null) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return new bv0(new HashSet((HashSet) this.R), new HashSet((HashSet) this.X), this.L, (sv0) this.B, (HashSet) this.Y);
        }
        i.m("Missing required property: factory.");
        return null;
    }

    public void k(int i) {
        int r = r(i);
        ((kk) this.X).h(r);
        RecyclerView recyclerView = ((uf5) this.R).A;
        View childAt = recyclerView.getChildAt(r);
        if (childAt != null) {
            wg5 N = RecyclerView.N(childAt);
            if (N != null) {
                if (N.j() && !N.o()) {
                    StringBuilder sb = new StringBuilder("called detach on an already detached child ");
                    sb.append(N);
                    i.j(sb, recyclerView.C());
                    return;
                }
                if (RecyclerView.z1) {
                    Log.d("RecyclerView", "tmpDetach " + N);
                }
                N.a(256);
            }
        } else if (RecyclerView.y1) {
            i.i("No view at offset ", r, recyclerView.C());
            return;
        }
        RecyclerView.c(recyclerView, r);
    }

    public ic4 l(int i) {
        return o(i, (mc4) this.R, null, false);
    }

    public ic4 m(String str, boolean z) {
        Object obj;
        mc4 mc4Var;
        str.getClass();
        un6 un6Var = (un6) this.X;
        un6Var.getClass();
        Iterator it = ((f11) sb6.Y(new w0(un6Var, 5))).iterator();
        while (true) {
            if (it.hasNext()) {
                obj = it.next();
                ic4 ic4Var = (ic4) obj;
                if (!xs6.Z((String) ic4Var.B.e, str, false)) {
                    if (ic4Var.B.l(str) != null) {
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
        ic4 ic4Var2 = (ic4) obj;
        if (ic4Var2 == null) {
            if (!z || (mc4Var = ((mc4) this.R).L) == null) {
                return null;
            }
            dk0 dk0Var = mc4Var.Y;
            dk0Var.getClass();
            if (qs6.v0(str)) {
                return null;
            }
            return dk0Var.m(str, true);
        }
        return ic4Var2;
    }

    @Override // defpackage.dx6
    public Object n() {
        SQLiteDatabase e;
        Boolean bool;
        p87 p87Var = (p87) this.R;
        bt btVar = (bt) p87Var.d;
        qx qxVar = (qx) this.X;
        Iterable iterable = (Iterable) this.B;
        fz fzVar = (fz) this.Y;
        int i = this.L;
        m00 m00Var = qxVar.a;
        m00 m00Var2 = m00.TRANSIENT_ERROR;
        i36 i36Var = (i36) p87Var.c;
        if (m00Var == m00Var2) {
            i36Var.getClass();
            if (iterable.iterator().hasNext()) {
                String concat = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in ".concat(i36.r(iterable));
                e = i36Var.e();
                e.beginTransaction();
                try {
                    e.compileStatement(concat).execute();
                    e.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                    e.setTransactionSuccessful();
                } finally {
                }
            }
            btVar.U(fzVar, i + 1, false);
            return null;
        }
        i36Var.getClass();
        if (iterable.iterator().hasNext()) {
            i36Var.e().compileStatement("DELETE FROM events WHERE _id in ".concat(i36.r(iterable))).execute();
        }
        if (m00Var == m00.OK) {
            i36Var.k(new kk(fzVar, ((wr0) p87Var.g).a() + qxVar.b, 3));
        }
        e = i36Var.e();
        e.beginTransaction();
        try {
            Long h = i36.h(e, fzVar);
            if (h == null) {
                bool = Boolean.FALSE;
            } else {
                Cursor rawQuery = i36Var.e().rawQuery("SELECT 1 FROM events WHERE context_id = ? LIMIT 1", new String[]{h.toString()});
                Boolean valueOf = Boolean.valueOf(rawQuery.moveToNext());
                rawQuery.close();
                bool = valueOf;
            }
            e.setTransactionSuccessful();
            e.endTransaction();
            if (bool.booleanValue()) {
                btVar.U(fzVar, 1, true);
                return null;
            }
            return null;
        } finally {
        }
    }

    public ic4 o(int i, ic4 ic4Var, ic4 ic4Var2, boolean z) {
        mc4 mc4Var = (mc4) this.R;
        un6 un6Var = (un6) this.X;
        ic4 ic4Var3 = (ic4) un6Var.c(i);
        if (ic4Var2 != null) {
            if (nb3.k(ic4Var3, ic4Var2) && nb3.k(ic4Var3.L, ic4Var2.L)) {
                return ic4Var3;
            }
            ic4Var3 = null;
        } else if (ic4Var3 != null) {
            return ic4Var3;
        }
        if (z) {
            Iterator it = ((f11) sb6.Y(new w0(un6Var, 5))).iterator();
            while (true) {
                if (it.hasNext()) {
                    ic4 ic4Var4 = (ic4) it.next();
                    if ((ic4Var4 instanceof mc4) && !ic4Var4.equals(ic4Var)) {
                        ic4Var3 = ((mc4) ic4Var4).Y.o(i, mc4Var, ic4Var2, true);
                        continue;
                    } else {
                        ic4Var3 = null;
                        continue;
                    }
                    if (ic4Var3 != null) {
                        break;
                    }
                } else {
                    ic4Var3 = null;
                    break;
                }
            }
        }
        if (ic4Var3 == null) {
            mc4 mc4Var2 = mc4Var.L;
            if (mc4Var2 == null || mc4Var2.equals(ic4Var)) {
                return null;
            }
            mc4 mc4Var3 = mc4Var.L;
            mc4Var3.getClass();
            return mc4Var3.Y.o(i, mc4Var, ic4Var2, z);
        }
        return ic4Var3;
    }

    public View p(int i) {
        return ((uf5) this.R).A.getChildAt(r(i));
    }

    public int q() {
        return ((uf5) this.R).A.getChildCount() - ((ArrayList) this.B).size();
    }

    public int r(int i) {
        kk kkVar = (kk) this.X;
        if (i >= 0) {
            int childCount = ((uf5) this.R).A.getChildCount();
            int i2 = i;
            while (i2 < childCount) {
                int b = i - (i2 - kkVar.b(i2));
                if (b == 0) {
                    while (kkVar.d(i2)) {
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

    public View s(int i) {
        return ((uf5) this.R).A.getChildAt(i);
    }

    public int t() {
        return ((uf5) this.R).A.getChildCount();
    }

    public String toString() {
        switch (this.A) {
            case 1:
                return ((kk) this.X).toString() + ", hidden list:" + ((ArrayList) this.B).size();
            case 2:
            case 4:
            default:
                return super.toString();
            case 3:
                return "GraphRequestProcessor-" + this.L;
            case 5:
                return "pos =" + Arrays.toString((double[]) this.X) + " period=" + Arrays.toString((float[]) this.R);
        }
    }

    public void u(View view) {
        ((ArrayList) this.B).add(view);
        uf5 uf5Var = (uf5) this.R;
        wg5 N = RecyclerView.N(view);
        if (N != null) {
            View view2 = N.a;
            RecyclerView recyclerView = uf5Var.A;
            int i = N.q;
            if (i != -1) {
                N.p = i;
            } else {
                N.p = view2.getImportantForAccessibility();
            }
            if (recyclerView.Q()) {
                N.q = 4;
                recyclerView.q1.add(N);
                return;
            }
            view2.setImportantForAccessibility(4);
        }
    }

    public hc4 v(hc4 hc4Var, m44 m44Var, boolean z, ic4 ic4Var) {
        hc4 hc4Var2;
        mc4 mc4Var = (mc4) this.R;
        ArrayList arrayList = new ArrayList();
        Iterator it = mc4Var.iterator();
        while (true) {
            oc4 oc4Var = (oc4) it;
            hc4Var2 = null;
            if (!oc4Var.hasNext()) {
                break;
            }
            ic4 ic4Var2 = (ic4) oc4Var.next();
            if (!nb3.k(ic4Var2, ic4Var)) {
                hc4Var2 = ic4Var2.d(m44Var);
            }
            if (hc4Var2 != null) {
                arrayList.add(hc4Var2);
            }
        }
        hc4 hc4Var3 = (hc4) gt0.S0(arrayList);
        mc4 mc4Var2 = mc4Var.L;
        if (mc4Var2 != null && z && !mc4Var2.equals(ic4Var)) {
            hc4Var2 = mc4Var2.f(m44Var, mc4Var);
        }
        return (hc4) gt0.S0(fv.C0(new hc4[]{hc4Var, hc4Var3, hc4Var2}));
    }

    public jg7 w() {
        Log.d("CXCP", "Closing " + this);
        boolean a = ((sw) this.X).a();
        jg7 jg7Var = jg7.a;
        if (a) {
            ((xc0) this.R).c();
            x61 x61Var = x61.COROUTINE_SUSPENDED;
        }
        return jg7Var;
    }

    public void x() {
        xc0 xc0Var = (xc0) this.R;
        synchronized (xc0Var.j) {
            Log.d("CXCP", xc0Var + "#stopRepeating");
            xc0Var.a.W();
        }
    }

    public boolean y(boolean z, List list, Map map, Map map2, Map map3, List list2) {
        Throwable th;
        boolean z2;
        int i;
        boolean z3;
        map.getClass();
        map2.getClass();
        map3.getClass();
        list2.getClass();
        if (((sw) this.X).b()) {
            Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
            return false;
        }
        try {
            Trace.beginSection("CXCP#buildCaptureSequence");
            vc0 b = ((xc0) this.R).b(z, list, map, map2, map3, (d51) this.Y, list2);
            if (b == null) {
                if (!list.isEmpty()) {
                    Iterator it = list.iterator();
                    while (it.hasNext()) {
                        ((kk5) it.next()).getClass();
                    }
                }
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " failed to build CaptureSequence.");
                return false;
            } else if (((sw) this.X).b()) {
                Log.w("CXCP", "Failed to submit " + list + ": " + this + " is closed.");
                return false;
            } else {
                if (!b.b) {
                    synchronized (((ArrayList) this.B)) {
                        ((ArrayList) this.B).add(b);
                    }
                }
                try {
                    Log.d("CXCP", this + " submitting " + b);
                    Trace.beginSection("InvokeInternalListeners");
                    int size = b.d.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        yk5 yk5Var = (yk5) b.d.get(i2);
                        int size2 = b.e.size();
                        for (int i3 = 0; i3 < size2; i3++) {
                            ((jk5) b.e.get(i3)).k(yk5Var);
                        }
                    }
                    Trace.endSection();
                    Trace.beginSection("InvokeRequestListeners");
                    int size3 = b.d.size();
                    for (int i4 = 0; i4 < size3; i4++) {
                        yk5 yk5Var2 = (yk5) b.d.get(i4);
                        int size4 = yk5Var2.c0().d.size();
                        for (int i5 = 0; i5 < size4; i5++) {
                            ((jk5) yk5Var2.c0().d.get(i5)).k(yk5Var2);
                        }
                    }
                } catch (CameraAccessException unused) {
                    if (!b.b) {
                        synchronized (((ArrayList) this.B)) {
                            ((ArrayList) this.B).remove(b);
                            Trace.beginSection("InvokeInternalListeners");
                            int size5 = b.d.size();
                            for (int i6 = 0; i6 < size5; i6++) {
                                yk5 yk5Var3 = (yk5) b.d.get(i6);
                                int size6 = b.e.size();
                                for (int i7 = 0; i7 < size6; i7++) {
                                    ((jk5) b.e.get(i7)).N(yk5Var3.c0());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size7 = b.d.size();
                            for (int i8 = 0; i8 < size7; i8++) {
                                yk5 yk5Var4 = (yk5) b.d.get(i8);
                                int size8 = yk5Var4.c0().d.size();
                                for (int i9 = 0; i9 < size8; i9++) {
                                    ((jk5) yk5Var4.c0().d.get(i9)).N(yk5Var4.c0());
                                }
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    z2 = false;
                }
                synchronized (b) {
                    if (((sw) this.X).b()) {
                        Log.w("CXCP", "Failed to submit " + b + ": " + this + " is closed.");
                        if (!b.b) {
                            synchronized (((ArrayList) this.B)) {
                                ((ArrayList) this.B).remove(b);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size9 = b.d.size();
                            for (int i10 = 0; i10 < size9; i10++) {
                                yk5 yk5Var5 = (yk5) b.d.get(i10);
                                int size10 = b.e.size();
                                for (int i11 = 0; i11 < size10; i11++) {
                                    ((jk5) b.e.get(i11)).N(yk5Var5.c0());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size11 = b.d.size();
                            for (int i12 = 0; i12 < size11; i12++) {
                                yk5 yk5Var6 = (yk5) b.d.get(i12);
                                int size12 = yk5Var6.c0().d.size();
                                for (int i13 = 0; i13 < size12; i13++) {
                                    ((jk5) yk5Var6.c0().d.get(i13)).N(yk5Var6.c0());
                                }
                            }
                            return false;
                        }
                    } else {
                        Trace.beginSection("CXCP#submit(CaptureSequence)");
                        Integer d = ((xc0) this.R).d(b);
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
                                yk5 yk5Var7 = (yk5) b.d.get(i14);
                                int size14 = b.e.size();
                                for (int i15 = 0; i15 < size14; i15++) {
                                    ((jk5) b.e.get(i15)).A(yk5Var7);
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size15 = b.d.size();
                            for (int i16 = 0; i16 < size15; i16++) {
                                yk5 yk5Var8 = (yk5) b.d.get(i16);
                                int size16 = yk5Var8.c0().d.size();
                                for (int i17 = 0; i17 < size16; i17++) {
                                    ((jk5) yk5Var8.c0().d.get(i17)).A(yk5Var8);
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
                                    synchronized (((ArrayList) this.B)) {
                                        ((ArrayList) this.B).remove(b);
                                    }
                                    Trace.beginSection("InvokeInternalListeners");
                                    int size17 = b.d.size();
                                    for (int i18 = 0; i18 < size17; i18++) {
                                        yk5 yk5Var9 = (yk5) b.d.get(i18);
                                        int size18 = b.e.size();
                                        for (int i19 = 0; i19 < size18; i19++) {
                                            ((jk5) b.e.get(i19)).N(yk5Var9.c0());
                                        }
                                    }
                                    Trace.endSection();
                                    Trace.beginSection("InvokeRequestListeners");
                                    int size19 = b.d.size();
                                    for (int i20 = 0; i20 < size19; i20++) {
                                        yk5 yk5Var10 = (yk5) b.d.get(i20);
                                        int size20 = yk5Var10.c0().d.size();
                                        for (int i21 = 0; i21 < size20; i21++) {
                                            ((jk5) yk5Var10.c0().d.get(i21)).N(yk5Var10.c0());
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
                            synchronized (((ArrayList) this.B)) {
                                ((ArrayList) this.B).remove(b);
                            }
                            Trace.beginSection("InvokeInternalListeners");
                            int size21 = b.d.size();
                            for (int i22 = 0; i22 < size21; i22++) {
                                yk5 yk5Var11 = (yk5) b.d.get(i22);
                                int size22 = b.e.size();
                                for (int i23 = 0; i23 < size22; i23++) {
                                    ((jk5) b.e.get(i23)).N(yk5Var11.c0());
                                }
                            }
                            Trace.endSection();
                            Trace.beginSection("InvokeRequestListeners");
                            int size23 = b.d.size();
                            for (int i24 = 0; i24 < size23; i24++) {
                                yk5 yk5Var12 = (yk5) b.d.get(i24);
                                int size24 = yk5Var12.c0().d.size();
                                for (int i25 = 0; i25 < size24; i25++) {
                                    ((jk5) yk5Var12.c0().d.get(i25)).N(yk5Var12.c0());
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

    public void z(View view) {
        if (((ArrayList) this.B).remove(view)) {
            uf5 uf5Var = (uf5) this.R;
            wg5 N = RecyclerView.N(view);
            if (N != null) {
                RecyclerView recyclerView = uf5Var.A;
                int i = N.p;
                if (recyclerView.Q()) {
                    N.q = i;
                    recyclerView.q1.add(N);
                } else {
                    N.a.setImportantForAccessibility(i);
                }
                N.p = 0;
            }
        }
    }

    public dk0(mc4 mc4Var) {
        this.A = 4;
        this.R = mc4Var;
        this.X = new un6(0);
    }

    public dk0(xc0 xc0Var) {
        this.A = 3;
        this.R = xc0Var;
        uw uwVar = ht2.a;
        uwVar.getClass();
        this.L = uw.b.incrementAndGet(uwVar);
        this.X = g04.s(false);
        this.B = new ArrayList();
        this.Y = new d51(this, 26);
    }

    public dk0(uf5 uf5Var) {
        this.A = 1;
        this.L = 0;
        this.R = uf5Var;
        this.X = new kk();
        this.B = new ArrayList();
    }

    public dk0(p87 p87Var, qx qxVar, Iterable iterable, fz fzVar, int i) {
        this.A = 6;
        this.R = p87Var;
        this.X = qxVar;
        this.B = iterable;
        this.Y = fzVar;
        this.L = i;
    }

    public dk0(int i) {
        this.A = i;
        switch (i) {
            case 5:
                return;
            default:
                this.R = new HashSet();
                this.X = da4.d();
                this.L = -1;
                this.B = new ArrayList();
                this.Y = sa4.a();
                return;
        }
    }
}

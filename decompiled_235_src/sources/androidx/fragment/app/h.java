package androidx.fragment.app;

import android.animation.AnimatorSet;
import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.stormds.emulator.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public final class h {
    public final ViewGroup a;
    public final ArrayList b;
    public final ArrayList c;
    public boolean d;
    public boolean e;
    public boolean f;

    public h(ViewGroup viewGroup) {
        viewGroup.getClass();
        this.a = viewGroup;
        this.b = new ArrayList();
        this.c = new ArrayList();
    }

    public static void f(wu wuVar, View view) {
        WeakHashMap weakHashMap = ao7.a;
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            wuVar.put(transitionName, view);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() == 0) {
                    f(wuVar, childAt);
                }
            }
        }
    }

    public static final h j(ViewGroup viewGroup, u uVar) {
        viewGroup.getClass();
        uVar.getClass();
        uVar.I().getClass();
        Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
        if (tag instanceof h) {
            return (h) tag;
        }
        h hVar = new h(viewGroup);
        viewGroup.setTag(R.id.special_effects_controller_view_tag, hVar);
        return hVar;
    }

    public static boolean k(ArrayList arrayList) {
        boolean z;
        int size = arrayList.size();
        int i = 0;
        loop0: while (true) {
            z = true;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                b0 b0Var = (b0) obj;
                if (!b0Var.k.isEmpty()) {
                    ArrayList arrayList2 = b0Var.k;
                    if (arrayList2 == null || !arrayList2.isEmpty()) {
                        int size2 = arrayList2.size();
                        int i2 = 0;
                        while (i2 < size2) {
                            Object obj2 = arrayList2.get(i2);
                            i2++;
                            if (!((wn6) obj2).a()) {
                                break;
                            }
                        }
                    }
                }
                z = false;
            }
            break loop0;
        }
        if (z) {
            ArrayList arrayList3 = new ArrayList();
            int size3 = arrayList.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj3 = arrayList.get(i3);
                i3++;
                gt0.A0(arrayList3, ((b0) obj3).k);
            }
            if (!arrayList3.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public final void a(b0 b0Var) {
        b0Var.getClass();
        if (b0Var.i) {
            ao6 ao6Var = b0Var.a;
            View requireView = b0Var.c.requireView();
            requireView.getClass();
            ao6Var.applyState(requireView, this.a);
            b0Var.i = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:135:0x042f A[LOOP:19: B:134:0x042d->B:135:0x042f, LOOP_END] */
    /* JADX WARN: Type inference failed for: r11v2, types: [ci6, wu] */
    /* JADX WARN: Type inference failed for: r12v1, types: [ci6, wu] */
    /* JADX WARN: Type inference failed for: r13v1, types: [ci6, wu] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(ArrayList arrayList, boolean z) {
        Object obj;
        Object obj2;
        boolean z2;
        String str;
        ArrayList arrayList2;
        int size;
        int i;
        ArrayList arrayList3;
        ArrayList arrayList4;
        int i2;
        dm2 dm2Var;
        ArrayList arrayList5;
        int i3;
        vr4 vr4Var;
        boolean z3;
        int i4 = 2;
        if (u.K(2)) {
            Log.v("FragmentManager", "Collecting Effects");
        }
        int size2 = arrayList.size();
        int i5 = 0;
        while (true) {
            if (i5 < size2) {
                obj = arrayList.get(i5);
                i5++;
                b0 b0Var = (b0) obj;
                yn6 yn6Var = ao6.Companion;
                View view = b0Var.c.mView;
                view.getClass();
                yn6Var.getClass();
                ao6 a = yn6.a(view);
                ao6 ao6Var = ao6.VISIBLE;
                if (a == ao6Var && b0Var.a != ao6Var) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        b0 b0Var2 = (b0) obj;
        ListIterator listIterator = arrayList.listIterator(arrayList.size());
        while (true) {
            if (listIterator.hasPrevious()) {
                obj2 = listIterator.previous();
                b0 b0Var3 = (b0) obj2;
                yn6 yn6Var2 = ao6.Companion;
                View view2 = b0Var3.c.mView;
                view2.getClass();
                yn6Var2.getClass();
                ao6 a2 = yn6.a(view2);
                ao6 ao6Var2 = ao6.VISIBLE;
                if (a2 != ao6Var2 && b0Var3.a == ao6Var2) {
                    break;
                }
            } else {
                obj2 = null;
                break;
            }
        }
        b0 b0Var4 = (b0) obj2;
        if (u.K(2)) {
            Log.v("FragmentManager", "Executing operations from " + b0Var2 + " to " + b0Var4);
        }
        ArrayList arrayList6 = new ArrayList();
        ArrayList arrayList7 = new ArrayList();
        o oVar = ((b0) gt0.Q0(arrayList)).c;
        int size3 = arrayList.size();
        int i6 = 0;
        while (i6 < size3) {
            Object obj3 = arrayList.get(i6);
            i6++;
            rk2 rk2Var = ((b0) obj3).c.mAnimationInfo;
            rk2 rk2Var2 = oVar.mAnimationInfo;
            rk2Var.b = rk2Var2.b;
            rk2Var.c = rk2Var2.c;
            rk2Var.d = rk2Var2.d;
            rk2Var.e = rk2Var2.e;
            i4 = i4;
        }
        int i7 = i4;
        int size4 = arrayList.size();
        int i8 = 0;
        while (i8 < size4) {
            Object obj4 = arrayList.get(i8);
            i8++;
            b0 b0Var5 = (b0) obj4;
            arrayList6.add(new d(b0Var5, z));
            if (!z ? b0Var5 == b0Var4 : b0Var5 == b0Var2) {
                z3 = true;
            } else {
                z3 = false;
            }
            arrayList7.add(new nf1(b0Var5, z, z3));
            b0Var5.d.add(new ff1(this, b0Var5, 0));
        }
        ArrayList arrayList8 = new ArrayList();
        int size5 = arrayList7.size();
        int i9 = 0;
        while (i9 < size5) {
            Object obj5 = arrayList7.get(i9);
            i9++;
            if (!((nf1) obj5).a()) {
                arrayList8.add(obj5);
            }
        }
        ArrayList arrayList9 = new ArrayList();
        int size6 = arrayList8.size();
        int i10 = 0;
        while (i10 < size6) {
            Object obj6 = arrayList8.get(i10);
            i10++;
            if (((nf1) obj6).b() != null) {
                arrayList9.add(obj6);
            }
        }
        int size7 = arrayList9.size();
        int i11 = 0;
        dm2 dm2Var2 = null;
        while (i11 < size7) {
            Object obj7 = arrayList9.get(i11);
            i11++;
            nf1 nf1Var = (nf1) obj7;
            dm2 b = nf1Var.b();
            if (dm2Var2 != null && b != dm2Var2) {
                StringBuilder sb = new StringBuilder("Mixing framework transitions and AndroidX transitions is not allowed. Fragment ");
                sb.append(nf1Var.a.c);
                Object obj8 = nf1Var.b;
                sb.append(" returned Transition ");
                sb.append(obj8);
                sb.append(" which uses a different Transition type than other Fragments.");
                throw new IllegalArgumentException(sb.toString().toString());
            }
            dm2Var2 = b;
        }
        if (dm2Var2 == null) {
            arrayList2 = arrayList6;
            str = "FragmentManager";
            z2 = true;
        } else {
            ArrayList arrayList10 = new ArrayList();
            ArrayList arrayList11 = new ArrayList();
            ?? ci6Var = new ci6(0);
            ArrayList<String> arrayList12 = new ArrayList<>();
            ArrayList<String> arrayList13 = new ArrayList<>();
            ArrayList<String> arrayList14 = arrayList12;
            ?? ci6Var2 = new ci6(0);
            ArrayList<String> arrayList15 = arrayList13;
            ?? ci6Var3 = new ci6(0);
            int size8 = arrayList9.size();
            int i12 = 0;
            Object obj9 = null;
            z2 = true;
            while (i12 < size8) {
                Object obj10 = arrayList9.get(i12);
                int i13 = i12 + 1;
                Object obj11 = ((nf1) obj10).d;
                if (obj11 != null && b0Var2 != null) {
                    arrayList3 = arrayList10;
                    o oVar2 = b0Var2.c;
                    arrayList4 = arrayList6;
                    if (b0Var4 != null) {
                        o oVar3 = b0Var4.c;
                        Object y = dm2Var2.y(dm2Var2.h(obj11));
                        i2 = size8;
                        ArrayList<String> sharedElementSourceNames = oVar3.getSharedElementSourceNames();
                        sharedElementSourceNames.getClass();
                        dm2Var = dm2Var2;
                        ArrayList<String> sharedElementSourceNames2 = oVar2.getSharedElementSourceNames();
                        sharedElementSourceNames2.getClass();
                        arrayList5 = arrayList11;
                        ArrayList<String> sharedElementTargetNames = oVar2.getSharedElementTargetNames();
                        sharedElementTargetNames.getClass();
                        int size9 = sharedElementTargetNames.size();
                        i3 = i13;
                        int i14 = 0;
                        while (i14 < size9) {
                            int i15 = size9;
                            int indexOf = sharedElementSourceNames.indexOf(sharedElementTargetNames.get(i14));
                            if (indexOf != -1) {
                                sharedElementSourceNames.set(indexOf, sharedElementSourceNames2.get(i14));
                            }
                            i14++;
                            size9 = i15;
                        }
                        ArrayList<String> sharedElementTargetNames2 = oVar3.getSharedElementTargetNames();
                        sharedElementTargetNames2.getClass();
                        if (!z) {
                            oVar2.getExitTransitionCallback();
                            oVar3.getEnterTransitionCallback();
                            vr4Var = new vr4(null, null);
                        } else {
                            oVar2.getEnterTransitionCallback();
                            oVar3.getExitTransitionCallback();
                            vr4Var = new vr4(null, null);
                        }
                        if (vr4Var.A == null) {
                            if (vr4Var.B == null) {
                                int size10 = sharedElementSourceNames.size();
                                for (int i16 = 0; i16 < size10; i16++) {
                                    String str2 = sharedElementSourceNames.get(i16);
                                    str2.getClass();
                                    String str3 = str2;
                                    String str4 = sharedElementTargetNames2.get(i16);
                                    str4.getClass();
                                    ci6Var.put(str3, str4);
                                }
                                if (u.K(i7)) {
                                    Log.v("FragmentManager", ">>> entering view names <<<");
                                    int i17 = 0;
                                    for (int size11 = sharedElementTargetNames2.size(); i17 < size11; size11 = size11) {
                                        String str5 = sharedElementTargetNames2.get(i17);
                                        i17++;
                                        Log.v("FragmentManager", "Name: " + str5);
                                    }
                                    Log.v("FragmentManager", ">>> exiting view names <<<");
                                    int i18 = 0;
                                    for (int size12 = sharedElementSourceNames.size(); i18 < size12; size12 = size12) {
                                        String str6 = sharedElementSourceNames.get(i18);
                                        i18++;
                                        Log.v("FragmentManager", "Name: " + str6);
                                    }
                                }
                                View view3 = oVar2.mView;
                                view3.getClass();
                                f(ci6Var2, view3);
                                ci6Var2.l(sharedElementSourceNames);
                                ci6Var.l(ci6Var2.keySet());
                                View view4 = oVar3.mView;
                                view4.getClass();
                                f(ci6Var3, view4);
                                ci6Var3.l(sharedElementTargetNames2);
                                ci6Var3.l(ci6Var.values());
                                bm2 bm2Var = wl2.a;
                                for (int i19 = ci6Var.L - 1; -1 < i19; i19--) {
                                    if (!ci6Var3.containsKey((String) ci6Var.i(i19))) {
                                        ci6Var.g(i19);
                                    }
                                }
                                Set keySet = ci6Var.keySet();
                                Iterator it = ((yv3) ci6Var2.entrySet()).iterator();
                                while (it.hasNext()) {
                                    it.next();
                                    WeakHashMap weakHashMap = ao7.a;
                                    if (!gt0.C0(keySet, ((View) ((Map.Entry) it).getValue()).getTransitionName())) {
                                        it.remove();
                                    }
                                }
                                Collection values = ci6Var.values();
                                Iterator it2 = ((yv3) ci6Var3.entrySet()).iterator();
                                while (it2.hasNext()) {
                                    it2.next();
                                    WeakHashMap weakHashMap2 = ao7.a;
                                    if (!gt0.C0(values, ((View) ((Map.Entry) it2).getValue()).getTransitionName())) {
                                        it2.remove();
                                    }
                                }
                                if (ci6Var.isEmpty()) {
                                    Log.i("FragmentManager", "Ignoring shared elements transition " + y + " between " + b0Var2 + " and " + b0Var4 + " as there are no matching elements in both the entering and exiting fragment. In order to run a SharedElementTransition, both fragments involved must have the element.");
                                    arrayList3.clear();
                                    arrayList5.clear();
                                    arrayList10 = arrayList3;
                                    arrayList15 = sharedElementSourceNames;
                                    arrayList14 = sharedElementTargetNames2;
                                    arrayList6 = arrayList4;
                                    size8 = i2;
                                    dm2Var2 = dm2Var;
                                    arrayList11 = arrayList5;
                                    i12 = i3;
                                    obj9 = null;
                                } else {
                                    arrayList10 = arrayList3;
                                    arrayList15 = sharedElementSourceNames;
                                    obj9 = y;
                                    arrayList14 = sharedElementTargetNames2;
                                    arrayList6 = arrayList4;
                                    size8 = i2;
                                    dm2Var2 = dm2Var;
                                    arrayList11 = arrayList5;
                                    i12 = i3;
                                }
                            } else {
                                u34.a();
                                return;
                            }
                        } else {
                            u34.a();
                            return;
                        }
                    }
                } else {
                    arrayList3 = arrayList10;
                    arrayList4 = arrayList6;
                }
                i2 = size8;
                dm2Var = dm2Var2;
                arrayList5 = arrayList11;
                i3 = i13;
                arrayList10 = arrayList3;
                arrayList6 = arrayList4;
                size8 = i2;
                dm2Var2 = dm2Var;
                arrayList11 = arrayList5;
                i12 = i3;
            }
            ArrayList arrayList16 = arrayList10;
            ArrayList arrayList17 = arrayList6;
            dm2 dm2Var3 = dm2Var2;
            ArrayList arrayList18 = arrayList11;
            if (obj9 != null) {
                str = "FragmentManager";
                arrayList2 = arrayList17;
                g gVar = new g(arrayList9, b0Var2, b0Var4, dm2Var3, obj9, arrayList16, arrayList18, ci6Var, arrayList14, arrayList15, ci6Var2, ci6Var3, z);
                size = arrayList9.size();
                i = 0;
                while (i < size) {
                    Object obj12 = arrayList9.get(i);
                    i++;
                    ((nf1) obj12).a.j.add(gVar);
                }
            } else {
                if (!arrayList9.isEmpty()) {
                    int size13 = arrayList9.size();
                    int i20 = 0;
                    while (i20 < size13) {
                        Object obj13 = arrayList9.get(i20);
                        i20++;
                        if (((nf1) obj13).b != null) {
                            str = "FragmentManager";
                            arrayList2 = arrayList17;
                            g gVar2 = new g(arrayList9, b0Var2, b0Var4, dm2Var3, obj9, arrayList16, arrayList18, ci6Var, arrayList14, arrayList15, ci6Var2, ci6Var3, z);
                            size = arrayList9.size();
                            i = 0;
                            while (i < size) {
                            }
                        }
                    }
                }
                str = "FragmentManager";
                arrayList2 = arrayList17;
            }
        }
        ArrayList arrayList19 = new ArrayList();
        ArrayList arrayList20 = new ArrayList();
        int size14 = arrayList2.size();
        int i21 = 0;
        while (i21 < size14) {
            Object obj14 = arrayList2.get(i21);
            i21++;
            gt0.A0(arrayList20, ((d) obj14).a.k);
        }
        boolean isEmpty = arrayList20.isEmpty();
        int size15 = arrayList2.size();
        boolean z4 = false;
        int i22 = 0;
        while (i22 < size15) {
            Object obj15 = arrayList2.get(i22);
            i22++;
            d dVar = (d) obj15;
            Context context = this.a.getContext();
            b0 b0Var6 = dVar.a;
            context.getClass();
            yc1 b2 = dVar.b(context);
            if (b2 != null) {
                if (((AnimatorSet) b2.B) == null) {
                    arrayList19.add(dVar);
                } else {
                    o oVar4 = b0Var6.c;
                    if (!b0Var6.k.isEmpty()) {
                        if (u.K(i7)) {
                            Log.v(str, "Ignoring Animator set on " + oVar4 + " as this Fragment was involved in a Transition.");
                        }
                    } else {
                        if (b0Var6.a == ao6.GONE) {
                            b0Var6.i = false;
                        }
                        b0Var6.j.add(new e(dVar));
                        z4 = z2;
                    }
                }
            }
        }
        int i23 = 0;
        int size16 = arrayList19.size();
        while (i23 < size16) {
            Object obj16 = arrayList19.get(i23);
            i23++;
            d dVar2 = (d) obj16;
            b0 b0Var7 = dVar2.a;
            o oVar5 = b0Var7.c;
            if (!isEmpty) {
                if (u.K(i7)) {
                    Log.v(str, "Ignoring Animation set on " + oVar5 + " as Animations cannot run alongside Transitions.");
                }
            } else if (z4) {
                if (u.K(i7)) {
                    Log.v(str, "Ignoring Animation set on " + oVar5 + " as Animations cannot run alongside Animators.");
                }
            } else {
                b0Var7.j.add(new c(dVar2));
            }
        }
    }

    public final void c(List list) {
        list.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gt0.A0(arrayList, ((b0) it.next()).k);
        }
        List k1 = gt0.k1(gt0.p1(arrayList));
        int size = k1.size();
        for (int i = 0; i < size; i++) {
            ((wn6) k1.get(i)).c(this.a);
        }
        int size2 = list.size();
        for (int i2 = 0; i2 < size2; i2++) {
            a((b0) list.get(i2));
        }
        List k12 = gt0.k1(list);
        int size3 = k12.size();
        for (int i3 = 0; i3 < size3; i3++) {
            b0 b0Var = (b0) k12.get(i3);
            if (b0Var.k.isEmpty()) {
                b0Var.b();
            }
        }
    }

    public final void d(ao6 ao6Var, xn6 xn6Var, x xVar) {
        synchronized (this.b) {
            try {
                o oVar = xVar.c;
                oVar.getClass();
                b0 g = g(oVar);
                if (g == null) {
                    o oVar2 = xVar.c;
                    if (!oVar2.mTransitioning && !oVar2.mRemoving) {
                        g = null;
                    }
                    g = h(oVar2);
                }
                if (g != null) {
                    g.d(ao6Var, xn6Var);
                    return;
                }
                final b0 b0Var = new b0(ao6Var, xn6Var, xVar);
                this.b.add(b0Var);
                b0Var.d.add(new Runnable() { // from class: androidx.fragment.app.a0
                    @Override // java.lang.Runnable
                    public final void run() {
                        h hVar = h.this;
                        ArrayList arrayList = hVar.b;
                        b0 b0Var2 = b0Var;
                        if (arrayList.contains(b0Var2)) {
                            ao6 ao6Var2 = b0Var2.a;
                            View view = b0Var2.c.mView;
                            view.getClass();
                            ao6Var2.applyState(view, hVar.a);
                        }
                    }
                });
                b0Var.d.add(new ff1(this, b0Var, 1));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        boolean z;
        if (this.f) {
            return;
        }
        if (!this.a.isAttachedToWindow()) {
            i();
            this.e = false;
            return;
        }
        synchronized (this.b) {
            try {
                ArrayList m1 = gt0.m1(this.c);
                this.c.clear();
                int size = m1.size();
                int i = 0;
                while (true) {
                    z = true;
                    if (i >= size) {
                        break;
                    }
                    Object obj = m1.get(i);
                    i++;
                    b0 b0Var = (b0) obj;
                    if (this.b.isEmpty() || !b0Var.c.mTransitioning) {
                        z = false;
                    }
                    b0Var.g = z;
                }
                int size2 = m1.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = m1.get(i2);
                    i2++;
                    b0 b0Var2 = (b0) obj2;
                    if (this.d) {
                        if (u.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Completing non-seekable operation " + b0Var2);
                        }
                        b0Var2.b();
                    } else {
                        if (u.K(2)) {
                            Log.v("FragmentManager", "SpecialEffectsController: Cancelling operation " + b0Var2);
                        }
                        b0Var2.a(this.a);
                    }
                    this.d = false;
                    if (!b0Var2.f) {
                        this.c.add(b0Var2);
                    }
                }
                if (!this.b.isEmpty()) {
                    n();
                    ArrayList m12 = gt0.m1(this.b);
                    if (m12.isEmpty()) {
                        return;
                    }
                    this.b.clear();
                    this.c.addAll(m12);
                    if (u.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Executing pending operations");
                    }
                    b(m12, this.e);
                    boolean k = k(m12);
                    int size3 = m12.size();
                    int i3 = 0;
                    boolean z2 = true;
                    while (i3 < size3) {
                        Object obj3 = m12.get(i3);
                        i3++;
                        if (!((b0) obj3).c.mTransitioning) {
                            z2 = false;
                        }
                    }
                    if (!z2 || k) {
                        z = false;
                    }
                    this.d = z;
                    if (u.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Operation seekable = " + k + " \ntransition = " + z2);
                    }
                    if (!z2) {
                        m(m12);
                        c(m12);
                    } else if (k) {
                        m(m12);
                        int size4 = m12.size();
                        for (int i4 = 0; i4 < size4; i4++) {
                            a((b0) m12.get(i4));
                        }
                    }
                    this.e = false;
                    if (u.K(2)) {
                        Log.v("FragmentManager", "SpecialEffectsController: Finished executing pending operations");
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final b0 g(o oVar) {
        Object obj;
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                b0 b0Var = (b0) obj;
                if (nb3.k(b0Var.c, oVar) && !b0Var.e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (b0) obj;
    }

    public final b0 h(o oVar) {
        Object obj;
        ArrayList arrayList = this.c;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                b0 b0Var = (b0) obj;
                if (nb3.k(b0Var.c, oVar) && !b0Var.e) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        return (b0) obj;
    }

    public final void i() {
        String str;
        String str2;
        if (u.K(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Forcing all operations to complete");
        }
        boolean isAttachedToWindow = this.a.isAttachedToWindow();
        synchronized (this.b) {
            try {
                n();
                m(this.b);
                ArrayList m1 = gt0.m1(this.c);
                int size = m1.size();
                int i = 0;
                int i2 = 0;
                while (i2 < size) {
                    Object obj = m1.get(i2);
                    i2++;
                    ((b0) obj).g = false;
                }
                int size2 = m1.size();
                int i3 = 0;
                while (i3 < size2) {
                    Object obj2 = m1.get(i3);
                    i3++;
                    b0 b0Var = (b0) obj2;
                    if (u.K(2)) {
                        if (isAttachedToWindow) {
                            str2 = "";
                        } else {
                            str2 = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str2 + "Cancelling running operation " + b0Var);
                    }
                    b0Var.a(this.a);
                }
                ArrayList m12 = gt0.m1(this.b);
                int size3 = m12.size();
                int i4 = 0;
                while (i4 < size3) {
                    Object obj3 = m12.get(i4);
                    i4++;
                    ((b0) obj3).g = false;
                }
                int size4 = m12.size();
                while (i < size4) {
                    Object obj4 = m12.get(i);
                    i++;
                    b0 b0Var2 = (b0) obj4;
                    if (u.K(2)) {
                        if (isAttachedToWindow) {
                            str = "";
                        } else {
                            str = "Container " + this.a + " is not attached to window. ";
                        }
                        Log.v("FragmentManager", "SpecialEffectsController: " + str + "Cancelling pending operation " + b0Var2);
                    }
                    b0Var2.a(this.a);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void l() {
        o oVar;
        Object obj;
        boolean z;
        synchronized (this.b) {
            try {
                n();
                ArrayList arrayList = this.b;
                ListIterator listIterator = arrayList.listIterator(arrayList.size());
                while (true) {
                    oVar = null;
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        b0 b0Var = (b0) obj;
                        yn6 yn6Var = ao6.Companion;
                        View view = b0Var.c.mView;
                        view.getClass();
                        yn6Var.getClass();
                        ao6 a = yn6.a(view);
                        ao6 ao6Var = b0Var.a;
                        ao6 ao6Var2 = ao6.VISIBLE;
                        if (ao6Var == ao6Var2 && a != ao6Var2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                b0 b0Var2 = (b0) obj;
                if (b0Var2 != null) {
                    oVar = b0Var2.c;
                }
                if (oVar != null) {
                    z = oVar.isPostponed();
                } else {
                    z = false;
                }
                this.f = z;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void m(List list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            b0 b0Var = (b0) list.get(i);
            x xVar = b0Var.l;
            if (!b0Var.h) {
                b0Var.h = true;
                xn6 xn6Var = b0Var.b;
                if (xn6Var == xn6.ADDING) {
                    o oVar = xVar.c;
                    oVar.getClass();
                    View findFocus = oVar.mView.findFocus();
                    if (findFocus != null) {
                        oVar.setFocusedView(findFocus);
                        if (u.K(2)) {
                            Log.v("FragmentManager", "requestFocus: Saved focused view " + findFocus + " for Fragment " + oVar);
                        }
                    }
                    View requireView = b0Var.c.requireView();
                    requireView.getClass();
                    if (requireView.getParent() == null) {
                        if (u.K(2)) {
                            Log.v("FragmentManager", "Adding fragment " + oVar + " view " + requireView + " to container in onStart");
                        }
                        xVar.b();
                        requireView.setAlpha(RecyclerView.B1);
                    }
                    if (requireView.getAlpha() == RecyclerView.B1 && requireView.getVisibility() == 0) {
                        if (u.K(2)) {
                            Log.v("FragmentManager", "Making view " + requireView + " INVISIBLE in onStart");
                        }
                        requireView.setVisibility(4);
                    }
                    requireView.setAlpha(oVar.getPostOnViewCreatedAlpha());
                    if (u.K(2)) {
                        Log.v("FragmentManager", "Setting view alpha to " + oVar.getPostOnViewCreatedAlpha() + " in onStart");
                    }
                } else if (xn6Var == xn6.REMOVING) {
                    o oVar2 = xVar.c;
                    oVar2.getClass();
                    View requireView2 = oVar2.requireView();
                    requireView2.getClass();
                    if (u.K(2)) {
                        Log.v("FragmentManager", "Clearing focus " + requireView2.findFocus() + " on view " + requireView2 + " for Fragment " + oVar2);
                    }
                    requireView2.clearFocus();
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            gt0.A0(arrayList, ((b0) it.next()).k);
        }
        List k1 = gt0.k1(gt0.p1(arrayList));
        int size2 = k1.size();
        for (int i2 = 0; i2 < size2; i2++) {
            wn6 wn6Var = (wn6) k1.get(i2);
            wn6Var.getClass();
            ViewGroup viewGroup = this.a;
            viewGroup.getClass();
            if (!wn6Var.a) {
                wn6Var.e(viewGroup);
            }
            wn6Var.a = true;
        }
    }

    public final void n() {
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            b0 b0Var = (b0) obj;
            if (b0Var.b == xn6.ADDING) {
                View requireView = b0Var.c.requireView();
                requireView.getClass();
                yn6 yn6Var = ao6.Companion;
                int visibility = requireView.getVisibility();
                yn6Var.getClass();
                b0Var.d(yn6.b(visibility), xn6.NONE);
            }
        }
    }
}

package androidx.fragment.app;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.u;
import com.stormds.emulator.R;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.ui.settings.SettingsActivity;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* loaded from: classes.dex */
public abstract class u {
    public final gl2 A;
    public final q61 B;
    public i9 C;
    public i9 D;
    public i9 E;
    public ArrayDeque F;
    public boolean G;
    public boolean H;
    public boolean I;
    public boolean J;
    public boolean K;
    public ArrayList L;
    public ArrayList M;
    public ArrayList N;
    public v O;
    public final g15 P;
    public boolean b;
    public ArrayList e;
    public il4 g;
    public final ArrayList n;
    public final yc1 o;
    public final CopyOnWriteArrayList p;
    public final dl2 q;
    public final dl2 r;
    public final dl2 s;
    public final dl2 t;
    public final fl2 u;
    public int v;
    public cl2 w;
    public zk2 x;
    public o y;
    public o z;
    public final ArrayList a = new ArrayList();
    public final y c = new y();
    public ArrayList d = new ArrayList();
    public final r f = new r(this);
    public a h = null;
    public boolean i = false;
    public final s j = new s(this);
    public final AtomicInteger k = new AtomicInteger();
    public final Map l = Collections.synchronizedMap(new HashMap());
    public final Map m = Collections.synchronizedMap(new HashMap());

    /* JADX WARN: Type inference failed for: r0v14, types: [yc1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v16, types: [dl2] */
    /* JADX WARN: Type inference failed for: r0v17, types: [dl2] */
    /* JADX WARN: Type inference failed for: r0v18, types: [dl2] */
    /* JADX WARN: Type inference failed for: r0v19, types: [dl2] */
    /* JADX WARN: Type inference failed for: r0v23, types: [java.lang.Object, q61] */
    public u() {
        Collections.synchronizedMap(new HashMap());
        this.n = new ArrayList();
        ?? obj = new Object();
        obj.A = this;
        obj.B = new CopyOnWriteArrayList();
        this.o = obj;
        this.p = new CopyOnWriteArrayList();
        this.q = new b31(this) { // from class: dl2
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // defpackage.b31
            public final void accept(Object obj2) {
                int i = r2;
                u uVar = this.b;
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj2;
                        if (uVar.M()) {
                            uVar.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj2;
                        if (uVar.M() && num.intValue() == 80) {
                            uVar.m(false);
                            return;
                        }
                        return;
                    case 2:
                        h94 h94Var = (h94) obj2;
                        if (uVar.M()) {
                            uVar.n(h94Var.a, false);
                            return;
                        }
                        return;
                    default:
                        yw4 yw4Var = (yw4) obj2;
                        if (uVar.M()) {
                            uVar.s(yw4Var.a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.r = new b31(this) { // from class: dl2
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // defpackage.b31
            public final void accept(Object obj2) {
                int i = r2;
                u uVar = this.b;
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj2;
                        if (uVar.M()) {
                            uVar.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj2;
                        if (uVar.M() && num.intValue() == 80) {
                            uVar.m(false);
                            return;
                        }
                        return;
                    case 2:
                        h94 h94Var = (h94) obj2;
                        if (uVar.M()) {
                            uVar.n(h94Var.a, false);
                            return;
                        }
                        return;
                    default:
                        yw4 yw4Var = (yw4) obj2;
                        if (uVar.M()) {
                            uVar.s(yw4Var.a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.s = new b31(this) { // from class: dl2
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // defpackage.b31
            public final void accept(Object obj2) {
                int i = r2;
                u uVar = this.b;
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj2;
                        if (uVar.M()) {
                            uVar.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj2;
                        if (uVar.M() && num.intValue() == 80) {
                            uVar.m(false);
                            return;
                        }
                        return;
                    case 2:
                        h94 h94Var = (h94) obj2;
                        if (uVar.M()) {
                            uVar.n(h94Var.a, false);
                            return;
                        }
                        return;
                    default:
                        yw4 yw4Var = (yw4) obj2;
                        if (uVar.M()) {
                            uVar.s(yw4Var.a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.t = new b31(this) { // from class: dl2
            public final /* synthetic */ u b;

            {
                this.b = this;
            }

            @Override // defpackage.b31
            public final void accept(Object obj2) {
                int i = r2;
                u uVar = this.b;
                switch (i) {
                    case 0:
                        Configuration configuration = (Configuration) obj2;
                        if (uVar.M()) {
                            uVar.i(false, configuration);
                            return;
                        }
                        return;
                    case 1:
                        Integer num = (Integer) obj2;
                        if (uVar.M() && num.intValue() == 80) {
                            uVar.m(false);
                            return;
                        }
                        return;
                    case 2:
                        h94 h94Var = (h94) obj2;
                        if (uVar.M()) {
                            uVar.n(h94Var.a, false);
                            return;
                        }
                        return;
                    default:
                        yw4 yw4Var = (yw4) obj2;
                        if (uVar.M()) {
                            uVar.s(yw4Var.a, false);
                            return;
                        }
                        return;
                }
            }
        };
        this.u = new fl2(this);
        this.v = -1;
        this.A = new gl2(this);
        this.B = new Object();
        this.F = new ArrayDeque();
        this.P = new g15(this, 10);
    }

    public static HashSet F(a aVar) {
        HashSet hashSet = new HashSet();
        for (int i = 0; i < aVar.c.size(); i++) {
            o oVar = ((ul2) aVar.c.get(i)).b;
            if (oVar != null && aVar.i) {
                hashSet.add(oVar);
            }
        }
        return hashSet;
    }

    public static boolean K(int i) {
        if (Log.isLoggable("FragmentManager", i)) {
            return true;
        }
        return false;
    }

    public static boolean L(o oVar) {
        if (!oVar.mHasMenu || !oVar.mMenuVisible) {
            ArrayList e = oVar.mChildFragmentManager.c.e();
            int size = e.size();
            boolean z = false;
            int i = 0;
            while (i < size) {
                Object obj = e.get(i);
                i++;
                o oVar2 = (o) obj;
                if (oVar2 != null) {
                    z = L(oVar2);
                    continue;
                }
                if (z) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }

    public static boolean N(o oVar) {
        if (oVar != null) {
            u uVar = oVar.mFragmentManager;
            if (oVar.equals(uVar.z) && N(uVar.y)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public static void c0(o oVar) {
        if (K(2)) {
            Log.v("FragmentManager", "show: " + oVar);
        }
        if (oVar.mHidden) {
            oVar.mHidden = false;
            oVar.mHiddenChanged = !oVar.mHiddenChanged;
        }
    }

    public final void A(a aVar, boolean z) {
        if (z && (this.w == null || this.J)) {
            return;
        }
        y(z);
        a aVar2 = this.h;
        if (aVar2 != null) {
            aVar2.u = false;
            aVar2.g();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execSingleAction for action " + aVar);
            }
            this.h.i(false, false);
            this.h.a(this.L, this.M);
            ArrayList arrayList = this.h.c;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                o oVar = ((ul2) obj).b;
                if (oVar != null) {
                    oVar.mTransitioning = false;
                }
            }
            this.h = null;
        }
        aVar.a(this.L, this.M);
        this.b = true;
        try {
            U(this.L, this.M);
            d();
            e0();
            boolean z2 = this.K;
            y yVar = this.c;
            if (z2) {
                this.K = false;
                ArrayList d = yVar.d();
                int size2 = d.size();
                int i2 = 0;
                while (i2 < size2) {
                    Object obj2 = d.get(i2);
                    i2++;
                    x xVar = (x) obj2;
                    o oVar2 = xVar.c;
                    if (oVar2.mDeferStart) {
                        if (this.b) {
                            this.K = true;
                        } else {
                            oVar2.mDeferStart = false;
                            xVar.k();
                        }
                    }
                }
            }
            yVar.b.values().removeAll(Collections.singleton(null));
        } catch (Throwable th) {
            d();
            throw th;
        }
    }

    public final void B(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        int i3;
        boolean z;
        int i4;
        boolean z2;
        int i5;
        int i6;
        boolean z3;
        int i7;
        int i8;
        int i9 = i;
        boolean z4 = ((a) arrayList.get(i9)).r;
        ArrayList arrayList3 = this.N;
        if (arrayList3 == null) {
            this.N = new ArrayList();
        } else {
            arrayList3.clear();
        }
        ArrayList arrayList4 = this.N;
        y yVar = this.c;
        arrayList4.addAll(yVar.f());
        o oVar = this.z;
        int i10 = i9;
        boolean z5 = false;
        while (true) {
            int i11 = 1;
            if (i10 < i2) {
                a aVar = (a) arrayList.get(i10);
                boolean booleanValue = ((Boolean) arrayList2.get(i10)).booleanValue();
                ArrayList arrayList5 = this.N;
                if (!booleanValue) {
                    ArrayList arrayList6 = aVar.c;
                    int i12 = 0;
                    while (i12 < arrayList6.size()) {
                        ul2 ul2Var = (ul2) arrayList6.get(i12);
                        boolean z6 = z4;
                        int i13 = ul2Var.a;
                        if (i13 != i11) {
                            i5 = i10;
                            if (i13 != 2) {
                                if (i13 != 3 && i13 != 6) {
                                    if (i13 != 7) {
                                        if (i13 == 8) {
                                            arrayList6.add(i12, new ul2(oVar, 9, 0));
                                            ul2Var.c = true;
                                            i12++;
                                            oVar = ul2Var.b;
                                        }
                                    } else {
                                        i6 = 1;
                                    }
                                } else {
                                    arrayList5.remove(ul2Var.b);
                                    o oVar2 = ul2Var.b;
                                    if (oVar2 == oVar) {
                                        arrayList6.add(i12, new ul2(oVar2, 9));
                                        i12++;
                                        z3 = z5;
                                        oVar = null;
                                        i6 = 1;
                                    }
                                }
                                z3 = z5;
                                i6 = 1;
                            } else {
                                o oVar3 = ul2Var.b;
                                int i14 = oVar3.mContainerId;
                                int size = arrayList5.size() - 1;
                                boolean z7 = false;
                                while (size >= 0) {
                                    int i15 = size;
                                    o oVar4 = (o) arrayList5.get(size);
                                    boolean z8 = z5;
                                    if (oVar4.mContainerId == i14) {
                                        if (oVar4 == oVar3) {
                                            i7 = i14;
                                            z7 = true;
                                        } else {
                                            if (oVar4 == oVar) {
                                                i7 = i14;
                                                i8 = 0;
                                                arrayList6.add(i12, new ul2(oVar4, 9, 0));
                                                i12++;
                                                oVar = null;
                                            } else {
                                                i7 = i14;
                                                i8 = 0;
                                            }
                                            ul2 ul2Var2 = new ul2(oVar4, 3, i8);
                                            ul2Var2.d = ul2Var.d;
                                            ul2Var2.f = ul2Var.f;
                                            ul2Var2.e = ul2Var.e;
                                            ul2Var2.g = ul2Var.g;
                                            arrayList6.add(i12, ul2Var2);
                                            arrayList5.remove(oVar4);
                                            i12++;
                                            oVar = oVar;
                                        }
                                    } else {
                                        i7 = i14;
                                    }
                                    size = i15 - 1;
                                    i14 = i7;
                                    z5 = z8;
                                }
                                z3 = z5;
                                i6 = 1;
                                if (z7) {
                                    arrayList6.remove(i12);
                                    i12--;
                                } else {
                                    ul2Var.a = 1;
                                    ul2Var.c = true;
                                    arrayList5.add(oVar3);
                                }
                            }
                            i12 += i6;
                            i11 = i6;
                            z4 = z6;
                            i10 = i5;
                            z5 = z3;
                        } else {
                            i5 = i10;
                            i6 = i11;
                        }
                        z3 = z5;
                        arrayList5.add(ul2Var.b);
                        i12 += i6;
                        i11 = i6;
                        z4 = z6;
                        i10 = i5;
                        z5 = z3;
                    }
                    z = z4;
                    i4 = i10;
                    z2 = z5;
                } else {
                    z = z4;
                    i4 = i10;
                    z2 = z5;
                    int i16 = 1;
                    ArrayList arrayList7 = aVar.c;
                    int size2 = arrayList7.size() - 1;
                    while (size2 >= 0) {
                        ul2 ul2Var3 = (ul2) arrayList7.get(size2);
                        int i17 = ul2Var3.a;
                        if (i17 != i16) {
                            if (i17 != 3) {
                                switch (i17) {
                                    case 8:
                                        oVar = null;
                                        break;
                                    case 9:
                                        oVar = ul2Var3.b;
                                        break;
                                    case 10:
                                        ul2Var3.i = ul2Var3.h;
                                        break;
                                }
                                size2--;
                                i16 = 1;
                            }
                            arrayList5.add(ul2Var3.b);
                            size2--;
                            i16 = 1;
                        }
                        arrayList5.remove(ul2Var3.b);
                        size2--;
                        i16 = 1;
                    }
                }
                if (!z2 && !aVar.i) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                i10 = i4 + 1;
                z4 = z;
            } else {
                boolean z9 = z4;
                boolean z10 = z5;
                this.N.clear();
                if (!z9 && this.v >= 1) {
                    for (int i18 = i9; i18 < i2; i18++) {
                        ArrayList arrayList8 = ((a) arrayList.get(i18)).c;
                        int size3 = arrayList8.size();
                        int i19 = 0;
                        while (i19 < size3) {
                            Object obj = arrayList8.get(i19);
                            i19++;
                            o oVar5 = ((ul2) obj).b;
                            if (oVar5 != null && oVar5.mFragmentManager != null) {
                                yVar.g(g(oVar5));
                            }
                        }
                    }
                }
                int i20 = i9;
                while (i20 < i2) {
                    a aVar2 = (a) arrayList.get(i20);
                    if (((Boolean) arrayList2.get(i20)).booleanValue()) {
                        aVar2.f(-1);
                        u uVar = aVar2.t;
                        ArrayList arrayList9 = aVar2.c;
                        boolean z11 = true;
                        for (int size4 = arrayList9.size() - 1; size4 >= 0; size4--) {
                            ul2 ul2Var4 = (ul2) arrayList9.get(size4);
                            o oVar6 = ul2Var4.b;
                            if (oVar6 != null) {
                                oVar6.mBeingSaved = false;
                                oVar6.setPopDirection(z11);
                                int i21 = aVar2.h;
                                int i22 = 8194;
                                int i23 = 4097;
                                if (i21 != 4097) {
                                    if (i21 != 8194) {
                                        i22 = 4100;
                                        if (i21 != 8197) {
                                            i23 = 4099;
                                            if (i21 != 4099) {
                                                if (i21 != 4100) {
                                                    i22 = 0;
                                                } else {
                                                    i22 = 8197;
                                                }
                                            }
                                        }
                                    }
                                    i22 = i23;
                                }
                                oVar6.setNextTransition(i22);
                                oVar6.setSharedElementNames(aVar2.q, aVar2.p);
                            }
                            switch (ul2Var4.a) {
                                case 1:
                                    oVar6.setAnimations(ul2Var4.d, ul2Var4.e, ul2Var4.f, ul2Var4.g);
                                    z11 = true;
                                    uVar.Y(oVar6, true);
                                    uVar.T(oVar6);
                                    break;
                                case 2:
                                default:
                                    e41.n(ul2Var4.a, "Unknown cmd: ");
                                    return;
                                case 3:
                                    oVar6.setAnimations(ul2Var4.d, ul2Var4.e, ul2Var4.f, ul2Var4.g);
                                    uVar.a(oVar6);
                                    z11 = true;
                                    break;
                                case 4:
                                    oVar6.setAnimations(ul2Var4.d, ul2Var4.e, ul2Var4.f, ul2Var4.g);
                                    uVar.getClass();
                                    c0(oVar6);
                                    z11 = true;
                                    break;
                                case 5:
                                    oVar6.setAnimations(ul2Var4.d, ul2Var4.e, ul2Var4.f, ul2Var4.g);
                                    uVar.Y(oVar6, true);
                                    uVar.J(oVar6);
                                    z11 = true;
                                    break;
                                case 6:
                                    oVar6.setAnimations(ul2Var4.d, ul2Var4.e, ul2Var4.f, ul2Var4.g);
                                    uVar.c(oVar6);
                                    z11 = true;
                                    break;
                                case 7:
                                    oVar6.setAnimations(ul2Var4.d, ul2Var4.e, ul2Var4.f, ul2Var4.g);
                                    uVar.Y(oVar6, true);
                                    uVar.h(oVar6);
                                    z11 = true;
                                    break;
                                case 8:
                                    uVar.a0(null);
                                    z11 = true;
                                    break;
                                case 9:
                                    uVar.a0(oVar6);
                                    z11 = true;
                                    break;
                                case 10:
                                    ul2Var4.i = oVar6.mMaxState;
                                    uVar.Z(oVar6, ul2Var4.h);
                                    z11 = true;
                                    break;
                            }
                        }
                    } else {
                        aVar2.f(1);
                        u uVar2 = aVar2.t;
                        ArrayList arrayList10 = aVar2.c;
                        int size5 = arrayList10.size();
                        int i24 = 0;
                        while (i24 < size5) {
                            ul2 ul2Var5 = (ul2) arrayList10.get(i24);
                            o oVar7 = ul2Var5.b;
                            if (oVar7 != null) {
                                oVar7.mBeingSaved = false;
                                oVar7.setPopDirection(false);
                                oVar7.setNextTransition(aVar2.h);
                                oVar7.setSharedElementNames(aVar2.p, aVar2.q);
                            }
                            switch (ul2Var5.a) {
                                case 1:
                                    i3 = i20;
                                    oVar7.setAnimations(ul2Var5.d, ul2Var5.e, ul2Var5.f, ul2Var5.g);
                                    uVar2.Y(oVar7, false);
                                    uVar2.a(oVar7);
                                    break;
                                case 2:
                                default:
                                    e41.n(ul2Var5.a, "Unknown cmd: ");
                                    return;
                                case 3:
                                    i3 = i20;
                                    oVar7.setAnimations(ul2Var5.d, ul2Var5.e, ul2Var5.f, ul2Var5.g);
                                    uVar2.T(oVar7);
                                    break;
                                case 4:
                                    i3 = i20;
                                    oVar7.setAnimations(ul2Var5.d, ul2Var5.e, ul2Var5.f, ul2Var5.g);
                                    uVar2.J(oVar7);
                                    break;
                                case 5:
                                    i3 = i20;
                                    oVar7.setAnimations(ul2Var5.d, ul2Var5.e, ul2Var5.f, ul2Var5.g);
                                    uVar2.Y(oVar7, false);
                                    c0(oVar7);
                                    break;
                                case 6:
                                    i3 = i20;
                                    oVar7.setAnimations(ul2Var5.d, ul2Var5.e, ul2Var5.f, ul2Var5.g);
                                    uVar2.h(oVar7);
                                    break;
                                case 7:
                                    i3 = i20;
                                    oVar7.setAnimations(ul2Var5.d, ul2Var5.e, ul2Var5.f, ul2Var5.g);
                                    uVar2.Y(oVar7, false);
                                    uVar2.c(oVar7);
                                    break;
                                case 8:
                                    uVar2.a0(oVar7);
                                    i3 = i20;
                                    break;
                                case 9:
                                    uVar2.a0(null);
                                    i3 = i20;
                                    break;
                                case 10:
                                    ul2Var5.h = oVar7.mMaxState;
                                    uVar2.Z(oVar7, ul2Var5.i);
                                    i3 = i20;
                                    break;
                            }
                            i24++;
                            i20 = i3;
                        }
                    }
                    i20++;
                }
                boolean booleanValue2 = ((Boolean) arrayList2.get(i2 - 1)).booleanValue();
                ArrayList arrayList11 = this.n;
                if (z10 && !arrayList11.isEmpty()) {
                    LinkedHashSet<o> linkedHashSet = new LinkedHashSet();
                    int size6 = arrayList.size();
                    int i25 = 0;
                    while (i25 < size6) {
                        Object obj2 = arrayList.get(i25);
                        i25++;
                        linkedHashSet.addAll(F((a) obj2));
                    }
                    if (this.h == null) {
                        int size7 = arrayList11.size();
                        int i26 = 0;
                        while (i26 < size7) {
                            Object obj3 = arrayList11.get(i26);
                            i26++;
                            gd6 gd6Var = (gd6) obj3;
                            for (o oVar8 : linkedHashSet) {
                                gd6Var.getClass();
                            }
                        }
                        int size8 = arrayList11.size();
                        int i27 = 0;
                        while (i27 < size8) {
                            Object obj4 = arrayList11.get(i27);
                            i27++;
                            gd6 gd6Var2 = (gd6) obj4;
                            for (o oVar9 : linkedHashSet) {
                                gd6Var2.getClass();
                            }
                        }
                    }
                }
                for (int i28 = i9; i28 < i2; i28++) {
                    a aVar3 = (a) arrayList.get(i28);
                    if (booleanValue2) {
                        for (int size9 = aVar3.c.size() - 1; size9 >= 0; size9--) {
                            o oVar10 = ((ul2) aVar3.c.get(size9)).b;
                            if (oVar10 != null) {
                                g(oVar10).k();
                            }
                        }
                    } else {
                        ArrayList arrayList12 = aVar3.c;
                        int size10 = arrayList12.size();
                        int i29 = 0;
                        while (i29 < size10) {
                            Object obj5 = arrayList12.get(i29);
                            i29++;
                            o oVar11 = ((ul2) obj5).b;
                            if (oVar11 != null) {
                                g(oVar11).k();
                            }
                        }
                    }
                }
                O(this.v, true);
                Iterator it = f(arrayList, i9, i2).iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    hVar.e = booleanValue2;
                    hVar.l();
                    hVar.e();
                }
                while (i9 < i2) {
                    a aVar4 = (a) arrayList.get(i9);
                    if (((Boolean) arrayList2.get(i9)).booleanValue() && aVar4.v >= 0) {
                        aVar4.v = -1;
                    }
                    if (aVar4.s != null) {
                        for (int i30 = 0; i30 < aVar4.s.size(); i30++) {
                            ((Runnable) aVar4.s.get(i30)).run();
                        }
                        aVar4.s = null;
                    }
                    i9++;
                }
                if (z10) {
                    for (int i31 = 0; i31 < arrayList11.size(); i31++) {
                        gd6 gd6Var3 = (gd6) arrayList11.get(i31);
                        switch (gd6Var3.a) {
                            case 0:
                                SettingsActivity settingsActivity = gd6Var3.b;
                                int i32 = SettingsActivity.F0;
                                settingsActivity.D();
                                break;
                            default:
                                SettingsActivity settingsActivity2 = gd6Var3.b;
                                s9 s9Var = settingsActivity2.E0;
                                if (s9Var != null) {
                                    ((ConstraintLayout) s9Var.a).post(new rk3(settingsActivity2, 10));
                                    break;
                                } else {
                                    nb3.a0("binding");
                                    throw null;
                                }
                        }
                    }
                    return;
                }
                return;
            }
        }
    }

    public final o C(int i) {
        y yVar = this.c;
        ArrayList arrayList = yVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o oVar = (o) arrayList.get(size);
            if (oVar != null && oVar.mFragmentId == i) {
                return oVar;
            }
        }
        for (x xVar : yVar.b.values()) {
            if (xVar != null) {
                o oVar2 = xVar.c;
                if (oVar2.mFragmentId == i) {
                    return oVar2;
                }
            }
        }
        return null;
    }

    public final o D(String str) {
        y yVar = this.c;
        ArrayList arrayList = yVar.a;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            o oVar = (o) arrayList.get(size);
            if (oVar != null && str.equals(oVar.mTag)) {
                return oVar;
            }
        }
        for (x xVar : yVar.b.values()) {
            if (xVar != null) {
                o oVar2 = xVar.c;
                if (str.equals(oVar2.mTag)) {
                    return oVar2;
                }
            }
        }
        return null;
    }

    public final void E() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            h hVar = (h) it.next();
            if (hVar.f) {
                if (K(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Forcing postponed operations");
                }
                hVar.f = false;
                hVar.e();
            }
        }
    }

    public final ViewGroup G(o oVar) {
        ViewGroup viewGroup = oVar.mContainer;
        if (viewGroup != null) {
            return viewGroup;
        }
        if (oVar.mContainerId > 0 && this.x.j()) {
            View c = this.x.c(oVar.mContainerId);
            if (c instanceof ViewGroup) {
                return (ViewGroup) c;
            }
            return null;
        }
        return null;
    }

    public final gl2 H() {
        o oVar = this.y;
        if (oVar != null) {
            return oVar.mFragmentManager.H();
        }
        return this.A;
    }

    public final q61 I() {
        o oVar = this.y;
        if (oVar != null) {
            return oVar.mFragmentManager.I();
        }
        return this.B;
    }

    public final void J(o oVar) {
        if (K(2)) {
            Log.v("FragmentManager", "hide: " + oVar);
        }
        if (!oVar.mHidden) {
            oVar.mHidden = true;
            oVar.mHiddenChanged = true ^ oVar.mHiddenChanged;
            b0(oVar);
        }
    }

    public final boolean M() {
        o oVar = this.y;
        if (oVar == null) {
            return true;
        }
        if (oVar.isAdded() && this.y.getParentFragmentManager().M()) {
            return true;
        }
        return false;
    }

    public final void O(int i, boolean z) {
        cl2 cl2Var;
        if (this.w == null && i != -1) {
            defpackage.i.m("No activity");
        } else if (z || i != this.v) {
            this.v = i;
            y yVar = this.c;
            HashMap hashMap = yVar.b;
            ArrayList arrayList = yVar.a;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                x xVar = (x) hashMap.get(((o) obj).mWho);
                if (xVar != null) {
                    xVar.k();
                }
            }
            for (x xVar2 : hashMap.values()) {
                if (xVar2 != null) {
                    xVar2.k();
                    o oVar = xVar2.c;
                    if (oVar.mRemoving && !oVar.isInBackStack()) {
                        if (oVar.mBeingSaved && !yVar.c.containsKey(oVar.mWho)) {
                            yVar.i(xVar2.n(), oVar.mWho);
                        }
                        yVar.h(xVar2);
                    }
                }
            }
            ArrayList d = yVar.d();
            int size2 = d.size();
            int i3 = 0;
            while (i3 < size2) {
                Object obj2 = d.get(i3);
                i3++;
                x xVar3 = (x) obj2;
                o oVar2 = xVar3.c;
                if (oVar2.mDeferStart) {
                    if (this.b) {
                        this.K = true;
                    } else {
                        oVar2.mDeferStart = false;
                        xVar3.k();
                    }
                }
            }
            if (this.G && (cl2Var = this.w) != null && this.v == 7) {
                ((vk2) cl2Var).X.invalidateOptionsMenu();
                this.G = false;
            }
        }
    }

    public final void P() {
        if (this.w != null) {
            this.H = false;
            this.I = false;
            this.O.g = false;
            for (o oVar : this.c.f()) {
                if (oVar != null) {
                    oVar.noteStateNotSaved();
                }
            }
        }
    }

    public final boolean Q() {
        return R(-1, 0);
    }

    public final boolean R(int i, int i2) {
        z(false);
        y(true);
        o oVar = this.z;
        if (oVar != null && i < 0 && oVar.getChildFragmentManager().Q()) {
            return true;
        }
        boolean S = S(i, i2, this.L, this.M);
        if (S) {
            this.b = true;
            try {
                U(this.L, this.M);
            } finally {
                d();
            }
        }
        e0();
        boolean z = this.K;
        y yVar = this.c;
        if (z) {
            this.K = false;
            ArrayList d = yVar.d();
            int size = d.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = d.get(i3);
                i3++;
                x xVar = (x) obj;
                o oVar2 = xVar.c;
                if (oVar2.mDeferStart) {
                    if (this.b) {
                        this.K = true;
                    } else {
                        oVar2.mDeferStart = false;
                        xVar.k();
                    }
                }
            }
        }
        yVar.b.values().removeAll(Collections.singleton(null));
        return S;
    }

    public final boolean S(int i, int i2, ArrayList arrayList, ArrayList arrayList2) {
        boolean z;
        if ((i2 & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        int i3 = -1;
        if (!this.d.isEmpty()) {
            if (i < 0) {
                i3 = z ? 0 : this.d.size() - 1;
            } else {
                int size = this.d.size() - 1;
                while (size >= 0) {
                    a aVar = (a) this.d.get(size);
                    if (i >= 0 && i == aVar.v) {
                        break;
                    }
                    size--;
                }
                if (size < 0) {
                    i3 = size;
                } else if (z) {
                    i3 = size;
                    while (i3 > 0) {
                        a aVar2 = (a) this.d.get(i3 - 1);
                        if (i < 0 || i != aVar2.v) {
                            break;
                        }
                        i3--;
                    }
                } else if (size != this.d.size() - 1) {
                    i3 = size + 1;
                }
            }
        }
        if (i3 < 0) {
            return false;
        }
        for (int size2 = this.d.size() - 1; size2 >= i3; size2--) {
            arrayList.add((a) this.d.remove(size2));
            arrayList2.add(Boolean.TRUE);
        }
        return true;
    }

    public final void T(o oVar) {
        if (K(2)) {
            Log.v("FragmentManager", "remove: " + oVar + " nesting=" + oVar.mBackStackNesting);
        }
        boolean isInBackStack = oVar.isInBackStack();
        if (oVar.mDetached && isInBackStack) {
            return;
        }
        y yVar = this.c;
        synchronized (yVar.a) {
            yVar.a.remove(oVar);
        }
        oVar.mAdded = false;
        if (L(oVar)) {
            this.G = true;
        }
        oVar.mRemoving = true;
        b0(oVar);
    }

    public final void U(ArrayList arrayList, ArrayList arrayList2) {
        if (!arrayList.isEmpty()) {
            if (arrayList.size() == arrayList2.size()) {
                int size = arrayList.size();
                int i = 0;
                int i2 = 0;
                while (i < size) {
                    if (!((a) arrayList.get(i)).r) {
                        if (i2 != i) {
                            B(i2, i, arrayList, arrayList2);
                        }
                        i2 = i + 1;
                        if (((Boolean) arrayList2.get(i)).booleanValue()) {
                            while (i2 < size && ((Boolean) arrayList2.get(i2)).booleanValue() && !((a) arrayList.get(i2)).r) {
                                i2++;
                            }
                        }
                        B(i, i2, arrayList, arrayList2);
                        i = i2 - 1;
                    }
                    i++;
                }
                if (i2 != size) {
                    B(i2, size, arrayList, arrayList2);
                    return;
                }
                return;
            }
            defpackage.i.m("Internal error with the back stack records");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v1, types: [java.lang.Object, ul2] */
    public final void V(Bundle bundle) {
        yc1 yc1Var;
        int i;
        boolean z;
        int i2;
        Bundle bundle2;
        x xVar;
        Bundle bundle3;
        Bundle bundle4;
        for (String str : bundle.keySet()) {
            if (str.startsWith("result_") && (bundle4 = bundle.getBundle(str)) != null) {
                bundle4.setClassLoader(this.w.B.getClassLoader());
                this.m.put(str.substring(7), bundle4);
            }
        }
        HashMap hashMap = new HashMap();
        for (String str2 : bundle.keySet()) {
            if (str2.startsWith("fragment_") && (bundle3 = bundle.getBundle(str2)) != null) {
                bundle3.setClassLoader(this.w.B.getClassLoader());
                hashMap.put(str2.substring(9), bundle3);
            }
        }
        y yVar = this.c;
        HashMap hashMap2 = yVar.c;
        HashMap hashMap3 = yVar.b;
        hashMap2.clear();
        hashMap2.putAll(hashMap);
        ml2 ml2Var = (ml2) bundle.getParcelable("state");
        if (ml2Var == null) {
            return;
        }
        hashMap3.clear();
        ArrayList arrayList = ml2Var.A;
        int size = arrayList.size();
        int i3 = 0;
        while (true) {
            yc1Var = this.o;
            if (i3 >= size) {
                break;
            }
            Object obj = arrayList.get(i3);
            i3++;
            Bundle i4 = yVar.i(null, (String) obj);
            if (i4 != null) {
                o oVar = (o) this.O.b.get(((w) i4.getParcelable("state")).B);
                if (oVar != null) {
                    if (K(2)) {
                        i2 = 2;
                        Log.v("FragmentManager", "restoreSaveState: re-attaching retained " + oVar);
                    } else {
                        i2 = 2;
                    }
                    xVar = new x(yc1Var, yVar, oVar, i4);
                    bundle2 = i4;
                } else {
                    i2 = 2;
                    bundle2 = i4;
                    xVar = new x(this.o, this.c, this.w.B.getClassLoader(), H(), i4);
                }
                o oVar2 = xVar.c;
                oVar2.mSavedFragmentState = bundle2;
                oVar2.mFragmentManager = this;
                if (K(i2)) {
                    Log.v("FragmentManager", "restoreSaveState: active (" + oVar2.mWho + "): " + oVar2);
                }
                xVar.l(this.w.B.getClassLoader());
                yVar.g(xVar);
                xVar.e = this.v;
            }
        }
        v vVar = this.O;
        vVar.getClass();
        ArrayList arrayList2 = new ArrayList(vVar.b.values());
        int size2 = arrayList2.size();
        int i5 = 0;
        while (i5 < size2) {
            Object obj2 = arrayList2.get(i5);
            i5++;
            o oVar3 = (o) obj2;
            if (hashMap3.get(oVar3.mWho) == null) {
                if (K(2)) {
                    Log.v("FragmentManager", "Discarding retained Fragment " + oVar3 + " that was not found in the set of active Fragments " + ml2Var.A);
                }
                this.O.i(oVar3);
                oVar3.mFragmentManager = this;
                x xVar2 = new x(yc1Var, yVar, oVar3);
                xVar2.e = 1;
                xVar2.k();
                oVar3.mRemoving = true;
                xVar2.k();
            }
        }
        ArrayList arrayList3 = ml2Var.B;
        yVar.a.clear();
        if (arrayList3 != null) {
            int size3 = arrayList3.size();
            int i6 = 0;
            while (i6 < size3) {
                Object obj3 = arrayList3.get(i6);
                i6++;
                String str3 = (String) obj3;
                o b = yVar.b(str3);
                if (b != null) {
                    if (K(2)) {
                        Log.v("FragmentManager", "restoreSaveState: added (" + str3 + "): " + b);
                    }
                    yVar.a(b);
                } else {
                    defpackage.i.m(lb1.A("No instantiated fragment for (", str3, ")"));
                    return;
                }
            }
        }
        if (ml2Var.L != null) {
            this.d = new ArrayList(ml2Var.L.length);
            int i7 = 0;
            while (true) {
                b[] bVarArr = ml2Var.L;
                if (i7 >= bVarArr.length) {
                    break;
                }
                b bVar = bVarArr[i7];
                ArrayList arrayList4 = bVar.B;
                a aVar = new a(this);
                int[] iArr = bVar.A;
                int i8 = 0;
                int i9 = 0;
                while (i8 < iArr.length) {
                    ?? obj4 = new Object();
                    int i10 = i8 + 1;
                    obj4.a = iArr[i8];
                    if (K(2)) {
                        Log.v("FragmentManager", "Instantiate " + aVar + " op #" + i9 + " base fragment #" + iArr[i10]);
                    }
                    obj4.h = tt3.values()[bVar.L[i9]];
                    obj4.i = tt3.values()[bVar.R[i9]];
                    int i11 = i8 + 2;
                    if (iArr[i10] != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    obj4.c = z;
                    int i12 = iArr[i11];
                    obj4.d = i12;
                    int i13 = iArr[i8 + 3];
                    obj4.e = i13;
                    int i14 = i8 + 5;
                    int i15 = iArr[i8 + 4];
                    obj4.f = i15;
                    i8 += 6;
                    int[] iArr2 = iArr;
                    int i16 = iArr2[i14];
                    obj4.g = i16;
                    aVar.d = i12;
                    aVar.e = i13;
                    aVar.f = i15;
                    aVar.g = i16;
                    aVar.b(obj4);
                    i9++;
                    iArr = iArr2;
                }
                aVar.h = bVar.X;
                aVar.k = bVar.Y;
                aVar.i = true;
                aVar.l = bVar.d0;
                aVar.m = bVar.e0;
                aVar.n = bVar.f0;
                aVar.o = bVar.g0;
                aVar.p = bVar.h0;
                aVar.q = bVar.i0;
                aVar.r = bVar.j0;
                aVar.v = bVar.Z;
                for (int i17 = 0; i17 < arrayList4.size(); i17++) {
                    String str4 = (String) arrayList4.get(i17);
                    if (str4 != null) {
                        ((ul2) aVar.c.get(i17)).b = yVar.b(str4);
                    }
                }
                aVar.f(1);
                if (K(2)) {
                    StringBuilder t = xg6.t("restoreAllState: back stack #", i7, " (index ");
                    t.append(aVar.v);
                    t.append("): ");
                    t.append(aVar);
                    Log.v("FragmentManager", t.toString());
                    PrintWriter printWriter = new PrintWriter(new qy3());
                    aVar.j("  ", printWriter, false);
                    printWriter.close();
                }
                this.d.add(aVar);
                i7++;
            }
            i = 0;
        } else {
            i = 0;
            this.d = new ArrayList();
        }
        this.k.set(ml2Var.R);
        String str5 = ml2Var.X;
        if (str5 != null) {
            o b2 = yVar.b(str5);
            this.z = b2;
            r(b2);
        }
        ArrayList arrayList5 = ml2Var.Y;
        if (arrayList5 != null) {
            for (int i18 = i; i18 < arrayList5.size(); i18++) {
                this.l.put((String) arrayList5.get(i18), (l00) ml2Var.Z.get(i18));
            }
        }
        this.F = new ArrayDeque(ml2Var.d0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8, types: [ml2, android.os.Parcelable, java.lang.Object] */
    public final Bundle W() {
        int i;
        ArrayList arrayList;
        b[] bVarArr;
        Bundle bundle = new Bundle();
        E();
        w();
        z(true);
        this.H = true;
        this.O.g = true;
        y yVar = this.c;
        yVar.getClass();
        HashMap hashMap = yVar.b;
        ArrayList arrayList2 = new ArrayList(hashMap.size());
        for (x xVar : hashMap.values()) {
            if (xVar != null) {
                o oVar = xVar.c;
                yVar.i(xVar.n(), oVar.mWho);
                arrayList2.add(oVar.mWho);
                if (K(2)) {
                    Log.v("FragmentManager", "Saved state of " + oVar + ": " + oVar.mSavedFragmentState);
                }
            }
        }
        HashMap hashMap2 = this.c.c;
        if (hashMap2.isEmpty()) {
            if (K(2)) {
                Log.v("FragmentManager", "saveAllState: no fragments!");
                return bundle;
            }
        } else {
            y yVar2 = this.c;
            synchronized (yVar2.a) {
                try {
                    if (yVar2.a.isEmpty()) {
                        arrayList = null;
                    } else {
                        arrayList = new ArrayList(yVar2.a.size());
                        ArrayList arrayList3 = yVar2.a;
                        int size = arrayList3.size();
                        int i2 = 0;
                        while (i2 < size) {
                            Object obj = arrayList3.get(i2);
                            i2++;
                            o oVar2 = (o) obj;
                            arrayList.add(oVar2.mWho);
                            if (K(2)) {
                                Log.v("FragmentManager", "saveAllState: adding fragment (" + oVar2.mWho + "): " + oVar2);
                            }
                        }
                    }
                } finally {
                }
            }
            int size2 = this.d.size();
            if (size2 > 0) {
                bVarArr = new b[size2];
                for (i = 0; i < size2; i++) {
                    bVarArr[i] = new b((a) this.d.get(i));
                    if (K(2)) {
                        StringBuilder t = xg6.t("saveAllState: adding back stack #", i, ": ");
                        t.append(this.d.get(i));
                        Log.v("FragmentManager", t.toString());
                    }
                }
            } else {
                bVarArr = null;
            }
            ?? obj2 = new Object();
            obj2.X = null;
            ArrayList arrayList4 = new ArrayList();
            obj2.Y = arrayList4;
            ArrayList arrayList5 = new ArrayList();
            obj2.Z = arrayList5;
            obj2.A = arrayList2;
            obj2.B = arrayList;
            obj2.L = bVarArr;
            obj2.R = this.k.get();
            o oVar3 = this.z;
            if (oVar3 != null) {
                obj2.X = oVar3.mWho;
            }
            arrayList4.addAll(this.l.keySet());
            arrayList5.addAll(this.l.values());
            obj2.d0 = new ArrayList(this.F);
            bundle.putParcelable("state", obj2);
            for (String str : this.m.keySet()) {
                bundle.putBundle(i61.m("result_", str), (Bundle) this.m.get(str));
            }
            for (String str2 : hashMap2.keySet()) {
                bundle.putBundle(i61.m("fragment_", str2), (Bundle) hashMap2.get(str2));
            }
        }
        return bundle;
    }

    public final void X() {
        synchronized (this.a) {
            try {
                if (this.a.size() == 1) {
                    this.w.L.removeCallbacks(this.P);
                    this.w.L.post(this.P);
                    e0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void Y(o oVar, boolean z) {
        ViewGroup G = G(oVar);
        if (G != null && (G instanceof FragmentContainerView)) {
            ((FragmentContainerView) G).setDrawDisappearingViewsLast(!z);
        }
    }

    public final void Z(o oVar, tt3 tt3Var) {
        if (oVar.equals(this.c.b(oVar.mWho)) && (oVar.mHost == null || oVar.mFragmentManager == this)) {
            oVar.mMaxState = tt3Var;
        } else {
            fa6.f("Fragment ", oVar, " is not an active fragment of FragmentManager ", this);
        }
    }

    public final x a(o oVar) {
        String str = oVar.mPreviousWho;
        if (str != null) {
            tl2.c(oVar, str);
        }
        if (K(2)) {
            Log.v("FragmentManager", "add: " + oVar);
        }
        x g = g(oVar);
        oVar.mFragmentManager = this;
        y yVar = this.c;
        yVar.g(g);
        if (!oVar.mDetached) {
            yVar.a(oVar);
            oVar.mRemoving = false;
            if (oVar.mView == null) {
                oVar.mHiddenChanged = false;
            }
            if (L(oVar)) {
                this.G = true;
            }
        }
        return g;
    }

    public final void a0(o oVar) {
        if (oVar != null) {
            if (!oVar.equals(this.c.b(oVar.mWho)) || (oVar.mHost != null && oVar.mFragmentManager != this)) {
                fa6.f("Fragment ", oVar, " is not an active fragment of FragmentManager ", this);
                return;
            }
        }
        o oVar2 = this.z;
        this.z = oVar;
        r(oVar2);
        r(this.z);
    }

    public final void b(cl2 cl2Var, zk2 zk2Var, o oVar) {
        boolean z;
        String str;
        if (this.w == null) {
            this.w = cl2Var;
            this.x = zk2Var;
            this.y = oVar;
            CopyOnWriteArrayList copyOnWriteArrayList = this.p;
            if (oVar != null) {
                copyOnWriteArrayList.add(new hl2(oVar));
            } else if (cl2Var instanceof ol2) {
                copyOnWriteArrayList.add((ol2) cl2Var);
            }
            if (this.y != null) {
                e0();
            }
            if (cl2Var instanceof jl4) {
                jl4 jl4Var = (jl4) cl2Var;
                il4 b = jl4Var.b();
                this.g = b;
                hu3 hu3Var = jl4Var;
                if (oVar != null) {
                    hu3Var = oVar;
                }
                b.a(hu3Var, this.j);
            }
            if (oVar != null) {
                v vVar = oVar.mFragmentManager.O;
                HashMap hashMap = vVar.c;
                v vVar2 = (v) hashMap.get(oVar.mWho);
                if (vVar2 == null) {
                    vVar2 = new v(vVar.e);
                    hashMap.put(oVar.mWho, vVar2);
                }
                this.O = vVar2;
            } else if (cl2Var instanceof bp7) {
                ap7 viewModelStore = ((bp7) cl2Var).getViewModelStore();
                viewModelStore.getClass();
                h71 h71Var = h71.b;
                h71Var.getClass();
                eb ebVar = new eb(viewModelStore, v.h, h71Var);
                ar0 a = gh5.a(v.class);
                String b2 = a.b();
                if (b2 != null) {
                    this.O = (v) ebVar.G(a, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b2));
                } else {
                    defpackage.i.h("Local and anonymous classes can not be ViewModels");
                    return;
                }
            } else {
                this.O = new v(false);
            }
            v vVar3 = this.O;
            if (!this.H && !this.I) {
                z = false;
            } else {
                z = true;
            }
            vVar3.g = z;
            this.c.d = vVar3;
            cl2 cl2Var2 = this.w;
            if ((cl2Var2 instanceof g56) && oVar == null) {
                d56 savedStateRegistry = ((g56) cl2Var2).getSavedStateRegistry();
                savedStateRegistry.c("android:support:fragments", new gv0(this, 3));
                Bundle a2 = savedStateRegistry.a("android:support:fragments");
                if (a2 != null) {
                    V(a2);
                }
            }
            cl2 cl2Var3 = this.w;
            if (cl2Var3 instanceof l9) {
                j9 g = ((l9) cl2Var3).g();
                if (oVar != null) {
                    str = i61.n(new StringBuilder(), oVar.mWho, ":");
                } else {
                    str = "";
                }
                String concat = "FragmentManager:".concat(str);
                this.C = g.c(concat.concat("StartActivityForResult"), new c9(5), new el2(this, 1));
                this.D = g.c(concat.concat("StartIntentSenderForResult"), new c9(7), new el2(this, 2));
                this.E = g.c(concat.concat("RequestPermissions"), new c9(3), new el2(this, 0));
            }
            cl2 cl2Var4 = this.w;
            if (cl2Var4 instanceof kl4) {
                ((kl4) cl2Var4).k(this.q);
            }
            cl2 cl2Var5 = this.w;
            if (cl2Var5 instanceof yl4) {
                ((yl4) cl2Var5).f(this.r);
            }
            cl2 cl2Var6 = this.w;
            if (cl2Var6 instanceof rl4) {
                ((rl4) cl2Var6).e(this.s);
            }
            cl2 cl2Var7 = this.w;
            if (cl2Var7 instanceof sl4) {
                ((sl4) cl2Var7).d(this.t);
            }
            cl2 cl2Var8 = this.w;
            if ((cl2Var8 instanceof l44) && oVar == null) {
                ((l44) cl2Var8).m(this.u);
                return;
            }
            return;
        }
        defpackage.i.m("Already attached");
    }

    public final void b0(o oVar) {
        ViewGroup G = G(oVar);
        if (G != null) {
            if (oVar.getPopExitAnim() + oVar.getPopEnterAnim() + oVar.getExitAnim() + oVar.getEnterAnim() > 0) {
                if (G.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                    G.setTag(R.id.visible_removing_fragment_view_tag, oVar);
                }
                ((o) G.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(oVar.getPopDirection());
            }
        }
    }

    public final void c(o oVar) {
        if (K(2)) {
            Log.v("FragmentManager", "attach: " + oVar);
        }
        if (oVar.mDetached) {
            oVar.mDetached = false;
            if (!oVar.mAdded) {
                this.c.a(oVar);
                if (K(2)) {
                    Log.v("FragmentManager", "add from attach: " + oVar);
                }
                if (L(oVar)) {
                    this.G = true;
                }
            }
        }
    }

    public final void d() {
        this.b = false;
        this.M.clear();
        this.L.clear();
    }

    public final void d0(IllegalStateException illegalStateException) {
        Log.e("FragmentManager", illegalStateException.getMessage());
        Log.e("FragmentManager", "Activity state:");
        PrintWriter printWriter = new PrintWriter(new qy3());
        cl2 cl2Var = this.w;
        if (cl2Var != null) {
            try {
                ((vk2) cl2Var).X.dump("  ", null, printWriter, new String[0]);
            } catch (Exception e) {
                Log.e("FragmentManager", "Failed dumping state", e);
            }
        } else {
            try {
                v("  ", null, printWriter, new String[0]);
            } catch (Exception e2) {
                Log.e("FragmentManager", "Failed dumping state", e2);
            }
        }
        throw illegalStateException;
    }

    public final HashSet e() {
        h hVar;
        HashSet hashSet = new HashSet();
        ArrayList d = this.c.d();
        int size = d.size();
        int i = 0;
        while (i < size) {
            Object obj = d.get(i);
            i++;
            ViewGroup viewGroup = ((x) obj).c.mContainer;
            if (viewGroup != null) {
                I().getClass();
                Object tag = viewGroup.getTag(R.id.special_effects_controller_view_tag);
                if (tag instanceof h) {
                    hVar = (h) tag;
                } else {
                    hVar = new h(viewGroup);
                    viewGroup.setTag(R.id.special_effects_controller_view_tag, hVar);
                }
                hashSet.add(hVar);
            }
        }
        return hashSet;
    }

    public final void e0() {
        int i;
        synchronized (this.a) {
            try {
                boolean z = true;
                if (!this.a.isEmpty()) {
                    this.j.f(true);
                    if (K(3)) {
                        Log.d("FragmentManager", "FragmentManager " + this + " enabling OnBackPressedCallback, caused by non-empty pending actions");
                    }
                    return;
                }
                int size = this.d.size();
                if (this.h != null) {
                    i = 1;
                } else {
                    i = 0;
                }
                if (size + i <= 0 || !N(this.y)) {
                    z = false;
                }
                if (K(3)) {
                    Log.d("FragmentManager", "OnBackPressedCallback for FragmentManager " + this + " enabled state is " + z);
                }
                this.j.f(z);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final HashSet f(ArrayList arrayList, int i, int i2) {
        ViewGroup viewGroup;
        HashSet hashSet = new HashSet();
        while (i < i2) {
            ArrayList arrayList2 = ((a) arrayList.get(i)).c;
            int size = arrayList2.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList2.get(i3);
                i3++;
                o oVar = ((ul2) obj).b;
                if (oVar != null && (viewGroup = oVar.mContainer) != null) {
                    hashSet.add(h.j(viewGroup, this));
                }
            }
            i++;
        }
        return hashSet;
    }

    public final x g(o oVar) {
        String str = oVar.mWho;
        y yVar = this.c;
        x xVar = (x) yVar.b.get(str);
        if (xVar != null) {
            return xVar;
        }
        x xVar2 = new x(this.o, yVar, oVar);
        xVar2.l(this.w.B.getClassLoader());
        xVar2.e = this.v;
        return xVar2;
    }

    public final void h(o oVar) {
        if (K(2)) {
            Log.v("FragmentManager", "detach: " + oVar);
        }
        if (!oVar.mDetached) {
            oVar.mDetached = true;
            if (oVar.mAdded) {
                if (K(2)) {
                    Log.v("FragmentManager", "remove from detach: " + oVar);
                }
                y yVar = this.c;
                synchronized (yVar.a) {
                    yVar.a.remove(oVar);
                }
                oVar.mAdded = false;
                if (L(oVar)) {
                    this.G = true;
                }
                b0(oVar);
            }
        }
    }

    public final void i(boolean z, Configuration configuration) {
        if (z && (this.w instanceof kl4)) {
            d0(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
            throw null;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null) {
                oVar.performConfigurationChanged(configuration);
                if (z) {
                    oVar.mChildFragmentManager.i(true, configuration);
                }
            }
        }
    }

    public final boolean j(MenuItem menuItem) {
        if (this.v < 1) {
            return false;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null && oVar.performContextItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final boolean k(Menu menu, MenuInflater menuInflater) {
        if (this.v < 1) {
            return false;
        }
        ArrayList arrayList = null;
        boolean z = false;
        for (o oVar : this.c.f()) {
            if (oVar != null && oVar.isMenuVisible() && oVar.performCreateOptionsMenu(menu, menuInflater)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(oVar);
                z = true;
            }
        }
        if (this.e != null) {
            for (int i = 0; i < this.e.size(); i++) {
                o oVar2 = (o) this.e.get(i);
                if (arrayList == null || !arrayList.contains(oVar2)) {
                    oVar2.onDestroyOptionsMenu();
                }
            }
        }
        this.e = arrayList;
        return z;
    }

    public final void l() {
        boolean z = true;
        this.J = true;
        z(true);
        w();
        cl2 cl2Var = this.w;
        boolean z2 = cl2Var instanceof bp7;
        y yVar = this.c;
        if (z2) {
            z = yVar.d.f;
        } else {
            jq jqVar = cl2Var.B;
            if (jqVar != null) {
                z = true ^ jqVar.isChangingConfigurations();
            }
        }
        if (z) {
            for (l00 l00Var : this.l.values()) {
                ArrayList arrayList = l00Var.A;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    Object obj = arrayList.get(i);
                    i++;
                    yVar.d.g((String) obj, false);
                }
            }
        }
        u(-1);
        cl2 cl2Var2 = this.w;
        if (cl2Var2 instanceof yl4) {
            ((yl4) cl2Var2).h(this.r);
        }
        cl2 cl2Var3 = this.w;
        if (cl2Var3 instanceof kl4) {
            ((kl4) cl2Var3).l(this.q);
        }
        cl2 cl2Var4 = this.w;
        if (cl2Var4 instanceof rl4) {
            ((rl4) cl2Var4).o(this.s);
        }
        cl2 cl2Var5 = this.w;
        if (cl2Var5 instanceof sl4) {
            ((sl4) cl2Var5).n(this.t);
        }
        cl2 cl2Var6 = this.w;
        if ((cl2Var6 instanceof l44) && this.y == null) {
            ((l44) cl2Var6).i(this.u);
        }
        this.w = null;
        this.x = null;
        this.y = null;
        if (this.g != null) {
            this.j.e();
            this.g = null;
        }
        i9 i9Var = this.C;
        if (i9Var != null) {
            i9Var.b();
            this.D.b();
            this.E.b();
        }
    }

    public final void m(boolean z) {
        if (z && (this.w instanceof yl4)) {
            d0(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
            throw null;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null) {
                oVar.performLowMemory();
                if (z) {
                    oVar.mChildFragmentManager.m(true);
                }
            }
        }
    }

    public final void n(boolean z, boolean z2) {
        if (z2 && (this.w instanceof rl4)) {
            d0(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
            throw null;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null) {
                oVar.performMultiWindowModeChanged(z);
                if (z2) {
                    oVar.mChildFragmentManager.n(z, true);
                }
            }
        }
    }

    public final void o() {
        ArrayList e = this.c.e();
        int size = e.size();
        int i = 0;
        while (i < size) {
            Object obj = e.get(i);
            i++;
            o oVar = (o) obj;
            if (oVar != null) {
                oVar.onHiddenChanged(oVar.isHidden());
                oVar.mChildFragmentManager.o();
            }
        }
    }

    public final boolean p(MenuItem menuItem) {
        if (this.v < 1) {
            return false;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null && oVar.performOptionsItemSelected(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public final void q(Menu menu) {
        if (this.v >= 1) {
            for (o oVar : this.c.f()) {
                if (oVar != null) {
                    oVar.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    public final void r(o oVar) {
        if (oVar != null) {
            if (oVar.equals(this.c.b(oVar.mWho))) {
                oVar.performPrimaryNavigationFragmentChanged();
            }
        }
    }

    public final void s(boolean z, boolean z2) {
        if (z2 && (this.w instanceof sl4)) {
            d0(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
            throw null;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null) {
                oVar.performPictureInPictureModeChanged(z);
                if (z2) {
                    oVar.mChildFragmentManager.s(z, true);
                }
            }
        }
    }

    public final boolean t(Menu menu) {
        boolean z = false;
        if (this.v < 1) {
            return false;
        }
        for (o oVar : this.c.f()) {
            if (oVar != null && oVar.isMenuVisible() && oVar.performPrepareOptionsMenu(menu)) {
                z = true;
            }
        }
        return z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        o oVar = this.y;
        if (oVar != null) {
            sb.append(oVar.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.y)));
            sb.append("}");
        } else {
            cl2 cl2Var = this.w;
            if (cl2Var != null) {
                sb.append(cl2Var.getClass().getSimpleName());
                sb.append("{");
                sb.append(Integer.toHexString(System.identityHashCode(this.w)));
                sb.append("}");
            } else {
                sb.append("null");
            }
        }
        sb.append("}}");
        return sb.toString();
    }

    public final void u(int i) {
        try {
            this.b = true;
            for (x xVar : this.c.b.values()) {
                if (xVar != null) {
                    xVar.e = i;
                }
            }
            O(i, false);
            Iterator it = e().iterator();
            while (it.hasNext()) {
                ((h) it.next()).i();
            }
            this.b = false;
            z(true);
        } catch (Throwable th) {
            this.b = false;
            throw th;
        }
    }

    public final void v(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        int size;
        String str2 = str + "    ";
        y yVar = this.c;
        ArrayList arrayList = yVar.a;
        String str3 = str + "    ";
        HashMap hashMap = yVar.b;
        if (!hashMap.isEmpty()) {
            printWriter.print(str);
            printWriter.println("Active Fragments:");
            for (x xVar : hashMap.values()) {
                printWriter.print(str);
                if (xVar != null) {
                    o oVar = xVar.c;
                    printWriter.println(oVar);
                    oVar.dump(str3, fileDescriptor, printWriter, strArr);
                } else {
                    printWriter.println("null");
                }
            }
        }
        int size2 = arrayList.size();
        if (size2 > 0) {
            printWriter.print(str);
            printWriter.println("Added Fragments:");
            for (int i = 0; i < size2; i++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i);
                printWriter.print(": ");
                printWriter.println(((o) arrayList.get(i)).toString());
            }
        }
        ArrayList arrayList2 = this.e;
        if (arrayList2 != null && (size = arrayList2.size()) > 0) {
            printWriter.print(str);
            printWriter.println("Fragments Created Menus:");
            for (int i2 = 0; i2 < size; i2++) {
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i2);
                printWriter.print(": ");
                printWriter.println(((o) this.e.get(i2)).toString());
            }
        }
        int size3 = this.d.size();
        if (size3 > 0) {
            printWriter.print(str);
            printWriter.println("Back Stack:");
            for (int i3 = 0; i3 < size3; i3++) {
                a aVar = (a) this.d.get(i3);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(i3);
                printWriter.print(": ");
                printWriter.println(aVar.toString());
                aVar.j(str2, printWriter, true);
            }
        }
        printWriter.print(str);
        printWriter.println("Back Stack Index: " + this.k.get());
        synchronized (this.a) {
            try {
                int size4 = this.a.size();
                if (size4 > 0) {
                    printWriter.print(str);
                    printWriter.println("Pending Actions:");
                    for (int i4 = 0; i4 < size4; i4++) {
                        printWriter.print(str);
                        printWriter.print("  #");
                        printWriter.print(i4);
                        printWriter.print(": ");
                        printWriter.println((jl2) this.a.get(i4));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        printWriter.print(str);
        printWriter.println("FragmentManager misc state:");
        printWriter.print(str);
        printWriter.print("  mHost=");
        printWriter.println(this.w);
        printWriter.print(str);
        printWriter.print("  mContainer=");
        printWriter.println(this.x);
        if (this.y != null) {
            printWriter.print(str);
            printWriter.print("  mParent=");
            printWriter.println(this.y);
        }
        printWriter.print(str);
        printWriter.print("  mCurState=");
        printWriter.print(this.v);
        printWriter.print(" mStateSaved=");
        printWriter.print(this.H);
        printWriter.print(" mStopped=");
        printWriter.print(this.I);
        printWriter.print(" mDestroyed=");
        printWriter.println(this.J);
        if (this.G) {
            printWriter.print(str);
            printWriter.print("  mNeedMenuInvalidate=");
            printWriter.println(this.G);
        }
    }

    public final void w() {
        Iterator it = e().iterator();
        while (it.hasNext()) {
            ((h) it.next()).i();
        }
    }

    public final void x(jl2 jl2Var, boolean z) {
        if (!z) {
            if (this.w == null) {
                if (this.J) {
                    defpackage.i.m("FragmentManager has been destroyed");
                    return;
                } else {
                    defpackage.i.m("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (this.H || this.I) {
                defpackage.i.m("Can not perform this action after onSaveInstanceState");
                return;
            }
        }
        synchronized (this.a) {
            try {
                if (this.w == null) {
                    if (z) {
                        return;
                    }
                    throw new IllegalStateException("Activity has been destroyed");
                }
                this.a.add(jl2Var);
                X();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void y(boolean z) {
        if (!this.b) {
            if (this.w == null) {
                if (this.J) {
                    defpackage.i.m("FragmentManager has been destroyed");
                    return;
                } else {
                    defpackage.i.m("FragmentManager has not been attached to a host.");
                    return;
                }
            } else if (Looper.myLooper() == this.w.L.getLooper()) {
                if (!z && (this.H || this.I)) {
                    defpackage.i.m("Can not perform this action after onSaveInstanceState");
                    return;
                } else if (this.L == null) {
                    this.L = new ArrayList();
                    this.M = new ArrayList();
                    return;
                } else {
                    return;
                }
            } else {
                defpackage.i.m("Must be called from main thread of fragment host");
                return;
            }
        }
        defpackage.i.m("FragmentManager is already executing transactions");
    }

    public final boolean z(boolean z) {
        boolean z2;
        ArrayList arrayList;
        a aVar;
        y(z);
        if (!this.i && (aVar = this.h) != null) {
            aVar.u = false;
            aVar.g();
            if (K(3)) {
                Log.d("FragmentManager", "Reversing mTransitioningOp " + this.h + " as part of execPendingActions for actions " + this.a);
            }
            this.h.i(false, false);
            this.a.add(0, this.h);
            ArrayList arrayList2 = this.h.c;
            int size = arrayList2.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList2.get(i);
                i++;
                o oVar = ((ul2) obj).b;
                if (oVar != null) {
                    oVar.mTransitioning = false;
                }
            }
            this.h = null;
        }
        boolean z3 = false;
        while (true) {
            ArrayList arrayList3 = this.L;
            ArrayList arrayList4 = this.M;
            synchronized (this.a) {
                if (this.a.isEmpty()) {
                    z2 = false;
                } else {
                    int size2 = this.a.size();
                    int i2 = 0;
                    z2 = false;
                    while (true) {
                        arrayList = this.a;
                        if (i2 >= size2) {
                            break;
                        }
                        z2 |= ((jl2) arrayList.get(i2)).a(arrayList3, arrayList4);
                        i2++;
                    }
                    arrayList.clear();
                    this.w.L.removeCallbacks(this.P);
                }
            }
            if (!z2) {
                break;
            }
            this.b = true;
            try {
                U(this.L, this.M);
                d();
                z3 = true;
            } catch (Throwable th) {
                d();
                throw th;
            }
        }
        e0();
        if (this.K) {
            this.K = false;
            ArrayList d = this.c.d();
            int size3 = d.size();
            int i3 = 0;
            while (i3 < size3) {
                Object obj2 = d.get(i3);
                i3++;
                x xVar = (x) obj2;
                o oVar2 = xVar.c;
                if (oVar2.mDeferStart) {
                    if (this.b) {
                        this.K = true;
                    } else {
                        oVar2.mDeferStart = false;
                        xVar.k();
                    }
                }
            }
        }
        this.c.b.values().removeAll(Collections.singleton(null));
        return z3;
    }
}

package defpackage;

import android.content.ClipDescription;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.os.Trace;
import android.os.Vibrator;
import android.text.Editable;
import android.text.Selection;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
import me.magnum.melondualds.R;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: os  reason: default package */
/* loaded from: classes.dex */
public final class os implements cb6, e52, j90, o03, k64 {
    public static volatile os X;
    public static final Object Y = new Object();
    public final /* synthetic */ int A;
    public Object B;
    public Object L;
    public Object R;

    public os(int i) {
        this.A = i;
        switch (i) {
            case 4:
                this.B = new us3(16);
                long[] jArr = wu5.a;
                this.L = new d24();
                this.R = new jo1(24);
                return;
            case 11:
                this.B = new t71(5);
                this.L = new t71(5);
                this.R = new t71(5);
                return;
            case 23:
                String uuid = UUID.randomUUID().toString();
                uuid.getClass();
                w70 w70Var = w70.R;
                this.B = iq0.p(uuid);
                this.L = f14.f;
                this.R = new ArrayList();
                return;
            case 27:
                long[] jArr2 = wu5.a;
                this.B = new d24();
                return;
            default:
                this.R = new jo1(24);
                return;
        }
    }

    public static final void h(os osVar, Network network, boolean z) {
        boolean z2;
        Network[] allNetworks = ((ConnectivityManager) osVar.B).getAllNetworks();
        int length = allNetworks.length;
        boolean z3 = false;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            Network network2 = allNetworks[i];
            if (b53.x(network2, network)) {
                z2 = z;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) osVar.B).getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
            }
            if (z2) {
                z3 = true;
                break;
            }
            i++;
        }
        nl6 nl6Var = (nl6) osVar.L;
        synchronized (nl6Var) {
            try {
                if (((c55) nl6Var.A.get()) != null) {
                    nl6Var.X = z3;
                } else {
                    nl6Var.b();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static boolean o(Editable editable, KeyEvent keyEvent, boolean z) {
        x07[] x07VarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (x07VarArr = (x07[]) editable.getSpans(selectionStart, selectionEnd, x07.class)) != null && x07VarArr.length > 0) {
                for (x07 x07Var : x07VarArr) {
                    int spanStart = editable.getSpanStart(x07Var);
                    int spanEnd = editable.getSpanEnd(x07Var);
                    if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static os y(Context context) {
        if (X == null) {
            synchronized (Y) {
                try {
                    if (X == null) {
                        X = new os(context);
                    }
                } finally {
                }
            }
        }
        return X;
    }

    public sd3 A() {
        return ((rh0) this.R).A.b;
    }

    public zh4 B() {
        zh4 zh4Var = (zh4) this.L;
        if (zh4Var != null) {
            return zh4Var;
        }
        b53.g0("layoutInfo");
        throw null;
    }

    public int C() {
        if (B().a.isEmpty()) {
            return 0;
        }
        return Math.abs(((((xv3) tq0.T0(B().a)).j + B().b) + B().c) - B().g);
    }

    public int D() {
        int i = 0;
        if (B().a.isEmpty()) {
            return 0;
        }
        int i2 = ((xv3) tq0.K0(B().a)).j + (-B().f);
        if (i2 <= 0) {
            i = i2;
        }
        return Math.abs(i);
    }

    public long E() {
        return ((rh0) this.R).A.d;
    }

    public int F() {
        return ((Number) ((gi4) this.B).c()).intValue();
    }

    public boolean G() {
        return !((ArrayList) this.R).isEmpty();
    }

    public boolean H(CharSequence charSequence, int i, int i2, w07 w07Var) {
        int i3;
        if ((w07Var.c & 3) == 0) {
            ea1 ea1Var = (ea1) this.R;
            wx3 b = w07Var.b();
            int a = b.a(8);
            if (a != 0) {
                ((ByteBuffer) b.R).getShort(a + b.A);
            }
            ea1Var.getClass();
            ThreadLocal threadLocal = ea1.b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb = (StringBuilder) threadLocal.get();
            sb.setLength(0);
            while (i < i2) {
                sb.append(charSequence.charAt(i));
                i++;
            }
            boolean hasGlyph = ea1Var.a.hasGlyph(sb.toString());
            int i4 = w07Var.c & 4;
            if (hasGlyph) {
                i3 = i4 | 2;
            } else {
                i3 = i4 | 1;
            }
            w07Var.c = i3;
        }
        if ((w07Var.c & 3) != 2) {
            return false;
        }
        return true;
    }

    public boolean I() {
        boolean z;
        if (((pb6) ((t71) this.B).B).isEmpty() && ((pb6) ((t71) this.R).B).isEmpty() && ((pb6) ((t71) this.L).B).isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    public boolean J(int i, ky0 ky0Var, gz0 gz0Var) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        k10 k10Var = (k10) this.L;
        fz0[] fz0VarArr = gz0Var.T;
        int[] iArr = gz0Var.t;
        k10Var.a = fz0VarArr[0];
        k10Var.b = fz0VarArr[1];
        k10Var.c = gz0Var.r();
        k10Var.d = gz0Var.l();
        k10Var.i = false;
        k10Var.j = i;
        fz0 fz0Var = k10Var.a;
        fz0 fz0Var2 = fz0.MATCH_CONSTRAINT;
        if (fz0Var == fz0Var2) {
            z = true;
        } else {
            z = false;
        }
        if (k10Var.b == fz0Var2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && gz0Var.X > RecyclerView.A1) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && gz0Var.X > RecyclerView.A1) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (z3 && iArr[0] == 4) {
            k10Var.a = fz0.FIXED;
        }
        if (z4 && iArr[1] == 4) {
            k10Var.b = fz0.FIXED;
        }
        ky0Var.b(gz0Var, k10Var);
        gz0Var.P(k10Var.e);
        gz0Var.M(k10Var.f);
        gz0Var.E = k10Var.h;
        gz0Var.J(k10Var.g);
        k10Var.j = 0;
        return k10Var.i;
    }

    public Object K(CharSequence charSequence, int i, int i2, int i3, boolean z, xo1 xo1Var) {
        int i4;
        yx3 yx3Var;
        boolean z2;
        zo1 zo1Var = new zo1((yx3) ((q9) this.L).R);
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z3 = true;
        int i6 = i;
        loop0: while (true) {
            i4 = i6;
            while (i6 < i2 && i5 < i3 && z3) {
                SparseArray sparseArray = zo1Var.c.a;
                if (sparseArray == null) {
                    yx3Var = null;
                } else {
                    yx3Var = (yx3) sparseArray.get(codePointAt);
                }
                if (zo1Var.a != 2) {
                    if (yx3Var == null) {
                        zo1Var.a();
                        z2 = true;
                    } else {
                        zo1Var.a = 2;
                        zo1Var.c = yx3Var;
                        zo1Var.f = 1;
                        z2 = true;
                    }
                } else {
                    if (yx3Var != null) {
                        zo1Var.c = yx3Var;
                        zo1Var.f++;
                    } else {
                        if (codePointAt == 65038) {
                            zo1Var.a();
                        } else if (codePointAt != 65039) {
                            yx3 yx3Var2 = zo1Var.c;
                            if (yx3Var2.b != null) {
                                if (zo1Var.f == 1) {
                                    if (zo1Var.b()) {
                                        zo1Var.d = zo1Var.c;
                                        zo1Var.a();
                                    } else {
                                        zo1Var.a();
                                    }
                                } else {
                                    zo1Var.d = yx3Var2;
                                    zo1Var.a();
                                }
                                z2 = true;
                            } else {
                                zo1Var.a();
                            }
                        }
                        z2 = true;
                    }
                    z2 = true;
                }
                zo1Var.e = codePointAt;
                if (!z2) {
                    if (!z2) {
                        if (z2) {
                            if (z || !H(charSequence, i4, i6, zo1Var.d.b)) {
                                z3 = xo1Var.m(charSequence, i4, i6, zo1Var.d.b);
                                i5++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i6;
                        if (charCount < i2) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i6 = charCount;
                    }
                } else {
                    i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                    if (i6 < i2) {
                        codePointAt = Character.codePointAt(charSequence, i6);
                    }
                }
            }
        }
        if (zo1Var.a == 2 && zo1Var.c.b != null && ((zo1Var.f > 1 || zo1Var.b()) && i5 < i3 && z3 && (z || !H(charSequence, i4, i6, zo1Var.c.b)))) {
            xo1Var.m(charSequence, i4, i6, zo1Var.c.b);
        }
        return xo1Var.a();
    }

    public void L(fy3 fy3Var) {
        Object obj;
        ArrayList arrayList = (ArrayList) this.L;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                obj = arrayList.get(i);
                i++;
                if (((fy3) obj).a() == fy3Var.a()) {
                    break;
                }
            } else {
                obj = null;
                break;
            }
        }
        if (obj == null) {
            arrayList.add(fy3Var);
            return;
        }
        throw new Exception(wh1.j("Migration from version ", fy3Var.a(), " already exists"));
    }

    public void M(ts1 ts1Var) {
        ts1Var.getClass();
        ArrayList arrayList = (ArrayList) this.R;
        arrayList.remove(ts1Var);
        if (arrayList.isEmpty()) {
            ((nq1) this.B).c();
        }
    }

    public void N(oh0 oh0Var) {
        ((rh0) this.R).A.c = oh0Var;
    }

    public void O(od1 od1Var) {
        ((rh0) this.R).A.a = od1Var;
    }

    public void P(sd3 sd3Var) {
        ((rh0) this.R).A.b = sd3Var;
    }

    public void Q(long j) {
        ((rh0) this.R).A.d = j;
    }

    public void R(hz0 hz0Var, int i, int i2, int i3) {
        hz0Var.getClass();
        int i4 = hz0Var.c0;
        int i5 = hz0Var.d0;
        hz0Var.c0 = 0;
        hz0Var.d0 = 0;
        hz0Var.P(i2);
        hz0Var.M(i3);
        if (i4 < 0) {
            hz0Var.c0 = 0;
        } else {
            hz0Var.c0 = i4;
        }
        if (i5 < 0) {
            hz0Var.d0 = 0;
        } else {
            hz0Var.d0 = i5;
        }
        hz0 hz0Var2 = (hz0) this.R;
        hz0Var2.w0 = i;
        hz0Var2.V();
    }

    public void S(hz0 hz0Var) {
        ArrayList arrayList = (ArrayList) this.B;
        arrayList.clear();
        int size = hz0Var.t0.size();
        for (int i = 0; i < size; i++) {
            gz0 gz0Var = (gz0) hz0Var.t0.get(i);
            fz0[] fz0VarArr = gz0Var.T;
            fz0 fz0Var = fz0VarArr[0];
            fz0 fz0Var2 = fz0.MATCH_CONSTRAINT;
            if (fz0Var == fz0Var2 || fz0VarArr[1] == fz0Var2) {
                arrayList.add(gz0Var);
            }
        }
        hz0Var.v0.b = true;
    }

    @Override // defpackage.o03
    public ClipDescription a() {
        return (ClipDescription) this.L;
    }

    @Override // defpackage.o03
    public Object b() {
        return null;
    }

    @Override // defpackage.o03
    public Uri c() {
        return (Uri) this.B;
    }

    @Override // defpackage.k64
    public boolean d() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.B;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, ak7] */
    @Override // defpackage.e52
    public boolean f(d16 d16Var) {
        rb0 rb0Var = new rb0();
        bs0 bs0Var = new bs0();
        ce0 ce0Var = (ce0) this.B;
        an1 an1Var = new an1(((ia0) ce0Var).A);
        af0 af0Var = (af0) this.R;
        gd0 gd0Var = new gd0(rb0Var, bs0Var, an1Var, af0Var, new Object(), new ib2(af0Var.a()), ce0Var, null, null);
        qp1 qp1Var = qp1.A;
        return ((Boolean) tq5.A(mp1.A, new ba1(this, gd0Var.a(0, d16Var, true, null, null, qp1Var, qp1Var), null, 14))).booleanValue();
    }

    @Override // defpackage.o03
    public Uri g() {
        return (Uri) this.R;
    }

    @Override // defpackage.j90
    public Object i(i90 i90Var) {
        es4 es4Var = new es4(13, this);
        qf1 l = iq2.l();
        pb5 pb5Var = i90Var.c;
        if (pb5Var != null) {
            pb5Var.a(es4Var, l);
        }
        ((mp2) this.R).A.set(i90Var);
        return "HandlerScheduledFuture-" + ((Callable) this.L).toString();
    }

    @Override // defpackage.cb6
    public sb6 j() {
        return (s45) this.L;
    }

    public void k(vf3 vf3Var, j53 j53Var) {
        t71 t71Var = (t71) this.B;
        t71 t71Var2 = (t71) this.L;
        t71 t71Var3 = (t71) this.R;
        int i = ae1.a[j53Var.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        if (vf3Var.d0 != null) {
                            t71Var3.d(vf3Var);
                            return;
                        } else {
                            t71Var2.d(vf3Var);
                            return;
                        }
                    }
                    i.c();
                    return;
                } else if (vf3Var.d0 != null) {
                    t71Var3.d(vf3Var);
                    return;
                } else {
                    t71Var.d(vf3Var);
                    return;
                }
            }
            t71Var2.d(vf3Var);
            t71Var3.d(vf3Var);
            return;
        }
        t71Var.d(vf3Var);
        t71Var3.d(vf3Var);
    }

    public void l(ts1 ts1Var) {
        ts1Var.getClass();
        ArrayList arrayList = (ArrayList) this.R;
        arrayList.add(ts1Var);
        if (arrayList.size() == 1) {
            ((nq1) this.L).c();
        }
    }

    public boolean m(vf3 vf3Var) {
        boolean z;
        boolean z2;
        if (vf3Var.d0 == null) {
            z = true;
        } else {
            z = false;
        }
        if (!((pb6) ((t71) this.B).B).contains(vf3Var) && !((pb6) ((t71) this.L).B).contains(vf3Var)) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || !z2) {
            return false;
        }
        return true;
    }

    @Override // defpackage.cb6
    public g76 n() {
        return (r45) this.R;
    }

    public void p(Bundle bundle) {
        HashSet hashSet = (HashSet) this.L;
        String string = ((Context) this.R).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                for (String str : bundle.keySet()) {
                    if (string.equals(bundle.getString(str, null))) {
                        Class<?> cls = Class.forName(str);
                        if (gz2.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it = hashSet.iterator();
                while (it.hasNext()) {
                    r((Class) it.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void q() {
        ((tj4) this.R).setValue(Boolean.TRUE);
        ((n24) this.L).c.setValue(Boolean.FALSE);
    }

    public Object r(Class cls, HashSet hashSet) {
        Object obj;
        HashMap hashMap = (HashMap) this.B;
        if (io2.R()) {
            try {
                Trace.beginSection(io2.p0(cls.getSimpleName()));
            } finally {
                Trace.endSection();
            }
        }
        if (!hashSet.contains(cls)) {
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                gz2 gz2Var = (gz2) cls.getDeclaredConstructor(null).newInstance(null);
                List<Class> a = gz2Var.a();
                if (!a.isEmpty()) {
                    for (Class cls2 : a) {
                        if (!hashMap.containsKey(cls2)) {
                            r(cls2, hashSet);
                        }
                    }
                }
                obj = gz2Var.b((Context) this.R);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    public oh0 s() {
        return ((rh0) this.R).A.c;
    }

    @Override // defpackage.k64
    public void shutdown() {
        ((ConnectivityManager) this.B).unregisterNetworkCallback((yy2) this.R);
    }

    public fr3 t() {
        LocaleList localeList = LocaleList.getDefault();
        synchronized (((jo1) this.R)) {
            try {
                fr3 fr3Var = (fr3) this.L;
                if (fr3Var != null && localeList == ((LocaleList) this.B)) {
                    return fr3Var;
                }
                int size = localeList.size();
                ArrayList arrayList = new ArrayList(size);
                for (int i = 0; i < size; i++) {
                    arrayList.add(new er3(localeList.get(i)));
                }
                fr3 fr3Var2 = new fr3(arrayList);
                this.B = localeList;
                this.L = fr3Var2;
                return fr3Var2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        switch (this.A) {
            case 24:
                String str = (String) this.R;
                String str2 = (String) this.L;
                StringBuilder sb = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.B;
                if (uri != null) {
                    sb.append(" uri=");
                    sb.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb.append(" action=");
                    sb.append(str2);
                }
                if (str != null) {
                    sb.append(" mimetype=");
                    sb.append(str);
                }
                sb.append(" }");
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public long u() {
        PackageInfo packageInfo;
        Context context = (Context) this.R;
        PackageManager packageManager = context.getPackageManager();
        packageManager.getClass();
        String packageName = context.getPackageName();
        packageName.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            packageInfo = q41.q(packageManager, packageName, q41.b(0L));
            packageInfo.getClass();
        } else {
            packageInfo = packageManager.getPackageInfo(packageName, 0);
            packageInfo.getClass();
        }
        if (i >= 28) {
            return dp.f(packageInfo);
        }
        return packageInfo.versionCode;
    }

    public od1 v() {
        return ((rh0) this.R).A.a;
    }

    public int w() {
        if (B().a.isEmpty()) {
            return -1;
        }
        long j = ((xv3) tq0.K0(B().a)).a - B().h;
        if (j < 0) {
            j = 0;
        }
        return (int) j;
    }

    public boolean x() {
        return !B().a.isEmpty();
    }

    public int z() {
        if (B().a.isEmpty()) {
            return -1;
        }
        long j = ((xv3) tq0.T0(B().a)).a + B().h;
        long F = F() - 1;
        if (j > F) {
            j = F;
        }
        return (int) j;
    }

    @Override // defpackage.o03
    public void e() {
    }

    public /* synthetic */ os(Object obj, Object obj2, Object obj3, int i) {
        this.A = i;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public os(nq1 nq1Var, nq1 nq1Var2) {
        this.A = 14;
        this.B = nq1Var;
        this.L = nq1Var2;
        this.R = new ArrayList();
    }

    public os(Context context, SharedPreferences sharedPreferences) {
        this.A = 22;
        this.R = context;
        this.B = sharedPreferences;
        this.L = new ArrayList();
    }

    public os(EmulatorActivity emulatorActivity, ym3 ym3Var, ow0 ow0Var) {
        this.A = 16;
        ow0Var.getClass();
        this.B = ow0Var;
        this.L = new os(ym3Var);
        tq5.w(ym3Var, null, null, new ba1(this, (Vibrator) emulatorActivity.getSystemService(Vibrator.class), null, 7), 3);
        tq5.w(ym3Var, null, null, new a6(this, null, 16), 3);
    }

    public os(n55 n55Var) {
        this.A = 25;
        this.B = new AtomicInteger(0);
        this.L = new r9(2);
        this.R = new jd2(13, this, n55Var);
    }

    public /* synthetic */ os(int i, boolean z) {
        this.A = i;
    }

    public os(q9 q9Var) {
        this.A = 6;
        this.B = q9Var;
        this.L = sn2.o((gb1) q9Var.R);
        this.R = sn2.n((fb1) q9Var.X);
    }

    public os(ConstraintLayout constraintLayout, FrameLayout frameLayout, Toolbar toolbar, View view) {
        this.A = 2;
        this.B = frameLayout;
        this.L = toolbar;
        this.R = view;
    }

    public os(View view) {
        this.A = 20;
        this.B = view;
        this.L = yf2.H(wk3.NONE, new dj(9, this));
        this.R = new dz4(view);
    }

    public os(gi4 gi4Var) {
        this.A = 26;
        this.B = gi4Var;
    }

    public os(rh0 rh0Var) {
        this.A = 8;
        this.R = rh0Var;
        this.B = new bq0(18, this);
    }

    public os(Runnable runnable) {
        this.A = 21;
        this.R = new CopyOnWriteArrayList();
        this.B = new HashMap();
        this.L = runnable;
    }

    public os(ConnectivityManager connectivityManager, nl6 nl6Var) {
        this.A = 29;
        this.B = connectivityManager;
        this.L = nl6Var;
        yy2 yy2Var = new yy2(3, this);
        this.R = yy2Var;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), yy2Var);
    }

    public os(Context context) {
        this.A = 0;
        this.R = context.getApplicationContext();
        this.L = new HashSet();
        this.B = new HashMap();
    }

    public os(hz0 hz0Var) {
        this.A = 5;
        this.B = new ArrayList();
        this.L = new Object();
        this.R = hz0Var;
    }

    public os(ym3 ym3Var) {
        this.A = 15;
        ee6 a = fe6.a(Boolean.FALSE);
        this.B = a;
        this.L = new q45(a);
        this.R = d46.b(0, 1, h60.DROP_OLDEST, 1);
        tq5.w(ym3Var, null, null, new a6(this, null, 17), 3);
    }

    public os(ki2 ki2Var) {
        this.A = 1;
        this.B = ki2Var;
        Boolean bool = Boolean.FALSE;
        this.L = new n24(bool);
        this.R = me2.G(bool);
    }

    public os(q9 q9Var, jo1 jo1Var, ea1 ea1Var, Set set) {
        this.A = 13;
        this.B = jo1Var;
        this.L = q9Var;
        this.R = ea1Var;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            K(str, 0, str.length(), 1, true, new an1(str, 7));
        }
    }

    public os(Class cls) {
        this.A = 28;
        this.B = new ConcurrentHashMap();
        this.R = cls;
    }

    public os(mp2 mp2Var, Handler handler, Callable callable) {
        this.A = 18;
        this.R = mp2Var;
        this.B = handler;
        this.L = callable;
    }

    public os(b81 b81Var, y71 y71Var) {
        this.A = 10;
        this.B = b81Var;
        this.L = y71Var;
    }
}

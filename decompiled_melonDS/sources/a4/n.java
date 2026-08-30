package a4;

import android.app.Activity;
import android.content.ClipDescription;
import android.content.Context;
import android.location.LocationManager;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.os.Vibrator;
import android.text.Editable;
import android.text.Selection;
import android.text.TextPaint;
import android.util.Rational;
import android.util.Size;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.Surface;
import android.view.View;
import android.view.ViewGroup;
import androidx.work.impl.foreground.SystemForegroundService;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import me.magnum.melonds.ui.emulator.EmulatorActivity;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class n implements c6.h, m0.c, gk.n, b5.j, l9.e {
    public static n X;
    public final /* synthetic */ int A;
    public Object B;
    public Object L;
    public Object R;

    public n(j0.b0 b0Var, Size size) {
        Rational rational;
        this.A = 26;
        this.B = b0Var;
        b0Var.b();
        b0Var.c();
        if (size != null) {
            rational = new Rational(size.getWidth(), size.getHeight());
        } else {
            List j2 = b0Var.j(256);
            if (j2.isEmpty()) {
                rational = null;
            } else {
                Size size2 = (Size) Collections.max(j2, new k0.c(false));
                rational = new Rational(size2.getWidth(), size2.getHeight());
            }
        }
        this.L = rational;
        this.R = new n0.j(b0Var, rational);
    }

    public static void L(List list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int size2 = list.size() - 1; size2 >= 0; size2--) {
            Size size3 = (Size) list.get(size2);
            if (size3.getWidth() >= size.getWidth() && size3.getHeight() >= size.getHeight()) {
                break;
            }
            arrayList.add(0, size3);
        }
        list.removeAll(arrayList);
        Collections.reverse(list);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    public static void M(List list, Size size, boolean z10) {
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            Size size2 = (Size) list.get(i2);
            if (size2.getWidth() <= size.getWidth() && size2.getHeight() <= size.getHeight()) {
                break;
            }
            arrayList.add(0, size2);
        }
        list.removeAll(arrayList);
        if (z10) {
            list.addAll(arrayList);
        }
    }

    public static final void i(n nVar, Network network, boolean z10) {
        boolean z11;
        Network[] allNetworks = ((ConnectivityManager) nVar.B).getAllNetworks();
        int length = allNetworks.length;
        boolean z12 = false;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            Network network2 = allNetworks[i2];
            if (nc.k.a(network2, network)) {
                z11 = z10;
            } else {
                NetworkCapabilities networkCapabilities = ((ConnectivityManager) nVar.B).getNetworkCapabilities(network2);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                    z11 = true;
                } else {
                    z11 = false;
                }
            }
            if (z11) {
                z12 = true;
                break;
            }
            i2++;
        }
        q9.l lVar = (q9.l) nVar.L;
        synchronized (lVar) {
            try {
                if (((b9.h) lVar.A.get()) != null) {
                    lVar.X = z12;
                } else {
                    lVar.b();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static boolean n(Editable editable, KeyEvent keyEvent, boolean z10) {
        m6.v[] vVarArr;
        if (KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (vVarArr = (m6.v[]) editable.getSpans(selectionStart, selectionEnd, m6.v.class)) != null && vVarArr.length > 0) {
                for (m6.v vVar : vVarArr) {
                    int spanStart = editable.getSpanStart(vVar);
                    int spanEnd = editable.getSpanEnd(vVar);
                    if ((z10 && spanStart == selectionStart) || ((!z10 && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                        editable.delete(spanStart, spanEnd);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static ArrayList s(ArrayList arrayList) {
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(k0.b.f7938a);
        arrayList2.add(k0.b.f7940c);
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Size size2 = (Size) obj;
            Rational rational = new Rational(size2.getWidth(), size2.getHeight());
            if (!arrayList2.contains(rational)) {
                int size3 = arrayList2.size();
                int i10 = 0;
                while (true) {
                    if (i10 < size3) {
                        Object obj2 = arrayList2.get(i10);
                        i10++;
                        if (k0.b.a((Rational) obj2, size2)) {
                            break;
                        }
                    } else {
                        arrayList2.add(rational);
                        break;
                    }
                }
            }
        }
        return arrayList2;
    }

    public static Rational v(int i2, boolean z10) {
        if (i2 == -1) {
            return null;
        }
        if (i2 != 0) {
            if (i2 != 1) {
                aj.g.s("SupportedOutputSizesCollector", "Undefined target aspect ratio: " + i2);
                return null;
            } else if (z10) {
                return k0.b.f7940c;
            } else {
                return k0.b.f7941d;
            }
        } else if (z10) {
            return k0.b.f7938a;
        } else {
            return k0.b.f7939b;
        }
    }

    public static HashMap w(ArrayList arrayList) {
        HashMap hashMap = new HashMap();
        ArrayList s10 = s(arrayList);
        int size = s10.size();
        int i2 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = s10.get(i10);
            i10++;
            hashMap.put((Rational) obj, new ArrayList());
        }
        int size2 = arrayList.size();
        while (i2 < size2) {
            Object obj2 = arrayList.get(i2);
            i2++;
            Size size3 = (Size) obj2;
            for (Rational rational : hashMap.keySet()) {
                if (k0.b.a(rational, size3)) {
                    ((List) hashMap.get(rational)).add(size3);
                }
            }
        }
        return hashMap;
    }

    public boolean A(int i2, e5.g gVar, i5.g gVar2) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        f5.b bVar = (f5.b) this.L;
        e5.f[] fVarArr = gVar.T;
        int[] iArr = gVar.f4324t;
        bVar.f4842a = fVarArr[0];
        bVar.f4843b = fVarArr[1];
        bVar.f4844c = gVar.r();
        bVar.f4845d = gVar.l();
        bVar.f4850i = false;
        bVar.f4851j = i2;
        e5.f fVar = bVar.f4842a;
        e5.f fVar2 = e5.f.MATCH_CONSTRAINT;
        if (fVar == fVar2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (bVar.f4843b == fVar2) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z10 && gVar.X > 0.0f) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z11 && gVar.X > 0.0f) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (z12 && iArr[0] == 4) {
            bVar.f4842a = e5.f.FIXED;
        }
        if (z13 && iArr[1] == 4) {
            bVar.f4843b = e5.f.FIXED;
        }
        gVar2.b(gVar, bVar);
        gVar.P(bVar.f4846e);
        gVar.M(bVar.f4847f);
        gVar.E = bVar.f4849h;
        gVar.J(bVar.f4848g);
        bVar.f4851j = 0;
        return bVar.f4850i;
    }

    public void B(Activity activity, j8.i iVar) {
        WeakHashMap weakHashMap = (WeakHashMap) this.R;
        activity.getClass();
        ReentrantLock reentrantLock = (ReentrantLock) this.L;
        reentrantLock.lock();
        try {
            if (iVar.equals((j8.i) weakHashMap.get(activity))) {
                return;
            }
            j8.i iVar2 = (j8.i) weakHashMap.put(activity, iVar);
            reentrantLock.unlock();
            Iterator it = ((m8.l) ((l.i0) this.B).B).f9362b.iterator();
            it.getClass();
            while (it.hasNext()) {
                m8.k kVar = (m8.k) it.next();
                if (kVar.f9355a.equals(activity)) {
                    kVar.f9358d = iVar;
                    kVar.f9356b.execute(new ad.c(18, kVar, iVar));
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public void C(androidx.lifecycle.p pVar) {
        androidx.lifecycle.x0 x0Var = (androidx.lifecycle.x0) this.R;
        if (x0Var != null) {
            x0Var.run();
        }
        androidx.lifecycle.x0 x0Var2 = new androidx.lifecycle.x0((androidx.lifecycle.z) this.B, pVar);
        this.R = x0Var2;
        ((Handler) this.L).postAtFrontOfQueue(x0Var2);
    }

    @Override // m0.c
    public void D(Object obj) {
        Surface surface = (Surface) obj;
        m0.i.e((ta.a) this.B, (b5.i) this.L);
    }

    public Object E(CharSequence charSequence, int i2, int i10, int i11, boolean z10, m6.m mVar) {
        int i12;
        m6.r rVar;
        boolean z11;
        m6.o oVar = new m6.o((m6.r) ((b9.e) this.L).R);
        int codePointAt = Character.codePointAt(charSequence, i2);
        int i13 = 0;
        boolean z12 = true;
        int i14 = i2;
        loop0: while (true) {
            i12 = i14;
            while (i14 < i10 && i13 < i11 && z12) {
                SparseArray sparseArray = oVar.f9289c.f9302a;
                if (sparseArray == null) {
                    rVar = null;
                } else {
                    rVar = (m6.r) sparseArray.get(codePointAt);
                }
                if (oVar.f9287a != 2) {
                    if (rVar == null) {
                        oVar.a();
                        z11 = true;
                    } else {
                        oVar.f9287a = 2;
                        oVar.f9289c = rVar;
                        oVar.f9292f = 1;
                        z11 = true;
                    }
                } else {
                    if (rVar != null) {
                        oVar.f9289c = rVar;
                        oVar.f9292f++;
                    } else {
                        if (codePointAt == 65038) {
                            oVar.a();
                        } else if (codePointAt != 65039) {
                            m6.r rVar2 = oVar.f9289c;
                            if (rVar2.f9303b != null) {
                                if (oVar.f9292f == 1) {
                                    if (oVar.b()) {
                                        oVar.f9290d = oVar.f9289c;
                                        oVar.a();
                                    } else {
                                        oVar.a();
                                    }
                                } else {
                                    oVar.f9290d = rVar2;
                                    oVar.a();
                                }
                                z11 = true;
                            } else {
                                oVar.a();
                            }
                        }
                        z11 = true;
                    }
                    z11 = true;
                }
                oVar.f9291e = codePointAt;
                if (!z11) {
                    if (!z11) {
                        if (z11) {
                            if (z10 || !x(charSequence, i12, i14, oVar.f9290d.f9303b)) {
                                z12 = mVar.f(charSequence, i12, i14, oVar.f9290d.f9303b);
                                i13++;
                            }
                        }
                    } else {
                        int charCount = Character.charCount(codePointAt) + i14;
                        if (charCount < i10) {
                            codePointAt = Character.codePointAt(charSequence, charCount);
                        }
                        i14 = charCount;
                    }
                } else {
                    i14 = Character.charCount(Character.codePointAt(charSequence, i12)) + i12;
                    if (i14 < i10) {
                        codePointAt = Character.codePointAt(charSequence, i14);
                    }
                }
            }
        }
        if (oVar.f9287a == 2 && oVar.f9289c.f9303b != null && ((oVar.f9292f > 1 || oVar.b()) && i13 < i11 && z12 && (z10 || !x(charSequence, i12, i14, oVar.f9289c.f9303b)))) {
            mVar.f(charSequence, i12, i14, oVar.f9289c.f9303b);
        }
        return mVar.a();
    }

    public void F(hh.d dVar) {
        dVar.getClass();
        ArrayList arrayList = (ArrayList) this.R;
        arrayList.remove(dVar);
        if (arrayList.isEmpty()) {
            ((ah.c) this.B).b();
        }
    }

    public void G(i3.q qVar) {
        ((k3.b) this.R).A.f7957c = qVar;
    }

    public void H(x4.c cVar) {
        ((k3.b) this.R).A.f7955a = cVar;
    }

    public void I(x4.m mVar) {
        ((k3.b) this.R).A.f7956b = mVar;
    }

    public void J(long j2) {
        ((k3.b) this.R).A.f7958d = j2;
    }

    public void K(e5.h hVar, int i2, int i10, int i11) {
        hVar.getClass();
        int i12 = hVar.f4293c0;
        int i13 = hVar.f4295d0;
        hVar.f4293c0 = 0;
        hVar.f4295d0 = 0;
        hVar.P(i10);
        hVar.M(i11);
        if (i12 < 0) {
            hVar.f4293c0 = 0;
        } else {
            hVar.f4293c0 = i12;
        }
        if (i13 < 0) {
            hVar.f4295d0 = 0;
        } else {
            hVar.f4295d0 = i13;
        }
        e5.h hVar2 = (e5.h) this.R;
        hVar2.f4334w0 = i2;
        hVar2.V();
    }

    public void N(e5.h hVar) {
        ArrayList arrayList = (ArrayList) this.B;
        arrayList.clear();
        int size = hVar.f4331t0.size();
        for (int i2 = 0; i2 < size; i2++) {
            e5.g gVar = (e5.g) hVar.f4331t0.get(i2);
            e5.f[] fVarArr = gVar.T;
            e5.f fVar = fVarArr[0];
            e5.f fVar2 = e5.f.MATCH_CONSTRAINT;
            if (fVar == fVar2 || fVarArr[1] == fVar2) {
                arrayList.add(gVar);
            }
        }
        hVar.f4333v0.f4855b = true;
    }

    @Override // c6.h
    public ClipDescription a() {
        return (ClipDescription) this.L;
    }

    @Override // c6.h
    public Object b() {
        return null;
    }

    @Override // l9.e
    public boolean c() {
        ConnectivityManager connectivityManager = (ConnectivityManager) this.B;
        for (Network network : connectivityManager.getAllNetworks()) {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
            if (networkCapabilities != null && networkCapabilities.hasCapability(12)) {
                return true;
            }
        }
        return false;
    }

    @Override // c6.h
    public Uri d() {
        return (Uri) this.B;
    }

    @Override // c6.h
    public Uri f() {
        return (Uri) this.R;
    }

    @Override // gk.n
    public Object g(Object obj) {
        String c4 = ((od.c) ((d2.t) this.R).B).c((jd.a) this.L, obj);
        int i2 = pi.b0.f11674a;
        return p7.o.f(c4, (pi.t) this.B);
    }

    @Override // b5.j
    public Object h(b5.i iVar) {
        iVar.a(new ad.g(8, this), ij.a.D());
        ((l0.c) this.R).A.set(iVar);
        return "HandlerScheduledFuture-" + ((Callable) this.L).toString();
    }

    public void j(o0 o0Var, x xVar) {
        a0.b bVar = (a0.b) this.B;
        a0.b bVar2 = (a0.b) this.L;
        a0.b bVar3 = (a0.b) this.R;
        int i2 = m.f262a[xVar.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 == 4) {
                        if (o0Var.f280d0 != null) {
                            bVar3.N(o0Var);
                            return;
                        } else {
                            bVar2.N(o0Var);
                            return;
                        }
                    }
                    m9.o.o();
                    return;
                } else if (o0Var.f280d0 != null) {
                    bVar3.N(o0Var);
                    return;
                } else {
                    bVar.N(o0Var);
                    return;
                }
            }
            bVar2.N(o0Var);
            bVar3.N(o0Var);
            return;
        }
        bVar.N(o0Var);
        bVar3.N(o0Var);
    }

    public void k(hh.d dVar) {
        dVar.getClass();
        ArrayList arrayList = (ArrayList) this.R;
        arrayList.add(dVar);
        if (arrayList.size() == 1) {
            ((ah.c) this.L).b();
        }
    }

    public void l(ob.a aVar) {
        HashSet hashSet = (HashSet) this.R;
        ArrayList arrayList = (ArrayList) this.L;
        if (!arrayList.contains(aVar)) {
            if (!hashSet.contains(aVar)) {
                hashSet.add(aVar);
                aVar.a(this);
                hashSet.remove(aVar);
                if (!arrayList.contains(aVar)) {
                    if (pb.c.class.isAssignableFrom(aVar.getClass())) {
                        arrayList.add(0, aVar);
                        return;
                    } else {
                        arrayList.add(aVar);
                        return;
                    }
                }
                return;
            }
            m9.o.h(hashSet, "Cyclic dependency chain found: ");
        }
    }

    public boolean m(o0 o0Var) {
        boolean z10;
        boolean z11;
        if (o0Var.f280d0 == null) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (!((m2) ((a0.b) this.B).B).contains(o0Var) && !((m2) ((a0.b) this.L).B).contains(o0Var)) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (z10 || !z11) {
            return false;
        }
        return true;
    }

    public void o() {
        ((n2.f1) this.R).setValue(Boolean.TRUE);
        ((d1.i0) this.L).f3596c.setValue(Boolean.FALSE);
    }

    public i3.q p() {
        return ((k3.b) this.R).A.f7957c;
    }

    public x4.c q() {
        return ((k3.b) this.R).A.f7955a;
    }

    public x4.m r() {
        return ((k3.b) this.R).A.f7956b;
    }

    @Override // l9.e
    public void shutdown() {
        ((ConnectivityManager) this.B).unregisterNetworkCallback((l9.f) this.R);
    }

    public long t() {
        return ((k3.b) this.R).A.f7958d;
    }

    public String toString() {
        switch (this.A) {
            case 2:
                String str = (String) this.R;
                String str2 = (String) this.L;
                StringBuilder sb2 = new StringBuilder("NavDeepLinkRequest{");
                Uri uri = (Uri) this.B;
                if (uri != null) {
                    sb2.append(" uri=");
                    sb2.append(String.valueOf(uri));
                }
                if (str2 != null) {
                    sb2.append(" action=");
                    sb2.append(str2);
                }
                if (str != null) {
                    sb2.append(" mimetype=");
                    sb2.append(str);
                }
                sb2.append(" }");
                return sb2.toString();
            case 7:
                List list = (List) this.L;
                StringBuilder sb3 = new StringBuilder("Request{");
                sb3.append((Uri) this.B);
                if (list != null && !list.isEmpty()) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        if (it.next() != null) {
                            m9.o.b();
                            return null;
                        }
                        sb3.append(' ');
                        throw null;
                    }
                }
                sb3.append('}');
                return sb3.toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x00d2, code lost:
        if (q0.a.a(r9) < (r7.getHeight() * r7.getWidth())) goto L105;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.ArrayList u(j0.l2 r18) {
        /*
            Method dump skipped, instructions count: 922
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: a4.n.u(j0.l2):java.util.ArrayList");
    }

    public boolean x(CharSequence charSequence, int i2, int i10, m6.u uVar) {
        int i11;
        if ((uVar.f9307c & 3) == 0) {
            m6.d dVar = (m6.d) this.R;
            n6.a b10 = uVar.b();
            int a10 = b10.a(8);
            if (a10 != 0) {
                ((ByteBuffer) b10.R).getShort(a10 + b10.A);
            }
            dVar.getClass();
            ThreadLocal threadLocal = m6.d.f9268b;
            if (threadLocal.get() == null) {
                threadLocal.set(new StringBuilder());
            }
            StringBuilder sb2 = (StringBuilder) threadLocal.get();
            sb2.setLength(0);
            while (i2 < i10) {
                sb2.append(charSequence.charAt(i2));
                i2++;
            }
            TextPaint textPaint = dVar.f9269a;
            String sb3 = sb2.toString();
            int i12 = q5.c.f12287a;
            boolean hasGlyph = textPaint.hasGlyph(sb3);
            int i13 = uVar.f9307c & 4;
            if (hasGlyph) {
                i11 = i13 | 2;
            } else {
                i11 = i13 | 1;
            }
            uVar.f9307c = i11;
        }
        if ((uVar.f9307c & 3) != 2) {
            return false;
        }
        return true;
    }

    public boolean y() {
        boolean z10;
        if (((m2) ((a0.b) this.B).B).isEmpty() && ((m2) ((a0.b) this.R).B).isEmpty() && ((m2) ((a0.b) this.L).B).isEmpty()) {
            z10 = true;
        } else {
            z10 = false;
        }
        return !z10;
    }

    @Override // m0.c
    public void z(Throwable th2) {
        boolean z10 = th2 instanceof CancellationException;
        b5.i iVar = (b5.i) this.L;
        if (z10) {
            p7.m.o(null, iVar.c(new RuntimeException(((String) this.R).concat(" cancelled."), th2)));
        } else {
            iVar.b(null);
        }
    }

    @Override // c6.h
    public void e() {
    }

    public /* synthetic */ n(ViewGroup viewGroup, ViewGroup viewGroup2, ViewGroup viewGroup3, View view, int i2) {
        this.A = i2;
        this.B = viewGroup2;
        this.L = viewGroup3;
        this.R = view;
    }

    public /* synthetic */ n(Object obj, Object obj2, Object obj3, int i2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
        this.R = obj3;
    }

    public n(ah.c cVar, ah.c cVar2) {
        this.A = 4;
        this.B = cVar;
        this.L = cVar2;
        this.R = new ArrayList();
    }

    public n(ArrayList arrayList) {
        this.A = 29;
        this.B = arrayList;
        this.L = new ArrayList(arrayList.size());
        this.R = new HashSet(3);
    }

    public n(EmulatorActivity emulatorActivity, androidx.lifecycle.s sVar, eh.c cVar) {
        this.A = 10;
        cVar.getClass();
        this.B = cVar;
        this.L = new n(sVar);
        zc.x.v(sVar, null, null, new di.b(this, (Vibrator) emulatorActivity.getSystemService(Vibrator.class), null, 2), 3);
        zc.x.v(sVar, null, null, new a9.b(9, null, this), 3);
    }

    public n(n2.q1 q1Var) {
        this.A = 27;
        this.B = new AtomicInteger(0);
        this.L = new a7.v(9);
        this.R = new a3.e(23, this, q1Var);
    }

    public n(SystemForegroundService systemForegroundService) {
        this.A = 3;
        this.B = new androidx.lifecycle.z(systemForegroundService, true);
        this.L = new Handler(Looper.getMainLooper());
    }

    public n(int i2) {
        this.A = 14;
        this.B = new long[i2];
        this.L = new BitSet(i2);
        this.R = new long[i2];
    }

    public n(k3.b bVar) {
        this.A = 15;
        this.R = bVar;
        this.B = new d2.t(25, this);
    }

    public n(Runnable runnable) {
        this.A = 1;
        this.L = new CopyOnWriteArrayList();
        this.R = new HashMap();
        this.B = runnable;
    }

    public n(Context context, LocationManager locationManager) {
        this.A = 16;
        this.R = new Object();
        this.B = context;
        this.L = locationManager;
    }

    public n(ConnectivityManager connectivityManager, q9.l lVar) {
        this.A = 18;
        this.B = connectivityManager;
        this.L = lVar;
        l9.f fVar = new l9.f(0, this);
        this.R = fVar;
        connectivityManager.registerNetworkCallback(new NetworkRequest.Builder().addCapability(12).build(), fVar);
    }

    public n(e5.h hVar) {
        this.A = 11;
        this.B = new ArrayList();
        this.L = new Object();
        this.R = hVar;
    }

    public /* synthetic */ n(int i2, byte b10) {
        this.A = i2;
    }

    public n(mc.a aVar) {
        this.A = 28;
        this.B = aVar;
        Boolean bool = Boolean.FALSE;
        this.L = new d1.i0(bool);
        this.R = n2.s.w(bool);
    }

    public n(androidx.lifecycle.s sVar) {
        this.A = 9;
        cd.q1 c4 = cd.q.c(Boolean.FALSE);
        this.B = c4;
        this.L = new cd.y0(c4);
        this.R = cd.q.b(0, 1, bd.a.DROP_OLDEST, 1);
        zc.x.v(sVar, null, null, new a9.b(10, null, this), 3);
    }

    public n(Uri uri, com.squareup.picasso.z zVar) {
        this.A = 7;
        this.B = uri;
        this.L = null;
        this.R = zVar;
    }

    public n() {
        this.A = 0;
        this.B = new a0.b(3);
        this.L = new a0.b(3);
        this.R = new a0.b(3);
    }

    public n(b9.e eVar, l7.a aVar, m6.d dVar, Set set) {
        this.A = 24;
        this.B = aVar;
        this.L = eVar;
        this.R = dVar;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            E(str, 0, str.length(), 1, true, new a0.c(str, 2));
        }
    }

    public n(l0.c cVar, Handler handler, Callable callable) {
        this.A = 17;
        this.R = cVar;
        this.B = handler;
        this.L = callable;
    }

    public n(l.i0 i0Var) {
        this.A = 25;
        this.B = i0Var;
        this.L = new ReentrantLock();
        this.R = new WeakHashMap();
    }
}

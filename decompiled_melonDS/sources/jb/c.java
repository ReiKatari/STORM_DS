package jb;

import a1.m0;
import a1.w0;
import a4.n;
import a6.f1;
import a6.n0;
import a6.x0;
import ai.p;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Looper;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.util.Pair;
import android.util.Range;
import android.util.Size;
import android.view.ActionMode;
import android.view.Choreographer;
import android.view.Menu;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.preference.Preference;
import b4.o;
import d0.a0;
import d0.v1;
import j0.b0;
import j0.c2;
import j0.f2;
import j0.g2;
import j0.k;
import j0.l2;
import j0.o2;
import j0.r0;
import j0.z1;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.ref.SoftReference;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import m6.m;
import m6.u;
import m6.v;
import m6.x;
import m9.j;
import n0.i;
import n2.h2;
import nd.q;
import nd.t0;
import nd.z0;
import o2.j0;
import p7.t;
import w.b1;
import w.c0;
import w.f0;
import zb.l;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class c implements t7.b, k9.g, m, n2.f, n4.d, j0 {
    public final /* synthetic */ int A;
    public Object B;
    public Object L;

    public c(int i2) {
        this.A = i2;
        switch (i2) {
            case l1.c.f8509e /* 6 */:
                this.B = new LinkedHashMap();
                this.L = new LinkedHashMap();
                return;
            case 8:
                this.B = Choreographer.getInstance();
                this.L = Looper.myLooper();
                return;
            case 18:
                this.B = new m0();
                this.L = new m0();
                return;
            case 29:
                this.B = (ImageCaptureFailedForSpecificCombinationQuirk) o0.a.f10495a.j(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.L = (PreviewGreenTintQuirk) o0.a.f10495a.j(PreviewGreenTintQuirk.class);
                return;
            default:
                this.B = new ArrayList();
                this.L = new LinkedHashMap();
                return;
        }
    }

    public static m9.e n(j jVar, Throwable th2) {
        Drawable drawable;
        if (th2 instanceof m9.m) {
            jVar.getClass();
            m9.c cVar = jVar.A;
            drawable = cVar.f9374l;
            m9.c cVar2 = q9.e.f12391a;
            if (drawable == null) {
                drawable = cVar.f9373k;
            }
        } else {
            drawable = jVar.A.f9373k;
            m9.c cVar3 = q9.e.f12391a;
        }
        return new m9.e(drawable, jVar, th2);
    }

    @Override // m6.m
    public Object a() {
        return (x) this.B;
    }

    @Override // o2.j0
    public List b(Integer num) {
        List b10 = ((j0) this.B).b(null);
        h2 h2Var = (h2) this.L;
        int i2 = h2Var.f9924v;
        if (i2 < 0) {
            return b10;
        }
        return l.e0(aj.g.j(h2Var, num, i2, Integer.valueOf(h2Var.E(h2Var.f9905b, i2))), b10);
    }

    @Override // n4.d
    public int c(int i2) {
        do {
            i2 = ((dk.a) this.L).j(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.B).charAt(i2)));
        return i2;
    }

    @Override // n2.f
    public void cancel() {
        if (!((v2.a) this.L).compareAndSet(1, 1)) {
            ((p) this.B).b();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00bc A[Catch: all -> 0x00bd, TRY_ENTER, TryCatch #6 {all -> 0x00bd, blocks: (B:60:0x00bc, B:63:0x00bf, B:64:0x00d7), top: B:70:0x00ba }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00bf A[Catch: all -> 0x00bd, TryCatch #6 {all -> 0x00bd, blocks: (B:60:0x00bc, B:63:0x00bf, B:64:0x00d7), top: B:70:0x00ba }] */
    @Override // t7.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public t7.a d(java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.c.d(java.lang.String):t7.a");
    }

    @Override // n4.d
    public int e(int i2) {
        do {
            i2 = ((dk.a) this.L).i(i2);
            if (i2 == -1) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.B).charAt(i2 - 1)));
        return i2;
    }

    @Override // m6.m
    public boolean f(CharSequence charSequence, int i2, int i10, u uVar) {
        Spannable spannableString;
        if ((uVar.f9307c & 4) > 0) {
            return true;
        }
        if (((x) this.B) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.B = new x(spannableString);
        }
        ((l7.a) this.L).getClass();
        ((x) this.B).setSpan(new v(uVar), i2, i10, 33);
        return true;
    }

    @Override // n4.d
    public int g(int i2) {
        CharSequence charSequence = (CharSequence) this.B;
        do {
            i2 = ((dk.a) this.L).i(i2);
            if (i2 == -1 || i2 == charSequence.length()) {
                return -1;
            }
        } while (Character.isWhitespace(charSequence.charAt(i2)));
        return i2;
    }

    @Override // n4.d
    public int h(int i2) {
        do {
            i2 = ((dk.a) this.L).j(i2);
            if (i2 == -1 || i2 == 0) {
                return -1;
            }
        } while (Character.isWhitespace(((CharSequence) this.B).charAt(i2 - 1)));
        return i2;
    }

    public boolean i() {
        synchronized (this) {
            if (((AtomicBoolean) this.L).get()) {
                return false;
            }
            ((AtomicInteger) this.B).incrementAndGet();
            return true;
        }
    }

    @Override // k9.g
    public void j(k9.a aVar, Bitmap bitmap, Map map) {
        int i2;
        int k10 = t.k(bitmap);
        k9.e eVar = (k9.e) this.L;
        synchronized (((x8.e) eVar.f99g)) {
            i2 = eVar.f94b;
        }
        k9.e eVar2 = (k9.e) this.L;
        if (k10 <= i2) {
            eVar2.l(aVar, new k9.d(bitmap, map, k10));
            return;
        }
        eVar2.m(aVar);
        ((bk.a) this.B).s(aVar, bitmap, map, k10);
    }

    @Override // t7.b
    public boolean k() {
        return ((t7.b) this.B).k();
    }

    @Override // k9.g
    public void l(int i2) {
        int i10;
        k9.e eVar = (k9.e) this.L;
        if (i2 >= 40) {
            eVar.p(-1);
        } else if (10 <= i2 && i2 < 20) {
            synchronized (((x8.e) eVar.f99g)) {
                i10 = eVar.f95c;
            }
            eVar.p(i10 / 2);
        }
    }

    public i m(int i2, b0 b0Var, ArrayList arrayList, ArrayList arrayList2, j0.v vVar, Range range, boolean z10) {
        int i10;
        Rect rect;
        Size size;
        boolean z11;
        boolean z12;
        Size size2;
        boolean z13;
        Size size3;
        b0Var.getClass();
        vVar.getClass();
        range.getClass();
        ArrayList arrayList3 = new ArrayList();
        String d4 = b0Var.d();
        d4.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int size4 = arrayList2.size();
        int i11 = 0;
        while (i11 < size4) {
            Object obj = arrayList2.get(i11);
            i11++;
            v1 v1Var = (v1) obj;
            k kVar = v1Var.f3475h;
            if (kVar != null) {
                c0 c0Var = (c0) this.L;
                if (c0Var != null) {
                    int y10 = v1Var.f3474g.y();
                    int i12 = size4;
                    k kVar2 = v1Var.f3475h;
                    if (kVar2 != null) {
                        size2 = kVar2.f7235a;
                    } else {
                        size2 = null;
                    }
                    if (size2 != null) {
                        z1 n10 = v1Var.f3474g.n();
                        b1 b1Var = (b1) c0Var.f13913b.get(d4);
                        if (b1Var != null) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        p7.m.g("No such camera id in supported combination list: ".concat(d4), z13);
                        j0.l l10 = b1Var.l(y10);
                        c2 c2Var = c2.CAPTURE_SESSION_TABLES;
                        z1 z1Var = f2.f7192e;
                        f2 P = pc.a.P(y10, size2, l10, i2, c2Var, n10);
                        int y11 = v1Var.f3474g.y();
                        k kVar3 = v1Var.f3475h;
                        if (kVar3 != null) {
                            size3 = kVar3.f7235a;
                        } else {
                            size3 = null;
                        }
                        size3.getClass();
                        a0 a0Var = kVar.f7237c;
                        ArrayList G = v0.d.G(v1Var);
                        r0 r0Var = kVar.f7240f;
                        String str = d4;
                        int intValue = ((Integer) v1Var.f3474g.h(l2.H, 0)).intValue();
                        Range range2 = (Range) v1Var.f3474g.h(l2.I, k.f7234h);
                        if (range2 != null) {
                            Boolean bool = (Boolean) v1Var.f3474g.h(l2.J, Boolean.FALSE);
                            Objects.requireNonNull(bool);
                            j0.e eVar = new j0.e(P, y11, size3, a0Var, G, r0Var, intValue, range2, bool.booleanValue());
                            arrayList3.add(eVar);
                            linkedHashMap2.put(eVar, v1Var);
                            linkedHashMap.put(v1Var, kVar);
                            d4 = str;
                            size4 = i12;
                        } else {
                            a0.j.h("Required value was null.");
                            return null;
                        }
                    } else {
                        a0.j.h("Attached surface resolution cannot be null for already attached use cases.");
                        return null;
                    }
                } else {
                    a0.j.p("Required value was null.");
                    return null;
                }
            } else {
                a0.j.h("Attached stream spec cannot be null for already attached use cases.");
                return null;
            }
        }
        Pair pair = new Pair(linkedHashMap, linkedHashMap2);
        Object obj2 = pair.second;
        obj2.getClass();
        Map map = (Map) obj2;
        HashMap x9 = n0.f.x(arrayList, (o2) vVar.h(j0.v.f7305i, o2.f7270a), (f0) this.B, range);
        String d10 = b0Var.d();
        d10.getClass();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        if (!arrayList.isEmpty()) {
            LinkedHashMap linkedHashMap4 = new LinkedHashMap();
            LinkedHashMap linkedHashMap5 = new LinkedHashMap();
            try {
                rect = b0Var.k();
            } catch (NullPointerException unused) {
                rect = null;
            }
            if (rect != null) {
                size = k0.h.f(rect);
            } else {
                size = null;
            }
            n nVar = new n(b0Var, size);
            int size5 = arrayList.size();
            int i13 = 0;
            boolean z14 = false;
            while (i13 < size5) {
                Object obj3 = arrayList.get(i13);
                i13++;
                v1 v1Var2 = (v1) obj3;
                Object obj4 = x9.get(v1Var2);
                if (obj4 != null) {
                    HashMap hashMap = x9;
                    n0.e eVar2 = (n0.e) obj4;
                    int i14 = size5;
                    l2 n11 = v1Var2.n(b0Var, eVar2.f9724a, eVar2.f9725b);
                    n11.getClass();
                    linkedHashMap4.put(n11, v1Var2);
                    linkedHashMap5.put(n11, nVar.u(n11));
                    if (n11.B() == 2) {
                        x9 = hashMap;
                        size5 = i14;
                        z14 = true;
                    } else {
                        x9 = hashMap;
                        size5 = i14;
                    }
                } else {
                    a0.j.h("Required value was null.");
                    return null;
                }
            }
            c0 c0Var2 = (c0) this.L;
            if (c0Var2 != null) {
                ArrayList arrayList4 = new ArrayList(map.keySet());
                int size6 = arrayList.size();
                int i15 = 0;
                while (true) {
                    if (i15 < size6) {
                        Object obj5 = arrayList.get(i15);
                        i15++;
                        if (n0.f.B((v1) obj5)) {
                            z11 = true;
                            break;
                        }
                    } else {
                        z11 = false;
                        break;
                    }
                }
                p7.m.g("No new use cases to be bound.", !linkedHashMap5.isEmpty());
                b1 b1Var2 = (b1) c0Var2.f13913b.get(d10);
                if (b1Var2 != null) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                p7.m.g("No such camera id in supported combination list: ".concat(d10), z12);
                g2 j2 = b1Var2.j(i2, arrayList4, linkedHashMap5, z14, z11, z10);
                HashMap hashMap2 = j2.f7206a;
                HashMap hashMap3 = j2.f7207b;
                i10 = j2.f7208c;
                for (Map.Entry entry : linkedHashMap4.entrySet()) {
                    Object value = entry.getValue();
                    Object obj6 = hashMap2.get(entry.getKey());
                    if (obj6 != null) {
                        linkedHashMap3.put(value, obj6);
                    } else {
                        a0.j.h("Required value was null.");
                        return null;
                    }
                }
                for (Map.Entry entry2 : hashMap3.entrySet()) {
                    if (map.containsKey(entry2.getKey())) {
                        Object obj7 = map.get(entry2.getKey());
                        if (obj7 != null) {
                            linkedHashMap3.put(obj7, entry2.getValue());
                        } else {
                            a0.j.h("Required value was null.");
                            return null;
                        }
                    }
                }
            } else {
                a0.j.p("Required value was null.");
                return null;
            }
        } else {
            i10 = Preference.DEFAULT_ORDER;
        }
        Object obj8 = pair.first;
        obj8.getClass();
        LinkedHashMap linkedHashMap6 = new LinkedHashMap((Map) obj8);
        linkedHashMap6.putAll(linkedHashMap3);
        return new i(i10, linkedHashMap6);
    }

    public jd.a o(nc.e eVar) {
        Object obj;
        Object putIfAbsent;
        switch (this.A) {
            case 21:
                Class cls = eVar.f10259a;
                cls.getClass();
                obj = ((q) this.L).get(cls);
                obj.getClass();
                t0 t0Var = (t0) obj;
                Object obj2 = t0Var.f10367a.get();
                if (obj2 == null) {
                    synchronized (t0Var) {
                        obj2 = t0Var.f10367a.get();
                        if (obj2 == null) {
                            obj2 = new nd.k((jd.a) ((mc.l) this.B).k(eVar));
                            t0Var.f10367a = new SoftReference(obj2);
                        }
                    }
                }
                return ((nd.k) obj2).f10326a;
            default:
                ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.L;
                Class cls2 = eVar.f10259a;
                cls2.getClass();
                Object obj3 = concurrentHashMap.get(cls2);
                if (obj3 == null && (putIfAbsent = concurrentHashMap.putIfAbsent(cls2, (obj3 = new nd.k((jd.a) ((mc.l) this.B).k(eVar))))) != null) {
                    obj3 = putIfAbsent;
                }
                return ((nd.k) obj3).f10326a;
        }
    }

    public Object p(nc.e eVar, ArrayList arrayList) {
        Object obj;
        Object kVar;
        Object kVar2;
        Object putIfAbsent;
        switch (this.A) {
            case 22:
                Class cls = eVar.f10259a;
                cls.getClass();
                obj = ((q) this.L).get(cls);
                obj.getClass();
                t0 t0Var = (t0) obj;
                Object obj2 = t0Var.f10367a.get();
                if (obj2 == null) {
                    synchronized (t0Var) {
                        obj2 = t0Var.f10367a.get();
                        if (obj2 == null) {
                            obj2 = new z0();
                            t0Var.f10367a = new SoftReference(obj2);
                        }
                    }
                }
                z0 z0Var = (z0) obj2;
                ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
                int size = arrayList.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj3 = arrayList.get(i2);
                    i2++;
                    arrayList2.add(new nd.m0((tc.d) obj3));
                }
                ConcurrentHashMap concurrentHashMap = z0Var.f10398a;
                Object obj4 = concurrentHashMap.get(arrayList2);
                if (obj4 == null) {
                    try {
                        kVar = (jd.a) ((mc.p) this.B).j(eVar, arrayList);
                    } catch (Throwable th2) {
                        kVar = new yb.k(th2);
                    }
                    yb.l lVar = new yb.l(kVar);
                    Object putIfAbsent2 = concurrentHashMap.putIfAbsent(arrayList2, lVar);
                    if (putIfAbsent2 == null) {
                        obj4 = lVar;
                    } else {
                        obj4 = putIfAbsent2;
                    }
                }
                return ((yb.l) obj4).A;
            default:
                ConcurrentHashMap concurrentHashMap2 = (ConcurrentHashMap) this.L;
                Class cls2 = eVar.f10259a;
                cls2.getClass();
                Object obj5 = concurrentHashMap2.get(cls2);
                if (obj5 == null && (putIfAbsent = concurrentHashMap2.putIfAbsent(cls2, (obj5 = new z0()))) != null) {
                    obj5 = putIfAbsent;
                }
                z0 z0Var2 = (z0) obj5;
                ArrayList arrayList3 = new ArrayList(zb.m.G(arrayList, 10));
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj6 = arrayList.get(i10);
                    i10++;
                    arrayList3.add(new nd.m0((tc.d) obj6));
                }
                ConcurrentHashMap concurrentHashMap3 = z0Var2.f10398a;
                Object obj7 = concurrentHashMap3.get(arrayList3);
                if (obj7 == null) {
                    try {
                        kVar2 = (jd.a) ((mc.p) this.B).j(eVar, arrayList);
                    } catch (Throwable th3) {
                        kVar2 = new yb.k(th3);
                    }
                    yb.l lVar2 = new yb.l(kVar2);
                    Object putIfAbsent3 = concurrentHashMap3.putIfAbsent(arrayList3, lVar2);
                    if (putIfAbsent3 == null) {
                        obj7 = lVar2;
                    } else {
                        obj7 = putIfAbsent3;
                    }
                }
                return ((yb.l) obj7).A;
        }
    }

    @Override // k9.g
    public k9.b q(k9.a aVar) {
        k9.d dVar = (k9.d) ((k9.e) this.L).h(aVar);
        if (dVar != null) {
            return new k9.b(dVar.f8098a, dVar.f8099b);
        }
        return null;
    }

    public void r() {
        String str = (String) this.B;
        if (((FileChannel) this.L) == null) {
            try {
                File file = new File(str);
                File parentFile = file.getParentFile();
                if (parentFile != null) {
                    parentFile.mkdirs();
                }
                FileChannel channel = new FileOutputStream(file).getChannel();
                this.L = channel;
                if (channel != null) {
                    channel.lock();
                }
            } catch (Throwable th2) {
                FileChannel fileChannel = (FileChannel) this.L;
                if (fileChannel != null) {
                    fileChannel.close();
                }
                this.L = null;
                throw new IllegalStateException(kc.a.g("Unable to lock file: '", str, "'."), th2);
            }
        }
    }

    public void s(o.a aVar) {
        b9.e eVar = (b9.e) this.B;
        ((ActionMode.Callback) eVar.L).onDestroyActionMode(eVar.w(aVar));
        l.x xVar = (l.x) this.L;
        if (xVar.f8478q0 != null) {
            xVar.f8468f0.getDecorView().removeCallbacks(xVar.f8479r0);
        }
        if (xVar.p0 != null) {
            f1 f1Var = xVar.f8480s0;
            if (f1Var != null) {
                f1Var.b();
            }
            f1 b10 = x0.b(xVar.p0);
            b10.a(0.0f);
            xVar.f8480s0 = b10;
            b10.d(new l.p(2, this));
        }
        xVar.f8477o0 = null;
        ViewGroup viewGroup = xVar.f8482u0;
        WeakHashMap weakHashMap = x0.f533a;
        n0.c(viewGroup);
        xVar.I();
    }

    public boolean t(o.a aVar, Menu menu) {
        ViewGroup viewGroup = ((l.x) this.L).f8482u0;
        WeakHashMap weakHashMap = x0.f533a;
        n0.c(viewGroup);
        b9.e eVar = (b9.e) this.B;
        ActionMode.Callback callback = (ActionMode.Callback) eVar.L;
        o.e w10 = eVar.w(aVar);
        w0 w0Var = (w0) eVar.X;
        Menu menu2 = (Menu) w0Var.get(menu);
        if (menu2 == null) {
            menu2 = new p.a0((Context) eVar.B, (p.l) menu);
            w0Var.put(menu, menu2);
        }
        return callback.onPrepareActionMode(w10, menu2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (((q9.i) r16.L).a(r18) != false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m9.n u(m9.j r17, n9.g r18) {
        /*
            r16 = this;
            r0 = r17
            r4 = r18
            java.util.List r1 = r0.f9409g
            android.graphics.Bitmap$Config r2 = r0.f9407e
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L1a
            android.graphics.Bitmap$Config[] r1 = q9.g.f12393a
            boolean r1 = zb.k.d(r1, r2)
            if (r1 == 0) goto L17
            goto L1a
        L17:
            r1 = r16
            goto L3c
        L1a:
            boolean r1 = p7.t.u(r2)
            if (r1 != 0) goto L23
            r1 = r16
            goto L3e
        L23:
            boolean r1 = p7.t.u(r2)
            if (r1 != 0) goto L2c
        L29:
            r1 = r16
            goto L31
        L2c:
            boolean r1 = r0.f9414l
            if (r1 != 0) goto L29
            goto L17
        L31:
            java.lang.Object r3 = r1.L
            q9.i r3 = (q9.i) r3
            boolean r3 = r3.a(r4)
            if (r3 == 0) goto L3c
            goto L3e
        L3c:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
        L3e:
            ij.a r3 = r4.f10114a
            n9.b r5 = n9.b.f10111e
            boolean r3 = r3.equals(r5)
            if (r3 != 0) goto L55
            ij.a r3 = r4.f10115b
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L51
            goto L55
        L51:
            n9.f r3 = r0.f9425x
        L53:
            r5 = r3
            goto L58
        L55:
            n9.f r3 = n9.f.FIT
            goto L53
        L58:
            boolean r3 = r0.m
            if (r3 == 0) goto L6b
            java.util.List r3 = r0.f9409g
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L6b
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ALPHA_8
            if (r2 == r3) goto L6b
            r3 = 1
        L69:
            r7 = r3
            goto L6d
        L6b:
            r3 = 0
            goto L69
        L6d:
            m9.n r3 = new m9.n
            android.content.Context r1 = r0.f9403a
            boolean r6 = q9.e.a(r0)
            boolean r8 = r0.f9415n
            pi.q r10 = r0.f9411i
            m9.r r11 = r0.f9412j
            m9.p r12 = r0.f9426y
            m9.b r13 = r0.f9416o
            m9.b r14 = r0.f9417p
            m9.b r15 = r0.f9418q
            r0 = r3
            r3 = 0
            r9 = 0
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.c.u(m9.j, n9.g):m9.n");
    }

    public void v() {
        synchronized (this) {
            ((AtomicInteger) this.B).decrementAndGet();
            if (((AtomicInteger) this.B).get() < 0) {
                throw new IllegalStateException("Unbalanced call to unblock() detected.");
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public m9.n w(m9.n r23) {
        /*
            r22 = this;
            r1 = r22
            r0 = r23
            android.graphics.Bitmap$Config r2 = r0.f9430b
            m9.b r3 = r0.f9442o
            boolean r4 = p7.t.u(r2)
            r5 = 1
            if (r4 == 0) goto L1f
            java.lang.Object r4 = r1.L
            q9.i r4 = (q9.i) r4
            boolean r4 = r4.c()
            if (r4 == 0) goto L1a
            goto L1f
        L1a:
            android.graphics.Bitmap$Config r2 = android.graphics.Bitmap.Config.ARGB_8888
            r4 = r5
        L1d:
            r8 = r2
            goto L21
        L1f:
            r4 = 0
            goto L1d
        L21:
            m9.b r2 = r0.f9442o
            boolean r2 = r2.getReadEnabled()
            if (r2 == 0) goto L3e
            java.lang.Object r2 = r1.B
            q9.l r2 = (q9.l) r2
            monitor-enter(r2)
            r2.a()     // Catch: java.lang.Throwable -> L3b
            boolean r6 = r2.X     // Catch: java.lang.Throwable -> L3b
            monitor-exit(r2)
            if (r6 != 0) goto L3e
            m9.b r3 = m9.b.DISABLED
        L38:
            r21 = r3
            goto L40
        L3b:
            r0 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3b
            throw r0
        L3e:
            r5 = r4
            goto L38
        L40:
            if (r5 == 0) goto L6c
            android.content.Context r7 = r0.f9429a
            android.graphics.ColorSpace r9 = r0.f9431c
            n9.g r10 = r0.f9432d
            n9.f r11 = r0.f9433e
            boolean r12 = r0.f9434f
            boolean r13 = r0.f9435g
            boolean r14 = r0.f9436h
            java.lang.String r15 = r0.f9437i
            pi.q r2 = r0.f9438j
            m9.r r3 = r0.f9439k
            m9.p r4 = r0.f9440l
            m9.b r5 = r0.m
            m9.b r0 = r0.f9441n
            m9.n r6 = new m9.n
            r20 = r0
            r16 = r2
            r17 = r3
            r18 = r4
            r19 = r5
            r6.<init>(r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            return r6
        L6c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: jb.c.w(m9.n):m9.n");
    }

    public /* synthetic */ c(ViewGroup viewGroup, TextView textView, TextView textView2, int i2) {
        this.A = i2;
        this.B = textView;
        this.L = textView2;
    }

    public c(b9.h hVar, q9.l lVar) {
        Object mVar;
        this.A = 16;
        this.B = lVar;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 26) {
            boolean z10 = q9.a.f12389a;
        } else if (!q9.a.f12389a) {
            if (i2 != 26 && i2 != 27) {
                mVar = new a0.m(true);
            } else {
                mVar = new Object();
            }
            this.L = mVar;
        }
        mVar = new a0.m(false);
        this.L = mVar;
    }

    public c(String str) {
        this.A = 10;
        this.B = str.concat(".lck");
    }

    public c(o oVar) {
        this.A = 9;
        this.B = new AtomicInteger(0);
        this.L = new AtomicBoolean(false);
    }

    public c(p pVar) {
        this.A = 19;
        this.B = pVar;
        this.L = new AtomicInteger(0);
    }

    public c(ConstraintLayout constraintLayout, Button button, Button button2, Button button3, Button button4, TextView textView, TextView textView2) {
        this.A = 11;
        this.B = textView;
        this.L = textView2;
    }

    public c(mc.l lVar, int i2) {
        this.A = i2;
        switch (i2) {
            case 23:
                this.B = lVar;
                this.L = new ConcurrentHashMap();
                return;
            default:
                this.B = lVar;
                this.L = new q();
                return;
        }
    }

    public c(int i2, bk.a aVar) {
        this.A = 4;
        this.B = aVar;
        this.L = new k9.e(i2, this);
    }

    public c(f5.e eVar, t7.b bVar) {
        this.A = 2;
        bVar.getClass();
        this.L = eVar;
        this.B = bVar;
    }

    public c(int i2, mc.p pVar) {
        this.A = i2;
        switch (i2) {
            case 24:
                this.B = pVar;
                this.L = new ConcurrentHashMap();
                return;
            default:
                this.B = pVar;
                this.L = new q();
                return;
        }
    }

    public c(f0 f0Var) {
        this.A = 17;
        this.B = f0Var;
        this.L = null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.text.Editable$Factory, o6.a] */
    public c(EditText editText) {
        this.A = 27;
        this.B = editText;
        o6.i iVar = new o6.i(editText);
        this.L = iVar;
        editText.addTextChangedListener(iVar);
        if (o6.a.f10849b == null) {
            synchronized (o6.a.f10848a) {
                try {
                    if (o6.a.f10849b == null) {
                        ?? factory = new Editable.Factory();
                        try {
                            o6.a.f10850c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, o6.a.class.getClassLoader());
                        } catch (Throwable unused) {
                        }
                        o6.a.f10849b = factory;
                    }
                } finally {
                }
            }
        }
        editText.setEditableFactory(o6.a.f10849b);
    }

    public c(l6.c cVar) {
        this.A = 7;
        this.L = cVar;
    }

    public /* synthetic */ c(int i2, Object obj, Object obj2) {
        this.A = i2;
        this.B = obj;
        this.L = obj2;
    }

    public c(l.x xVar, b9.e eVar) {
        this.A = 5;
        this.L = xVar;
        this.B = eVar;
    }
}

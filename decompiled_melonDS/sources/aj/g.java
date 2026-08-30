package aj;

import a1.m0;
import ai.r0;
import ai.v0;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Paint;
import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import android.os.Process;
import android.os.Trace;
import android.text.InputFilter;
import android.text.Spanned;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.view.ActionMode;
import android.view.Display;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.TextView;
import b3.p;
import cd.e1;
import cd.q;
import d.a0;
import d.b0;
import g2.n0;
import i3.p0;
import i3.z;
import j0.o1;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutionException;
import l1.r1;
import me.magnum.melonds.domain.model.Cheat;
import n2.d2;
import n2.r;
import n2.s;
import n2.t;
import n2.v;
import n2.y1;
import nc.u;
import nd.a1;
import nd.f0;
import nd.h1;
import nd.i1;
import nd.p1;
import nd.s0;
import o3.h0;
import q.z0;
import y3.c0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class g {

    /* renamed from: a  reason: collision with root package name */
    public static final /* synthetic */ int f863a = 0;

    /* renamed from: b  reason: collision with root package name */
    public static long f864b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static Method f865c = null;

    /* renamed from: d  reason: collision with root package name */
    public static Method f866d = null;

    /* renamed from: e  reason: collision with root package name */
    public static Method f867e = null;

    /* renamed from: f  reason: collision with root package name */
    public static Method f868f = null;

    /* renamed from: g  reason: collision with root package name */
    public static int f869g = 3;

    /* renamed from: h  reason: collision with root package name */
    public static final /* synthetic */ int f870h = 0;

    /* renamed from: i  reason: collision with root package name */
    public static o3.f f871i;

    /* renamed from: j  reason: collision with root package name */
    public static o3.f f872j;

    /* renamed from: k  reason: collision with root package name */
    public static o3.f f873k;

    public static ActionMode.Callback A0(ActionMode.Callback callback, TextView textView) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 26 && i2 <= 27 && !(callback instanceof f6.h) && callback != null) {
            return new f6.h(callback, textView);
        }
        return callback;
    }

    public static Display B(l.i iVar) {
        if (Build.VERSION.SDK_INT >= 30) {
            return a6.l.d(iVar);
        }
        return ((WindowManager) iVar.getSystemService("window")).getDefaultDisplay();
    }

    public static x5.d D(z0 z0Var) {
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            return new x5.d(a6.k.p(z0Var));
        }
        TextPaint textPaint = new TextPaint(z0Var.getPaint());
        TextDirectionHeuristic textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_LTR;
        int breakStrategy = z0Var.getBreakStrategy();
        int hyphenationFrequency = z0Var.getHyphenationFrequency();
        if (z0Var.getTransformationMethod() instanceof PasswordTransformationMethod) {
            textDirectionHeuristic = TextDirectionHeuristics.LTR;
        } else {
            boolean z10 = true;
            if (i2 >= 28 && (z0Var.getInputType() & 15) == 3) {
                byte directionality = Character.getDirectionality(a6.k.e(DecimalFormatSymbols.getInstance(z0Var.getTextLocale()))[0].codePointAt(0));
                textDirectionHeuristic = (directionality == 1 || directionality == 2) ? TextDirectionHeuristics.RTL : TextDirectionHeuristics.LTR;
            } else {
                if (z0Var.getLayoutDirection() != 1) {
                    z10 = false;
                }
                switch (z0Var.getTextDirection()) {
                    case 2:
                        textDirectionHeuristic = TextDirectionHeuristics.ANYRTL_LTR;
                        break;
                    case 3:
                        textDirectionHeuristic = TextDirectionHeuristics.LTR;
                        break;
                    case 4:
                        textDirectionHeuristic = TextDirectionHeuristics.RTL;
                        break;
                    case l1.c.f8511g /* 5 */:
                        textDirectionHeuristic = TextDirectionHeuristics.LOCALE;
                        break;
                    case l1.c.f8509e /* 6 */:
                        break;
                    case 7:
                        textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                        break;
                    default:
                        if (z10) {
                            textDirectionHeuristic = TextDirectionHeuristics.FIRSTSTRONG_RTL;
                            break;
                        }
                        break;
                }
            }
        }
        return new x5.d(textPaint, textDirectionHeuristic, breakStrategy, hyphenationFrequency);
    }

    public static void F(String str, Exception exc) {
        if (exc instanceof InvocationTargetException) {
            Throwable cause = exc.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            throw new RuntimeException(cause);
        }
        Log.v("Trace", "Unable to call " + str + " via reflection", exc);
    }

    public static final boolean G(Spanned spanned, Class cls) {
        if (spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length()) {
            return true;
        }
        return false;
    }

    public static void I(String str, String str2) {
        String u02 = u0(str);
        if (O(4, u02)) {
            Log.i(u02, str2);
        }
    }

    public static boolean L(String str) {
        return O(3, u0(str));
    }

    public static boolean N() {
        if (Build.VERSION.SDK_INT >= 29) {
            return b8.a.c();
        }
        try {
            if (f865c == null) {
                f864b = Trace.class.getField("TRACE_TAG_APP").getLong(null);
                f865c = Trace.class.getMethod("isTagEnabled", Long.TYPE);
            }
            return ((Boolean) f865c.invoke(null, Long.valueOf(f864b))).booleanValue();
        } catch (Exception e6) {
            F("isTagEnabled", e6);
            return false;
        }
    }

    public static boolean O(int i2, String str) {
        if (f869g > i2 && !Log.isLoggable(str, i2)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:81:0x0164, code lost:
        if (r3 == r9) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00bc A[Catch: all -> 0x0055, TryCatch #1 {all -> 0x0055, blocks: (B:21:0x0051, B:44:0x00b4, B:46:0x00bc, B:48:0x00c8, B:50:0x00d4, B:41:0x009a), top: B:98:0x002d }] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r0v6, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v5, types: [nc.p, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object P(v3.f0 r17, d0.c r18, c8.c0 r19, v3.k r20, ec.a r21) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.g.P(v3.f0, d0.c, c8.c0, v3.k, ec.a):java.lang.Object");
    }

    public static final jd.a V(nc.e eVar, ArrayList arrayList, mc.a aVar) {
        jd.a dVar;
        jd.a i1Var;
        eVar.getClass();
        Class cls = eVar.f10259a;
        if (!eVar.equals(u.a(Collection.class)) && !eVar.equals(u.a(List.class)) && !eVar.equals(u.a(List.class)) && !eVar.equals(u.a(ArrayList.class))) {
            if (eVar.equals(u.a(HashSet.class))) {
                dVar = new nd.d((jd.a) arrayList.get(0), 1);
            } else if (!eVar.equals(u.a(Set.class)) && !eVar.equals(u.a(Set.class)) && !eVar.equals(u.a(LinkedHashSet.class))) {
                if (eVar.equals(u.a(HashMap.class))) {
                    dVar = new f0((jd.a) arrayList.get(0), (jd.a) arrayList.get(1), 0);
                } else if (!eVar.equals(u.a(Map.class)) && !eVar.equals(u.a(Map.class)) && !eVar.equals(u.a(LinkedHashMap.class))) {
                    if (eVar.equals(u.a(Map.Entry.class))) {
                        jd.a aVar2 = (jd.a) arrayList.get(0);
                        jd.a aVar3 = (jd.a) arrayList.get(1);
                        aVar2.getClass();
                        aVar3.getClass();
                        i1Var = new s0(aVar2, aVar3, 0);
                    } else if (eVar.equals(u.a(yb.j.class))) {
                        jd.a aVar4 = (jd.a) arrayList.get(0);
                        jd.a aVar5 = (jd.a) arrayList.get(1);
                        aVar4.getClass();
                        aVar5.getClass();
                        i1Var = new s0(aVar4, aVar5, 1);
                    } else if (eVar.equals(u.a(yb.o.class))) {
                        jd.a aVar6 = (jd.a) arrayList.get(0);
                        jd.a aVar7 = (jd.a) arrayList.get(1);
                        jd.a aVar8 = (jd.a) arrayList.get(2);
                        aVar6.getClass();
                        aVar7.getClass();
                        aVar8.getClass();
                        dVar = new p1(aVar6, aVar7, aVar8);
                    } else {
                        cls.getClass();
                        if (cls.isArray()) {
                            Object b10 = aVar.b();
                            b10.getClass();
                            jd.a aVar9 = (jd.a) arrayList.get(0);
                            aVar9.getClass();
                            i1Var = new i1((nc.e) b10, aVar9);
                        } else {
                            dVar = null;
                        }
                    }
                    dVar = i1Var;
                } else {
                    dVar = new f0((jd.a) arrayList.get(0), (jd.a) arrayList.get(1), 1);
                }
            } else {
                dVar = new nd.d((jd.a) arrayList.get(0), 2);
            }
        } else {
            dVar = new nd.d((jd.a) arrayList.get(0), 0);
        }
        if (dVar == null) {
            jd.a[] aVarArr = (jd.a[]) arrayList.toArray(new jd.a[0]);
            jd.a[] aVarArr2 = (jd.a[]) Arrays.copyOf(aVarArr, aVarArr.length);
            cls.getClass();
            return a1.d(cls, (jd.a[]) Arrays.copyOf(aVarArr2, aVarArr2.length));
        }
        return dVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02ac  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x02db  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0366 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x036e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0388  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x03ba A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:196:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:242:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void W(android.view.ViewStructure r38, a4.o0 r39, android.view.autofill.AutofillId r40, java.lang.String r41, j4.b r42) {
        /*
            Method dump skipped, instructions count: 995
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.g.W(android.view.ViewStructure, a4.o0, android.view.autofill.AutofillId, java.lang.String, j4.b):void");
    }

    public static final jd.a X(k0.g gVar, Type type) {
        gVar.getClass();
        type.getClass();
        jd.a e02 = d0.d.e0(gVar, type, true);
        if (e02 != null) {
            return e02;
        }
        Class c02 = d0.d.c0(type);
        c02.getClass();
        throw new IllegalArgumentException(a1.i(u.a(c02)));
    }

    public static final jd.a Y(nc.e eVar) {
        eVar.getClass();
        jd.a a02 = a0(eVar);
        if (a02 != null) {
            return a02;
        }
        throw new IllegalArgumentException(a1.i(eVar));
    }

    public static final jd.a Z(k0.g gVar, tc.d dVar) {
        gVar.getClass();
        dVar.getClass();
        return ij.a.u0(gVar, dVar, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v7, types: [java.lang.Object, b4.b, e.g] */
    public static final void a(boolean z10, mc.a aVar, n2.m mVar, int i2, int i10) {
        boolean z11;
        int i11;
        int i12;
        int i13;
        boolean z12;
        boolean z13;
        f7.c cVar;
        b9.e eVar;
        b0 b0Var;
        boolean z14;
        boolean z15;
        r rVar = (r) mVar;
        rVar.Z(-361453782);
        int i14 = i10 & 1;
        if (i14 != 0) {
            i12 = i2 | 6;
            z11 = z10;
        } else {
            z11 = z10;
            if (rVar.g(z11)) {
                i11 = 4;
            } else {
                i11 = 2;
            }
            i12 = i11 | i2;
        }
        if (rVar.h(aVar)) {
            i13 = 32;
        } else {
            i13 = 16;
        }
        int i15 = i12 | i13;
        if ((i15 & 19) != 18) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (rVar.O(i15 & 1, z12)) {
            if (i14 != 0) {
                z13 = true;
            } else {
                z13 = z11;
            }
            Object a10 = g7.a.a(rVar);
            if (a10 == null) {
                rVar.X(535274673);
                a10 = e.j.a(rVar);
                rVar.p(false);
            } else {
                rVar.X(535271790);
                rVar.p(false);
            }
            if (a10 != null) {
                boolean f8 = rVar.f(a10);
                Object L = rVar.L();
                Object obj = n2.l.f9953a;
                if (f8 || L == obj) {
                    a0 a0Var = null;
                    if (a10 instanceof f7.c) {
                        cVar = (f7.c) a10;
                    } else {
                        cVar = null;
                    }
                    if (cVar != null) {
                        eVar = cVar.b();
                    } else {
                        eVar = null;
                    }
                    if (a10 instanceof b0) {
                        b0Var = (b0) a10;
                    } else {
                        b0Var = null;
                    }
                    if (b0Var != null) {
                        a0Var = b0Var.a();
                    }
                    L = new f.b(eVar, a0Var);
                    rVar.h0(L);
                }
                f.b bVar = (f.b) L;
                long j2 = rVar.T;
                boolean f10 = rVar.f(bVar) | rVar.e(j2);
                Object L2 = rVar.L();
                e.g gVar = L2;
                if (f10 || L2 == obj) {
                    ?? bVar2 = new b4.b(new e.b(j2, a10));
                    bVar2.f4137c = new a3.g(14);
                    rVar.h0(bVar2);
                    gVar = bVar2;
                }
                e.g gVar2 = gVar;
                rVar.X(-585307852);
                boolean h2 = rVar.h(gVar2);
                if ((i15 & 112) == 32) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                boolean z16 = h2 | z14;
                Object L3 = rVar.L();
                if (z16 || L3 == obj) {
                    L3 = new a3.e(6, gVar2, aVar);
                    rVar.h0(L3);
                }
                s.h((mc.a) L3, rVar);
                Boolean valueOf = Boolean.valueOf(z13);
                boolean h10 = rVar.h(gVar2);
                int i16 = i15 & 14;
                if (i16 == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                boolean z17 = h10 | z15;
                Object L4 = rVar.L();
                if (z17 || L4 == obj) {
                    L4 = new e.c(gVar2, z13, 0);
                    rVar.h0(L4);
                }
                p7.k.b(valueOf, gVar2, null, (mc.l) L4, rVar, i16);
                boolean h11 = rVar.h(bVar) | rVar.h(gVar2);
                Object L5 = rVar.L();
                if (h11 || L5 == obj) {
                    L5 = new a7.l(13, bVar, gVar2);
                    rVar.h0(L5);
                }
                s.c(bVar, gVar2, (mc.l) L5, rVar);
                rVar.p(false);
                z11 = z13;
            } else {
                a0.j.p("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new e.d(z11, aVar, i2, i10);
        }
    }

    public static final jd.a a0(nc.e eVar) {
        eVar.getClass();
        Class cls = eVar.f10259a;
        cls.getClass();
        jd.a d4 = a1.d(cls, (jd.a[]) Arrays.copyOf(new jd.a[0], 0));
        if (d4 == null) {
            return (jd.a) h1.f10313a.get(eVar);
        }
        return d4;
    }

    public static final e1 b() {
        return q.b(0, 1, bd.a.DROP_OLDEST, 1);
    }

    public static final ArrayList b0(k0.g gVar, List list, boolean z10) {
        gVar.getClass();
        list.getClass();
        if (z10) {
            ArrayList arrayList = new ArrayList(zb.m.G(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                tc.d dVar = (tc.d) it.next();
                dVar.getClass();
                jd.a u02 = ij.a.u0(gVar, dVar, true);
                if (u02 != null) {
                    arrayList.add(u02);
                } else {
                    throw new IllegalArgumentException(a1.i(a1.h(dVar)));
                }
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(zb.m.G(list, 10));
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            jd.a Z = Z(gVar, (tc.d) it2.next());
            if (Z == null) {
                return null;
            }
            arrayList2.add(Z);
        }
        return arrayList2;
    }

    public static final void c(mh.a aVar, n2.m mVar, int i2) {
        int i10;
        boolean z10;
        r rVar = (r) mVar;
        rVar.Z(829713300);
        if (rVar.h(aVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i11 = i10 | i2;
        if ((i11 & 3) != 2) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i11 & 1, z10)) {
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = d1.d.a(1.0f);
                rVar.h0(L);
            }
            d1.c cVar = (d1.c) L;
            p t5 = l1.c.t(b3.m.f1770a, 8);
            boolean h2 = rVar.h(cVar);
            Object L2 = rVar.L();
            if (h2 || L2 == eVar) {
                L2 = new nh.b(cVar, 1);
                rVar.h0(L2);
            }
            l0.f.a(z.m(t5, (mc.l) L2), aVar.f9665a.f11021j, aVar.f9666b, v2.h.c(582100665, new v0(8, cVar, aVar), rVar), rVar, 3072);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.s0(i2, 20, aVar);
        }
    }

    public static final void d(p pVar, hh.a1 a1Var, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        pVar.getClass();
        a1Var.getClass();
        r rVar = (r) mVar;
        rVar.Z(765706284);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(a1Var)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i13 = i12 | i11;
        if ((i13 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i13 & 1, z10)) {
            float f8 = 8;
            n0.b(r1.m(f3.g.h(l1.c.t(pVar, 16), f8, t1.e.b(f8), 0L, 28), 0.0f, 400, 1), t1.e.b(f8), 0L, v2.h.c(720018857, new ai.s0(24, a1Var), rVar), rVar, 1572864, 60);
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new r0(pVar, a1Var, i2, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004b  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x003d -> B:18:0x0040). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object e(v3.f0 r7, ec.a r8) {
        /*
            boolean r0 = r8 instanceof f2.a0
            if (r0 == 0) goto L13
            r0 = r8
            f2.a0 r0 = (f2.a0) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            f2.a0 r0 = new f2.a0
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L30
            if (r2 != r3) goto L29
            v3.f0 r7 = r0.R
            p7.j.I(r8)
            goto L40
        L29:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r7)
            r7 = 0
            return r7
        L30:
            p7.j.I(r8)
        L33:
            v3.l r8 = v3.l.Main
            r0.R = r7
            r0.Y = r3
            java.lang.Object r8 = r7.a(r8, r0)
            if (r8 != r1) goto L40
            return r1
        L40:
            v3.k r8 = (v3.k) r8
            java.lang.Object r2 = r8.f13678a
            int r4 = r2.size()
            r5 = 0
        L49:
            if (r5 >= r4) goto L5b
            java.lang.Object r6 = r2.get(r5)
            v3.t r6 = (v3.t) r6
            boolean r6 = v3.s.a(r6)
            if (r6 != 0) goto L58
            goto L33
        L58:
            int r5 = r5 + 1
            goto L49
        L5b:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.g.e(v3.f0, ec.a):java.lang.Object");
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x00c3, code lost:
        if (r15 == r1) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0096 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:49:0x00c6, B:51:0x00ce, B:53:0x00db, B:55:0x00e7, B:56:0x00ea, B:57:0x00ed, B:59:0x00f1, B:32:0x0092, B:34:0x0096, B:35:0x0098, B:37:0x009c, B:39:0x00a0, B:41:0x00a4, B:43:0x00a8, B:45:0x00ac, B:46:0x00b1, B:25:0x0052, B:27:0x0060, B:29:0x0065, B:28:0x0063), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x009c A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:49:0x00c6, B:51:0x00ce, B:53:0x00db, B:55:0x00e7, B:56:0x00ea, B:57:0x00ed, B:59:0x00f1, B:32:0x0092, B:34:0x0096, B:35:0x0098, B:37:0x009c, B:39:0x00a0, B:41:0x00a4, B:43:0x00a8, B:45:0x00ac, B:46:0x00b1, B:25:0x0052, B:27:0x0060, B:29:0x0065, B:28:0x0063), top: B:63:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a0 A[Catch: CancellationException -> 0x0032, TryCatch #0 {CancellationException -> 0x0032, blocks: (B:13:0x002d, B:49:0x00c6, B:51:0x00ce, B:53:0x00db, B:55:0x00e7, B:56:0x00ea, B:57:0x00ed, B:59:0x00f1, B:32:0x0092, B:34:0x0096, B:35:0x0098, B:37:0x009c, B:39:0x00a0, B:41:0x00a4, B:43:0x00a8, B:45:0x00ac, B:46:0x00b1, B:25:0x0052, B:27:0x0060, B:29:0x0065, B:28:0x0063), top: B:63:0x0023 }] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v6, types: [nc.s, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object f(v3.f0 r11, u1.v0 r12, v3.k r13, int r14, ec.a r15) {
        /*
            Method dump skipped, instructions count: 249
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.g.f(v3.f0, u1.v0, v3.k, int, ec.a):java.lang.Object");
    }

    public static void f0(int i2, String str) {
        if (Build.VERSION.SDK_INT >= 29) {
            b8.a.d(i2, v0(str));
            return;
        }
        String v02 = v0(str);
        try {
            if (f868f == null) {
                f868f = Trace.class.getMethod("traceCounter", Long.TYPE, String.class, Integer.TYPE);
            }
            f868f.invoke(null, Long.valueOf(f864b), v02, Integer.valueOf(i2));
        } catch (Exception e6) {
            F("traceCounter", e6);
        }
    }

    public static final Object g(ta.a aVar, ec.c cVar) {
        try {
            if (aVar.isDone()) {
                return b5.h.f(aVar);
            }
            zc.h hVar = new zc.h(1, pc.a.A(cVar));
            aVar.a(new b5.o(aVar, hVar, 0), b5.m.INSTANCE);
            hVar.x(new a4.a(10, aVar));
            Object u4 = hVar.u();
            dc.a aVar2 = dc.a.COROUTINE_SUSPENDED;
            return u4;
        } catch (ExecutionException e6) {
            Throwable cause = e6.getCause();
            if (cause != null) {
                throw cause;
            }
            NullPointerException nullPointerException = new NullPointerException();
            nc.k.e(nullPointerException, nc.k.class.getName());
            throw nullPointerException;
        }
    }

    public static final ld.f h(String str, d0.d dVar, ld.e[] eVarArr, mc.l lVar) {
        if (!vc.h.j0(str)) {
            if (!dVar.equals(ld.j.f9044o)) {
                ld.a aVar = new ld.a(str);
                lVar.k(aVar);
                return new ld.f(str, dVar, aVar.f9011c.size(), zb.k.Q(eVarArr), aVar);
            }
            a0.j.h("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        a0.j.h("Blank serial names are prohibited");
        return null;
    }

    public static ld.f i(String str, d0.d dVar, ld.e[] eVarArr) {
        if (!vc.h.j0(str)) {
            if (!dVar.equals(ld.j.f9044o)) {
                ld.a aVar = new ld.a(str);
                return new ld.f(str, dVar, aVar.f9011c.size(), zb.k.Q(eVarArr), aVar);
            }
            a0.j.h("For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead");
            return null;
        }
        a0.j.h("Blank serial names are prohibited");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0063  */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Integer] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x0092 -> B:27:0x0061). Please submit an issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.util.List j(n2.h2 r5, java.lang.Integer r6, int r7, java.lang.Integer r8) {
        /*
            boolean r0 = r5.f9925w
            if (r0 != 0) goto L9d
            int r0 = r5.p()
            if (r0 == 0) goto L9d
            a3.m r0 = new a3.m
            r0.<init>(r5)
            if (r8 == 0) goto L16
            int r8 = r8.intValue()
            goto L20
        L16:
            int r8 = r5.f9924v
            if (r8 >= 0) goto L20
            int[] r8 = r5.f9905b
            int r8 = r5.E(r8, r7)
        L20:
            if (r6 != 0) goto L44
            int r6 = r5.f9912i
            int[] r1 = r5.f9905b
            int r2 = r5.r(r7)
            int r1 = r5.N(r1, r2)
            int r6 = r6 - r1
            a1.x r1 = r5.f9921s
            if (r1 == 0) goto L3e
            java.lang.Object r1 = r1.b(r7)
            a1.h0 r1 = (a1.h0) r1
            if (r1 == 0) goto L3e
            int r1 = r1.f45b
            goto L3f
        L3e:
            r1 = 0
        L3f:
            int r6 = r6 + r1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
        L44:
            int r1 = r5.r(r7)
            int r1 = r1 * 5
            int[] r2 = r5.f9905b
            int r3 = r2.length
            if (r1 >= r3) goto L54
            int r1 = r5.s(r7)
            goto L61
        L54:
            if (r8 < 0) goto L5b
            int r7 = r5.E(r2, r8)
            goto L5c
        L5b:
            r7 = r8
        L5c:
            int r1 = r5.s(r8)
            goto L92
        L61:
            if (r7 < 0) goto L98
            int r2 = r5.r(r7)
            int[] r3 = r5.f9905b
            int r2 = r2 * 5
            int r2 = r2 + 1
            r2 = r3[r2]
            r3 = 536870912(0x20000000, float:1.0842022E-19)
            r2 = r2 & r3
            if (r2 == 0) goto L79
            java.lang.Object r2 = r5.t(r7)
            goto L7b
        L79:
            n2.e r2 = n2.l.f9953a
        L7b:
            n2.m0 r3 = r5.O(r7)
            r0.f(r1, r2, r3, r6)
            n2.a r6 = r5.b(r7)
            if (r8 < 0) goto L96
            int[] r7 = r5.f9905b
            int r7 = r5.E(r7, r8)
            int r1 = r5.s(r8)
        L92:
            r4 = r8
            r8 = r7
            r7 = r4
            goto L61
        L96:
            r7 = r8
            goto L61
        L98:
            java.lang.Object r5 = r0.f147a
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            return r5
        L9d:
            zb.q r5 = zb.q.A
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.g.j(n2.h2, java.lang.Integer, int, java.lang.Integer):java.util.List");
    }

    public static void j0(TextView textView, int i2) {
        int i10;
        p7.m.j(i2);
        if (Build.VERSION.SDK_INT >= 28) {
            a6.k.s(textView, i2);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i10 = fontMetricsInt.top;
        } else {
            i10 = fontMetricsInt.ascent;
        }
        if (i2 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), i2 + i10, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static int k(Context context, String str) {
        if (str != null) {
            if (Build.VERSION.SDK_INT < 33 && TextUtils.equals("android.permission.POST_NOTIFICATIONS", str)) {
                if (new m5.j(context).f9265a.areNotificationsEnabled()) {
                    return 0;
                }
                return -1;
            }
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        m9.o.i("permission must be non-null");
        return 0;
    }

    public static void k0(TextView textView, int i2) {
        int i10;
        p7.m.j(i2);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i10 = fontMetricsInt.bottom;
        } else {
            i10 = fontMetricsInt.descent;
        }
        if (i2 > Math.abs(i10)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i2 - i10);
        }
    }

    public static void l(boolean z10, String str, Object... objArr) {
        if (z10) {
            return;
        }
        throw new IllegalStateException(String.format(str, objArr));
    }

    public static void l0(TextView textView, int i2) {
        p7.m.j(i2);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i2 != fontMetricsInt) {
            textView.setLineSpacing(i2 - fontMetricsInt, 1.0f);
        }
    }

    public static void o(String str, String str2) {
        String u02 = u0(str);
        if (O(3, u02)) {
            Log.d(u02, str2);
        }
    }

    public static void p(String str, String str2, Throwable th2) {
        String u02 = u0(str);
        if (O(3, u02)) {
            Log.d(u02, str2, th2);
        }
    }

    public static final k7.q q(Context context, Class cls, String str) {
        if (!vc.h.j0(str)) {
            if (!str.equals(":memory:")) {
                return new k7.q(context, cls, str);
            }
            a0.j.h("Cannot build a database with the special name ':memory:'. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
            return null;
        }
        a0.j.h("Cannot build a database with null or empty name. If you are trying to create an in memory database, use Room.inMemoryDatabaseBuilder");
        return null;
    }

    public static void s(String str, String str2) {
        String u02 = u0(str);
        if (O(6, u02)) {
            Log.e(u02, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
        if (r14 == r1) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067 A[Catch: CancellationException -> 0x0030, TryCatch #0 {CancellationException -> 0x0030, blocks: (B:13:0x002b, B:36:0x00a2, B:38:0x00aa, B:40:0x00b6, B:42:0x00c2, B:43:0x00c5, B:44:0x00c8, B:45:0x00cc, B:20:0x0040, B:26:0x0063, B:28:0x0067, B:33:0x0085, B:23:0x004a), top: B:50:0x0021 }] */
    /* JADX WARN: Type inference failed for: r11v7, types: [java.util.List, java.util.Collection, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [java.util.List, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object s0(v3.f0 r11, u1.v0 r12, v3.k r13, ec.a r14) {
        /*
            Method dump skipped, instructions count: 214
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.g.s0(v3.f0, u1.v0, v3.k, ec.a):java.lang.Object");
    }

    public static void t(String str, String str2, Throwable th2) {
        String u02 = u0(str);
        if (O(6, u02)) {
            Log.e(u02, str2, th2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [a3.b, a3.m] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5 */
    public static final ArrayList t0(d2 d2Var, int i2, Integer num) {
        Object obj;
        ?? mVar = new a3.m(d2Var);
        int q10 = d2Var.q(i2);
        n2.a a10 = d2Var.a(i2);
        while (i2 >= 0) {
            if (d2Var.k(i2)) {
                obj = d2Var.p(d2Var.f9887b, i2);
            } else {
                obj = n2.l.f9953a;
            }
            mVar.f(d2Var.i(i2), obj, d2Var.f9886a.f(i2), num);
            if (q10 >= 0) {
                n2.a aVar = a10;
                a10 = d2Var.a(q10);
                i2 = q10;
                q10 = d2Var.q(q10);
                num = aVar;
            } else {
                i2 = q10;
                num = a10;
            }
        }
        return (ArrayList) mVar.f147a;
    }

    public static final Integer u(d2 d2Var, v vVar, int i2, int i10) {
        Integer u4;
        y1 y1Var;
        Object obj;
        int[] iArr = d2Var.f9887b;
        while (true) {
            n2.o oVar = null;
            if (i2 >= i10) {
                return null;
            }
            int i11 = iArr[(i2 * 5) + 3] + i2;
            if (d2Var.j(i2) && d2Var.i(i2) == 206 && nc.k.a(d2Var.p(iArr, i2), t.f10029e)) {
                Object h2 = d2Var.h(i2, 0);
                if (h2 instanceof y1) {
                    y1Var = (y1) h2;
                } else {
                    y1Var = null;
                }
                if (y1Var != null) {
                    obj = y1Var.f10083a;
                } else {
                    obj = null;
                }
                if (obj instanceof n2.o) {
                    oVar = (n2.o) obj;
                }
                if (oVar != null && oVar.A.equals(vVar)) {
                    return Integer.valueOf(i2);
                }
            }
            if (d2Var.d(i2) && (u4 = u(d2Var, vVar, i2 + 1, i11)) != null) {
                return Integer.valueOf(u4.intValue());
            }
            i2 = i11;
        }
    }

    public static String u0(String str) {
        if (Build.VERSION.SDK_INT <= 25 && 23 < str.length()) {
            return str.substring(0, 23);
        }
        return str;
    }

    public static fg.a v(oe.c cVar) {
        cVar.getClass();
        Long l10 = cVar.f10916a;
        String str = cVar.f10917b;
        ArrayList arrayList = cVar.f10918c;
        ArrayList arrayList2 = new ArrayList(zb.m.G(arrayList, 10));
        int size = arrayList.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            Cheat cheat = (Cheat) obj;
            cheat.getClass();
            arrayList2.add(new fg.b(cheat.getId(), cheat.getCheatDatabaseId(), cheat.getName(), cheat.getDescription(), cheat.getCode(), cheat.getEnabled()));
        }
        return new fg.a(l10, str, arrayList2);
    }

    public static String v0(String str) {
        if (str.length() <= 127) {
            return str;
        }
        return str.substring(0, 127);
    }

    public static Object w(Object obj, Class cls) {
        if (obj instanceof mb.a) {
            return cls.cast(obj);
        }
        if (obj instanceof mb.b) {
            return w(((mb.b) obj).d(), cls);
        }
        Class<?> cls2 = obj.getClass();
        throw new IllegalStateException("Given component holder " + cls2 + " does not implement " + mb.a.class + " or " + mb.b.class);
    }

    public static ActionMode.Callback w0(ActionMode.Callback callback) {
        if ((callback instanceof f6.h) && Build.VERSION.SDK_INT >= 26) {
            return ((f6.h) callback).f4920a;
        }
        return callback;
    }

    public static final o3.f x() {
        o3.f fVar = f872j;
        if (fVar != null) {
            return fVar;
        }
        o3.e eVar = new o3.e("Filled.Add", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = h0.f10763a;
        p0 p0Var = new p0(i3.s.f6681b);
        o1 o1Var = new o1(2, false);
        o1Var.q(19.0f, 13.0f);
        o1Var.n(-6.0f);
        o1Var.w(6.0f);
        o1Var.n(-2.0f);
        o1Var.w(-6.0f);
        o1Var.m(5.0f);
        o1Var.w(-2.0f);
        o1Var.n(6.0f);
        o1Var.v(5.0f);
        o1Var.n(2.0f);
        o1Var.w(6.0f);
        o1Var.n(6.0f);
        o1Var.w(2.0f);
        o1Var.g();
        o3.e.a(eVar, o1Var.f7269a, p0Var);
        o3.f b10 = eVar.b();
        f872j = b10;
        return b10;
    }

    public static final void x0(i4.p pVar, int i2, h4.g gVar) {
        i4.p pVar2;
        p2.b bVar = new p2.b(new i4.p[16]);
        List i10 = pVar.i(false, false);
        while (true) {
            bVar.c(bVar.L, i10);
            while (true) {
                int i11 = bVar.L;
                if (i11 != 0) {
                    pVar2 = (i4.p) bVar.k(i11 - 1);
                    boolean e6 = i4.s.e(pVar2);
                    i4.m mVar = pVar2.f6770d;
                    m0 m0Var = mVar.A;
                    if (!e6 && !m0Var.c(i4.t.f6789i)) {
                        a4.r1 d4 = pVar2.d();
                        if (d4 != null) {
                            x4.k o5 = p7.o.o(c0.g(d4, true));
                            if (o5.f14342a < o5.f14344c && o5.f14343b < o5.f14345d) {
                                Object g10 = mVar.A.g(i4.l.f6744e);
                                i4.j jVar = null;
                                if (g10 == null) {
                                    g10 = null;
                                }
                                mc.p pVar3 = (mc.p) g10;
                                Object g11 = m0Var.g(i4.t.f6801v);
                                if (g11 != null) {
                                    jVar = g11;
                                }
                                i4.j jVar2 = jVar;
                                if (pVar3 != null && jVar2 != null && ((Number) jVar2.f6724b.b()).floatValue() > 0.0f) {
                                    int i12 = 1 + i2;
                                    gVar.k(new h4.h(pVar2, i12, o5, d4));
                                    x0(pVar2, i12, gVar);
                                }
                            }
                        } else {
                            throw w.d.g("Expected semantics node to have a coordinator.");
                        }
                    }
                } else {
                    return;
                }
            }
            i10 = pVar2.i(false, false);
        }
    }

    public static Application y(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        m9.o.h(context, "Could not find an Application in the given context: ");
        return null;
    }

    public static void y0(String str, String str2) {
        String u02 = u0(str);
        if (O(5, u02)) {
            Log.w(u02, str2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0047, code lost:
        if (r5.f11349c == r8.hashCode()) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.res.ColorStateList z(android.content.Context r8, int r9) {
        /*
            android.content.res.Resources r0 = r8.getResources()
            android.content.res.Resources$Theme r8 = r8.getTheme()
            p5.i r1 = new p5.i
            r1.<init>(r0, r8)
            java.lang.Object r2 = p5.k.f11354c
            monitor-enter(r2)
            java.util.WeakHashMap r3 = p5.k.f11353b     // Catch: java.lang.Throwable -> L3c
            java.lang.Object r3 = r3.get(r1)     // Catch: java.lang.Throwable -> L3c
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L3c
            r4 = 0
            if (r3 == 0) goto L50
            int r5 = r3.size()     // Catch: java.lang.Throwable -> L3c
            if (r5 <= 0) goto L50
            java.lang.Object r5 = r3.get(r9)     // Catch: java.lang.Throwable -> L3c
            p5.h r5 = (p5.h) r5     // Catch: java.lang.Throwable -> L3c
            if (r5 == 0) goto L50
            android.content.res.Configuration r6 = r5.f11348b     // Catch: java.lang.Throwable -> L3c
            android.content.res.Configuration r7 = r0.getConfiguration()     // Catch: java.lang.Throwable -> L3c
            boolean r6 = r6.equals(r7)     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L4d
            if (r8 != 0) goto L3f
            int r6 = r5.f11349c     // Catch: java.lang.Throwable -> L3c
            if (r6 == 0) goto L49
            goto L3f
        L3c:
            r8 = move-exception
            goto Lb8
        L3f:
            if (r8 == 0) goto L4d
            int r6 = r5.f11349c     // Catch: java.lang.Throwable -> L3c
            int r7 = r8.hashCode()     // Catch: java.lang.Throwable -> L3c
            if (r6 != r7) goto L4d
        L49:
            android.content.res.ColorStateList r3 = r5.f11347a     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            goto L52
        L4d:
            r3.remove(r9)     // Catch: java.lang.Throwable -> L3c
        L50:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            r3 = r4
        L52:
            if (r3 == 0) goto L55
            return r3
        L55:
            java.lang.ThreadLocal r2 = p5.k.f11352a
            java.lang.Object r3 = r2.get()
            android.util.TypedValue r3 = (android.util.TypedValue) r3
            if (r3 != 0) goto L67
            android.util.TypedValue r3 = new android.util.TypedValue
            r3.<init>()
            r2.set(r3)
        L67:
            r2 = 1
            r0.getValue(r9, r3, r2)
            int r2 = r3.type
            r3 = 28
            if (r2 < r3) goto L76
            r3 = 31
            if (r2 > r3) goto L76
            goto L87
        L76:
            android.content.res.XmlResourceParser r2 = r0.getXml(r9)
            android.content.res.ColorStateList r4 = p5.c.a(r0, r2, r8)     // Catch: java.lang.Exception -> L7f
            goto L87
        L7f:
            r2 = move-exception
            java.lang.String r3 = "ResourcesCompat"
            java.lang.String r5 = "Failed to inflate ColorStateList, leaving it to the framework"
            android.util.Log.w(r3, r5, r2)
        L87:
            if (r4 == 0) goto Lb3
            java.lang.Object r2 = p5.k.f11354c
            monitor-enter(r2)
            java.util.WeakHashMap r0 = p5.k.f11353b     // Catch: java.lang.Throwable -> L9f
            java.lang.Object r3 = r0.get(r1)     // Catch: java.lang.Throwable -> L9f
            android.util.SparseArray r3 = (android.util.SparseArray) r3     // Catch: java.lang.Throwable -> L9f
            if (r3 != 0) goto La1
            android.util.SparseArray r3 = new android.util.SparseArray     // Catch: java.lang.Throwable -> L9f
            r3.<init>()     // Catch: java.lang.Throwable -> L9f
            r0.put(r1, r3)     // Catch: java.lang.Throwable -> L9f
            goto La1
        L9f:
            r8 = move-exception
            goto Lb1
        La1:
            p5.h r0 = new p5.h     // Catch: java.lang.Throwable -> L9f
            android.content.res.Resources r1 = r1.f11350a     // Catch: java.lang.Throwable -> L9f
            android.content.res.Configuration r1 = r1.getConfiguration()     // Catch: java.lang.Throwable -> L9f
            r0.<init>(r4, r1, r8)     // Catch: java.lang.Throwable -> L9f
            r3.append(r9, r0)     // Catch: java.lang.Throwable -> L9f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            goto Lb7
        Lb1:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L9f
            throw r8
        Lb3:
            android.content.res.ColorStateList r4 = r0.getColorStateList(r9, r8)
        Lb7:
            return r4
        Lb8:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3c
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: aj.g.z(android.content.Context, int):android.content.res.ColorStateList");
    }

    public static void z0(String str, String str2, Throwable th2) {
        String u02 = u0(str);
        if (O(5, u02)) {
            Log.w(u02, str2, th2);
        }
    }

    public abstract int A();

    public abstract TransformationMethod B0(TransformationMethod transformationMethod);

    public abstract InputFilter[] C(InputFilter[] inputFilterArr);

    public abstract Context E();

    public abstract void H(int i2);

    public boolean J() {
        return false;
    }

    public abstract boolean K();

    public abstract boolean M();

    public abstract void Q();

    public abstract boolean S(int i2, KeyEvent keyEvent);

    public boolean T(KeyEvent keyEvent) {
        return false;
    }

    public boolean U() {
        return false;
    }

    public abstract void c0(boolean z10);

    public abstract void e0(boolean z10);

    public abstract void g0(boolean z10);

    public abstract void h0(boolean z10);

    public abstract void i0(boolean z10);

    public boolean m() {
        return false;
    }

    public abstract void m0(boolean z10);

    public abstract boolean n();

    public abstract void n0();

    public abstract void o0(String str);

    public abstract void p0(CharSequence charSequence);

    public abstract void q0(int i2);

    public abstract void r(boolean z10);

    public o.a r0(jb.c cVar) {
        return null;
    }

    public void R() {
    }

    public void d0(boolean z10) {
    }
}

package b4;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Vibrator;
import android.view.View;
import android.view.ViewParent;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import me.magnum.melonds.R;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class r0 {

    /* renamed from: a  reason: collision with root package name */
    public static final n2.b0 f1936a = new n2.b0(m0.L);

    /* renamed from: b  reason: collision with root package name */
    public static final n2.t2 f1937b = new n2.n1(m0.R);

    /* renamed from: c  reason: collision with root package name */
    public static final n2.b0 f1938c = new n2.b0(q.X);

    /* renamed from: d  reason: collision with root package name */
    public static final n2.t2 f1939d = new n2.n1(m0.X);

    /* renamed from: e  reason: collision with root package name */
    public static final n2.t2 f1940e = new n2.n1(m0.Y);

    /* renamed from: f  reason: collision with root package name */
    public static final n2.t2 f1941f = new n2.n1(m0.Z);

    public static final void a(x xVar, mc.p pVar, n2.m mVar, int i2) {
        int i10;
        int i11;
        boolean z10;
        boolean areAllPrimitivesSupported;
        String str;
        boolean z11;
        n2.r rVar = (n2.r) mVar;
        rVar.Z(-520299287);
        if (rVar.h(xVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(pVar)) {
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
            Context context = xVar.getContext();
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = new b1(context);
                rVar.h0(L);
            }
            b1 b1Var = (b1) L;
            n viewTreeOwners = xVar.getViewTreeOwners();
            if (viewTreeOwners != null) {
                q7.f fVar = viewTreeOwners.f1903b;
                Object L2 = rVar.L();
                if (L2 == eVar) {
                    ViewParent parent = xVar.getParent();
                    parent.getClass();
                    View view = (View) parent;
                    Object tag = view.getTag(R.id.compose_view_saveable_id_tag);
                    LinkedHashMap linkedHashMap = null;
                    if (tag instanceof String) {
                        str = (String) tag;
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = String.valueOf(view.getId());
                    }
                    String str2 = y2.f.class.getSimpleName() + ':' + str;
                    q7.d savedStateRegistry = fVar.getSavedStateRegistry();
                    Bundle a10 = savedStateRegistry.a(str2);
                    if (a10 != null) {
                        linkedHashMap = new LinkedHashMap();
                        for (String str3 : a10.keySet()) {
                            ArrayList parcelableArrayList = a10.getParcelableArrayList(str3);
                            parcelableArrayList.getClass();
                            linkedHashMap.put(str3, parcelableArrayList);
                        }
                    }
                    q qVar = q.Y;
                    n2.t2 t2Var = y2.h.f14658a;
                    y2.g gVar = new y2.g(linkedHashMap, qVar);
                    try {
                        savedStateRegistry.c(str2, new v1(0, gVar));
                        z11 = true;
                    } catch (IllegalArgumentException unused) {
                        z11 = false;
                    }
                    u1 u1Var = new u1(gVar, new w1(z11, savedStateRegistry, str2));
                    rVar.h0(u1Var);
                    L2 = u1Var;
                }
                u1 u1Var2 = (u1) L2;
                boolean h2 = rVar.h(u1Var2);
                Object L3 = rVar.L();
                if (h2 || L3 == eVar) {
                    L3 = new a4.a(6, u1Var2);
                    rVar.h0(L3);
                }
                n2.s.d(yb.y.f14813a, (mc.l) L3, rVar);
                Object L4 = rVar.L();
                if (L4 == eVar) {
                    if (Build.VERSION.SDK_INT >= 31) {
                        areAllPrimitivesSupported = ((Vibrator) context.getSystemService(Vibrator.class)).areAllPrimitivesSupported(1, 7, 2);
                        if (areAllPrimitivesSupported) {
                            L4 = new r1(xVar.getView(), 0);
                            rVar.h0(L4);
                        }
                    }
                    L4 = new Object();
                    rVar.h0(L4);
                }
                q3.a aVar = (q3.a) L4;
                Configuration configuration = xVar.getConfiguration();
                Object L5 = rVar.L();
                if (L5 == eVar) {
                    L5 = new g4.c();
                    rVar.h0(L5);
                }
                g4.c cVar = (g4.c) L5;
                Object L6 = rVar.L();
                Configuration configuration2 = L6;
                if (L6 == eVar) {
                    Configuration configuration3 = new Configuration();
                    if (configuration != null) {
                        configuration3.setTo(configuration);
                    }
                    rVar.h0(configuration3);
                    configuration2 = configuration3;
                }
                Configuration configuration4 = (Configuration) configuration2;
                Object L7 = rVar.L();
                if (L7 == eVar) {
                    L7 = new p0(configuration4, cVar);
                    rVar.h0(L7);
                }
                p0 p0Var = (p0) L7;
                boolean h10 = rVar.h(context);
                Object L8 = rVar.L();
                if (h10 || L8 == eVar) {
                    L8 = new a5.n(1, context, p0Var);
                    rVar.h0(L8);
                }
                n2.s.d(cVar, (mc.l) L8, rVar);
                Object L9 = rVar.L();
                if (L9 == eVar) {
                    L9 = new g4.d();
                    rVar.h0(L9);
                }
                g4.d dVar = (g4.d) L9;
                Object L10 = rVar.L();
                if (L10 == eVar) {
                    L10 = new q0(dVar);
                    rVar.h0(L10);
                }
                q0 q0Var = (q0) L10;
                boolean h11 = rVar.h(context);
                Object L11 = rVar.L();
                if (h11 || L11 == eVar) {
                    L11 = new a5.n(2, context, q0Var);
                    rVar.h0(L11);
                }
                n2.s.d(dVar, (mc.l) L11, rVar);
                n2.b0 b0Var = q1.f1932v;
                n2.s.b(new n2.o1[]{f1936a.a(xVar.getConfiguration()), f1937b.a(context), u6.d.f13496a.a(viewTreeOwners.f1902a), r7.a.f12619a.a(fVar), y2.h.f14658a.a(u1Var2), f1941f.a(xVar.getView()), f1939d.a(cVar), f1940e.a(dVar), b0Var.a(Boolean.valueOf(((Boolean) rVar.j(b0Var)).booleanValue() | xVar.getScrollCaptureInProgress$ui())), q1.f1923l.a(aVar)}, v2.h.c(1059770793, new n0(xVar, b1Var, pVar), rVar), rVar, 56);
            } else {
                a0.j.p("Called when the ViewTreeOwnersAvailability is not yet in Available state");
                return;
            }
        } else {
            rVar.R();
        }
        n2.p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new a4.p1(xVar, pVar, i2, 1);
        }
    }

    public static final void b(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}

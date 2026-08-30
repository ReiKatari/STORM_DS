package k0;

import a0.j;
import a1.m0;
import a1.n0;
import a1.u0;
import a5.e0;
import a5.f0;
import a5.i0;
import a7.i;
import a7.o;
import a7.p;
import a7.x;
import ai.s0;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.TypedValue;
import android.view.View;
import android.window.BackEvent;
import androidx.fragment.app.j0;
import androidx.lifecycle.a1;
import androidx.lifecycle.d1;
import androidx.lifecycle.q;
import b4.d2;
import b4.q1;
import b4.r0;
import c1.q2;
import f1.m1;
import h1.q0;
import i3.h0;
import j0.n;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import k7.w;
import l1.h1;
import mc.l;
import n2.m;
import n2.p1;
import n2.r;
import n2.s;
import n2.w0;
import nc.u;
import p1.a0;
import p7.t;
import pd.g0;
import y2.k;
import y3.c0;
import y3.v0;
import y3.z;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a  reason: collision with root package name */
    public static volatile Handler f7943a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f7944b = 0;

    /* renamed from: c  reason: collision with root package name */
    public static final /* synthetic */ int f7945c = 0;

    /* renamed from: d  reason: collision with root package name */
    public static o3.f f7946d;

    public static o A(d1 d1Var) {
        jb.e eVar = p.f610a;
        w6.a aVar = w6.a.f14160b;
        eVar.getClass();
        aVar.getClass();
        b9.e eVar2 = new b9.e(d1Var, eVar, aVar);
        nc.e a10 = u.a(o.class);
        String b10 = a10.b();
        if (b10 != null) {
            return (o) eVar2.B("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(b10), a10);
        }
        j.h("Local and anonymous classes can not be ViewModels");
        return null;
    }

    public static Handler B() {
        if (f7943a != null) {
            return f7943a;
        }
        synchronized (d.class) {
            try {
                if (f7943a == null) {
                    f7943a = t.f(Looper.getMainLooper());
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return f7943a;
    }

    public static final boolean E(m0 m0Var, Object obj, Object obj2) {
        Object g10 = m0Var.g(obj);
        if (g10 == null) {
            return false;
        }
        if (g10 instanceof n0) {
            n0 n0Var = (n0) g10;
            boolean l10 = n0Var.l(obj2);
            if (l10 && n0Var.g()) {
                m0Var.k(obj);
            }
            return l10;
        } else if (!g10.equals(obj2)) {
            return false;
        } else {
            m0Var.k(obj);
            return true;
        }
    }

    public static final void F(List list, l lVar) {
        list.getClass();
        Iterator it = list.iterator();
        int i2 = 0;
        while (true) {
            if (it.hasNext()) {
                if (((Boolean) lVar.k(it.next())).booleanValue()) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            list.remove(i2);
        }
    }

    public static final void G(m0 m0Var, Object obj) {
        boolean z10;
        long[] jArr = m0Var.f67a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i2 = 0;
            while (true) {
                long j2 = jArr[i2];
                if ((((~j2) << 7) & j2 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i10 = 8 - ((~(i2 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j2) < 128) {
                            int i12 = (i2 << 3) + i11;
                            Object obj2 = m0Var.f68b[i12];
                            Object obj3 = m0Var.f69c[i12];
                            if (obj3 instanceof n0) {
                                n0 n0Var = (n0) obj3;
                                n0Var.l(obj);
                                z10 = n0Var.g();
                            } else if (obj3 == obj) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10) {
                                m0Var.l(i12);
                            }
                        }
                        j2 >>= 8;
                    }
                    if (i10 != 8) {
                        return;
                    }
                }
                if (i2 != length) {
                    i2++;
                } else {
                    return;
                }
            }
        }
    }

    public static TypedValue I(Context context, int i2) {
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i2, typedValue, true)) {
            return typedValue;
        }
        return null;
    }

    public static boolean J(Context context, int i2, boolean z10) {
        TypedValue I = I(context, i2);
        if (I != null && I.type == 18) {
            if (I.data != 0) {
                return true;
            }
            return false;
        }
        return z10;
    }

    public static TypedValue K(Context context, int i2, String str) {
        TypedValue I = I(context, i2);
        if (I != null) {
            return I;
        }
        throw new IllegalArgumentException(String.format("%1$s requires a value for the %2$s attribute to be set in your app theme. You can either set the attribute in your theme or update your theme to inherit from Theme.MaterialComponents (or a descendant).", str, context.getResources().getResourceName(i2)));
    }

    public static String M(long j2) {
        int i2 = (int) (j2 >> 32);
        int i10 = (int) (j2 & 4294967295L);
        if (Float.intBitsToFloat(i2) == Float.intBitsToFloat(i10)) {
            return "CornerRadius.circular(" + w.J(Float.intBitsToFloat(i2)) + ')';
        }
        return "CornerRadius.elliptical(" + w.J(Float.intBitsToFloat(i2)) + ", " + w.J(Float.intBitsToFloat(i10)) + ')';
    }

    public static final h3.c N(z zVar) {
        h3.c g10 = c0.g(zVar, true);
        long h2 = zVar.h(g10.d());
        long h10 = zVar.h((Float.floatToRawIntBits(g10.f6054c) << 32) | (Float.floatToRawIntBits(g10.f6055d) & 4294967295L));
        return new h3.c(Float.intBitsToFloat((int) (h2 >> 32)), Float.intBitsToFloat((int) (h2 & 4294967295L)), Float.intBitsToFloat((int) (h10 >> 32)), Float.intBitsToFloat((int) (h10 & 4294967295L)));
    }

    public static final void a(mc.a aVar, f0 f0Var, v2.c cVar, m mVar, int i2) {
        mc.a aVar2;
        int i10;
        boolean z10;
        boolean z11;
        int i11;
        int i12;
        int i13;
        r rVar = (r) mVar;
        rVar.Z(826668973);
        if ((i2 & 6) == 0) {
            aVar2 = aVar;
            if (rVar.h(aVar2)) {
                i13 = 4;
            } else {
                i13 = 2;
            }
            i10 = i13 | i2;
        } else {
            aVar2 = aVar;
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.f(f0Var)) {
                i12 = 32;
            } else {
                i12 = 16;
            }
            i10 |= i12;
        }
        if ((i2 & 384) == 0) {
            if (rVar.h(cVar)) {
                i11 = 256;
            } else {
                i11 = 128;
            }
            i10 |= i11;
        }
        int i14 = i10;
        boolean z12 = true;
        if ((i14 & 147) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i14 & 1, z10)) {
            View view = (View) rVar.j(r0.f1941f);
            x4.c cVar2 = (x4.c) rVar.j(q1.f1919h);
            x4.m mVar2 = (x4.m) rVar.j(q1.f1924n);
            n2.p z13 = s.z(rVar);
            w0 A = s.A(cVar, rVar);
            Object[] objArr = new Object[0];
            Object L = rVar.L();
            n2.e eVar = n2.l.f9953a;
            if (L == eVar) {
                L = a5.g.L;
                rVar.h0(L);
            }
            UUID uuid = (UUID) k.c(objArr, (mc.a) L, rVar, 48);
            boolean f8 = rVar.f(view) | rVar.f(cVar2);
            Object L2 = rVar.L();
            if (f8 || L2 == eVar) {
                i0 i0Var = new i0(aVar2, f0Var, view, mVar2, cVar2, uuid);
                v2.c cVar3 = new v2.c(346960332, true, new a5.f(0, A));
                e0 e0Var = i0Var.f401b0;
                e0Var.setParentCompositionContext(z13);
                e0Var.f385g0.setValue(cVar3);
                e0Var.f389k0 = true;
                if (e0Var.R == null && !e0Var.isAttachedToWindow()) {
                    j.p("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
                    return;
                }
                e0Var.d();
                rVar.h0(i0Var);
                L2 = i0Var;
            }
            i0 i0Var2 = (i0) L2;
            boolean h2 = rVar.h(i0Var2);
            Object L3 = rVar.L();
            if (h2 || L3 == eVar) {
                L3 = new a5.b(i0Var2, 0);
                rVar.h0(L3);
            }
            s.d(i0Var2, (l) L3, rVar);
            boolean h10 = rVar.h(i0Var2);
            if ((i14 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z14 = h10 | z11;
            if ((i14 & 112) != 32) {
                z12 = false;
            }
            boolean d4 = z14 | z12 | rVar.d(mVar2.ordinal());
            Object L4 = rVar.L();
            if (d4 || L4 == eVar) {
                a5.c cVar4 = new a5.c(i0Var2, aVar, f0Var, mVar2, 0);
                rVar.h0(cVar4);
                L4 = cVar4;
            }
            s.h((mc.a) L4, rVar);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new a5.d(aVar, f0Var, cVar, i2, 0);
        }
    }

    public static final void b(b7.r rVar, m mVar, int i2) {
        int i10;
        boolean isAtLeast;
        b7.r rVar2;
        r rVar3 = (r) mVar;
        rVar3.Z(294589392);
        if (rVar3.h(rVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        if (((i10 | i2) & 3) == 2 && rVar3.A()) {
            rVar3.R();
            rVar2 = rVar;
        } else {
            y2.e f8 = k.f(rVar3);
            w0 m = s.m(rVar.b().f599e, rVar3);
            List list = (List) m.getValue();
            boolean booleanValue = ((Boolean) rVar3.j(d2.f1832a)).booleanValue();
            boolean f10 = rVar3.f(list);
            Object L = rVar3.L();
            n2.e eVar = n2.l.f9953a;
            z2.p pVar = L;
            if (f10 || L == eVar) {
                z2.p pVar2 = new z2.p();
                ArrayList arrayList = new ArrayList();
                for (Object obj : list) {
                    i iVar = (i) obj;
                    if (booleanValue) {
                        isAtLeast = true;
                    } else {
                        isAtLeast = ((androidx.lifecycle.z) iVar.f576b0.f3262k).f1504d.isAtLeast(q.STARTED);
                    }
                    if (isAtLeast) {
                        arrayList.add(obj);
                    }
                }
                pVar2.addAll(arrayList);
                rVar3.h0(pVar2);
                pVar = pVar2;
            }
            z2.p pVar3 = pVar;
            g(pVar3, (List) m.getValue(), rVar3, 0);
            w0 m10 = s.m(rVar.b().f600f, rVar3);
            Object L2 = rVar3.L();
            if (L2 == eVar) {
                L2 = new z2.p();
                rVar3.h0(L2);
            }
            z2.p pVar4 = (z2.p) L2;
            rVar3.X(-367418626);
            ListIterator listIterator = pVar3.listIterator();
            while (true) {
                a4.r rVar4 = (a4.r) listIterator;
                if (!rVar4.hasNext()) {
                    break;
                }
                i iVar2 = (i) rVar4.next();
                x xVar = iVar2.B;
                xVar.getClass();
                b7.q qVar = (b7.q) xVar;
                boolean h2 = rVar3.h(rVar) | rVar3.h(iVar2);
                Object L3 = rVar3.L();
                if (h2 || L3 == eVar) {
                    L3 = new a3.e(3, rVar, iVar2);
                    rVar3.h0(L3);
                }
                z2.p pVar5 = pVar4;
                b7.r rVar5 = rVar;
                a((mc.a) L3, qVar.Y, v2.h.c(1129586364, new b7.o(iVar2, rVar5, f8, pVar5, qVar), rVar3), rVar3, 384);
                rVar = rVar5;
                pVar4 = pVar5;
            }
            rVar2 = rVar;
            z2.p pVar6 = pVar4;
            rVar3.p(false);
            Set set = (Set) m10.getValue();
            boolean f11 = rVar3.f(m10) | rVar3.h(rVar2);
            Object L4 = rVar3.L();
            if (f11 || L4 == eVar) {
                L4 = new b7.p(m10, rVar2, pVar6, (cc.c) null);
                rVar3.h0(L4);
            }
            s.f(set, pVar6, (mc.p) L4, rVar3);
        }
        p1 r5 = rVar3.r();
        if (r5 != null) {
            r5.f9983d = new s0(i2, 1, rVar2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0179  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(b3.p r27, n1.x r28, l1.d1 r29, l1.h r30, b3.f r31, h1.q0 r32, boolean r33, f1.i r34, final mc.l r35, n2.m r36, final int r37, final int r38) {
        /*
            Method dump skipped, instructions count: 412
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.d.c(b3.p, n1.x, l1.d1, l1.h, b3.f, h1.q0, boolean, f1.i, mc.l, n2.m, int, int):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:172:0x0268, code lost:
        if (r14.g(false) != false) goto L144;
     */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02ef  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0323  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(final b3.p r37, o1.t r38, final o1.c r39, final l1.h1 r40, final h1.q0 r41, final boolean r42, final f1.i r43, final l1.h r44, final l1.f r45, final mc.l r46, n2.m r47, final int r48, final int r49) {
        /*
            Method dump skipped, instructions count: 907
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.d.d(b3.p, o1.t, o1.c, l1.h1, h1.q0, boolean, f1.i, l1.h, l1.f, mc.l, n2.m, int, int):void");
    }

    public static final void e(b3.p pVar, n1.x xVar, h1 h1Var, l1.f fVar, b3.g gVar, q0 q0Var, boolean z10, f1.i iVar, l lVar, m mVar, int i2) {
        int i10;
        int i11;
        int i12;
        boolean z11;
        b3.g gVar2;
        q0 q0Var2;
        boolean z12;
        f1.i iVar2;
        int i13;
        b3.g gVar3;
        h1.l lVar2;
        f1.i a10;
        r rVar = (r) mVar;
        rVar.Z(-1884325601);
        if (rVar.f(pVar)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i14 = i2 | i10;
        if (rVar.f(xVar)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        int i15 = i14 | i11 | 46861312;
        if (rVar.h(lVar)) {
            i12 = 536870912;
        } else {
            i12 = 268435456;
        }
        int i16 = i15 | i12;
        boolean z13 = true;
        if ((306783379 & i16) != 306783378) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (rVar.O(i16 & 1, z11)) {
            rVar.T();
            if ((i2 & 1) != 0 && !rVar.y()) {
                rVar.R();
                i13 = i16 & (-238551041);
                gVar3 = gVar;
                lVar2 = q0Var;
                z13 = z10;
                a10 = iVar;
            } else {
                b3.g gVar4 = b3.c.f1755d0;
                d1.t a11 = q2.a(rVar);
                boolean f8 = rVar.f(a11);
                Object L = rVar.L();
                if (f8 || L == n2.l.f9953a) {
                    L = new h1.l(a11);
                    rVar.h0(L);
                }
                i13 = i16 & (-238551041);
                gVar3 = gVar4;
                lVar2 = (h1.l) L;
                a10 = m1.a(rVar);
            }
            rVar.q();
            w.b(pVar, xVar, h1Var, false, lVar2, z13, a10, null, null, gVar3, fVar, lVar, rVar, (i13 & 14) | 24576 | (i13 & 112) | 1576320, 432 | ((i13 >> 18) & 7168), 1792);
            b3.g gVar5 = gVar3;
            iVar2 = a10;
            gVar2 = gVar5;
            q0Var2 = lVar2;
            z12 = z13;
        } else {
            rVar.R();
            gVar2 = gVar;
            q0Var2 = q0Var;
            z12 = z10;
            iVar2 = iVar;
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ig.b(pVar, xVar, h1Var, fVar, gVar2, q0Var2, z12, iVar2, lVar, i2);
        }
    }

    public static final f7.b f(BackEvent backEvent) {
        float touchX;
        float touchY;
        float progress;
        int swipeEdge;
        long j2;
        touchX = backEvent.getTouchX();
        touchY = backEvent.getTouchY();
        progress = backEvent.getProgress();
        swipeEdge = backEvent.getSwipeEdge();
        if (Build.VERSION.SDK_INT >= 36) {
            j2 = backEvent.getFrameTimeMillis();
        } else {
            j2 = 0;
        }
        return new f7.b(swipeEdge, progress, touchX, touchY, j2);
    }

    public static final void g(List list, Collection collection, m mVar, int i2) {
        int i10;
        int i11;
        r rVar = (r) mVar;
        rVar.Z(1537894851);
        if (rVar.h(list)) {
            i10 = 4;
        } else {
            i10 = 2;
        }
        int i12 = i10 | i2;
        if (rVar.h(collection)) {
            i11 = 32;
        } else {
            i11 = 16;
        }
        if (((i12 | i11) & 19) == 18 && rVar.A()) {
            rVar.R();
        } else {
            boolean booleanValue = ((Boolean) rVar.j(d2.f1832a)).booleanValue();
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                i iVar = (i) it.next();
                androidx.lifecycle.z zVar = (androidx.lifecycle.z) iVar.f576b0.f3262k;
                boolean g10 = rVar.g(booleanValue) | rVar.h(list) | rVar.h(iVar);
                Object L = rVar.L();
                if (g10 || L == n2.l.f9953a) {
                    L = new b7.k(iVar, list, booleanValue);
                    rVar.h0(L);
                }
                s.d(zVar, (l) L, rVar);
            }
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new ai.r0(list, collection, i2, 2);
        }
    }

    public static final void h(b3.p pVar, mc.p pVar2, m mVar, int i2) {
        int i10;
        boolean z10;
        int i11;
        int i12;
        r rVar = (r) mVar;
        rVar.Z(1090521195);
        if ((i2 & 6) == 0) {
            if (rVar.f(pVar)) {
                i12 = 4;
            } else {
                i12 = 2;
            }
            i10 = i12 | i2;
        } else {
            i10 = i2;
        }
        if ((i2 & 48) == 0) {
            if (rVar.h(pVar2)) {
                i11 = 32;
            } else {
                i11 = 16;
            }
            i10 |= i11;
        }
        if ((i10 & 19) != 18) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (rVar.O(i10 & 1, z10)) {
            Object L = rVar.L();
            if (L == n2.l.f9953a) {
                L = a5.i.f398b;
                rVar.h0(L);
            }
            v0 v0Var = (v0) L;
            int hashCode = Long.hashCode(rVar.T);
            v2.g l10 = rVar.l();
            b3.p c4 = b3.a.c(pVar, rVar);
            a4.h.f220a.getClass();
            a4.f0 f0Var = a4.g.f212b;
            int i13 = (((((i10 << 3) & 112) | (((i10 >> 3) & 14) | 384)) << 6) & 896) | 6;
            rVar.b0();
            if (rVar.S) {
                rVar.k(f0Var);
            } else {
                rVar.k0();
            }
            s.C(v0Var, a4.g.f215e, rVar);
            s.C(l10, a4.g.f214d, rVar);
            s.u(rVar, Integer.valueOf(hashCode), a4.g.f216f);
            s.y(rVar, a4.g.f217g);
            s.C(c4, a4.g.f213c, rVar);
            pVar2.j(rVar, Integer.valueOf((i13 >> 6) & 14));
            rVar.p(true);
        } else {
            rVar.R();
        }
        p1 r5 = rVar.r();
        if (r5 != null) {
            r5.f9983d = new a5.j(pVar, pVar2, i2);
        }
    }

    public static final void i(md.d dVar) {
        g0 g0Var;
        dVar.getClass();
        if (dVar instanceof g0) {
            g0Var = (g0) dVar;
        } else {
            g0Var = null;
        }
        if (g0Var != null) {
            return;
        }
        j.g(u.a(dVar.getClass()), "This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
    }

    public static final void j(m0 m0Var, Object obj, Object obj2) {
        boolean z10;
        Object obj3;
        int f8 = m0Var.f(obj);
        if (f8 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            obj3 = null;
        } else {
            obj3 = m0Var.f69c[f8];
        }
        if (obj3 != null) {
            if (obj3 instanceof n0) {
                ((n0) obj3).a(obj2);
            } else if (obj3 != obj2) {
                n0 n0Var = new n0();
                n0Var.a(obj3);
                n0Var.a(obj2);
                obj2 = n0Var;
            }
            obj2 = obj3;
        }
        if (z10) {
            int i2 = ~f8;
            m0Var.f68b[i2] = obj;
            m0Var.f69c[i2] = obj2;
            return;
        }
        m0Var.f69c[f8] = obj2;
    }

    public static final od.j k(md.c cVar) {
        od.j jVar;
        cVar.getClass();
        if (cVar instanceof od.j) {
            jVar = (od.j) cVar;
        } else {
            jVar = null;
        }
        if (jVar != null) {
            return jVar;
        }
        j.g(u.a(cVar.getClass()), "This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object m(bd.v r4, mc.a r5, ec.c r6) {
        /*
            boolean r0 = r6 instanceof bd.t
            if (r0 == 0) goto L13
            r0 = r6
            bd.t r0 = (bd.t) r0
            int r1 = r0.Y
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.Y = r1
            goto L18
        L13:
            bd.t r0 = new bd.t
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.X
            dc.a r1 = dc.a.COROUTINE_SUSPENDED
            int r2 = r0.Y
            r3 = 1
            if (r2 == 0) goto L32
            if (r2 != r3) goto L2b
            mc.a r5 = r0.R
            p7.j.I(r6)     // Catch: java.lang.Throwable -> L29
            goto L62
        L29:
            r4 = move-exception
            goto L68
        L2b:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            a0.j.p(r4)
            r4 = 0
            return r4
        L32:
            p7.j.I(r6)
            cc.g r6 = r0.B
            r6.getClass()
            zc.r r2 = zc.r.B
            cc.e r6 = r6.t(r2)
            if (r6 != r4) goto L6c
            r0.R = r5     // Catch: java.lang.Throwable -> L29
            r0.Y = r3     // Catch: java.lang.Throwable -> L29
            zc.h r6 = new zc.h     // Catch: java.lang.Throwable -> L29
            cc.c r0 = pc.a.A(r0)     // Catch: java.lang.Throwable -> L29
            r6.<init>(r3, r0)     // Catch: java.lang.Throwable -> L29
            r6.v()     // Catch: java.lang.Throwable -> L29
            bd.u r0 = new bd.u     // Catch: java.lang.Throwable -> L29
            r2 = 0
            r0.<init>(r2, r6)     // Catch: java.lang.Throwable -> L29
            r4.l0(r0)     // Catch: java.lang.Throwable -> L29
            java.lang.Object r4 = r6.u()     // Catch: java.lang.Throwable -> L29
            if (r4 != r1) goto L62
            return r1
        L62:
            r5.b()
            yb.y r4 = yb.y.f14813a
            return r4
        L68:
            r5.b()
            throw r4
        L6c:
            java.lang.String r4 = "awaitClose() can only be invoked from the producer context"
            a0.j.p(r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.d.m(bd.v, mc.a, ec.c):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [fj.e, java.lang.Object, fj.g0] */
    /* JADX WARN: Type inference failed for: r4v9, types: [fj.e, java.lang.Object, fj.g0] */
    public static void n(long j2, fj.e eVar, int i2, ArrayList arrayList, int i10, int i11, ArrayList arrayList2) {
        int i12;
        int i13;
        ArrayList arrayList3;
        long j10;
        int i14;
        int i15 = i2;
        ArrayList arrayList4 = arrayList;
        ArrayList arrayList5 = arrayList2;
        if (i10 < i11) {
            for (int i16 = i10; i16 < i11; i16++) {
                if (((fj.h) arrayList4.get(i16)).d() < i15) {
                    j.h("Failed requirement.");
                    return;
                }
            }
            fj.h hVar = (fj.h) arrayList.get(i10);
            fj.h hVar2 = (fj.h) arrayList4.get(i11 - 1);
            if (i15 == hVar.d()) {
                int intValue = ((Number) arrayList5.get(i10)).intValue();
                int i17 = i10 + 1;
                fj.h hVar3 = (fj.h) arrayList4.get(i17);
                i12 = i17;
                i13 = intValue;
                hVar = hVar3;
            } else {
                i12 = i10;
                i13 = -1;
            }
            if (hVar.i(i15) != hVar2.i(i15)) {
                int i18 = 1;
                for (int i19 = i12 + 1; i19 < i11; i19++) {
                    if (((fj.h) arrayList4.get(i19 - 1)).i(i15) != ((fj.h) arrayList4.get(i19)).i(i15)) {
                        i18++;
                    }
                }
                long j11 = 4;
                long j12 = (eVar.B / j11) + j2 + 2 + (i18 * 2);
                eVar.h0(i18);
                eVar.h0(i13);
                for (int i20 = i12; i20 < i11; i20++) {
                    byte i21 = ((fj.h) arrayList4.get(i20)).i(i15);
                    if (i20 == i12 || i21 != ((fj.h) arrayList4.get(i20 - 1)).i(i15)) {
                        eVar.h0(i21 & 255);
                    }
                }
                ?? obj = new Object();
                int i22 = i12;
                while (i22 < i11) {
                    byte i23 = ((fj.h) arrayList4.get(i22)).i(i15);
                    int i24 = i22 + 1;
                    int i25 = i24;
                    while (true) {
                        if (i25 < i11) {
                            if (i23 != ((fj.h) arrayList4.get(i25)).i(i15)) {
                                break;
                            }
                            i25++;
                        } else {
                            i25 = i11;
                            break;
                        }
                    }
                    if (i24 == i25 && i15 + 1 == ((fj.h) arrayList4.get(i22)).d()) {
                        eVar.h0(((Number) arrayList5.get(i22)).intValue());
                        arrayList3 = arrayList5;
                        j10 = j12;
                        i14 = i25;
                    } else {
                        eVar.h0(((int) ((obj.B / j11) + j12)) * (-1));
                        arrayList3 = arrayList5;
                        j10 = j12;
                        i14 = i25;
                        n(j10, obj, i15 + 1, arrayList, i22, i14, arrayList3);
                        arrayList4 = arrayList;
                    }
                    j12 = j10;
                    i22 = i14;
                    arrayList5 = arrayList3;
                }
                eVar.d0(obj);
                return;
            }
            int min = Math.min(hVar.d(), hVar2.d());
            int i26 = 0;
            for (int i27 = i15; i27 < min && hVar.i(i27) == hVar2.i(i27); i27++) {
                i26++;
            }
            long j13 = 4;
            long j14 = (eVar.B / j13) + j2 + 2 + i26 + 1;
            eVar.h0(-i26);
            eVar.h0(i13);
            int i28 = i15 + i26;
            while (i15 < i28) {
                eVar.h0(hVar.i(i15) & 255);
                i15++;
            }
            if (i12 + 1 == i11) {
                if (i28 == ((fj.h) arrayList4.get(i12)).d()) {
                    eVar.h0(((Number) arrayList5.get(i12)).intValue());
                    return;
                } else {
                    j.p("Check failed.");
                    return;
                }
            }
            ?? obj2 = new Object();
            eVar.h0(((int) ((obj2.B / j13) + j14)) * (-1));
            n(j14, obj2, i28, arrayList4, i12, i11, arrayList5);
            eVar.d0(obj2);
            return;
        }
        j.h("Failed requirement.");
    }

    public static final double p(int i2, int i10, int i11, int i12, n9.f fVar) {
        double d4 = i11 / i2;
        double d10 = i12 / i10;
        int i13 = d9.h.f4022a[fVar.ordinal()];
        if (i13 != 1) {
            if (i13 == 2) {
                return Math.min(d4, d10);
            }
            m9.o.o();
            return 0.0d;
        }
        return Math.max(d4, d10);
    }

    public static m0 q() {
        long[] jArr = u0.f103a;
        return new m0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:28:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:41:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r0v2, types: [k0.g] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r5v1, types: [j7.e0, m6.q] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static m6.q r(android.content.Context r13) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lc
            m6.c r0 = new m6.c
            r0.<init>()
            goto L11
        Lc:
            k0.g r0 = new k0.g
            r0.<init>()
        L11:
            android.content.pm.PackageManager r1 = r13.getPackageManager()
            java.lang.String r2 = "Package manager required to locate emoji font provider"
            p7.m.l(r1, r2)
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.content.action.LOAD_EMOJI_FONT"
            r2.<init>(r3)
            r3 = 0
            java.util.List r2 = r1.queryIntentContentProviders(r2, r3)
            java.util.Iterator r2 = r2.iterator()
        L2a:
            boolean r4 = r2.hasNext()
            r5 = 0
            if (r4 == 0) goto L46
            java.lang.Object r4 = r2.next()
            android.content.pm.ResolveInfo r4 = (android.content.pm.ResolveInfo) r4
            android.content.pm.ProviderInfo r4 = r4.providerInfo
            if (r4 == 0) goto L2a
            android.content.pm.ApplicationInfo r6 = r4.applicationInfo
            if (r6 == 0) goto L2a
            int r6 = r6.flags
            r7 = 1
            r6 = r6 & r7
            if (r6 != r7) goto L2a
            goto L47
        L46:
            r4 = r5
        L47:
            if (r4 != 0) goto L4b
        L49:
            r6 = r5
            goto L7c
        L4b:
            java.lang.String r7 = r4.authority     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.lang.String r8 = r4.packageName     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            android.content.pm.Signature[] r0 = r0.g(r1, r8)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            r1.<init>()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            int r2 = r0.length     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
        L59:
            if (r3 >= r2) goto L67
            r4 = r0[r3]     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            byte[] r4 = r4.toByteArray()     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            r1.add(r4)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            int r3 = r3 + 1
            goto L59
        L67:
            java.util.List r10 = java.util.Collections.singletonList(r1)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            v5.c r6 = new v5.c     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            java.lang.String r9 = "emojicompat-emoji-font"
            r11 = 0
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11, r12)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L75
            goto L7c
        L75:
            r0 = move-exception
            java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
            android.util.Log.wtf(r1, r0)
            goto L49
        L7c:
            if (r6 != 0) goto L7f
            goto L89
        L7f:
            m6.q r5 = new m6.q
            m6.p r0 = new m6.p
            r0.<init>(r13, r6)
            r5.<init>(r0)
        L89:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: k0.d.r(android.content.Context):m6.q");
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [j0.m, java.lang.Object] */
    public static j0.m s(j0.m... mVarArr) {
        List asList = Arrays.asList(mVarArr);
        if (asList.isEmpty()) {
            return new Object();
        }
        if (asList.size() == 1) {
            return (j0.m) asList.get(0);
        }
        return new n(asList);
    }

    public static final void t(k3.d dVar, l3.b bVar) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        Canvas canvas;
        boolean z14;
        float f8;
        i3.q p10 = dVar.E().p();
        l3.b bVar2 = (l3.b) dVar.E().L;
        l3.d dVar2 = bVar.f8682a;
        if (!bVar.f8699s) {
            bVar.a();
            if (!dVar2.G()) {
                try {
                    bVar.f8682a.C(bVar.f8683b, bVar.f8684c, bVar, bVar.f8686e);
                } catch (Throwable unused) {
                }
            }
            if (dVar2.F() > 0.0f) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (z10) {
                p10.t();
            }
            Canvas a10 = i3.c.a(p10);
            boolean isHardwareAccelerated = a10.isHardwareAccelerated();
            if (!isHardwareAccelerated) {
                long j2 = bVar.f8700t;
                float f10 = (int) (j2 >> 32);
                float f11 = (int) (j2 & 4294967295L);
                long j10 = bVar.f8701u;
                float f12 = ((int) (j10 >> 32)) + f10;
                float f13 = ((int) (j10 & 4294967295L)) + f11;
                float a11 = dVar2.a();
                i3.l x9 = dVar2.x();
                int J = dVar2.J();
                if (a11 >= 1.0f && J == 3 && x9 == null && dVar2.v() != 1) {
                    a10.save();
                    a10 = a10;
                    f8 = f10;
                } else {
                    cd.h1 h1Var = bVar.f8696p;
                    if (h1Var == null) {
                        h1Var = i3.z.f();
                        bVar.f8696p = h1Var;
                    }
                    h1Var.h(a11);
                    h1Var.i(J);
                    h1Var.k(x9);
                    a10 = a10;
                    f8 = f10;
                    a10.saveLayer(f8, f11, f12, f13, (Paint) h1Var.B);
                }
                a10.translate(f8, f11);
                a10.concat(dVar2.B());
            }
            if (!isHardwareAccelerated && bVar.f8703w) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11) {
                p10.p();
                i3.z d4 = bVar.d();
                if (d4 instanceof i3.g0) {
                    i3.q.e(p10, ((i3.g0) d4).f6634f);
                } else if (d4 instanceof h0) {
                    i3.h hVar = bVar.m;
                    if (hVar != null) {
                        hVar.f6635a.rewind();
                    } else {
                        hVar = i3.k.a();
                        bVar.m = hVar;
                    }
                    i3.h.c(hVar, ((h0) d4).f6639f);
                    p10.h(hVar);
                } else if (d4 instanceof i3.f0) {
                    p10.h(((i3.f0) d4).f6631f);
                } else {
                    m9.o.o();
                    return;
                }
            }
            if (bVar2 != null) {
                l2.g gVar = bVar2.f8698r;
                if (!gVar.f8677a) {
                    i3.c0.a("Only add dependencies during a tracking");
                }
                n0 n0Var = (n0) gVar.f8680d;
                if (n0Var != null) {
                    n0Var.a(bVar);
                } else if (((l3.b) gVar.f8678b) != null) {
                    n0 n0Var2 = a1.v0.f110a;
                    n0 n0Var3 = new n0();
                    l3.b bVar3 = (l3.b) gVar.f8678b;
                    bVar3.getClass();
                    n0Var3.a(bVar3);
                    n0Var3.a(bVar);
                    gVar.f8680d = n0Var3;
                    gVar.f8678b = null;
                } else {
                    gVar.f8678b = bVar;
                }
                n0 n0Var4 = (n0) gVar.f8681e;
                if (n0Var4 != null) {
                    z14 = !n0Var4.l(bVar);
                } else if (((l3.b) gVar.f8679c) != bVar) {
                    z14 = true;
                } else {
                    gVar.f8679c = null;
                    z14 = false;
                }
                if (z14) {
                    bVar.f8697q++;
                }
            }
            if (!((i3.b) p10).f6615a.isHardwareAccelerated()) {
                k3.b bVar4 = bVar.f8695o;
                if (bVar4 == null) {
                    bVar4 = new k3.b();
                    bVar.f8695o = bVar4;
                }
                a4.n nVar = bVar4.B;
                x4.c cVar = bVar.f8683b;
                x4.m mVar = bVar.f8684c;
                long T = zb.k.T(bVar.f8701u);
                x4.c q10 = nVar.q();
                x4.m r5 = nVar.r();
                i3.q p11 = nVar.p();
                z13 = z11;
                canvas = a10;
                long t5 = nVar.t();
                z12 = z10;
                l3.b bVar5 = (l3.b) nVar.L;
                nVar.H(cVar);
                nVar.I(mVar);
                nVar.G(p10);
                nVar.J(T);
                nVar.L = bVar;
                p10.p();
                try {
                    bVar.c(bVar4);
                } finally {
                    p10.m();
                    nVar.H(q10);
                    nVar.I(r5);
                    nVar.G(p11);
                    nVar.J(t5);
                    nVar.L = bVar5;
                }
            } else {
                z12 = z10;
                z13 = z11;
                canvas = a10;
                dVar2.M(p10);
            }
            if (z13) {
                p10.m();
            }
            if (z12) {
                p10.q();
            }
            if (!isHardwareAccelerated) {
                canvas.restore();
            }
        }
    }

    public static final boolean u(long j2, long j10) {
        if (j2 == j10) {
            return true;
        }
        return false;
    }

    public static e2.b v(e2.b bVar, x4.m mVar, l4.r0 r0Var, x4.c cVar, p4.d dVar) {
        if (bVar != null && mVar == bVar.f4153a && l4.i0.h(r0Var, mVar).equals(bVar.f4154b) && cVar.b() == bVar.f4155c.A && dVar == bVar.f4156d) {
            return bVar;
        }
        e2.b bVar2 = e2.b.f4152h;
        if (bVar2 != null && mVar == bVar2.f4153a && l4.i0.h(r0Var, mVar).equals(bVar2.f4154b) && cVar.b() == bVar2.f4155c.A && dVar == bVar2.f4156d) {
            return bVar2;
        }
        e2.b bVar3 = new e2.b(mVar, l4.i0.h(r0Var, mVar), new x4.d(cVar.b(), cVar.j()), dVar);
        e2.b.f4152h = bVar3;
        return bVar3;
    }

    public static jb.g w(d.k kVar, a1 a1Var) {
        jb.c a10 = ((rd.a) ((jb.a) aj.g.w(kVar, jb.a.class))).a();
        a1Var.getClass();
        return new jb.g((nb.b) a10.B, a1Var, (a0) a10.L);
    }

    public static Context x(Context context) {
        int g10;
        Context applicationContext = context.getApplicationContext();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 34 && (g10 = a6.g0.g(context)) != a6.g0.g(applicationContext)) {
            applicationContext = a6.g0.a(applicationContext, g10);
        }
        if (i2 >= 30) {
            String c4 = a6.l.c(context);
            if (!Objects.equals(c4, a6.l.c(applicationContext))) {
                return a6.l.a(applicationContext, c4);
            }
        }
        return applicationContext;
    }

    public static jb.g z(j0 j0Var, a1 a1Var) {
        jb.c a10 = ((rd.d) ((jb.b) aj.g.w(j0Var, jb.b.class))).f12658b.a();
        a1Var.getClass();
        return new jb.g((nb.b) a10.B, a1Var, (a0) a10.L);
    }

    public abstract boolean C();

    public abstract int D(byte[] bArr, int i2, int i10);

    public abstract d H(String str, l lVar);

    public abstract lj.g L();

    public abstract int l();

    public abstract Object o();

    public abstract void y(na.x xVar, float f8, float f10);
}

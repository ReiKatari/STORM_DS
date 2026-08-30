package rd;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Vibrator;
import android.widget.TextView;
import androidx.preference.f0;
import com.squareup.picasso.j0;
import gk.s0;
import java.lang.reflect.Proxy;
import java.net.URL;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Set;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import k7.q;
import k7.r;
import kf.a0;
import kf.b1;
import kf.d1;
import kf.d2;
import kf.f1;
import kf.g1;
import kf.l0;
import kf.m0;
import kf.r0;
import kf.u1;
import kf.v1;
import kf.w1;
import kf.x1;
import kf.z;
import l.i0;
import l4.c0;
import me.magnum.melonds.common.camera.DSiCameraSource;
import me.magnum.melonds.database.MelonDatabase;
import pi.t;
import pi.w;
import pi.x;
import ua.o;
import w.x0;
import xa.v0;
import zc.g0;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements nb.c {

    /* renamed from: a  reason: collision with root package name */
    public final g f12661a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12662b;

    public f(g gVar, int i2) {
        this.f12661a = gVar;
        this.f12662b = i2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v4, types: [java.util.concurrent.ThreadPoolExecutor, com.squareup.picasso.d0] */
    /* JADX WARN: Type inference failed for: r1v88, types: [ob.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v33, types: [ob.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v37, types: [java.lang.Object, k0.g] */
    /* JADX WARN: Type inference failed for: r4v38, types: [java.lang.Object, k0.g] */
    /* JADX WARN: Type inference failed for: r4v39, types: [sb.b, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v8, types: [java.lang.Object, pb.f] */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.lang.Object, pb.f] */
    @Override // nb.c
    public final Object get() {
        ce.b bVar;
        int i2 = 0;
        g gVar = this.f12661a;
        int i10 = this.f12662b;
        switch (i10) {
            case 0:
                return new e(this, 0);
            case DSiCameraSource.FrontCamera /* 1 */:
                Context context = gVar.f12663a.f3920a;
                MelonDatabase melonDatabase = (MelonDatabase) gVar.f12665c.get();
                melonDatabase.getClass();
                return new u1(context, melonDatabase);
            case 2:
                Context context2 = gVar.f12663a.f3920a;
                Set<r> singleton = Collections.singleton(new Object());
                singleton.getClass();
                q q10 = aj.g.q(context2, MelonDatabase.class, "melon-database");
                for (r rVar : singleton) {
                    rVar.getClass();
                    q10.f8058d.add(rVar);
                }
                q10.a(new ee.b(1, 2, 2), new ee.b(4, 5, 3), new ee.b(5, 6, 4), new ee.b(7, 8, 5));
                return (MelonDatabase) q10.b();
            case 3:
                return new e(this, 1);
            case 4:
                ki.m mVar = (ki.m) gVar.f12672j.get();
                MelonDatabase melonDatabase2 = (MelonDatabase) gVar.f12665c.get();
                melonDatabase2.getClass();
                wf.a aVar = new wf.a(melonDatabase2.r());
                yd.b bVar2 = (yd.b) gVar.f12670h.get();
                SharedPreferences sharedPreferences = (SharedPreferences) gVar.f12669g.get();
                Context context3 = gVar.f12663a.f3920a;
                mVar.getClass();
                bVar2.getClass();
                sharedPreferences.getClass();
                return new z(mVar, aVar, bVar2, sharedPreferences, context3);
            case l1.c.f8511g /* 5 */:
                wd.a aVar2 = new wd.a(gVar.f12663a.f3920a);
                w wVar = new w();
                wVar.f11808c.add(aVar2);
                x xVar = new x(wVar);
                od.c cVar = (od.c) gVar.f12668f.get();
                yd.b bVar3 = (yd.b) gVar.f12670h.get();
                yd.a aVar3 = (yd.a) gVar.f12671i.get();
                cVar.getClass();
                bVar3.getClass();
                aVar3.getClass();
                return new ki.m(xVar, cVar, bVar3, aVar3);
            case l1.c.f8509e /* 6 */:
                return k7.w.a(new c0(16));
            case 7:
                SharedPreferences sharedPreferences2 = (SharedPreferences) gVar.f12669g.get();
                sharedPreferences2.getClass();
                return new yd.b(sharedPreferences2);
            case 8:
                Context context4 = gVar.f12663a.f3920a;
                SharedPreferences sharedPreferences3 = context4.getSharedPreferences(f0.a(context4), 0);
                sharedPreferences3.getClass();
                return sharedPreferences3;
            case l1.c.f8508d /* 9 */:
                return new Object();
            case l1.c.f8510f /* 10 */:
                Context context5 = gVar.f12663a.f3920a;
                SharedPreferences sharedPreferences4 = (SharedPreferences) gVar.f12669g.get();
                l7.a aVar4 = new l7.a(13);
                od.c cVar2 = (od.c) gVar.f12668f.get();
                be.c cVar3 = (be.c) gVar.m.get();
                sharedPreferences4.getClass();
                cVar2.getClass();
                cVar3.getClass();
                gd.f fVar = g0.f15015a;
                return new d2(context5, sharedPreferences4, aVar4, cVar2, cVar3, zc.x.a(gd.e.L));
            case 11:
                return new be.a(gVar.f12663a.f3920a, 0);
            case 12:
                Context context6 = gVar.f12663a.f3920a;
                xf.a aVar5 = (xf.a) gVar.f12677p.get();
                aVar5.getClass();
                return new g1(context6, aVar5);
            case 13:
                Context context7 = gVar.f12663a.f3920a;
                be.c cVar4 = (be.c) gVar.m.get();
                d1 d1Var = (d1) gVar.f12676o.get();
                cVar4.getClass();
                d1Var.getClass();
                return new xf.a(context7, cVar4, d1Var);
            case 14:
                Context context8 = gVar.f12663a.f3920a;
                cf.d dVar = (cf.d) gVar.f12675n.get();
                dVar.getClass();
                return new d1(context8, dVar);
            case l1.c.f8512h /* 15 */:
                Context context9 = gVar.f12663a.f3920a;
                ua.h hVar = (ua.h) gVar.f12679r.get();
                cf.d dVar2 = (cf.d) gVar.f12675n.get();
                xf.a aVar6 = (xf.a) gVar.f12677p.get();
                hVar.getClass();
                dVar2.getClass();
                aVar6.getClass();
                return new l0(context9, hVar, dVar2, aVar6);
            case 16:
                wa.e eVar = wa.e.L;
                o oVar = o.DEFAULT;
                ua.a aVar7 = ua.a.IDENTITY;
                HashMap hashMap = new HashMap();
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                ua.c cVar5 = ua.h.f13529h;
                ua.r rVar2 = ua.h.f13530i;
                ua.r rVar3 = ua.h.f13531j;
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayList2.add(new v0(new ji.h()));
                ArrayList arrayList3 = new ArrayList(arrayList2.size() + arrayList.size() + 3);
                arrayList3.addAll(arrayList);
                Collections.reverse(arrayList3);
                ArrayList arrayList4 = new ArrayList(arrayList2);
                Collections.reverse(arrayList4);
                arrayList3.addAll(arrayList4);
                boolean z10 = ab.f.f694a;
                HashMap hashMap2 = new HashMap(hashMap);
                new ArrayList(arrayList);
                new ArrayList(arrayList2);
                return new ua.h(eVar, aVar7, hashMap2, cVar5, oVar, arrayList3, rVar2, rVar3, new ArrayList(arrayDeque));
            case 17:
                return new sd.d(gVar.f12663a.f3920a);
            case 18:
                Context context10 = gVar.f12663a.f3920a;
                a0 a0Var = (a0) gVar.f12682u.get();
                a0Var.getClass();
                qf.b bVar4 = new qf.b(0, a0Var);
                g1 g1Var = (g1) gVar.f12678q.get();
                g1Var.getClass();
                qf.b bVar5 = new qf.b(1, g1Var);
                b9.e eVar2 = new b9.e(context10);
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                ArrayList arrayList7 = new ArrayList();
                ArrayList arrayList8 = new ArrayList();
                ArrayList arrayList9 = new ArrayList();
                arrayList6.add(new yb.j(new j9.a(6), URL.class));
                arrayList8.add(new yb.j(bVar4, oe.a.class));
                arrayList8.add(new yb.j(bVar5, ze.a.class));
                eVar2.R = new b9.b(p7.a.A(arrayList5), p7.a.A(arrayList6), p7.a.A(arrayList7), p7.a.A(arrayList8), p7.a.A(arrayList9));
                p9.a aVar8 = new p9.a(100);
                m9.c cVar6 = (m9.c) eVar2.L;
                eVar2.L = new m9.c(cVar6.f9363a, cVar6.f9364b, cVar6.f9365c, cVar6.f9366d, aVar8, cVar6.f9368f, cVar6.f9369g, cVar6.f9370h, cVar6.f9371i, cVar6.f9372j, cVar6.f9373k, cVar6.f9374l, cVar6.m, cVar6.f9375n, cVar6.f9376o);
                return eVar2.h();
            case 19:
                return new a0(gVar.f12663a.f3920a);
            case 20:
                return new yf.b();
            case 21:
                Context context11 = gVar.f12663a.f3920a;
                if (nc.k.a(Build.MANUFACTURER, "AYN") && nc.k.a(Build.MODEL, "AYN Thor")) {
                    return new sf.c(context11);
                }
                return new sf.c(context11);
            case 22:
                Context applicationContext = gVar.f12663a.f3920a.getApplicationContext();
                a0.b bVar6 = new a0.b(applicationContext, 20);
                a0.b bVar7 = new a0.b(applicationContext, 19);
                ?? threadPoolExecutor = new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new j0(0));
                com.squareup.picasso.g0 g0Var = new com.squareup.picasso.g0(bVar7);
                return new com.squareup.picasso.a0(applicationContext, new com.squareup.picasso.m(applicationContext, threadPoolExecutor, com.squareup.picasso.a0.f3181i, bVar6, bVar7, g0Var), bVar7, g0Var);
            case 23:
                return new sd.h(gVar.f12663a.f3920a);
            case 24:
                return new w1(gVar.f12663a.f3920a);
            case 25:
                Context context12 = gVar.f12663a.f3920a;
                ((com.squareup.picasso.a0) gVar.f12686y.get()).getClass();
                ArrayList arrayList10 = new ArrayList(3);
                TextView.BufferType bufferType = TextView.BufferType.SPANNABLE;
                arrayList10.add(new pb.c());
                arrayList10.add(new ub.a());
                arrayList10.add(new Object());
                if (!arrayList10.isEmpty()) {
                    a4.n nVar = new a4.n(arrayList10);
                    int size = arrayList10.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj = arrayList10.get(i11);
                        i11++;
                        nVar.l((ob.a) obj);
                    }
                    ArrayList arrayList11 = (ArrayList) nVar.L;
                    b9.e eVar3 = new b9.e(25);
                    float f8 = context12.getResources().getDisplayMetrics().density;
                    ?? obj2 = new Object();
                    obj2.f11545d = (int) ((8 * f8) + 0.5f);
                    obj2.f11542a = (int) ((24 * f8) + 0.5f);
                    int i12 = (int) ((4 * f8) + 0.5f);
                    obj2.f11543b = i12;
                    int i13 = (int) ((1 * f8) + 0.5f);
                    obj2.f11544c = i13;
                    obj2.f11546e = i13;
                    obj2.f11547f = i12;
                    ?? obj3 = new Object();
                    ob.d dVar3 = new ob.d(1);
                    ob.d dVar4 = new ob.d(0);
                    int size2 = arrayList11.size();
                    while (i2 < size2) {
                        Object obj4 = arrayList11.get(i2);
                        i2++;
                        ob.a aVar9 = (ob.a) obj4;
                        aVar9.getClass();
                        aVar9.b(obj3);
                        aVar9.d(dVar3);
                        aVar9.c(dVar4);
                    }
                    ?? obj5 = new Object();
                    obj5.f11542a = obj2.f11542a;
                    obj5.f11543b = obj2.f11543b;
                    obj5.f11544c = obj2.f11544c;
                    obj5.f11545d = obj2.f11545d;
                    obj5.f11546e = obj2.f11546e;
                    obj5.f11547f = obj2.f11547f;
                    i0 i0Var = new i0(15, Collections.unmodifiableMap(dVar4.f10873a));
                    obj3.f10863a = obj5;
                    obj3.f10869g = i0Var;
                    if (obj3.f10864b == null) {
                        obj3.f10864b = new Object();
                    }
                    if (obj3.f10865c == null) {
                        obj3.f10865c = new Object();
                    }
                    if (obj3.f10866d == null) {
                        obj3.f10866d = new Object();
                    }
                    if (obj3.f10867e == null) {
                        obj3.f10867e = new l7.a(15);
                    }
                    if (obj3.f10868f == null) {
                        obj3.f10868f = new l7.a(14);
                    }
                    ?? obj6 = new Object();
                    obj6.f10863a = obj3.f10863a;
                    obj6.f10864b = obj3.f10864b;
                    obj6.f10865c = obj3.f10865c;
                    obj6.f10866d = obj3.f10866d;
                    obj6.f10867e = obj3.f10867e;
                    obj6.f10868f = obj3.f10868f;
                    obj6.f10869g = obj3.f10869g;
                    return new ob.c(new b9.e(eVar3), new jb.c(28, dVar3, obj6), Collections.unmodifiableList(arrayList11));
                }
                a0.j.p("No plugins were added to this builder. Use #usePlugin method to add them");
                return null;
            case 26:
                return new sd.i(gVar.f12663a.f3920a);
            case 27:
                Context context13 = gVar.f12663a.f3920a;
                SharedPreferences sharedPreferences5 = (SharedPreferences) gVar.f12669g.get();
                sharedPreferences5.getClass();
                return new x1(context13, sharedPreferences5);
            case 28:
                Context context14 = gVar.f12663a.f3920a;
                cf.d dVar5 = (cf.d) gVar.f12675n.get();
                dVar5.getClass();
                Object systemService = context14.getSystemService(Vibrator.class);
                systemService.getClass();
                Vibrator vibrator = (Vibrator) systemService;
                if (Build.VERSION.SDK_INT >= 26) {
                    bVar = new ce.b(vibrator, 0);
                } else {
                    bVar = new ce.b(vibrator, 1);
                }
                return new ce.c(bVar, dVar5);
            case 29:
                Context context15 = gVar.f12663a.f3920a;
                ua.h hVar2 = (ua.h) gVar.f12679r.get();
                hVar2.getClass();
                return new b1(context15, hVar2);
            case 30:
                Context context16 = gVar.f12663a.f3920a;
                ua.h hVar3 = (ua.h) gVar.f12679r.get();
                hVar3.getClass();
                return new r0(context16, hVar3);
            case 31:
                Context context17 = gVar.f12663a.f3920a;
                cf.d dVar6 = (cf.d) gVar.f12675n.get();
                dVar6.getClass();
                return new kf.c0(context17, dVar6);
            case 32:
                Context context18 = gVar.f12663a.f3920a;
                cf.d dVar7 = (cf.d) gVar.f12675n.get();
                f1 f1Var = (f1) gVar.I.get();
                kf.c0 c0Var = (kf.c0) gVar.H.get();
                dVar7.getClass();
                f1Var.getClass();
                c0Var.getClass();
                return new kf.g(context18, dVar7, f1Var, c0Var);
            case 33:
                return new Object();
            case 34:
                return new vf.b(gVar.f12663a.f3920a);
            case 35:
                cf.d dVar8 = (cf.d) gVar.f12675n.get();
                v1 v1Var = (v1) gVar.L.get();
                be.c cVar7 = (be.c) gVar.m.get();
                dVar8.getClass();
                v1Var.getClass();
                cVar7.getClass();
                return new m0(dVar8, v1Var, cVar7);
            case 36:
                Context context19 = gVar.f12663a.f3920a;
                com.squareup.picasso.a0 a0Var2 = (com.squareup.picasso.a0) gVar.f12686y.get();
                a0Var2.getClass();
                return new v1(context19, a0Var2);
            case 37:
                Context context20 = gVar.f12663a.f3920a;
                w1 w1Var = (w1) gVar.A.get();
                w1Var.getClass();
                return new sf.b(context20, w1Var);
            case 38:
                Context context21 = gVar.f12663a.f3920a;
                b1 b1Var = (b1) gVar.F.get();
                b1Var.getClass();
                return new yh.g(context21, b1Var);
            case 39:
                Context context22 = gVar.f12663a.f3920a;
                ff.a aVar10 = (ff.a) gVar.P.get();
                aVar10.getClass();
                SharedPreferences sharedPreferences6 = context22.getSharedPreferences("preferences-github", 0);
                sharedPreferences6.getClass();
                return new hf.b(context22, aVar10, sharedPreferences6);
            case 40:
                od.c cVar8 = (od.c) gVar.f12668f.get();
                cVar8.getClass();
                ArrayList arrayList12 = new ArrayList();
                ArrayList arrayList13 = new ArrayList();
                vc.f fVar2 = t.f11790d;
                arrayList12.add(new hk.a(p7.n.i("application/json"), new d2.t(13, cVar8)));
                na.a0 a0Var3 = new na.a0(1);
                a0Var3.e(null, "https://api.github.com");
                pi.r b10 = a0Var3.b();
                ArrayList arrayList14 = b10.f11786f;
                if ("".equals(arrayList14.get(arrayList14.size() - 1))) {
                    x xVar2 = new x();
                    gk.a aVar11 = gk.l0.f5744a;
                    gk.b bVar8 = gk.l0.f5746c;
                    ArrayList arrayList15 = new ArrayList(arrayList13);
                    List a10 = bVar8.a(aVar11);
                    arrayList15.addAll(a10);
                    List b11 = bVar8.b();
                    ArrayList arrayList16 = new ArrayList(arrayList12.size() + 1 + b11.size());
                    arrayList16.add(new gk.c(0));
                    arrayList16.addAll(arrayList12);
                    arrayList16.addAll(b11);
                    List unmodifiableList = Collections.unmodifiableList(arrayList16);
                    List unmodifiableList2 = Collections.unmodifiableList(arrayList15);
                    a10.size();
                    x0 x0Var = new x0(xVar2, b10, unmodifiableList, unmodifiableList2, aVar11);
                    if (ff.a.class.isInterface()) {
                        ArrayDeque arrayDeque2 = new ArrayDeque(1);
                        arrayDeque2.add(ff.a.class);
                        while (!arrayDeque2.isEmpty()) {
                            Class cls = (Class) arrayDeque2.removeFirst();
                            if (cls.getTypeParameters().length != 0) {
                                StringBuilder sb2 = new StringBuilder("Type parameters are unsupported on ");
                                sb2.append(cls.getName());
                                if (cls != ff.a.class) {
                                    sb2.append(" which is an interface of ");
                                    sb2.append(ff.a.class.getName());
                                }
                                throw new IllegalArgumentException(sb2.toString());
                            }
                            Collections.addAll(arrayDeque2, cls.getInterfaces());
                        }
                        Object newProxyInstance = Proxy.newProxyInstance(ff.a.class.getClassLoader(), new Class[]{ff.a.class}, new s0(x0Var));
                        newProxyInstance.getClass();
                        return (ff.a) newProxyInstance;
                    }
                    a0.j.h("API declarations must be interfaces.");
                    return null;
                }
                fj.j.r(b10, "baseUrl must end in /: ");
                return null;
            case 41:
                return new jf.b(gVar.f12663a.f3920a);
            default:
                throw new AssertionError(i10);
        }
    }
}

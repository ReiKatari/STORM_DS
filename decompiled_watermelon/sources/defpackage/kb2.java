package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import androidx.recyclerview.widget.RecyclerView;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.CancellationException;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: kb2  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class kb2 implements mi2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ Object B;

    public /* synthetic */ kb2(int i, Object obj) {
        this.A = i;
        this.B = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.mi2
    public final Object n(Object obj) {
        boolean z;
        yh3 yh3Var;
        jk3 jk3Var;
        boolean z2;
        Object kc5Var;
        String str;
        String str2;
        BufferedInputStream bufferedInputStream;
        Bundle bundle;
        Bundle[] bundleArr;
        Throwable th;
        Object obj2;
        Boolean bool;
        boolean z3;
        jb4 jb4Var;
        boolean z4;
        boolean z5;
        int i = this.A;
        float f = RecyclerView.A1;
        Object obj3 = null;
        switch (i) {
            case 0:
                o24 o24Var = (o24) this.B;
                xn4 xn4Var = (xn4) obj;
                Object[] objArr = o24Var.A;
                int i2 = o24Var.L;
                for (int i3 = 0; i3 < i2; i3++) {
                    ((uv3) objArr[i3]).b();
                }
                return o27.a;
            case 1:
                y07 y07Var = (y07) obj;
                return ((qd2) this.B).a(new y07(null, y07Var.b, y07Var.c, y07Var.d, y07Var.e)).getValue();
            case 2:
                am2 am2Var = (am2) this.B;
                v85 v85Var = (v85) obj;
                v85Var.getClass();
                if (am2Var != am2.STABLE_AND_PRERELEASE && v85Var.h) {
                    z = false;
                } else {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 3:
                return Integer.valueOf(((fi3) this.B).d(((Integer) obj).intValue()));
            case 4:
                ki3 ki3Var = (ki3) this.B;
                float f2 = -((Float) obj).floatValue();
                if ((f2 >= RecyclerView.A1 || ki3Var.c()) && (f2 <= RecyclerView.A1 || ki3Var.a())) {
                    if (Math.abs(ki3Var.g) > 0.5f) {
                        pz2.c("entered drag with non-zero pending scroll");
                    }
                    float f3 = ki3Var.g + f2;
                    ki3Var.g = f3;
                    if (Math.abs(f3) > 0.5f) {
                        float f4 = ki3Var.g;
                        int X = jv3.X(f4);
                        yh3 f5 = ((yh3) ki3Var.e.getValue()).f(X, !ki3Var.b);
                        if (f5 != null && (yh3Var = ki3Var.c) != null) {
                            yh3 f6 = yh3Var.f(X, true);
                            if (f6 != null) {
                                ki3Var.c = f6;
                            } else {
                                f5 = null;
                            }
                        }
                        if (f5 != null) {
                            ki3Var.f(f5, ki3Var.b, true);
                            ki3Var.r.setValue(o27.a);
                            ki3Var.i(f4 - ki3Var.g, f5);
                        } else {
                            vf3 vf3Var = ki3Var.j;
                            if (vf3Var != null) {
                                vf3Var.k();
                            }
                            ki3Var.i(f4 - ki3Var.g, ki3Var.h());
                        }
                    }
                    if (Math.abs(ki3Var.g) > 0.5f) {
                        f2 -= ki3Var.g;
                        ki3Var.g = RecyclerView.A1;
                    }
                    f = f2;
                }
                return Float.valueOf(-f);
            case 5:
                ch1 ch1Var = (ch1) obj;
                return new y3(10, (cj3) this.B);
            case ig7.b /* 6 */:
                ch1 ch1Var2 = (ch1) obj;
                return new y3(12, (mj3) this.B);
            case 7:
                hk3 hk3Var = (hk3) this.B;
                return hk3Var.o(((Integer) obj).intValue(), hk3Var.d);
            case 8:
                pk3 pk3Var = (pk3) this.B;
                float f7 = -((Float) obj).floatValue();
                if ((f7 >= RecyclerView.A1 || pk3Var.c()) && (f7 <= RecyclerView.A1 || pk3Var.a())) {
                    if (Math.abs(pk3Var.h) > 0.5f) {
                        pz2.c("entered drag with non-zero pending scroll");
                    }
                    pk3Var.d = true;
                    float f8 = pk3Var.h + f7;
                    pk3Var.h = f8;
                    if (Math.abs(f8) > 0.5f) {
                        float f9 = pk3Var.h;
                        int round = Math.round(f9);
                        jk3 f10 = ((jk3) pk3Var.f.getValue()).f(round, !pk3Var.b);
                        if (f10 != null && (jk3Var = pk3Var.c) != null) {
                            jk3 f11 = jk3Var.f(round, true);
                            if (f11 != null) {
                                pk3Var.c = f11;
                            } else {
                                f10 = null;
                            }
                        }
                        if (f10 != null) {
                            pk3Var.g(f10, pk3Var.b, true);
                            pk3Var.w.setValue(o27.a);
                            pk3Var.k(f9 - pk3Var.h, f10);
                        } else {
                            vf3 vf3Var2 = pk3Var.l;
                            if (vf3Var2 != null) {
                                vf3Var2.k();
                            }
                            pk3Var.k(f9 - pk3Var.h, pk3Var.j());
                        }
                    }
                    if (Math.abs(pk3Var.h) > 0.5f) {
                        f7 -= pk3Var.h;
                        pk3Var.h = RecyclerView.A1;
                    }
                    f = f7;
                }
                return Float.valueOf(-f);
            case 9:
                lt5 lt5Var = (lt5) this.B;
                if (lt5Var != null) {
                    z2 = lt5Var.c(obj);
                } else {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 10:
                Void r1 = (Void) obj;
                return ((xg0) this.B).m;
            case 11:
                return ((ju3) this.B).c(((Integer) obj).intValue());
            case mj2.L /* 12 */:
                String str3 = null;
                iy3 iy3Var = (iy3) this.B;
                qg5 qg5Var = (qg5) obj;
                qg5Var.getClass();
                try {
                    InputStream openInputStream = iy3Var.b.getContentResolver().openInputStream(qg5Var.o());
                    if (openInputStream != null) {
                        if (openInputStream instanceof BufferedInputStream) {
                            bufferedInputStream = (BufferedInputStream) openInputStream;
                        } else {
                            bufferedInputStream = new BufferedInputStream(openInputStream, 8192);
                        }
                        kc5Var = nk2.I(bufferedInputStream);
                        openInputStream.close();
                    } else {
                        kc5Var = null;
                    }
                } catch (Throwable th2) {
                    kc5Var = new kc5(th2);
                }
                if (kc5Var instanceof kc5) {
                    kc5Var = null;
                }
                zo5 zo5Var = (zo5) kc5Var;
                if (zo5Var == null) {
                    return null;
                }
                String m = qg5Var.m();
                String str4 = zo5Var.b;
                String k = qg5Var.k();
                String uri = qg5Var.o().toString();
                uri.getClass();
                String uri2 = qg5Var.n().toString();
                uri2.getClass();
                cs5 m2 = qg5Var.j().m();
                is5 n = qg5Var.j().n();
                UUID k2 = qg5Var.j().k();
                if (k2 != null) {
                    str = k2.toString();
                } else {
                    str = null;
                }
                boolean l = qg5Var.j().l();
                Uri i4 = qg5Var.j().i();
                if (i4 != null) {
                    str2 = i4.toString();
                } else {
                    str2 = null;
                }
                Uri j = qg5Var.j().j();
                if (j != null) {
                    str3 = j.toString();
                }
                return new yl5(m, str4, k, uri, uri2, new yi5(m2, n, str, l, str2, str3), qg5Var.l(), zo5Var.c, zo5Var.d);
            case 13:
                Throwable th3 = (Throwable) obj;
                ((b34) this.B).d(null);
                return o27.a;
            case 14:
                Bundle bundle2 = (Bundle) obj;
                l44 t = sn2.t((Context) this.B);
                if (bundle2 != null) {
                    bundle2.setClassLoader(t.a.getClassLoader());
                }
                s34 s34Var = t.b;
                LinkedHashMap linkedHashMap = s34Var.m;
                if (bundle2 == null) {
                    th = null;
                } else {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            jk2.H("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    s34Var.d = bundle;
                    if (bundle2.containsKey("android-support-nav:controller:backStack")) {
                        bundleArr = (Bundle[]) hk2.B(bundle2, "android-support-nav:controller:backStack").toArray(new Bundle[0]);
                    } else {
                        bundleArr = null;
                    }
                    s34Var.e = bundleArr;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray != null) {
                            ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                            if (stringArrayList != null) {
                                int length = intArray.length;
                                int i5 = 0;
                                int i6 = 0;
                                while (i5 < length) {
                                    int i7 = i6 + 1;
                                    Integer valueOf = Integer.valueOf(intArray[i5]);
                                    LinkedHashMap linkedHashMap2 = s34Var.l;
                                    Object obj4 = obj3;
                                    if (!b53.x(stringArrayList.get(i6), "")) {
                                        obj2 = (String) stringArrayList.get(i6);
                                    } else {
                                        obj2 = obj4;
                                    }
                                    linkedHashMap2.put(valueOf, obj2);
                                    i5++;
                                    i6 = i7;
                                    obj3 = obj4;
                                }
                            } else {
                                jk2.H("android-support-nav:controller:backStackIds");
                                throw null;
                            }
                        } else {
                            jk2.H("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                    }
                    th = obj3;
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 != null) {
                            int size = stringArrayList2.size();
                            int i8 = 0;
                            while (i8 < size) {
                                String str5 = stringArrayList2.get(i8);
                                i8++;
                                String str6 = str5;
                                if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str6)) {
                                    ArrayList B = hk2.B(bundle2, "android-support-nav:controller:backStackStates:" + str6);
                                    xt xtVar = new xt(B.size());
                                    int size2 = B.size();
                                    int i9 = 0;
                                    while (i9 < size2) {
                                        Object obj5 = B.get(i9);
                                        i9++;
                                        xtVar.addLast(new n34((Bundle) obj5));
                                    }
                                    linkedHashMap.put(str6, xtVar);
                                }
                            }
                        } else {
                            jk2.H("android-support-nav:controller:backStackStates");
                            throw th;
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z6 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    if (!z6 && bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) {
                        bool = th;
                    } else {
                        bool = Boolean.valueOf(z6);
                    }
                    if (bool != 0) {
                        z3 = bool.booleanValue();
                    } else {
                        z3 = false;
                    }
                    t.e = z3;
                }
                return t;
            case ig7.e /* 15 */:
                k54 k54Var = (k54) this.B;
                l34 l34Var = (l34) obj;
                l34Var.getClass();
                qg1 qg1Var = l34Var.c0;
                b44 b44Var = l34Var.B;
                if (b44Var == null) {
                    b44Var = null;
                }
                if (b44Var == null) {
                    return null;
                }
                qg1Var.c();
                b44 c = k54Var.c(b44Var);
                if (c == null) {
                    return null;
                }
                if (c.equals(b44Var)) {
                    return l34Var;
                }
                return k54Var.b().b(c, c.b(qg1Var.c()));
            case 16:
                ro0 ro0Var = (ro0) obj;
                ro0Var.getClass();
                List list = ((d94) this.B).b;
                list.getClass();
                ro0Var.b = list;
                return o27.a;
            case 17:
                ea4 ea4Var = (ea4) obj;
                ea4Var.getClass();
                ba4 ba4Var = ea4Var.a;
                ((ra4) this.B).getClass();
                jb4 jb4Var2 = ba4Var.o;
                lb4 lb4Var = ba4Var.p;
                int i10 = ia4.b[jb4Var2.ordinal()];
                if (i10 != 1 && i10 != 2) {
                    if (i10 == 3) {
                        if (ba4Var.g) {
                            jb4Var = jb4.HARDCORE;
                        } else {
                            jb4Var = jb4.SOFTCORE;
                        }
                    } else {
                        i.c();
                        return null;
                    }
                } else {
                    jb4Var = ba4Var.o;
                }
                int i11 = ia4.c[lb4Var.ordinal()];
                if (i11 != 1 && i11 != 2) {
                    if (i11 == 3) {
                        lb4Var = lb4.OFFLINE_AFTER_START;
                    } else {
                        i.c();
                        return null;
                    }
                }
                lb4 lb4Var2 = lb4Var;
                long j2 = ba4Var.b;
                String str7 = ba4Var.c;
                String str8 = ba4Var.d;
                long j3 = ba4Var.e;
                long j4 = ba4Var.f;
                if (jb4Var == jb4.HARDCORE) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                String str9 = ba4Var.h;
                long j5 = ba4Var.i;
                long j6 = ba4Var.j;
                long j7 = ba4Var.k;
                if (!ba4Var.q && ba4Var.a != ga4.ACHIEVEMENT_UNLOCK) {
                    z5 = false;
                } else {
                    z5 = true;
                }
                return new hb4(j2, str7, str8, j3, j4, z4, str9, j5, j6, j7, jb4Var, lb4Var2, z5);
            case 18:
                float floatValue = ((Float) obj).floatValue();
                ya1 ya1Var = ((pi4) this.B).b;
                if (ya1Var.p() != 0) {
                    f = floatValue / ya1Var.p();
                }
                ya1Var.q.i(ya1Var.j(ya1Var.k() + jv3.X(f)));
                return o27.a;
            case 19:
                rf5 rf5Var = (rf5) obj;
                rf5Var.getClass();
                rf5Var.k(((Number) ((ae6) this.B).getValue()).floatValue());
                return o27.a;
            case 20:
                h06 h06Var = (h06) this.B;
                int intValue = ((Integer) obj).intValue();
                return h06Var.e(intValue) + ": " + h06Var.j(intValue).b();
            case 21:
                ro0 ro0Var2 = (ro0) obj;
                ro0Var2.getClass();
                ro0.a(ro0Var2, "type", yg6.b);
                ro0.a(ro0Var2, "value", oo2.u("kotlinx.serialization.Polymorphic<" + ((bq4) this.B).a.c() + '>', l06.h, new h06[0]));
                ro0Var2.b = pp1.A;
                return o27.a;
            case 22:
                ((xt) ((r9) this.B).e).addLast(obj);
                return o27.a;
            case 23:
                Throwable th4 = (Throwable) obj;
                gs0 gs0Var = ((za5) this.B).b;
                o27 o27Var = o27.a;
                gs0Var.c0(o27Var);
                return o27Var;
            case 24:
                m8 m8Var = (m8) obj;
                m8Var.getClass();
                ((q60) ((ww4) this.B).e.Y).c(new xa5(m8Var));
                return o27.a;
            case 25:
                ((xt) ((ka) this.B).Z).addLast(obj);
                return o27.a;
            case 26:
                rf5 rf5Var2 = (rf5) obj;
                rf5Var2.t(((ex4) this.B).e.h() - Float.intBitsToFloat((int) (rf5Var2.i0 & 4294967295L)));
                return o27.a;
            case 27:
                ((iv0) this.B).y(obj);
                return o27.a;
            case 28:
                s55 s55Var = (s55) this.B;
                Throwable th5 = (Throwable) obj;
                CancellationException cancellationException = new CancellationException("Recomposer effect job completed");
                cancellationException.initCause(th5);
                synchronized (s55Var.c) {
                    try {
                        c63 c63Var = s55Var.d;
                        if (c63Var != null) {
                            s55Var.u.k(p55.ShuttingDown);
                            c63Var.i(cancellationException);
                            s55Var.r = null;
                            c63Var.R(new zr4(4, s55Var, th5));
                        } else {
                            s55Var.e = cancellationException;
                            s55Var.u.k(p55.ShutDown);
                        }
                    } finally {
                    }
                }
                return o27.a;
            default:
                ((v55) this.B).a((tn1) obj);
                return o27.a;
        }
    }

    public /* synthetic */ kb2(int i, Object obj, Object obj2) {
        this.A = i;
        this.B = obj;
    }
}

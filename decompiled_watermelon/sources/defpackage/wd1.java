package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wd1  reason: default package */
/* loaded from: classes.dex */
public final class wd1 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, ms5, dz4] */
    public wd1(k81 k81Var, io1 io1Var, h4 h4Var) {
        int i;
        xw0 xw0Var;
        Object obj;
        this.a = 2;
        rq5 rq5Var = k81Var.g;
        ui6 ui6Var = k81Var.c;
        ms5 ms5Var = k81Var.p;
        String str = k81Var.b;
        this.d = k81Var;
        this.e = io1Var;
        Object obj2 = k81Var.e;
        this.f = obj2 == null ? pp1.A : obj2;
        if (ms5Var == null) {
            if (ui6Var != null) {
                Context context = k81Var.a;
                context.getClass();
                vi6 a = ui6Var.a(new ti6(context, str, new sb(this, io1Var.a), false, false));
                this.h = a;
                a.getClass();
                ?? obj3 = new Object();
                obj3.A = a;
                this.g = new fk4(obj3, str == null ? ":memory:" : str, h4Var);
            } else {
                i.i("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
        } else {
            this.h = null;
            if (ms5Var.k()) {
                obj = new fk4(new q03(this, ms5Var), str == null ? ":memory:" : str, h4Var);
            } else {
                if (str == null) {
                    xw0Var = new xw0(new q03(this, ms5Var));
                } else {
                    q03 q03Var = new q03(this, ms5Var);
                    rq5Var.getClass();
                    int[] iArr = x00.a;
                    int i2 = iArr[rq5Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i = 4;
                        } else {
                            throw new IllegalStateException(("Can't get max number of reader for journal mode '" + rq5Var + '\'').toString());
                        }
                    } else {
                        i = 1;
                    }
                    int i3 = iArr[rq5Var.ordinal()];
                    if (i3 != 1 && i3 != 2) {
                        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + rq5Var + '\'').toString());
                    }
                    xw0Var = new xw0(q03Var, str, i);
                }
                obj = xw0Var;
            }
            this.g = obj;
        }
        boolean z = rq5Var == rq5.WRITE_AHEAD_LOGGING;
        vi6 vi6Var = (vi6) this.h;
        if (vi6Var != null) {
            vi6Var.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void a(wd1 wd1Var, ls5 ls5Var) {
        Object kc5Var;
        io1 io1Var = (io1) wd1Var.e;
        f(ls5Var);
        k81 k81Var = (k81) wd1Var.d;
        rq5 rq5Var = k81Var.g;
        rq5 rq5Var2 = rq5.WRITE_AHEAD_LOGGING;
        if (rq5Var == rq5Var2) {
            yf2.o(ls5Var, "PRAGMA journal_mode = WAL");
        } else {
            yf2.o(ls5Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (k81Var.g == rq5Var2) {
            yf2.o(ls5Var, "PRAGMA synchronous = NORMAL");
        } else {
            yf2.o(ls5Var, "PRAGMA synchronous = FULL");
        }
        ns5 i0 = ls5Var.i0("PRAGMA user_version");
        try {
            i0.a0();
            int i = (int) i0.getLong(0);
            iq2.h(i0, null);
            int i2 = io1Var.a;
            if (i != i2) {
                yf2.o(ls5Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        wd1Var.j(ls5Var);
                    } else {
                        wd1Var.k(ls5Var, i, i2);
                    }
                    yf2.o(ls5Var, "PRAGMA user_version = " + i2);
                    kc5Var = o27.a;
                } catch (Throwable th) {
                    kc5Var = new kc5(th);
                }
                if (!(kc5Var instanceof kc5)) {
                    o27 o27Var = (o27) kc5Var;
                    yf2.o(ls5Var, "END TRANSACTION");
                }
                Throwable a = nc5.a(kc5Var);
                if (a != null) {
                    yf2.o(ls5Var, "ROLLBACK TRANSACTION");
                    throw a;
                }
            }
            wd1Var.l(ls5Var);
        } finally {
        }
    }

    public static void f(ls5 ls5Var) {
        ns5 i0 = ls5Var.i0("PRAGMA busy_timeout");
        try {
            i0.a0();
            long j = i0.getLong(0);
            iq2.h(i0, null);
            if (j < 3000) {
                yf2.o(ls5Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq2.h(i0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [as5, java.lang.Object] */
    public void b(yd1 yd1Var, int i, ArrayList arrayList, as5 as5Var) {
        be7 be7Var = yd1Var.d;
        as5 as5Var2 = be7Var.c;
        yd1 yd1Var2 = be7Var.i;
        yd1 yd1Var3 = be7Var.h;
        if (as5Var2 == null) {
            hz0 hz0Var = (hz0) this.d;
            if (be7Var != hz0Var.d) {
                as5 as5Var3 = as5Var;
                if (be7Var != hz0Var.e) {
                    if (as5Var == null) {
                        ?? obj = new Object();
                        obj.a = null;
                        obj.b = new ArrayList();
                        obj.a = be7Var;
                        arrayList.add(obj);
                        as5Var3 = obj;
                    }
                    be7Var.c = as5Var3;
                    as5Var3.b.add(be7Var);
                    ArrayList arrayList2 = yd1Var3.k;
                    int size = arrayList2.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        ud1 ud1Var = (ud1) obj2;
                        if (ud1Var instanceof yd1) {
                            b((yd1) ud1Var, i, arrayList, as5Var3);
                        }
                    }
                    ArrayList arrayList3 = yd1Var2.k;
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj3 = arrayList3.get(i4);
                        i4++;
                        ud1 ud1Var2 = (ud1) obj3;
                        if (ud1Var2 instanceof yd1) {
                            b((yd1) ud1Var2, i, arrayList, as5Var3);
                        }
                    }
                    if (i == 1 && (be7Var instanceof m87)) {
                        ArrayList arrayList4 = ((m87) be7Var).k.k;
                        int size3 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj4 = arrayList4.get(i5);
                            i5++;
                            ud1 ud1Var3 = (ud1) obj4;
                            if (ud1Var3 instanceof yd1) {
                                b((yd1) ud1Var3, i, arrayList, as5Var3);
                            }
                        }
                    }
                    ArrayList arrayList5 = yd1Var3.l;
                    int size4 = arrayList5.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Object obj5 = arrayList5.get(i6);
                        i6++;
                        b((yd1) obj5, i, arrayList, as5Var3);
                    }
                    ArrayList arrayList6 = yd1Var2.l;
                    int size5 = arrayList6.size();
                    int i7 = 0;
                    while (i7 < size5) {
                        Object obj6 = arrayList6.get(i7);
                        i7++;
                        b((yd1) obj6, i, arrayList, as5Var3);
                    }
                    if (i == 1 && (be7Var instanceof m87)) {
                        ArrayList arrayList7 = ((m87) be7Var).k.l;
                        int size6 = arrayList7.size();
                        while (i2 < size6) {
                            Object obj7 = arrayList7.get(i2);
                            i2++;
                            b((yd1) obj7, i, arrayList, as5Var3);
                        }
                    }
                }
            }
        }
    }

    public void c(hz0 hz0Var) {
        float f;
        ArrayList arrayList;
        fz0 fz0Var;
        fz0 fz0Var2;
        fz0 fz0Var3;
        fz0 fz0Var4;
        ArrayList arrayList2 = hz0Var.t0;
        int size = arrayList2.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            gz0 gz0Var = (gz0) obj;
            fz0[] fz0VarArr = gz0Var.T;
            cy0[] cy0VarArr = gz0Var.Q;
            cy0 cy0Var = gz0Var.L;
            cy0 cy0Var2 = gz0Var.J;
            cy0 cy0Var3 = gz0Var.K;
            cy0 cy0Var4 = gz0Var.I;
            fz0 fz0Var5 = fz0VarArr[c];
            fz0 fz0Var6 = fz0VarArr[1];
            if (gz0Var.h0 == 8) {
                gz0Var.a = true;
            } else {
                float f2 = gz0Var.w;
                char c2 = c;
                if (f2 < 1.0f) {
                    f = 1.0f;
                    if (fz0Var5 == fz0.MATCH_CONSTRAINT) {
                        gz0Var.r = 2;
                    }
                } else {
                    f = 1.0f;
                }
                float f3 = gz0Var.z;
                if (f3 < f && fz0Var6 == fz0.MATCH_CONSTRAINT) {
                    gz0Var.s = 2;
                }
                if (gz0Var.X > RecyclerView.A1) {
                    fz0 fz0Var7 = fz0.MATCH_CONSTRAINT;
                    if (fz0Var5 != fz0Var7 || (fz0Var6 != fz0.WRAP_CONTENT && fz0Var6 != fz0.FIXED)) {
                        int i2 = 3;
                        if (fz0Var6 == fz0Var7) {
                            if (fz0Var5 != fz0.WRAP_CONTENT && fz0Var5 != fz0.FIXED) {
                                i2 = 3;
                            } else {
                                gz0Var.s = 3;
                            }
                        }
                        if (fz0Var5 == fz0Var7 && fz0Var6 == fz0Var7) {
                            if (gz0Var.r == 0) {
                                gz0Var.r = i2;
                            }
                            if (gz0Var.s == 0) {
                                gz0Var.s = i2;
                            }
                        }
                    } else {
                        gz0Var.r = 3;
                    }
                }
                fz0 fz0Var8 = fz0.MATCH_CONSTRAINT;
                if (fz0Var5 == fz0Var8) {
                    arrayList = arrayList2;
                    if (gz0Var.r == 1 && (cy0Var4.f == null || cy0Var3.f == null)) {
                        fz0Var5 = fz0.WRAP_CONTENT;
                    }
                } else {
                    arrayList = arrayList2;
                }
                if (fz0Var6 == fz0Var8 && gz0Var.s == 1 && (cy0Var2.f == null || cy0Var.f == null)) {
                    fz0Var6 = fz0.WRAP_CONTENT;
                }
                ks2 ks2Var = gz0Var.d;
                ks2Var.d = fz0Var5;
                int i3 = gz0Var.r;
                ks2Var.a = i3;
                m87 m87Var = gz0Var.e;
                m87Var.d = fz0Var6;
                int i4 = size;
                int i5 = gz0Var.s;
                m87Var.a = i5;
                fz0 fz0Var9 = fz0.MATCH_PARENT;
                if ((fz0Var5 != fz0Var9 && fz0Var5 != fz0.FIXED && fz0Var5 != fz0.WRAP_CONTENT) || (fz0Var6 != fz0Var9 && fz0Var6 != fz0.FIXED && fz0Var6 != fz0.WRAP_CONTENT)) {
                    if (fz0Var5 != fz0Var8 || (fz0Var6 != (fz0Var4 = fz0.WRAP_CONTENT) && fz0Var6 != fz0.FIXED)) {
                        fz0Var = fz0Var6;
                    } else if (i3 == 3) {
                        if (fz0Var6 == fz0Var4) {
                            h(gz0Var, fz0Var4, 0, fz0Var4, 0);
                        }
                        int l = gz0Var.l();
                        fz0 fz0Var10 = fz0.FIXED;
                        h(gz0Var, fz0Var10, (int) ((l * gz0Var.X) + 0.5f), fz0Var10, l);
                        gz0Var.d.e.d(gz0Var.r());
                        gz0Var.e.e.d(gz0Var.l());
                        gz0Var.a = true;
                    } else if (i3 == 1) {
                        h(gz0Var, fz0Var4, 0, fz0Var6, 0);
                        gz0Var.d.e.m = gz0Var.r();
                    } else {
                        fz0Var = fz0Var6;
                        if (i3 == 2) {
                            fz0 fz0Var11 = hz0Var.T[c2];
                            fz0 fz0Var12 = fz0.FIXED;
                            if (fz0Var11 == fz0Var12 || fz0Var11 == fz0Var9) {
                                h(gz0Var, fz0Var12, (int) ((f2 * hz0Var.r()) + 0.5f), fz0Var, gz0Var.l());
                                gz0Var.d.e.d(gz0Var.r());
                                gz0Var.e.e.d(gz0Var.l());
                                gz0Var.a = true;
                            }
                        } else if (cy0VarArr[c2].f == null || cy0VarArr[1].f == null) {
                            h(gz0Var, fz0Var4, 0, fz0Var, 0);
                            gz0Var.d.e.d(gz0Var.r());
                            gz0Var.e.e.d(gz0Var.l());
                            gz0Var.a = true;
                        }
                    }
                    if (fz0Var != fz0Var8 || (fz0Var5 != (fz0Var3 = fz0.WRAP_CONTENT) && fz0Var5 != fz0.FIXED)) {
                        fz0Var2 = fz0Var;
                    } else if (i5 == 3) {
                        if (fz0Var5 == fz0Var3) {
                            h(gz0Var, fz0Var3, 0, fz0Var3, 0);
                        }
                        int r = gz0Var.r();
                        float f4 = gz0Var.X;
                        if (gz0Var.Y == -1) {
                            f4 = f / f4;
                        }
                        fz0 fz0Var13 = fz0.FIXED;
                        h(gz0Var, fz0Var13, r, fz0Var13, (int) ((r * f4) + 0.5f));
                        gz0Var.d.e.d(gz0Var.r());
                        gz0Var.e.e.d(gz0Var.l());
                        gz0Var.a = true;
                    } else if (i5 == 1) {
                        h(gz0Var, fz0Var5, 0, fz0Var3, 0);
                        gz0Var.e.e.m = gz0Var.l();
                    } else {
                        fz0 fz0Var14 = fz0Var5;
                        if (i5 == 2) {
                            fz0 fz0Var15 = hz0Var.T[1];
                            fz0Var2 = fz0Var;
                            fz0 fz0Var16 = fz0.FIXED;
                            if (fz0Var15 != fz0Var16 && fz0Var15 != fz0Var9) {
                                fz0Var5 = fz0Var14;
                            } else {
                                h(gz0Var, fz0Var14, gz0Var.r(), fz0Var16, (int) ((f3 * hz0Var.l()) + 0.5f));
                                gz0Var.d.e.d(gz0Var.r());
                                gz0Var.e.e.d(gz0Var.l());
                                gz0Var.a = true;
                            }
                        } else {
                            fz0Var5 = fz0Var14;
                            fz0Var2 = fz0Var;
                            if (cy0VarArr[2].f == null || cy0VarArr[3].f == null) {
                                h(gz0Var, fz0Var3, 0, fz0Var2, 0);
                                gz0Var.d.e.d(gz0Var.r());
                                gz0Var.e.e.d(gz0Var.l());
                                gz0Var.a = true;
                            }
                        }
                    }
                    if (fz0Var5 == fz0Var8 && fz0Var2 == fz0Var8) {
                        if (i3 != 1 && i5 != 1) {
                            if (i5 == 2 && i3 == 2) {
                                fz0[] fz0VarArr2 = hz0Var.T;
                                fz0 fz0Var17 = fz0VarArr2[c2];
                                fz0 fz0Var18 = fz0.FIXED;
                                if (fz0Var17 == fz0Var18 && fz0VarArr2[1] == fz0Var18) {
                                    h(gz0Var, fz0Var18, (int) ((f2 * hz0Var.r()) + 0.5f), fz0Var18, (int) ((f3 * hz0Var.l()) + 0.5f));
                                    gz0Var.d.e.d(gz0Var.r());
                                    gz0Var.e.e.d(gz0Var.l());
                                    gz0Var.a = true;
                                }
                            }
                        } else {
                            fz0 fz0Var19 = fz0.WRAP_CONTENT;
                            h(gz0Var, fz0Var19, 0, fz0Var19, 0);
                            gz0Var.d.e.m = gz0Var.r();
                            gz0Var.e.e.m = gz0Var.l();
                        }
                    }
                } else {
                    int r2 = gz0Var.r();
                    if (fz0Var5 == fz0Var9) {
                        r2 = (hz0Var.r() - cy0Var4.g) - cy0Var3.g;
                        fz0Var5 = fz0.FIXED;
                    }
                    int l2 = gz0Var.l();
                    if (fz0Var6 == fz0Var9) {
                        l2 = (hz0Var.l() - cy0Var2.g) - cy0Var.g;
                        fz0Var6 = fz0.FIXED;
                    }
                    h(gz0Var, fz0Var5, r2, fz0Var6, l2);
                    gz0Var.d.e.d(gz0Var.r());
                    gz0Var.e.e.d(gz0Var.l());
                    gz0Var.a = true;
                }
                c = c2;
                arrayList2 = arrayList;
                size = i4;
                i = i;
            }
        }
    }

    public void d() {
        hz0 hz0Var = (hz0) this.d;
        ArrayList arrayList = (ArrayList) this.g;
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        hz0 hz0Var2 = (hz0) this.e;
        hz0Var2.d.f();
        hz0Var2.e.f();
        arrayList2.add(hz0Var2.d);
        arrayList2.add(hz0Var2.e);
        ArrayList arrayList3 = hz0Var2.t0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            gz0 gz0Var = (gz0) obj;
            if (gz0Var instanceof yo2) {
                be7 be7Var = new be7(gz0Var);
                gz0Var.d.f();
                gz0Var.e.f();
                be7Var.f = ((yo2) gz0Var).x0;
                arrayList2.add(be7Var);
            } else {
                if (gz0Var.y()) {
                    if (gz0Var.b == null) {
                        gz0Var.b = new bj0(gz0Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gz0Var.b);
                } else {
                    arrayList2.add(gz0Var.d);
                }
                if (gz0Var.z()) {
                    if (gz0Var.c == null) {
                        gz0Var.c = new bj0(gz0Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(gz0Var.c);
                } else {
                    arrayList2.add(gz0Var.e);
                }
                if (gz0Var instanceof fr2) {
                    arrayList2.add(new be7(gz0Var));
                }
            }
        }
        if (hashSet != null) {
            arrayList2.addAll(hashSet);
        }
        int size2 = arrayList2.size();
        int i2 = 0;
        while (i2 < size2) {
            Object obj2 = arrayList2.get(i2);
            i2++;
            ((be7) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            be7 be7Var2 = (be7) obj3;
            if (be7Var2.b != hz0Var2) {
                be7Var2.d();
            }
        }
        arrayList.clear();
        g(hz0Var.d, 0, arrayList);
        g(hz0Var.e, 1, arrayList);
        this.b = false;
    }

    public int e(hz0 hz0Var, int i) {
        be7 be7Var;
        be7 be7Var2;
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        hz0 hz0Var2 = hz0Var;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long j4 = 0;
        while (i3 < size) {
            be7 be7Var3 = ((as5) arrayList2.get(i3)).a;
            if (!(be7Var3 instanceof bj0) ? !(i != 0 ? (be7Var3 instanceof m87) : (be7Var3 instanceof ks2)) : ((bj0) be7Var3).f != i) {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            } else {
                if (i == 0) {
                    be7Var = hz0Var2.d;
                } else {
                    be7Var = hz0Var2.e;
                }
                yd1 yd1Var = be7Var.h;
                if (i == 0) {
                    be7Var2 = hz0Var2.d;
                } else {
                    be7Var2 = hz0Var2.e;
                }
                yd1 yd1Var2 = be7Var2.i;
                yd1 yd1Var3 = be7Var3.h;
                yd1 yd1Var4 = be7Var3.i;
                boolean contains = yd1Var3.l.contains(yd1Var);
                boolean contains2 = yd1Var4.l.contains(yd1Var2);
                long j5 = be7Var3.j();
                if (contains && contains2) {
                    long b = as5.b(yd1Var3, j3);
                    arrayList = arrayList2;
                    long a = as5.a(yd1Var4, j3);
                    long j6 = b - j5;
                    int i4 = yd1Var4.f;
                    i2 = i3;
                    if (j6 >= (-i4)) {
                        j6 += i4;
                    }
                    long j7 = yd1Var3.f;
                    long j8 = ((-a) - j5) - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    gz0 gz0Var = be7Var3.b;
                    if (i == 0) {
                        f = gz0Var.e0;
                    } else if (i == 1) {
                        f = gz0Var.f0;
                    } else {
                        gz0Var.getClass();
                        f = -1.0f;
                    }
                    if (f > RecyclerView.A1) {
                        j2 = (((float) j6) / (1.0f - f)) + (((float) j8) / f);
                    } else {
                        j2 = 0;
                    }
                    float f2 = (float) j2;
                    j = (yd1Var3.f + ((((f2 * f) + 0.5f) + j5) + b31.a(1.0f, f, f2, 0.5f))) - yd1Var4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (contains) {
                        j = Math.max(as5.b(yd1Var3, yd1Var3.f), yd1Var3.f + j5);
                    } else if (contains2) {
                        j = Math.max(-as5.a(yd1Var4, yd1Var4.f), (-yd1Var4.f) + j5);
                    } else {
                        j = (be7Var3.j() + yd1Var3.f) - yd1Var4.f;
                    }
                }
            }
            j4 = Math.max(j4, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            hz0Var2 = hz0Var;
            j3 = 0;
        }
        return (int) j4;
    }

    public void g(be7 be7Var, int i, ArrayList arrayList) {
        yd1 yd1Var = be7Var.h;
        yd1 yd1Var2 = be7Var.i;
        ArrayList arrayList2 = yd1Var.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            ud1 ud1Var = (ud1) obj;
            if (ud1Var instanceof yd1) {
                b((yd1) ud1Var, i, arrayList, null);
            } else if (ud1Var instanceof be7) {
                b(((be7) ud1Var).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = yd1Var2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            ud1 ud1Var2 = (ud1) obj2;
            if (ud1Var2 instanceof yd1) {
                b((yd1) ud1Var2, i, arrayList, null);
            } else if (ud1Var2 instanceof be7) {
                b(((be7) ud1Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((m87) be7Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                ud1 ud1Var3 = (ud1) obj3;
                if (ud1Var3 instanceof yd1) {
                    b((yd1) ud1Var3, i, arrayList, null);
                }
            }
        }
    }

    public void h(gz0 gz0Var, fz0 fz0Var, int i, fz0 fz0Var2, int i2) {
        k10 k10Var = (k10) this.i;
        k10Var.a = fz0Var;
        k10Var.b = fz0Var2;
        k10Var.c = i;
        k10Var.d = i2;
        ((ky0) this.h).b(gz0Var, k10Var);
        gz0Var.P(k10Var.e);
        gz0Var.M(k10Var.f);
        gz0Var.E = k10Var.h;
        gz0Var.J(k10Var.g);
    }

    public void i() {
        boolean z;
        boolean z2;
        wd1 wd1Var;
        c10 c10Var;
        ArrayList arrayList = ((hz0) this.d).t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            gz0 gz0Var = (gz0) obj;
            if (!gz0Var.a) {
                fz0[] fz0VarArr = gz0Var.T;
                fz0 fz0Var = fz0VarArr[0];
                fz0 fz0Var2 = fz0VarArr[1];
                int i2 = gz0Var.r;
                int i3 = gz0Var.s;
                fz0 fz0Var3 = fz0.WRAP_CONTENT;
                if (fz0Var != fz0Var3 && (fz0Var != fz0.MATCH_CONSTRAINT || i2 != 1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (fz0Var2 != fz0Var3 && (fz0Var2 != fz0.MATCH_CONSTRAINT || i3 != 1)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                nf1 nf1Var = gz0Var.d.e;
                boolean z3 = nf1Var.j;
                nf1 nf1Var2 = gz0Var.e.e;
                boolean z4 = nf1Var2.j;
                if (z3 && z4) {
                    fz0 fz0Var4 = fz0.FIXED;
                    wd1Var = this;
                    wd1Var.h(gz0Var, fz0Var4, nf1Var.g, fz0Var4, nf1Var2.g);
                    gz0Var.a = true;
                } else {
                    if (z3 && z2) {
                        this.h(gz0Var, fz0.FIXED, nf1Var.g, fz0Var3, nf1Var2.g);
                        fz0 fz0Var5 = fz0.MATCH_CONSTRAINT;
                        m87 m87Var = gz0Var.e;
                        if (fz0Var2 == fz0Var5) {
                            m87Var.e.m = gz0Var.l();
                        } else {
                            m87Var.e.d(gz0Var.l());
                            gz0Var.a = true;
                        }
                    } else if (z4 && z) {
                        wd1Var = this;
                        wd1Var.h(gz0Var, fz0Var3, nf1Var.g, fz0.FIXED, nf1Var2.g);
                        fz0 fz0Var6 = fz0.MATCH_CONSTRAINT;
                        ks2 ks2Var = gz0Var.d;
                        if (fz0Var == fz0Var6) {
                            ks2Var.e.m = gz0Var.r();
                        } else {
                            ks2Var.e.d(gz0Var.r());
                            gz0Var.a = true;
                        }
                    }
                    wd1Var = this;
                }
                if (gz0Var.a && (c10Var = gz0Var.e.l) != null) {
                    c10Var.d(gz0Var.b0);
                }
                this = wd1Var;
            }
        }
    }

    public void j(ls5 ls5Var) {
        io1 io1Var = (io1) this.e;
        ls5Var.getClass();
        ns5 i0 = ls5Var.i0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (i0.a0()) {
                if (i0.getLong(0) == 0) {
                    z = true;
                }
            }
            iq2.h(i0, null);
            io1Var.a(ls5Var);
            if (!z) {
                i40 v = io1Var.v(ls5Var);
                if (!v.A) {
                    c44.y((String) v.B, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            m(ls5Var);
            io1Var.r(ls5Var);
            for (qq5 qq5Var : (List) this.f) {
                qq5Var.getClass();
                if (ls5Var instanceof si6) {
                    qq5Var.a(((si6) ls5Var).A);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                iq2.h(i0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x00a4 A[EDGE_INSN: B:126:0x00a4->B:39:0x00a4 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01c2  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void k(defpackage.ls5 r17, int r18, int r19) {
        /*
            Method dump skipped, instructions count: 487
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd1.k(ls5, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void l(defpackage.ls5 r11) {
        /*
            Method dump skipped, instructions count: 261
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wd1.l(ls5):void");
    }

    public void m(ls5 ls5Var) {
        yf2.o(ls5Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        yf2.o(ls5Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((io1) this.e).b) + "')");
    }

    public String toString() {
        switch (this.a) {
            case 1:
                Map map = (Map) this.i;
                Long l = (Long) this.h;
                Long l2 = (Long) this.g;
                Long l3 = (Long) this.f;
                Long l4 = (Long) this.e;
                ArrayList arrayList = new ArrayList();
                if (this.b) {
                    arrayList.add("isRegularFile");
                }
                if (this.c) {
                    arrayList.add("isDirectory");
                }
                if (l4 != null) {
                    arrayList.add("byteCount=" + l4.longValue());
                }
                if (l3 != null) {
                    arrayList.add("createdAt=" + l3.longValue());
                }
                if (l2 != null) {
                    arrayList.add("lastModifiedAt=" + l2.longValue());
                }
                if (l != null) {
                    arrayList.add("lastAccessedAt=" + l.longValue());
                }
                if (!map.isEmpty()) {
                    arrayList.add("extras=" + map);
                }
                return tq0.S0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ wd1() {
        this.a = 0;
    }

    public wd1(k81 k81Var, nh5 nh5Var, h4 h4Var) {
        this.a = 2;
        this.d = k81Var;
        this.e = new io1("", -1, "");
        List list = k81Var.e;
        pp1 pp1Var = pp1.A;
        this.f = list == null ? pp1Var : list;
        tq0.Y0(list == null ? pp1Var : list, new wo0(new n95(7, this)));
        Context context = k81Var.a;
        e81 e81Var = k81Var.d;
        rq5 rq5Var = k81Var.g;
        Executor executor = k81Var.h;
        Executor executor2 = k81Var.i;
        List list2 = k81Var.m;
        List list3 = k81Var.n;
        context.getClass();
        e81Var.getClass();
        rq5Var.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        throw new c84(0);
    }

    public wd1(boolean z, boolean z2, jk4 jk4Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = 1;
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = jk4Var;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = zt3.r0(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wd1(boolean z, boolean z2, jk4 jk4Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, jk4Var, l, l2, l3, l4, qp1.A);
        this.a = 1;
    }
}

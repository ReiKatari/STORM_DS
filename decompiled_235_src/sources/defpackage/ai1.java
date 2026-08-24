package defpackage;

import android.content.Context;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.Executor;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ai1  reason: default package */
/* loaded from: classes.dex */
public final class ai1 {
    public final /* synthetic */ int a;
    public boolean b;
    public boolean c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;

    /* JADX WARN: Type inference failed for: r0v1, types: [s35, f36, java.lang.Object] */
    public ai1(bc1 bc1Var, ts1 ts1Var, h4 h4Var) {
        int i;
        uz0 uz0Var;
        Object obj;
        this.a = 2;
        l16 l16Var = bc1Var.g;
        ou6 ou6Var = bc1Var.c;
        f36 f36Var = bc1Var.p;
        String str = bc1Var.b;
        this.d = bc1Var;
        this.e = ts1Var;
        Object obj2 = bc1Var.e;
        this.f = obj2 == null ? yt1.A : obj2;
        if (f36Var == null) {
            if (ou6Var != null) {
                Context context = bc1Var.a;
                context.getClass();
                pu6 f = ou6Var.f(new nu6(context, str, new zb(this, ts1Var.a), false, false));
                this.h = f;
                f.getClass();
                ?? obj3 = new Object();
                obj3.A = f;
                this.g = new ht4(obj3, str == null ? ":memory:" : str, h4Var);
            } else {
                i.h("SQLiteManager was constructed with both null driver and open helper factory!");
                throw null;
            }
        } else {
            this.h = null;
            if (f36Var.m()) {
                obj = new ht4(new u63(this, f36Var), str == null ? ":memory:" : str, h4Var);
            } else {
                if (str == null) {
                    uz0Var = new uz0(new u63(this, f36Var));
                } else {
                    u63 u63Var = new u63(this, f36Var);
                    l16Var.getClass();
                    int[] iArr = r20.a;
                    int i2 = iArr[l16Var.ordinal()];
                    if (i2 != 1) {
                        if (i2 == 2) {
                            i = 4;
                        } else {
                            throw new IllegalStateException(("Can't get max number of reader for journal mode '" + l16Var + '\'').toString());
                        }
                    } else {
                        i = 1;
                    }
                    int i3 = iArr[l16Var.ordinal()];
                    if (i3 != 1 && i3 != 2) {
                        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + l16Var + '\'').toString());
                    }
                    uz0Var = new uz0(u63Var, str, i);
                }
                obj = uz0Var;
            }
            this.g = obj;
        }
        boolean z = l16Var == l16.WRITE_AHEAD_LOGGING;
        pu6 pu6Var = (pu6) this.h;
        if (pu6Var != null) {
            pu6Var.setWriteAheadLoggingEnabled(z);
        }
    }

    public static final void a(ai1 ai1Var, e36 e36Var) {
        Object em5Var;
        ts1 ts1Var = (ts1) ai1Var.e;
        f(e36Var);
        bc1 bc1Var = (bc1) ai1Var.d;
        l16 l16Var = bc1Var.g;
        l16 l16Var2 = l16.WRITE_AHEAD_LOGGING;
        if (l16Var == l16Var2) {
            ii2.s(e36Var, "PRAGMA journal_mode = WAL");
        } else {
            ii2.s(e36Var, "PRAGMA journal_mode = TRUNCATE");
        }
        if (bc1Var.g == l16Var2) {
            ii2.s(e36Var, "PRAGMA synchronous = NORMAL");
        } else {
            ii2.s(e36Var, "PRAGMA synchronous = FULL");
        }
        j36 i0 = e36Var.i0("PRAGMA user_version");
        try {
            i0.f0();
            int i = (int) i0.getLong(0);
            lb4.p(i0, null);
            int i2 = ts1Var.a;
            if (i != i2) {
                ii2.s(e36Var, "BEGIN EXCLUSIVE TRANSACTION");
                try {
                    if (i == 0) {
                        ai1Var.j(e36Var);
                    } else {
                        ai1Var.k(e36Var, i, i2);
                    }
                    ii2.s(e36Var, "PRAGMA user_version = " + i2);
                    em5Var = jg7.a;
                } catch (Throwable th) {
                    em5Var = new em5(th);
                }
                if (!(em5Var instanceof em5)) {
                    jg7 jg7Var = (jg7) em5Var;
                    ii2.s(e36Var, "END TRANSACTION");
                }
                Throwable a = hm5.a(em5Var);
                if (a != null) {
                    ii2.s(e36Var, "ROLLBACK TRANSACTION");
                    throw a;
                }
            }
            ai1Var.l(e36Var);
        } finally {
        }
    }

    public static void f(e36 e36Var) {
        j36 i0 = e36Var.i0("PRAGMA busy_timeout");
        try {
            i0.f0();
            long j = i0.getLong(0);
            lb4.p(i0, null);
            if (j < 3000) {
                ii2.s(e36Var, "PRAGMA busy_timeout = 3000");
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                lb4.p(i0, th);
                throw th2;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r13v2, types: [s26, java.lang.Object] */
    public void b(ci1 ci1Var, int i, ArrayList arrayList, s26 s26Var) {
        ct7 ct7Var = ci1Var.d;
        s26 s26Var2 = ct7Var.c;
        ci1 ci1Var2 = ct7Var.i;
        ci1 ci1Var3 = ct7Var.h;
        if (s26Var2 == null) {
            m21 m21Var = (m21) this.d;
            if (ct7Var != m21Var.d) {
                s26 s26Var3 = s26Var;
                if (ct7Var != m21Var.e) {
                    if (s26Var == null) {
                        ?? obj = new Object();
                        obj.a = null;
                        obj.b = new ArrayList();
                        obj.a = ct7Var;
                        arrayList.add(obj);
                        s26Var3 = obj;
                    }
                    ct7Var.c = s26Var3;
                    s26Var3.b.add(ct7Var);
                    ArrayList arrayList2 = ci1Var3.k;
                    int size = arrayList2.size();
                    int i2 = 0;
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj2 = arrayList2.get(i3);
                        i3++;
                        xh1 xh1Var = (xh1) obj2;
                        if (xh1Var instanceof ci1) {
                            b((ci1) xh1Var, i, arrayList, s26Var3);
                        }
                    }
                    ArrayList arrayList3 = ci1Var2.k;
                    int size2 = arrayList3.size();
                    int i4 = 0;
                    while (i4 < size2) {
                        Object obj3 = arrayList3.get(i4);
                        i4++;
                        xh1 xh1Var2 = (xh1) obj3;
                        if (xh1Var2 instanceof ci1) {
                            b((ci1) xh1Var2, i, arrayList, s26Var3);
                        }
                    }
                    if (i == 1 && (ct7Var instanceof lm7)) {
                        ArrayList arrayList4 = ((lm7) ct7Var).k.k;
                        int size3 = arrayList4.size();
                        int i5 = 0;
                        while (i5 < size3) {
                            Object obj4 = arrayList4.get(i5);
                            i5++;
                            xh1 xh1Var3 = (xh1) obj4;
                            if (xh1Var3 instanceof ci1) {
                                b((ci1) xh1Var3, i, arrayList, s26Var3);
                            }
                        }
                    }
                    ArrayList arrayList5 = ci1Var3.l;
                    int size4 = arrayList5.size();
                    int i6 = 0;
                    while (i6 < size4) {
                        Object obj5 = arrayList5.get(i6);
                        i6++;
                        b((ci1) obj5, i, arrayList, s26Var3);
                    }
                    ArrayList arrayList6 = ci1Var2.l;
                    int size5 = arrayList6.size();
                    int i7 = 0;
                    while (i7 < size5) {
                        Object obj6 = arrayList6.get(i7);
                        i7++;
                        b((ci1) obj6, i, arrayList, s26Var3);
                    }
                    if (i == 1 && (ct7Var instanceof lm7)) {
                        ArrayList arrayList7 = ((lm7) ct7Var).k.l;
                        int size6 = arrayList7.size();
                        while (i2 < size6) {
                            Object obj7 = arrayList7.get(i2);
                            i2++;
                            b((ci1) obj7, i, arrayList, s26Var3);
                        }
                    }
                }
            }
        }
    }

    public void c(m21 m21Var) {
        float f;
        ArrayList arrayList;
        k21 k21Var;
        k21 k21Var2;
        k21 k21Var3;
        k21 k21Var4;
        ArrayList arrayList2 = m21Var.t0;
        int size = arrayList2.size();
        char c = 0;
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            l21 l21Var = (l21) obj;
            k21[] k21VarArr = l21Var.T;
            h11[] h11VarArr = l21Var.Q;
            h11 h11Var = l21Var.L;
            h11 h11Var2 = l21Var.J;
            h11 h11Var3 = l21Var.K;
            h11 h11Var4 = l21Var.I;
            k21 k21Var5 = k21VarArr[c];
            k21 k21Var6 = k21VarArr[1];
            if (l21Var.h0 == 8) {
                l21Var.a = true;
            } else {
                float f2 = l21Var.w;
                char c2 = c;
                if (f2 < 1.0f) {
                    f = 1.0f;
                    if (k21Var5 == k21.MATCH_CONSTRAINT) {
                        l21Var.r = 2;
                    }
                } else {
                    f = 1.0f;
                }
                float f3 = l21Var.z;
                if (f3 < f && k21Var6 == k21.MATCH_CONSTRAINT) {
                    l21Var.s = 2;
                }
                if (l21Var.X > RecyclerView.B1) {
                    k21 k21Var7 = k21.MATCH_CONSTRAINT;
                    if (k21Var5 != k21Var7 || (k21Var6 != k21.WRAP_CONTENT && k21Var6 != k21.FIXED)) {
                        int i2 = 3;
                        if (k21Var6 == k21Var7) {
                            if (k21Var5 != k21.WRAP_CONTENT && k21Var5 != k21.FIXED) {
                                i2 = 3;
                            } else {
                                l21Var.s = 3;
                            }
                        }
                        if (k21Var5 == k21Var7 && k21Var6 == k21Var7) {
                            if (l21Var.r == 0) {
                                l21Var.r = i2;
                            }
                            if (l21Var.s == 0) {
                                l21Var.s = i2;
                            }
                        }
                    } else {
                        l21Var.r = 3;
                    }
                }
                k21 k21Var8 = k21.MATCH_CONSTRAINT;
                if (k21Var5 == k21Var8) {
                    arrayList = arrayList2;
                    if (l21Var.r == 1 && (h11Var4.f == null || h11Var3.f == null)) {
                        k21Var5 = k21.WRAP_CONTENT;
                    }
                } else {
                    arrayList = arrayList2;
                }
                if (k21Var6 == k21Var8 && l21Var.s == 1 && (h11Var2.f == null || h11Var.f == null)) {
                    k21Var6 = k21.WRAP_CONTENT;
                }
                ly2 ly2Var = l21Var.d;
                ly2Var.d = k21Var5;
                int i3 = l21Var.r;
                ly2Var.a = i3;
                lm7 lm7Var = l21Var.e;
                lm7Var.d = k21Var6;
                int i4 = size;
                int i5 = l21Var.s;
                lm7Var.a = i5;
                k21 k21Var9 = k21.MATCH_PARENT;
                if ((k21Var5 != k21Var9 && k21Var5 != k21.FIXED && k21Var5 != k21.WRAP_CONTENT) || (k21Var6 != k21Var9 && k21Var6 != k21.FIXED && k21Var6 != k21.WRAP_CONTENT)) {
                    if (k21Var5 != k21Var8 || (k21Var6 != (k21Var4 = k21.WRAP_CONTENT) && k21Var6 != k21.FIXED)) {
                        k21Var = k21Var6;
                    } else if (i3 == 3) {
                        if (k21Var6 == k21Var4) {
                            h(l21Var, k21Var4, 0, k21Var4, 0);
                        }
                        int l = l21Var.l();
                        k21 k21Var10 = k21.FIXED;
                        h(l21Var, k21Var10, (int) ((l * l21Var.X) + 0.5f), k21Var10, l);
                        l21Var.d.e.d(l21Var.r());
                        l21Var.e.e.d(l21Var.l());
                        l21Var.a = true;
                    } else if (i3 == 1) {
                        h(l21Var, k21Var4, 0, k21Var6, 0);
                        l21Var.d.e.m = l21Var.r();
                    } else {
                        k21Var = k21Var6;
                        if (i3 == 2) {
                            k21 k21Var11 = m21Var.T[c2];
                            k21 k21Var12 = k21.FIXED;
                            if (k21Var11 == k21Var12 || k21Var11 == k21Var9) {
                                h(l21Var, k21Var12, (int) ((f2 * m21Var.r()) + 0.5f), k21Var, l21Var.l());
                                l21Var.d.e.d(l21Var.r());
                                l21Var.e.e.d(l21Var.l());
                                l21Var.a = true;
                            }
                        } else if (h11VarArr[c2].f == null || h11VarArr[1].f == null) {
                            h(l21Var, k21Var4, 0, k21Var, 0);
                            l21Var.d.e.d(l21Var.r());
                            l21Var.e.e.d(l21Var.l());
                            l21Var.a = true;
                        }
                    }
                    if (k21Var != k21Var8 || (k21Var5 != (k21Var3 = k21.WRAP_CONTENT) && k21Var5 != k21.FIXED)) {
                        k21Var2 = k21Var;
                    } else if (i5 == 3) {
                        if (k21Var5 == k21Var3) {
                            h(l21Var, k21Var3, 0, k21Var3, 0);
                        }
                        int r = l21Var.r();
                        float f4 = l21Var.X;
                        if (l21Var.Y == -1) {
                            f4 = f / f4;
                        }
                        k21 k21Var13 = k21.FIXED;
                        h(l21Var, k21Var13, r, k21Var13, (int) ((r * f4) + 0.5f));
                        l21Var.d.e.d(l21Var.r());
                        l21Var.e.e.d(l21Var.l());
                        l21Var.a = true;
                    } else if (i5 == 1) {
                        h(l21Var, k21Var5, 0, k21Var3, 0);
                        l21Var.e.e.m = l21Var.l();
                    } else {
                        k21 k21Var14 = k21Var5;
                        if (i5 == 2) {
                            k21 k21Var15 = m21Var.T[1];
                            k21Var2 = k21Var;
                            k21 k21Var16 = k21.FIXED;
                            if (k21Var15 != k21Var16 && k21Var15 != k21Var9) {
                                k21Var5 = k21Var14;
                            } else {
                                h(l21Var, k21Var14, l21Var.r(), k21Var16, (int) ((f3 * m21Var.l()) + 0.5f));
                                l21Var.d.e.d(l21Var.r());
                                l21Var.e.e.d(l21Var.l());
                                l21Var.a = true;
                            }
                        } else {
                            k21Var5 = k21Var14;
                            k21Var2 = k21Var;
                            if (h11VarArr[2].f == null || h11VarArr[3].f == null) {
                                h(l21Var, k21Var3, 0, k21Var2, 0);
                                l21Var.d.e.d(l21Var.r());
                                l21Var.e.e.d(l21Var.l());
                                l21Var.a = true;
                            }
                        }
                    }
                    if (k21Var5 == k21Var8 && k21Var2 == k21Var8) {
                        if (i3 != 1 && i5 != 1) {
                            if (i5 == 2 && i3 == 2) {
                                k21[] k21VarArr2 = m21Var.T;
                                k21 k21Var17 = k21VarArr2[c2];
                                k21 k21Var18 = k21.FIXED;
                                if (k21Var17 == k21Var18 && k21VarArr2[1] == k21Var18) {
                                    h(l21Var, k21Var18, (int) ((f2 * m21Var.r()) + 0.5f), k21Var18, (int) ((f3 * m21Var.l()) + 0.5f));
                                    l21Var.d.e.d(l21Var.r());
                                    l21Var.e.e.d(l21Var.l());
                                    l21Var.a = true;
                                }
                            }
                        } else {
                            k21 k21Var19 = k21.WRAP_CONTENT;
                            h(l21Var, k21Var19, 0, k21Var19, 0);
                            l21Var.d.e.m = l21Var.r();
                            l21Var.e.e.m = l21Var.l();
                        }
                    }
                } else {
                    int r2 = l21Var.r();
                    if (k21Var5 == k21Var9) {
                        r2 = (m21Var.r() - h11Var4.g) - h11Var3.g;
                        k21Var5 = k21.FIXED;
                    }
                    int l2 = l21Var.l();
                    if (k21Var6 == k21Var9) {
                        l2 = (m21Var.l() - h11Var2.g) - h11Var.g;
                        k21Var6 = k21.FIXED;
                    }
                    h(l21Var, k21Var5, r2, k21Var6, l2);
                    l21Var.d.e.d(l21Var.r());
                    l21Var.e.e.d(l21Var.l());
                    l21Var.a = true;
                }
                c = c2;
                arrayList2 = arrayList;
                size = i4;
                i = i;
            }
        }
    }

    public void d() {
        m21 m21Var = (m21) this.d;
        ArrayList arrayList = (ArrayList) this.g;
        ArrayList arrayList2 = (ArrayList) this.f;
        arrayList2.clear();
        m21 m21Var2 = (m21) this.e;
        m21Var2.d.f();
        m21Var2.e.f();
        arrayList2.add(m21Var2.d);
        arrayList2.add(m21Var2.e);
        ArrayList arrayList3 = m21Var2.t0;
        int size = arrayList3.size();
        HashSet hashSet = null;
        int i = 0;
        while (i < size) {
            Object obj = arrayList3.get(i);
            i++;
            l21 l21Var = (l21) obj;
            if (l21Var instanceof av2) {
                ct7 ct7Var = new ct7(l21Var);
                l21Var.d.f();
                l21Var.e.f();
                ct7Var.f = ((av2) l21Var).x0;
                arrayList2.add(ct7Var);
            } else {
                if (l21Var.y()) {
                    if (l21Var.b == null) {
                        l21Var.b = new kl0(l21Var, 0);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(l21Var.b);
                } else {
                    arrayList2.add(l21Var.d);
                }
                if (l21Var.z()) {
                    if (l21Var.c == null) {
                        l21Var.c = new kl0(l21Var, 1);
                    }
                    if (hashSet == null) {
                        hashSet = new HashSet();
                    }
                    hashSet.add(l21Var.c);
                } else {
                    arrayList2.add(l21Var.e);
                }
                if (l21Var instanceof gx2) {
                    arrayList2.add(new ct7(l21Var));
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
            ((ct7) obj2).f();
        }
        int size3 = arrayList2.size();
        int i3 = 0;
        while (i3 < size3) {
            Object obj3 = arrayList2.get(i3);
            i3++;
            ct7 ct7Var2 = (ct7) obj3;
            if (ct7Var2.b != m21Var2) {
                ct7Var2.d();
            }
        }
        arrayList.clear();
        g(m21Var.d, 0, arrayList);
        g(m21Var.e, 1, arrayList);
        this.b = false;
    }

    public int e(m21 m21Var, int i) {
        ct7 ct7Var;
        ct7 ct7Var2;
        ArrayList arrayList;
        int i2;
        long j;
        float f;
        long j2;
        m21 m21Var2 = m21Var;
        ArrayList arrayList2 = (ArrayList) this.g;
        int size = arrayList2.size();
        long j3 = 0;
        int i3 = 0;
        long j4 = 0;
        while (i3 < size) {
            ct7 ct7Var3 = ((s26) arrayList2.get(i3)).a;
            if (!(ct7Var3 instanceof kl0) ? !(i != 0 ? (ct7Var3 instanceof lm7) : (ct7Var3 instanceof ly2)) : ((kl0) ct7Var3).f != i) {
                arrayList = arrayList2;
                j = j3;
                i2 = i3;
            } else {
                if (i == 0) {
                    ct7Var = m21Var2.d;
                } else {
                    ct7Var = m21Var2.e;
                }
                ci1 ci1Var = ct7Var.h;
                if (i == 0) {
                    ct7Var2 = m21Var2.d;
                } else {
                    ct7Var2 = m21Var2.e;
                }
                ci1 ci1Var2 = ct7Var2.i;
                ci1 ci1Var3 = ct7Var3.h;
                ci1 ci1Var4 = ct7Var3.i;
                boolean contains = ci1Var3.l.contains(ci1Var);
                boolean contains2 = ci1Var4.l.contains(ci1Var2);
                long j5 = ct7Var3.j();
                if (contains && contains2) {
                    long b = s26.b(ci1Var3, j3);
                    arrayList = arrayList2;
                    long a = s26.a(ci1Var4, j3);
                    long j6 = b - j5;
                    int i4 = ci1Var4.f;
                    i2 = i3;
                    if (j6 >= (-i4)) {
                        j6 += i4;
                    }
                    long j7 = ci1Var3.f;
                    long j8 = ((-a) - j5) - j7;
                    if (j8 >= j7) {
                        j8 -= j7;
                    }
                    l21 l21Var = ct7Var3.b;
                    if (i == 0) {
                        f = l21Var.e0;
                    } else if (i == 1) {
                        f = l21Var.f0;
                    } else {
                        l21Var.getClass();
                        f = -1.0f;
                    }
                    if (f > RecyclerView.B1) {
                        j2 = (((float) j6) / (1.0f - f)) + (((float) j8) / f);
                    } else {
                        j2 = 0;
                    }
                    float f2 = (float) j2;
                    j = (ci1Var3.f + ((((f2 * f) + 0.5f) + j5) + i61.a(1.0f, f, f2, 0.5f))) - ci1Var4.f;
                } else {
                    arrayList = arrayList2;
                    i2 = i3;
                    if (contains) {
                        j = Math.max(s26.b(ci1Var3, ci1Var3.f), ci1Var3.f + j5);
                    } else if (contains2) {
                        j = Math.max(-s26.a(ci1Var4, ci1Var4.f), (-ci1Var4.f) + j5);
                    } else {
                        j = (ct7Var3.j() + ci1Var3.f) - ci1Var4.f;
                    }
                }
            }
            j4 = Math.max(j4, j);
            i3 = i2 + 1;
            arrayList2 = arrayList;
            m21Var2 = m21Var;
            j3 = 0;
        }
        return (int) j4;
    }

    public void g(ct7 ct7Var, int i, ArrayList arrayList) {
        ci1 ci1Var = ct7Var.h;
        ci1 ci1Var2 = ct7Var.i;
        ArrayList arrayList2 = ci1Var.k;
        int size = arrayList2.size();
        int i2 = 0;
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            xh1 xh1Var = (xh1) obj;
            if (xh1Var instanceof ci1) {
                b((ci1) xh1Var, i, arrayList, null);
            } else if (xh1Var instanceof ct7) {
                b(((ct7) xh1Var).h, i, arrayList, null);
            }
        }
        ArrayList arrayList3 = ci1Var2.k;
        int size2 = arrayList3.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList3.get(i4);
            i4++;
            xh1 xh1Var2 = (xh1) obj2;
            if (xh1Var2 instanceof ci1) {
                b((ci1) xh1Var2, i, arrayList, null);
            } else if (xh1Var2 instanceof ct7) {
                b(((ct7) xh1Var2).i, i, arrayList, null);
            }
        }
        if (i == 1) {
            ArrayList arrayList4 = ((lm7) ct7Var).k.k;
            int size3 = arrayList4.size();
            while (i2 < size3) {
                Object obj3 = arrayList4.get(i2);
                i2++;
                xh1 xh1Var3 = (xh1) obj3;
                if (xh1Var3 instanceof ci1) {
                    b((ci1) xh1Var3, i, arrayList, null);
                }
            }
        }
    }

    public void h(l21 l21Var, k21 k21Var, int i, k21 k21Var2, int i2) {
        e30 e30Var = (e30) this.i;
        e30Var.a = k21Var;
        e30Var.b = k21Var2;
        e30Var.c = i;
        e30Var.d = i2;
        ((p11) this.h).b(l21Var, e30Var);
        l21Var.P(e30Var.e);
        l21Var.M(e30Var.f);
        l21Var.E = e30Var.h;
        l21Var.J(e30Var.g);
    }

    public void i() {
        boolean z;
        boolean z2;
        ai1 ai1Var;
        w20 w20Var;
        ArrayList arrayList = ((m21) this.d).t0;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            l21 l21Var = (l21) obj;
            if (!l21Var.a) {
                k21[] k21VarArr = l21Var.T;
                k21 k21Var = k21VarArr[0];
                k21 k21Var2 = k21VarArr[1];
                int i2 = l21Var.r;
                int i3 = l21Var.s;
                k21 k21Var3 = k21.WRAP_CONTENT;
                if (k21Var != k21Var3 && (k21Var != k21.MATCH_CONSTRAINT || i2 != 1)) {
                    z = false;
                } else {
                    z = true;
                }
                if (k21Var2 != k21Var3 && (k21Var2 != k21.MATCH_CONSTRAINT || i3 != 1)) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                rj1 rj1Var = l21Var.d.e;
                boolean z3 = rj1Var.j;
                rj1 rj1Var2 = l21Var.e.e;
                boolean z4 = rj1Var2.j;
                if (z3 && z4) {
                    k21 k21Var4 = k21.FIXED;
                    ai1Var = this;
                    ai1Var.h(l21Var, k21Var4, rj1Var.g, k21Var4, rj1Var2.g);
                    l21Var.a = true;
                } else {
                    if (z3 && z2) {
                        this.h(l21Var, k21.FIXED, rj1Var.g, k21Var3, rj1Var2.g);
                        k21 k21Var5 = k21.MATCH_CONSTRAINT;
                        lm7 lm7Var = l21Var.e;
                        if (k21Var2 == k21Var5) {
                            lm7Var.e.m = l21Var.l();
                        } else {
                            lm7Var.e.d(l21Var.l());
                            l21Var.a = true;
                        }
                    } else if (z4 && z) {
                        ai1Var = this;
                        ai1Var.h(l21Var, k21Var3, rj1Var.g, k21.FIXED, rj1Var2.g);
                        k21 k21Var6 = k21.MATCH_CONSTRAINT;
                        ly2 ly2Var = l21Var.d;
                        if (k21Var == k21Var6) {
                            ly2Var.e.m = l21Var.r();
                        } else {
                            ly2Var.e.d(l21Var.r());
                            l21Var.a = true;
                        }
                    }
                    ai1Var = this;
                }
                if (l21Var.a && (w20Var = l21Var.e.l) != null) {
                    w20Var.d(l21Var.b0);
                }
                this = ai1Var;
            }
        }
    }

    public void j(e36 e36Var) {
        ts1 ts1Var = (ts1) this.e;
        e36Var.getClass();
        j36 i0 = e36Var.i0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        try {
            boolean z = false;
            if (i0.f0()) {
                if (i0.getLong(0) == 0) {
                    z = true;
                }
            }
            lb4.p(i0, null);
            ts1Var.a(e36Var);
            if (!z) {
                g60 v = ts1Var.v(e36Var);
                if (!v.A) {
                    u34.B((String) v.B, "Pre-packaged database has an invalid schema: ");
                    return;
                }
            }
            m(e36Var);
            ts1Var.r(e36Var);
            for (k16 k16Var : (List) this.f) {
                k16Var.getClass();
                if (e36Var instanceof mu6) {
                    k16Var.a(((mu6) e36Var).A);
                }
            }
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                lb4.p(i0, th);
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
    */
    public void k(e36 e36Var, int i, int i2) {
        boolean z;
        Iterable<i64> iterable;
        vr4 vr4Var;
        boolean z2;
        boolean z3;
        ts1 ts1Var = (ts1) this.e;
        e36Var.getClass();
        bc1 bc1Var = (bc1) this.d;
        wb1 wb1Var = bc1Var.d;
        wb1Var.getClass();
        if (i == i2) {
            iterable = yt1.A;
        } else {
            if (i2 > i) {
                z = true;
            } else {
                z = false;
            }
            ArrayList arrayList = new ArrayList();
            int i3 = i;
            do {
                if (z) {
                    if (i3 >= i2) {
                        iterable = arrayList;
                        break;
                    }
                    LinkedHashMap linkedHashMap = wb1Var.b;
                    if (!z) {
                        TreeMap treeMap = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap != null) {
                            vr4Var = new vr4(treeMap, treeMap.descendingKeySet());
                            if (vr4Var != null) {
                                break;
                            }
                            Map map = (Map) vr4Var.A;
                            for (Number number : (Iterable) vr4Var.B) {
                                int intValue = number.intValue();
                                if (z) {
                                    if (i3 + 1 <= intValue && intValue <= i2) {
                                        Object obj = map.get(Integer.valueOf(intValue));
                                        obj.getClass();
                                        arrayList.add(obj);
                                        z2 = true;
                                        i3 = intValue;
                                        continue;
                                        break;
                                    }
                                } else if (i2 <= intValue && intValue < i3) {
                                    Object obj2 = map.get(Integer.valueOf(intValue));
                                    obj2.getClass();
                                    arrayList.add(obj2);
                                    z2 = true;
                                    i3 = intValue;
                                    continue;
                                    break;
                                }
                            }
                            z2 = false;
                            continue;
                        }
                        vr4Var = null;
                        if (vr4Var != null) {
                        }
                    } else {
                        TreeMap treeMap2 = (TreeMap) linkedHashMap.get(Integer.valueOf(i3));
                        if (treeMap2 != null) {
                            vr4Var = new vr4(treeMap2, treeMap2.keySet());
                            if (vr4Var != null) {
                            }
                        }
                        vr4Var = null;
                        if (vr4Var != null) {
                        }
                    }
                } else {
                    if (i3 <= i2) {
                        iterable = arrayList;
                        break;
                    }
                    LinkedHashMap linkedHashMap2 = wb1Var.b;
                    if (!z) {
                    }
                }
            } while (z2);
            iterable = null;
        }
        if (iterable != null) {
            ts1Var.u(e36Var);
            for (i64 i64Var : iterable) {
                i64Var.b(e36Var);
            }
            g60 v = ts1Var.v(e36Var);
            if (v.A) {
                ts1Var.t(e36Var);
                m(e36Var);
                return;
            }
            u34.B((String) v.B, "Migration didn't properly handle: ");
            return;
        }
        bc1Var.getClass();
        if (i <= i2 || !bc1Var.k) {
            Set set = bc1Var.l;
            if (bc1Var.j && (set == null || !set.contains(Integer.valueOf(i)))) {
                z3 = true;
                if (z3) {
                    if (bc1Var.o) {
                        j36 i0 = e36Var.i0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
                        try {
                            kw3 I = hf.I();
                            while (i0.f0()) {
                                String R = i0.R(0);
                                if (!xs6.g0(R, "sqlite_", false) && !R.equals("android_metadata")) {
                                    I.add(new vr4(R, Boolean.valueOf(nb3.k(i0.R(1), "view"))));
                                }
                            }
                            kw3 A = hf.A(I);
                            lb4.p(i0, null);
                            ListIterator listIterator = A.listIterator(0);
                            while (true) {
                                xx2 xx2Var = (xx2) listIterator;
                                if (!xx2Var.hasNext()) {
                                    break;
                                }
                                vr4 vr4Var2 = (vr4) xx2Var.next();
                                String str = (String) vr4Var2.A;
                                if (((Boolean) vr4Var2.B).booleanValue()) {
                                    ii2.s(e36Var, "DROP VIEW IF EXISTS `" + str + '`');
                                } else {
                                    ii2.s(e36Var, "DROP TABLE IF EXISTS `" + str + '`');
                                }
                            }
                        } finally {
                        }
                    } else {
                        ts1Var.c(e36Var);
                    }
                    for (k16 k16Var : (List) this.f) {
                        k16Var.getClass();
                        if (e36Var instanceof mu6) {
                            ((mu6) e36Var).A.getClass();
                        }
                    }
                    ts1Var.a(e36Var);
                    return;
                }
                throw new IllegalStateException(("A migration from " + i + " to " + i2 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
            }
        }
        z3 = false;
        if (z3) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00e0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void l(e36 e36Var) {
        boolean z;
        Object em5Var;
        g60 v;
        String str;
        e36Var.getClass();
        ts1 ts1Var = (ts1) this.e;
        j36 i0 = e36Var.i0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
        try {
            if (i0.f0()) {
                if (i0.getLong(0) != 0) {
                    z = true;
                    lb4.p(i0, null);
                    if (!z) {
                        i0 = e36Var.i0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
                        try {
                            if (i0.f0()) {
                                str = i0.R(0);
                            } else {
                                str = null;
                            }
                            lb4.p(i0, null);
                            if (!((String) ts1Var.b).equals(str) && !((String) ts1Var.c).equals(str)) {
                                throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) ts1Var.b) + ", found: " + str).toString());
                            }
                        } catch (Throwable th) {
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    } else {
                        ii2.s(e36Var, "BEGIN EXCLUSIVE TRANSACTION");
                        try {
                        } catch (Throwable th2) {
                            em5Var = new em5(th2);
                        }
                        if (ts1Var.v(e36Var).A) {
                            ts1Var.t(e36Var);
                            m(e36Var);
                            em5Var = jg7.a;
                            if (!(em5Var instanceof em5)) {
                                jg7 jg7Var = (jg7) em5Var;
                                ii2.s(e36Var, "END TRANSACTION");
                            }
                            Throwable a = hm5.a(em5Var);
                            if (a != null) {
                                ii2.s(e36Var, "ROLLBACK TRANSACTION");
                                throw a;
                            }
                        } else {
                            throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + ((String) v.B)).toString());
                        }
                    }
                    ts1Var.s(e36Var);
                    for (k16 k16Var : (List) this.f) {
                        k16Var.getClass();
                        if (e36Var instanceof mu6) {
                            k16Var.b(((mu6) e36Var).A);
                        }
                    }
                    this.b = true;
                }
            }
            z = false;
            lb4.p(i0, null);
            if (!z) {
            }
            ts1Var.s(e36Var);
            while (r0.hasNext()) {
            }
            this.b = true;
        } catch (Throwable th3) {
            try {
                throw th3;
            } finally {
            }
        }
    }

    public void m(e36 e36Var) {
        ii2.s(e36Var, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        ii2.s(e36Var, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) ((ts1) this.e).b) + "')");
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
                return gt0.P0(arrayList, ", ", "FileMetadata(", ")", null, 56);
            default:
                return super.toString();
        }
    }

    public /* synthetic */ ai1() {
        this.a = 0;
    }

    public ai1(bc1 bc1Var, gn5 gn5Var, h4 h4Var) {
        this.a = 2;
        this.d = bc1Var;
        this.e = new ts1("", -1, "");
        List list = bc1Var.e;
        yt1 yt1Var = yt1.A;
        this.f = list == null ? yt1Var : list;
        gt0.U0(new gr0(new ro5(this, 5)), list == null ? yt1Var : list);
        Context context = bc1Var.a;
        wb1 wb1Var = bc1Var.d;
        l16 l16Var = bc1Var.g;
        Executor executor = bc1Var.h;
        Executor executor2 = bc1Var.i;
        List list2 = bc1Var.m;
        List list3 = bc1Var.n;
        context.getClass();
        wb1Var.getClass();
        l16Var.getClass();
        executor.getClass();
        executor2.getClass();
        list2.getClass();
        list3.getClass();
        throw new tg4(0);
    }

    public ai1(boolean z, boolean z2, lt4 lt4Var, Long l, Long l2, Long l3, Long l4, Map map) {
        this.a = 1;
        map.getClass();
        this.b = z;
        this.c = z2;
        this.d = lt4Var;
        this.e = l;
        this.f = l2;
        this.g = l3;
        this.h = l4;
        this.i = c14.s0(map);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ai1(boolean z, boolean z2, lt4 lt4Var, Long l, Long l2, Long l3, Long l4) {
        this(z, z2, lt4Var, l, l2, l3, l4, zt1.A);
        this.a = 1;
    }
}

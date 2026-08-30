package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fi3  reason: default package */
/* loaded from: classes.dex */
public final class fi3 {
    public final ArrayList a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public final Object g;
    public final Object h;
    public Object i;

    public fi3(ph3 ph3Var) {
        this.g = ph3Var;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new di3(0, 0));
        this.a = arrayList;
        this.e = -1;
        this.h = new ArrayList();
        this.i = pp1.A;
    }

    public static fi3 a(fi3 fi3Var, int i, xf1 xf1Var, ka kaVar, int i2) {
        if ((i2 & 1) != 0) {
            i = fi3Var.b;
        }
        int i3 = i;
        if ((i2 & 2) != 0) {
            xf1Var = (xf1) fi3Var.h;
        }
        xf1 xf1Var2 = xf1Var;
        if ((i2 & 4) != 0) {
            kaVar = (ka) fi3Var.i;
        }
        ka kaVar2 = kaVar;
        int i4 = fi3Var.c;
        int i5 = fi3Var.d;
        int i6 = fi3Var.e;
        kaVar2.getClass();
        return new fi3((w45) fi3Var.g, fi3Var.a, i3, xf1Var2, kaVar2, i4, i5, i6);
    }

    public int b() {
        return ((int) Math.sqrt((e() * 1.0d) / this.f)) + 1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a5, code lost:
        if (r9 < r8) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public defpackage.re2 c(int r13) {
        /*
            Method dump skipped, instructions count: 362
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fi3.c(int):re2");
    }

    public int d(int i) {
        int i2;
        int i3;
        if (e() <= 0) {
            return 0;
        }
        if (i >= e()) {
            pz2.a("ItemIndex > total count");
        }
        if (!((ph3) this.g).f) {
            return i / this.f;
        }
        ArrayList arrayList = this.a;
        int size = arrayList.size();
        l07.n0(arrayList.size(), size);
        int i4 = size - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= i4) {
                i2 = (i5 + i4) >>> 1;
                int i6 = ((di3) arrayList.get(i2)).a - i;
                if (i6 < 0) {
                    i5 = i2 + 1;
                } else if (i6 <= 0) {
                    break;
                } else {
                    i4 = i2 - 1;
                }
            } else {
                i2 = -(i5 + 1);
                break;
            }
        }
        if (i2 < 0) {
            i2 = (-i2) - 2;
        }
        int b = b() * i2;
        int i7 = ((di3) arrayList.get(i2)).a;
        if (i7 > i) {
            pz2.a("currentItemIndex > itemIndex");
        }
        int i8 = 0;
        while (i7 < i) {
            int i9 = i7 + 1;
            int g = g(i7);
            i8 += g;
            int i10 = this.f;
            if (i8 >= i10) {
                if (i8 == i10) {
                    b++;
                    i8 = 0;
                } else {
                    b++;
                    i8 = g;
                }
            }
            if (b % b() == 0 && b / b() >= arrayList.size()) {
                if (i8 > 0) {
                    i3 = 1;
                } else {
                    i3 = 0;
                }
                arrayList.add(new di3(i9 - i3, 0));
            }
            i7 = i9;
        }
        if (g(i) + i8 > this.f) {
            return b + 1;
        }
        return b;
    }

    public int e() {
        return ((ph3) this.g).e.b;
    }

    public ec5 f(ka kaVar) {
        xf1 xf1Var = (xf1) this.h;
        kaVar.getClass();
        int i = this.b;
        ArrayList arrayList = this.a;
        if (i < arrayList.size()) {
            this.f++;
            if (xf1Var != null) {
                h55 e = ((f22) xf1Var.B).e();
                hu2 hu2Var = (hu2) kaVar.B;
                e.getClass();
                hu2Var.getClass();
                hu2 hu2Var2 = e.i.h;
                if (hu2Var.e == hu2Var2.e && b53.x(hu2Var.d, hu2Var2.d)) {
                    if (this.f != 1) {
                        i.m(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                        return null;
                    }
                } else {
                    i.m(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                    return null;
                }
            }
            int i2 = i + 1;
            fi3 a = a(this, i2, null, kaVar, 58);
            n33 n33Var = (n33) arrayList.get(i);
            ec5 a2 = n33Var.a(a);
            if (a2 != null) {
                if (xf1Var != null && i2 < arrayList.size() && a.f != 1) {
                    i.m(n33Var, " must call proceed() exactly once", "network interceptor ");
                    return null;
                }
                return a2;
            }
            throw new NullPointerException("interceptor " + n33Var + " returned null");
        }
        i.n("Check failed.");
        return null;
    }

    public int g(int i) {
        ei3.b = this.f;
        p43 d = ((ph3) this.g).e.d(i);
        return (int) ((fo2) ((mh3) d.c).b.j(ei3.a, Integer.valueOf(i - d.a))).a;
    }

    public fi3(w45 w45Var, ArrayList arrayList, int i, xf1 xf1Var, ka kaVar, int i2, int i3, int i4) {
        kaVar.getClass();
        this.g = w45Var;
        this.a = arrayList;
        this.b = i;
        this.h = xf1Var;
        this.i = kaVar;
        this.c = i2;
        this.d = i3;
        this.e = i4;
    }
}

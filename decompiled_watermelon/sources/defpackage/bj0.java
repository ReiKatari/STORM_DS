package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: bj0  reason: default package */
/* loaded from: classes.dex */
public final class bj0 extends be7 {
    public final ArrayList k;
    public int l;

    public bj0(gz0 gz0Var, int i) {
        super(gz0Var);
        gz0 gz0Var2;
        ud1 ud1Var;
        int i2;
        ud1 ud1Var2;
        ArrayList arrayList = new ArrayList();
        this.k = arrayList;
        this.f = i;
        gz0 gz0Var3 = this.b;
        gz0 n = gz0Var3.n(i);
        while (true) {
            gz0Var2 = gz0Var3;
            gz0Var3 = n;
            if (gz0Var3 == null) {
                break;
            }
            n = gz0Var3.n(this.f);
        }
        this.b = gz0Var2;
        int i3 = this.f;
        if (i3 == 0) {
            ud1Var = gz0Var2.d;
        } else if (i3 == 1) {
            ud1Var = gz0Var2.e;
        } else {
            ud1Var = null;
        }
        arrayList.add(ud1Var);
        gz0 m = gz0Var2.m(this.f);
        while (m != null) {
            int i4 = this.f;
            if (i4 == 0) {
                ud1Var2 = m.d;
            } else if (i4 == 1) {
                ud1Var2 = m.e;
            } else {
                ud1Var2 = null;
            }
            arrayList.add(ud1Var2);
            m = m.m(this.f);
        }
        int size = arrayList.size();
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList.get(i5);
            i5++;
            be7 be7Var = (be7) obj;
            int i6 = this.f;
            if (i6 == 0) {
                be7Var.b.b = this;
            } else if (i6 == 1) {
                be7Var.b.c = this;
            }
        }
        if (this.f == 0 && ((hz0) this.b.U).y0 && arrayList.size() > 1) {
            this.b = ((be7) arrayList.get(arrayList.size() - 1)).b;
        }
        int i7 = this.f;
        gz0 gz0Var4 = this.b;
        if (i7 == 0) {
            i2 = gz0Var4.k0;
        } else {
            i2 = gz0Var4.l0;
        }
        this.l = i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:270:0x039b, code lost:
        r0 = r0 - r10;
     */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00de  */
    @Override // defpackage.ud1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(defpackage.ud1 r27) {
        /*
            Method dump skipped, instructions count: 954
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bj0.a(ud1):void");
    }

    @Override // defpackage.be7
    public final void d() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((be7) obj).d();
        }
        int size2 = arrayList.size();
        if (size2 < 1) {
            return;
        }
        gz0 gz0Var = ((be7) arrayList.get(0)).b;
        gz0 gz0Var2 = ((be7) arrayList.get(size2 - 1)).b;
        int i2 = this.f;
        yd1 yd1Var = this.i;
        yd1 yd1Var2 = this.h;
        if (i2 == 0) {
            cy0 cy0Var = gz0Var.I;
            cy0 cy0Var2 = gz0Var2.K;
            yd1 i3 = be7.i(cy0Var, 0);
            int e = cy0Var.e();
            gz0 m = m();
            if (m != null) {
                e = m.I.e();
            }
            if (i3 != null) {
                be7.b(yd1Var2, i3, e);
            }
            yd1 i4 = be7.i(cy0Var2, 0);
            int e2 = cy0Var2.e();
            gz0 n = n();
            if (n != null) {
                e2 = n.K.e();
            }
            if (i4 != null) {
                be7.b(yd1Var, i4, -e2);
            }
        } else {
            cy0 cy0Var3 = gz0Var.J;
            cy0 cy0Var4 = gz0Var2.L;
            yd1 i5 = be7.i(cy0Var3, 1);
            int e3 = cy0Var3.e();
            gz0 m2 = m();
            if (m2 != null) {
                e3 = m2.J.e();
            }
            if (i5 != null) {
                be7.b(yd1Var2, i5, e3);
            }
            yd1 i6 = be7.i(cy0Var4, 1);
            int e4 = cy0Var4.e();
            gz0 n2 = n();
            if (n2 != null) {
                e4 = n2.L.e();
            }
            if (i6 != null) {
                be7.b(yd1Var, i6, -e4);
            }
        }
        yd1Var2.a = this;
        yd1Var.a = this;
    }

    @Override // defpackage.be7
    public final void e() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                ((be7) arrayList.get(i)).e();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // defpackage.be7
    public final void f() {
        this.c = null;
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((be7) obj).f();
        }
    }

    @Override // defpackage.be7
    public final long j() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            be7 be7Var = (be7) arrayList.get(i);
            j = be7Var.i.f + be7Var.j() + j + be7Var.h.f;
        }
        return j;
    }

    @Override // defpackage.be7
    public final boolean k() {
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (!((be7) arrayList.get(i)).k()) {
                return false;
            }
        }
        return true;
    }

    public final gz0 m() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.k;
            if (i < arrayList.size()) {
                gz0 gz0Var = ((be7) arrayList.get(i)).b;
                if (gz0Var.h0 != 8) {
                    return gz0Var;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final gz0 n() {
        ArrayList arrayList = this.k;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            gz0 gz0Var = ((be7) arrayList.get(size)).b;
            if (gz0Var.h0 != 8) {
                return gz0Var;
            }
        }
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("ChainRun ");
        if (this.f == 0) {
            str = "horizontal : ";
        } else {
            str = "vertical : ";
        }
        sb.append(str);
        ArrayList arrayList = this.k;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            sb.append("<");
            sb.append((be7) obj);
            sb.append("> ");
        }
        return sb.toString();
    }
}

package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yd1  reason: default package */
/* loaded from: classes.dex */
public class yd1 implements ud1 {
    public final be7 d;
    public int f;
    public int g;
    public be7 a = null;
    public boolean b = false;
    public boolean c = false;
    public xd1 e = xd1.UNKNOWN;
    public int h = 1;
    public nf1 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public yd1(be7 be7Var) {
        this.d = be7Var;
    }

    @Override // defpackage.ud1
    public final void a(ud1 ud1Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((yd1) obj).j) {
                return;
            }
        }
        this.c = true;
        be7 be7Var = this.a;
        if (be7Var != null) {
            be7Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        yd1 yd1Var = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            yd1 yd1Var2 = (yd1) obj2;
            if (!(yd1Var2 instanceof nf1)) {
                i++;
                yd1Var = yd1Var2;
            }
        }
        if (yd1Var != null && i == 1 && yd1Var.j) {
            nf1 nf1Var = this.i;
            if (nf1Var != null) {
                if (nf1Var.j) {
                    this.f = this.h * nf1Var.g;
                } else {
                    return;
                }
            }
            d(yd1Var.g + this.f);
        }
        be7 be7Var2 = this.a;
        if (be7Var2 != null) {
            be7Var2.a(this);
        }
    }

    public final void b(be7 be7Var) {
        this.k.add(be7Var);
        if (this.j) {
            be7Var.a(be7Var);
        }
    }

    public final void c() {
        this.l.clear();
        this.k.clear();
        this.j = false;
        this.g = 0;
        this.c = false;
        this.b = false;
    }

    public void d(int i) {
        if (!this.j) {
            this.j = true;
            this.g = i;
            ArrayList arrayList = this.k;
            int size = arrayList.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList.get(i2);
                i2++;
                ud1 ud1Var = (ud1) obj;
                ud1Var.a(ud1Var);
            }
        }
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder();
        sb.append(this.d.b.j0);
        sb.append(":");
        sb.append(this.e);
        sb.append("(");
        if (this.j) {
            obj = Integer.valueOf(this.g);
        } else {
            obj = "unresolved";
        }
        sb.append(obj);
        sb.append(") <t=");
        sb.append(this.l.size());
        sb.append(":d=");
        sb.append(this.k.size());
        sb.append(">");
        return sb.toString();
    }
}

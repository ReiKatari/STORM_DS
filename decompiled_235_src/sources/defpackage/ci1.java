package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ci1  reason: default package */
/* loaded from: classes.dex */
public class ci1 implements xh1 {
    public final ct7 d;
    public int f;
    public int g;
    public ct7 a = null;
    public boolean b = false;
    public boolean c = false;
    public bi1 e = bi1.UNKNOWN;
    public int h = 1;
    public rj1 i = null;
    public boolean j = false;
    public final ArrayList k = new ArrayList();
    public final ArrayList l = new ArrayList();

    public ci1(ct7 ct7Var) {
        this.d = ct7Var;
    }

    @Override // defpackage.xh1
    public final void a(xh1 xh1Var) {
        ArrayList arrayList = this.l;
        int size = arrayList.size();
        int i = 0;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            if (!((ci1) obj).j) {
                return;
            }
        }
        this.c = true;
        ct7 ct7Var = this.a;
        if (ct7Var != null) {
            ct7Var.a(this);
        }
        if (this.b) {
            this.d.a(this);
            return;
        }
        int size2 = arrayList.size();
        ci1 ci1Var = null;
        int i3 = 0;
        while (i3 < size2) {
            Object obj2 = arrayList.get(i3);
            i3++;
            ci1 ci1Var2 = (ci1) obj2;
            if (!(ci1Var2 instanceof rj1)) {
                i++;
                ci1Var = ci1Var2;
            }
        }
        if (ci1Var != null && i == 1 && ci1Var.j) {
            rj1 rj1Var = this.i;
            if (rj1Var != null) {
                if (rj1Var.j) {
                    this.f = this.h * rj1Var.g;
                } else {
                    return;
                }
            }
            d(ci1Var.g + this.f);
        }
        ct7 ct7Var2 = this.a;
        if (ct7Var2 != null) {
            ct7Var2.a(this);
        }
    }

    public final void b(ct7 ct7Var) {
        this.k.add(ct7Var);
        if (this.j) {
            ct7Var.a(ct7Var);
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
                xh1 xh1Var = (xh1) obj;
                xh1Var.a(xh1Var);
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

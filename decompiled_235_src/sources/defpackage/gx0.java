package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: gx0  reason: default package */
/* loaded from: classes.dex */
public abstract class gx0 {
    public final Object a;

    public gx0(int i) {
        switch (i) {
            case 1:
                p94 p94Var = h93.a;
                this.a = new p94();
                return;
            case 2:
                this.a = new Object();
                return;
            case 3:
                this.a = np2.Y(Boolean.FALSE);
                return;
            default:
                this.a = new ArrayList();
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x003a, code lost:
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean a(int i, zq2 zq2Var, Object obj) {
        ArrayList arrayList = zq2Var.a;
        if (arrayList == null) {
            b(i, zq2Var, null);
            return true;
        }
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 >= size) {
                break;
            }
            Object obj2 = arrayList.get(i2);
            if (obj2 instanceof sq2) {
                if (obj2 == obj) {
                    b(0, zq2Var, obj2);
                    return true;
                }
            } else if (obj2 instanceof zq2) {
                if (a(i, (zq2) obj2, obj)) {
                    b(0, zq2Var, obj2);
                    return true;
                }
            } else {
                e41.h(obj2, "Unexpected child source info ");
                break;
            }
            i2++;
        }
    }

    public void b(int i, zq2 zq2Var, Object obj) {
        ((ArrayList) this.a).add(new hx0(i, null, null));
    }

    public abstract void c(ob6 ob6Var);

    public abstract void d();

    public abstract void e();

    public abstract Object f();

    public List g(fq3 fq3Var, int i, long j) {
        p94 p94Var = (p94) this.a;
        List list = (List) p94Var.b(i);
        if (list != null) {
            return list;
        }
        List b = fq3Var.b(i);
        int size = b.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((x24) b.get(i2)).y(j));
        }
        p94Var.i(i, arrayList);
        return arrayList;
    }

    public abstract Object h();

    public void i(int i, Object obj, zq2 zq2Var, Object obj2) {
        if (!nb3.k(obj, ox0.a)) {
            return;
        }
        b(i, zq2Var, null);
    }

    public abstract qn2 j(ob6 ob6Var);

    public abstract void k(ul0 ul0Var);

    public abstract void l(Object obj);

    public abstract void m(ga7 ga7Var);

    public abstract void n();
}

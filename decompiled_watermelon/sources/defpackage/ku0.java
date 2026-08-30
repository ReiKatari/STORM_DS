package defpackage;

import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ku0  reason: default package */
/* loaded from: classes.dex */
public abstract class ku0 {
    public final Object a;

    public ku0(int i) {
        switch (i) {
            case 1:
                j14 j14Var = z23.a;
                this.a = new j14();
                return;
            case 2:
                this.a = new Object();
                return;
            case 3:
                this.a = me2.G(Boolean.FALSE);
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
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(int r8, defpackage.uk2 r9, java.lang.Object r10) {
        /*
            r7 = this;
            java.util.ArrayList r0 = r9.a
            r1 = 1
            if (r0 != 0) goto La
            r10 = 0
            r7.b(r8, r9, r10)
            return r1
        La:
            int r2 = r0.size()
            r3 = 0
            r4 = r3
        L10:
            if (r4 >= r2) goto L3a
            java.lang.Object r5 = r0.get(r4)
            boolean r6 = r5 instanceof defpackage.mk2
            if (r6 == 0) goto L21
            if (r5 == r10) goto L1d
            goto L32
        L1d:
            r7.b(r3, r9, r5)
            return r1
        L21:
            boolean r6 = r5 instanceof defpackage.uk2
            if (r6 == 0) goto L35
            r6 = r5
            uk2 r6 = (defpackage.uk2) r6
            boolean r6 = r7.a(r8, r6, r10)
            if (r6 == 0) goto L32
            r7.b(r3, r9, r5)
            return r1
        L32:
            int r4 = r4 + 1
            goto L10
        L35:
            java.lang.String r7 = "Unexpected child source info "
            defpackage.f81.p(r5, r7)
        L3a:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ku0.a(int, uk2, java.lang.Object):boolean");
    }

    public void b(int i, uk2 uk2Var, Object obj) {
        ((ArrayList) this.a).add(new lu0(i, null, null));
    }

    public abstract void c(zz5 zz5Var);

    public abstract void d();

    public abstract void e();

    public abstract Object f();

    public List g(gj3 gj3Var, int i, long j) {
        j14 j14Var = (j14) this.a;
        List list = (List) j14Var.b(i);
        if (list != null) {
            return list;
        }
        List a = gj3Var.a(i);
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((mv3) a.get(i2)).c(j));
        }
        j14Var.i(i, arrayList);
        return arrayList;
    }

    public abstract Object h();

    public void i(int i, Object obj, uk2 uk2Var, Object obj2) {
        if (!b53.x(obj, su0.a)) {
            return;
        }
        b(i, uk2Var, null);
    }

    public abstract mi2 j(zz5 zz5Var);

    public abstract void k(lj0 lj0Var);

    public abstract void l(Object obj);

    public abstract void m(kx6 kx6Var);

    public abstract void n();
}

package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ff2  reason: default package */
/* loaded from: classes.dex */
public abstract class ff2 extends j62 {
    public final j62 B;

    public ff2(j62 j62Var) {
        j62Var.getClass();
        this.B = j62Var;
    }

    @Override // defpackage.j62
    public final List D(jk4 jk4Var) {
        jk4Var.getClass();
        List<jk4> D = this.B.D(jk4Var);
        ArrayList arrayList = new ArrayList();
        for (jk4 jk4Var2 : D) {
            jk4Var2.getClass();
            arrayList.add(jk4Var2);
        }
        wq0.z0(arrayList);
        return arrayList;
    }

    @Override // defpackage.j62
    public final wd1 I(jk4 jk4Var) {
        jk4Var.getClass();
        wd1 I = this.B.I(jk4Var);
        if (I == null) {
            return null;
        }
        jk4 jk4Var2 = (jk4) I.d;
        if (jk4Var2 == null) {
            return I;
        }
        Map map = (Map) I.i;
        map.getClass();
        return new wd1(I.b, I.c, jk4Var2, (Long) I.e, (Long) I.f, (Long) I.g, (Long) I.h, map);
    }

    @Override // defpackage.j62
    public final c93 J(jk4 jk4Var) {
        return this.B.J(jk4Var);
    }

    @Override // defpackage.j62
    public final sb6 N(jk4 jk4Var) {
        jk4Var.getClass();
        return this.B.N(jk4Var);
    }

    @Override // defpackage.j62, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B.close();
    }

    @Override // defpackage.j62
    public final g76 d(jk4 jk4Var) {
        jk4Var.getClass();
        return this.B.d(jk4Var);
    }

    @Override // defpackage.j62
    public final void i(jk4 jk4Var, jk4 jk4Var2) {
        jk4Var.getClass();
        jk4Var2.getClass();
        this.B.i(jk4Var, jk4Var2);
    }

    public final String toString() {
        return q75.a(getClass()).c() + '(' + this.B + ')';
    }

    @Override // defpackage.j62
    public final void w(jk4 jk4Var) {
        jk4Var.getClass();
        this.B.w(jk4Var);
    }

    @Override // defpackage.j62
    public final void x(jk4 jk4Var) {
        jk4Var.getClass();
        this.B.x(jk4Var);
    }
}

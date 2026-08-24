package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ek2  reason: default package */
/* loaded from: classes.dex */
public abstract class ek2 extends db2 {
    public final db2 B;

    public ek2(db2 db2Var) {
        db2Var.getClass();
        this.B = db2Var;
    }

    @Override // defpackage.db2
    public final ai1 D(lt4 lt4Var) {
        lt4Var.getClass();
        ai1 D = this.B.D(lt4Var);
        if (D == null) {
            return null;
        }
        lt4 lt4Var2 = (lt4) D.d;
        if (lt4Var2 == null) {
            return D;
        }
        Map map = (Map) D.i;
        map.getClass();
        return new ai1(D.b, D.c, lt4Var2, (Long) D.e, (Long) D.f, (Long) D.g, (Long) D.h, map);
    }

    @Override // defpackage.db2
    public final wf3 F(lt4 lt4Var) {
        return this.B.F(lt4Var);
    }

    @Override // defpackage.db2
    public final in6 N(lt4 lt4Var) {
        lt4Var.getClass();
        return this.B.N(lt4Var);
    }

    @Override // defpackage.db2, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.B.close();
    }

    @Override // defpackage.db2
    public final ui6 e(lt4 lt4Var) {
        lt4Var.getClass();
        return this.B.e(lt4Var);
    }

    @Override // defpackage.db2
    public final void h(lt4 lt4Var, lt4 lt4Var2) {
        lt4Var.getClass();
        lt4Var2.getClass();
        this.B.h(lt4Var, lt4Var2);
    }

    @Override // defpackage.db2
    public final void n(lt4 lt4Var) {
        lt4Var.getClass();
        this.B.n(lt4Var);
    }

    @Override // defpackage.db2
    public final void r(lt4 lt4Var) {
        lt4Var.getClass();
        this.B.r(lt4Var);
    }

    public final String toString() {
        return gh5.a(getClass()).c() + '(' + this.B + ')';
    }

    @Override // defpackage.db2
    public final List x(lt4 lt4Var) {
        lt4Var.getClass();
        List<lt4> x = this.B.x(lt4Var);
        ArrayList arrayList = new ArrayList();
        for (lt4 lt4Var2 : x) {
            lt4Var2.getClass();
            arrayList.add(lt4Var2);
        }
        jt0.w0(arrayList);
        return arrayList;
    }
}

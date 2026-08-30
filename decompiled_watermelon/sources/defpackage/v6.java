package defpackage;

import java.util.LinkedHashSet;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: v6  reason: default package */
/* loaded from: classes.dex */
public final class v6 {
    public final xa6 a = new xa6();
    public final LinkedHashSet b = new LinkedHashSet();
    public long c;

    public final void a(dy4 dy4Var, l3 l3Var) {
        r6 r6Var = new r6(dy4Var, l3Var, 1);
        xa6 xa6Var = this.a;
        tq0.Z0(xa6Var, r6Var);
        xa6Var.add(0, new k3(dy4Var, l3Var, new os(new t6(this, dy4Var, l3Var, 1)), f()));
    }

    public final void b(m3 m3Var, l3 l3Var) {
        o6 o6Var = new o6(m3Var, l3Var, 0);
        xa6 xa6Var = this.a;
        tq0.Z0(xa6Var, o6Var);
        xa6Var.add(0, new n3(m3Var.a, m3Var.b, m3Var.c, m3Var.d, l3Var, new os(new t6(this, m3Var, l3Var, 0)), f()));
    }

    public final void c(e05 e05Var) {
        this.a.add(0, new j3(e05Var.a, e05Var.b, e05Var.c, e05Var.d, new os(new p6(2, this, e05Var)), f()));
    }

    public final void d(int i, se seVar, boolean z) {
        xa6 xa6Var = this.a;
        Object obj = xa6Var.get(i);
        obj.getClass();
        s3 s3Var = (s3) obj;
        os osVar = s3Var.c;
        s3 s3Var2 = new s3(seVar, z, osVar, s3Var.d);
        ((n24) osVar.L).c.setValue(Boolean.TRUE);
        xa6Var.set(i, s3Var2);
    }

    public final void e(int i, e05 e05Var) {
        xa6 xa6Var = this.a;
        Object obj = xa6Var.get(i);
        obj.getClass();
        j3 j3Var = (j3) obj;
        os osVar = j3Var.e;
        long j = j3Var.a.a;
        dy4 dy4Var = e05Var.a;
        int i2 = (j > dy4Var.a ? 1 : (j == dy4Var.a ? 0 : -1));
        int i3 = e05Var.b;
        if (i2 == 0) {
            xa6Var.set(i, new j3(dy4Var, i3, e05Var.c, e05Var.d, osVar, j3Var.f));
        } else if (i3 / e05Var.c > j3Var.b / j3Var.c) {
            osVar.q();
            c(e05Var);
        }
    }

    public final long f() {
        long j = this.c;
        this.c = 1 + j;
        return j;
    }
}

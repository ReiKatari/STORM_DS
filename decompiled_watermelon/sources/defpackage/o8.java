package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: o8  reason: default package */
/* loaded from: classes.dex */
public final class o8 extends m56 {
    public q36 a;
    public final tj4 b;

    public o8(q36 q36Var, y55 y55Var) {
        this.a = q36Var;
        this.b = me2.G(y55Var);
    }

    @Override // defpackage.m56
    public final m56 a(u36 u36Var, q36 q36Var, long j, long j2, long j3) {
        Object obj;
        q9 q9Var = new q9(j, mb4.d(j2, j3), j3);
        y55 c = c();
        if (c == null) {
            q36 q36Var2 = this.a;
            if (q36Var2 == null) {
                List b = u36Var.b();
                int size = b.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        obj = b.get(i);
                        if (u36Var.c().contains((w36) obj)) {
                            break;
                        }
                        i++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                w36 w36Var = (w36) obj;
                if (w36Var != null) {
                    q36Var2 = w36Var.g0;
                } else {
                    q36Var2 = null;
                }
            }
            c = sn2.h(u36Var, q36Var2);
            if (c == null) {
                c = yf2.b(j2, j);
            }
        }
        sn2.i(q9Var, j, j2, j3, true);
        return new n8(q9Var, q36Var, c);
    }

    @Override // defpackage.m56
    public final boolean b() {
        return true;
    }

    @Override // defpackage.m56
    public final y55 c() {
        return (y55) this.b.getValue();
    }

    @Override // defpackage.m56
    public final q9 e() {
        return null;
    }

    @Override // defpackage.m56
    public final y55 f(u36 u36Var) {
        Object obj;
        y55 c = c();
        if (c != null) {
            return c;
        }
        if (c() == null) {
            q36 q36Var = this.a;
            if (q36Var == null) {
                List b = u36Var.b();
                int size = b.size();
                int i = 0;
                while (true) {
                    if (i < size) {
                        obj = b.get(i);
                        if (u36Var.c().contains((w36) obj)) {
                            break;
                        }
                        i++;
                    } else {
                        obj = null;
                        break;
                    }
                }
                w36 w36Var = (w36) obj;
                if (w36Var != null) {
                    q36Var = w36Var.g0;
                } else {
                    q36Var = null;
                }
            }
            y55 h = sn2.h(u36Var, q36Var);
            if (h != null) {
                this.b.setValue(h);
            }
        }
        return c();
    }

    @Override // defpackage.m56
    public final m56 g(q36 q36Var) {
        if (this.a == null) {
            this.a = q36Var;
        }
        return this;
    }

    @Override // defpackage.m56
    public final m56 h() {
        return c74.a;
    }

    @Override // defpackage.m56
    public final void i(y55 y55Var) {
        this.b.setValue(y55Var);
    }
}

package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: js1  reason: default package */
/* loaded from: classes.dex */
public final class js1 extends ra7 {
    public final r9 b;
    public final w16 c;
    public final c46 d;
    public final o45 e;
    public se f;

    public js1(r9 r9Var, w16 w16Var) {
        w16Var.getClass();
        this.b = r9Var;
        this.c = w16Var;
        c46 f = ln2.f();
        this.d = f;
        this.e = new o45(f);
    }

    public final void e() {
        se seVar = this.f;
        if (seVar != null) {
            if (seVar instanceof is1) {
                rg5 rg5Var = ((is1) seVar).p;
                rg5Var.getClass();
                this.f = new is1(rg5Var);
                tq5.w(ua7.a(this), null, null, new ba1(this, rg5Var, null, 6), 3);
            } else if (seVar instanceof hs1) {
                ConsoleType consoleType = ((hs1) seVar).p;
                consoleType.getClass();
                this.f = new hs1(consoleType);
                tq5.w(ua7.a(this), null, null, new ba1(this, consoleType, null, 5), 3);
            } else {
                i.c();
            }
        }
    }
}

package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: cv  reason: default package */
/* loaded from: classes.dex */
public final class cv implements ld1 {
    public final char a;

    public cv(char c) {
        this.a = c;
    }

    @Override // defpackage.ld1
    public final char a() {
        return this.a;
    }

    @Override // defpackage.ld1
    public final int b() {
        return 1;
    }

    @Override // defpackage.ld1
    public final int c(kd1 kd1Var, kd1 kd1Var2) {
        if (kd1Var.d || kd1Var2.c) {
            int i = kd1Var2.h;
            if (i % 3 != 0 && (kd1Var.h + i) % 3 == 0) {
                return 0;
            }
        }
        if (kd1Var.g >= 2 && kd1Var2.g >= 2) {
            return 2;
        }
        return 1;
    }

    @Override // defpackage.ld1
    public final void d(jn6 jn6Var, jn6 jn6Var2, int i) {
        vy0 vy0Var;
        String.valueOf(this.a);
        if (i == 1) {
            vy0Var = new vy0();
        } else {
            vy0Var = new vy0();
        }
        for (vy0 vy0Var2 = (vy0) jn6Var.f; vy0Var2 != null && vy0Var2 != jn6Var2; vy0Var2 = (vy0) vy0Var2.f) {
            vy0Var.b(vy0Var2);
        }
        vy0Var.j();
        vy0 vy0Var3 = (vy0) jn6Var.f;
        vy0Var.f = vy0Var3;
        if (vy0Var3 != null) {
            vy0Var3.e = vy0Var;
        }
        vy0Var.e = jn6Var;
        jn6Var.f = vy0Var;
        vy0 vy0Var4 = (vy0) jn6Var.b;
        vy0Var.b = vy0Var4;
        if (((vy0) vy0Var.f) == null) {
            vy0Var4.d = vy0Var;
        }
    }

    @Override // defpackage.ld1
    public final char e() {
        return this.a;
    }
}

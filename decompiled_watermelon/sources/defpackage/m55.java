package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: m55  reason: default package */
/* loaded from: classes.dex */
public final class m55 {
    public iv0 a;
    public int b;
    public mk2 c;
    public aj2 d;
    public int e;
    public s14 f;
    public d24 g;

    public m55(iv0 iv0Var) {
        this.a = iv0Var;
    }

    public final boolean a() {
        boolean z;
        if (this.a != null) {
            mk2 mk2Var = this.c;
            if (mk2Var != null) {
                z = mk2Var.a();
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final l53 b(Object obj) {
        l53 s;
        iv0 iv0Var = this.a;
        if (iv0Var != null && (s = iv0Var.s(this, obj)) != null) {
            return s;
        }
        return l53.IGNORED;
    }

    public final void c() {
        iv0 iv0Var = this.a;
        if (iv0Var != null) {
            iv0Var.j0 = true;
            iv0Var.o0.R();
        }
        this.a = null;
        this.f = null;
        this.g = null;
        this.d = null;
    }

    public final void d(boolean z) {
        int i;
        int i2 = this.b;
        if (z) {
            i = i2 | 32;
        } else {
            i = i2 & (-33);
        }
        this.b = i;
    }
}

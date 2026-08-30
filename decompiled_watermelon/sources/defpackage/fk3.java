package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: fk3  reason: default package */
/* loaded from: classes.dex */
public final class fk3 implements ej3 {
    public final pk3 a;
    public final ek3 b;
    public final ni3 c;
    public final sh d;

    public fk3(pk3 pk3Var, ek3 ek3Var, ni3 ni3Var, sh shVar) {
        this.a = pk3Var;
        this.b = ek3Var;
        this.c = ni3Var;
        this.d = shVar;
    }

    @Override // defpackage.ej3
    public final int a() {
        return this.b.u().b;
    }

    @Override // defpackage.ej3
    public final void b(int i, Object obj, tu0 tu0Var, int i2) {
        int i3;
        int i4;
        int i5;
        boolean z;
        sk2 sk2Var = (sk2) tu0Var;
        sk2Var.Z(-462424778);
        if (sk2Var.d(i)) {
            i3 = 4;
        } else {
            i3 = 2;
        }
        int i6 = i3 | i2;
        if (sk2Var.h(obj)) {
            i4 = 32;
        } else {
            i4 = 16;
        }
        int i7 = i6 | i4;
        if (sk2Var.f(this)) {
            i5 = 256;
        } else {
            i5 = 128;
        }
        int i8 = i7 | i5;
        if ((i8 & 147) != 146) {
            z = true;
        } else {
            z = false;
        }
        if (sk2Var.O(i8 & 1, z)) {
            nk2.g(obj, i, this.a.s, ct3.H0(-824725566, new qh3(this, i, 1), sk2Var), sk2Var, ((i8 >> 3) & 14) | 3072 | ((i8 << 3) & 112));
        } else {
            sk2Var.R();
        }
        m55 r = sk2Var.r();
        if (r != null) {
            r.d = new vo(this, i, obj, i2, 8);
        }
    }

    @Override // defpackage.ej3
    public final Object c(int i) {
        Object f = this.d.f(i);
        if (f == null) {
            return this.b.v(i);
        }
        return f;
    }

    @Override // defpackage.ej3
    public final Object d(int i) {
        return this.b.s(i);
    }

    @Override // defpackage.ej3
    public final int e(Object obj) {
        return this.d.e(obj);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fk3)) {
            return false;
        }
        return b53.x(this.b, ((fk3) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}

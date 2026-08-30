package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: pp3  reason: default package */
/* loaded from: classes.dex */
public final class pp3 extends t {
    public final op3 a = new vy0();
    public final int b;
    public boolean c;

    /* JADX WARN: Type inference failed for: r0v0, types: [op3, vy0] */
    public pp3(int i) {
        this.b = i;
    }

    @Override // defpackage.t
    public final boolean b(c30 c30Var) {
        if (this.c) {
            c30 c30Var2 = (c30) ((vy0) this.a.b);
            if (c30Var2 instanceof ep3) {
                ((ep3) c30Var2).g = false;
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // defpackage.t
    public final c30 d() {
        return this.a;
    }

    @Override // defpackage.t
    public final boolean e() {
        return true;
    }

    @Override // defpackage.t
    public final d30 g(vh1 vh1Var) {
        boolean z = false;
        if (vh1Var.h) {
            if (((vy0) this.a.c) != null) {
                c30 d = vh1Var.h().d();
                this.c = ((d instanceof vi4) || (d instanceof op3)) ? true : true;
                return d30.a(vh1Var.e);
            }
            return null;
        }
        int i = vh1Var.g;
        int i2 = this.b;
        if (i >= i2) {
            return new d30(-1, false, vh1Var.c + i2);
        }
        return null;
    }
}

package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p52  reason: default package */
/* loaded from: classes.dex */
public final class p52 extends t {
    public final o52 a;
    public String b;
    public final StringBuilder c;

    /* JADX WARN: Type inference failed for: r0v0, types: [vy0, o52] */
    public p52(char c, int i, int i2) {
        ?? vy0Var = new vy0();
        this.a = vy0Var;
        this.c = new StringBuilder();
        vy0Var.g = c;
        vy0Var.h = i;
        vy0Var.i = i2;
    }

    @Override // defpackage.t
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // defpackage.t
    public final void c() {
        String a = n12.a(this.b.trim());
        o52 o52Var = this.a;
        o52Var.j = a;
        o52Var.k = this.c.toString();
    }

    @Override // defpackage.t
    public final c30 d() {
        return this.a;
    }

    @Override // defpackage.t
    public final d30 g(vh1 vh1Var) {
        int i = vh1Var.e;
        int i2 = vh1Var.b;
        CharSequence charSequence = vh1Var.a;
        int i3 = vh1Var.g;
        o52 o52Var = this.a;
        if (i3 < 4) {
            char c = o52Var.g;
            int i4 = o52Var.h;
            int U = mj2.U(c, i, charSequence.length(), charSequence) - i;
            if (U >= i4 && mj2.V(charSequence, i + U, charSequence.length()) == charSequence.length()) {
                return new d30(-1, true, -1);
            }
        }
        int length = charSequence.length();
        for (int i5 = o52Var.i; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return d30.a(i2);
    }
}

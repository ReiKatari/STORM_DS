package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ia2  reason: default package */
/* loaded from: classes.dex */
public final class ia2 extends u {
    public final ha2 a;
    public String b;
    public final StringBuilder c;

    /* JADX WARN: Type inference failed for: r0v0, types: [a21, ha2] */
    public ia2(char c, int i, int i2) {
        ?? a21Var = new a21();
        this.a = a21Var;
        this.c = new StringBuilder();
        a21Var.g = c;
        a21Var.h = i;
        a21Var.i = i2;
    }

    @Override // defpackage.u
    public final void a(CharSequence charSequence) {
        if (this.b == null) {
            this.b = charSequence.toString();
            return;
        }
        StringBuilder sb = this.c;
        sb.append(charSequence);
        sb.append('\n');
    }

    @Override // defpackage.u
    public final void c() {
        String a = c62.a(this.b.trim());
        ha2 ha2Var = this.a;
        ha2Var.j = a;
        ha2Var.k = this.c.toString();
    }

    @Override // defpackage.u
    public final a50 d() {
        return this.a;
    }

    @Override // defpackage.u
    public final b50 g(am1 am1Var) {
        int i = am1Var.e;
        int i2 = am1Var.b;
        CharSequence charSequence = am1Var.a;
        int i3 = am1Var.g;
        ha2 ha2Var = this.a;
        if (i3 < 4) {
            char c = ha2Var.g;
            int i4 = ha2Var.h;
            int S = bl2.S(c, i, charSequence.length(), charSequence) - i;
            if (S >= i4 && bl2.T(charSequence, i + S, charSequence.length()) == charSequence.length()) {
                return new b50(-1, true, -1);
            }
        }
        int length = charSequence.length();
        for (int i5 = ha2Var.i; i5 > 0 && i2 < length && charSequence.charAt(i2) == ' '; i5--) {
            i2++;
        }
        return b50.a(i2);
    }
}

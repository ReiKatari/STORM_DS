package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: i30  reason: default package */
/* loaded from: classes.dex */
public final class i30 extends t {
    public final g30 a = new vy0();

    @Override // defpackage.t
    public final c30 d() {
        return this.a;
    }

    @Override // defpackage.t
    public final d30 g(vh1 vh1Var) {
        char charAt;
        int i = vh1Var.e;
        CharSequence charSequence = vh1Var.a;
        if (vh1Var.g < 4 && i < charSequence.length() && charSequence.charAt(i) == '>') {
            int i2 = vh1Var.c + vh1Var.g;
            int i3 = i2 + 1;
            CharSequence charSequence2 = vh1Var.a;
            int i4 = i + 1;
            if (i4 < charSequence2.length() && ((charAt = charSequence2.charAt(i4)) == '\t' || charAt == ' ')) {
                i3 = i2 + 2;
            }
            return new d30(-1, false, i3);
        }
        return null;
    }
}

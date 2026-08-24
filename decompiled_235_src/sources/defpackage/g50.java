package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: g50  reason: default package */
/* loaded from: classes.dex */
public final class g50 extends u {
    public final e50 a = new a21();

    @Override // defpackage.u
    public final a50 d() {
        return this.a;
    }

    @Override // defpackage.u
    public final b50 g(am1 am1Var) {
        char charAt;
        int i = am1Var.e;
        CharSequence charSequence = am1Var.a;
        if (am1Var.g < 4 && i < charSequence.length() && charSequence.charAt(i) == '>') {
            int i2 = am1Var.c + am1Var.g;
            int i3 = i2 + 1;
            CharSequence charSequence2 = am1Var.a;
            int i4 = i + 1;
            if (i4 < charSequence2.length() && ((charAt = charSequence2.charAt(i4)) == '\t' || charAt == ' ')) {
                i3 = i2 + 2;
            }
            return new b50(-1, false, i3);
        }
        return null;
    }
}

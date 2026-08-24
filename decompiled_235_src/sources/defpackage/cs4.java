package defpackage;

import java.util.Locale;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: cs4  reason: default package */
/* loaded from: classes.dex */
public final class cs4 extends u {
    public final xr4 a = new a21();
    public final tv3 b = new tv3();

    /* JADX WARN: Code restructure failed: missing block: B:50:0x0104, code lost:
        if (r3 == r4) goto L11;
     */
    @Override // defpackage.u
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(CharSequence charSequence) {
        int Z;
        int i;
        String charSequence2;
        tv3 tv3Var = this.b;
        StringBuilder sb = tv3Var.b;
        if (sb.length() != 0) {
            sb.append('\n');
        }
        sb.append(charSequence);
        int i2 = 0;
        while (i2 < charSequence.length()) {
            switch (rv3.a[tv3Var.a.ordinal()]) {
                case 1:
                    return;
                case 2:
                    int T = bl2.T(charSequence, i2, charSequence.length());
                    if (T < charSequence.length() && charSequence.charAt(T) == '[') {
                        tv3Var.a = sv3.LABEL;
                        tv3Var.d = new StringBuilder();
                        i2 = T + 1;
                        if (i2 >= charSequence.length()) {
                            tv3Var.d.append('\n');
                            continue;
                        } else {
                            continue;
                        }
                    }
                    i2 = -1;
                    continue;
                case 3:
                    Z = ln2.Z(i2, charSequence);
                    if (Z != -1) {
                        tv3Var.d.append(charSequence, i2, Z);
                        if (Z >= charSequence.length()) {
                            tv3Var.d.append('\n');
                            i2 = Z;
                            continue;
                        } else if (charSequence.charAt(Z) == ']' && (i = Z + 1) < charSequence.length() && charSequence.charAt(i) == ':' && tv3Var.d.length() <= 999) {
                            String sb2 = tv3Var.d.toString();
                            Pattern pattern = c62.a;
                            String replaceAll = c62.c.matcher(sb2.trim().toLowerCase(Locale.ROOT)).replaceAll(" ");
                            if (!replaceAll.isEmpty()) {
                                tv3Var.e = replaceAll;
                                tv3Var.a = sv3.DESTINATION;
                                i2 = bl2.T(charSequence, Z + 2, charSequence.length());
                                continue;
                            }
                        }
                    }
                    i2 = -1;
                    continue;
                case 4:
                    int T2 = bl2.T(charSequence, i2, charSequence.length());
                    int Y = ln2.Y(T2, charSequence);
                    if (Y != -1) {
                        if (charSequence.charAt(T2) == '<') {
                            charSequence2 = charSequence.subSequence(T2 + 1, Y - 1).toString();
                        } else {
                            charSequence2 = charSequence.subSequence(T2, Y).toString();
                        }
                        tv3Var.f = charSequence2;
                        i2 = bl2.T(charSequence, Y, charSequence.length());
                        if (i2 >= charSequence.length()) {
                            tv3Var.i = true;
                            sb.setLength(0);
                        }
                        tv3Var.a = sv3.START_TITLE;
                        continue;
                    }
                    i2 = -1;
                    continue;
                case 5:
                    i2 = bl2.T(charSequence, i2, charSequence.length());
                    if (i2 >= charSequence.length()) {
                        tv3Var.a = sv3.START_DEFINITION;
                        continue;
                    } else {
                        tv3Var.g = (char) 0;
                        char charAt = charSequence.charAt(i2);
                        if (charAt != '\"' && charAt != '\'') {
                            if (charAt == '(') {
                                tv3Var.g = ')';
                            }
                        } else {
                            tv3Var.g = charAt;
                        }
                        if (tv3Var.g != 0) {
                            tv3Var.a = sv3.TITLE;
                            tv3Var.h = new StringBuilder();
                            i2++;
                            if (i2 == charSequence.length()) {
                                tv3Var.h.append('\n');
                                continue;
                            } else {
                                continue;
                            }
                        } else {
                            tv3Var.a();
                            tv3Var.a = sv3.START_DEFINITION;
                            continue;
                        }
                    }
                case 6:
                    Z = ln2.a0(charSequence, i2, tv3Var.g);
                    if (Z != -1) {
                        tv3Var.h.append(charSequence.subSequence(i2, Z));
                        if (Z >= charSequence.length()) {
                            tv3Var.h.append('\n');
                            i2 = Z;
                            continue;
                        } else {
                            i2 = bl2.T(charSequence, Z + 1, charSequence.length());
                            if (i2 == charSequence.length()) {
                                tv3Var.i = true;
                                tv3Var.a();
                                sb.setLength(0);
                                tv3Var.a = sv3.START_DEFINITION;
                                continue;
                            }
                        }
                    }
                    i2 = -1;
                    continue;
            }
            if (i2 == -1) {
                tv3Var.a = sv3.PARAGRAPH;
                return;
            }
        }
    }

    @Override // defpackage.u
    public final void c() {
        if (this.b.b.length() == 0) {
            this.a.j();
        }
    }

    @Override // defpackage.u
    public final a50 d() {
        return this.a;
    }

    @Override // defpackage.u
    public final void f(v53 v53Var) {
        StringBuilder sb = this.b.b;
        if (sb.length() > 0) {
            v53Var.f(sb.toString(), this.a);
        }
    }

    @Override // defpackage.u
    public final b50 g(am1 am1Var) {
        if (!am1Var.h) {
            return b50.a(am1Var.b);
        }
        return null;
    }
}

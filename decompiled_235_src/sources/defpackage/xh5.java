package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xh5  reason: default package */
/* loaded from: classes.dex */
public final class xh5 implements Serializable {
    public final Pattern A;

    public xh5(String str, Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((yh5) it.next()).getValue();
        }
        Pattern compile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        compile.getClass();
        this.A = compile;
    }

    public static qd2 a(xh5 xh5Var, String str) {
        xh5Var.getClass();
        if (str.length() >= 0) {
            return new qd2(new ci2(20, xh5Var, str), wh5.d0, 3);
        }
        u34.q(xg6.t("Start index out of bounds: ", 0, ", input length: "), str.length());
        return null;
    }

    public final n14 b(int i, String str) {
        str.getClass();
        Matcher region = this.A.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new n14(region, str);
        }
        return null;
    }

    public final n14 c(String str) {
        str.getClass();
        Matcher matcher = this.A.matcher(str);
        matcher.getClass();
        if (!matcher.matches()) {
            return null;
        }
        return new n14(matcher, str);
    }

    public final boolean d(CharSequence charSequence) {
        charSequence.getClass();
        return this.A.matcher(charSequence).matches();
    }

    public final String e(String str, qn2 qn2Var) {
        str.getClass();
        Matcher matcher = this.A.matcher(str);
        matcher.getClass();
        int i = 0;
        n14 k = kn2.k(matcher, 0, str);
        if (k == null) {
            return str.toString();
        }
        int length = str.length();
        StringBuilder sb = new StringBuilder(length);
        do {
            sb.append((CharSequence) str, i, k.b().A);
            sb.append((CharSequence) qn2Var.g(k));
            i = k.b().B + 1;
            k = k.c();
            if (i >= length) {
                break;
            }
        } while (k != null);
        if (i < length) {
            sb.append((CharSequence) str, i, length);
        }
        return sb.toString();
    }

    public final String toString() {
        String pattern = this.A.toString();
        pattern.getClass();
        return pattern;
    }

    public xh5(String str, yh5 yh5Var) {
        str.getClass();
        yh5Var.getClass();
        int value = yh5Var.getValue();
        Pattern compile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        compile.getClass();
        this.A = compile;
    }

    public xh5(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.A = compile;
    }
}

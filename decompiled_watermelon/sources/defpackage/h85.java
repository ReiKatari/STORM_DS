package defpackage;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: h85  reason: default package */
/* loaded from: classes.dex */
public final class h85 implements Serializable {
    public final Pattern A;

    public h85(String str, Set set) {
        Iterator it = set.iterator();
        int i = 0;
        while (it.hasNext()) {
            i |= ((i85) it.next()).getValue();
        }
        Pattern compile = Pattern.compile(str, (i & 2) != 0 ? i | 64 : i);
        compile.getClass();
        this.A = compile;
    }

    public static o72 a(h85 h85Var, String str) {
        h85Var.getClass();
        if (str.length() >= 0) {
            return new o72(new jd2(19, h85Var, str), g85.c0);
        }
        c44.p(wh1.s("Start index out of bounds: ", 0, ", input length: "), str.length());
        return null;
    }

    public final ku3 b(int i, String str) {
        str.getClass();
        Matcher region = this.A.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i, str.length());
        if (region.lookingAt()) {
            return new ku3(region, str);
        }
        return null;
    }

    public final ku3 c(String str) {
        str.getClass();
        Matcher matcher = this.A.matcher(str);
        matcher.getClass();
        if (!matcher.matches()) {
            return null;
        }
        return new ku3(matcher, str);
    }

    public final boolean d(CharSequence charSequence) {
        charSequence.getClass();
        return this.A.matcher(charSequence).matches();
    }

    public final String toString() {
        String pattern = this.A.toString();
        pattern.getClass();
        return pattern;
    }

    public h85(String str, i85 i85Var) {
        str.getClass();
        i85Var.getClass();
        int value = i85Var.getValue();
        Pattern compile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        compile.getClass();
        this.A = compile;
    }

    public h85(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.A = compile;
    }
}

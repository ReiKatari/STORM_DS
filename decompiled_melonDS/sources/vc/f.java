package vc;

import java.io.Serializable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class f implements Serializable {
    public final Pattern A;

    public f(String str, g gVar) {
        str.getClass();
        gVar.getClass();
        int value = gVar.getValue();
        Pattern compile = Pattern.compile(str, (value & 2) != 0 ? value | 64 : value);
        compile.getClass();
        this.A = compile;
    }

    public final b9.e a(int i2, String str) {
        str.getClass();
        Matcher region = this.A.matcher(str).useAnchoringBounds(false).useTransparentBounds(true).region(i2, str.length());
        if (region.lookingAt()) {
            return new b9.e(region, str);
        }
        return null;
    }

    public final b9.e b(String str) {
        str.getClass();
        Matcher matcher = this.A.matcher(str);
        matcher.getClass();
        if (!matcher.matches()) {
            return null;
        }
        return new b9.e(matcher, str);
    }

    public final boolean c(CharSequence charSequence) {
        charSequence.getClass();
        return this.A.matcher(charSequence).matches();
    }

    public final String toString() {
        String pattern = this.A.toString();
        pattern.getClass();
        return pattern;
    }

    public f(String str) {
        str.getClass();
        Pattern compile = Pattern.compile(str);
        compile.getClass();
        this.A = compile;
    }
}

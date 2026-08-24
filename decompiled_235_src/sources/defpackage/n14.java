package defpackage;

import java.util.List;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: n14  reason: default package */
/* loaded from: classes.dex */
public final class n14 {
    public final Matcher a;
    public final CharSequence b;
    public final m14 c;
    public l14 d;

    public n14(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new m14(this, 0);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new l14(this);
        }
        l14 l14Var = this.d;
        l14Var.getClass();
        return l14Var;
    }

    public final l93 b() {
        Matcher matcher = this.a;
        return gi2.R(matcher.start(), matcher.end());
    }

    public final n14 c() {
        int i;
        Matcher matcher = this.a;
        int end = matcher.end();
        if (matcher.end() == matcher.start()) {
            i = 1;
        } else {
            i = 0;
        }
        int i2 = end + i;
        CharSequence charSequence = this.b;
        if (i2 <= charSequence.length()) {
            Matcher matcher2 = matcher.pattern().matcher(charSequence);
            matcher2.getClass();
            return kn2.k(matcher2, i2, charSequence);
        }
        return null;
    }
}

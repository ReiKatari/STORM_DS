package defpackage;

import java.util.List;
import java.util.regex.Matcher;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ku3  reason: default package */
/* loaded from: classes.dex */
public final class ku3 {
    public final Matcher a;
    public final CharSequence b;
    public final ju3 c;
    public iu3 d;

    public ku3(Matcher matcher, CharSequence charSequence) {
        charSequence.getClass();
        this.a = matcher;
        this.b = charSequence;
        this.c = new ju3(0, this);
    }

    public final List a() {
        if (this.d == null) {
            this.d = new iu3(this);
        }
        iu3 iu3Var = this.d;
        iu3Var.getClass();
        return iu3Var;
    }

    public final d33 b() {
        Matcher matcher = this.a;
        return io2.t0(matcher.start(), matcher.end());
    }

    public final ku3 c() {
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
            return gk2.m(matcher2, i2, charSequence);
        }
        return null;
    }
}

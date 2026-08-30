package defpackage;

import java.net.URL;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: c15  reason: default package */
/* loaded from: classes.dex */
public final class c15 extends h15 {
    public final URL a;
    public final int b;
    public final int c;

    public c15(URL url, int i, int i2) {
        this.a = url;
        this.b = i;
        this.c = i2;
    }

    @Override // defpackage.h15
    public final URL a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c15)) {
            return false;
        }
        c15 c15Var = (c15) obj;
        if (b53.x(this.a, c15Var.a) && this.b == c15Var.b && this.c == c15Var.c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        URL url = this.a;
        if (url == null) {
            hashCode = 0;
        } else {
            hashCode = url.hashCode();
        }
        return Integer.hashCode(this.c) + wh1.a(this.b, hashCode * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Loaded(icon=");
        sb.append(this.a);
        sb.append(", unlockedAchievements=");
        sb.append(this.b);
        sb.append(", totalAchievements=");
        return wh1.m(sb, this.c, ")");
    }
}

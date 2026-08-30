package defpackage;

import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ar1  reason: default package */
/* loaded from: classes.dex */
public final class ar1 implements cr1 {
    public final String a;
    public final List b;
    public final int c;
    public final mi2 d;

    public ar1(int i, mi2 mi2Var, String str, List list) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = mi2Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ar1) {
                ar1 ar1Var = (ar1) obj;
                if (!this.a.equals(ar1Var.a) || !this.b.equals(ar1Var.b) || this.c != ar1Var.c || !this.d.equals(ar1Var.d)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.d.hashCode() + wh1.a(this.c, b31.b(this.a.hashCode() * 31, 31, this.b), 31);
    }

    public final String toString() {
        return "Choice(title=" + this.a + ", labels=" + this.b + ", selectedIndex=" + this.c + ", onSelect=" + this.d + ")";
    }
}

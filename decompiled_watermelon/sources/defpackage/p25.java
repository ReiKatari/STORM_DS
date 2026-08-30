package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: p25  reason: default package */
/* loaded from: classes.dex */
public final class p25 implements r25 {
    public final n25 a;
    public final boolean b;
    public final ArrayList c;

    public p25(n25 n25Var, boolean z, ArrayList arrayList) {
        this.a = n25Var;
        this.b = z;
        this.c = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof p25) {
                p25 p25Var = (p25) obj;
                if (!this.a.equals(p25Var.a) || this.b != p25Var.b || !this.c.equals(p25Var.c)) {
                    return false;
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() + ej6.c(this.a.hashCode() * 31, this.b, 31);
    }

    public final String toString() {
        return "Committed(discarded=" + this.a + ", authenticationCleared=" + this.b + ", failures=" + this.c + ")";
    }
}

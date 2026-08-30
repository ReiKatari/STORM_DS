package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: wb6  reason: default package */
/* loaded from: classes.dex */
public final class wb6 extends q52 {
    public final xw2 a;
    public final String b;
    public final i81 c;

    public wb6(xw2 xw2Var, String str, i81 i81Var) {
        this.a = xw2Var;
        this.b = str;
        this.c = i81Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof wb6) {
                wb6 wb6Var = (wb6) obj;
                if (this.a.equals(wb6Var.a) && b53.x(this.b, wb6Var.b) && this.c == wb6Var.c) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i;
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        if (str != null) {
            i = str.hashCode();
        } else {
            i = 0;
        }
        return this.c.hashCode() + ((hashCode + i) * 31);
    }
}

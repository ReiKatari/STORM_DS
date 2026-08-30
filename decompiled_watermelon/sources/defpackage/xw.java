package defpackage;

import java.util.ArrayList;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xw  reason: default package */
/* loaded from: classes.dex */
public final class xw {
    public final wj6 a;
    public final wj6 b;
    public final ArrayList c;

    public xw(wj6 wj6Var, wj6 wj6Var2, ArrayList arrayList) {
        if (wj6Var != null) {
            this.a = wj6Var;
            if (wj6Var2 != null) {
                this.b = wj6Var2;
                this.c = arrayList;
                return;
            }
            c44.i("Null secondarySurfaceEdge");
            throw null;
        }
        c44.i("Null primarySurfaceEdge");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (obj instanceof xw) {
                xw xwVar = (xw) obj;
                if (this.a.equals(xwVar.a) && this.b.equals(xwVar.b) && this.c.equals(xwVar.c)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "In{primarySurfaceEdge=" + this.a + ", secondarySurfaceEdge=" + this.b + ", outConfigs=" + this.c + "}";
    }
}

package defpackage;

import android.content.Context;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: yx  reason: default package */
/* loaded from: classes.dex */
public final class yx extends f71 {
    public final Context a;
    public final wr0 b;
    public final wr0 c;
    public final String d;

    public yx(Context context, wr0 wr0Var, wr0 wr0Var2, String str) {
        if (context != null) {
            this.a = context;
            if (wr0Var != null) {
                this.b = wr0Var;
                if (wr0Var2 != null) {
                    this.c = wr0Var2;
                    if (str != null) {
                        this.d = str;
                        return;
                    } else {
                        u34.x("Null backendName");
                        throw null;
                    }
                }
                u34.x("Null monotonicClock");
                throw null;
            }
            u34.x("Null wallClock");
            throw null;
        }
        u34.x("Null applicationContext");
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f71) {
            yx yxVar = (yx) ((f71) obj);
            if (this.a.equals(yxVar.a) && this.b.equals(yxVar.b) && this.c.equals(yxVar.c) && this.d.equals(yxVar.d)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode() ^ ((((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003) ^ this.c.hashCode()) * 1000003);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.a);
        sb.append(", wallClock=");
        sb.append(this.b);
        sb.append(", monotonicClock=");
        sb.append(this.c);
        sb.append(", backendName=");
        return i61.n(sb, this.d, "}");
    }
}

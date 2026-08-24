package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: my  reason: default package */
/* loaded from: classes.dex */
public final class my {
    public final int a;
    public final yf0 b;

    public my(int i, yf0 yf0Var) {
        this.a = i;
        if (yf0Var != null) {
            this.b = yf0Var;
        } else {
            u34.x("Null cameraIdentifier");
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof my) {
            my myVar = (my) obj;
            if (this.a == myVar.a && this.b.equals(myVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "Key{lifecycleOwnerHash=" + this.a + ", cameraIdentifier=" + this.b + "}";
    }
}

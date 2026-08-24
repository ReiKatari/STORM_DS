package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: lu5  reason: default package */
/* loaded from: classes.dex */
public final class lu5 extends tu5 {
    public final String a;

    public lu5(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof lu5) && nb3.k(this.a, ((lu5) obj).a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return lb1.A("RetroArchShaderParametersUpdate(parameters=", this.a, ")");
    }
}

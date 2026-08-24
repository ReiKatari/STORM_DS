package defpackage;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ob2  reason: default package */
/* loaded from: classes.dex */
public final class ob2 {
    public final mt5 a;

    public ob2(mt5 mt5Var) {
        this.a = mt5Var;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof ob2) || !this.a.equals(((ob2) obj).a)) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Integer.hashCode(1) * 31);
    }

    public final String toString() {
        return "RomOptionsDto(version=1, config=" + this.a + ")";
    }
}

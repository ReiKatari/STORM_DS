package defpackage;

import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: si2  reason: default package */
/* loaded from: classes.dex */
public final class si2 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof si2)) {
            return false;
        }
        si2 si2Var = (si2) obj;
        if (Objects.equals(this.a, si2Var.a) && Objects.equals(this.b, si2Var.b) && Objects.equals(this.c, si2Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}

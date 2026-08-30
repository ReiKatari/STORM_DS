package defpackage;

import java.util.List;
import java.util.Objects;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: vd2  reason: default package */
/* loaded from: classes.dex */
public final class vd2 {
    public String a;
    public String b;
    public List c;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd2)) {
            return false;
        }
        vd2 vd2Var = (vd2) obj;
        if (Objects.equals(this.a, vd2Var.a) && Objects.equals(this.b, vd2Var.b) && Objects.equals(this.c, vd2Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b, this.c);
    }
}

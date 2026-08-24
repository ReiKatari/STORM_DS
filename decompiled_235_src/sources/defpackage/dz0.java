package defpackage;

import java.util.Arrays;
import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: dz0  reason: default package */
/* loaded from: classes.dex */
public final class dz0 {
    public final ConsoleType a;
    public final cz0 b;
    public final String[] c;
    public final vr4[] d;

    public dz0(ConsoleType consoleType, cz0 cz0Var, String[] strArr, vr4[] vr4VarArr) {
        consoleType.getClass();
        cz0Var.getClass();
        strArr.getClass();
        vr4VarArr.getClass();
        this.a = consoleType;
        this.b = cz0Var;
        this.c = strArr;
        this.d = vr4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dz0)) {
            return false;
        }
        dz0 dz0Var = (dz0) obj;
        if (this.a == dz0Var.a && this.b == dz0Var.b && nb3.k(this.c, dz0Var.c) && nb3.k(this.d, dz0Var.d)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((this.b.hashCode() + (this.a.hashCode() * 31)) * 31) + Arrays.hashCode(this.c)) * 31) + Arrays.hashCode(this.d);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.c);
        String arrays2 = Arrays.toString(this.d);
        return "ConfigurationDirResult(consoleType=" + this.a + ", status=" + this.b + ", requiredFiles=" + arrays + ", fileResults=" + arrays2 + ")";
    }
}

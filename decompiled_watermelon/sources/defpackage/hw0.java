package defpackage;

import java.util.Arrays;
import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: hw0  reason: default package */
/* loaded from: classes.dex */
public final class hw0 {
    public final ConsoleType a;
    public final gw0 b;
    public final String[] c;
    public final ti4[] d;

    public hw0(ConsoleType consoleType, gw0 gw0Var, String[] strArr, ti4[] ti4VarArr) {
        consoleType.getClass();
        gw0Var.getClass();
        strArr.getClass();
        ti4VarArr.getClass();
        this.a = consoleType;
        this.b = gw0Var;
        this.c = strArr;
        this.d = ti4VarArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hw0)) {
            return false;
        }
        hw0 hw0Var = (hw0) obj;
        if (this.a == hw0Var.a && this.b == hw0Var.b && b53.x(this.c, hw0Var.c) && b53.x(this.d, hw0Var.d)) {
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

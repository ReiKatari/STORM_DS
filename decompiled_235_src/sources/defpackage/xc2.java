package defpackage;

import me.magnum.melonds.domain.model.ConsoleType;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xc2  reason: default package */
/* loaded from: classes.dex */
public final class xc2 extends yc2 {
    public final ConsoleType a;

    public xc2(ConsoleType consoleType) {
        this.a = consoleType;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (!(obj instanceof xc2) || this.a != ((xc2) obj).a) {
                return false;
            }
            return true;
        }
        return true;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "Success(consoleType=" + this.a + ")";
    }
}

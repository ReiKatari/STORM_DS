package defpackage;

import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z66  reason: default package */
/* loaded from: classes.dex */
public final class z66 {
    public final UUID a;
    public final BackgroundMode b;
    public final List c;

    public z66(UUID uuid, BackgroundMode backgroundMode, List list) {
        backgroundMode.getClass();
        this.a = uuid;
        this.b = backgroundMode;
        this.c = list;
    }

    public static z66 a(z66 z66Var, UUID uuid, BackgroundMode backgroundMode, List list, int i) {
        if ((i & 1) != 0) {
            uuid = z66Var.a;
        }
        if ((i & 2) != 0) {
            backgroundMode = z66Var.b;
        }
        if ((i & 4) != 0) {
            list = z66Var.c;
        }
        z66Var.getClass();
        backgroundMode.getClass();
        return new z66(uuid, backgroundMode, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z66)) {
            return false;
        }
        z66 z66Var = (z66) obj;
        if (nb3.k(this.a, z66Var.a) && this.b == z66Var.b && nb3.k(this.c, z66Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        int i = 0;
        UUID uuid = this.a;
        if (uuid == null) {
            hashCode = 0;
        } else {
            hashCode = uuid.hashCode();
        }
        int hashCode2 = (this.b.hashCode() + (hashCode * 31)) * 31;
        List list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        return "ScreenLayout(backgroundId=" + this.a + ", backgroundMode=" + this.b + ", components=" + this.c + ")";
    }

    public z66(List list) {
        this(null, BackgroundMode.FIT_CENTER, list);
    }
}

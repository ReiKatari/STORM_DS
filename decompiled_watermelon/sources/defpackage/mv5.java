package defpackage;

import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: mv5  reason: default package */
/* loaded from: classes.dex */
public final class mv5 {
    public final UUID a;
    public final BackgroundMode b;
    public final List c;

    public mv5(UUID uuid, BackgroundMode backgroundMode, List list) {
        backgroundMode.getClass();
        this.a = uuid;
        this.b = backgroundMode;
        this.c = list;
    }

    public static mv5 a(mv5 mv5Var, UUID uuid, BackgroundMode backgroundMode, List list, int i) {
        if ((i & 1) != 0) {
            uuid = mv5Var.a;
        }
        if ((i & 2) != 0) {
            backgroundMode = mv5Var.b;
        }
        if ((i & 4) != 0) {
            list = mv5Var.c;
        }
        mv5Var.getClass();
        backgroundMode.getClass();
        return new mv5(uuid, backgroundMode, list);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mv5)) {
            return false;
        }
        mv5 mv5Var = (mv5) obj;
        if (b53.x(this.a, mv5Var.a) && this.b == mv5Var.b && b53.x(this.c, mv5Var.c)) {
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

    public mv5(List list) {
        this(null, BackgroundMode.FIT_CENTER, list);
    }
}

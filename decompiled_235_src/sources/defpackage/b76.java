package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: b76  reason: default package */
/* loaded from: classes.dex */
public final class b76 {
    @gc6("backgroundId")
    private final String a;
    @gc6("backgroundMode")
    private final String b;
    @gc6("components")
    private final List<k05> c;

    /* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
    /* renamed from: b76$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static b76 a(z66 z66Var) {
            String str;
            z66Var.getClass();
            UUID uuid = z66Var.a;
            ArrayList arrayList = null;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            String name = z66Var.b.name();
            List<j05> list = z66Var.c;
            if (list != null) {
                arrayList = new ArrayList(ht0.v0(list, 10));
                for (j05 j05Var : list) {
                    j05Var.getClass();
                    Rect rect = j05Var.a;
                    rect.getClass();
                    arrayList.add(new k05(new pf5(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight()), j05Var.b.name(), Float.valueOf(j05Var.c), Boolean.valueOf(j05Var.d)));
                }
            }
            return new b76(str, name, arrayList);
        }
    }

    public b76(String str, String str2, ArrayList arrayList) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final z66 a() {
        UUID uuid;
        String str = this.a;
        ArrayList arrayList = null;
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        BackgroundMode backgroundMode = (BackgroundMode) jw2.o(this.b, BackgroundMode.values());
        List<k05> list = this.c;
        if (list != null) {
            arrayList = new ArrayList(ht0.v0(list, 10));
            for (k05 k05Var : list) {
                arrayList.add(k05Var.a());
            }
        }
        return new z66(uuid, backgroundMode, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b76)) {
            return false;
        }
        b76 b76Var = (b76) obj;
        if (nb3.k(this.a, b76Var.a) && nb3.k(this.b, b76Var.b) && nb3.k(this.c, b76Var.c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.a;
        int i = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d = xg6.d(hashCode * 31, 31, this.b);
        List<k05> list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return d + i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List<k05> list = this.c;
        StringBuilder u = i61.u("ScreenLayoutDto(backgroundId=", str, ", backgroundMode=", str2, ", components=");
        u.append(list);
        u.append(")");
        return u.toString();
    }
}

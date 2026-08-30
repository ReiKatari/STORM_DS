package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import me.magnum.melonds.domain.model.Rect;
import me.magnum.melonds.domain.model.layout.BackgroundMode;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: ov5  reason: default package */
/* loaded from: classes.dex */
public final class ov5 {
    @r06("backgroundId")
    private final String a;
    @r06("backgroundMode")
    private final String b;
    @r06("components")
    private final List<hr4> c;

    /* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
    /* renamed from: ov5$a */
    /* loaded from: classes.dex */
    public static final class a {
        public static ov5 a(mv5 mv5Var) {
            String str;
            mv5Var.getClass();
            UUID uuid = mv5Var.a;
            ArrayList arrayList = null;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            String name = mv5Var.b.name();
            List<gr4> list = mv5Var.c;
            if (list != null) {
                arrayList = new ArrayList(uq0.y0(list, 10));
                for (gr4 gr4Var : list) {
                    gr4Var.getClass();
                    Rect rect = gr4Var.a;
                    rect.getClass();
                    arrayList.add(new hr4(new z55(rect.getX(), rect.getY(), rect.getWidth(), rect.getHeight()), gr4Var.b.name(), Float.valueOf(gr4Var.c), Boolean.valueOf(gr4Var.d)));
                }
            }
            return new ov5(str, name, arrayList);
        }
    }

    public ov5(String str, String str2, ArrayList arrayList) {
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = arrayList;
    }

    public final mv5 a() {
        UUID uuid;
        String str = this.a;
        ArrayList arrayList = null;
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        BackgroundMode backgroundMode = (BackgroundMode) se.t(this.b, BackgroundMode.values());
        List<hr4> list = this.c;
        if (list != null) {
            arrayList = new ArrayList(uq0.y0(list, 10));
            for (hr4 hr4Var : list) {
                arrayList.add(hr4Var.a());
            }
        }
        return new mv5(uuid, backgroundMode, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ov5)) {
            return false;
        }
        ov5 ov5Var = (ov5) obj;
        if (b53.x(this.a, ov5Var.a) && b53.x(this.b, ov5Var.b) && b53.x(this.c, ov5Var.c)) {
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
        int b = ej6.b(hashCode * 31, 31, this.b);
        List<hr4> list = this.c;
        if (list != null) {
            i = list.hashCode();
        }
        return b + i;
    }

    public final String toString() {
        String str = this.a;
        String str2 = this.b;
        List<hr4> list = this.c;
        StringBuilder v = b31.v("ScreenLayoutDto(backgroundId=", str, ", backgroundMode=", str2, ", components=");
        v.append(list);
        v.append(")");
        return v.toString();
    }
}

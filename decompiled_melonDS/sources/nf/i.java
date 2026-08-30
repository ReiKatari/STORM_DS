package nf;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import oe.b0;
import ve.m;
/* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
/* loaded from: classes.dex */
public final class i {
    @va.b("backgroundId")

    /* renamed from: a  reason: collision with root package name */
    private final String f10433a;
    @va.b("backgroundMode")

    /* renamed from: b  reason: collision with root package name */
    private final String f10434b;
    @va.b("components")

    /* renamed from: c  reason: collision with root package name */
    private final List<f> f10435c;

    /* compiled from: r8-map-id-68a076d6c8e19c01d0388d4729d627070c4f7cff1f6777b7d5e4497c81f45b39 */
    /* loaded from: classes.dex */
    public static final class a {
        public static i a(m mVar) {
            String str;
            mVar.getClass();
            UUID uuid = mVar.f13818a;
            ArrayList arrayList = null;
            if (uuid != null) {
                str = uuid.toString();
            } else {
                str = null;
            }
            String name = mVar.f13819b.name();
            List<ve.j> list = mVar.f13820c;
            if (list != null) {
                arrayList = new ArrayList(zb.m.G(list, 10));
                for (ve.j jVar : list) {
                    jVar.getClass();
                    b0 b0Var = jVar.f13811a;
                    b0Var.getClass();
                    arrayList.add(new f(new g(b0Var.f10912a, b0Var.f10913b, b0Var.f10914c, b0Var.f10915d), jVar.f13812b.name(), Float.valueOf(jVar.f13813c), Boolean.valueOf(jVar.f13814d)));
                }
            }
            return new i(str, name, arrayList);
        }
    }

    public i(String str, String str2, ArrayList arrayList) {
        str2.getClass();
        this.f10433a = str;
        this.f10434b = str2;
        this.f10435c = arrayList;
    }

    public final m a() {
        UUID uuid;
        String str = this.f10433a;
        ArrayList arrayList = null;
        if (str != null) {
            uuid = UUID.fromString(str);
        } else {
            uuid = null;
        }
        ve.a aVar = (ve.a) pc.a.t(this.f10434b, ve.a.values());
        List<f> list = this.f10435c;
        if (list != null) {
            arrayList = new ArrayList(zb.m.G(list, 10));
            for (f fVar : list) {
                arrayList.add(fVar.a());
            }
        }
        return new m(uuid, aVar, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        if (nc.k.a(this.f10433a, iVar.f10433a) && nc.k.a(this.f10434b, iVar.f10434b) && nc.k.a(this.f10435c, iVar.f10435c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int hashCode;
        String str = this.f10433a;
        int i2 = 0;
        if (str == null) {
            hashCode = 0;
        } else {
            hashCode = str.hashCode();
        }
        int d4 = w.d.d(hashCode * 31, 31, this.f10434b);
        List<f> list = this.f10435c;
        if (list != null) {
            i2 = list.hashCode();
        }
        return d4 + i2;
    }

    public final String toString() {
        String str = this.f10433a;
        String str2 = this.f10434b;
        List<f> list = this.f10435c;
        StringBuilder k10 = kc.a.k("ScreenLayoutDto(backgroundId=", str, ", backgroundMode=", str2, ", components=");
        k10.append(list);
        k10.append(")");
        return k10.toString();
    }
}

package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: ba3  reason: default package */
/* loaded from: classes.dex */
public final class ba3 extends dt0 {
    public final cd4 q;

    public ba3(Class cls) {
        super(true);
        this.q = new cd4(cls);
    }

    @Override // defpackage.fd4
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // defpackage.fd4
    public final String b() {
        return "List<" + this.q.r.getName() + "}>";
    }

    @Override // defpackage.fd4
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        cd4 cd4Var = this.q;
        if (list != null) {
            return gt0.V0(list, hf.b0(cd4Var.g(str)));
        }
        return hf.b0(cd4Var.g(str));
    }

    @Override // defpackage.fd4
    public final Object d(String str) {
        return hf.b0(this.q.g(str));
    }

    @Override // defpackage.fd4
    public final void e(Bundle bundle, String str, Object obj) {
        ArrayList arrayList;
        List list = (List) obj;
        str.getClass();
        if (list != null) {
            arrayList = new ArrayList(list);
        } else {
            arrayList = null;
        }
        bundle.putSerializable(str, arrayList);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ba3)) {
            return false;
        }
        return nb3.k(this.q, ((ba3) obj).q);
    }

    @Override // defpackage.dt0
    public final /* bridge */ /* synthetic */ Object g() {
        return yt1.A;
    }

    @Override // defpackage.dt0
    public final List h(Object obj) {
        List<Enum> list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList(ht0.v0(list, 10));
            for (Enum r0 : list) {
                arrayList.add(r0.toString());
            }
            return arrayList;
        }
        return yt1.A;
    }

    public final int hashCode() {
        return this.q.q.hashCode();
    }
}

package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: t33  reason: default package */
/* loaded from: classes.dex */
public final class t33 extends qq0 {
    public final w44 q;

    public t33(Class cls) {
        super(true);
        this.q = new w44(cls);
    }

    @Override // defpackage.z44
    public final Object a(Bundle bundle, String str) {
        bundle.getClass();
        str.getClass();
        Object obj = bundle.get(str);
        if (obj instanceof List) {
            return (List) obj;
        }
        return null;
    }

    @Override // defpackage.z44
    public final String b() {
        return "List<" + this.q.r.getName() + "}>";
    }

    @Override // defpackage.z44
    public final Object c(Object obj, String str) {
        List list = (List) obj;
        w44 w44Var = this.q;
        if (list != null) {
            return tq0.X0(list, l07.b0(w44Var.g(str)));
        }
        return l07.b0(w44Var.g(str));
    }

    @Override // defpackage.z44
    public final Object d(String str) {
        return l07.b0(this.q.g(str));
    }

    @Override // defpackage.z44
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
        if (!(obj instanceof t33)) {
            return false;
        }
        return b53.x(this.q, ((t33) obj).q);
    }

    @Override // defpackage.qq0
    public final /* bridge */ /* synthetic */ Object g() {
        return pp1.A;
    }

    @Override // defpackage.qq0
    public final List h(Object obj) {
        List<Enum> list = (List) obj;
        if (list != null) {
            ArrayList arrayList = new ArrayList(uq0.y0(list, 10));
            for (Enum r0 : list) {
                arrayList.add(r0.toString());
            }
            return arrayList;
        }
        return pp1.A;
    }

    public final int hashCode() {
        return this.q.q.hashCode();
    }
}

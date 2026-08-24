package defpackage;

import java.util.Date;
import java.util.HashMap;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: xd3  reason: default package */
/* loaded from: classes.dex */
public final class xd3 implements z32 {
    public static final wd3 e = new Object();
    public final HashMap a;
    public final HashMap b;
    public final ud3 c;
    public boolean d;

    public xd3() {
        HashMap hashMap = new HashMap();
        this.a = hashMap;
        HashMap hashMap2 = new HashMap();
        this.b = hashMap2;
        this.c = ud3.a;
        this.d = false;
        hashMap2.put(String.class, vd3.b);
        hashMap.remove(String.class);
        hashMap2.put(Boolean.class, vd3.c);
        hashMap.remove(Boolean.class);
        hashMap2.put(Date.class, e);
        hashMap.remove(Date.class);
    }

    @Override // defpackage.z32
    public final z32 registerEncoder(Class cls, qh4 qh4Var) {
        this.a.put(cls, qh4Var);
        this.b.remove(cls);
        return this;
    }
}

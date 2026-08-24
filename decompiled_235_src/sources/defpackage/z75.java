package defpackage;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-0dd4387375ec438f6a4c042bfe6cb4a3262713dcd4829883cccf19288831b1df */
/* renamed from: z75  reason: default package */
/* loaded from: classes.dex */
public final class z75 extends hw6 implements eo2 {
    public int X;
    public final /* synthetic */ l85 Y;
    public final /* synthetic */ Map Z;
    public final /* synthetic */ boolean d0;
    public final /* synthetic */ ar0 e0;
    public final /* synthetic */ qn2 f0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z75(l85 l85Var, Map map, boolean z, ar0 ar0Var, qn2 qn2Var, r41 r41Var) {
        super(2, r41Var);
        this.Y = l85Var;
        this.Z = map;
        this.d0 = z;
        this.e0 = ar0Var;
        this.f0 = qn2Var;
    }

    @Override // defpackage.eo2
    public final Object o(Object obj, Object obj2) {
        return ((z75) q((r41) obj2, (w61) obj)).s(jg7.a);
    }

    @Override // defpackage.d20
    public final r41 q(r41 r41Var, Object obj) {
        return new z75(this.Y, this.Z, this.d0, this.e0, this.f0, r41Var);
    }

    @Override // defpackage.d20
    public final Object s(Object obj) {
        Object em5Var;
        em5 em5Var2;
        Object b;
        String str;
        l61 l61Var = this.B;
        Map map = this.Z;
        l85 l85Var = this.Y;
        x61 x61Var = x61.COROUTINE_SUSPENDED;
        int i = this.X;
        hb5 hb5Var = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    oi2.Y(obj);
                } else {
                    i.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                oi2.Y(obj);
                l85Var.getClass();
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String encode = URLEncoder.encode((String) entry.getKey(), "utf-8");
                    String encode2 = URLEncoder.encode((String) entry.getValue(), "utf-8");
                    arrayList.add(encode + "=" + encode2);
                }
                String P0 = gt0.P0(arrayList, "&", null, null, null, 62);
                cn5 cn5Var = l85Var.e;
                en5 en5Var = cn5Var.c;
                if (en5Var == null) {
                    en5Var = cn5Var.a();
                }
                String str2 = en5Var.d;
                if (str2 != null) {
                    String m = lb1.m(str2, "?", P0);
                    s9 s9Var = new s9(13);
                    s9Var.D("GET", null);
                    s9Var.I(m);
                    pa paVar = new pa(s9Var);
                    String str3 = (String) map.get("u");
                    if (str3 != null && (str = (String) map.get("t")) != null) {
                        hb5Var = new hb5(str3, str);
                    }
                    boolean z = this.d0;
                    this.X = 1;
                    obj = l85Var.f(paVar, hb5Var, z, this);
                    if (obj == x61Var) {
                        return x61Var;
                    }
                } else {
                    throw new IllegalStateException("RAOfflineProxy is selected but no active loopback host is available");
                }
            }
            em5Var = (wl5) obj;
        } catch (Throwable th) {
            l61Var.getClass();
            yh2.o(l61Var);
            em5Var = new em5(th);
        }
        ar0 ar0Var = this.e0;
        qn2 qn2Var = this.f0;
        if (!(em5Var instanceof em5)) {
            try {
                oi2.Y(em5Var);
                wl5 wl5Var = (wl5) em5Var;
                b = l85.b(l85Var, ar0Var, wl5Var, qn2Var);
                wl5Var.close();
            } catch (Throwable th2) {
                l61Var.getClass();
                yh2.o(l61Var);
                em5Var2 = new em5(th2);
            }
            return new hm5(b);
        }
        Throwable a = hm5.a(em5Var);
        a.getClass();
        em5Var2 = new em5(a);
        b = em5Var2;
        return new hm5(b);
    }
}

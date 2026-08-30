package defpackage;

import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Map;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: oy4  reason: default package */
/* loaded from: classes.dex */
public final class oy4 extends nk6 implements aj2 {
    public int X;
    public final /* synthetic */ az4 Y;
    public final /* synthetic */ Map Z;
    public final /* synthetic */ boolean c0;
    public final /* synthetic */ qo0 d0;
    public final /* synthetic */ mi2 e0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oy4(az4 az4Var, Map map, boolean z, qo0 qo0Var, mi2 mi2Var, j11 j11Var) {
        super(2, j11Var);
        this.Y = az4Var;
        this.Z = map;
        this.c0 = z;
        this.d0 = qo0Var;
        this.e0 = mi2Var;
    }

    @Override // defpackage.aj2
    public final Object j(Object obj, Object obj2) {
        return ((oy4) t((j11) obj2, (o31) obj)).v(o27.a);
    }

    @Override // defpackage.m00
    public final j11 t(j11 j11Var, Object obj) {
        return new oy4(this.Y, this.Z, this.c0, this.d0, this.e0, j11Var);
    }

    @Override // defpackage.m00
    public final Object v(Object obj) {
        Object d;
        Object d2;
        String str;
        e31 e31Var = this.B;
        Map map = this.Z;
        az4 az4Var = this.Y;
        p31 p31Var = p31.COROUTINE_SUSPENDED;
        int i = this.X;
        x15 x15Var = null;
        try {
            if (i != 0) {
                if (i == 1) {
                    me2.a0(obj);
                } else {
                    i.n("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
            } else {
                me2.a0(obj);
                az4Var.getClass();
                ArrayList arrayList = new ArrayList(map.size());
                for (Map.Entry entry : map.entrySet()) {
                    String encode = URLEncoder.encode((String) entry.getKey(), "utf-8");
                    String encode2 = URLEncoder.encode((String) entry.getValue(), "utf-8");
                    arrayList.add(encode + "=" + encode2);
                }
                String S0 = tq0.S0(arrayList, "&", null, null, null, 62);
                id5 id5Var = az4Var.e;
                kd5 kd5Var = id5Var.c;
                if (kd5Var == null) {
                    kd5Var = id5Var.a();
                }
                String str2 = kd5Var.d;
                if (str2 != null) {
                    String l = wh1.l(str2, "?", S0);
                    r9 r9Var = new r9(13);
                    r9Var.D("GET", null);
                    r9Var.I(l);
                    ka kaVar = new ka(r9Var);
                    String str3 = (String) map.get("u");
                    if (str3 != null && (str = (String) map.get("t")) != null) {
                        x15Var = new x15(str3, str);
                    }
                    boolean z = this.c0;
                    this.X = 1;
                    obj = az4Var.f(kaVar, x15Var, z, this);
                    if (obj == p31Var) {
                        return p31Var;
                    }
                } else {
                    throw new IllegalStateException("RAOfflineProxy is selected but no active loopback host is available");
                }
            }
            d = (ec5) obj;
        } catch (Throwable th) {
            d = wh1.d(e31Var, e31Var, th);
        }
        qo0 qo0Var = this.d0;
        mi2 mi2Var = this.e0;
        if (!(d instanceof kc5)) {
            try {
                me2.a0(d);
                ec5 ec5Var = (ec5) d;
                d2 = az4.b(az4Var, qo0Var, ec5Var, mi2Var);
                ec5Var.close();
            } catch (Throwable th2) {
                d2 = wh1.d(e31Var, e31Var, th2);
            }
        } else {
            Throwable a = nc5.a(d);
            a.getClass();
            d2 = new kc5(a);
        }
        return new nc5(d2);
    }
}

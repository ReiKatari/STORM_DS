package defpackage;

import java.util.Iterator;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: yf6  reason: default package */
/* loaded from: classes.dex */
public final /* synthetic */ class yf6 implements z06 {
    public final /* synthetic */ zf6 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ b57 d;
    public final /* synthetic */ jx e;
    public final /* synthetic */ jx f;

    public /* synthetic */ yf6(zf6 zf6Var, String str, String str2, b57 b57Var, jx jxVar, jx jxVar2) {
        this.a = zf6Var;
        this.b = str;
        this.c = str2;
        this.d = b57Var;
        this.e = jxVar;
        this.f = jxVar2;
    }

    @Override // defpackage.z06
    public final void a(d16 d16Var, a16 a16Var) {
        zf6 zf6Var = this.a;
        if (zf6Var.d() != null) {
            zf6Var.G();
            zf6Var.E(zf6Var.H(this.b, this.c, this.d, this.e, this.f));
            zf6Var.r();
            kc7 kc7Var = zf6Var.r;
            kc7Var.getClass();
            nk2.s();
            Iterator it = kc7Var.A.iterator();
            while (it.hasNext()) {
                kc7Var.d((f47) it.next());
            }
        }
    }
}

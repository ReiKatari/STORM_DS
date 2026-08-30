package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: rk2  reason: default package */
/* loaded from: classes.dex */
public final class rk2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rk2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                sk2 sk2Var = (sk2) obj;
                sk2Var.A--;
                return;
            default:
                ab6 ab6Var = (ab6) obj;
                ab6Var.k--;
                return;
        }
    }

    public final void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((sk2) obj).A++;
                return;
            default:
                ((ab6) obj).k++;
                return;
        }
    }
}

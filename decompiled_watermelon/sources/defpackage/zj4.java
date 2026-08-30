package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: zj4  reason: default package */
/* loaded from: classes.dex */
public final class zj4 implements h45, fq4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ zj4(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.fq4
    public final Object b(String str, mi2 mi2Var, k11 k11Var) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((dk4) obj).b(str, mi2Var, k11Var);
            default:
                return ((nq4) obj).b(str, mi2Var, k11Var);
        }
    }

    @Override // defpackage.h45
    public final ls5 c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((dk4) obj).b;
            default:
                return ((nq4) obj).b;
        }
    }
}

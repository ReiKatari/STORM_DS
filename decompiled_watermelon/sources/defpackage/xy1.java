package defpackage;
/* compiled from: r8-map-id-497bfa0f37aff44fe2e52f5de82fa8e9b472cf58d62eb3c7b7ed26472aaf487a */
/* renamed from: xy1  reason: default package */
/* loaded from: classes.dex */
public final class xy1 implements ki2 {
    public final /* synthetic */ int A;
    public final /* synthetic */ u92[] B;

    public /* synthetic */ xy1(u92[] u92VarArr, int i) {
        this.A = i;
        this.B = u92VarArr;
    }

    @Override // defpackage.ki2
    public final Object c() {
        int i = this.A;
        u92[] u92VarArr = this.B;
        switch (i) {
            case 0:
                return new Object[u92VarArr.length];
            case 1:
                return new Object[u92VarArr.length];
            default:
                return new sz0[u92VarArr.length];
        }
    }
}
